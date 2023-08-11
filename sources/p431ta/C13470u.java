package p431ta;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.proxy.IProxyListener;
import com.rmn.api.p322v2.main.proxy.IProxyMethodType;
import com.rmn.api.p322v2.main.proxy.ProxyActionsPool;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.api.p322v2.poulpeo.model.PLPUser;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsPLPUser;
import com.rmn.apiclient.core.data.structure.IDocument;
import com.rmn.apiclient.core.data_access.base.call.CallException;
import com.rmn.apiclient.core.data_access.base.call.CallManager;
import com.rmn.apiclient.core.data_access.base.call.OutputStatus;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyOutput;
import com.rmn.apiclient.core.data_access.proxy.strategy.ProxyStrategy;
import com.rmn.apiclient.core.data_access.proxy.strategy.ProxyStrategyChain;
import com.rmn.apiclient.impl.api.call.APIIncludes;
import com.rmn.apiclient.impl.api.methods.MerchantApi;
import com.rmn.apiclient.impl.api.methods.OfferApi;
import com.rmn.apiclient.impl.api.models.Merchant;
import com.rmn.apiclient.impl.api.models.Offer;
import com.rmn.apiclient.impl.api.models.submodels.offer.OfferType;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.p324ui.views.listview.C11657f;
import com.rmn.p324ui.views.listview.C11658g;
import com.rmn.p324ui.wrappers.ResourceStringWrapper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p305ad.C10865d;
import p311bd.C10930a;
import p440ud.C13565k;
import p446vd.C13633n;

/* renamed from: ta.u */
/* compiled from: MerchantOffersController */
public class C13470u extends C10865d implements IProxyListener, C11658g {
    @NonNull

    /* renamed from: d */
    public final ProxyActionsPool f21610d = new ProxyActionsPool();
    @NonNull

    /* renamed from: e */
    public final CallManager f21611e = new CallManager(mo45820l2());

    /* renamed from: f */
    private boolean f21612f = false;

    /* renamed from: g */
    private boolean f21613g = false;
    @Nullable

    /* renamed from: h */
    private Merchant f21614h;
    @Nullable

    /* renamed from: i */
    private PLPUser f21615i;
    @Nullable

    /* renamed from: j */
    private List<Object> f21616j;

    /* renamed from: k */
    private int f21617k;
    @Nullable

    /* renamed from: l */
    private C10930a f21618l;

    /* renamed from: ta.u$a */
    /* compiled from: MerchantOffersController */
    public static class C13471a extends C10865d.C10866a {
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: d */
        public final String f21619d;

        /* renamed from: e */
        private final boolean f21620e;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: f */
        public final ResourceStringWrapper f21621f;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: g */
        public final C13565k f21622g;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: h */
        public final C13565k f21623h;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: i */
        public final ResourceStringWrapper f21624i;

        public C13471a(@NonNull ContextContainer contextContainer, @NonNull LogoutListener logoutListener, @NonNull String str, boolean z, @NonNull ResourceStringWrapper resourceStringWrapper, @NonNull C13565k kVar, @NonNull C13565k kVar2, @NonNull ResourceStringWrapper resourceStringWrapper2) {
            super(contextContainer, logoutListener);
            this.f21619d = str;
            this.f21620e = z;
            this.f21621f = resourceStringWrapper;
            this.f21622g = kVar;
            this.f21623h = kVar2;
            this.f21624i = resourceStringWrapper2;
        }
    }

