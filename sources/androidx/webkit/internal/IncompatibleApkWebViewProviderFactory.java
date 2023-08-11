package androidx.webkit.internal;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

public class IncompatibleApkWebViewProviderFactory implements WebViewProviderFactory {
    private static final String[] EMPTY_STRING_ARRAY = new String[0];
    private static final String UNSUPPORTED_EXCEPTION_EXPLANATION = "This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily";

    @NonNull
    public WebViewProviderBoundaryInterface createWebView(@NonNull WebView webView) {
        throw new UnsupportedOperationException(UNSUPPORTED_EXCEPTION_EXPLANATION);
    }

    @NonNull
    public ProxyControllerBoundaryInterface getProxyController() {
        throw new UnsupportedOperationException(UNSUPPORTED_EXCEPTION_EXPLANATION);
    }

    @NonNull
    public ServiceWorkerControllerBoundaryInterface getServiceWorkerController() {
        throw new UnsupportedOperationException(UNSUPPORTED_EXCEPTION_EXPLANATION);
    }

    @NonNull
    public StaticsBoundaryInterface getStatics() {
        throw new UnsupportedOperationException(UNSUPPORTED_EXCEPTION_EXPLANATION);
    }

    @NonNull
    public TracingControllerBoundaryInterface getTracingController() {
        throw new UnsupportedOperationException(UNSUPPORTED_EXCEPTION_EXPLANATION);
    }

    @NonNull
    public String[] getWebViewFeatures() {
        return EMPTY_STRING_ARRAY;
    }

    @NonNull
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        throw new UnsupportedOperationException(UNSUPPORTED_EXCEPTION_EXPLANATION);
    }
}
