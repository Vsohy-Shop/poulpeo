package com.braze.p055ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.webkit.ConsoleMessage;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.FragmentActivity;
import com.appboy.enums.Channel;
import com.appboy.p054ui.C4193R;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p019a1.C2117c;
import p126j0.C8233a;
import p126j0.C8266c;
import p136k0.C8429a;
import p146l0.C8622c;
import p404of.C13074a;

/* renamed from: com.braze.ui.BrazeWebViewActivity */
/* compiled from: BrazeWebViewActivity.kt */
public class BrazeWebViewActivity extends FragmentActivity {

    /* renamed from: com.braze.ui.BrazeWebViewActivity$a */
    /* compiled from: BrazeWebViewActivity.kt */
    public static final class C4300a extends WebChromeClient {

        /* renamed from: com.braze.ui.BrazeWebViewActivity$a$a */
        /* compiled from: BrazeWebViewActivity.kt */
        static final class C4301a extends C12777p implements C13074a<String> {

            /* renamed from: g */
            final /* synthetic */ ConsoleMessage f3571g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4301a(ConsoleMessage consoleMessage) {
                super(0);
                this.f3571g = consoleMessage;
            }

            public final String invoke() {
                return "Braze WebView Activity log. Line: " + this.f3571g.lineNumber() + ". SourceId: " + this.f3571g.sourceId() + ". Log Level: " + this.f3571g.messageLevel() + ". Message: " + this.f3571g.message();
            }
        }

        C4300a() {
        }

        public Bitmap getDefaultVideoPoster() {
            return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            C12775o.m28639i(consoleMessage, "cm");
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C4301a(consoleMessage), 7, (Object) null);
            return true;
        }
    }

    public WebChromeClient createWebChromeClient() {
        return new C4300a();
    }

    public WebViewClient createWebViewClient() {
        return new C4302b(this);
    }

    public void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        getWindow().setFlags(16777216, 16777216);
        setContentView(C4193R.C4197layout.com_braze_webview_activity);
        WebView webView = (WebView) findViewById(C4193R.C4196id.com_braze_webview_activity_webview);
        webView.setLayerType(2, (Paint) null);
        WebSettings settings = webView.getSettings();
        C12775o.m28638h(settings, "webView.settings");
        settings.setAllowFileAccess(false);
        settings.setBuiltInZoomControls(true);
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        Context applicationContext = getApplicationContext();
        C12775o.m28638h(applicationContext, "this.applicationContext");
        if (C2117c.m1468g(applicationContext)) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 33) {
                settings.setAlgorithmicDarkeningAllowed(true);
            } else if (i >= 29) {
                settings.setForceDark(2);
            }
        }
        webView.setWebChromeClient(createWebChromeClient());
        webView.setWebViewClient(createWebViewClient());
        Bundle extras = getIntent().getExtras();
        if (extras != null && (string = extras.getString("url")) != null) {
            webView.loadUrl(string);
        }
    }

    /* renamed from: com.braze.ui.BrazeWebViewActivity$b */
    /* compiled from: BrazeWebViewActivity.kt */
    public static final class C4302b extends WebViewClient {

        /* renamed from: a */
        final /* synthetic */ BrazeWebViewActivity f3572a;

        /* renamed from: com.braze.ui.BrazeWebViewActivity$b$a */
        /* compiled from: BrazeWebViewActivity.kt */
        static final class C4303a extends C12777p implements C13074a<String> {

            /* renamed from: g */
            final /* synthetic */ String f3573g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4303a(String str) {
                super(0);
                this.f3573g = str;
            }

            public final String invoke() {
                return "Unexpected exception while processing url " + this.f3573g + ". Passing url back to WebView.";
            }
        }

        /* renamed from: com.braze.ui.BrazeWebViewActivity$b$b */
        /* compiled from: BrazeWebViewActivity.kt */
        static final class C4304b extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C4304b f3574g = new C4304b();

            C4304b() {
                super(0);
            }

            public final String invoke() {
                return "The webview rendering process crashed, returning true";
            }
        }

        C4302b(BrazeWebViewActivity brazeWebViewActivity) {
            this.f3572a = brazeWebViewActivity;
        }

        /* renamed from: a */
        private final Boolean m4976a(Context context, String str) {
            try {
                if (C12686e0.m28214S(C8233a.f11597b, Uri.parse(str).getScheme())) {
                    return null;
                }
                C8622c c = C8429a.f12015a.mo42456a().mo42453c(str, this.f3572a.getIntent().getExtras(), false, Channel.UNKNOWN);
                if (c == null) {
                    return Boolean.FALSE;
                }
                c.mo42702a(context);
                this.f3572a.finish();
                return Boolean.TRUE;
            } catch (Exception e) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, new C4303a(str), 4, (Object) null);
                return null;
            }
        }

        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            C12775o.m28639i(webView, "view");
            C12775o.m28639i(renderProcessGoneDetail, "detail");
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, C4304b.f3574g, 6, (Object) null);
            return true;
        }

        @RequiresApi(api = 21)
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            C12775o.m28639i(webView, "view");
            C12775o.m28639i(webResourceRequest, "request");
            Context context = webView.getContext();
            C12775o.m28638h(context, "view.context");
            String uri = webResourceRequest.getUrl().toString();
            C12775o.m28638h(uri, "request.url.toString()");
            Boolean a = m4976a(context, uri);
            return a == null ? super.shouldOverrideUrlLoading(webView, webResourceRequest) : a.booleanValue();
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            C12775o.m28639i(webView, "view");
            C12775o.m28639i(str, "url");
            Context context = webView.getContext();
            C12775o.m28638h(context, "view.context");
            Boolean a = m4976a(context, str);
            return a == null ? super.shouldOverrideUrlLoading(webView, str) : a.booleanValue();
        }
    }
}
