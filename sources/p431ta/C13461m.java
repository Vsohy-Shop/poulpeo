package p431ta;

import com.rmn.api.p322v2.poulpeo.model.PLPUser;
import com.rmn.apiclient.core.data_access.base.call.BaseOutput;
import com.rmn.apiclient.core.data_access.base.call.listeners.OnSuccessListener;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyOutput;

/* renamed from: ta.m */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C13461m implements OnSuccessListener {

    /* renamed from: a */
    public final /* synthetic */ C13462n f21582a;

    /* renamed from: b */
    public final /* synthetic */ PLPUser f21583b;

    public /* synthetic */ C13461m(C13462n nVar, PLPUser pLPUser) {
        this.f21582a = nVar;
        this.f21583b = pLPUser;
    }

    public final void onSuccess(BaseOutput baseOutput) {
        this.f21582a.m30601w2(this.f21583b, (ProxyOutput) baseOutput);
    }
}
