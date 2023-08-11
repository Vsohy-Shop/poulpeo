package p200q4;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: q4.k0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
final class C9237k0 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ LifecycleCallback f13578b;

    /* renamed from: c */
    final /* synthetic */ String f13579c;

    /* renamed from: d */
    final /* synthetic */ C9239l0 f13580d;

    C9237k0(C9239l0 l0Var, LifecycleCallback lifecycleCallback, String str) {
        this.f13580d = l0Var;
        this.f13578b = lifecycleCallback;
        this.f13579c = str;
    }

    public final void run() {
        Bundle bundle;
        C9239l0 l0Var = this.f13580d;
        if (l0Var.f13583c > 0) {
            LifecycleCallback lifecycleCallback = this.f13578b;
            if (l0Var.f13584d != null) {
                bundle = l0Var.f13584d.getBundle(this.f13579c);
            } else {
                bundle = null;
            }
            lifecycleCallback.mo32449f(bundle);
        }
        if (this.f13580d.f13583c >= 2) {
            this.f13578b.mo32453j();
        }
        if (this.f13580d.f13583c >= 3) {
            this.f13578b.mo32451h();
        }
        if (this.f13580d.f13583c >= 4) {
            this.f13578b.mo32454k();
        }
        if (this.f13580d.f13583c >= 5) {
            this.f13578b.mo32450g();
        }
    }
}
