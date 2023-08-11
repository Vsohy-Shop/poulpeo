package p407pa;

import androidx.annotation.NonNull;
import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import com.rmn.api.p322v2.cloud.proxy.methods.ProxyMethodsCloudList;
import com.rmn.api.p322v2.common.model.BaseMerchant;
import com.rmn.api.p322v2.common.model.CloudList;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.model.AbstractModel;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.apiclient.core.data_access.base.call.CallException;
import com.rmn.apiclient.core.data_access.base.call.CallManager;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyOutput;
import com.rmn.apiclient.core.data_access.proxy.strategy.ProxyStrategy;
import com.rmn.apiclient.impl.api.call.APIIncludes;
import com.rmn.apiclient.impl.api.methods.ContainerApi;
import com.rmn.apiclient.impl.api.models.Merchant;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p305ad.C10865d;
import p407pa.C13192g;
import p440ud.C13548a;
import p440ud.C13558g;
import p440ud.C13574r;
import p445vc.C13618g;
import p445vc.C13619h;
import p446vd.C13630k;
import p446vd.C13633n;

/* renamed from: pa.c */
/* compiled from: InstoreCashbackController */
public class C13186c extends C10865d implements C13574r.C13576b, C13194h {

    /* renamed from: d */
    private final List<Merchant> f20984d = new ArrayList();

    /* renamed from: e */
    private final List<BaseMerchant> f20985e = new ArrayList();
    @NonNull

    /* renamed from: f */
    private C13192g f20986f = new C13192g(this, new C13192g.C13193a(mo45820l2(), mo45821m2()));

    /* renamed from: g */
    private boolean f20987g = false;

    /* renamed from: h */
    private boolean f20988h;

    /* renamed from: i */
    private boolean f20989i;

    /* renamed from: j */
    private boolean f20990j;

    /* renamed from: k */
    private final CallManager f20991k = new CallManager(mo45820l2());

    /* renamed from: pa.c$a */
    /* compiled from: InstoreCashbackController */
    public static class C13187a extends C10865d.C10866a {
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: d */
        public final C13558g f20992d;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: e */
        public final C13574r f20993e;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: f */
        public final C13548a f20994f;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: g */
        public final C13548a f20995g;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: h */
        public final C13548a f20996h;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: i */
        public final C13574r f20997i;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: j */
        public final C13574r f20998j;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: k */
        public final C13548a f20999k;

        public C13187a(@NonNull ContextContainer contextContainer, @NonNull LogoutListener logoutListener, @NonNull C13558g gVar, @NonNull C13574r rVar, @NonNull C13548a aVar, @NonNull C13548a aVar2, @NonNull C13548a aVar3, @NonNull C13574r rVar2, @NonNull C13574r rVar3, @NonNull C13548a aVar4) {
            super(contextContainer, logoutListener);
            this.f20992d = gVar;
            this.f20993e = rVar;
            this.f20994f = aVar;
            this.f20995g = aVar2;
            this.f20996h = aVar3;
            this.f20997i = rVar2;
            this.f20998j = rVar3;
            this.f20999k = aVar4;
        }
    }

    public C13186c(@NonNull C13188d dVar, @NonNull C13187a aVar) {
        super(dVar, aVar);
        aVar.f20994f.mo53229f(this);
        aVar.f20995g.mo53229f(this);
        aVar.f20996h.mo53229f(this);
        aVar.f20999k.mo53229f(this);
    }

    @NonNull
    /* renamed from: B2 */
    private C13187a m29897B2() {
        return (C13187a) this.f16656c;
    }

    /* renamed from: C2 */
    private void m29898C2() {
        m29897B2().f20992d.mo53203j();
        m29897B2().f20993e.mo53248h(false);
        this.f20984d.clear();
        this.f20991k.cancelAllForMethod(ContainerApi.GetContainerContent.DESCRIPTOR);
        ((ContainerApi.GetContainerContent) new ContainerApi.GetContainerContent("plp-cbi-all-merchants", ProxyStrategy.getFromCache().orThenCallService().thenAddInCache()).setIncludeWithMerchantParam(APIIncludes.CURRENT_CASHBACK_OBJECT)).call(this.f20991k).onFailure(new C13184a(this)).onSuccess(new C13185b(this));
    }

    /* renamed from: b1 */
    private void m29899b1(@NonNull String str) {
        this.f20987g = true;
        m29902p2().mo52814b1(C13630k.m31138c(str));
    }

