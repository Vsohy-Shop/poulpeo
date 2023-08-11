package p021a3;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.facebook.C4509a;
import com.facebook.C4537e;
import com.facebook.C4550k;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookSdk;
import com.facebook.FacebookServiceException;
import java.util.Locale;
import p021a3.C2166l;
import p198q2.C9138d0;

/* renamed from: a3.w */
/* compiled from: WebLoginMethodHandler */
abstract class C2195w extends C2188q {

    /* renamed from: d */
    private String f967d;

    C2195w(C2166l lVar) {
        super(lVar);
    }

    /* renamed from: A */
    private void m1740A(String str) {
        this.f956c.mo23381i().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", str).apply();
    }

    /* renamed from: y */
    private String m1741y() {
        return this.f956c.mo23381i().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "");
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public Bundle mo23478q(Bundle bundle, C2166l.C2170d dVar) {
        String str;
        bundle.putString("redirect_uri", mo23280v());
        if (dVar.mo23413p()) {
            bundle.putString("app_id", dVar.mo23398a());
        } else {
            bundle.putString("client_id", dVar.mo23398a());
        }
        bundle.putString("e2e", C2166l.m1597l());
        if (dVar.mo23413p()) {
            bundle.putString("response_type", "token,signed_request,graph_domain,granted_scopes");
        } else if (dVar.mo23409l().contains("openid")) {
            bundle.putString("response_type", "id_token,token,signed_request,graph_domain");
            bundle.putString("nonce", dVar.mo23408k());
        } else {
            bundle.putString("response_type", "token,signed_request,graph_domain");
        }
        bundle.putString("return_scopes", "true");
        bundle.putString("auth_type", dVar.mo23400c());
        bundle.putString("login_behavior", dVar.mo23405g().name());
        bundle.putString("sdk", String.format(Locale.ROOT, "android-%s", new Object[]{FacebookSdk.getSdkVersion()}));
        if (mo23281w() != null) {
            bundle.putString("sso", mo23281w());
        }
        String str2 = "1";
        if (FacebookSdk.hasCustomTabsPrefetching) {
            str = str2;
        } else {
            str = "0";
        }
        bundle.putString("cct_prefetching", str);
        if (dVar.mo23412o()) {
            bundle.putString("fx_app", dVar.mo23406h().toString());
        }
        if (dVar.mo23397A()) {
            bundle.putString("skip_dedupe", "true");
        }
        if (dVar.mo23407i() != null) {
            bundle.putString("messenger_page_id", dVar.mo23407i());
            if (!dVar.mo23410m()) {
                str2 = "0";
            }
            bundle.putString("reset_messenger_state", str2);
        }
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public Bundle mo23479s(C2166l.C2170d dVar) {
        String str;
        Bundle bundle = new Bundle();
        if (!C9138d0.m18619U(dVar.mo23409l())) {
            String join = TextUtils.join(",", dVar.mo23409l());
            bundle.putString("scope", join);
            mo23463a("scope", join);
        }
        bundle.putString("default_audience", dVar.mo23401d().mo23289a());
        bundle.putString("state", mo23464f(dVar.mo23399b()));
        C4509a d = C4509a.m5515d();
        if (d != null) {
            str = d.mo31500n();
        } else {
            str = null;
        }
        String str2 = "1";
        if (str == null || !str.equals(m1741y())) {
            C9138d0.m18635f(this.f956c.mo23381i());
            mo23463a("access_token", "0");
        } else {
            bundle.putString("access_token", str);
            mo23463a("access_token", str2);
        }
        bundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
        if (!FacebookSdk.getAutoLogAppEventsEnabled()) {
            str2 = "0";
        }
        bundle.putString("ies", str2);
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public String mo23280v() {
        return "fb" + FacebookSdk.getApplicationId() + "://authorize";
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public String mo23281w() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public abstract C4537e mo23283x();

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo23480z(C2166l.C2170d dVar, Bundle bundle, FacebookException facebookException) {
        C2166l.C2172e eVar;
        String str;
        this.f967d = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.f967d = bundle.getString("e2e");
            }
            try {
                C4509a d = C2188q.m1711d(dVar.mo23409l(), bundle, mo23283x(), dVar.mo23398a());
                eVar = C2166l.C2172e.m1656b(this.f956c.mo23386s(), d, C2188q.m1712e(bundle, dVar.mo23408k()));
                CookieSyncManager.createInstance(this.f956c.mo23381i()).sync();
                m1740A(d.mo31500n());
            } catch (FacebookException e) {
                eVar = C2166l.C2172e.m1657c(this.f956c.mo23386s(), (String) null, e.getMessage());
            }
        } else if (facebookException instanceof FacebookOperationCanceledException) {
            eVar = C2166l.C2172e.m1655a(this.f956c.mo23386s(), "User canceled log in.");
        } else {
            this.f967d = null;
            String message = facebookException.getMessage();
            if (facebookException instanceof FacebookServiceException) {
                C4550k a = ((FacebookServiceException) facebookException).mo31487a();
                str = String.format(Locale.ROOT, TimeModel.NUMBER_FORMAT, new Object[]{Integer.valueOf(a.mo31596b())});
                message = a.toString();
            } else {
                str = null;
            }
            eVar = C2166l.C2172e.m1658d(this.f956c.mo23386s(), (String) null, message, str);
        }
        if (!C9138d0.m18618T(this.f967d)) {
            mo23465i(this.f967d);
        }
        this.f956c.mo23380g(eVar);
    }

    C2195w(Parcel parcel) {
        super(parcel);
    }
}
