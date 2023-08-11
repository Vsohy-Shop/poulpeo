package p373kb;

import androidx.annotation.NonNull;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.proxy.IProxyListener;
import com.rmn.api.p322v2.main.proxy.IProxyMethodType;
import com.rmn.api.p322v2.main.proxy.ProxyActionsPool;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.api.p322v2.poulpeo.model.PLPUser;
import com.rmn.api.p322v2.poulpeo.model.PLPUserGrade;
import com.rmn.api.p322v2.poulpeo.model.SponsoredUser;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsPLPUser;
import com.rmn.apiclient.core.data_access.base.call.CallException;
import com.rmn.apiclient.core.data_access.base.call.CallManager;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyOutput;
import com.rmn.apiclient.core.data_access.proxy.strategy.ProxyStrategy;
import com.rmn.apiclient.core.model.IModel;
import com.rmn.apiclient.impl.api.methods.CampaignApi;
import com.rmn.apiclient.impl.api.models.Campaign;
import com.rmn.p324ui.views.listview.C11654c;
import com.rmn.p324ui.views.listview.C11659h;
import com.rmn.p324ui.wrappers.ResourceStringWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p009j9.C2036a;
import p009j9.C2037b;
import p305ad.C10861a;
import p311bd.C10930a;
import p415qc.C13240e;
import p427sc.C13386c;
import p432tb.C13477a;
import p432tb.C13478b;
import p440ud.C13566l;
import p445vc.C13616e;
import p445vc.C13617f;
import p445vc.C13618g;
import p446vd.C13621b;
import p446vd.C13633n;
import p451wc.C13691a;

/* renamed from: kb.d */
/* compiled from: SponsorshipController */
public class C12647d extends C10861a implements IProxyListener {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C2036a f20318f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f20319g;

    /* renamed from: h */
    private String f20320h;

    /* renamed from: kb.d$a */
    /* compiled from: SponsorshipController */
    class C12648a implements C11659h {

        /* renamed from: a */
        final /* synthetic */ ProxyBundleInput f20321a;

        /* renamed from: b */
        final /* synthetic */ ProxyBundleOutput f20322b;

        C12648a(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
            this.f20321a = proxyBundleInput;
            this.f20322b = proxyBundleOutput;
        }

        /* renamed from: a */
        public boolean mo47905a(int i) {
            return false;
        }

        /* renamed from: b */
        public boolean mo47906b() {
            boolean z;
            int intValue = ((Integer) this.f20321a.getParamValue(PLPMethodParameters.OFFSET)).intValue();
            Integer num = (Integer) this.f20322b.getResponseObject(PLPMethodReturns.TOTAL_COUNT);
            if (num == null) {
                num = 0;
            }
            ArrayList arrayList = new ArrayList();
            SponsoredUser[] sponsoredUserArr = (SponsoredUser[]) this.f20322b.getResponseObject(PLPMethodReturns.SPONSORED_USER_ARRAY);
            List arrayList2 = new ArrayList();
            if (sponsoredUserArr != null) {
                arrayList2 = Arrays.asList(sponsoredUserArr);
            }
            if (intValue <= 0) {
                C12647d.this.mo45811n2().mo53071X2();
                if (arrayList2.isEmpty()) {
                    arrayList.add(C12647d.this.f20318f);
                    z = false;
                } else {
                    z = true;
                }
                arrayList.add(0, new C2037b(C12647d.this.f20319g, z));
            }
            arrayList.addAll(arrayList2);
            C12647d.this.mo45811n2().mo45965m2(arrayList, intValue, num.intValue());
            C12647d.this.m28113D2();
            return true;
        }
    }

    /* renamed from: kb.d$b */
    /* compiled from: SponsorshipController */
    public static class C12649b extends C10861a.C10862a {
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: f */
        public final ResourceStringWrapper f20324f;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: g */
        public final ResourceStringWrapper f20325g;

        public C12649b(@NonNull C13566l lVar, @NonNull LogoutListener logoutListener, @NonNull C13477a aVar, @NonNull C11654c cVar, @NonNull ResourceStringWrapper resourceStringWrapper, @NonNull ResourceStringWrapper resourceStringWrapper2) {
            super(lVar, logoutListener, (C10930a) aVar, cVar);
            this.f20324f = resourceStringWrapper;
            this.f20325g = resourceStringWrapper2;
        }
    }

    public C12647d(@NonNull C12650e eVar, @NonNull C12649b bVar) {
        super(eVar, bVar, false);
        this.f20318f = new C2036a(bVar.f20324f, bVar.f20325g);
    }

    @NonNull
    /* renamed from: C2 */
    private C12650e m28112C2() {
        return (C12650e) this.f16655b;
    }

