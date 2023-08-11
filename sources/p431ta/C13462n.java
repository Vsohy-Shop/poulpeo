package p431ta;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.api.p322v2.common.model.BaseMerchant;
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
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsPLPMerchant;
import com.rmn.api.p322v2.poulpeo.user.PLPPinnedObjectsManager;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyOutput;
import com.rmn.apiclient.core.data_access.proxy.strategy.ProxyStrategy;
import com.rmn.apiclient.impl.api.methods.MerchantBonusApi;
import com.rmn.apiclient.impl.api.models.Merchant;
import com.rmn.apiclient.impl.api.models.MerchantBonus;
import com.rmn.apiclient.impl.api.models.Offer;
import com.rmn.apiclient.impl.api.models.submodels.user.UserGrade;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.p324ui.wrappers.ResourceStringWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import p305ad.C10865d;
import p311bd.C10930a;
import p431ta.C13452e;
import p431ta.C13470u;
import p440ud.C13558g;
import p440ud.C13565k;
import p440ud.C13574r;
import p445vc.C13616e;
import p445vc.C13617f;
import p445vc.C13618g;
import p445vc.C13619h;
import p446vd.C13633n;

/* renamed from: ta.n */
/* compiled from: MerchantController */
public class C13462n extends C10865d implements C13454f, C13472v, C13574r.C13576b, IProxyListener {
    @NonNull

    /* renamed from: d */
    private final C13470u f21584d;

    /* renamed from: e */
    private final C13452e f21585e;

    /* renamed from: f */
    private boolean f21586f;

    /* renamed from: g */
    private MerchantBonus f21587g;

    /* renamed from: h */
    public ArrayList<C13476y> f21588h = new ArrayList<>();

    /* renamed from: ta.n$a */
    /* compiled from: MerchantController */
    public static class C13463a extends C10865d.C10866a {
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: d */
        public final String f21589d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final boolean f21590e;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: f */
        public final C13558g f21591f;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: g */
        public final C13574r f21592g;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: h */
        public final C13574r f21593h;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: i */
        public final ResourceStringWrapper f21594i;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: j */
        public final ResourceStringWrapper f21595j;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: k */
        public final ResourceStringWrapper f21596k;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: l */
        public final C13565k f21597l;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: m */
        public final C13565k f21598m;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: n */
        public final ResourceStringWrapper f21599n;

        public C13463a(@NonNull ContextContainer contextContainer, @NonNull LogoutListener logoutListener, @NonNull String str, boolean z, @NonNull C13558g gVar, @NonNull C13574r rVar, @NonNull C13574r rVar2, @NonNull ResourceStringWrapper resourceStringWrapper, @NonNull ResourceStringWrapper resourceStringWrapper2, @NonNull ResourceStringWrapper resourceStringWrapper3, @NonNull C13565k kVar, @NonNull C13565k kVar2, @NonNull ResourceStringWrapper resourceStringWrapper4) {
            super(contextContainer, logoutListener);
            this.f21589d = str;
            this.f21590e = z;
            this.f21591f = gVar;
            this.f21592g = rVar;
            this.f21593h = rVar2;
            this.f21594i = resourceStringWrapper;
            this.f21595j = resourceStringWrapper2;
            this.f21596k = resourceStringWrapper3;
            this.f21597l = kVar;
            this.f21598m = kVar2;
            this.f21599n = resourceStringWrapper4;
        }
    }

    public C13462n(@NonNull C13464o oVar, @NonNull C13463a aVar) {
        super(oVar, aVar);
        this.f21584d = new C13470u(this, new C13470u.C13471a(mo45820l2(), mo45821m2(), aVar.f21589d, aVar.f21590e, aVar.f21596k, aVar.f21597l, aVar.f21598m, aVar.f21599n));
        this.f21585e = new C13452e(this, new C13452e.C13453a(mo45820l2(), m30593E2().f21589d));
        aVar.f21593h.mo53248h(false);
    }

    /* renamed from: D2 */
    private void m30592D2(@NonNull ProxyBundleOutput proxyBundleOutput) {
        int i;
        if (proxyBundleOutput.getStatus() != ProxyBundleOutput.ProxyOutputStatus.OK) {
            mo53042o2().mo46343K();
            return;
        }
        BaseMerchant[] baseMerchantArr = (BaseMerchant[]) proxyBundleOutput.getResponseObject(PLPMethodReturns.PLP_MERCHANT_ARRAY);
        if (baseMerchantArr == null || baseMerchantArr.length <= 0) {
            mo53042o2().mo46343K();
            return;
        }
        List asList = Arrays.asList(baseMerchantArr);
        Integer num = (Integer) proxyBundleOutput.getResponseObject(PLPMethodReturns.TOTAL_COUNT);
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        mo53042o2().mo46349k0(asList, i);
    }

