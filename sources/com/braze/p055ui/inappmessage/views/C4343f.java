package com.braze.p055ui.inappmessage.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.webkit.WebSettingsCompat;
import androidx.webkit.WebViewFeature;
import com.braze.configuration.C4218b;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p019a1.C2117c;
import p126j0.C8266c;
import p238u0.C9783d;
import p282y0.C10643i;
import p293z0.C10762c;
import p293z0.C10766d;
import p404of.C13074a;

/* renamed from: com.braze.ui.inappmessage.views.f */
/* compiled from: InAppMessageHtmlBaseView.kt */
public abstract class C4343f extends RelativeLayout implements C4338c {
    public static final String BRAZE_BRIDGE_PREFIX = "brazeInternalBridge";
    public static final C4344a Companion = new C4344a((DefaultConstructorMarker) null);
    private static final String FILE_URI_SCHEME_PREFIX = "file://";
    private static final String FINISHED_WEBVIEW_URL = "about:blank";
    private static final String HTML_ENCODING = "utf-8";
    private static final String HTML_MIME_TYPE = "text/html";
    private WebView configuredMessageWebView;
    private boolean hasAppliedWindowInsets;
    private C10766d inAppMessageWebViewClient;
    private boolean isFinished;

    /* renamed from: com.braze.ui.inappmessage.views.f$a */
    /* compiled from: InAppMessageHtmlBaseView.kt */
    public static final class C4344a {
        private C4344a() {
        }

        public /* synthetic */ C4344a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.braze.ui.inappmessage.views.f$b */
    /* compiled from: InAppMessageHtmlBaseView.kt */
    static final class C4345b extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C4345b f3631g = new C4345b();

        C4345b() {
            super(0);
        }

        public final String invoke() {
            return "Finishing WebView display";
        }
    }

    /* renamed from: com.braze.ui.inappmessage.views.f$c */
    /* compiled from: InAppMessageHtmlBaseView.kt */
    static final class C4346c extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C4346c f3632g = new C4346c();

        C4346c() {
            super(0);
        }

