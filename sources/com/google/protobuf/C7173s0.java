package com.google.protobuf;

import com.google.protobuf.C7086h;
import com.google.protobuf.C7115i0;
import com.google.protobuf.C7160q1;
import com.google.protobuf.C7170r1;
import com.google.protobuf.C7196z;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* renamed from: com.google.protobuf.s0 */
/* compiled from: MessageSchema */
final class C7173s0<T> implements C7076e1<T> {

    /* renamed from: r */
    private static final int[] f9736r = new int[0];

    /* renamed from: s */
    private static final Unsafe f9737s = C7142o1.m13509D();

    /* renamed from: a */
    private final int[] f9738a;

    /* renamed from: b */
    private final Object[] f9739b;

    /* renamed from: c */
    private final int f9740c;

    /* renamed from: d */
    private final int f9741d;

    /* renamed from: e */
    private final C7149p0 f9742e;

    /* renamed from: f */
    private final boolean f9743f;

    /* renamed from: g */
    private final boolean f9744g;

    /* renamed from: h */
    private final boolean f9745h;

    /* renamed from: i */
    private final boolean f9746i;

    /* renamed from: j */
    private final int[] f9747j;

    /* renamed from: k */
    private final int f9748k;

    /* renamed from: l */
    private final int f9749l;

    /* renamed from: m */
    private final C7181u0 f9750m;

    /* renamed from: n */
    private final C7078f0 f9751n;

    /* renamed from: o */
    private final C7127k1<?, ?> f9752o;

    /* renamed from: p */
    private final C7148p<?> f9753p;

    /* renamed from: q */
    private final C7126k0 f9754q;

    private C7173s0(int[] iArr, Object[] objArr, int i, int i2, C7149p0 p0Var, boolean z, boolean z2, int[] iArr2, int i3, int i4, C7181u0 u0Var, C7078f0 f0Var, C7127k1<?, ?> k1Var, C7148p<?> pVar, C7126k0 k0Var) {
        boolean z3;
        this.f9738a = iArr;
        this.f9739b = objArr;
        this.f9740c = i;
        this.f9741d = i2;
        this.f9744g = p0Var instanceof C7186x;
        this.f9745h = z;
        if (pVar == null || !pVar.mo40619e(p0Var)) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.f9743f = z3;
        this.f9746i = z2;
        this.f9747j = iArr2;
        this.f9748k = i3;
        this.f9749l = i4;
        this.f9750m = u0Var;
        this.f9751n = f0Var;
        this.f9752o = k1Var;
        this.f9753p = pVar;
        this.f9742e = p0Var;
        this.f9754q = k0Var;
    }

    /* renamed from: A */
    private static boolean m13734A(Object obj, int i, C7076e1 e1Var) {
        return e1Var.mo40277d(C7142o1.m13508C(obj, m13751R(i)));
    }

