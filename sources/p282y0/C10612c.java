package p282y0;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.appboy.enums.Channel;
import com.braze.support.BrazeFunctionNotImplemented;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p018a0.C2102a;
import p069e0.C7358a;
import p069e0.C7359b;
import p069e0.C7360c;
import p069e0.C7416r;
import p126j0.C8233a;
import p126j0.C8266c;
import p126j0.C8272d;
import p126j0.C8316l;
import p136k0.C8429a;
import p146l0.C8620b;
import p146l0.C8622c;
import p238u0.C9783d;
import p238u0.C9862p;
import p281y.C10606a;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13074a;
import p404of.C13088o;
import p466yf.C13995l0;
import p466yf.C14004n0;
import p466yf.C14054y1;

/* renamed from: y0.c */
/* compiled from: DefaultInAppMessageViewLifecycleListener.kt */
public class C10612c implements C10641g {

    /* renamed from: y0.c$a */
    /* compiled from: DefaultInAppMessageViewLifecycleListener.kt */
    public /* synthetic */ class C10613a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16170a;

        static {
            int[] iArr = new int[C2102a.values().length];
            iArr[C2102a.NEWS_FEED.ordinal()] = 1;
            iArr[C2102a.URI.ordinal()] = 2;
            iArr[C2102a.NONE.ordinal()] = 3;
            f16170a = iArr;
        }
    }

    /* renamed from: y0.c$b */
    /* compiled from: DefaultInAppMessageViewLifecycleListener.kt */
    static final class C10614b extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10614b f16171g = new C10614b();

        C10614b() {
            super(0);
        }

        public final String invoke() {
            return "IInAppMessageViewLifecycleListener.afterClosed called.";
        }
    }

    /* renamed from: y0.c$c */
    /* compiled from: DefaultInAppMessageViewLifecycleListener.kt */
    static final class C10615c extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10615c f16172g = new C10615c();

        C10615c() {
            super(0);
        }

        public final String invoke() {
            return "IInAppMessageViewLifecycleListener.afterOpened called.";
        }
    }

    /* renamed from: y0.c$d */
    /* compiled from: DefaultInAppMessageViewLifecycleListener.kt */
    static final class C10616d extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10616d f16173g = new C10616d();

        C10616d() {
            super(0);
        }

        public final String invoke() {
            return "IInAppMessageViewLifecycleListener.beforeClosed called.";
        }
    }

    /* renamed from: y0.c$e */
    /* compiled from: DefaultInAppMessageViewLifecycleListener.kt */
    static final class C10617e extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10617e f16174g = new C10617e();

        C10617e() {
            super(0);
        }

        public final String invoke() {
            return "IInAppMessageViewLifecycleListener.beforeOpened called.";
        }
    }

    /* renamed from: y0.c$f */
    /* compiled from: DefaultInAppMessageViewLifecycleListener.kt */
    static final class C10618f extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10618f f16175g = new C10618f();

        C10618f() {
            super(0);
        }

        public final String invoke() {
            return "IInAppMessageViewLifecycleListener.onButtonClicked called.";
        }
    }

    /* renamed from: y0.c$g */
    /* compiled from: DefaultInAppMessageViewLifecycleListener.kt */
    static final class C10619g extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10619g f16176g = new C10619g();

        C10619g() {
            super(0);
        }

        public final String invoke() {
            return "IInAppMessageViewLifecycleListener.onClicked called.";
        }
    }

    /* renamed from: y0.c$h */
    /* compiled from: DefaultInAppMessageViewLifecycleListener.kt */
    static final class C10620h extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10620h f16177g = new C10620h();

        C10620h() {
            super(0);
        }

        public final String invoke() {
            return "Deprecated onInAppMessageClicked(inAppMessage, inAppMessageCloser) called.";
        }
    }

    /* renamed from: y0.c$i */
    /* compiled from: DefaultInAppMessageViewLifecycleListener.kt */
    static final class C10621i extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10621i f16178g = new C10621i();

        C10621i() {
            super(0);
        }

        public final String invoke() {
            return "Using non-deprecated onInAppMessageClicked(inAppMessage)";
        }
    }

    /* renamed from: y0.c$j */
    /* compiled from: DefaultInAppMessageViewLifecycleListener.kt */
    static final class C10622j extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10622j f16179g = new C10622j();

        C10622j() {
            super(0);
        }

        public final String invoke() {
            return "IInAppMessageViewLifecycleListener.onDismissed called.";
        }
    }

    /* renamed from: y0.c$k */
    /* compiled from: DefaultInAppMessageViewLifecycleListener.kt */
    static final class C10623k extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10623k f16180g = new C10623k();

        C10623k() {
            super(0);
        }

        public final String invoke() {
            return "Can't perform click action because the cached activity is null.";
        }
    }

    /* renamed from: y0.c$l */
    /* compiled from: DefaultInAppMessageViewLifecycleListener.kt */
    static final class C10624l extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10624l f16181g = new C10624l();

        C10624l() {
            super(0);
        }

        public final String invoke() {
            return "clickUri is null, not performing click action";
        }
    }

    /* renamed from: y0.c$m */
    /* compiled from: DefaultInAppMessageViewLifecycleListener.kt */
    static final class C10625m extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10625m f16182g = new C10625m();

        C10625m() {
            super(0);
        }

        public final String invoke() {
            return "appContext is null, not performing click action";
        }
    }

    @C12739f(mo50609c = "com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener$startClearHtmlInAppMessageAssetsThread$1", mo50610f = "DefaultInAppMessageViewLifecycleListener.kt", mo50611l = {}, mo50612m = "invokeSuspend")
    /* renamed from: y0.c$n */
    /* compiled from: DefaultInAppMessageViewLifecycleListener.kt */
    static final class C10626n extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {

        /* renamed from: h */
        int f16183h;

        C10626n(C12074d<? super C10626n> dVar) {
            super(2, dVar);
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C10626n(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C12150d.m26492c();
            if (this.f16183h == 0) {
                C11910n.m25701b(obj);
                Activity a = C9783d.f14623G.mo44312a().mo44373a();
                if (a != null) {
                    C8233a.m16339a(C8316l.m16517a(a));
                }
                return C11921v.f18618a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
            return ((C10626n) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    /* renamed from: h */
    private final C9783d m22562h() {
        return C9783d.f14623G.mo44312a();
    }

    /* renamed from: i */
    private final void m22563i(C2102a aVar, C7358a aVar2, C9862p pVar, Uri uri, boolean z) {
        Activity a = m22562h().mo44373a();
        if (a == null) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C10623k.f16180g, 6, (Object) null);
            return;
        }
        int i = C10613a.f16170a[aVar.ordinal()];
        if (i == 1) {
            pVar.mo44372a(false);
            C8429a.f12015a.mo42456a().mo42452b(a, new C8620b(C8272d.m16426a(aVar2.getExtras()), Channel.INAPP_MESSAGE));
        } else if (i == 2) {
            pVar.mo44372a(false);
            if (uri == null) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C10624l.f16181g, 7, (Object) null);
                return;
            }
            C8429a.C8430a aVar3 = C8429a.f12015a;
            C8622c e = aVar3.mo42456a().mo42455e(uri, C8272d.m16426a(aVar2.getExtras()), z, Channel.INAPP_MESSAGE);
            Context b = m22562h().mo44374b();
            if (b == null) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C10625m.f16182g, 7, (Object) null);
                return;
            }
            aVar3.mo42456a().mo42454d(b, e);
        } else if (i != 3) {
            pVar.mo44372a(false);
        } else {
            pVar.mo44372a(aVar2.mo40949N());
        }
    }

    /* renamed from: j */
    private final void m22564j(C7416r rVar, C7358a aVar, C9862p pVar) {
        m22563i(rVar.mo41059b0(), aVar, pVar, rVar.mo41061d0(), rVar.mo41065x());
    }

    /* renamed from: k */
    private final void m22565k(C7358a aVar, C9862p pVar) {
        m22563i(aVar.mo40959b0(), aVar, pVar, aVar.mo40960d0(), aVar.getOpenUriInWebView());
    }

    /* renamed from: l */
    private final void m22566l() {
        C14054y1 unused = C13985j.m32422d(C10606a.f16162b, (C12079g) null, (C14004n0) null, new C10626n((C12074d<? super C10626n>) null), 3, (Object) null);
    }

    /* renamed from: a */
    public void mo45560a(View view, C7358a aVar) {
        C12775o.m28639i(view, "inAppMessageView");
        C12775o.m28639i(aVar, "inAppMessage");
        m22562h().mo44381i().mo45582c(view, aVar);
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C10617e.f16174g, 7, (Object) null);
        aVar.logImpression();
    }

    /* renamed from: b */
    public void mo45561b(View view, C7358a aVar) {
        C12775o.m28639i(view, "inAppMessageView");
        C12775o.m28639i(aVar, "inAppMessage");
        m22562h().mo44381i().mo45580a(view, aVar);
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C10616d.f16173g, 7, (Object) null);
    }

    /* renamed from: c */
    public void mo45562c(C7358a aVar) {
        C12775o.m28639i(aVar, "inAppMessage");
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C10614b.f16171g, 7, (Object) null);
        m22562h().mo44305E();
        if (aVar instanceof C7359b) {
            m22566l();
        }
        aVar.mo40954V();
        m22562h().mo44381i().mo45585f(aVar);
    }

    /* renamed from: d */
    public void mo45563d(C9862p pVar, C7416r rVar, C7360c cVar) {
        boolean z;
        C12775o.m28639i(pVar, "inAppMessageCloser");
        C12775o.m28639i(rVar, "messageButton");
        C12775o.m28639i(cVar, "inAppMessageImmersive");
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C10618f.f16175g, 7, (Object) null);
        cVar.mo40974F(rVar);
        try {
            z = m22562h().mo44381i().mo45586g(cVar, rVar, pVar);
        } catch (BrazeFunctionNotImplemented unused) {
            z = m22562h().mo44381i().mo45584e(cVar, rVar);
        }
        if (!z) {
            m22564j(rVar, cVar, pVar);
        }
    }

    /* renamed from: e */
    public void mo45564e(C9862p pVar, View view, C7358a aVar) {
        boolean z;
        C9862p pVar2 = pVar;
        C7358a aVar2 = aVar;
        C12775o.m28639i(pVar2, "inAppMessageCloser");
        C12775o.m28639i(view, "inAppMessageView");
        C12775o.m28639i(aVar2, "inAppMessage");
        C8266c cVar = C8266c.f11641a;
        C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, C10619g.f16176g, 7, (Object) null);
        aVar.logClick();
        try {
            z = m22562h().mo44381i().mo45587i(aVar2, pVar2);
            C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, C10620h.f16177g, 7, (Object) null);
        } catch (BrazeFunctionNotImplemented unused) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C10621i.f16178g, 7, (Object) null);
            z = m22562h().mo44381i().mo45583d(aVar2);
        }
        if (!z) {
            m22565k(aVar2, pVar2);
        }
    }

    /* renamed from: f */
    public void mo45565f(View view, C7358a aVar) {
        C12775o.m28639i(view, "inAppMessageView");
        C12775o.m28639i(aVar, "inAppMessage");
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C10615c.f16172g, 7, (Object) null);
        m22562h().mo44381i().mo45581b(view, aVar);
    }

    /* renamed from: g */
    public void mo45566g(View view, C7358a aVar) {
        C12775o.m28639i(view, "inAppMessageView");
        C12775o.m28639i(aVar, "inAppMessage");
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C10622j.f16179g, 7, (Object) null);
        m22562h().mo44381i().mo45588j(aVar);
    }
}
