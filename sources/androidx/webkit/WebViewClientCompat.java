package androidx.webkit;

import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.webkit.internal.SafeBrowsingResponseImpl;
import androidx.webkit.internal.WebResourceErrorImpl;
import androidx.webkit.internal.WebViewFeatureInternal;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebViewClientBoundaryInterface;

public class WebViewClientCompat extends WebViewClient implements WebViewClientBoundaryInterface {
    private static final String[] sSupportedFeatures = {WebViewFeature.VISUAL_STATE_CALLBACK, WebViewFeature.RECEIVE_WEB_RESOURCE_ERROR, WebViewFeature.RECEIVE_HTTP_ERROR, WebViewFeature.SHOULD_OVERRIDE_WITH_REDIRECTS, WebViewFeature.SAFE_BROWSING_HIT};

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface SafeBrowsingThreat {
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final String[] getSupportedFeatures() {
        return sSupportedFeatures;
    }

    @RequiresApi(21)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void onReceivedError(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest, @NonNull InvocationHandler invocationHandler) {
        onReceivedError(webView, webResourceRequest, (WebResourceErrorCompat) new WebResourceErrorImpl(invocationHandler));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void onSafeBrowsingHit(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest, int i, @NonNull InvocationHandler invocationHandler) {
        onSafeBrowsingHit(webView, webResourceRequest, i, (SafeBrowsingResponseCompat) new SafeBrowsingResponseImpl(invocationHandler));
    }

    @RequiresApi(21)
    @UiThread
    public boolean shouldOverrideUrlLoading(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }

    @RequiresApi(23)
    public final void onReceivedError(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest, @NonNull WebResourceError webResourceError) {
        onReceivedError(webView, webResourceRequest, (WebResourceErrorCompat) new WebResourceErrorImpl(webResourceError));
    }

    @RequiresApi(27)
    public final void onSafeBrowsingHit(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest, int i, @NonNull SafeBrowsingResponse safeBrowsingResponse) {
        onSafeBrowsingHit(webView, webResourceRequest, i, (SafeBrowsingResponseCompat) new SafeBrowsingResponseImpl(safeBrowsingResponse));
    }

    @RequiresApi(21)
    @UiThread
    public void onReceivedError(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest, @NonNull WebResourceErrorCompat webResourceErrorCompat) {
        if (WebViewFeature.isFeatureSupported(WebViewFeature.WEB_RESOURCE_ERROR_GET_CODE) && WebViewFeature.isFeatureSupported(WebViewFeature.WEB_RESOURCE_ERROR_GET_DESCRIPTION) && webResourceRequest.isForMainFrame()) {
            onReceivedError(webView, webResourceErrorCompat.getErrorCode(), webResourceErrorCompat.getDescription().toString(), webResourceRequest.getUrl().toString());
        }
    }

    @UiThread
    public void onSafeBrowsingHit(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest, int i, @NonNull SafeBrowsingResponseCompat safeBrowsingResponseCompat) {
        if (WebViewFeature.isFeatureSupported(WebViewFeature.SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL)) {
            safeBrowsingResponseCompat.showInterstitial(true);
            return;
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }

    @UiThread
    public void onPageCommitVisible(@NonNull WebView webView, @NonNull String str) {
    }

    @UiThread
    public void onReceivedHttpError(@NonNull WebView webView, @NonNull WebResourceRequest webResourceRequest, @NonNull WebResourceResponse webResourceResponse) {
    }
}
