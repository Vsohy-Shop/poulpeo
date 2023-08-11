package okhttp3;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import okhttp3.Interceptor;

/* compiled from: OkHttpClient.kt */
public final class OkHttpClient$Builder$addInterceptor$2 implements Interceptor {
    final /* synthetic */ Function1<Interceptor.Chain, Response> $block;

    public OkHttpClient$Builder$addInterceptor$2(Function1<? super Interceptor.Chain, Response> function1) {
        this.$block = function1;
    }

    public final Response intercept(Interceptor.Chain chain) {
        C12775o.m28639i(chain, "chain");
        return this.$block.invoke(chain);
    }
}
