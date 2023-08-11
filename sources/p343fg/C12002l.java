package p343fg;

import java.util.concurrent.TimeUnit;
import p331dg.C11830h0;

/* renamed from: fg.l */
/* compiled from: Tasks.kt */
public final class C12002l {

    /* renamed from: a */
    public static final String f18754a = C11830h0.m25464e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* renamed from: b */
    public static final long f18755b = C11834j0.m25490f("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, (Object) null);

    /* renamed from: c */
    public static final int f18756c = C11834j0.m25489e("kotlinx.coroutines.scheduler.core.pool.size", C13537l.m30877d(C11830h0.m25460a(), 2), 1, 0, 8, (Object) null);

    /* renamed from: d */
    public static final int f18757d = C11834j0.m25489e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, (Object) null);

    /* renamed from: e */
    public static final long f18758e = TimeUnit.SECONDS.toNanos(C11834j0.m25490f("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, (Object) null));

    /* renamed from: f */
    public static C11997g f18759f = C11995e.f18744a;

    /* renamed from: g */
    public static final C11999i f18760g = new C12000j(0);

    /* renamed from: h */
    public static final C11999i f18761h = new C12000j(1);
}
