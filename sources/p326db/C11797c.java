package p326db;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.poulpeo.model.PLPUser;
import com.rmn.api.p322v2.poulpeo.model.PoulpeoPlusHandler;
import com.rmn.apiclient.core.data_access.base.call.CallException;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyOutput;
import com.rmn.apiclient.core.data_access.proxy.strategy.ProxyStrategy;
import com.rmn.apiclient.impl.api.call.APIIncludes;
import com.rmn.apiclient.impl.api.methods.OfferApi;
import com.rmn.apiclient.impl.api.models.CashbackObject;
import com.rmn.apiclient.impl.api.models.Merchant;
import com.rmn.apiclient.impl.api.models.Offer;
import com.rmn.apiclient.impl.api.models.submodels.offer.OfferCodeType;
import com.rmn.apiclient.impl.api.models.submodels.offer.OfferType;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.p324ui.views.listview.C11657f;
import com.rmn.p324ui.wrappers.ResourceStringWrapper;
import java.util.List;
import p305ad.C10865d;
import p311bd.C10930a;
import p431ta.C13470u;
import p431ta.C13472v;
import p440ud.C13565k;
import p445vc.C13619h;
import p446vd.C13623d;
import p446vd.C13633n;
import p446vd.C13637r;

/* renamed from: db.c */
/* compiled from: PurchaseController */
public class C11797c extends C10865d implements C13472v {
    @NonNull

    /* renamed from: d */
    private final C13470u f18415d;

    /* renamed from: e */
    private boolean f18416e = false;
    @Nullable

    /* renamed from: f */
    private Offer f18417f;

    public C11797c(@NonNull C11799d dVar, @NonNull C11798a aVar) {
        super(dVar, aVar);
        this.f18415d = new C13470u(this, new C13470u.C13471a(aVar.f16658b, mo45821m2(), aVar.f18418d, false, aVar.f18421g, aVar.f18422h, aVar.f18423i, aVar.f18424j));
    }

