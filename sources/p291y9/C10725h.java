package p291y9;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data.structure.IDocument;
import com.rmn.apiclient.core.data.structure.IResource;
import com.rmn.apiclient.core.data_access.base.call.BaseCall;
import com.rmn.apiclient.core.data_access.base.call.CallException;
import com.rmn.apiclient.core.data_access.base.call.CallManager;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyOutput;
import com.rmn.apiclient.core.data_access.proxy.strategy.ProxyStrategy;
import com.rmn.apiclient.core.model.IModel;
import com.rmn.apiclient.core.model.ModelRelationship;
import com.rmn.apiclient.impl.api.call.APIIncludes;
import com.rmn.apiclient.impl.api.methods.CampaignApi;
import com.rmn.apiclient.impl.api.methods.MerchantApi;
import com.rmn.apiclient.impl.api.methods.OfferApi;
import com.rmn.apiclient.impl.api.models.Campaign;
import com.rmn.apiclient.impl.api.models.Merchant;
import com.rmn.apiclient.impl.api.models.submodels.campaign.CampaignTarget;
import com.rmn.apiclient.impl.api.models.submodels.page.BasePageSection;
import com.rmn.utils_common.IListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p225s9.C9584b;
import p258v9.C10058c;
import p269w9.C10153a;
import p440ud.C13567m;

/* renamed from: y9.h */
/* compiled from: CampaignsSectionController */
public class C10725h extends C9584b {

    /* renamed from: y9.h$a */
    /* compiled from: CampaignsSectionController */
    static class C10726a extends C9584b.C9585a {
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: c */
        public final String f16366c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final int f16367d;

        protected C10726a(@NonNull BasePageSection basePageSection, @NonNull String str, int i, @NonNull C10058c cVar) {
            super(basePageSection, cVar);
            this.f16366c = str;
            this.f16367d = i;
        }
    }

    /* renamed from: y9.h$b */
    /* compiled from: CampaignsSectionController */
    static class C10727b extends C9584b.C9586b {
        protected C10727b(@NonNull CallManager callManager, @NonNull C13567m mVar) {
            super(callManager, mVar);
        }
    }

    public C10725h(@NonNull C10153a aVar, @NonNull C10727b bVar) {
        super(aVar, bVar);
    }

