package p413qa;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.proxy.IProxyListener;
import com.rmn.api.p322v2.main.proxy.ProxyActionsPool;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsPLPUser;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.p324ui.wrappers.ResourceStringWrapper;
import p305ad.C10865d;
import p428sd.C13396a;
import p428sd.C13397b;
import p428sd.C13399d;
import p440ud.C13548a;
import p440ud.C13551d;
import p440ud.C13558g;
import p440ud.C13572p;
import p440ud.C13573q;
import p440ud.C13574r;

/* renamed from: qa.k */
/* compiled from: SponsorshipCodeCheckController */
public class C13231k extends C10865d implements C13551d.C13554c, C13574r.C13576b, IProxyListener {
    @NonNull

    /* renamed from: d */
    private final ProxyActionsPool f21046d = new ProxyActionsPool();
    @Nullable

    /* renamed from: e */
    private String f21047e;

    /* renamed from: qa.k$a */
    /* compiled from: SponsorshipCodeCheckController */
    public static class C13232a extends C10865d.C10866a {
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: d */
        public final C13399d f21048d;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: e */
        public final C13551d f21049e;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: f */
        public final C13558g f21050f;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: g */
        public final C13548a f21051g;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: h */
        public final C13574r f21052h;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: i */
        public final C13572p f21053i;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: j */
        public final C13572p f21054j;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: k */
        public final ResourceStringWrapper f21055k;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: l */
        public final ResourceStringWrapper f21056l;
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: m */
        public final String f21057m;

        public C13232a(@NonNull ContextContainer contextContainer, @NonNull C13399d dVar, @NonNull C13551d dVar2, @NonNull C13558g gVar, @NonNull C13548a aVar, @NonNull C13574r rVar, @NonNull C13572p pVar, @NonNull C13572p pVar2, @NonNull ResourceStringWrapper resourceStringWrapper, @NonNull ResourceStringWrapper resourceStringWrapper2, @Nullable String str) {
            super(contextContainer);
            this.f21048d = dVar;
            this.f21049e = dVar2;
            this.f21050f = gVar;
            this.f21051g = aVar;
            this.f21052h = rVar;
            this.f21053i = pVar;
            this.f21054j = pVar2;
            this.f21055k = resourceStringWrapper;
            this.f21056l = resourceStringWrapper2;
            this.f21057m = str;
        }
    }

    public C13231k(@NonNull C13233l lVar, @NonNull C13232a aVar) {
        super(lVar, aVar);
        aVar.f21049e.mo53191n(this);
        aVar.f21049e.mo53196s(15);
        aVar.f21051g.mo53229f(this);
        if (aVar.f21057m != null) {
            this.f21047e = aVar.f21057m;
        } else {
            this.f21047e = "";
        }
        aVar.f21049e.mo53197t(this.f21047e);
    }

    /* renamed from: n2 */
    private void m30041n2(String str) {
        ProxyBundleInput proxyBundleInput = new ProxyBundleInput(mo45820l2(), ProxyMethodsPLPUser.PLP_USER_CHECK_SPONSORSHIP_CODE, ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_ONLY, ProxyBundleInput.ProxyNetworkOption.NO_CACHE, (LogoutListener) null);
        proxyBundleInput.addParamValue(PLPMethodParameters.SPONSORSHIP_CODE, str);
        this.f21046d.executeProxyAction(this, proxyBundleInput);
        m30044u2();
    }

    @NonNull
    /* renamed from: o2 */
    private C13233l m30042o2() {
        return (C13233l) this.f16655b;
    }

    @NonNull
    /* renamed from: t2 */
    private C13232a m30043t2() {
        return (C13232a) this.f16656c;
    }

    /* renamed from: u2 */
    private void m30044u2() {
        m30043t2().f21050f.mo53203j();
        m30043t2().f21051g.mo53247e(false);
    }

    /* renamed from: v2 */
    private void m30045v2(boolean z, boolean z2) {
        C13573q qVar;
        C13573q qVar2;
        this.f21047e = m30043t2().f21049e.mo53193p();
        m30043t2().f21050f.mo53205l();
        m30043t2().f21051g.mo53247e(true);
        C13574r d = m30043t2().f21052h;
        if (z) {
            qVar = C13573q.VISIBLE;
        } else {
            qVar = C13573q.INVISIBLE;
        }
        d.mo53230g(qVar);
        C13572p h = m30043t2().f21054j;
        if (z2) {
            qVar2 = C13573q.VISIBLE;
        } else {
            qVar2 = C13573q.GONE;
        }
        h.mo53230g(qVar2);
    }

    /* renamed from: E */
    public void mo49068E(C13574r rVar) {
        if (rVar == m30043t2().f21051g && this.f21047e != null) {
            m30042o2().mo46310S0(this.f21047e);
        }
    }

    /* renamed from: R0 */
    public void mo49571R0(C13551d dVar, String str) {
        this.f21046d.cancelAndRemoveAllActionsWithMethod(ProxyMethodsPLPUser.PLP_USER_CHECK_SPONSORSHIP_CODE);
        if (str.length() < 6) {
            m30045v2(false, false);
        } else {
            m30041n2(str);
        }
    }

    /* renamed from: b0 */
    public boolean mo49572b0(String str) {
        return true;
    }

    public void onProxyActionExecuted(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
        if (proxyBundleOutput.getStatus() != ProxyBundleOutput.ProxyOutputStatus.REQUEST_CANCELLED) {
            String a = m30043t2().f21048d.mo53009a(C13397b.f21459c, (String) null);
            if (proxyBundleOutput.getStatus() == ProxyBundleOutput.ProxyOutputStatus.OK) {
                String str = (String) proxyBundleOutput.getResponseObject(PLPMethodReturns.PLP_USER_SPONSOR_LOGIN);
                if (TextUtils.isEmpty(str)) {
                    m30043t2().f21053i.mo53240k(m30043t2().f21055k);
                } else {
                    m30043t2().f21053i.mo53241l(m30043t2().f21056l.mo47913b(mo45820l2(), str));
                }
                m30045v2(true, false);
            } else if (proxyBundleOutput.getStatus() == ProxyBundleOutput.ProxyOutputStatus.ERROR) {
                m30045v2(false, true);
            } else {
                String userMessage = proxyBundleOutput.getUserMessage();
                if (TextUtils.isEmpty(userMessage)) {
                    userMessage = C13396a.m30473a(proxyBundleOutput, m30043t2().f21048d, a);
                }
                m30042o2().mo46309N1(userMessage);
                m30045v2(false, false);
            }
        }
    }

    /* renamed from: p2 */
    public void mo52873p2() {
        m30043t2().f21052h.mo53230g(C13573q.INVISIBLE);
        m30043t2().f21054j.mo53230g(C13573q.GONE);
    }

    /* renamed from: q2 */
    public void mo52874q2() {
        this.f21046d.cancelAndRemoveAllActions();
    }

    /* renamed from: r2 */
    public void mo52875r2() {
    }

    /* renamed from: s2 */
    public void mo52876s2() {
    }
}
