package p051c8;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import p319cf.C11057a;
import p341fe.C11944a;
import p376ke.C12657a;

/* renamed from: c8.k0 */
/* compiled from: ForegroundNotifier */
public class C3954k0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b */
    private final Handler f3095b = new Handler();

    /* renamed from: c */
    private boolean f3096c = false;

    /* renamed from: d */
    private boolean f3097d = true;

    /* renamed from: e */
    private Runnable f3098e;

    /* renamed from: f */
    private final C11057a<String> f3099f = C11057a.m23850w();

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m4593c() {
        boolean z;
        boolean z2 = this.f3096c;
        if ((!z2 || !this.f3097d) && z2) {
            z = true;
        } else {
            z = false;
        }
        this.f3096c = z;
    }

    /* renamed from: b */
    public C12657a<String> mo29981b() {
        return this.f3099f.mo49261u(C11944a.BUFFER).mo49194C();
    }

    public void onActivityPaused(Activity activity) {
        this.f3097d = true;
        Runnable runnable = this.f3098e;
        if (runnable != null) {
            this.f3095b.removeCallbacks(runnable);
        }
        Handler handler = this.f3095b;
        C3949j0 j0Var = new C3949j0(this);
        this.f3098e = j0Var;
        handler.postDelayed(j0Var, 1000);
    }

    public void onActivityResumed(Activity activity) {
        this.f3097d = false;
        boolean z = !this.f3096c;
        this.f3096c = true;
        Runnable runnable = this.f3098e;
        if (runnable != null) {
            this.f3095b.removeCallbacks(runnable);
        }
        if (z) {
            C3961l2.m4604c("went foreground");
            this.f3099f.mo46141d("ON_FOREGROUND");
        }
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
