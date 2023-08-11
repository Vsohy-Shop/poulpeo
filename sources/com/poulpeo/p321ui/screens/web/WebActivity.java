package com.poulpeo.p321ui.screens.web;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.provider.FontsContractCompat;
import com.poulpeo.R;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.oauth.HttpMethod;
import com.rmn.api.p322v2.poulpeo.general.PLPUtil;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p102g9.C7834c;
import p328dd.C11804a;
import p422rd.C13285a;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.web.WebActivity */
/* compiled from: WebActivity.kt */
public final class WebActivity extends C13285a {

    /* renamed from: A */
    public static final int f17744A = 8;

    /* renamed from: z */
    public static final C11223a f17745z = new C11223a((DefaultConstructorMarker) null);

    /* renamed from: w */
    private final int f17746w = R.layout.activity_web;

    /* renamed from: x */
    private int f17747x;

    /* renamed from: y */
    public Map<Integer, View> f17748y = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.web.WebActivity$a */
    /* compiled from: WebActivity.kt */
    public static final class C11223a {
        private C11223a() {
        }

        public /* synthetic */ C11223a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent mo46522a(Context context, String str, String str2, String[] strArr) {
            C12775o.m28639i(context, "packageContext");
            C12775o.m28639i(str, "htmlData");
            C12775o.m28639i(str2, "title");
            Intent intent = new Intent(context, WebActivity.class);
            intent.putExtra("html_data", str);
            intent.putExtra("trackingTag", "htmlData");
            intent.putExtra("title", str2);
            intent.putExtra("mandatory_url_parts", strArr);
            return intent;
        }

        /* renamed from: b */
        public final Intent mo46523b(Context context) {
            C12775o.m28639i(context, "packageContext");
            Intent intent = new Intent(context, WebActivity.class);
            String str = PLPUtil.URL_PLP;
            intent.putExtra("url", str + "a-propos-classement-offres-mobile.htm");
            intent.putExtra("trackingTag", "offersInfo");
            intent.putExtra("title", "");
            intent.putExtra("http_method", HttpMethod.GET.ordinal());
            intent.putExtra("parameters", "app_version=2");
            return intent;
        }

        /* renamed from: c */
        public final Intent mo46524c(Context context) {
            C12775o.m28639i(context, "packageContext");
            Intent intent = new Intent(context, WebActivity.class);
            String str = PLPUtil.URL_PLP;
            intent.putExtra("url", str + "politique-de-confidentialite-mobile.htm");
            intent.putExtra("trackingTag", "privacy");
            intent.putExtra("title", context.getString(R.string.menu_privacy));
            intent.putExtra("http_method", HttpMethod.GET.ordinal());
            intent.putExtra("internal_back_action", true);
            intent.putExtra("parameters", "app_version=2");
            return intent;
        }

        /* renamed from: d */
        public final Intent mo46525d(Context context) {
            C12775o.m28639i(context, "packageContext");
            Intent intent = new Intent(context, WebActivity.class);
            String str = PLPUtil.URL_PLP;
            intent.putExtra("url", str + "conditions-avis-mobile.htm");
            intent.putExtra("trackingTag", "reviewPaymentConditions");
            intent.putExtra("title", "");
            intent.putExtra("http_method", HttpMethod.GET.ordinal());
            intent.putExtra("parameters", "app_version=2");
            return intent;
        }

        /* renamed from: e */
        public final Intent mo46526e(Context context) {
            C12775o.m28639i(context, "packageContext");
            Intent intent = new Intent(context, WebActivity.class);
            String str = PLPUtil.URL_PLP;
            intent.putExtra("url", str + "conditions-utilisation-mobile.htm");
            intent.putExtra("trackingTag", "terms");
            intent.putExtra("title", context.getString(R.string.menu_terms));
            intent.putExtra("http_method", HttpMethod.GET.ordinal());
            intent.putExtra("internal_back_action", true);
            intent.putExtra("parameters", "app_version=2");
            return intent;
        }

        /* renamed from: f */
        public final Intent mo46527f(Context context) {
            C12775o.m28639i(context, "packageContext");
            Intent intent = new Intent(context, WebActivity.class);
            intent.putExtra("url", "file:///android_asset/update_notes.html");
            intent.putExtra("trackingTag", "updateNotes");
            intent.putExtra("title", context.getString(R.string.update_notes_title));
            intent.putExtra("http_method", HttpMethod.GET.ordinal());
            return intent;
        }

        /* renamed from: g */
        public final Intent mo46528g(Context context, String str) {
            C12775o.m28639i(context, "packageContext");
            C12775o.m28639i(str, "url");
            Intent intent = new Intent(context, WebActivity.class);
            intent.putExtra("url", str);
            intent.putExtra("trackingTag", "url");
            intent.putExtra("title", "");
            intent.putExtra("http_method", HttpMethod.GET.ordinal());
            intent.putExtra("internal_back_action", true);
            return intent;
        }

        /* renamed from: h */
        public final void mo46529h(Context context) {
            C12775o.m28639i(context, "context");
            mo46532k(context, "https://support.poulpeo.com/hc/fr");
        }

        /* renamed from: i */
        public final void mo46530i(Context context) {
            C12775o.m28639i(context, "context");
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://support.poulpeo.com/hc/fr/articles/360018317257-Mon-cashback-a-%C3%A9t%C3%A9-annul%C3%A9")));
        }

        /* renamed from: j */
        public final void mo46531j(Context context) {
            C12775o.m28639i(context, "context");
            mo46532k(context, "https://www.poulpeo.com/mentions-legales.html");
        }

        /* renamed from: k */
        public final void mo46532k(Context context, String str) {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(str, "url");
            try {
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            } catch (Exception unused) {
                context.startActivity(mo46528g(context, str));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: F2 */
    public C11804a mo46519F2() {
        HttpMethod B2;
        String A2 = mo52917A2();
        if (A2 != null) {
            return new C11804a(this, new C11804a.C11805a(mo47878o2(), (LogoutListener) null, mo52921E2().getController(), A2, true));
        }
        String D2 = mo52920D2();
        if (D2 != null && (B2 = mo52918B2()) != null) {
            return new C11804a(this, new C11804a.C11805a(mo47878o2(), (LogoutListener) null, mo52921E2().getController(), D2, mo52919C2(), B2, true));
        }
        throw new IllegalStateException();
    }

    public void finish() {
        if (this.f17747x != -1) {
            String title = mo52921E2().getWebView().getTitle();
            boolean z = false;
            if (title != null && C13755w.m31552J(title, "reload", false, 2, (Object) null)) {
                z = true;
            }
            if (z) {
                setResult(this.f17747x);
            }
        }
        super.finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        mo50358x2("WebActivity", false);
        super.onCreate(bundle);
        this.f17747x = getIntent().getIntExtra(FontsContractCompat.Columns.RESULT_CODE, -1);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C7834c.m15321a(this).mo41541h(mo47878o2(), mo52920D2());
    }

    /* access modifiers changed from: protected */
    /* renamed from: y2 */
    public int mo46521y2() {
        return this.f17746w;
    }
}
