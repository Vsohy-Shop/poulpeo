package androidx.webkit.internal;

import androidx.annotation.NonNull;
import androidx.webkit.WebViewRenderProcess;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;
import p378kg.C12660a;

public class WebViewRenderProcessImpl extends WebViewRenderProcess {
    private static WeakHashMap<android.webkit.WebViewRenderProcess, WebViewRenderProcessImpl> sFrameworkMap = new WeakHashMap<>();
    private WebViewRendererBoundaryInterface mBoundaryInterface;
    private WeakReference<android.webkit.WebViewRenderProcess> mFrameworkObject;

    public WebViewRenderProcessImpl(@NonNull WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) {
        this.mBoundaryInterface = webViewRendererBoundaryInterface;
    }

    @NonNull
    public static WebViewRenderProcessImpl forFrameworkObject(@NonNull android.webkit.WebViewRenderProcess webViewRenderProcess) {
        WebViewRenderProcessImpl webViewRenderProcessImpl = sFrameworkMap.get(webViewRenderProcess);
        if (webViewRenderProcessImpl != null) {
            return webViewRenderProcessImpl;
        }
        WebViewRenderProcessImpl webViewRenderProcessImpl2 = new WebViewRenderProcessImpl(webViewRenderProcess);
        sFrameworkMap.put(webViewRenderProcess, webViewRenderProcessImpl2);
        return webViewRenderProcessImpl2;
    }

    @NonNull
    public static WebViewRenderProcessImpl forInvocationHandler(@NonNull InvocationHandler invocationHandler) {
        final WebViewRendererBoundaryInterface webViewRendererBoundaryInterface = (WebViewRendererBoundaryInterface) C12660a.m28162a(WebViewRendererBoundaryInterface.class, invocationHandler);
        return (WebViewRenderProcessImpl) webViewRendererBoundaryInterface.getOrCreatePeer(new Callable<Object>() {
            public Object call() {
                return new WebViewRenderProcessImpl(WebViewRendererBoundaryInterface.this);
            }
        });
    }

    public boolean terminate() {
        WebViewFeatureInternal webViewFeatureInternal = WebViewFeatureInternal.WEB_VIEW_RENDERER_TERMINATE;
        if (webViewFeatureInternal.isSupportedByFramework()) {
            android.webkit.WebViewRenderProcess webViewRenderProcess = this.mFrameworkObject.get();
            if (webViewRenderProcess != null) {
                return webViewRenderProcess.terminate();
            }
            return false;
        } else if (webViewFeatureInternal.isSupportedByWebView()) {
            return this.mBoundaryInterface.terminate();
        } else {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    public WebViewRenderProcessImpl(@NonNull android.webkit.WebViewRenderProcess webViewRenderProcess) {
        this.mFrameworkObject = new WeakReference<>(webViewRenderProcess);
    }
}
