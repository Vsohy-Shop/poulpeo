package p303ab;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data_access.base.call.CallException;
import com.rmn.apiclient.core.data_access.base.call.CallManager;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyOutput;
import com.rmn.apiclient.core.data_access.proxy.strategy.ProxyStrategy;
import com.rmn.apiclient.impl.api.call.APIIncludes;
import com.rmn.apiclient.impl.api.methods.OfferApi;
import com.rmn.apiclient.impl.api.models.Merchant;
import com.rmn.apiclient.impl.api.models.Offer;
import com.rmn.apiclient.impl.api.models.submodels.offer.OfferType;
import com.rmn.iosadapters.android.content.ContextContainer;
import p305ad.C10865d;
import p440ud.C13558g;
import p440ud.C13574r;
import p445vc.C13616e;
import p445vc.C13617f;
import p445vc.C13618g;
import p446vd.C13633n;

/* renamed from: ab.f */
/* compiled from: OfferController */
public class C10857f extends C10865d {
    @NonNull

    /* renamed from: d */
    private final CallManager f16646d = new CallManager(mo45820l2());
    @Nullable

    /* renamed from: e */
    private Offer f16647e;

    /* renamed from: ab.f$a */
    /* compiled from: OfferController */
    public static class C10858a extends C10865d.C10866a {
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: d */
        public final String f16648d;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: e */
        public final C13558g f16649e;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: f */
        public final C13574r f16650f;

        public C10858a(@NonNull ContextContainer contextContainer, @NonNull String str, @NonNull C13558g gVar, @NonNull C13574r rVar) {
            super(contextContainer);
            this.f16648d = str;
            this.f16649e = gVar;
            this.f16650f = rVar;
        }
    }

    public C10857f(@NonNull C10859g gVar, @NonNull C10858a aVar) {
        super(gVar, aVar);
    }

    @NonNull
    /* renamed from: p2 */
    private C10859g m23134p2() {
        return (C10859g) this.f16655b;
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public /* synthetic */ void m23135r2(CallException callException) {
        C13633n.m31164t(this, "ERROR", callException);
        m23134p2().mo45809F0();
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public /* synthetic */ void m23136s2(ProxyOutput proxyOutput) {
        Offer offer;
        try {
            offer = (Offer) proxyOutput.getDocument().optFirstModel();
        } catch (Exception unused) {
            offer = null;
        }
        if (offer == null || offer.getMerchant() == null) {
            m23134p2().mo45809F0();
            return;
        }
        m23137x2().f16649e.mo53205l();
        m23137x2().f16650f.mo53248h(true);
        this.f16647e = offer;
        m23134p2().mo45810k1(offer);
        m23138z2(offer);
    }

    @NonNull
    /* renamed from: x2 */
    private C10858a m23137x2() {
        return (C10858a) this.f16656c;
    }

    /* renamed from: z2 */
    private void m23138z2(@NonNull Offer offer) {
        String str;
        String str2;
        Merchant merchant = offer.getMerchant();
        if (merchant != null) {
            str = merchant.name;
        } else {
            str = "";
        }
        if (offer.getOfferType() == OfferType.CODE) {
            str2 = "promo-code";
        } else {
            str2 = "deal";
        }
        C13618g gVar = C13618g.f21930b;
        gVar.mo53280e(new C13616e(str2 + "-details-" + str, C13617f.OFFER).mo53276g(offer));
    }

    @Nullable
    /* renamed from: q2 */
    public Offer mo45803q2() {
        return this.f16647e;
    }

    /* renamed from: t2 */
    public void mo45804t2() {
        m23137x2().f16649e.mo53203j();
        m23137x2().f16650f.mo53248h(false);
        mo45808y2();
    }

    /* renamed from: y2 */
    public void mo45808y2() {
        this.f16646d.cancelAllForMethod(OfferApi.GetOffer.DESCRIPTOR);
        ((OfferApi.GetOffer) ((OfferApi.GetOffer) new OfferApi.GetOffer(m23137x2().f16648d, ProxyStrategy.getFromCache().orThenCallService().thenAddInCache()).setIncludeWithOfferParam("merchant", APIIncludes.CURRENT_CASHBACK_OBJECT)).setWildcardMerchantParam()).call(this.f16646d).onFailure(new C10855d(this)).onSuccess(new C10856e(this));
    }

    /* renamed from: u2 */
    public void mo45805u2() {
    }

    /* renamed from: v2 */
    public void mo45806v2() {
    }

    /* renamed from: w2 */
    public void mo45807w2() {
    }
}
