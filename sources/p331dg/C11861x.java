package p331dg;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12079g;
import p466yf.C13943d1;
import p466yf.C13971h0;
import p466yf.C13988j2;
import p466yf.C14002n;
import p466yf.C14035u0;

@SourceDebugExtension({"SMAP\nMainDispatchers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MissingMainCoroutineDispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
/* renamed from: dg.x */
/* compiled from: MainDispatchers.kt */
final class C11861x extends C13988j2 implements C14035u0 {

    /* renamed from: b */
    private final Throwable f18527b;

    /* renamed from: c */
    private final String f18528c;

    public C11861x(Throwable th, String str) {
        this.f18527b = th;
        this.f18528c = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (r1 == null) goto L_0x0025;
     */
    /* renamed from: w0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Void m25579w0() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.f18527b
            if (r0 == 0) goto L_0x0036
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.f18528c
            if (r1 == 0) goto L_0x0025
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L_0x0027
        L_0x0025:
            java.lang.String r1 = ""
        L_0x0027:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.f18527b
            r1.<init>(r0, r2)
            throw r1
        L_0x0036:
            p331dg.C11860w.m25577d()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p331dg.C11861x.m25579w0():java.lang.Void");
    }

    /* renamed from: c */
    public C13943d1 mo49021c(long j, Runnable runnable, C12079g gVar) {
        m25579w0();
        throw new KotlinNothingValueException();
    }

    public boolean isDispatchNeeded(C12079g gVar) {
        m25579w0();
        throw new KotlinNothingValueException();
    }

    public C13971h0 limitedParallelism(int i) {
        m25579w0();
        throw new KotlinNothingValueException();
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        if (this.f18527b != null) {
            str = ", cause=" + this.f18527b;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: v0 */
    public Void dispatch(C12079g gVar, Runnable runnable) {
        m25579w0();
        throw new KotlinNothingValueException();
    }

    /* renamed from: x0 */
    public Void mo49020b(long j, C14002n<? super C11921v> nVar) {
        m25579w0();
        throw new KotlinNothingValueException();
    }

    /* renamed from: t0 */
    public C13988j2 mo49059t0() {
        return this;
    }
}
