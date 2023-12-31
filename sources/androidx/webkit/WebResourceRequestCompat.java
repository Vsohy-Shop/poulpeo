package androidx.webkit;

import android.webkit.WebResourceRequest;
import androidx.annotation.NonNull;
import androidx.webkit.internal.WebResourceRequestAdapter;
import androidx.webkit.internal.WebViewFeatureInternal;
import androidx.webkit.internal.WebViewGlueCommunicator;

public class WebResourceRequestCompat {
    private WebResourceRequestCompat() {
    }

    private static WebResourceRequestAdapter getAdapter(WebResourceRequest webResourceRequest) {
        return WebViewGlueCommunicator.getCompatConverter().convertWebResourceRequest(webResourceRequest);
    }

    public static boolean isRedirect(@NonNull WebResourceRequest webResourceRequest) {
        WebViewFeatureInternal webViewFeatureInternal = WebViewFeatureInternal.WEB_RESOURCE_REQUEST_IS_REDIRECT;
        if (webViewFeatureInternal.isSupportedByFramework()) {
            return webResourceRequest.isRedirect();
        }
        if (webViewFeatureInternal.isSupportedByWebView()) {
            return getAdapter(webResourceRequest).isRedirect();
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }
}
