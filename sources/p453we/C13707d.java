package p453we;

import java.util.concurrent.ThreadFactory;
import p341fe.C11962r;

/* renamed from: we.d */
/* compiled from: NewThreadScheduler */
public final class C13707d extends C11962r {

    /* renamed from: c */
    private static final C13709f f22112c = new C13709f("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* renamed from: b */
    final ThreadFactory f22113b;

    public C13707d() {
        this(f22112c);
    }

    /* renamed from: a */
    public C11962r.C11964b mo49262a() {
        return new C13708e(this.f22113b);
    }

    public C13707d(ThreadFactory threadFactory) {
        this.f22113b = threadFactory;
    }
}
