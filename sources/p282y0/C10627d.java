package p282y0;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import com.appboy.enums.Channel;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p018a0.C2108f;
import p069e0.C7358a;
import p069e0.C7359b;
import p081f0.C7554a;
import p126j0.C8233a;
import p126j0.C8266c;
import p126j0.C8272d;
import p136k0.C8429a;
import p146l0.C8620b;
import p146l0.C8622c;
import p238u0.C9783d;
import p270x.C10156b;
import p404of.C13074a;

/* renamed from: y0.d */
/* compiled from: DefaultInAppMessageWebViewClientListener.kt */
public class C10627d implements C10642h {
    public static final C10628a Companion = new C10628a((DefaultConstructorMarker) null);
    private static final String HTML_IN_APP_MESSAGE_CUSTOM_EVENT_NAME_KEY = "name";

    /* renamed from: y0.d$a */
    /* compiled from: DefaultInAppMessageWebViewClientListener.kt */
    public static final class C10628a {
        private C10628a() {
        }

        public /* synthetic */ C10628a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @VisibleForTesting
        /* renamed from: a */
        public final void mo45572a(C7358a aVar, Bundle bundle) {
            C12775o.m28639i(aVar, "inAppMessage");
            C12775o.m28639i(bundle, "queryBundle");
            if (bundle.containsKey("abButtonId")) {
                C7359b bVar = (C7359b) aVar;
                String string = bundle.getString("abButtonId");
                if (string != null) {
                    bVar.mo40972Q(string);
                }
            } else if (aVar.mo40944I() == C2108f.HTML_FULL) {
                aVar.logClick();
            }
        }

        @VisibleForTesting
        /* renamed from: b */
        public final String mo45573b(Bundle bundle) {
            C12775o.m28639i(bundle, "queryBundle");
            return bundle.getString("name");
        }

        @VisibleForTesting
        /* renamed from: c */
        public final C7554a mo45574c(Bundle bundle) {
            boolean z;
            C12775o.m28639i(bundle, "queryBundle");
            C7554a aVar = new C7554a();
            for (String next : bundle.keySet()) {
                if (!C12775o.m28634d(next, "name")) {
                    String string = bundle.getString(next, (String) null);
                    if (string == null || C13754v.m31532t(string)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        C12775o.m28638h(next, "key");
                        aVar.mo41299a(next, string);
                    }
                }
            }
            return aVar;
        }

        @VisibleForTesting
        /* renamed from: d */
        public final boolean mo45575d(C7358a aVar, Bundle bundle) {
            boolean z;
            boolean z2;
            boolean z3;
            C12775o.m28639i(aVar, "inAppMessage");
            C12775o.m28639i(bundle, "queryBundle");
            boolean z4 = true;
            if (bundle.containsKey("abDeepLink")) {
                z2 = Boolean.parseBoolean(bundle.getString("abDeepLink"));
                z = true;
            } else {
                z2 = false;
                z = false;
            }
            if (bundle.containsKey("abExternalOpen")) {
                z3 = Boolean.parseBoolean(bundle.getString("abExternalOpen"));
                z = true;
            } else {
                z3 = false;
            }
            boolean openUriInWebView = aVar.getOpenUriInWebView();
            if (!z) {
                return openUriInWebView;
            }
            if (z2 || z3) {
                z4 = false;
            }
            return z4;
        }
    }

    /* renamed from: y0.d$b */
    /* compiled from: DefaultInAppMessageWebViewClientListener.kt */
    static final class C10629b extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10629b f16184g = new C10629b();

        C10629b() {
            super(0);
        }

