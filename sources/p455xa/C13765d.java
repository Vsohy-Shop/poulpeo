package p455xa;

import androidx.annotation.NonNull;
import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnType;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.p324ui.views.listview.C11659h;
import p305ad.C10861a;
import p311bd.C10932b;
import p402od.C13061a;
import p402od.C13063b;
import p432tb.C13478b;

/* renamed from: xa.d */
/* compiled from: MerchantGridControllerOld */
public abstract class C13765d extends C13061a {
    public C13765d(@NonNull C13063b bVar, @NonNull C10861a.C10862a aVar) {
        super(bVar, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C2 */
    public void mo50963C2(ProxyBundleOutput proxyBundleOutput, C11659h hVar) {
        C13478b.m30706a(mo45811n2(), proxyBundleOutput, hVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E2 */
    public RMNMethodReturnType mo50842E2() {
        return PLPMethodReturns.PLP_MERCHANT_ARRAY;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F2 */
    public C10932b mo50964F2() {
        return C10932b.f16862d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G2 */
    public RMNMethodParam mo50843G2() {
        return PLPMethodParameters.OFFSET;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H2 */
    public RMNMethodReturnType mo50844H2() {
        return PLPMethodReturns.TOTAL_COUNT;
    }
}
