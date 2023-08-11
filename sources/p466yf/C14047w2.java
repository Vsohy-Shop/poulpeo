package p466yf;

import kotlin.jvm.internal.SourceDebugExtension;
import p331dg.C11828g0;
import p331dg.C11841l0;

@SourceDebugExtension({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/ThreadLocalEventLoop\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,543:1\n1#2:544\n*E\n"})
/* renamed from: yf.w2 */
/* compiled from: EventLoop.common.kt */
public final class C14047w2 {

    /* renamed from: a */
    public static final C14047w2 f22961a = new C14047w2();

    /* renamed from: b */
    private static final ThreadLocal<C13974h1> f22962b = C11841l0.m25504a(new C11828g0("ThreadLocalEventLoop"));

    private C14047w2() {
    }

    /* renamed from: a */
    public final C13974h1 mo53811a() {
        return f22962b.get();
    }

    /* renamed from: b */
    public final C13974h1 mo53812b() {
        ThreadLocal<C13974h1> threadLocal = f22962b;
        C13974h1 h1Var = threadLocal.get();
        if (h1Var != null) {
            return h1Var;
        }
        C13974h1 a = C13992k1.m32433a();
        threadLocal.set(a);
        return a;
    }

    /* renamed from: c */
    public final void mo53813c() {
        f22962b.set((Object) null);
    }

    /* renamed from: d */
    public final void mo53814d(C13974h1 h1Var) {
        f22962b.set(h1Var);
    }
}
