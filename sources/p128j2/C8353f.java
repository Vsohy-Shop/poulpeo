package p128j2;

import kotlin.jvm.internal.C12775o;
import p251v2.C9925a;

/* renamed from: j2.f */
/* compiled from: Operator.kt */
public final class C8353f {

    /* renamed from: a */
    public static final C8353f f11785a = new C8353f();

    private C8353f() {
    }

    /* renamed from: a */
    public static final void m16597a(C8338a aVar, C8338a aVar2) {
        Class<C8353f> cls = C8353f.class;
        if (!C9925a.m20734d(cls)) {
            try {
                C12775o.m28639i(aVar, "x");
                C12775o.m28639i(aVar2, "b");
                int b = aVar.mo42290b(0);
                int b2 = aVar.mo42290b(1);
                int b3 = aVar.mo42290b(2);
                float[] a = aVar.mo42289a();
                float[] a2 = aVar2.mo42289a();
                for (int i = 0; i < b; i++) {
                    for (int i2 = 0; i2 < b2; i2++) {
                        for (int i3 = 0; i3 < b3; i3++) {
                            int i4 = (i * b2 * b3) + (i2 * b3) + i3;
                            a[i4] = a[i4] + a2[i3];
                        }
                    }
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: b */
    public static final C8338a m16598b(C8338a[] aVarArr) {
        Class<C8353f> cls = C8353f.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            C12775o.m28639i(aVarArr, "tensors");
            int b = aVarArr[0].mo42290b(0);
            int i = 0;
            for (C8338a b2 : aVarArr) {
                i += b2.mo42290b(1);
            }
            C8338a aVar = new C8338a(new int[]{b, i});
            float[] a = aVar.mo42289a();
            for (int i2 = 0; i2 < b; i2++) {
                int i3 = i2 * i;
                int length = aVarArr.length;
                for (int i4 = 0; i4 < length; i4++) {
                    float[] a2 = aVarArr[i4].mo42289a();
                    int b3 = aVarArr[i4].mo42290b(1);
                    System.arraycopy(a2, i2 * b3, a, i3, b3);
                    i3 += b3;
                }
            }
            return aVar;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    public static final C8338a m16599c(C8338a aVar, C8338a aVar2) {
        C8338a aVar3 = aVar;
        C8338a aVar4 = aVar2;
        Class<C8353f> cls = C8353f.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            C12775o.m28639i(aVar3, "x");
            C12775o.m28639i(aVar4, "w");
            int i = 0;
            int b = aVar3.mo42290b(0);
            int b2 = aVar3.mo42290b(1);
            int b3 = aVar3.mo42290b(2);
            int b4 = aVar4.mo42290b(0);
            int i2 = (b2 - b4) + 1;
            int b5 = aVar4.mo42290b(2);
            C8338a aVar5 = new C8338a(new int[]{b, i2, b5});
            float[] a = aVar.mo42289a();
            float[] a2 = aVar5.mo42289a();
            float[] a3 = aVar2.mo42289a();
            int i3 = 0;
            while (i3 < b) {
                int i4 = i;
                while (i4 < b5) {
                    int i5 = i;
                    while (i5 < i2) {
                        float f = 0.0f;
                        while (i < b4) {
                            for (int i6 = 0; i6 < b3; i6++) {
                                f += a[(b2 * b3 * i3) + ((i + i5) * b3) + i6] * a3[(((i * b3) + i6) * b5) + i4];
                            }
                            i++;
                        }
                        a2[(i2 * b5 * i3) + (i5 * b5) + i4] = f;
                        i5++;
                        i = 0;
                    }
                    i4++;
                    i = 0;
                }
                i3++;
                i = 0;
            }
            return aVar5;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: d */
    public static final C8338a m16600d(C8338a aVar, C8338a aVar2, C8338a aVar3) {
        Class<C8353f> cls = C8353f.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            C12775o.m28639i(aVar, "x");
            C12775o.m28639i(aVar2, "w");
            C12775o.m28639i(aVar3, "b");
            int b = aVar.mo42290b(0);
            int b2 = aVar3.mo42290b(0);
            C8338a h = m16604h(aVar, aVar2);
            float[] a = aVar3.mo42289a();
            float[] a2 = h.mo42289a();
            for (int i = 0; i < b; i++) {
                for (int i2 = 0; i2 < b2; i2++) {
                    int i3 = (i * b2) + i2;
                    a2[i3] = a2[i3] + a[i2];
                }
            }
            return h;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: e */
    public static final C8338a m16601e(String[] strArr, int i, C8338a aVar) {
        Class<C8353f> cls = C8353f.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            C12775o.m28639i(strArr, "texts");
            C12775o.m28639i(aVar, "w");
            int length = strArr.length;
            int b = aVar.mo42290b(1);
            C8338a aVar2 = new C8338a(new int[]{length, i, b});
            float[] a = aVar2.mo42289a();
            float[] a2 = aVar.mo42289a();
            for (int i2 = 0; i2 < length; i2++) {
                int[] d = C8354g.f11786a.mo42313d(strArr[i2], i);
                for (int i3 = 0; i3 < i; i3++) {
                    System.arraycopy(a2, d[i3] * b, a, (b * i * i2) + (b * i3), b);
                }
            }
            return aVar2;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: f */
    public static final void m16602f(C8338a aVar, int i) {
        Class<C8353f> cls = C8353f.class;
        if (!C9925a.m20734d(cls)) {
            try {
                C12775o.m28639i(aVar, "x");
                if (i < aVar.mo42291c()) {
                    int c = aVar.mo42291c();
                    int i2 = 1;
                    for (int i3 = i; i3 < c; i3++) {
                        i2 *= aVar.mo42290b(i3);
                    }
                    int[] iArr = new int[(i + 1)];
                    for (int i4 = 0; i4 < i; i4++) {
                        iArr[i4] = aVar.mo42290b(i4);
                    }
                    iArr[i] = i2;
                    aVar.mo42292d(iArr);
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: g */
    public static final C8338a m16603g(C8338a aVar, int i) {
        C8338a aVar2 = aVar;
        int i2 = i;
        Class<C8353f> cls = C8353f.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            C12775o.m28639i(aVar2, "x");
            int i3 = 0;
            int b = aVar2.mo42290b(0);
            int b2 = aVar2.mo42290b(1);
            int b3 = aVar2.mo42290b(2);
            int i4 = (b2 - i2) + 1;
            C8338a aVar3 = new C8338a(new int[]{b, i4, b3});
            float[] a = aVar.mo42289a();
            float[] a2 = aVar3.mo42289a();
            int i5 = 0;
            while (i5 < b) {
                int i6 = i3;
                while (i6 < b3) {
                    int i7 = i3;
                    while (i7 < i4) {
                        int i8 = i7 * b3;
                        int i9 = (i5 * i4 * b3) + i8 + i6;
                        int i10 = (i5 * b2 * b3) + i8 + i6;
                        a2[i9] = Float.MIN_VALUE;
                        for (int i11 = i3; i11 < i2; i11++) {
                            a2[i9] = Math.max(a2[i9], a[i10 + (i11 * b3)]);
                        }
                        i7++;
                        i3 = 0;
                    }
                    i6++;
                    i3 = 0;
                }
                i5++;
                i3 = 0;
            }
            return aVar3;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: h */
    public static final C8338a m16604h(C8338a aVar, C8338a aVar2) {
        C8338a aVar3 = aVar;
        C8338a aVar4 = aVar2;
        Class<C8353f> cls = C8353f.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            C12775o.m28639i(aVar3, "x");
            C12775o.m28639i(aVar4, "w");
            int b = aVar3.mo42290b(0);
            int b2 = aVar4.mo42290b(0);
            int b3 = aVar4.mo42290b(1);
            C8338a aVar5 = new C8338a(new int[]{b, b3});
            float[] a = aVar.mo42289a();
            float[] a2 = aVar2.mo42289a();
            float[] a3 = aVar5.mo42289a();
            for (int i = 0; i < b; i++) {
                for (int i2 = 0; i2 < b3; i2++) {
                    int i3 = (i * b3) + i2;
                    a3[i3] = 0.0f;
                    for (int i4 = 0; i4 < b2; i4++) {
                        a3[i3] = a3[i3] + (a[(i * b2) + i4] * a2[(i4 * b3) + i2]);
                    }
                }
            }
            return aVar5;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: i */
    public static final void m16605i(C8338a aVar) {
        Class<C8353f> cls = C8353f.class;
        if (!C9925a.m20734d(cls)) {
            try {
                C12775o.m28639i(aVar, "x");
                float[] a = aVar.mo42289a();
                int length = a.length;
                for (int i = 0; i < length; i++) {
                    if (a[i] < ((float) 0)) {
                        a[i] = 0.0f;
                    }
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: j */
    public static final void m16606j(C8338a aVar) {
        Class<C8353f> cls = C8353f.class;
        if (!C9925a.m20734d(cls)) {
            try {
                C12775o.m28639i(aVar, "x");
                int b = aVar.mo42290b(0);
                int b2 = aVar.mo42290b(1);
                float[] a = aVar.mo42289a();
                for (int i = 0; i < b; i++) {
                    int i2 = i * b2;
                    int i3 = i2 + b2;
                    float f = Float.MIN_VALUE;
                    for (int i4 = i2; i4 < i3; i4++) {
                        float f2 = a[i4];
                        if (f2 > f) {
                            f = f2;
                        }
                    }
                    float f3 = 0.0f;
                    for (int i5 = i2; i5 < i3; i5++) {
                        float exp = (float) Math.exp((double) (a[i5] - f));
                        a[i5] = exp;
                        f3 += exp;
                    }
                    while (i2 < i3) {
                        a[i2] = a[i2] / f3;
                        i2++;
                    }
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: k */
    public static final C8338a m16607k(C8338a aVar) {
        Class<C8353f> cls = C8353f.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            C12775o.m28639i(aVar, "x");
            int b = aVar.mo42290b(0);
            int b2 = aVar.mo42290b(1);
            C8338a aVar2 = new C8338a(new int[]{b2, b});
            float[] a = aVar.mo42289a();
            float[] a2 = aVar2.mo42289a();
            for (int i = 0; i < b; i++) {
                for (int i2 = 0; i2 < b2; i2++) {
                    a2[(i2 * b) + i] = a[(i * b2) + i2];
                }
            }
            return aVar2;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: l */
    public static final C8338a m16608l(C8338a aVar) {
        Class<C8353f> cls = C8353f.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            C12775o.m28639i(aVar, "x");
            int b = aVar.mo42290b(0);
            int b2 = aVar.mo42290b(1);
            int b3 = aVar.mo42290b(2);
            C8338a aVar2 = new C8338a(new int[]{b3, b2, b});
            float[] a = aVar.mo42289a();
            float[] a2 = aVar2.mo42289a();
            for (int i = 0; i < b; i++) {
                for (int i2 = 0; i2 < b2; i2++) {
                    for (int i3 = 0; i3 < b3; i3++) {
                        a2[(i3 * b * b2) + (i2 * b) + i] = a[(i * b2 * b3) + (i2 * b3) + i3];
                    }
                }
            }
            return aVar2;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }
}
