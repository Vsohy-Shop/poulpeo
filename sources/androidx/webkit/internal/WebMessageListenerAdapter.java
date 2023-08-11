package androidx.webkit.internal;

import android.net.Uri;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import p378kg.C12660a;

public class WebMessageListenerAdapter implements WebMessageListenerBoundaryInterface {
    private WebViewCompat.WebMessageListener mWebMessageListener;

    public WebMessageListenerAdapter(@NonNull WebViewCompat.WebMessageListener webMessageListener) {
        this.mWebMessageListener = webMessageListener;
    }

    @NonNull
    public String[] getSupportedFeatures() {
        return new String[]{WebViewFeature.WEB_MESSAGE_LISTENER};
    }

    public void onPostMessage(@NonNull WebView webView, @NonNull InvocationHandler invocationHandler, @NonNull Uri uri, boolean z, @NonNull InvocationHandler invocationHandler2) {
        this.mWebMessageListener.onPostMessage(webView, WebMessageAdapter.webMessageCompatFromBoundaryInterface((WebMessageBoundaryInterface) C12660a.m28162a(WebMessageBoundaryInterface.class, invocationHandler)), uri, z, JavaScriptReplyProxyImpl.forInvocationHandler(invocationHandler2));
    }
}
