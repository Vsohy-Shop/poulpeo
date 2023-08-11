package p070e1;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.io.OutputStream;
import p106h1.C7883b;

/* renamed from: e1.c */
/* compiled from: BufferedOutputStream */
public final class C7421c extends OutputStream {
    @NonNull

    /* renamed from: b */
    private final OutputStream f10263b;

    /* renamed from: c */
    private byte[] f10264c;

    /* renamed from: d */
    private C7883b f10265d;

    /* renamed from: e */
    private int f10266e;

    public C7421c(@NonNull OutputStream outputStream, @NonNull C7883b bVar) {
        this(outputStream, bVar, 65536);
    }

    /* renamed from: a */
    private void m14497a() {
        int i = this.f10266e;
        if (i > 0) {
            this.f10263b.write(this.f10264c, 0, i);
            this.f10266e = 0;
        }
    }

    /* renamed from: b */
    private void m14498b() {
        if (this.f10266e == this.f10264c.length) {
            m14497a();
        }
    }

    /* renamed from: c */
    private void m14499c() {
        byte[] bArr = this.f10264c;
        if (bArr != null) {
            this.f10265d.put(bArr);
            this.f10264c = null;
        }
    }

    /* JADX INFO: finally extract failed */
    public void close() {
        try {
            flush();
            this.f10263b.close();
            m14499c();
        } catch (Throwable th) {
            this.f10263b.close();
            throw th;
        }
    }

    public void flush() {
        m14497a();
        this.f10263b.flush();
    }

    public void write(int i) {
        byte[] bArr = this.f10264c;
        int i2 = this.f10266e;
        this.f10266e = i2 + 1;
        bArr[i2] = (byte) i;
        m14498b();
    }

    @VisibleForTesting
    C7421c(@NonNull OutputStream outputStream, C7883b bVar, int i) {
        this.f10263b = outputStream;
        this.f10265d = bVar;
        this.f10264c = (byte[]) bVar.mo41595d(i, byte[].class);
    }

    public void write(@NonNull byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public void write(@NonNull byte[] bArr, int i, int i2) {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.f10266e;
            if (i6 != 0 || i4 < this.f10264c.length) {
                int min = Math.min(i4, this.f10264c.length - i6);
                System.arraycopy(bArr, i5, this.f10264c, this.f10266e, min);
                this.f10266e += min;
                i3 += min;
                m14498b();
            } else {
                this.f10263b.write(bArr, i5, i4);
                return;
            }
        } while (i3 < i2);
    }
}
