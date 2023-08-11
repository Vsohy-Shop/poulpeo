package p395nc;

import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.rmn.api.p322v2.main.debug.AbstractDebugRequestMapper;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import p336ef.C11921v;
import p395nc.C12994g;

/* renamed from: nc.d */
/* compiled from: SignInWebViewClient.kt */
public final class C12988d extends WebViewClient {

    /* renamed from: c */
    public static final C12989a f20787c = new C12989a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C12982a f20788a;

    /* renamed from: b */
    private final Function1<C12994g, C11921v> f20789b;

    /* renamed from: nc.d$a */
    /* compiled from: SignInWebViewClient.kt */
    public static final class C12989a {
        private C12989a() {
        }

        public /* synthetic */ C12989a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C12988d(C12982a aVar, Function1<? super C12994g, C11921v> function1) {
        C12775o.m28639i(aVar, "attempt");
        C12775o.m28639i(function1, "callback");
        this.f20788a = aVar;
        this.f20789b = function1;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m29354b(C12988d dVar, String str) {
        C12775o.m28639i(dVar, "this$0");
        dVar.m29355c(str);
    }

    /* renamed from: c */
    private final void m29355c(String str) {
        boolean z;
        try {
            C12775o.m28636f(str);
            JSONObject jSONObject = new JSONObject(C13755w.m31586l0(C13755w.m31585k0(C13754v.m31521A(str, "\\\"", AbstractDebugRequestMapper.QUOTE, false, 4, (Object) null), AbstractDebugRequestMapper.QUOTE), AbstractDebugRequestMapper.QUOTE));
            String optString = jSONObject.optString("state");
            String optString2 = jSONObject.optString("id_token");
            C12775o.m28638h(optString2, "idToken");
            if (optString2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f20789b.invoke(new C12994g.C12996b("Id token not returned"));
            } else if (!C12775o.m28634d(optString, this.f20788a.mo50890c())) {
                this.f20789b.invoke(new C12994g.C12996b("State does not match"));
            } else {
                this.f20789b.invoke(new C12994g.C12997c(optString2));
            }
        } catch (Exception unused) {
            Function1<C12994g, C11921v> function1 = this.f20789b;
            function1.invoke(new C12994g.C12996b("Wrong JSON structure for Apple sign in callback url : " + str));
        }
    }

    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        Uri parse;
        if (webView != null && str != null && (parse = Uri.parse(str)) != null && !C12775o.m28634d(parse.getHost(), "appleid.apple.com")) {
            if (!C12775o.m28634d(parse.toString(), this.f20788a.mo50889b())) {
                this.f20789b.invoke(new C12994g.C12996b("Forbidden url for Apple login"));
                return;
            }
            webView.evaluateJavascript("document.documentElement.innerText", new C12987c(this));
            webView.setVisibility(4);
        }
    }
}