    /* renamed from: B */
    private <N> boolean m13735B(Object obj, int i, int i2) {
        List list = (List) C7142o1.m13508C(obj, m13751R(i));
        if (list.isEmpty()) {
            return true;
        }
        C7076e1 s = m13784s(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!s.mo40277d(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: C */
    private boolean m13736C(T t, int i, int i2) {
        Map<?, ?> h = this.f9754q.mo40506h(C7142o1.m13508C(t, m13751R(i)));
        if (h.isEmpty()) {
            return true;
        }
        if (this.f9754q.mo40501c(m13783r(i2)).f9628c.mo40638a() != C7160q1.C7167c.MESSAGE) {
            return true;
        }
        C7076e1<?> e1Var = null;
        for (Object next : h.values()) {
            if (e1Var == null) {
                e1Var = C7059a1.m12782a().mo40162d(next.getClass());
            }
            if (!e1Var.mo40277d(next)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: D */
    private boolean m13737D(T t, T t2, int i) {
        long Y = (long) (m13758Y(i) & 1048575);
        if (C7142o1.m13551z(t, Y) == C7142o1.m13551z(t2, Y)) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    private boolean m13738E(T t, int i, int i2) {
        if (C7142o1.m13551z(t, (long) (m13758Y(i2) & 1048575)) == i) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    private static boolean m13739F(int i) {
        if ((i & 268435456) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: G */
    private static List<?> m13740G(Object obj, long j) {
        return (List) C7142o1.m13508C(obj, j);
    }

    /* renamed from: H */
    private static <T> long m13741H(T t, long j) {
        return C7142o1.m13506A(t, j);
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: I */
    private <UT, UB, ET extends com.google.protobuf.C7174t.C7176b<ET>> void m13742I(com.google.protobuf.C7127k1<UT, UB> r17, com.google.protobuf.C7148p<ET> r18, T r19, com.google.protobuf.C7071d1 r20, com.google.protobuf.C7139o r21) {
        /*
            r16 = this;
            r8 = r16
            r9 = r17
            r10 = r19
            r0 = r20
            r11 = r21
            r12 = 0
            r13 = r12
            r14 = r13
        L_0x000d:
            int r1 = r20.mo40227A()     // Catch:{ all -> 0x0612 }
            int r3 = r8.m13757X(r1)     // Catch:{ all -> 0x0612 }
            if (r3 >= 0) goto L_0x008e
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L_0x0033
            int r0 = r8.f9748k
        L_0x001e:
            int r1 = r8.f9749l
            if (r0 >= r1) goto L_0x002d
            int[] r1 = r8.f9747j
            r1 = r1[r0]
            java.lang.Object r13 = r8.m13777n(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x001e
        L_0x002d:
            if (r13 == 0) goto L_0x0032
            r9.mo40521o(r10, r13)
        L_0x0032:
            return
        L_0x0033:
            boolean r2 = r8.f9743f     // Catch:{ all -> 0x0612 }
            if (r2 != 0) goto L_0x003b
            r15 = r18
            r3 = r12
            goto L_0x0044
        L_0x003b:
            com.google.protobuf.p0 r2 = r8.f9742e     // Catch:{ all -> 0x0612 }
            r15 = r18
            java.lang.Object r1 = r15.mo40616b(r11, r2, r1)     // Catch:{ all -> 0x0612 }
            r3 = r1
        L_0x0044:
            if (r3 == 0) goto L_0x005c
            if (r14 != 0) goto L_0x004d
            com.google.protobuf.t r1 = r18.mo40618d(r19)     // Catch:{ all -> 0x0612 }
            r14 = r1
        L_0x004d:
            r1 = r18
            r2 = r20
            r4 = r21
            r5 = r14
            r6 = r13
            r7 = r17
            java.lang.Object r13 = r1.mo40621g(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0612 }
            goto L_0x000d
        L_0x005c:
            boolean r1 = r9.mo40523q(r0)     // Catch:{ all -> 0x0612 }
            if (r1 == 0) goto L_0x0069
            boolean r1 = r20.mo40235I()     // Catch:{ all -> 0x0612 }
            if (r1 == 0) goto L_0x0077
            goto L_0x000d
        L_0x0069:
            if (r13 != 0) goto L_0x0070
            java.lang.Object r1 = r9.mo40512f(r10)     // Catch:{ all -> 0x0612 }
            r13 = r1
        L_0x0070:
            boolean r1 = r9.mo40519m(r13, r0)     // Catch:{ all -> 0x0612 }
            if (r1 == 0) goto L_0x0077
            goto L_0x000d
        L_0x0077:
            int r0 = r8.f9748k
        L_0x0079:
            int r1 = r8.f9749l
            if (r0 >= r1) goto L_0x0088
            int[] r1 = r8.f9747j
            r1 = r1[r0]
            java.lang.Object r13 = r8.m13777n(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x0079
        L_0x0088:
            if (r13 == 0) goto L_0x008d
            r9.mo40521o(r10, r13)
        L_0x008d:
            return
        L_0x008e:
            r15 = r18
            int r4 = r8.m13768i0(r3)     // Catch:{ all -> 0x0612 }
            int r2 = m13767h0(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            switch(r2) {
                case 0: goto L_0x059d;
                case 1: goto L_0x058d;
                case 2: goto L_0x057d;
                case 3: goto L_0x056d;
                case 4: goto L_0x055d;
                case 5: goto L_0x054d;
                case 6: goto L_0x053d;
                case 7: goto L_0x052d;
                case 8: goto L_0x0525;
                case 9: goto L_0x04ee;
                case 10: goto L_0x04de;
                case 11: goto L_0x04ce;
                case 12: goto L_0x04ab;
                case 13: goto L_0x049b;
                case 14: goto L_0x048b;
                case 15: goto L_0x047b;
                case 16: goto L_0x046b;
                case 17: goto L_0x0434;
                case 18: goto L_0x0425;
                case 19: goto L_0x0416;
                case 20: goto L_0x0407;
                case 21: goto L_0x03f8;
                case 22: goto L_0x03e9;
                case 23: goto L_0x03da;
                case 24: goto L_0x03cb;
                case 25: goto L_0x03bc;
                case 26: goto L_0x03b7;
                case 27: goto L_0x03a5;
                case 28: goto L_0x0396;
                case 29: goto L_0x0387;
                case 30: goto L_0x0370;
                case 31: goto L_0x0361;
                case 32: goto L_0x0352;
                case 33: goto L_0x0343;
                case 34: goto L_0x0334;
                case 35: goto L_0x0325;
                case 36: goto L_0x0316;
                case 37: goto L_0x0307;
                case 38: goto L_0x02f8;
                case 39: goto L_0x02e9;
                case 40: goto L_0x02da;
                case 41: goto L_0x02cb;
                case 42: goto L_0x02bc;
                case 43: goto L_0x02ad;
                case 44: goto L_0x0296;
                case 45: goto L_0x0287;
                case 46: goto L_0x0278;
                case 47: goto L_0x0269;
                case 48: goto L_0x025a;
                case 49: goto L_0x0244;
                case 50: goto L_0x0233;
                case 51: goto L_0x021f;
                case 52: goto L_0x020b;
                case 53: goto L_0x01f7;
                case 54: goto L_0x01e3;
                case 55: goto L_0x01cf;
                case 56: goto L_0x01bb;
                case 57: goto L_0x01a7;
                case 58: goto L_0x0193;
                case 59: goto L_0x018b;
                case 60: goto L_0x0152;
                case 61: goto L_0x0142;
                case 62: goto L_0x012e;
                case 63: goto L_0x0107;
                case 64: goto L_0x00f3;
                case 65: goto L_0x00df;
                case 66: goto L_0x00cb;
                case 67: goto L_0x00b7;
                case 68: goto L_0x00a3;
                default: goto L_0x009b;
            }     // Catch:{ InvalidWireTypeException -> 0x05cb }
        L_0x009b:
            if (r13 != 0) goto L_0x05ae
            java.lang.Object r1 = r17.mo40520n()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x05ad
        L_0x00a3:
            long r4 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.e1 r2 = r8.m13784s(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r2 = r0.mo40256n(r2, r11)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C7142o1.m13523R(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m13765f0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x00b7:
            long r4 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r6 = r20.mo40267w()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C7142o1.m13523R(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m13765f0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x00cb:
            long r4 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r2 = r20.mo40266v()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C7142o1.m13523R(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m13765f0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x00df:
            long r4 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r6 = r20.mo40254l()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C7142o1.m13523R(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m13765f0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x00f3:
            long r4 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r2 = r20.mo40236J()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C7142o1.m13523R(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m13765f0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0107:
            int r2 = r20.mo40264t()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.z$e r5 = r8.m13782q(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r5 == 0) goto L_0x011e
            boolean r5 = r5.mo40729a(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r5 == 0) goto L_0x0118
            goto L_0x011e
        L_0x0118:
            java.lang.Object r13 = com.google.protobuf.C7085g1.m13007L(r1, r2, r13, r9)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x011e:
            long r4 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C7142o1.m13523R(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m13765f0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x012e:
            long r4 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r2 = r20.mo40257o()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C7142o1.m13523R(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m13765f0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0142:
            long r4 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.h r2 = r20.mo40232F()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C7142o1.m13523R(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m13765f0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0152:
            boolean r2 = r8.m13738E(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r2 == 0) goto L_0x0174
            long r5 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r2 = com.google.protobuf.C7142o1.m13508C(r10, r5)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.e1 r5 = r8.m13784s(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r5 = r0.mo40229C(r5, r11)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r2 = com.google.protobuf.C7196z.m13951h(r2, r5)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C7142o1.m13523R(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x0186
        L_0x0174:
            long r4 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.e1 r2 = r8.m13784s(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r2 = r0.mo40229C(r2, r11)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C7142o1.m13523R(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m13764e0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
        L_0x0186:
            r8.m13765f0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x018b:
            r8.m13761b0(r10, r4, r0)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m13765f0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0193:
            long r4 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            boolean r2 = r20.mo40252j()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C7142o1.m13523R(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m13765f0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x01a7:
            long r4 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r2 = r20.mo40251i()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C7142o1.m13523R(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m13765f0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x01bb:
            long r4 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r6 = r20.mo40244c()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C7142o1.m13523R(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m13765f0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x01cf:
            long r4 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r2 = r20.mo40234H()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C7142o1.m13523R(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m13765f0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x01e3:
            long r4 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r6 = r20.mo40243b()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C7142o1.m13523R(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m13765f0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x01f7:
            long r4 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r6 = r20.mo40239M()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C7142o1.m13523R(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m13765f0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x020b:
            long r4 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            float r2 = r20.readFloat()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C7142o1.m13523R(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m13765f0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x021f:
            long r4 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            double r6 = r20.readDouble()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Double r2 = java.lang.Double.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C7142o1.m13523R(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m13765f0(r10, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0233:
            java.lang.Object r4 = r8.m13783r(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r1 = r16
            r2 = r19
            r5 = r21
            r6 = r20
            r1.m13743J(r2, r3, r4, r5, r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0244:
            long r4 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.e1 r6 = r8.m13784s(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r1 = r16
            r2 = r19
            r3 = r4
            r5 = r20
            r7 = r21
            r1.m13759Z(r2, r3, r5, r6, r7)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x025a:
            com.google.protobuf.f0 r1 = r8.f9751n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo40301e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo40246e(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0269:
            com.google.protobuf.f0 r1 = r8.f9751n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo40301e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo40242a(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0278:
            com.google.protobuf.f0 r1 = r8.f9751n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo40301e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo40259q(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0287:
            com.google.protobuf.f0 r1 = r8.f9751n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo40301e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo40245d(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0296:
            com.google.protobuf.f0 r2 = r8.f9751n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r2 = r2.mo40301e(r10, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo40263s(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.z$e r3 = r8.m13782q(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r13 = com.google.protobuf.C7085g1.m12996A(r1, r2, r3, r13, r9)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x02ad:
            com.google.protobuf.f0 r1 = r8.f9751n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo40301e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo40248g(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x02bc:
            com.google.protobuf.f0 r1 = r8.f9751n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo40301e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo40268x(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x02cb:
            com.google.protobuf.f0 r1 = r8.f9751n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo40301e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo40265u(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x02da:
            com.google.protobuf.f0 r1 = r8.f9751n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo40301e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo40241O(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x02e9:
            com.google.protobuf.f0 r1 = r8.f9751n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo40301e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo40260r(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x02f8:
            com.google.protobuf.f0 r1 = r8.f9751n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo40301e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo40255m(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0307:
            com.google.protobuf.f0 r1 = r8.f9751n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo40301e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo40258p(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0316:
            com.google.protobuf.f0 r1 = r8.f9751n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo40301e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo40233G(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0325:
            com.google.protobuf.f0 r1 = r8.f9751n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo40301e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo40238L(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0334:
            com.google.protobuf.f0 r1 = r8.f9751n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo40301e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo40246e(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0343:
            com.google.protobuf.f0 r1 = r8.f9751n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo40301e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo40242a(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0352:
            com.google.protobuf.f0 r1 = r8.f9751n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo40301e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo40259q(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0361:
            com.google.protobuf.f0 r1 = r8.f9751n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo40301e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo40245d(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0370:
            com.google.protobuf.f0 r2 = r8.f9751n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r2 = r2.mo40301e(r10, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo40263s(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.z$e r3 = r8.m13782q(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r13 = com.google.protobuf.C7085g1.m12996A(r1, r2, r3, r13, r9)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0387:
            com.google.protobuf.f0 r1 = r8.f9751n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo40301e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo40248g(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0396:
            com.google.protobuf.f0 r1 = r8.f9751n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo40301e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo40237K(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x03a5:
            com.google.protobuf.e1 r5 = r8.m13784s(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r1 = r16
            r2 = r19
            r3 = r4
            r4 = r20
            r6 = r21
            r1.m13760a0(r2, r3, r4, r5, r6)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x03b7:
            r8.m13762c0(r10, r4, r0)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x03bc:
            com.google.protobuf.f0 r1 = r8.f9751n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo40301e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo40268x(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x03cb:
            com.google.protobuf.f0 r1 = r8.f9751n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo40301e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo40265u(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x03da:
            com.google.protobuf.f0 r1 = r8.f9751n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo40301e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo40241O(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x03e9:
            com.google.protobuf.f0 r1 = r8.f9751n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo40301e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo40260r(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x03f8:
            com.google.protobuf.f0 r1 = r8.f9751n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo40301e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo40255m(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0407:
            com.google.protobuf.f0 r1 = r8.f9751n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo40301e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo40258p(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0416:
            com.google.protobuf.f0 r1 = r8.f9751n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo40301e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo40233G(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0425:
            com.google.protobuf.f0 r1 = r8.f9751n     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.util.List r1 = r1.mo40301e(r10, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r0.mo40238L(r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0434:
            boolean r1 = r8.m13790y(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r1 == 0) goto L_0x0457
            long r1 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r1 = com.google.protobuf.C7142o1.m13508C(r10, r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.e1 r2 = r8.m13784s(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r2 = r0.mo40256n(r2, r11)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r1 = com.google.protobuf.C7196z.m13951h(r1, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C7142o1.m13523R(r10, r2, r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0457:
            long r1 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.e1 r4 = r8.m13784s(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r4 = r0.mo40256n(r4, r11)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C7142o1.m13523R(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m13764e0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x046b:
            long r1 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = r20.mo40267w()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C7142o1.m13522Q(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m13764e0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x047b:
            long r1 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r4 = r20.mo40266v()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C7142o1.m13521P(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m13764e0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x048b:
            long r1 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = r20.mo40254l()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C7142o1.m13522Q(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m13764e0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x049b:
            long r1 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r4 = r20.mo40236J()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C7142o1.m13521P(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m13764e0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x04ab:
            int r2 = r20.mo40264t()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.z$e r5 = r8.m13782q(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r5 == 0) goto L_0x04c2
            boolean r5 = r5.mo40729a(r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r5 == 0) goto L_0x04bc
            goto L_0x04c2
        L_0x04bc:
            java.lang.Object r13 = com.google.protobuf.C7085g1.m13007L(r1, r2, r13, r9)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x04c2:
            long r4 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C7142o1.m13521P(r10, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m13764e0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x04ce:
            long r1 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r4 = r20.mo40257o()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C7142o1.m13521P(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m13764e0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x04de:
            long r1 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.h r4 = r20.mo40232F()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C7142o1.m13523R(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m13764e0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x04ee:
            boolean r1 = r8.m13790y(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r1 == 0) goto L_0x0511
            long r1 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r1 = com.google.protobuf.C7142o1.m13508C(r10, r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.e1 r2 = r8.m13784s(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r2 = r0.mo40229C(r2, r11)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r1 = com.google.protobuf.C7196z.m13951h(r1, r2)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r2 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C7142o1.m13523R(r10, r2, r1)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0511:
            long r1 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.e1 r4 = r8.m13784s(r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            java.lang.Object r4 = r0.mo40229C(r4, r11)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C7142o1.m13523R(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m13764e0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x0525:
            r8.m13761b0(r10, r4, r0)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m13764e0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x052d:
            long r1 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            boolean r4 = r20.mo40252j()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C7142o1.m13513H(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m13764e0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x053d:
            long r1 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r4 = r20.mo40251i()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C7142o1.m13521P(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m13764e0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x054d:
            long r1 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = r20.mo40244c()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C7142o1.m13522Q(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m13764e0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x055d:
            long r1 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            int r4 = r20.mo40234H()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C7142o1.m13521P(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m13764e0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x056d:
            long r1 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = r20.mo40243b()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C7142o1.m13522Q(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m13764e0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x057d:
            long r1 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            long r4 = r20.mo40239M()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C7142o1.m13522Q(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m13764e0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x058d:
            long r1 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            float r4 = r20.readFloat()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C7142o1.m13520O(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m13764e0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x059d:
            long r1 = m13751R(r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            double r4 = r20.readDouble()     // Catch:{ InvalidWireTypeException -> 0x05cb }
            com.google.protobuf.C7142o1.m13519N(r10, r1, r4)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            r8.m13764e0(r10, r3)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            goto L_0x000d
        L_0x05ad:
            r13 = r1
        L_0x05ae:
            boolean r1 = r9.mo40519m(r13, r0)     // Catch:{ InvalidWireTypeException -> 0x05cb }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f9748k
        L_0x05b6:
            int r1 = r8.f9749l
            if (r0 >= r1) goto L_0x05c5
            int[] r1 = r8.f9747j
            r1 = r1[r0]
            java.lang.Object r13 = r8.m13777n(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x05b6
        L_0x05c5:
            if (r13 == 0) goto L_0x05ca
            r9.mo40521o(r10, r13)
        L_0x05ca:
            return
        L_0x05cb:
            boolean r1 = r9.mo40523q(r0)     // Catch:{ all -> 0x0612 }
            if (r1 == 0) goto L_0x05ee
            boolean r1 = r20.mo40235I()     // Catch:{ all -> 0x0612 }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f9748k
        L_0x05d9:
            int r1 = r8.f9749l
            if (r0 >= r1) goto L_0x05e8
            int[] r1 = r8.f9747j
            r1 = r1[r0]
            java.lang.Object r13 = r8.m13777n(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x05d9
        L_0x05e8:
            if (r13 == 0) goto L_0x05ed
            r9.mo40521o(r10, r13)
        L_0x05ed:
            return
        L_0x05ee:
            if (r13 != 0) goto L_0x05f5
            java.lang.Object r1 = r9.mo40512f(r10)     // Catch:{ all -> 0x0612 }
            r13 = r1
        L_0x05f5:
            boolean r1 = r9.mo40519m(r13, r0)     // Catch:{ all -> 0x0612 }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f9748k
        L_0x05fd:
            int r1 = r8.f9749l
            if (r0 >= r1) goto L_0x060c
            int[] r1 = r8.f9747j
            r1 = r1[r0]
            java.lang.Object r13 = r8.m13777n(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x05fd
        L_0x060c:
            if (r13 == 0) goto L_0x0611
            r9.mo40521o(r10, r13)
        L_0x0611:
            return
        L_0x0612:
            r0 = move-exception
            int r1 = r8.f9748k
        L_0x0615:
            int r2 = r8.f9749l
            if (r1 >= r2) goto L_0x0624
            int[] r2 = r8.f9747j
            r2 = r2[r1]
            java.lang.Object r13 = r8.m13777n(r10, r2, r13, r9)
            int r1 = r1 + 1
            goto L_0x0615
        L_0x0624:
            if (r13 == 0) goto L_0x0629
            r9.mo40521o(r10, r13)
        L_0x0629:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7173s0.m13742I(com.google.protobuf.k1, com.google.protobuf.p, java.lang.Object, com.google.protobuf.d1, com.google.protobuf.o):void");
    }

    /* renamed from: J */
    private final <K, V> void m13743J(Object obj, int i, Object obj2, C7139o oVar, C7071d1 d1Var) {
        long R = m13751R(m13768i0(i));
        Object C = C7142o1.m13508C(obj, R);
        if (C == null) {
            C = this.f9754q.mo40503e(obj2);
            C7142o1.m13523R(obj, R, C);
        } else if (this.f9754q.mo40505g(C)) {
            Object e = this.f9754q.mo40503e(obj2);
            this.f9754q.mo40499a(e, C);
            C7142o1.m13523R(obj, R, e);
            C = e;
        }
        d1Var.mo40230D(this.f9754q.mo40502d(C), this.f9754q.mo40501c(obj2), oVar);
    }

    /* renamed from: K */
    private void m13744K(T t, T t2, int i) {
        long R = m13751R(m13768i0(i));
        if (m13790y(t2, i)) {
            Object C = C7142o1.m13508C(t, R);
            Object C2 = C7142o1.m13508C(t2, R);
            if (C != null && C2 != null) {
                C7142o1.m13523R(t, R, C7196z.m13951h(C, C2));
                m13764e0(t, i);
            } else if (C2 != null) {
                C7142o1.m13523R(t, R, C2);
                m13764e0(t, i);
            }
        }
    }

    /* renamed from: L */
    private void m13745L(T t, T t2, int i) {
        Object obj;
        int i0 = m13768i0(i);
        int Q = m13750Q(i);
        long R = m13751R(i0);
        if (m13738E(t2, Q, i)) {
            if (m13738E(t, Q, i)) {
                obj = C7142o1.m13508C(t, R);
            } else {
                obj = null;
            }
            Object C = C7142o1.m13508C(t2, R);
            if (obj != null && C != null) {
                C7142o1.m13523R(t, R, C7196z.m13951h(obj, C));
                m13765f0(t, Q, i);
            } else if (C != null) {
                C7142o1.m13523R(t, R, C);
                m13765f0(t, Q, i);
            }
        }
    }

    /* renamed from: M */
    private void m13746M(T t, T t2, int i) {
        int i0 = m13768i0(i);
        long R = m13751R(i0);
        int Q = m13750Q(i);
        switch (m13767h0(i0)) {
            case 0:
                if (m13790y(t2, i)) {
                    C7142o1.m13519N(t, R, C7142o1.m13549x(t2, R));
                    m13764e0(t, i);
                    return;
                }
                return;
            case 1:
                if (m13790y(t2, i)) {
                    C7142o1.m13520O(t, R, C7142o1.m13550y(t2, R));
                    m13764e0(t, i);
                    return;
                }
                return;
            case 2:
                if (m13790y(t2, i)) {
                    C7142o1.m13522Q(t, R, C7142o1.m13506A(t2, R));
                    m13764e0(t, i);
                    return;
                }
                return;
            case 3:
                if (m13790y(t2, i)) {
                    C7142o1.m13522Q(t, R, C7142o1.m13506A(t2, R));
                    m13764e0(t, i);
                    return;
                }
                return;
            case 4:
                if (m13790y(t2, i)) {
                    C7142o1.m13521P(t, R, C7142o1.m13551z(t2, R));
                    m13764e0(t, i);
                    return;
                }
                return;
            case 5:
                if (m13790y(t2, i)) {
                    C7142o1.m13522Q(t, R, C7142o1.m13506A(t2, R));
                    m13764e0(t, i);
                    return;
                }
                return;
            case 6:
                if (m13790y(t2, i)) {
                    C7142o1.m13521P(t, R, C7142o1.m13551z(t2, R));
                    m13764e0(t, i);
                    return;
                }
                return;
            case 7:
                if (m13790y(t2, i)) {
                    C7142o1.m13513H(t, R, C7142o1.m13543r(t2, R));
                    m13764e0(t, i);
                    return;
                }
                return;
            case 8:
                if (m13790y(t2, i)) {
                    C7142o1.m13523R(t, R, C7142o1.m13508C(t2, R));
                    m13764e0(t, i);
                    return;
                }
                return;
            case 9:
                m13744K(t, t2, i);
                return;
            case 10:
                if (m13790y(t2, i)) {
                    C7142o1.m13523R(t, R, C7142o1.m13508C(t2, R));
                    m13764e0(t, i);
                    return;
                }
                return;
            case 11:
                if (m13790y(t2, i)) {
                    C7142o1.m13521P(t, R, C7142o1.m13551z(t2, R));
                    m13764e0(t, i);
                    return;
                }
                return;
            case 12:
                if (m13790y(t2, i)) {
                    C7142o1.m13521P(t, R, C7142o1.m13551z(t2, R));
                    m13764e0(t, i);
                    return;
                }
                return;
            case 13:
                if (m13790y(t2, i)) {
                    C7142o1.m13521P(t, R, C7142o1.m13551z(t2, R));
                    m13764e0(t, i);
                    return;
                }
                return;
            case 14:
                if (m13790y(t2, i)) {
                    C7142o1.m13522Q(t, R, C7142o1.m13506A(t2, R));
                    m13764e0(t, i);
                    return;
                }
                return;
            case 15:
                if (m13790y(t2, i)) {
                    C7142o1.m13521P(t, R, C7142o1.m13551z(t2, R));
                    m13764e0(t, i);
                    return;
                }
                return;
            case 16:
                if (m13790y(t2, i)) {
                    C7142o1.m13522Q(t, R, C7142o1.m13506A(t2, R));
                    m13764e0(t, i);
                    return;
                }
                return;
            case 17:
                m13744K(t, t2, i);
                return;
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
                this.f9751n.mo40300d(t, t2, R);
                return;
            case 50:
                C7085g1.m13001F(this.f9754q, t, t2, R);
                return;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (m13738E(t2, Q, i)) {
                    C7142o1.m13523R(t, R, C7142o1.m13508C(t2, R));
                    m13765f0(t, Q, i);
                    return;
                }
                return;
            case 60:
                m13745L(t, t2, i);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (m13738E(t2, Q, i)) {
                    C7142o1.m13523R(t, R, C7142o1.m13508C(t2, R));
                    m13765f0(t, Q, i);
                    return;
                }
                return;
            case 68:
                m13745L(t, t2, i);
                return;
            default:
                return;
        }
    }

    /* renamed from: N */
    static <T> C7173s0<T> m13747N(Class<T> cls, C7135n0 n0Var, C7181u0 u0Var, C7078f0 f0Var, C7127k1<?, ?> k1Var, C7148p<?> pVar, C7126k0 k0Var) {
        if (n0Var instanceof C7068c1) {
            return m13749P((C7068c1) n0Var, u0Var, f0Var, k1Var, pVar, k0Var);
        }
        return m13748O((C7117i1) n0Var, u0Var, f0Var, k1Var, pVar, k0Var);
    }

    /* renamed from: O */
    static <T> C7173s0<T> m13748O(C7117i1 i1Var, C7181u0 u0Var, C7078f0 f0Var, C7127k1<?, ?> k1Var, C7148p<?> pVar, C7126k0 k0Var) {
        boolean z;
        if (i1Var.mo40211c() == C7206z0.PROTO3) {
            z = true;
        } else {
            z = false;
        }
        C7172s[] e = i1Var.mo40443e();
        if (e.length == 0) {
            int length = e.length;
            int[] iArr = new int[(length * 3)];
            Object[] objArr = new Object[(length * 2)];
            if (e.length <= 0) {
                int[] d = i1Var.mo40442d();
                if (d == null) {
                    d = f9736r;
                }
                if (e.length <= 0) {
                    int[] iArr2 = f9736r;
                    int[] iArr3 = f9736r;
                    int[] iArr4 = new int[(d.length + iArr2.length + iArr3.length)];
                    System.arraycopy(d, 0, iArr4, 0, d.length);
                    System.arraycopy(iArr2, 0, iArr4, d.length, iArr2.length);
                    System.arraycopy(iArr3, 0, iArr4, d.length + iArr2.length, iArr3.length);
                    return new C7173s0(iArr, objArr, 0, 0, i1Var.mo40210b(), z, true, iArr4, d.length, d.length + iArr2.length, u0Var, f0Var, k1Var, pVar, k0Var);
                }
                C7172s sVar = e[0];
                throw null;
            }
            C7172s sVar2 = e[0];
            throw null;
        }
        C7172s sVar3 = e[0];
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:119:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x031d  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x036d  */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> com.google.protobuf.C7173s0<T> m13749P(com.google.protobuf.C7068c1 r34, com.google.protobuf.C7181u0 r35, com.google.protobuf.C7078f0 r36, com.google.protobuf.C7127k1<?, ?> r37, com.google.protobuf.C7148p<?> r38, com.google.protobuf.C7126k0 r39) {
        /*
            com.google.protobuf.z0 r0 = r34.mo40211c()
            com.google.protobuf.z0 r1 = com.google.protobuf.C7206z0.PROTO3
            r2 = 0
            if (r0 != r1) goto L_0x000b
            r10 = 1
            goto L_0x000c
        L_0x000b:
            r10 = r2
        L_0x000c:
            java.lang.String r0 = r34.mo40213e()
            int r1 = r0.length()
            char r4 = r0.charAt(r2)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L_0x0028
            r4 = 1
        L_0x001e:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0029
            r4 = r6
            goto L_0x001e
        L_0x0028:
            r6 = 1
        L_0x0029:
            int r4 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0048
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0035:
            int r9 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0045
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r8
            r6 = r6 | r4
            int r8 = r8 + 13
            r4 = r9
            goto L_0x0035
        L_0x0045:
            int r4 = r4 << r8
            r6 = r6 | r4
            r4 = r9
        L_0x0048:
            if (r6 != 0) goto L_0x0058
            int[] r6 = f9736r
            r8 = r2
            r9 = r8
            r11 = r9
            r12 = r11
            r14 = r12
            r16 = r14
            r13 = r6
            r6 = r16
            goto L_0x0162
        L_0x0058:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0077
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0064:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0074
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r8
            r4 = r4 | r6
            int r8 = r8 + 13
            r6 = r9
            goto L_0x0064
        L_0x0074:
            int r6 = r6 << r8
            r4 = r4 | r6
            r6 = r9
        L_0x0077:
            int r8 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0096
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0083:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x0093
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r6 = r6 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x0083
        L_0x0093:
            int r8 = r8 << r9
            r6 = r6 | r8
            r8 = r11
        L_0x0096:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x00b5
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a2:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00b2
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x00a2
        L_0x00b2:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00b5:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00d4
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00c1:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00d1
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00c1
        L_0x00d1:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00d4:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00f3
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00e0:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x00f0
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00e0
        L_0x00f0:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00f3:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0112
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00ff:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x010f
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00ff
        L_0x010f:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0112:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0133
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x011e:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x012f
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x011e
        L_0x012f:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0133:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x0156
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x013f:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r5) goto L_0x0151
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x013f
        L_0x0151:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0156:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int[] r13 = new int[r13]
            int r16 = r4 * 2
            int r16 = r16 + r6
            r6 = r4
            r4 = r15
        L_0x0162:
            sun.misc.Unsafe r15 = f9737s
            java.lang.Object[] r17 = r34.mo40212d()
            com.google.protobuf.p0 r18 = r34.mo40210b()
            java.lang.Class r2 = r18.getClass()
            int r7 = r11 * 3
            int[] r7 = new int[r7]
            int r11 = r11 * 2
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r20 = r14 + r12
            r22 = r14
            r23 = r20
            r12 = 0
            r21 = 0
        L_0x0181:
            if (r4 >= r1) goto L_0x03bd
            int r24 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x01a9
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r3 = r24
            r24 = 13
        L_0x0191:
            int r26 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x01a3
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r24
            r4 = r4 | r3
            int r24 = r24 + 13
            r3 = r26
            goto L_0x0191
        L_0x01a3:
            int r3 = r3 << r24
            r4 = r4 | r3
            r3 = r26
            goto L_0x01ab
        L_0x01a9:
            r3 = r24
        L_0x01ab:
            int r24 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x01d8
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r5 = r24
            r24 = 13
        L_0x01b9:
            int r27 = r5 + 1
            char r5 = r0.charAt(r5)
            r28 = r1
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r1) goto L_0x01d2
            r1 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r24
            r3 = r3 | r1
            int r24 = r24 + 13
            r5 = r27
            r1 = r28
            goto L_0x01b9
        L_0x01d2:
            int r1 = r5 << r24
            r3 = r3 | r1
            r1 = r27
            goto L_0x01dc
        L_0x01d8:
            r28 = r1
            r1 = r24
        L_0x01dc:
            r5 = r3 & 255(0xff, float:3.57E-43)
            r24 = r14
            r14 = r3 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x01e9
            int r14 = r12 + 1
            r13[r12] = r21
            r12 = r14
        L_0x01e9:
            r14 = 51
            r30 = r12
            if (r5 < r14) goto L_0x0286
            int r14 = r1 + 1
            char r1 = r0.charAt(r1)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r12) goto L_0x0218
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r32 = 13
        L_0x01fe:
            int r33 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r12) goto L_0x0213
            r12 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r32
            r1 = r1 | r12
            int r32 = r32 + 13
            r14 = r33
            r12 = 55296(0xd800, float:7.7486E-41)
            goto L_0x01fe
        L_0x0213:
            int r12 = r14 << r32
            r1 = r1 | r12
            r14 = r33
        L_0x0218:
            int r12 = r5 + -51
            r32 = r14
            r14 = 9
            if (r12 == r14) goto L_0x0238
            r14 = 17
            if (r12 != r14) goto L_0x0225
            goto L_0x0238
        L_0x0225:
            r14 = 12
            if (r12 != r14) goto L_0x0246
            if (r10 != 0) goto L_0x0246
            int r12 = r21 / 3
            int r12 = r12 * 2
            r14 = 1
            int r12 = r12 + r14
            int r14 = r16 + 1
            r16 = r17[r16]
            r11[r12] = r16
            goto L_0x0244
        L_0x0238:
            int r12 = r21 / 3
            int r12 = r12 * 2
            r14 = 1
            int r12 = r12 + r14
            int r14 = r16 + 1
            r16 = r17[r16]
            r11[r12] = r16
        L_0x0244:
            r16 = r14
        L_0x0246:
            int r1 = r1 * 2
            r12 = r17[r1]
            boolean r14 = r12 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0251
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x0259
        L_0x0251:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = m13763d0(r2, r12)
            r17[r1] = r12
        L_0x0259:
            r14 = r8
            r33 = r9
            long r8 = r15.objectFieldOffset(r12)
            int r8 = (int) r8
            int r1 = r1 + 1
            r9 = r17[r1]
            boolean r12 = r9 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x026c
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L_0x0274
        L_0x026c:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = m13763d0(r2, r9)
            r17[r1] = r9
        L_0x0274:
            r1 = r8
            long r8 = r15.objectFieldOffset(r9)
            int r8 = (int) r8
            r31 = r0
            r9 = r8
            r0 = r10
            r29 = r32
            r25 = 1
            r8 = r1
            r1 = 0
            goto L_0x0386
        L_0x0286:
            r14 = r8
            r33 = r9
            int r8 = r16 + 1
            r9 = r17[r16]
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = m13763d0(r2, r9)
            r12 = 9
            if (r5 == r12) goto L_0x02fe
            r12 = 17
            if (r5 != r12) goto L_0x029c
            goto L_0x02fe
        L_0x029c:
            r12 = 27
            if (r5 == r12) goto L_0x02ed
            r12 = 49
            if (r5 != r12) goto L_0x02a5
            goto L_0x02ed
        L_0x02a5:
            r12 = 12
            if (r5 == r12) goto L_0x02dc
            r12 = 30
            if (r5 == r12) goto L_0x02dc
            r12 = 44
            if (r5 != r12) goto L_0x02b2
            goto L_0x02dc
        L_0x02b2:
            r12 = 50
            if (r5 != r12) goto L_0x02d2
            int r12 = r22 + 1
            r13[r22] = r21
            int r22 = r21 / 3
            int r22 = r22 * 2
            int r27 = r8 + 1
            r8 = r17[r8]
            r11[r22] = r8
            r8 = r3 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x02d5
            int r22 = r22 + 1
            int r8 = r27 + 1
            r27 = r17[r27]
            r11[r22] = r27
            r22 = r12
        L_0x02d2:
            r25 = 1
            goto L_0x030c
        L_0x02d5:
            r22 = r12
            r12 = r27
            r25 = 1
            goto L_0x030d
        L_0x02dc:
            if (r10 != 0) goto L_0x02d2
            int r12 = r21 / 3
            int r12 = r12 * 2
            r25 = 1
            int r12 = r12 + 1
            int r27 = r8 + 1
            r8 = r17[r8]
            r11[r12] = r8
            goto L_0x02fb
        L_0x02ed:
            r25 = 1
            int r12 = r21 / 3
            int r12 = r12 * 2
            int r12 = r12 + 1
            int r27 = r8 + 1
            r8 = r17[r8]
            r11[r12] = r8
        L_0x02fb:
            r12 = r27
            goto L_0x030d
        L_0x02fe:
            r25 = 1
            int r12 = r21 / 3
            int r12 = r12 * 2
            int r12 = r12 + 1
            java.lang.Class r27 = r9.getType()
            r11[r12] = r27
        L_0x030c:
            r12 = r8
        L_0x030d:
            long r8 = r15.objectFieldOffset(r9)
            int r8 = (int) r8
            r9 = r3 & 4096(0x1000, float:5.74E-42)
            r27 = r12
            r12 = 4096(0x1000, float:5.74E-42)
            if (r9 != r12) goto L_0x031d
            r9 = r25
            goto L_0x031e
        L_0x031d:
            r9 = 0
        L_0x031e:
            if (r9 == 0) goto L_0x036d
            r9 = 17
            if (r5 > r9) goto L_0x036d
            int r9 = r1 + 1
            char r1 = r0.charAt(r1)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r12) goto L_0x0349
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r26 = 13
        L_0x0333:
            int r29 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r12) goto L_0x0345
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r26
            r1 = r1 | r9
            int r26 = r26 + 13
            r9 = r29
            goto L_0x0333
        L_0x0345:
            int r9 = r9 << r26
            r1 = r1 | r9
            goto L_0x034b
        L_0x0349:
            r29 = r9
        L_0x034b:
            int r9 = r6 * 2
            int r26 = r1 / 32
            int r9 = r9 + r26
            r12 = r17[r9]
            r31 = r0
            boolean r0 = r12 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x035c
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x0364
        L_0x035c:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = m13763d0(r2, r12)
            r17[r9] = r12
        L_0x0364:
            r0 = r10
            long r9 = r15.objectFieldOffset(r12)
            int r9 = (int) r9
            int r1 = r1 % 32
            goto L_0x0376
        L_0x036d:
            r31 = r0
            r0 = r10
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r29 = r1
            r1 = 0
        L_0x0376:
            r10 = 18
            if (r5 < r10) goto L_0x0384
            r10 = 49
            if (r5 > r10) goto L_0x0384
            int r10 = r23 + 1
            r13[r23] = r8
            r23 = r10
        L_0x0384:
            r16 = r27
        L_0x0386:
            int r10 = r21 + 1
            r7[r21] = r4
            int r4 = r10 + 1
            r12 = r3 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0393
            r12 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0394
        L_0x0393:
            r12 = 0
        L_0x0394:
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x039b
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x039c
        L_0x039b:
            r3 = 0
        L_0x039c:
            r3 = r3 | r12
            int r5 = r5 << 20
            r3 = r3 | r5
            r3 = r3 | r8
            r7[r10] = r3
            int r21 = r4 + 1
            int r1 = r1 << 20
            r1 = r1 | r9
            r7[r4] = r1
            r10 = r0
            r8 = r14
            r14 = r24
            r1 = r28
            r4 = r29
            r12 = r30
            r0 = r31
            r9 = r33
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0181
        L_0x03bd:
            r33 = r9
            r0 = r10
            r24 = r14
            r14 = r8
            com.google.protobuf.s0 r1 = new com.google.protobuf.s0
            com.google.protobuf.p0 r9 = r34.mo40210b()
            r2 = 0
            r4 = r1
            r5 = r7
            r6 = r11
            r7 = r14
            r8 = r33
            r11 = r2
            r12 = r13
            r13 = r24
            r14 = r20
            r15 = r35
            r16 = r36
            r17 = r37
            r18 = r38
            r19 = r39
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7173s0.m13749P(com.google.protobuf.c1, com.google.protobuf.u0, com.google.protobuf.f0, com.google.protobuf.k1, com.google.protobuf.p, com.google.protobuf.k0):com.google.protobuf.s0");
    }

    /* renamed from: Q */
    private int m13750Q(int i) {
        return this.f9738a[i];
    }

    /* renamed from: R */
    private static long m13751R(int i) {
        return (long) (i & 1048575);
    }

    /* renamed from: S */
    private static <T> boolean m13752S(T t, long j) {
        return ((Boolean) C7142o1.m13508C(t, j)).booleanValue();
    }

    /* renamed from: T */
    private static <T> double m13753T(T t, long j) {
        return ((Double) C7142o1.m13508C(t, j)).doubleValue();
    }

    /* renamed from: U */
    private static <T> float m13754U(T t, long j) {
        return ((Float) C7142o1.m13508C(t, j)).floatValue();
    }

    /* renamed from: V */
    private static <T> int m13755V(T t, long j) {
        return ((Integer) C7142o1.m13508C(t, j)).intValue();
    }

    /* renamed from: W */
    private static <T> long m13756W(T t, long j) {
        return ((Long) C7142o1.m13508C(t, j)).longValue();
    }

    /* renamed from: X */
    private int m13757X(int i) {
        if (i < this.f9740c || i > this.f9741d) {
            return -1;
        }
        return m13766g0(i, 0);
    }

    /* renamed from: Y */
    private int m13758Y(int i) {
        return this.f9738a[i + 2];
    }

    /* renamed from: Z */
    private <E> void m13759Z(Object obj, long j, C7071d1 d1Var, C7076e1<E> e1Var, C7139o oVar) {
        d1Var.mo40247f(this.f9751n.mo40301e(obj, j), e1Var, oVar);
    }

    /* renamed from: a0 */
    private <E> void m13760a0(Object obj, int i, C7071d1 d1Var, C7076e1<E> e1Var, C7139o oVar) {
        d1Var.mo40253k(this.f9751n.mo40301e(obj, m13751R(i)), e1Var, oVar);
    }

    /* renamed from: b0 */
    private void m13761b0(Object obj, int i, C7071d1 d1Var) {
        if (m13789x(i)) {
            C7142o1.m13523R(obj, m13751R(i), d1Var.mo40240N());
        } else if (this.f9744g) {
            C7142o1.m13523R(obj, m13751R(i), d1Var.mo40269y());
        } else {
            C7142o1.m13523R(obj, m13751R(i), d1Var.mo40232F());
        }
    }

    /* renamed from: c0 */
    private void m13762c0(Object obj, int i, C7071d1 d1Var) {
        if (m13789x(i)) {
            d1Var.mo40231E(this.f9751n.mo40301e(obj, m13751R(i)));
        } else {
            d1Var.mo40228B(this.f9751n.mo40301e(obj, m13751R(i)));
        }
    }

    /* renamed from: d0 */
    private static Field m13763d0(Class<?> cls, String str) {
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

    /* renamed from: e0 */
    private void m13764e0(T t, int i) {
        int Y = m13758Y(i);
        long j = (long) (1048575 & Y);
        if (j != 1048575) {
            C7142o1.m13521P(t, j, (1 << (Y >>> 20)) | C7142o1.m13551z(t, j));
        }
    }

    /* renamed from: f0 */
    private void m13765f0(T t, int i, int i2) {
        C7142o1.m13521P(t, (long) (m13758Y(i2) & 1048575), i);
    }

    /* renamed from: g0 */
    private int m13766g0(int i, int i2) {
        int length = (this.f9738a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int Q = m13750Q(i4);
            if (i == Q) {
                return i4;
            }
            if (i < Q) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: h0 */
    private static int m13767h0(int i) {
        return (i & 267386880) >>> 20;
    }

    /* renamed from: i0 */
    private int m13768i0(int i) {
        return this.f9738a[i + 1];
    }

    /* renamed from: j */
    private boolean m13769j(T t, T t2, int i) {
        if (m13790y(t, i) == m13790y(t2, i)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:168:0x048f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* renamed from: j0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m13770j0(T r18, com.google.protobuf.C7170r1 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.f9743f
            if (r3 == 0) goto L_0x0021
            com.google.protobuf.p<?> r3 = r0.f9753p
            com.google.protobuf.t r3 = r3.mo40617c(r1)
            boolean r5 = r3.mo40649n()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.mo40652s()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0023
        L_0x0021:
            r3 = 0
            r5 = 0
        L_0x0023:
            int[] r6 = r0.f9738a
            int r6 = r6.length
            sun.misc.Unsafe r7 = f9737s
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r11 = r8
            r10 = 0
            r12 = 0
        L_0x002e:
            if (r10 >= r6) goto L_0x048d
            int r13 = r0.m13768i0(r10)
            int r14 = r0.m13750Q(r10)
            int r15 = m13767h0(r13)
            r4 = 17
            if (r15 > r4) goto L_0x0056
            int[] r4 = r0.f9738a
            int r16 = r10 + 2
            r4 = r4[r16]
            r9 = r4 & r8
            if (r9 == r11) goto L_0x0050
            long r11 = (long) r9
            int r12 = r7.getInt(r1, r11)
            r11 = r9
        L_0x0050:
            int r4 = r4 >>> 20
            r9 = 1
            int r4 = r9 << r4
            goto L_0x0057
        L_0x0056:
            r4 = 0
        L_0x0057:
            if (r5 == 0) goto L_0x0075
            com.google.protobuf.p<?> r9 = r0.f9753p
            int r9 = r9.mo40615a(r5)
            if (r9 > r14) goto L_0x0075
            com.google.protobuf.p<?> r9 = r0.f9753p
            r9.mo40624j(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0073
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0057
        L_0x0073:
            r5 = 0
            goto L_0x0057
        L_0x0075:
            long r8 = m13751R(r13)
            switch(r15) {
                case 0: goto L_0x047b;
                case 1: goto L_0x046f;
                case 2: goto L_0x0463;
                case 3: goto L_0x0457;
                case 4: goto L_0x044b;
                case 5: goto L_0x043f;
                case 6: goto L_0x0433;
                case 7: goto L_0x0427;
                case 8: goto L_0x041b;
                case 9: goto L_0x040a;
                case 10: goto L_0x03fb;
                case 11: goto L_0x03ee;
                case 12: goto L_0x03e1;
                case 13: goto L_0x03d4;
                case 14: goto L_0x03c7;
                case 15: goto L_0x03ba;
                case 16: goto L_0x03ad;
                case 17: goto L_0x039c;
                case 18: goto L_0x038c;
                case 19: goto L_0x037c;
                case 20: goto L_0x036c;
                case 21: goto L_0x035c;
                case 22: goto L_0x034c;
                case 23: goto L_0x033c;
                case 24: goto L_0x032c;
                case 25: goto L_0x031c;
                case 26: goto L_0x030d;
                case 27: goto L_0x02fa;
                case 28: goto L_0x02eb;
                case 29: goto L_0x02db;
                case 30: goto L_0x02cb;
                case 31: goto L_0x02bb;
                case 32: goto L_0x02ab;
                case 33: goto L_0x029b;
                case 34: goto L_0x028b;
                case 35: goto L_0x027b;
                case 36: goto L_0x026b;
                case 37: goto L_0x025b;
                case 38: goto L_0x024b;
                case 39: goto L_0x023b;
                case 40: goto L_0x022b;
                case 41: goto L_0x021b;
                case 42: goto L_0x020b;
                case 43: goto L_0x01fb;
                case 44: goto L_0x01eb;
                case 45: goto L_0x01db;
                case 46: goto L_0x01cb;
                case 47: goto L_0x01bb;
                case 48: goto L_0x01ab;
                case 49: goto L_0x0198;
                case 50: goto L_0x018f;
                case 51: goto L_0x0180;
                case 52: goto L_0x0171;
                case 53: goto L_0x0162;
                case 54: goto L_0x0153;
                case 55: goto L_0x0144;
                case 56: goto L_0x0135;
                case 57: goto L_0x0126;
                case 58: goto L_0x0117;
                case 59: goto L_0x0108;
                case 60: goto L_0x00f5;
                case 61: goto L_0x00e5;
                case 62: goto L_0x00d7;
                case 63: goto L_0x00c9;
                case 64: goto L_0x00bb;
                case 65: goto L_0x00ad;
                case 66: goto L_0x009f;
                case 67: goto L_0x0091;
                case 68: goto L_0x007f;
                default: goto L_0x007c;
            }
        L_0x007c:
            r13 = 0
            goto L_0x0486
        L_0x007f:
            boolean r4 = r0.m13738E(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.e1 r8 = r0.m13784s(r10)
            r2.mo40491s(r14, r4, r8)
            goto L_0x007c
        L_0x0091:
            boolean r4 = r0.m13738E(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            long r8 = m13756W(r1, r8)
            r2.mo40463F(r14, r8)
            goto L_0x007c
        L_0x009f:
            boolean r4 = r0.m13738E(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            int r4 = m13755V(r1, r8)
            r2.mo40471N(r14, r4)
            goto L_0x007c
        L_0x00ad:
            boolean r4 = r0.m13738E(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            long r8 = m13756W(r1, r8)
            r2.mo40498z(r14, r8)
            goto L_0x007c
        L_0x00bb:
            boolean r4 = r0.m13738E(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            int r4 = m13755V(r1, r8)
            r2.mo40492t(r14, r4)
            goto L_0x007c
        L_0x00c9:
            boolean r4 = r0.m13738E(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            int r4 = m13755V(r1, r8)
            r2.mo40467J(r14, r4)
            goto L_0x007c
        L_0x00d7:
            boolean r4 = r0.m13738E(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            int r4 = m13755V(r1, r8)
            r2.mo40476d(r14, r4)
            goto L_0x007c
        L_0x00e5:
            boolean r4 = r0.m13738E(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.h r4 = (com.google.protobuf.C7086h) r4
            r2.mo40494v(r14, r4)
            goto L_0x007c
        L_0x00f5:
            boolean r4 = r0.m13738E(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.e1 r8 = r0.m13784s(r10)
            r2.mo40482j(r14, r4, r8)
            goto L_0x007c
        L_0x0108:
            boolean r4 = r0.m13738E(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.m13778n0(r14, r4, r2)
            goto L_0x007c
        L_0x0117:
            boolean r4 = r0.m13738E(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            boolean r4 = m13752S(r1, r8)
            r2.mo40490r(r14, r4)
            goto L_0x007c
        L_0x0126:
            boolean r4 = r0.m13738E(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            int r4 = m13755V(r1, r8)
            r2.mo40478f(r14, r4)
            goto L_0x007c
        L_0x0135:
            boolean r4 = r0.m13738E(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            long r8 = m13756W(r1, r8)
            r2.mo40483k(r14, r8)
            goto L_0x007c
        L_0x0144:
            boolean r4 = r0.m13738E(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            int r4 = m13755V(r1, r8)
            r2.mo40495w(r14, r4)
            goto L_0x007c
        L_0x0153:
            boolean r4 = r0.m13738E(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            long r8 = m13756W(r1, r8)
            r2.mo40487o(r14, r8)
            goto L_0x007c
        L_0x0162:
            boolean r4 = r0.m13738E(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            long r8 = m13756W(r1, r8)
            r2.mo40489q(r14, r8)
            goto L_0x007c
        L_0x0171:
            boolean r4 = r0.m13738E(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            float r4 = m13754U(r1, r8)
            r2.mo40464G(r14, r4)
            goto L_0x007c
        L_0x0180:
            boolean r4 = r0.m13738E(r1, r14, r10)
            if (r4 == 0) goto L_0x007c
            double r8 = m13753T(r1, r8)
            r2.mo40479g(r14, r8)
            goto L_0x007c
        L_0x018f:
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.m13776m0(r2, r14, r4, r10)
            goto L_0x007c
        L_0x0198:
            int r4 = r0.m13750Q(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.e1 r9 = r0.m13784s(r10)
            com.google.protobuf.C7085g1.m13016U(r4, r8, r2, r9)
            goto L_0x007c
        L_0x01ab:
            int r4 = r0.m13750Q(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r13 = 1
            com.google.protobuf.C7085g1.m13025b0(r4, r8, r2, r13)
            goto L_0x007c
        L_0x01bb:
            r13 = 1
            int r4 = r0.m13750Q(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C7085g1.m13023a0(r4, r8, r2, r13)
            goto L_0x007c
        L_0x01cb:
            r13 = 1
            int r4 = r0.m13750Q(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C7085g1.m13021Z(r4, r8, r2, r13)
            goto L_0x007c
        L_0x01db:
            r13 = 1
            int r4 = r0.m13750Q(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C7085g1.m13020Y(r4, r8, r2, r13)
            goto L_0x007c
        L_0x01eb:
            r13 = 1
            int r4 = r0.m13750Q(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C7085g1.m13012Q(r4, r8, r2, r13)
            goto L_0x007c
        L_0x01fb:
            r13 = 1
            int r4 = r0.m13750Q(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C7085g1.m13029d0(r4, r8, r2, r13)
            goto L_0x007c
        L_0x020b:
            r13 = 1
            int r4 = r0.m13750Q(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C7085g1.m13009N(r4, r8, r2, r13)
            goto L_0x007c
        L_0x021b:
            r13 = 1
            int r4 = r0.m13750Q(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C7085g1.m13013R(r4, r8, r2, r13)
            goto L_0x007c
        L_0x022b:
            r13 = 1
            int r4 = r0.m13750Q(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C7085g1.m13014S(r4, r8, r2, r13)
            goto L_0x007c
        L_0x023b:
            r13 = 1
            int r4 = r0.m13750Q(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C7085g1.m13017V(r4, r8, r2, r13)
            goto L_0x007c
        L_0x024b:
            r13 = 1
            int r4 = r0.m13750Q(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C7085g1.m13031e0(r4, r8, r2, r13)
            goto L_0x007c
        L_0x025b:
            r13 = 1
            int r4 = r0.m13750Q(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C7085g1.m13018W(r4, r8, r2, r13)
            goto L_0x007c
        L_0x026b:
            r13 = 1
            int r4 = r0.m13750Q(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C7085g1.m13015T(r4, r8, r2, r13)
            goto L_0x007c
        L_0x027b:
            r13 = 1
            int r4 = r0.m13750Q(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C7085g1.m13011P(r4, r8, r2, r13)
            goto L_0x007c
        L_0x028b:
            int r4 = r0.m13750Q(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.google.protobuf.C7085g1.m13025b0(r4, r8, r2, r13)
            goto L_0x0486
        L_0x029b:
            r13 = 0
            int r4 = r0.m13750Q(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C7085g1.m13023a0(r4, r8, r2, r13)
            goto L_0x0486
        L_0x02ab:
            r13 = 0
            int r4 = r0.m13750Q(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C7085g1.m13021Z(r4, r8, r2, r13)
            goto L_0x0486
        L_0x02bb:
            r13 = 0
            int r4 = r0.m13750Q(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C7085g1.m13020Y(r4, r8, r2, r13)
            goto L_0x0486
        L_0x02cb:
            r13 = 0
            int r4 = r0.m13750Q(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C7085g1.m13012Q(r4, r8, r2, r13)
            goto L_0x0486
        L_0x02db:
            r13 = 0
            int r4 = r0.m13750Q(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C7085g1.m13029d0(r4, r8, r2, r13)
            goto L_0x0486
        L_0x02eb:
            int r4 = r0.m13750Q(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C7085g1.m13010O(r4, r8, r2)
            goto L_0x007c
        L_0x02fa:
            int r4 = r0.m13750Q(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.e1 r9 = r0.m13784s(r10)
            com.google.protobuf.C7085g1.m13019X(r4, r8, r2, r9)
            goto L_0x007c
        L_0x030d:
            int r4 = r0.m13750Q(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C7085g1.m13027c0(r4, r8, r2)
            goto L_0x007c
        L_0x031c:
            int r4 = r0.m13750Q(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.google.protobuf.C7085g1.m13009N(r4, r8, r2, r13)
            goto L_0x0486
        L_0x032c:
            r13 = 0
            int r4 = r0.m13750Q(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C7085g1.m13013R(r4, r8, r2, r13)
            goto L_0x0486
        L_0x033c:
            r13 = 0
            int r4 = r0.m13750Q(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C7085g1.m13014S(r4, r8, r2, r13)
            goto L_0x0486
        L_0x034c:
            r13 = 0
            int r4 = r0.m13750Q(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C7085g1.m13017V(r4, r8, r2, r13)
            goto L_0x0486
        L_0x035c:
            r13 = 0
            int r4 = r0.m13750Q(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C7085g1.m13031e0(r4, r8, r2, r13)
            goto L_0x0486
        L_0x036c:
            r13 = 0
            int r4 = r0.m13750Q(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C7085g1.m13018W(r4, r8, r2, r13)
            goto L_0x0486
        L_0x037c:
            r13 = 0
            int r4 = r0.m13750Q(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C7085g1.m13015T(r4, r8, r2, r13)
            goto L_0x0486
        L_0x038c:
            r13 = 0
            int r4 = r0.m13750Q(r10)
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C7085g1.m13011P(r4, r8, r2, r13)
            goto L_0x0486
        L_0x039c:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.e1 r8 = r0.m13784s(r10)
            r2.mo40491s(r14, r4, r8)
            goto L_0x0486
        L_0x03ad:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            long r8 = r7.getLong(r1, r8)
            r2.mo40463F(r14, r8)
            goto L_0x0486
        L_0x03ba:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            int r4 = r7.getInt(r1, r8)
            r2.mo40471N(r14, r4)
            goto L_0x0486
        L_0x03c7:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            long r8 = r7.getLong(r1, r8)
            r2.mo40498z(r14, r8)
            goto L_0x0486
        L_0x03d4:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            int r4 = r7.getInt(r1, r8)
            r2.mo40492t(r14, r4)
            goto L_0x0486
        L_0x03e1:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            int r4 = r7.getInt(r1, r8)
            r2.mo40467J(r14, r4)
            goto L_0x0486
        L_0x03ee:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            int r4 = r7.getInt(r1, r8)
            r2.mo40476d(r14, r4)
            goto L_0x0486
        L_0x03fb:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.h r4 = (com.google.protobuf.C7086h) r4
            r2.mo40494v(r14, r4)
            goto L_0x0486
        L_0x040a:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.google.protobuf.e1 r8 = r0.m13784s(r10)
            r2.mo40482j(r14, r4, r8)
            goto L_0x0486
        L_0x041b:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.m13778n0(r14, r4, r2)
            goto L_0x0486
        L_0x0427:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            boolean r4 = m13771k(r1, r8)
            r2.mo40490r(r14, r4)
            goto L_0x0486
        L_0x0433:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            int r4 = r7.getInt(r1, r8)
            r2.mo40478f(r14, r4)
            goto L_0x0486
        L_0x043f:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            long r8 = r7.getLong(r1, r8)
            r2.mo40483k(r14, r8)
            goto L_0x0486
        L_0x044b:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            int r4 = r7.getInt(r1, r8)
            r2.mo40495w(r14, r4)
            goto L_0x0486
        L_0x0457:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            long r8 = r7.getLong(r1, r8)
            r2.mo40487o(r14, r8)
            goto L_0x0486
        L_0x0463:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            long r8 = r7.getLong(r1, r8)
            r2.mo40489q(r14, r8)
            goto L_0x0486
        L_0x046f:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            float r4 = m13781p(r1, r8)
            r2.mo40464G(r14, r4)
            goto L_0x0486
        L_0x047b:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0486
            double r8 = m13773l(r1, r8)
            r2.mo40479g(r14, r8)
        L_0x0486:
            int r10 = r10 + 3
            r8 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x002e
        L_0x048d:
            if (r5 == 0) goto L_0x04a4
            com.google.protobuf.p<?> r4 = r0.f9753p
            r4.mo40624j(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04a2
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r5 = r4
            goto L_0x048d
        L_0x04a2:
            r5 = 0
            goto L_0x048d
        L_0x04a4:
            com.google.protobuf.k1<?, ?> r3 = r0.f9752o
            r0.m13780o0(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7173s0.m13770j0(java.lang.Object, com.google.protobuf.r1):void");
    }

    /* renamed from: k */
    private static <T> boolean m13771k(T t, long j) {
        return C7142o1.m13543r(t, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x0588  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: k0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m13772k0(T r13, com.google.protobuf.C7170r1 r14) {
        /*
            r12 = this;
            boolean r0 = r12.f9743f
            r1 = 0
            if (r0 == 0) goto L_0x001c
            com.google.protobuf.p<?> r0 = r12.f9753p
            com.google.protobuf.t r0 = r0.mo40617c(r13)
            boolean r2 = r0.mo40649n()
            if (r2 != 0) goto L_0x001c
            java.util.Iterator r0 = r0.mo40652s()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x001e
        L_0x001c:
            r0 = r1
            r2 = r0
        L_0x001e:
            int[] r3 = r12.f9738a
            int r3 = r3.length
            r4 = 0
            r5 = r4
        L_0x0023:
            if (r5 >= r3) goto L_0x0586
            int r6 = r12.m13768i0(r5)
            int r7 = r12.m13750Q(r5)
        L_0x002d:
            if (r2 == 0) goto L_0x004b
            com.google.protobuf.p<?> r8 = r12.f9753p
            int r8 = r8.mo40615a(r2)
            if (r8 > r7) goto L_0x004b
            com.google.protobuf.p<?> r8 = r12.f9753p
            r8.mo40624j(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0049
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x002d
        L_0x0049:
            r2 = r1
            goto L_0x002d
        L_0x004b:
            int r8 = m13767h0(r6)
            r9 = 1
            switch(r8) {
                case 0: goto L_0x0571;
                case 1: goto L_0x055f;
                case 2: goto L_0x054d;
                case 3: goto L_0x053b;
                case 4: goto L_0x0529;
                case 5: goto L_0x0517;
                case 6: goto L_0x0505;
                case 7: goto L_0x04f2;
                case 8: goto L_0x04df;
                case 9: goto L_0x04c8;
                case 10: goto L_0x04b3;
                case 11: goto L_0x04a0;
                case 12: goto L_0x048d;
                case 13: goto L_0x047a;
                case 14: goto L_0x0467;
                case 15: goto L_0x0454;
                case 16: goto L_0x0441;
                case 17: goto L_0x042a;
                case 18: goto L_0x0417;
                case 19: goto L_0x0404;
                case 20: goto L_0x03f1;
                case 21: goto L_0x03de;
                case 22: goto L_0x03cb;
                case 23: goto L_0x03b8;
                case 24: goto L_0x03a5;
                case 25: goto L_0x0392;
                case 26: goto L_0x037f;
                case 27: goto L_0x0368;
                case 28: goto L_0x0355;
                case 29: goto L_0x0342;
                case 30: goto L_0x032f;
                case 31: goto L_0x031c;
                case 32: goto L_0x0309;
                case 33: goto L_0x02f6;
                case 34: goto L_0x02e3;
                case 35: goto L_0x02d0;
                case 36: goto L_0x02bd;
                case 37: goto L_0x02aa;
                case 38: goto L_0x0297;
                case 39: goto L_0x0284;
                case 40: goto L_0x0271;
                case 41: goto L_0x025e;
                case 42: goto L_0x024b;
                case 43: goto L_0x0238;
                case 44: goto L_0x0225;
                case 45: goto L_0x0212;
                case 46: goto L_0x01ff;
                case 47: goto L_0x01ec;
                case 48: goto L_0x01d9;
                case 49: goto L_0x01c2;
                case 50: goto L_0x01b5;
                case 51: goto L_0x01a2;
                case 52: goto L_0x018f;
                case 53: goto L_0x017c;
                case 54: goto L_0x0169;
                case 55: goto L_0x0156;
                case 56: goto L_0x0143;
                case 57: goto L_0x0130;
                case 58: goto L_0x011d;
                case 59: goto L_0x010a;
                case 60: goto L_0x00f3;
                case 61: goto L_0x00de;
                case 62: goto L_0x00cb;
                case 63: goto L_0x00b8;
                case 64: goto L_0x00a5;
                case 65: goto L_0x0092;
                case 66: goto L_0x007f;
                case 67: goto L_0x006c;
                case 68: goto L_0x0055;
                default: goto L_0x0053;
            }
        L_0x0053:
            goto L_0x0582
        L_0x0055:
            boolean r8 = r12.m13738E(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m13751R(r6)
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r13, r8)
            com.google.protobuf.e1 r8 = r12.m13784s(r5)
            r14.mo40491s(r7, r6, r8)
            goto L_0x0582
        L_0x006c:
            boolean r8 = r12.m13738E(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m13751R(r6)
            long r8 = m13756W(r13, r8)
            r14.mo40463F(r7, r8)
            goto L_0x0582
        L_0x007f:
            boolean r8 = r12.m13738E(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m13751R(r6)
            int r6 = m13755V(r13, r8)
            r14.mo40471N(r7, r6)
            goto L_0x0582
        L_0x0092:
            boolean r8 = r12.m13738E(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m13751R(r6)
            long r8 = m13756W(r13, r8)
            r14.mo40498z(r7, r8)
            goto L_0x0582
        L_0x00a5:
            boolean r8 = r12.m13738E(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m13751R(r6)
            int r6 = m13755V(r13, r8)
            r14.mo40492t(r7, r6)
            goto L_0x0582
        L_0x00b8:
            boolean r8 = r12.m13738E(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m13751R(r6)
            int r6 = m13755V(r13, r8)
            r14.mo40467J(r7, r6)
            goto L_0x0582
        L_0x00cb:
            boolean r8 = r12.m13738E(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m13751R(r6)
            int r6 = m13755V(r13, r8)
            r14.mo40476d(r7, r6)
            goto L_0x0582
        L_0x00de:
            boolean r8 = r12.m13738E(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m13751R(r6)
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r13, r8)
            com.google.protobuf.h r6 = (com.google.protobuf.C7086h) r6
            r14.mo40494v(r7, r6)
            goto L_0x0582
        L_0x00f3:
            boolean r8 = r12.m13738E(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m13751R(r6)
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r13, r8)
            com.google.protobuf.e1 r8 = r12.m13784s(r5)
            r14.mo40482j(r7, r6, r8)
            goto L_0x0582
        L_0x010a:
            boolean r8 = r12.m13738E(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m13751R(r6)
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r13, r8)
            r12.m13778n0(r7, r6, r14)
            goto L_0x0582
        L_0x011d:
            boolean r8 = r12.m13738E(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m13751R(r6)
            boolean r6 = m13752S(r13, r8)
            r14.mo40490r(r7, r6)
            goto L_0x0582
        L_0x0130:
            boolean r8 = r12.m13738E(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m13751R(r6)
            int r6 = m13755V(r13, r8)
            r14.mo40478f(r7, r6)
            goto L_0x0582
        L_0x0143:
            boolean r8 = r12.m13738E(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m13751R(r6)
            long r8 = m13756W(r13, r8)
            r14.mo40483k(r7, r8)
            goto L_0x0582
        L_0x0156:
            boolean r8 = r12.m13738E(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m13751R(r6)
            int r6 = m13755V(r13, r8)
            r14.mo40495w(r7, r6)
            goto L_0x0582
        L_0x0169:
            boolean r8 = r12.m13738E(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m13751R(r6)
            long r8 = m13756W(r13, r8)
            r14.mo40487o(r7, r8)
            goto L_0x0582
        L_0x017c:
            boolean r8 = r12.m13738E(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m13751R(r6)
            long r8 = m13756W(r13, r8)
            r14.mo40489q(r7, r8)
            goto L_0x0582
        L_0x018f:
            boolean r8 = r12.m13738E(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m13751R(r6)
            float r6 = m13754U(r13, r8)
            r14.mo40464G(r7, r6)
            goto L_0x0582
        L_0x01a2:
            boolean r8 = r12.m13738E(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m13751R(r6)
            double r8 = m13753T(r13, r8)
            r14.mo40479g(r7, r8)
            goto L_0x0582
        L_0x01b5:
            long r8 = m13751R(r6)
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r13, r8)
            r12.m13776m0(r14, r7, r6, r5)
            goto L_0x0582
        L_0x01c2:
            int r7 = r12.m13750Q(r5)
            long r8 = m13751R(r6)
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.e1 r8 = r12.m13784s(r5)
            com.google.protobuf.C7085g1.m13016U(r7, r6, r14, r8)
            goto L_0x0582
        L_0x01d9:
            int r7 = r12.m13750Q(r5)
            long r10 = m13751R(r6)
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C7085g1.m13025b0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x01ec:
            int r7 = r12.m13750Q(r5)
            long r10 = m13751R(r6)
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C7085g1.m13023a0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x01ff:
            int r7 = r12.m13750Q(r5)
            long r10 = m13751R(r6)
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C7085g1.m13021Z(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0212:
            int r7 = r12.m13750Q(r5)
            long r10 = m13751R(r6)
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C7085g1.m13020Y(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0225:
            int r7 = r12.m13750Q(r5)
            long r10 = m13751R(r6)
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C7085g1.m13012Q(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0238:
            int r7 = r12.m13750Q(r5)
            long r10 = m13751R(r6)
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C7085g1.m13029d0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x024b:
            int r7 = r12.m13750Q(r5)
            long r10 = m13751R(r6)
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C7085g1.m13009N(r7, r6, r14, r9)
            goto L_0x0582
        L_0x025e:
            int r7 = r12.m13750Q(r5)
            long r10 = m13751R(r6)
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C7085g1.m13013R(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0271:
            int r7 = r12.m13750Q(r5)
            long r10 = m13751R(r6)
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C7085g1.m13014S(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0284:
            int r7 = r12.m13750Q(r5)
            long r10 = m13751R(r6)
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C7085g1.m13017V(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0297:
            int r7 = r12.m13750Q(r5)
            long r10 = m13751R(r6)
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C7085g1.m13031e0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02aa:
            int r7 = r12.m13750Q(r5)
            long r10 = m13751R(r6)
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C7085g1.m13018W(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02bd:
            int r7 = r12.m13750Q(r5)
            long r10 = m13751R(r6)
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C7085g1.m13015T(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02d0:
            int r7 = r12.m13750Q(r5)
            long r10 = m13751R(r6)
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C7085g1.m13011P(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02e3:
            int r7 = r12.m13750Q(r5)
            long r8 = m13751R(r6)
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C7085g1.m13025b0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x02f6:
            int r7 = r12.m13750Q(r5)
            long r8 = m13751R(r6)
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C7085g1.m13023a0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0309:
            int r7 = r12.m13750Q(r5)
            long r8 = m13751R(r6)
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C7085g1.m13021Z(r7, r6, r14, r4)
            goto L_0x0582
        L_0x031c:
            int r7 = r12.m13750Q(r5)
            long r8 = m13751R(r6)
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C7085g1.m13020Y(r7, r6, r14, r4)
            goto L_0x0582
        L_0x032f:
            int r7 = r12.m13750Q(r5)
            long r8 = m13751R(r6)
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C7085g1.m13012Q(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0342:
            int r7 = r12.m13750Q(r5)
            long r8 = m13751R(r6)
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C7085g1.m13029d0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0355:
            int r7 = r12.m13750Q(r5)
            long r8 = m13751R(r6)
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C7085g1.m13010O(r7, r6, r14)
            goto L_0x0582
        L_0x0368:
            int r7 = r12.m13750Q(r5)
            long r8 = m13751R(r6)
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.e1 r8 = r12.m13784s(r5)
            com.google.protobuf.C7085g1.m13019X(r7, r6, r14, r8)
            goto L_0x0582
        L_0x037f:
            int r7 = r12.m13750Q(r5)
            long r8 = m13751R(r6)
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C7085g1.m13027c0(r7, r6, r14)
            goto L_0x0582
        L_0x0392:
            int r7 = r12.m13750Q(r5)
            long r8 = m13751R(r6)
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C7085g1.m13009N(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03a5:
            int r7 = r12.m13750Q(r5)
            long r8 = m13751R(r6)
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C7085g1.m13013R(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03b8:
            int r7 = r12.m13750Q(r5)
            long r8 = m13751R(r6)
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C7085g1.m13014S(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03cb:
            int r7 = r12.m13750Q(r5)
            long r8 = m13751R(r6)
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C7085g1.m13017V(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03de:
            int r7 = r12.m13750Q(r5)
            long r8 = m13751R(r6)
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C7085g1.m13031e0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03f1:
            int r7 = r12.m13750Q(r5)
            long r8 = m13751R(r6)
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C7085g1.m13018W(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0404:
            int r7 = r12.m13750Q(r5)
            long r8 = m13751R(r6)
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C7085g1.m13015T(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0417:
            int r7 = r12.m13750Q(r5)
            long r8 = m13751R(r6)
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.C7085g1.m13011P(r7, r6, r14, r4)
            goto L_0x0582
        L_0x042a:
            boolean r8 = r12.m13790y(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m13751R(r6)
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r13, r8)
            com.google.protobuf.e1 r8 = r12.m13784s(r5)
            r14.mo40491s(r7, r6, r8)
            goto L_0x0582
        L_0x0441:
            boolean r8 = r12.m13790y(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m13751R(r6)
            long r8 = m13741H(r13, r8)
            r14.mo40463F(r7, r8)
            goto L_0x0582
        L_0x0454:
            boolean r8 = r12.m13790y(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m13751R(r6)
            int r6 = m13788w(r13, r8)
            r14.mo40471N(r7, r6)
            goto L_0x0582
        L_0x0467:
            boolean r8 = r12.m13790y(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m13751R(r6)
            long r8 = m13741H(r13, r8)
            r14.mo40498z(r7, r8)
            goto L_0x0582
        L_0x047a:
            boolean r8 = r12.m13790y(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m13751R(r6)
            int r6 = m13788w(r13, r8)
            r14.mo40492t(r7, r6)
            goto L_0x0582
        L_0x048d:
            boolean r8 = r12.m13790y(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m13751R(r6)
            int r6 = m13788w(r13, r8)
            r14.mo40467J(r7, r6)
            goto L_0x0582
        L_0x04a0:
            boolean r8 = r12.m13790y(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m13751R(r6)
            int r6 = m13788w(r13, r8)
            r14.mo40476d(r7, r6)
            goto L_0x0582
        L_0x04b3:
            boolean r8 = r12.m13790y(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m13751R(r6)
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r13, r8)
            com.google.protobuf.h r6 = (com.google.protobuf.C7086h) r6
            r14.mo40494v(r7, r6)
            goto L_0x0582
        L_0x04c8:
            boolean r8 = r12.m13790y(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m13751R(r6)
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r13, r8)
            com.google.protobuf.e1 r8 = r12.m13784s(r5)
            r14.mo40482j(r7, r6, r8)
            goto L_0x0582
        L_0x04df:
            boolean r8 = r12.m13790y(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m13751R(r6)
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r13, r8)
            r12.m13778n0(r7, r6, r14)
            goto L_0x0582
        L_0x04f2:
            boolean r8 = r12.m13790y(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m13751R(r6)
            boolean r6 = m13771k(r13, r8)
            r14.mo40490r(r7, r6)
            goto L_0x0582
        L_0x0505:
            boolean r8 = r12.m13790y(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m13751R(r6)
            int r6 = m13788w(r13, r8)
            r14.mo40478f(r7, r6)
            goto L_0x0582
        L_0x0517:
            boolean r8 = r12.m13790y(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m13751R(r6)
            long r8 = m13741H(r13, r8)
            r14.mo40483k(r7, r8)
            goto L_0x0582
        L_0x0529:
            boolean r8 = r12.m13790y(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m13751R(r6)
            int r6 = m13788w(r13, r8)
            r14.mo40495w(r7, r6)
            goto L_0x0582
        L_0x053b:
            boolean r8 = r12.m13790y(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m13751R(r6)
            long r8 = m13741H(r13, r8)
            r14.mo40487o(r7, r8)
            goto L_0x0582
        L_0x054d:
            boolean r8 = r12.m13790y(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m13751R(r6)
            long r8 = m13741H(r13, r8)
            r14.mo40489q(r7, r8)
            goto L_0x0582
        L_0x055f:
            boolean r8 = r12.m13790y(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m13751R(r6)
            float r6 = m13781p(r13, r8)
            r14.mo40464G(r7, r6)
            goto L_0x0582
        L_0x0571:
            boolean r8 = r12.m13790y(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m13751R(r6)
            double r8 = m13773l(r13, r8)
            r14.mo40479g(r7, r8)
        L_0x0582:
            int r5 = r5 + 3
            goto L_0x0023
        L_0x0586:
            if (r2 == 0) goto L_0x059c
            com.google.protobuf.p<?> r3 = r12.f9753p
            r3.mo40624j(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x059a
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0586
        L_0x059a:
            r2 = r1
            goto L_0x0586
        L_0x059c:
            com.google.protobuf.k1<?, ?> r0 = r12.f9752o
            r12.m13780o0(r0, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7173s0.m13772k0(java.lang.Object, com.google.protobuf.r1):void");
    }

    /* renamed from: l */
    private static <T> double m13773l(T t, long j) {
        return C7142o1.m13549x(t, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x058e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: l0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m13774l0(T r11, com.google.protobuf.C7170r1 r12) {
        /*
            r10 = this;
            com.google.protobuf.k1<?, ?> r0 = r10.f9752o
            r10.m13780o0(r0, r11, r12)
            boolean r0 = r10.f9743f
            r1 = 0
            if (r0 == 0) goto L_0x0021
            com.google.protobuf.p<?> r0 = r10.f9753p
            com.google.protobuf.t r0 = r0.mo40617c(r11)
            boolean r2 = r0.mo40649n()
            if (r2 != 0) goto L_0x0021
            java.util.Iterator r0 = r0.mo40644g()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0023
        L_0x0021:
            r0 = r1
            r2 = r0
        L_0x0023:
            int[] r3 = r10.f9738a
            int r3 = r3.length
            int r3 = r3 + -3
        L_0x0028:
            if (r3 < 0) goto L_0x058c
            int r4 = r10.m13768i0(r3)
            int r5 = r10.m13750Q(r3)
        L_0x0032:
            if (r2 == 0) goto L_0x0050
            com.google.protobuf.p<?> r6 = r10.f9753p
            int r6 = r6.mo40615a(r2)
            if (r6 <= r5) goto L_0x0050
            com.google.protobuf.p<?> r6 = r10.f9753p
            r6.mo40624j(r12, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x004e
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0032
        L_0x004e:
            r2 = r1
            goto L_0x0032
        L_0x0050:
            int r6 = m13767h0(r4)
            r7 = 1
            r8 = 0
            switch(r6) {
                case 0: goto L_0x0577;
                case 1: goto L_0x0565;
                case 2: goto L_0x0553;
                case 3: goto L_0x0541;
                case 4: goto L_0x052f;
                case 5: goto L_0x051d;
                case 6: goto L_0x050b;
                case 7: goto L_0x04f8;
                case 8: goto L_0x04e5;
                case 9: goto L_0x04ce;
                case 10: goto L_0x04b9;
                case 11: goto L_0x04a6;
                case 12: goto L_0x0493;
                case 13: goto L_0x0480;
                case 14: goto L_0x046d;
                case 15: goto L_0x045a;
                case 16: goto L_0x0447;
                case 17: goto L_0x0430;
                case 18: goto L_0x041d;
                case 19: goto L_0x040a;
                case 20: goto L_0x03f7;
                case 21: goto L_0x03e4;
                case 22: goto L_0x03d1;
                case 23: goto L_0x03be;
                case 24: goto L_0x03ab;
                case 25: goto L_0x0398;
                case 26: goto L_0x0385;
                case 27: goto L_0x036e;
                case 28: goto L_0x035b;
                case 29: goto L_0x0348;
                case 30: goto L_0x0335;
                case 31: goto L_0x0322;
                case 32: goto L_0x030f;
                case 33: goto L_0x02fc;
                case 34: goto L_0x02e9;
                case 35: goto L_0x02d6;
                case 36: goto L_0x02c3;
                case 37: goto L_0x02b0;
                case 38: goto L_0x029d;
                case 39: goto L_0x028a;
                case 40: goto L_0x0277;
                case 41: goto L_0x0264;
                case 42: goto L_0x0251;
                case 43: goto L_0x023e;
                case 44: goto L_0x022b;
                case 45: goto L_0x0218;
                case 46: goto L_0x0205;
                case 47: goto L_0x01f2;
                case 48: goto L_0x01df;
                case 49: goto L_0x01c8;
                case 50: goto L_0x01bb;
                case 51: goto L_0x01a8;
                case 52: goto L_0x0195;
                case 53: goto L_0x0182;
                case 54: goto L_0x016f;
                case 55: goto L_0x015c;
                case 56: goto L_0x0149;
                case 57: goto L_0x0136;
                case 58: goto L_0x0123;
                case 59: goto L_0x0110;
                case 60: goto L_0x00f9;
                case 61: goto L_0x00e4;
                case 62: goto L_0x00d1;
                case 63: goto L_0x00be;
                case 64: goto L_0x00ab;
                case 65: goto L_0x0098;
                case 66: goto L_0x0085;
                case 67: goto L_0x0072;
                case 68: goto L_0x005b;
                default: goto L_0x0059;
            }
        L_0x0059:
            goto L_0x0588
        L_0x005b:
            boolean r6 = r10.m13738E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m13751R(r4)
            java.lang.Object r4 = com.google.protobuf.C7142o1.m13508C(r11, r6)
            com.google.protobuf.e1 r6 = r10.m13784s(r3)
            r12.mo40491s(r5, r4, r6)
            goto L_0x0588
        L_0x0072:
            boolean r6 = r10.m13738E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m13751R(r4)
            long r6 = m13756W(r11, r6)
            r12.mo40463F(r5, r6)
            goto L_0x0588
        L_0x0085:
            boolean r6 = r10.m13738E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m13751R(r4)
            int r4 = m13755V(r11, r6)
            r12.mo40471N(r5, r4)
            goto L_0x0588
        L_0x0098:
            boolean r6 = r10.m13738E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m13751R(r4)
            long r6 = m13756W(r11, r6)
            r12.mo40498z(r5, r6)
            goto L_0x0588
        L_0x00ab:
            boolean r6 = r10.m13738E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m13751R(r4)
            int r4 = m13755V(r11, r6)
            r12.mo40492t(r5, r4)
            goto L_0x0588
        L_0x00be:
            boolean r6 = r10.m13738E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m13751R(r4)
            int r4 = m13755V(r11, r6)
            r12.mo40467J(r5, r4)
            goto L_0x0588
        L_0x00d1:
            boolean r6 = r10.m13738E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m13751R(r4)
            int r4 = m13755V(r11, r6)
            r12.mo40476d(r5, r4)
            goto L_0x0588
        L_0x00e4:
            boolean r6 = r10.m13738E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m13751R(r4)
            java.lang.Object r4 = com.google.protobuf.C7142o1.m13508C(r11, r6)
            com.google.protobuf.h r4 = (com.google.protobuf.C7086h) r4
            r12.mo40494v(r5, r4)
            goto L_0x0588
        L_0x00f9:
            boolean r6 = r10.m13738E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m13751R(r4)
            java.lang.Object r4 = com.google.protobuf.C7142o1.m13508C(r11, r6)
            com.google.protobuf.e1 r6 = r10.m13784s(r3)
            r12.mo40482j(r5, r4, r6)
            goto L_0x0588
        L_0x0110:
            boolean r6 = r10.m13738E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m13751R(r4)
            java.lang.Object r4 = com.google.protobuf.C7142o1.m13508C(r11, r6)
            r10.m13778n0(r5, r4, r12)
            goto L_0x0588
        L_0x0123:
            boolean r6 = r10.m13738E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m13751R(r4)
            boolean r4 = m13752S(r11, r6)
            r12.mo40490r(r5, r4)
            goto L_0x0588
        L_0x0136:
            boolean r6 = r10.m13738E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m13751R(r4)
            int r4 = m13755V(r11, r6)
            r12.mo40478f(r5, r4)
            goto L_0x0588
        L_0x0149:
            boolean r6 = r10.m13738E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m13751R(r4)
            long r6 = m13756W(r11, r6)
            r12.mo40483k(r5, r6)
            goto L_0x0588
        L_0x015c:
            boolean r6 = r10.m13738E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m13751R(r4)
            int r4 = m13755V(r11, r6)
            r12.mo40495w(r5, r4)
            goto L_0x0588
        L_0x016f:
            boolean r6 = r10.m13738E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m13751R(r4)
            long r6 = m13756W(r11, r6)
            r12.mo40487o(r5, r6)
            goto L_0x0588
        L_0x0182:
            boolean r6 = r10.m13738E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m13751R(r4)
            long r6 = m13756W(r11, r6)
            r12.mo40489q(r5, r6)
            goto L_0x0588
        L_0x0195:
            boolean r6 = r10.m13738E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m13751R(r4)
            float r4 = m13754U(r11, r6)
            r12.mo40464G(r5, r4)
            goto L_0x0588
        L_0x01a8:
            boolean r6 = r10.m13738E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m13751R(r4)
            double r6 = m13753T(r11, r6)
            r12.mo40479g(r5, r6)
            goto L_0x0588
        L_0x01bb:
            long r6 = m13751R(r4)
            java.lang.Object r4 = com.google.protobuf.C7142o1.m13508C(r11, r6)
            r10.m13776m0(r12, r5, r4, r3)
            goto L_0x0588
        L_0x01c8:
            int r5 = r10.m13750Q(r3)
            long r6 = m13751R(r4)
            java.lang.Object r4 = com.google.protobuf.C7142o1.m13508C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.e1 r6 = r10.m13784s(r3)
            com.google.protobuf.C7085g1.m13016U(r5, r4, r12, r6)
            goto L_0x0588
        L_0x01df:
            int r5 = r10.m13750Q(r3)
            long r8 = m13751R(r4)
            java.lang.Object r4 = com.google.protobuf.C7142o1.m13508C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C7085g1.m13025b0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x01f2:
            int r5 = r10.m13750Q(r3)
            long r8 = m13751R(r4)
            java.lang.Object r4 = com.google.protobuf.C7142o1.m13508C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C7085g1.m13023a0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0205:
            int r5 = r10.m13750Q(r3)
            long r8 = m13751R(r4)
            java.lang.Object r4 = com.google.protobuf.C7142o1.m13508C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C7085g1.m13021Z(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0218:
            int r5 = r10.m13750Q(r3)
            long r8 = m13751R(r4)
            java.lang.Object r4 = com.google.protobuf.C7142o1.m13508C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C7085g1.m13020Y(r5, r4, r12, r7)
            goto L_0x0588
        L_0x022b:
            int r5 = r10.m13750Q(r3)
            long r8 = m13751R(r4)
            java.lang.Object r4 = com.google.protobuf.C7142o1.m13508C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C7085g1.m13012Q(r5, r4, r12, r7)
            goto L_0x0588
        L_0x023e:
            int r5 = r10.m13750Q(r3)
            long r8 = m13751R(r4)
            java.lang.Object r4 = com.google.protobuf.C7142o1.m13508C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C7085g1.m13029d0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0251:
            int r5 = r10.m13750Q(r3)
            long r8 = m13751R(r4)
            java.lang.Object r4 = com.google.protobuf.C7142o1.m13508C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C7085g1.m13009N(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0264:
            int r5 = r10.m13750Q(r3)
            long r8 = m13751R(r4)
            java.lang.Object r4 = com.google.protobuf.C7142o1.m13508C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C7085g1.m13013R(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0277:
            int r5 = r10.m13750Q(r3)
            long r8 = m13751R(r4)
            java.lang.Object r4 = com.google.protobuf.C7142o1.m13508C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C7085g1.m13014S(r5, r4, r12, r7)
            goto L_0x0588
        L_0x028a:
            int r5 = r10.m13750Q(r3)
            long r8 = m13751R(r4)
            java.lang.Object r4 = com.google.protobuf.C7142o1.m13508C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C7085g1.m13017V(r5, r4, r12, r7)
            goto L_0x0588
        L_0x029d:
            int r5 = r10.m13750Q(r3)
            long r8 = m13751R(r4)
            java.lang.Object r4 = com.google.protobuf.C7142o1.m13508C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C7085g1.m13031e0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02b0:
            int r5 = r10.m13750Q(r3)
            long r8 = m13751R(r4)
            java.lang.Object r4 = com.google.protobuf.C7142o1.m13508C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C7085g1.m13018W(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02c3:
            int r5 = r10.m13750Q(r3)
            long r8 = m13751R(r4)
            java.lang.Object r4 = com.google.protobuf.C7142o1.m13508C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C7085g1.m13015T(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02d6:
            int r5 = r10.m13750Q(r3)
            long r8 = m13751R(r4)
            java.lang.Object r4 = com.google.protobuf.C7142o1.m13508C(r11, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C7085g1.m13011P(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02e9:
            int r5 = r10.m13750Q(r3)
            long r6 = m13751R(r4)
            java.lang.Object r4 = com.google.protobuf.C7142o1.m13508C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C7085g1.m13025b0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x02fc:
            int r5 = r10.m13750Q(r3)
            long r6 = m13751R(r4)
            java.lang.Object r4 = com.google.protobuf.C7142o1.m13508C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C7085g1.m13023a0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x030f:
            int r5 = r10.m13750Q(r3)
            long r6 = m13751R(r4)
            java.lang.Object r4 = com.google.protobuf.C7142o1.m13508C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C7085g1.m13021Z(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0322:
            int r5 = r10.m13750Q(r3)
            long r6 = m13751R(r4)
            java.lang.Object r4 = com.google.protobuf.C7142o1.m13508C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C7085g1.m13020Y(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0335:
            int r5 = r10.m13750Q(r3)
            long r6 = m13751R(r4)
            java.lang.Object r4 = com.google.protobuf.C7142o1.m13508C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C7085g1.m13012Q(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0348:
            int r5 = r10.m13750Q(r3)
            long r6 = m13751R(r4)
            java.lang.Object r4 = com.google.protobuf.C7142o1.m13508C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C7085g1.m13029d0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x035b:
            int r5 = r10.m13750Q(r3)
            long r6 = m13751R(r4)
            java.lang.Object r4 = com.google.protobuf.C7142o1.m13508C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C7085g1.m13010O(r5, r4, r12)
            goto L_0x0588
        L_0x036e:
            int r5 = r10.m13750Q(r3)
            long r6 = m13751R(r4)
            java.lang.Object r4 = com.google.protobuf.C7142o1.m13508C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.e1 r6 = r10.m13784s(r3)
            com.google.protobuf.C7085g1.m13019X(r5, r4, r12, r6)
            goto L_0x0588
        L_0x0385:
            int r5 = r10.m13750Q(r3)
            long r6 = m13751R(r4)
            java.lang.Object r4 = com.google.protobuf.C7142o1.m13508C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C7085g1.m13027c0(r5, r4, r12)
            goto L_0x0588
        L_0x0398:
            int r5 = r10.m13750Q(r3)
            long r6 = m13751R(r4)
            java.lang.Object r4 = com.google.protobuf.C7142o1.m13508C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C7085g1.m13009N(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03ab:
            int r5 = r10.m13750Q(r3)
            long r6 = m13751R(r4)
            java.lang.Object r4 = com.google.protobuf.C7142o1.m13508C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C7085g1.m13013R(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03be:
            int r5 = r10.m13750Q(r3)
            long r6 = m13751R(r4)
            java.lang.Object r4 = com.google.protobuf.C7142o1.m13508C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C7085g1.m13014S(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03d1:
            int r5 = r10.m13750Q(r3)
            long r6 = m13751R(r4)
            java.lang.Object r4 = com.google.protobuf.C7142o1.m13508C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C7085g1.m13017V(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03e4:
            int r5 = r10.m13750Q(r3)
            long r6 = m13751R(r4)
            java.lang.Object r4 = com.google.protobuf.C7142o1.m13508C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C7085g1.m13031e0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03f7:
            int r5 = r10.m13750Q(r3)
            long r6 = m13751R(r4)
            java.lang.Object r4 = com.google.protobuf.C7142o1.m13508C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C7085g1.m13018W(r5, r4, r12, r8)
            goto L_0x0588
        L_0x040a:
            int r5 = r10.m13750Q(r3)
            long r6 = m13751R(r4)
            java.lang.Object r4 = com.google.protobuf.C7142o1.m13508C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C7085g1.m13015T(r5, r4, r12, r8)
            goto L_0x0588
        L_0x041d:
            int r5 = r10.m13750Q(r3)
            long r6 = m13751R(r4)
            java.lang.Object r4 = com.google.protobuf.C7142o1.m13508C(r11, r6)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.C7085g1.m13011P(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0430:
            boolean r6 = r10.m13790y(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m13751R(r4)
            java.lang.Object r4 = com.google.protobuf.C7142o1.m13508C(r11, r6)
            com.google.protobuf.e1 r6 = r10.m13784s(r3)
            r12.mo40491s(r5, r4, r6)
            goto L_0x0588
        L_0x0447:
            boolean r6 = r10.m13790y(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m13751R(r4)
            long r6 = m13741H(r11, r6)
            r12.mo40463F(r5, r6)
            goto L_0x0588
        L_0x045a:
            boolean r6 = r10.m13790y(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m13751R(r4)
            int r4 = m13788w(r11, r6)
            r12.mo40471N(r5, r4)
            goto L_0x0588
        L_0x046d:
            boolean r6 = r10.m13790y(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m13751R(r4)
            long r6 = m13741H(r11, r6)
            r12.mo40498z(r5, r6)
            goto L_0x0588
        L_0x0480:
            boolean r6 = r10.m13790y(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m13751R(r4)
            int r4 = m13788w(r11, r6)
            r12.mo40492t(r5, r4)
            goto L_0x0588
        L_0x0493:
            boolean r6 = r10.m13790y(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m13751R(r4)
            int r4 = m13788w(r11, r6)
            r12.mo40467J(r5, r4)
            goto L_0x0588
        L_0x04a6:
            boolean r6 = r10.m13790y(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m13751R(r4)
            int r4 = m13788w(r11, r6)
            r12.mo40476d(r5, r4)
            goto L_0x0588
        L_0x04b9:
            boolean r6 = r10.m13790y(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m13751R(r4)
            java.lang.Object r4 = com.google.protobuf.C7142o1.m13508C(r11, r6)
            com.google.protobuf.h r4 = (com.google.protobuf.C7086h) r4
            r12.mo40494v(r5, r4)
            goto L_0x0588
        L_0x04ce:
            boolean r6 = r10.m13790y(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m13751R(r4)
            java.lang.Object r4 = com.google.protobuf.C7142o1.m13508C(r11, r6)
            com.google.protobuf.e1 r6 = r10.m13784s(r3)
            r12.mo40482j(r5, r4, r6)
            goto L_0x0588
        L_0x04e5:
            boolean r6 = r10.m13790y(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m13751R(r4)
            java.lang.Object r4 = com.google.protobuf.C7142o1.m13508C(r11, r6)
            r10.m13778n0(r5, r4, r12)
            goto L_0x0588
        L_0x04f8:
            boolean r6 = r10.m13790y(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m13751R(r4)
            boolean r4 = m13771k(r11, r6)
            r12.mo40490r(r5, r4)
            goto L_0x0588
        L_0x050b:
            boolean r6 = r10.m13790y(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m13751R(r4)
            int r4 = m13788w(r11, r6)
            r12.mo40478f(r5, r4)
            goto L_0x0588
        L_0x051d:
            boolean r6 = r10.m13790y(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m13751R(r4)
            long r6 = m13741H(r11, r6)
            r12.mo40483k(r5, r6)
            goto L_0x0588
        L_0x052f:
            boolean r6 = r10.m13790y(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m13751R(r4)
            int r4 = m13788w(r11, r6)
            r12.mo40495w(r5, r4)
            goto L_0x0588
        L_0x0541:
            boolean r6 = r10.m13790y(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m13751R(r4)
            long r6 = m13741H(r11, r6)
            r12.mo40487o(r5, r6)
            goto L_0x0588
        L_0x0553:
            boolean r6 = r10.m13790y(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m13751R(r4)
            long r6 = m13741H(r11, r6)
            r12.mo40489q(r5, r6)
            goto L_0x0588
        L_0x0565:
            boolean r6 = r10.m13790y(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m13751R(r4)
            float r4 = m13781p(r11, r6)
            r12.mo40464G(r5, r4)
            goto L_0x0588
        L_0x0577:
            boolean r6 = r10.m13790y(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m13751R(r4)
            double r6 = m13773l(r11, r6)
            r12.mo40479g(r5, r6)
        L_0x0588:
            int r3 = r3 + -3
            goto L_0x0028
        L_0x058c:
            if (r2 == 0) goto L_0x05a3
            com.google.protobuf.p<?> r11 = r10.f9753p
            r11.mo40624j(r12, r2)
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x05a1
            java.lang.Object r11 = r0.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            r2 = r11
            goto L_0x058c
        L_0x05a1:
            r2 = r1
            goto L_0x058c
        L_0x05a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7173s0.m13774l0(java.lang.Object, com.google.protobuf.r1):void");
    }

    /* renamed from: m */
    private boolean m13775m(T t, T t2, int i) {
        int i0 = m13768i0(i);
        long R = m13751R(i0);
        switch (m13767h0(i0)) {
            case 0:
                if (!m13769j(t, t2, i) || Double.doubleToLongBits(C7142o1.m13549x(t, R)) != Double.doubleToLongBits(C7142o1.m13549x(t2, R))) {
                    return false;
                }
                return true;
            case 1:
                if (!m13769j(t, t2, i) || Float.floatToIntBits(C7142o1.m13550y(t, R)) != Float.floatToIntBits(C7142o1.m13550y(t2, R))) {
                    return false;
                }
                return true;
            case 2:
                if (!m13769j(t, t2, i) || C7142o1.m13506A(t, R) != C7142o1.m13506A(t2, R)) {
                    return false;
                }
                return true;
            case 3:
                if (!m13769j(t, t2, i) || C7142o1.m13506A(t, R) != C7142o1.m13506A(t2, R)) {
                    return false;
                }
                return true;
            case 4:
                if (!m13769j(t, t2, i) || C7142o1.m13551z(t, R) != C7142o1.m13551z(t2, R)) {
                    return false;
                }
                return true;
            case 5:
                if (!m13769j(t, t2, i) || C7142o1.m13506A(t, R) != C7142o1.m13506A(t2, R)) {
                    return false;
                }
                return true;
            case 6:
                if (!m13769j(t, t2, i) || C7142o1.m13551z(t, R) != C7142o1.m13551z(t2, R)) {
                    return false;
                }
                return true;
            case 7:
                if (!m13769j(t, t2, i) || C7142o1.m13543r(t, R) != C7142o1.m13543r(t2, R)) {
                    return false;
                }
                return true;
            case 8:
                if (!m13769j(t, t2, i) || !C7085g1.m13006K(C7142o1.m13508C(t, R), C7142o1.m13508C(t2, R))) {
                    return false;
                }
                return true;
            case 9:
                if (!m13769j(t, t2, i) || !C7085g1.m13006K(C7142o1.m13508C(t, R), C7142o1.m13508C(t2, R))) {
                    return false;
                }
                return true;
            case 10:
                if (!m13769j(t, t2, i) || !C7085g1.m13006K(C7142o1.m13508C(t, R), C7142o1.m13508C(t2, R))) {
                    return false;
                }
                return true;
            case 11:
                if (!m13769j(t, t2, i) || C7142o1.m13551z(t, R) != C7142o1.m13551z(t2, R)) {
                    return false;
                }
                return true;
            case 12:
                if (!m13769j(t, t2, i) || C7142o1.m13551z(t, R) != C7142o1.m13551z(t2, R)) {
                    return false;
                }
                return true;
            case 13:
                if (!m13769j(t, t2, i) || C7142o1.m13551z(t, R) != C7142o1.m13551z(t2, R)) {
                    return false;
                }
                return true;
            case 14:
                if (!m13769j(t, t2, i) || C7142o1.m13506A(t, R) != C7142o1.m13506A(t2, R)) {
                    return false;
                }
                return true;
            case 15:
                if (!m13769j(t, t2, i) || C7142o1.m13551z(t, R) != C7142o1.m13551z(t2, R)) {
                    return false;
                }
                return true;
            case 16:
                if (!m13769j(t, t2, i) || C7142o1.m13506A(t, R) != C7142o1.m13506A(t2, R)) {
                    return false;
                }
                return true;
            case 17:
                if (!m13769j(t, t2, i) || !C7085g1.m13006K(C7142o1.m13508C(t, R), C7142o1.m13508C(t2, R))) {
                    return false;
                }
                return true;
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
                return C7085g1.m13006K(C7142o1.m13508C(t, R), C7142o1.m13508C(t2, R));
            case 50:
                return C7085g1.m13006K(C7142o1.m13508C(t, R), C7142o1.m13508C(t2, R));
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
                if (!m13737D(t, t2, i) || !C7085g1.m13006K(C7142o1.m13508C(t, R), C7142o1.m13508C(t2, R))) {
                    return false;
                }
                return true;
            default:
                return true;
        }
    }

    /* renamed from: m0 */
    private <K, V> void m13776m0(C7170r1 r1Var, int i, Object obj, int i2) {
        if (obj != null) {
            r1Var.mo40460C(i, this.f9754q.mo40501c(m13783r(i2)), this.f9754q.mo40506h(obj));
        }
    }

    /* renamed from: n */
    private final <UT, UB> UB m13777n(Object obj, int i, UB ub, C7127k1<UT, UB> k1Var) {
        C7196z.C7201e q;
        int Q = m13750Q(i);
        Object C = C7142o1.m13508C(obj, m13751R(m13768i0(i)));
        if (C == null || (q = m13782q(i)) == null) {
            return ub;
        }
        return m13779o(i, Q, this.f9754q.mo40502d(C), q, ub, k1Var);
    }

    /* renamed from: n0 */
    private void m13778n0(int i, Object obj, C7170r1 r1Var) {
        if (obj instanceof String) {
            r1Var.mo40486n(i, (String) obj);
        } else {
            r1Var.mo40494v(i, (C7086h) obj);
        }
    }

    /* renamed from: o */
    private final <K, V, UT, UB> UB m13779o(int i, int i2, Map<K, V> map, C7196z.C7201e eVar, UB ub, C7127k1<UT, UB> k1Var) {
        C7115i0.C7116a<?, ?> c = this.f9754q.mo40501c(m13783r(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (!eVar.mo40729a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = k1Var.mo40520n();
                }
                C7086h.C7094h A = C7086h.m13053A(C7115i0.m13256b(c, next.getKey(), next.getValue()));
                try {
                    C7115i0.m13258e(A.mo40349b(), c, next.getKey(), next.getValue());
                    k1Var.mo40510d(ub, i2, A.mo40348a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* renamed from: o0 */
    private <UT, UB> void m13780o0(C7127k1<UT, UB> k1Var, T t, C7170r1 r1Var) {
        k1Var.mo40526t(k1Var.mo40513g(t), r1Var);
    }

    /* renamed from: p */
    private static <T> float m13781p(T t, long j) {
        return C7142o1.m13550y(t, j);
    }

    /* renamed from: q */
    private C7196z.C7201e m13782q(int i) {
        return (C7196z.C7201e) this.f9739b[((i / 3) * 2) + 1];
    }

    /* renamed from: r */
    private Object m13783r(int i) {
        return this.f9739b[(i / 3) * 2];
    }

    /* renamed from: s */
    private C7076e1 m13784s(int i) {
        int i2 = (i / 3) * 2;
        C7076e1 e1Var = (C7076e1) this.f9739b[i2];
        if (e1Var != null) {
            return e1Var;
        }
        C7076e1 d = C7059a1.m12782a().mo40162d((Class) this.f9739b[i2 + 1]);
        this.f9739b[i2] = d;
        return d;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0344, code lost:
        r4 = (r4 + r9) + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0410, code lost:
        r6 = r6 + r3;
        r11 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0462, code lost:
        r6 = r6 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0519, code lost:
        r5 = r5 + 3;
        r4 = 1048575;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m13785t(T r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            sun.misc.Unsafe r2 = f9737s
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r4
            r5 = 0
            r6 = 0
            r8 = 0
        L_0x000d:
            int[] r9 = r0.f9738a
            int r9 = r9.length
            if (r5 >= r9) goto L_0x0520
            int r9 = r0.m13768i0(r5)
            int r10 = r0.m13750Q(r5)
            int r11 = m13767h0(r9)
            r12 = 17
            r13 = 1
            if (r11 > r12) goto L_0x0038
            int[] r12 = r0.f9738a
            int r14 = r5 + 2
            r12 = r12[r14]
            r14 = r12 & r4
            int r15 = r12 >>> 20
            int r15 = r13 << r15
            if (r14 == r7) goto L_0x0056
            long r7 = (long) r14
            int r8 = r2.getInt(r1, r7)
            r7 = r14
            goto L_0x0056
        L_0x0038:
            boolean r12 = r0.f9746i
            if (r12 == 0) goto L_0x0054
            com.google.protobuf.u r12 = com.google.protobuf.C7178u.DOUBLE_LIST_PACKED
            int r12 = r12.mo40662a()
            if (r11 < r12) goto L_0x0054
            com.google.protobuf.u r12 = com.google.protobuf.C7178u.SINT64_LIST_PACKED
            int r12 = r12.mo40662a()
            if (r11 > r12) goto L_0x0054
            int[] r12 = r0.f9738a
            int r14 = r5 + 2
            r12 = r12[r14]
            r12 = r12 & r4
            goto L_0x0055
        L_0x0054:
            r12 = 0
        L_0x0055:
            r15 = 0
        L_0x0056:
            long r13 = m13751R(r9)
            r9 = 0
            r3 = 0
            switch(r11) {
                case 0: goto L_0x050d;
                case 1: goto L_0x0503;
                case 2: goto L_0x04f5;
                case 3: goto L_0x04e7;
                case 4: goto L_0x04d9;
                case 5: goto L_0x04cf;
                case 6: goto L_0x04c5;
                case 7: goto L_0x04ba;
                case 8: goto L_0x049e;
                case 9: goto L_0x048d;
                case 10: goto L_0x047e;
                case 11: goto L_0x0471;
                case 12: goto L_0x0464;
                case 13: goto L_0x0459;
                case 14: goto L_0x0450;
                case 15: goto L_0x0443;
                case 16: goto L_0x0436;
                case 17: goto L_0x0423;
                case 18: goto L_0x0414;
                case 19: goto L_0x0405;
                case 20: goto L_0x03f9;
                case 21: goto L_0x03ed;
                case 22: goto L_0x03e1;
                case 23: goto L_0x03d5;
                case 24: goto L_0x03c9;
                case 25: goto L_0x03bd;
                case 26: goto L_0x03b2;
                case 27: goto L_0x03a2;
                case 28: goto L_0x0396;
                case 29: goto L_0x0389;
                case 30: goto L_0x037c;
                case 31: goto L_0x036f;
                case 32: goto L_0x0362;
                case 33: goto L_0x0355;
                case 34: goto L_0x0348;
                case 35: goto L_0x0328;
                case 36: goto L_0x030b;
                case 37: goto L_0x02ee;
                case 38: goto L_0x02d1;
                case 39: goto L_0x02b3;
                case 40: goto L_0x0295;
                case 41: goto L_0x0277;
                case 42: goto L_0x0259;
                case 43: goto L_0x023b;
                case 44: goto L_0x021d;
                case 45: goto L_0x01ff;
                case 46: goto L_0x01e1;
                case 47: goto L_0x01c3;
                case 48: goto L_0x01a5;
                case 49: goto L_0x0195;
                case 50: goto L_0x0185;
                case 51: goto L_0x0177;
                case 52: goto L_0x016b;
                case 53: goto L_0x015b;
                case 54: goto L_0x014b;
                case 55: goto L_0x013b;
                case 56: goto L_0x012f;
                case 57: goto L_0x0122;
                case 58: goto L_0x0115;
                case 59: goto L_0x00f7;
                case 60: goto L_0x00e3;
                case 61: goto L_0x00d1;
                case 62: goto L_0x00c1;
                case 63: goto L_0x00b1;
                case 64: goto L_0x00a4;
                case 65: goto L_0x0098;
                case 66: goto L_0x0088;
                case 67: goto L_0x0078;
                case 68: goto L_0x0062;
                default: goto L_0x0060;
            }
        L_0x0060:
            goto L_0x0420
        L_0x0062:
            boolean r3 = r0.m13738E(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.p0 r3 = (com.google.protobuf.C7149p0) r3
            com.google.protobuf.e1 r4 = r0.m13784s(r5)
            int r3 = com.google.protobuf.CodedOutputStream.m12630s(r10, r3, r4)
            goto L_0x041f
        L_0x0078:
            boolean r3 = r0.m13738E(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            long r3 = m13756W(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m12600R(r10, r3)
            goto L_0x041f
        L_0x0088:
            boolean r3 = r0.m13738E(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            int r3 = m13755V(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m12598P(r10, r3)
            goto L_0x041f
        L_0x0098:
            boolean r9 = r0.m13738E(r1, r10, r5)
            if (r9 == 0) goto L_0x0420
            int r3 = com.google.protobuf.CodedOutputStream.m12596N(r10, r3)
            goto L_0x041f
        L_0x00a4:
            boolean r3 = r0.m13738E(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            r3 = 0
            int r4 = com.google.protobuf.CodedOutputStream.m12594L(r10, r3)
            goto L_0x0462
        L_0x00b1:
            boolean r3 = r0.m13738E(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            int r3 = m13755V(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m12622k(r10, r3)
            goto L_0x041f
        L_0x00c1:
            boolean r3 = r0.m13738E(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            int r3 = m13755V(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m12605W(r10, r3)
            goto L_0x041f
        L_0x00d1:
            boolean r3 = r0.m13738E(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.h r3 = (com.google.protobuf.C7086h) r3
            int r3 = com.google.protobuf.CodedOutputStream.m12616g(r10, r3)
            goto L_0x041f
        L_0x00e3:
            boolean r3 = r0.m13738E(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.e1 r4 = r0.m13784s(r5)
            int r3 = com.google.protobuf.C7085g1.m13041o(r10, r3, r4)
            goto L_0x041f
        L_0x00f7:
            boolean r3 = r0.m13738E(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            java.lang.Object r3 = r2.getObject(r1, r13)
            boolean r4 = r3 instanceof com.google.protobuf.C7086h
            if (r4 == 0) goto L_0x010d
            com.google.protobuf.h r3 = (com.google.protobuf.C7086h) r3
            int r3 = com.google.protobuf.CodedOutputStream.m12616g(r10, r3)
            goto L_0x041f
        L_0x010d:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.google.protobuf.CodedOutputStream.m12602T(r10, r3)
            goto L_0x041f
        L_0x0115:
            boolean r3 = r0.m13738E(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            r3 = 1
            int r3 = com.google.protobuf.CodedOutputStream.m12612d(r10, r3)
            goto L_0x041f
        L_0x0122:
            boolean r3 = r0.m13738E(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            r3 = 0
            int r4 = com.google.protobuf.CodedOutputStream.m12624m(r10, r3)
            goto L_0x0462
        L_0x012f:
            boolean r9 = r0.m13738E(r1, r10, r5)
            if (r9 == 0) goto L_0x0420
            int r3 = com.google.protobuf.CodedOutputStream.m12626o(r10, r3)
            goto L_0x041f
        L_0x013b:
            boolean r3 = r0.m13738E(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            int r3 = m13755V(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m12633v(r10, r3)
            goto L_0x041f
        L_0x014b:
            boolean r3 = r0.m13738E(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            long r3 = m13756W(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m12607Y(r10, r3)
            goto L_0x041f
        L_0x015b:
            boolean r3 = r0.m13738E(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            long r3 = m13756W(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m12635x(r10, r3)
            goto L_0x041f
        L_0x016b:
            boolean r3 = r0.m13738E(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            int r3 = com.google.protobuf.CodedOutputStream.m12628q(r10, r9)
            goto L_0x041f
        L_0x0177:
            boolean r3 = r0.m13738E(r1, r10, r5)
            if (r3 == 0) goto L_0x0420
            r3 = 0
            int r3 = com.google.protobuf.CodedOutputStream.m12620i(r10, r3)
            goto L_0x041f
        L_0x0185:
            com.google.protobuf.k0 r3 = r0.f9754q
            java.lang.Object r4 = r2.getObject(r1, r13)
            java.lang.Object r9 = r0.m13783r(r5)
            int r3 = r3.mo40504f(r10, r4, r9)
            goto L_0x041f
        L_0x0195:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.e1 r4 = r0.m13784s(r5)
            int r3 = com.google.protobuf.C7085g1.m13036j(r10, r3, r4)
            goto L_0x041f
        L_0x01a5:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C7085g1.m13046t(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f9746i
            if (r4 == 0) goto L_0x01b9
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x01b9:
            int r4 = com.google.protobuf.CodedOutputStream.m12604V(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m12606X(r3)
            goto L_0x0344
        L_0x01c3:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C7085g1.m13044r(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f9746i
            if (r4 == 0) goto L_0x01d7
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x01d7:
            int r4 = com.google.protobuf.CodedOutputStream.m12604V(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m12606X(r3)
            goto L_0x0344
        L_0x01e1:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C7085g1.m13035i(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f9746i
            if (r4 == 0) goto L_0x01f5
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x01f5:
            int r4 = com.google.protobuf.CodedOutputStream.m12604V(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m12606X(r3)
            goto L_0x0344
        L_0x01ff:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C7085g1.m13033g(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f9746i
            if (r4 == 0) goto L_0x0213
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x0213:
            int r4 = com.google.protobuf.CodedOutputStream.m12604V(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m12606X(r3)
            goto L_0x0344
        L_0x021d:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C7085g1.m13030e(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f9746i
            if (r4 == 0) goto L_0x0231
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x0231:
            int r4 = com.google.protobuf.CodedOutputStream.m12604V(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m12606X(r3)
            goto L_0x0344
        L_0x023b:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C7085g1.m13049w(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f9746i
            if (r4 == 0) goto L_0x024f
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x024f:
            int r4 = com.google.protobuf.CodedOutputStream.m12604V(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m12606X(r3)
            goto L_0x0344
        L_0x0259:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C7085g1.m13024b(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f9746i
            if (r4 == 0) goto L_0x026d
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x026d:
            int r4 = com.google.protobuf.CodedOutputStream.m12604V(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m12606X(r3)
            goto L_0x0344
        L_0x0277:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C7085g1.m13033g(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f9746i
            if (r4 == 0) goto L_0x028b
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x028b:
            int r4 = com.google.protobuf.CodedOutputStream.m12604V(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m12606X(r3)
            goto L_0x0344
        L_0x0295:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C7085g1.m13035i(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f9746i
            if (r4 == 0) goto L_0x02a9
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x02a9:
            int r4 = com.google.protobuf.CodedOutputStream.m12604V(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m12606X(r3)
            goto L_0x0344
        L_0x02b3:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C7085g1.m13038l(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f9746i
            if (r4 == 0) goto L_0x02c7
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x02c7:
            int r4 = com.google.protobuf.CodedOutputStream.m12604V(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m12606X(r3)
            goto L_0x0344
        L_0x02d1:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C7085g1.m13051y(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f9746i
            if (r4 == 0) goto L_0x02e5
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x02e5:
            int r4 = com.google.protobuf.CodedOutputStream.m12604V(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m12606X(r3)
            goto L_0x0344
        L_0x02ee:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C7085g1.m13040n(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f9746i
            if (r4 == 0) goto L_0x0302
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x0302:
            int r4 = com.google.protobuf.CodedOutputStream.m12604V(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m12606X(r3)
            goto L_0x0344
        L_0x030b:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C7085g1.m13033g(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f9746i
            if (r4 == 0) goto L_0x031f
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x031f:
            int r4 = com.google.protobuf.CodedOutputStream.m12604V(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m12606X(r3)
            goto L_0x0344
        L_0x0328:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C7085g1.m13035i(r3)
            if (r3 <= 0) goto L_0x0420
            boolean r4 = r0.f9746i
            if (r4 == 0) goto L_0x033c
            long r11 = (long) r12
            r2.putInt(r1, r11, r3)
        L_0x033c:
            int r4 = com.google.protobuf.CodedOutputStream.m12604V(r10)
            int r9 = com.google.protobuf.CodedOutputStream.m12606X(r3)
        L_0x0344:
            int r4 = r4 + r9
            int r4 = r4 + r3
            goto L_0x0462
        L_0x0348:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = com.google.protobuf.C7085g1.m13045s(r10, r3, r4)
            goto L_0x0410
        L_0x0355:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C7085g1.m13043q(r10, r3, r4)
            goto L_0x0410
        L_0x0362:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C7085g1.m13034h(r10, r3, r4)
            goto L_0x0410
        L_0x036f:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C7085g1.m13032f(r10, r3, r4)
            goto L_0x0410
        L_0x037c:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C7085g1.m13028d(r10, r3, r4)
            goto L_0x0410
        L_0x0389:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C7085g1.m13048v(r10, r3, r4)
            goto L_0x041f
        L_0x0396:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C7085g1.m13026c(r10, r3)
            goto L_0x041f
        L_0x03a2:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.e1 r4 = r0.m13784s(r5)
            int r3 = com.google.protobuf.C7085g1.m13042p(r10, r3, r4)
            goto L_0x041f
        L_0x03b2:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C7085g1.m13047u(r10, r3)
            goto L_0x041f
        L_0x03bd:
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = com.google.protobuf.C7085g1.m13022a(r10, r3, r4)
            goto L_0x0410
        L_0x03c9:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C7085g1.m13032f(r10, r3, r4)
            goto L_0x0410
        L_0x03d5:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C7085g1.m13034h(r10, r3, r4)
            goto L_0x0410
        L_0x03e1:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C7085g1.m13037k(r10, r3, r4)
            goto L_0x0410
        L_0x03ed:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C7085g1.m13050x(r10, r3, r4)
            goto L_0x0410
        L_0x03f9:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C7085g1.m13039m(r10, r3, r4)
            goto L_0x0410
        L_0x0405:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C7085g1.m13032f(r10, r3, r4)
        L_0x0410:
            int r6 = r6 + r3
            r11 = r4
            goto L_0x0519
        L_0x0414:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r13)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C7085g1.m13034h(r10, r3, r4)
        L_0x041f:
            int r6 = r6 + r3
        L_0x0420:
            r11 = 0
            goto L_0x0519
        L_0x0423:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0420
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.p0 r3 = (com.google.protobuf.C7149p0) r3
            com.google.protobuf.e1 r4 = r0.m13784s(r5)
            int r3 = com.google.protobuf.CodedOutputStream.m12630s(r10, r3, r4)
            goto L_0x041f
        L_0x0436:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0420
            long r3 = r2.getLong(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m12600R(r10, r3)
            goto L_0x041f
        L_0x0443:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0420
            int r3 = r2.getInt(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m12598P(r10, r3)
            goto L_0x041f
        L_0x0450:
            r9 = r8 & r15
            if (r9 == 0) goto L_0x0420
            int r3 = com.google.protobuf.CodedOutputStream.m12596N(r10, r3)
            goto L_0x041f
        L_0x0459:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0420
            r3 = 0
            int r4 = com.google.protobuf.CodedOutputStream.m12594L(r10, r3)
        L_0x0462:
            int r6 = r6 + r4
            goto L_0x0420
        L_0x0464:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0420
            int r3 = r2.getInt(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m12622k(r10, r3)
            goto L_0x041f
        L_0x0471:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0420
            int r3 = r2.getInt(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m12605W(r10, r3)
            goto L_0x041f
        L_0x047e:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0420
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.h r3 = (com.google.protobuf.C7086h) r3
            int r3 = com.google.protobuf.CodedOutputStream.m12616g(r10, r3)
            goto L_0x041f
        L_0x048d:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0420
            java.lang.Object r3 = r2.getObject(r1, r13)
            com.google.protobuf.e1 r4 = r0.m13784s(r5)
            int r3 = com.google.protobuf.C7085g1.m13041o(r10, r3, r4)
            goto L_0x041f
        L_0x049e:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0420
            java.lang.Object r3 = r2.getObject(r1, r13)
            boolean r4 = r3 instanceof com.google.protobuf.C7086h
            if (r4 == 0) goto L_0x04b2
            com.google.protobuf.h r3 = (com.google.protobuf.C7086h) r3
            int r3 = com.google.protobuf.CodedOutputStream.m12616g(r10, r3)
            goto L_0x041f
        L_0x04b2:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.google.protobuf.CodedOutputStream.m12602T(r10, r3)
            goto L_0x041f
        L_0x04ba:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0420
            r3 = 1
            int r3 = com.google.protobuf.CodedOutputStream.m12612d(r10, r3)
            goto L_0x041f
        L_0x04c5:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0420
            r11 = 0
            int r3 = com.google.protobuf.CodedOutputStream.m12624m(r10, r11)
            goto L_0x0518
        L_0x04cf:
            r11 = 0
            r9 = r8 & r15
            if (r9 == 0) goto L_0x0519
            int r3 = com.google.protobuf.CodedOutputStream.m12626o(r10, r3)
            goto L_0x0518
        L_0x04d9:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0519
            int r3 = r2.getInt(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m12633v(r10, r3)
            goto L_0x0518
        L_0x04e7:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0519
            long r3 = r2.getLong(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m12607Y(r10, r3)
            goto L_0x0518
        L_0x04f5:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0519
            long r3 = r2.getLong(r1, r13)
            int r3 = com.google.protobuf.CodedOutputStream.m12635x(r10, r3)
            goto L_0x0518
        L_0x0503:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0519
            int r3 = com.google.protobuf.CodedOutputStream.m12628q(r10, r9)
            goto L_0x0518
        L_0x050d:
            r11 = 0
            r3 = r8 & r15
            if (r3 == 0) goto L_0x0519
            r3 = 0
            int r3 = com.google.protobuf.CodedOutputStream.m12620i(r10, r3)
        L_0x0518:
            int r6 = r6 + r3
        L_0x0519:
            int r5 = r5 + 3
            r4 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000d
        L_0x0520:
            com.google.protobuf.k1<?, ?> r2 = r0.f9752o
            int r2 = r0.m13787v(r2, r1)
            int r6 = r6 + r2
            boolean r2 = r0.f9743f
            if (r2 == 0) goto L_0x0536
            com.google.protobuf.p<?> r2 = r0.f9753p
            com.google.protobuf.t r1 = r2.mo40617c(r1)
            int r1 = r1.mo40648l()
            int r6 = r6 + r1
        L_0x0536:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7173s0.m13785t(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m13786u(T r16) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            sun.misc.Unsafe r2 = f9737s
            r3 = 0
            r4 = r3
            r5 = r4
        L_0x0008:
            int[] r6 = r0.f9738a
            int r6 = r6.length
            if (r4 >= r6) goto L_0x04e3
            int r6 = r15.m13768i0(r4)
            int r7 = m13767h0(r6)
            int r8 = r15.m13750Q(r4)
            long r9 = m13751R(r6)
            com.google.protobuf.u r6 = com.google.protobuf.C7178u.DOUBLE_LIST_PACKED
            int r6 = r6.mo40662a()
            if (r7 < r6) goto L_0x0038
            com.google.protobuf.u r6 = com.google.protobuf.C7178u.SINT64_LIST_PACKED
            int r6 = r6.mo40662a()
            if (r7 > r6) goto L_0x0038
            int[] r6 = r0.f9738a
            int r11 = r4 + 2
            r6 = r6[r11]
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r6 & r11
            goto L_0x0039
        L_0x0038:
            r6 = r3
        L_0x0039:
            r11 = 1
            r12 = 0
            r13 = 0
            switch(r7) {
                case 0: goto L_0x04d1;
                case 1: goto L_0x04c5;
                case 2: goto L_0x04b5;
                case 3: goto L_0x04a5;
                case 4: goto L_0x0495;
                case 5: goto L_0x0489;
                case 6: goto L_0x047d;
                case 7: goto L_0x0471;
                case 8: goto L_0x0453;
                case 9: goto L_0x043f;
                case 10: goto L_0x042e;
                case 11: goto L_0x041f;
                case 12: goto L_0x0410;
                case 13: goto L_0x0405;
                case 14: goto L_0x03fa;
                case 15: goto L_0x03eb;
                case 16: goto L_0x03dc;
                case 17: goto L_0x03c7;
                case 18: goto L_0x03bc;
                case 19: goto L_0x03b3;
                case 20: goto L_0x03aa;
                case 21: goto L_0x03a1;
                case 22: goto L_0x0398;
                case 23: goto L_0x038f;
                case 24: goto L_0x0386;
                case 25: goto L_0x037d;
                case 26: goto L_0x0374;
                case 27: goto L_0x0367;
                case 28: goto L_0x035e;
                case 29: goto L_0x0355;
                case 30: goto L_0x034b;
                case 31: goto L_0x0341;
                case 32: goto L_0x0337;
                case 33: goto L_0x032d;
                case 34: goto L_0x0323;
                case 35: goto L_0x0303;
                case 36: goto L_0x02e6;
                case 37: goto L_0x02c9;
                case 38: goto L_0x02ac;
                case 39: goto L_0x028e;
                case 40: goto L_0x0270;
                case 41: goto L_0x0252;
                case 42: goto L_0x0234;
                case 43: goto L_0x0216;
                case 44: goto L_0x01f8;
                case 45: goto L_0x01da;
                case 46: goto L_0x01bc;
                case 47: goto L_0x019e;
                case 48: goto L_0x0180;
                case 49: goto L_0x0172;
                case 50: goto L_0x0162;
                case 51: goto L_0x0154;
                case 52: goto L_0x0148;
                case 53: goto L_0x0138;
                case 54: goto L_0x0128;
                case 55: goto L_0x0118;
                case 56: goto L_0x010c;
                case 57: goto L_0x0100;
                case 58: goto L_0x00f4;
                case 59: goto L_0x00d6;
                case 60: goto L_0x00c2;
                case 61: goto L_0x00b0;
                case 62: goto L_0x00a0;
                case 63: goto L_0x0090;
                case 64: goto L_0x0084;
                case 65: goto L_0x0078;
                case 66: goto L_0x0068;
                case 67: goto L_0x0058;
                case 68: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x04df
        L_0x0042:
            boolean r6 = r15.m13738E(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r1, r9)
            com.google.protobuf.p0 r6 = (com.google.protobuf.C7149p0) r6
            com.google.protobuf.e1 r7 = r15.m13784s(r4)
            int r6 = com.google.protobuf.CodedOutputStream.m12630s(r8, r6, r7)
            goto L_0x03c4
        L_0x0058:
            boolean r6 = r15.m13738E(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = m13756W(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m12600R(r8, r6)
            goto L_0x03c4
        L_0x0068:
            boolean r6 = r15.m13738E(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = m13755V(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m12598P(r8, r6)
            goto L_0x03c4
        L_0x0078:
            boolean r6 = r15.m13738E(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m12596N(r8, r13)
            goto L_0x03c4
        L_0x0084:
            boolean r6 = r15.m13738E(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m12594L(r8, r3)
            goto L_0x03c4
        L_0x0090:
            boolean r6 = r15.m13738E(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = m13755V(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m12622k(r8, r6)
            goto L_0x03c4
        L_0x00a0:
            boolean r6 = r15.m13738E(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = m13755V(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m12605W(r8, r6)
            goto L_0x03c4
        L_0x00b0:
            boolean r6 = r15.m13738E(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r1, r9)
            com.google.protobuf.h r6 = (com.google.protobuf.C7086h) r6
            int r6 = com.google.protobuf.CodedOutputStream.m12616g(r8, r6)
            goto L_0x03c4
        L_0x00c2:
            boolean r6 = r15.m13738E(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r1, r9)
            com.google.protobuf.e1 r7 = r15.m13784s(r4)
            int r6 = com.google.protobuf.C7085g1.m13041o(r8, r6, r7)
            goto L_0x03c4
        L_0x00d6:
            boolean r6 = r15.m13738E(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r1, r9)
            boolean r7 = r6 instanceof com.google.protobuf.C7086h
            if (r7 == 0) goto L_0x00ec
            com.google.protobuf.h r6 = (com.google.protobuf.C7086h) r6
            int r6 = com.google.protobuf.CodedOutputStream.m12616g(r8, r6)
            goto L_0x03c4
        L_0x00ec:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.google.protobuf.CodedOutputStream.m12602T(r8, r6)
            goto L_0x03c4
        L_0x00f4:
            boolean r6 = r15.m13738E(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m12612d(r8, r11)
            goto L_0x03c4
        L_0x0100:
            boolean r6 = r15.m13738E(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m12624m(r8, r3)
            goto L_0x03c4
        L_0x010c:
            boolean r6 = r15.m13738E(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m12626o(r8, r13)
            goto L_0x03c4
        L_0x0118:
            boolean r6 = r15.m13738E(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = m13755V(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m12633v(r8, r6)
            goto L_0x03c4
        L_0x0128:
            boolean r6 = r15.m13738E(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = m13756W(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m12607Y(r8, r6)
            goto L_0x03c4
        L_0x0138:
            boolean r6 = r15.m13738E(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = m13756W(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m12635x(r8, r6)
            goto L_0x03c4
        L_0x0148:
            boolean r6 = r15.m13738E(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m12628q(r8, r12)
            goto L_0x03c4
        L_0x0154:
            boolean r6 = r15.m13738E(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            r6 = 0
            int r6 = com.google.protobuf.CodedOutputStream.m12620i(r8, r6)
            goto L_0x03c4
        L_0x0162:
            com.google.protobuf.k0 r6 = r0.f9754q
            java.lang.Object r7 = com.google.protobuf.C7142o1.m13508C(r1, r9)
            java.lang.Object r9 = r15.m13783r(r4)
            int r6 = r6.mo40504f(r8, r7, r9)
            goto L_0x03c4
        L_0x0172:
            java.util.List r6 = m13740G(r1, r9)
            com.google.protobuf.e1 r7 = r15.m13784s(r4)
            int r6 = com.google.protobuf.C7085g1.m13036j(r8, r6, r7)
            goto L_0x03c4
        L_0x0180:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C7085g1.m13046t(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f9746i
            if (r9 == 0) goto L_0x0194
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0194:
            int r6 = com.google.protobuf.CodedOutputStream.m12604V(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m12606X(r7)
            goto L_0x031f
        L_0x019e:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C7085g1.m13044r(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f9746i
            if (r9 == 0) goto L_0x01b2
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01b2:
            int r6 = com.google.protobuf.CodedOutputStream.m12604V(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m12606X(r7)
            goto L_0x031f
        L_0x01bc:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C7085g1.m13035i(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f9746i
            if (r9 == 0) goto L_0x01d0
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01d0:
            int r6 = com.google.protobuf.CodedOutputStream.m12604V(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m12606X(r7)
            goto L_0x031f
        L_0x01da:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C7085g1.m13033g(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f9746i
            if (r9 == 0) goto L_0x01ee
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01ee:
            int r6 = com.google.protobuf.CodedOutputStream.m12604V(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m12606X(r7)
            goto L_0x031f
        L_0x01f8:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C7085g1.m13030e(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f9746i
            if (r9 == 0) goto L_0x020c
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x020c:
            int r6 = com.google.protobuf.CodedOutputStream.m12604V(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m12606X(r7)
            goto L_0x031f
        L_0x0216:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C7085g1.m13049w(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f9746i
            if (r9 == 0) goto L_0x022a
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x022a:
            int r6 = com.google.protobuf.CodedOutputStream.m12604V(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m12606X(r7)
            goto L_0x031f
        L_0x0234:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C7085g1.m13024b(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f9746i
            if (r9 == 0) goto L_0x0248
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0248:
            int r6 = com.google.protobuf.CodedOutputStream.m12604V(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m12606X(r7)
            goto L_0x031f
        L_0x0252:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C7085g1.m13033g(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f9746i
            if (r9 == 0) goto L_0x0266
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0266:
            int r6 = com.google.protobuf.CodedOutputStream.m12604V(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m12606X(r7)
            goto L_0x031f
        L_0x0270:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C7085g1.m13035i(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f9746i
            if (r9 == 0) goto L_0x0284
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0284:
            int r6 = com.google.protobuf.CodedOutputStream.m12604V(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m12606X(r7)
            goto L_0x031f
        L_0x028e:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C7085g1.m13038l(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f9746i
            if (r9 == 0) goto L_0x02a2
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02a2:
            int r6 = com.google.protobuf.CodedOutputStream.m12604V(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m12606X(r7)
            goto L_0x031f
        L_0x02ac:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C7085g1.m13051y(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f9746i
            if (r9 == 0) goto L_0x02c0
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02c0:
            int r6 = com.google.protobuf.CodedOutputStream.m12604V(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m12606X(r7)
            goto L_0x031f
        L_0x02c9:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C7085g1.m13040n(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f9746i
            if (r9 == 0) goto L_0x02dd
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02dd:
            int r6 = com.google.protobuf.CodedOutputStream.m12604V(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m12606X(r7)
            goto L_0x031f
        L_0x02e6:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C7085g1.m13033g(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f9746i
            if (r9 == 0) goto L_0x02fa
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02fa:
            int r6 = com.google.protobuf.CodedOutputStream.m12604V(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m12606X(r7)
            goto L_0x031f
        L_0x0303:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.protobuf.C7085g1.m13035i(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f9746i
            if (r9 == 0) goto L_0x0317
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0317:
            int r6 = com.google.protobuf.CodedOutputStream.m12604V(r8)
            int r8 = com.google.protobuf.CodedOutputStream.m12606X(r7)
        L_0x031f:
            int r6 = r6 + r8
            int r6 = r6 + r7
            goto L_0x03c4
        L_0x0323:
            java.util.List r6 = m13740G(r1, r9)
            int r6 = com.google.protobuf.C7085g1.m13045s(r8, r6, r3)
            goto L_0x03c4
        L_0x032d:
            java.util.List r6 = m13740G(r1, r9)
            int r6 = com.google.protobuf.C7085g1.m13043q(r8, r6, r3)
            goto L_0x03c4
        L_0x0337:
            java.util.List r6 = m13740G(r1, r9)
            int r6 = com.google.protobuf.C7085g1.m13034h(r8, r6, r3)
            goto L_0x03c4
        L_0x0341:
            java.util.List r6 = m13740G(r1, r9)
            int r6 = com.google.protobuf.C7085g1.m13032f(r8, r6, r3)
            goto L_0x03c4
        L_0x034b:
            java.util.List r6 = m13740G(r1, r9)
            int r6 = com.google.protobuf.C7085g1.m13028d(r8, r6, r3)
            goto L_0x03c4
        L_0x0355:
            java.util.List r6 = m13740G(r1, r9)
            int r6 = com.google.protobuf.C7085g1.m13048v(r8, r6, r3)
            goto L_0x03c4
        L_0x035e:
            java.util.List r6 = m13740G(r1, r9)
            int r6 = com.google.protobuf.C7085g1.m13026c(r8, r6)
            goto L_0x03c4
        L_0x0367:
            java.util.List r6 = m13740G(r1, r9)
            com.google.protobuf.e1 r7 = r15.m13784s(r4)
            int r6 = com.google.protobuf.C7085g1.m13042p(r8, r6, r7)
            goto L_0x03c4
        L_0x0374:
            java.util.List r6 = m13740G(r1, r9)
            int r6 = com.google.protobuf.C7085g1.m13047u(r8, r6)
            goto L_0x03c4
        L_0x037d:
            java.util.List r6 = m13740G(r1, r9)
            int r6 = com.google.protobuf.C7085g1.m13022a(r8, r6, r3)
            goto L_0x03c4
        L_0x0386:
            java.util.List r6 = m13740G(r1, r9)
            int r6 = com.google.protobuf.C7085g1.m13032f(r8, r6, r3)
            goto L_0x03c4
        L_0x038f:
            java.util.List r6 = m13740G(r1, r9)
            int r6 = com.google.protobuf.C7085g1.m13034h(r8, r6, r3)
            goto L_0x03c4
        L_0x0398:
            java.util.List r6 = m13740G(r1, r9)
            int r6 = com.google.protobuf.C7085g1.m13037k(r8, r6, r3)
            goto L_0x03c4
        L_0x03a1:
            java.util.List r6 = m13740G(r1, r9)
            int r6 = com.google.protobuf.C7085g1.m13050x(r8, r6, r3)
            goto L_0x03c4
        L_0x03aa:
            java.util.List r6 = m13740G(r1, r9)
            int r6 = com.google.protobuf.C7085g1.m13039m(r8, r6, r3)
            goto L_0x03c4
        L_0x03b3:
            java.util.List r6 = m13740G(r1, r9)
            int r6 = com.google.protobuf.C7085g1.m13032f(r8, r6, r3)
            goto L_0x03c4
        L_0x03bc:
            java.util.List r6 = m13740G(r1, r9)
            int r6 = com.google.protobuf.C7085g1.m13034h(r8, r6, r3)
        L_0x03c4:
            int r5 = r5 + r6
            goto L_0x04df
        L_0x03c7:
            boolean r6 = r15.m13790y(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r1, r9)
            com.google.protobuf.p0 r6 = (com.google.protobuf.C7149p0) r6
            com.google.protobuf.e1 r7 = r15.m13784s(r4)
            int r6 = com.google.protobuf.CodedOutputStream.m12630s(r8, r6, r7)
            goto L_0x03c4
        L_0x03dc:
            boolean r6 = r15.m13790y(r1, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = com.google.protobuf.C7142o1.m13506A(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m12600R(r8, r6)
            goto L_0x03c4
        L_0x03eb:
            boolean r6 = r15.m13790y(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.C7142o1.m13551z(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m12598P(r8, r6)
            goto L_0x03c4
        L_0x03fa:
            boolean r6 = r15.m13790y(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m12596N(r8, r13)
            goto L_0x03c4
        L_0x0405:
            boolean r6 = r15.m13790y(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m12594L(r8, r3)
            goto L_0x03c4
        L_0x0410:
            boolean r6 = r15.m13790y(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.C7142o1.m13551z(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m12622k(r8, r6)
            goto L_0x03c4
        L_0x041f:
            boolean r6 = r15.m13790y(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.C7142o1.m13551z(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m12605W(r8, r6)
            goto L_0x03c4
        L_0x042e:
            boolean r6 = r15.m13790y(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r1, r9)
            com.google.protobuf.h r6 = (com.google.protobuf.C7086h) r6
            int r6 = com.google.protobuf.CodedOutputStream.m12616g(r8, r6)
            goto L_0x03c4
        L_0x043f:
            boolean r6 = r15.m13790y(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r1, r9)
            com.google.protobuf.e1 r7 = r15.m13784s(r4)
            int r6 = com.google.protobuf.C7085g1.m13041o(r8, r6, r7)
            goto L_0x03c4
        L_0x0453:
            boolean r6 = r15.m13790y(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = com.google.protobuf.C7142o1.m13508C(r1, r9)
            boolean r7 = r6 instanceof com.google.protobuf.C7086h
            if (r7 == 0) goto L_0x0469
            com.google.protobuf.h r6 = (com.google.protobuf.C7086h) r6
            int r6 = com.google.protobuf.CodedOutputStream.m12616g(r8, r6)
            goto L_0x03c4
        L_0x0469:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.google.protobuf.CodedOutputStream.m12602T(r8, r6)
            goto L_0x03c4
        L_0x0471:
            boolean r6 = r15.m13790y(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m12612d(r8, r11)
            goto L_0x03c4
        L_0x047d:
            boolean r6 = r15.m13790y(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m12624m(r8, r3)
            goto L_0x03c4
        L_0x0489:
            boolean r6 = r15.m13790y(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m12626o(r8, r13)
            goto L_0x03c4
        L_0x0495:
            boolean r6 = r15.m13790y(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.C7142o1.m13551z(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m12633v(r8, r6)
            goto L_0x03c4
        L_0x04a5:
            boolean r6 = r15.m13790y(r1, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = com.google.protobuf.C7142o1.m13506A(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m12607Y(r8, r6)
            goto L_0x03c4
        L_0x04b5:
            boolean r6 = r15.m13790y(r1, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = com.google.protobuf.C7142o1.m13506A(r1, r9)
            int r6 = com.google.protobuf.CodedOutputStream.m12635x(r8, r6)
            goto L_0x03c4
        L_0x04c5:
            boolean r6 = r15.m13790y(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = com.google.protobuf.CodedOutputStream.m12628q(r8, r12)
            goto L_0x03c4
        L_0x04d1:
            boolean r6 = r15.m13790y(r1, r4)
            if (r6 == 0) goto L_0x04df
            r6 = 0
            int r6 = com.google.protobuf.CodedOutputStream.m12620i(r8, r6)
            goto L_0x03c4
        L_0x04df:
            int r4 = r4 + 3
            goto L_0x0008
        L_0x04e3:
            com.google.protobuf.k1<?, ?> r2 = r0.f9752o
            int r1 = r15.m13787v(r2, r1)
            int r5 = r5 + r1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7173s0.m13786u(java.lang.Object):int");
    }

    /* renamed from: v */
    private <UT, UB> int m13787v(C7127k1<UT, UB> k1Var, T t) {
        return k1Var.mo40514h(k1Var.mo40513g(t));
    }

    /* renamed from: w */
    private static <T> int m13788w(T t, long j) {
        return C7142o1.m13551z(t, j);
    }

    /* renamed from: x */
    private static boolean m13789x(int i) {
        if ((i & 536870912) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    private boolean m13790y(T t, int i) {
        int Y = m13758Y(i);
        long j = (long) (1048575 & Y);
        if (j == 1048575) {
            int i0 = m13768i0(i);
            long R = m13751R(i0);
            switch (m13767h0(i0)) {
                case 0:
                    if (C7142o1.m13549x(t, R) != 0.0d) {
                        return true;
                    }
                    return false;
                case 1:
                    if (C7142o1.m13550y(t, R) != 0.0f) {
                        return true;
                    }
                    return false;
                case 2:
                    if (C7142o1.m13506A(t, R) != 0) {
                        return true;
                    }
                    return false;
                case 3:
                    if (C7142o1.m13506A(t, R) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                    if (C7142o1.m13551z(t, R) != 0) {
                        return true;
                    }
                    return false;
                case 5:
                    if (C7142o1.m13506A(t, R) != 0) {
                        return true;
                    }
                    return false;
                case 6:
                    if (C7142o1.m13551z(t, R) != 0) {
                        return true;
                    }
                    return false;
                case 7:
                    return C7142o1.m13543r(t, R);
                case 8:
                    Object C = C7142o1.m13508C(t, R);
                    if (C instanceof String) {
                        return !((String) C).isEmpty();
                    }
                    if (C instanceof C7086h) {
                        return !C7086h.f9565c.equals(C);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (C7142o1.m13508C(t, R) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    return !C7086h.f9565c.equals(C7142o1.m13508C(t, R));
                case 11:
                    if (C7142o1.m13551z(t, R) != 0) {
                        return true;
                    }
                    return false;
                case 12:
                    if (C7142o1.m13551z(t, R) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (C7142o1.m13551z(t, R) != 0) {
                        return true;
                    }
                    return false;
                case 14:
                    if (C7142o1.m13506A(t, R) != 0) {
                        return true;
                    }
                    return false;
                case 15:
                    if (C7142o1.m13551z(t, R) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (C7142o1.m13506A(t, R) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (C7142o1.m13508C(t, R) != null) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            if ((C7142o1.m13551z(t, j) & (1 << (Y >>> 20))) != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: z */
    private boolean m13791z(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m13790y(t, i);
        }
        if ((i3 & i4) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo40274a(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.f9738a.length; i += 3) {
            m13746M(t, t2, i);
        }
        C7085g1.m13002G(this.f9752o, t, t2);
        if (this.f9743f) {
            C7085g1.m13000E(this.f9753p, t, t2);
        }
    }

    /* renamed from: b */
    public void mo40275b(T t, C7170r1 r1Var) {
        if (r1Var.mo40484l() == C7170r1.C7171a.DESCENDING) {
            m13774l0(t, r1Var);
        } else if (this.f9745h) {
            m13772k0(t, r1Var);
        } else {
            m13770j0(t, r1Var);
        }
    }

    /* renamed from: c */
    public void mo40276c(T t) {
        int i;
        int i2 = this.f9748k;
        while (true) {
            i = this.f9749l;
            if (i2 >= i) {
                break;
            }
            long R = m13751R(m13768i0(this.f9747j[i2]));
            Object C = C7142o1.m13508C(t, R);
            if (C != null) {
                C7142o1.m13523R(t, R, this.f9754q.mo40500b(C));
            }
            i2++;
        }
        int length = this.f9747j.length;
        while (i < length) {
            this.f9751n.mo40299c(t, (long) this.f9747j[i]);
            i++;
        }
        this.f9752o.mo40516j(t);
        if (this.f9743f) {
            this.f9753p.mo40620f(t);
        }
    }

    /* renamed from: d */
    public final boolean mo40277d(T t) {
        int i;
        int i2;
        T t2 = t;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f9748k) {
            int i6 = this.f9747j[i5];
            int Q = m13750Q(i6);
            int i0 = m13768i0(i6);
            int i7 = this.f9738a[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i3) {
                if (i8 != 1048575) {
                    i4 = f9737s.getInt(t2, (long) i8);
                }
                i = i4;
                i2 = i8;
            } else {
                i2 = i3;
                i = i4;
            }
            if (m13739F(i0) && !m13791z(t, i6, i2, i, i9)) {
                return false;
            }
            int h0 = m13767h0(i0);
            if (h0 != 9 && h0 != 17) {
                if (h0 != 27) {
                    if (h0 == 60 || h0 == 68) {
                        if (m13738E(t2, Q, i6) && !m13734A(t2, i0, m13784s(i6))) {
                            return false;
                        }
                    } else if (h0 != 49) {
                        if (h0 == 50 && !m13736C(t2, i0, i6)) {
                            return false;
                        }
                    }
                }
                if (!m13735B(t2, i0, i6)) {
                    return false;
                }
            } else if (m13791z(t, i6, i2, i, i9) && !m13734A(t2, i0, m13784s(i6))) {
                return false;
            }
            i5++;
            i3 = i2;
            i4 = i;
        }
        if (!this.f9743f || this.f9753p.mo40617c(t2).mo40651p()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public void mo40278e(T t, C7071d1 d1Var, C7139o oVar) {
        oVar.getClass();
        m13742I(this.f9752o, this.f9753p, t, d1Var, oVar);
    }

    /* renamed from: f */
    public boolean mo40279f(T t, T t2) {
        int length = this.f9738a.length;
        for (int i = 0; i < length; i += 3) {
            if (!m13775m(t, t2, i)) {
                return false;
            }
        }
        if (!this.f9752o.mo40513g(t).equals(this.f9752o.mo40513g(t2))) {
            return false;
        }
        if (this.f9743f) {
            return this.f9753p.mo40617c(t).equals(this.f9753p.mo40617c(t2));
        }
        return true;
    }

    /* renamed from: g */
    public int mo40280g(T t) {
        if (this.f9745h) {
            return m13786u(t);
        }
        return m13785t(t);
    }

    /* renamed from: h */
    public T mo40281h() {
        return this.f9750m.mo40663a(this.f9742e);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c1, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0225, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0226, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo40282i(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f9738a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x022a
            int r3 = r8.m13768i0(r1)
            int r4 = r8.m13750Q(r1)
            long r5 = m13751R(r3)
            int r3 = m13767h0(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0217;
                case 1: goto L_0x020c;
                case 2: goto L_0x0201;
                case 3: goto L_0x01f6;
                case 4: goto L_0x01ef;
                case 5: goto L_0x01e4;
                case 6: goto L_0x01dd;
                case 7: goto L_0x01d2;
                case 8: goto L_0x01c5;
                case 9: goto L_0x01b7;
                case 10: goto L_0x01ab;
                case 11: goto L_0x01a3;
                case 12: goto L_0x019b;
                case 13: goto L_0x0193;
                case 14: goto L_0x0187;
                case 15: goto L_0x017f;
                case 16: goto L_0x0173;
                case 17: goto L_0x0168;
                case 18: goto L_0x015c;
                case 19: goto L_0x015c;
                case 20: goto L_0x015c;
                case 21: goto L_0x015c;
                case 22: goto L_0x015c;
                case 23: goto L_0x015c;
                case 24: goto L_0x015c;
                case 25: goto L_0x015c;
                case 26: goto L_0x015c;
                case 27: goto L_0x015c;
                case 28: goto L_0x015c;
                case 29: goto L_0x015c;
                case 30: goto L_0x015c;
                case 31: goto L_0x015c;
                case 32: goto L_0x015c;
                case 33: goto L_0x015c;
                case 34: goto L_0x015c;
                case 35: goto L_0x015c;
                case 36: goto L_0x015c;
                case 37: goto L_0x015c;
                case 38: goto L_0x015c;
                case 39: goto L_0x015c;
                case 40: goto L_0x015c;
                case 41: goto L_0x015c;
                case 42: goto L_0x015c;
                case 43: goto L_0x015c;
                case 44: goto L_0x015c;
                case 45: goto L_0x015c;
                case 46: goto L_0x015c;
                case 47: goto L_0x015c;
                case 48: goto L_0x015c;
                case 49: goto L_0x015c;
                case 50: goto L_0x0150;
                case 51: goto L_0x013a;
                case 52: goto L_0x0128;
                case 53: goto L_0x0116;
                case 54: goto L_0x0104;
                case 55: goto L_0x00f6;
                case 56: goto L_0x00e4;
                case 57: goto L_0x00d6;
                case 58: goto L_0x00c4;
                case 59: goto L_0x00b0;
                case 60: goto L_0x009e;
                case 61: goto L_0x008c;
                case 62: goto L_0x007e;
                case 63: goto L_0x0070;
                case 64: goto L_0x0062;
                case 65: goto L_0x0050;
                case 66: goto L_0x0042;
                case 67: goto L_0x0030;
                case 68: goto L_0x001e;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x0226
        L_0x001e:
            boolean r3 = r8.m13738E(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            java.lang.Object r3 = com.google.protobuf.C7142o1.m13508C(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x0030:
            boolean r3 = r8.m13738E(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m13756W(r9, r5)
            int r3 = com.google.protobuf.C7196z.m13949f(r3)
            goto L_0x0225
        L_0x0042:
            boolean r3 = r8.m13738E(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m13755V(r9, r5)
            goto L_0x0225
        L_0x0050:
            boolean r3 = r8.m13738E(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m13756W(r9, r5)
            int r3 = com.google.protobuf.C7196z.m13949f(r3)
            goto L_0x0225
        L_0x0062:
            boolean r3 = r8.m13738E(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m13755V(r9, r5)
            goto L_0x0225
        L_0x0070:
            boolean r3 = r8.m13738E(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m13755V(r9, r5)
            goto L_0x0225
        L_0x007e:
            boolean r3 = r8.m13738E(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m13755V(r9, r5)
            goto L_0x0225
        L_0x008c:
            boolean r3 = r8.m13738E(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.C7142o1.m13508C(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x009e:
            boolean r3 = r8.m13738E(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            java.lang.Object r3 = com.google.protobuf.C7142o1.m13508C(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x00b0:
            boolean r3 = r8.m13738E(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.C7142o1.m13508C(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x00c4:
            boolean r3 = r8.m13738E(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            boolean r3 = m13752S(r9, r5)
            int r3 = com.google.protobuf.C7196z.m13946c(r3)
            goto L_0x0225
        L_0x00d6:
            boolean r3 = r8.m13738E(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m13755V(r9, r5)
            goto L_0x0225
        L_0x00e4:
            boolean r3 = r8.m13738E(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m13756W(r9, r5)
            int r3 = com.google.protobuf.C7196z.m13949f(r3)
            goto L_0x0225
        L_0x00f6:
            boolean r3 = r8.m13738E(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m13755V(r9, r5)
            goto L_0x0225
        L_0x0104:
            boolean r3 = r8.m13738E(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m13756W(r9, r5)
            int r3 = com.google.protobuf.C7196z.m13949f(r3)
            goto L_0x0225
        L_0x0116:
            boolean r3 = r8.m13738E(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m13756W(r9, r5)
            int r3 = com.google.protobuf.C7196z.m13949f(r3)
            goto L_0x0225
        L_0x0128:
            boolean r3 = r8.m13738E(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            float r3 = m13754U(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0225
        L_0x013a:
            boolean r3 = r8.m13738E(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            double r3 = m13753T(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.protobuf.C7196z.m13949f(r3)
            goto L_0x0225
        L_0x0150:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.C7142o1.m13508C(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x015c:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.C7142o1.m13508C(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x0168:
            java.lang.Object r3 = com.google.protobuf.C7142o1.m13508C(r9, r5)
            if (r3 == 0) goto L_0x01c1
            int r7 = r3.hashCode()
            goto L_0x01c1
        L_0x0173:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.C7142o1.m13506A(r9, r5)
            int r3 = com.google.protobuf.C7196z.m13949f(r3)
            goto L_0x0225
        L_0x017f:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.C7142o1.m13551z(r9, r5)
            goto L_0x0225
        L_0x0187:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.C7142o1.m13506A(r9, r5)
            int r3 = com.google.protobuf.C7196z.m13949f(r3)
            goto L_0x0225
        L_0x0193:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.C7142o1.m13551z(r9, r5)
            goto L_0x0225
        L_0x019b:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.C7142o1.m13551z(r9, r5)
            goto L_0x0225
        L_0x01a3:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.C7142o1.m13551z(r9, r5)
            goto L_0x0225
        L_0x01ab:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.C7142o1.m13508C(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x01b7:
            java.lang.Object r3 = com.google.protobuf.C7142o1.m13508C(r9, r5)
            if (r3 == 0) goto L_0x01c1
            int r7 = r3.hashCode()
        L_0x01c1:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0226
        L_0x01c5:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.protobuf.C7142o1.m13508C(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x01d2:
            int r2 = r2 * 53
            boolean r3 = com.google.protobuf.C7142o1.m13543r(r9, r5)
            int r3 = com.google.protobuf.C7196z.m13946c(r3)
            goto L_0x0225
        L_0x01dd:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.C7142o1.m13551z(r9, r5)
            goto L_0x0225
        L_0x01e4:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.C7142o1.m13506A(r9, r5)
            int r3 = com.google.protobuf.C7196z.m13949f(r3)
            goto L_0x0225
        L_0x01ef:
            int r2 = r2 * 53
            int r3 = com.google.protobuf.C7142o1.m13551z(r9, r5)
            goto L_0x0225
        L_0x01f6:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.C7142o1.m13506A(r9, r5)
            int r3 = com.google.protobuf.C7196z.m13949f(r3)
            goto L_0x0225
        L_0x0201:
            int r2 = r2 * 53
            long r3 = com.google.protobuf.C7142o1.m13506A(r9, r5)
            int r3 = com.google.protobuf.C7196z.m13949f(r3)
            goto L_0x0225
        L_0x020c:
            int r2 = r2 * 53
            float r3 = com.google.protobuf.C7142o1.m13550y(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0225
        L_0x0217:
            int r2 = r2 * 53
            double r3 = com.google.protobuf.C7142o1.m13549x(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.protobuf.C7196z.m13949f(r3)
        L_0x0225:
            int r2 = r2 + r3
        L_0x0226:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022a:
            int r2 = r2 * 53
            com.google.protobuf.k1<?, ?> r0 = r8.f9752o
            java.lang.Object r0 = r0.mo40513g(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f9743f
            if (r0 == 0) goto L_0x0248
            int r2 = r2 * 53
            com.google.protobuf.p<?> r0 = r8.f9753p
            com.google.protobuf.t r9 = r0.mo40617c(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x0248:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7173s0.mo40282i(java.lang.Object):int");
    }
}
