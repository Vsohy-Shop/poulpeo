package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.ba */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
final class C5675ba<T> implements C5811ja<T> {

    /* renamed from: p */
    private static final int[] f6788p = new int[0];

    /* renamed from: q */
    private static final Unsafe f6789q = C5778hb.m9362l();

    /* renamed from: a */
    private final int[] f6790a;

    /* renamed from: b */
    private final Object[] f6791b;

    /* renamed from: c */
    private final int f6792c;

    /* renamed from: d */
    private final int f6793d;

    /* renamed from: e */
    private final C6052y9 f6794e;

    /* renamed from: f */
    private final boolean f6795f;

    /* renamed from: g */
    private final boolean f6796g;

    /* renamed from: h */
    private final int[] f6797h;

    /* renamed from: i */
    private final int f6798i;

    /* renamed from: j */
    private final int f6799j;

    /* renamed from: k */
    private final C5844l9 f6800k;

    /* renamed from: l */
    private final C6037xa<?, ?> f6801l;

    /* renamed from: m */
    private final C5809j8<?> f6802m;

    /* renamed from: n */
    private final C5709da f6803n;

    /* renamed from: o */
    private final C5956s9 f6804o;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.google.android.gms.internal.measurement.y9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: com.google.android.gms.internal.measurement.da} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.google.android.gms.internal.measurement.s9} */
    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.internal.measurement.j8, com.google.android.gms.internal.measurement.j8<?>] */
    /* JADX WARNING: type inference failed for: r3v2, types: [int] */
    /* JADX WARNING: type inference failed for: r3v8, types: [int] */
    /* JADX WARNING: type inference failed for: r3v11, types: [com.google.android.gms.internal.measurement.l9] */
    /* JADX WARNING: type inference failed for: r3v12, types: [com.google.android.gms.internal.measurement.xa<?, ?>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C5675ba(int[] r6, int[] r7, java.lang.Object[] r8, int r9, int r10, com.google.android.gms.internal.measurement.C6052y9 r11, boolean r12, boolean r13, int[] r14, int r15, int r16, com.google.android.gms.internal.measurement.C5709da r17, com.google.android.gms.internal.measurement.C5844l9 r18, com.google.android.gms.internal.measurement.C6037xa<?, ?> r19, com.google.android.gms.internal.measurement.C5809j8<?> r20, com.google.android.gms.internal.measurement.C5956s9 r21) {
        /*
            r5 = this;
            r0 = r5
            r1 = r10
            r2 = r19
            r5.<init>()
            r3 = r6
            r0.f6790a = r3
            r3 = r7
            r0.f6791b = r3
            r3 = r8
            r0.f6792c = r3
            r3 = r9
            r0.f6793d = r3
            r3 = r11
            r0.f6796g = r3
            r3 = 0
            if (r2 == 0) goto L_0x0020
            boolean r4 = r2.mo34125c(r10)
            if (r4 == 0) goto L_0x0020
            r3 = 1
        L_0x0020:
            r0.f6795f = r3
            r3 = r13
            r0.f6797h = r3
            r3 = r14
            r0.f6798i = r3
            r3 = r15
            r0.f6799j = r3
            r3 = r16
            r0.f6803n = r3
            r3 = r17
            r0.f6800k = r3
            r3 = r18
            r0.f6801l = r3
            r0.f6802m = r2
            r0.f6794e = r1
            r1 = r20
            r0.f6804o = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C5675ba.<init>(int[], java.lang.Object[], int, int, com.google.android.gms.internal.measurement.y9, boolean, boolean, int[], int, int, com.google.android.gms.internal.measurement.da, com.google.android.gms.internal.measurement.l9, com.google.android.gms.internal.measurement.xa, com.google.android.gms.internal.measurement.j8, com.google.android.gms.internal.measurement.s9, byte[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:156:0x044e, code lost:
        r7 = r7 + 3;
        r5 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x029d, code lost:
        r12 = r11;
     */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m8799A(T r17, com.google.android.gms.internal.measurement.C5724e8 r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            boolean r3 = r0.f6795f
            if (r3 != 0) goto L_0x045f
            int[] r3 = r0.f6790a
            int r3 = r3.length
            sun.misc.Unsafe r4 = f6789q
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r5
            r7 = 0
            r8 = 0
        L_0x0015:
            if (r7 >= r3) goto L_0x0455
            int r10 = r0.m8819k(r7)
            int[] r11 = r0.f6790a
            r11 = r11[r7]
            int r12 = m8818j(r10)
            r13 = 17
            r14 = 1
            if (r12 > r13) goto L_0x003d
            int[] r13 = r0.f6790a
            int r15 = r7 + 2
            r13 = r13[r15]
            r15 = r13 & r5
            if (r15 == r9) goto L_0x0038
            long r8 = (long) r15
            int r8 = r4.getInt(r1, r8)
            r9 = r15
        L_0x0038:
            int r13 = r13 >>> 20
            int r13 = r14 << r13
            goto L_0x003e
        L_0x003d:
            r13 = 0
        L_0x003e:
            r10 = r10 & r5
            long r5 = (long) r10
            switch(r12) {
                case 0: goto L_0x0442;
                case 1: goto L_0x0435;
                case 2: goto L_0x0428;
                case 3: goto L_0x041b;
                case 4: goto L_0x040e;
                case 5: goto L_0x0401;
                case 6: goto L_0x03f4;
                case 7: goto L_0x03e7;
                case 8: goto L_0x03d9;
                case 9: goto L_0x03c7;
                case 10: goto L_0x03b7;
                case 11: goto L_0x03a9;
                case 12: goto L_0x039b;
                case 13: goto L_0x038d;
                case 14: goto L_0x037f;
                case 15: goto L_0x0371;
                case 16: goto L_0x0363;
                case 17: goto L_0x0351;
                case 18: goto L_0x0341;
                case 19: goto L_0x0331;
                case 20: goto L_0x0321;
                case 21: goto L_0x0311;
                case 22: goto L_0x0301;
                case 23: goto L_0x02f1;
                case 24: goto L_0x02e1;
                case 25: goto L_0x02d1;
                case 26: goto L_0x02c2;
                case 27: goto L_0x02af;
                case 28: goto L_0x02a0;
                case 29: goto L_0x028f;
                case 30: goto L_0x0280;
                case 31: goto L_0x0271;
                case 32: goto L_0x0262;
                case 33: goto L_0x0253;
                case 34: goto L_0x0244;
                case 35: goto L_0x0235;
                case 36: goto L_0x0226;
                case 37: goto L_0x0217;
                case 38: goto L_0x0208;
                case 39: goto L_0x01f9;
                case 40: goto L_0x01ea;
                case 41: goto L_0x01db;
                case 42: goto L_0x01cc;
                case 43: goto L_0x01bd;
                case 44: goto L_0x01ae;
                case 45: goto L_0x019f;
                case 46: goto L_0x0190;
                case 47: goto L_0x0181;
                case 48: goto L_0x0172;
                case 49: goto L_0x015f;
                case 50: goto L_0x0156;
                case 51: goto L_0x0147;
                case 52: goto L_0x0138;
                case 53: goto L_0x0129;
                case 54: goto L_0x011a;
                case 55: goto L_0x010b;
                case 56: goto L_0x00fc;
                case 57: goto L_0x00ed;
                case 58: goto L_0x00de;
                case 59: goto L_0x00cf;
                case 60: goto L_0x00bc;
                case 61: goto L_0x00ac;
                case 62: goto L_0x009e;
                case 63: goto L_0x0090;
                case 64: goto L_0x0082;
                case 65: goto L_0x0074;
                case 66: goto L_0x0066;
                case 67: goto L_0x0058;
                case 68: goto L_0x0046;
                default: goto L_0x0043;
            }
        L_0x0043:
            r12 = 0
            goto L_0x044e
        L_0x0046:
            boolean r10 = r0.m8833y(r1, r11, r7)
            if (r10 == 0) goto L_0x0043
            java.lang.Object r5 = r4.getObject(r1, r5)
            com.google.android.gms.internal.measurement.ja r6 = r0.m8822n(r7)
            r2.mo33902B(r11, r5, r6)
            goto L_0x0043
        L_0x0058:
            boolean r10 = r0.m8833y(r1, r11, r7)
            if (r10 == 0) goto L_0x0043
            long r5 = m8820l(r1, r5)
            r2.mo33914c(r11, r5)
            goto L_0x0043
        L_0x0066:
            boolean r10 = r0.m8833y(r1, r11, r7)
            if (r10 == 0) goto L_0x0043
            int r5 = m8809L(r1, r5)
            r2.mo33912a(r11, r5)
            goto L_0x0043
        L_0x0074:
            boolean r10 = r0.m8833y(r1, r11, r7)
            if (r10 == 0) goto L_0x0043
            long r5 = m8820l(r1, r5)
            r2.mo33910J(r11, r5)
            goto L_0x0043
        L_0x0082:
            boolean r10 = r0.m8833y(r1, r11, r7)
            if (r10 == 0) goto L_0x0043
            int r5 = m8809L(r1, r5)
            r2.mo33908H(r11, r5)
            goto L_0x0043
        L_0x0090:
            boolean r10 = r0.m8833y(r1, r11, r7)
            if (r10 == 0) goto L_0x0043
            int r5 = m8809L(r1, r5)
            r2.mo33930t(r11, r5)
            goto L_0x0043
        L_0x009e:
            boolean r10 = r0.m8833y(r1, r11, r7)
            if (r10 == 0) goto L_0x0043
            int r5 = m8809L(r1, r5)
            r2.mo33919h(r11, r5)
            goto L_0x0043
        L_0x00ac:
            boolean r10 = r0.m8833y(r1, r11, r7)
            if (r10 == 0) goto L_0x0043
            java.lang.Object r5 = r4.getObject(r1, r5)
            com.google.android.gms.internal.measurement.w7 r5 = (com.google.android.gms.internal.measurement.C6018w7) r5
            r2.mo33925o(r11, r5)
            goto L_0x0043
        L_0x00bc:
            boolean r10 = r0.m8833y(r1, r11, r7)
            if (r10 == 0) goto L_0x0043
            java.lang.Object r5 = r4.getObject(r1, r5)
            com.google.android.gms.internal.measurement.ja r6 = r0.m8822n(r7)
            r2.mo33907G(r11, r5, r6)
            goto L_0x0043
        L_0x00cf:
            boolean r10 = r0.m8833y(r1, r11, r7)
            if (r10 == 0) goto L_0x0043
            java.lang.Object r5 = r4.getObject(r1, r5)
            m8801C(r11, r5, r2)
            goto L_0x0043
        L_0x00de:
            boolean r10 = r0.m8833y(r1, r11, r7)
            if (r10 == 0) goto L_0x0043
            boolean r5 = m8834z(r1, r5)
            r2.mo33923m(r11, r5)
            goto L_0x0043
        L_0x00ed:
            boolean r10 = r0.m8833y(r1, r11, r7)
            if (r10 == 0) goto L_0x0043
            int r5 = m8809L(r1, r5)
            r2.mo33932v(r11, r5)
            goto L_0x0043
        L_0x00fc:
            boolean r10 = r0.m8833y(r1, r11, r7)
            if (r10 == 0) goto L_0x0043
            long r5 = m8820l(r1, r5)
            r2.mo33934x(r11, r5)
            goto L_0x0043
        L_0x010b:
            boolean r10 = r0.m8833y(r1, r11, r7)
            if (r10 == 0) goto L_0x0043
            int r5 = m8809L(r1, r5)
            r2.mo33903C(r11, r5)
            goto L_0x0043
        L_0x011a:
            boolean r10 = r0.m8833y(r1, r11, r7)
            if (r10 == 0) goto L_0x0043
            long r5 = m8820l(r1, r5)
            r2.mo33921j(r11, r5)
            goto L_0x0043
        L_0x0129:
            boolean r10 = r0.m8833y(r1, r11, r7)
            if (r10 == 0) goto L_0x0043
            long r5 = m8820l(r1, r5)
            r2.mo33905E(r11, r5)
            goto L_0x0043
        L_0x0138:
            boolean r10 = r0.m8833y(r1, r11, r7)
            if (r10 == 0) goto L_0x0043
            float r5 = m8806I(r1, r5)
            r2.mo33936z(r11, r5)
            goto L_0x0043
        L_0x0147:
            boolean r10 = r0.m8833y(r1, r11, r7)
            if (r10 == 0) goto L_0x0043
            double r5 = m8805H(r1, r5)
            r2.mo33927q(r11, r5)
            goto L_0x0043
        L_0x0156:
            java.lang.Object r5 = r4.getObject(r1, r5)
            r0.m8800B(r2, r11, r5, r7)
            goto L_0x0043
        L_0x015f:
            int[] r10 = r0.f6790a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.ja r6 = r0.m8822n(r7)
            com.google.android.gms.internal.measurement.C5845la.m9607q(r10, r5, r2, r6)
            goto L_0x0043
        L_0x0172:
            int[] r10 = r0.f6790a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.C5845la.m9614x(r10, r5, r2, r14)
            goto L_0x0043
        L_0x0181:
            int[] r10 = r0.f6790a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.C5845la.m9613w(r10, r5, r2, r14)
            goto L_0x0043
        L_0x0190:
            int[] r10 = r0.f6790a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.C5845la.m9612v(r10, r5, r2, r14)
            goto L_0x0043
        L_0x019f:
            int[] r10 = r0.f6790a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.C5845la.m9611u(r10, r5, r2, r14)
            goto L_0x0043
        L_0x01ae:
            int[] r10 = r0.f6790a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.C5845la.m9603m(r10, r5, r2, r14)
            goto L_0x0043
        L_0x01bd:
            int[] r10 = r0.f6790a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.C5845la.m9616z(r10, r5, r2, r14)
            goto L_0x0043
        L_0x01cc:
            int[] r10 = r0.f6790a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.C5845la.m9600j(r10, r5, r2, r14)
            goto L_0x0043
        L_0x01db:
            int[] r10 = r0.f6790a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.C5845la.m9604n(r10, r5, r2, r14)
            goto L_0x0043
        L_0x01ea:
            int[] r10 = r0.f6790a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.C5845la.m9605o(r10, r5, r2, r14)
            goto L_0x0043
        L_0x01f9:
            int[] r10 = r0.f6790a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.C5845la.m9608r(r10, r5, r2, r14)
            goto L_0x0043
        L_0x0208:
            int[] r10 = r0.f6790a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.C5845la.m9564B(r10, r5, r2, r14)
            goto L_0x0043
        L_0x0217:
            int[] r10 = r0.f6790a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.C5845la.m9609s(r10, r5, r2, r14)
            goto L_0x0043
        L_0x0226:
            int[] r10 = r0.f6790a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.C5845la.m9606p(r10, r5, r2, r14)
            goto L_0x0043
        L_0x0235:
            int[] r10 = r0.f6790a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.C5845la.m9602l(r10, r5, r2, r14)
            goto L_0x0043
        L_0x0244:
            int[] r10 = r0.f6790a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r11 = 0
            com.google.android.gms.internal.measurement.C5845la.m9614x(r10, r5, r2, r11)
            goto L_0x029d
        L_0x0253:
            r11 = 0
            int[] r10 = r0.f6790a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.C5845la.m9613w(r10, r5, r2, r11)
            goto L_0x029d
        L_0x0262:
            r11 = 0
            int[] r10 = r0.f6790a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.C5845la.m9612v(r10, r5, r2, r11)
            goto L_0x029d
        L_0x0271:
            r11 = 0
            int[] r10 = r0.f6790a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.C5845la.m9611u(r10, r5, r2, r11)
            goto L_0x029d
        L_0x0280:
            r11 = 0
            int[] r10 = r0.f6790a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.C5845la.m9603m(r10, r5, r2, r11)
            goto L_0x029d
        L_0x028f:
            r11 = 0
            int[] r10 = r0.f6790a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.C5845la.m9616z(r10, r5, r2, r11)
        L_0x029d:
            r12 = r11
            goto L_0x044e
        L_0x02a0:
            int[] r10 = r0.f6790a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.C5845la.m9601k(r10, r5, r2)
            goto L_0x0043
        L_0x02af:
            int[] r10 = r0.f6790a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.ja r6 = r0.m8822n(r7)
            com.google.android.gms.internal.measurement.C5845la.m9610t(r10, r5, r2, r6)
            goto L_0x0043
        L_0x02c2:
            int[] r10 = r0.f6790a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.C5845la.m9615y(r10, r5, r2)
            goto L_0x0043
        L_0x02d1:
            int[] r10 = r0.f6790a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = 0
            com.google.android.gms.internal.measurement.C5845la.m9600j(r10, r5, r2, r12)
            goto L_0x044e
        L_0x02e1:
            r12 = 0
            int[] r10 = r0.f6790a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.C5845la.m9604n(r10, r5, r2, r12)
            goto L_0x044e
        L_0x02f1:
            r12 = 0
            int[] r10 = r0.f6790a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.C5845la.m9605o(r10, r5, r2, r12)
            goto L_0x044e
        L_0x0301:
            r12 = 0
            int[] r10 = r0.f6790a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.C5845la.m9608r(r10, r5, r2, r12)
            goto L_0x044e
        L_0x0311:
            r12 = 0
            int[] r10 = r0.f6790a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.C5845la.m9564B(r10, r5, r2, r12)
            goto L_0x044e
        L_0x0321:
            r12 = 0
            int[] r10 = r0.f6790a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.C5845la.m9609s(r10, r5, r2, r12)
            goto L_0x044e
        L_0x0331:
            r12 = 0
            int[] r10 = r0.f6790a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.C5845la.m9606p(r10, r5, r2, r12)
            goto L_0x044e
        L_0x0341:
            r12 = 0
            int[] r10 = r0.f6790a
            r10 = r10[r7]
            java.lang.Object r5 = r4.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.measurement.C5845la.m9602l(r10, r5, r2, r12)
            goto L_0x044e
        L_0x0351:
            r12 = 0
            r10 = r8 & r13
            if (r10 == 0) goto L_0x044e
            java.lang.Object r5 = r4.getObject(r1, r5)
            com.google.android.gms.internal.measurement.ja r6 = r0.m8822n(r7)
            r2.mo33902B(r11, r5, r6)
            goto L_0x044e
        L_0x0363:
            r12 = 0
            r10 = r8 & r13
            if (r10 == 0) goto L_0x044e
            long r5 = r4.getLong(r1, r5)
            r2.mo33914c(r11, r5)
            goto L_0x044e
        L_0x0371:
            r12 = 0
            r10 = r8 & r13
            if (r10 == 0) goto L_0x044e
            int r5 = r4.getInt(r1, r5)
            r2.mo33912a(r11, r5)
            goto L_0x044e
        L_0x037f:
            r12 = 0
            r10 = r8 & r13
            if (r10 == 0) goto L_0x044e
            long r5 = r4.getLong(r1, r5)
            r2.mo33910J(r11, r5)
            goto L_0x044e
        L_0x038d:
            r12 = 0
            r10 = r8 & r13
            if (r10 == 0) goto L_0x044e
            int r5 = r4.getInt(r1, r5)
            r2.mo33908H(r11, r5)
            goto L_0x044e
        L_0x039b:
            r12 = 0
            r10 = r8 & r13
            if (r10 == 0) goto L_0x044e
            int r5 = r4.getInt(r1, r5)
            r2.mo33930t(r11, r5)
            goto L_0x044e
        L_0x03a9:
            r12 = 0
            r10 = r8 & r13
            if (r10 == 0) goto L_0x044e
            int r5 = r4.getInt(r1, r5)
            r2.mo33919h(r11, r5)
            goto L_0x044e
        L_0x03b7:
            r12 = 0
            r10 = r8 & r13
            if (r10 == 0) goto L_0x044e
            java.lang.Object r5 = r4.getObject(r1, r5)
            com.google.android.gms.internal.measurement.w7 r5 = (com.google.android.gms.internal.measurement.C6018w7) r5
            r2.mo33925o(r11, r5)
            goto L_0x044e
        L_0x03c7:
            r12 = 0
            r10 = r8 & r13
            if (r10 == 0) goto L_0x044e
            java.lang.Object r5 = r4.getObject(r1, r5)
            com.google.android.gms.internal.measurement.ja r6 = r0.m8822n(r7)
            r2.mo33907G(r11, r5, r6)
            goto L_0x044e
        L_0x03d9:
            r12 = 0
            r10 = r8 & r13
            if (r10 == 0) goto L_0x044e
            java.lang.Object r5 = r4.getObject(r1, r5)
            m8801C(r11, r5, r2)
            goto L_0x044e
        L_0x03e7:
            r12 = 0
            r10 = r8 & r13
            if (r10 == 0) goto L_0x044e
            boolean r5 = com.google.android.gms.internal.measurement.C5778hb.m9347B(r1, r5)
            r2.mo33923m(r11, r5)
            goto L_0x044e
        L_0x03f4:
            r12 = 0
            r10 = r8 & r13
            if (r10 == 0) goto L_0x044e
            int r5 = r4.getInt(r1, r5)
            r2.mo33932v(r11, r5)
            goto L_0x044e
        L_0x0401:
            r12 = 0
            r10 = r8 & r13
            if (r10 == 0) goto L_0x044e
            long r5 = r4.getLong(r1, r5)
            r2.mo33934x(r11, r5)
            goto L_0x044e
        L_0x040e:
            r12 = 0
            r10 = r8 & r13
            if (r10 == 0) goto L_0x044e
            int r5 = r4.getInt(r1, r5)
            r2.mo33903C(r11, r5)
            goto L_0x044e
        L_0x041b:
            r12 = 0
            r10 = r8 & r13
            if (r10 == 0) goto L_0x044e
            long r5 = r4.getLong(r1, r5)
            r2.mo33921j(r11, r5)
            goto L_0x044e
        L_0x0428:
            r12 = 0
            r10 = r8 & r13
            if (r10 == 0) goto L_0x044e
            long r5 = r4.getLong(r1, r5)
            r2.mo33905E(r11, r5)
            goto L_0x044e
        L_0x0435:
            r12 = 0
            r10 = r8 & r13
            if (r10 == 0) goto L_0x044e
            float r5 = com.google.android.gms.internal.measurement.C5778hb.m9357g(r1, r5)
            r2.mo33936z(r11, r5)
            goto L_0x044e
        L_0x0442:
            r12 = 0
            r10 = r8 & r13
            if (r10 == 0) goto L_0x044e
            double r5 = com.google.android.gms.internal.measurement.C5778hb.m9356f(r1, r5)
            r2.mo33927q(r11, r5)
        L_0x044e:
            int r7 = r7 + 3
            r5 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0015
        L_0x0455:
            com.google.android.gms.internal.measurement.xa<?, ?> r3 = r0.f6801l
            java.lang.Object r1 = r3.mo34605c(r1)
            r3.mo34611i(r1, r2)
            return
        L_0x045f:
            com.google.android.gms.internal.measurement.j8<?> r2 = r0.f6802m
            r2.mo34123a(r1)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C5675ba.m8799A(java.lang.Object, com.google.android.gms.internal.measurement.e8):void");
    }

    /* renamed from: B */
    private final <K, V> void m8800B(C5724e8 e8Var, int i, Object obj, int i2) {
        if (obj != null) {
            C5924q9 q9Var = (C5924q9) m8823o(i2);
            throw null;
        }
    }

    /* renamed from: C */
    private static final void m8801C(int i, Object obj, C5724e8 e8Var) {
        if (obj instanceof String) {
            e8Var.mo33917f(i, (String) obj);
        } else {
            e8Var.mo33925o(i, (C6018w7) obj);
        }
    }

    /* renamed from: E */
    static C6053ya m8802E(Object obj) {
        C6003v8 v8Var = (C6003v8) obj;
        C6053ya yaVar = v8Var.zzc;
        if (yaVar != C6053ya.m10311c()) {
            return yaVar;
        }
        C6053ya e = C6053ya.m10313e();
        v8Var.zzc = e;
        return e;
    }

    /* renamed from: F */
    static <T> C5675ba<T> m8803F(Class<T> cls, C5988u9 u9Var, C5709da daVar, C5844l9 l9Var, C6037xa<?, ?> xaVar, C5809j8<?> j8Var, C5956s9 s9Var) {
        if (u9Var instanceof C5794ia) {
            return m8804G((C5794ia) u9Var, daVar, l9Var, xaVar, j8Var, s9Var);
        }
        C5989ua uaVar = (C5989ua) u9Var;
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
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> com.google.android.gms.internal.measurement.C5675ba<T> m8804G(com.google.android.gms.internal.measurement.C5794ia r34, com.google.android.gms.internal.measurement.C5709da r35, com.google.android.gms.internal.measurement.C5844l9 r36, com.google.android.gms.internal.measurement.C6037xa<?, ?> r37, com.google.android.gms.internal.measurement.C5809j8<?> r38, com.google.android.gms.internal.measurement.C5956s9 r39) {
        /*
            int r0 = r34.mo34094x()
            r1 = 2
            r2 = 0
            if (r0 != r1) goto L_0x000a
            r10 = 1
            goto L_0x000b
        L_0x000a:
            r10 = r2
        L_0x000b:
            java.lang.String r0 = r34.mo34092a()
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
            int[] r6 = f6788p
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
            sun.misc.Unsafe r15 = f6789q
            java.lang.Object[] r17 = r34.mo34093b()
            com.google.android.gms.internal.measurement.y9 r18 = r34.zza()
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
            java.lang.reflect.Field r12 = m8824p(r2, r12)
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
            java.lang.reflect.Field r8 = m8824p(r2, r8)
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
            java.lang.reflect.Field r8 = m8824p(r2, r8)
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
            java.lang.reflect.Field r11 = m8824p(r2, r11)
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
            com.google.android.gms.internal.measurement.ba r0 = new com.google.android.gms.internal.measurement.ba
            r4 = r0
            com.google.android.gms.internal.measurement.y9 r9 = r34.zza()
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C5675ba.m8804G(com.google.android.gms.internal.measurement.ia, com.google.android.gms.internal.measurement.da, com.google.android.gms.internal.measurement.l9, com.google.android.gms.internal.measurement.xa, com.google.android.gms.internal.measurement.j8, com.google.android.gms.internal.measurement.s9):com.google.android.gms.internal.measurement.ba");
    }

    /* renamed from: H */
    private static <T> double m8805H(T t, long j) {
        return ((Double) C5778hb.m9361k(t, j)).doubleValue();
    }

    /* renamed from: I */
    private static <T> float m8806I(T t, long j) {
        return ((Float) C5778hb.m9361k(t, j)).floatValue();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0302, code lost:
        r8 = r8 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0469, code lost:
        r8 = r8 + (r9 + r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x04b3, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04de, code lost:
        r8 = r8 + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x04df, code lost:
        r4 = r4 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0506, code lost:
        r7 = r7 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0513, code lost:
        r7 = r7 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0521, code lost:
        r7 = r7 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0525, code lost:
        r3 = r3 + 3;
     */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m8807J(T r15) {
        /*
            r14 = this;
            sun.misc.Unsafe r0 = f6789q
            r1 = 0
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r2
        L_0x000a:
            int[] r7 = r14.f6790a
            int r7 = r7.length
            if (r3 >= r7) goto L_0x0529
            int r7 = r14.m8819k(r3)
            int[] r8 = r14.f6790a
            r8 = r8[r3]
            int r9 = m8818j(r7)
            r10 = 17
            r11 = 1
            if (r9 > r10) goto L_0x0035
            int[] r10 = r14.f6790a
            int r12 = r3 + 2
            r10 = r10[r12]
            r12 = r10 & r2
            int r10 = r10 >>> 20
            int r10 = r11 << r10
            if (r12 == r6) goto L_0x0036
            long r5 = (long) r12
            int r5 = r0.getInt(r15, r5)
            r6 = r12
            goto L_0x0036
        L_0x0035:
            r10 = r1
        L_0x0036:
            r7 = r7 & r2
            long r12 = (long) r7
            r7 = 63
            switch(r9) {
                case 0: goto L_0x0517;
                case 1: goto L_0x0509;
                case 2: goto L_0x04f4;
                case 3: goto L_0x04e1;
                case 4: goto L_0x04cc;
                case 5: goto L_0x04c1;
                case 6: goto L_0x04b6;
                case 7: goto L_0x04a9;
                case 8: goto L_0x047f;
                case 9: goto L_0x046d;
                case 10: goto L_0x0451;
                case 11: goto L_0x043d;
                case 12: goto L_0x0429;
                case 13: goto L_0x041d;
                case 14: goto L_0x0411;
                case 15: goto L_0x03f8;
                case 16: goto L_0x03e0;
                case 17: goto L_0x03cd;
                case 18: goto L_0x03c0;
                case 19: goto L_0x03b5;
                case 20: goto L_0x03aa;
                case 21: goto L_0x039f;
                case 22: goto L_0x0394;
                case 23: goto L_0x0389;
                case 24: goto L_0x037e;
                case 25: goto L_0x0373;
                case 26: goto L_0x0368;
                case 27: goto L_0x0359;
                case 28: goto L_0x034d;
                case 29: goto L_0x0341;
                case 30: goto L_0x0335;
                case 31: goto L_0x0329;
                case 32: goto L_0x031d;
                case 33: goto L_0x0311;
                case 34: goto L_0x0305;
                case 35: goto L_0x02ee;
                case 36: goto L_0x02d9;
                case 37: goto L_0x02c4;
                case 38: goto L_0x02af;
                case 39: goto L_0x029a;
                case 40: goto L_0x0285;
                case 41: goto L_0x026f;
                case 42: goto L_0x0259;
                case 43: goto L_0x0243;
                case 44: goto L_0x022d;
                case 45: goto L_0x0217;
                case 46: goto L_0x0201;
                case 47: goto L_0x01eb;
                case 48: goto L_0x01d5;
                case 49: goto L_0x01c5;
                case 50: goto L_0x01b8;
                case 51: goto L_0x01aa;
                case 52: goto L_0x019c;
                case 53: goto L_0x0186;
                case 54: goto L_0x0170;
                case 55: goto L_0x015a;
                case 56: goto L_0x014c;
                case 57: goto L_0x013e;
                case 58: goto L_0x0130;
                case 59: goto L_0x0102;
                case 60: goto L_0x00ee;
                case 61: goto L_0x00d2;
                case 62: goto L_0x00bc;
                case 63: goto L_0x00a6;
                case 64: goto L_0x0098;
                case 65: goto L_0x008a;
                case 66: goto L_0x006f;
                case 67: goto L_0x0055;
                case 68: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x0525
        L_0x003f:
            boolean r7 = r14.m8833y(r15, r8, r3)
            if (r7 == 0) goto L_0x0525
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.measurement.y9 r7 = (com.google.android.gms.internal.measurement.C6052y9) r7
            com.google.android.gms.internal.measurement.ja r9 = r14.m8822n(r3)
            int r7 = com.google.android.gms.internal.measurement.C5707d8.m8993y(r8, r7, r9)
            goto L_0x03ca
        L_0x0055:
            boolean r9 = r14.m8833y(r15, r8, r3)
            if (r9 == 0) goto L_0x0525
            long r9 = m8820l(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r8)
            long r11 = r9 + r9
            long r9 = r9 >> r7
            long r9 = r9 ^ r11
            int r7 = com.google.android.gms.internal.measurement.C5707d8.m8989b(r9)
            goto L_0x04de
        L_0x006f:
            boolean r7 = r14.m8833y(r15, r8, r3)
            if (r7 == 0) goto L_0x0525
            int r7 = m8809L(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r8)
            int r9 = r7 + r7
            int r7 = r7 >> 31
            r7 = r7 ^ r9
            int r7 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r7)
            goto L_0x04de
        L_0x008a:
            boolean r7 = r14.m8833y(r15, r8, r3)
            if (r7 == 0) goto L_0x0525
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r7)
            goto L_0x0521
        L_0x0098:
            boolean r7 = r14.m8833y(r15, r8, r3)
            if (r7 == 0) goto L_0x0525
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r7)
            goto L_0x0513
        L_0x00a6:
            boolean r7 = r14.m8833y(r15, r8, r3)
            if (r7 == 0) goto L_0x0525
            int r7 = m8809L(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r8)
            int r7 = com.google.android.gms.internal.measurement.C5707d8.m8994z(r7)
            goto L_0x04de
        L_0x00bc:
            boolean r7 = r14.m8833y(r15, r8, r3)
            if (r7 == 0) goto L_0x0525
            int r7 = m8809L(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r8)
            int r7 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r7)
            goto L_0x04de
        L_0x00d2:
            boolean r7 = r14.m8833y(r15, r8, r3)
            if (r7 == 0) goto L_0x0525
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.measurement.w7 r7 = (com.google.android.gms.internal.measurement.C6018w7) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r8)
            int r7 = r7.mo34319j()
            int r9 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r7)
            goto L_0x0469
        L_0x00ee:
            boolean r7 = r14.m8833y(r15, r8, r3)
            if (r7 == 0) goto L_0x0525
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.measurement.ja r9 = r14.m8822n(r3)
            int r7 = com.google.android.gms.internal.measurement.C5845la.m9579Q(r8, r7, r9)
            goto L_0x03ca
        L_0x0102:
            boolean r7 = r14.m8833y(r15, r8, r3)
            if (r7 == 0) goto L_0x0525
            java.lang.Object r7 = r0.getObject(r15, r12)
            boolean r9 = r7 instanceof com.google.android.gms.internal.measurement.C6018w7
            if (r9 == 0) goto L_0x0122
            com.google.android.gms.internal.measurement.w7 r7 = (com.google.android.gms.internal.measurement.C6018w7) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r8)
            int r7 = r7.mo34319j()
            int r9 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r7)
            goto L_0x0469
        L_0x0122:
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r8)
            int r7 = com.google.android.gms.internal.measurement.C5707d8.m8986C(r7)
            goto L_0x04de
        L_0x0130:
            boolean r7 = r14.m8833y(r15, r8, r3)
            if (r7 == 0) goto L_0x0525
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r7)
            goto L_0x04b3
        L_0x013e:
            boolean r7 = r14.m8833y(r15, r8, r3)
            if (r7 == 0) goto L_0x0525
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r7)
            goto L_0x0513
        L_0x014c:
            boolean r7 = r14.m8833y(r15, r8, r3)
            if (r7 == 0) goto L_0x0525
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r7)
            goto L_0x0521
        L_0x015a:
            boolean r7 = r14.m8833y(r15, r8, r3)
            if (r7 == 0) goto L_0x0525
            int r7 = m8809L(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r8)
            int r7 = com.google.android.gms.internal.measurement.C5707d8.m8994z(r7)
            goto L_0x04de
        L_0x0170:
            boolean r7 = r14.m8833y(r15, r8, r3)
            if (r7 == 0) goto L_0x0525
            long r9 = m8820l(r15, r12)
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r7)
            int r8 = com.google.android.gms.internal.measurement.C5707d8.m8989b(r9)
            goto L_0x0506
        L_0x0186:
            boolean r7 = r14.m8833y(r15, r8, r3)
            if (r7 == 0) goto L_0x0525
            long r9 = m8820l(r15, r12)
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r7)
            int r8 = com.google.android.gms.internal.measurement.C5707d8.m8989b(r9)
            goto L_0x0506
        L_0x019c:
            boolean r7 = r14.m8833y(r15, r8, r3)
            if (r7 == 0) goto L_0x0525
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r7)
            goto L_0x0513
        L_0x01aa:
            boolean r7 = r14.m8833y(r15, r8, r3)
            if (r7 == 0) goto L_0x0525
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r7)
            goto L_0x0521
        L_0x01b8:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.lang.Object r9 = r14.m8823o(r3)
            com.google.android.gms.internal.measurement.C5956s9.m9887a(r8, r7, r9)
            goto L_0x0525
        L_0x01c5:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.ja r9 = r14.m8822n(r3)
            int r7 = com.google.android.gms.internal.measurement.C5845la.m9574L(r8, r7, r9)
            goto L_0x03ca
        L_0x01d5:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.C5845la.m9584V(r7)
            if (r7 <= 0) goto L_0x0525
            int r8 = com.google.android.gms.internal.measurement.C5707d8.m8987D(r8)
            int r9 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r7)
            goto L_0x0302
        L_0x01eb:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.C5845la.m9582T(r7)
            if (r7 <= 0) goto L_0x0525
            int r8 = com.google.android.gms.internal.measurement.C5707d8.m8987D(r8)
            int r9 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r7)
            goto L_0x0302
        L_0x0201:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.C5845la.m9573K(r7)
            if (r7 <= 0) goto L_0x0525
            int r8 = com.google.android.gms.internal.measurement.C5707d8.m8987D(r8)
            int r9 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r7)
            goto L_0x0302
        L_0x0217:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.C5845la.m9571I(r7)
            if (r7 <= 0) goto L_0x0525
            int r8 = com.google.android.gms.internal.measurement.C5707d8.m8987D(r8)
            int r9 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r7)
            goto L_0x0302
        L_0x022d:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.C5845la.m9569G(r7)
            if (r7 <= 0) goto L_0x0525
            int r8 = com.google.android.gms.internal.measurement.C5707d8.m8987D(r8)
            int r9 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r7)
            goto L_0x0302
        L_0x0243:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.C5845la.m9587Y(r7)
            if (r7 <= 0) goto L_0x0525
            int r8 = com.google.android.gms.internal.measurement.C5707d8.m8987D(r8)
            int r9 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r7)
            goto L_0x0302
        L_0x0259:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.C5845la.m9566D(r7)
            if (r7 <= 0) goto L_0x0525
            int r8 = com.google.android.gms.internal.measurement.C5707d8.m8987D(r8)
            int r9 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r7)
            goto L_0x0302
        L_0x026f:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.C5845la.m9571I(r7)
            if (r7 <= 0) goto L_0x0525
            int r8 = com.google.android.gms.internal.measurement.C5707d8.m8987D(r8)
            int r9 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r7)
            goto L_0x0302
        L_0x0285:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.C5845la.m9573K(r7)
            if (r7 <= 0) goto L_0x0525
            int r8 = com.google.android.gms.internal.measurement.C5707d8.m8987D(r8)
            int r9 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r7)
            goto L_0x0302
        L_0x029a:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.C5845la.m9576N(r7)
            if (r7 <= 0) goto L_0x0525
            int r8 = com.google.android.gms.internal.measurement.C5707d8.m8987D(r8)
            int r9 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r7)
            goto L_0x0302
        L_0x02af:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.C5845la.m9590a0(r7)
            if (r7 <= 0) goto L_0x0525
            int r8 = com.google.android.gms.internal.measurement.C5707d8.m8987D(r8)
            int r9 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r7)
            goto L_0x0302
        L_0x02c4:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.C5845la.m9578P(r7)
            if (r7 <= 0) goto L_0x0525
            int r8 = com.google.android.gms.internal.measurement.C5707d8.m8987D(r8)
            int r9 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r7)
            goto L_0x0302
        L_0x02d9:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.C5845la.m9571I(r7)
            if (r7 <= 0) goto L_0x0525
            int r8 = com.google.android.gms.internal.measurement.C5707d8.m8987D(r8)
            int r9 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r7)
            goto L_0x0302
        L_0x02ee:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.C5845la.m9573K(r7)
            if (r7 <= 0) goto L_0x0525
            int r8 = com.google.android.gms.internal.measurement.C5707d8.m8987D(r8)
            int r9 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r7)
        L_0x0302:
            int r8 = r8 + r9
            goto L_0x04de
        L_0x0305:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.C5845la.m9583U(r8, r7, r1)
            goto L_0x03ca
        L_0x0311:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.C5845la.m9581S(r8, r7, r1)
            goto L_0x03ca
        L_0x031d:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.C5845la.m9572J(r8, r7, r1)
            goto L_0x03ca
        L_0x0329:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.C5845la.m9570H(r8, r7, r1)
            goto L_0x03ca
        L_0x0335:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.C5845la.m9568F(r8, r7, r1)
            goto L_0x03ca
        L_0x0341:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.C5845la.m9586X(r8, r7, r1)
            goto L_0x03ca
        L_0x034d:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.C5845la.m9567E(r8, r7)
            goto L_0x03ca
        L_0x0359:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.measurement.ja r9 = r14.m8822n(r3)
            int r7 = com.google.android.gms.internal.measurement.C5845la.m9580R(r8, r7, r9)
            goto L_0x03ca
        L_0x0368:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.C5845la.m9585W(r8, r7)
            goto L_0x03ca
        L_0x0373:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.C5845la.m9563A(r8, r7, r1)
            goto L_0x03ca
        L_0x037e:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.C5845la.m9570H(r8, r7, r1)
            goto L_0x03ca
        L_0x0389:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.C5845la.m9572J(r8, r7, r1)
            goto L_0x03ca
        L_0x0394:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.C5845la.m9575M(r8, r7, r1)
            goto L_0x03ca
        L_0x039f:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.C5845la.m9588Z(r8, r7, r1)
            goto L_0x03ca
        L_0x03aa:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.C5845la.m9577O(r8, r7, r1)
            goto L_0x03ca
        L_0x03b5:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.C5845la.m9570H(r8, r7, r1)
            goto L_0x03ca
        L_0x03c0:
            java.lang.Object r7 = r0.getObject(r15, r12)
            java.util.List r7 = (java.util.List) r7
            int r7 = com.google.android.gms.internal.measurement.C5845la.m9572J(r8, r7, r1)
        L_0x03ca:
            int r4 = r4 + r7
            goto L_0x0525
        L_0x03cd:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0525
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.measurement.y9 r7 = (com.google.android.gms.internal.measurement.C6052y9) r7
            com.google.android.gms.internal.measurement.ja r9 = r14.m8822n(r3)
            int r7 = com.google.android.gms.internal.measurement.C5707d8.m8993y(r8, r7, r9)
            goto L_0x03ca
        L_0x03e0:
            r9 = r5 & r10
            if (r9 == 0) goto L_0x0525
            long r9 = r0.getLong(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r8)
            long r11 = r9 + r9
            long r9 = r9 >> r7
            long r9 = r9 ^ r11
            int r7 = com.google.android.gms.internal.measurement.C5707d8.m8989b(r9)
            goto L_0x04de
        L_0x03f8:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0525
            int r7 = r0.getInt(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r8)
            int r9 = r7 + r7
            int r7 = r7 >> 31
            r7 = r7 ^ r9
            int r7 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r7)
            goto L_0x04de
        L_0x0411:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0525
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r7)
            goto L_0x0521
        L_0x041d:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0525
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r7)
            goto L_0x0513
        L_0x0429:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0525
            int r7 = r0.getInt(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r8)
            int r7 = com.google.android.gms.internal.measurement.C5707d8.m8994z(r7)
            goto L_0x04de
        L_0x043d:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0525
            int r7 = r0.getInt(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r8)
            int r7 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r7)
            goto L_0x04de
        L_0x0451:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0525
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.measurement.w7 r7 = (com.google.android.gms.internal.measurement.C6018w7) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r8)
            int r7 = r7.mo34319j()
            int r9 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r7)
        L_0x0469:
            int r9 = r9 + r7
            int r8 = r8 + r9
            goto L_0x04df
        L_0x046d:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0525
            java.lang.Object r7 = r0.getObject(r15, r12)
            com.google.android.gms.internal.measurement.ja r9 = r14.m8822n(r3)
            int r7 = com.google.android.gms.internal.measurement.C5845la.m9579Q(r8, r7, r9)
            goto L_0x03ca
        L_0x047f:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0525
            java.lang.Object r7 = r0.getObject(r15, r12)
            boolean r9 = r7 instanceof com.google.android.gms.internal.measurement.C6018w7
            if (r9 == 0) goto L_0x049c
            com.google.android.gms.internal.measurement.w7 r7 = (com.google.android.gms.internal.measurement.C6018w7) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r8)
            int r7 = r7.mo34319j()
            int r9 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r7)
            goto L_0x0469
        L_0x049c:
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r8)
            int r7 = com.google.android.gms.internal.measurement.C5707d8.m8986C(r7)
            goto L_0x04de
        L_0x04a9:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0525
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r7)
        L_0x04b3:
            int r7 = r7 + r11
            goto L_0x03ca
        L_0x04b6:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0525
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r7)
            goto L_0x0513
        L_0x04c1:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0525
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r7)
            goto L_0x0521
        L_0x04cc:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0525
            int r7 = r0.getInt(r15, r12)
            int r8 = r8 << 3
            int r8 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r8)
            int r7 = com.google.android.gms.internal.measurement.C5707d8.m8994z(r7)
        L_0x04de:
            int r8 = r8 + r7
        L_0x04df:
            int r4 = r4 + r8
            goto L_0x0525
        L_0x04e1:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0525
            long r9 = r0.getLong(r15, r12)
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r7)
            int r8 = com.google.android.gms.internal.measurement.C5707d8.m8989b(r9)
            goto L_0x0506
        L_0x04f4:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0525
            long r9 = r0.getLong(r15, r12)
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r7)
            int r8 = com.google.android.gms.internal.measurement.C5707d8.m8989b(r9)
        L_0x0506:
            int r7 = r7 + r8
            goto L_0x03ca
        L_0x0509:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0525
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r7)
        L_0x0513:
            int r7 = r7 + 4
            goto L_0x03ca
        L_0x0517:
            r7 = r5 & r10
            if (r7 == 0) goto L_0x0525
            int r7 = r8 << 3
            int r7 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r7)
        L_0x0521:
            int r7 = r7 + 8
            goto L_0x03ca
        L_0x0525:
            int r3 = r3 + 3
            goto L_0x000a
        L_0x0529:
            com.google.android.gms.internal.measurement.xa<?, ?> r0 = r14.f6801l
            java.lang.Object r1 = r0.mo34605c(r15)
            int r0 = r0.mo34603a(r1)
            int r4 = r4 + r0
            boolean r0 = r14.f6795f
            if (r0 != 0) goto L_0x0539
            return r4
        L_0x0539:
            com.google.android.gms.internal.measurement.j8<?> r0 = r14.f6802m
            r0.mo34123a(r15)
            r15 = 0
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C5675ba.m8807J(java.lang.Object):int");
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
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m8808K(T r12) {
        /*
            r11 = this;
            sun.misc.Unsafe r0 = f6789q
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x0005:
            int[] r4 = r11.f6790a
            int r4 = r4.length
            if (r2 >= r4) goto L_0x0549
            int r4 = r11.m8819k(r2)
            int r5 = m8818j(r4)
            int[] r6 = r11.f6790a
            r6 = r6[r2]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            long r7 = (long) r4
            com.google.android.gms.internal.measurement.o8 r4 = com.google.android.gms.internal.measurement.C5891o8.DOUBLE_LIST_PACKED
            int r4 = r4.zza()
            if (r5 < r4) goto L_0x0031
            com.google.android.gms.internal.measurement.o8 r4 = com.google.android.gms.internal.measurement.C5891o8.SINT64_LIST_PACKED
            int r4 = r4.zza()
            if (r5 > r4) goto L_0x0031
            int[] r4 = r11.f6790a
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
            boolean r4 = r11.m8833y(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C5778hb.m9361k(r12, r7)
            com.google.android.gms.internal.measurement.y9 r4 = (com.google.android.gms.internal.measurement.C6052y9) r4
            com.google.android.gms.internal.measurement.ja r5 = r11.m8822n(r2)
            int r4 = com.google.android.gms.internal.measurement.C5707d8.m8993y(r6, r4, r5)
            goto L_0x03c4
        L_0x004e:
            boolean r5 = r11.m8833y(r12, r6, r2)
            if (r5 == 0) goto L_0x0545
            long r7 = m8820l(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = com.google.android.gms.internal.measurement.C5707d8.m8989b(r6)
            goto L_0x04f6
        L_0x0069:
            boolean r4 = r11.m8833y(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m8809L(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r4)
            goto L_0x04f6
        L_0x0084:
            boolean r4 = r11.m8833y(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r4)
            goto L_0x0541
        L_0x0092:
            boolean r4 = r11.m8833y(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r4)
            goto L_0x0531
        L_0x00a0:
            boolean r4 = r11.m8833y(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m8809L(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r5)
            int r4 = com.google.android.gms.internal.measurement.C5707d8.m8994z(r4)
            goto L_0x04f6
        L_0x00b6:
            boolean r4 = r11.m8833y(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m8809L(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r5)
            int r4 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r4)
            goto L_0x04f6
        L_0x00cc:
            boolean r4 = r11.m8833y(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C5778hb.m9361k(r12, r7)
            com.google.android.gms.internal.measurement.w7 r4 = (com.google.android.gms.internal.measurement.C6018w7) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r5)
            int r4 = r4.mo34319j()
            int r6 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r4)
            goto L_0x0474
        L_0x00e8:
            boolean r4 = r11.m8833y(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C5778hb.m9361k(r12, r7)
            com.google.android.gms.internal.measurement.ja r5 = r11.m8822n(r2)
            int r4 = com.google.android.gms.internal.measurement.C5845la.m9579Q(r6, r4, r5)
            goto L_0x03c4
        L_0x00fc:
            boolean r4 = r11.m8833y(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C5778hb.m9361k(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.measurement.C6018w7
            if (r5 == 0) goto L_0x011c
            com.google.android.gms.internal.measurement.w7 r4 = (com.google.android.gms.internal.measurement.C6018w7) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r5)
            int r4 = r4.mo34319j()
            int r6 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r4)
            goto L_0x0474
        L_0x011c:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r5)
            int r4 = com.google.android.gms.internal.measurement.C5707d8.m8986C(r4)
            goto L_0x04f6
        L_0x012a:
            boolean r4 = r11.m8833y(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r4)
            goto L_0x04c4
        L_0x0138:
            boolean r4 = r11.m8833y(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r4)
            goto L_0x0531
        L_0x0146:
            boolean r4 = r11.m8833y(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r4)
            goto L_0x0541
        L_0x0154:
            boolean r4 = r11.m8833y(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = m8809L(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r5)
            int r4 = com.google.android.gms.internal.measurement.C5707d8.m8994z(r4)
            goto L_0x04f6
        L_0x016a:
            boolean r4 = r11.m8833y(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = m8820l(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r6)
            int r4 = com.google.android.gms.internal.measurement.C5707d8.m8989b(r4)
            goto L_0x0522
        L_0x0180:
            boolean r4 = r11.m8833y(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = m8820l(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r6)
            int r4 = com.google.android.gms.internal.measurement.C5707d8.m8989b(r4)
            goto L_0x0522
        L_0x0196:
            boolean r4 = r11.m8833y(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r4)
            goto L_0x0531
        L_0x01a4:
            boolean r4 = r11.m8833y(r12, r6, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r4)
            goto L_0x0541
        L_0x01b2:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C5778hb.m9361k(r12, r7)
            java.lang.Object r5 = r11.m8823o(r2)
            com.google.android.gms.internal.measurement.C5956s9.m9887a(r6, r4, r5)
            goto L_0x0545
        L_0x01bf:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C5778hb.m9361k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.ja r5 = r11.m8822n(r2)
            int r4 = com.google.android.gms.internal.measurement.C5845la.m9574L(r6, r4, r5)
            goto L_0x03c4
        L_0x01cf:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C5845la.m9584V(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.C5707d8.m8987D(r6)
            int r6 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r4)
            goto L_0x02fc
        L_0x01e5:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C5845la.m9582T(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.C5707d8.m8987D(r6)
            int r6 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r4)
            goto L_0x02fc
        L_0x01fb:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C5845la.m9573K(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.C5707d8.m8987D(r6)
            int r6 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r4)
            goto L_0x02fc
        L_0x0211:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C5845la.m9571I(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.C5707d8.m8987D(r6)
            int r6 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r4)
            goto L_0x02fc
        L_0x0227:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C5845la.m9569G(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.C5707d8.m8987D(r6)
            int r6 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r4)
            goto L_0x02fc
        L_0x023d:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C5845la.m9587Y(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.C5707d8.m8987D(r6)
            int r6 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r4)
            goto L_0x02fc
        L_0x0253:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C5845la.m9566D(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.C5707d8.m8987D(r6)
            int r6 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r4)
            goto L_0x02fc
        L_0x0269:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C5845la.m9571I(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.C5707d8.m8987D(r6)
            int r6 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r4)
            goto L_0x02fc
        L_0x027f:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C5845la.m9573K(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.C5707d8.m8987D(r6)
            int r6 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r4)
            goto L_0x02fc
        L_0x0294:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C5845la.m9576N(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.C5707d8.m8987D(r6)
            int r6 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r4)
            goto L_0x02fc
        L_0x02a9:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C5845la.m9590a0(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.C5707d8.m8987D(r6)
            int r6 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r4)
            goto L_0x02fc
        L_0x02be:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C5845la.m9578P(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.C5707d8.m8987D(r6)
            int r6 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r4)
            goto L_0x02fc
        L_0x02d3:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C5845la.m9571I(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.C5707d8.m8987D(r6)
            int r6 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r4)
            goto L_0x02fc
        L_0x02e8:
            java.lang.Object r4 = r0.getObject(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C5845la.m9573K(r4)
            if (r4 <= 0) goto L_0x0545
            int r5 = com.google.android.gms.internal.measurement.C5707d8.m8987D(r6)
            int r6 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r4)
        L_0x02fc:
            int r5 = r5 + r6
            goto L_0x04f6
        L_0x02ff:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C5778hb.m9361k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C5845la.m9583U(r6, r4, r1)
            goto L_0x03c4
        L_0x030b:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C5778hb.m9361k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C5845la.m9581S(r6, r4, r1)
            goto L_0x03c4
        L_0x0317:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C5778hb.m9361k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C5845la.m9572J(r6, r4, r1)
            goto L_0x03c4
        L_0x0323:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C5778hb.m9361k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C5845la.m9570H(r6, r4, r1)
            goto L_0x03c4
        L_0x032f:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C5778hb.m9361k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C5845la.m9568F(r6, r4, r1)
            goto L_0x03c4
        L_0x033b:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C5778hb.m9361k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C5845la.m9586X(r6, r4, r1)
            goto L_0x03c4
        L_0x0347:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C5778hb.m9361k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C5845la.m9567E(r6, r4)
            goto L_0x03c4
        L_0x0353:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C5778hb.m9361k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            com.google.android.gms.internal.measurement.ja r5 = r11.m8822n(r2)
            int r4 = com.google.android.gms.internal.measurement.C5845la.m9580R(r6, r4, r5)
            goto L_0x03c4
        L_0x0362:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C5778hb.m9361k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C5845la.m9585W(r6, r4)
            goto L_0x03c4
        L_0x036d:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C5778hb.m9361k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C5845la.m9563A(r6, r4, r1)
            goto L_0x03c4
        L_0x0378:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C5778hb.m9361k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C5845la.m9570H(r6, r4, r1)
            goto L_0x03c4
        L_0x0383:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C5778hb.m9361k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C5845la.m9572J(r6, r4, r1)
            goto L_0x03c4
        L_0x038e:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C5778hb.m9361k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C5845la.m9575M(r6, r4, r1)
            goto L_0x03c4
        L_0x0399:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C5778hb.m9361k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C5845la.m9588Z(r6, r4, r1)
            goto L_0x03c4
        L_0x03a4:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C5778hb.m9361k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C5845la.m9577O(r6, r4, r1)
            goto L_0x03c4
        L_0x03af:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C5778hb.m9361k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C5845la.m9570H(r6, r4, r1)
            goto L_0x03c4
        L_0x03ba:
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C5778hb.m9361k(r12, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.measurement.C5845la.m9572J(r6, r4, r1)
        L_0x03c4:
            int r3 = r3 + r4
            goto L_0x0545
        L_0x03c7:
            boolean r4 = r11.m8830v(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C5778hb.m9361k(r12, r7)
            com.google.android.gms.internal.measurement.y9 r4 = (com.google.android.gms.internal.measurement.C6052y9) r4
            com.google.android.gms.internal.measurement.ja r5 = r11.m8822n(r2)
            int r4 = com.google.android.gms.internal.measurement.C5707d8.m8993y(r6, r4, r5)
            goto L_0x03c4
        L_0x03dc:
            boolean r5 = r11.m8830v(r12, r2)
            if (r5 == 0) goto L_0x0545
            long r7 = com.google.android.gms.internal.measurement.C5778hb.m9359i(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r5)
            long r9 = r7 + r7
            long r6 = r7 >> r4
            long r6 = r6 ^ r9
            int r4 = com.google.android.gms.internal.measurement.C5707d8.m8989b(r6)
            goto L_0x04f6
        L_0x03f7:
            boolean r4 = r11.m8830v(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.measurement.C5778hb.m9358h(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r4)
            goto L_0x04f6
        L_0x0412:
            boolean r4 = r11.m8830v(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r4)
            goto L_0x0541
        L_0x0420:
            boolean r4 = r11.m8830v(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r4)
            goto L_0x0531
        L_0x042e:
            boolean r4 = r11.m8830v(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.measurement.C5778hb.m9358h(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r5)
            int r4 = com.google.android.gms.internal.measurement.C5707d8.m8994z(r4)
            goto L_0x04f6
        L_0x0444:
            boolean r4 = r11.m8830v(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.measurement.C5778hb.m9358h(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r5)
            int r4 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r4)
            goto L_0x04f6
        L_0x045a:
            boolean r4 = r11.m8830v(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C5778hb.m9361k(r12, r7)
            com.google.android.gms.internal.measurement.w7 r4 = (com.google.android.gms.internal.measurement.C6018w7) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r5)
            int r4 = r4.mo34319j()
            int r6 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r4)
        L_0x0474:
            int r6 = r6 + r4
            int r5 = r5 + r6
            goto L_0x04f7
        L_0x0478:
            boolean r4 = r11.m8830v(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C5778hb.m9361k(r12, r7)
            com.google.android.gms.internal.measurement.ja r5 = r11.m8822n(r2)
            int r4 = com.google.android.gms.internal.measurement.C5845la.m9579Q(r6, r4, r5)
            goto L_0x03c4
        L_0x048c:
            boolean r4 = r11.m8830v(r12, r2)
            if (r4 == 0) goto L_0x0545
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C5778hb.m9361k(r12, r7)
            boolean r5 = r4 instanceof com.google.android.gms.internal.measurement.C6018w7
            if (r5 == 0) goto L_0x04ab
            com.google.android.gms.internal.measurement.w7 r4 = (com.google.android.gms.internal.measurement.C6018w7) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r5)
            int r4 = r4.mo34319j()
            int r6 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r4)
            goto L_0x0474
        L_0x04ab:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r5)
            int r4 = com.google.android.gms.internal.measurement.C5707d8.m8986C(r4)
            goto L_0x04f6
        L_0x04b8:
            boolean r4 = r11.m8830v(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r4)
        L_0x04c4:
            int r4 = r4 + 1
            goto L_0x03c4
        L_0x04c8:
            boolean r4 = r11.m8830v(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r4)
            goto L_0x0531
        L_0x04d5:
            boolean r4 = r11.m8830v(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r4)
            goto L_0x0541
        L_0x04e2:
            boolean r4 = r11.m8830v(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = com.google.android.gms.internal.measurement.C5778hb.m9358h(r12, r7)
            int r5 = r6 << 3
            int r5 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r5)
            int r4 = com.google.android.gms.internal.measurement.C5707d8.m8994z(r4)
        L_0x04f6:
            int r5 = r5 + r4
        L_0x04f7:
            int r3 = r3 + r5
            goto L_0x0545
        L_0x04f9:
            boolean r4 = r11.m8830v(r12, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = com.google.android.gms.internal.measurement.C5778hb.m9359i(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r6)
            int r4 = com.google.android.gms.internal.measurement.C5707d8.m8989b(r4)
            goto L_0x0522
        L_0x050e:
            boolean r4 = r11.m8830v(r12, r2)
            if (r4 == 0) goto L_0x0545
            long r4 = com.google.android.gms.internal.measurement.C5778hb.m9359i(r12, r7)
            int r6 = r6 << 3
            int r6 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r6)
            int r4 = com.google.android.gms.internal.measurement.C5707d8.m8989b(r4)
        L_0x0522:
            int r6 = r6 + r4
            int r3 = r3 + r6
            goto L_0x0545
        L_0x0525:
            boolean r4 = r11.m8830v(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r4)
        L_0x0531:
            int r4 = r4 + 4
            goto L_0x03c4
        L_0x0535:
            boolean r4 = r11.m8830v(r12, r2)
            if (r4 == 0) goto L_0x0545
            int r4 = r6 << 3
            int r4 = com.google.android.gms.internal.measurement.C5707d8.m8988a(r4)
        L_0x0541:
            int r4 = r4 + 8
            goto L_0x03c4
        L_0x0545:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x0549:
            com.google.android.gms.internal.measurement.xa<?, ?> r0 = r11.f6801l
            java.lang.Object r12 = r0.mo34605c(r12)
            int r12 = r0.mo34603a(r12)
            int r3 = r3 + r12
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C5675ba.m8808K(java.lang.Object):int");
    }

    /* renamed from: L */
    private static <T> int m8809L(T t, long j) {
        return ((Integer) C5778hb.m9361k(t, j)).intValue();
    }

    /* renamed from: M */
    private final <K, V> int m8810M(T t, byte[] bArr, int i, int i2, int i3, long j, C5808j7 j7Var) {
        Unsafe unsafe = f6789q;
        Object o = m8823o(i3);
        Object object = unsafe.getObject(t, j);
        if (!((C5940r9) object).mo34326f()) {
            C5940r9 b = C5940r9.m9831a().mo34320b();
            C5956s9.m9888b(b, object);
            unsafe.putObject(t, j, b);
        }
        C5924q9 q9Var = (C5924q9) o;
        throw null;
    }

    /* renamed from: N */
    private final int m8811N(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C5808j7 j7Var) {
        T t2 = t;
        byte[] bArr2 = bArr;
        int i9 = i;
        int i10 = i3;
        int i11 = i4;
        int i12 = i5;
        long j2 = j;
        int i13 = i8;
        C5808j7 j7Var2 = j7Var;
        Unsafe unsafe = f6789q;
        long j3 = (long) (this.f6790a[i13 + 2] & 1048575);
        switch (i7) {
            case 51:
                if (i12 == 1) {
                    unsafe.putObject(t2, j2, Double.valueOf(Double.longBitsToDouble(C5825k7.m9515n(bArr, i))));
                    unsafe.putInt(t2, j3, i11);
                    return i9 + 8;
                }
                break;
            case 52:
                if (i12 == 5) {
                    unsafe.putObject(t2, j2, Float.valueOf(Float.intBitsToFloat(C5825k7.m9503b(bArr, i))));
                    unsafe.putInt(t2, j3, i11);
                    return i9 + 4;
                }
                break;
            case 53:
            case 54:
                if (i12 == 0) {
                    int m = C5825k7.m9514m(bArr2, i9, j7Var2);
                    unsafe.putObject(t2, j2, Long.valueOf(j7Var2.f7024b));
                    unsafe.putInt(t2, j3, i11);
                    return m;
                }
                break;
            case 55:
            case 62:
                if (i12 == 0) {
                    int j4 = C5825k7.m9511j(bArr2, i9, j7Var2);
                    unsafe.putObject(t2, j2, Integer.valueOf(j7Var2.f7023a));
                    unsafe.putInt(t2, j3, i11);
                    return j4;
                }
                break;
            case 56:
            case 65:
                if (i12 == 1) {
                    unsafe.putObject(t2, j2, Long.valueOf(C5825k7.m9515n(bArr, i)));
                    unsafe.putInt(t2, j3, i11);
                    return i9 + 8;
                }
                break;
            case 57:
            case 64:
                if (i12 == 5) {
                    unsafe.putObject(t2, j2, Integer.valueOf(C5825k7.m9503b(bArr, i)));
                    unsafe.putInt(t2, j3, i11);
                    return i9 + 4;
                }
                break;
            case 58:
                if (i12 == 0) {
                    int m2 = C5825k7.m9514m(bArr2, i9, j7Var2);
                    unsafe.putObject(t2, j2, Boolean.valueOf(j7Var2.f7024b != 0));
                    unsafe.putInt(t2, j3, i11);
                    return m2;
                }
                break;
            case 59:
                if (i12 == 2) {
                    int j5 = C5825k7.m9511j(bArr2, i9, j7Var2);
                    int i14 = j7Var2.f7023a;
                    if (i14 == 0) {
                        unsafe.putObject(t2, j2, "");
                    } else if ((i6 & 536870912) == 0 || C5862mb.m9645f(bArr2, j5, j5 + i14)) {
                        unsafe.putObject(t2, j2, new String(bArr2, j5, i14, C5708d9.f6852b));
                        j5 += i14;
                    } else {
                        throw zzkh.m10402c();
                    }
                    unsafe.putInt(t2, j3, i11);
                    return j5;
                }
                break;
            case 60:
                if (i12 == 2) {
                    int d = C5825k7.m9505d(m8822n(i13), bArr2, i9, i2, j7Var2);
                    Object object = unsafe.getInt(t2, j3) == i11 ? unsafe.getObject(t2, j2) : null;
                    if (object == null) {
                        unsafe.putObject(t2, j2, j7Var2.f7025c);
                    } else {
                        unsafe.putObject(t2, j2, C5708d9.m9020g(object, j7Var2.f7025c));
                    }
                    unsafe.putInt(t2, j3, i11);
                    return d;
                }
                break;
            case 61:
                if (i12 == 2) {
                    int a = C5825k7.m9502a(bArr2, i9, j7Var2);
                    unsafe.putObject(t2, j2, j7Var2.f7025c);
                    unsafe.putInt(t2, j3, i11);
                    return a;
                }
                break;
            case 63:
                if (i12 == 0) {
                    int j6 = C5825k7.m9511j(bArr2, i9, j7Var2);
                    int i15 = j7Var2.f7023a;
                    C6067z8 m3 = m8821m(i13);
                    if (m3 == null || m3.mo33746g(i15)) {
                        unsafe.putObject(t2, j2, Integer.valueOf(i15));
                        unsafe.putInt(t2, j3, i11);
                    } else {
                        m8802E(t).mo34645h(i10, Long.valueOf((long) i15));
                    }
                    return j6;
                }
                break;
            case 66:
                if (i12 == 0) {
                    int j7 = C5825k7.m9511j(bArr2, i9, j7Var2);
                    unsafe.putObject(t2, j2, Integer.valueOf(C5656a8.m8761a(j7Var2.f7023a)));
                    unsafe.putInt(t2, j3, i11);
                    return j7;
                }
                break;
            case 67:
                if (i12 == 0) {
                    int m4 = C5825k7.m9514m(bArr2, i9, j7Var2);
                    unsafe.putObject(t2, j2, Long.valueOf(C5656a8.m8762b(j7Var2.f7024b)));
                    unsafe.putInt(t2, j3, i11);
                    return m4;
                }
                break;
            case 68:
                if (i12 == 3) {
                    int c = C5825k7.m9504c(m8822n(i13), bArr, i, i2, (i10 & -8) | 4, j7Var);
                    Object object2 = unsafe.getInt(t2, j3) == i11 ? unsafe.getObject(t2, j2) : null;
                    if (object2 == null) {
                        unsafe.putObject(t2, j2, j7Var2.f7025c);
                    } else {
                        unsafe.putObject(t2, j2, C5708d9.m9020g(object2, j7Var2.f7025c));
                    }
                    unsafe.putInt(t2, j3, i11);
                    return c;
                }
                break;
        }
        return i9;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02e8, code lost:
        if (r0 != r15) goto L_0x02a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x030b, code lost:
        if (r0 != r15) goto L_0x02a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0088, code lost:
        r19 = r32;
        r11 = r34;
        r8 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008d, code lost:
        r32 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f2, code lost:
        r6 = r6 | r20;
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01c9, code lost:
        r2 = r8;
        r0 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01e4, code lost:
        r0 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0200, code lost:
        r6 = r32 | r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0202, code lost:
        r2 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0203, code lost:
        r1 = r19;
        r8 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0208, code lost:
        r6 = r32;
        r2 = r4;
        r18 = r8;
        r28 = r9;
        r27 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02a1, code lost:
        if (r0 != r15) goto L_0x02a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02b7, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m8812O(T r30, byte[] r31, int r32, int r33, com.google.android.gms.internal.measurement.C5808j7 r34) {
        /*
            r29 = this;
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            sun.misc.Unsafe r9 = f6789q
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r16 = 0
            r8 = -1
            r0 = r32
            r1 = r8
            r7 = r10
            r2 = r16
            r6 = r2
        L_0x0019:
            if (r0 >= r13) goto L_0x0335
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002b
            int r0 = com.google.android.gms.internal.measurement.C5825k7.m9512k(r0, r12, r3, r11)
            int r3 = r11.f7023a
            r4 = r0
            r17 = r3
            goto L_0x002e
        L_0x002b:
            r17 = r0
            r4 = r3
        L_0x002e:
            int r5 = r17 >>> 3
            r3 = r17 & 7
            if (r5 <= r1) goto L_0x003b
            int r2 = r2 / 3
            int r0 = r15.m8815R(r5, r2)
            goto L_0x003f
        L_0x003b:
            int r0 = r15.m8814Q(r5)
        L_0x003f:
            r2 = r0
            if (r2 != r8) goto L_0x004d
            r2 = r4
            r19 = r5
            r27 = r8
            r28 = r9
            r18 = r16
            goto L_0x030e
        L_0x004d:
            int[] r0 = r15.f6790a
            int r1 = r2 + 1
            r1 = r0[r1]
            int r0 = m8818j(r1)
            r8 = r1 & r10
            long r10 = (long) r8
            r8 = 17
            r32 = r5
            if (r0 > r8) goto L_0x0213
            int[] r8 = r15.f6790a
            int r20 = r2 + 2
            r8 = r8[r20]
            int r20 = r8 >>> 20
            r5 = 1
            int r20 = r5 << r20
            r22 = r10
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r8 & r10
            if (r8 == r7) goto L_0x0084
            if (r7 == r10) goto L_0x007c
            long r10 = (long) r7
            r9.putInt(r14, r10, r6)
            r10 = 1048575(0xfffff, float:1.469367E-39)
        L_0x007c:
            if (r8 == r10) goto L_0x0083
            long r6 = (long) r8
            int r6 = r9.getInt(r14, r6)
        L_0x0083:
            r7 = r8
        L_0x0084:
            r8 = 5
            switch(r0) {
                case 0: goto L_0x01e7;
                case 1: goto L_0x01cd;
                case 2: goto L_0x01ab;
                case 3: goto L_0x01ab;
                case 4: goto L_0x0196;
                case 5: goto L_0x0178;
                case 6: goto L_0x0163;
                case 7: goto L_0x0140;
                case 8: goto L_0x011f;
                case 9: goto L_0x00f7;
                case 10: goto L_0x00df;
                case 11: goto L_0x0196;
                case 12: goto L_0x00cc;
                case 13: goto L_0x0163;
                case 14: goto L_0x0178;
                case 15: goto L_0x00b2;
                case 16: goto L_0x0091;
                default: goto L_0x0088;
            }
        L_0x0088:
            r19 = r32
            r11 = r34
            r8 = r2
        L_0x008d:
            r32 = r6
            goto L_0x0208
        L_0x0091:
            if (r3 != 0) goto L_0x0088
            r11 = r34
            r0 = r22
            int r8 = com.google.android.gms.internal.measurement.C5825k7.m9514m(r12, r4, r11)
            long r3 = r11.f7024b
            long r4 = com.google.android.gms.internal.measurement.C5656a8.m8762b(r3)
            r0 = r9
            r1 = r30
            r17 = r8
            r8 = r2
            r2 = r22
            r19 = r32
            r0.putLong(r1, r2, r4)
            r6 = r6 | r20
            goto L_0x01c9
        L_0x00b2:
            r19 = r32
            r11 = r34
            r8 = r2
            if (r3 != 0) goto L_0x008d
            int r0 = com.google.android.gms.internal.measurement.C5825k7.m9511j(r12, r4, r11)
            int r1 = r11.f7023a
            int r1 = com.google.android.gms.internal.measurement.C5656a8.m8761a(r1)
            r2 = r22
            r9.putInt(r14, r2, r1)
            r6 = r6 | r20
            goto L_0x0202
        L_0x00cc:
            r19 = r32
            r11 = r34
            r8 = r2
            r0 = r22
            if (r3 != 0) goto L_0x008d
            int r2 = com.google.android.gms.internal.measurement.C5825k7.m9511j(r12, r4, r11)
            int r3 = r11.f7023a
            r9.putInt(r14, r0, r3)
            goto L_0x00f2
        L_0x00df:
            r19 = r32
            r11 = r34
            r8 = r2
            r0 = r22
            r2 = 2
            if (r3 != r2) goto L_0x008d
            int r2 = com.google.android.gms.internal.measurement.C5825k7.m9502a(r12, r4, r11)
            java.lang.Object r3 = r11.f7025c
            r9.putObject(r14, r0, r3)
        L_0x00f2:
            r6 = r6 | r20
            r0 = r2
            goto L_0x0202
        L_0x00f7:
            r19 = r32
            r11 = r34
            r8 = r2
            r0 = r22
            r2 = 2
            if (r3 != r2) goto L_0x008d
            com.google.android.gms.internal.measurement.ja r2 = r15.m8822n(r8)
            int r2 = com.google.android.gms.internal.measurement.C5825k7.m9505d(r2, r12, r4, r13, r11)
            java.lang.Object r3 = r9.getObject(r14, r0)
            if (r3 != 0) goto L_0x0115
            java.lang.Object r3 = r11.f7025c
            r9.putObject(r14, r0, r3)
            goto L_0x00f2
        L_0x0115:
            java.lang.Object r4 = r11.f7025c
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C5708d9.m9020g(r3, r4)
            r9.putObject(r14, r0, r3)
            goto L_0x00f2
        L_0x011f:
            r19 = r32
            r11 = r34
            r8 = r2
            r32 = r6
            r5 = r22
            r0 = 2
            if (r3 != r0) goto L_0x0208
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r1
            if (r0 != 0) goto L_0x0135
            int r0 = com.google.android.gms.internal.measurement.C5825k7.m9508g(r12, r4, r11)
            goto L_0x0139
        L_0x0135:
            int r0 = com.google.android.gms.internal.measurement.C5825k7.m9509h(r12, r4, r11)
        L_0x0139:
            java.lang.Object r1 = r11.f7025c
            r9.putObject(r14, r5, r1)
            goto L_0x0200
        L_0x0140:
            r19 = r32
            r11 = r34
            r8 = r2
            r0 = r5
            r32 = r6
            r5 = r22
            if (r3 != 0) goto L_0x0208
            int r1 = com.google.android.gms.internal.measurement.C5825k7.m9514m(r12, r4, r11)
            long r2 = r11.f7024b
            r21 = 0
            int r2 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r2 == 0) goto L_0x0159
            goto L_0x015b
        L_0x0159:
            r0 = r16
        L_0x015b:
            com.google.android.gms.internal.measurement.C5778hb.m9368r(r14, r5, r0)
            r6 = r32 | r20
            r0 = r1
            goto L_0x0202
        L_0x0163:
            r19 = r32
            r11 = r34
            r32 = r6
            r0 = r8
            r5 = r22
            r8 = r2
            if (r3 != r0) goto L_0x0208
            int r0 = com.google.android.gms.internal.measurement.C5825k7.m9503b(r12, r4)
            r9.putInt(r14, r5, r0)
            goto L_0x01e4
        L_0x0178:
            r19 = r32
            r11 = r34
            r8 = r2
            r0 = r5
            r32 = r6
            r5 = r22
            if (r3 != r0) goto L_0x0208
            long r21 = com.google.android.gms.internal.measurement.C5825k7.m9515n(r12, r4)
            r0 = r9
            r1 = r30
            r2 = r5
            r6 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            int r0 = r6 + 8
            goto L_0x0200
        L_0x0196:
            r19 = r32
            r11 = r34
            r8 = r2
            r32 = r6
            r5 = r22
            if (r3 != 0) goto L_0x0208
            int r0 = com.google.android.gms.internal.measurement.C5825k7.m9511j(r12, r4, r11)
            int r1 = r11.f7023a
            r9.putInt(r14, r5, r1)
            goto L_0x0200
        L_0x01ab:
            r19 = r32
            r11 = r34
            r8 = r2
            r32 = r6
            r5 = r22
            if (r3 != 0) goto L_0x0208
            int r17 = com.google.android.gms.internal.measurement.C5825k7.m9514m(r12, r4, r11)
            long r2 = r11.f7024b
            r0 = r9
            r1 = r30
            r21 = r2
            r2 = r5
            r4 = r21
            r0.putLong(r1, r2, r4)
            r6 = r32 | r20
        L_0x01c9:
            r2 = r8
            r0 = r17
            goto L_0x0203
        L_0x01cd:
            r19 = r32
            r11 = r34
            r32 = r6
            r0 = r8
            r5 = r22
            r8 = r2
            if (r3 != r0) goto L_0x0208
            int r0 = com.google.android.gms.internal.measurement.C5825k7.m9503b(r12, r4)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.measurement.C5778hb.m9371u(r14, r5, r0)
        L_0x01e4:
            int r0 = r4 + 4
            goto L_0x0200
        L_0x01e7:
            r19 = r32
            r11 = r34
            r8 = r2
            r0 = r5
            r32 = r6
            r5 = r22
            if (r3 != r0) goto L_0x0208
            long r0 = com.google.android.gms.internal.measurement.C5825k7.m9515n(r12, r4)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.measurement.C5778hb.m9370t(r14, r5, r0)
            int r0 = r4 + 8
        L_0x0200:
            r6 = r32 | r20
        L_0x0202:
            r2 = r8
        L_0x0203:
            r1 = r19
            r8 = -1
            goto L_0x0019
        L_0x0208:
            r6 = r32
            r2 = r4
            r18 = r8
            r28 = r9
            r27 = -1
            goto L_0x030e
        L_0x0213:
            r19 = r32
            r8 = r2
            r20 = r6
            r5 = r10
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r11 = r34
            r2 = 27
            if (r0 != r2) goto L_0x026c
            r2 = 2
            if (r3 != r2) goto L_0x025f
            java.lang.Object r0 = r9.getObject(r14, r5)
            com.google.android.gms.internal.measurement.c9 r0 = (com.google.android.gms.internal.measurement.C5691c9) r0
            boolean r1 = r0.mo33774x()
            if (r1 != 0) goto L_0x0242
            int r1 = r0.size()
            if (r1 != 0) goto L_0x023a
            r1 = 10
            goto L_0x023b
        L_0x023a:
            int r1 = r1 + r1
        L_0x023b:
            com.google.android.gms.internal.measurement.c9 r0 = r0.mo33773m(r1)
            r9.putObject(r14, r5, r0)
        L_0x0242:
            r5 = r0
            com.google.android.gms.internal.measurement.ja r0 = r15.m8822n(r8)
            r1 = r17
            r2 = r31
            r3 = r4
            r4 = r33
            r15 = r20
            r6 = r34
            int r0 = com.google.android.gms.internal.measurement.C5825k7.m9506e(r0, r1, r2, r3, r4, r5, r6)
            r2 = r8
            r6 = r15
            r1 = r19
            r8 = -1
            r15 = r29
            goto L_0x0019
        L_0x025f:
            r15 = r4
            r26 = r7
            r18 = r8
            r28 = r9
            r23 = r20
            r27 = -1
            goto L_0x02eb
        L_0x026c:
            r15 = r20
            r2 = 49
            if (r0 > r2) goto L_0x02b9
            long r1 = (long) r1
            r32 = r0
            r0 = r29
            r20 = r1
            r1 = r30
            r2 = r31
            r22 = r3
            r3 = r4
            r23 = r15
            r15 = r4
            r4 = r33
            r24 = r5
            r5 = r17
            r6 = r19
            r26 = r7
            r7 = r22
            r18 = r8
            r27 = -1
            r28 = r9
            r9 = r20
            r11 = r32
            r12 = r24
            r14 = r34
            int r0 = r0.m8813P(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x02b7
        L_0x02a3:
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r2 = r18
            r1 = r19
            r6 = r23
            r7 = r26
            goto L_0x032c
        L_0x02b7:
            r2 = r0
            goto L_0x02ec
        L_0x02b9:
            r32 = r0
            r22 = r3
            r24 = r5
            r26 = r7
            r18 = r8
            r28 = r9
            r23 = r15
            r27 = -1
            r15 = r4
            r0 = 50
            r9 = r32
            if (r9 != r0) goto L_0x02f1
            r7 = r22
            r0 = 2
            if (r7 != r0) goto L_0x02eb
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r18
            r6 = r24
            r8 = r34
            int r0 = r0.m8810M(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x02b7
            goto L_0x02a3
        L_0x02eb:
            r2 = r15
        L_0x02ec:
            r6 = r23
            r7 = r26
            goto L_0x030e
        L_0x02f1:
            r7 = r22
            r0 = r29
            r8 = r1
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r17
            r6 = r19
            r10 = r24
            r12 = r18
            r13 = r34
            int r0 = r0.m8811N(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x02b7
            goto L_0x02a3
        L_0x030e:
            com.google.android.gms.internal.measurement.ya r4 = m8802E(r30)
            r0 = r17
            r1 = r31
            r3 = r33
            r5 = r34
            int r0 = com.google.android.gms.internal.measurement.C5825k7.m9510i(r0, r1, r2, r3, r4, r5)
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r2 = r18
            r1 = r19
        L_0x032c:
            r8 = r27
            r9 = r28
            r10 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0019
        L_0x0335:
            r23 = r6
            r28 = r9
            r1 = r10
            if (r7 == r1) goto L_0x0346
            long r1 = (long) r7
            r3 = r30
            r6 = r23
            r4 = r28
            r4.putInt(r3, r1, r6)
        L_0x0346:
            r1 = r33
            if (r0 != r1) goto L_0x034b
            return r0
        L_0x034b:
            com.google.android.gms.internal.measurement.zzkh r0 = com.google.android.gms.internal.measurement.zzkh.m10404e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C5675ba.m8812O(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.j7):int");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x0450 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01cf  */
    /* renamed from: P */
    private final int m8813P(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.measurement.C5808j7 r29) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r2 = r20
            r6 = r22
            r8 = r23
            r9 = r27
            r7 = r29
            sun.misc.Unsafe r11 = f6789q
            java.lang.Object r12 = r11.getObject(r1, r9)
            com.google.android.gms.internal.measurement.c9 r12 = (com.google.android.gms.internal.measurement.C5691c9) r12
            boolean r13 = r12.mo33774x()
            if (r13 != 0) goto L_0x0032
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002a
            r13 = 10
            goto L_0x002b
        L_0x002a:
            int r13 = r13 + r13
        L_0x002b:
            com.google.android.gms.internal.measurement.c9 r12 = r12.mo33773m(r13)
            r11.putObject(r1, r9, r12)
        L_0x0032:
            r9 = 5
            r10 = 0
            r13 = 1
            r14 = 2
            switch(r26) {
                case 18: goto L_0x03e1;
                case 19: goto L_0x0394;
                case 20: goto L_0x0351;
                case 21: goto L_0x0351;
                case 22: goto L_0x0336;
                case 23: goto L_0x02f5;
                case 24: goto L_0x02b4;
                case 25: goto L_0x025a;
                case 26: goto L_0x01a7;
                case 27: goto L_0x018c;
                case 28: goto L_0x0132;
                case 29: goto L_0x0336;
                case 30: goto L_0x00fa;
                case 31: goto L_0x02b4;
                case 32: goto L_0x02f5;
                case 33: goto L_0x00ab;
                case 34: goto L_0x005c;
                case 35: goto L_0x03e1;
                case 36: goto L_0x0394;
                case 37: goto L_0x0351;
                case 38: goto L_0x0351;
                case 39: goto L_0x0336;
                case 40: goto L_0x02f5;
                case 41: goto L_0x02b4;
                case 42: goto L_0x025a;
                case 43: goto L_0x0336;
                case 44: goto L_0x00fa;
                case 45: goto L_0x02b4;
                case 46: goto L_0x02f5;
                case 47: goto L_0x00ab;
                case 48: goto L_0x005c;
                default: goto L_0x003a;
            }
        L_0x003a:
            r1 = 3
            if (r6 != r1) goto L_0x044f
            com.google.android.gms.internal.measurement.ja r1 = r15.m8822n(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r21 = r1
            r22 = r17
            r23 = r18
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.measurement.C5825k7.m9504c(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.f7025c
            r12.add(r8)
            goto L_0x042d
        L_0x005c:
            if (r6 != r14) goto L_0x0080
            com.google.android.gms.internal.measurement.m9 r12 = (com.google.android.gms.internal.measurement.C5860m9) r12
            int r1 = com.google.android.gms.internal.measurement.C5825k7.m9511j(r3, r4, r7)
            int r2 = r7.f7023a
            int r2 = r2 + r1
        L_0x0067:
            if (r1 >= r2) goto L_0x0077
            int r1 = com.google.android.gms.internal.measurement.C5825k7.m9514m(r3, r1, r7)
            long r4 = r7.f7024b
            long r4 = com.google.android.gms.internal.measurement.C5656a8.m8762b(r4)
            r12.mo34184j(r4)
            goto L_0x0067
        L_0x0077:
            if (r1 != r2) goto L_0x007b
            goto L_0x0450
        L_0x007b:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.m10405f()
            throw r1
        L_0x0080:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.measurement.m9 r12 = (com.google.android.gms.internal.measurement.C5860m9) r12
            int r1 = com.google.android.gms.internal.measurement.C5825k7.m9514m(r3, r4, r7)
            long r8 = r7.f7024b
            long r8 = com.google.android.gms.internal.measurement.C5656a8.m8762b(r8)
            r12.mo34184j(r8)
        L_0x0091:
            if (r1 >= r5) goto L_0x00aa
            int r4 = com.google.android.gms.internal.measurement.C5825k7.m9511j(r3, r1, r7)
            int r6 = r7.f7023a
            if (r2 == r6) goto L_0x009c
            goto L_0x00aa
        L_0x009c:
            int r1 = com.google.android.gms.internal.measurement.C5825k7.m9514m(r3, r4, r7)
            long r8 = r7.f7024b
            long r8 = com.google.android.gms.internal.measurement.C5656a8.m8762b(r8)
            r12.mo34184j(r8)
            goto L_0x0091
        L_0x00aa:
            return r1
        L_0x00ab:
            if (r6 != r14) goto L_0x00cf
            com.google.android.gms.internal.measurement.w8 r12 = (com.google.android.gms.internal.measurement.C6019w8) r12
            int r1 = com.google.android.gms.internal.measurement.C5825k7.m9511j(r3, r4, r7)
            int r2 = r7.f7023a
            int r2 = r2 + r1
        L_0x00b6:
            if (r1 >= r2) goto L_0x00c6
            int r1 = com.google.android.gms.internal.measurement.C5825k7.m9511j(r3, r1, r7)
            int r4 = r7.f7023a
            int r4 = com.google.android.gms.internal.measurement.C5656a8.m8761a(r4)
            r12.mo34586E(r4)
            goto L_0x00b6
        L_0x00c6:
            if (r1 != r2) goto L_0x00ca
            goto L_0x0450
        L_0x00ca:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.m10405f()
            throw r1
        L_0x00cf:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.measurement.w8 r12 = (com.google.android.gms.internal.measurement.C6019w8) r12
            int r1 = com.google.android.gms.internal.measurement.C5825k7.m9511j(r3, r4, r7)
            int r4 = r7.f7023a
            int r4 = com.google.android.gms.internal.measurement.C5656a8.m8761a(r4)
            r12.mo34586E(r4)
        L_0x00e0:
            if (r1 >= r5) goto L_0x00f9
            int r4 = com.google.android.gms.internal.measurement.C5825k7.m9511j(r3, r1, r7)
            int r6 = r7.f7023a
            if (r2 == r6) goto L_0x00eb
            goto L_0x00f9
        L_0x00eb:
            int r1 = com.google.android.gms.internal.measurement.C5825k7.m9511j(r3, r4, r7)
            int r4 = r7.f7023a
            int r4 = com.google.android.gms.internal.measurement.C5656a8.m8761a(r4)
            r12.mo34586E(r4)
            goto L_0x00e0
        L_0x00f9:
            return r1
        L_0x00fa:
            if (r6 != r14) goto L_0x0101
            int r2 = com.google.android.gms.internal.measurement.C5825k7.m9507f(r3, r4, r12, r7)
            goto L_0x0112
        L_0x0101:
            if (r6 != 0) goto L_0x044f
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r12
            r7 = r29
            int r2 = com.google.android.gms.internal.measurement.C5825k7.m9513l(r2, r3, r4, r5, r6, r7)
        L_0x0112:
            com.google.android.gms.internal.measurement.v8 r1 = (com.google.android.gms.internal.measurement.C6003v8) r1
            com.google.android.gms.internal.measurement.ya r3 = r1.zzc
            com.google.android.gms.internal.measurement.ya r4 = com.google.android.gms.internal.measurement.C6053ya.m10311c()
            if (r3 != r4) goto L_0x011d
            r3 = 0
        L_0x011d:
            com.google.android.gms.internal.measurement.z8 r4 = r15.m8821m(r8)
            com.google.android.gms.internal.measurement.xa<?, ?> r5 = r0.f6801l
            r6 = r21
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C5845la.m9593c(r6, r12, r4, r3, r5)
            if (r3 != 0) goto L_0x012d
            goto L_0x027b
        L_0x012d:
            com.google.android.gms.internal.measurement.ya r3 = (com.google.android.gms.internal.measurement.C6053ya) r3
            r1.zzc = r3
            return r2
        L_0x0132:
            if (r6 != r14) goto L_0x044f
            int r1 = com.google.android.gms.internal.measurement.C5825k7.m9511j(r3, r4, r7)
            int r4 = r7.f7023a
            if (r4 < 0) goto L_0x0187
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0182
            if (r4 != 0) goto L_0x0148
            com.google.android.gms.internal.measurement.w7 r4 = com.google.android.gms.internal.measurement.C6018w7.f7451c
            r12.add(r4)
            goto L_0x0150
        L_0x0148:
            com.google.android.gms.internal.measurement.w7 r6 = com.google.android.gms.internal.measurement.C6018w7.m10204z(r3, r1, r4)
            r12.add(r6)
        L_0x014f:
            int r1 = r1 + r4
        L_0x0150:
            if (r1 >= r5) goto L_0x0181
            int r4 = com.google.android.gms.internal.measurement.C5825k7.m9511j(r3, r1, r7)
            int r6 = r7.f7023a
            if (r2 == r6) goto L_0x015b
            goto L_0x0181
        L_0x015b:
            int r1 = com.google.android.gms.internal.measurement.C5825k7.m9511j(r3, r4, r7)
            int r4 = r7.f7023a
            if (r4 < 0) goto L_0x017c
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0177
            if (r4 != 0) goto L_0x016f
            com.google.android.gms.internal.measurement.w7 r4 = com.google.android.gms.internal.measurement.C6018w7.f7451c
            r12.add(r4)
            goto L_0x0150
        L_0x016f:
            com.google.android.gms.internal.measurement.w7 r6 = com.google.android.gms.internal.measurement.C6018w7.m10204z(r3, r1, r4)
            r12.add(r6)
            goto L_0x014f
        L_0x0177:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.m10405f()
            throw r1
        L_0x017c:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.m10403d()
            throw r1
        L_0x0181:
            return r1
        L_0x0182:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.m10405f()
            throw r1
        L_0x0187:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.m10403d()
            throw r1
        L_0x018c:
            if (r6 == r14) goto L_0x0190
            goto L_0x044f
        L_0x0190:
            com.google.android.gms.internal.measurement.ja r1 = r15.m8822n(r8)
            r21 = r1
            r22 = r20
            r23 = r17
            r24 = r18
            r25 = r19
            r26 = r12
            r27 = r29
            int r1 = com.google.android.gms.internal.measurement.C5825k7.m9506e(r21, r22, r23, r24, r25, r26, r27)
            return r1
        L_0x01a7:
            if (r6 != r14) goto L_0x044f
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r24 & r8
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x01fa
            int r1 = com.google.android.gms.internal.measurement.C5825k7.m9511j(r3, r4, r7)
            int r4 = r7.f7023a
            if (r4 < 0) goto L_0x01f5
            if (r4 != 0) goto L_0x01c2
            r12.add(r6)
            goto L_0x01cd
        L_0x01c2:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.measurement.C5708d9.f6852b
            r8.<init>(r3, r1, r4, r9)
            r12.add(r8)
        L_0x01cc:
            int r1 = r1 + r4
        L_0x01cd:
            if (r1 >= r5) goto L_0x0450
            int r4 = com.google.android.gms.internal.measurement.C5825k7.m9511j(r3, r1, r7)
            int r8 = r7.f7023a
            if (r2 != r8) goto L_0x0450
            int r1 = com.google.android.gms.internal.measurement.C5825k7.m9511j(r3, r4, r7)
            int r4 = r7.f7023a
            if (r4 < 0) goto L_0x01f0
            if (r4 != 0) goto L_0x01e5
            r12.add(r6)
            goto L_0x01cd
        L_0x01e5:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.measurement.C5708d9.f6852b
            r8.<init>(r3, r1, r4, r9)
            r12.add(r8)
            goto L_0x01cc
        L_0x01f0:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.m10403d()
            throw r1
        L_0x01f5:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.m10403d()
            throw r1
        L_0x01fa:
            int r1 = com.google.android.gms.internal.measurement.C5825k7.m9511j(r3, r4, r7)
            int r4 = r7.f7023a
            if (r4 < 0) goto L_0x0255
            if (r4 != 0) goto L_0x0208
            r12.add(r6)
            goto L_0x021b
        L_0x0208:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.measurement.C5862mb.m9645f(r3, r1, r8)
            if (r9 == 0) goto L_0x0250
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.measurement.C5708d9.f6852b
            r9.<init>(r3, r1, r4, r10)
            r12.add(r9)
        L_0x021a:
            r1 = r8
        L_0x021b:
            if (r1 >= r5) goto L_0x0450
            int r4 = com.google.android.gms.internal.measurement.C5825k7.m9511j(r3, r1, r7)
            int r8 = r7.f7023a
            if (r2 != r8) goto L_0x0450
            int r1 = com.google.android.gms.internal.measurement.C5825k7.m9511j(r3, r4, r7)
            int r4 = r7.f7023a
            if (r4 < 0) goto L_0x024b
            if (r4 != 0) goto L_0x0233
            r12.add(r6)
            goto L_0x021b
        L_0x0233:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.measurement.C5862mb.m9645f(r3, r1, r8)
            if (r9 == 0) goto L_0x0246
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.measurement.C5708d9.f6852b
            r9.<init>(r3, r1, r4, r10)
            r12.add(r9)
            goto L_0x021a
        L_0x0246:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.m10402c()
            throw r1
        L_0x024b:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.m10403d()
            throw r1
        L_0x0250:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.m10402c()
            throw r1
        L_0x0255:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.m10403d()
            throw r1
        L_0x025a:
            r1 = 0
            if (r6 != r14) goto L_0x0283
            com.google.android.gms.internal.measurement.l7 r12 = (com.google.android.gms.internal.measurement.C5842l7) r12
            int r2 = com.google.android.gms.internal.measurement.C5825k7.m9511j(r3, r4, r7)
            int r4 = r7.f7023a
            int r4 = r4 + r2
        L_0x0266:
            if (r2 >= r4) goto L_0x0279
            int r2 = com.google.android.gms.internal.measurement.C5825k7.m9514m(r3, r2, r7)
            long r5 = r7.f7024b
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x0274
            r5 = r13
            goto L_0x0275
        L_0x0274:
            r5 = r1
        L_0x0275:
            r12.mo34167d(r5)
            goto L_0x0266
        L_0x0279:
            if (r2 != r4) goto L_0x027e
        L_0x027b:
            r1 = r2
            goto L_0x0450
        L_0x027e:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.m10405f()
            throw r1
        L_0x0283:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.measurement.l7 r12 = (com.google.android.gms.internal.measurement.C5842l7) r12
            int r4 = com.google.android.gms.internal.measurement.C5825k7.m9514m(r3, r4, r7)
            long r8 = r7.f7024b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x0293
            r6 = r13
            goto L_0x0294
        L_0x0293:
            r6 = r1
        L_0x0294:
            r12.mo34167d(r6)
        L_0x0297:
            if (r4 >= r5) goto L_0x02b3
            int r6 = com.google.android.gms.internal.measurement.C5825k7.m9511j(r3, r4, r7)
            int r8 = r7.f7023a
            if (r2 == r8) goto L_0x02a2
            goto L_0x02b3
        L_0x02a2:
            int r4 = com.google.android.gms.internal.measurement.C5825k7.m9514m(r3, r6, r7)
            long r8 = r7.f7024b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x02ae
            r6 = r13
            goto L_0x02af
        L_0x02ae:
            r6 = r1
        L_0x02af:
            r12.mo34167d(r6)
            goto L_0x0297
        L_0x02b3:
            return r4
        L_0x02b4:
            if (r6 != r14) goto L_0x02d4
            com.google.android.gms.internal.measurement.w8 r12 = (com.google.android.gms.internal.measurement.C6019w8) r12
            int r1 = com.google.android.gms.internal.measurement.C5825k7.m9511j(r3, r4, r7)
            int r2 = r7.f7023a
            int r2 = r2 + r1
        L_0x02bf:
            if (r1 >= r2) goto L_0x02cb
            int r4 = com.google.android.gms.internal.measurement.C5825k7.m9503b(r3, r1)
            r12.mo34586E(r4)
            int r1 = r1 + 4
            goto L_0x02bf
        L_0x02cb:
            if (r1 != r2) goto L_0x02cf
            goto L_0x0450
        L_0x02cf:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.m10405f()
            throw r1
        L_0x02d4:
            if (r6 != r9) goto L_0x044f
            com.google.android.gms.internal.measurement.w8 r12 = (com.google.android.gms.internal.measurement.C6019w8) r12
            int r1 = com.google.android.gms.internal.measurement.C5825k7.m9503b(r17, r18)
            r12.mo34586E(r1)
        L_0x02df:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x02f4
            int r4 = com.google.android.gms.internal.measurement.C5825k7.m9511j(r3, r1, r7)
            int r6 = r7.f7023a
            if (r2 == r6) goto L_0x02ec
            goto L_0x02f4
        L_0x02ec:
            int r1 = com.google.android.gms.internal.measurement.C5825k7.m9503b(r3, r4)
            r12.mo34586E(r1)
            goto L_0x02df
        L_0x02f4:
            return r1
        L_0x02f5:
            if (r6 != r14) goto L_0x0315
            com.google.android.gms.internal.measurement.m9 r12 = (com.google.android.gms.internal.measurement.C5860m9) r12
            int r1 = com.google.android.gms.internal.measurement.C5825k7.m9511j(r3, r4, r7)
            int r2 = r7.f7023a
            int r2 = r2 + r1
        L_0x0300:
            if (r1 >= r2) goto L_0x030c
            long r4 = com.google.android.gms.internal.measurement.C5825k7.m9515n(r3, r1)
            r12.mo34184j(r4)
            int r1 = r1 + 8
            goto L_0x0300
        L_0x030c:
            if (r1 != r2) goto L_0x0310
            goto L_0x0450
        L_0x0310:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.m10405f()
            throw r1
        L_0x0315:
            if (r6 != r13) goto L_0x044f
            com.google.android.gms.internal.measurement.m9 r12 = (com.google.android.gms.internal.measurement.C5860m9) r12
            long r8 = com.google.android.gms.internal.measurement.C5825k7.m9515n(r17, r18)
            r12.mo34184j(r8)
        L_0x0320:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0335
            int r4 = com.google.android.gms.internal.measurement.C5825k7.m9511j(r3, r1, r7)
            int r6 = r7.f7023a
            if (r2 == r6) goto L_0x032d
            goto L_0x0335
        L_0x032d:
            long r8 = com.google.android.gms.internal.measurement.C5825k7.m9515n(r3, r4)
            r12.mo34184j(r8)
            goto L_0x0320
        L_0x0335:
            return r1
        L_0x0336:
            if (r6 != r14) goto L_0x033e
            int r1 = com.google.android.gms.internal.measurement.C5825k7.m9507f(r3, r4, r12, r7)
            goto L_0x0450
        L_0x033e:
            if (r6 == 0) goto L_0x0342
            goto L_0x044f
        L_0x0342:
            r21 = r17
            r22 = r18
            r23 = r19
            r24 = r12
            r25 = r29
            int r1 = com.google.android.gms.internal.measurement.C5825k7.m9513l(r20, r21, r22, r23, r24, r25)
            return r1
        L_0x0351:
            if (r6 != r14) goto L_0x0371
            com.google.android.gms.internal.measurement.m9 r12 = (com.google.android.gms.internal.measurement.C5860m9) r12
            int r1 = com.google.android.gms.internal.measurement.C5825k7.m9511j(r3, r4, r7)
            int r2 = r7.f7023a
            int r2 = r2 + r1
        L_0x035c:
            if (r1 >= r2) goto L_0x0368
            int r1 = com.google.android.gms.internal.measurement.C5825k7.m9514m(r3, r1, r7)
            long r4 = r7.f7024b
            r12.mo34184j(r4)
            goto L_0x035c
        L_0x0368:
            if (r1 != r2) goto L_0x036c
            goto L_0x0450
        L_0x036c:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.m10405f()
            throw r1
        L_0x0371:
            if (r6 != 0) goto L_0x044f
            com.google.android.gms.internal.measurement.m9 r12 = (com.google.android.gms.internal.measurement.C5860m9) r12
            int r1 = com.google.android.gms.internal.measurement.C5825k7.m9514m(r3, r4, r7)
            long r8 = r7.f7024b
            r12.mo34184j(r8)
        L_0x037e:
            if (r1 >= r5) goto L_0x0393
            int r4 = com.google.android.gms.internal.measurement.C5825k7.m9511j(r3, r1, r7)
            int r6 = r7.f7023a
            if (r2 == r6) goto L_0x0389
            goto L_0x0393
        L_0x0389:
            int r1 = com.google.android.gms.internal.measurement.C5825k7.m9514m(r3, r4, r7)
            long r8 = r7.f7024b
            r12.mo34184j(r8)
            goto L_0x037e
        L_0x0393:
            return r1
        L_0x0394:
            if (r6 != r14) goto L_0x03b8
            com.google.android.gms.internal.measurement.p8 r12 = (com.google.android.gms.internal.measurement.C5907p8) r12
            int r1 = com.google.android.gms.internal.measurement.C5825k7.m9511j(r3, r4, r7)
            int r2 = r7.f7023a
            int r2 = r2 + r1
        L_0x039f:
            if (r1 >= r2) goto L_0x03af
            int r4 = com.google.android.gms.internal.measurement.C5825k7.m9503b(r3, r1)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r12.mo34269d(r4)
            int r1 = r1 + 4
            goto L_0x039f
        L_0x03af:
            if (r1 != r2) goto L_0x03b3
            goto L_0x0450
        L_0x03b3:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.m10405f()
            throw r1
        L_0x03b8:
            if (r6 != r9) goto L_0x044f
            com.google.android.gms.internal.measurement.p8 r12 = (com.google.android.gms.internal.measurement.C5907p8) r12
            int r1 = com.google.android.gms.internal.measurement.C5825k7.m9503b(r17, r18)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.mo34269d(r1)
        L_0x03c7:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x03e0
            int r4 = com.google.android.gms.internal.measurement.C5825k7.m9511j(r3, r1, r7)
            int r6 = r7.f7023a
            if (r2 == r6) goto L_0x03d4
            goto L_0x03e0
        L_0x03d4:
            int r1 = com.google.android.gms.internal.measurement.C5825k7.m9503b(r3, r4)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.mo34269d(r1)
            goto L_0x03c7
        L_0x03e0:
            return r1
        L_0x03e1:
            if (r6 != r14) goto L_0x0404
            com.google.android.gms.internal.measurement.f8 r12 = (com.google.android.gms.internal.measurement.C5741f8) r12
            int r1 = com.google.android.gms.internal.measurement.C5825k7.m9511j(r3, r4, r7)
            int r2 = r7.f7023a
            int r2 = r2 + r1
        L_0x03ec:
            if (r1 >= r2) goto L_0x03fc
            long r4 = com.google.android.gms.internal.measurement.C5825k7.m9515n(r3, r1)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r12.mo34005d(r4)
            int r1 = r1 + 8
            goto L_0x03ec
        L_0x03fc:
            if (r1 != r2) goto L_0x03ff
            goto L_0x0450
        L_0x03ff:
            com.google.android.gms.internal.measurement.zzkh r1 = com.google.android.gms.internal.measurement.zzkh.m10405f()
            throw r1
        L_0x0404:
            if (r6 != r13) goto L_0x044f
            com.google.android.gms.internal.measurement.f8 r12 = (com.google.android.gms.internal.measurement.C5741f8) r12
            long r8 = com.google.android.gms.internal.measurement.C5825k7.m9515n(r17, r18)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.mo34005d(r8)
        L_0x0413:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x042c
            int r4 = com.google.android.gms.internal.measurement.C5825k7.m9511j(r3, r1, r7)
            int r6 = r7.f7023a
            if (r2 == r6) goto L_0x0420
            goto L_0x042c
        L_0x0420:
            long r8 = com.google.android.gms.internal.measurement.C5825k7.m9515n(r3, r4)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.mo34005d(r8)
            goto L_0x0413
        L_0x042c:
            return r1
        L_0x042d:
            if (r4 >= r5) goto L_0x044e
            int r8 = com.google.android.gms.internal.measurement.C5825k7.m9511j(r3, r4, r7)
            int r9 = r7.f7023a
            if (r2 == r9) goto L_0x0438
            goto L_0x044e
        L_0x0438:
            r21 = r1
            r22 = r17
            r23 = r8
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.measurement.C5825k7.m9504c(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.f7025c
            r12.add(r8)
            goto L_0x042d
        L_0x044e:
            return r4
        L_0x044f:
            r1 = r4
        L_0x0450:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C5675ba.m8813P(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.j7):int");
    }

    /* renamed from: Q */
    private final int m8814Q(int i) {
        if (i < this.f6792c || i > this.f6793d) {
            return -1;
        }
        return m8817T(i, 0);
    }

    /* renamed from: R */
    private final int m8815R(int i, int i2) {
        if (i < this.f6792c || i > this.f6793d) {
            return -1;
        }
        return m8817T(i, i2);
    }

    /* renamed from: S */
    private final int m8816S(int i) {
        return this.f6790a[i + 2];
    }

    /* renamed from: T */
    private final int m8817T(int i, int i2) {
        int length = (this.f6790a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f6790a[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: j */
    private static int m8818j(int i) {
        return (i >>> 20) & 255;
    }

    /* renamed from: k */
    private final int m8819k(int i) {
        return this.f6790a[i + 1];
    }

    /* renamed from: l */
    private static <T> long m8820l(T t, long j) {
        return ((Long) C5778hb.m9361k(t, j)).longValue();
    }

    /* renamed from: m */
    private final C6067z8 m8821m(int i) {
        int i2 = i / 3;
        return (C6067z8) this.f6791b[i2 + i2 + 1];
    }

    /* renamed from: n */
    private final C5811ja m8822n(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        C5811ja jaVar = (C5811ja) this.f6791b[i3];
        if (jaVar != null) {
            return jaVar;
        }
        C5811ja b = C5760ga.m9295a().mo34052b((Class) this.f6791b[i3 + 1]);
        this.f6791b[i3] = b;
        return b;
    }

    /* renamed from: o */
    private final Object m8823o(int i) {
        int i2 = i / 3;
        return this.f6791b[i2 + i2];
    }

    /* renamed from: p */
    private static Field m8824p(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: q */
    private final void m8825q(T t, T t2, int i) {
        long k = (long) (m8819k(i) & 1048575);
        if (m8830v(t2, i)) {
            Object k2 = C5778hb.m9361k(t, k);
            Object k3 = C5778hb.m9361k(t2, k);
            if (k2 != null && k3 != null) {
                C5778hb.m9374x(t, k, C5708d9.m9020g(k2, k3));
                m8827s(t, i);
            } else if (k3 != null) {
                C5778hb.m9374x(t, k, k3);
                m8827s(t, i);
            }
        }
    }

    /* renamed from: r */
    private final void m8826r(T t, T t2, int i) {
        Object obj;
        int k = m8819k(i);
        int i2 = this.f6790a[i];
        long j = (long) (k & 1048575);
        if (m8833y(t2, i2, i)) {
            if (m8833y(t, i2, i)) {
                obj = C5778hb.m9361k(t, j);
            } else {
                obj = null;
            }
            Object k2 = C5778hb.m9361k(t2, j);
            if (obj != null && k2 != null) {
                C5778hb.m9374x(t, j, C5708d9.m9020g(obj, k2));
                m8828t(t, i2, i);
            } else if (k2 != null) {
                C5778hb.m9374x(t, j, k2);
                m8828t(t, i2, i);
            }
        }
    }

    /* renamed from: s */
    private final void m8827s(T t, int i) {
        int S = m8816S(i);
        long j = (long) (1048575 & S);
        if (j != 1048575) {
            C5778hb.m9372v(t, j, (1 << (S >>> 20)) | C5778hb.m9358h(t, j));
        }
    }

    /* renamed from: t */
    private final void m8828t(T t, int i, int i2) {
        C5778hb.m9372v(t, (long) (m8816S(i2) & 1048575), i);
    }

    /* renamed from: u */
    private final boolean m8829u(T t, T t2, int i) {
        if (m8830v(t, i) == m8830v(t2, i)) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    private final boolean m8830v(T t, int i) {
        int S = m8816S(i);
        long j = (long) (S & 1048575);
        if (j == 1048575) {
            int k = m8819k(i);
            long j2 = (long) (k & 1048575);
            switch (m8818j(k)) {
                case 0:
                    if (Double.doubleToRawLongBits(C5778hb.m9356f(t, j2)) != 0) {
                        return true;
                    }
                    return false;
                case 1:
                    if (Float.floatToRawIntBits(C5778hb.m9357g(t, j2)) != 0) {
                        return true;
                    }
                    return false;
                case 2:
                    if (C5778hb.m9359i(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 3:
                    if (C5778hb.m9359i(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                    if (C5778hb.m9358h(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 5:
                    if (C5778hb.m9359i(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 6:
                    if (C5778hb.m9358h(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 7:
                    return C5778hb.m9347B(t, j2);
                case 8:
                    Object k2 = C5778hb.m9361k(t, j2);
                    if (k2 instanceof String) {
                        if (!((String) k2).isEmpty()) {
                            return true;
                        }
                        return false;
                    } else if (!(k2 instanceof C6018w7)) {
                        throw new IllegalArgumentException();
                    } else if (!C6018w7.f7451c.equals(k2)) {
                        return true;
                    } else {
                        return false;
                    }
                case 9:
                    if (C5778hb.m9361k(t, j2) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    if (!C6018w7.f7451c.equals(C5778hb.m9361k(t, j2))) {
                        return true;
                    }
                    return false;
                case 11:
                    if (C5778hb.m9358h(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 12:
                    if (C5778hb.m9358h(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (C5778hb.m9358h(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 14:
                    if (C5778hb.m9359i(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 15:
                    if (C5778hb.m9358h(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (C5778hb.m9359i(t, j2) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (C5778hb.m9361k(t, j2) != null) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalArgumentException();
            }
        } else if ((C5778hb.m9358h(t, j) & (1 << (S >>> 20))) != 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: w */
    private final boolean m8831w(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m8830v(t, i);
        }
        if ((i3 & i4) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    private static boolean m8832x(Object obj, int i, C5811ja jaVar) {
        return jaVar.mo33710f(C5778hb.m9361k(obj, (long) (i & 1048575)));
    }

    /* renamed from: y */
    private final boolean m8833y(T t, int i, int i2) {
        if (C5778hb.m9358h(t, (long) (m8816S(i2) & 1048575)) == i) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    private static <T> boolean m8834z(T t, long j) {
        return ((Boolean) C5778hb.m9361k(t, j)).booleanValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v43, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v47, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v51, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0367, code lost:
        if (r0 != r3) goto L_0x0369;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0382, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x03ae, code lost:
        if (r0 != r14) goto L_0x0369;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03d0, code lost:
        if (r0 != r14) goto L_0x0369;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01f0, code lost:
        r1 = r6 | r23;
        r6 = r31;
        r2 = r5;
        r3 = r7;
        r5 = r1;
        r1 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x021b, code lost:
        r2 = r1;
        r20 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0297, code lost:
        r5 = r6 | r23;
        r6 = r31;
        r3 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x029c, code lost:
        r1 = r11;
        r2 = r13;
        r13 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02a2, code lost:
        r20 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02c0, code lost:
        r15 = r33;
        r21 = r6;
        r27 = r10;
        r26 = r19;
        r6 = r31;
        r19 = r7;
        r7 = r11;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo33704D(T r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.measurement.C5808j7 r34) {
        /*
            r28 = this;
            r15 = r28
            r14 = r29
            r12 = r30
            r13 = r32
            r11 = r33
            r9 = r34
            sun.misc.Unsafe r10 = f6789q
            r16 = 0
            r0 = r31
            r1 = r16
            r3 = r1
            r5 = r3
            r2 = -1
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001a:
            r17 = 0
            if (r0 >= r13) goto L_0x0441
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002d
            int r0 = com.google.android.gms.internal.measurement.C5825k7.m9512k(r0, r12, r1, r9)
            int r1 = r9.f7023a
            r4 = r1
            r1 = r0
            goto L_0x002e
        L_0x002d:
            r4 = r0
        L_0x002e:
            int r0 = r4 >>> 3
            r8 = r4 & 7
            r7 = 3
            if (r0 <= r2) goto L_0x003b
            int r3 = r3 / r7
            int r2 = r15.m8815R(r0, r3)
            goto L_0x003f
        L_0x003b:
            int r2 = r15.m8814Q(r0)
        L_0x003f:
            r3 = -1
            if (r2 != r3) goto L_0x0051
            r20 = r0
            r2 = r1
            r26 = r3
            r7 = r4
            r21 = r5
            r27 = r10
            r15 = r11
            r19 = r16
            goto L_0x03d3
        L_0x0051:
            int[] r3 = r15.f6790a
            int r20 = r2 + 1
            r3 = r3[r20]
            int r7 = m8818j(r3)
            r20 = r0
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r3 & r18
            r22 = r3
            r21 = r4
            long r3 = (long) r0
            r0 = 17
            if (r7 > r0) goto L_0x02cf
            int[] r0 = r15.f6790a
            int r23 = r2 + 2
            r0 = r0[r23]
            int r23 = r0 >>> 20
            r11 = 1
            int r23 = r11 << r23
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r11
            if (r0 == r6) goto L_0x0089
            if (r6 == r11) goto L_0x0082
            long r11 = (long) r6
            r10.putInt(r14, r11, r5)
        L_0x0082:
            long r5 = (long) r0
            int r5 = r10.getInt(r14, r5)
            r11 = r0
            goto L_0x008a
        L_0x0089:
            r11 = r6
        L_0x008a:
            r6 = r5
            r0 = 5
            switch(r7) {
                case 0: goto L_0x027b;
                case 1: goto L_0x025f;
                case 2: goto L_0x0239;
                case 3: goto L_0x0239;
                case 4: goto L_0x0220;
                case 5: goto L_0x01fa;
                case 6: goto L_0x01da;
                case 7: goto L_0x01b9;
                case 8: goto L_0x0196;
                case 9: goto L_0x0167;
                case 10: goto L_0x014e;
                case 11: goto L_0x0220;
                case 12: goto L_0x0115;
                case 13: goto L_0x01da;
                case 14: goto L_0x01fa;
                case 15: goto L_0x00f9;
                case 16: goto L_0x00bf;
                default: goto L_0x008f;
            }
        L_0x008f:
            r12 = r30
            r7 = r2
            r31 = r11
            r13 = r20
            r11 = r21
            r0 = 3
            r19 = -1
            r2 = r1
            if (r8 != r0) goto L_0x02a2
            com.google.android.gms.internal.measurement.ja r0 = r15.m8822n(r7)
            int r1 = r13 << 3
            r5 = r1 | 4
            r1 = r30
            r20 = r13
            r12 = r3
            r3 = r32
            r4 = r5
            r5 = r34
            int r0 = com.google.android.gms.internal.measurement.C5825k7.m9504c(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r23
            if (r1 != 0) goto L_0x02a5
            java.lang.Object r1 = r9.f7025c
            r10.putObject(r14, r12, r1)
            goto L_0x02b2
        L_0x00bf:
            if (r8 != 0) goto L_0x00ed
            r12 = r30
            int r7 = com.google.android.gms.internal.measurement.C5825k7.m9514m(r12, r1, r9)
            long r0 = r9.f7024b
            long r24 = com.google.android.gms.internal.measurement.C5656a8.m8762b(r0)
            r8 = r20
            r0 = r10
            r1 = r29
            r5 = r2
            r19 = -1
            r2 = r3
            r17 = r7
            r31 = r11
            r11 = r21
            r7 = r5
            r4 = r24
            r0.putLong(r1, r2, r4)
            r5 = r6 | r23
            r6 = r31
            r3 = r7
            r2 = r8
            r1 = r11
            r0 = r17
            goto L_0x031c
        L_0x00ed:
            r12 = r30
            r7 = r2
            r31 = r11
            r11 = r21
            r19 = -1
            r2 = r1
            goto L_0x02c0
        L_0x00f9:
            r12 = r30
            r7 = r2
            r31 = r11
            r5 = r20
            r11 = r21
            r19 = -1
            if (r8 != 0) goto L_0x021b
            int r0 = com.google.android.gms.internal.measurement.C5825k7.m9511j(r12, r1, r9)
            int r1 = r9.f7023a
            int r1 = com.google.android.gms.internal.measurement.C5656a8.m8761a(r1)
            r10.putInt(r14, r3, r1)
            goto L_0x01f0
        L_0x0115:
            r12 = r30
            r7 = r2
            r31 = r11
            r5 = r20
            r11 = r21
            r19 = -1
            if (r8 != 0) goto L_0x021b
            int r0 = com.google.android.gms.internal.measurement.C5825k7.m9511j(r12, r1, r9)
            int r1 = r9.f7023a
            com.google.android.gms.internal.measurement.z8 r2 = r15.m8821m(r7)
            if (r2 == 0) goto L_0x0149
            boolean r2 = r2.mo33746g(r1)
            if (r2 == 0) goto L_0x0135
            goto L_0x0149
        L_0x0135:
            com.google.android.gms.internal.measurement.ya r2 = m8802E(r29)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.mo34645h(r11, r1)
            r2 = r5
            r5 = r6
            r3 = r7
            r1 = r11
            r6 = r31
            goto L_0x031c
        L_0x0149:
            r10.putInt(r14, r3, r1)
            goto L_0x01f0
        L_0x014e:
            r12 = r30
            r7 = r2
            r31 = r11
            r5 = r20
            r11 = r21
            r0 = 2
            r19 = -1
            if (r8 != r0) goto L_0x021b
            int r0 = com.google.android.gms.internal.measurement.C5825k7.m9502a(r12, r1, r9)
            java.lang.Object r1 = r9.f7025c
            r10.putObject(r14, r3, r1)
            goto L_0x01f0
        L_0x0167:
            r12 = r30
            r7 = r2
            r31 = r11
            r5 = r20
            r11 = r21
            r0 = 2
            r19 = -1
            if (r8 != r0) goto L_0x021b
            com.google.android.gms.internal.measurement.ja r0 = r15.m8822n(r7)
            int r0 = com.google.android.gms.internal.measurement.C5825k7.m9505d(r0, r12, r1, r13, r9)
            r1 = r6 & r23
            if (r1 != 0) goto L_0x0188
            java.lang.Object r1 = r9.f7025c
            r10.putObject(r14, r3, r1)
            goto L_0x01f0
        L_0x0188:
            java.lang.Object r1 = r10.getObject(r14, r3)
            java.lang.Object r2 = r9.f7025c
            java.lang.Object r1 = com.google.android.gms.internal.measurement.C5708d9.m9020g(r1, r2)
            r10.putObject(r14, r3, r1)
            goto L_0x01f0
        L_0x0196:
            r12 = r30
            r7 = r2
            r31 = r11
            r5 = r20
            r11 = r21
            r0 = 2
            r19 = -1
            if (r8 != r0) goto L_0x021b
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r22 & r0
            if (r0 != 0) goto L_0x01af
            int r0 = com.google.android.gms.internal.measurement.C5825k7.m9508g(r12, r1, r9)
            goto L_0x01b3
        L_0x01af:
            int r0 = com.google.android.gms.internal.measurement.C5825k7.m9509h(r12, r1, r9)
        L_0x01b3:
            java.lang.Object r1 = r9.f7025c
            r10.putObject(r14, r3, r1)
            goto L_0x01f0
        L_0x01b9:
            r12 = r30
            r7 = r2
            r31 = r11
            r5 = r20
            r11 = r21
            r19 = -1
            if (r8 != 0) goto L_0x021b
            int r0 = com.google.android.gms.internal.measurement.C5825k7.m9514m(r12, r1, r9)
            long r1 = r9.f7024b
            r20 = 0
            int r1 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r1 == 0) goto L_0x01d4
            r1 = 1
            goto L_0x01d6
        L_0x01d4:
            r1 = r16
        L_0x01d6:
            com.google.android.gms.internal.measurement.C5778hb.m9368r(r14, r3, r1)
            goto L_0x01f0
        L_0x01da:
            r12 = r30
            r7 = r2
            r31 = r11
            r5 = r20
            r11 = r21
            r19 = -1
            if (r8 != r0) goto L_0x021b
            int r0 = com.google.android.gms.internal.measurement.C5825k7.m9503b(r12, r1)
            r10.putInt(r14, r3, r0)
            int r0 = r1 + 4
        L_0x01f0:
            r1 = r6 | r23
            r6 = r31
            r2 = r5
            r3 = r7
            r5 = r1
            r1 = r11
            goto L_0x031c
        L_0x01fa:
            r12 = r30
            r7 = r2
            r31 = r11
            r5 = r20
            r11 = r21
            r0 = 1
            r19 = -1
            if (r8 != r0) goto L_0x021b
            long r20 = com.google.android.gms.internal.measurement.C5825k7.m9515n(r12, r1)
            r0 = r10
            r8 = r1
            r1 = r29
            r2 = r3
            r13 = r5
            r4 = r20
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x0297
        L_0x021b:
            r2 = r1
            r20 = r5
            goto L_0x02c0
        L_0x0220:
            r12 = r30
            r7 = r2
            r31 = r11
            r13 = r20
            r11 = r21
            r19 = -1
            r2 = r1
            if (r8 != 0) goto L_0x02a2
            int r0 = com.google.android.gms.internal.measurement.C5825k7.m9511j(r12, r2, r9)
            int r1 = r9.f7023a
            r10.putInt(r14, r3, r1)
            goto L_0x0297
        L_0x0239:
            r12 = r30
            r7 = r2
            r31 = r11
            r13 = r20
            r11 = r21
            r19 = -1
            r2 = r1
            if (r8 != 0) goto L_0x02a2
            int r8 = com.google.android.gms.internal.measurement.C5825k7.m9514m(r12, r2, r9)
            long r1 = r9.f7024b
            r0 = r10
            r20 = r1
            r1 = r29
            r2 = r3
            r4 = r20
            r0.putLong(r1, r2, r4)
            r5 = r6 | r23
            r6 = r31
            r3 = r7
            r0 = r8
            goto L_0x029c
        L_0x025f:
            r12 = r30
            r7 = r2
            r31 = r11
            r13 = r20
            r11 = r21
            r19 = -1
            r2 = r1
            if (r8 != r0) goto L_0x02a2
            int r0 = com.google.android.gms.internal.measurement.C5825k7.m9503b(r12, r2)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.measurement.C5778hb.m9371u(r14, r3, r0)
            int r0 = r2 + 4
            goto L_0x0297
        L_0x027b:
            r12 = r30
            r7 = r2
            r31 = r11
            r13 = r20
            r11 = r21
            r0 = 1
            r19 = -1
            r2 = r1
            if (r8 != r0) goto L_0x02a2
            long r0 = com.google.android.gms.internal.measurement.C5825k7.m9515n(r12, r2)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.measurement.C5778hb.m9370t(r14, r3, r0)
            int r0 = r2 + 8
        L_0x0297:
            r5 = r6 | r23
            r6 = r31
            r3 = r7
        L_0x029c:
            r1 = r11
            r2 = r13
            r13 = r32
            goto L_0x031c
        L_0x02a2:
            r20 = r13
            goto L_0x02c0
        L_0x02a5:
            java.lang.Object r1 = r10.getObject(r14, r12)
            java.lang.Object r2 = r9.f7025c
            java.lang.Object r1 = com.google.android.gms.internal.measurement.C5708d9.m9020g(r1, r2)
            r10.putObject(r14, r12, r1)
        L_0x02b2:
            r5 = r6 | r23
            r12 = r30
            r6 = r31
            r13 = r32
            r3 = r7
            r1 = r11
            r2 = r20
            goto L_0x031c
        L_0x02c0:
            r15 = r33
            r21 = r6
            r27 = r10
            r26 = r19
            r6 = r31
            r19 = r7
            r7 = r11
            goto L_0x03d3
        L_0x02cf:
            r12 = r3
            r4 = r7
            r11 = r21
            r19 = -1
            r7 = r2
            r2 = r1
            r0 = 27
            if (r4 != r0) goto L_0x0331
            r0 = 2
            if (r8 != r0) goto L_0x0320
            java.lang.Object r0 = r10.getObject(r14, r12)
            com.google.android.gms.internal.measurement.c9 r0 = (com.google.android.gms.internal.measurement.C5691c9) r0
            boolean r1 = r0.mo33774x()
            if (r1 != 0) goto L_0x02fb
            int r1 = r0.size()
            if (r1 != 0) goto L_0x02f3
            r1 = 10
            goto L_0x02f4
        L_0x02f3:
            int r1 = r1 + r1
        L_0x02f4:
            com.google.android.gms.internal.measurement.c9 r0 = r0.mo33773m(r1)
            r10.putObject(r14, r12, r0)
        L_0x02fb:
            r8 = r0
            com.google.android.gms.internal.measurement.ja r0 = r15.m8822n(r7)
            r1 = r11
            r3 = r2
            r2 = r30
            r4 = r32
            r21 = r5
            r5 = r8
            r23 = r6
            r6 = r34
            int r0 = com.google.android.gms.internal.measurement.C5825k7.m9506e(r0, r1, r2, r3, r4, r5, r6)
            r12 = r30
            r13 = r32
            r3 = r7
            r2 = r20
            r5 = r21
            r6 = r23
        L_0x031c:
            r11 = r33
            goto L_0x001a
        L_0x0320:
            r21 = r5
            r23 = r6
            r15 = r33
            r14 = r2
            r27 = r10
            r18 = r11
            r26 = r19
            r19 = r7
            goto L_0x03b1
        L_0x0331:
            r3 = r2
            r21 = r5
            r23 = r6
            r0 = 49
            if (r4 > r0) goto L_0x0384
            r5 = r22
            long r5 = (long) r5
            r0 = r28
            r1 = r29
            r2 = r30
            r31 = r3
            r22 = r4
            r4 = r32
            r24 = r5
            r5 = r11
            r6 = r20
            r26 = r19
            r19 = r7
            r7 = r8
            r8 = r19
            r27 = r10
            r9 = r24
            r15 = r33
            r18 = r11
            r11 = r22
            r14 = r34
            int r0 = r0.m8813P(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            r14 = r31
            if (r0 == r14) goto L_0x0382
        L_0x0369:
            r14 = r29
            r12 = r30
            r13 = r32
            r9 = r34
            r11 = r15
            r1 = r18
            r3 = r19
            r2 = r20
            r5 = r21
            r6 = r23
            r10 = r27
            r15 = r28
            goto L_0x001a
        L_0x0382:
            r2 = r0
            goto L_0x03b2
        L_0x0384:
            r15 = r33
            r14 = r3
            r27 = r10
            r18 = r11
            r26 = r19
            r5 = r22
            r22 = r4
            r19 = r7
            r0 = 50
            r9 = r22
            if (r9 != r0) goto L_0x03b7
            r0 = 2
            if (r8 != r0) goto L_0x03b1
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r14
            r4 = r32
            r5 = r19
            r6 = r12
            r8 = r34
            int r0 = r0.m8810M(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r14) goto L_0x0382
            goto L_0x0369
        L_0x03b1:
            r2 = r14
        L_0x03b2:
            r7 = r18
            r6 = r23
            goto L_0x03d3
        L_0x03b7:
            r0 = r28
            r1 = r29
            r2 = r30
            r10 = r5
            r3 = r14
            r4 = r32
            r5 = r18
            r6 = r20
            r7 = r8
            r8 = r10
            r10 = r12
            r12 = r19
            r13 = r34
            int r0 = r0.m8811N(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r14) goto L_0x0382
            goto L_0x0369
        L_0x03d3:
            if (r7 != r15) goto L_0x03e2
            if (r15 == 0) goto L_0x03e2
            r8 = r28
            r12 = r29
            r0 = r2
            r1 = r7
            r9 = r15
            r5 = r21
            goto L_0x044a
        L_0x03e2:
            r8 = r28
            r9 = r15
            boolean r0 = r8.f6795f
            if (r0 == 0) goto L_0x041a
            r10 = r34
            com.google.android.gms.internal.measurement.i8 r0 = r10.f7026d
            com.google.android.gms.internal.measurement.i8 r1 = com.google.android.gms.internal.measurement.C5792i8.m9400a()
            if (r0 == r1) goto L_0x0417
            com.google.android.gms.internal.measurement.y9 r0 = r8.f6794e
            com.google.android.gms.internal.measurement.i8 r1 = r10.f7026d
            r11 = r20
            com.google.android.gms.internal.measurement.u8 r0 = r1.mo34091c(r0, r11)
            if (r0 != 0) goto L_0x0411
            com.google.android.gms.internal.measurement.ya r4 = m8802E(r29)
            r0 = r7
            r1 = r30
            r3 = r32
            r5 = r34
            int r0 = com.google.android.gms.internal.measurement.C5825k7.m9510i(r0, r1, r2, r3, r4, r5)
            r12 = r29
            goto L_0x042f
        L_0x0411:
            r12 = r29
            r0 = r12
            com.google.android.gms.internal.measurement.t8 r0 = (com.google.android.gms.internal.measurement.C5971t8) r0
            throw r17
        L_0x0417:
            r12 = r29
            goto L_0x041e
        L_0x041a:
            r12 = r29
            r10 = r34
        L_0x041e:
            r11 = r20
            com.google.android.gms.internal.measurement.ya r4 = m8802E(r29)
            r0 = r7
            r1 = r30
            r3 = r32
            r5 = r34
            int r0 = com.google.android.gms.internal.measurement.C5825k7.m9510i(r0, r1, r2, r3, r4, r5)
        L_0x042f:
            r13 = r32
            r1 = r7
            r15 = r8
            r2 = r11
            r14 = r12
            r3 = r19
            r5 = r21
            r12 = r30
            r11 = r9
            r9 = r10
            r10 = r27
            goto L_0x001a
        L_0x0441:
            r21 = r5
            r23 = r6
            r27 = r10
            r9 = r11
            r12 = r14
            r8 = r15
        L_0x044a:
            r2 = 1048575(0xfffff, float:1.469367E-39)
            if (r6 == r2) goto L_0x0455
            long r3 = (long) r6
            r6 = r27
            r6.putInt(r12, r3, r5)
        L_0x0455:
            int r3 = r8.f6798i
        L_0x0457:
            int r4 = r8.f6799j
            if (r3 >= r4) goto L_0x0482
            int[] r4 = r8.f6797h
            r4 = r4[r3]
            int[] r5 = r8.f6790a
            r5 = r5[r4]
            int r5 = r8.m8819k(r4)
            r5 = r5 & r2
            long r5 = (long) r5
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C5778hb.m9361k(r12, r5)
            if (r5 != 0) goto L_0x0470
            goto L_0x0476
        L_0x0470:
            com.google.android.gms.internal.measurement.z8 r6 = r8.m8821m(r4)
            if (r6 != 0) goto L_0x0479
        L_0x0476:
            int r3 = r3 + 1
            goto L_0x0457
        L_0x0479:
            com.google.android.gms.internal.measurement.r9 r5 = (com.google.android.gms.internal.measurement.C5940r9) r5
            java.lang.Object r0 = r8.m8823o(r4)
            com.google.android.gms.internal.measurement.q9 r0 = (com.google.android.gms.internal.measurement.C5924q9) r0
            throw r17
        L_0x0482:
            if (r9 != 0) goto L_0x048e
            r2 = r32
            if (r0 != r2) goto L_0x0489
            goto L_0x0494
        L_0x0489:
            com.google.android.gms.internal.measurement.zzkh r0 = com.google.android.gms.internal.measurement.zzkh.m10404e()
            throw r0
        L_0x048e:
            r2 = r32
            if (r0 > r2) goto L_0x0495
            if (r1 != r9) goto L_0x0495
        L_0x0494:
            return r0
        L_0x0495:
            com.google.android.gms.internal.measurement.zzkh r0 = com.google.android.gms.internal.measurement.zzkh.m10404e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C5675ba.mo33704D(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.j7):int");
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
    public final int mo33705a(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f6790a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x022b
            int r3 = r8.m8819k(r1)
            int[] r4 = r8.f6790a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            int r3 = m8818j(r3)
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
            boolean r3 = r8.m8833y(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C5778hb.m9361k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x0031:
            boolean r3 = r8.m8833y(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m8820l(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C5708d9.m9016c(r3)
            goto L_0x0226
        L_0x0043:
            boolean r3 = r8.m8833y(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m8809L(r9, r5)
            goto L_0x0226
        L_0x0051:
            boolean r3 = r8.m8833y(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m8820l(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C5708d9.m9016c(r3)
            goto L_0x0226
        L_0x0063:
            boolean r3 = r8.m8833y(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m8809L(r9, r5)
            goto L_0x0226
        L_0x0071:
            boolean r3 = r8.m8833y(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m8809L(r9, r5)
            goto L_0x0226
        L_0x007f:
            boolean r3 = r8.m8833y(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m8809L(r9, r5)
            goto L_0x0226
        L_0x008d:
            boolean r3 = r8.m8833y(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C5778hb.m9361k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x009f:
            boolean r3 = r8.m8833y(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C5778hb.m9361k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x00b1:
            boolean r3 = r8.m8833y(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C5778hb.m9361k(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x00c5:
            boolean r3 = r8.m8833y(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            boolean r3 = m8834z(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C5708d9.m9014a(r3)
            goto L_0x0226
        L_0x00d7:
            boolean r3 = r8.m8833y(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m8809L(r9, r5)
            goto L_0x0226
        L_0x00e5:
            boolean r3 = r8.m8833y(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m8820l(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C5708d9.m9016c(r3)
            goto L_0x0226
        L_0x00f7:
            boolean r3 = r8.m8833y(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            int r3 = m8809L(r9, r5)
            goto L_0x0226
        L_0x0105:
            boolean r3 = r8.m8833y(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m8820l(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C5708d9.m9016c(r3)
            goto L_0x0226
        L_0x0117:
            boolean r3 = r8.m8833y(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            long r3 = m8820l(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C5708d9.m9016c(r3)
            goto L_0x0226
        L_0x0129:
            boolean r3 = r8.m8833y(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            float r3 = m8806I(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0226
        L_0x013b:
            boolean r3 = r8.m8833y(r9, r4, r1)
            if (r3 == 0) goto L_0x0227
            int r2 = r2 * 53
            double r3 = m8805H(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.measurement.C5708d9.m9016c(r3)
            goto L_0x0226
        L_0x0151:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C5778hb.m9361k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x015d:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C5778hb.m9361k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x0169:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C5778hb.m9361k(r9, r5)
            if (r3 == 0) goto L_0x01c2
            int r7 = r3.hashCode()
            goto L_0x01c2
        L_0x0174:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C5778hb.m9359i(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C5708d9.m9016c(r3)
            goto L_0x0226
        L_0x0180:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C5778hb.m9358h(r9, r5)
            goto L_0x0226
        L_0x0188:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C5778hb.m9359i(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C5708d9.m9016c(r3)
            goto L_0x0226
        L_0x0194:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C5778hb.m9358h(r9, r5)
            goto L_0x0226
        L_0x019c:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C5778hb.m9358h(r9, r5)
            goto L_0x0226
        L_0x01a4:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C5778hb.m9358h(r9, r5)
            goto L_0x0226
        L_0x01ac:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C5778hb.m9361k(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x01b8:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C5778hb.m9361k(r9, r5)
            if (r3 == 0) goto L_0x01c2
            int r7 = r3.hashCode()
        L_0x01c2:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0227
        L_0x01c6:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C5778hb.m9361k(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x01d3:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.measurement.C5778hb.m9347B(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C5708d9.m9014a(r3)
            goto L_0x0226
        L_0x01de:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C5778hb.m9358h(r9, r5)
            goto L_0x0226
        L_0x01e5:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C5778hb.m9359i(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C5708d9.m9016c(r3)
            goto L_0x0226
        L_0x01f0:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C5778hb.m9358h(r9, r5)
            goto L_0x0226
        L_0x01f7:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C5778hb.m9359i(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C5708d9.m9016c(r3)
            goto L_0x0226
        L_0x0202:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C5778hb.m9359i(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.C5708d9.m9016c(r3)
            goto L_0x0226
        L_0x020d:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.measurement.C5778hb.m9357g(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0226
        L_0x0218:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.measurement.C5778hb.m9356f(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.measurement.C5708d9.m9016c(r3)
        L_0x0226:
            int r2 = r2 + r3
        L_0x0227:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022b:
            int r2 = r2 * 53
            com.google.android.gms.internal.measurement.xa<?, ?> r0 = r8.f6801l
            java.lang.Object r0 = r0.mo34605c(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f6795f
            if (r0 != 0) goto L_0x023d
            return r2
        L_0x023d:
            com.google.android.gms.internal.measurement.j8<?> r0 = r8.f6802m
            r0.mo34123a(r9)
            r9 = 0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C5675ba.mo33705a(java.lang.Object):int");
    }

    /* renamed from: b */
    public final int mo33706b(T t) {
        if (this.f6796g) {
            return m8808K(t);
        }
        return m8807J(t);
    }

    /* renamed from: c */
    public final void mo33707c(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.f6790a.length; i += 3) {
            int k = m8819k(i);
            long j = (long) (1048575 & k);
            int i2 = this.f6790a[i];
            switch (m8818j(k)) {
                case 0:
                    if (!m8830v(t2, i)) {
                        break;
                    } else {
                        C5778hb.m9370t(t, j, C5778hb.m9356f(t2, j));
                        m8827s(t, i);
                        break;
                    }
                case 1:
                    if (!m8830v(t2, i)) {
                        break;
                    } else {
                        C5778hb.m9371u(t, j, C5778hb.m9357g(t2, j));
                        m8827s(t, i);
                        break;
                    }
                case 2:
                    if (!m8830v(t2, i)) {
                        break;
                    } else {
                        C5778hb.m9373w(t, j, C5778hb.m9359i(t2, j));
                        m8827s(t, i);
                        break;
                    }
                case 3:
                    if (!m8830v(t2, i)) {
                        break;
                    } else {
                        C5778hb.m9373w(t, j, C5778hb.m9359i(t2, j));
                        m8827s(t, i);
                        break;
                    }
                case 4:
                    if (!m8830v(t2, i)) {
                        break;
                    } else {
                        C5778hb.m9372v(t, j, C5778hb.m9358h(t2, j));
                        m8827s(t, i);
                        break;
                    }
                case 5:
                    if (!m8830v(t2, i)) {
                        break;
                    } else {
                        C5778hb.m9373w(t, j, C5778hb.m9359i(t2, j));
                        m8827s(t, i);
                        break;
                    }
                case 6:
                    if (!m8830v(t2, i)) {
                        break;
                    } else {
                        C5778hb.m9372v(t, j, C5778hb.m9358h(t2, j));
                        m8827s(t, i);
                        break;
                    }
                case 7:
                    if (!m8830v(t2, i)) {
                        break;
                    } else {
                        C5778hb.m9368r(t, j, C5778hb.m9347B(t2, j));
                        m8827s(t, i);
                        break;
                    }
                case 8:
                    if (!m8830v(t2, i)) {
                        break;
                    } else {
                        C5778hb.m9374x(t, j, C5778hb.m9361k(t2, j));
                        m8827s(t, i);
                        break;
                    }
                case 9:
                    m8825q(t, t2, i);
                    break;
                case 10:
                    if (!m8830v(t2, i)) {
                        break;
                    } else {
                        C5778hb.m9374x(t, j, C5778hb.m9361k(t2, j));
                        m8827s(t, i);
                        break;
                    }
                case 11:
                    if (!m8830v(t2, i)) {
                        break;
                    } else {
                        C5778hb.m9372v(t, j, C5778hb.m9358h(t2, j));
                        m8827s(t, i);
                        break;
                    }
                case 12:
                    if (!m8830v(t2, i)) {
                        break;
                    } else {
                        C5778hb.m9372v(t, j, C5778hb.m9358h(t2, j));
                        m8827s(t, i);
                        break;
                    }
                case 13:
                    if (!m8830v(t2, i)) {
                        break;
                    } else {
                        C5778hb.m9372v(t, j, C5778hb.m9358h(t2, j));
                        m8827s(t, i);
                        break;
                    }
                case 14:
                    if (!m8830v(t2, i)) {
                        break;
                    } else {
                        C5778hb.m9373w(t, j, C5778hb.m9359i(t2, j));
                        m8827s(t, i);
                        break;
                    }
                case 15:
                    if (!m8830v(t2, i)) {
                        break;
                    } else {
                        C5778hb.m9372v(t, j, C5778hb.m9358h(t2, j));
                        m8827s(t, i);
                        break;
                    }
                case 16:
                    if (!m8830v(t2, i)) {
                        break;
                    } else {
                        C5778hb.m9373w(t, j, C5778hb.m9359i(t2, j));
                        m8827s(t, i);
                        break;
                    }
                case 17:
                    m8825q(t, t2, i);
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
                    this.f6800k.mo34127b(t, t2, j);
                    break;
                case 50:
                    C5845la.m9599i(this.f6804o, t, t2, j);
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
                    if (!m8833y(t2, i2, i)) {
                        break;
                    } else {
                        C5778hb.m9374x(t, j, C5778hb.m9361k(t2, j));
                        m8828t(t, i2, i);
                        break;
                    }
                case 60:
                    m8826r(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!m8833y(t2, i2, i)) {
                        break;
                    } else {
                        C5778hb.m9374x(t, j, C5778hb.m9361k(t2, j));
                        m8828t(t, i2, i);
                        break;
                    }
                case 68:
                    m8826r(t, t2, i);
                    break;
            }
        }
        C5845la.m9596f(this.f6801l, t, t2);
        if (this.f6795f) {
            C5845la.m9595e(this.f6802m, t, t2);
        }
    }

    /* renamed from: d */
    public final void mo33708d(T t) {
        int i;
        int i2 = this.f6798i;
        while (true) {
            i = this.f6799j;
            if (i2 >= i) {
                break;
            }
            long k = (long) (m8819k(this.f6797h[i2]) & 1048575);
            Object k2 = C5778hb.m9361k(t, k);
            if (k2 != null) {
                ((C5940r9) k2).mo34321c();
                C5778hb.m9374x(t, k, k2);
            }
            i2++;
        }
        int length = this.f6797h.length;
        while (i < length) {
            this.f6800k.mo34126a(t, (long) this.f6797h[i]);
            i++;
        }
        this.f6801l.mo34609g(t);
        if (this.f6795f) {
            this.f6802m.mo34124b(t);
        }
    }

    /* renamed from: e */
    public final T mo33709e() {
        return ((C6003v8) this.f6794e).mo33646v(4, (Object) null, (Object) null);
    }

    /* renamed from: f */
    public final boolean mo33710f(T t) {
        int i;
        int i2;
        T t2 = t;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f6798i) {
            int i6 = this.f6797h[i5];
            int i7 = this.f6790a[i6];
            int k = m8819k(i6);
            int i8 = this.f6790a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f6789q.getInt(t2, (long) i9);
                }
                i = i4;
                i2 = i9;
            } else {
                i2 = i3;
                i = i4;
            }
            if ((268435456 & k) != 0 && !m8831w(t, i6, i2, i, i10)) {
                return false;
            }
            int j = m8818j(k);
            if (j != 9 && j != 17) {
                if (j != 27) {
                    if (j == 60 || j == 68) {
                        if (m8833y(t2, i7, i6) && !m8832x(t2, k, m8822n(i6))) {
                            return false;
                        }
                    } else if (j != 49) {
                        if (j == 50 && !((C5940r9) C5778hb.m9361k(t2, (long) (k & 1048575))).isEmpty()) {
                            C5924q9 q9Var = (C5924q9) m8823o(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) C5778hb.m9361k(t2, (long) (k & 1048575));
                if (!list.isEmpty()) {
                    C5811ja n = m8822n(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!n.mo33710f(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (m8831w(t, i6, i2, i, i10) && !m8832x(t2, k, m8822n(i6))) {
                return false;
            }
            i5++;
            i3 = i2;
            i4 = i;
        }
        if (!this.f6795f) {
            return true;
        }
        this.f6802m.mo34123a(t2);
        throw null;
    }

    /* renamed from: g */
    public final void mo33711g(T t, byte[] bArr, int i, int i2, C5808j7 j7Var) {
        if (this.f6796g) {
            m8812O(t, bArr, i, i2, j7Var);
        } else {
            mo33704D(t, bArr, i, i2, 0, j7Var);
        }
    }

    /* renamed from: h */
    public final boolean mo33712h(T t, T t2) {
        boolean z;
        int length = this.f6790a.length;
        for (int i = 0; i < length; i += 3) {
            int k = m8819k(i);
            long j = (long) (k & 1048575);
            switch (m8818j(k)) {
                case 0:
                    if (m8829u(t, t2, i) && Double.doubleToLongBits(C5778hb.m9356f(t, j)) == Double.doubleToLongBits(C5778hb.m9356f(t2, j))) {
                        continue;
                    }
                case 1:
                    if (m8829u(t, t2, i) && Float.floatToIntBits(C5778hb.m9357g(t, j)) == Float.floatToIntBits(C5778hb.m9357g(t2, j))) {
                        continue;
                    }
                case 2:
                    if (m8829u(t, t2, i) && C5778hb.m9359i(t, j) == C5778hb.m9359i(t2, j)) {
                        continue;
                    }
                case 3:
                    if (m8829u(t, t2, i) && C5778hb.m9359i(t, j) == C5778hb.m9359i(t2, j)) {
                        continue;
                    }
                case 4:
                    if (m8829u(t, t2, i) && C5778hb.m9358h(t, j) == C5778hb.m9358h(t2, j)) {
                        continue;
                    }
                case 5:
                    if (m8829u(t, t2, i) && C5778hb.m9359i(t, j) == C5778hb.m9359i(t2, j)) {
                        continue;
                    }
                case 6:
                    if (m8829u(t, t2, i) && C5778hb.m9358h(t, j) == C5778hb.m9358h(t2, j)) {
                        continue;
                    }
                case 7:
                    if (m8829u(t, t2, i) && C5778hb.m9347B(t, j) == C5778hb.m9347B(t2, j)) {
                        continue;
                    }
                case 8:
                    if (m8829u(t, t2, i) && C5845la.m9598h(C5778hb.m9361k(t, j), C5778hb.m9361k(t2, j))) {
                        continue;
                    }
                case 9:
                    if (m8829u(t, t2, i) && C5845la.m9598h(C5778hb.m9361k(t, j), C5778hb.m9361k(t2, j))) {
                        continue;
                    }
                case 10:
                    if (m8829u(t, t2, i) && C5845la.m9598h(C5778hb.m9361k(t, j), C5778hb.m9361k(t2, j))) {
                        continue;
                    }
                case 11:
                    if (m8829u(t, t2, i) && C5778hb.m9358h(t, j) == C5778hb.m9358h(t2, j)) {
                        continue;
                    }
                case 12:
                    if (m8829u(t, t2, i) && C5778hb.m9358h(t, j) == C5778hb.m9358h(t2, j)) {
                        continue;
                    }
                case 13:
                    if (m8829u(t, t2, i) && C5778hb.m9358h(t, j) == C5778hb.m9358h(t2, j)) {
                        continue;
                    }
                case 14:
                    if (m8829u(t, t2, i) && C5778hb.m9359i(t, j) == C5778hb.m9359i(t2, j)) {
                        continue;
                    }
                case 15:
                    if (m8829u(t, t2, i) && C5778hb.m9358h(t, j) == C5778hb.m9358h(t2, j)) {
                        continue;
                    }
                case 16:
                    if (m8829u(t, t2, i) && C5778hb.m9359i(t, j) == C5778hb.m9359i(t2, j)) {
                        continue;
                    }
                case 17:
                    if (m8829u(t, t2, i) && C5845la.m9598h(C5778hb.m9361k(t, j), C5778hb.m9361k(t2, j))) {
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
                    z = C5845la.m9598h(C5778hb.m9361k(t, j), C5778hb.m9361k(t2, j));
                    break;
                case 50:
                    z = C5845la.m9598h(C5778hb.m9361k(t, j), C5778hb.m9361k(t2, j));
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
                    long S = (long) (m8816S(i) & 1048575);
                    if (C5778hb.m9358h(t, S) == C5778hb.m9358h(t2, S) && C5845la.m9598h(C5778hb.m9361k(t, j), C5778hb.m9361k(t2, j))) {
                        continue;
                    }
            }
            if (!z) {
                return false;
            }
        }
        if (!this.f6801l.mo34605c(t).equals(this.f6801l.mo34605c(t2))) {
            return false;
        }
        if (!this.f6795f) {
            return true;
        }
        this.f6802m.mo34123a(t);
        this.f6802m.mo34123a(t2);
        throw null;
    }

    /* renamed from: i */
    public final void mo33713i(T t, C5724e8 e8Var) {
        if (!this.f6796g) {
            m8799A(t, e8Var);
        } else if (!this.f6795f) {
            int length = this.f6790a.length;
            for (int i = 0; i < length; i += 3) {
                int k = m8819k(i);
                int i2 = this.f6790a[i];
                switch (m8818j(k)) {
                    case 0:
                        if (!m8830v(t, i)) {
                            break;
                        } else {
                            e8Var.mo33927q(i2, C5778hb.m9356f(t, (long) (k & 1048575)));
                            break;
                        }
                    case 1:
                        if (!m8830v(t, i)) {
                            break;
                        } else {
                            e8Var.mo33936z(i2, C5778hb.m9357g(t, (long) (k & 1048575)));
                            break;
                        }
                    case 2:
                        if (!m8830v(t, i)) {
                            break;
                        } else {
                            e8Var.mo33905E(i2, C5778hb.m9359i(t, (long) (k & 1048575)));
                            break;
                        }
                    case 3:
                        if (!m8830v(t, i)) {
                            break;
                        } else {
                            e8Var.mo33921j(i2, C5778hb.m9359i(t, (long) (k & 1048575)));
                            break;
                        }
                    case 4:
                        if (!m8830v(t, i)) {
                            break;
                        } else {
                            e8Var.mo33903C(i2, C5778hb.m9358h(t, (long) (k & 1048575)));
                            break;
                        }
                    case 5:
                        if (!m8830v(t, i)) {
                            break;
                        } else {
                            e8Var.mo33934x(i2, C5778hb.m9359i(t, (long) (k & 1048575)));
                            break;
                        }
                    case 6:
                        if (!m8830v(t, i)) {
                            break;
                        } else {
                            e8Var.mo33932v(i2, C5778hb.m9358h(t, (long) (k & 1048575)));
                            break;
                        }
                    case 7:
                        if (!m8830v(t, i)) {
                            break;
                        } else {
                            e8Var.mo33923m(i2, C5778hb.m9347B(t, (long) (k & 1048575)));
                            break;
                        }
                    case 8:
                        if (!m8830v(t, i)) {
                            break;
                        } else {
                            m8801C(i2, C5778hb.m9361k(t, (long) (k & 1048575)), e8Var);
                            break;
                        }
                    case 9:
                        if (!m8830v(t, i)) {
                            break;
                        } else {
                            e8Var.mo33907G(i2, C5778hb.m9361k(t, (long) (k & 1048575)), m8822n(i));
                            break;
                        }
                    case 10:
                        if (!m8830v(t, i)) {
                            break;
                        } else {
                            e8Var.mo33925o(i2, (C6018w7) C5778hb.m9361k(t, (long) (k & 1048575)));
                            break;
                        }
                    case 11:
                        if (!m8830v(t, i)) {
                            break;
                        } else {
                            e8Var.mo33919h(i2, C5778hb.m9358h(t, (long) (k & 1048575)));
                            break;
                        }
                    case 12:
                        if (!m8830v(t, i)) {
                            break;
                        } else {
                            e8Var.mo33930t(i2, C5778hb.m9358h(t, (long) (k & 1048575)));
                            break;
                        }
                    case 13:
                        if (!m8830v(t, i)) {
                            break;
                        } else {
                            e8Var.mo33908H(i2, C5778hb.m9358h(t, (long) (k & 1048575)));
                            break;
                        }
                    case 14:
                        if (!m8830v(t, i)) {
                            break;
                        } else {
                            e8Var.mo33910J(i2, C5778hb.m9359i(t, (long) (k & 1048575)));
                            break;
                        }
                    case 15:
                        if (!m8830v(t, i)) {
                            break;
                        } else {
                            e8Var.mo33912a(i2, C5778hb.m9358h(t, (long) (k & 1048575)));
                            break;
                        }
                    case 16:
                        if (!m8830v(t, i)) {
                            break;
                        } else {
                            e8Var.mo33914c(i2, C5778hb.m9359i(t, (long) (k & 1048575)));
                            break;
                        }
                    case 17:
                        if (!m8830v(t, i)) {
                            break;
                        } else {
                            e8Var.mo33902B(i2, C5778hb.m9361k(t, (long) (k & 1048575)), m8822n(i));
                            break;
                        }
                    case 18:
                        C5845la.m9602l(this.f6790a[i], (List) C5778hb.m9361k(t, (long) (k & 1048575)), e8Var, false);
                        break;
                    case 19:
                        C5845la.m9606p(this.f6790a[i], (List) C5778hb.m9361k(t, (long) (k & 1048575)), e8Var, false);
                        break;
                    case 20:
                        C5845la.m9609s(this.f6790a[i], (List) C5778hb.m9361k(t, (long) (k & 1048575)), e8Var, false);
                        break;
                    case 21:
                        C5845la.m9564B(this.f6790a[i], (List) C5778hb.m9361k(t, (long) (k & 1048575)), e8Var, false);
                        break;
                    case 22:
                        C5845la.m9608r(this.f6790a[i], (List) C5778hb.m9361k(t, (long) (k & 1048575)), e8Var, false);
                        break;
                    case 23:
                        C5845la.m9605o(this.f6790a[i], (List) C5778hb.m9361k(t, (long) (k & 1048575)), e8Var, false);
                        break;
                    case 24:
                        C5845la.m9604n(this.f6790a[i], (List) C5778hb.m9361k(t, (long) (k & 1048575)), e8Var, false);
                        break;
                    case 25:
                        C5845la.m9600j(this.f6790a[i], (List) C5778hb.m9361k(t, (long) (k & 1048575)), e8Var, false);
                        break;
                    case 26:
                        C5845la.m9615y(this.f6790a[i], (List) C5778hb.m9361k(t, (long) (k & 1048575)), e8Var);
                        break;
                    case 27:
                        C5845la.m9610t(this.f6790a[i], (List) C5778hb.m9361k(t, (long) (k & 1048575)), e8Var, m8822n(i));
                        break;
                    case 28:
                        C5845la.m9601k(this.f6790a[i], (List) C5778hb.m9361k(t, (long) (k & 1048575)), e8Var);
                        break;
                    case 29:
                        C5845la.m9616z(this.f6790a[i], (List) C5778hb.m9361k(t, (long) (k & 1048575)), e8Var, false);
                        break;
                    case 30:
                        C5845la.m9603m(this.f6790a[i], (List) C5778hb.m9361k(t, (long) (k & 1048575)), e8Var, false);
                        break;
                    case 31:
                        C5845la.m9611u(this.f6790a[i], (List) C5778hb.m9361k(t, (long) (k & 1048575)), e8Var, false);
                        break;
                    case 32:
                        C5845la.m9612v(this.f6790a[i], (List) C5778hb.m9361k(t, (long) (k & 1048575)), e8Var, false);
                        break;
                    case 33:
                        C5845la.m9613w(this.f6790a[i], (List) C5778hb.m9361k(t, (long) (k & 1048575)), e8Var, false);
                        break;
                    case 34:
                        C5845la.m9614x(this.f6790a[i], (List) C5778hb.m9361k(t, (long) (k & 1048575)), e8Var, false);
                        break;
                    case 35:
                        C5845la.m9602l(this.f6790a[i], (List) C5778hb.m9361k(t, (long) (k & 1048575)), e8Var, true);
                        break;
                    case 36:
                        C5845la.m9606p(this.f6790a[i], (List) C5778hb.m9361k(t, (long) (k & 1048575)), e8Var, true);
                        break;
                    case 37:
                        C5845la.m9609s(this.f6790a[i], (List) C5778hb.m9361k(t, (long) (k & 1048575)), e8Var, true);
                        break;
                    case 38:
                        C5845la.m9564B(this.f6790a[i], (List) C5778hb.m9361k(t, (long) (k & 1048575)), e8Var, true);
                        break;
                    case 39:
                        C5845la.m9608r(this.f6790a[i], (List) C5778hb.m9361k(t, (long) (k & 1048575)), e8Var, true);
                        break;
                    case 40:
                        C5845la.m9605o(this.f6790a[i], (List) C5778hb.m9361k(t, (long) (k & 1048575)), e8Var, true);
                        break;
                    case 41:
                        C5845la.m9604n(this.f6790a[i], (List) C5778hb.m9361k(t, (long) (k & 1048575)), e8Var, true);
                        break;
                    case 42:
                        C5845la.m9600j(this.f6790a[i], (List) C5778hb.m9361k(t, (long) (k & 1048575)), e8Var, true);
                        break;
                    case 43:
                        C5845la.m9616z(this.f6790a[i], (List) C5778hb.m9361k(t, (long) (k & 1048575)), e8Var, true);
                        break;
                    case 44:
                        C5845la.m9603m(this.f6790a[i], (List) C5778hb.m9361k(t, (long) (k & 1048575)), e8Var, true);
                        break;
                    case 45:
                        C5845la.m9611u(this.f6790a[i], (List) C5778hb.m9361k(t, (long) (k & 1048575)), e8Var, true);
                        break;
                    case 46:
                        C5845la.m9612v(this.f6790a[i], (List) C5778hb.m9361k(t, (long) (k & 1048575)), e8Var, true);
                        break;
                    case 47:
                        C5845la.m9613w(this.f6790a[i], (List) C5778hb.m9361k(t, (long) (k & 1048575)), e8Var, true);
                        break;
                    case 48:
                        C5845la.m9614x(this.f6790a[i], (List) C5778hb.m9361k(t, (long) (k & 1048575)), e8Var, true);
                        break;
                    case 49:
                        C5845la.m9607q(this.f6790a[i], (List) C5778hb.m9361k(t, (long) (k & 1048575)), e8Var, m8822n(i));
                        break;
                    case 50:
                        m8800B(e8Var, i2, C5778hb.m9361k(t, (long) (k & 1048575)), i);
                        break;
                    case 51:
                        if (!m8833y(t, i2, i)) {
                            break;
                        } else {
                            e8Var.mo33927q(i2, m8805H(t, (long) (k & 1048575)));
                            break;
                        }
                    case 52:
                        if (!m8833y(t, i2, i)) {
                            break;
                        } else {
                            e8Var.mo33936z(i2, m8806I(t, (long) (k & 1048575)));
                            break;
                        }
                    case 53:
                        if (!m8833y(t, i2, i)) {
                            break;
                        } else {
                            e8Var.mo33905E(i2, m8820l(t, (long) (k & 1048575)));
                            break;
                        }
                    case 54:
                        if (!m8833y(t, i2, i)) {
                            break;
                        } else {
                            e8Var.mo33921j(i2, m8820l(t, (long) (k & 1048575)));
                            break;
                        }
                    case 55:
                        if (!m8833y(t, i2, i)) {
                            break;
                        } else {
                            e8Var.mo33903C(i2, m8809L(t, (long) (k & 1048575)));
                            break;
                        }
                    case 56:
                        if (!m8833y(t, i2, i)) {
                            break;
                        } else {
                            e8Var.mo33934x(i2, m8820l(t, (long) (k & 1048575)));
                            break;
                        }
                    case 57:
                        if (!m8833y(t, i2, i)) {
                            break;
                        } else {
                            e8Var.mo33932v(i2, m8809L(t, (long) (k & 1048575)));
                            break;
                        }
                    case 58:
                        if (!m8833y(t, i2, i)) {
                            break;
                        } else {
                            e8Var.mo33923m(i2, m8834z(t, (long) (k & 1048575)));
                            break;
                        }
                    case 59:
                        if (!m8833y(t, i2, i)) {
                            break;
                        } else {
                            m8801C(i2, C5778hb.m9361k(t, (long) (k & 1048575)), e8Var);
                            break;
                        }
                    case 60:
                        if (!m8833y(t, i2, i)) {
                            break;
                        } else {
                            e8Var.mo33907G(i2, C5778hb.m9361k(t, (long) (k & 1048575)), m8822n(i));
                            break;
                        }
                    case 61:
                        if (!m8833y(t, i2, i)) {
                            break;
                        } else {
                            e8Var.mo33925o(i2, (C6018w7) C5778hb.m9361k(t, (long) (k & 1048575)));
                            break;
                        }
                    case 62:
                        if (!m8833y(t, i2, i)) {
                            break;
                        } else {
                            e8Var.mo33919h(i2, m8809L(t, (long) (k & 1048575)));
                            break;
                        }
                    case 63:
                        if (!m8833y(t, i2, i)) {
                            break;
                        } else {
                            e8Var.mo33930t(i2, m8809L(t, (long) (k & 1048575)));
                            break;
                        }
                    case 64:
                        if (!m8833y(t, i2, i)) {
                            break;
                        } else {
                            e8Var.mo33908H(i2, m8809L(t, (long) (k & 1048575)));
                            break;
                        }
                    case 65:
                        if (!m8833y(t, i2, i)) {
                            break;
                        } else {
                            e8Var.mo33910J(i2, m8820l(t, (long) (k & 1048575)));
                            break;
                        }
                    case 66:
                        if (!m8833y(t, i2, i)) {
                            break;
                        } else {
                            e8Var.mo33912a(i2, m8809L(t, (long) (k & 1048575)));
                            break;
                        }
                    case 67:
                        if (!m8833y(t, i2, i)) {
                            break;
                        } else {
                            e8Var.mo33914c(i2, m8820l(t, (long) (k & 1048575)));
                            break;
                        }
                    case 68:
                        if (!m8833y(t, i2, i)) {
                            break;
                        } else {
                            e8Var.mo33902B(i2, C5778hb.m9361k(t, (long) (k & 1048575)), m8822n(i));
                            break;
                        }
                }
            }
            C6037xa<?, ?> xaVar = this.f6801l;
            xaVar.mo34611i(xaVar.mo34605c(t), e8Var);
        } else {
            this.f6802m.mo34123a(t);
            throw null;
        }
    }
}
