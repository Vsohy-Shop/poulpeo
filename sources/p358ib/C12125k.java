package p358ib;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.proxy.IProxyListener;
import com.rmn.api.p322v2.main.proxy.IProxyMethodType;
import com.rmn.api.p322v2.main.proxy.ProxyActionsPool;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.api.p322v2.poulpeo.model.ReviewMerchant;
import com.rmn.api.p322v2.poulpeo.model.ReviewMerchantStatus;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsReviewMerchant;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.p324ui.views.listview.C11654c;
import com.rmn.p324ui.views.listview.C11659h;
import java.util.ArrayList;
import p305ad.C10861a;
import p311bd.C10930a;
import p311bd.C10932b;
import p432tb.C13478b;
import p432tb.C13485e;
import p440ud.C13548a;
import p440ud.C13573q;
import p440ud.C13574r;
import p445vc.C13616e;
import p445vc.C13617f;
import p445vc.C13618g;
import p445vc.C13619h;

/* renamed from: ib.k */
/* compiled from: ReviewMerchantListController */
public class C12125k extends C10861a implements IProxyListener {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f19000f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f19001g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public double f19002h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f19003i;

    /* renamed from: ib.k$a */
    /* compiled from: ReviewMerchantListController */
    class C12126a implements C13574r.C13576b {
        C12126a() {
        }

        /* renamed from: E */
        public void mo49068E(C13574r rVar) {
            if (!C12125k.this.f19000f) {
                C12125k.this.m26425P2().mo46486l0(C12125k.this.f19001g);
                C12125k.this.m26426Q2().f19012j.mo53230g(C13573q.GONE);
                return;
            }
            C13619h.f21932a.mo53284e("reviews", "give-review", C12125k.this.m26426Q2().f19009g);
            C12125k.this.m26425P2().mo46484V0(C12125k.this.m26426Q2().f19008f, C12125k.this.m26426Q2().f19009g);
        }
    }

    /* renamed from: ib.k$b */
    /* compiled from: ReviewMerchantListController */
    class C12127b implements C11659h {

        /* renamed from: a */
        final /* synthetic */ ProxyBundleOutput f19005a;

        /* renamed from: b */
        final /* synthetic */ ProxyBundleInput f19006b;

        C12127b(ProxyBundleOutput proxyBundleOutput, ProxyBundleInput proxyBundleInput) {
            this.f19005a = proxyBundleOutput;
            this.f19006b = proxyBundleInput;
        }

        /* renamed from: a */
        public boolean mo47905a(int i) {
            return false;
        }

        /* renamed from: b */
        public boolean mo47906b() {
            ReviewMerchantStatus reviewMerchantStatus = (ReviewMerchantStatus) this.f19005a.getResponseObject(PLPMethodReturns.REVIEW_MERCHANT_STATUS_DETAIL);
            ReviewMerchant[] reviewMerchantArr = (ReviewMerchant[]) this.f19005a.getResponseObject(PLPMethodReturns.REVIEW_MERCHANT_ARRAY);
            if (reviewMerchantStatus == null || reviewMerchantArr == null) {
                return false;
            }
            C12125k.this.f19000f = reviewMerchantStatus.canAddReview();
            C12125k.this.f19001g = reviewMerchantStatus.getUserMessage();
            if (C12125k.this.f19000f) {
                C12125k.this.m26426Q2().f19012j.mo53230g(C13573q.VISIBLE);
            } else {
                C12125k.this.m26426Q2().f19012j.mo53230g(C13573q.GONE);
            }
            C12125k.this.f19002h = reviewMerchantStatus.getScoreReview();
            C12125k.this.f19003i = reviewMerchantStatus.getNumberReviews();
            if (reviewMerchantArr.length <= 0) {
                C12125k.this.mo45811n2().mo45950G2(C10932b.f16862d);
                C12125k.this.mo45811n2().mo45970r2(0);
                return true;
            }
            ArrayList arrayList = new ArrayList(reviewMerchantArr.length);
            for (ReviewMerchant reviewMerchant : reviewMerchantArr) {
                if (reviewMerchant != null) {
                    arrayList.add(reviewMerchant);
                }
            }
            int intValue = ((Integer) this.f19006b.getParamValue(PLPMethodParameters.OFFSET)).intValue();
            int intValue2 = ((Integer) this.f19005a.getResponseObject(PLPMethodReturns.TOTAL_COUNT)).intValue();
            C13485e eVar = new C13485e(C12125k.this.m26426Q2().f19009g, C12125k.this.f19002h, C12125k.this.f19003i);
            if (intValue <= 0) {
                arrayList.add(0, eVar);
            } else if (C12125k.this.mo45811n2().mo45977y2() > 0 && !eVar.equals(C12125k.this.mo45811n2().mo45974v2(0))) {
                C12125k.this.mo45811n2().mo45952J2(C13485e.class);
                C12125k.this.mo45811n2().mo45944A2(eVar, 0);
            }
            C12125k.this.mo45811n2().mo45965m2(arrayList, intValue, intValue2);
            C12125k.this.m26425P2().mo46485i1();
            return true;
        }
    }

