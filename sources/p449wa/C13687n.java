package p449wa;

import androidx.annotation.NonNull;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.apiclient.core.data_access.base.call.CallException;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyOutput;
import com.rmn.apiclient.core.data_access.proxy.strategy.ProxyStrategy;
import com.rmn.apiclient.impl.api.call.APIIncludes;
import com.rmn.apiclient.impl.api.methods.MerchantApi;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.p324ui.views.listview.C11654c;
import p311bd.C10930a;
import p446vd.C13633n;
import p449wa.C13672b;

/* renamed from: wa.n */
/* compiled from: MerchantSimilarGridController */
public class C13687n extends C13672b {

    /* renamed from: wa.n$a */
    /* compiled from: MerchantSimilarGridController */
    public static class C13688a extends C13672b.C13673a {
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: f */
        public final String f22033f;

        public C13688a(@NonNull ContextContainer contextContainer, @NonNull LogoutListener logoutListener, @NonNull C10930a aVar, @NonNull C11654c cVar, @NonNull String str) {
            super(contextContainer, logoutListener, aVar, cVar);
            this.f22033f = str;
        }
    }

    public C13687n(@NonNull C13680h hVar, @NonNull C13688a aVar) {
        super(hVar, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: B2 */
    public /* synthetic */ void m31334B2(CallException callException) {
        C13633n.m31150f(this, "ERROR", callException);
        mo53345y2().mo46388d();
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public /* synthetic */ void m31335C2(ProxyOutput proxyOutput) {
        if (!proxyOutput.hasDocument()) {
            C13633n.m31149e(this, "ERROR");
            mo53345y2().mo46388d();
            return;
        }
        m31336D2().f16653d.mo45964l2(proxyOutput.getDocument().optModels(), 0);
    }

    @NonNull
    /* renamed from: D2 */
    private C13688a m31336D2() {
        return (C13688a) this.f16656c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo50919x2() {
        this.f22020f.cancelAll();
        ((MerchantApi.GetSimilarMerchants) new MerchantApi.GetSimilarMerchants(m31336D2().f22033f, ProxyStrategy.getFromCache().orThenCallService().thenAddInCache()).setIncludeWithMerchantParam(APIIncludes.CURRENT_CASHBACK_OBJECT)).call(this.f22020f).onFailure(new C13685l(this)).onSuccess(new C13686m(this));
    }
}
