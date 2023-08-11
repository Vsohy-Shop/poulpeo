package androidx.webkit.internal;

import androidx.annotation.NonNull;
import androidx.webkit.WebMessagePortCompat;
import androidx.webkit.WebViewFeature;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface;
import p378kg.C12660a;

public class WebMessageCallbackAdapter implements WebMessageCallbackBoundaryInterface {
    WebMessagePortCompat.WebMessageCallbackCompat mImpl;

    public WebMessageCallbackAdapter(@NonNull WebMessagePortCompat.WebMessageCallbackCompat webMessageCallbackCompat) {
        this.mImpl = webMessageCallbackCompat;
    }

    @NonNull
    public String[] getSupportedFeatures() {
        return new String[]{WebViewFeature.WEB_MESSAGE_CALLBACK_ON_MESSAGE};
    }

    public void onMessage(InvocationHandler invocationHandler, InvocationHandler invocationHandler2) {
        this.mImpl.onMessage(new WebMessagePortImpl(invocationHandler), WebMessageAdapter.webMessageCompatFromBoundaryInterface((WebMessageBoundaryInterface) C12660a.m28162a(WebMessageBoundaryInterface.class, invocationHandler2)));
    }
}
