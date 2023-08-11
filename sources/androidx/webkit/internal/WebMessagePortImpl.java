package androidx.webkit.internal;

import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebMessagePortCompat;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import p378kg.C12660a;

public class WebMessagePortImpl extends WebMessagePortCompat {
    private WebMessagePortBoundaryInterface mBoundaryInterface;
    private WebMessagePort mFrameworksImpl;

    public WebMessagePortImpl(WebMessagePort webMessagePort) {
        this.mFrameworksImpl = webMessagePort;
    }

    @RequiresApi(23)
    @NonNull
    public static WebMessage compatToFrameworkMessage(WebMessageCompat webMessageCompat) {
        return new WebMessage(webMessageCompat.getData(), compatToPorts(webMessageCompat.getPorts()));
    }

    @RequiresApi(23)
    @Nullable
    public static WebMessagePort[] compatToPorts(WebMessagePortCompat[] webMessagePortCompatArr) {
        if (webMessagePortCompatArr == null) {
            return null;
        }
        int length = webMessagePortCompatArr.length;
        WebMessagePort[] webMessagePortArr = new WebMessagePort[length];
        for (int i = 0; i < length; i++) {
            webMessagePortArr[i] = webMessagePortCompatArr[i].getFrameworkPort();
        }
        return webMessagePortArr;
    }

    @RequiresApi(23)
    @NonNull
    public static WebMessageCompat frameworkMessageToCompat(WebMessage webMessage) {
        return new WebMessageCompat(webMessage.getData(), portsToCompat(webMessage.getPorts()));
    }

    private WebMessagePortBoundaryInterface getBoundaryInterface() {
        if (this.mBoundaryInterface == null) {
            this.mBoundaryInterface = (WebMessagePortBoundaryInterface) C12660a.m28162a(WebMessagePortBoundaryInterface.class, WebViewGlueCommunicator.getCompatConverter().convertWebMessagePort(this.mFrameworksImpl));
        }
        return this.mBoundaryInterface;
    }

    @RequiresApi(23)
    private WebMessagePort getFrameworksImpl() {
        if (this.mFrameworksImpl == null) {
            this.mFrameworksImpl = WebViewGlueCommunicator.getCompatConverter().convertWebMessagePort(Proxy.getInvocationHandler(this.mBoundaryInterface));
        }
        return this.mFrameworksImpl;
    }

    @Nullable
    public static WebMessagePortCompat[] portsToCompat(WebMessagePort[] webMessagePortArr) {
        if (webMessagePortArr == null) {
            return null;
        }
        WebMessagePortCompat[] webMessagePortCompatArr = new WebMessagePortCompat[webMessagePortArr.length];
        for (int i = 0; i < webMessagePortArr.length; i++) {
            webMessagePortCompatArr[i] = new WebMessagePortImpl(webMessagePortArr[i]);
        }
        return webMessagePortCompatArr;
    }

    public void close() {
        WebViewFeatureInternal webViewFeatureInternal = WebViewFeatureInternal.WEB_MESSAGE_PORT_CLOSE;
        if (webViewFeatureInternal.isSupportedByFramework()) {
            getFrameworksImpl().close();
        } else if (webViewFeatureInternal.isSupportedByWebView()) {
            getBoundaryInterface().close();
        } else {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    @RequiresApi(23)
    public WebMessagePort getFrameworkPort() {
        return getFrameworksImpl();
    }

    public InvocationHandler getInvocationHandler() {
        return Proxy.getInvocationHandler(getBoundaryInterface());
    }

    public void postMessage(@NonNull WebMessageCompat webMessageCompat) {
        WebViewFeatureInternal webViewFeatureInternal = WebViewFeatureInternal.WEB_MESSAGE_PORT_POST_MESSAGE;
        if (webViewFeatureInternal.isSupportedByFramework()) {
            getFrameworksImpl().postMessage(compatToFrameworkMessage(webMessageCompat));
        } else if (webViewFeatureInternal.isSupportedByWebView()) {
            getBoundaryInterface().postMessage(C12660a.m28164c(new WebMessageAdapter(webMessageCompat)));
        } else {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    public void setWebMessageCallback(@NonNull final WebMessagePortCompat.WebMessageCallbackCompat webMessageCallbackCompat) {
        WebViewFeatureInternal webViewFeatureInternal = WebViewFeatureInternal.WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK;
        if (webViewFeatureInternal.isSupportedByFramework()) {
            getFrameworksImpl().setWebMessageCallback(new WebMessagePort.WebMessageCallback() {
                public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
                    webMessageCallbackCompat.onMessage(new WebMessagePortImpl(webMessagePort), WebMessagePortImpl.frameworkMessageToCompat(webMessage));
                }
            });
        } else if (webViewFeatureInternal.isSupportedByWebView()) {
            getBoundaryInterface().setWebMessageCallback(C12660a.m28164c(new WebMessageCallbackAdapter(webMessageCallbackCompat)));
        } else {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }

    public WebMessagePortImpl(InvocationHandler invocationHandler) {
        this.mBoundaryInterface = (WebMessagePortBoundaryInterface) C12660a.m28162a(WebMessagePortBoundaryInterface.class, invocationHandler);
    }

    public void setWebMessageCallback(Handler handler, @NonNull final WebMessagePortCompat.WebMessageCallbackCompat webMessageCallbackCompat) {
        WebViewFeatureInternal webViewFeatureInternal = WebViewFeatureInternal.CREATE_WEB_MESSAGE_CHANNEL;
        if (webViewFeatureInternal.isSupportedByFramework()) {
            getFrameworksImpl().setWebMessageCallback(new WebMessagePort.WebMessageCallback() {
                public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
                    webMessageCallbackCompat.onMessage(new WebMessagePortImpl(webMessagePort), WebMessagePortImpl.frameworkMessageToCompat(webMessage));
                }
            }, handler);
        } else if (webViewFeatureInternal.isSupportedByWebView()) {
            getBoundaryInterface().setWebMessageCallback(C12660a.m28164c(new WebMessageCallbackAdapter(webMessageCallbackCompat)), handler);
        } else {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
    }
}
