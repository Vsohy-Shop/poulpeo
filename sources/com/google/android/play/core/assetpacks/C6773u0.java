package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* renamed from: com.google.android.play.core.assetpacks.u0 */
final class C6773u0 extends OutputStream {

    /* renamed from: b */
    private final C6774u1 f8868b = new C6774u1();

    /* renamed from: c */
    private final File f8869c;

    /* renamed from: d */
    private final C6727i2 f8870d;

    /* renamed from: e */
    private long f8871e;

    /* renamed from: f */
    private long f8872f;

    /* renamed from: g */
    private FileOutputStream f8873g;

    /* renamed from: h */
    private C6751o2 f8874h;

    C6773u0(File file, C6727i2 i2Var) {
        this.f8869c = file;
        this.f8870d = i2Var;
    }

    public final void write(int i) {
        write(new byte[]{(byte) i});
    }

    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        while (i2 > 0) {
            if (this.f8871e == 0 && this.f8872f == 0) {
                int b = this.f8868b.mo39369b(bArr, i, i2);
                if (b != -1) {
                    i += b;
                    i2 -= b;
                    C6751o2 c = this.f8868b.mo39370c();
                    this.f8874h = c;
                    if (c.mo39345h()) {
                        this.f8871e = 0;
                        this.f8870d.mo39312k(this.f8874h.mo39347i(), this.f8874h.mo39347i().length);
                        this.f8872f = (long) this.f8874h.mo39347i().length;
                    } else if (!this.f8874h.mo39339c() || this.f8874h.mo39338b()) {
                        byte[] i4 = this.f8874h.mo39347i();
                        this.f8870d.mo39312k(i4, i4.length);
                        this.f8871e = this.f8874h.mo39341e();
                    } else {
                        this.f8870d.mo39307f(this.f8874h.mo39347i());
                        File file = new File(this.f8869c, this.f8874h.mo39340d());
                        file.getParentFile().mkdirs();
                        this.f8871e = this.f8874h.mo39341e();
                        this.f8873g = new FileOutputStream(file);
                    }
                } else {
                    return;
                }
            }
            if (!this.f8874h.mo39338b()) {
                if (this.f8874h.mo39345h()) {
                    this.f8870d.mo39304c(this.f8872f, bArr, i, i2);
                    this.f8872f += (long) i2;
                    i3 = i2;
                } else if (this.f8874h.mo39339c()) {
                    i3 = (int) Math.min((long) i2, this.f8871e);
                    this.f8873g.write(bArr, i, i3);
                    long j = this.f8871e - ((long) i3);
                    this.f8871e = j;
                    if (j == 0) {
                        this.f8873g.close();
                    }
                } else {
                    i3 = (int) Math.min((long) i2, this.f8871e);
                    int length = this.f8874h.mo39347i().length;
                    this.f8870d.mo39304c((((long) length) + this.f8874h.mo39341e()) - this.f8871e, bArr, i, i3);
                    this.f8871e -= (long) i3;
                }
                i += i3;
                i2 -= i3;
            }
        }
    }
}
