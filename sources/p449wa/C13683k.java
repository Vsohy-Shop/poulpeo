package p449wa;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.apiclient.core.data_access.base.call.CallException;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyOutput;
import com.rmn.apiclient.core.data_access.proxy.strategy.ProxyStrategy;
import com.rmn.apiclient.core.model.IModel;
import com.rmn.apiclient.impl.api.call.APIIncludes;
import com.rmn.apiclient.impl.api.methods.ContainerApi;
import com.rmn.apiclient.impl.api.models.Merchant;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.p324ui.views.listview.C11654c;
import java.util.ArrayList;
import java.util.Collection;
import p311bd.C10930a;
import p445vc.C13616e;
import p445vc.C13617f;
import p445vc.C13618g;
import p446vd.C13633n;
import p449wa.C13672b;

/* renamed from: wa.k */
/* compiled from: MerchantListGridController */
public class C13683k extends C13672b {

    /* renamed from: wa.k$a */
    /* compiled from: MerchantListGridController */
    public static class C13684a extends C13672b.C13673a {
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: f */
        public final String f22030f;

        public C13684a(@NonNull ContextContainer contextContainer, @NonNull LogoutListener logoutListener, @NonNull C10930a aVar, @NonNull C11654c cVar, @NonNull String str) {
            super(contextContainer, logoutListener, aVar, cVar);
            this.f22030f = str;
        }
    }

    public C13683k(@NonNull C13680h hVar, @NonNull C13684a aVar) {
        super(hVar, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: B2 */
    public /* synthetic */ void m31326B2(CallException callException) {
        C13633n.m31150f(this, "ERROR", callException);
        mo53345y2().mo46388d();
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public /* synthetic */ void m31327C2(ProxyOutput proxyOutput) {
        if (!proxyOutput.hasDocument()) {
            C13633n.m31149e(this, "ERROR");
            mo53345y2().mo46388d();
            return;
        }
        Collection<IModel> optModels = proxyOutput.getDocument().optModels();
        ArrayList arrayList = new ArrayList();
        for (IModel iModel : optModels) {
            if (iModel instanceof Merchant) {
                arrayList.add((Merchant) iModel);
            }
        }
        m31328D2().f16653d.mo45964l2(arrayList, 0);
    }

    @NonNull
    /* renamed from: D2 */
    private C13684a m31328D2() {
        return (C13684a) this.f16656c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo45819v2() {
        super.mo45819v2();
        if (!TextUtils.isEmpty(m31328D2().f22030f)) {
            C13618g.f21930b.mo53280e(new C13616e(m31328D2().f22030f, C13617f.MERCHANT_LIST));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo50919x2() {
        this.f22020f.cancelAll();
        ((ContainerApi.GetContainerContent) new ContainerApi.GetContainerContent(m31328D2().f22030f, ProxyStrategy.getFromCache().orThenCallService().thenAddInCache()).setIncludeWithMerchantParam(APIIncludes.CURRENT_CASHBACK_OBJECT)).call(this.f22020f).onFailure(new C13681i(this)).onSuccess(new C13682j(this));
    }
}
