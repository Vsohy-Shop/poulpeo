package com.rmn.api.p322v2.main.oauth;

import com.rmn.api.p322v2.main.general.IApiType;
import com.rmn.api.p322v2.main.result.ResponseResult;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Interceptor;

/* renamed from: com.rmn.api.v2.main.oauth.a */
/* compiled from: AsyncTask2Legged */
final class C11365a extends C11366b {

    /* renamed from: r */
    private Interceptor f17880r;

    public C11365a(ContextContainer contextContainer, BundleRequest bundleRequest, HttpMethod httpMethod, boolean z) {
        super(contextContainer, bundleRequest, httpMethod, z);
        if (bundleRequest.getApi() != null) {
            m24923w();
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: w */
    private void m24923w() {
        String str;
        String str2;
        OAuthAccountManager instance = OAuthAccountManager.getInstance();
        IApiType p = mo47094p();
        if (instance.isConnectedToAccount(p)) {
            str = instance.getAccessKey(p);
            str2 = instance.getAccessSecret(p);
        } else {
            str = instance.getRequestKey(p);
            str2 = instance.getRequestSecret(p);
        }
        this.f17880r = new Oauth1SigningInterceptor(p.getClientId(), p.getClientSecret(), str, str2);
    }

    /* renamed from: x */
    private void m24924x() {
        this.f17880r = null;
        m24923w();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public List<Interceptor> mo47085n() {
        List<Interceptor> n = super.mo47085n();
        n.add(this.f17880r);
        return n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public Map<String, String> mo47086o() {
        HashMap hashMap = new HashMap();
        hashMap.put("realm", mo47095q().getEndPointUrl());
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo47087s(boolean z) {
        if (z && this.f17894q != null) {
            ResponseResult responseResult = new ResponseResult(mo47094p(), this.f17894q);
            if (responseResult.hasWellFormedRawData() && !responseResult.hasNoError()) {
                int errorCode = responseResult.getErrorCode();
                if (errorCode == 0 || errorCode == 256) {
                    m24924x();
                }
            }
        }
    }
}