    /* renamed from: ib.k$c */
    /* compiled from: ReviewMerchantListController */
    public static class C12128c extends C10861a.C10862a {
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: f */
        public final String f19008f;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: g */
        public final String f19009g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public final double f19010h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public final int f19011i;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: j */
        public final C13548a f19012j;

        public C12128c(@NonNull ContextContainer contextContainer, @NonNull LogoutListener logoutListener, @NonNull C10930a aVar, @NonNull C11654c cVar, @NonNull String str, @NonNull String str2, double d, int i, @NonNull C13548a aVar2) {
            super(contextContainer, logoutListener, aVar, cVar);
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException();
            } else if (!TextUtils.isEmpty(str2)) {
                this.f19008f = str;
                this.f19009g = str2;
                this.f19010h = d;
                this.f19011i = i;
                this.f19012j = aVar2;
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    public C12125k(@NonNull C12129l lVar, @NonNull C12128c cVar) {
        super(lVar, cVar);
        this.f19002h = cVar.f19010h;
        this.f19003i = cVar.f19011i;
        cVar.f19012j.mo53230g(C13573q.GONE);
        cVar.f19012j.mo53229f(new C12126a());
    }

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: P2 */
    public C12129l m26425P2() {
        return (C12129l) this.f16655b;
    }

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: Q2 */
    public C12128c m26426Q2() {
        return (C12128c) this.f16656c;
    }

    /* renamed from: S2 */
    private void m26427S2(ProxyBundleInput.ProxySourcesOption proxySourcesOption, int i, int i2) {
        ProxyActionsPool proxyActionsPool = this.f16652e;
        IProxyMethodType iProxyMethodType = ProxyMethodsReviewMerchant.REVIEW_MERCHANT_GET_LIST;
        proxyActionsPool.cancelAndRemoveAllActionsWithMethod(iProxyMethodType);
        ProxyBundleInput proxyBundleInput = new ProxyBundleInput(mo45820l2(), iProxyMethodType, proxySourcesOption, ProxyBundleInput.ProxyNetworkOption.ADD_IN_CACHE, mo45821m2());
        proxyBundleInput.addParamValue(PLPMethodParameters.ID_PLP_MERCHANT_REQUIRED, Integer.valueOf(Integer.parseInt(m26426Q2().f19008f)));
        proxyBundleInput.addParamValue(PLPMethodParameters.OFFSET, Integer.valueOf(i));
        proxyBundleInput.addParamValue(PLPMethodParameters.LIMIT, Integer.valueOf(i2));
        this.f16652e.executeProxyAction(this, proxyBundleInput);
    }

    /* renamed from: M0 */
    public void mo47901M0(C10930a aVar, int i) {
        m26427S2(ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_THEN_CLEAR_CACHE, 0, i);
    }

    /* renamed from: O2 */
    public boolean mo49574O2() {
        return this.f19000f;
    }

    /* renamed from: R2 */
    public void mo49575R2() {
        mo45811n2().mo45951I2();
        mo45811n2().mo45948E2();
    }

    /* renamed from: a */
    public void mo47903a(C10930a aVar, int i, int i2) {
        m26427S2(ProxyBundleInput.ProxySourcesOption.GET_FROM_CACHE_THEN_NETWORK, i, i2);
    }

    public void onProxyActionExecuted(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
        C13478b.m30706a(mo45811n2(), proxyBundleOutput, new C12127b(proxyBundleOutput, proxyBundleInput));
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo45819v2() {
        C13618g gVar = C13618g.f21930b;
        gVar.mo53280e(new C13616e("reviews-" + m26426Q2().f19009g, C13617f.REVIEWS).mo53275f(m26426Q2().f19008f, m26426Q2().f19009g));
    }

    /* access modifiers changed from: protected */
    /* renamed from: p2 */
    public void mo45813p2() {
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

    /* renamed from: N0 */
    public void mo47902N0(C10930a aVar, Object obj) {
    }
}
