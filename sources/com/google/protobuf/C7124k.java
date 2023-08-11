package com.google.protobuf;

import com.google.protobuf.C7115i0;
import com.google.protobuf.C7170r1;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.k */
/* compiled from: CodedOutputStreamWriter */
final class C7124k implements C7170r1 {

    /* renamed from: a */
    private final CodedOutputStream f9643a;

    /* renamed from: com.google.protobuf.k$a */
    /* compiled from: CodedOutputStreamWriter */
    static /* synthetic */ class C7125a {

        /* renamed from: a */
        static final /* synthetic */ int[] f9644a;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.q1$b[] r0 = com.google.protobuf.C7160q1.C7162b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9644a = r0
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9644a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.FIXED32     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9644a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.INT32     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f9644a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f9644a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.SINT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f9644a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.UINT32     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f9644a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f9644a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.INT64     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f9644a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f9644a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.SINT64     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f9644a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.UINT64     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f9644a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.STRING     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7124k.C7125a.<clinit>():void");
        }
    }

    private C7124k(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) C7196z.m13945b(codedOutputStream, "output");
        this.f9643a = codedOutputStream2;
        codedOutputStream2.f9490a = this;
    }

    /* renamed from: P */
    public static C7124k m13332P(CodedOutputStream codedOutputStream) {
        C7124k kVar = codedOutputStream.f9490a;
        if (kVar != null) {
            return kVar;
        }
        return new C7124k(codedOutputStream);
    }

    /* renamed from: Q */
    private <V> void m13333Q(int i, boolean z, V v, C7115i0.C7116a<Boolean, V> aVar) {
        this.f9643a.mo40105W0(i, 2);
        this.f9643a.mo40107Y0(C7115i0.m13256b(aVar, Boolean.valueOf(z), v));
        C7115i0.m13258e(this.f9643a, aVar, Boolean.valueOf(z), v);
    }

    /* renamed from: R */
    private <V> void m13334R(int i, C7115i0.C7116a<Integer, V> aVar, Map<Integer, V> map) {
        int size = map.size();
        int[] iArr = new int[size];
        int i2 = 0;
        for (Integer intValue : map.keySet()) {
            iArr[i2] = intValue.intValue();
            i2++;
        }
        Arrays.sort(iArr);
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = iArr[i3];
            V v = map.get(Integer.valueOf(i4));
            this.f9643a.mo40105W0(i, 2);
            this.f9643a.mo40107Y0(C7115i0.m13256b(aVar, Integer.valueOf(i4), v));
            C7115i0.m13258e(this.f9643a, aVar, Integer.valueOf(i4), v);
        }
    }

    /* renamed from: S */
    private <V> void m13335S(int i, C7115i0.C7116a<Long, V> aVar, Map<Long, V> map) {
        int size = map.size();
        long[] jArr = new long[size];
        int i2 = 0;
        for (Long longValue : map.keySet()) {
            jArr[i2] = longValue.longValue();
            i2++;
        }
        Arrays.sort(jArr);
        for (int i3 = 0; i3 < size; i3++) {
            long j = jArr[i3];
            V v = map.get(Long.valueOf(j));
            this.f9643a.mo40105W0(i, 2);
            this.f9643a.mo40107Y0(C7115i0.m13256b(aVar, Long.valueOf(j), v));
            C7115i0.m13258e(this.f9643a, aVar, Long.valueOf(j), v);
        }
    }

    /* renamed from: T */
    private <K, V> void m13336T(int i, C7115i0.C7116a<K, V> aVar, Map<K, V> map) {
        switch (C7125a.f9644a[aVar.f9626a.ordinal()]) {
            case 1:
                V v = map.get(Boolean.FALSE);
                if (v != null) {
                    m13333Q(i, false, v, aVar);
                }
                V v2 = map.get(Boolean.TRUE);
                if (v2 != null) {
                    m13333Q(i, true, v2, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                m13334R(i, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                m13335S(i, aVar, map);
                return;
            case 12:
                m13337U(i, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f9626a);
        }
    }

    /* renamed from: U */
    private <V> void m13337U(int i, C7115i0.C7116a<String, V> aVar, Map<String, V> map) {
        int size = map.size();
        String[] strArr = new String[size];
        int i2 = 0;
        for (String str : map.keySet()) {
            strArr[i2] = str;
            i2++;
        }
        Arrays.sort(strArr);
        for (int i3 = 0; i3 < size; i3++) {
            String str2 = strArr[i3];
            V v = map.get(str2);
            this.f9643a.mo40105W0(i, 2);
            this.f9643a.mo40107Y0(C7115i0.m13256b(aVar, str2, v));
            C7115i0.m13258e(this.f9643a, aVar, str2, v);
        }
    }

    /* renamed from: V */
    private void m13338V(int i, Object obj) {
        if (obj instanceof String) {
            this.f9643a.mo40103U0(i, (String) obj);
        } else {
            this.f9643a.mo40121o0(i, (C7086h) obj);
        }
    }

    /* renamed from: A */
    public void mo40458A(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f9643a.mo40105W0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m12625n(list.get(i4).intValue());
            }
            this.f9643a.mo40107Y0(i3);
            while (i2 < list.size()) {
                this.f9643a.mo40128v0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9643a.mo40127u0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: B */
    public void mo40459B(int i, List<Boolean> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f9643a.mo40105W0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m12613e(list.get(i4).booleanValue());
            }
            this.f9643a.mo40107Y0(i3);
            while (i2 < list.size()) {
                this.f9643a.mo40118l0(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9643a.mo40117k0(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    /* renamed from: C */
    public <K, V> void mo40460C(int i, C7115i0.C7116a<K, V> aVar, Map<K, V> map) {
        if (this.f9643a.mo40114e0()) {
            m13336T(i, aVar, map);
            return;
        }
        for (Map.Entry next : map.entrySet()) {
            this.f9643a.mo40105W0(i, 2);
            this.f9643a.mo40107Y0(C7115i0.m13256b(aVar, next.getKey(), next.getValue()));
            C7115i0.m13258e(this.f9643a, aVar, next.getKey(), next.getValue());
        }
    }

    /* renamed from: D */
    public void mo40461D(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f9643a.mo40105W0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m12606X(list.get(i4).intValue());
            }
            this.f9643a.mo40107Y0(i3);
            while (i2 < list.size()) {
                this.f9643a.mo40107Y0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9643a.mo40106X0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: E */
    public void mo40462E(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f9643a.mo40105W0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m12601S(list.get(i4).longValue());
            }
            this.f9643a.mo40107Y0(i3);
            while (i2 < list.size()) {
                this.f9643a.mo40102T0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9643a.mo40101S0(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: F */
    public void mo40463F(int i, long j) {
        this.f9643a.mo40101S0(i, j);
    }

    /* renamed from: G */
    public void mo40464G(int i, float f) {
        this.f9643a.mo40131y0(i, f);
    }

    /* renamed from: H */
    public void mo40465H(int i) {
        this.f9643a.mo40105W0(i, 4);
    }

    /* renamed from: I */
    public void mo40466I(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f9643a.mo40105W0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m12599Q(list.get(i4).intValue());
            }
            this.f9643a.mo40107Y0(i3);
            while (i2 < list.size()) {
                this.f9643a.mo40100R0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9643a.mo40099Q0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: J */
    public void mo40467J(int i, int i2) {
        this.f9643a.mo40125s0(i, i2);
    }

    /* renamed from: K */
    public void mo40468K(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f9643a.mo40105W0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m12636y(list.get(i4).longValue());
            }
            this.f9643a.mo40107Y0(i3);
            while (i2 < list.size()) {
                this.f9643a.mo40090H0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9643a.mo40089G0(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: L */
    public void mo40469L(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f9643a.mo40105W0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m12623l(list.get(i4).intValue());
            }
            this.f9643a.mo40107Y0(i3);
            while (i2 < list.size()) {
                this.f9643a.mo40126t0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9643a.mo40125s0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: M */
    public void mo40470M(int i, List<Double> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f9643a.mo40105W0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m12621j(list.get(i4).doubleValue());
            }
            this.f9643a.mo40107Y0(i3);
            while (i2 < list.size()) {
                this.f9643a.mo40124r0(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9643a.mo40123q0(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    /* renamed from: N */
    public void mo40471N(int i, int i2) {
        this.f9643a.mo40099Q0(i, i2);
    }

    /* renamed from: O */
    public void mo40472O(int i, List<C7086h> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f9643a.mo40121o0(i, list.get(i2));
        }
    }

    /* renamed from: a */
    public void mo40473a(int i, List<?> list, C7076e1 e1Var) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo40482j(i, list.get(i2), e1Var);
        }
    }

    /* renamed from: b */
    public void mo40474b(int i, List<?> list, C7076e1 e1Var) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo40491s(i, list.get(i2), e1Var);
        }
    }

    /* renamed from: c */
    public void mo40475c(int i, List<Float> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f9643a.mo40105W0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m12629r(list.get(i4).floatValue());
            }
            this.f9643a.mo40107Y0(i3);
            while (i2 < list.size()) {
                this.f9643a.mo40132z0(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9643a.mo40131y0(i, list.get(i2).floatValue());
            i2++;
        }
    }

    /* renamed from: d */
    public void mo40476d(int i, int i2) {
        this.f9643a.mo40106X0(i, i2);
    }

    /* renamed from: e */
    public final void mo40477e(int i, Object obj) {
        if (obj instanceof C7086h) {
            this.f9643a.mo40094L0(i, (C7086h) obj);
        } else {
            this.f9643a.mo40093K0(i, (C7149p0) obj);
        }
    }

    /* renamed from: f */
    public void mo40478f(int i, int i2) {
        this.f9643a.mo40127u0(i, i2);
    }

    /* renamed from: g */
    public void mo40479g(int i, double d) {
        this.f9643a.mo40123q0(i, d);
    }

    /* renamed from: h */
    public void mo40480h(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f9643a.mo40105W0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m12597O(list.get(i4).longValue());
            }
            this.f9643a.mo40107Y0(i3);
            while (i2 < list.size()) {
                this.f9643a.mo40098P0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9643a.mo40097O0(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: i */
    public void mo40481i(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f9643a.mo40105W0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m12608Z(list.get(i4).longValue());
            }
            this.f9643a.mo40107Y0(i3);
            while (i2 < list.size()) {
                this.f9643a.mo40110a1(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9643a.mo40108Z0(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: j */
    public void mo40482j(int i, Object obj, C7076e1 e1Var) {
        this.f9643a.mo40091I0(i, (C7149p0) obj, e1Var);
    }

    /* renamed from: k */
    public void mo40483k(int i, long j) {
        this.f9643a.mo40129w0(i, j);
    }

    /* renamed from: l */
    public C7170r1.C7171a mo40484l() {
        return C7170r1.C7171a.ASCENDING;
    }

    /* renamed from: m */
    public void mo40485m(int i, List<String> list) {
        int i2 = 0;
        if (list instanceof C7075e0) {
            C7075e0 e0Var = (C7075e0) list;
            while (i2 < list.size()) {
                m13338V(i, e0Var.mo40214C(i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9643a.mo40103U0(i, list.get(i2));
            i2++;
        }
    }

    /* renamed from: n */
    public void mo40486n(int i, String str) {
        this.f9643a.mo40103U0(i, str);
    }

    /* renamed from: o */
    public void mo40487o(int i, long j) {
        this.f9643a.mo40108Z0(i, j);
    }

    /* renamed from: p */
    public void mo40488p(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f9643a.mo40105W0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m12634w(list.get(i4).intValue());
            }
            this.f9643a.mo40107Y0(i3);
            while (i2 < list.size()) {
                this.f9643a.mo40088F0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9643a.mo40087E0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: q */
    public void mo40489q(int i, long j) {
        this.f9643a.mo40089G0(i, j);
    }

    /* renamed from: r */
    public void mo40490r(int i, boolean z) {
        this.f9643a.mo40117k0(i, z);
    }

    /* renamed from: s */
    public void mo40491s(int i, Object obj, C7076e1 e1Var) {
        this.f9643a.mo40084B0(i, (C7149p0) obj, e1Var);
    }

    /* renamed from: t */
    public void mo40492t(int i, int i2) {
        this.f9643a.mo40095M0(i, i2);
    }

    /* renamed from: u */
    public void mo40493u(int i) {
        this.f9643a.mo40105W0(i, 3);
    }

    /* renamed from: v */
    public void mo40494v(int i, C7086h hVar) {
        this.f9643a.mo40121o0(i, hVar);
    }

    /* renamed from: w */
    public void mo40495w(int i, int i2) {
        this.f9643a.mo40087E0(i, i2);
    }

    /* renamed from: x */
    public void mo40496x(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f9643a.mo40105W0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m12627p(list.get(i4).longValue());
            }
            this.f9643a.mo40107Y0(i3);
            while (i2 < list.size()) {
                this.f9643a.mo40130x0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9643a.mo40129w0(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: y */
    public void mo40497y(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f9643a.mo40105W0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream.m12595M(list.get(i4).intValue());
            }
            this.f9643a.mo40107Y0(i3);
            while (i2 < list.size()) {
                this.f9643a.mo40096N0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f9643a.mo40095M0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: z */
    public void mo40498z(int i, long j) {
        this.f9643a.mo40097O0(i, j);
    }
}
