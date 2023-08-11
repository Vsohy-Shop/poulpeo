package p238u0;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.braze.configuration.C4218b;
import com.braze.p055ui.inappmessage.views.C4337b;
import com.braze.p055ui.inappmessage.views.C4338c;
import com.braze.p055ui.inappmessage.views.C4343f;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p018a0.C2104c;
import p018a0.C2108f;
import p018a0.C2110h;
import p019a1.C2117c;
import p069e0.C7358a;
import p069e0.C7360c;
import p069e0.C7408o;
import p069e0.C7416r;
import p126j0.C8266c;
import p282y0.C10641g;
import p282y0.C10645k;
import p282y0.C10649l;
import p404of.C13074a;

/* renamed from: u0.j */
/* compiled from: DefaultInAppMessageViewWrapper.kt */
public class C9835j implements C9860n {

    /* renamed from: p */
    public static final C9836a f14686p = new C9836a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final View f14687a;

    /* renamed from: b */
    private final C7358a f14688b;

    /* renamed from: c */
    private final C10641g f14689c;

    /* renamed from: d */
    private final C4218b f14690d;

    /* renamed from: e */
    private final Animation f14691e;

    /* renamed from: f */
    private final Animation f14692f;

    /* renamed from: g */
    private View f14693g;

    /* renamed from: h */
    private List<? extends View> f14694h;

    /* renamed from: i */
    private View f14695i;

    /* renamed from: j */
    private final C9862p f14696j;

    /* renamed from: k */
    private boolean f14697k;

    /* renamed from: l */
    private Runnable f14698l;

    /* renamed from: m */
    private View f14699m;

    /* renamed from: n */
    private HashMap<Integer, Integer> f14700n;

    /* renamed from: o */
    private ViewGroup f14701o;

    /* renamed from: u0.j$a */
    /* compiled from: DefaultInAppMessageViewWrapper.kt */
    public static final class C9836a {

        /* renamed from: u0.j$a$a */
        /* compiled from: DefaultInAppMessageViewWrapper.kt */
        static final class C9837a extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C9837a f14702g = new C9837a();

            C9837a() {
                super(0);
            }

            public final String invoke() {
                return "In-app message ViewGroup was null. Not resetting in-app message accessibility for exclusive mode.";
            }
        }

        /* renamed from: u0.j$a$b */
        /* compiled from: DefaultInAppMessageViewWrapper.kt */
        static final class C9838b extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C9838b f14703g = new C9838b();

            C9838b() {
                super(0);
            }