        public final String invoke() {
            return "IInAppMessageWebViewClientListener.onCloseAction called.";
        }
    }

    /* renamed from: y0.d$c */
    /* compiled from: DefaultInAppMessageWebViewClientListener.kt */
    static final class C10630c extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10630c f16185g = new C10630c();

        C10630c() {
            super(0);
        }

        public final String invoke() {
            return "IInAppMessageWebViewClientListener.onCustomEventAction called.";
        }
    }

    /* renamed from: y0.d$d */
    /* compiled from: DefaultInAppMessageWebViewClientListener.kt */
    static final class C10631d extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10631d f16186g = new C10631d();

        C10631d() {
            super(0);
        }

        public final String invoke() {
            return "Can't perform custom event action because the activity is null.";
        }
    }

    /* renamed from: y0.d$e */
    /* compiled from: DefaultInAppMessageWebViewClientListener.kt */
    static final class C10632e extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10632e f16187g = new C10632e();

        C10632e() {
            super(0);
        }

        public final String invoke() {
            return "IInAppMessageWebViewClientListener.onNewsfeedAction called.";
        }
    }

    /* renamed from: y0.d$f */
    /* compiled from: DefaultInAppMessageWebViewClientListener.kt */
    static final class C10633f extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10633f f16188g = new C10633f();

        C10633f() {
            super(0);
        }

        public final String invoke() {
            return "Can't perform news feed action because the cached activity is null.";
        }
    }

    /* renamed from: y0.d$g */
    /* compiled from: DefaultInAppMessageWebViewClientListener.kt */
    static final class C10634g extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C10634g f16189g = new C10634g();

        C10634g() {
            super(0);
        }

        public final String invoke() {
            return "IInAppMessageWebViewClientListener.onOtherUrlAction called.";
        }
    }

    /* renamed from: y0.d$h */
    /* compiled from: DefaultInAppMessageWebViewClientListener.kt */
    static final class C10635h extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f16190g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10635h(String str) {
            super(0);
            this.f16190g = str;
        }

        public final String invoke() {
            return C12775o.m28647q("Can't perform other url action because the cached activity is null. Url: ", this.f16190g);
        }
    }

    /* renamed from: y0.d$i */
    /* compiled from: DefaultInAppMessageWebViewClientListener.kt */
    static final class C10636i extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f16191g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10636i(String str) {
            super(0);
            this.f16191g = str;
        }

        public final String invoke() {
            return C12775o.m28647q("HTML message action listener handled url in onOtherUrlAction. Doing nothing further. Url: ", this.f16191g);
        }
    }

    /* renamed from: y0.d$j */
    /* compiled from: DefaultInAppMessageWebViewClientListener.kt */
    static final class C10637j extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f16192g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10637j(String str) {
            super(0);
            this.f16192g = str;
        }

        public final String invoke() {
            return C12775o.m28647q("UriAction is null. Not passing any URI to BrazeDeeplinkHandler. Url: ", this.f16192g);
        }
    }

    /* renamed from: y0.d$k */
    /* compiled from: DefaultInAppMessageWebViewClientListener.kt */
    static final class C10638k extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ Uri f16193g;

        /* renamed from: h */
        final /* synthetic */ String f16194h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10638k(Uri uri, String str) {
            super(0);
            this.f16193g = uri;
            this.f16194h = str;
        }

        public final String invoke() {
            return "Not passing local uri to BrazeDeeplinkHandler. Got local uri: " + this.f16193g + " for url: " + this.f16194h;
        }
    }

    private final C9783d getInAppMessageManager() {
        return C9783d.f14623G.mo44312a();
    }

    @VisibleForTesting
    public static final void logHtmlInAppMessageClick(C7358a aVar, Bundle bundle) {
        Companion.mo45572a(aVar, bundle);
    }

    @VisibleForTesting
    public static final String parseCustomEventNameFromQueryBundle(Bundle bundle) {
        return Companion.mo45573b(bundle);
    }

    @VisibleForTesting
    public static final C7554a parsePropertiesFromQueryBundle(Bundle bundle) {
        return Companion.mo45574c(bundle);
    }

    @VisibleForTesting
    public static final boolean parseUseWebViewFromQueryBundle(C7358a aVar, Bundle bundle) {
        return Companion.mo45575d(aVar, bundle);
    }

    public void onCloseAction(C7358a aVar, String str, Bundle bundle) {
        C12775o.m28639i(aVar, "inAppMessage");
        C12775o.m28639i(str, "url");
        C12775o.m28639i(bundle, "queryBundle");
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C10629b.f16184g, 7, (Object) null);
        Companion.mo45572a(aVar, bundle);
        getInAppMessageManager().mo44302B(true);
        getInAppMessageManager().mo44379g().mo45577b(aVar, str, bundle);
    }

    public void onCustomEventAction(C7358a aVar, String str, Bundle bundle) {
        boolean z;
        C12775o.m28639i(aVar, "inAppMessage");
        C12775o.m28639i(str, "url");
        C12775o.m28639i(bundle, "queryBundle");
        C8266c cVar = C8266c.f11641a;
        C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, C10630c.f16185g, 7, (Object) null);
        if (getInAppMessageManager().mo44373a() == null) {
            C8266c.m16396e(cVar, this, C8266c.C8267a.f11651g, (Throwable) null, false, C10631d.f16186g, 6, (Object) null);
        } else if (!getInAppMessageManager().mo44379g().mo45578c(aVar, str, bundle)) {
            C10628a aVar2 = Companion;
            String b = aVar2.mo45573b(bundle);
            if (b == null || C13754v.m31532t(b)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                C7554a c = aVar2.mo45574c(bundle);
                Activity a = getInAppMessageManager().mo44373a();
                if (a != null) {
                    C10156b.f15345m.mo44811g(a).mo44776V(b, c);
                }
            }
        }
    }

    public void onNewsfeedAction(C7358a aVar, String str, Bundle bundle) {
        C12775o.m28639i(aVar, "inAppMessage");
        C12775o.m28639i(str, "url");
        C12775o.m28639i(bundle, "queryBundle");
        C8266c cVar = C8266c.f11641a;
        C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, C10632e.f16187g, 7, (Object) null);
        if (getInAppMessageManager().mo44373a() == null) {
            C8266c.m16396e(cVar, this, C8266c.C8267a.f11651g, (Throwable) null, false, C10633f.f16188g, 6, (Object) null);
            return;
        }
        Companion.mo45572a(aVar, bundle);
        if (!getInAppMessageManager().mo44379g().mo45576a(aVar, str, bundle)) {
            aVar.mo40945J(false);
            getInAppMessageManager().mo44302B(false);
            C8620b bVar = new C8620b(C8272d.m16426a(aVar.getExtras()), Channel.INAPP_MESSAGE);
            Activity a = getInAppMessageManager().mo44373a();
            if (a != null) {
                C8429a.f12015a.mo42456a().mo42452b(a, bVar);
            }
        }
    }

    public void onOtherUrlAction(C7358a aVar, String str, Bundle bundle) {
        C12775o.m28639i(aVar, "inAppMessage");
        C12775o.m28639i(str, "url");
        C12775o.m28639i(bundle, "queryBundle");
        C8266c cVar = C8266c.f11641a;
        C8266c.m16396e(cVar, this, (C8266c.C8267a) null, (Throwable) null, false, C10634g.f16189g, 7, (Object) null);
        if (getInAppMessageManager().mo44373a() == null) {
            C8266c.m16396e(cVar, this, C8266c.C8267a.f11651g, (Throwable) null, false, new C10635h(str), 6, (Object) null);
            return;
        }
        C10628a aVar2 = Companion;
        aVar2.mo45572a(aVar, bundle);
        if (getInAppMessageManager().mo44379g().onOtherUrlAction(aVar, str, bundle)) {
            C8266c.m16396e(cVar, this, C8266c.C8267a.f11650f, (Throwable) null, false, new C10636i(str), 6, (Object) null);
            return;
        }
        boolean d = aVar2.mo45575d(aVar, bundle);
        Bundle a = C8272d.m16426a(aVar.getExtras());
        a.putAll(bundle);
        C8429a.C8430a aVar3 = C8429a.f12015a;
        C8622c c = aVar3.mo42456a().mo42453c(str, a, d, Channel.INAPP_MESSAGE);
        if (c == null) {
            C8266c.m16396e(cVar, this, C8266c.C8267a.f11651g, (Throwable) null, false, new C10637j(str), 6, (Object) null);
            return;
        }
        Uri f = c.mo42707f();
        if (C8233a.m16343e(f)) {
            C8266c.m16396e(cVar, this, C8266c.C8267a.f11651g, (Throwable) null, false, new C10638k(f, str), 6, (Object) null);
            return;
        }
        aVar.mo40945J(false);
        getInAppMessageManager().mo44302B(false);
        Activity a2 = getInAppMessageManager().mo44373a();
        if (a2 != null) {
            aVar3.mo42456a().mo42454d(a2, c);
        }
    }
}
