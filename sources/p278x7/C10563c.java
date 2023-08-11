package p278x7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Application;
import android.graphics.Point;
import android.view.View;

/* renamed from: x7.c */
/* compiled from: FiamAnimator */
public class C10563c {

    /* renamed from: x7.c$a */
    /* compiled from: FiamAnimator */
    class C10564a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ View f16074a;

        /* renamed from: b */
        final /* synthetic */ Application f16075b;

        C10564a(View view, Application application) {
            this.f16074a = view;
            this.f16075b = application;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f16074a.animate().translationX(0.0f).translationY(0.0f).alpha(1.0f).setDuration((long) this.f16075b.getResources().getInteger(17694722)).setListener((Animator.AnimatorListener) null);
        }
    }

    /* renamed from: x7.c$b */
    /* compiled from: FiamAnimator */
    static /* synthetic */ class C10565b {

        /* renamed from: a */
        static final /* synthetic */ int[] f16077a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                x7.c$c[] r0 = p278x7.C10563c.C10566c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16077a = r0
                x7.c$c r1 = p278x7.C10563c.C10566c.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16077a     // Catch:{ NoSuchFieldError -> 0x001d }
                x7.c$c r1 = p278x7.C10563c.C10566c.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f16077a     // Catch:{ NoSuchFieldError -> 0x0028 }
                x7.c$c r1 = p278x7.C10563c.C10566c.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f16077a     // Catch:{ NoSuchFieldError -> 0x0033 }
                x7.c$c r1 = p278x7.C10563c.C10566c.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p278x7.C10563c.C10565b.<clinit>():void");
        }
    }

    /* renamed from: x7.c$c */
    /* compiled from: FiamAnimator */
    public enum C10566c {
        LEFT,
        RIGHT,
        TOP,
        BOTTOM;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static Point m22428b(C10566c cVar, View view) {
            view.measure(-2, -2);
            int i = C10565b.f16077a[cVar.ordinal()];
            if (i == 1) {
                return new Point(view.getMeasuredWidth() * -1, 0);
            }
            if (i == 2) {
                return new Point(view.getMeasuredWidth() * 1, 0);
            }
            if (i == 3) {
                return new Point(0, view.getMeasuredHeight() * -1);
            }
            if (i != 4) {
                return new Point(0, view.getMeasuredHeight() * -1);
            }
            return new Point(0, view.getMeasuredHeight() * 1);
        }
    }

    C10563c() {
    }

    /* renamed from: a */
    public void mo45487a(Application application, View view, C10566c cVar) {
        view.setAlpha(0.0f);
        Point a = C10566c.m22428b(cVar, view);
        view.animate().translationX((float) a.x).translationY((float) a.y).setDuration(1).setListener(new C10564a(view, application));
    }
}