        public final String invoke() {
            return "Cannot return the WebView for an already finished message";
        }
    }

    /* renamed from: com.braze.ui.inappmessage.views.f$d */
    /* compiled from: InAppMessageHtmlBaseView.kt */
    static final class C4347d extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C4347d f3633g = new C4347d();

        C4347d() {
            super(0);
        }

        public final String invoke() {
            return "Cannot find WebView. getWebViewViewId() returned 0.";
        }
    }

    /* renamed from: com.braze.ui.inappmessage.views.f$e */
    /* compiled from: InAppMessageHtmlBaseView.kt */
    static final class C4348e extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ int f3634g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4348e(int i) {
            super(0);
            this.f3634g = i;
        }

        public final String invoke() {
            return "findViewById for " + this.f3634g + " returned null. Returning null for WebView.";
        }
    }

    /* renamed from: com.braze.ui.inappmessage.views.f$f */
    /* compiled from: InAppMessageHtmlBaseView.kt */
    static final class C4349f extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C4349f f3635g = new C4349f();

        C4349f() {
            super(0);
        }

        public final String invoke() {
            return "Failed to set dark mode WebView settings";
        }
    }

    /* renamed from: com.braze.ui.inappmessage.views.f$g */
    /* compiled from: InAppMessageHtmlBaseView.kt */
    public static final class C4350g extends WebChromeClient {

        /* renamed from: a */
        final /* synthetic */ C4343f f3636a;

        /* renamed from: com.braze.ui.inappmessage.views.f$g$a */
        /* compiled from: InAppMessageHtmlBaseView.kt */
        static final class C4351a extends C12777p implements C13074a<String> {

            /* renamed from: g */
            final /* synthetic */ ConsoleMessage f3637g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4351a(ConsoleMessage consoleMessage) {
                super(0);
                this.f3637g = consoleMessage;
            }

            public final String invoke() {
                return "Braze HTML In-app Message log. Line: " + this.f3637g.lineNumber() + ". SourceId: " + this.f3637g.sourceId() + ". Log Level: " + this.f3637g.messageLevel() + ". Message: " + this.f3637g.message();
            }
        }

        C4350g(C4343f fVar) {
            this.f3636a = fVar;
        }

        public Bitmap getDefaultVideoPoster() {
            return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            C12775o.m28639i(consoleMessage, "cm");
            C8266c.m16396e(C8266c.f11641a, this.f3636a, (C8266c.C8267a) null, (Throwable) null, false, new C4351a(consoleMessage), 7, (Object) null);
            return true;
        }
    }

    /* renamed from: com.braze.ui.inappmessage.views.f$h */
    /* compiled from: InAppMessageHtmlBaseView.kt */
    static final class C4352h extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C4352h f3638g = new C4352h();

        C4352h() {
            super(0);
        }

        public final String invoke() {
            return "Cannot load WebView. htmlBody was null.";
        }
    }

    public C4343f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static /* synthetic */ void setWebViewContent$default(C4343f fVar, String str, String str2, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            fVar.setWebViewContent(str, str2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setWebViewContent");
    }

    public void applyWindowInsets(WindowInsetsCompat windowInsetsCompat) {
        C12775o.m28639i(windowInsetsCompat, "insets");
        setHasAppliedWindowInsets(true);
        Context context = getContext();
        C12775o.m28638h(context, "this.context");
        if (new C4218b(context).isHtmlInAppMessageApplyWindowInsetsEnabled() && getLayoutParams() != null && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMargins(C2117c.m1464c(windowInsetsCompat) + marginLayoutParams.leftMargin, C2117c.m1466e(windowInsetsCompat) + marginLayoutParams.topMargin, C2117c.m1465d(windowInsetsCompat) + marginLayoutParams.rightMargin, C2117c.m1463b(windowInsetsCompat) + marginLayoutParams.bottomMargin);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C12775o.m28639i(keyEvent, NotificationCompat.CATEGORY_EVENT);
        if (isInTouchMode() || keyEvent.getKeyCode() != 4 || !C9783d.f14623G.mo44312a().mo44377e()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        C10762c.m22900a();
        return true;
    }

    public void finishWebViewDisplay() {
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C4345b.f3631g, 7, (Object) null);
        this.isFinished = true;
        WebView webView = this.configuredMessageWebView;
        if (webView != null) {
            webView.loadUrl(FINISHED_WEBVIEW_URL);
            webView.onPause();
            webView.removeAllViews();
            this.configuredMessageWebView = null;
        }
    }

    public boolean getHasAppliedWindowInsets() {
        return this.hasAppliedWindowInsets;
    }

    public WebView getMessageWebView() {
        if (this.isFinished) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C4346c.f3632g, 6, (Object) null);
            return null;
        }
        int webViewViewId = getWebViewViewId();
        if (webViewViewId == 0) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C4347d.f3633g, 7, (Object) null);
            return null;
        }
        WebView webView = this.configuredMessageWebView;
        if (webView != null) {
            return webView;
        }
        WebView webView2 = (WebView) findViewById(webViewViewId);
        if (webView2 == null) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C4348e(webViewViewId), 7, (Object) null);
            return null;
        }
        WebSettings settings = webView2.getSettings();
        C12775o.m28638h(settings, "webView.settings");
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(true);
        webView2.setLayerType(2, (Paint) null);
        webView2.setBackgroundColor(0);
        try {
            if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK)) {
                Context context = getContext();
                C12775o.m28638h(context, "context");
                if (C2117c.m1468g(context)) {
                    WebSettingsCompat.setForceDark(settings, 2);
                }
            }
            if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK_STRATEGY)) {
                WebSettingsCompat.setForceDarkStrategy(settings, 1);
            }
        } catch (Throwable th) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, th, false, C4349f.f3635g, 4, (Object) null);
        }
        webView2.setWebChromeClient(new C4350g(this));
        this.configuredMessageWebView = webView2;
        return webView2;
    }

    public abstract int getWebViewViewId();

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C12775o.m28639i(keyEvent, NotificationCompat.CATEGORY_EVENT);
        if (i != 4 || !C9783d.f14623G.mo44312a().mo44377e()) {
            WebView webView = this.configuredMessageWebView;
            if (webView != null) {
                C2117c.m1473l(webView);
            }
            return super.onKeyDown(i, keyEvent);
        }
        C10762c.m22900a();
        return true;
    }

    public void setHasAppliedWindowInsets(boolean z) {
        this.hasAppliedWindowInsets = z;
    }

    public void setHtmlPageFinishedListener(C10643i iVar) {
        C10766d dVar = this.inAppMessageWebViewClient;
        if (dVar != null) {
            dVar.mo45664e(iVar);
        }
    }

    public void setInAppMessageWebViewClient(C10766d dVar) {
        C12775o.m28639i(dVar, "inAppMessageWebViewClient");
        WebView messageWebView = getMessageWebView();
        if (messageWebView != null) {
            messageWebView.setWebViewClient(dVar);
        }
        this.inAppMessageWebViewClient = dVar;
    }

    public final void setWebViewContent(String str) {
        setWebViewContent$default(this, str, (String) null, 2, (Object) null);
    }

    public void setWebViewContent(String str, String str2) {
        if (str != null) {
            WebView messageWebView = getMessageWebView();
            if (messageWebView != null) {
                messageWebView.loadDataWithBaseURL(FILE_URI_SCHEME_PREFIX + str2 + '/', str, HTML_MIME_TYPE, HTML_ENCODING, (String) null);
                return;
            }
            return;
        }
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C4352h.f3638g, 7, (Object) null);
    }

    public View getMessageClickableView() {
        return this;
    }
}
