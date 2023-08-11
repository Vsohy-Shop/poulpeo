package com.rmn.p324ui.views.webview_reload;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.api.p322v2.main.oauth.HttpMethod;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import p433tc.C13486a;
import p434td.C13491b;
import p440ud.C13548a;
import p440ud.C13558g;
import p440ud.C13560h;
import p440ud.C13574r;
import p440ud.C13577s;

@StabilityInferred(parameters = 0)
/* renamed from: com.rmn.ui.views.webview_reload.WebViewReload */
/* compiled from: WebViewReload.kt */
public final class WebViewReload extends LinearLayout {

    /* renamed from: b */
    private C13491b f18142b;

    /* renamed from: c */
    private WebView f18143c;

    /* renamed from: d */
    public Map<Integer, View> f18144d = new LinkedHashMap();

    /* renamed from: com.rmn.ui.views.webview_reload.WebViewReload$a */
    /* compiled from: WebViewReload.kt */
    public static final class C11662a extends WebChromeClient {

        /* renamed from: a */
        final /* synthetic */ WebViewReload f18145a;

        C11662a(WebViewReload webViewReload) {
            this.f18145a = webViewReload;
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            C12775o.m28639i(consoleMessage, "consoleMessage");
            String message = consoleMessage.message();
            C12775o.m28638h(message, "consoleMessage.message()");
            if (C13755w.m31552J(message, "Uncaught ReferenceError", false, 2, (Object) null)) {
                C13486a aVar = C13486a.f21657a;
                String url = this.f18145a.getWebView().getUrl();
                String message2 = consoleMessage.message();
                aVar.mo53089b(new Exception("ReferenceError at url : '" + url + "' -> '" + message2 + "'"));
            }
            return super.onConsoleMessage(consoleMessage);
        }

        public void onProgressChanged(WebView webView, int i) {
            C12775o.m28639i(webView, "view");
            super.onProgressChanged(webView, i);
            this.f18145a.getController().mo53104F2(((float) i) * 0.01f);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebViewReload(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C12775o.m28639i(context, "context");
        C12775o.m28639i(attributeSet, "attributeSet");
        m25099a();
    }

    /* renamed from: a */
    private final void m25099a() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.webview_reload, this);
        View findViewById = inflate.findViewById(R.id.webView);
        C12775o.m28638h(findViewById, "view.findViewById(R.id.webView)");
        this.f18143c = (WebView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.progressbarLoader);
        C12775o.m28638h(findViewById2, "view.findViewById(R.id.progressbarLoader)");
        View findViewById3 = inflate.findViewById(R.id.layoutButtonReload);
        C12775o.m28638h(findViewById3, "view.findViewById(R.id.layoutButtonReload)");
        View findViewById4 = inflate.findViewById(R.id.buttonReload);
        C12775o.m28638h(findViewById4, "view.findViewById(R.id.buttonReload)");
        View findViewById5 = inflate.findViewById(R.id.progressbarLoaderLinear);
        C12775o.m28638h(findViewById5, "view.findViewById(R.id.progressbarLoaderLinear)");
        getWebView().setWebChromeClient(new C11662a(this));
        this.f18142b = new C13491b(new C13577s(getWebView()), new C13558g((ProgressBar) findViewById2), new C13574r(findViewById3), new C13548a((Button) findViewById4), new C13560h((ProgressBar) findViewById5));
        getController().mo53102D2((String) null, (String) null, (HttpMethod) null);
    }

    public final C13491b getController() {
        C13491b bVar = this.f18142b;
        if (bVar != null) {
            return bVar;
        }
        C12775o.m28656z("controller");
        return null;
    }

    public final WebView getWebView() {
        WebView webView = this.f18143c;
        if (webView != null) {
            return webView;
        }
        C12775o.m28656z("webView");
        return null;
    }
}
