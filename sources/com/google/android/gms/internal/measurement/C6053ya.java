package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.ya */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
public final class C6053ya {

    /* renamed from: f */
    private static final C6053ya f7489f = new C6053ya(0, new int[0], new Object[0], false);

    /* renamed from: a */
    private int f7490a;

    /* renamed from: b */
    private int[] f7491b;

    /* renamed from: c */
    private Object[] f7492c;

    /* renamed from: d */
    private int f7493d;

    /* renamed from: e */
    private boolean f7494e;

    private C6053ya(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f7493d = -1;
        this.f7490a = i;
        this.f7491b = iArr;
        this.f7492c = objArr;
        this.f7494e = z;
    }

    /* renamed from: c */
    public static C6053ya m10311c() {
        return f7489f;
    }

    /* renamed from: d */
    static C6053ya m10312d(C6053ya yaVar, C6053ya yaVar2) {
        int i = yaVar.f7490a + yaVar2.f7490a;
        int[] copyOf = Arrays.copyOf(yaVar.f7491b, i);
        System.arraycopy(yaVar2.f7491b, 0, copyOf, yaVar.f7490a, yaVar2.f7490a);
        Object[] copyOf2 = Arrays.copyOf(yaVar.f7492c, i);
        System.arraycopy(yaVar2.f7492c, 0, copyOf2, yaVar.f7490a, yaVar2.f7490a);
        return new C6053ya(i, copyOf, copyOf2, true);
    }

    /* renamed from: e */
    static C6053ya m10313e() {
        return new C6053ya(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public final int mo34640a() {
        int i;
        int i2;
        int i3;
        int i4 = this.f7493d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f7490a; i6++) {
            int i7 = this.f7491b[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 != 0) {
                if (i9 == 1) {
                    ((Long) this.f7492c[i6]).longValue();
                    i = C5707d8.m8988a(i8 << 3) + 8;
                } else if (i9 == 2) {
                    int a = C5707d8.m8988a(i8 << 3);
                    int j = ((C6018w7) this.f7492c[i6]).mo34319j();
                    i5 += a + C5707d8.m8988a(j) + j;
                } else if (i9 == 3) {
                    int D = C5707d8.m8987D(i8);
                    i3 = D + D;
                    i2 = ((C6053ya) this.f7492c[i6]).mo34640a();
                } else if (i9 == 5) {
                    ((Integer) this.f7492c[i6]).intValue();
                    i = C5707d8.m8988a(i8 << 3) + 4;
                } else {
                    throw new IllegalStateException(zzkh.m10400a());
                }
                i5 += i;
            } else {
                long longValue = ((Long) this.f7492c[i6]).longValue();
                i3 = C5707d8.m8988a(i8 << 3);
                i2 = C5707d8.m8989b(longValue);
            }
            i = i3 + i2;
            i5 += i;
        }
        this.f7493d = i5;
        return i5;
    }

    /* renamed from: b */
    public final int mo34641b() {
        int i = this.f7493d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f7490a; i3++) {
            int i4 = this.f7491b[i3];
            int a = C5707d8.m8988a(8);
            int j = ((C6018w7) this.f7492c[i3]).mo34319j();
            i2 += a + a + C5707d8.m8988a(16) + C5707d8.m8988a(i4 >>> 3) + C5707d8.m8988a(24) + C5707d8.m8988a(j) + j;
        }
        this.f7493d = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C6053ya)) {
            return false;
        }
        C6053ya yaVar = (C6053ya) obj;
        int i = this.f7490a;
        if (i == yaVar.f7490a) {
            int[] iArr = this.f7491b;
            int[] iArr2 = yaVar.f7491b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f7492c;
                    Object[] objArr2 = yaVar.f7492c;
                    int i3 = this.f7490a;
                    int i4 = 0;
                    while (i4 < i3) {
                        if (objArr[i4].equals(objArr2[i4])) {
                            i4++;
                        }
                    }
                    return true;
                } else if (iArr[i2] != iArr2[i2]) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void mo34643f() {
        this.f7494e = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo34644g(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.f7490a; i2++) {
            C5658aa.m8765b(sb, i, String.valueOf(this.f7491b[i2] >>> 3), this.f7492c[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo34645h(int i, Object obj) {
        int i2;
        if (this.f7494e) {
            int i3 = this.f7490a;
            int[] iArr = this.f7491b;
            if (i3 == iArr.length) {
                if (i3 < 4) {
                    i2 = 8;
                } else {
                    i2 = i3 >> 1;
                }
                int i4 = i3 + i2;
                this.f7491b = Arrays.copyOf(iArr, i4);
                this.f7492c = Arrays.copyOf(this.f7492c, i4);
            }
            int[] iArr2 = this.f7491b;
            int i5 = this.f7490a;
            iArr2[i5] = i;
            this.f7492c[i5] = obj;
            this.f7490a = i5 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        int i = this.f7490a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f7491b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f7492c;
        int i7 = this.f7490a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    /* renamed from: i */
    public final void mo34647i(C5724e8 e8Var) {
        if (this.f7490a != 0) {
            for (int i = 0; i < this.f7490a; i++) {
                int i2 = this.f7491b[i];
                Object obj = this.f7492c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    e8Var.mo33905E(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    e8Var.mo33934x(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    e8Var.mo33925o(i3, (C6018w7) obj);
                } else if (i4 == 3) {
                    e8Var.mo33916e(i3);
                    ((C6053ya) obj).mo34647i(e8Var);
                    e8Var.mo33929s(i3);
                } else if (i4 == 5) {
                    e8Var.mo33932v(i3, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(zzkh.m10400a());
                }
            }
        }
    }

    private C6053ya() {
        this(0, new int[8], new Object[8], true);
    }
}
