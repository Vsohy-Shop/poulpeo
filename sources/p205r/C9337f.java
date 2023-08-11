package p205r;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

/* renamed from: r.f */
/* compiled from: GlobalLifecycle.kt */
public final class C9337f extends Lifecycle {

    /* renamed from: a */
    public static final C9337f f13791a = new C9337f();

    /* renamed from: b */
    private static final C9338a f13792b = new C9338a();

    /* renamed from: r.f$a */
    /* compiled from: GlobalLifecycle.kt */
    public static final class C9338a implements LifecycleOwner {
        C9338a() {
        }

        /* renamed from: a */
        public C9337f getLifecycle() {
            return C9337f.f13791a;
        }
    }

    private C9337f() {
    }

    public void addObserver(LifecycleObserver lifecycleObserver) {
        if (lifecycleObserver instanceof DefaultLifecycleObserver) {
            DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) lifecycleObserver;
            C9338a aVar = f13792b;
            defaultLifecycleObserver.onCreate(aVar);
            defaultLifecycleObserver.onStart(aVar);
            defaultLifecycleObserver.onResume(aVar);
            return;
        }
        throw new IllegalArgumentException((lifecycleObserver + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
    }

    public Lifecycle.State getCurrentState() {
        return Lifecycle.State.RESUMED;
    }

    public String toString() {
        return "coil.request.GlobalLifecycle";
    }

    public void removeObserver(LifecycleObserver lifecycleObserver) {
    }
}
