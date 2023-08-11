package p282y0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* renamed from: y0.k */
/* compiled from: SwipeDismissTouchListener */
public class C10645k implements View.OnTouchListener {

    /* renamed from: b */
    private final int f16197b;

    /* renamed from: c */
    private final int f16198c;

    /* renamed from: d */
    private final int f16199d;

    /* renamed from: e */
    private final long f16200e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final View f16201f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C10648c f16202g;

    /* renamed from: h */
    private int f16203h = 1;

    /* renamed from: i */
    private float f16204i;

    /* renamed from: j */
    private float f16205j;

    /* renamed from: k */
    private boolean f16206k;

    /* renamed from: l */
    private int f16207l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final Object f16208m;

    /* renamed from: n */
    private VelocityTracker f16209n;

    /* renamed from: o */
    private float f16210o;

    /* renamed from: y0.k$a */
    /* compiled from: SwipeDismissTouchListener */
    class C10646a extends AnimatorListenerAdapter {
        C10646a() {
        }

        public void onAnimationEnd(Animator animator) {
            C10645k.this.mo45590f();
        }
    }

    /* renamed from: y0.k$b */
    /* compiled from: SwipeDismissTouchListener */
    class C10647b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup.LayoutParams f16212a;

        /* renamed from: b */
        final /* synthetic */ int f16213b;

        C10647b(ViewGroup.LayoutParams layoutParams, int i) {
            this.f16212a = layoutParams;
            this.f16213b = i;
        }

        public void onAnimationEnd(Animator animator) {
            C10645k.this.f16202g.mo44362b(C10645k.this.f16201f, C10645k.this.f16208m);
            C10645k.this.f16201f.setAlpha(1.0f);
            C10645k.this.f16201f.setTranslationX(0.0f);
            this.f16212a.height = this.f16213b;
            C10645k.this.f16201f.setLayoutParams(this.f16212a);
        }
    }

    /* renamed from: y0.k$c */
    /* compiled from: SwipeDismissTouchListener */
    public interface C10648c {
        /* renamed from: a */
        boolean mo44361a(Object obj);

        /* renamed from: b */
        void mo44362b(View view, Object obj);
    }

    public C10645k(View view, Object obj, C10648c cVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        this.f16197b = viewConfiguration.getScaledTouchSlop();
        this.f16198c = viewConfiguration.getScaledMinimumFlingVelocity() * 16;
        this.f16199d = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f16200e = (long) view.getContext().getResources().getInteger(17694720);
        this.f16201f = view;
        this.f16208m = obj;
        this.f16202g = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m22603e(ViewGroup.LayoutParams layoutParams, ValueAnimator valueAnimator) {
        layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f16201f.setLayoutParams(layoutParams);
    }

    /* renamed from: f */
    public void mo45590f() {
        ViewGroup.LayoutParams layoutParams = this.f16201f.getLayoutParams();
        int height = this.f16201f.getHeight();
        ValueAnimator duration = ValueAnimator.ofInt(new int[]{height, 1}).setDuration(this.f16200e);
        duration.addListener(new C10647b(layoutParams, height));
        duration.addUpdateListener(new C10644j(this, layoutParams));
        duration.start();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        motionEvent.offsetLocation(this.f16210o, 0.0f);
        if (this.f16203h < 2) {
            this.f16203h = this.f16201f.getWidth();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            boolean z5 = true;
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    VelocityTracker velocityTracker = this.f16209n;
                    if (velocityTracker != null) {
                        velocityTracker.addMovement(motionEvent);
                        float rawX = motionEvent.getRawX() - this.f16204i;
                        float rawY = motionEvent.getRawY() - this.f16205j;
                        if (Math.abs(rawX) > ((float) this.f16197b) && Math.abs(rawY) < Math.abs(rawX) / 2.0f) {
                            this.f16206k = true;
                            if (rawX > 0.0f) {
                                i2 = this.f16197b;
                            } else {
                                i2 = -this.f16197b;
                            }
                            this.f16207l = i2;
                            this.f16201f.getParent().requestDisallowInterceptTouchEvent(true);
                            MotionEvent obtain = MotionEvent.obtain(motionEvent);
                            obtain.setAction((motionEvent.getActionIndex() << 8) | 3);
                            this.f16201f.onTouchEvent(obtain);
                            obtain.recycle();
                        }
                        if (this.f16206k) {
                            this.f16210o = rawX;
                            this.f16201f.setTranslationX(rawX - ((float) this.f16207l));
                            return true;
                        }
                    }
                } else if (actionMasked == 3 && this.f16209n != null) {
                    this.f16201f.animate().translationX(0.0f).alpha(1.0f).setDuration(this.f16200e).setListener((Animator.AnimatorListener) null);
                    this.f16209n.recycle();
                    this.f16209n = null;
                    this.f16210o = 0.0f;
                    this.f16204i = 0.0f;
                    this.f16205j = 0.0f;
                    this.f16206k = false;
                }
            } else if (this.f16209n != null) {
                float rawX2 = motionEvent.getRawX() - this.f16204i;
                this.f16209n.addMovement(motionEvent);
                this.f16209n.computeCurrentVelocity(1000);
                float xVelocity = this.f16209n.getXVelocity();
                float abs = Math.abs(xVelocity);
                float abs2 = Math.abs(this.f16209n.getYVelocity());
                if (Math.abs(rawX2) <= ((float) (this.f16203h / 2)) || !this.f16206k) {
                    if (((float) this.f16198c) > abs || abs > ((float) this.f16199d) || abs2 >= abs || !this.f16206k) {
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
                        if (this.f16209n.getXVelocity() <= 0.0f) {
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
                    ViewPropertyAnimator animate = this.f16201f.animate();
                    if (z) {
                        i = this.f16203h;
                    } else {
                        i = -this.f16203h;
                    }
                    animate.translationX((float) i).alpha(0.0f).setDuration(this.f16200e).setListener(new C10646a());
                } else if (this.f16206k) {
                    this.f16201f.animate().translationX(0.0f).alpha(1.0f).setDuration(this.f16200e).setListener((Animator.AnimatorListener) null);
                }
                this.f16209n.recycle();
                this.f16209n = null;
                this.f16210o = 0.0f;
                this.f16204i = 0.0f;
                this.f16205j = 0.0f;
                this.f16206k = false;
            }
            return false;
        }
        this.f16204i = motionEvent.getRawX();
        this.f16205j = motionEvent.getRawY();
        if (this.f16202g.mo44361a(this.f16208m)) {
            VelocityTracker obtain2 = VelocityTracker.obtain();
            this.f16209n = obtain2;
            obtain2.addMovement(motionEvent);
        }
        return false;
    }
}