    @NonNull
    /* renamed from: E2 */
    private C13463a m30593E2() {
        return (C13463a) this.f16656c;
    }

    /* renamed from: G2 */
    private void m30594G2() {
        ProxyActionsPool proxyActionsPool = this.f21584d.f21610d;
        IProxyMethodType iProxyMethodType = ProxyMethodsPLPMerchant.GET_SIMILAR;
        proxyActionsPool.cancelAndRemoveAllActionsWithMethod(iProxyMethodType);
        ProxyBundleInput proxyBundleInput = new ProxyBundleInput(mo45820l2(), iProxyMethodType, ProxyBundleInput.ProxySourcesOption.GET_FROM_CACHE_THEN_NETWORK, ProxyBundleInput.ProxyNetworkOption.ADD_IN_CACHE, (LogoutListener) null);
        proxyBundleInput.addParamValue(PLPMethodParameters.ID_PLP_MERCHANT_REQUIRED, Integer.valueOf(Integer.parseInt(m30593E2().f21589d)));
        proxyBundleInput.addParamValue(PLPMethodParameters.OFFSET, 0);
        proxyBundleInput.addParamValue(PLPMethodParameters.LIMIT, 8);
        proxyBundleInput.addParamValue(PLPMethodParameters.HAS_CASHBACK, Boolean.TRUE);
        this.f21584d.f21610d.executeProxyAction(this, proxyBundleInput);
    }

    /* renamed from: H2 */
    private void m30595H2(MerchantBonus merchantBonus) {
        this.f21587g = merchantBonus;
    }

    /* renamed from: J2 */
    private void m30596J2(boolean z) {
        String str;
        Merchant t2 = this.f21584d.mo53060t2();
        if (t2 != null) {
            if (z) {
                str = "merchant-";
            } else {
                str = "merchant-without-offer-";
            }
            C13618g gVar = C13618g.f21930b;
            gVar.mo53280e(new C13616e(str + t2.name, C13617f.MERCHANT).mo53274e(t2));
        }
    }

    /* renamed from: K2 */
    private void m30597K2() {
        PLPUser x2;
        boolean z;
        Merchant t2 = this.f21584d.mo53060t2();
        if (t2 != null && (x2 = this.f21584d.mo53063x2()) != null) {
            C13464o o2 = mo53042o2();
            if (x2.getGrade() == PLPUserGrade.POULPEO_PLUS) {
                z = true;
            } else {
                z = false;
            }
            o2.mo46347T1(z);
            new MerchantBonusApi.GetMerchantBonuses(t2.f18063id, ProxyStrategy.getFromCache().orThenCallService().thenAddInCache()).call(mo45820l2()).onSuccess(new C13461m(this, x2));
        }
    }

    /* renamed from: t2 */
    private boolean m30599t2(MerchantBonus merchantBonus) {
        long time = new Date().getTime();
        Date date = merchantBonus.dateStart;
        Date date2 = merchantBonus.dateEnd;
        if (merchantBonus.getUserGrade() != UserGrade.PLP_PLUS || ((date != null && date.getTime() > time) || (date2 != null && time > date2.getTime()))) {
            return false;
        }
        return true;
    }

