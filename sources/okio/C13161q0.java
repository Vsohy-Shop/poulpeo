package okio;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nPeekSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PeekSource.kt\nokio/PeekSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
/* renamed from: okio.q0 */
/* compiled from: PeekSource.kt */
public final class C13161q0 implements C13179y0 {

    /* renamed from: b */
    private final C13130e f20952b;

    /* renamed from: c */
    private final C13121c f20953c;

    /* renamed from: d */
    private C13168t0 f20954d;

    /* renamed from: e */
    private int f20955e;

    /* renamed from: f */
    private boolean f20956f;

    /* renamed from: g */
    private long f20957g;

    public C13161q0(C13130e eVar) {
        int i;
        C12775o.m28639i(eVar, "upstream");
        this.f20952b = eVar;
        C13121c f = eVar.mo52524f();
        this.f20953c = f;
        C13168t0 t0Var = f.f20888b;
        this.f20954d = t0Var;
        if (t0Var != null) {
            i = t0Var.f20968b;
        } else {
            i = -1;
        }
        this.f20955e = i;
    }

    public void close() {
        this.f20956f = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r5 == r6.f20968b) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long read(okio.C13121c r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.C12775o.m28639i(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 < 0) goto L_0x000f
            r5 = r4
            goto L_0x0010
        L_0x000f:
            r5 = r3
        L_0x0010:
            if (r5 == 0) goto L_0x0087
            boolean r5 = r8.f20956f
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x007b
            okio.t0 r5 = r8.f20954d
            if (r5 == 0) goto L_0x002a
            okio.c r6 = r8.f20953c
            okio.t0 r6 = r6.f20888b
            if (r5 != r6) goto L_0x002b
            int r5 = r8.f20955e
            kotlin.jvm.internal.C12775o.m28636f(r6)
            int r6 = r6.f20968b
            if (r5 != r6) goto L_0x002b
        L_0x002a:
            r3 = r4
        L_0x002b:
            if (r3 == 0) goto L_0x006f
            if (r2 != 0) goto L_0x0030
            return r0
        L_0x0030:
            okio.e r0 = r8.f20952b
            long r1 = r8.f20957g
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.mo52526h(r1)
            if (r0 != 0) goto L_0x0040
            r9 = -1
            return r9
        L_0x0040:
            okio.t0 r0 = r8.f20954d
            if (r0 != 0) goto L_0x0053
            okio.c r0 = r8.f20953c
            okio.t0 r0 = r0.f20888b
            if (r0 == 0) goto L_0x0053
            r8.f20954d = r0
            kotlin.jvm.internal.C12775o.m28636f(r0)
            int r0 = r0.f20968b
            r8.f20955e = r0
        L_0x0053:
            okio.c r0 = r8.f20953c
            long r0 = r0.size()
            long r2 = r8.f20957g
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            okio.c r2 = r8.f20953c
            long r4 = r8.f20957g
            r3 = r9
            r6 = r10
            r2.mo52512Y(r3, r4, r6)
            long r0 = r8.f20957g
            long r0 = r0 + r10
            r8.f20957g = r0
            return r10
        L_0x006f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x007b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0087:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C13161q0.read(okio.c, long):long");
    }

    public C13181z0 timeout() {
        return this.f20952b.timeout();
    }
}