    /* access modifiers changed from: private */
    /* renamed from: D2 */
    public void m28113D2() {
        new CampaignApi.GetCampaignsOfType("app_parrainage", ProxyStrategy.callService()).call(new CallManager(mo45820l2())).onFailure(new C12645b(this)).onSuccess(new C12646c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: E2 */
    public /* synthetic */ void m28114E2(CallException callException) {
        C13633n.m31150f(this, "ERROR", callException);
    }

    /* access modifiers changed from: private */
    /* renamed from: F2 */
    public /* synthetic */ void m28115F2(ProxyOutput proxyOutput) {
        if (!proxyOutput.hasDocument()) {
            C13633n.m31149e(this, "ERROR");
            return;
        }
        IModel optFirstModel = proxyOutput.getDocument().optFirstModel();
        if ((optFirstModel instanceof Campaign) && ((Campaign) optFirstModel).isValid()) {
            mo45811n2().mo45944A2(optFirstModel, 0);
        }
    }

    /* renamed from: H2 */
    private void m28116H2(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
        C13478b.m30706a(mo45811n2(), proxyBundleOutput, new C12648a(proxyBundleInput, proxyBundleOutput));
    }

    /* renamed from: I2 */
    private void m28117I2(@NonNull Campaign campaign) {
        if (campaign.dataSpecificUrl != null) {
            C13691a.m31351g(campaign.getTrackingCampaignId(), campaign.getTrackingMedium(), campaign.getTrackingSource(), campaign.getTrackingCampaignName(), (String) null, (String) null);
            new C13240e(mo45820l2()).mo52889g(new C13386c(mo45820l2(), campaign.getTrackingCampaignId(), campaign.getTrackingMedium(), campaign.getTrackingSource(), campaign.getTrackingCampaignName(), (String) null, (String) null));
            C13618g.f21930b.mo53279c("internal-campaign", campaign.getTrackingSource() + "-" + campaign.getTrackingCampaignId(), campaign.getTrackingCampaignId() + "-" + campaign.getTrackingCampaignName());
            C13621b.m31098l(this.f16656c.mo45822a(), campaign.dataSpecificUrl.toString());
        }
    }

    /* renamed from: J2 */
    private void m28118J2(ProxyBundleOutput proxyBundleOutput) {
        boolean z;
        if (proxyBundleOutput.getStatus() != ProxyBundleOutput.ProxyOutputStatus.OK) {
            m28112C2().mo46492Q1();
            return;
        }
        PLPUser pLPUser = (PLPUser) proxyBundleOutput.getResponseObject(PLPMethodReturns.PLP_USER_DETAIL);
        if (pLPUser == null) {
            m28112C2().mo46492Q1();
            return;
        }
        this.f20319g = pLPUser.getSponsorCode();
        this.f20320h = pLPUser.getSponsorUrl();
        C12650e C2 = m28112C2();
        if (pLPUser.getGrade() == PLPUserGrade.POULPEO_PLUS) {
            z = true;
        } else {
            z = false;
        }
        C2.mo46493v0(z);
        mo45811n2().mo45960R2(true);
    }

    /* renamed from: K2 */
    private void m28119K2(ProxyBundleInput.ProxySourcesOption proxySourcesOption, int i, int i2) {
        this.f16652e.cancelAndRemoveAllActions();
        ProxyBundleInput proxyBundleInput = new ProxyBundleInput(mo45820l2(), ProxyMethodsPLPUser.PLP_USER_GET_SPONSORED_USERS, proxySourcesOption, ProxyBundleInput.ProxyNetworkOption.ADD_IN_CACHE, mo45821m2());
        proxyBundleInput.addParamValue(PLPMethodParameters.OFFSET, Integer.valueOf(i));
        proxyBundleInput.addParamValue(PLPMethodParameters.LIMIT, Integer.valueOf(i2));
        this.f16652e.executeProxyAction(this, proxyBundleInput);
    }

    /* renamed from: L2 */
    private void m28120L2() {
        ProxyActionsPool proxyActionsPool = this.f16652e;
        IProxyMethodType iProxyMethodType = ProxyMethodsPLPUser.PLP_USER_GET_DETAILS;
        proxyActionsPool.cancelAndRemoveAllActionsWithMethod(iProxyMethodType);
        this.f16652e.executeProxyAction(this, new ProxyBundleInput(mo45820l2(), iProxyMethodType, ProxyBundleInput.ProxySourcesOption.GET_FROM_CACHE_THEN_NETWORK, ProxyBundleInput.ProxyNetworkOption.ADD_IN_CACHE, mo45821m2()));
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: G2 */
    public C13477a mo45811n2() {
        return (C13477a) super.mo45811n2();
    }

    /* renamed from: M0 */
    public void mo47901M0(C10930a aVar, int i) {
        m28119K2(ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_THEN_CLEAR_CACHE, 0, i);
    }

    /* renamed from: N0 */
    public void mo47902N0(C10930a aVar, Object obj) {
        if (obj instanceof C2037b) {
            m28112C2().mo46490L(this.f20319g, this.f20320h);
        } else if (obj instanceof Campaign) {
            m28117I2((Campaign) obj);
        }
    }

    /* renamed from: a */
    public void mo47903a(C10930a aVar, int i, int i2) {
        m28119K2(ProxyBundleInput.ProxySourcesOption.GET_FROM_CACHE_THEN_NETWORK, i, i2);
    }

    public void onProxyActionExecuted(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
        if (proxyBundleOutput.getMethodType() == ProxyMethodsPLPUser.PLP_USER_GET_DETAILS) {
            m28118J2(proxyBundleOutput);
        } else if (proxyBundleOutput.getMethodType() == ProxyMethodsPLPUser.PLP_USER_GET_SPONSORED_USERS) {
            m28116H2(proxyBundleInput, proxyBundleOutput);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p2 */
    public void mo45813p2() {
        m28120L2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo45819v2() {
        C13618g.f21930b.mo53280e(new C13616e("sponsorship", C13617f.PROFILE));
    }

    /* access modifiers changed from: protected */
    /* renamed from: r2 */
    public void mo45815r2() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: t2 */
    public void mo45817t2() {
    }

    /* renamed from: t0 */
    public void mo47904t0(C10930a aVar) {
    }
}
