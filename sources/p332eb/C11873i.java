package p332eb;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.proxy.IProxyListener;
import com.rmn.api.p322v2.main.proxy.IProxyMethodType;
import com.rmn.api.p322v2.main.proxy.ProxyActionsPool;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.api.p322v2.poulpeo.model.BasePLPUser;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsPLPMerchant;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsPLPUser;
import com.rmn.apiclient.core.data_access.base.call.BaseCall;
import com.rmn.apiclient.core.data_access.base.call.CallException;
import com.rmn.apiclient.core.data_access.base.call.CallManager;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyOutput;
import com.rmn.apiclient.core.data_access.proxy.strategy.ProxyStrategy;
import com.rmn.apiclient.impl.api.methods.OfferApi;
import com.rmn.apiclient.impl.api.models.SingleUseOffer;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.iosadapters.android.p323os.AndroidOsHandler;
import com.rmn.iosadapters.android.p323os.AndroidOsMessage;
import p114h9.C8031a;
import p305ad.C10865d;
import p326db.C11800e;
import p332eb.C11878l;
import p382lc.C12822d;
import p440ud.C13548a;
import p440ud.C13574r;
import p445vc.C13616e;
import p445vc.C13617f;
import p445vc.C13618g;
import p446vd.C13621b;
import p446vd.C13623d;
import p446vd.C13633n;
import p446vd.C13636q;
import p446vd.C13637r;

/* renamed from: eb.i */
/* compiled from: CashbackActivationController */
public class C11873i extends C10865d implements IProxyListener {
    @NonNull

    /* renamed from: d */
    private final ProxyActionsPool f18542d = new ProxyActionsPool();
    @NonNull

    /* renamed from: e */
    private final CallManager f18543e = new CallManager(mo45820l2());
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: f */
    public String f18544f;
    @NonNull

    /* renamed from: g */
    private final C11878l f18545g;
    @NonNull

    /* renamed from: h */
    private final AndroidOsHandler f18546h = new AndroidOsHandler((C12822d) new C11874a());
    @Nullable

    /* renamed from: i */
    private BasePLPUser f18547i;

    /* renamed from: eb.i$a */
    /* compiled from: CashbackActivationController */
    class C11874a implements C12822d {
        C11874a() {
        }

        /* renamed from: a */
        public boolean mo49078a(AndroidOsMessage androidOsMessage) {
            String str;
            if (TextUtils.isEmpty(C11873i.this.f18544f)) {
                return true;
            }
            C11876j t2 = C11873i.this.m25611w2();
            String s2 = C11873i.this.f18544f;
            if (C11873i.this.m25600P2().f18551f != null) {
                str = C13637r.f21957b.mo53304a(C11873i.this.m25600P2().f18551f);
            } else {
                str = null;
            }
            t2.mo46453y1(s2, str);
            return true;
        }
    }

    /* renamed from: eb.i$b */
    /* compiled from: CashbackActivationController */
    public static class C11875b extends C10865d.C10866a {
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: d */
        public final String f18549d;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: e */
        public final String f18550e;
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: f */
        public final String f18551f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final boolean f18552g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public final boolean f18553h;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: i */
        public final C13574r f18554i;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: j */
        public final C13548a f18555j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public final boolean f18556k;

        public C11875b(@NonNull ContextContainer contextContainer, @NonNull LogoutListener logoutListener, @NonNull String str, @NonNull String str2, @Nullable String str3, boolean z, boolean z2, @NonNull C13574r rVar, @NonNull C13548a aVar, boolean z3) {
            super(contextContainer, logoutListener);
            this.f18549d = str;
            this.f18550e = str2;
            this.f18551f = str3;
            this.f18552g = z;
            this.f18553h = z2;
            this.f18554i = rVar;
            this.f18555j = aVar;
            this.f18556k = z3;
        }
    }

