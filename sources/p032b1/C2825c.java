package p032b1;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: b1.c */
/* compiled from: StrictLineReader */
class C2825c implements Closeable {

    /* renamed from: b */
    private final InputStream f1159b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Charset f1160c;

    /* renamed from: d */
    private byte[] f1161d;

    /* renamed from: e */
    private int f1162e;

    /* renamed from: f */
    private int f1163f;

    /* renamed from: b1.c$a */
    /* compiled from: StrictLineReader */
    class C2826a extends ByteArrayOutputStream {
        C2826a(int i) {
            super(i);
        }

        public String toString() {
            int i = this.count;
            if (i > 0 && this.buf[i - 1] == 13) {
                i--;
            }
            try {
                return new String(this.buf, 0, i, C2825c.this.f1160c.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public C2825c(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    /* renamed from: b */
    private void m2142b() {
        InputStream inputStream = this.f1159b;
        byte[] bArr = this.f1161d;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f1162e = 0;
            this.f1163f = read;
            return;
        }
        throw new EOFException();
    }

    /* renamed from: c */
    public boolean mo28322c() {
        if (this.f1163f == -1) {
            return true;
        }
        return false;
    }

    public void close() {
        synchronized (this.f1159b) {
            if (this.f1161d != null) {
                this.f1161d = null;
                this.f1159b.close();
            }
        }
    }

    /* renamed from: k */
    public String mo28324k() {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f1159b) {
            if (this.f1161d != null) {
                if (this.f1162e >= this.f1163f) {
                    m2142b();
                }
                for (int i3 = this.f1162e; i3 != this.f1163f; i3++) {
                    byte[] bArr2 = this.f1161d;
                    if (bArr2[i3] == 10) {
                        int i4 = this.f1162e;
                        if (i3 != i4) {
                            i2 = i3 - 1;
                            if (bArr2[i2] == 13) {
                                String str = new String(bArr2, i4, i2 - i4, this.f1160c.name());
                                this.f1162e = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(bArr2, i4, i2 - i4, this.f1160c.name());
                        this.f1162e = i3 + 1;
                        return str2;
                    }
                }
                C2826a aVar = new C2826a((this.f1163f - this.f1162e) + 80);
                loop1:
                while (true) {
                    byte[] bArr3 = this.f1161d;
                    int i5 = this.f1162e;
                    aVar.write(bArr3, i5, this.f1163f - i5);
                    this.f1163f = -1;
                    m2142b();
                    i = this.f1162e;
                    while (true) {
                        if (i != this.f1163f) {
                            bArr = this.f1161d;
                            if (bArr[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                int i6 = this.f1162e;
                if (i != i6) {
                    aVar.write(bArr, i6, i - i6);
                }
                this.f1162e = i + 1;
                String byteArrayOutputStream = aVar.toString();
                return byteArrayOutputStream;
            }
            throw new IOException("LineReader is closed");
        }
    }

    public C2825c(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(C2827d.f1165a)) {
            this.f1159b = inputStream;
            this.f1160c = charset;
            this.f1161d = new byte[i];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }
}