    /* renamed from: B2 */
    public static void m22851B2(@NonNull Set<Campaign> set, @Nullable IDocument iDocument) {
        if (iDocument != null) {
            for (Campaign next : set) {
                ModelRelationship<?> modelRelationship = next.targetRelationship;
                if (modelRelationship != null) {
                    String str = modelRelationship.f18064id;
                    Iterator<IResource<?>> it = iDocument.getDataResources().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        IResource next2 = it.next();
                        if (str.equals(next2.getResourceId().getId())) {
                            next.targetRelationship.updateModelReference(next2.getModelReference());
                            break;
                        }
                    }
                }
            }
        }
    }

    @NonNull
    /* renamed from: C2 */
    public static List<IModel> m22852C2(@NonNull List<IModel> list) {
        ModelRelationship<?> modelRelationship;
        ArrayList arrayList = new ArrayList(list.size());
        for (IModel next : list) {
            if ((next instanceof Campaign) && (modelRelationship = ((Campaign) next).targetRelationship) != null) {
                Object model = modelRelationship.getModel();
                if (model instanceof Merchant) {
                    arrayList.add(model);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: D2 */
    public static void m22853D2(@NonNull List<Campaign> list, @NonNull CampaignTarget campaignTarget, @NonNull Set<String> set, @NonNull Set<Campaign> set2) {
        ModelRelationship<?> modelRelationship;
        for (Campaign next : list) {
            if (next.dataTarget == campaignTarget && (modelRelationship = next.targetRelationship) != null) {
                set.add(modelRelationship.f18064id);
                set2.add(next);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E2 */
    public /* synthetic */ void m22854E2(CallException callException) {
        mo44054t2(callException.getHttpCodeIfAny(), false);
    }

    /* access modifiers changed from: private */
    /* renamed from: G2 */
    public /* synthetic */ void m22856G2(List list, IListener iListener, List list2, Void voidR) {
        m22861L2(list, new C10723f(iListener, list2));
    }

    /* access modifiers changed from: private */
    /* renamed from: H2 */
    public /* synthetic */ void m22857H2(C9584b.C9585a aVar, IListener iListener, ProxyOutput proxyOutput) {
        if (!proxyOutput.hasDocument()) {
            mo44054t2(0, true);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (IModel iModel : proxyOutput.getDocument().optModels()) {
            if (iModel instanceof Campaign) {
                Campaign campaign = (Campaign) iModel;
                if (campaign.dataTarget != CampaignTarget.PAGE) {
                    arrayList.add(iModel);
                } else if (!campaign.getTargetId().equals(aVar.f14275b.mo44641c())) {
                    arrayList.add(iModel);
                }
            }
        }
        if (arrayList.isEmpty()) {
            mo44054t2(0, true);
        } else {
            m22860K2(arrayList, new C10721d(this, arrayList, iListener, arrayList));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public static /* synthetic */ void m22858I2(Set set, IListener iListener, BaseCall baseCall) {
        m22851B2(set, ((ProxyOutput) baseCall.getOutput()).getDocument());
        iListener.mo40744J0(null);
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public static /* synthetic */ void m22859J2(Set set, IListener iListener, BaseCall baseCall) {
        m22851B2(set, ((ProxyOutput) baseCall.getOutput()).getDocument());
        iListener.mo40744J0(null);
    }

    /* renamed from: K2 */
    private void m22860K2(@NonNull List<Campaign> list, @NonNull IListener<Void> iListener) {
        HashSet hashSet = new HashSet(list.size());
        HashSet hashSet2 = new HashSet(list.size());
        m22853D2(list, CampaignTarget.MERCHANT, hashSet, hashSet2);
        if (hashSet.isEmpty()) {
            iListener.mo40744J0(null);
        } else {
            this.f14272f = ((MerchantApi.GetMerchants) new MerchantApi.GetMerchants(hashSet, ProxyStrategy.getFromCache().orThenCallService().thenAddInCache()).setIncludeWithMerchantParam(APIIncludes.CURRENT_CASHBACK_OBJECT)).call(mo44053p2()).onComplete(new C10722e(hashSet2, iListener)).callId;
        }
    }

    /* renamed from: L2 */
    private void m22861L2(@NonNull List<Campaign> list, @NonNull IListener<Void> iListener) {
        HashSet hashSet = new HashSet(list.size());
        HashSet hashSet2 = new HashSet(list.size());
        m22853D2(list, CampaignTarget.OFFER, hashSet, hashSet2);
        if (hashSet.isEmpty()) {
            iListener.mo40744J0(null);
        } else {
            this.f14272f = ((OfferApi.GetOffers) new OfferApi.GetOffers(hashSet, ProxyStrategy.getFromCache().orThenCallService().thenAddInCache()).setIncludeWithOfferParam("merchant", APIIncludes.CURRENT_CASHBACK_OBJECT)).call(mo44053p2()).onComplete(new C10724g(hashSet2, iListener)).callId;
        }
    }

    /* renamed from: n2 */
    public void mo28500n2(@NonNull C9584b.C9585a aVar, @NonNull IListener<List<IModel>> iListener) {
        C10726a aVar2 = (C10726a) aVar;
        String a = aVar2.f16366c;
        int b = aVar2.f16367d;
        mo44053p2().cancel(this.f14272f);
        CampaignApi.GetCampaignsOfType getCampaignsOfType = (CampaignApi.GetCampaignsOfType) new CampaignApi.GetCampaignsOfType(a, ProxyStrategy.getFromCache().orThenCallService().thenAddInCache()).setSortParam("dataPosition", "-dataPriority");
        if (b > 0) {
            getCampaignsOfType.setLimitParam(b);
        }
        this.f14272f = getCampaignsOfType.call(mo44053p2()).onFailure(new C10719b(this)).onSuccess(new C10720c(this, aVar, iListener)).callId;
    }
}
