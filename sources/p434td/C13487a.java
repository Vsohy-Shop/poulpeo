package p434td;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p360id.C12139g;

@StabilityInferred(parameters = 0)
/* renamed from: td.a */
/* compiled from: FloatingButtonHelper.kt */
public final class C13487a {

    /* renamed from: c */
    public static final C13488a f21658c = new C13488a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f21659d = 8;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final View f21660a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f21661b;

    /* renamed from: td.a$a */
    /* compiled from: FloatingButtonHelper.kt */
    public static final class C13488a {
        private C13488a() {
        }

        public /* synthetic */ C13488a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: td.a$b */
    /* compiled from: FloatingButtonHelper.kt */
    public static final class C13489b extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f21662a;

        /* renamed from: b */
        final /* synthetic */ C13487a f21663b;

        C13489b(C13487a aVar) {
            this.f21663b = aVar;
        }

        public void onAnimationCancel(Animator animator) {
            C12775o.m28639i(animator, "animation");
            this.f21662a = true;
        }

        public void onAnimationEnd(Animator animator) {
            C12775o.m28639i(animator, "animation");
            this.f21663b.f21661b = 0;
            if (!this.f21662a) {
                C12139g.m26475d(this.f21663b.f21660a, false, 0, 2, (Object) null);
            }
        }

        public void onAnimationStart(Animator animator) {
            C12775o.m28639i(animator, "animation");
            C12139g.m26475d(this.f21663b.f21660a, true, 0, 2, (Object) null);
            this.f21662a = false;
        }
    }

    /* renamed from: td.a$c */
    /* compiled from: FloatingButtonHelper.kt */
    public static final class C13490c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C13487a f21664a;

        C13490c(C13487a aVar) {
            this.f21664a = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            C12775o.m28639i(animator, "animation");
            this.f21664a.f21661b = 0;
        }

        public void onAnimationStart(Animator animator) {
            C12775o.m28639i(animator, "animation");
            C12139g.m26475d(this.f21664a.f21660a, true, 0, 2, (Object) null);
        }
    }

    public C13487a(View view) {
        C12775o.m28639i(view, "button");
        this.f21660a = view;
    }

    /* renamed from: d */
    private final boolean m30732d() {
        if (C12139g.m26473b(this.f21660a)) {
            if (this.f21661b == 1) {
                return true;
            }
            return false;
        } else if (this.f21661b != 2) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: e */
    private final boolean m30733e() {
        if (C12139g.m26472a(this.f21660a)) {
            if (this.f21661b == 2) {
                return true;
            }
            return false;
        } else if (this.f21661b != 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: f */
    private final boolean m30734f() {
        if (!ViewCompat.isLaidOut(this.f21660a) || this.f21660a.isInEditMode()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final void mo53092c() {
        if (!m30732d()) {
            this.f21660a.animate().cancel();
            if (m30734f()) {
                this.f21661b = 1;
                this.f21660a.animate().scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setDuration(200).setInterpolator(new LinearOutSlowInInterpolator()).setListener(new C13489b(this));
                return;
            }
            C12139g.m26475d(this.f21660a, false, 0, 2, (Object) null);
        }
    }

    /* renamed from: g */
    public final void mo53093g() {
        if (!m30733e()) {
            this.f21660a.animate().cancel();
            if (m30734f()) {
                this.f21661b = 2;
                if (C12139g.m26472a(this.f21660a)) {
                    this.f21660a.setAlpha(0.0f);
                    this.f21660a.setScaleY(0.0f);
                    this.f21660a.setScaleX(0.0f);
                }
                this.f21660a.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(200).setInterpolator(new LinearOutSlowInInterpolator()).setListener(new C13490c(this));
                return;
            }
            C12139g.m26475d(this.f21660a, true, 0, 2, (Object) null);
            this.f21660a.setAlpha(1.0f);
            this.f21660a.setScaleY(1.0f);
            this.f21660a.setScaleX(1.0f);
        }
    }
}
