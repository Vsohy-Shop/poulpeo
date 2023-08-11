package p431ta;

import com.rmn.apiclient.core.data_access.base.call.BaseOutput;
import com.rmn.apiclient.core.data_access.base.call.listeners.OnSuccessListener;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyOutput;

/* renamed from: ta.t */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C13469t implements OnSuccessListener {

    /* renamed from: a */
    public final /* synthetic */ C13470u f21608a;

    /* renamed from: b */
    public final /* synthetic */ int f21609b;

    public /* synthetic */ C13469t(C13470u uVar, int i) {
        this.f21608a = uVar;
        this.f21609b = i;
    }

    public final void onSuccess(BaseOutput baseOutput) {
        this.f21608a.m30649F2(this.f21609b, (ProxyOutput) baseOutput);
    }
}
