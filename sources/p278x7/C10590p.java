package p278x7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.annotation.Nullable;

/* renamed from: x7.p */
/* compiled from: SwipeDismissTouchListener */
public class C10590p implements View.OnTouchListener {

    /* renamed from: b */
    private int f16121b;

    /* renamed from: c */
    private int f16122c;

    /* renamed from: d */
    private int f16123d;

    /* renamed from: e */
    private long f16124e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public View f16125f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C10595e f16126g;

    /* renamed from: h */
    private int f16127h = 1;

    /* renamed from: i */
    private float f16128i;

    /* renamed from: j */
    private float f16129j;

    /* renamed from: k */
    private boolean f16130k;

    /* renamed from: l */
    private int f16131l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public Object f16132m;

    /* renamed from: n */
    private VelocityTracker f16133n;

    /* renamed from: o */
    private float f16134o;

    /* renamed from: x7.p$a */
    /* compiled from: SwipeDismissTouchListener */
    class C10591a extends AnimatorListenerAdapter {
        C10591a() {
        }

        public void onAnimationEnd(Animator animator) {
            C10590p.this.m22532g();
        }
    }

    /* renamed from: x7.p$b */
    /* compiled from: SwipeDismissTouchListener */
    class C10592b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ float f16136a;

        /* renamed from: b */
        final /* synthetic */ float f16137b;

        /* renamed from: c */
        final /* synthetic */ float f16138c;

        /* renamed from: d */
        final /* synthetic */ float f16139d;

