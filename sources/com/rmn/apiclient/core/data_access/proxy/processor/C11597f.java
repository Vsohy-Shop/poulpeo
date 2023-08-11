package com.rmn.apiclient.core.data_access.proxy.processor;

import com.rmn.apiclient.core.data_access.base.call.BaseCall;
import com.rmn.apiclient.core.data_access.base.call.listeners.OnCompleteListener;
import com.rmn.apiclient.core.data_access.base.processor.IActionProcessorListener;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyOutput;

/* renamed from: com.rmn.apiclient.core.data_access.proxy.processor.f */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11597f implements OnCompleteListener {

    /* renamed from: a */
    public final /* synthetic */ ProxyProcessorClearCache f18045a;

    /* renamed from: b */
    public final /* synthetic */ IActionProcessorListener f18046b;

    /* renamed from: c */
    public final /* synthetic */ ProxyOutput f18047c;

    public /* synthetic */ C11597f(ProxyProcessorClearCache proxyProcessorClearCache, IActionProcessorListener iActionProcessorListener, ProxyOutput proxyOutput) {
        this.f18045a = proxyProcessorClearCache;
        this.f18046b = iActionProcessorListener;
        this.f18047c = proxyOutput;
    }

    public final void onComplete(BaseCall baseCall) {
        this.f18045a.lambda$process$1(this.f18046b, this.f18047c, baseCall);
    }
}
