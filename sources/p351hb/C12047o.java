package p351hb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.comment.CommentActivity;
import com.rmn.api.p322v2.poulpeo.model.UserSuggestSource;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.utils.BundleDelegate;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12764h0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.C12783v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import p063d6.C7267a;
import p063d6.C7268b;
import p063d6.C7269c;
import p334ed.C11884a;
import p336ef.C11921v;
import p360id.C12136d;
import p360id.C12139g;
import p401oc.C13059a;
import p415qc.C13240e;
import p427sc.C13390f;
import p462yb.C13857a;
import p462yb.C13861e;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: hb.o */
/* compiled from: RatingDialogFragment.kt */
public final class C12047o extends C11884a {

    /* renamed from: k */
    public static final C12048a f18841k = new C12048a((DefaultConstructorMarker) null);

    /* renamed from: l */
    public static final int f18842l = 8;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final BundleDelegate.Boolean f18843m = new BundleDelegate.Boolean("isAutomaticOpening");
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final BundleDelegate.String f18844n = new BundleDelegate.String("ratingContext");
    /* access modifiers changed from: private */

    /* renamed from: g */
    public AppCompatActivity f18845g;

    /* renamed from: h */
    private final C13059a f18846h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f18847i;

    /* renamed from: j */
    public Map<Integer, View> f18848j = new LinkedHashMap();

    /* renamed from: hb.o$a */
    /* compiled from: RatingDialogFragment.kt */
    public static final class C12048a {

        /* renamed from: a */
        static final /* synthetic */ KProperty<Object>[] f18849a;

        static {
            Class<C12048a> cls = C12048a.class;
            f18849a = new KProperty[]{C12764h0.m28590f(new C12783v(cls, "isAutomaticOpening", "isAutomaticOpening(Landroid/os/Bundle;)Z", 0)), C12764h0.m28590f(new C12783v(cls, "ratingContext", "getRatingContext(Landroid/os/Bundle;)Ljava/lang/String;", 0))};
        }

        private C12048a() {
        }

