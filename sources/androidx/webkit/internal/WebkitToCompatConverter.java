package androidx.webkit.internal;

import android.webkit.SafeBrowsingResponse;
import android.webkit.ServiceWorkerWebSettings;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import p378kg.C12660a;

public class WebkitToCompatConverter {
    private final WebkitToCompatConverterBoundaryInterface mImpl;

    public WebkitToCompatConverter(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.mImpl = webkitToCompatConverterBoundaryInterface;
    }

    @NonNull
    public InvocationHandler convertSafeBrowsingResponse(@NonNull SafeBrowsingResponse safeBrowsingResponse) {
        return this.mImpl.convertSafeBrowsingResponse((Object) safeBrowsingResponse);
    }

    @NonNull
    public InvocationHandler convertServiceWorkerSettings(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return this.mImpl.convertServiceWorkerSettings((Object) serviceWorkerWebSettings);
    }

    @NonNull
    public WebSettingsAdapter convertSettings(WebSettings webSettings) {
        return new WebSettingsAdapter((WebSettingsBoundaryInterface) C12660a.m28162a(WebSettingsBoundaryInterface.class, this.mImpl.convertSettings(webSettings)));
    }

    @NonNull
    public InvocationHandler convertWebMessagePort(@NonNull WebMessagePort webMessagePort) {
        return this.mImpl.convertWebMessagePort((Object) webMessagePort);
    }

    @NonNull
    public InvocationHandler convertWebResourceError(@NonNull WebResourceError webResourceError) {
        return this.mImpl.convertWebResourceError((Object) webResourceError);
    }

    @NonNull
    public WebResourceRequestAdapter convertWebResourceRequest(WebResourceRequest webResourceRequest) {
        return new WebResourceRequestAdapter((WebResourceRequestBoundaryInterface) C12660a.m28162a(WebResourceRequestBoundaryInterface.class, this.mImpl.convertWebResourceRequest(webResourceRequest)));
    }

    @RequiresApi(27)
    @NonNull
    public SafeBrowsingResponse convertSafeBrowsingResponse(@NonNull InvocationHandler invocationHandler) {
        return (SafeBrowsingResponse) this.mImpl.convertSafeBrowsingResponse(invocationHandler);
    }

    @RequiresApi(24)
    @NonNull
    public ServiceWorkerWebSettings convertServiceWorkerSettings(@NonNull InvocationHandler invocationHandler) {
        return (ServiceWorkerWebSettings) this.mImpl.convertServiceWorkerSettings(invocationHandler);
    }

    @RequiresApi(23)
    @NonNull
    public WebMessagePort convertWebMessagePort(@NonNull InvocationHandler invocationHandler) {
        return (WebMessagePort) this.mImpl.convertWebMessagePort(invocationHandler);
    }

    @RequiresApi(23)
    @NonNull
    public WebResourceError convertWebResourceError(@NonNull InvocationHandler invocationHandler) {
        return (WebResourceError) this.mImpl.convertWebResourceError(invocationHandler);
    }
}
