package p042bo.app;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: bo.app.s5 */
class C3670s5 implements Closeable {

    /* renamed from: b */
    private final InputStream f2551b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Charset f2552c;

    /* renamed from: d */
    private byte[] f2553d;

    /* renamed from: e */
    private int f2554e;

    /* renamed from: f */
    private int f2555f;

    /* renamed from: bo.app.s5$a */
    class C3671a extends ByteArrayOutputStream {
        C3671a(int i) {
            super(i);
        }

        public String toString() {
            int i = this.count;
            if (i > 0) {
                int i2 = i - 1;
                if (this.buf[i2] == 13) {
                    i = i2;
                }
            }
            try {
                return new String(this.buf, 0, i, C3670s5.this.f2552c.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public C3670s5(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    /* renamed from: b */
    public boolean mo29639b() {
        if (this.f2555f == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public String mo29640c() {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f2551b) {
            if (this.f2553d != null) {
                if (this.f2554e >= this.f2555f) {
                    m3855a();
                }
                for (int i3 = this.f2554e; i3 != this.f2555f; i3++) {
                    byte[] bArr2 = this.f2553d;
                    if (bArr2[i3] == 10) {
                        int i4 = this.f2554e;
                        if (i3 != i4) {
                            i2 = i3 - 1;
                            if (bArr2[i2] == 13) {
                                String str = new String(bArr2, i4, i2 - i4, this.f2552c.name());
                                this.f2554e = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(bArr2, i4, i2 - i4, this.f2552c.name());
                        this.f2554e = i3 + 1;
                        return str2;
                    }
                }
                C3671a aVar = new C3671a((this.f2555f - this.f2554e) + 80);
                loop1:
                while (true) {
                    byte[] bArr3 = this.f2553d;
                    int i5 = this.f2554e;
                    aVar.write(bArr3, i5, this.f2555f - i5);
                    this.f2555f = -1;
                    m3855a();
                    i = this.f2554e;
                    while (true) {
                        if (i != this.f2555f) {
                            bArr = this.f2553d;
                            if (bArr[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                int i6 = this.f2554e;
                if (i != i6) {
                    aVar.write(bArr, i6, i - i6);
                }
                this.f2554e = i + 1;
                String byteArrayOutputStream = aVar.toString();
                return byteArrayOutputStream;
            }
            throw new IOException("LineReader is closed");
        }
    }

    public void close() {
        synchronized (this.f2551b) {
            if (this.f2553d != null) {
                this.f2553d = null;
                this.f2551b.close();
            }
        }
    }

    public C3670s5(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(C3757v6.f2716a)) {
            this.f2551b = inputStream;
            this.f2552c = charset;
            this.f2553d = new byte[i];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    /* renamed from: a */
    private void m3855a() {
        InputStream inputStream = this.f2551b;
        byte[] bArr = this.f2553d;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f2554e = 0;
            this.f2555f = read;
            return;
        }
        throw new EOFException();
    }
}
