package com.rmn.apiclient.core.data_access.proxy.processor;

import com.rmn.apiclient.core.data_access.base.call.BaseCall;
import com.rmn.apiclient.core.data_access.base.call.listeners.OnCompleteListener;
import com.rmn.apiclient.core.data_access.base.processor.IActionProcessorListener;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyOutput;

/* renamed from: com.rmn.apiclient.core.data_access.proxy.processor.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11593b implements OnCompleteListener {

    /* renamed from: a */
    public final /* synthetic */ ProxyProcessorAddToCache f18035a;

    /* renamed from: b */
    public final /* synthetic */ IActionProcessorListener f18036b;

    /* renamed from: c */
    public final /* synthetic */ ProxyOutput f18037c;

    public /* synthetic */ C11593b(ProxyProcessorAddToCache proxyProcessorAddToCache, IActionProcessorListener iActionProcessorListener, ProxyOutput proxyOutput) {
        this.f18035a = proxyProcessorAddToCache;
        this.f18036b = iActionProcessorListener;
        this.f18037c = proxyOutput;
    }

    public final void onComplete(BaseCall baseCall) {
        this.f18035a.lambda$process$1(this.f18036b, this.f18037c, baseCall);
    }
}
