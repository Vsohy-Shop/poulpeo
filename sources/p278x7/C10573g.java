package p278x7;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.core.view.PointerIconCompat;
import p278x7.C10590p;
import p289y7.C10703c;

/* renamed from: x7.g */
/* compiled from: FiamWindowManager */
public class C10573g {

    /* renamed from: a */
    private C10703c f16092a;

    /* renamed from: x7.g$a */
    /* compiled from: FiamWindowManager */
    class C10574a implements C10590p.C10595e {

        /* renamed from: a */
        final /* synthetic */ C10703c f16093a;

        C10574a(C10703c cVar) {
            this.f16093a = cVar;
        }

        /* renamed from: a */
        public boolean mo45501a(Object obj) {
            return true;
        }

        /* renamed from: b */
        public void mo45502b(View view, Object obj) {
            if (this.f16093a.mo45626d() != null) {
                this.f16093a.mo45626d().onClick(view);
            }
        }
    }

    /* renamed from: x7.g$b */
    /* compiled from: FiamWindowManager */
    class C10575b extends C10590p {

        /* renamed from: p */
        final /* synthetic */ WindowManager.LayoutParams f16095p;

        /* renamed from: q */
        final /* synthetic */ WindowManager f16096q;

        /* renamed from: r */
        final /* synthetic */ C10703c f16097r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10575b(View view, Object obj, C10590p.C10595e eVar, WindowManager.LayoutParams layoutParams, WindowManager windowManager, C10703c cVar) {
            super(view, obj, eVar);
            this.f16095p = layoutParams;
            this.f16096q = windowManager;
            this.f16097r = cVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public float mo45503f() {
            return (float) this.f16095p.x;
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public void mo45504i(float f) {
            this.f16095p.x = (int) f;
            this.f16096q.updateViewLayout(this.f16097r.mo45628f(), this.f16095p);
        }
    }

    C10573g() {
    }

    /* renamed from: b */
    private Point m22451b(@NonNull Activity activity) {
        Point point = new Point();
        m22456g(activity).getDefaultDisplay().getRealSize(point);
        return point;
    }

    /* renamed from: c */
    private Rect m22452c(@NonNull Activity activity) {
        Rect rect = new Rect();
        Rect f = m22455f(activity);
        Point b = m22451b(activity);
        rect.top = f.top;
        rect.left = f.left;
        rect.right = b.x - f.right;
        rect.bottom = b.y - f.bottom;
        return rect;
    }

    /* renamed from: d */
    private WindowManager.LayoutParams m22453d(@NonNull C10582l lVar, @NonNull Activity activity) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(lVar.mo45512A().intValue(), lVar.mo45524z().intValue(), PointerIconCompat.TYPE_HELP, lVar.mo45523y().intValue(), -3);
        Rect c = m22452c(activity);
        if ((lVar.mo45522x().intValue() & 48) == 48) {
            layoutParams.y = c.top;
        }
        layoutParams.dimAmount = 0.3f;
        layoutParams.gravity = lVar.mo45522x().intValue();
        layoutParams.windowAnimations = 0;
        return layoutParams;
    }

    /* renamed from: e */
    private C10590p m22454e(C10582l lVar, C10703c cVar, WindowManager windowManager, WindowManager.LayoutParams layoutParams) {
        C10574a aVar = new C10574a(cVar);
        if (lVar.mo45512A().intValue() == -1) {
            return new C10590p(cVar.mo45625c(), (Object) null, aVar);
        }
        return new C10575b(cVar.mo45625c(), (Object) null, aVar, layoutParams, windowManager, cVar);
    }

    /* renamed from: f */
    private Rect m22455f(@NonNull Activity activity) {
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect;
    }

    /* renamed from: g */
    private WindowManager m22456g(@NonNull Activity activity) {
        return (WindowManager) activity.getSystemService("window");
    }

    /* renamed from: a */
    public void mo45498a(@NonNull Activity activity) {
        if (mo45499h()) {
            m22456g(activity).removeViewImmediate(this.f16092a.mo45628f());
            this.f16092a = null;
        }
    }

    /* renamed from: h */
    public boolean mo45499h() {
        C10703c cVar = this.f16092a;
        if (cVar == null) {
            return false;
        }
        return cVar.mo45628f().isShown();
    }

    /* renamed from: i */
    public void mo45500i(@NonNull C10703c cVar, @NonNull Activity activity) {
        if (mo45499h()) {
            C10584m.m22519e("Fiam already active. Cannot show new Fiam.");
        } else if (activity.isFinishing()) {
            C10584m.m22519e("Activity is finishing or does not have valid window token. Cannot show FIAM.");
        } else {
            C10582l b = cVar.mo45624b();
            WindowManager.LayoutParams d = m22453d(b, activity);
            WindowManager g = m22456g(activity);
            g.addView(cVar.mo45628f(), d);
            Rect c = m22452c(activity);
            C10584m.m22518d("Inset (top, bottom)", (float) c.top, (float) c.bottom);
            C10584m.m22518d("Inset (left, right)", (float) c.left, (float) c.right);
            if (cVar.mo45623a()) {
                cVar.mo45625c().setOnTouchListener(m22454e(b, cVar, g, d));
            }
            this.f16092a = cVar;
        }
    }
}
