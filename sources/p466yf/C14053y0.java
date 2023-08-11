package p466yf;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p343fg.C11998h;
import p355hf.C12074d;

@SourceDebugExtension({"SMAP\nDispatchedTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n+ 4 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 6 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n*L\n1#1,220:1\n1#2:221\n107#3,10:222\n118#3,2:236\n218#4:232\n219#4:235\n61#5,2:233\n75#6:238\n*S KotlinDebug\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTask\n*L\n88#1:222,10\n88#1:236,2\n101#1:232\n101#1:235\n101#1:233,2\n140#1:238\n*E\n"})
/* renamed from: yf.y0 */
/* compiled from: DispatchedTask.kt */
public abstract class C14053y0<T> extends C11998h {

    /* renamed from: d */
    public int f22969d;

    public C14053y0(int i) {
        this.f22969d = i;
    }

    /* renamed from: e */
    public abstract C12074d<T> mo48997e();

    /* renamed from: g */
    public Throwable mo53791g(Object obj) {
        C13932b0 b0Var;
        if (obj instanceof C13932b0) {
            b0Var = (C13932b0) obj;
        } else {
            b0Var = null;
        }
        if (b0Var != null) {
            return b0Var.f22850a;
        }
        return null;
    }

    /* renamed from: l */
    public final void mo53819l(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                C11894b.m25683a(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            C12775o.m28636f(th);
            C13986j0.m32424a(mo48997e().getContext(), new C14011o0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
        }
    }

    /* renamed from: m */
    public abstract Object mo48998m();

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0086, code lost:
        if (r4.mo53684L0() != false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00af, code lost:
        if (r4.mo53684L0() != false) goto L_0x00b1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            fg.i r0 = r10.f18751c
            hf.d r1 = r10.mo48997e()     // Catch:{ all -> 0x00b5 }
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"
            kotlin.jvm.internal.C12775o.m28637g(r1, r2)     // Catch:{ all -> 0x00b5 }
            dg.i r1 = (p331dg.C11831i) r1     // Catch:{ all -> 0x00b5 }
            hf.d<T> r2 = r1.f18478f     // Catch:{ all -> 0x00b5 }
            java.lang.Object r1 = r1.f18480h     // Catch:{ all -> 0x00b5 }
            hf.g r3 = r2.getContext()     // Catch:{ all -> 0x00b5 }
            java.lang.Object r1 = p331dg.C11836k0.m25499c(r3, r1)     // Catch:{ all -> 0x00b5 }
            dg.g0 r4 = p331dg.C11836k0.f18485a     // Catch:{ all -> 0x00b5 }
            r5 = 0
            if (r1 == r4) goto L_0x0023
            yf.b3 r4 = p466yf.C13964g0.m32358g(r2, r3, r1)     // Catch:{ all -> 0x00b5 }
            goto L_0x0024
        L_0x0023:
            r4 = r5
        L_0x0024:
            hf.g r6 = r2.getContext()     // Catch:{ all -> 0x00a8 }
            java.lang.Object r7 = r10.mo48998m()     // Catch:{ all -> 0x00a8 }
            java.lang.Throwable r8 = r10.mo53791g(r7)     // Catch:{ all -> 0x00a8 }
            if (r8 != 0) goto L_0x0043
            int r9 = r10.f22969d     // Catch:{ all -> 0x00a8 }
            boolean r9 = p466yf.C14059z0.m32609b(r9)     // Catch:{ all -> 0x00a8 }
            if (r9 == 0) goto L_0x0043
            yf.y1$b r9 = p466yf.C14054y1.f22970b0     // Catch:{ all -> 0x00a8 }
            hf.g$b r6 = r6.get(r9)     // Catch:{ all -> 0x00a8 }
            yf.y1 r6 = (p466yf.C14054y1) r6     // Catch:{ all -> 0x00a8 }
            goto L_0x0044
        L_0x0043:
            r6 = r5
        L_0x0044:
            if (r6 == 0) goto L_0x0061
            boolean r9 = r6.mo45937a()     // Catch:{ all -> 0x00a8 }
            if (r9 != 0) goto L_0x0061
            java.util.concurrent.CancellationException r6 = r6.mo53700A()     // Catch:{ all -> 0x00a8 }
            r10.mo48996d(r7, r6)     // Catch:{ all -> 0x00a8 }
            ef.m$a r7 = p336ef.C11907m.f18600b     // Catch:{ all -> 0x00a8 }
            java.lang.Object r6 = p336ef.C11910n.m25700a(r6)     // Catch:{ all -> 0x00a8 }
            java.lang.Object r6 = p336ef.C11907m.m25696a(r6)     // Catch:{ all -> 0x00a8 }
            r2.resumeWith(r6)     // Catch:{ all -> 0x00a8 }
            goto L_0x007e
        L_0x0061:
            if (r8 == 0) goto L_0x0071
            ef.m$a r6 = p336ef.C11907m.f18600b     // Catch:{ all -> 0x00a8 }
            java.lang.Object r6 = p336ef.C11910n.m25700a(r8)     // Catch:{ all -> 0x00a8 }
            java.lang.Object r6 = p336ef.C11907m.m25696a(r6)     // Catch:{ all -> 0x00a8 }
            r2.resumeWith(r6)     // Catch:{ all -> 0x00a8 }
            goto L_0x007e
        L_0x0071:
            ef.m$a r6 = p336ef.C11907m.f18600b     // Catch:{ all -> 0x00a8 }
            java.lang.Object r6 = r10.mo53792k(r7)     // Catch:{ all -> 0x00a8 }
            java.lang.Object r6 = p336ef.C11907m.m25696a(r6)     // Catch:{ all -> 0x00a8 }
            r2.resumeWith(r6)     // Catch:{ all -> 0x00a8 }
        L_0x007e:
            ef.v r2 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x00a8 }
            if (r4 == 0) goto L_0x0088
            boolean r2 = r4.mo53684L0()     // Catch:{ all -> 0x00b5 }
            if (r2 == 0) goto L_0x008b
        L_0x0088:
            p331dg.C11836k0.m25497a(r3, r1)     // Catch:{ all -> 0x00b5 }
        L_0x008b:
            r0.mo49428a()     // Catch:{ all -> 0x0095 }
            ef.v r0 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x0095 }
            java.lang.Object r0 = p336ef.C11907m.m25696a(r0)     // Catch:{ all -> 0x0095 }
            goto L_0x00a0
        L_0x0095:
            r0 = move-exception
            ef.m$a r1 = p336ef.C11907m.f18600b
            java.lang.Object r0 = p336ef.C11910n.m25700a(r0)
            java.lang.Object r0 = p336ef.C11907m.m25696a(r0)
        L_0x00a0:
            java.lang.Throwable r0 = p336ef.C11907m.m25697b(r0)
            r10.mo53819l(r5, r0)
            goto L_0x00d4
        L_0x00a8:
            r2 = move-exception
            if (r4 == 0) goto L_0x00b1
            boolean r4 = r4.mo53684L0()     // Catch:{ all -> 0x00b5 }
            if (r4 == 0) goto L_0x00b4
        L_0x00b1:
            p331dg.C11836k0.m25497a(r3, r1)     // Catch:{ all -> 0x00b5 }
        L_0x00b4:
            throw r2     // Catch:{ all -> 0x00b5 }
        L_0x00b5:
            r1 = move-exception
            ef.m$a r2 = p336ef.C11907m.f18600b     // Catch:{ all -> 0x00c2 }
            r0.mo49428a()     // Catch:{ all -> 0x00c2 }
            ef.v r0 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x00c2 }
            java.lang.Object r0 = p336ef.C11907m.m25696a(r0)     // Catch:{ all -> 0x00c2 }
            goto L_0x00cd
        L_0x00c2:
            r0 = move-exception
            ef.m$a r2 = p336ef.C11907m.f18600b
            java.lang.Object r0 = p336ef.C11910n.m25700a(r0)
            java.lang.Object r0 = p336ef.C11907m.m25696a(r0)
        L_0x00cd:
            java.lang.Throwable r0 = p336ef.C11907m.m25697b(r0)
            r10.mo53819l(r1, r0)
        L_0x00d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p466yf.C14053y0.run():void");
    }

    /* renamed from: k */
    public <T> T mo53792k(Object obj) {
        return obj;
    }

    /* renamed from: d */
    public void mo48996d(Object obj, Throwable th) {
    }
}
