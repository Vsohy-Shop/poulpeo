package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import androidx.annotation.NonNull;
import com.adjust.sdk.Constants;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import p106h1.C7883b;
import p294z1.C10791j;

public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* renamed from: a */
    static final byte[] f3987a = "Exif\u0000\u0000".getBytes(Charset.forName(Constants.ENCODING));

    /* renamed from: b */
    private static final int[] f3988b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    private interface Reader {

        public static final class EndOfFileException extends IOException {
            private static final long serialVersionUID = 1;

            EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        /* renamed from: a */
        int mo31387a();

        /* renamed from: b */
        int mo31388b(byte[] bArr, int i);

        /* renamed from: c */
        short mo31389c();

        long skip(long j);
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$a */
    private static final class C4435a implements Reader {

        /* renamed from: a */
        private final ByteBuffer f3989a;

        C4435a(ByteBuffer byteBuffer) {
            this.f3989a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public int mo31387a() {
            return (mo31389c() << 8) | mo31389c();
        }

        /* renamed from: b */
        public int mo31388b(byte[] bArr, int i) {
            int min = Math.min(i, this.f3989a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f3989a.get(bArr, 0, min);
            return min;
        }

        /* renamed from: c */
        public short mo31389c() {
            if (this.f3989a.remaining() >= 1) {
                return (short) (this.f3989a.get() & 255);
            }
            throw new Reader.EndOfFileException();
        }

        public long skip(long j) {
            int min = (int) Math.min((long) this.f3989a.remaining(), j);
            ByteBuffer byteBuffer = this.f3989a;
            byteBuffer.position(byteBuffer.position() + min);
            return (long) min;
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$b */
    private static final class C4436b {

        /* renamed from: a */
        private final ByteBuffer f3990a;

        C4436b(byte[] bArr, int i) {
            this.f3990a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        /* renamed from: c */
        private boolean m5330c(int i, int i2) {
            if (this.f3990a.remaining() - i >= i2) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public short mo31391a(int i) {
            if (m5330c(i, 2)) {
                return this.f3990a.getShort(i);
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo31392b(int i) {
            if (m5330c(i, 4)) {
                return this.f3990a.getInt(i);
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo31393d() {
            return this.f3990a.remaining();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo31394e(ByteOrder byteOrder) {
            this.f3990a.order(byteOrder);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$c */
    private static final class C4437c implements Reader {

        /* renamed from: a */
        private final InputStream f3991a;

        C4437c(InputStream inputStream) {
            this.f3991a = inputStream;
        }

        /* renamed from: a */
        public int mo31387a() {
            return (mo31389c() << 8) | mo31389c();
        }

        /* renamed from: b */
        public int mo31388b(byte[] bArr, int i) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && (i3 = this.f3991a.read(bArr, i2, i - i2)) != -1) {
                i2 += i3;
            }
            if (i2 != 0 || i3 != -1) {
                return i2;
            }
            throw new Reader.EndOfFileException();
        }

        /* renamed from: c */
        public short mo31389c() {
            int read = this.f3991a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new Reader.EndOfFileException();
        }

        public long skip(long j) {
            if (j < 0) {
                return 0;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.f3991a.skip(j2);
                if (skip <= 0) {
                    if (this.f3991a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }
    }

    /* renamed from: d */
    private static int m5313d(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    /* renamed from: e */
    private int m5314e(Reader reader, C7883b bVar) {
        byte[] bArr;
        try {
            int a = reader.mo31387a();
            if (!m5316g(a)) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + a);
                }
                return -1;
            }
            int i = m5318i(reader);
            if (i == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            bArr = (byte[]) bVar.mo41595d(i, byte[].class);
            int k = m5320k(reader, bArr, i);
            bVar.put(bArr);
            return k;
        } catch (Reader.EndOfFileException unused) {
            return -1;
        } catch (Throwable th) {
            bVar.put(bArr);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        return com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0039 */
    @androidx.annotation.NonNull
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.bumptech.glide.load.ImageHeaderParser.ImageType m5315f(com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader r6) {
        /*
            r5 = this;
            int r0 = r6.mo31387a()     // Catch:{ EndOfFileException -> 0x00a0 }
            r1 = 65496(0xffd8, float:9.178E-41)
            if (r0 != r1) goto L_0x000c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.JPEG     // Catch:{ EndOfFileException -> 0x00a0 }
            return r6
        L_0x000c:
            int r0 = r0 << 8
            short r1 = r6.mo31389c()     // Catch:{ EndOfFileException -> 0x00a0 }
            r0 = r0 | r1
            r1 = 4671814(0x474946, float:6.546606E-39)
            if (r0 != r1) goto L_0x001b
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.GIF     // Catch:{ EndOfFileException -> 0x00a0 }
            return r6
        L_0x001b:
            int r0 = r0 << 8
            short r1 = r6.mo31389c()     // Catch:{ EndOfFileException -> 0x00a0 }
            r0 = r0 | r1
            r1 = -1991225785(0xffffffff89504e47, float:-2.5073895E-33)
            if (r0 != r1) goto L_0x003c
            r0 = 21
            r6.skip(r0)     // Catch:{ EndOfFileException -> 0x00a0 }
            short r6 = r6.mo31389c()     // Catch:{ EndOfFileException -> 0x0039 }
            r0 = 3
            if (r6 < r0) goto L_0x0036
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG_A     // Catch:{ EndOfFileException -> 0x0039 }
            goto L_0x0038
        L_0x0036:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ EndOfFileException -> 0x0039 }
        L_0x0038:
            return r6
        L_0x0039:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.PNG     // Catch:{ EndOfFileException -> 0x00a0 }
            return r6
        L_0x003c:
            r1 = 1380533830(0x52494646, float:2.16116855E11)
            if (r0 == r1) goto L_0x0044
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ EndOfFileException -> 0x00a0 }
            return r6
        L_0x0044:
            r0 = 4
            r6.skip(r0)     // Catch:{ EndOfFileException -> 0x00a0 }
            int r2 = r6.mo31387a()     // Catch:{ EndOfFileException -> 0x00a0 }
            int r2 = r2 << 16
            int r3 = r6.mo31387a()     // Catch:{ EndOfFileException -> 0x00a0 }
            r2 = r2 | r3
            r3 = 1464156752(0x57454250, float:2.16888601E14)
            if (r2 == r3) goto L_0x005c
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ EndOfFileException -> 0x00a0 }
            return r6
        L_0x005c:
            int r2 = r6.mo31387a()     // Catch:{ EndOfFileException -> 0x00a0 }
            int r2 = r2 << 16
            int r3 = r6.mo31387a()     // Catch:{ EndOfFileException -> 0x00a0 }
            r2 = r2 | r3
            r3 = r2 & -256(0xffffffffffffff00, float:NaN)
            r4 = 1448097792(0x56503800, float:5.7234734E13)
            if (r3 == r4) goto L_0x0071
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN     // Catch:{ EndOfFileException -> 0x00a0 }
            return r6
        L_0x0071:
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 88
            if (r2 != r3) goto L_0x0088
            r6.skip(r0)     // Catch:{ EndOfFileException -> 0x00a0 }
            short r6 = r6.mo31389c()     // Catch:{ EndOfFileException -> 0x00a0 }
            r6 = r6 & 16
            if (r6 == 0) goto L_0x0085
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ EndOfFileException -> 0x00a0 }
            goto L_0x0087
        L_0x0085:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ EndOfFileException -> 0x00a0 }
        L_0x0087:
            return r6
        L_0x0088:
            r3 = 76
            if (r2 != r3) goto L_0x009d
            r6.skip(r0)     // Catch:{ EndOfFileException -> 0x00a0 }
            short r6 = r6.mo31389c()     // Catch:{ EndOfFileException -> 0x00a0 }
            r6 = r6 & 8
            if (r6 == 0) goto L_0x009a
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP_A     // Catch:{ EndOfFileException -> 0x00a0 }
            goto L_0x009c
        L_0x009a:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ EndOfFileException -> 0x00a0 }
        L_0x009c:
            return r6
        L_0x009d:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.WEBP     // Catch:{ EndOfFileException -> 0x00a0 }
            return r6
        L_0x00a0:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.m5315f(com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader):com.bumptech.glide.load.ImageHeaderParser$ImageType");
    }

    /* renamed from: g */
    private static boolean m5316g(int i) {
        if ((i & 65496) == 65496 || i == 19789 || i == 18761) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private boolean m5317h(byte[] bArr, int i) {
        boolean z;
        if (bArr == null || i <= f3987a.length) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = f3987a;
                if (i2 >= bArr2.length) {
                    break;
                } else if (bArr[i2] != bArr2[i2]) {
                    return false;
                } else {
                    i2++;
                }
            }
        }
        return z;
    }

    /* renamed from: i */
    private int m5318i(Reader reader) {
        short c;
        int a;
        long j;
        long skip;
        do {
            short c2 = reader.mo31389c();
            if (c2 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + c2);
                }
                return -1;
            }
            c = reader.mo31389c();
            if (c == 218) {
                return -1;
            }
            if (c == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            a = reader.mo31387a() - 2;
            if (c == 225) {
                return a;
            }
            j = (long) a;
            skip = reader.skip(j);
        } while (skip == j);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + c + ", wanted to skip: " + a + ", but actually skipped: " + skip);
        }
        return -1;
    }

    /* renamed from: j */
    private static int m5319j(C4436b bVar) {
        ByteOrder byteOrder;
        short a = bVar.mo31391a(6);
        if (a == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (a != 19789) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown endianness = " + a);
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        bVar.mo31394e(byteOrder);
        int b = bVar.mo31392b(10) + 6;
        short a2 = bVar.mo31391a(b);
        for (int i = 0; i < a2; i++) {
            int d = m5313d(b, i);
            short a3 = bVar.mo31391a(d);
            if (a3 == 274) {
                short a4 = bVar.mo31391a(d + 2);
                if (a4 >= 1 && a4 <= 12) {
                    int b2 = bVar.mo31392b(d + 4);
                    if (b2 >= 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got tagIndex=" + i + " tagType=" + a3 + " formatCode=" + a4 + " componentCount=" + b2);
                        }
                        int i2 = b2 + f3988b[a4];
                        if (i2 <= 4) {
                            int i3 = d + 8;
                            if (i3 < 0 || i3 > bVar.mo31393d()) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i3 + " tagType=" + a3);
                                }
                            } else if (i2 >= 0 && i2 + i3 <= bVar.mo31393d()) {
                                return bVar.mo31391a(i3);
                            } else {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + a3);
                                }
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + a4);
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Negative tiff component count");
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Got invalid format code = " + a4);
                }
            }
        }
        return -1;
    }

    /* renamed from: k */
    private int m5320k(Reader reader, byte[] bArr, int i) {
        int b = reader.mo31388b(bArr, i);
        if (b != i) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + b);
            }
            return -1;
        } else if (m5317h(bArr, i)) {
            return m5319j(new C4436b(bArr, i));
        } else {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
    }

    @NonNull
    /* renamed from: a */
    public ImageHeaderParser.ImageType mo31238a(@NonNull ByteBuffer byteBuffer) {
        return m5315f(new C4435a((ByteBuffer) C10791j.m22948d(byteBuffer)));
    }

    @NonNull
    /* renamed from: b */
    public ImageHeaderParser.ImageType mo31239b(@NonNull InputStream inputStream) {
        return m5315f(new C4437c((InputStream) C10791j.m22948d(inputStream)));
    }

    /* renamed from: c */
    public int mo31240c(@NonNull InputStream inputStream, @NonNull C7883b bVar) {
        return m5314e(new C4437c((InputStream) C10791j.m22948d(inputStream)), (C7883b) C10791j.m22948d(bVar));
    }
}
