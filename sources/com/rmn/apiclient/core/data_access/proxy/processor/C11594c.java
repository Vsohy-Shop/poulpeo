package com.rmn.apiclient.core.data_access.proxy.processor;

import com.rmn.apiclient.core.data_access.base.call.CallException;
import com.rmn.apiclient.core.data_access.base.call.listeners.OnFailureListener;
import com.rmn.apiclient.core.data_access.base.processor.IActionProcessorListener;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyInput;

/* renamed from: com.rmn.apiclient.core.data_access.proxy.processor.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11594c implements OnFailureListener {

    /* renamed from: a */
    public final /* synthetic */ ProxyProcessorCallService f18038a;

    /* renamed from: b */
    public final /* synthetic */ IActionProcessorListener f18039b;

    /* renamed from: c */
    public final /* synthetic */ ProxyInput f18040c;

    public /* synthetic */ C11594c(ProxyProcessorCallService proxyProcessorCallService, IActionProcessorListener iActionProcessorListener, ProxyInput proxyInput) {
        this.f18038a = proxyProcessorCallService;
        this.f18039b = iActionProcessorListener;
        this.f18040c = proxyInput;
    }

    public final void onFailure(CallException callException) {
        this.f18038a.lambda$process$0(this.f18039b, this.f18040c, callException);
    }
}
