package p051c8;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p101g8.C7796a;
import p101g8.C7817i;
import p223s7.C9565r;
import p223s7.C9566s;
import p223s7.C9567t;
import p223s7.C9570u;
import p223s7.C9571v;

/* renamed from: c8.s */
/* compiled from: DeveloperListenerManager */
public class C3996s {

    /* renamed from: e */
    public static C3996s f3168e = new C3996s();

    /* renamed from: f */
    private static BlockingQueue<Runnable> f3169f = new LinkedBlockingQueue();

    /* renamed from: g */
    private static final ThreadPoolExecutor f3170g;

    /* renamed from: a */
    private Map<C9565r, C3997a> f3171a = new HashMap();

    /* renamed from: b */
    private Map<C9566s, C3998b> f3172b = new HashMap();

    /* renamed from: c */
    private Map<C9570u, C3999c> f3173c = new HashMap();

    /* renamed from: d */
    private Map<C9571v, C4002f> f3174d = new HashMap();

    /* renamed from: c8.s$a */
    /* compiled from: DeveloperListenerManager */
    private static class C3997a extends C4000d<C9565r> {
        /* renamed from: b */
        public C9565r mo30025b() {
            return null;
        }
    }

    /* renamed from: c8.s$b */
    /* compiled from: DeveloperListenerManager */
    private static class C3998b extends C4000d<C9566s> {
        /* renamed from: b */
        public C9566s mo30026b() {
            return null;
        }
    }

    /* renamed from: c8.s$c */
    /* compiled from: DeveloperListenerManager */
    private static class C3999c extends C4000d<C9570u> {
        /* renamed from: b */
        public C9570u mo30027b() {
            return null;
        }
    }

    /* renamed from: c8.s$d */
    /* compiled from: DeveloperListenerManager */
    private static abstract class C4000d<T> {

        /* renamed from: a */
        private final Executor f3175a;

        /* renamed from: a */
        public Executor mo30028a(Executor executor) {
            Executor executor2 = this.f3175a;
            if (executor2 == null) {
                return executor;
            }
            return executor2;
        }
    }

    /* renamed from: c8.s$e */
    /* compiled from: DeveloperListenerManager */
    static class C4001e implements ThreadFactory {

        /* renamed from: b */
        private final AtomicInteger f3176b = new AtomicInteger(1);

        /* renamed from: c */
        private final String f3177c;

        C4001e(@NonNull String str) {
            this.f3177c = str;
        }

        public Thread newThread(@NonNull Runnable runnable) {
            Thread thread = new Thread(runnable, "FIAM-" + this.f3177c + this.f3176b.getAndIncrement());
            thread.setDaemon(false);
            thread.setPriority(9);
            return thread;
        }
    }

    /* renamed from: c8.s$f */
    /* compiled from: DeveloperListenerManager */
    private static class C4002f extends C4000d<C9571v> {
        /* renamed from: b */
        public C9571v mo30030b() {
            return null;
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 15, TimeUnit.SECONDS, f3169f, new C4001e("EventListeners-"));
        f3170g = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ void m4693g(C3999c cVar, C7817i iVar, C9567t.C9569b bVar) {
        cVar.mo30027b();
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ void m4694h(C4002f fVar, C7817i iVar) {
        fVar.mo30030b();
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ void m4695i(C3997a aVar, C7817i iVar, C7796a aVar2) {
        aVar.mo30025b();
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ void m4696j(C3998b bVar, C7817i iVar) {
        bVar.mo30026b();
        throw null;
    }

    /* renamed from: e */
    public void mo30020e(C7817i iVar, C9567t.C9569b bVar) {
        for (C3999c next : this.f3173c.values()) {
            next.mo30028a(f3170g).execute(new C3973o(next, iVar, bVar));
        }
    }

    /* renamed from: f */
    public void mo30021f(C7817i iVar) {
        for (C4002f next : this.f3174d.values()) {
            next.mo30028a(f3170g).execute(new C3978p(next, iVar));
        }
    }

    /* renamed from: k */
    public void mo30022k(C7817i iVar, C7796a aVar) {
        for (C3997a next : this.f3171a.values()) {
            next.mo30028a(f3170g).execute(new C3990r(next, iVar, aVar));
        }
    }

    /* renamed from: l */
    public void mo30023l(C7817i iVar) {
        for (C3998b next : this.f3172b.values()) {
            next.mo30028a(f3170g).execute(new C3983q(next, iVar));
        }
    }

    /* renamed from: m */
    public void mo30024m() {
        this.f3171a.clear();
        this.f3174d.clear();
        this.f3173c.clear();
    }
}
