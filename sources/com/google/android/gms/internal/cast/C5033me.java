package com.google.android.gms.internal.cast;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.cast.me */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C5033me<T> implements C5169ue<T> {

    /* renamed from: m */
    private static final int[] f5369m = new int[0];

    /* renamed from: n */
    private static final Unsafe f5370n = C5187vf.m7586l();

    /* renamed from: a */
    private final int[] f5371a;

    /* renamed from: b */
    private final Object[] f5372b;

    /* renamed from: c */
    private final C4982je f5373c;

    /* renamed from: d */
    private final boolean f5374d;

    /* renamed from: e */
    private final boolean f5375e;

    /* renamed from: f */
    private final int[] f5376f;

    /* renamed from: g */
    private final int f5377g;

    /* renamed from: h */
    private final C5219xd f5378h;

    /* renamed from: i */
    private final C5000kf f5379i;

    /* renamed from: j */
    private final C5167uc f5380j;

    /* renamed from: k */
    private final C5067oe f5381k;

    /* renamed from: l */
    private final C4897ee f5382l;

    private C5033me(int[] iArr, Object[] objArr, int i, int i2, C4982je jeVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, C5067oe oeVar, C5219xd xdVar, C5000kf kfVar, C5167uc ucVar, C4897ee eeVar, byte[] bArr) {
        C4982je jeVar2 = jeVar;
        C5167uc ucVar2 = ucVar;
        this.f5371a = iArr;
        this.f5372b = objArr;
        this.f5375e = z;
        boolean z3 = false;
        if (ucVar2 != null && ucVar2.mo33021c(jeVar)) {
            z3 = true;
        }
        this.f5374d = z3;
        this.f5376f = iArr2;
        this.f5377g = i3;
        this.f5381k = oeVar;
        this.f5378h = xdVar;
        this.f5379i = kfVar;
        this.f5380j = ucVar2;
        this.f5373c = jeVar2;
        this.f5382l = eeVar;
    }

    /* renamed from: A */
    private static int m7202A(int i) {
        return (i >>> 20) & 255;
    }

    /* renamed from: B */
    private final int m7203B(int i) {
        return this.f5371a[i + 1];
    }

    /* renamed from: C */
    private static long m7204C(Object obj, long j) {
        return ((Long) C5187vf.m7585k(obj, j)).longValue();
    }

    /* renamed from: D */
    private final C5169ue m7205D(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        C5169ue ueVar = (C5169ue) this.f5372b[i3];
        if (ueVar != null) {
            return ueVar;
        }
        C5169ue b = C5118re.m7436a().mo32992b((Class) this.f5372b[i3 + 1]);
        this.f5372b[i3] = b;
        return b;
    }

    /* renamed from: E */
    private final Object m7206E(int i) {
        int i2 = i / 3;
        return this.f5372b[i2 + i2];
    }

    /* renamed from: F */
    private static Field m7207F(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    /* renamed from: G */
    private final void m7208G(Object obj, Object obj2, int i) {
        if (m7215k(obj2, i)) {
            long B = (long) (m7203B(i) & 1048575);
            Unsafe unsafe = f5370n;
            Object object = unsafe.getObject(obj2, B);
            if (object != null) {
                C5169ue D = m7205D(i);
                if (!m7215k(obj, i)) {
                    if (!m7218n(object)) {
                        unsafe.putObject(obj, B, object);
                    } else {
                        Object x = D.mo32900x();
                        D.mo32897e(x, object);
                        unsafe.putObject(obj, B, x);
                    }
                    m7210I(obj, i);
                    return;
                }
                Object object2 = unsafe.getObject(obj, B);
                if (!m7218n(object2)) {
                    Object x2 = D.mo32900x();
                    D.mo32897e(x2, object2);
                    unsafe.putObject(obj, B, x2);
                    object2 = x2;
                }
                D.mo32897e(object2, object);
                return;
            }
            int i2 = this.f5371a[i];
            String obj3 = obj2.toString();
            throw new IllegalStateException("Source subfield " + i2 + " is present but null: " + obj3);
        }
    }

    /* renamed from: H */
    private final void m7209H(Object obj, Object obj2, int i) {
        int i2 = this.f5371a[i];
        if (m7219o(obj2, i2, i)) {
            long B = (long) (m7203B(i) & 1048575);
            Unsafe unsafe = f5370n;
            Object object = unsafe.getObject(obj2, B);
            if (object != null) {
                C5169ue D = m7205D(i);
                if (!m7219o(obj, i2, i)) {
                    if (!m7218n(object)) {
                        unsafe.putObject(obj, B, object);
                    } else {
                        Object x = D.mo32900x();
                        D.mo32897e(x, object);
                        unsafe.putObject(obj, B, x);
                    }
                    m7211J(obj, i2, i);
                    return;
                }
                Object object2 = unsafe.getObject(obj, B);
                if (!m7218n(object2)) {
                    Object x2 = D.mo32900x();
                    D.mo32897e(x2, object2);
                    unsafe.putObject(obj, B, x2);
                    object2 = x2;
                }
                D.mo32897e(object2, object);
                return;
            }
            int i3 = this.f5371a[i];
            String obj3 = obj2.toString();
            throw new IllegalStateException("Source subfield " + i3 + " is present but null: " + obj3);
        }
    }

    /* renamed from: I */
    private final void m7210I(Object obj, int i) {
        int z = m7229z(i);
        long j = (long) (1048575 & z);
        if (j != 1048575) {
            C5187vf.m7596v(obj, j, (1 << (z >>> 20)) | C5187vf.m7582h(obj, j));
        }
    }

    /* renamed from: J */
    private final void m7211J(Object obj, int i, int i2) {
        C5187vf.m7596v(obj, (long) (m7229z(i2) & 1048575), i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:156:0x044c, code lost:
        r7 = r7 + 3;
        r5 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x029b, code lost:
        r13 = r11;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m7212h(java.lang.Object r17, com.google.android.gms.internal.cast.C4863cg r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            boolean r3 = r0.f5374d
            if (r3 != 0) goto L_0x045d
            int[] r3 = r0.f5371a
            int r3 = r3.length
            sun.misc.Unsafe r4 = f5370n
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r5
            r7 = 0
            r8 = 0
        L_0x0015:
            if (r7 >= r3) goto L_0x0453
            int r10 = r0.m7203B(r7)
            int[] r11 = r0.f5371a
            r12 = r11[r7]
            int r13 = m7202A(r10)
            r14 = 17
            r15 = 1
            if (r13 > r14) goto L_0x003b
            int r14 = r7 + 2
            r11 = r11[r14]
            r14 = r11 & r5
            if (r14 == r9) goto L_0x0036
            long r8 = (long) r14
            int r8 = r4.getInt(r1, r8)
            r9 = r14
        L_0x0036:
            int r11 = r11 >>> 20
            int r11 = r15 << r11
            goto L_0x003c
        L_0x003b:
            r11 = 0
        L_0x003c:
            r10 = r10 & r5
            long r5 = (long) r10
            switch(r13) {
                case 0: goto L_0x0440;
                case 1: goto L_0x0433;
                case 2: goto L_0x0426;
                case 3: goto L_0x0419;
                case 4: goto L_0x040c;
                case 5: goto L_0x03ff;
                case 6: goto L_0x03f2;
                case 7: goto L_0x03e5;
                case 8: goto L_0x03d7;
                case 9: goto L_0x03c5;
                case 10: goto L_0x03b5;
                case 11: goto L_0x03a7;
                case 12: goto L_0x0399;
                case 13: goto L_0x038b;
                case 14: goto L_0x037d;
                case 15: goto L_0x036f;
                case 16: goto L_0x0361;
                case 17: goto L_0x034f;
                case 18: goto L_0x033f;
                case 19: goto L_0x032f;
                case 20: goto L_0x031f;
                case 21: goto L_0x030f;
                case 22: goto L_0x02ff;
                case 23: goto L_0x02ef;
                case 24: goto L_0x02df;
                case 25: goto L_0x02cf;
                case 26: goto L_0x02c0;
                case 27: goto L_0x02ad;
                case 28: goto L_0x029e;
                case 29: goto L_0x028d;
                case 30: goto L_0x027e;
                case 31: goto L_0x026f;
                case 32: goto L_0x0260;
                case 33: goto L_0x0251;
                case 34: goto L_0x0242;
                case 35: goto L_0x0233;
                case 36: goto L_0x0224;
                case 37: goto L_0x0215;
                case 38: goto L_0x0206;
                case 39: goto L_0x01f7;
                case 40: goto L_0x01e8;
                case 41: goto L_0x01d9;
                case 42: goto L_0x01ca;
                case 43: goto L_0x01bb;
                case 44: goto L_0x01ac;
                case 45: goto L_0x019d;
                case 46: goto L_0x018e;
                case 47: goto L_0x017f;
                case 48: goto L_0x0170;
                case 49: goto L_0x015d;
                case 50: goto L_0x0154;
                case 51: goto L_0x0145;
                case 52: goto L_0x0136;
                case 53: goto L_0x0127;
                case 54: goto L_0x0118;
                case 55: goto L_0x0109;
                case 56: goto L_0x00fa;
                case 57: goto L_0x00eb;
                case 58: goto L_0x00dc;
                case 59: goto L_0x00cd;
                case 60: goto L_0x00ba;
                case 61: goto L_0x00aa;
                case 62: goto L_0x009c;
                case 63: goto L_0x008e;
                case 64: goto L_0x0080;
                case 65: goto L_0x0072;
                case 66: goto L_0x0064;
                case 67: goto L_0x0056;
                case 68: goto L_0x0044;
                default: goto L_0x0041;
            }
        L_0x0041:
            r13 = 0
            goto L_0x044c
        L_0x0044:
            boolean r10 = r0.m7219o(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            java.lang.Object r5 = r4.getObject(r1, r5)
            com.google.android.gms.internal.cast.ue r6 = r0.m7205D(r7)
            r2.mo32709t(r12, r5, r6)
            goto L_0x0041
        L_0x0056:
            boolean r10 = r0.m7219o(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            long r5 = m7204C(r1, r5)
            r2.mo32685D(r12, r5)
            goto L_0x0041
        L_0x0064:
            boolean r10 = r0.m7219o(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            int r5 = m7228y(r1, r5)
            r2.mo32707r(r12, r5)
            goto L_0x0041
        L_0x0072:
            boolean r10 = r0.m7219o(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            long r5 = m7204C(r1, r5)
            r2.mo32713x(r12, r5)
            goto L_0x0041
        L_0x0080:
            boolean r10 = r0.m7219o(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            int r5 = m7228y(r1, r5)
            r2.mo32687F(r12, r5)
            goto L_0x0041
        L_0x008e:
            boolean r10 = r0.m7219o(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            int r5 = m7228y(r1, r5)
            r2.mo32702m(r12, r5)
            goto L_0x0041
        L_0x009c:
            boolean r10 = r0.m7219o(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            int r5 = m7228y(r1, r5)
            r2.mo32704o(r12, r5)
            goto L_0x0041
        L_0x00aa:
            boolean r10 = r0.m7219o(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            java.lang.Object r5 = r4.getObject(r1, r5)
            com.google.android.gms.internal.cast.jc r5 = (com.google.android.gms.internal.cast.C4980jc) r5
            r2.mo32683B(r12, r5)
            goto L_0x0041
        L_0x00ba:
            boolean r10 = r0.m7219o(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            java.lang.Object r5 = r4.getObject(r1, r5)
            com.google.android.gms.internal.cast.ue r6 = r0.m7205D(r7)
            r2.mo32684C(r12, r5, r6)
            goto L_0x0041
        L_0x00cd:
            boolean r10 = r0.m7219o(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            java.lang.Object r5 = r4.getObject(r1, r5)
            m7221q(r12, r5, r2)
            goto L_0x0041
        L_0x00dc:
            boolean r10 = r0.m7219o(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            boolean r5 = m7220p(r1, r5)
            r2.mo32698i(r12, r5)
            goto L_0x0041
        L_0x00eb:
            boolean r10 = r0.m7219o(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            int r5 = m7228y(r1, r5)
            r2.mo32693d(r12, r5)
            goto L_0x0041
        L_0x00fa:
            boolean r10 = r0.m7219o(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            long r5 = m7204C(r1, r5)
            r2.mo32682A(r12, r5)
            goto L_0x0041
        L_0x0109:
            boolean r10 = r0.m7219o(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            int r5 = m7228y(r1, r5)
            r2.mo32705p(r12, r5)
            goto L_0x0041
        L_0x0118:
            boolean r10 = r0.m7219o(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            long r5 = m7204C(r1, r5)
            r2.mo32691b(r12, r5)
            goto L_0x0041
        L_0x0127:
            boolean r10 = r0.m7219o(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            long r5 = m7204C(r1, r5)
            r2.mo32696g(r12, r5)
            goto L_0x0041
        L_0x0136:
            boolean r10 = r0.m7219o(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            float r5 = m7225u(r1, r5)
            r2.mo32711v(r12, r5)
            goto L_0x0041
        L_0x0145:
            boolean r10 = r0.m7219o(r1, r12, r7)
            if (r10 == 0) goto L_0x0041
            double r5 = m7224t(r1, r5)
            r2.mo32712w(r12, r5)
            goto L_0x0041
        L_0x0154:
            java.lang.Object r5 = r4.getObject(r1, r5)
            r0.m7213i(r2, r12, r5, r7)
            goto L_0x0041
        L_0x015d:
            int[] r10 = r0.f5371a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.cast.ue r6 = r0.m7205D(r7)
            com.google.android.gms.internal.cast.C5203we.m7657m(r10, r5, r2, r6)
            goto L_0x0041
        L_0x0170:
            int[] r10 = r0.f5371a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.cast.C5203we.m7664t(r10, r5, r2, r15)
            goto L_0x0041
        L_0x017f:
            int[] r10 = r0.f5371a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.cast.C5203we.m7663s(r10, r5, r2, r15)
            goto L_0x0041
        L_0x018e:
            int[] r10 = r0.f5371a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.cast.C5203we.m7662r(r10, r5, r2, r15)
            goto L_0x0041
        L_0x019d:
            int[] r10 = r0.f5371a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.cast.C5203we.m7661q(r10, r5, r2, r15)
            goto L_0x0041
        L_0x01ac:
            int[] r10 = r0.f5371a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.cast.C5203we.m7653i(r10, r5, r2, r15)
            goto L_0x0041
        L_0x01bb:
            int[] r10 = r0.f5371a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.cast.C5203we.m7666v(r10, r5, r2, r15)
            goto L_0x0041
        L_0x01ca:
            int[] r10 = r0.f5371a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.cast.C5203we.m7650f(r10, r5, r2, r15)
            goto L_0x0041
        L_0x01d9:
            int[] r10 = r0.f5371a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.cast.C5203we.m7654j(r10, r5, r2, r15)
            goto L_0x0041
        L_0x01e8:
            int[] r10 = r0.f5371a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.cast.C5203we.m7655k(r10, r5, r2, r15)
            goto L_0x0041
        L_0x01f7:
            int[] r10 = r0.f5371a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.cast.C5203we.m7658n(r10, r5, r2, r15)
            goto L_0x0041
        L_0x0206:
            int[] r10 = r0.f5371a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.cast.C5203we.m7667w(r10, r5, r2, r15)
            goto L_0x0041
        L_0x0215:
            int[] r10 = r0.f5371a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.cast.C5203we.m7659o(r10, r5, r2, r15)
            goto L_0x0041
        L_0x0224:
            int[] r10 = r0.f5371a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.cast.C5203we.m7656l(r10, r5, r2, r15)
            goto L_0x0041
        L_0x0233:
            int[] r10 = r0.f5371a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.cast.C5203we.m7652h(r10, r5, r2, r15)
            goto L_0x0041
        L_0x0242:
            int[] r10 = r0.f5371a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r11 = 0
            com.google.android.gms.internal.cast.C5203we.m7664t(r10, r5, r2, r11)
            goto L_0x029b
        L_0x0251:
            r11 = 0
            int[] r10 = r0.f5371a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.cast.C5203we.m7663s(r10, r5, r2, r11)
            goto L_0x029b
        L_0x0260:
            r11 = 0
            int[] r10 = r0.f5371a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.cast.C5203we.m7662r(r10, r5, r2, r11)
            goto L_0x029b
        L_0x026f:
            r11 = 0
            int[] r10 = r0.f5371a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.cast.C5203we.m7661q(r10, r5, r2, r11)
            goto L_0x029b
        L_0x027e:
            r11 = 0
            int[] r10 = r0.f5371a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.cast.C5203we.m7653i(r10, r5, r2, r11)
            goto L_0x029b
        L_0x028d:
            r11 = 0
            int[] r10 = r0.f5371a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.cast.C5203we.m7666v(r10, r5, r2, r11)
        L_0x029b:
            r13 = r11
            goto L_0x044c
        L_0x029e:
            int[] r10 = r0.f5371a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.cast.C5203we.m7651g(r10, r5, r2)
            goto L_0x0041
        L_0x02ad:
            int[] r10 = r0.f5371a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.cast.ue r6 = r0.m7205D(r7)
            com.google.android.gms.internal.cast.C5203we.m7660p(r10, r5, r2, r6)
            goto L_0x0041
        L_0x02c0:
            int[] r10 = r0.f5371a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.cast.C5203we.m7665u(r10, r5, r2)
            goto L_0x0041
        L_0x02cf:
            int[] r10 = r0.f5371a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r13 = 0
            com.google.android.gms.internal.cast.C5203we.m7650f(r10, r5, r2, r13)
            goto L_0x044c
        L_0x02df:
            r13 = 0
            int[] r10 = r0.f5371a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.cast.C5203we.m7654j(r10, r5, r2, r13)
            goto L_0x044c
        L_0x02ef:
            r13 = 0
            int[] r10 = r0.f5371a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.cast.C5203we.m7655k(r10, r5, r2, r13)
            goto L_0x044c
        L_0x02ff:
            r13 = 0
            int[] r10 = r0.f5371a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.cast.C5203we.m7658n(r10, r5, r2, r13)
            goto L_0x044c
        L_0x030f:
            r13 = 0
            int[] r10 = r0.f5371a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.cast.C5203we.m7667w(r10, r5, r2, r13)
            goto L_0x044c
        L_0x031f:
            r13 = 0
            int[] r10 = r0.f5371a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.cast.C5203we.m7659o(r10, r5, r2, r13)
            goto L_0x044c
        L_0x032f:
            r13 = 0
            int[] r10 = r0.f5371a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.cast.C5203we.m7656l(r10, r5, r2, r13)
            goto L_0x044c
        L_0x033f:
            r13 = 0
            int[] r10 = r0.f5371a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.cast.C5203we.m7652h(r10, r5, r2, r13)
            goto L_0x044c
        L_0x034f:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            java.lang.Object r5 = r4.getObject(r1, r5)
            com.google.android.gms.internal.cast.ue r6 = r0.m7205D(r7)
            r2.mo32709t(r12, r5, r6)
            goto L_0x044c
        L_0x0361:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            long r5 = r4.getLong(r1, r5)
            r2.mo32685D(r12, r5)
            goto L_0x044c
        L_0x036f:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            int r5 = r4.getInt(r1, r5)
            r2.mo32707r(r12, r5)
            goto L_0x044c
        L_0x037d:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            long r5 = r4.getLong(r1, r5)
            r2.mo32713x(r12, r5)
            goto L_0x044c
        L_0x038b:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            int r5 = r4.getInt(r1, r5)
            r2.mo32687F(r12, r5)
            goto L_0x044c
        L_0x0399:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            int r5 = r4.getInt(r1, r5)
            r2.mo32702m(r12, r5)
            goto L_0x044c
        L_0x03a7:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            int r5 = r4.getInt(r1, r5)
            r2.mo32704o(r12, r5)
            goto L_0x044c
        L_0x03b5:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            java.lang.Object r5 = r4.getObject(r1, r5)
            com.google.android.gms.internal.cast.jc r5 = (com.google.android.gms.internal.cast.C4980jc) r5
            r2.mo32683B(r12, r5)
            goto L_0x044c
        L_0x03c5:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            java.lang.Object r5 = r4.getObject(r1, r5)
            com.google.android.gms.internal.cast.ue r6 = r0.m7205D(r7)
            r2.mo32684C(r12, r5, r6)
            goto L_0x044c
        L_0x03d7:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            java.lang.Object r5 = r4.getObject(r1, r5)
            m7221q(r12, r5, r2)
            goto L_0x044c
        L_0x03e5:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            boolean r5 = com.google.android.gms.internal.cast.C5187vf.m7571B(r1, r5)
            r2.mo32698i(r12, r5)
            goto L_0x044c
        L_0x03f2:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            int r5 = r4.getInt(r1, r5)
            r2.mo32693d(r12, r5)
            goto L_0x044c
        L_0x03ff:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            long r5 = r4.getLong(r1, r5)
            r2.mo32682A(r12, r5)
            goto L_0x044c
        L_0x040c:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            int r5 = r4.getInt(r1, r5)
            r2.mo32705p(r12, r5)
            goto L_0x044c
        L_0x0419:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            long r5 = r4.getLong(r1, r5)
            r2.mo32691b(r12, r5)
            goto L_0x044c
        L_0x0426:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            long r5 = r4.getLong(r1, r5)
            r2.mo32696g(r12, r5)
            goto L_0x044c
        L_0x0433:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            float r5 = com.google.android.gms.internal.cast.C5187vf.m7581g(r1, r5)
            r2.mo32711v(r12, r5)
            goto L_0x044c
        L_0x0440:
            r13 = 0
            r10 = r8 & r11
            if (r10 == 0) goto L_0x044c
            double r5 = com.google.android.gms.internal.cast.C5187vf.m7580f(r1, r5)
            r2.mo32712w(r12, r5)
        L_0x044c:
            int r7 = r7 + 3
            r5 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0015
        L_0x0453:
            com.google.android.gms.internal.cast.kf r3 = r0.f5379i
            java.lang.Object r1 = r3.mo32854c(r1)
            r3.mo32858g(r1, r2)
            return
        L_0x045d:
            com.google.android.gms.internal.cast.uc r2 = r0.f5380j
            r2.mo33019a(r1)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.C5033me.m7212h(java.lang.Object, com.google.android.gms.internal.cast.cg):void");
    }

    /* renamed from: i */
    private final void m7213i(C4863cg cgVar, int i, Object obj, int i2) {
        if (obj != null) {
            C4861ce ceVar = (C4861ce) m7206E(i2);
            throw null;
        }
    }

    /* renamed from: j */
    private final boolean m7214j(Object obj, Object obj2, int i) {
        if (m7215k(obj, i) == m7215k(obj2, i)) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private final boolean m7215k(Object obj, int i) {
        int z = m7229z(i);
        long j = (long) (z & 1048575);
        if (j == 1048575) {
            int B = m7203B(i);
            long j2 = (long) (B & 1048575);
            switch (m7202A(B)) {
                case 0:
                    if (Double.doubleToRawLongBits(C5187vf.m7580f(obj, j2)) != 0) {
                        return true;
                    }
                    return false;
                case 1:
                    if (Float.floatToRawIntBits(C5187vf.m7581g(obj, j2)) != 0) {
                        return true;
                    }
                    return false;
                case 2:
                    if (C5187vf.m7583i(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 3:
                    if (C5187vf.m7583i(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                    if (C5187vf.m7582h(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 5:
                    if (C5187vf.m7583i(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 6:
                    if (C5187vf.m7582h(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 7:
                    return C5187vf.m7571B(obj, j2);
                case 8:
                    Object k = C5187vf.m7585k(obj, j2);
                    if (k instanceof String) {
                        if (!((String) k).isEmpty()) {
                            return true;
                        }
                        return false;
                    } else if (!(k instanceof C4980jc)) {
                        throw new IllegalArgumentException();
                    } else if (!C4980jc.f5269c.equals(k)) {
                        return true;
                    } else {
                        return false;
                    }
                case 9:
                    if (C5187vf.m7585k(obj, j2) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    if (!C4980jc.f5269c.equals(C5187vf.m7585k(obj, j2))) {
                        return true;
                    }
                    return false;
                case 11:
                    if (C5187vf.m7582h(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 12:
                    if (C5187vf.m7582h(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (C5187vf.m7582h(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 14:
                    if (C5187vf.m7583i(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 15:
                    if (C5187vf.m7582h(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (C5187vf.m7583i(obj, j2) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (C5187vf.m7585k(obj, j2) != null) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalArgumentException();
            }
        } else if ((C5187vf.m7582h(obj, j) & (1 << (z >>> 20))) != 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: l */
    private final boolean m7216l(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m7215k(obj, i);
        }
        if ((i3 & i4) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private static boolean m7217m(Object obj, int i, C5169ue ueVar) {
        return ueVar.mo32899g(C5187vf.m7585k(obj, (long) (i & 1048575)));
    }

    /* renamed from: n */
    private static boolean m7218n(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof C4878dd) {
            return ((C4878dd) obj).mo32741p();
        }
        return true;
    }

    /* renamed from: o */
    private final boolean m7219o(Object obj, int i, int i2) {
        if (C5187vf.m7582h(obj, (long) (m7229z(i2) & 1048575)) == i) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    private static boolean m7220p(Object obj, long j) {
        return ((Boolean) C5187vf.m7585k(obj, j)).booleanValue();
    }

    /* renamed from: q */
    private static final void m7221q(int i, Object obj, C4863cg cgVar) {
        if (obj instanceof String) {
            cgVar.mo32688G(i, (String) obj);
        } else {
            cgVar.mo32683B(i, (C4980jc) obj);
        }
    }

    /* renamed from: r */
    static C5033me m7222r(Class cls, C4931ge geVar, C5067oe oeVar, C5219xd xdVar, C5000kf kfVar, C5167uc ucVar, C4897ee eeVar) {
        if (geVar instanceof C5152te) {
            return m7223s((C5152te) geVar, oeVar, xdVar, kfVar, ucVar, eeVar);
        }
        C4966if ifVar = (C4966if) geVar;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0378  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0388  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0391  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.android.gms.internal.cast.C5033me m7223s(com.google.android.gms.internal.cast.C5152te r34, com.google.android.gms.internal.cast.C5067oe r35, com.google.android.gms.internal.cast.C5219xd r36, com.google.android.gms.internal.cast.C5000kf r37, com.google.android.gms.internal.cast.C5167uc r38, com.google.android.gms.internal.cast.C4897ee r39) {
        /*
            int r0 = r34.mo32814x()
            r1 = 2
            r2 = 0
            if (r0 != r1) goto L_0x000a
            r10 = 1
            goto L_0x000b
        L_0x000a:
            r10 = r2
        L_0x000b:
            java.lang.String r0 = r34.mo33016a()
            int r1 = r0.length()
            char r4 = r0.charAt(r2)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L_0x0027
            r4 = 1
        L_0x001d:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0028
            r4 = r6
            goto L_0x001d
        L_0x0027:
            r6 = 1
        L_0x0028:
            int r4 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0047
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0034:
            int r9 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0044
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r8
            r6 = r6 | r4
            int r8 = r8 + 13
            r4 = r9
            goto L_0x0034
        L_0x0044:
            int r4 = r4 << r8
            r6 = r6 | r4
            r4 = r9
        L_0x0047:
            if (r6 != 0) goto L_0x0057
            int[] r6 = f5369m
            r8 = r2
            r9 = r8
            r11 = r9
            r12 = r11
            r14 = r12
            r16 = r14
            r13 = r6
            r6 = r16
            goto L_0x0166
        L_0x0057:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0076
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0063:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0073
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r8
            r4 = r4 | r6
            int r8 = r8 + 13
            r6 = r9
            goto L_0x0063
        L_0x0073:
            int r6 = r6 << r8
            r4 = r4 | r6
            r6 = r9
        L_0x0076:
            int r8 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0095
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0082:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x0092
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r6 = r6 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x0082
        L_0x0092:
            int r8 = r8 << r9
            r6 = r6 | r8
            r8 = r11
        L_0x0095:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x00b4
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a1:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00b1
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x00a1
        L_0x00b1:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00b4:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00d3
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00c0:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00d0
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00c0
        L_0x00d0:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00d3:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00f2
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00df:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x00ef
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00df
        L_0x00ef:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00f2:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0111
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00fe:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x010e
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00fe
        L_0x010e:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0111:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0132
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x011d:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x012e
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x011d
        L_0x012e:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0132:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x0155
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x013e:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r5) goto L_0x0150
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x013e
        L_0x0150:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0155:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int[] r13 = new int[r13]
            int r16 = r4 + r4
            int r16 = r16 + r6
            r6 = r4
            r4 = r15
            r33 = r12
            r12 = r9
            r9 = r33
        L_0x0166:
            sun.misc.Unsafe r15 = f5370n
            java.lang.Object[] r17 = r34.mo33017b()
            com.google.android.gms.internal.cast.je r18 = r34.zza()
            java.lang.Class r2 = r18.getClass()
            int r7 = r11 * 3
            int[] r7 = new int[r7]
            int r11 = r11 + r11
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r21 = r14 + r9
            r22 = r14
            r23 = r21
            r9 = 0
            r20 = 0
        L_0x0184:
            if (r4 >= r1) goto L_0x03cb
            int r24 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x01ac
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r3 = r24
            r24 = 13
        L_0x0194:
            int r26 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x01a6
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r24
            r4 = r4 | r3
            int r24 = r24 + 13
            r3 = r26
            goto L_0x0194
        L_0x01a6:
            int r3 = r3 << r24
            r4 = r4 | r3
            r3 = r26
            goto L_0x01ae
        L_0x01ac:
            r3 = r24
        L_0x01ae:
            int r24 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x01db
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r5 = r24
            r24 = 13
        L_0x01bc:
            int r27 = r5 + 1
            char r5 = r0.charAt(r5)
            r28 = r1
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r1) goto L_0x01d5
            r1 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r24
            r3 = r3 | r1
            int r24 = r24 + 13
            r5 = r27
            r1 = r28
            goto L_0x01bc
        L_0x01d5:
            int r1 = r5 << r24
            r3 = r3 | r1
            r1 = r27
            goto L_0x01df
        L_0x01db:
            r28 = r1
            r1 = r24
        L_0x01df:
            r5 = r3 & 255(0xff, float:3.57E-43)
            r24 = r14
            r14 = r3 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x01ed
            int r14 = r20 + 1
            r13[r20] = r9
            r20 = r14
        L_0x01ed:
            r14 = 51
            if (r5 < r14) goto L_0x0295
            int r14 = r1 + 1
            char r1 = r0.charAt(r1)
            r27 = r14
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r14) goto L_0x0223
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r14 = r27
            r27 = 13
        L_0x0204:
            int r31 = r14 + 1
            char r14 = r0.charAt(r14)
            r32 = r12
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r14 < r12) goto L_0x021d
            r12 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r27
            r1 = r1 | r12
            int r27 = r27 + 13
            r14 = r31
            r12 = r32
            goto L_0x0204
        L_0x021d:
            int r12 = r14 << r27
            r1 = r1 | r12
            r14 = r31
            goto L_0x0227
        L_0x0223:
            r32 = r12
            r14 = r27
        L_0x0227:
            int r12 = r5 + -51
            r27 = r14
            r14 = 9
            if (r12 == r14) goto L_0x0248
            r14 = 17
            if (r12 != r14) goto L_0x0234
            goto L_0x0248
        L_0x0234:
            r14 = 12
            if (r12 != r14) goto L_0x0257
            if (r10 != 0) goto L_0x0257
            int r12 = r9 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
            goto L_0x0255
        L_0x0248:
            int r12 = r9 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
        L_0x0255:
            r16 = r14
        L_0x0257:
            int r1 = r1 + r1
            r12 = r17[r1]
            boolean r14 = r12 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0261
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x0269
        L_0x0261:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = m7207F(r2, r12)
            r17[r1] = r12
        L_0x0269:
            r31 = r7
            r14 = r8
            long r7 = r15.objectFieldOffset(r12)
            int r7 = (int) r7
            int r1 = r1 + 1
            r8 = r17[r1]
            boolean r12 = r8 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x027c
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            goto L_0x0284
        L_0x027c:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = m7207F(r2, r8)
            r17[r1] = r8
        L_0x0284:
            r1 = r7
            long r7 = r15.objectFieldOffset(r8)
            int r7 = (int) r7
            r30 = r0
            r8 = r7
            r29 = r11
            r25 = 1
            r7 = r1
            r1 = 0
            goto L_0x0393
        L_0x0295:
            r31 = r7
            r14 = r8
            r32 = r12
            int r7 = r16 + 1
            r8 = r17[r16]
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = m7207F(r2, r8)
            r12 = 9
            if (r5 == r12) goto L_0x030d
            r12 = 17
            if (r5 != r12) goto L_0x02ad
            goto L_0x030d
        L_0x02ad:
            r12 = 27
            if (r5 == r12) goto L_0x02fd
            r12 = 49
            if (r5 != r12) goto L_0x02b6
            goto L_0x02fd
        L_0x02b6:
            r12 = 12
            if (r5 == r12) goto L_0x02ed
            r12 = 30
            if (r5 == r12) goto L_0x02ed
            r12 = 44
            if (r5 != r12) goto L_0x02c3
            goto L_0x02ed
        L_0x02c3:
            r12 = 50
            if (r5 != r12) goto L_0x02e3
            int r12 = r22 + 1
            r13[r22] = r9
            int r22 = r9 / 3
            int r22 = r22 + r22
            int r27 = r7 + 1
            r7 = r17[r7]
            r11[r22] = r7
            r7 = r3 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x02e6
            int r7 = r27 + 1
            int r22 = r22 + 1
            r27 = r17[r27]
            r11[r22] = r27
            r22 = r12
        L_0x02e3:
            r25 = 1
            goto L_0x031a
        L_0x02e6:
            r22 = r12
            r12 = r27
            r25 = 1
            goto L_0x031b
        L_0x02ed:
            if (r10 != 0) goto L_0x02e3
            int r12 = r9 / 3
            int r27 = r7 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r7 = r17[r7]
            r11[r12] = r7
            goto L_0x030a
        L_0x02fd:
            r25 = 1
            int r12 = r9 / 3
            int r27 = r7 + 1
            int r12 = r12 + r12
            int r12 = r12 + 1
            r7 = r17[r7]
            r11[r12] = r7
        L_0x030a:
            r12 = r27
            goto L_0x031b
        L_0x030d:
            r25 = 1
            int r12 = r9 / 3
            int r12 = r12 + r12
            int r12 = r12 + 1
            java.lang.Class r27 = r8.getType()
            r11[r12] = r27
        L_0x031a:
            r12 = r7
        L_0x031b:
            long r7 = r15.objectFieldOffset(r8)
            int r7 = (int) r7
            r8 = r3 & 4096(0x1000, float:5.74E-42)
            r27 = 1048575(0xfffff, float:1.469367E-39)
            r29 = r11
            r11 = 4096(0x1000, float:5.74E-42)
            if (r8 != r11) goto L_0x0378
            r8 = 17
            if (r5 > r8) goto L_0x0378
            int r8 = r1 + 1
            char r1 = r0.charAt(r1)
            r11 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r11) goto L_0x0354
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r26 = 13
        L_0x033e:
            int r27 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r11) goto L_0x0350
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r26
            r1 = r1 | r8
            int r26 = r26 + 13
            r8 = r27
            goto L_0x033e
        L_0x0350:
            int r8 = r8 << r26
            r1 = r1 | r8
            goto L_0x0356
        L_0x0354:
            r27 = r8
        L_0x0356:
            int r8 = r6 + r6
            int r26 = r1 / 32
            int r8 = r8 + r26
            r11 = r17[r8]
            r30 = r0
            boolean r0 = r11 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0367
            java.lang.reflect.Field r11 = (java.lang.reflect.Field) r11
            goto L_0x036f
        L_0x0367:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.reflect.Field r11 = m7207F(r2, r11)
            r17[r8] = r11
        L_0x036f:
            r0 = r12
            long r11 = r15.objectFieldOffset(r11)
            int r8 = (int) r11
            int r1 = r1 % 32
            goto L_0x0380
        L_0x0378:
            r30 = r0
            r0 = r12
            r8 = r27
            r27 = r1
            r1 = 0
        L_0x0380:
            r11 = 18
            if (r5 < r11) goto L_0x0391
            r11 = 49
            if (r5 > r11) goto L_0x0391
            int r11 = r23 + 1
            r13[r23] = r7
            r16 = r0
            r23 = r11
            goto L_0x0393
        L_0x0391:
            r16 = r0
        L_0x0393:
            int r0 = r9 + 1
            r31[r9] = r4
            int r4 = r0 + 1
            r9 = r3 & 512(0x200, float:7.175E-43)
            if (r9 == 0) goto L_0x03a0
            r9 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03a1
        L_0x03a0:
            r9 = 0
        L_0x03a1:
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x03a8
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03a9
        L_0x03a8:
            r3 = 0
        L_0x03a9:
            r3 = r3 | r9
            int r5 = r5 << 20
            r3 = r3 | r5
            r3 = r3 | r7
            r31[r0] = r3
            int r9 = r4 + 1
            int r0 = r1 << 20
            r0 = r0 | r8
            r31[r4] = r0
            r8 = r14
            r14 = r24
            r4 = r27
            r1 = r28
            r11 = r29
            r0 = r30
            r7 = r31
            r12 = r32
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0184
        L_0x03cb:
            r31 = r7
            r29 = r11
            r32 = r12
            r24 = r14
            r14 = r8
            com.google.android.gms.internal.cast.me r0 = new com.google.android.gms.internal.cast.me
            r4 = r0
            com.google.android.gms.internal.cast.je r9 = r34.zza()
            r11 = 0
            r1 = r29
            r20 = 0
            r5 = r31
            r6 = r1
            r7 = r14
            r8 = r32
            r12 = r13
            r13 = r24
            r14 = r21
            r15 = r35
            r16 = r36
            r17 = r37
            r18 = r38
            r19 = r39
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.C5033me.m7223s(com.google.android.gms.internal.cast.te, com.google.android.gms.internal.cast.oe, com.google.android.gms.internal.cast.xd, com.google.android.gms.internal.cast.kf, com.google.android.gms.internal.cast.uc, com.google.android.gms.internal.cast.ee):com.google.android.gms.internal.cast.me");
    }

    /* renamed from: t */
    private static double m7224t(Object obj, long j) {
        return ((Double) C5187vf.m7585k(obj, j)).doubleValue();
    }

    /* renamed from: u */
    private static float m7225u(Object obj, long j) {
        return ((Float) C5187vf.m7585k(obj, j)).floatValue();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0309, code lost:
        r4 = r4 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x030a, code lost:
        r4 = r4 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x030b, code lost:
        r6 = r6 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0349, code lost:
        r6 = r6 + r3;
        r12 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x037d, code lost:
        r6 = r6 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0488, code lost:
        r4 = r4 + (r9 + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0503, code lost:
        r4 = r4 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0504, code lost:
        r6 = r6 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x052d, code lost:
        r6 = r6 + (r9 + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x053b, code lost:
        r3 = r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x054a, code lost:
        r3 = r3 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x054e, code lost:
        r5 = r5 + 3;
        r4 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ee, code lost:
        r4 = r4 + (r9 + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x019b, code lost:
        r6 = r6 + (r9 + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01ab, code lost:
        r3 = r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01bb, code lost:
        r3 = r3 + 8;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m7226v(java.lang.Object r16) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            sun.misc.Unsafe r2 = f5370n
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r4
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x000c:
            int[] r9 = r0.f5371a
            int r9 = r9.length
            if (r5 >= r9) goto L_0x0555
            int r9 = r15.m7203B(r5)
            int[] r10 = r0.f5371a
            r11 = r10[r5]
            int r12 = m7202A(r9)
            r13 = 17
            r14 = 1
            if (r12 > r13) goto L_0x0035
            int r13 = r5 + 2
            r10 = r10[r13]
            r13 = r10 & r4
            int r10 = r10 >>> 20
            int r10 = r14 << r10
            if (r13 == r8) goto L_0x0036
            long r7 = (long) r13
            int r7 = r2.getInt(r1, r7)
            r8 = r13
            goto L_0x0036
        L_0x0035:
            r10 = 0
        L_0x0036:
            r9 = r9 & r4
            long r3 = (long) r9
            r9 = 63
            switch(r12) {
                case 0: goto L_0x053f;
                case 1: goto L_0x0530;
                case 2: goto L_0x051a;
                case 3: goto L_0x0506;
                case 4: goto L_0x04f0;
                case 5: goto L_0x04e4;
                case 6: goto L_0x04d8;
                case 7: goto L_0x04ca;
                case 8: goto L_0x049f;
                case 9: goto L_0x048c;
                case 10: goto L_0x046f;
                case 11: goto L_0x045a;
                case 12: goto L_0x0445;
                case 13: goto L_0x0438;
                case 14: goto L_0x042b;
                case 15: goto L_0x0411;
                case 16: goto L_0x03f7;
                case 17: goto L_0x03e3;
                case 18: goto L_0x03d5;
                case 19: goto L_0x03c9;
                case 20: goto L_0x03bd;
                case 21: goto L_0x03b1;
                case 22: goto L_0x03a5;
                case 23: goto L_0x0399;
                case 24: goto L_0x038d;
                case 25: goto L_0x0381;
                case 26: goto L_0x0373;
                case 27: goto L_0x0364;
                case 28: goto L_0x0359;
                case 29: goto L_0x034d;
                case 30: goto L_0x033e;
                case 31: goto L_0x0332;
                case 32: goto L_0x0326;
                case 33: goto L_0x031a;
                case 34: goto L_0x030e;
                case 35: goto L_0x02f5;
                case 36: goto L_0x02e0;
                case 37: goto L_0x02cb;
                case 38: goto L_0x02b6;
                case 39: goto L_0x02a1;
                case 40: goto L_0x028c;
                case 41: goto L_0x0276;
                case 42: goto L_0x0260;
                case 43: goto L_0x024a;
                case 44: goto L_0x0234;
                case 45: goto L_0x021e;
                case 46: goto L_0x0208;
                case 47: goto L_0x01f2;
                case 48: goto L_0x01dc;
                case 49: goto L_0x01cc;
                case 50: goto L_0x01bf;
                case 51: goto L_0x01af;
                case 52: goto L_0x019f;
                case 53: goto L_0x0187;
                case 54: goto L_0x0172;
                case 55: goto L_0x015c;
                case 56: goto L_0x014f;
                case 57: goto L_0x0142;
                case 58: goto L_0x0133;
                case 59: goto L_0x0106;
                case 60: goto L_0x00f2;
                case 61: goto L_0x00d4;
                case 62: goto L_0x00be;
                case 63: goto L_0x00a8;
                case 64: goto L_0x009a;
                case 65: goto L_0x008c;
                case 66: goto L_0x0071;
                case 67: goto L_0x0055;
                case 68: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x037e
        L_0x003f:
            boolean r9 = r15.m7219o(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.cast.je r3 = (com.google.android.gms.internal.cast.C4982je) r3
            com.google.android.gms.internal.cast.ue r4 = r15.m7205D(r5)
            int r3 = com.google.android.gms.internal.cast.C5099qc.m7398y(r11, r3, r4)
            goto L_0x037d
        L_0x0055:
            boolean r10 = r15.m7219o(r1, r11, r5)
            if (r10 == 0) goto L_0x037e
            long r3 = m7204C(r1, r3)
            int r10 = r11 << 3
            int r10 = com.google.android.gms.internal.cast.C5099qc.m7393a(r10)
            long r11 = r3 + r3
            long r3 = r3 >> r9
            long r3 = r3 ^ r11
            int r3 = com.google.android.gms.internal.cast.C5099qc.m7394b(r3)
            int r10 = r10 + r3
            int r6 = r6 + r10
            goto L_0x037e
        L_0x0071:
            boolean r9 = r15.m7219o(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            int r3 = m7228y(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
            int r9 = r3 + r3
            int r3 = r3 >> 31
            r3 = r3 ^ r9
            int r3 = com.google.android.gms.internal.cast.C5099qc.m7393a(r3)
            goto L_0x030a
        L_0x008c:
            boolean r3 = r15.m7219o(r1, r11, r5)
            if (r3 == 0) goto L_0x037e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.cast.C5099qc.m7393a(r3)
            goto L_0x01bb
        L_0x009a:
            boolean r3 = r15.m7219o(r1, r11, r5)
            if (r3 == 0) goto L_0x037e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.cast.C5099qc.m7393a(r3)
            goto L_0x01ab
        L_0x00a8:
            boolean r9 = r15.m7219o(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            int r3 = m7228y(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
            int r3 = com.google.android.gms.internal.cast.C5099qc.m7399z(r3)
            goto L_0x030a
        L_0x00be:
            boolean r9 = r15.m7219o(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            int r3 = m7228y(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
            int r3 = com.google.android.gms.internal.cast.C5099qc.m7393a(r3)
            goto L_0x030a
        L_0x00d4:
            boolean r9 = r15.m7219o(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.cast.jc r3 = (com.google.android.gms.internal.cast.C4980jc) r3
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
            int r3 = r3.mo32730j()
            int r9 = com.google.android.gms.internal.cast.C5099qc.m7393a(r3)
        L_0x00ee:
            int r9 = r9 + r3
            int r4 = r4 + r9
            goto L_0x030b
        L_0x00f2:
            boolean r9 = r15.m7219o(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.cast.ue r4 = r15.m7205D(r5)
            int r3 = com.google.android.gms.internal.cast.C5203we.m7633O(r11, r3, r4)
            goto L_0x037d
        L_0x0106:
            boolean r9 = r15.m7219o(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.cast.C4980jc
            if (r4 == 0) goto L_0x0125
            com.google.android.gms.internal.cast.jc r3 = (com.google.android.gms.internal.cast.C4980jc) r3
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
            int r3 = r3.mo32730j()
            int r9 = com.google.android.gms.internal.cast.C5099qc.m7393a(r3)
            goto L_0x00ee
        L_0x0125:
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
            int r3 = com.google.android.gms.internal.cast.C5099qc.m7391C(r3)
            goto L_0x030a
        L_0x0133:
            boolean r3 = r15.m7219o(r1, r11, r5)
            if (r3 == 0) goto L_0x037e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.cast.C5099qc.m7393a(r3)
            int r3 = r3 + r14
            goto L_0x037d
        L_0x0142:
            boolean r3 = r15.m7219o(r1, r11, r5)
            if (r3 == 0) goto L_0x037e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.cast.C5099qc.m7393a(r3)
            goto L_0x01ab
        L_0x014f:
            boolean r3 = r15.m7219o(r1, r11, r5)
            if (r3 == 0) goto L_0x037e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.cast.C5099qc.m7393a(r3)
            goto L_0x01bb
        L_0x015c:
            boolean r9 = r15.m7219o(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            int r3 = m7228y(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
            int r3 = com.google.android.gms.internal.cast.C5099qc.m7399z(r3)
            goto L_0x030a
        L_0x0172:
            boolean r9 = r15.m7219o(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            long r3 = m7204C(r1, r3)
            int r9 = r11 << 3
            int r9 = com.google.android.gms.internal.cast.C5099qc.m7393a(r9)
            int r3 = com.google.android.gms.internal.cast.C5099qc.m7394b(r3)
            goto L_0x019b
        L_0x0187:
            boolean r9 = r15.m7219o(r1, r11, r5)
            if (r9 == 0) goto L_0x037e
            long r3 = m7204C(r1, r3)
            int r9 = r11 << 3
            int r9 = com.google.android.gms.internal.cast.C5099qc.m7393a(r9)
            int r3 = com.google.android.gms.internal.cast.C5099qc.m7394b(r3)
        L_0x019b:
            int r9 = r9 + r3
            int r6 = r6 + r9
            goto L_0x037e
        L_0x019f:
            boolean r3 = r15.m7219o(r1, r11, r5)
            if (r3 == 0) goto L_0x037e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.cast.C5099qc.m7393a(r3)
        L_0x01ab:
            int r3 = r3 + 4
            goto L_0x037d
        L_0x01af:
            boolean r3 = r15.m7219o(r1, r11, r5)
            if (r3 == 0) goto L_0x037e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.cast.C5099qc.m7393a(r3)
        L_0x01bb:
            int r3 = r3 + 8
            goto L_0x037d
        L_0x01bf:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.lang.Object r4 = r15.m7206E(r5)
            com.google.android.gms.internal.cast.C4897ee.m6956a(r11, r3, r4)
            goto L_0x037e
        L_0x01cc:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.cast.ue r4 = r15.m7205D(r5)
            int r3 = com.google.android.gms.internal.cast.C5203we.m7628J(r11, r3, r4)
            goto L_0x037d
        L_0x01dc:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.cast.C5203we.m7638T(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7392D(r11)
            int r9 = com.google.android.gms.internal.cast.C5099qc.m7393a(r3)
            goto L_0x0309
        L_0x01f2:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.cast.C5203we.m7636R(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7392D(r11)
            int r9 = com.google.android.gms.internal.cast.C5099qc.m7393a(r3)
            goto L_0x0309
        L_0x0208:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.cast.C5203we.m7627I(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7392D(r11)
            int r9 = com.google.android.gms.internal.cast.C5099qc.m7393a(r3)
            goto L_0x0309
        L_0x021e:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.cast.C5203we.m7625G(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7392D(r11)
            int r9 = com.google.android.gms.internal.cast.C5099qc.m7393a(r3)
            goto L_0x0309
        L_0x0234:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.cast.C5203we.m7623E(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7392D(r11)
            int r9 = com.google.android.gms.internal.cast.C5099qc.m7393a(r3)
            goto L_0x0309
        L_0x024a:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.cast.C5203we.m7641W(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7392D(r11)
            int r9 = com.google.android.gms.internal.cast.C5099qc.m7393a(r3)
            goto L_0x0309
        L_0x0260:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.cast.C5203we.m7620B(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7392D(r11)
            int r9 = com.google.android.gms.internal.cast.C5099qc.m7393a(r3)
            goto L_0x0309
        L_0x0276:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.cast.C5203we.m7625G(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7392D(r11)
            int r9 = com.google.android.gms.internal.cast.C5099qc.m7393a(r3)
            goto L_0x0309
        L_0x028c:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.cast.C5203we.m7627I(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7392D(r11)
            int r9 = com.google.android.gms.internal.cast.C5099qc.m7393a(r3)
            goto L_0x0309
        L_0x02a1:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.cast.C5203we.m7630L(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7392D(r11)
            int r9 = com.google.android.gms.internal.cast.C5099qc.m7393a(r3)
            goto L_0x0309
        L_0x02b6:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.cast.C5203we.m7643Y(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7392D(r11)
            int r9 = com.google.android.gms.internal.cast.C5099qc.m7393a(r3)
            goto L_0x0309
        L_0x02cb:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.cast.C5203we.m7632N(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7392D(r11)
            int r9 = com.google.android.gms.internal.cast.C5099qc.m7393a(r3)
            goto L_0x0309
        L_0x02e0:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.cast.C5203we.m7625G(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7392D(r11)
            int r9 = com.google.android.gms.internal.cast.C5099qc.m7393a(r3)
            goto L_0x0309
        L_0x02f5:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.cast.C5203we.m7627I(r3)
            if (r3 <= 0) goto L_0x037e
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7392D(r11)
            int r9 = com.google.android.gms.internal.cast.C5099qc.m7393a(r3)
        L_0x0309:
            int r4 = r4 + r9
        L_0x030a:
            int r4 = r4 + r3
        L_0x030b:
            int r6 = r6 + r4
            goto L_0x037e
        L_0x030e:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            r9 = 0
            int r3 = com.google.android.gms.internal.cast.C5203we.m7637S(r11, r3, r9)
            goto L_0x0349
        L_0x031a:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.cast.C5203we.m7635Q(r11, r3, r9)
            goto L_0x0349
        L_0x0326:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.cast.C5203we.m7626H(r11, r3, r9)
            goto L_0x0349
        L_0x0332:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.cast.C5203we.m7624F(r11, r3, r9)
            goto L_0x0349
        L_0x033e:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.cast.C5203we.m7622D(r11, r3, r9)
        L_0x0349:
            int r6 = r6 + r3
            r12 = r9
            goto L_0x054e
        L_0x034d:
            r9 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.cast.C5203we.m7640V(r11, r3, r9)
            goto L_0x037d
        L_0x0359:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.cast.C5203we.m7621C(r11, r3)
            goto L_0x037d
        L_0x0364:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.cast.ue r4 = r15.m7205D(r5)
            int r3 = com.google.android.gms.internal.cast.C5203we.m7634P(r11, r3, r4)
            goto L_0x037d
        L_0x0373:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.cast.C5203we.m7639U(r11, r3)
        L_0x037d:
            int r6 = r6 + r3
        L_0x037e:
            r12 = 0
            goto L_0x054e
        L_0x0381:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            r12 = 0
            int r3 = com.google.android.gms.internal.cast.C5203we.m7619A(r11, r3, r12)
            goto L_0x03e0
        L_0x038d:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.cast.C5203we.m7624F(r11, r3, r12)
            goto L_0x03e0
        L_0x0399:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.cast.C5203we.m7626H(r11, r3, r12)
            goto L_0x03e0
        L_0x03a5:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.cast.C5203we.m7629K(r11, r3, r12)
            goto L_0x03e0
        L_0x03b1:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.cast.C5203we.m7642X(r11, r3, r12)
            goto L_0x03e0
        L_0x03bd:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.cast.C5203we.m7631M(r11, r3, r12)
            goto L_0x03e0
        L_0x03c9:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.cast.C5203we.m7624F(r11, r3, r12)
            goto L_0x03e0
        L_0x03d5:
            r12 = 0
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.android.gms.internal.cast.C5203we.m7626H(r11, r3, r12)
        L_0x03e0:
            int r6 = r6 + r3
            goto L_0x054e
        L_0x03e3:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.cast.je r3 = (com.google.android.gms.internal.cast.C4982je) r3
            com.google.android.gms.internal.cast.ue r4 = r15.m7205D(r5)
            int r3 = com.google.android.gms.internal.cast.C5099qc.m7398y(r11, r3, r4)
            goto L_0x03e0
        L_0x03f7:
            r12 = 0
            r10 = r10 & r7
            if (r10 == 0) goto L_0x054e
            long r3 = r2.getLong(r1, r3)
            int r10 = r11 << 3
            int r10 = com.google.android.gms.internal.cast.C5099qc.m7393a(r10)
            long r13 = r3 + r3
            long r3 = r3 >> r9
            long r3 = r3 ^ r13
            int r3 = com.google.android.gms.internal.cast.C5099qc.m7394b(r3)
            int r10 = r10 + r3
            int r6 = r6 + r10
            goto L_0x054e
        L_0x0411:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
            int r9 = r3 + r3
            int r3 = r3 >> 31
            r3 = r3 ^ r9
            int r3 = com.google.android.gms.internal.cast.C5099qc.m7393a(r3)
            goto L_0x0503
        L_0x042b:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.cast.C5099qc.m7393a(r3)
            goto L_0x054a
        L_0x0438:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.cast.C5099qc.m7393a(r3)
            goto L_0x053b
        L_0x0445:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
            int r3 = com.google.android.gms.internal.cast.C5099qc.m7399z(r3)
            goto L_0x0503
        L_0x045a:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
            int r3 = com.google.android.gms.internal.cast.C5099qc.m7393a(r3)
            goto L_0x0503
        L_0x046f:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.cast.jc r3 = (com.google.android.gms.internal.cast.C4980jc) r3
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
            int r3 = r3.mo32730j()
            int r9 = com.google.android.gms.internal.cast.C5099qc.m7393a(r3)
        L_0x0488:
            int r9 = r9 + r3
            int r4 = r4 + r9
            goto L_0x0504
        L_0x048c:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.android.gms.internal.cast.ue r4 = r15.m7205D(r5)
            int r3 = com.google.android.gms.internal.cast.C5203we.m7633O(r11, r3, r4)
            goto L_0x03e0
        L_0x049f:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof com.google.android.gms.internal.cast.C4980jc
            if (r4 == 0) goto L_0x04bd
            com.google.android.gms.internal.cast.jc r3 = (com.google.android.gms.internal.cast.C4980jc) r3
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
            int r3 = r3.mo32730j()
            int r9 = com.google.android.gms.internal.cast.C5099qc.m7393a(r3)
            goto L_0x0488
        L_0x04bd:
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
            int r3 = com.google.android.gms.internal.cast.C5099qc.m7391C(r3)
            goto L_0x0503
        L_0x04ca:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.cast.C5099qc.m7393a(r3)
            int r3 = r3 + r14
            goto L_0x03e0
        L_0x04d8:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.cast.C5099qc.m7393a(r3)
            goto L_0x053b
        L_0x04e4:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.cast.C5099qc.m7393a(r3)
            goto L_0x054a
        L_0x04f0:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
            int r3 = com.google.android.gms.internal.cast.C5099qc.m7399z(r3)
        L_0x0503:
            int r4 = r4 + r3
        L_0x0504:
            int r6 = r6 + r4
            goto L_0x054e
        L_0x0506:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            long r3 = r2.getLong(r1, r3)
            int r9 = r11 << 3
            int r9 = com.google.android.gms.internal.cast.C5099qc.m7393a(r9)
            int r3 = com.google.android.gms.internal.cast.C5099qc.m7394b(r3)
            goto L_0x052d
        L_0x051a:
            r12 = 0
            r9 = r7 & r10
            if (r9 == 0) goto L_0x054e
            long r3 = r2.getLong(r1, r3)
            int r9 = r11 << 3
            int r9 = com.google.android.gms.internal.cast.C5099qc.m7393a(r9)
            int r3 = com.google.android.gms.internal.cast.C5099qc.m7394b(r3)
        L_0x052d:
            int r9 = r9 + r3
            int r6 = r6 + r9
            goto L_0x054e
        L_0x0530:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.cast.C5099qc.m7393a(r3)
        L_0x053b:
            int r3 = r3 + 4
            goto L_0x03e0
        L_0x053f:
            r12 = 0
            r3 = r7 & r10
            if (r3 == 0) goto L_0x054e
            int r3 = r11 << 3
            int r3 = com.google.android.gms.internal.cast.C5099qc.m7393a(r3)
        L_0x054a:
            int r3 = r3 + 8
            goto L_0x03e0
        L_0x054e:
            int r5 = r5 + 3
            r4 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000c
        L_0x0555:
            com.google.android.gms.internal.cast.kf r2 = r0.f5379i
            java.lang.Object r3 = r2.mo32854c(r1)
            int r2 = r2.mo32852a(r3)
            int r6 = r6 + r2
            boolean r2 = r0.f5374d
            if (r2 != 0) goto L_0x0565
            return r6
        L_0x0565:
            com.google.android.gms.internal.cast.uc r2 = r0.f5380j
            r2.mo33019a(r1)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.C5033me.m7226v(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02fc, code lost:
        r5 = r5 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0474, code lost:
        r5 = r5 + (r6 + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x04c4, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04f6, code lost:
        r5 = r5 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04f7, code lost:
        r3 = r3 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0522, code lost:
        r3 = r3 + (r6 + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0531, code lost:
        r4 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0541, code lost:
        r4 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0545, code lost:
        r2 = r2 + 3;
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m7227w(java.lang.Object r12) {
        /*
            r11 = this;
            sun.misc.Unsafe r0 = f5370n
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x0005:
            int[] r4 = r11.f5371a
            int r4 = r4.length
            if (r2 >= r4) goto L_0x0549
            int r4 = r11.m7203B(r2)
            int r5 = m7202A(r4)
            int[] r6 = r11.f5371a
            r6 = r6[r2]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            long r7 = (long) r4
            com.google.android.gms.internal.cast.zc r4 = com.google.android.gms.internal.cast.C5252zc.DOUBLE_LIST_PACKED
            int r4 = r4.zza()
            if (r5 < r4) goto L_0x0031
            com.google.android.gms.internal.cast.zc r4 = com.google.android.gms.internal.cast.C5252zc.SINT64_LIST_PACKED
            int r4 = r4.zza()
            if (r5 > r4) goto L_0x0031
            int[] r4 = r11.f5371a
            int r9 = r2 + 2
            r4 = r4[r9]
        L_0x0031:
            r4 = 63
            switch(r5) {
                case 0: goto L_0x0535;
                case 1: goto L_0x0525;
                case 2: goto L_0x050e;
                case 3: goto L_0x04f9;
                case 4: goto L_0x04e2;
                case 5: goto L_0x04d5;
                case 6: goto L_0x04c8;
                case 7: goto L_0x04b8;
                case 8: goto L_0x048c;
                case 9: goto L_0x0478;
                case 10: goto L_0x045a;
                case 11: goto L_0x0444;
                case 12: goto L_0x042e;
                case 13: goto L_0x0420;
                case 14: goto L_0x0412;
                case 15: goto L_0x03f7;
                case 16: goto L_0x03dc;
                case 17: goto L_0x03c7;
                case 18: goto L_0x03ba;
                case 19: goto L_0x03af;
                case 20: goto L_0x03a4;
                case 21: goto L_0x0399;
                case 22: goto L_0x038e;
                case 23: goto L_0x0383;
                case 24: goto L_0x0378;
                case 25: goto L_0x036d;
                case 26: goto L_0x0362;
                case 27: goto L_0x0353;
                case 28: goto L_0x0347;
                case 29: goto L_0x033b;
                case 30: goto L_0x032f;
                case 31: goto L_0x0323;
                case 32: goto L_0x0317;
                case 33: goto L_0x030b;
                case 34: goto L_0x02ff;
                case 35: goto L_0x02e8;
                case 36: goto L_0x02d3;
                case 37: goto L_0x02be;
                case 38: goto L_0x02a9;
                case 39: goto L_0x0294;
                case 40: goto L_0x027f;
                case 41: goto L_0x0269;
                case 42: goto L_0x0253;
                case 43: goto L_0x023d;
                case 44: goto L_0x0227;
                case 45: goto L_0x0211;
                case 46: goto L_0x01fb;
                case 47: goto L_0x01e5;
                case 48: goto L_0x01cf;
                case 49: goto L_0x01bf;
                case 50: goto L_0x01b2;
                case 51: goto L_0x01a4;
                case 52: goto L_0x0196;
                case 53: goto L_0x0180;
                case 54: goto L_0x016a;
                case 55: goto L_0x0154;
                case 56: goto L_0x0146;
                case 57: goto L_0x0138;
                case 58: goto L_0x012a;
                case 59: goto L_0x00fc;
                case 60: goto L_0x00e8;
                case 61: goto L_0x00cc;
                case 62: goto L_0x00b6;
                case 63: goto L_0x00a0;
                case 64: goto L_0x0092;
                case 65: goto L_0x0084;
                case 66: goto L_0x0069;
                case 67: goto L_0x004e;
                case 68: goto L_0x0038;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x0545
        L_0x0038:
            boolean r4 = r11.m7219o(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.cast.C5187vf.m7585k(r12, r7)
            com.google.android.gms.internal.cast.je r4 = (com.google.android.gms.internal.cast.C4982je) r4
            com.google.android.gms.internal.cast.ue r5 = r11.m7205D(r2)
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7398y(r6, r4, r5)
            goto L_0x03c4
        L_0x004e:
            boolean r5 = r11.m7219o(r12, r6, r2)
            if (r5 == 0) goto L_0x0545
            long r7 = m7204C(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.cast.C5099qc.m7393a(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7394b(r6)
            goto L_0x04f6
        L_0x0069:
            boolean r4 = r11.m7219o(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m7228y(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.cast.C5099qc.m7393a(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
            goto L_0x04f6
        L_0x0084:
            boolean r4 = r11.m7219o(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
            goto L_0x0541
        L_0x0092:
            boolean r4 = r11.m7219o(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
            goto L_0x0531
        L_0x00a0:
            boolean r4 = r11.m7219o(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m7228y(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.cast.C5099qc.m7393a(r5)
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7399z(r4)
            goto L_0x04f6
        L_0x00b6:
            boolean r4 = r11.m7219o(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m7228y(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.cast.C5099qc.m7393a(r5)
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
            goto L_0x04f6
        L_0x00cc:
            boolean r4 = r11.m7219o(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.cast.C5187vf.m7585k(r12, r7)
            com.google.android.gms.internal.cast.jc r4 = (com.google.android.gms.internal.cast.C4980jc) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.cast.C5099qc.m7393a(r5)
            int r4 = r4.mo32730j()
            int r6 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
            goto L_0x0474
        L_0x00e8:
            boolean r4 = r11.m7219o(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.cast.C5187vf.m7585k(r12, r7)
            com.google.android.gms.internal.cast.ue r5 = r11.m7205D(r2)
            int r4 = com.google.android.gms.internal.cast.C5203we.m7633O(r6, r4, r5)
            goto L_0x03c4
        L_0x00fc:
            boolean r4 = r11.m7219o(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.cast.C5187vf.m7585k(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.cast.C4980jc
            if (r5 == 0) goto L_0x011c
            com.google.android.gms.internal.cast.jc r4 = (com.google.android.gms.internal.cast.C4980jc) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.cast.C5099qc.m7393a(r5)
            int r4 = r4.mo32730j()
            int r6 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
            goto L_0x0474
        L_0x011c:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.cast.C5099qc.m7393a(r5)
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7391C(r4)
            goto L_0x04f6
        L_0x012a:
            boolean r4 = r11.m7219o(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
            goto L_0x04c4
        L_0x0138:
            boolean r4 = r11.m7219o(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
            goto L_0x0531
        L_0x0146:
            boolean r4 = r11.m7219o(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
            goto L_0x0541
        L_0x0154:
            boolean r4 = r11.m7219o(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m7228y(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.cast.C5099qc.m7393a(r5)
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7399z(r4)
            goto L_0x04f6
        L_0x016a:
            boolean r4 = r11.m7219o(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = m7204C(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.cast.C5099qc.m7393a(r6)
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7394b(r4)
            goto L_0x0522
        L_0x0180:
            boolean r4 = r11.m7219o(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = m7204C(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.cast.C5099qc.m7393a(r6)
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7394b(r4)
            goto L_0x0522
        L_0x0196:
            boolean r4 = r11.m7219o(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
            goto L_0x0531
        L_0x01a4:
            boolean r4 = r11.m7219o(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
            goto L_0x0541
        L_0x01b2:
            java.lang.Object r4 = com.google.android.gms.internal.cast.C5187vf.m7585k(r12, r7)
            java.lang.Object r5 = r11.m7206E(r2)
            com.google.android.gms.internal.cast.C4897ee.m6956a(r6, r4, r5)
            goto L_0x0545
        L_0x01bf:
            java.lang.Object r4 = com.google.android.gms.internal.cast.C5187vf.m7585k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.cast.ue r5 = r11.m7205D(r2)
            int r4 = com.google.android.gms.internal.cast.C5203we.m7628J(r6, r4, r5)
            goto L_0x03c4
        L_0x01cf:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.cast.C5203we.m7638T(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.cast.C5099qc.m7392D(r6)
            int r6 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
            goto L_0x02fc
        L_0x01e5:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.cast.C5203we.m7636R(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.cast.C5099qc.m7392D(r6)
            int r6 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
            goto L_0x02fc
        L_0x01fb:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.cast.C5203we.m7627I(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.cast.C5099qc.m7392D(r6)
            int r6 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
            goto L_0x02fc
        L_0x0211:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.cast.C5203we.m7625G(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.cast.C5099qc.m7392D(r6)
            int r6 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
            goto L_0x02fc
        L_0x0227:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.cast.C5203we.m7623E(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.cast.C5099qc.m7392D(r6)
            int r6 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
            goto L_0x02fc
        L_0x023d:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.cast.C5203we.m7641W(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.cast.C5099qc.m7392D(r6)
            int r6 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
            goto L_0x02fc
        L_0x0253:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.cast.C5203we.m7620B(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.cast.C5099qc.m7392D(r6)
            int r6 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
            goto L_0x02fc
        L_0x0269:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.cast.C5203we.m7625G(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.cast.C5099qc.m7392D(r6)
            int r6 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
            goto L_0x02fc
        L_0x027f:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.cast.C5203we.m7627I(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.cast.C5099qc.m7392D(r6)
            int r6 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
            goto L_0x02fc
        L_0x0294:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.cast.C5203we.m7630L(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.cast.C5099qc.m7392D(r6)
            int r6 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
            goto L_0x02fc
        L_0x02a9:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.cast.C5203we.m7643Y(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.cast.C5099qc.m7392D(r6)
            int r6 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
            goto L_0x02fc
        L_0x02be:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.cast.C5203we.m7632N(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.cast.C5099qc.m7392D(r6)
            int r6 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
            goto L_0x02fc
        L_0x02d3:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.cast.C5203we.m7625G(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.cast.C5099qc.m7392D(r6)
            int r6 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
            goto L_0x02fc
        L_0x02e8:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.cast.C5203we.m7627I(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.cast.C5099qc.m7392D(r6)
            int r6 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
        L_0x02fc:
            int r5 = r5 + r6
            goto L_0x04f6
        L_0x02ff:
            java.lang.Object r4 = com.google.android.gms.internal.cast.C5187vf.m7585k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.cast.C5203we.m7637S(r6, r4, r1)
            goto L_0x03c4
        L_0x030b:
            java.lang.Object r4 = com.google.android.gms.internal.cast.C5187vf.m7585k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.cast.C5203we.m7635Q(r6, r4, r1)
            goto L_0x03c4
        L_0x0317:
            java.lang.Object r4 = com.google.android.gms.internal.cast.C5187vf.m7585k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.cast.C5203we.m7626H(r6, r4, r1)
            goto L_0x03c4
        L_0x0323:
            java.lang.Object r4 = com.google.android.gms.internal.cast.C5187vf.m7585k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.cast.C5203we.m7624F(r6, r4, r1)
            goto L_0x03c4
        L_0x032f:
            java.lang.Object r4 = com.google.android.gms.internal.cast.C5187vf.m7585k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.cast.C5203we.m7622D(r6, r4, r1)
            goto L_0x03c4
        L_0x033b:
            java.lang.Object r4 = com.google.android.gms.internal.cast.C5187vf.m7585k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.cast.C5203we.m7640V(r6, r4, r1)
            goto L_0x03c4
        L_0x0347:
            java.lang.Object r4 = com.google.android.gms.internal.cast.C5187vf.m7585k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.cast.C5203we.m7621C(r6, r4)
            goto L_0x03c4
        L_0x0353:
            java.lang.Object r4 = com.google.android.gms.internal.cast.C5187vf.m7585k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.cast.ue r5 = r11.m7205D(r2)
            int r4 = com.google.android.gms.internal.cast.C5203we.m7634P(r6, r4, r5)
            goto L_0x03c4
        L_0x0362:
            java.lang.Object r4 = com.google.android.gms.internal.cast.C5187vf.m7585k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.cast.C5203we.m7639U(r6, r4)
            goto L_0x03c4
        L_0x036d:
            java.lang.Object r4 = com.google.android.gms.internal.cast.C5187vf.m7585k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.cast.C5203we.m7619A(r6, r4, r1)
            goto L_0x03c4
        L_0x0378:
            java.lang.Object r4 = com.google.android.gms.internal.cast.C5187vf.m7585k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.cast.C5203we.m7624F(r6, r4, r1)
            goto L_0x03c4
        L_0x0383:
            java.lang.Object r4 = com.google.android.gms.internal.cast.C5187vf.m7585k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.cast.C5203we.m7626H(r6, r4, r1)
            goto L_0x03c4
        L_0x038e:
            java.lang.Object r4 = com.google.android.gms.internal.cast.C5187vf.m7585k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.cast.C5203we.m7629K(r6, r4, r1)
            goto L_0x03c4
        L_0x0399:
            java.lang.Object r4 = com.google.android.gms.internal.cast.C5187vf.m7585k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.cast.C5203we.m7642X(r6, r4, r1)
            goto L_0x03c4
        L_0x03a4:
            java.lang.Object r4 = com.google.android.gms.internal.cast.C5187vf.m7585k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.cast.C5203we.m7631M(r6, r4, r1)
            goto L_0x03c4
        L_0x03af:
            java.lang.Object r4 = com.google.android.gms.internal.cast.C5187vf.m7585k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.cast.C5203we.m7624F(r6, r4, r1)
            goto L_0x03c4
        L_0x03ba:
            java.lang.Object r4 = com.google.android.gms.internal.cast.C5187vf.m7585k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.cast.C5203we.m7626H(r6, r4, r1)
        L_0x03c4:
            int r3 = r3 + r4
            goto L_0x0545
        L_0x03c7:
            boolean r4 = r11.m7215k(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.cast.C5187vf.m7585k(r12, r7)
            com.google.android.gms.internal.cast.je r4 = (com.google.android.gms.internal.cast.C4982je) r4
            com.google.android.gms.internal.cast.ue r5 = r11.m7205D(r2)
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7398y(r6, r4, r5)
            goto L_0x03c4
        L_0x03dc:
            boolean r5 = r11.m7215k(r12, r2)
            if (r5 == 0) goto L_0x0545
            long r7 = com.google.android.gms.internal.cast.C5187vf.m7583i(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.cast.C5099qc.m7393a(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7394b(r6)
            goto L_0x04f6
        L_0x03f7:
            boolean r4 = r11.m7215k(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.cast.C5187vf.m7582h(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.cast.C5099qc.m7393a(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
            goto L_0x04f6
        L_0x0412:
            boolean r4 = r11.m7215k(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
            goto L_0x0541
        L_0x0420:
            boolean r4 = r11.m7215k(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
            goto L_0x0531
        L_0x042e:
            boolean r4 = r11.m7215k(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.cast.C5187vf.m7582h(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.cast.C5099qc.m7393a(r5)
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7399z(r4)
            goto L_0x04f6
        L_0x0444:
            boolean r4 = r11.m7215k(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.cast.C5187vf.m7582h(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.cast.C5099qc.m7393a(r5)
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
            goto L_0x04f6
        L_0x045a:
            boolean r4 = r11.m7215k(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.cast.C5187vf.m7585k(r12, r7)
            com.google.android.gms.internal.cast.jc r4 = (com.google.android.gms.internal.cast.C4980jc) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.cast.C5099qc.m7393a(r5)
            int r4 = r4.mo32730j()
            int r6 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
        L_0x0474:
            int r6 = r6 + r4
            int r5 = r5 + r6
            goto L_0x04f7
        L_0x0478:
            boolean r4 = r11.m7215k(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.cast.C5187vf.m7585k(r12, r7)
            com.google.android.gms.internal.cast.ue r5 = r11.m7205D(r2)
            int r4 = com.google.android.gms.internal.cast.C5203we.m7633O(r6, r4, r5)
            goto L_0x03c4
        L_0x048c:
            boolean r4 = r11.m7215k(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.cast.C5187vf.m7585k(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.cast.C4980jc
            if (r5 == 0) goto L_0x04ab
            com.google.android.gms.internal.cast.jc r4 = (com.google.android.gms.internal.cast.C4980jc) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.cast.C5099qc.m7393a(r5)
            int r4 = r4.mo32730j()
            int r6 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
            goto L_0x0474
        L_0x04ab:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.cast.C5099qc.m7393a(r5)
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7391C(r4)
            goto L_0x04f6
        L_0x04b8:
            boolean r4 = r11.m7215k(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
        L_0x04c4:
            int r4 = r4 + 1
            goto L_0x03c4
        L_0x04c8:
            boolean r4 = r11.m7215k(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
            goto L_0x0531
        L_0x04d5:
            boolean r4 = r11.m7215k(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
            goto L_0x0541
        L_0x04e2:
            boolean r4 = r11.m7215k(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.cast.C5187vf.m7582h(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.cast.C5099qc.m7393a(r5)
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7399z(r4)
        L_0x04f6:
            int r5 = r5 + r4
        L_0x04f7:
            int r3 = r3 + r5
            goto L_0x0545
        L_0x04f9:
            boolean r4 = r11.m7215k(r12, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = com.google.android.gms.internal.cast.C5187vf.m7583i(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.cast.C5099qc.m7393a(r6)
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7394b(r4)
            goto L_0x0522
        L_0x050e:
            boolean r4 = r11.m7215k(r12, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = com.google.android.gms.internal.cast.C5187vf.m7583i(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.cast.C5099qc.m7393a(r6)
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7394b(r4)
        L_0x0522:
            int r6 = r6 + r4
            int r3 = r3 + r6
            goto L_0x0545
        L_0x0525:
            boolean r4 = r11.m7215k(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
        L_0x0531:
            int r4 = r4 + 4
            goto L_0x03c4
        L_0x0535:
            boolean r4 = r11.m7215k(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.cast.C5099qc.m7393a(r4)
        L_0x0541:
            int r4 = r4 + 8
            goto L_0x03c4
        L_0x0545:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x0549:
            com.google.android.gms.internal.cast.kf r0 = r11.f5379i
            java.lang.Object r12 = r0.mo32854c(r12)
            int r12 = r0.mo32852a(r12)
            int r3 = r3 + r12
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.C5033me.m7227w(java.lang.Object):int");
    }

    /* renamed from: y */
    private static int m7228y(Object obj, long j) {
        return ((Integer) C5187vf.m7585k(obj, j)).intValue();
    }

    /* renamed from: z */
    private final int m7229z(int i) {
        return this.f5371a[i + 2];
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c2, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0226, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0227, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo32893a(java.lang.Object r9) {
        /*
            r8 = this;
            int[] r0 = r8.f5371a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x022b
            int r3 = r8.m7203B(r1)
            int[] r4 = r8.f5371a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            int r3 = m7202A(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0218;
                case 1: goto L_0x020d;
                case 2: goto L_0x0202;
                case 3: goto L_0x01f7;
                case 4: goto L_0x01f0;
                case 5: goto L_0x01e5;
                case 6: goto L_0x01de;
                case 7: goto L_0x01d3;
                case 8: goto L_0x01c6;
                case 9: goto L_0x01b8;
                case 10: goto L_0x01ac;
                case 11: goto L_0x01a4;
                case 12: goto L_0x019c;
                case 13: goto L_0x0194;
                case 14: goto L_0x0188;
                case 15: goto L_0x0180;
                case 16: goto L_0x0174;
                case 17: goto L_0x0169;
                case 18: goto L_0x015d;
                case 19: goto L_0x015d;
                case 20: goto L_0x015d;
                case 21: goto L_0x015d;
                case 22: goto L_0x015d;
                case 23: goto L_0x015d;
                case 24: goto L_0x015d;
                case 25: goto L_0x015d;
                case 26: goto L_0x015d;
                case 27: goto L_0x015d;
                case 28: goto L_0x015d;
                case 29: goto L_0x015d;
                case 30: goto L_0x015d;
                case 31: goto L_0x015d;
                case 32: goto L_0x015d;
                case 33: goto L_0x015d;
                case 34: goto L_0x015d;
                case 35: goto L_0x015d;
                case 36: goto L_0x015d;
                case 37: goto L_0x015d;
                case 38: goto L_0x015d;
                case 39: goto L_0x015d;
                case 40: goto L_0x015d;
                case 41: goto L_0x015d;
                case 42: goto L_0x015d;
                case 43: goto L_0x015d;
                case 44: goto L_0x015d;
                case 45: goto L_0x015d;
                case 46: goto L_0x015d;
                case 47: goto L_0x015d;
                case 48: goto L_0x015d;
                case 49: goto L_0x015d;
                case 50: goto L_0x0151;
                case 51: goto L_0x013b;
                case 52: goto L_0x0129;
                case 53: goto L_0x0117;
                case 54: goto L_0x0105;
                case 55: goto L_0x00f7;
                case 56: goto L_0x00e5;
                case 57: goto L_0x00d7;
                case 58: goto L_0x00c5;
                case 59: goto L_0x00b1;
                case 60: goto L_0x009f;
                case 61: goto L_0x008d;
                case 62: goto L_0x007f;
                case 63: goto L_0x0071;
                case 64: goto L_0x0063;
                case 65: goto L_0x0051;
                case 66: goto L_0x0043;
                case 67: goto L_0x0031;
                case 68: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0227
        L_0x001f:
            boolean r3 = r8.m7219o(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.cast.C5187vf.m7585k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x0031:
            boolean r3 = r8.m7219o(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m7204C(r9, r5)
            int r3 = com.google.android.gms.internal.cast.C5032md.m7196c(r3)
            goto L_0x0226
        L_0x0043:
            boolean r3 = r8.m7219o(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m7228y(r9, r5)
            goto L_0x0226
        L_0x0051:
            boolean r3 = r8.m7219o(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m7204C(r9, r5)
            int r3 = com.google.android.gms.internal.cast.C5032md.m7196c(r3)
            goto L_0x0226
        L_0x0063:
            boolean r3 = r8.m7219o(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m7228y(r9, r5)
            goto L_0x0226
        L_0x0071:
            boolean r3 = r8.m7219o(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m7228y(r9, r5)
            goto L_0x0226
        L_0x007f:
            boolean r3 = r8.m7219o(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m7228y(r9, r5)
            goto L_0x0226
        L_0x008d:
            boolean r3 = r8.m7219o(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.cast.C5187vf.m7585k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x009f:
            boolean r3 = r8.m7219o(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.cast.C5187vf.m7585k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x00b1:
            boolean r3 = r8.m7219o(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.cast.C5187vf.m7585k(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x00c5:
            boolean r3 = r8.m7219o(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            boolean r3 = m7220p(r9, r5)
            int r3 = com.google.android.gms.internal.cast.C5032md.m7194a(r3)
            goto L_0x0226
        L_0x00d7:
            boolean r3 = r8.m7219o(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m7228y(r9, r5)
            goto L_0x0226
        L_0x00e5:
            boolean r3 = r8.m7219o(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m7204C(r9, r5)
            int r3 = com.google.android.gms.internal.cast.C5032md.m7196c(r3)
            goto L_0x0226
        L_0x00f7:
            boolean r3 = r8.m7219o(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m7228y(r9, r5)
            goto L_0x0226
        L_0x0105:
            boolean r3 = r8.m7219o(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m7204C(r9, r5)
            int r3 = com.google.android.gms.internal.cast.C5032md.m7196c(r3)
            goto L_0x0226
        L_0x0117:
            boolean r3 = r8.m7219o(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m7204C(r9, r5)
            int r3 = com.google.android.gms.internal.cast.C5032md.m7196c(r3)
            goto L_0x0226
        L_0x0129:
            boolean r3 = r8.m7219o(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            float r3 = m7225u(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0226
        L_0x013b:
            boolean r3 = r8.m7219o(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            double r3 = m7224t(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.cast.C5032md.m7196c(r3)
            goto L_0x0226
        L_0x0151:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.cast.C5187vf.m7585k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x015d:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.cast.C5187vf.m7585k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x0169:
            java.lang.Object r3 = com.google.android.gms.internal.cast.C5187vf.m7585k(r9, r5)
            if (r3 == 0) goto L_0x01c2
            int r7 = r3.hashCode()
            goto L_0x01c2
        L_0x0174:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.cast.C5187vf.m7583i(r9, r5)
            int r3 = com.google.android.gms.internal.cast.C5032md.m7196c(r3)
            goto L_0x0226
        L_0x0180:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.cast.C5187vf.m7582h(r9, r5)
            goto L_0x0226
        L_0x0188:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.cast.C5187vf.m7583i(r9, r5)
            int r3 = com.google.android.gms.internal.cast.C5032md.m7196c(r3)
            goto L_0x0226
        L_0x0194:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.cast.C5187vf.m7582h(r9, r5)
            goto L_0x0226
        L_0x019c:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.cast.C5187vf.m7582h(r9, r5)
            goto L_0x0226
        L_0x01a4:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.cast.C5187vf.m7582h(r9, r5)
            goto L_0x0226
        L_0x01ac:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.cast.C5187vf.m7585k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x01b8:
            java.lang.Object r3 = com.google.android.gms.internal.cast.C5187vf.m7585k(r9, r5)
            if (r3 == 0) goto L_0x01c2
            int r7 = r3.hashCode()
        L_0x01c2:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0227
        L_0x01c6:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.cast.C5187vf.m7585k(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x01d3:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.cast.C5187vf.m7571B(r9, r5)
            int r3 = com.google.android.gms.internal.cast.C5032md.m7194a(r3)
            goto L_0x0226
        L_0x01de:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.cast.C5187vf.m7582h(r9, r5)
            goto L_0x0226
        L_0x01e5:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.cast.C5187vf.m7583i(r9, r5)
            int r3 = com.google.android.gms.internal.cast.C5032md.m7196c(r3)
            goto L_0x0226
        L_0x01f0:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.cast.C5187vf.m7582h(r9, r5)
            goto L_0x0226
        L_0x01f7:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.cast.C5187vf.m7583i(r9, r5)
            int r3 = com.google.android.gms.internal.cast.C5032md.m7196c(r3)
            goto L_0x0226
        L_0x0202:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.cast.C5187vf.m7583i(r9, r5)
            int r3 = com.google.android.gms.internal.cast.C5032md.m7196c(r3)
            goto L_0x0226
        L_0x020d:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.cast.C5187vf.m7581g(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0226
        L_0x0218:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.cast.C5187vf.m7580f(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.cast.C5032md.m7196c(r3)
        L_0x0226:
            int r2 = r2 + r3
        L_0x0227:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022b:
            int r2 = r2 * 53
            com.google.android.gms.internal.cast.kf r0 = r8.f5379i
            java.lang.Object r0 = r0.mo32854c(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f5374d
            if (r0 != 0) goto L_0x023d
            return r2
        L_0x023d:
            com.google.android.gms.internal.cast.uc r0 = r8.f5380j
            r0.mo33019a(r9)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.C5033me.mo32893a(java.lang.Object):int");
    }

    /* renamed from: b */
    public final int mo32894b(Object obj) {
        if (this.f5375e) {
            return m7227w(obj);
        }
        return m7226v(obj);
    }

    /* renamed from: c */
    public final boolean mo32895c(Object obj, Object obj2) {
        boolean z;
        int length = this.f5371a.length;
        for (int i = 0; i < length; i += 3) {
            int B = m7203B(i);
            long j = (long) (B & 1048575);
            switch (m7202A(B)) {
                case 0:
                    if (m7214j(obj, obj2, i) && Double.doubleToLongBits(C5187vf.m7580f(obj, j)) == Double.doubleToLongBits(C5187vf.m7580f(obj2, j))) {
                        continue;
                    }
                case 1:
                    if (m7214j(obj, obj2, i) && Float.floatToIntBits(C5187vf.m7581g(obj, j)) == Float.floatToIntBits(C5187vf.m7581g(obj2, j))) {
                        continue;
                    }
                case 2:
                    if (m7214j(obj, obj2, i) && C5187vf.m7583i(obj, j) == C5187vf.m7583i(obj2, j)) {
                        continue;
                    }
                case 3:
                    if (m7214j(obj, obj2, i) && C5187vf.m7583i(obj, j) == C5187vf.m7583i(obj2, j)) {
                        continue;
                    }
                case 4:
                    if (m7214j(obj, obj2, i) && C5187vf.m7582h(obj, j) == C5187vf.m7582h(obj2, j)) {
                        continue;
                    }
                case 5:
                    if (m7214j(obj, obj2, i) && C5187vf.m7583i(obj, j) == C5187vf.m7583i(obj2, j)) {
                        continue;
                    }
                case 6:
                    if (m7214j(obj, obj2, i) && C5187vf.m7582h(obj, j) == C5187vf.m7582h(obj2, j)) {
                        continue;
                    }
                case 7:
                    if (m7214j(obj, obj2, i) && C5187vf.m7571B(obj, j) == C5187vf.m7571B(obj2, j)) {
                        continue;
                    }
                case 8:
                    if (m7214j(obj, obj2, i) && C5203we.m7668x(C5187vf.m7585k(obj, j), C5187vf.m7585k(obj2, j))) {
                        continue;
                    }
                case 9:
                    if (m7214j(obj, obj2, i) && C5203we.m7668x(C5187vf.m7585k(obj, j), C5187vf.m7585k(obj2, j))) {
                        continue;
                    }
                case 10:
                    if (m7214j(obj, obj2, i) && C5203we.m7668x(C5187vf.m7585k(obj, j), C5187vf.m7585k(obj2, j))) {
                        continue;
                    }
                case 11:
                    if (m7214j(obj, obj2, i) && C5187vf.m7582h(obj, j) == C5187vf.m7582h(obj2, j)) {
                        continue;
                    }
                case 12:
                    if (m7214j(obj, obj2, i) && C5187vf.m7582h(obj, j) == C5187vf.m7582h(obj2, j)) {
                        continue;
                    }
                case 13:
                    if (m7214j(obj, obj2, i) && C5187vf.m7582h(obj, j) == C5187vf.m7582h(obj2, j)) {
                        continue;
                    }
                case 14:
                    if (m7214j(obj, obj2, i) && C5187vf.m7583i(obj, j) == C5187vf.m7583i(obj2, j)) {
                        continue;
                    }
                case 15:
                    if (m7214j(obj, obj2, i) && C5187vf.m7582h(obj, j) == C5187vf.m7582h(obj2, j)) {
                        continue;
                    }
                case 16:
                    if (m7214j(obj, obj2, i) && C5187vf.m7583i(obj, j) == C5187vf.m7583i(obj2, j)) {
                        continue;
                    }
                case 17:
                    if (m7214j(obj, obj2, i) && C5203we.m7668x(C5187vf.m7585k(obj, j), C5187vf.m7585k(obj2, j))) {
                        continue;
                    }
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    z = C5203we.m7668x(C5187vf.m7585k(obj, j), C5187vf.m7585k(obj2, j));
                    break;
                case 50:
                    z = C5203we.m7668x(C5187vf.m7585k(obj, j), C5187vf.m7585k(obj2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long z2 = (long) (m7229z(i) & 1048575);
                    if (C5187vf.m7582h(obj, z2) == C5187vf.m7582h(obj2, z2) && C5203we.m7668x(C5187vf.m7585k(obj, j), C5187vf.m7585k(obj2, j))) {
                        continue;
                    }
            }
            if (!z) {
                return false;
            }
        }
        if (!this.f5379i.mo32854c(obj).equals(this.f5379i.mo32854c(obj2))) {
            return false;
        }
        if (!this.f5374d) {
            return true;
        }
        this.f5380j.mo33019a(obj);
        this.f5380j.mo33019a(obj2);
        throw null;
    }

    /* renamed from: d */
    public final void mo32896d(Object obj) {
        if (m7218n(obj)) {
            if (obj instanceof C4878dd) {
                C4878dd ddVar = (C4878dd) obj;
                ddVar.mo32740o(Integer.MAX_VALUE);
                ddVar.zza = 0;
                ddVar.mo32735h();
            }
            int length = this.f5371a.length;
            for (int i = 0; i < length; i += 3) {
                int B = m7203B(i);
                long j = (long) (1048575 & B);
                int A = m7202A(B);
                if (A != 9) {
                    switch (A) {
                        case 17:
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.f5378h.mo33014a(obj, j);
                            continue;
                        case 50:
                            Unsafe unsafe = f5370n;
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                ((C4879de) object).mo32747b();
                                unsafe.putObject(obj, j, object);
                                break;
                            } else {
                                continue;
                            }
                    }
                }
                if (m7215k(obj, i)) {
                    m7205D(i).mo32896d(f5370n.getObject(obj, j));
                }
            }
            this.f5379i.mo32856e(obj);
            if (this.f5374d) {
                this.f5380j.mo33020b(obj);
            }
        }
    }

    /* renamed from: e */
    public final void mo32897e(Object obj, Object obj2) {
        if (m7218n(obj)) {
            obj2.getClass();
            for (int i = 0; i < this.f5371a.length; i += 3) {
                int B = m7203B(i);
                long j = (long) (1048575 & B);
                int i2 = this.f5371a[i];
                switch (m7202A(B)) {
                    case 0:
                        if (!m7215k(obj2, i)) {
                            break;
                        } else {
                            C5187vf.m7594t(obj, j, C5187vf.m7580f(obj2, j));
                            m7210I(obj, i);
                            break;
                        }
                    case 1:
                        if (!m7215k(obj2, i)) {
                            break;
                        } else {
                            C5187vf.m7595u(obj, j, C5187vf.m7581g(obj2, j));
                            m7210I(obj, i);
                            break;
                        }
                    case 2:
                        if (!m7215k(obj2, i)) {
                            break;
                        } else {
                            C5187vf.m7597w(obj, j, C5187vf.m7583i(obj2, j));
                            m7210I(obj, i);
                            break;
                        }
                    case 3:
                        if (!m7215k(obj2, i)) {
                            break;
                        } else {
                            C5187vf.m7597w(obj, j, C5187vf.m7583i(obj2, j));
                            m7210I(obj, i);
                            break;
                        }
                    case 4:
                        if (!m7215k(obj2, i)) {
                            break;
                        } else {
                            C5187vf.m7596v(obj, j, C5187vf.m7582h(obj2, j));
                            m7210I(obj, i);
                            break;
                        }
                    case 5:
                        if (!m7215k(obj2, i)) {
                            break;
                        } else {
                            C5187vf.m7597w(obj, j, C5187vf.m7583i(obj2, j));
                            m7210I(obj, i);
                            break;
                        }
                    case 6:
                        if (!m7215k(obj2, i)) {
                            break;
                        } else {
                            C5187vf.m7596v(obj, j, C5187vf.m7582h(obj2, j));
                            m7210I(obj, i);
                            break;
                        }
                    case 7:
                        if (!m7215k(obj2, i)) {
                            break;
                        } else {
                            C5187vf.m7592r(obj, j, C5187vf.m7571B(obj2, j));
                            m7210I(obj, i);
                            break;
                        }
                    case 8:
                        if (!m7215k(obj2, i)) {
                            break;
                        } else {
                            C5187vf.m7598x(obj, j, C5187vf.m7585k(obj2, j));
                            m7210I(obj, i);
                            break;
                        }
                    case 9:
                        m7208G(obj, obj2, i);
                        break;
                    case 10:
                        if (!m7215k(obj2, i)) {
                            break;
                        } else {
                            C5187vf.m7598x(obj, j, C5187vf.m7585k(obj2, j));
                            m7210I(obj, i);
                            break;
                        }
                    case 11:
                        if (!m7215k(obj2, i)) {
                            break;
                        } else {
                            C5187vf.m7596v(obj, j, C5187vf.m7582h(obj2, j));
                            m7210I(obj, i);
                            break;
                        }
                    case 12:
                        if (!m7215k(obj2, i)) {
                            break;
                        } else {
                            C5187vf.m7596v(obj, j, C5187vf.m7582h(obj2, j));
                            m7210I(obj, i);
                            break;
                        }
                    case 13:
                        if (!m7215k(obj2, i)) {
                            break;
                        } else {
                            C5187vf.m7596v(obj, j, C5187vf.m7582h(obj2, j));
                            m7210I(obj, i);
                            break;
                        }
                    case 14:
                        if (!m7215k(obj2, i)) {
                            break;
                        } else {
                            C5187vf.m7597w(obj, j, C5187vf.m7583i(obj2, j));
                            m7210I(obj, i);
                            break;
                        }
                    case 15:
                        if (!m7215k(obj2, i)) {
                            break;
                        } else {
                            C5187vf.m7596v(obj, j, C5187vf.m7582h(obj2, j));
                            m7210I(obj, i);
                            break;
                        }
                    case 16:
                        if (!m7215k(obj2, i)) {
                            break;
                        } else {
                            C5187vf.m7597w(obj, j, C5187vf.m7583i(obj2, j));
                            m7210I(obj, i);
                            break;
                        }
                    case 17:
                        m7208G(obj, obj2, i);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.f5378h.mo33015b(obj, obj2, j);
                        break;
                    case 50:
                        C5203we.m7669y(this.f5382l, obj, obj2, j);
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!m7219o(obj2, i2, i)) {
                            break;
                        } else {
                            C5187vf.m7598x(obj, j, C5187vf.m7585k(obj2, j));
                            m7211J(obj, i2, i);
                            break;
                        }
                    case 60:
                        m7209H(obj, obj2, i);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!m7219o(obj2, i2, i)) {
                            break;
                        } else {
                            C5187vf.m7598x(obj, j, C5187vf.m7585k(obj2, j));
                            m7211J(obj, i2, i);
                            break;
                        }
                    case 68:
                        m7209H(obj, obj2, i);
                        break;
                }
            }
            C5203we.m7648d(this.f5379i, obj, obj2);
            if (this.f5374d) {
                C5203we.m7647c(this.f5380j, obj, obj2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    /* renamed from: f */
    public final void mo32898f(Object obj, C4863cg cgVar) {
        if (!this.f5375e) {
            m7212h(obj, cgVar);
        } else if (!this.f5374d) {
            int length = this.f5371a.length;
            for (int i = 0; i < length; i += 3) {
                int B = m7203B(i);
                int i2 = this.f5371a[i];
                switch (m7202A(B)) {
                    case 0:
                        if (!m7215k(obj, i)) {
                            break;
                        } else {
                            cgVar.mo32712w(i2, C5187vf.m7580f(obj, (long) (B & 1048575)));
                            break;
                        }
                    case 1:
                        if (!m7215k(obj, i)) {
                            break;
                        } else {
                            cgVar.mo32711v(i2, C5187vf.m7581g(obj, (long) (B & 1048575)));
                            break;
                        }
                    case 2:
                        if (!m7215k(obj, i)) {
                            break;
                        } else {
                            cgVar.mo32696g(i2, C5187vf.m7583i(obj, (long) (B & 1048575)));
                            break;
                        }
                    case 3:
                        if (!m7215k(obj, i)) {
                            break;
                        } else {
                            cgVar.mo32691b(i2, C5187vf.m7583i(obj, (long) (B & 1048575)));
                            break;
                        }
                    case 4:
                        if (!m7215k(obj, i)) {
                            break;
                        } else {
                            cgVar.mo32705p(i2, C5187vf.m7582h(obj, (long) (B & 1048575)));
                            break;
                        }
                    case 5:
                        if (!m7215k(obj, i)) {
                            break;
                        } else {
                            cgVar.mo32682A(i2, C5187vf.m7583i(obj, (long) (B & 1048575)));
                            break;
                        }
                    case 6:
                        if (!m7215k(obj, i)) {
                            break;
                        } else {
                            cgVar.mo32693d(i2, C5187vf.m7582h(obj, (long) (B & 1048575)));
                            break;
                        }
                    case 7:
                        if (!m7215k(obj, i)) {
                            break;
                        } else {
                            cgVar.mo32698i(i2, C5187vf.m7571B(obj, (long) (B & 1048575)));
                            break;
                        }
                    case 8:
                        if (!m7215k(obj, i)) {
                            break;
                        } else {
                            m7221q(i2, C5187vf.m7585k(obj, (long) (B & 1048575)), cgVar);
                            break;
                        }
                    case 9:
                        if (!m7215k(obj, i)) {
                            break;
                        } else {
                            cgVar.mo32684C(i2, C5187vf.m7585k(obj, (long) (B & 1048575)), m7205D(i));
                            break;
                        }
                    case 10:
                        if (!m7215k(obj, i)) {
                            break;
                        } else {
                            cgVar.mo32683B(i2, (C4980jc) C5187vf.m7585k(obj, (long) (B & 1048575)));
                            break;
                        }
                    case 11:
                        if (!m7215k(obj, i)) {
                            break;
                        } else {
                            cgVar.mo32704o(i2, C5187vf.m7582h(obj, (long) (B & 1048575)));
                            break;
                        }
                    case 12:
                        if (!m7215k(obj, i)) {
                            break;
                        } else {
                            cgVar.mo32702m(i2, C5187vf.m7582h(obj, (long) (B & 1048575)));
                            break;
                        }
                    case 13:
                        if (!m7215k(obj, i)) {
                            break;
                        } else {
                            cgVar.mo32687F(i2, C5187vf.m7582h(obj, (long) (B & 1048575)));
                            break;
                        }
                    case 14:
                        if (!m7215k(obj, i)) {
                            break;
                        } else {
                            cgVar.mo32713x(i2, C5187vf.m7583i(obj, (long) (B & 1048575)));
                            break;
                        }
                    case 15:
                        if (!m7215k(obj, i)) {
                            break;
                        } else {
                            cgVar.mo32707r(i2, C5187vf.m7582h(obj, (long) (B & 1048575)));
                            break;
                        }
                    case 16:
                        if (!m7215k(obj, i)) {
                            break;
                        } else {
                            cgVar.mo32685D(i2, C5187vf.m7583i(obj, (long) (B & 1048575)));
                            break;
                        }
                    case 17:
                        if (!m7215k(obj, i)) {
                            break;
                        } else {
                            cgVar.mo32709t(i2, C5187vf.m7585k(obj, (long) (B & 1048575)), m7205D(i));
                            break;
                        }
                    case 18:
                        C5203we.m7652h(i2, (List) C5187vf.m7585k(obj, (long) (B & 1048575)), cgVar, false);
                        break;
                    case 19:
                        C5203we.m7656l(i2, (List) C5187vf.m7585k(obj, (long) (B & 1048575)), cgVar, false);
                        break;
                    case 20:
                        C5203we.m7659o(i2, (List) C5187vf.m7585k(obj, (long) (B & 1048575)), cgVar, false);
                        break;
                    case 21:
                        C5203we.m7667w(i2, (List) C5187vf.m7585k(obj, (long) (B & 1048575)), cgVar, false);
                        break;
                    case 22:
                        C5203we.m7658n(i2, (List) C5187vf.m7585k(obj, (long) (B & 1048575)), cgVar, false);
                        break;
                    case 23:
                        C5203we.m7655k(i2, (List) C5187vf.m7585k(obj, (long) (B & 1048575)), cgVar, false);
                        break;
                    case 24:
                        C5203we.m7654j(i2, (List) C5187vf.m7585k(obj, (long) (B & 1048575)), cgVar, false);
                        break;
                    case 25:
                        C5203we.m7650f(i2, (List) C5187vf.m7585k(obj, (long) (B & 1048575)), cgVar, false);
                        break;
                    case 26:
                        C5203we.m7665u(i2, (List) C5187vf.m7585k(obj, (long) (B & 1048575)), cgVar);
                        break;
                    case 27:
                        C5203we.m7660p(i2, (List) C5187vf.m7585k(obj, (long) (B & 1048575)), cgVar, m7205D(i));
                        break;
                    case 28:
                        C5203we.m7651g(i2, (List) C5187vf.m7585k(obj, (long) (B & 1048575)), cgVar);
                        break;
                    case 29:
                        C5203we.m7666v(i2, (List) C5187vf.m7585k(obj, (long) (B & 1048575)), cgVar, false);
                        break;
                    case 30:
                        C5203we.m7653i(i2, (List) C5187vf.m7585k(obj, (long) (B & 1048575)), cgVar, false);
                        break;
                    case 31:
                        C5203we.m7661q(i2, (List) C5187vf.m7585k(obj, (long) (B & 1048575)), cgVar, false);
                        break;
                    case 32:
                        C5203we.m7662r(i2, (List) C5187vf.m7585k(obj, (long) (B & 1048575)), cgVar, false);
                        break;
                    case 33:
                        C5203we.m7663s(i2, (List) C5187vf.m7585k(obj, (long) (B & 1048575)), cgVar, false);
                        break;
                    case 34:
                        C5203we.m7664t(i2, (List) C5187vf.m7585k(obj, (long) (B & 1048575)), cgVar, false);
                        break;
                    case 35:
                        C5203we.m7652h(i2, (List) C5187vf.m7585k(obj, (long) (B & 1048575)), cgVar, true);
                        break;
                    case 36:
                        C5203we.m7656l(i2, (List) C5187vf.m7585k(obj, (long) (B & 1048575)), cgVar, true);
                        break;
                    case 37:
                        C5203we.m7659o(i2, (List) C5187vf.m7585k(obj, (long) (B & 1048575)), cgVar, true);
                        break;
                    case 38:
                        C5203we.m7667w(i2, (List) C5187vf.m7585k(obj, (long) (B & 1048575)), cgVar, true);
                        break;
                    case 39:
                        C5203we.m7658n(i2, (List) C5187vf.m7585k(obj, (long) (B & 1048575)), cgVar, true);
                        break;
                    case 40:
                        C5203we.m7655k(i2, (List) C5187vf.m7585k(obj, (long) (B & 1048575)), cgVar, true);
                        break;
                    case 41:
                        C5203we.m7654j(i2, (List) C5187vf.m7585k(obj, (long) (B & 1048575)), cgVar, true);
                        break;
                    case 42:
                        C5203we.m7650f(i2, (List) C5187vf.m7585k(obj, (long) (B & 1048575)), cgVar, true);
                        break;
                    case 43:
                        C5203we.m7666v(i2, (List) C5187vf.m7585k(obj, (long) (B & 1048575)), cgVar, true);
                        break;
                    case 44:
                        C5203we.m7653i(i2, (List) C5187vf.m7585k(obj, (long) (B & 1048575)), cgVar, true);
                        break;
                    case 45:
                        C5203we.m7661q(i2, (List) C5187vf.m7585k(obj, (long) (B & 1048575)), cgVar, true);
                        break;
                    case 46:
                        C5203we.m7662r(i2, (List) C5187vf.m7585k(obj, (long) (B & 1048575)), cgVar, true);
                        break;
                    case 47:
                        C5203we.m7663s(i2, (List) C5187vf.m7585k(obj, (long) (B & 1048575)), cgVar, true);
                        break;
                    case 48:
                        C5203we.m7664t(i2, (List) C5187vf.m7585k(obj, (long) (B & 1048575)), cgVar, true);
                        break;
                    case 49:
                        C5203we.m7657m(i2, (List) C5187vf.m7585k(obj, (long) (B & 1048575)), cgVar, m7205D(i));
                        break;
                    case 50:
                        m7213i(cgVar, i2, C5187vf.m7585k(obj, (long) (B & 1048575)), i);
                        break;
                    case 51:
                        if (!m7219o(obj, i2, i)) {
                            break;
                        } else {
                            cgVar.mo32712w(i2, m7224t(obj, (long) (B & 1048575)));
                            break;
                        }
                    case 52:
                        if (!m7219o(obj, i2, i)) {
                            break;
                        } else {
                            cgVar.mo32711v(i2, m7225u(obj, (long) (B & 1048575)));
                            break;
                        }
                    case 53:
                        if (!m7219o(obj, i2, i)) {
                            break;
                        } else {
                            cgVar.mo32696g(i2, m7204C(obj, (long) (B & 1048575)));
                            break;
                        }
                    case 54:
                        if (!m7219o(obj, i2, i)) {
                            break;
                        } else {
                            cgVar.mo32691b(i2, m7204C(obj, (long) (B & 1048575)));
                            break;
                        }
                    case 55:
                        if (!m7219o(obj, i2, i)) {
                            break;
                        } else {
                            cgVar.mo32705p(i2, m7228y(obj, (long) (B & 1048575)));
                            break;
                        }
                    case 56:
                        if (!m7219o(obj, i2, i)) {
                            break;
                        } else {
                            cgVar.mo32682A(i2, m7204C(obj, (long) (B & 1048575)));
                            break;
                        }
                    case 57:
                        if (!m7219o(obj, i2, i)) {
                            break;
                        } else {
                            cgVar.mo32693d(i2, m7228y(obj, (long) (B & 1048575)));
                            break;
                        }
                    case 58:
                        if (!m7219o(obj, i2, i)) {
                            break;
                        } else {
                            cgVar.mo32698i(i2, m7220p(obj, (long) (B & 1048575)));
                            break;
                        }
                    case 59:
                        if (!m7219o(obj, i2, i)) {
                            break;
                        } else {
                            m7221q(i2, C5187vf.m7585k(obj, (long) (B & 1048575)), cgVar);
                            break;
                        }
                    case 60:
                        if (!m7219o(obj, i2, i)) {
                            break;
                        } else {
                            cgVar.mo32684C(i2, C5187vf.m7585k(obj, (long) (B & 1048575)), m7205D(i));
                            break;
                        }
                    case 61:
                        if (!m7219o(obj, i2, i)) {
                            break;
                        } else {
                            cgVar.mo32683B(i2, (C4980jc) C5187vf.m7585k(obj, (long) (B & 1048575)));
                            break;
                        }
                    case 62:
                        if (!m7219o(obj, i2, i)) {
                            break;
                        } else {
                            cgVar.mo32704o(i2, m7228y(obj, (long) (B & 1048575)));
                            break;
                        }
                    case 63:
                        if (!m7219o(obj, i2, i)) {
                            break;
                        } else {
                            cgVar.mo32702m(i2, m7228y(obj, (long) (B & 1048575)));
                            break;
                        }
                    case 64:
                        if (!m7219o(obj, i2, i)) {
                            break;
                        } else {
                            cgVar.mo32687F(i2, m7228y(obj, (long) (B & 1048575)));
                            break;
                        }
                    case 65:
                        if (!m7219o(obj, i2, i)) {
                            break;
                        } else {
                            cgVar.mo32713x(i2, m7204C(obj, (long) (B & 1048575)));
                            break;
                        }
                    case 66:
                        if (!m7219o(obj, i2, i)) {
                            break;
                        } else {
                            cgVar.mo32707r(i2, m7228y(obj, (long) (B & 1048575)));
                            break;
                        }
                    case 67:
                        if (!m7219o(obj, i2, i)) {
                            break;
                        } else {
                            cgVar.mo32685D(i2, m7204C(obj, (long) (B & 1048575)));
                            break;
                        }
                    case 68:
                        if (!m7219o(obj, i2, i)) {
                            break;
                        } else {
                            cgVar.mo32709t(i2, C5187vf.m7585k(obj, (long) (B & 1048575)), m7205D(i));
                            break;
                        }
                }
            }
            C5000kf kfVar = this.f5379i;
            kfVar.mo32858g(kfVar.mo32854c(obj), cgVar);
        } else {
            this.f5380j.mo33019a(obj);
            throw null;
        }
    }

    /* renamed from: g */
    public final boolean mo32899g(Object obj) {
        int i;
        int i2;
        Object obj2 = obj;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f5377g) {
            int i6 = this.f5376f[i5];
            int i7 = this.f5371a[i6];
            int B = m7203B(i6);
            int i8 = this.f5371a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f5370n.getInt(obj2, (long) i9);
                }
                i = i4;
                i2 = i9;
            } else {
                i2 = i3;
                i = i4;
            }
            if ((268435456 & B) != 0 && !m7216l(obj, i6, i2, i, i10)) {
                return false;
            }
            int A = m7202A(B);
            if (A != 9 && A != 17) {
                if (A != 27) {
                    if (A == 60 || A == 68) {
                        if (m7219o(obj2, i7, i6) && !m7217m(obj2, B, m7205D(i6))) {
                            return false;
                        }
                    } else if (A != 49) {
                        if (A == 50 && !((C4879de) C5187vf.m7585k(obj2, (long) (B & 1048575))).isEmpty()) {
                            C4861ce ceVar = (C4861ce) m7206E(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) C5187vf.m7585k(obj2, (long) (B & 1048575));
                if (!list.isEmpty()) {
                    C5169ue D = m7205D(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!D.mo32899g(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (m7216l(obj, i6, i2, i, i10) && !m7217m(obj2, B, m7205D(i6))) {
                return false;
            }
            i5++;
            i3 = i2;
            i4 = i;
        }
        if (!this.f5374d) {
            return true;
        }
        this.f5380j.mo33019a(obj2);
        throw null;
    }

    /* renamed from: x */
    public final Object mo32900x() {
        return ((C4878dd) this.f5373c).mo32745v();
    }
}
