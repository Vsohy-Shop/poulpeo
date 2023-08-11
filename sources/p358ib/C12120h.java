package p358ib;

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
import com.rmn.api.p322v2.poulpeo.model.PLPUser;
import com.rmn.api.p322v2.poulpeo.model.ReviewConfig;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsPLPUser;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsReviewMerchant;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.math.BigDecimal;
import java.util.Date;
import java.util.regex.Pattern;
import p305ad.C10865d;
import p428sd.C13396a;
import p428sd.C13397b;
import p428sd.C13399d;
import p440ud.C13549b;
import p440ud.C13550c;
import p440ud.C13551d;
import p440ud.C13556e;
import p440ud.C13561i;
import p440ud.C13565k;
import p440ud.C13571o;
import p440ud.C13572p;
import p440ud.C13573q;
import p440ud.C13574r;
import p445vc.C13616e;
import p445vc.C13617f;
import p445vc.C13618g;
import p445vc.C13619h;
import p446vd.C13622c;

/* renamed from: ib.h */
/* compiled from: ReviewMerchantAddController */
public class C12120h extends C10865d implements IProxyListener {
    @NonNull

    /* renamed from: d */
    private final ProxyActionsPool f18975d = new ProxyActionsPool();
    @NonNull

    /* renamed from: e */
    private final Pattern f18976e = Pattern.compile("^[ \\n]+|[ \\n]+$");
    @NonNull

    /* renamed from: f */
    private final Pattern f18977f = Pattern.compile(" +");
    @NonNull

    /* renamed from: g */
    private final Pattern f18978g = Pattern.compile("\\n+");
    @Nullable

    /* renamed from: h */
    private ReviewConfig f18979h;
    @Nullable

    /* renamed from: i */
    private Date f18980i;

    /* renamed from: ib.h$a */
    /* compiled from: ReviewMerchantAddController */
    class C12121a implements C13551d.C13554c {
        C12121a() {
        }

        /* renamed from: R0 */
        public void mo49571R0(C13551d dVar, String str) {
            C12120h.this.m26370H2();
            C12120h.this.m26377t2().mo46475D1();
        }

        /* renamed from: b0 */
        public boolean mo49572b0(String str) {
            return true;
        }
    }

    /* renamed from: ib.h$b */
    /* compiled from: ReviewMerchantAddController */
    public static class C12122b extends C10865d.C10866a {
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final int f18982d;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: e */
        public final String f18983e;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: f */
        public final C13572p f18984f;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: g */
        public final C13561i f18985g;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: h */
        public final C13571o f18986h;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: i */
        public final C13571o f18987i;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: j */
        public final C13572p f18988j;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: k */
        public final C13572p f18989k;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: l */
        public final C13556e f18990l;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: m */
        public final C13574r f18991m;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: n */
        public final C13574r f18992n;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: o */
        public final C13565k f18993o;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: p */
        public final C13549b f18994p;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: q */
        public final C13550c f18995q;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: r */
        public final C13549b f18996r;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: s */
        public final C13550c f18997s;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: t */
        public final C13399d f18998t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12122b(@NonNull ContextContainer contextContainer, @NonNull LogoutListener logoutListener, int i, @NonNull String str, @NonNull C13572p pVar, @NonNull C13561i iVar, @NonNull C13571o oVar, @NonNull C13571o oVar2, @NonNull C13572p pVar2, @NonNull C13572p pVar3, @NonNull C13556e eVar, @NonNull C13574r rVar, @NonNull C13574r rVar2, @NonNull C13565k kVar, @NonNull C13549b bVar, @NonNull C13550c cVar, @NonNull C13549b bVar2, @NonNull C13550c cVar2, @NonNull C13399d dVar) {
            super(contextContainer, logoutListener);
            this.f18982d = i;
            this.f18983e = str;
            this.f18984f = pVar;
            this.f18985g = iVar;
            this.f18986h = oVar;
            this.f18987i = oVar2;
            this.f18988j = pVar2;
            this.f18989k = pVar3;
            this.f18990l = eVar;
            this.f18991m = rVar;
            this.f18992n = rVar2;
            this.f18993o = kVar;
            this.f18994p = bVar;
            this.f18995q = cVar;
            this.f18996r = bVar2;
            this.f18997s = cVar2;
            this.f18998t = dVar;
        }
    }

