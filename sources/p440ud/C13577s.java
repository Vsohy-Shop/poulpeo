package p440ud;

import android.graphics.Bitmap;
import android.webkit.CookieManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import p446vd.C13633n;

/* renamed from: ud.s */
/* compiled from: WebViewWrapper */
public class C13577s extends C13574r {

    /* renamed from: c */
    private C13579b f21835c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f21836d;

    /* renamed from: ud.s$a */
    /* compiled from: WebViewWrapper */
    class C13578a extends WebViewClient {
        C13578a() {
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            C13577s.this.m31009q(str);
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            C13577s.this.m31010r(str);
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            C13577s.this.m31012t(i, str, str2);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            if (webResourceRequest.hasGesture()) {
                C13577s.this.f21836d = false;
            }
            return C13577s.this.m31011s(webResourceRequest.getUrl().toString());
        }
    }

    /* renamed from: ud.s$b */
    /* compiled from: WebViewWrapper */
    public interface C13579b {
        /* renamed from: a */
        void mo53110a(C13577s sVar, String str);

        /* renamed from: b */
        void mo53111b(C13577s sVar, String str);

        /* renamed from: c */
        boolean mo53112c(C13577s sVar, String str);

        /* renamed from: d */
        void mo53113d(C13577s sVar, int i, String str, String str2);
    }

    public C13577s(WebView webView) {
        super(webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setUseWideViewPort(true);
        C13633n.m31145a(this, "SDk version above KK so forcibly enabling ThirdPartyCookies");
        CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
        CookieManager.getInstance().setAcceptCookie(true);
        webView.setWebViewClient(new C13578a());
    }

    /* renamed from: o */
    private WebView m31008o() {
        return (WebView) mo53243a();
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m31009q(String str) {
        this.f21836d = true;
        C13579b bVar = this.f21835c;
        if (bVar != null) {
            bVar.mo53110a(this, str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m31010r(String str) {
        this.f21836d = false;
        C13579b bVar = this.f21835c;
        if (bVar != null) {
            bVar.mo53111b(this, str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public boolean m31011s(String str) {
        C13579b bVar = this.f21835c;
        if (bVar != null) {
            return bVar.mo53112c(this, str);
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m31012t(int i, String str, String str2) {
        this.f21836d = false;
        C13579b bVar = this.f21835c;
        if (bVar != null) {
            bVar.mo53113d(this, i, str, str2);
        }
    }

    /* renamed from: n */
    public boolean mo53250n() {
        return m31008o().canGoBack();
    }

    /* renamed from: p */
    public void mo53251p() {
        if (m31008o().canGoBack()) {
            m31008o().goBack();
        }
    }

    /* renamed from: u */
    public boolean mo53252u() {
        return this.f21836d;
    }

    /* renamed from: v */
    public void mo53253v(String str) {
        m31008o().loadDataWithBaseURL((String) null, str, "text/html", "utf-8", (String) null);
    }

    /* renamed from: w */
    public void mo53254w(String str) {
        m31008o().loadUrl(str);
    }

    /* renamed from: x */
    public void mo53255x(String str, String str2) {
        byte[] bArr;
        if (str2 != null) {
            bArr = str2.getBytes();
        } else {
            bArr = null;
        }
        m31008o().postUrl(str, bArr);
    }

    /* renamed from: y */
    public void mo53256y() {
        m31008o().reload();
    }

    /* renamed from: z */
    public void mo53257z(C13579b bVar) {
        this.f21835c = bVar;
    }
}
