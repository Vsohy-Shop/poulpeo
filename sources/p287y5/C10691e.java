package p287y5;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p037b6.C2901e0;
import p037b6.C2924q;

/* renamed from: y5.e */
public final class C10691e implements C2901e0<Executor> {
    /* renamed from: b */
    public static Executor m22719b() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(C10689c.f16275b);
        C2924q.m2392g(newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo23536a() {
        return m22719b();
    }
}