    @NonNull
    /* renamed from: p2 */
    private C13188d m29902p2() {
        return (C13188d) this.f16655b;
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public /* synthetic */ void m29903t2(CallException callException) {
        m29897B2().f20992d.mo53205l();
        C13633n.m31150f(this, "ERROR", callException);
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public /* synthetic */ void m29904u2(ProxyOutput proxyOutput) {
        m29897B2().f20992d.mo53205l();
        try {
            Collection optModels = proxyOutput.getDocument().optModels();
            if (!optModels.isEmpty()) {
                this.f20984d.clear();
                this.f20984d.addAll(optModels);
                m29897B2().f20993e.mo53248h(true);
                m29902p2().mo52813G(this.f20984d);
            }
        } catch (Exception e) {
            C13633n.m31150f(this, "ERROR", e);
        }
    }

    @Deprecated
    /* renamed from: y2 */
    private void m29905y2(@NonNull ProxyBundleInput proxyBundleInput, @NonNull ProxyBundleOutput proxyBundleOutput) {
        CloudList cloudList;
        List<AbstractModel> data;
        m29897B2().f20992d.mo53205l();
        if (ProxyBundleOutput.ProxyOutputStatus.OK == proxyBundleOutput.getStatus() && (cloudList = (CloudList) proxyBundleOutput.getResponseObject(CloudMethodReturns.CLOUD_LIST_DETAIL)) != null && (data = cloudList.getData()) != null && !data.isEmpty()) {
            this.f20984d.clear();
            for (AbstractModel next : data) {
                if (next instanceof BaseMerchant) {
                    this.f20985e.add((BaseMerchant) next);
                }
            }
            m29897B2().f20993e.mo53248h(true);
            m29902p2().mo52813G(this.f20984d);
        }
    }

    /* renamed from: A2 */
    public void mo52805A2() {
        this.f20986f.mo52823r2();
        if (this.f20984d.isEmpty()) {
            m29898C2();
        }
        if (this.f20987g) {
            this.f20987g = false;
            this.f20988h = false;
            this.f20986f.mo52824u2(true);
        }
    }

    /* renamed from: E */
    public void mo49068E(C13574r rVar) {
        if (rVar == m29897B2().f20994f) {
            C13618g.f21930b.mo53278b("instore-cashback", "subscribe");
            m29899b1("https://www.poulpeo.com/cashback-en-magasin.htm");
        } else if (rVar == m29897B2().f20995g) {
            C13618g.f21930b.mo53278b("instore-cashback", "see-account");
            m29899b1("https://www.poulpeo.com/configuration-cashback-en-magasin.htm");
        } else if (rVar == m29897B2().f20996h) {
            C13618g.f21930b.mo53278b("instore-cashback", "repair-connection");
            m29899b1("https://www.poulpeo.com/configuration-cashback-en-magasin.htm");
        } else if (rVar == m29897B2().f20999k) {
            C13618g.f21930b.mo53278b("instore-cashback", "see-faq");
            m29899b1("https://www.poulpeo.com/cashback-en-magasin.htm#instore-faq");
        }
    }

    /* renamed from: e2 */
    public void mo46317e2() {
        m29897B2().f20994f.mo53248h(false);
        m29897B2().f20997i.mo53248h(false);
        m29897B2().f20998j.mo53248h(false);
    }

    /* renamed from: f */
    public void mo46318f(boolean z, boolean z2) {
        this.f20988h = true;
        this.f20989i = z;
        this.f20990j = z2;
        if (!z) {
            m29897B2().f20994f.mo53248h(true);
        } else if (!z2) {
            m29897B2().f20997i.mo53248h(true);
        } else {
            m29897B2().f20998j.mo53248h(true);
        }
        m29902p2().mo52815f(z, z2);
    }

    @Deprecated
    public void onProxyActionExecuted(@NonNull ProxyBundleInput proxyBundleInput, @NonNull ProxyBundleOutput proxyBundleOutput) {
        if (proxyBundleInput.getProxyMethod() == ProxyMethodsCloudList.GET_DETAILS) {
            m29905y2(proxyBundleInput, proxyBundleOutput);
        }
    }

    /* renamed from: q2 */
    public boolean mo52806q2() {
        return this.f20990j;
    }

    /* renamed from: r2 */
    public boolean mo52807r2() {
        return this.f20988h;
    }

    /* renamed from: s2 */
    public boolean mo52808s2() {
        return this.f20989i;
    }

    /* renamed from: v2 */
    public void mo52809v2() {
        this.f20986f.mo52820o2();
    }

    /* renamed from: w2 */
    public void mo52810w2() {
        this.f20986f.mo52821p2();
    }

    /* renamed from: x2 */
    public void mo52811x2(@NonNull Merchant merchant) {
        C13619h.f21932a.mo53282c("instore-cashback", "click-merchant", merchant);
        m29899b1("https://www.poulpeo.com/cashback-en-magasin.htm?details-cid=" + merchant.getId());
    }

    /* renamed from: z2 */
    public void mo52812z2() {
        this.f20986f.mo52822q2();
    }
}
