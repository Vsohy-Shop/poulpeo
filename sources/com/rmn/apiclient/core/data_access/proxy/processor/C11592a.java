package com.rmn.apiclient.core.data_access.proxy.processor;

import com.rmn.apiclient.core.data_access.base.call.CallException;
import com.rmn.apiclient.core.data_access.base.call.listeners.OnFailureListener;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyInput;
import p446vd.C13633n;

/* renamed from: com.rmn.apiclient.core.data_access.proxy.processor.a */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11592a implements OnFailureListener {

    /* renamed from: a */
    public final /* synthetic */ ProxyInput f18034a;

    public /* synthetic */ C11592a(ProxyInput proxyInput) {
        this.f18034a = proxyInput;
    }

    public final void onFailure(CallException callException) {
        C13633n.m31152h("Couldn't add data to cache : " + this.f18034a.getMethodDescriptor());
    }
}
