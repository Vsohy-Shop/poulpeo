package com.rmn.apiclient.core.data_access.proxy.processor;

import com.rmn.apiclient.core.data_access.base.call.CallException;
import com.rmn.apiclient.core.data_access.base.call.listeners.OnFailureListener;
import com.rmn.apiclient.core.data_access.base.processor.IActionProcessorListener;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyInput;

/* renamed from: com.rmn.apiclient.core.data_access.proxy.processor.g */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11598g implements OnFailureListener {

    /* renamed from: a */
    public final /* synthetic */ ProxyProcessorGetFromCache f18048a;

    /* renamed from: b */
    public final /* synthetic */ IActionProcessorListener f18049b;

    /* renamed from: c */
    public final /* synthetic */ ProxyInput f18050c;

    public /* synthetic */ C11598g(ProxyProcessorGetFromCache proxyProcessorGetFromCache, IActionProcessorListener iActionProcessorListener, ProxyInput proxyInput) {
        this.f18048a = proxyProcessorGetFromCache;
        this.f18049b = iActionProcessorListener;
        this.f18050c = proxyInput;
    }

    public final void onFailure(CallException callException) {
        this.f18048a.lambda$process$0(this.f18049b, this.f18050c, callException);
    }
}