    /* access modifiers changed from: private */
    /* renamed from: B2 */
    public /* synthetic */ void m25315B2(CallException callException) {
        C13633n.m31164t(this, "ERROR", callException);
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public /* synthetic */ void m25316C2(ProxyOutput proxyOutput) {
        try {
            this.f18417f = (Offer) proxyOutput.getDocument().getDataResources().firstOrNull().getModel();
        } catch (Exception e) {
            C13633n.m31147c(this, e);
            this.f18417f = null;
        }
        C13633n.m31152h(proxyOutput.getRawResponse());
        this.f18416e = true;
        m25320I2();
    }

    @NonNull
    /* renamed from: E2 */
    private C11798a m25317E2() {
        return (C11798a) this.f16656c;
    }

    /* renamed from: F2 */
    private void m25318F2() {
        if (mo48934y2()) {
            ((OfferApi.GetOffer) ((OfferApi.GetOffer) new OfferApi.GetOffer(m25325t2(), ProxyStrategy.getFromCache().orThenCallService().thenAddInCache()).setIncludeWithOfferParam("merchant", APIIncludes.CURRENT_CASHBACK_OBJECT)).setWildcardMerchantParam()).call(mo45820l2()).onFailure(new C11795a(this)).onSuccess(new C11796b(this));
        }
    }

    /* renamed from: G2 */
    private void m25319G2(boolean z) {
        C11800e.m25362a().mo48947m(m25317E2().f18418d, z);
        m25323q2().mo46470w1();
    }

    /* renamed from: I2 */
    private void m25320I2() {
        String u2;
        if (this.f18415d.mo53051A2() && this.f18415d.mo53052B2()) {
            if (!mo48934y2() || this.f18416e) {
                m25323q2().mo46468W1();
                if (m25317E2().f18427m && (u2 = m25326u2()) != null) {
                    m25323q2().mo46467U1(u2);
                }
            }
        }
    }

    @NonNull
    /* renamed from: q2 */
    private C11799d m25323q2() {
        return (C11799d) this.f16655b;
    }

    @Nullable
    /* renamed from: s2 */
    private ResourceStringWrapper m25324s2(@NonNull Offer offer) {
        if (!m25317E2().f18420f) {
            return null;
        }
        if (offer.getOfferType() == OfferType.CODE) {
            return m25317E2().f18425k;
        }
        return m25317E2().f18426l;
    }

    @NonNull
    /* renamed from: t2 */
    private String m25325t2() {
        if (mo48934y2()) {
            return m25317E2().f18419e;
        }
        return "";
    }

    @Nullable
    /* renamed from: u2 */
    private String m25326u2() {
        Merchant t2 = this.f18415d.mo53060t2();
        if (t2 == null) {
            return null;
        }
        if (mo48934y2()) {
            Offer offer = this.f18417f;
            if (offer == null || !offer.getOfferType().equals(OfferType.CODE)) {
                return null;
            }
            return m25317E2().f18429o.mo47913b(mo45820l2(), t2.name);
        }
        CashbackObject cashbackObject = t2.getCashbackObject();
        if (cashbackObject != null && cashbackObject.hasConditions()) {
            return m25317E2().f18428n.mo47912a(mo45820l2());
        }
        return null;
    }

    /* renamed from: A2 */
    public boolean mo48919A2() {
        return PoulpeoPlusHandler.isPoulpeoPlus(this.f18415d.mo53063x2());
    }

    /* renamed from: B */
    public void mo48920B(@NonNull List<Object> list, int i, int i2) {
        String str;
        if (i <= 0) {
            Offer offer = this.f18417f;
            if (offer != null) {
                list.remove(offer);
                i2--;
            }
            if (m25317E2().f18420f && i2 > 0) {
                list.add(0, this.f18415d.mo53062w2(list, i2));
            }
            Offer offer2 = this.f18417f;
            if (offer2 != null) {
                list.add(0, offer2);
                ResourceStringWrapper s2 = m25324s2(this.f18417f);
                if (s2 != null) {
                    str = s2.mo47912a(mo45820l2());
                } else {
                    str = "";
                }
                list.add(0, new C11657f(str));
            }
            m25320I2();
        }
    }

    /* renamed from: D2 */
    public void mo48921D2() {
        m25318F2();
        this.f18415d.mo53053G2();
    }

    /* renamed from: H2 */
    public void mo48922H2(@NonNull C10930a aVar) {
        this.f18415d.mo53058R2(aVar);
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: m2 */
    public LogoutListener mo45821m2() {
        LogoutListener logoutListener = this.f16656c.f16659c;
        if (logoutListener != null) {
            return logoutListener;
        }
        throw new IllegalStateException("Trying to access a null logout listener. First, define a logout listener in the params of the controller.");
    }

    /* renamed from: n */
    public void mo48925n(@NonNull Offer offer) {
        boolean z;
        String str;
        C13619h.f21932a.mo53283d("purchase", C13619h.m31080a("activate", offer), offer);
        if (offer.getOfferType() == OfferType.CODE) {
            if (m25317E2().f18419e != null && !m25317E2().f18419e.equals(offer.f18063id)) {
                C11800e.m25362a().mo48948n(offer.f18063id);
                this.f18417f = offer;
            }
            if (!this.f18415d.mo53064y2() || !offer.canCombineCashbackAndOffersCodes) {
                z = false;
            } else {
                z = true;
            }
            m25319G2(z);
            if (offer.codeType == OfferCodeType.MULTIPLE) {
                str = C13637r.f21957b.mo53304a(offer.f18063id);
                if (str == null) {
                    m25323q2().mo46469Y0(offer, mo48932w2());
                    return;
                }
            } else {
                str = offer.code;
            }
            C13623d.m31101a(mo45820l2(), str, str);
            m25323q2().mo46465C0(offer);
        }
    }

    /* renamed from: p */
    public void mo48927p(@Nullable PLPUser pLPUser) {
        m25320I2();
    }

    /* renamed from: p2 */
    public void mo48928p2(boolean z) {
        C13619h.f21932a.mo53282c("purchase", "click-activate-cashback", this.f18415d.mo53060t2());
        m25319G2(z);
    }

    @Nullable
    /* renamed from: r2 */
    public Offer mo48930r2() {
        return this.f18417f;
    }

    @Nullable
    /* renamed from: v2 */
    public Merchant mo48931v2() {
        return this.f18415d.mo53060t2();
    }

    /* renamed from: w2 */
    public int mo48932w2() {
        return this.f18415d.mo53061u2();
    }

    /* renamed from: x2 */
    public boolean mo48933x2() {
        return this.f18415d.mo53064y2();
    }

    /* renamed from: y2 */
    public boolean mo48934y2() {
        return !TextUtils.isEmpty(m25317E2().f18419e);
    }

    /* renamed from: z2 */
    public boolean mo48935z2() {
        return C11800e.m25362a().mo48940f(m25317E2().f18418d);
    }

    /* renamed from: db.c$a */
    /* compiled from: PurchaseController */
    public static class C11798a extends C10865d.C10866a {
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: d */
        public final String f18418d;
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: e */
        public final String f18419e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final boolean f18420f;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: g */
        public final ResourceStringWrapper f18421g;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: h */
        public final C13565k f18422h;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: i */
        public final C13565k f18423i;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: j */
        public final ResourceStringWrapper f18424j;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: k */
        public final ResourceStringWrapper f18425k;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: l */
        public final ResourceStringWrapper f18426l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public final boolean f18427m;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: n */
        public final ResourceStringWrapper f18428n;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: o */
        public final ResourceStringWrapper f18429o;

        public C11798a(@NonNull ContextContainer contextContainer, @NonNull LogoutListener logoutListener, @NonNull String str, @Nullable String str2, @NonNull ResourceStringWrapper resourceStringWrapper, @NonNull ResourceStringWrapper resourceStringWrapper2) {
            super(contextContainer, logoutListener);
            this.f18418d = str;
            this.f18419e = str2;
            this.f18420f = false;
            this.f18421g = new ResourceStringWrapper();
            this.f18422h = new C13565k();
            this.f18423i = new C13565k();
            this.f18424j = new ResourceStringWrapper();
            this.f18425k = new ResourceStringWrapper();
            this.f18426l = new ResourceStringWrapper();
            this.f18427m = true;
            this.f18428n = resourceStringWrapper;
            this.f18429o = resourceStringWrapper2;
        }

        public C11798a(@NonNull ContextContainer contextContainer, @NonNull LogoutListener logoutListener, @NonNull String str, @Nullable String str2, @NonNull ResourceStringWrapper resourceStringWrapper, @NonNull C13565k kVar, @NonNull C13565k kVar2, @NonNull ResourceStringWrapper resourceStringWrapper2, @NonNull ResourceStringWrapper resourceStringWrapper3, @NonNull ResourceStringWrapper resourceStringWrapper4) {
            super(contextContainer, logoutListener);
            this.f18418d = str;
            this.f18419e = str2;
            this.f18420f = true;
            this.f18421g = resourceStringWrapper;
            this.f18422h = kVar;
            this.f18423i = kVar2;
            this.f18424j = resourceStringWrapper2;
            this.f18425k = resourceStringWrapper3;
            this.f18426l = resourceStringWrapper4;
            this.f18427m = false;
            this.f18428n = new ResourceStringWrapper();
            this.f18429o = new ResourceStringWrapper();
        }
    }

    /* renamed from: M1 */
    public void mo48924M1() {
    }

    /* renamed from: o */
    public void mo48926o() {
    }

    /* renamed from: q */
    public void mo48929q(@NonNull Merchant merchant) {
    }

    /* renamed from: K1 */
    public void mo48923K1(@NonNull Merchant merchant, @NonNull List<Object> list) {
    }
}
