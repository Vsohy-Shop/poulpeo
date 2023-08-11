package coil.target;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import p226t.C9588b;
import p248v.C9912d;

/* compiled from: GenericViewTarget.kt */
public abstract class GenericViewTarget<T extends View> implements C9588b<T>, C9912d, DefaultLifecycleObserver {

    /* renamed from: b */
    private boolean f3263b;

    /* renamed from: b */
    public void mo30071b(Drawable drawable) {
        mo30077h(drawable);
    }

    /* renamed from: c */
    public void mo30072c(Drawable drawable) {
        mo30077h(drawable);
    }

    /* renamed from: d */
    public void mo30073d(Drawable drawable) {
        mo30077h(drawable);
    }

    /* renamed from: e */
    public abstract Drawable mo30074e();

    /* renamed from: f */
    public abstract void mo30075f(Drawable drawable);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo30076g() {
        Animatable animatable;
        Drawable e = mo30074e();
        if (e instanceof Animatable) {
            animatable = (Animatable) e;
        } else {
            animatable = null;
        }
        if (animatable != null) {
            if (this.f3263b) {
                animatable.start();
            } else {
                animatable.stop();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo30077h(Drawable drawable) {
        Animatable animatable;
        Drawable e = mo30074e();
        if (e instanceof Animatable) {
            animatable = (Animatable) e;
        } else {
            animatable = null;
        }
        if (animatable != null) {
            animatable.stop();
        }
        mo30075f(drawable);
        mo30076g();
    }

    public void onStart(LifecycleOwner lifecycleOwner) {
        this.f3263b = true;
        mo30076g();
    }

    public void onStop(LifecycleOwner lifecycleOwner) {
        this.f3263b = false;
        mo30076g();
    }
}