    public C13470u(@NonNull C13472v vVar, @NonNull C13471a aVar) {
        super(vVar, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public /* synthetic */ void m30646C2(CallException callException) {
        C13633n.m31164t(this, "ERROR", callException);
    }

    /* access modifiers changed from: private */
    /* renamed from: D2 */
    public /* synthetic */ void m30647D2(int i, int i2, ProxyStrategyChain proxyStrategyChain, ProxyOutput proxyOutput) {
        try {
            this.f21614h = (Merchant) proxyOutput.getDocument().getDataResources().firstOrNull().getModel();
        } catch (Exception e) {
            C13633n.m31165u(this, e);
            this.f21614h = null;
        }
        if (this.f21614h != null) {
            m30654P2(i, i2, proxyStrategyChain);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E2 */
    public /* synthetic */ void m30648E2(int i, CallException callException) {
        C13633n.m31165u(this, callException);
        if (this.f21612f) {
            m30660r2().mo48926o();
            return;
        }
        C10930a aVar = this.f21618l;
        if (aVar != null) {
            aVar.mo45970r2(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F2 */
    public /* synthetic */ void m30649F2(int i, ProxyOutput proxyOutput) {
        C13633n.m31145a("API_CALL", proxyOutput.getRawResponse());
        if (!proxyOutput.hasDocument()) {
            C13633n.m31145a("ERR", "no document");
            return;
        }
        IDocument document = proxyOutput.getDocument();
        Objects.requireNonNull(document);
        Collection optModels = document.optModels();
        C13633n.m31148d("OFFERS COUNT : " + optModels.size());
        m30650I2(i, proxyOutput);
    }

    /* renamed from: I2 */
    private void m30650I2(int i, ProxyOutput proxyOutput) {
        C10930a aVar;
        if (proxyOutput.getStatus() == OutputStatus.SUCCESS) {
            if (i <= 0 && (aVar = this.f21618l) != null) {
                aVar.mo45951I2();
            }
            if (this.f21614h == null) {
                m30660r2().mo48926o();
                return;
            }
            Collection<Offer> emptyList = Collections.emptyList();
            try {
                emptyList = proxyOutput.getDocument().optModels();
            } catch (Exception e) {
                C13633n.m31166v(e.getMessage());
            }
            int size = emptyList.size();
            if (emptyList.isEmpty()) {
                size = 0;
            }
            this.f21617k = size;
            ArrayList arrayList = new ArrayList();
            if (!emptyList.isEmpty()) {
                for (Offer offer : emptyList) {
                    if (offer != null) {
                        if (!offer.isValid()) {
                            this.f21617k--;
                        } else if (!m30662z2(offer.f18063id)) {
                            arrayList.add(offer);
                        }
                    }
                }
                if (this.f21617k < 0) {
                    this.f21617k = 0;
                }
            }
            if (!this.f21612f) {
                if (this.f21614h == null) {
                    m30660r2().mo48926o();
                    return;
                } else {
                    this.f21612f = true;
                    m30660r2().mo48923K1(this.f21614h, arrayList);
                }
            }
            m30660r2().mo48920B(arrayList, i, this.f21617k);
            C10930a aVar2 = this.f21618l;
            if (aVar2 != null) {
                aVar2.mo45965m2(arrayList, i, this.f21617k);
            } else {
                this.f21616j = arrayList;
            }
        } else if (this.f21612f) {
            m30660r2().mo48926o();
        } else {
            C10930a aVar3 = this.f21618l;
            if (aVar3 != null) {
                aVar3.mo45970r2(i);
            }
        }
    }

    /* renamed from: L2 */
    private void m30651L2(@NonNull ProxyBundleOutput proxyBundleOutput) {
        ProxyBundleOutput.ProxyOutputStatus status = proxyBundleOutput.getStatus();
        if (status != ProxyBundleOutput.ProxyOutputStatus.REQUEST_CANCELLED) {
            this.f21613g = true;
            if (status == ProxyBundleOutput.ProxyOutputStatus.OK) {
                this.f21615i = (PLPUser) proxyBundleOutput.getResponseObject(PLPMethodReturns.PLP_USER_DETAIL);
            }
            m30660r2().mo48927p(this.f21615i);
        }
    }

    @NonNull
    /* renamed from: M2 */
    private C13471a m30652M2() {
        return (C13471a) this.f16656c;
    }

    /* renamed from: O2 */
    private void m30653O2(int i, int i2, ProxyStrategyChain proxyStrategyChain) {
        this.f21611e.cancelAllForMethod(MerchantApi.GetMerchant.DESCRIPTOR);
        ((MerchantApi.GetMerchant) ((MerchantApi.GetMerchant) new MerchantApi.GetMerchant(m30652M2().f21619d, proxyStrategyChain).setWildcardMerchantParam()).setIncludeWithMerchantParam(APIIncludes.CURRENT_CASHBACK_OBJECT)).call(this.f21611e).onFailure(new C13466q(this)).onSuccess(new C13467r(this, i, i2, proxyStrategyChain));
    }

    /* renamed from: P2 */
    private void m30654P2(int i, int i2, ProxyStrategyChain proxyStrategyChain) {
        this.f21611e.cancelAllForMethod(OfferApi.GetMerchantOffers.DESCRIPTOR);
        ((OfferApi.GetMerchantOffers) ((OfferApi.GetMerchantOffers) ((OfferApi.GetMerchantOffers) ((OfferApi.GetMerchantOffers) new OfferApi.GetMerchantOffers(m30652M2().f21619d, proxyStrategyChain).setOffsetParam(i)).setLimitParam(i2)).setSortParam("-scoreAlgo")).setIncludeWithOfferParam("merchant", APIIncludes.CURRENT_CASHBACK_OBJECT)).call(this.f21611e).onFailure(new C13468s(this, i)).onSuccess(new C13469t(this, i));
    }

    @Deprecated
    /* renamed from: Q2 */
    private void m30655Q2() {
        ProxyActionsPool proxyActionsPool = this.f21610d;
        IProxyMethodType iProxyMethodType = ProxyMethodsPLPUser.PLP_USER_GET_DETAILS;
        proxyActionsPool.cancelAndRemoveAllActionsWithMethod(iProxyMethodType);
        this.f21610d.executeProxyAction(this, new ProxyBundleInput(mo45820l2(), iProxyMethodType, ProxyBundleInput.ProxySourcesOption.GET_FROM_CACHE_THEN_NETWORK, ProxyBundleInput.ProxyNetworkOption.ADD_IN_CACHE, mo45821m2()));
    }

    @NonNull
    /* renamed from: r2 */
    private C13472v m30660r2() {
        return (C13472v) this.f16655b;
    }

    /* renamed from: v2 */
    private int m30661v2(@NonNull OfferType offerType, @NonNull List<Object> list) {
        int i = 0;
        for (Object next : list) {
            if ((next instanceof Offer) && ((Offer) next).getOfferType() == offerType) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: z2 */
    private boolean m30662z2(String str) {
        C10930a aVar = this.f21618l;
        if (aVar != null) {
            for (Object next : aVar.mo45975w2()) {
                if ((next instanceof Offer) && Objects.equals(str, ((Offer) next).f18063id)) {
                    return true;
                }
            }
        }
        List<Object> list = this.f21616j;
        if (list == null) {
            return false;
        }
        for (Object next2 : list) {
            if ((next2 instanceof Offer) && Objects.equals(str, ((Offer) next2).f18063id)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: A2 */
    public boolean mo53051A2() {
        return this.f21612f;
    }

    /* renamed from: B2 */
    public boolean mo53052B2() {
        return this.f21613g;
    }

    /* renamed from: G2 */
    public void mo53053G2() {
        if (m30652M2().f21619d.isEmpty()) {
            m30660r2().mo48926o();
            return;
        }
        mo53057N2();
        m30655Q2();
    }

    /* renamed from: H2 */
    public void mo53054H2() {
        C10930a aVar = this.f21618l;
        if (aVar != null) {
            aVar.mo45960R2(false);
        }
        this.f21610d.cancelAndRemoveAllActions();
    }

    /* renamed from: M0 */
    public void mo47901M0(@NonNull C10930a aVar, int i) {
        m30653O2(0, i, ProxyStrategy.callService().thenAddInCache());
    }

    /* renamed from: N0 */
    public void mo47902N0(@NonNull C10930a aVar, @NonNull Object obj) {
        if (obj instanceof Merchant) {
            m30660r2().mo48929q((Merchant) obj);
        } else if (obj instanceof Offer) {
            m30660r2().mo48925n((Offer) obj);
        }
    }

    /* renamed from: N2 */
    public void mo53057N2() {
        this.f21614h = null;
        this.f21612f = false;
        m30660r2().mo48924M1();
        C10930a aVar = this.f21618l;
        if (aVar != null) {
            aVar.mo45960R2(true);
        }
        m30653O2(0, 40, ProxyStrategy.getFromCache().orThenCallService().thenAddInCache());
    }

    /* renamed from: R2 */
    public void mo53058R2(@NonNull C10930a aVar) {
        this.f21618l = aVar;
        aVar.mo45960R2(true);
        List<Object> list = this.f21616j;
        if (list != null) {
            this.f21618l.mo45965m2(list, 0, this.f21617k);
            this.f21616j = null;
        }
        this.f21618l.mo45957O2(this);
    }

    /* renamed from: a */
    public void mo47903a(@NonNull C10930a aVar, int i, int i2) {
        m30653O2(i, i2, ProxyStrategy.getFromCache().orThenCallService().thenAddInCache());
    }

    @Deprecated
    public void onProxyActionExecuted(@NonNull ProxyBundleInput proxyBundleInput, @NonNull ProxyBundleOutput proxyBundleOutput) {
        IProxyMethodType proxyMethod = proxyBundleInput.getProxyMethod();
        if (proxyBundleOutput.getStatus() != ProxyBundleOutput.ProxyOutputStatus.REQUEST_CANCELLED && proxyMethod == ProxyMethodsPLPUser.PLP_USER_GET_DETAILS) {
            m30651L2(proxyBundleOutput);
        }
    }

    @Nullable
    /* renamed from: s2 */
    public Offer mo53059s2() {
        List<Object> list;
        C10930a aVar = this.f21618l;
        if (aVar != null) {
            list = aVar.mo45975w2();
        } else {
            list = this.f21616j;
        }
        if (list == null) {
            return null;
        }
        for (Object next : list) {
            if (next instanceof Offer) {
                return (Offer) next;
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: t2 */
    public Merchant mo53060t2() {
        return this.f21614h;
    }

    /* renamed from: u2 */
    public int mo53061u2() {
        return this.f21617k;
    }

    @NonNull
    /* renamed from: w2 */
    public C11657f mo53062w2(@NonNull List<Object> list, int i) {
        String str;
        if (list.size() < i) {
            str = m30652M2().f21621f.mo47913b(mo45820l2(), Integer.valueOf(i));
        } else {
            int v2 = m30661v2(OfferType.CODE, list);
            int v22 = m30661v2(OfferType.DEAL, list);
            String c = m30652M2().f21622g.mo53217c(mo45820l2(), (double) v2, Integer.valueOf(v2));
            String c2 = m30652M2().f21623h.mo53217c(mo45820l2(), (double) v22, Integer.valueOf(v22));
            if (v2 <= 0) {
                str = c2;
            } else if (v22 <= 0) {
                str = c;
            } else {
                str = m30652M2().f21624i.mo47913b(mo45820l2(), c, c2);
            }
        }
        return new C11657f(str);
    }

    @Nullable
    /* renamed from: x2 */
    public PLPUser mo53063x2() {
        return this.f21615i;
    }

    /* renamed from: y2 */
    public boolean mo53064y2() {
        Merchant merchant = this.f21614h;
        if (merchant == null || !merchant.hasCashback()) {
            return false;
        }
        return true;
    }

    /* renamed from: J2 */
    public void mo53055J2() {
    }

    /* renamed from: K2 */
    public void mo53056K2() {
    }

    /* renamed from: t0 */
    public void mo47904t0(@NonNull C10930a aVar) {
    }
}
