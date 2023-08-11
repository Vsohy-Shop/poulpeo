package com.rmn.apiclient.core.data_access.proxy.processor;

import com.rmn.apiclient.core.data_access.base.call.CallException;
import com.rmn.apiclient.core.data_access.base.call.listeners.OnFailureListener;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyInput;
import p446vd.C13633n;

/* renamed from: com.rmn.apiclient.core.data_access.proxy.processor.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11596e implements OnFailureListener {

    /* renamed from: a */
    public final /* synthetic */ ProxyInput f18044a;

    public /* synthetic */ C11596e(ProxyInput proxyInput) {
        this.f18044a = proxyInput;
    }

    public final void onFailure(CallException callException) {
        C13633n.m31152h("Couldn't clear cache data : " + this.f18044a.getMethodDescriptor());
    }
}
