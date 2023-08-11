package com.rmn.apiclient.core.data_access.proxy.processor;

import com.rmn.apiclient.core.data_access.base.call.BaseOutput;
import com.rmn.apiclient.core.data_access.base.call.listeners.OnSuccessListener;
import com.rmn.apiclient.core.data_access.base.processor.IActionProcessorListener;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyInput;
import com.rmn.apiclient.core.data_access.service.call.ServiceOutput;

/* renamed from: com.rmn.apiclient.core.data_access.proxy.processor.d */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11595d implements OnSuccessListener {

    /* renamed from: a */
    public final /* synthetic */ ProxyProcessorCallService f18041a;

    /* renamed from: b */
    public final /* synthetic */ IActionProcessorListener f18042b;

    /* renamed from: c */
    public final /* synthetic */ ProxyInput f18043c;

    public /* synthetic */ C11595d(ProxyProcessorCallService proxyProcessorCallService, IActionProcessorListener iActionProcessorListener, ProxyInput proxyInput) {
        this.f18041a = proxyProcessorCallService;
        this.f18042b = iActionProcessorListener;
        this.f18043c = proxyInput;
    }

    public final void onSuccess(BaseOutput baseOutput) {
        this.f18041a.lambda$process$1(this.f18042b, this.f18043c, (ServiceOutput) baseOutput);
    }
}