    public C12120h(@NonNull C12123i iVar, @NonNull C12122b bVar) {
        super(iVar, bVar);
        bVar.f18984f.mo53241l(bVar.f18983e);
        C13571o o = bVar.f18987i;
        C13573q qVar = C13573q.INVISIBLE;
        o.mo53230g(qVar);
        bVar.f18986h.mo53230g(qVar);
        bVar.f18991m.mo53230g(qVar);
        bVar.f18990l.mo53230g(qVar);
        bVar.f18987i.mo53237o("");
        bVar.f18986h.mo53237o("");
        m26370H2();
        bVar.f18985g.mo53213l(1.0f);
        bVar.f18985g.mo53214m(new C12117e(bVar));
        bVar.f18986h.mo53231i(new C12121a());
        bVar.f18990l.mo53229f(new C12118f(this));
        bVar.f18992n.mo53229f(new C12119g(this));
    }

    /* renamed from: D2 */
    private void m26367D2(ProxyBundleOutput proxyBundleOutput) {
        if (proxyBundleOutput.getStatus() != ProxyBundleOutput.ProxyOutputStatus.OK) {
            m26377t2().mo46476J();
            return;
        }
        PLPUser pLPUser = (PLPUser) proxyBundleOutput.getResponseObject(PLPMethodReturns.PLP_USER_DETAIL);
        if (pLPUser == null) {
            m26377t2().mo46476J();
            return;
        }
        ReviewConfig reviewConfig = pLPUser.getReviewConfig();
        this.f18979h = reviewConfig;
        if (reviewConfig == null) {
            m26377t2().mo46476J();
            return;
        }
        m26368E2().f18989k.mo53241l(m26368E2().f18993o.mo53217c(mo45820l2(), (double) this.f18979h.getMinPaidCharCount(), Integer.valueOf(this.f18979h.getMinPaidCharCount())));
        m26368E2().f18986h.mo53236n(this.f18979h.getMaxCharCount());
    }

    @NonNull
    /* renamed from: E2 */
    private C12122b m26368E2() {
        return (C12122b) this.f16656c;
    }

    /* renamed from: F2 */
    private void m26369F2() {
        ProxyActionsPool proxyActionsPool = this.f18975d;
        IProxyMethodType iProxyMethodType = ProxyMethodsPLPUser.PLP_USER_GET_DETAILS;
        proxyActionsPool.cancelAndRemoveAllActionsWithMethod(iProxyMethodType);
        this.f18975d.executeProxyAction(this, new ProxyBundleInput(mo45820l2(), iProxyMethodType, ProxyBundleInput.ProxySourcesOption.GET_FROM_CACHE_ONLY, ProxyBundleInput.ProxyNetworkOption.NO_CACHE, mo45821m2()));
    }

    /* access modifiers changed from: private */
    /* renamed from: H2 */
    public void m26370H2() {
        int length = m26378u2().length();
        m26368E2().f18988j.mo53239j(length);
        ReviewConfig reviewConfig = this.f18979h;
        if (reviewConfig == null || length < reviewConfig.getMinPaidCharCount()) {
            m26368E2().f18989k.mo53230g(C13573q.VISIBLE);
            m26368E2().f18990l.mo53247e(false);
            m26368E2().f18988j.mo53242m(m26368E2().f18994p);
            m26368E2().f18988j.mo53246d(m26368E2().f18995q);
            return;
        }
        m26368E2().f18989k.mo53230g(C13573q.GONE);
        m26368E2().f18990l.mo53247e(true);
        m26368E2().f18988j.mo53242m(m26368E2().f18996r);
        m26368E2().f18988j.mo53246d(m26368E2().f18997s);
    }

