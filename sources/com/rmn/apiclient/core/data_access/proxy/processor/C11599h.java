package com.rmn.apiclient.core.data_access.proxy.processor;

import com.rmn.apiclient.core.data_access.base.call.BaseOutput;
import com.rmn.apiclient.core.data_access.base.call.listeners.OnSuccessListener;
import com.rmn.apiclient.core.data_access.base.processor.IActionProcessorListener;
import com.rmn.apiclient.core.data_access.cache.call.CacheOutput;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyInput;

/* renamed from: com.rmn.apiclient.core.data_access.proxy.processor.h */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11599h implements OnSuccessListener {

    /* renamed from: a */
    public final /* synthetic */ ProxyProcessorGetFromCache f18051a;

    /* renamed from: b */
    public final /* synthetic */ IActionProcessorListener f18052b;

    /* renamed from: c */
    public final /* synthetic */ ProxyInput f18053c;

    public /* synthetic */ C11599h(ProxyProcessorGetFromCache proxyProcessorGetFromCache, IActionProcessorListener iActionProcessorListener, ProxyInput proxyInput) {
        this.f18051a = proxyProcessorGetFromCache;
        this.f18052b = iActionProcessorListener;
        this.f18053c = proxyInput;
    }

    public final void onSuccess(BaseOutput baseOutput) {
        this.f18051a.lambda$process$1(this.f18052b, this.f18053c, (CacheOutput) baseOutput);
    }
}
