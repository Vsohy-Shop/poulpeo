package p431ta;

import com.rmn.apiclient.core.data_access.base.call.BaseOutput;
import com.rmn.apiclient.core.data_access.base.call.listeners.OnSuccessListener;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyOutput;
import com.rmn.apiclient.core.data_access.proxy.strategy.ProxyStrategyChain;

/* renamed from: ta.r */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C13467r implements OnSuccessListener {

    /* renamed from: a */
    public final /* synthetic */ C13470u f21602a;

    /* renamed from: b */
    public final /* synthetic */ int f21603b;

    /* renamed from: c */
    public final /* synthetic */ int f21604c;

    /* renamed from: d */
    public final /* synthetic */ ProxyStrategyChain f21605d;

    public /* synthetic */ C13467r(C13470u uVar, int i, int i2, ProxyStrategyChain proxyStrategyChain) {
        this.f21602a = uVar;
        this.f21603b = i;
        this.f21604c = i2;
        this.f21605d = proxyStrategyChain;
    }

    public final void onSuccess(BaseOutput baseOutput) {
        this.f21602a.m30647D2(this.f21603b, this.f21604c, this.f21605d, (ProxyOutput) baseOutput);
    }
}