        C10592b(float f, float f2, float f3, float f4) {
            this.f16136a = f;
            this.f16137b = f2;
            this.f16138c = f3;
            this.f16139d = f4;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = this.f16136a + (valueAnimator.getAnimatedFraction() * this.f16137b);
            float animatedFraction2 = this.f16138c + (valueAnimator.getAnimatedFraction() * this.f16139d);
            C10590p.this.mo45504i(animatedFraction);
            C10590p.this.mo45544h(animatedFraction2);
        }
    }

    /* renamed from: x7.p$c */
    /* compiled from: SwipeDismissTouchListener */
    class C10593c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup.LayoutParams f16141a;

        /* renamed from: b */
        final /* synthetic */ int f16142b;

        C10593c(ViewGroup.LayoutParams layoutParams, int i) {
            this.f16141a = layoutParams;
            this.f16142b = i;
        }

        public void onAnimationEnd(Animator animator) {
            C10590p.this.f16126g.mo45502b(C10590p.this.f16125f, C10590p.this.f16132m);
            C10590p.this.f16125f.setAlpha(1.0f);
            C10590p.this.f16125f.setTranslationX(0.0f);
            this.f16141a.height = this.f16142b;
            C10590p.this.f16125f.setLayoutParams(this.f16141a);
        }
    }

    /* renamed from: x7.p$d */
    /* compiled from: SwipeDismissTouchListener */
    class C10594d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup.LayoutParams f16144a;

        C10594d(ViewGroup.LayoutParams layoutParams) {
            this.f16144a = layoutParams;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f16144a.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            C10590p.this.f16125f.setLayoutParams(this.f16144a);
        }
    }

    /* renamed from: x7.p$e */
    /* compiled from: SwipeDismissTouchListener */
    public interface C10595e {
        /* renamed from: a */
        boolean mo45501a(Object obj);

        /* renamed from: b */
        void mo45502b(View view, Object obj);
    }

    public C10590p(View view, Object obj, C10595e eVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        this.f16121b = viewConfiguration.getScaledTouchSlop();
        this.f16122c = viewConfiguration.getScaledMinimumFlingVelocity() * 16;
        this.f16123d = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f16124e = (long) view.getContext().getResources().getInteger(17694720);
        this.f16125f = view;
        this.f16132m = obj;
        this.f16126g = eVar;
    }

    /* renamed from: e */
    private void m22531e(float f, float f2, @Nullable AnimatorListenerAdapter animatorListenerAdapter) {
        float f3 = mo45503f();
        float f4 = f - f3;
        float alpha = this.f16125f.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(this.f16124e);
        ofFloat.addUpdateListener(new C10592b(f3, f4, alpha, f2 - alpha));
        if (animatorListenerAdapter != null) {
            ofFloat.addListener(animatorListenerAdapter);
        }
        ofFloat.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m22532g() {
        ViewGroup.LayoutParams layoutParams = this.f16125f.getLayoutParams();
        int height = this.f16125f.getHeight();
        ValueAnimator duration = ValueAnimator.ofInt(new int[]{height, 1}).setDuration(this.f16124e);
        duration.addListener(new C10593c(layoutParams, height));
        duration.addUpdateListener(new C10594d(layoutParams));
        duration.start();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public float mo45503f() {
        return this.f16125f.getTranslationX();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo45544h(float f) {
        this.f16125f.setAlpha(f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo45504i(float f) {
        this.f16125f.setTranslationX(f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo45545j() {
        m22531e(0.0f, 1.0f, (AnimatorListenerAdapter) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo45546k(boolean z) {
        int i;
        if (z) {
            i = this.f16127h;
        } else {
            i = -this.f16127h;
        }
        m22531e((float) i, 0.0f, new C10591a());
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        motionEvent.offsetLocation(this.f16134o, 0.0f);
        if (this.f16127h < 2) {
            this.f16127h = this.f16125f.getWidth();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            boolean z5 = true;
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    VelocityTracker velocityTracker = this.f16133n;
                    if (velocityTracker != null) {
                        velocityTracker.addMovement(motionEvent);
                        float rawX = motionEvent.getRawX() - this.f16128i;
                        float rawY = motionEvent.getRawY() - this.f16129j;
                        if (Math.abs(rawX) > ((float) this.f16121b) && Math.abs(rawY) < Math.abs(rawX) / 2.0f) {
                            this.f16130k = true;
                            if (rawX > 0.0f) {
                                i2 = this.f16121b;
                            } else {
                                i2 = -this.f16121b;
                            }
                            this.f16131l = i2;
                            this.f16125f.getParent().requestDisallowInterceptTouchEvent(true);
                            MotionEvent obtain = MotionEvent.obtain(motionEvent);
                            obtain.setAction((motionEvent.getActionIndex() << 8) | 3);
                            this.f16125f.onTouchEvent(obtain);
                            obtain.recycle();
                        }
                        if (this.f16130k) {
                            this.f16134o = rawX;
                            mo45504i(rawX - ((float) this.f16131l));
                            mo45544h(Math.max(0.0f, Math.min(1.0f, 1.0f - ((Math.abs(rawX) * 2.0f) / ((float) this.f16127h)))));
                            return true;
                        }
                    }
                } else if (actionMasked == 3 && this.f16133n != null) {
                    mo45545j();
                    this.f16133n.recycle();
                    this.f16133n = null;
                    this.f16134o = 0.0f;
                    this.f16128i = 0.0f;
                    this.f16129j = 0.0f;
                    this.f16130k = false;
                }
            } else if (this.f16133n != null) {
                float rawX2 = motionEvent.getRawX() - this.f16128i;
                this.f16133n.addMovement(motionEvent);
                this.f16133n.computeCurrentVelocity(1000);
                float xVelocity = this.f16133n.getXVelocity();
                float abs = Math.abs(xVelocity);
                float abs2 = Math.abs(this.f16133n.getYVelocity());
                if (Math.abs(rawX2) <= ((float) (this.f16127h / 2)) || !this.f16130k) {
                    if (((float) this.f16122c) > abs || abs > ((float) this.f16123d) || abs2 >= abs || i >= 0 || !this.f16130k) {
                        z = false;
                        z5 = false;
                    } else {
                        if (xVelocity < 0.0f) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (rawX2 < 0.0f) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z2 == z3) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (this.f16133n.getXVelocity() <= 0.0f) {
                            z5 = false;
                        }
                        boolean z6 = z5;
                        z5 = z4;
                        z = z6;
                    }
                } else if (rawX2 > 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                if (z5) {
                    mo45546k(z);
                } else if (this.f16130k) {
                    mo45545j();
                }
                VelocityTracker velocityTracker2 = this.f16133n;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                }
                this.f16133n = null;
                this.f16134o = 0.0f;
                this.f16128i = 0.0f;
                this.f16129j = 0.0f;
                this.f16130k = false;
            }
            return false;
        }
        this.f16128i = motionEvent.getRawX();
        this.f16129j = motionEvent.getRawY();
        if (this.f16126g.mo45501a(this.f16132m)) {
            VelocityTracker obtain2 = VelocityTracker.obtain();
            this.f16133n = obtain2;
            obtain2.addMovement(motionEvent);
        }
        return false;
    }
}
