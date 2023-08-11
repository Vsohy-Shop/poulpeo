package androidx.profileinstaller;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

@RequiresApi(19)
class Encoding {
    static final int SIZEOF_BYTE = 8;
    static final int UINT_16_SIZE = 2;
    static final int UINT_32_SIZE = 4;
    static final int UINT_8_SIZE = 1;

    private Encoding() {
    }

    static int bitsToBytes(int i) {
        return (((i + 8) - 1) & -8) / 8;
    }

    static byte[] compress(@NonNull byte[] bArr) {
        DeflaterOutputStream deflaterOutputStream;
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
        throw th;
    }

    @NonNull
    static RuntimeException error(@Nullable String str) {
        return new IllegalStateException(str);
    }

    @NonNull
    static byte[] read(@NonNull InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read >= 0) {
                i2 += read;
            } else {
                throw error("Not enough bytes to read: " + i);
            }
        }
        return bArr;
    }

    @NonNull
    static byte[] readCompressed(@NonNull InputStream inputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int i4 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int read = inputStream.read(bArr2);
                if (read >= 0) {
                    inflater.setInput(bArr2, 0, read);
                    i4 += inflater.inflate(bArr, i4, i2 - i4);
                    i3 += read;
                } else {
                    throw error("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
            }
            if (i3 != i) {
                throw error("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
            } else if (inflater.finished()) {
                inflater.end();
                return bArr;
            } else {
                throw error("Inflater did not finish");
            }
        } catch (DataFormatException e) {
            throw error(e.getMessage());
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    @NonNull
    static String readString(InputStream inputStream, int i) {
        return new String(read(inputStream, i), StandardCharsets.UTF_8);
    }

    static long readUInt(@NonNull InputStream inputStream, int i) {
        byte[] read = read(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (read[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    static int readUInt16(@NonNull InputStream inputStream) {
        return (int) readUInt(inputStream, 2);
    }

    static long readUInt32(@NonNull InputStream inputStream) {
        return readUInt(inputStream, 4);
    }

    static int readUInt8(@NonNull InputStream inputStream) {
        return (int) readUInt(inputStream, 1);
    }

    static int utf8Length(@NonNull String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    static void writeAll(@NonNull InputStream inputStream, @NonNull OutputStream outputStream) {
        byte[] bArr = new byte[512];
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    static void writeCompressed(@NonNull OutputStream outputStream, byte[] bArr) {
        writeUInt32(outputStream, (long) bArr.length);
        byte[] compress = compress(bArr);
        writeUInt32(outputStream, (long) compress.length);
        outputStream.write(compress);
    }

    static void writeString(@NonNull OutputStream outputStream, @NonNull String str) {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    static void writeUInt(@NonNull OutputStream outputStream, long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((int) ((j >> (i2 * 8)) & 255));
        }
        outputStream.write(bArr);
    }

    static void writeUInt16(@NonNull OutputStream outputStream, int i) {
        writeUInt(outputStream, (long) i, 2);
    }

    static void writeUInt32(@NonNull OutputStream outputStream, long j) {
        writeUInt(outputStream, j, 4);
    }

    static void writeUInt8(@NonNull OutputStream outputStream, int i) {
        writeUInt(outputStream, (long) i, 1);
    }
}
