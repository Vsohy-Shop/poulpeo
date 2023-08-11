package androidx.webkit.internal;

import android.net.Uri;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebMessagePortCompat;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewRenderProcess;
import androidx.webkit.WebViewRenderProcessClient;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import p378kg.C12660a;

public class WebViewProviderAdapter {
    WebViewProviderBoundaryInterface mImpl;

    public WebViewProviderAdapter(@NonNull WebViewProviderBoundaryInterface webViewProviderBoundaryInterface) {
        this.mImpl = webViewProviderBoundaryInterface;
    }

    @NonNull
    public ScriptReferenceImpl addDocumentStartJavaScript(@NonNull String str, @NonNull String[] strArr) {
        return ScriptReferenceImpl.toScriptReferenceCompat(this.mImpl.addDocumentStartJavaScript(str, strArr));
    }

    @RequiresApi(19)
    public void addWebMessageListener(@NonNull String str, @NonNull String[] strArr, @NonNull WebViewCompat.WebMessageListener webMessageListener) {
        this.mImpl.addWebMessageListener(str, strArr, C12660a.m28164c(new WebMessageListenerAdapter(webMessageListener)));
    }

    @NonNull
    public WebMessagePortCompat[] createWebMessageChannel() {
        InvocationHandler[] createWebMessageChannel = this.mImpl.createWebMessageChannel();
        WebMessagePortCompat[] webMessagePortCompatArr = new WebMessagePortCompat[createWebMessageChannel.length];
        for (int i = 0; i < createWebMessageChannel.length; i++) {
            webMessagePortCompatArr[i] = new WebMessagePortImpl(createWebMessageChannel[i]);
        }
        return webMessagePortCompatArr;
    }

    @Nullable
    public WebChromeClient getWebChromeClient() {
        return this.mImpl.getWebChromeClient();
    }

    @NonNull
    public WebViewClient getWebViewClient() {
        return this.mImpl.getWebViewClient();
    }

    @Nullable
    public WebViewRenderProcess getWebViewRenderProcess() {
        return WebViewRenderProcessImpl.forInvocationHandler(this.mImpl.getWebViewRenderer());
    }

    @Nullable
    public WebViewRenderProcessClient getWebViewRenderProcessClient() {
        InvocationHandler webViewRendererClient = this.mImpl.getWebViewRendererClient();
        if (webViewRendererClient == null) {
            return null;
        }
        return ((WebViewRenderProcessClientAdapter) C12660a.m28166e(webViewRendererClient)).getWebViewRenderProcessClient();
    }

    @RequiresApi(19)
    public void insertVisualStateCallback(long j, @NonNull WebViewCompat.VisualStateCallback visualStateCallback) {
        this.mImpl.insertVisualStateCallback(j, C12660a.m28164c(new VisualStateCallbackAdapter(visualStateCallback)));
    }

    @RequiresApi(19)
    public void postWebMessage(@NonNull WebMessageCompat webMessageCompat, @NonNull Uri uri) {
        this.mImpl.postMessageToMainFrame(C12660a.m28164c(new WebMessageAdapter(webMessageCompat)), uri);
    }

    public void removeWebMessageListener(@NonNull String str) {
        this.mImpl.removeWebMessageListener(str);
    }

    @RequiresApi(19)
    public void setWebViewRenderProcessClient(@Nullable Executor executor, @Nullable WebViewRenderProcessClient webViewRenderProcessClient) {
        InvocationHandler invocationHandler;
        if (webViewRenderProcessClient != null) {
            invocationHandler = C12660a.m28164c(new WebViewRenderProcessClientAdapter(executor, webViewRenderProcessClient));
        } else {
            invocationHandler = null;
        }
        this.mImpl.setWebViewRendererClient(invocationHandler);
    }
}
