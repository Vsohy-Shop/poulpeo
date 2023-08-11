package com.rmn.api.p322v2.main.oauth;

import com.rmn.iosadapters.android.content.ContextContainer;
import kotlin.Lazy;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import p404of.C13074a;
import p446vd.C13621b;

/* renamed from: com.rmn.api.v2.main.oauth.UserAgentInterceptor */
/* compiled from: UserAgentInterceptor.kt */
public final class UserAgentInterceptor implements Interceptor {
    private final Lazy userAgent$delegate;

    /* renamed from: com.rmn.api.v2.main.oauth.UserAgentInterceptor$a */
    /* compiled from: UserAgentInterceptor.kt */
    static final class C11364a extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ ContextContainer f17879g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11364a(ContextContainer contextContainer) {
            super(0);
            this.f17879g = contextContainer;
        }

        public final String invoke() {
            return C13621b.m31091e(this.f17879g);
        }
    }

    public UserAgentInterceptor(ContextContainer contextContainer) {
        C12775o.m28639i(contextContainer, "contextContainer");
        this.userAgent$delegate = C11901h.m25690b(new C11364a(contextContainer));
    }

    private final String getUserAgent() {
        return (String) this.userAgent$delegate.getValue();
    }

    public Response intercept(Interceptor.Chain chain) {
        C12775o.m28639i(chain, "chain");
        Request.Builder newBuilder = chain.request().newBuilder();
        String userAgent = getUserAgent();
        C12775o.m28638h(userAgent, "userAgent");
        return chain.proceed(newBuilder.header("User-Agent", userAgent).build());
    }
}