    public C11873i(@NonNull C11876j jVar, @NonNull C11875b bVar) {
        super(jVar, bVar);
        bVar.f18554i.mo53248h(false);
        bVar.f18555j.mo53229f(new C11868d(this));
        this.f18545g = new C11878l(jVar, new C11878l.C11880b(mo45820l2(), bVar.f18549d));
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public /* synthetic */ void m25592C2(String str, Void voidR) {
        this.f18544f = this.f18545g.mo49080s2(str);
        if (!this.f18546h.mo47870c(1548)) {
            m25611w2().mo46453y1(this.f18544f, C13637r.f21957b.mo53304a(m25600P2().f18551f));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D2 */
    public /* synthetic */ void m25593D2(CallException callException) {
        C13633n.m31164t(this, "ERROR", callException);
        if (callException.getHttpCodeIfAny() == 404) {
            m25611w2().mo46452s0(Boolean.FALSE);
        } else {
            m25611w2().mo46451q0();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E2 */
    public /* synthetic */ void m25594E2(ProxyOutput proxyOutput) {
        SingleUseOffer singleUseOffer;
        try {
            if (proxyOutput.getDocument() != null && (singleUseOffer = (SingleUseOffer) proxyOutput.getDocument().getMetaObject()) != null && !TextUtils.isEmpty(singleUseOffer.code)) {
                C13637r.f21957b.mo53306c(m25600P2().f18551f, singleUseOffer.code);
            }
        } catch (Exception e) {
            C13633n.m31164t(this, "ERROR", e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F2 */
    public /* synthetic */ void m25595F2(String str, BaseCall baseCall) {
        m25611w2().mo46452s0(Boolean.valueOf(C13637r.f21957b.mo53305b(m25600P2().f18551f)));
        m25612x2(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: G2 */
    public /* synthetic */ void m25596G2(C13574r rVar) {
        C13636q.m31181b(mo45820l2()).mo53299j("cashbackActivationDisableOnboardingText", true);
        C13618g.f21930b.mo53279c("purchase", "click-onboarding", m25600P2().f18550e);
        m25599P();
    }

    /* renamed from: I2 */
    private void m25597I2(@NonNull ProxyBundleOutput proxyBundleOutput) {
        if (proxyBundleOutput.getStatus() != ProxyBundleOutput.ProxyOutputStatus.OK) {
            m25611w2().mo46451q0();
            return;
        }
        String str = (String) proxyBundleOutput.getResponseObject(PLPMethodReturns.PLP_MERCHANT_URL);
        if (str == null || str.isEmpty()) {
            m25611w2().mo46451q0();
        } else if (m25600P2().f18556k) {
            m25613y2(str);
        } else {
            m25612x2(str);
        }
    }

    /* renamed from: O2 */
    private void m25598O2(@NonNull ProxyBundleOutput proxyBundleOutput) {
        if (proxyBundleOutput.getStatus() == ProxyBundleOutput.ProxyOutputStatus.OK) {
            this.f18547i = (BasePLPUser) proxyBundleOutput.getResponseObject(PLPMethodReturns.PLP_USER_DETAIL);
        }
    }

    /* renamed from: P */
    private void m25599P() {
        C11800e.m25362a().mo48944j();
        C11800e.m25362a().mo48947m(m25600P2().f18549d, m25600P2().f18552g);
        m25611w2().mo46447P();
    }

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: P2 */
    public C11875b m25600P2() {
        return (C11875b) this.f16656c;
    }

    /* renamed from: Q2 */
    private void m25601Q2() {
        ProxyActionsPool proxyActionsPool = this.f18542d;
        IProxyMethodType iProxyMethodType = ProxyMethodsPLPUser.PLP_USER_GET_DETAILS;
        proxyActionsPool.cancelAndRemoveAllActionsWithMethod(iProxyMethodType);
        this.f18542d.executeProxyAction(this, new ProxyBundleInput(mo45820l2(), iProxyMethodType, ProxyBundleInput.ProxySourcesOption.GET_FROM_CACHE_ONLY, ProxyBundleInput.ProxyNetworkOption.NO_CACHE, mo45821m2()));
    }

    /* renamed from: v2 */
    private void m25610v2() {
        int i;
        int i2;
        int i3 = 0;
        if (m25600P2().f18553h) {
            i = 1500;
        } else {
            i = 0;
        }
        long j = (long) i;
        m25611w2().mo46448Q(j);
        this.f18546h.mo47874i(1548);
        this.f18546h.mo47875j(1548, j);
        ProxyActionsPool proxyActionsPool = this.f18542d;
        IProxyMethodType iProxyMethodType = ProxyMethodsPLPMerchant.ACTIVATE_CASHBACK;
        proxyActionsPool.cancelAndRemoveAllActionsWithMethod(iProxyMethodType);
        ProxyBundleInput proxyBundleInput = new ProxyBundleInput(mo45820l2(), iProxyMethodType, ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_ONLY, ProxyBundleInput.ProxyNetworkOption.NO_CACHE, mo45821m2());
        try {
            i2 = Integer.parseInt(m25600P2().f18549d);
        } catch (Exception e) {
            C13633n.m31147c(this, e);
            i2 = 0;
        }
        proxyBundleInput.addParamValue(PLPMethodParameters.ID_PLP_MERCHANT_REQUIRED, Integer.valueOf(i2));
        if (mo49070B2()) {
            try {
                i3 = Integer.parseInt(m25600P2().f18551f);
            } catch (Exception e2) {
                C13633n.m31147c(this, e2);
            }
            proxyBundleInput.addParamValue(PLPMethodParameters.ID_COUPON_OPTIONAL, Integer.valueOf(i3));
        }
        String j2 = new C8031a(mo45820l2()).mo41861j(getClass());
        if (!TextUtils.isEmpty(j2)) {
            proxyBundleInput.addParamValue(PLPMethodParameters.OPEN_DATA, j2);
        }
        this.f18542d.executeProxyAction(this, proxyBundleInput);
    }

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: w2 */
    public C11876j m25611w2() {
        return (C11876j) this.f16655b;
    }

    /* renamed from: x2 */
    private void m25612x2(String str) {
        this.f18545g.mo49079B2(new C11872h(this, str));
    }

    /* renamed from: y2 */
    private void m25613y2(String str) {
        if (m25600P2().f18551f == null || C13637r.f21957b.mo53305b(m25600P2().f18551f)) {
            m25611w2().mo46452s0(Boolean.valueOf(C13637r.f21957b.mo53305b(m25600P2().f18551f)));
            m25612x2(str);
            return;
        }
        this.f18543e.cancelAllForMethod(OfferApi.GetSingleUseOffer.DESCRIPTOR);
        new OfferApi.GetSingleUseOffer(m25600P2().f18551f, ProxyStrategy.getFromCache().orThenCallService().thenAddInCache()).setTestMode(C13621b.m31095i()).setFingerprint(C13623d.m31108h(mo45820l2())).setSource(C13621b.m31091e(mo45820l2())).call(this.f18543e).onFailure(new C11869e(this)).onSuccess(new C11870f(this)).onComplete(new C11871g(this, str));
    }

    /* renamed from: A2 */
    public int mo49069A2() {
        BasePLPUser basePLPUser = this.f18547i;
        if (basePLPUser == null) {
            return -1;
        }
        return basePLPUser.getUserId();
    }

    /* renamed from: B2 */
    public boolean mo49070B2() {
        return !TextUtils.isEmpty(m25600P2().f18551f);
    }

    /* renamed from: H2 */
    public boolean mo49071H2() {
        BasePLPUser basePLPUser;
        if (C13636q.m31181b(mo45820l2()).mo53294e("cashbackActivationDisableOnboardingText", false) || (basePLPUser = this.f18547i) == null || !basePLPUser.isNewUser()) {
            return false;
        }
        if (!mo49070B2() || m25600P2().f18552g) {
            return true;
        }
        return false;
    }

    /* renamed from: J2 */
    public void mo49072J2() {
        this.f18545g.mo49081w2();
        m25601Q2();
        m25610v2();
    }

    /* renamed from: K2 */
    public void mo49073K2() {
        this.f18545g.mo49082x2();
    }

    /* renamed from: L2 */
    public void mo49074L2() {
        if (mo49071H2()) {
            m25600P2().f18554i.mo53248h(true);
            C13618g.f21930b.mo53279c("purchase", "show-onboarding", m25600P2().f18550e);
        } else if (!m25600P2().f18556k || m25600P2().f18551f == null || C13637r.f21957b.mo53305b(m25600P2().f18551f)) {
            m25599P();
        } else {
            m25600P2().f18554i.mo53248h(true);
        }
    }

    /* renamed from: M2 */
    public void mo49075M2() {
        this.f18545g.mo49083y2();
        this.f18546h.mo47874i(1548);
        this.f18542d.cancelAndRemoveAllActions();
    }

    /* renamed from: N2 */
    public void mo49076N2() {
        this.f18545g.mo49084z2();
        C13618g.f21930b.mo53280e(new C13616e("cashback-activation", C13617f.PURCHASE).mo53275f(m25600P2().f18549d, m25600P2().f18550e));
    }

    public void onProxyActionExecuted(@NonNull ProxyBundleInput proxyBundleInput, @NonNull ProxyBundleOutput proxyBundleOutput) {
        if (proxyBundleOutput.getStatus() != ProxyBundleOutput.ProxyOutputStatus.REQUEST_CANCELLED) {
            IProxyMethodType methodType = proxyBundleOutput.getMethodType();
            if (methodType == ProxyMethodsPLPUser.PLP_USER_GET_DETAILS) {
                m25598O2(proxyBundleOutput);
            } else if (methodType == ProxyMethodsPLPMerchant.ACTIVATE_CASHBACK) {
                m25597I2(proxyBundleOutput);
            }
        }
    }

    @NonNull
    /* renamed from: z2 */
    public String mo49077z2() {
        String str = this.f18544f;
        if (str != null) {
            return str;
        }
        return "";
    }
}