        public /* synthetic */ C12048a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public final String m26205e(Bundle bundle) {
            return C12047o.f18844n.getValue(bundle, (KProperty<?>) f18849a[1]);
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public final boolean m26206f(Bundle bundle) {
            return C12047o.f18843m.getValue(bundle, (KProperty<?>) f18849a[0]).booleanValue();
        }

        /* renamed from: g */
        private final void m26207g(Bundle bundle, boolean z) {
            C12047o.f18843m.setValue(bundle, (KProperty<?>) f18849a[0], z);
        }

        /* renamed from: h */
        private final void m26208h(Bundle bundle, String str) {
            C12047o.f18844n.setValue(bundle, (KProperty<?>) f18849a[1], str);
        }

        /* renamed from: i */
        private final C12047o m26209i(AppCompatActivity appCompatActivity, String str, boolean z) {
            C12047o oVar = new C12047o();
            oVar.setCancelable(true);
            Bundle bundle = new Bundle();
            C12048a aVar = C12047o.f18841k;
            aVar.m26207g(bundle, z);
            String e = C12034b.m26140e(str, z);
            C12775o.m28638h(e, "getRatingContext(trigger…reen, isAutomaticOpening)");
            aVar.m26208h(bundle, e);
            oVar.setArguments(bundle);
            C11884a.f18565e.mo49090c(appCompatActivity, "rating", oVar);
            return oVar;
        }

        /* renamed from: k */
        public static /* synthetic */ void m26210k(C12048a aVar, AppCompatActivity appCompatActivity, String str, Function1 function1, int i, Object obj) {
            if ((i & 4) != 0) {
                function1 = null;
            }
            aVar.mo49492j(appCompatActivity, str, function1);
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public static final void m26211l(AppCompatActivity appCompatActivity, String str, Function1 function1, Boolean bool) {
            C12775o.m28639i(appCompatActivity, "$activity");
            C12775o.m28639i(str, "$triggeringScreen");
            C12048a aVar = C12047o.f18841k;
            C12047o i = aVar.m26209i(appCompatActivity, str, false);
            C12034b d = C12034b.m26139d();
            Bundle requireArguments = i.requireArguments();
            C12775o.m28638h(requireArguments, "d.requireArguments()");
            d.mo49465C(aVar.m26205e(requireArguments));
            if (function1 != null) {
                function1.invoke(i);
            }
        }

        /* renamed from: n */
        public static /* synthetic */ void m26212n(C12048a aVar, AppCompatActivity appCompatActivity, String str, Function1 function1, int i, Object obj) {
            if ((i & 4) != 0) {
                function1 = null;
            }
            aVar.mo49493m(appCompatActivity, str, function1);
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public static final void m26213o(AppCompatActivity appCompatActivity, String str, Function1 function1, Boolean bool) {
            C12775o.m28639i(appCompatActivity, "$activity");
            C12775o.m28639i(str, "$triggeringScreen");
            C12775o.m28638h(bool, "canShow");
            if (bool.booleanValue()) {
                C12048a aVar = C12047o.f18841k;
                C12047o i = aVar.m26209i(appCompatActivity, str, true);
                C12034b d = C12034b.m26139d();
                Bundle requireArguments = i.requireArguments();
                C12775o.m28638h(requireArguments, "d.requireArguments()");
                d.mo49465C(aVar.m26205e(requireArguments));
                if (function1 != null) {
                    function1.invoke(i);
                    return;
                }
                return;
            }
            C12034b.m26139d().mo49464B(C12034b.m26140e(str, true));
            if (function1 != null) {
                function1.invoke(null);
            }
        }

        /* renamed from: j */
        public final void mo49492j(AppCompatActivity appCompatActivity, String str, Function1<? super C12047o, C11921v> function1) {
            C12775o.m28639i(appCompatActivity, "activity");
            C12775o.m28639i(str, "triggeringScreen");
            C12034b.m26139d().mo49472n(new C12046n(appCompatActivity, str, function1));
        }

        /* renamed from: m */
        public final void mo49493m(AppCompatActivity appCompatActivity, String str, Function1<? super C12047o, C11921v> function1) {
            C12775o.m28639i(appCompatActivity, "activity");
            C12775o.m28639i(str, "triggeringScreen");
            C12034b.m26139d().mo49472n(new C12045m(appCompatActivity, str, function1));
        }
    }

    /* renamed from: hb.o$b */
    /* compiled from: RatingDialogFragment.kt */
    static final class C12049b extends C12777p implements Function1<C7267a, C11921v> {

        /* renamed from: g */
        final /* synthetic */ C7268b f18850g;

        /* renamed from: h */
        final /* synthetic */ C12047o f18851h;

        /* renamed from: hb.o$b$a */
        /* compiled from: RatingDialogFragment.kt */
        static final class C12050a extends C12777p implements Function1<Void, C11921v> {

            /* renamed from: g */
            final /* synthetic */ C12047o f18852g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12050a(C12047o oVar) {
                super(1);
                this.f18852g = oVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: c */
            public static final void m26222c(C12047o oVar) {
                C12775o.m28639i(oVar, "this$0");
                if (oVar.f18847i) {
                    C12034b d = C12034b.m26139d();
                    C12048a aVar = C12047o.f18841k;
                    Bundle requireArguments = oVar.requireArguments();
                    C12775o.m28638h(requireArguments, "requireArguments()");
                    d.mo49480v(aVar.m26205e(requireArguments));
                }
            }

            /* renamed from: b */
            public final void mo49495b(Void voidR) {
                new Handler().postDelayed(new C12053r(this.f18852g), 1000);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo49495b((Void) obj);
                return C11921v.f18618a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12049b(C7268b bVar, C12047o oVar) {
            super(1);
            this.f18850g = bVar;
            this.f18851h = oVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final void m26218d(C12047o oVar, Exception exc) {
            C12775o.m28639i(oVar, "this$0");
            oVar.m26179J2();
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final void m26219e(Function1 function1, Object obj) {
            C12775o.m28639i(function1, "$tmp0");
            function1.invoke(obj);
        }

        /* renamed from: c */
        public final void mo49494c(C7267a aVar) {
            C7268b bVar = this.f18850g;
            AppCompatActivity t2 = this.f18851h.f18845g;
            if (t2 == null) {
                C12775o.m28656z("activity");
                t2 = null;
            }
            bVar.mo40835a(t2, aVar).mo41421a(new C12051p(this.f18851h)).mo41423c(new C12052q(new C12050a(this.f18851h)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49494c((C7267a) obj);
            return C11921v.f18618a;
        }
    }

    public C12047o() {
        C13059a a = C13857a.f22382a.mo53543f().mo41542a("RatingDialogFragment", false);
        C12775o.m28638h(a, "AppCommonConfig.trackabl…ngDialogFragment\", false)");
        this.f18846h = a;
        this.f18847i = true;
    }

    /* renamed from: A2 */
    private final void m26170A2() {
        ((RelativeLayout) mo49491s2(C13865f.layoutRate)).setEnabled(false);
        ImageView imageView = (ImageView) mo49491s2(C13865f.imageViewSmileyBad);
        C12775o.m28638h(imageView, "imageViewSmileyBad");
        ImageView imageView2 = (ImageView) mo49491s2(C13865f.imageViewSmileyGood);
        C12775o.m28638h(imageView2, "imageViewSmileyGood");
        m26198y2(imageView, imageView2);
        new Handler().postDelayed(new C12041i(this), 800);
        C12034b d = C12034b.m26139d();
        C12048a aVar = f18841k;
        Bundle requireArguments = requireArguments();
        C12775o.m28638h(requireArguments, "requireArguments()");
        d.mo49481w(aVar.m26205e(requireArguments));
        AppCompatActivity appCompatActivity = this.f18845g;
        if (appCompatActivity == null) {
            C12775o.m28656z("activity");
            appCompatActivity = null;
        }
        new C13240e(new ContextContainer(appCompatActivity)).mo52889g(new C13390f("app_rating_bad", (String) null, (String) null));
    }

    /* access modifiers changed from: private */
    /* renamed from: B2 */
    public static final void m26171B2(C12047o oVar) {
        C12775o.m28639i(oVar, "this$0");
        CommentActivity.C11107a aVar = CommentActivity.f17250v;
        AppCompatActivity appCompatActivity = oVar.f18845g;
        AppCompatActivity appCompatActivity2 = null;
        if (appCompatActivity == null) {
            C12775o.m28656z("activity");
            appCompatActivity = null;
        }
        AppCompatActivity appCompatActivity3 = oVar.f18845g;
        if (appCompatActivity3 == null) {
            C12775o.m28656z("activity");
            appCompatActivity3 = null;
        }
        String string = appCompatActivity3.getString(R.string.rating_comment_screen_hint);
        AppCompatActivity appCompatActivity4 = oVar.f18845g;
        if (appCompatActivity4 == null) {
            C12775o.m28656z("activity");
            appCompatActivity4 = null;
        }
        Intent g = aVar.mo46200g(appCompatActivity, string, appCompatActivity4.getString(R.string.rating_comment_screen_title), UserSuggestSource.REVIEW);
        AppCompatActivity appCompatActivity5 = oVar.f18845g;
        if (appCompatActivity5 == null) {
            C12775o.m28656z("activity");
            appCompatActivity5 = null;
        }
        appCompatActivity5.startActivity(g);
        C11884a.C11885a aVar2 = C11884a.f18565e;
        AppCompatActivity appCompatActivity6 = oVar.f18845g;
        if (appCompatActivity6 == null) {
            C12775o.m28656z("activity");
        } else {
            appCompatActivity2 = appCompatActivity6;
        }
        aVar2.mo49089a(appCompatActivity2, "rating");
    }

    /* renamed from: C2 */
    private final void m26172C2() {
        C12034b.m26139d().mo49477s(C12035c.UNTIL_APP_UPDATE);
        ((RelativeLayout) mo49491s2(C13865f.layoutRate)).setEnabled(false);
        ImageView imageView = (ImageView) mo49491s2(C13865f.imageViewSmileyGood);
        C12775o.m28638h(imageView, "imageViewSmileyGood");
        ImageView imageView2 = (ImageView) mo49491s2(C13865f.imageViewSmileyBad);
        C12775o.m28638h(imageView2, "imageViewSmileyBad");
        m26198y2(imageView, imageView2);
        new Handler().postDelayed(new C12040h(this), 800);
        C12034b d = C12034b.m26139d();
        C12048a aVar = f18841k;
        Bundle requireArguments = requireArguments();
        C12775o.m28638h(requireArguments, "requireArguments()");
        d.mo49482x(aVar.m26205e(requireArguments));
        AppCompatActivity appCompatActivity = this.f18845g;
        if (appCompatActivity == null) {
            C12775o.m28656z("activity");
            appCompatActivity = null;
        }
        new C13240e(new ContextContainer(appCompatActivity)).mo52889g(new C13390f("app_rating_good", (String) null, (String) null));
    }

    /* access modifiers changed from: private */
    /* renamed from: D2 */
    public static final void m26173D2(C12047o oVar) {
        C12775o.m28639i(oVar, "this$0");
        RelativeLayout relativeLayout = (RelativeLayout) oVar.mo49491s2(C13865f.layoutRate);
        if (relativeLayout != null) {
            C12139g.m26475d(relativeLayout, false, 0, 2, (Object) null);
        }
        oVar.m26180K2();
        new Handler().postDelayed(new C12042j(oVar), 1000);
    }

    /* access modifiers changed from: private */
    /* renamed from: E2 */
    public static final void m26174E2(C12047o oVar) {
        C12775o.m28639i(oVar, "this$0");
        RelativeLayout relativeLayout = (RelativeLayout) oVar.mo49491s2(C13865f.layoutRate);
        if (relativeLayout != null) {
            C12139g.m26475d(relativeLayout, false, 0, 2, (Object) null);
        }
        oVar.m26184N2();
    }

    /* access modifiers changed from: private */
    /* renamed from: F2 */
    public static final void m26175F2(C12047o oVar, View view) {
        C12775o.m28639i(oVar, "this$0");
        oVar.m26170A2();
    }

    /* access modifiers changed from: private */
    /* renamed from: G2 */
    public static final void m26176G2(C12047o oVar, View view) {
        C12775o.m28639i(oVar, "this$0");
        oVar.m26172C2();
    }

    /* access modifiers changed from: private */
    /* renamed from: H2 */
    public static final void m26177H2(C12047o oVar, View view) {
        C12775o.m28639i(oVar, "this$0");
        oVar.m26199z2();
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public static final void m26178I2(C12047o oVar, View view) {
        C12775o.m28639i(oVar, "this$0");
        oVar.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public final void m26179J2() {
        C12034b d = C12034b.m26139d();
        C12048a aVar = f18841k;
        Bundle requireArguments = requireArguments();
        C12775o.m28638h(requireArguments, "requireArguments()");
        d.mo49483z(aVar.m26205e(requireArguments));
        C13861e a = C13861e.f22396e.mo53556a();
        AppCompatActivity appCompatActivity = this.f18845g;
        if (appCompatActivity == null) {
            C12775o.m28656z("activity");
            appCompatActivity = null;
        }
        a.mo53552i(appCompatActivity);
    }

    /* renamed from: K2 */
    private final void m26180K2() {
        AppCompatActivity appCompatActivity = this.f18845g;
        if (appCompatActivity == null) {
            C12775o.m28656z("activity");
            appCompatActivity = null;
        }
        C7268b a = C7269c.m14100a(appCompatActivity);
        C12775o.m28638h(a, "create(activity)");
        a.mo40836b().mo41423c(new C12043k(new C12049b(a, this))).mo41421a(new C12044l(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: L2 */
    public static final void m26181L2(Function1 function1, Object obj) {
        C12775o.m28639i(function1, "$tmp0");
        function1.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: M2 */
    public static final void m26182M2(C12047o oVar, Exception exc) {
        C12775o.m28639i(oVar, "this$0");
        oVar.m26179J2();
    }

    /* renamed from: N2 */
    private final void m26184N2() {
        RelativeLayout relativeLayout;
        if (!isHidden() && !isDetached() && !isRemoving() && !this.f18847i) {
            RelativeLayout relativeLayout2 = (RelativeLayout) mo49491s2(C13865f.layoutRate);
            C12775o.m28638h(relativeLayout2, "layoutRate");
            if (!C12139g.m26473b(relativeLayout2) && (relativeLayout = (RelativeLayout) mo49491s2(C13865f.layoutThanks)) != null) {
                C12139g.m26475d(relativeLayout, true, 0, 2, (Object) null);
            }
        }
    }

    /* renamed from: y2 */
    private final void m26198y2(View view, View view2) {
        view2.animate().scaleX(0.0f).scaleY(0.0f).setDuration(100).start();
        view.animate().scaleX(1.7f).scaleY(1.7f).setDuration(200).start();
        ViewPropertyAnimator animate = ((ImageView) mo49491s2(C13865f.imageViewSmileyBad)).animate();
        AppCompatActivity appCompatActivity = this.f18845g;
        AppCompatActivity appCompatActivity2 = null;
        if (appCompatActivity == null) {
            C12775o.m28656z("activity");
            appCompatActivity = null;
        }
        ViewPropertyAnimator translationX = animate.translationX((float) C12136d.m26463e(appCompatActivity, 55));
        AppCompatActivity appCompatActivity3 = this.f18845g;
        if (appCompatActivity3 == null) {
            C12775o.m28656z("activity");
            appCompatActivity3 = null;
        }
        translationX.translationY((float) C12136d.m26463e(appCompatActivity3, 30)).setDuration(200).start();
        ViewPropertyAnimator animate2 = ((ImageView) mo49491s2(C13865f.imageViewSmileyGood)).animate();
        AppCompatActivity appCompatActivity4 = this.f18845g;
        if (appCompatActivity4 == null) {
            C12775o.m28656z("activity");
            appCompatActivity4 = null;
        }
        ViewPropertyAnimator translationX2 = animate2.translationX((float) C12136d.m26463e(appCompatActivity4, -55));
        AppCompatActivity appCompatActivity5 = this.f18845g;
        if (appCompatActivity5 == null) {
            C12775o.m28656z("activity");
        } else {
            appCompatActivity2 = appCompatActivity5;
        }
        translationX2.translationY((float) C12136d.m26463e(appCompatActivity2, 30)).setDuration(200).start();
        ((Button) mo49491s2(C13865f.buttonBad)).animate().alpha(0.0f).setDuration(200).start();
        ((Button) mo49491s2(C13865f.buttonGood)).animate().alpha(0.0f).setDuration(200).start();
        ((Button) mo49491s2(C13865f.buttonClose)).animate().alpha(0.0f).setDuration(200).start();
    }

    /* renamed from: z2 */
    private final void m26199z2() {
        dismiss();
        C12034b d = C12034b.m26139d();
        C12048a aVar = f18841k;
        Bundle requireArguments = requireArguments();
        C12775o.m28638h(requireArguments, "requireArguments()");
        d.mo49479u(aVar.m26205e(requireArguments));
    }

    public void onAttach(Activity activity) {
        C12775o.m28639i(activity, "activity");
        super.onAttach(activity);
        this.f18845g = (AppCompatActivity) activity;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C12775o.m28639i(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.rating_dialog, viewGroup);
    }

    public void onPause() {
        super.onPause();
        this.f18847i = true;
    }

    public void onResume() {
        super.onResume();
        this.f18847i = false;
        m26184N2();
    }

    public void onStart() {
        super.onStart();
        C13059a aVar = this.f18846h;
        AppCompatActivity appCompatActivity = this.f18845g;
        if (appCompatActivity == null) {
            C12775o.m28656z("activity");
            appCompatActivity = null;
        }
        aVar.mo50959a(new ContextContainer(appCompatActivity));
    }

    public void onViewCreated(View view, Bundle bundle) {
        C12775o.m28639i(view, "view");
        super.onViewCreated(view, bundle);
        C12034b d = C12034b.m26139d();
        C12048a aVar = f18841k;
        Bundle requireArguments = requireArguments();
        C12775o.m28638h(requireArguments, "requireArguments()");
        d.mo49463A(aVar.m26205e(requireArguments));
        RelativeLayout relativeLayout = (RelativeLayout) mo49491s2(C13865f.layoutRate);
        C12775o.m28638h(relativeLayout, "layoutRate");
        C12139g.m26475d(relativeLayout, true, 0, 2, (Object) null);
        RelativeLayout relativeLayout2 = (RelativeLayout) mo49491s2(C13865f.layoutThanks);
        C12775o.m28638h(relativeLayout2, "layoutThanks");
        C12139g.m26475d(relativeLayout2, false, 0, 2, (Object) null);
        ((Button) mo49491s2(C13865f.buttonBad)).setOnClickListener(new C12036d(this));
        ((Button) mo49491s2(C13865f.buttonGood)).setOnClickListener(new C12037e(this));
        ((Button) mo49491s2(C13865f.buttonClose)).setOnClickListener(new C12038f(this));
        ((Button) mo49491s2(C13865f.buttonCloseThanks)).setOnClickListener(new C12039g(this));
        C12034b d2 = C12034b.m26139d();
        Bundle requireArguments2 = requireArguments();
        C12775o.m28638h(requireArguments2, "requireArguments()");
        d2.mo49466f(aVar.m26206f(requireArguments2));
        Bundle requireArguments3 = requireArguments();
        C12775o.m28638h(requireArguments3, "requireArguments()");
        if (aVar.m26206f(requireArguments3)) {
            C12034b.m26139d().mo49477s(C12035c.UNTIL_NEW_EARNINGS);
            C12034b.m26139d().mo49474p();
        }
    }

    /* renamed from: s2 */
    public View mo49491s2(int i) {
        View findViewById;
        Map<Integer, View> map = this.f18848j;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }
}
