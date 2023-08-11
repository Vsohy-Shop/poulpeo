package p291y9;

import com.rmn.apiclient.core.data_access.base.call.BaseOutput;
import com.rmn.apiclient.core.data_access.base.call.listeners.OnSuccessListener;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyOutput;
import com.rmn.utils_common.IListener;
import p225s9.C9584b;

/* renamed from: y9.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C10720c implements OnSuccessListener {

    /* renamed from: a */
    public final /* synthetic */ C10725h f16353a;

    /* renamed from: b */
    public final /* synthetic */ C9584b.C9585a f16354b;

    /* renamed from: c */
    public final /* synthetic */ IListener f16355c;

    public /* synthetic */ C10720c(C10725h hVar, C9584b.C9585a aVar, IListener iListener) {
        this.f16353a = hVar;
        this.f16354b = aVar;
        this.f16355c = iListener;
    }

    public final void onSuccess(BaseOutput baseOutput) {
        this.f16353a.m22857H2(this.f16354b, this.f16355c, (ProxyOutput) baseOutput);
    }
}
