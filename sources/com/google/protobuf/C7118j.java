package com.google.protobuf;

import com.google.protobuf.C7160q1;
import java.util.List;

/* renamed from: com.google.protobuf.j */
/* compiled from: CodedInputStreamReader */
final class C7118j implements C7071d1 {

    /* renamed from: a */
    private final C7111i f9635a;

    /* renamed from: b */
    private int f9636b;

    /* renamed from: c */
    private int f9637c;

    /* renamed from: d */
    private int f9638d = 0;

    /* renamed from: com.google.protobuf.j$a */
    /* compiled from: CodedInputStreamReader */
    static /* synthetic */ class C7119a {

        /* renamed from: a */
        static final /* synthetic */ int[] f9639a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
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
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.q1$b[] r0 = com.google.protobuf.C7160q1.C7162b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9639a = r0
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9639a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9639a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f9639a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.ENUM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f9639a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.FIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f9639a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f9639a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.FLOAT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f9639a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.INT32     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f9639a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.INT64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f9639a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f9639a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f9639a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f9639a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.SINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f9639a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.SINT64     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f9639a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.STRING     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f9639a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.UINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f9639a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.q1$b r1 = com.google.protobuf.C7160q1.C7162b.UINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7118j.C7119a.<clinit>():void");
        }
    }

    private C7118j(C7111i iVar) {
        C7111i iVar2 = (C7111i) C7196z.m13945b(iVar, "input");
        this.f9635a = iVar2;
        iVar2.f9604d = this;
    }

    /* renamed from: P */
    public static C7118j m13266P(C7111i iVar) {
        C7118j jVar = iVar.f9604d;
        if (jVar != null) {
            return jVar;
        }
        return new C7118j(iVar);
    }

    /* renamed from: Q */
    private Object m13267Q(C7160q1.C7162b bVar, Class<?> cls, C7139o oVar) {
        switch (C7119a.f9639a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(mo40252j());
            case 2:
                return mo40232F();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(mo40264t());
            case 5:
                return Integer.valueOf(mo40251i());
            case 6:
                return Long.valueOf(mo40244c());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(mo40234H());
            case 9:
                return Long.valueOf(mo40239M());
            case 10:
                return mo40250h(cls, oVar);
            case 11:
                return Integer.valueOf(mo40236J());
            case 12:
                return Long.valueOf(mo40254l());
            case 13:
                return Integer.valueOf(mo40266v());
            case 14:
                return Long.valueOf(mo40267w());
            case 15:
                return mo40240N();
            case 16:
                return Integer.valueOf(mo40257o());
            case 17:
                return Long.valueOf(mo40243b());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* renamed from: R */
    private <T> T m13268R(C7076e1<T> e1Var, C7139o oVar) {
        int i = this.f9637c;
        this.f9637c = C7160q1.m13682c(C7160q1.m13680a(this.f9636b), 4);
        try {
            T h = e1Var.mo40281h();
            e1Var.mo40278e(h, this, oVar);
            e1Var.mo40276c(h);
            if (this.f9636b == this.f9637c) {
                return h;
            }
            throw InvalidProtocolBufferException.m12758h();
        } finally {
            this.f9637c = i;
        }
    }

    /* renamed from: S */
    private <T> T m13269S(C7076e1<T> e1Var, C7139o oVar) {
        int C = this.f9635a.mo40400C();
        C7111i iVar = this.f9635a;
        if (iVar.f9601a < iVar.f9602b) {
            int l = iVar.mo40408l(C);
            T h = e1Var.mo40281h();
            this.f9635a.f9601a++;
            e1Var.mo40278e(h, this, oVar);
            e1Var.mo40276c(h);
            this.f9635a.mo40404a(0);
            C7111i iVar2 = this.f9635a;
            iVar2.f9601a--;
            iVar2.mo40407k(l);
            return h;
        }
        throw InvalidProtocolBufferException.m12759i();
    }

    /* renamed from: U */
    private void m13270U(int i) {
        if (this.f9635a.mo40405d() != i) {
            throw InvalidProtocolBufferException.m12761m();
        }
    }

    /* renamed from: V */
    private void m13271V(int i) {
        if (C7160q1.m13681b(this.f9636b) != i) {
            throw InvalidProtocolBufferException.m12755e();
        }
    }

    /* renamed from: W */
    private void m13272W(int i) {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.m12758h();
        }
    }

    /* renamed from: X */
    private void m13273X(int i) {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.m12758h();
        }
    }

    /* renamed from: A */
    public int mo40227A() {
        int i = this.f9638d;
        if (i != 0) {
            this.f9636b = i;
            this.f9638d = 0;
        } else {
            this.f9636b = this.f9635a.mo40399B();
        }
        int i2 = this.f9636b;
        if (i2 == 0 || i2 == this.f9637c) {
            return Integer.MAX_VALUE;
        }
        return C7160q1.m13680a(i2);
    }

    /* renamed from: B */
    public void mo40228B(List<String> list) {
        mo40444T(list, false);
    }

    /* renamed from: C */
    public <T> T mo40229C(C7076e1<T> e1Var, C7139o oVar) {
        m13271V(2);
        return m13269S(e1Var, oVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (mo40235I() != false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005b, code lost:
        throw new com.google.protobuf.InvalidProtocolBufferException("Unable to parse map entry.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004f */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <K, V> void mo40230D(java.util.Map<K, V> r8, com.google.protobuf.C7115i0.C7116a<K, V> r9, com.google.protobuf.C7139o r10) {
        /*
            r7 = this;
            r0 = 2
            r7.m13271V(r0)
            com.google.protobuf.i r1 = r7.f9635a
            int r1 = r1.mo40400C()
            com.google.protobuf.i r2 = r7.f9635a
            int r1 = r2.mo40408l(r1)
            K r2 = r9.f9627b
            V r3 = r9.f9629d
        L_0x0014:
            int r4 = r7.mo40227A()     // Catch:{ all -> 0x0065 }
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x005c
            com.google.protobuf.i r5 = r7.f9635a     // Catch:{ all -> 0x0065 }
            boolean r5 = r5.mo40406e()     // Catch:{ all -> 0x0065 }
            if (r5 == 0) goto L_0x0026
            goto L_0x005c
        L_0x0026:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L_0x0047
            if (r4 == r0) goto L_0x003a
            boolean r4 = r7.mo40235I()     // Catch:{ InvalidWireTypeException -> 0x004f }
            if (r4 == 0) goto L_0x0034
            goto L_0x0014
        L_0x0034:
            com.google.protobuf.InvalidProtocolBufferException r4 = new com.google.protobuf.InvalidProtocolBufferException     // Catch:{ InvalidWireTypeException -> 0x004f }
            r4.<init>((java.lang.String) r6)     // Catch:{ InvalidWireTypeException -> 0x004f }
            throw r4     // Catch:{ InvalidWireTypeException -> 0x004f }
        L_0x003a:
            com.google.protobuf.q1$b r4 = r9.f9628c     // Catch:{ InvalidWireTypeException -> 0x004f }
            V r5 = r9.f9629d     // Catch:{ InvalidWireTypeException -> 0x004f }
            java.lang.Class r5 = r5.getClass()     // Catch:{ InvalidWireTypeException -> 0x004f }
            java.lang.Object r3 = r7.m13267Q(r4, r5, r10)     // Catch:{ InvalidWireTypeException -> 0x004f }
            goto L_0x0014
        L_0x0047:
            com.google.protobuf.q1$b r4 = r9.f9626a     // Catch:{ InvalidWireTypeException -> 0x004f }
            r5 = 0
            java.lang.Object r2 = r7.m13267Q(r4, r5, r5)     // Catch:{ InvalidWireTypeException -> 0x004f }
            goto L_0x0014
        L_0x004f:
            boolean r4 = r7.mo40235I()     // Catch:{ all -> 0x0065 }
            if (r4 == 0) goto L_0x0056
            goto L_0x0014
        L_0x0056:
            com.google.protobuf.InvalidProtocolBufferException r8 = new com.google.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x0065 }
            r8.<init>((java.lang.String) r6)     // Catch:{ all -> 0x0065 }
            throw r8     // Catch:{ all -> 0x0065 }
        L_0x005c:
            r8.put(r2, r3)     // Catch:{ all -> 0x0065 }
            com.google.protobuf.i r8 = r7.f9635a
            r8.mo40407k(r1)
            return
        L_0x0065:
            r8 = move-exception
            com.google.protobuf.i r9 = r7.f9635a
            r9.mo40407k(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7118j.mo40230D(java.util.Map, com.google.protobuf.i0$a, com.google.protobuf.o):void");
    }

    /* renamed from: E */
    public void mo40231E(List<String> list) {
        mo40444T(list, true);
    }

    /* renamed from: F */
    public C7086h mo40232F() {
        m13271V(2);
        return this.f9635a.mo40410n();
    }

    /* renamed from: G */
    public void mo40233G(List<Float> list) {
        int B;
        int B2;
        if (list instanceof C7182v) {
            C7182v vVar = (C7182v) list;
            int b = C7160q1.m13681b(this.f9636b);
            if (b == 2) {
                int C = this.f9635a.mo40400C();
                m13272W(C);
                int d = this.f9635a.mo40405d() + C;
                do {
                    vVar.mo40672k(this.f9635a.mo40415s());
                } while (this.f9635a.mo40405d() < d);
            } else if (b == 5) {
                do {
                    vVar.mo40672k(this.f9635a.mo40415s());
                    if (!this.f9635a.mo40406e()) {
                        B2 = this.f9635a.mo40399B();
                    } else {
                        return;
                    }
                } while (B2 == this.f9636b);
                this.f9638d = B2;
            } else {
                throw InvalidProtocolBufferException.m12755e();
            }
        } else {
            int b2 = C7160q1.m13681b(this.f9636b);
            if (b2 == 2) {
                int C2 = this.f9635a.mo40400C();
                m13272W(C2);
                int d2 = this.f9635a.mo40405d() + C2;
                do {
                    list.add(Float.valueOf(this.f9635a.mo40415s()));
                } while (this.f9635a.mo40405d() < d2);
            } else if (b2 == 5) {
                do {
                    list.add(Float.valueOf(this.f9635a.mo40415s()));
                    if (!this.f9635a.mo40406e()) {
                        B = this.f9635a.mo40399B();
                    } else {
                        return;
                    }
                } while (B == this.f9636b);
                this.f9638d = B;
            } else {
                throw InvalidProtocolBufferException.m12755e();
            }
        }
    }

    /* renamed from: H */
    public int mo40234H() {
        m13271V(0);
        return this.f9635a.mo40416t();
    }

    /* renamed from: I */
    public boolean mo40235I() {
        int i;
        if (this.f9635a.mo40406e() || (i = this.f9636b) == this.f9637c) {
            return false;
        }
        return this.f9635a.mo40403F(i);
    }

    /* renamed from: J */
    public int mo40236J() {
        m13271V(5);
        return this.f9635a.mo40418v();
    }

    /* renamed from: K */
    public void mo40237K(List<C7086h> list) {
        int B;
        if (C7160q1.m13681b(this.f9636b) == 2) {
            do {
                list.add(mo40232F());
                if (!this.f9635a.mo40406e()) {
                    B = this.f9635a.mo40399B();
                } else {
                    return;
                }
            } while (B == this.f9636b);
            this.f9638d = B;
            return;
        }
        throw InvalidProtocolBufferException.m12755e();
    }

    /* renamed from: L */
    public void mo40238L(List<Double> list) {
        int B;
        int B2;
        if (list instanceof C7128l) {
            C7128l lVar = (C7128l) list;
            int b = C7160q1.m13681b(this.f9636b);
            if (b == 1) {
                do {
                    lVar.mo40535k(this.f9635a.mo40411o());
                    if (!this.f9635a.mo40406e()) {
                        B2 = this.f9635a.mo40399B();
                    } else {
                        return;
                    }
                } while (B2 == this.f9636b);
                this.f9638d = B2;
            } else if (b == 2) {
                int C = this.f9635a.mo40400C();
                m13273X(C);
                int d = this.f9635a.mo40405d() + C;
                do {
                    lVar.mo40535k(this.f9635a.mo40411o());
                } while (this.f9635a.mo40405d() < d);
            } else {
                throw InvalidProtocolBufferException.m12755e();
            }
        } else {
            int b2 = C7160q1.m13681b(this.f9636b);
            if (b2 == 1) {
                do {
                    list.add(Double.valueOf(this.f9635a.mo40411o()));
                    if (!this.f9635a.mo40406e()) {
                        B = this.f9635a.mo40399B();
                    } else {
                        return;
                    }
                } while (B == this.f9636b);
                this.f9638d = B;
            } else if (b2 == 2) {
                int C2 = this.f9635a.mo40400C();
                m13273X(C2);
                int d2 = this.f9635a.mo40405d() + C2;
                do {
                    list.add(Double.valueOf(this.f9635a.mo40411o()));
                } while (this.f9635a.mo40405d() < d2);
            } else {
                throw InvalidProtocolBufferException.m12755e();
            }
        }
    }

    /* renamed from: M */
    public long mo40239M() {
        m13271V(0);
        return this.f9635a.mo40417u();
    }

    /* renamed from: N */
    public String mo40240N() {
        m13271V(2);
        return this.f9635a.mo40398A();
    }

    /* renamed from: O */
    public void mo40241O(List<Long> list) {
        int B;
        int B2;
        if (list instanceof C7084g0) {
            C7084g0 g0Var = (C7084g0) list;
            int b = C7160q1.m13681b(this.f9636b);
            if (b == 1) {
                do {
                    g0Var.mo40311q(this.f9635a.mo40414r());
                    if (!this.f9635a.mo40406e()) {
                        B2 = this.f9635a.mo40399B();
                    } else {
                        return;
                    }
                } while (B2 == this.f9636b);
                this.f9638d = B2;
            } else if (b == 2) {
                int C = this.f9635a.mo40400C();
                m13273X(C);
                int d = this.f9635a.mo40405d() + C;
                do {
                    g0Var.mo40311q(this.f9635a.mo40414r());
                } while (this.f9635a.mo40405d() < d);
            } else {
                throw InvalidProtocolBufferException.m12755e();
            }
        } else {
            int b2 = C7160q1.m13681b(this.f9636b);
            if (b2 == 1) {
                do {
                    list.add(Long.valueOf(this.f9635a.mo40414r()));
                    if (!this.f9635a.mo40406e()) {
                        B = this.f9635a.mo40399B();
                    } else {
                        return;
                    }
                } while (B == this.f9636b);
                this.f9638d = B;
            } else if (b2 == 2) {
                int C2 = this.f9635a.mo40400C();
                m13273X(C2);
                int d2 = this.f9635a.mo40405d() + C2;
                do {
                    list.add(Long.valueOf(this.f9635a.mo40414r()));
                } while (this.f9635a.mo40405d() < d2);
            } else {
                throw InvalidProtocolBufferException.m12755e();
            }
        }
    }

    /* renamed from: T */
    public void mo40444T(List<String> list, boolean z) {
        String str;
        int B;
        int B2;
        if (C7160q1.m13681b(this.f9636b) != 2) {
            throw InvalidProtocolBufferException.m12755e();
        } else if (!(list instanceof C7075e0) || z) {
            do {
                if (z) {
                    str = mo40240N();
                } else {
                    str = mo40269y();
                }
                list.add(str);
                if (!this.f9635a.mo40406e()) {
                    B = this.f9635a.mo40399B();
                } else {
                    return;
                }
            } while (B == this.f9636b);
            this.f9638d = B;
        } else {
            C7075e0 e0Var = (C7075e0) list;
            do {
                e0Var.mo40219o(mo40232F());
                if (!this.f9635a.mo40406e()) {
                    B2 = this.f9635a.mo40399B();
                } else {
                    return;
                }
            } while (B2 == this.f9636b);
            this.f9638d = B2;
        }
    }

    /* renamed from: a */
    public void mo40242a(List<Integer> list) {
        int B;
        int B2;
        if (list instanceof C7194y) {
            C7194y yVar = (C7194y) list;
            int b = C7160q1.m13681b(this.f9636b);
            if (b == 0) {
                do {
                    yVar.mo40719k(this.f9635a.mo40420x());
                    if (!this.f9635a.mo40406e()) {
                        B2 = this.f9635a.mo40399B();
                    } else {
                        return;
                    }
                } while (B2 == this.f9636b);
                this.f9638d = B2;
            } else if (b == 2) {
                int d = this.f9635a.mo40405d() + this.f9635a.mo40400C();
                do {
                    yVar.mo40719k(this.f9635a.mo40420x());
                } while (this.f9635a.mo40405d() < d);
                m13270U(d);
            } else {
                throw InvalidProtocolBufferException.m12755e();
            }
        } else {
            int b2 = C7160q1.m13681b(this.f9636b);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f9635a.mo40420x()));
                    if (!this.f9635a.mo40406e()) {
                        B = this.f9635a.mo40399B();
                    } else {
                        return;
                    }
                } while (B == this.f9636b);
                this.f9638d = B;
            } else if (b2 == 2) {
                int d2 = this.f9635a.mo40405d() + this.f9635a.mo40400C();
                do {
                    list.add(Integer.valueOf(this.f9635a.mo40420x()));
                } while (this.f9635a.mo40405d() < d2);
                m13270U(d2);
            } else {
                throw InvalidProtocolBufferException.m12755e();
            }
        }
    }

    /* renamed from: b */
    public long mo40243b() {
        m13271V(0);
        return this.f9635a.mo40401D();
    }

    /* renamed from: c */
    public long mo40244c() {
        m13271V(1);
        return this.f9635a.mo40414r();
    }

    /* renamed from: d */
    public void mo40245d(List<Integer> list) {
        int B;
        int B2;
        if (list instanceof C7194y) {
            C7194y yVar = (C7194y) list;
            int b = C7160q1.m13681b(this.f9636b);
            if (b == 2) {
                int C = this.f9635a.mo40400C();
                m13272W(C);
                int d = this.f9635a.mo40405d() + C;
                do {
                    yVar.mo40719k(this.f9635a.mo40418v());
                } while (this.f9635a.mo40405d() < d);
            } else if (b == 5) {
                do {
                    yVar.mo40719k(this.f9635a.mo40418v());
                    if (!this.f9635a.mo40406e()) {
                        B2 = this.f9635a.mo40399B();
                    } else {
                        return;
                    }
                } while (B2 == this.f9636b);
                this.f9638d = B2;
            } else {
                throw InvalidProtocolBufferException.m12755e();
            }
        } else {
            int b2 = C7160q1.m13681b(this.f9636b);
            if (b2 == 2) {
                int C2 = this.f9635a.mo40400C();
                m13272W(C2);
                int d2 = this.f9635a.mo40405d() + C2;
                do {
                    list.add(Integer.valueOf(this.f9635a.mo40418v()));
                } while (this.f9635a.mo40405d() < d2);
            } else if (b2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f9635a.mo40418v()));
                    if (!this.f9635a.mo40406e()) {
                        B = this.f9635a.mo40399B();
                    } else {
                        return;
                    }
                } while (B == this.f9636b);
                this.f9638d = B;
            } else {
                throw InvalidProtocolBufferException.m12755e();
            }
        }
    }

    /* renamed from: e */
    public void mo40246e(List<Long> list) {
        int B;
        int B2;
        if (list instanceof C7084g0) {
            C7084g0 g0Var = (C7084g0) list;
            int b = C7160q1.m13681b(this.f9636b);
            if (b == 0) {
                do {
                    g0Var.mo40311q(this.f9635a.mo40421y());
                    if (!this.f9635a.mo40406e()) {
                        B2 = this.f9635a.mo40399B();
                    } else {
                        return;
                    }
                } while (B2 == this.f9636b);
                this.f9638d = B2;
            } else if (b == 2) {
                int d = this.f9635a.mo40405d() + this.f9635a.mo40400C();
                do {
                    g0Var.mo40311q(this.f9635a.mo40421y());
                } while (this.f9635a.mo40405d() < d);
                m13270U(d);
            } else {
                throw InvalidProtocolBufferException.m12755e();
            }
        } else {
            int b2 = C7160q1.m13681b(this.f9636b);
            if (b2 == 0) {
                do {
                    list.add(Long.valueOf(this.f9635a.mo40421y()));
                    if (!this.f9635a.mo40406e()) {
                        B = this.f9635a.mo40399B();
                    } else {
                        return;
                    }
                } while (B == this.f9636b);
                this.f9638d = B;
            } else if (b2 == 2) {
                int d2 = this.f9635a.mo40405d() + this.f9635a.mo40400C();
                do {
                    list.add(Long.valueOf(this.f9635a.mo40421y()));
                } while (this.f9635a.mo40405d() < d2);
                m13270U(d2);
            } else {
                throw InvalidProtocolBufferException.m12755e();
            }
        }
    }

    /* renamed from: f */
    public <T> void mo40247f(List<T> list, C7076e1<T> e1Var, C7139o oVar) {
        int B;
        if (C7160q1.m13681b(this.f9636b) == 3) {
            int i = this.f9636b;
            do {
                list.add(m13268R(e1Var, oVar));
                if (!this.f9635a.mo40406e() && this.f9638d == 0) {
                    B = this.f9635a.mo40399B();
                } else {
                    return;
                }
            } while (B == i);
            this.f9638d = B;
            return;
        }
        throw InvalidProtocolBufferException.m12755e();
    }

    /* renamed from: g */
    public void mo40248g(List<Integer> list) {
        int B;
        int B2;
        if (list instanceof C7194y) {
            C7194y yVar = (C7194y) list;
            int b = C7160q1.m13681b(this.f9636b);
            if (b == 0) {
                do {
                    yVar.mo40719k(this.f9635a.mo40400C());
                    if (!this.f9635a.mo40406e()) {
                        B2 = this.f9635a.mo40399B();
                    } else {
                        return;
                    }
                } while (B2 == this.f9636b);
                this.f9638d = B2;
            } else if (b == 2) {
                int d = this.f9635a.mo40405d() + this.f9635a.mo40400C();
                do {
                    yVar.mo40719k(this.f9635a.mo40400C());
                } while (this.f9635a.mo40405d() < d);
                m13270U(d);
            } else {
                throw InvalidProtocolBufferException.m12755e();
            }
        } else {
            int b2 = C7160q1.m13681b(this.f9636b);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f9635a.mo40400C()));
                    if (!this.f9635a.mo40406e()) {
                        B = this.f9635a.mo40399B();
                    } else {
                        return;
                    }
                } while (B == this.f9636b);
                this.f9638d = B;
            } else if (b2 == 2) {
                int d2 = this.f9635a.mo40405d() + this.f9635a.mo40400C();
                do {
                    list.add(Integer.valueOf(this.f9635a.mo40400C()));
                } while (this.f9635a.mo40405d() < d2);
                m13270U(d2);
            } else {
                throw InvalidProtocolBufferException.m12755e();
            }
        }
    }

    public int getTag() {
        return this.f9636b;
    }

    /* renamed from: h */
    public <T> T mo40250h(Class<T> cls, C7139o oVar) {
        m13271V(2);
        return m13269S(C7059a1.m12782a().mo40162d(cls), oVar);
    }

    /* renamed from: i */
    public int mo40251i() {
        m13271V(5);
        return this.f9635a.mo40413q();
    }

    /* renamed from: j */
    public boolean mo40252j() {
        m13271V(0);
        return this.f9635a.mo40409m();
    }

    /* renamed from: k */
    public <T> void mo40253k(List<T> list, C7076e1<T> e1Var, C7139o oVar) {
        int B;
        if (C7160q1.m13681b(this.f9636b) == 2) {
            int i = this.f9636b;
            do {
                list.add(m13269S(e1Var, oVar));
                if (!this.f9635a.mo40406e() && this.f9638d == 0) {
                    B = this.f9635a.mo40399B();
                } else {
                    return;
                }
            } while (B == i);
            this.f9638d = B;
            return;
        }
        throw InvalidProtocolBufferException.m12755e();
    }

    /* renamed from: l */
    public long mo40254l() {
        m13271V(1);
        return this.f9635a.mo40419w();
    }

    /* renamed from: m */
    public void mo40255m(List<Long> list) {
        int B;
        int B2;
        if (list instanceof C7084g0) {
            C7084g0 g0Var = (C7084g0) list;
            int b = C7160q1.m13681b(this.f9636b);
            if (b == 0) {
                do {
                    g0Var.mo40311q(this.f9635a.mo40401D());
                    if (!this.f9635a.mo40406e()) {
                        B2 = this.f9635a.mo40399B();
                    } else {
                        return;
                    }
                } while (B2 == this.f9636b);
                this.f9638d = B2;
            } else if (b == 2) {
                int d = this.f9635a.mo40405d() + this.f9635a.mo40400C();
                do {
                    g0Var.mo40311q(this.f9635a.mo40401D());
                } while (this.f9635a.mo40405d() < d);
                m13270U(d);
            } else {
                throw InvalidProtocolBufferException.m12755e();
            }
        } else {
            int b2 = C7160q1.m13681b(this.f9636b);
            if (b2 == 0) {
                do {
                    list.add(Long.valueOf(this.f9635a.mo40401D()));
                    if (!this.f9635a.mo40406e()) {
                        B = this.f9635a.mo40399B();
                    } else {
                        return;
                    }
                } while (B == this.f9636b);
                this.f9638d = B;
            } else if (b2 == 2) {
                int d2 = this.f9635a.mo40405d() + this.f9635a.mo40400C();
                do {
                    list.add(Long.valueOf(this.f9635a.mo40401D()));
                } while (this.f9635a.mo40405d() < d2);
                m13270U(d2);
            } else {
                throw InvalidProtocolBufferException.m12755e();
            }
        }
    }

    /* renamed from: n */
    public <T> T mo40256n(C7076e1<T> e1Var, C7139o oVar) {
        m13271V(3);
        return m13268R(e1Var, oVar);
    }

    /* renamed from: o */
    public int mo40257o() {
        m13271V(0);
        return this.f9635a.mo40400C();
    }

    /* renamed from: p */
    public void mo40258p(List<Long> list) {
        int B;
        int B2;
        if (list instanceof C7084g0) {
            C7084g0 g0Var = (C7084g0) list;
            int b = C7160q1.m13681b(this.f9636b);
            if (b == 0) {
                do {
                    g0Var.mo40311q(this.f9635a.mo40417u());
                    if (!this.f9635a.mo40406e()) {
                        B2 = this.f9635a.mo40399B();
                    } else {
                        return;
                    }
                } while (B2 == this.f9636b);
                this.f9638d = B2;
            } else if (b == 2) {
                int d = this.f9635a.mo40405d() + this.f9635a.mo40400C();
                do {
                    g0Var.mo40311q(this.f9635a.mo40417u());
                } while (this.f9635a.mo40405d() < d);
                m13270U(d);
            } else {
                throw InvalidProtocolBufferException.m12755e();
            }
        } else {
            int b2 = C7160q1.m13681b(this.f9636b);
            if (b2 == 0) {
                do {
                    list.add(Long.valueOf(this.f9635a.mo40417u()));
                    if (!this.f9635a.mo40406e()) {
                        B = this.f9635a.mo40399B();
                    } else {
                        return;
                    }
                } while (B == this.f9636b);
                this.f9638d = B;
            } else if (b2 == 2) {
                int d2 = this.f9635a.mo40405d() + this.f9635a.mo40400C();
                do {
                    list.add(Long.valueOf(this.f9635a.mo40417u()));
                } while (this.f9635a.mo40405d() < d2);
                m13270U(d2);
            } else {
                throw InvalidProtocolBufferException.m12755e();
            }
        }
    }

    /* renamed from: q */
    public void mo40259q(List<Long> list) {
        int B;
        int B2;
        if (list instanceof C7084g0) {
            C7084g0 g0Var = (C7084g0) list;
            int b = C7160q1.m13681b(this.f9636b);
            if (b == 1) {
                do {
                    g0Var.mo40311q(this.f9635a.mo40419w());
                    if (!this.f9635a.mo40406e()) {
                        B2 = this.f9635a.mo40399B();
                    } else {
                        return;
                    }
                } while (B2 == this.f9636b);
                this.f9638d = B2;
            } else if (b == 2) {
                int C = this.f9635a.mo40400C();
                m13273X(C);
                int d = this.f9635a.mo40405d() + C;
                do {
                    g0Var.mo40311q(this.f9635a.mo40419w());
                } while (this.f9635a.mo40405d() < d);
            } else {
                throw InvalidProtocolBufferException.m12755e();
            }
        } else {
            int b2 = C7160q1.m13681b(this.f9636b);
            if (b2 == 1) {
                do {
                    list.add(Long.valueOf(this.f9635a.mo40419w()));
                    if (!this.f9635a.mo40406e()) {
                        B = this.f9635a.mo40399B();
                    } else {
                        return;
                    }
                } while (B == this.f9636b);
                this.f9638d = B;
            } else if (b2 == 2) {
                int C2 = this.f9635a.mo40400C();
                m13273X(C2);
                int d2 = this.f9635a.mo40405d() + C2;
                do {
                    list.add(Long.valueOf(this.f9635a.mo40419w()));
                } while (this.f9635a.mo40405d() < d2);
            } else {
                throw InvalidProtocolBufferException.m12755e();
            }
        }
    }

    /* renamed from: r */
    public void mo40260r(List<Integer> list) {
        int B;
        int B2;
        if (list instanceof C7194y) {
            C7194y yVar = (C7194y) list;
            int b = C7160q1.m13681b(this.f9636b);
            if (b == 0) {
                do {
                    yVar.mo40719k(this.f9635a.mo40416t());
                    if (!this.f9635a.mo40406e()) {
                        B2 = this.f9635a.mo40399B();
                    } else {
                        return;
                    }
                } while (B2 == this.f9636b);
                this.f9638d = B2;
            } else if (b == 2) {
                int d = this.f9635a.mo40405d() + this.f9635a.mo40400C();
                do {
                    yVar.mo40719k(this.f9635a.mo40416t());
                } while (this.f9635a.mo40405d() < d);
                m13270U(d);
            } else {
                throw InvalidProtocolBufferException.m12755e();
            }
        } else {
            int b2 = C7160q1.m13681b(this.f9636b);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f9635a.mo40416t()));
                    if (!this.f9635a.mo40406e()) {
                        B = this.f9635a.mo40399B();
                    } else {
                        return;
                    }
                } while (B == this.f9636b);
                this.f9638d = B;
            } else if (b2 == 2) {
                int d2 = this.f9635a.mo40405d() + this.f9635a.mo40400C();
                do {
                    list.add(Integer.valueOf(this.f9635a.mo40416t()));
                } while (this.f9635a.mo40405d() < d2);
                m13270U(d2);
            } else {
                throw InvalidProtocolBufferException.m12755e();
            }
        }
    }

    public double readDouble() {
        m13271V(1);
        return this.f9635a.mo40411o();
    }

    public float readFloat() {
        m13271V(5);
        return this.f9635a.mo40415s();
    }

    /* renamed from: s */
    public void mo40263s(List<Integer> list) {
        int B;
        int B2;
        if (list instanceof C7194y) {
            C7194y yVar = (C7194y) list;
            int b = C7160q1.m13681b(this.f9636b);
            if (b == 0) {
                do {
                    yVar.mo40719k(this.f9635a.mo40412p());
                    if (!this.f9635a.mo40406e()) {
                        B2 = this.f9635a.mo40399B();
                    } else {
                        return;
                    }
                } while (B2 == this.f9636b);
                this.f9638d = B2;
            } else if (b == 2) {
                int d = this.f9635a.mo40405d() + this.f9635a.mo40400C();
                do {
                    yVar.mo40719k(this.f9635a.mo40412p());
                } while (this.f9635a.mo40405d() < d);
                m13270U(d);
            } else {
                throw InvalidProtocolBufferException.m12755e();
            }
        } else {
            int b2 = C7160q1.m13681b(this.f9636b);
            if (b2 == 0) {
                do {
                    list.add(Integer.valueOf(this.f9635a.mo40412p()));
                    if (!this.f9635a.mo40406e()) {
                        B = this.f9635a.mo40399B();
                    } else {
                        return;
                    }
                } while (B == this.f9636b);
                this.f9638d = B;
            } else if (b2 == 2) {
                int d2 = this.f9635a.mo40405d() + this.f9635a.mo40400C();
                do {
                    list.add(Integer.valueOf(this.f9635a.mo40412p()));
                } while (this.f9635a.mo40405d() < d2);
                m13270U(d2);
            } else {
                throw InvalidProtocolBufferException.m12755e();
            }
        }
    }

    /* renamed from: t */
    public int mo40264t() {
        m13271V(0);
        return this.f9635a.mo40412p();
    }

    /* renamed from: u */
    public void mo40265u(List<Integer> list) {
        int B;
        int B2;
        if (list instanceof C7194y) {
            C7194y yVar = (C7194y) list;
            int b = C7160q1.m13681b(this.f9636b);
            if (b == 2) {
                int C = this.f9635a.mo40400C();
                m13272W(C);
                int d = this.f9635a.mo40405d() + C;
                do {
                    yVar.mo40719k(this.f9635a.mo40413q());
                } while (this.f9635a.mo40405d() < d);
            } else if (b == 5) {
                do {
                    yVar.mo40719k(this.f9635a.mo40413q());
                    if (!this.f9635a.mo40406e()) {
                        B2 = this.f9635a.mo40399B();
                    } else {
                        return;
                    }
                } while (B2 == this.f9636b);
                this.f9638d = B2;
            } else {
                throw InvalidProtocolBufferException.m12755e();
            }
        } else {
            int b2 = C7160q1.m13681b(this.f9636b);
            if (b2 == 2) {
                int C2 = this.f9635a.mo40400C();
                m13272W(C2);
                int d2 = this.f9635a.mo40405d() + C2;
                do {
                    list.add(Integer.valueOf(this.f9635a.mo40413q()));
                } while (this.f9635a.mo40405d() < d2);
            } else if (b2 == 5) {
                do {
                    list.add(Integer.valueOf(this.f9635a.mo40413q()));
                    if (!this.f9635a.mo40406e()) {
                        B = this.f9635a.mo40399B();
                    } else {
                        return;
                    }
                } while (B == this.f9636b);
                this.f9638d = B;
            } else {
                throw InvalidProtocolBufferException.m12755e();
            }
        }
    }

    /* renamed from: v */
    public int mo40266v() {
        m13271V(0);
        return this.f9635a.mo40420x();
    }

    /* renamed from: w */
    public long mo40267w() {
        m13271V(0);
        return this.f9635a.mo40421y();
    }

    /* renamed from: x */
    public void mo40268x(List<Boolean> list) {
        int B;
        int B2;
        if (list instanceof C7077f) {
            C7077f fVar = (C7077f) list;
            int b = C7160q1.m13681b(this.f9636b);
            if (b == 0) {
                do {
                    fVar.mo40291q(this.f9635a.mo40409m());
                    if (!this.f9635a.mo40406e()) {
                        B2 = this.f9635a.mo40399B();
                    } else {
                        return;
                    }
                } while (B2 == this.f9636b);
                this.f9638d = B2;
            } else if (b == 2) {
                int d = this.f9635a.mo40405d() + this.f9635a.mo40400C();
                do {
                    fVar.mo40291q(this.f9635a.mo40409m());
                } while (this.f9635a.mo40405d() < d);
                m13270U(d);
            } else {
                throw InvalidProtocolBufferException.m12755e();
            }
        } else {
            int b2 = C7160q1.m13681b(this.f9636b);
            if (b2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f9635a.mo40409m()));
                    if (!this.f9635a.mo40406e()) {
                        B = this.f9635a.mo40399B();
                    } else {
                        return;
                    }
                } while (B == this.f9636b);
                this.f9638d = B;
            } else if (b2 == 2) {
                int d2 = this.f9635a.mo40405d() + this.f9635a.mo40400C();
                do {
                    list.add(Boolean.valueOf(this.f9635a.mo40409m()));
                } while (this.f9635a.mo40405d() < d2);
                m13270U(d2);
            } else {
                throw InvalidProtocolBufferException.m12755e();
            }
        }
    }

    /* renamed from: y */
    public String mo40269y() {
        m13271V(2);
        return this.f9635a.mo40422z();
    }

    /* renamed from: z */
    public <T> T mo40270z(Class<T> cls, C7139o oVar) {
        m13271V(3);
        return m13268R(C7059a1.m12782a().mo40162d(cls), oVar);
    }
}