            public final String invoke() {
                return "In-app message ViewGroup was null. Not preparing in-app message accessibility for exclusive mode.";
            }
        }

        private C9836a() {
        }

        public /* synthetic */ C9836a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo44353a(ViewGroup viewGroup, Map<Integer, Integer> map) {
            C12775o.m28639i(map, "viewAccessibilityFlagMap");
            if (viewGroup == null) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C9837a.f14702g, 6, (Object) null);
                return;
            }
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (i < childCount) {
                int i2 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    int id = childAt.getId();
                    if (map.containsKey(Integer.valueOf(id))) {
                        Integer num = map.get(Integer.valueOf(id));
                        if (num != null) {
                            ViewCompat.setImportantForAccessibility(childAt, num.intValue());
                        }
                    } else {
                        ViewCompat.setImportantForAccessibility(childAt, 0);
                    }
                }
                i = i2;
            }
        }

        /* renamed from: b */
        public final void mo44354b(ViewGroup viewGroup, Map<Integer, Integer> map) {
            C12775o.m28639i(map, "viewAccessibilityFlagMap");
            if (viewGroup == null) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C9838b.f14703g, 6, (Object) null);
                return;
            }
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (i < childCount) {
                int i2 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    map.put(Integer.valueOf(childAt.getId()), Integer.valueOf(childAt.getImportantForAccessibility()));
                    ViewCompat.setImportantForAccessibility(childAt, 4);
                }
                i = i2;
            }
        }
    }

    /* renamed from: u0.j$b */
    /* compiled from: DefaultInAppMessageViewWrapper.kt */
    public /* synthetic */ class C9839b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14704a;

        static {
            int[] iArr = new int[C2108f.values().length];
            iArr[C2108f.MODAL.ordinal()] = 1;
            iArr[C2108f.FULL.ordinal()] = 2;
            f14704a = iArr;
        }
    }

    /* renamed from: u0.j$c */
    /* compiled from: DefaultInAppMessageViewWrapper.kt */
    static final class C9840c extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9840c f14705g = new C9840c();

        C9840c() {
            super(0);
        }

        public final String invoke() {
            return "Adding In-app message view to parent view group.";
        }
    }

    /* renamed from: u0.j$d */
    /* compiled from: DefaultInAppMessageViewWrapper.kt */
    static final class C9841d extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9841d f14706g = new C9841d();

        C9841d() {
            super(0);
        }

        public final String invoke() {
            return "Calling applyWindowInsets on in-app message view.";
        }
    }

    /* renamed from: u0.j$e */
    /* compiled from: DefaultInAppMessageViewWrapper.kt */
    static final class C9842e extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9842e f14707g = new C9842e();

        C9842e() {
            super(0);
        }

        public final String invoke() {
            return "Not reapplying window insets to in-app message view.";
        }
    }

    /* renamed from: u0.j$f */
    /* compiled from: DefaultInAppMessageViewWrapper.kt */
    static final class C9843f extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9843f f14708g = new C9843f();

        C9843f() {
            super(0);
        }

        public final String invoke() {
            return "In-app message view will animate into the visible area.";
        }
    }

    /* renamed from: u0.j$g */
    /* compiled from: DefaultInAppMessageViewWrapper.kt */
    static final class C9844g extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9844g f14709g = new C9844g();

        C9844g() {
            super(0);
        }

        public final String invoke() {
            return "In-app message view will be placed instantly into the visible area.";
        }
    }

    /* renamed from: u0.j$h */
    /* compiled from: DefaultInAppMessageViewWrapper.kt */
    static final class C9845h extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9845h f14710g = new C9845h();

        C9845h() {
            super(0);
        }

        public final String invoke() {
            return "Closing in-app message view";
        }
    }

    /* renamed from: u0.j$i */
    /* compiled from: DefaultInAppMessageViewWrapper.kt */
    static final class C9846i extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ C9835j f14711g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9846i(C9835j jVar) {
            super(0);
            this.f14711g = jVar;
        }

        public final String invoke() {
            return C12775o.m28647q("Returning focus to view after closing message. View: ", this.f14711g.mo44329M());
        }
    }

    /* renamed from: u0.j$l */
    /* compiled from: DefaultInAppMessageViewWrapper.kt */
    static final class C9850l extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9850l f14715g = new C9850l();

        C9850l() {
            super(0);
        }

        public final String invoke() {
            return "Cannot create button click listener since this in-app message does not have message buttons.";
        }
    }

    /* renamed from: u0.j$m */
    /* compiled from: DefaultInAppMessageViewWrapper.kt */
    public static final class C9851m implements C10645k.C10648c {

        /* renamed from: a */
        final /* synthetic */ C9835j f14716a;

        C9851m(C9835j jVar) {
            this.f14716a = jVar;
        }

        /* renamed from: a */
        public boolean mo44361a(Object obj) {
            return true;
        }

        /* renamed from: b */
        public void mo44362b(View view, Object obj) {
            C12775o.m28639i(view, "view");
            this.f14716a.mo44339c().mo40945J(false);
            C9783d.f14623G.mo44312a().mo44302B(true);
        }
    }

    /* renamed from: u0.j$n */
    /* compiled from: DefaultInAppMessageViewWrapper.kt */
    public static final class C9852n implements C10649l.C10650a {

        /* renamed from: a */
        final /* synthetic */ C9835j f14717a;

        C9852n(C9835j jVar) {
            this.f14717a = jVar;
        }

        /* renamed from: a */
        public void mo44363a() {
            if (this.f14717a.mo44339c().mo40942E() == C2104c.AUTO_DISMISS) {
                this.f14717a.mo44342j();
            }
        }

        /* renamed from: b */
        public void mo44364b() {
            this.f14717a.mo44341d().removeCallbacks(this.f14717a.mo44323G());
        }
    }

    /* renamed from: u0.j$o */
    /* compiled from: DefaultInAppMessageViewWrapper.kt */
    static final class C9853o extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C9853o f14718g = new C9853o();

        C9853o() {
            super(0);
        }

        public final String invoke() {
            return "Opening in-app message view wrapper";
        }
    }

    /* renamed from: u0.j$p */
    /* compiled from: DefaultInAppMessageViewWrapper.kt */
    public static final class C9854p implements View.OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f14719a;

        /* renamed from: b */
        final /* synthetic */ C9835j f14720b;

        /* renamed from: u0.j$p$a */
        /* compiled from: DefaultInAppMessageViewWrapper.kt */
        static final class C9855a extends C12777p implements C13074a<String> {

            /* renamed from: g */
            final /* synthetic */ int f14721g;

            /* renamed from: h */
            final /* synthetic */ int f14722h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C9855a(int i, int i2) {
                super(0);
                this.f14721g = i;
                this.f14722h = i2;
            }

            public final String invoke() {
                return "Detected (bottom - top) of " + (this.f14721g - this.f14722h) + " in OnLayoutChangeListener";
            }
        }

        C9854p(ViewGroup viewGroup, C9835j jVar) {
            this.f14719a = viewGroup;
            this.f14720b = jVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static final void m20469b(C9835j jVar, ViewGroup viewGroup) {
            C12775o.m28639i(jVar, "this$0");
            C12775o.m28639i(viewGroup, "$parentViewGroup");
            jVar.mo44343l(viewGroup, jVar.mo44339c(), jVar.mo44341d(), jVar.mo44325I());
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C12775o.m28639i(view, "view");
            this.f14719a.removeOnLayoutChangeListener(this);
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C9855a(i4, i2), 7, (Object) null);
            this.f14719a.removeView(this.f14720b.mo44341d());
            ViewGroup viewGroup = this.f14719a;
            viewGroup.post(new C9857k(this.f14720b, viewGroup));
        }
    }

    /* renamed from: u0.j$q */
    /* compiled from: DefaultInAppMessageViewWrapper.kt */
    static final class C9856q extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ int f14723g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9856q(int i) {
            super(0);
            this.f14723g = i;
        }

        public final String invoke() {
            return C12775o.m28647q("Detected root view height of ", Integer.valueOf(this.f14723g));
        }
    }

    public C9835j(View view, C7358a aVar, C10641g gVar, C4218b bVar, Animation animation, Animation animation2, View view2, List<? extends View> list, View view3) {
        C12775o.m28639i(view, "inAppMessageView");
        C12775o.m28639i(aVar, "inAppMessage");
        C12775o.m28639i(gVar, "inAppMessageViewLifecycleListener");
        C12775o.m28639i(bVar, "configurationProvider");
        this.f14687a = view;
        this.f14688b = aVar;
        this.f14689c = gVar;
        this.f14690d = bVar;
        this.f14691e = animation;
        this.f14692f = animation2;
        this.f14693g = view2;
        this.f14694h = list;
        this.f14695i = view3;
        this.f14700n = new HashMap<>();
        View B = mo44318B();
        mo44333Q(B == null ? mo44341d() : B);
        if (mo44339c() instanceof C7408o) {
            C10649l lVar = new C10649l(mo44341d(), mo44350x());
            lVar.mo45594g(mo44351y());
            View B2 = mo44318B();
            if (B2 != null) {
                B2.setOnTouchListener(lVar);
            }
        }
        View B3 = mo44318B();
        if (B3 != null) {
            B3.setOnClickListener(mo44348t());
        }
        this.f14696j = new C9862p(this);
        View C = mo44319C();
        if (C != null) {
            C.setOnClickListener(mo44349v());
        }
        List<View> A = mo44317A();
        if (A != null) {
            for (View onClickListener : A) {
                onClickListener.setOnClickListener(mo44347r());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final void m20421k() {
        C9783d.f14623G.mo44312a().mo44302B(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final WindowInsetsCompat m20422m(View view, C9835j jVar, View view2, WindowInsetsCompat windowInsetsCompat) {
        C12775o.m28639i(view, "$inAppMessageView");
        C12775o.m28639i(jVar, "this$0");
        if (windowInsetsCompat == null) {
            return windowInsetsCompat;
        }
        C4338c cVar = (C4338c) view;
        if (!cVar.getHasAppliedWindowInsets()) {
            C8266c.m16396e(C8266c.f11641a, jVar, C8266c.C8267a.f11650f, (Throwable) null, false, C9841d.f14706g, 6, (Object) null);
            cVar.applyWindowInsets(windowInsetsCompat);
        } else {
            C8266c.m16396e(C8266c.f11641a, jVar, (C8266c.C8267a) null, (Throwable) null, false, C9842e.f14707g, 7, (Object) null);
        }
        return windowInsetsCompat;
    }

    /* renamed from: o */
    public static /* synthetic */ void m20423o(C9835j jVar, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = "In app message displayed.";
            }
            jVar.mo44344n(str);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: announceForAccessibilityIfNecessary");
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static final void m20424s(C9835j jVar, View view) {
        C12775o.m28639i(jVar, "this$0");
        C12775o.m28639i(view, "view");
        C7360c cVar = (C7360c) jVar.mo44339c();
        if (cVar.mo40975R().isEmpty()) {
            C8266c.m16396e(C8266c.f11641a, jVar, (C8266c.C8267a) null, (Throwable) null, false, C9850l.f14715g, 7, (Object) null);
            return;
        }
        List<View> A = jVar.mo44317A();
        if (A != null) {
            for (int i = 0; i < A.size(); i++) {
                if (view.getId() == A.get(i).getId()) {
                    jVar.mo44325I().mo45563d(jVar.mo44324H(), cVar.mo40975R().get(i), cVar);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public static final void m20425u(C9835j jVar, View view) {
        C7360c cVar;
        List<C7416r> R;
        C12775o.m28639i(jVar, "this$0");
        C7358a c = jVar.mo44339c();
        if (c instanceof C7360c) {
            cVar = (C7360c) c;
        } else {
            cVar = null;
        }
        boolean z = false;
        if (!(cVar == null || (R = cVar.mo40975R()) == null || !R.isEmpty())) {
            z = true;
        }
        if (z || !(jVar.mo44339c() instanceof C7360c)) {
            jVar.mo44325I().mo45564e(jVar.mo44324H(), jVar.mo44341d(), jVar.mo44339c());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public static final void m20426w(View view) {
        C9783d.f14623G.mo44312a().mo44302B(true);
    }

    /* renamed from: A */
    public List<View> mo44317A() {
        return this.f14694h;
    }

    /* renamed from: B */
    public View mo44318B() {
        return this.f14693g;
    }

    /* renamed from: C */
    public View mo44319C() {
        return this.f14695i;
    }

    /* renamed from: D */
    public Animation mo44320D() {
        return this.f14692f;
    }

    /* renamed from: E */
    public C4218b mo44321E() {
        return this.f14690d;
    }

    /* renamed from: F */
    public ViewGroup mo44322F() {
        return this.f14701o;
    }

    /* renamed from: G */
    public Runnable mo44323G() {
        return this.f14698l;
    }

    /* renamed from: H */
    public C9862p mo44324H() {
        return this.f14696j;
    }

    /* renamed from: I */
    public C10641g mo44325I() {
        return this.f14689c;
    }

    /* renamed from: J */
    public ViewGroup.LayoutParams mo44326J(C7358a aVar) {
        int i;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        if (aVar instanceof C7408o) {
            if (((C7408o) aVar).mo41050x0() == C2110h.TOP) {
                i = 48;
            } else {
                i = 80;
            }
            layoutParams.gravity = i;
        }
        return layoutParams;
    }

    /* renamed from: K */
    public Animation mo44327K() {
        return this.f14691e;
    }

    /* renamed from: L */
    public ViewGroup mo44328L(Activity activity) {
        C12775o.m28639i(activity, "activity");
        View findViewById = activity.getWindow().getDecorView().findViewById(16908290);
        C12775o.m28638h(findViewById, "activity.window.decorVie…yId(android.R.id.content)");
        return (ViewGroup) findViewById;
    }

    /* renamed from: M */
    public View mo44329M() {
        return this.f14699m;
    }

    /* renamed from: N */
    public HashMap<Integer, Integer> mo44330N() {
        return this.f14700n;
    }

    /* renamed from: O */
    public void mo44331O(boolean z) {
        Animation animation;
        if (z) {
            animation = mo44327K();
        } else {
            animation = mo44320D();
        }
        if (animation != null) {
            animation.setAnimationListener(mo44346q(z));
        }
        mo44341d().clearAnimation();
        mo44341d().setAnimation(animation);
        if (animation != null) {
            animation.startNow();
        }
        mo44341d().invalidate();
    }

    /* renamed from: P */
    public void mo44332P(boolean z) {
        this.f14697k = z;
    }

    /* renamed from: Q */
    public void mo44333Q(View view) {
        this.f14693g = view;
    }

    /* renamed from: R */
    public void mo44334R(ViewGroup viewGroup) {
        this.f14701o = viewGroup;
    }

    /* renamed from: S */
    public void mo44335S(Runnable runnable) {
        this.f14698l = runnable;
    }

    /* renamed from: T */
    public void mo44336T(View view) {
        this.f14699m = view;
    }

    /* renamed from: a */
    public boolean mo44337a() {
        return this.f14697k;
    }

    /* renamed from: b */
    public void mo44338b(Activity activity) {
        C12775o.m28639i(activity, "activity");
        C8266c cVar = C8266c.f11641a;
        C8266c.m16396e(cVar, this, C8266c.C8267a.f11650f, (Throwable) null, false, C9853o.f14718g, 6, (Object) null);
        ViewGroup L = mo44328L(activity);
        int height = L.getHeight();
        if (mo44321E().isInAppMessageAccessibilityExclusiveModeEnabled()) {
            mo44334R(L);
            mo44330N().clear();
            f14686p.mo44354b(mo44322F(), mo44330N());
        }
        mo44336T(activity.getCurrentFocus());
        if (height == 0) {
            L.addOnLayoutChangeListener(new C9854p(L, this));
            return;
        }
        C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, new C9856q(height), 7, (Object) null);
        mo44343l(L, mo44339c(), mo44341d(), mo44325I());
    }

    /* renamed from: c */
    public C7358a mo44339c() {
        return this.f14688b;
    }

    public void close() {
        if (mo44321E().isInAppMessageAccessibilityExclusiveModeEnabled()) {
            f14686p.mo44353a(mo44322F(), mo44330N());
        }
        mo44341d().removeCallbacks(mo44323G());
        mo44325I().mo45561b(mo44341d(), mo44339c());
        if (mo44339c().mo40949N()) {
            mo44332P(true);
            mo44331O(false);
            return;
        }
        mo44345p();
    }

    /* renamed from: d */
    public View mo44341d() {
        return this.f14687a;
    }

    /* renamed from: j */
    public void mo44342j() {
        if (mo44323G() == null) {
            mo44335S(new C9833h());
            mo44341d().postDelayed(mo44323G(), (long) mo44339c().mo40952T());
        }
    }

    /* renamed from: l */
    public void mo44343l(ViewGroup viewGroup, C7358a aVar, View view, C10641g gVar) {
        C12775o.m28639i(viewGroup, "parentViewGroup");
        C12775o.m28639i(aVar, "inAppMessage");
        C12775o.m28639i(view, "inAppMessageView");
        C12775o.m28639i(gVar, "inAppMessageViewLifecycleListener");
        gVar.mo45560a(view, aVar);
        C8266c cVar = C8266c.f11641a;
        C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, C9840c.f14705g, 7, (Object) null);
        viewGroup.addView(view, mo44326J(aVar));
        if (view instanceof C4338c) {
            ViewCompat.requestApplyInsets(viewGroup);
            ViewCompat.setOnApplyWindowInsetsListener(viewGroup, new C9830e(view, this));
        }
        if (aVar.mo40951S()) {
            C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, C9843f.f14708g, 7, (Object) null);
            mo44331O(true);
            return;
        }
        C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, C9844g.f14709g, 7, (Object) null);
        if (aVar.mo40942E() == C2104c.AUTO_DISMISS) {
            mo44342j();
        }
        mo44352z(aVar, view, gVar);
    }

    /* renamed from: n */
    public void mo44344n(String str) {
        if (mo44341d() instanceof C4337b) {
            String message = mo44339c().getMessage();
            if (mo44339c() instanceof C7360c) {
                String Y = ((C7360c) mo44339c()).mo40976Y();
                View d = mo44341d();
                d.announceForAccessibility(Y + " . " + message);
                return;
            }
            mo44341d().announceForAccessibility(message);
        } else if (mo44341d() instanceof C4343f) {
            mo44341d().announceForAccessibility(str);
        }
    }

    /* renamed from: p */
    public void mo44345p() {
        C4343f fVar;
        C8266c cVar = C8266c.f11641a;
        C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, C9845h.f14710g, 7, (Object) null);
        C2117c.m1471j(mo44341d());
        View d = mo44341d();
        if (d instanceof C4343f) {
            fVar = (C4343f) d;
        } else {
            fVar = null;
        }
        if (fVar != null) {
            fVar.finishWebViewDisplay();
        }
        if (mo44329M() != null) {
            C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, new C9846i(this), 7, (Object) null);
            View M = mo44329M();
            if (M != null) {
                M.requestFocus();
            }
        }
        mo44325I().mo45562c(mo44339c());
    }

    /* renamed from: q */
    public Animation.AnimationListener mo44346q(boolean z) {
        if (z) {
            return new C9847j(this);
        }
        return new C9849k(this);
    }

    /* renamed from: r */
    public View.OnClickListener mo44347r() {
        return new C9832g(this);
    }

    /* renamed from: t */
    public View.OnClickListener mo44348t() {
        return new C9834i(this);
    }

    /* renamed from: v */
    public View.OnClickListener mo44349v() {
        return new C9831f();
    }

    /* renamed from: x */
    public C10645k.C10648c mo44350x() {
        return new C9851m(this);
    }

    /* renamed from: y */
    public C10649l.C10650a mo44351y() {
        return new C9852n(this);
    }

    /* renamed from: z */
    public void mo44352z(C7358a aVar, View view, C10641g gVar) {
        C12775o.m28639i(aVar, "inAppMessage");
        C12775o.m28639i(view, "inAppMessageView");
        C12775o.m28639i(gVar, "inAppMessageViewLifecycleListener");
        if (C2117c.m1469h(view)) {
            int i = C9839b.f14704a[aVar.mo40944I().ordinal()];
            if (!(i == 1 || i == 2)) {
                C2117c.m1473l(view);
            }
        } else {
            C2117c.m1473l(view);
        }
        m20423o(this, (String) null, 1, (Object) null);
        gVar.mo45565f(view, aVar);
    }

    /* renamed from: u0.j$j */
    /* compiled from: DefaultInAppMessageViewWrapper.kt */
    public static final class C9847j implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ C9835j f14712a;

        /* renamed from: u0.j$j$a */
        /* compiled from: DefaultInAppMessageViewWrapper.kt */
        static final class C9848a extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C9848a f14713g = new C9848a();

            C9848a() {
                super(0);
            }

            public final String invoke() {
                return "In-app message animated into view.";
            }
        }

        C9847j(C9835j jVar) {
            this.f14712a = jVar;
        }

        public void onAnimationEnd(Animation animation) {
            if (this.f14712a.mo44339c().mo40942E() == C2104c.AUTO_DISMISS) {
                this.f14712a.mo44342j();
            }
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C9848a.f14713g, 7, (Object) null);
            C9835j jVar = this.f14712a;
            jVar.mo44352z(jVar.mo44339c(), this.f14712a.mo44341d(), this.f14712a.mo44325I());
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: u0.j$k */
    /* compiled from: DefaultInAppMessageViewWrapper.kt */
    public static final class C9849k implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ C9835j f14714a;

        C9849k(C9835j jVar) {
            this.f14714a = jVar;
        }

        public void onAnimationEnd(Animation animation) {
            this.f14714a.mo44341d().clearAnimation();
            this.f14714a.mo44341d().setVisibility(8);
            this.f14714a.mo44345p();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C9835j(android.view.View r14, p069e0.C7358a r15, p282y0.C10641g r16, com.braze.configuration.C4218b r17, android.view.animation.Animation r18, android.view.animation.Animation r19, android.view.View r20, java.util.List r21, android.view.View r22, int r23, kotlin.jvm.internal.DefaultConstructorMarker r24) {
        /*
            r13 = this;
            r0 = r23
            r1 = r0 & 128(0x80, float:1.794E-43)
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r11 = r2
            goto L_0x000b
        L_0x0009:
            r11 = r21
        L_0x000b:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0011
            r12 = r2
            goto L_0x0013
        L_0x0011:
            r12 = r22
        L_0x0013:
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p238u0.C9835j.<init>(android.view.View, e0.a, y0.g, com.braze.configuration.b, android.view.animation.Animation, android.view.animation.Animation, android.view.View, java.util.List, android.view.View, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
