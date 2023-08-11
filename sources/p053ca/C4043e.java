package p053ca;

import com.rmn.apiclient.core.data_access.base.call.BaseOutput;
import com.rmn.apiclient.core.data_access.base.call.listeners.OnSuccessListener;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyOutput;
import com.rmn.utils_common.IListener;
import p225s9.C9584b;

/* renamed from: ca.e */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4043e implements OnSuccessListener {

    /* renamed from: a */
    public final /* synthetic */ C4044f f3246a;

    /* renamed from: b */
    public final /* synthetic */ C9584b.C9585a f3247b;

    /* renamed from: c */
    public final /* synthetic */ String f3248c;

    /* renamed from: d */
    public final /* synthetic */ IListener f3249d;

    public /* synthetic */ C4043e(C4044f fVar, C9584b.C9585a aVar, String str, IListener iListener) {
        this.f3246a = fVar;
        this.f3247b = aVar;
        this.f3248c = str;
        this.f3249d = iListener;
    }

    public final void onSuccess(BaseOutput baseOutput) {
        this.f3246a.m4780y2(this.f3247b, this.f3248c, this.f3249d, (ProxyOutput) baseOutput);
    }
}
