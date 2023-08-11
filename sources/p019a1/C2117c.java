package p019a1;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.WindowInsetsCompat;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p018a0.C2109g;
import p126j0.C8266c;
import p404of.C13074a;

/* renamed from: a1.c */
/* compiled from: ViewUtils.kt */
public final class C2117c {

    /* renamed from: a */
    private static final String f802a = C8266c.f11641a.mo42215o("ViewUtils");

    /* renamed from: a1.c$a */
    /* compiled from: ViewUtils.kt */
    static final class C2118a extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C2118a f803g = new C2118a();

        C2118a() {
            super(0);
        }

        public final String invoke() {
            return "Current and preferred orientation are landscape.";
        }
    }

    /* renamed from: a1.c$b */
    /* compiled from: ViewUtils.kt */
    static final class C2119b extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C2119b f804g = new C2119b();

        C2119b() {
            super(0);
        }

        public final String invoke() {
            return "Current and preferred orientation are portrait.";
        }
    }

    /* renamed from: a1.c$c */
    /* compiled from: ViewUtils.kt */
    static final class C2120c extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ int f805g;

        /* renamed from: h */
        final /* synthetic */ C2109g f806h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2120c(int i, C2109g gVar) {
            super(0);
            this.f805g = i;
            this.f806h = gVar;
        }

        public final String invoke() {
            return "Current orientation " + this.f805g + " and preferred orientation " + this.f806h + " don't match";
        }
    }

    /* renamed from: a1.c$d */
    /* compiled from: ViewUtils.kt */
    static final class C2121d extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C2121d f807g = new C2121d();

        C2121d() {
            super(0);
        }

        public final String invoke() {
            return "View passed in is null. Not removing from parent.";
        }
    }

    /* renamed from: a1.c$e */
    /* compiled from: ViewUtils.kt */
    static final class C2122e extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ View f808g;

        /* renamed from: h */
        final /* synthetic */ ViewGroup f809h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2122e(View view, ViewGroup viewGroup) {
            super(0);
            this.f808g = view;
            this.f809h = viewGroup;
        }

        public final String invoke() {
            return "Removed view: " + this.f808g + "\nfrom parent: " + this.f809h;
        }
    }

    /* renamed from: a1.c$f */
    /* compiled from: ViewUtils.kt */
    static final class C2123f extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ int f810g;

        /* renamed from: h */
        final /* synthetic */ Activity f811h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2123f(int i, Activity activity) {
            super(0);
            this.f810g = i;
            this.f811h = activity;
        }

        public final String invoke() {
            return "Failed to set requested orientation " + this.f810g + " for activity class: " + this.f811h.getLocalClassName();
        }
    }

    /* renamed from: a1.c$g */
    /* compiled from: ViewUtils.kt */
    static final class C2124g extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C2124g f812g = new C2124g();

        C2124g() {
            super(0);
        }

        public final String invoke() {
            return "Caught exception while setting view to focusable in touch mode and requesting focus.";
        }
    }

    /* renamed from: a */
    public static final double m1462a(Context context, double d) {
        C12775o.m28639i(context, "context");
        return d * ((double) context.getResources().getDisplayMetrics().density);
    }

    /* renamed from: b */
    public static final int m1463b(WindowInsetsCompat windowInsetsCompat) {
        int i;
        C12775o.m28639i(windowInsetsCompat, "windowInsets");
        DisplayCutoutCompat displayCutout = windowInsetsCompat.getDisplayCutout();
        if (displayCutout == null) {
            i = 0;
        } else {
            i = displayCutout.getSafeInsetBottom();
        }
        return Math.max(i, windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).bottom);
    }

    /* renamed from: c */
    public static final int m1464c(WindowInsetsCompat windowInsetsCompat) {
        int i;
        C12775o.m28639i(windowInsetsCompat, "windowInsets");
        DisplayCutoutCompat displayCutout = windowInsetsCompat.getDisplayCutout();
        if (displayCutout == null) {
            i = 0;
        } else {
            i = displayCutout.getSafeInsetLeft();
        }
        return Math.max(i, windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).left);
    }

    /* renamed from: d */
    public static final int m1465d(WindowInsetsCompat windowInsetsCompat) {
        int i;
        C12775o.m28639i(windowInsetsCompat, "windowInsets");
        DisplayCutoutCompat displayCutout = windowInsetsCompat.getDisplayCutout();
        if (displayCutout == null) {
            i = 0;
        } else {
            i = displayCutout.getSafeInsetRight();
        }
        return Math.max(i, windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).right);
    }

    /* renamed from: e */
    public static final int m1466e(WindowInsetsCompat windowInsetsCompat) {
        int i;
        C12775o.m28639i(windowInsetsCompat, "windowInsets");
        DisplayCutoutCompat displayCutout = windowInsetsCompat.getDisplayCutout();
        if (displayCutout == null) {
            i = 0;
        } else {
            i = displayCutout.getSafeInsetTop();
        }
        return Math.max(i, windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).top);
    }

    /* renamed from: f */
    public static final boolean m1467f(int i, C2109g gVar) {
        int i2 = i;
        C2109g gVar2 = gVar;
        C12775o.m28639i(gVar2, "preferredOrientation");
        if (i2 == 2 && gVar2 == C2109g.LANDSCAPE) {
            C8266c.m16397f(C8266c.f11641a, f802a, C8266c.C8267a.D, (Throwable) null, false, C2118a.f803g, 12, (Object) null);
            return true;
        } else if (i2 == 1 && gVar2 == C2109g.PORTRAIT) {
            C8266c.m16397f(C8266c.f11641a, f802a, C8266c.C8267a.D, (Throwable) null, false, C2119b.f804g, 12, (Object) null);
            return true;
        } else {
            C8266c.m16397f(C8266c.f11641a, f802a, C8266c.C8267a.D, (Throwable) null, false, new C2120c(i2, gVar2), 12, (Object) null);
            return false;
        }
    }

    /* renamed from: g */
    public static final boolean m1468g(Context context) {
        C12775o.m28639i(context, "context");
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static final boolean m1469h(View view) {
        C12775o.m28639i(view, "view");
        return !view.isInTouchMode();
    }

    /* renamed from: i */
    public static final boolean m1470i(Activity activity) {
        C12775o.m28639i(activity, "<this>");
        if (activity.getResources().getConfiguration().smallestScreenWidthDp >= 600) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static final void m1471j(View view) {
        ViewParent viewParent;
        if (view == null) {
            C8266c.m16397f(C8266c.f11641a, f802a, C8266c.C8267a.D, (Throwable) null, false, C2121d.f807g, 12, (Object) null);
        }
        if (view == null) {
            viewParent = null;
        } else {
            viewParent = view.getParent();
        }
        if (viewParent instanceof ViewGroup) {
            ViewParent parent = view.getParent();
            if (parent != null) {
                ViewGroup viewGroup = (ViewGroup) parent;
                viewGroup.removeView(view);
                C8266c.m16397f(C8266c.f11641a, f802a, C8266c.C8267a.D, (Throwable) null, false, new C2122e(view, viewGroup), 12, (Object) null);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    /* renamed from: k */
    public static final void m1472k(Activity activity, int i) {
        C12775o.m28639i(activity, "<this>");
        try {
            activity.setRequestedOrientation(i);
        } catch (Exception e) {
            C8266c.m16397f(C8266c.f11641a, f802a, C8266c.C8267a.f11649e, e, false, new C2123f(i, activity), 8, (Object) null);
        }
    }

    /* renamed from: l */
    public static final void m1473l(View view) {
        C12775o.m28639i(view, "<this>");
        try {
            view.setFocusableInTouchMode(true);
            view.requestFocus();
        } catch (Exception e) {
            C8266c.m16397f(C8266c.f11641a, f802a, C8266c.C8267a.f11649e, e, false, C2124g.f812g, 8, (Object) null);
        }
    }

    /* renamed from: m */
    public static final void m1474m(View view, int i) {
        C12775o.m28639i(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }
}
