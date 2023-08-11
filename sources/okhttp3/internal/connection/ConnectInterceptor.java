package okhttp3.internal.connection;

import kotlin.jvm.internal.C12775o;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

/* compiled from: ConnectInterceptor.kt */
public final class ConnectInterceptor implements Interceptor {
    public static final ConnectInterceptor INSTANCE = new ConnectInterceptor();

    private ConnectInterceptor() {
    }

    public Response intercept(Interceptor.Chain chain) {
        C12775o.m28639i(chain, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        return RealInterceptorChain.copy$okhttp$default(realInterceptorChain, 0, realInterceptorChain.getCall$okhttp().initExchange$okhttp(realInterceptorChain), (Request) null, 0, 0, 0, 61, (Object) null).proceed(realInterceptorChain.getRequest$okhttp());
    }
}