    /* renamed from: s2 */
    private void m26376s2() {
        m26377t2().mo50335I0();
        ProxyActionsPool proxyActionsPool = this.f18975d;
        IProxyMethodType iProxyMethodType = ProxyMethodsReviewMerchant.REVIEW_MERCHANT_ADD;
        proxyActionsPool.cancelAndRemoveAllActionsWithMethod(iProxyMethodType);
        ProxyBundleInput proxyBundleInput = new ProxyBundleInput(mo45820l2(), iProxyMethodType, ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_ONLY, ProxyBundleInput.ProxyNetworkOption.NO_CACHE, mo45821m2());
        proxyBundleInput.addParamValue(PLPMethodParameters.ID_PLP_MERCHANT_REQUIRED, Integer.valueOf(m26368E2().f18982d));
        proxyBundleInput.addParamValue(PLPMethodParameters.REVIEW_MERCHANT_SCORE, Double.valueOf(new BigDecimal((double) m26368E2().f18985g.mo53211j()).doubleValue()));
        proxyBundleInput.addParamValue(PLPMethodParameters.REVIEW_MERCHANT_CONTENT, m26378u2());
        proxyBundleInput.addParamValue(PLPMethodParameters.REVIEW_MERCHANT_DATE_ORDER, this.f18980i);
        this.f18975d.executeProxyAction(this, proxyBundleInput);
    }

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: t2 */
    public C12123i m26377t2() {
        return (C12123i) this.f16655b;
    }

    /* renamed from: u2 */
    private String m26378u2() {
        return this.f18978g.matcher(this.f18977f.matcher(this.f18976e.matcher(m26368E2().f18986h.mo53233k()).replaceAll("")).replaceAll(" ")).replaceAll("\\n");
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public static /* synthetic */ void m26379v2(C12122b bVar, C13561i iVar, float f, boolean z) {
        if (!bVar.f18987i.mo53245c()) {
            bVar.f18987i.mo53230g(C13573q.VISIBLE);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w2 */
    public /* synthetic */ void m26380w2(C13574r rVar) {
        C13619h.f21932a.mo53284e("review-form", "send", m26368E2().f18983e);
        m26376s2();
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public /* synthetic */ void m26381x2(C13574r rVar) {
        m26377t2().mo46478f2();
    }

    /* renamed from: y2 */
    private void m26382y2(ProxyBundleOutput proxyBundleOutput) {
        String a = m26368E2().f18998t.mo53009a(C13397b.f21459c, (String) null);
        if (proxyBundleOutput.getStatus() != ProxyBundleOutput.ProxyOutputStatus.OK) {
            String userMessage = proxyBundleOutput.getUserMessage();
            if (userMessage == null) {
                userMessage = C13396a.m30473a(proxyBundleOutput, m26368E2().f18998t, a);
            }
            m26377t2().mo50338W0(userMessage);
            return;
        }
        m26377t2().mo46480r0();
    }

    /* renamed from: A2 */
    public void mo49566A2() {
        this.f18975d.cancelAndRemoveAllActions();
    }

    /* renamed from: C2 */
    public void mo49568C2() {
        C13618g gVar = C13618g.f21930b;
        gVar.mo53280e(new C13616e("review-form-" + m26368E2().f18983e, C13617f.REVIEW_FORM).mo53273d(m26368E2().f18982d, m26368E2().f18983e));
    }

    /* renamed from: G2 */
    public void mo49569G2(@NonNull Date date) {
        if (!m26368E2().f18986h.mo53245c()) {
            C13571o n = m26368E2().f18986h;
            C13573q qVar = C13573q.VISIBLE;
            n.mo53230g(qVar);
            m26368E2().f18991m.mo53230g(qVar);
            m26368E2().f18990l.mo53230g(qVar);
            m26377t2().mo46477U0();
        }
        this.f18980i = date;
        m26368E2().f18987i.mo53237o(C13622c.m31099a(date.getTime()));
    }

    public void onProxyActionExecuted(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
        if (proxyBundleOutput.getStatus() != ProxyBundleOutput.ProxyOutputStatus.REQUEST_CANCELLED) {
            if (proxyBundleInput.getProxyMethod() == ProxyMethodsPLPUser.PLP_USER_GET_DETAILS) {
                m26367D2(proxyBundleOutput);
            } else if (proxyBundleInput.getProxyMethod() == ProxyMethodsReviewMerchant.REVIEW_MERCHANT_ADD) {
                m26382y2(proxyBundleOutput);
            }
        }
    }

    /* renamed from: z2 */
    public void mo49570z2() {
        m26369F2();
    }

    /* renamed from: B2 */
    public void mo49567B2() {
    }
}
