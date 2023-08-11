package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.measurement.u7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
class C5986u7 extends C5970t7 {

    /* renamed from: f */
    protected final byte[] f7413f;

    C5986u7(byte[] bArr) {
        bArr.getClass();
        this.f7413f = bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public int mo34316F() {
        return 0;
    }

    /* renamed from: b */
    public byte mo34317b(int i) {
        return this.f7413f[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public byte mo34318d(int i) {
        return this.f7413f[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6018w7) || mo34319j() != ((C6018w7) obj).mo34319j()) {
            return false;
        }
        if (mo34319j() == 0) {
            return true;
        }
        if (!(obj instanceof C5986u7)) {
            return obj.equals(this);
        }
        C5986u7 u7Var = (C5986u7) obj;
        int v = mo34585v();
        int v2 = u7Var.mo34585v();
        if (v != 0 && v2 != 0 && v != v2) {
            return false;
        }
        int j = mo34319j();
        if (j > u7Var.mo34319j()) {
            int j2 = mo34319j();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(j);
            sb.append(j2);
            throw new IllegalArgumentException(sb.toString());
        } else if (j <= u7Var.mo34319j()) {
            byte[] bArr = this.f7413f;
            byte[] bArr2 = u7Var.f7413f;
            u7Var.mo34316F();
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
            int j3 = u7Var.mo34319j();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(j);
            sb2.append(", ");
            sb2.append(j3);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: j */
    public int mo34319j() {
        return this.f7413f.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final int mo34535k(int i, int i2, int i3) {
        return C5708d9.m9017d(i, this.f7413f, 0, i3);
    }

    /* renamed from: q */
    public final C6018w7 mo34536q(int i, int i2) {
        int u = C6018w7.m10203u(0, i2, mo34319j());
        if (u == 0) {
            return C6018w7.f7451c;
        }
        return new C5938r7(this.f7413f, 0, u);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final String mo34537r(Charset charset) {
        return new String(this.f7413f, 0, mo34319j(), charset);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo34538s(C5858m7 m7Var) {
        ((C5690c8) m7Var).mo33754E(this.f7413f, 0, mo34319j());
    }

    /* renamed from: t */
    public final boolean mo34539t() {
        return C5862mb.m9645f(this.f7413f, 0, mo34319j());
    }
}
