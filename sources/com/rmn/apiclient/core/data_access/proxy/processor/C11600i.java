package com.rmn.apiclient.core.data_access.proxy.processor;

import com.rmn.apiclient.core.data_access.base.call.BaseCall;
import com.rmn.apiclient.core.data_access.base.call.listeners.OnCompleteListener;
import com.rmn.apiclient.core.data_access.base.processor.IActionProcessorListener;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyOutput;

/* renamed from: com.rmn.apiclient.core.data_access.proxy.processor.i */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11600i implements OnCompleteListener {

    /* renamed from: a */
    public final /* synthetic */ ProxyProcessorGetRemoteImageConfig f18054a;

    /* renamed from: b */
    public final /* synthetic */ IActionProcessorListener f18055b;

    /* renamed from: c */
    public final /* synthetic */ ProxyOutput f18056c;

    public /* synthetic */ C11600i(ProxyProcessorGetRemoteImageConfig proxyProcessorGetRemoteImageConfig, IActionProcessorListener iActionProcessorListener, ProxyOutput proxyOutput) {
        this.f18054a = proxyProcessorGetRemoteImageConfig;
        this.f18055b = iActionProcessorListener;
        this.f18056c = proxyOutput;
    }

    public final void onComplete(BaseCall baseCall) {
        this.f18054a.lambda$process$0(this.f18055b, this.f18056c, baseCall);
    }
}
