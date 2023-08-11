package androidx.profileinstaller;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;

@RequiresApi(19)
class ProfileTranscoder {
    private static final int HOT = 1;
    private static final int INLINE_CACHE_MEGAMORPHIC_ENCODING = 7;
    private static final int INLINE_CACHE_MISSING_TYPES_ENCODING = 6;
    static final byte[] MAGIC_PROF = {112, 114, 111, 0};
    static final byte[] MAGIC_PROFM = {112, 114, 109, 0};
    private static final int POST_STARTUP = 4;
    private static final int STARTUP = 2;

    private ProfileTranscoder() {
    }

    private static int computeMethodFlags(@NonNull DexProfileData dexProfileData) {
        int i = 0;
        for (Map.Entry<Integer, Integer> value : dexProfileData.methods.entrySet()) {
            i |= ((Integer) value.getValue()).intValue();
        }
        return i;
    }

    @NonNull
    private static byte[] createCompressibleBody(@NonNull DexProfileData[] dexProfileDataArr, @NonNull byte[] bArr) {
        int i = 0;
        int i2 = 0;
        for (DexProfileData dexProfileData : dexProfileDataArr) {
            i2 += Encoding.utf8Length(generateDexKey(dexProfileData.apkName, dexProfileData.dexName, bArr)) + 16 + (dexProfileData.classSetSize * 2) + dexProfileData.hotMethodRegionSize + getMethodBitmapStorageSize(dexProfileData.numMethodIds);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        if (Arrays.equals(bArr, ProfileVersion.V009_O_MR1)) {
            int length = dexProfileDataArr.length;
            while (i < length) {
                DexProfileData dexProfileData2 = dexProfileDataArr[i];
                writeLineHeader(byteArrayOutputStream, dexProfileData2, generateDexKey(dexProfileData2.apkName, dexProfileData2.dexName, bArr));
                writeLineData(byteArrayOutputStream, dexProfileData2);
                i++;
            }
        } else {
            for (DexProfileData dexProfileData3 : dexProfileDataArr) {
                writeLineHeader(byteArrayOutputStream, dexProfileData3, generateDexKey(dexProfileData3.apkName, dexProfileData3.dexName, bArr));
            }
            int length2 = dexProfileDataArr.length;
            while (i < length2) {
                writeLineData(byteArrayOutputStream, dexProfileDataArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == i2) {
            return byteArrayOutputStream.toByteArray();
        }
        throw Encoding.error("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i2);
    }

    private static WritableFileSection createCompressibleClassSection(@NonNull DexProfileData[] dexProfileDataArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        int i2 = 0;
        while (i < dexProfileDataArr.length) {
            try {
                DexProfileData dexProfileData = dexProfileDataArr[i];
                Encoding.writeUInt16(byteArrayOutputStream, i);
                Encoding.writeUInt16(byteArrayOutputStream, dexProfileData.classSetSize);
                i2 = i2 + 2 + 2 + (dexProfileData.classSetSize * 2);
                writeClasses(byteArrayOutputStream, dexProfileData);
                i++;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i2 == byteArray.length) {
            WritableFileSection writableFileSection = new WritableFileSection(FileSectionType.CLASSES, i2, byteArray, true);
            byteArrayOutputStream.close();
            return writableFileSection;
        }
        throw Encoding.error("Expected size " + i2 + ", does not match actual size " + byteArray.length);
        throw th;
    }

    private static WritableFileSection createCompressibleMethodsSection(@NonNull DexProfileData[] dexProfileDataArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        int i2 = 0;
        while (i < dexProfileDataArr.length) {
            try {
                DexProfileData dexProfileData = dexProfileDataArr[i];
                int computeMethodFlags = computeMethodFlags(dexProfileData);
                byte[] createMethodBitmapRegion = createMethodBitmapRegion(dexProfileData);
                byte[] createMethodsWithInlineCaches = createMethodsWithInlineCaches(dexProfileData);
                Encoding.writeUInt16(byteArrayOutputStream, i);
                int length = createMethodBitmapRegion.length + 2 + createMethodsWithInlineCaches.length;
                Encoding.writeUInt32(byteArrayOutputStream, (long) length);
                Encoding.writeUInt16(byteArrayOutputStream, computeMethodFlags);
                byteArrayOutputStream.write(createMethodBitmapRegion);
                byteArrayOutputStream.write(createMethodsWithInlineCaches);
                i2 = i2 + 2 + 4 + length;
                i++;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i2 == byteArray.length) {
            WritableFileSection writableFileSection = new WritableFileSection(FileSectionType.METHODS, i2, byteArray, true);
            byteArrayOutputStream.close();
            return writableFileSection;
        }
        throw Encoding.error("Expected size " + i2 + ", does not match actual size " + byteArray.length);
        throw th;
    }

    private static byte[] createMethodBitmapRegion(@NonNull DexProfileData dexProfileData) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            writeMethodBitmap(byteArrayOutputStream, dexProfileData);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    private static byte[] createMethodsWithInlineCaches(@NonNull DexProfileData dexProfileData) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            writeMethodsWithInlineCaches(byteArrayOutputStream, dexProfileData);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    @NonNull
    private static String enforceSeparator(@NonNull String str, @NonNull String str2) {
        if ("!".equals(str2)) {
            return str.replace(":", "!");
        }
        if (":".equals(str2)) {
            return str.replace("!", ":");
        }
        return str;
    }

    @NonNull
    private static String extractKey(@NonNull String str) {
        int indexOf = str.indexOf("!");
        if (indexOf < 0) {
            indexOf = str.indexOf(":");
        }
        if (indexOf > 0) {
            return str.substring(indexOf + 1);
        }
        return str;
    }

    @Nullable
    private static DexProfileData findByDexName(@NonNull DexProfileData[] dexProfileDataArr, @NonNull String str) {
        if (dexProfileDataArr.length <= 0) {
            return null;
        }
        String extractKey = extractKey(str);
        for (int i = 0; i < dexProfileDataArr.length; i++) {
            if (dexProfileDataArr[i].dexName.equals(extractKey)) {
                return dexProfileDataArr[i];
            }
        }
        return null;
    }

    @NonNull
    private static String generateDexKey(@NonNull String str, @NonNull String str2, @NonNull byte[] bArr) {
        String dexKeySeparator = ProfileVersion.dexKeySeparator(bArr);
        if (str.length() <= 0) {
            return enforceSeparator(str2, dexKeySeparator);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return enforceSeparator(str2, dexKeySeparator);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + ProfileVersion.dexKeySeparator(bArr) + str2;
    }

    private static int getMethodBitmapStorageSize(int i) {
        return roundUpToByte(i * 2) / 8;
    }

    private static int methodFlagBitmapIndex(int i, int i2, int i3) {
        if (i == 1) {
            throw Encoding.error("HOT methods are not stored in the bitmap");
        } else if (i == 2) {
            return i2;
        } else {
            if (i == 4) {
                return i2 + i3;
            }
            throw Encoding.error("Unexpected flag: " + i);
        }
    }

    private static int[] readClasses(@NonNull InputStream inputStream, int i) {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Encoding.readUInt16(inputStream);
            iArr[i3] = i2;
        }
        return iArr;
    }

    private static int readFlagsFromBitmap(@NonNull BitSet bitSet, int i, int i2) {
        int i3 = 2;
        if (!bitSet.get(methodFlagBitmapIndex(2, i, i2))) {
            i3 = 0;
        }
        if (bitSet.get(methodFlagBitmapIndex(4, i, i2))) {
            return i3 | 4;
        }
        return i3;
    }

    static byte[] readHeader(@NonNull InputStream inputStream, @NonNull byte[] bArr) {
        if (Arrays.equals(bArr, Encoding.read(inputStream, bArr.length))) {
            return Encoding.read(inputStream, ProfileVersion.V010_P.length);
        }
        throw Encoding.error("Invalid magic");
    }

    private static void readHotMethodRegion(@NonNull InputStream inputStream, @NonNull DexProfileData dexProfileData) {
        int available = inputStream.available() - dexProfileData.hotMethodRegionSize;
        int i = 0;
        while (inputStream.available() > available) {
            i += Encoding.readUInt16(inputStream);
            dexProfileData.methods.put(Integer.valueOf(i), 1);
            for (int readUInt16 = Encoding.readUInt16(inputStream); readUInt16 > 0; readUInt16--) {
                skipInlineCache(inputStream);
            }
        }
        if (inputStream.available() != available) {
            throw Encoding.error("Read too much data during profile line parse");
        }
    }

    @NonNull
    static DexProfileData[] readMeta(@NonNull InputStream inputStream, @NonNull byte[] bArr, @NonNull byte[] bArr2, DexProfileData[] dexProfileDataArr) {
        if (Arrays.equals(bArr, ProfileVersion.METADATA_V001_N)) {
            if (!Arrays.equals(ProfileVersion.V015_S, bArr2)) {
                return readMetadata001(inputStream, bArr, dexProfileDataArr);
            }
            throw Encoding.error("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        } else if (Arrays.equals(bArr, ProfileVersion.METADATA_V002)) {
            return readMetadataV002(inputStream, bArr2, dexProfileDataArr);
        } else {
            throw Encoding.error("Unsupported meta version");
        }
    }

    @NonNull
    static DexProfileData[] readMetadata001(@NonNull InputStream inputStream, @NonNull byte[] bArr, DexProfileData[] dexProfileDataArr) {
        if (Arrays.equals(bArr, ProfileVersion.METADATA_V001_N)) {
            int readUInt8 = Encoding.readUInt8(inputStream);
            byte[] readCompressed = Encoding.readCompressed(inputStream, (int) Encoding.readUInt32(inputStream), (int) Encoding.readUInt32(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(readCompressed);
                try {
                    DexProfileData[] readMetadataForNBody = readMetadataForNBody(byteArrayInputStream, readUInt8, dexProfileDataArr);
                    byteArrayInputStream.close();
                    return readMetadataForNBody;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                throw Encoding.error("Content found after the end of file");
            }
        } else {
            throw Encoding.error("Unsupported meta version");
        }
        throw th;
    }

    @NonNull
    private static DexProfileData[] readMetadataForNBody(@NonNull InputStream inputStream, int i, DexProfileData[] dexProfileDataArr) {
        int i2 = 0;
        if (inputStream.available() == 0) {
            return new DexProfileData[0];
        }
        if (i == dexProfileDataArr.length) {
            String[] strArr = new String[i];
            int[] iArr = new int[i];
            for (int i3 = 0; i3 < i; i3++) {
                int readUInt16 = Encoding.readUInt16(inputStream);
                iArr[i3] = Encoding.readUInt16(inputStream);
                strArr[i3] = Encoding.readString(inputStream, readUInt16);
            }
            while (i2 < i) {
                DexProfileData dexProfileData = dexProfileDataArr[i2];
                if (dexProfileData.dexName.equals(strArr[i2])) {
                    int i4 = iArr[i2];
                    dexProfileData.classSetSize = i4;
                    dexProfileData.classes = readClasses(inputStream, i4);
                    i2++;
                } else {
                    throw Encoding.error("Order of dexfiles in metadata did not match baseline");
                }
            }
            return dexProfileDataArr;
        }
        throw Encoding.error("Mismatched number of dex files found in metadata");
    }

    @NonNull
    static DexProfileData[] readMetadataV002(@NonNull InputStream inputStream, @NonNull byte[] bArr, DexProfileData[] dexProfileDataArr) {
        int readUInt16 = Encoding.readUInt16(inputStream);
        byte[] readCompressed = Encoding.readCompressed(inputStream, (int) Encoding.readUInt32(inputStream), (int) Encoding.readUInt32(inputStream));
        if (inputStream.read() <= 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(readCompressed);
            try {
                DexProfileData[] readMetadataV002Body = readMetadataV002Body(byteArrayInputStream, bArr, readUInt16, dexProfileDataArr);
                byteArrayInputStream.close();
                return readMetadataV002Body;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            throw Encoding.error("Content found after the end of file");
        }
        throw th;
    }

    @NonNull
    private static DexProfileData[] readMetadataV002Body(@NonNull InputStream inputStream, @NonNull byte[] bArr, int i, DexProfileData[] dexProfileDataArr) {
        int i2 = 0;
        if (inputStream.available() == 0) {
            return new DexProfileData[0];
        }
        if (i == dexProfileDataArr.length) {
            while (i2 < i) {
                Encoding.readUInt16(inputStream);
                String readString = Encoding.readString(inputStream, Encoding.readUInt16(inputStream));
                long readUInt32 = Encoding.readUInt32(inputStream);
                int readUInt16 = Encoding.readUInt16(inputStream);
                DexProfileData findByDexName = findByDexName(dexProfileDataArr, readString);
                if (findByDexName != null) {
                    findByDexName.mTypeIdCount = readUInt32;
                    int[] readClasses = readClasses(inputStream, readUInt16);
                    if (Arrays.equals(bArr, ProfileVersion.V001_N)) {
                        findByDexName.classSetSize = readUInt16;
                        findByDexName.classes = readClasses;
                    }
                    i2++;
                } else {
                    throw Encoding.error("Missing profile key: " + readString);
                }
            }
            return dexProfileDataArr;
        }
        throw Encoding.error("Mismatched number of dex files found in metadata");
    }

    private static void readMethodBitmap(@NonNull InputStream inputStream, @NonNull DexProfileData dexProfileData) {
        BitSet valueOf = BitSet.valueOf(Encoding.read(inputStream, Encoding.bitsToBytes(dexProfileData.numMethodIds * 2)));
        int i = 0;
        while (true) {
            int i2 = dexProfileData.numMethodIds;
            if (i < i2) {
                int readFlagsFromBitmap = readFlagsFromBitmap(valueOf, i, i2);
                if (readFlagsFromBitmap != 0) {
                    Integer num = dexProfileData.methods.get(Integer.valueOf(i));
                    if (num == null) {
                        num = 0;
                    }
                    dexProfileData.methods.put(Integer.valueOf(i), Integer.valueOf(readFlagsFromBitmap | num.intValue()));
                }
                i++;
            } else {
                return;
            }
        }
    }

    @NonNull
    static DexProfileData[] readProfile(@NonNull InputStream inputStream, @NonNull byte[] bArr, @NonNull String str) {
        if (Arrays.equals(bArr, ProfileVersion.V010_P)) {
            int readUInt8 = Encoding.readUInt8(inputStream);
            byte[] readCompressed = Encoding.readCompressed(inputStream, (int) Encoding.readUInt32(inputStream), (int) Encoding.readUInt32(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(readCompressed);
                try {
                    DexProfileData[] readUncompressedBody = readUncompressedBody(byteArrayInputStream, str, readUInt8);
                    byteArrayInputStream.close();
                    return readUncompressedBody;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                throw Encoding.error("Content found after the end of file");
            }
        } else {
            throw Encoding.error("Unsupported version");
        }
        throw th;
    }

    @NonNull
    private static DexProfileData[] readUncompressedBody(@NonNull InputStream inputStream, @NonNull String str, int i) {
        InputStream inputStream2 = inputStream;
        int i2 = i;
        if (inputStream.available() == 0) {
            return new DexProfileData[0];
        }
        DexProfileData[] dexProfileDataArr = new DexProfileData[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int readUInt16 = Encoding.readUInt16(inputStream);
            int readUInt162 = Encoding.readUInt16(inputStream);
            long readUInt32 = Encoding.readUInt32(inputStream);
            String str2 = str;
            dexProfileDataArr[i3] = new DexProfileData(str2, Encoding.readString(inputStream2, readUInt16), Encoding.readUInt32(inputStream), 0, readUInt162, (int) readUInt32, (int) Encoding.readUInt32(inputStream), new int[readUInt162], new TreeMap());
        }
        for (int i4 = 0; i4 < i2; i4++) {
            DexProfileData dexProfileData = dexProfileDataArr[i4];
            readHotMethodRegion(inputStream2, dexProfileData);
            dexProfileData.classes = readClasses(inputStream2, dexProfileData.classSetSize);
            readMethodBitmap(inputStream2, dexProfileData);
        }
        return dexProfileDataArr;
    }

    private static int roundUpToByte(int i) {
        return ((i + 8) - 1) & -8;
    }

    private static void setMethodBitmapBit(@NonNull byte[] bArr, int i, int i2, @NonNull DexProfileData dexProfileData) {
        int methodFlagBitmapIndex = methodFlagBitmapIndex(i, i2, dexProfileData.numMethodIds);
        int i3 = methodFlagBitmapIndex / 8;
        bArr[i3] = (byte) ((1 << (methodFlagBitmapIndex % 8)) | bArr[i3]);
    }

    private static void skipInlineCache(@NonNull InputStream inputStream) {
        Encoding.readUInt16(inputStream);
        int readUInt8 = Encoding.readUInt8(inputStream);
        if (readUInt8 != 6 && readUInt8 != 7) {
            while (readUInt8 > 0) {
                Encoding.readUInt8(inputStream);
                for (int readUInt82 = Encoding.readUInt8(inputStream); readUInt82 > 0; readUInt82--) {
                    Encoding.readUInt16(inputStream);
                }
                readUInt8--;
            }
        }
    }

    static boolean transcodeAndWriteBody(@NonNull OutputStream outputStream, @NonNull byte[] bArr, @NonNull DexProfileData[] dexProfileDataArr) {
        if (Arrays.equals(bArr, ProfileVersion.V015_S)) {
            writeProfileForS(outputStream, dexProfileDataArr);
            return true;
        } else if (Arrays.equals(bArr, ProfileVersion.V010_P)) {
            writeProfileForP(outputStream, dexProfileDataArr);
            return true;
        } else if (Arrays.equals(bArr, ProfileVersion.V005_O)) {
            writeProfileForO(outputStream, dexProfileDataArr);
            return true;
        } else if (Arrays.equals(bArr, ProfileVersion.V009_O_MR1)) {
            writeProfileForO_MR1(outputStream, dexProfileDataArr);
            return true;
        } else if (!Arrays.equals(bArr, ProfileVersion.V001_N)) {
            return false;
        } else {
            writeProfileForN(outputStream, dexProfileDataArr);
            return true;
        }
    }

    private static void writeClasses(@NonNull OutputStream outputStream, @NonNull DexProfileData dexProfileData) {
        int i = 0;
        for (int valueOf : dexProfileData.classes) {
            Integer valueOf2 = Integer.valueOf(valueOf);
            Encoding.writeUInt16(outputStream, valueOf2.intValue() - i);
            i = valueOf2.intValue();
        }
    }

    private static WritableFileSection writeDexFileSection(@NonNull DexProfileData[] dexProfileDataArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            Encoding.writeUInt16(byteArrayOutputStream, dexProfileDataArr.length);
            int i = 2;
            for (DexProfileData dexProfileData : dexProfileDataArr) {
                Encoding.writeUInt32(byteArrayOutputStream, dexProfileData.dexChecksum);
                Encoding.writeUInt32(byteArrayOutputStream, dexProfileData.mTypeIdCount);
                Encoding.writeUInt32(byteArrayOutputStream, (long) dexProfileData.numMethodIds);
                String generateDexKey = generateDexKey(dexProfileData.apkName, dexProfileData.dexName, ProfileVersion.V015_S);
                int utf8Length = Encoding.utf8Length(generateDexKey);
                Encoding.writeUInt16(byteArrayOutputStream, utf8Length);
                i = i + 4 + 4 + 4 + 2 + (utf8Length * 1);
                Encoding.writeString(byteArrayOutputStream, generateDexKey);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i == byteArray.length) {
                WritableFileSection writableFileSection = new WritableFileSection(FileSectionType.DEX_FILES, i, byteArray, false);
                byteArrayOutputStream.close();
                return writableFileSection;
            }
            throw Encoding.error("Expected size " + i + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    static void writeHeader(@NonNull OutputStream outputStream, byte[] bArr) {
        outputStream.write(MAGIC_PROF);
        outputStream.write(bArr);
    }

    private static void writeLineData(@NonNull OutputStream outputStream, @NonNull DexProfileData dexProfileData) {
        writeMethodsWithInlineCaches(outputStream, dexProfileData);
        writeClasses(outputStream, dexProfileData);
        writeMethodBitmap(outputStream, dexProfileData);
    }

    private static void writeLineHeader(@NonNull OutputStream outputStream, @NonNull DexProfileData dexProfileData, @NonNull String str) {
        Encoding.writeUInt16(outputStream, Encoding.utf8Length(str));
        Encoding.writeUInt16(outputStream, dexProfileData.classSetSize);
        Encoding.writeUInt32(outputStream, (long) dexProfileData.hotMethodRegionSize);
        Encoding.writeUInt32(outputStream, dexProfileData.dexChecksum);
        Encoding.writeUInt32(outputStream, (long) dexProfileData.numMethodIds);
        Encoding.writeString(outputStream, str);
    }

    private static void writeMethodBitmap(@NonNull OutputStream outputStream, @NonNull DexProfileData dexProfileData) {
        byte[] bArr = new byte[getMethodBitmapStorageSize(dexProfileData.numMethodIds)];
        for (Map.Entry next : dexProfileData.methods.entrySet()) {
            int intValue = ((Integer) next.getKey()).intValue();
            int intValue2 = ((Integer) next.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                setMethodBitmapBit(bArr, 2, intValue, dexProfileData);
            }
            if ((intValue2 & 4) != 0) {
                setMethodBitmapBit(bArr, 4, intValue, dexProfileData);
            }
        }
        outputStream.write(bArr);
    }

    private static void writeMethodsWithInlineCaches(@NonNull OutputStream outputStream, @NonNull DexProfileData dexProfileData) {
        int i = 0;
        for (Map.Entry next : dexProfileData.methods.entrySet()) {
            int intValue = ((Integer) next.getKey()).intValue();
            if ((((Integer) next.getValue()).intValue() & 1) != 0) {
                Encoding.writeUInt16(outputStream, intValue - i);
                Encoding.writeUInt16(outputStream, 0);
                i = intValue;
            }
        }
    }

    private static void writeProfileForN(@NonNull OutputStream outputStream, @NonNull DexProfileData[] dexProfileDataArr) {
        Encoding.writeUInt16(outputStream, dexProfileDataArr.length);
        for (DexProfileData dexProfileData : dexProfileDataArr) {
            String generateDexKey = generateDexKey(dexProfileData.apkName, dexProfileData.dexName, ProfileVersion.V001_N);
            Encoding.writeUInt16(outputStream, Encoding.utf8Length(generateDexKey));
            Encoding.writeUInt16(outputStream, dexProfileData.methods.size());
            Encoding.writeUInt16(outputStream, dexProfileData.classes.length);
            Encoding.writeUInt32(outputStream, dexProfileData.dexChecksum);
            Encoding.writeString(outputStream, generateDexKey);
            for (Integer intValue : dexProfileData.methods.keySet()) {
                Encoding.writeUInt16(outputStream, intValue.intValue());
            }
            for (int writeUInt16 : dexProfileData.classes) {
                Encoding.writeUInt16(outputStream, writeUInt16);
            }
        }
    }

    private static void writeProfileForO(@NonNull OutputStream outputStream, @NonNull DexProfileData[] dexProfileDataArr) {
        Encoding.writeUInt8(outputStream, dexProfileDataArr.length);
        for (DexProfileData dexProfileData : dexProfileDataArr) {
            String generateDexKey = generateDexKey(dexProfileData.apkName, dexProfileData.dexName, ProfileVersion.V005_O);
            Encoding.writeUInt16(outputStream, Encoding.utf8Length(generateDexKey));
            Encoding.writeUInt16(outputStream, dexProfileData.classes.length);
            Encoding.writeUInt32(outputStream, (long) (dexProfileData.methods.size() * 4));
            Encoding.writeUInt32(outputStream, dexProfileData.dexChecksum);
            Encoding.writeString(outputStream, generateDexKey);
            for (Integer intValue : dexProfileData.methods.keySet()) {
                Encoding.writeUInt16(outputStream, intValue.intValue());
                Encoding.writeUInt16(outputStream, 0);
            }
            for (int writeUInt16 : dexProfileData.classes) {
                Encoding.writeUInt16(outputStream, writeUInt16);
            }
        }
    }

    private static void writeProfileForO_MR1(@NonNull OutputStream outputStream, @NonNull DexProfileData[] dexProfileDataArr) {
        byte[] createCompressibleBody = createCompressibleBody(dexProfileDataArr, ProfileVersion.V009_O_MR1);
        Encoding.writeUInt8(outputStream, dexProfileDataArr.length);
        Encoding.writeCompressed(outputStream, createCompressibleBody);
    }

    private static void writeProfileForP(@NonNull OutputStream outputStream, @NonNull DexProfileData[] dexProfileDataArr) {
        byte[] createCompressibleBody = createCompressibleBody(dexProfileDataArr, ProfileVersion.V010_P);
        Encoding.writeUInt8(outputStream, dexProfileDataArr.length);
        Encoding.writeCompressed(outputStream, createCompressibleBody);
    }

    private static void writeProfileForS(@NonNull OutputStream outputStream, @NonNull DexProfileData[] dexProfileDataArr) {
        writeProfileSections(outputStream, dexProfileDataArr);
    }

    private static void writeProfileSections(@NonNull OutputStream outputStream, @NonNull DexProfileData[] dexProfileDataArr) {
        int i;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(writeDexFileSection(dexProfileDataArr));
        arrayList.add(createCompressibleClassSection(dexProfileDataArr));
        arrayList.add(createCompressibleMethodsSection(dexProfileDataArr));
        long length = ((long) ProfileVersion.V015_S.length) + ((long) MAGIC_PROF.length) + 4 + ((long) (arrayList.size() * 16));
        Encoding.writeUInt32(outputStream, (long) arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            WritableFileSection writableFileSection = (WritableFileSection) arrayList.get(i2);
            Encoding.writeUInt32(outputStream, writableFileSection.mType.getValue());
            Encoding.writeUInt32(outputStream, length);
            if (writableFileSection.mNeedsCompression) {
                byte[] bArr = writableFileSection.mContents;
                byte[] compress = Encoding.compress(bArr);
                arrayList2.add(compress);
                Encoding.writeUInt32(outputStream, (long) compress.length);
                Encoding.writeUInt32(outputStream, (long) bArr.length);
                i = compress.length;
            } else {
                arrayList2.add(writableFileSection.mContents);
                Encoding.writeUInt32(outputStream, (long) writableFileSection.mContents.length);
                Encoding.writeUInt32(outputStream, 0);
                i = writableFileSection.mContents.length;
            }
            length += (long) i;
        }
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            outputStream.write((byte[]) arrayList2.get(i3));
        }
    }
}
