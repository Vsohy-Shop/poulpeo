package com.google.android.gms.internal.cast;

import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.cast.gc */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
class C4929gc extends C4912fc {

    /* renamed from: f */
    protected final byte[] f5234f;

    C4929gc(byte[] bArr) {
        bArr.getClass();
        this.f5234f = bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public int mo32727B() {
        return 0;
    }

    /* renamed from: b */
    public byte mo32728b(int i) {
        return this.f5234f[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public byte mo32729d(int i) {
        return this.f5234f[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4980jc) || mo32730j() != ((C4980jc) obj).mo32730j()) {
            return false;
        }
        if (mo32730j() == 0) {
            return true;
        }
        if (!(obj instanceof C4929gc)) {
            return obj.equals(this);
        }
        C4929gc gcVar = (C4929gc) obj;
        int v = mo32849v();
        int v2 = gcVar.mo32849v();
        if (v != 0 && v2 != 0 && v != v2) {
            return false;
        }
        int j = mo32730j();
        if (j > gcVar.mo32730j()) {
            throw new IllegalArgumentException("Length too large: " + j + mo32730j());
        } else if (j <= gcVar.mo32730j()) {
            byte[] bArr = this.f5234f;
            byte[] bArr2 = gcVar.f5234f;
            gcVar.mo32727B();
            int i = 0;
            int i2 = 0;
            while (i < j) {
                if (bArr[i] != bArr2[i2]) {
                    return false;
                }
                i++;
                i2++;
            }
            return true;
        } else {
            throw new IllegalArgumentException("Ran off end of other: 0, " + j + ", " + gcVar.mo32730j());
        }
    }

    /* renamed from: j */
    public int mo32730j() {
        return this.f5234f.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final int mo32809k(int i, int i2, int i3) {
        return C5032md.m7197d(i, this.f5234f, 0, i3);
    }

    /* renamed from: q */
    public final C4980jc mo32810q(int i, int i2) {
        C4980jc.m7090u(0, i2, mo32730j());
        if (i2 == 0) {
            return C4980jc.f5269c;
        }
        return new C4877dc(this.f5234f, 0, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final String mo32811r(Charset charset) {
        return new String(this.f5234f, 0, mo32730j(), charset);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo32812s(C5251zb zbVar) {
        ((C5065oc) zbVar).mo32926E(this.f5234f, 0, mo32730j());
    }

    /* renamed from: t */
    public final boolean mo32813t() {
        return C5255zf.m7732e(this.f5234f, 0, mo32730j());
    }
}
