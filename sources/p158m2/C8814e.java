package p158m2;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p071e2.C7452d;
import p118i2.C8093b;
import p158m2.C8817f;
import p251v2.C9925a;

/* renamed from: m2.e */
/* compiled from: ViewObserver.kt */
public final class C8814e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: e */
    private static final Map<Integer, C8814e> f12779e = new HashMap();

    /* renamed from: f */
    public static final C8815a f12780f = new C8815a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final WeakReference<Activity> f12781b;

    /* renamed from: c */
    private final Handler f12782c;

    /* renamed from: d */
    private final AtomicBoolean f12783d;

    /* renamed from: m2.e$a */
    /* compiled from: ViewObserver.kt */
    public static final class C8815a {
        private C8815a() {
        }

        public /* synthetic */ C8815a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo42953a(Activity activity) {
            C12775o.m28639i(activity, "activity");
            int hashCode = activity.hashCode();
            Map b = C8814e.m17862b();
            Integer valueOf = Integer.valueOf(hashCode);
            Object obj = b.get(valueOf);
            if (obj == null) {
                obj = new C8814e(activity, (DefaultConstructorMarker) null);
                b.put(valueOf, obj);
            }
            C8814e.m17863c((C8814e) obj);
        }

        /* renamed from: b */
        public final void mo42954b(Activity activity) {
            C12775o.m28639i(activity, "activity");
            int hashCode = activity.hashCode();
            C8814e eVar = (C8814e) C8814e.m17862b().get(Integer.valueOf(hashCode));
            if (eVar != null) {
                C8814e.m17862b().remove(Integer.valueOf(hashCode));
                C8814e.m17864d(eVar);
            }
        }
    }

    /* renamed from: m2.e$b */
    /* compiled from: ViewObserver.kt */
    static final class C8816b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C8814e f12784b;

        C8816b(C8814e eVar) {
            this.f12784b = eVar;
        }

        public final void run() {
            boolean z;
            if (!C9925a.m20734d(this)) {
                try {
                    if (!C9925a.m20734d(this)) {
                        View e = C8093b.m15923e((Activity) C8814e.m17861a(this.f12784b).get());
                        Activity activity = (Activity) C8814e.m17861a(this.f12784b).get();
                        if (e == null) {
                            return;
                        }
                        if (activity != null) {
                            for (View next : C8811c.m17848a(e)) {
                                if (!C7452d.m14593g(next)) {
                                    String d = C8811c.m17851d(next);
                                    if (d.length() > 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z && d.length() <= 300) {
                                        C8817f.C8818a aVar = C8817f.f12786g;
                                        String localClassName = activity.getLocalClassName();
                                        C12775o.m28638h(localClassName, "activity.localClassName");
                                        aVar.mo42957c(next, e, localClassName);
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception unused) {
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    private C8814e(Activity activity) {
        this.f12781b = new WeakReference<>(activity);
        this.f12782c = new Handler(Looper.getMainLooper());
        this.f12783d = new AtomicBoolean(false);
    }

    /* renamed from: a */
    public static final /* synthetic */ WeakReference m17861a(C8814e eVar) {
        Class<C8814e> cls = C8814e.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return eVar.f12781b;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ Map m17862b() {
        Class<C8814e> cls = C8814e.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return f12779e;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ void m17863c(C8814e eVar) {
        Class<C8814e> cls = C8814e.class;
        if (!C9925a.m20734d(cls)) {
            try {
                eVar.m17866f();
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ void m17864d(C8814e eVar) {
        Class<C8814e> cls = C8814e.class;
        if (!C9925a.m20734d(cls)) {
            try {
                eVar.m17867g();
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: e */
    private final void m17865e() {
        if (!C9925a.m20734d(this)) {
            try {
                C8816b bVar = new C8816b(this);
                Thread currentThread = Thread.currentThread();
                Looper mainLooper = Looper.getMainLooper();
                C12775o.m28638h(mainLooper, "Looper.getMainLooper()");
                if (currentThread == mainLooper.getThread()) {
                    bVar.run();
                } else {
                    this.f12782c.post(bVar);
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: f */
    private final void m17866f() {
        View e;
        if (!C9925a.m20734d(this)) {
            try {
                if (!this.f12783d.getAndSet(true) && (e = C8093b.m15923e(this.f12781b.get())) != null) {
                    ViewTreeObserver viewTreeObserver = e.getViewTreeObserver();
                    C12775o.m28638h(viewTreeObserver, "observer");
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalLayoutListener(this);
                        m17865e();
                    }
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: g */
    private final void m17867g() {
        View e;
        if (!C9925a.m20734d(this)) {
            try {
                if (this.f12783d.getAndSet(false) && (e = C8093b.m15923e(this.f12781b.get())) != null) {
                    ViewTreeObserver viewTreeObserver = e.getViewTreeObserver();
                    C12775o.m28638h(viewTreeObserver, "observer");
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeOnGlobalLayoutListener(this);
                    }
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    public void onGlobalLayout() {
        if (!C9925a.m20734d(this)) {
            try {
                m17865e();
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    public /* synthetic */ C8814e(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }
}
