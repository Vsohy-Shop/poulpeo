package androidx.webkit.internal;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import p378kg.C12660a;

public class WebViewProviderFactoryAdapter implements WebViewProviderFactory {
    WebViewProviderFactoryBoundaryInterface mImpl;

    public WebViewProviderFactoryAdapter(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.mImpl = webViewProviderFactoryBoundaryInterface;
    }

    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) C12660a.m28162a(WebViewProviderBoundaryInterface.class, this.mImpl.createWebView(webView));
    }

    public ProxyControllerBoundaryInterface getProxyController() {
        return (ProxyControllerBoundaryInterface) C12660a.m28162a(ProxyControllerBoundaryInterface.class, this.mImpl.getProxyController());
    }

    @NonNull
    public ServiceWorkerControllerBoundaryInterface getServiceWorkerController() {
        return (ServiceWorkerControllerBoundaryInterface) C12660a.m28162a(ServiceWorkerControllerBoundaryInterface.class, this.mImpl.getServiceWorkerController());
    }

    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) C12660a.m28162a(StaticsBoundaryInterface.class, this.mImpl.getStatics());
    }

    public TracingControllerBoundaryInterface getTracingController() {
        return (TracingControllerBoundaryInterface) C12660a.m28162a(TracingControllerBoundaryInterface.class, this.mImpl.getTracingController());
    }

    public String[] getWebViewFeatures() {
        return this.mImpl.getSupportedFeatures();
    }

    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) C12660a.m28162a(WebkitToCompatConverterBoundaryInterface.class, this.mImpl.getWebkitToCompatConverter());
    }
}
