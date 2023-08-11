package p200q4;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: q4.i0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
final class C9233i0 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ LifecycleCallback f13571b;

    /* renamed from: c */
    final /* synthetic */ String f13572c;

    /* renamed from: d */
    final /* synthetic */ C9235j0 f13573d;

    C9233i0(C9235j0 j0Var, LifecycleCallback lifecycleCallback, String str) {
        this.f13573d = j0Var;
        this.f13571b = lifecycleCallback;
        this.f13572c = str;
    }

    public final void run() {
        Bundle bundle;
        C9235j0 j0Var = this.f13573d;
        if (j0Var.f13576c > 0) {
            LifecycleCallback lifecycleCallback = this.f13571b;
            if (j0Var.f13577d != null) {
                bundle = j0Var.f13577d.getBundle(this.f13572c);
            } else {
                bundle = null;
            }
            lifecycleCallback.mo32449f(bundle);
        }
        if (this.f13573d.f13576c >= 2) {
            this.f13571b.mo32453j();
        }
        if (this.f13573d.f13576c >= 3) {
            this.f13571b.mo32451h();
        }
        if (this.f13573d.f13576c >= 4) {
            this.f13571b.mo32454k();
        }
        if (this.f13573d.f13576c >= 5) {
            this.f13571b.mo32450g();
        }
    }
}