    /* renamed from: u2 */
    private void m30600u2(boolean z, boolean z2) {
        boolean z3;
        Merchant t2 = this.f21584d.mo53060t2();
        if (t2 != null) {
            this.f21586f = PLPPinnedObjectsManager.getInstance(mo45820l2()).hasMerchantReminder(t2.f18063id);
            if (!z && !z2) {
                m30594G2();
            }
            mo53042o2().mo46356v1(t2);
            mo53042o2().mo46344K0();
            if (z || z2) {
                mo53042o2().mo46346R();
            } else {
                mo53042o2().mo46355q1();
            }
            boolean z4 = false;
            if (z || z2) {
                z3 = true;
            } else {
                z3 = false;
            }
            m30596J2(z3);
            C13574r l = m30593E2().f21593h;
            if (mo53045r2() > 1 || (!z2 && !z)) {
                z4 = true;
            }
            l.mo53248h(z4);
            m30597K2();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w2 */
    public /* synthetic */ void m30601w2(PLPUser pLPUser, ProxyOutput proxyOutput) {
        MerchantBonus merchantBonus;
        boolean z;
        try {
            merchantBonus = (MerchantBonus) proxyOutput.getDocument().getDataResources().firstOrNull().getModel();
        } catch (Exception e) {
            C13633n.m31166v(e.getMessage());
            merchantBonus = null;
        }
        if (merchantBonus != null) {
            m30595H2(merchantBonus);
            boolean t2 = m30599t2(merchantBonus);
            if (pLPUser.getGrade() == PLPUserGrade.POULPEO_PLUS) {
                z = true;
            } else {
                z = false;
            }
            m30602x2(merchantBonus, t2, z);
        }
    }

    /* renamed from: x2 */
    private void m30602x2(@NonNull MerchantBonus merchantBonus, boolean z, boolean z2) {
        Iterator<C13476y> it = this.f21588h.iterator();
        while (it.hasNext()) {
            C13476y next = it.next();
            next.mo23259a(merchantBonus, z);
            next.mo53070E(z2);
        }
    }

    /* renamed from: A2 */
    public Boolean mo53037A2() {
        return this.f21585e.mo53028r2();
    }

    /* renamed from: B */
    public void mo48920B(@NonNull List<Object> list, int i, int i2) {
        boolean z;
        if (i <= 0) {
            if (i2 > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                list.add(0, this.f21584d.mo53062w2(list, i2));
            } else {
                list.add(m30593E2().f21595j);
            }
            Merchant q2 = mo53044q2();
            if (q2 == null || q2.hasCashback()) {
                list.add(0, q2);
            } else {
                list.add(0, m30593E2().f21594i);
            }
        }
    }

    /* renamed from: B2 */
    public void mo53038B2() {
        this.f21584d.mo53055J2();
        this.f21585e.mo53029t2();
    }

    /* renamed from: C2 */
    public void mo53039C2() {
        this.f21584d.mo53056K2();
        this.f21585e.mo53030u2();
        m30597K2();
    }

    /* renamed from: F2 */
    public void mo53040F2() {
        this.f21584d.mo53057N2();
    }

    /* renamed from: I2 */
    public void mo53041I2(@NonNull C10930a aVar) {
        this.f21584d.mo53058R2(aVar);
    }

    /* renamed from: K1 */
    public void mo48923K1(@NonNull Merchant merchant, @NonNull List<Object> list) {
        m30593E2().f21591f.mo53205l();
        m30593E2().f21592g.mo53248h(true);
        m30600u2(merchant.hasCashback(), !list.isEmpty());
    }

    /* renamed from: M1 */
    public void mo48924M1() {
        m30593E2().f21592g.mo53248h(false);
        mo53042o2().mo46344K0();
        m30593E2().f21591f.mo53203j();
    }

    /* renamed from: n */
    public void mo48925n(@NonNull Offer offer) {
        C13619h.f21932a.mo53283d("merchant", C13619h.m31080a("click", offer), offer);
        mo53042o2().mo46350n(offer);
    }

    /* renamed from: o */
    public void mo48926o() {
        mo53042o2().mo46351o();
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: o2 */
    public C13464o mo53042o2() {
        return (C13464o) this.f16655b;
    }

    public void onProxyActionExecuted(@NonNull ProxyBundleInput proxyBundleInput, @NonNull ProxyBundleOutput proxyBundleOutput) {
        if (proxyBundleInput.getProxyMethod() == ProxyMethodsPLPMerchant.GET_SIMILAR) {
            m30592D2(proxyBundleOutput);
        }
    }

    /* renamed from: p */
    public void mo48927p(@Nullable PLPUser pLPUser) {
        m30597K2();
    }

    @Nullable
    /* renamed from: p2 */
    public Offer mo53043p2() {
        return this.f21584d.mo53059s2();
    }

    /* renamed from: q */
    public void mo48929q(@NonNull Merchant merchant) {
        mo53042o2().mo46354q(merchant);
    }

    @Nullable
    /* renamed from: q2 */
    public Merchant mo53044q2() {
        return this.f21584d.mo53060t2();
    }

    /* renamed from: r2 */
    public int mo53045r2() {
        return this.f21584d.mo53061u2();
    }

    @Nullable
    /* renamed from: s2 */
    public MerchantBonus mo53046s2() {
        return this.f21587g;
    }

    /* renamed from: v2 */
    public boolean mo53047v2() {
        return this.f21586f;
    }

    /* renamed from: y2 */
    public void mo53048y2() {
        this.f21584d.mo53053G2();
        this.f21585e.mo53026p2();
    }

    /* renamed from: z2 */
    public void mo53049z2() {
        this.f21584d.mo53054H2();
        this.f21585e.mo53027q2();
    }

    /* renamed from: O0 */
    public void mo53031O0() {
    }

    /* renamed from: E */
    public void mo49068E(@NonNull C13574r rVar) {
    }
}
