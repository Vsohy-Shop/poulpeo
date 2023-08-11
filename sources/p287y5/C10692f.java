package p287y5;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p037b6.C2901e0;
import p037b6.C2924q;

/* renamed from: y5.f */
public final class C10692f implements C2901e0<Executor> {
    /* renamed from: b */
    public static Executor m22721b() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(C10690d.f16276b);
        C2924q.m2392g(newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo23536a() {
        return m22721b();
    }
}
