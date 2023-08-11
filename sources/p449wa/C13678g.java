package p449wa;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.apiclient.core.data.structure.IDocument;
import com.rmn.apiclient.core.data_access.base.call.BaseCall;
import com.rmn.apiclient.core.data_access.base.call.CallException;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyOutput;
import com.rmn.apiclient.core.data_access.proxy.strategy.ProxyStrategy;
import com.rmn.apiclient.core.model.IModel;
import com.rmn.apiclient.core.model.ModelRelationship;
import com.rmn.apiclient.impl.api.call.APIIncludes;
import com.rmn.apiclient.impl.api.methods.CampaignApi;
import com.rmn.apiclient.impl.api.methods.MerchantApi;
import com.rmn.apiclient.impl.api.models.Campaign;
import com.rmn.apiclient.impl.api.models.submodels.campaign.CampaignTarget;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.p324ui.views.listview.C11654c;
import com.rmn.utils_common.IListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p291y9.C10725h;
import p311bd.C10930a;
import p446vd.C13633n;
import p449wa.C13672b;

/* renamed from: wa.g */
/* compiled from: MerchantCampaignsGridController */
public class C13678g extends C13672b {

    /* renamed from: wa.g$a */
    /* compiled from: MerchantCampaignsGridController */
    public static class C13679a extends C13672b.C13673a {
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: f */
        public final String f22027f;

        public C13679a(@NonNull ContextContainer contextContainer, @NonNull LogoutListener logoutListener, @NonNull C10930a aVar, @NonNull C11654c cVar, @NonNull String str) {
            super(contextContainer, logoutListener, aVar, cVar);
            this.f22027f = str;
        }
    }

    public C13678g(@NonNull C13680h hVar, @NonNull C13679a aVar) {
        super(hVar, aVar);
    }

    @Nullable
    /* renamed from: D2 */
    private Collection<Object> m31313D2(@NonNull List<Campaign> list, @Nullable IDocument iDocument) {
        if (iDocument == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Collection optModels = iDocument.optModels();
        for (Campaign campaign : list) {
            ModelRelationship<?> modelRelationship = campaign.targetRelationship;
            if (modelRelationship != null) {
                String str = modelRelationship.f18064id;
                Iterator it = optModels.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    IModel iModel = (IModel) it.next();
                    if (str.equals(iModel.getId())) {
                        arrayList.add(iModel);
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: E2 */
    public /* synthetic */ void m31314E2(CallException callException) {
        C13633n.m31150f(this, "ERROR", callException);
        mo53345y2().mo46388d();
    }

    /* access modifiers changed from: private */
    /* renamed from: F2 */
    public /* synthetic */ void m31315F2(Collection collection) {
        m31318I2().f16653d.mo45964l2(collection, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: G2 */
    public /* synthetic */ void m31316G2(ProxyOutput proxyOutput) {
        if (!proxyOutput.hasDocument()) {
            C13633n.m31149e(this, "ERROR");
            mo53345y2().mo46388d();
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (IModel iModel : proxyOutput.getDocument().optModels()) {
            if (iModel instanceof Campaign) {
                arrayList.add(iModel);
            }
        }
        m31319J2(arrayList, new C13676e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: H2 */
    public /* synthetic */ void m31317H2(List list, IListener iListener, BaseCall baseCall) {
        iListener.mo40744J0(m31313D2(list, ((ProxyOutput) baseCall.getOutput()).getDocument()));
    }

    @NonNull
    /* renamed from: I2 */
    private C13679a m31318I2() {
        return (C13679a) this.f16656c;
    }

    /* renamed from: J2 */
    private void m31319J2(@NonNull List<Campaign> list, @NonNull IListener<Collection<Object>> iListener) {
        HashSet hashSet = new HashSet(list.size());
        C10725h.m22853D2(list, CampaignTarget.MERCHANT, hashSet, new HashSet(list.size()));
        if (hashSet.isEmpty()) {
            iListener.mo40744J0(null);
        } else {
            ((MerchantApi.GetMerchants) new MerchantApi.GetMerchants(hashSet, ProxyStrategy.getFromCache().orThenCallService().thenAddInCache()).setIncludeWithMerchantParam(APIIncludes.CURRENT_CASHBACK_OBJECT)).call(this.f22020f).onComplete(new C13677f(this, list, iListener));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo50919x2() {
        this.f22020f.cancelAll();
        ((CampaignApi.GetCampaignsOfType) new CampaignApi.GetCampaignsOfType(m31318I2().f22027f, ProxyStrategy.getFromCache().orThenCallService().thenAddInCache()).setSortParam("dataPosition", "-dataPriority")).call(this.f22020f).onFailure(new C13674c(this)).onSuccess(new C13675d(this));
    }
}
