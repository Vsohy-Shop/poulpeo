package p387ma;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.proxy.IProxyListener;
import com.rmn.api.p322v2.main.proxy.ProxyActionsPool;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsPLPUser;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.p324ui.wrappers.ResourceStringWrapper;
import p305ad.C10865d;
import p428sd.C13396a;
import p428sd.C13399d;
import p440ud.C13548a;
import p440ud.C13551d;
import p440ud.C13558g;
import p440ud.C13573q;
import p440ud.C13574r;
import p444vb.C13611b;

/* renamed from: ma.v */
/* compiled from: UpdatePasswordController */
public class C12896v extends C10865d implements IProxyListener, C13574r.C13576b, C13551d.C13555d, C13551d.C13554c {
    @NonNull

    /* renamed from: d */
    private final ProxyActionsPool f20641d = new ProxyActionsPool();

    /* renamed from: e */
    private boolean f20642e;

    /* renamed from: ma.v$a */
    /* compiled from: UpdatePasswordController */
    public static class C12897a extends C10865d.C10866a {
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: d */
        public final C13399d f20643d;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: e */
        public final C13551d f20644e;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: f */
        public final C13551d f20645f;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: g */
        public final C13548a f20646g;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: h */
        public final C13558g f20647h;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: i */
        public final ResourceStringWrapper f20648i;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: j */
        public final ResourceStringWrapper f20649j;

        public C12897a(@NonNull ContextContainer contextContainer, @NonNull LogoutListener logoutListener, @NonNull C13399d dVar, @NonNull C13551d dVar2, @NonNull C13551d dVar3, @NonNull C13548a aVar, @NonNull C13558g gVar, @NonNull ResourceStringWrapper resourceStringWrapper, @NonNull ResourceStringWrapper resourceStringWrapper2) {
            super(contextContainer, logoutListener);
            this.f20643d = dVar;
            this.f20644e = dVar2;
            this.f20645f = dVar3;
            this.f20646g = aVar;
            this.f20647h = gVar;
            this.f20648i = resourceStringWrapper;
            this.f20649j = resourceStringWrapper2;
        }
    }

    public C12896v(@Nullable C12898w wVar, @NonNull C12897a aVar) {
        super(wVar, aVar);
        aVar.f20644e.mo53196s(30);
        aVar.f20645f.mo53196s(30);
        aVar.f20644e.mo53195r(this);
        aVar.f20645f.mo53195r(this);
        aVar.f20645f.mo53191n(this);
        aVar.f20646g.mo53229f(this);
    }

    /* renamed from: c */
    private void m29045c(String str) {
        if (!TextUtils.isEmpty(str)) {
            m29047n2().mo46245c(str);
        }
    }

    /* renamed from: l */
    private void m29046l(C13551d dVar, String str) {
        if (!TextUtils.isEmpty(str)) {
            m29047n2().mo46246l(dVar, str);
        }
    }

    @NonNull
    /* renamed from: n2 */
    private C12898w m29047n2() {
        return (C12898w) this.f16655b;
    }

    /* renamed from: q2 */
    private void m29048q2(ProxyBundleOutput proxyBundleOutput) {
        this.f20642e = false;
        m29049t2().f20647h.mo53205l();
        m29049t2().f20646g.mo53230g(C13573q.VISIBLE);
        ProxyBundleOutput.ProxyOutputStatus status = proxyBundleOutput.getStatus();
        if (status == ProxyBundleOutput.ProxyOutputStatus.OK) {
            m29047n2().mo46247y();
            return;
        }
        if (status == ProxyBundleOutput.ProxyOutputStatus.ERROR) {
            int errorCode = proxyBundleOutput.getErrorCode();
            if (errorCode == 0) {
                m29046l(m29049t2().f20644e, proxyBundleOutput.getUserMessage());
                return;
            } else if (errorCode == 824) {
                m29049t2().f20644e.mo53194q();
                m29046l(m29049t2().f20644e, m29049t2().f20649j.mo47912a(mo45820l2()));
                return;
            }
        }
        m29045c(C13396a.m30473a(proxyBundleOutput, m29049t2().f20643d, (String) null));
    }

    @NonNull
    /* renamed from: t2 */
    private C12897a m29049t2() {
        return (C12897a) this.f16656c;
    }

    /* renamed from: v2 */
    private void m29050v2() {
        if (!this.f20642e) {
            String p = m29049t2().f20644e.mo53193p();
            String p2 = m29049t2().f20645f.mo53193p();
            m29049t2().f20647h.mo53203j();
            m29049t2().f20646g.mo53230g(C13573q.INVISIBLE);
            this.f20642e = true;
            this.f20641d.cancelAndRemoveAllActions();
            ProxyBundleInput proxyBundleInput = new ProxyBundleInput(mo45820l2(), ProxyMethodsPLPUser.CHANGE_PASSWORD, ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_ONLY, ProxyBundleInput.ProxyNetworkOption.NO_CACHE, mo45821m2());
            proxyBundleInput.addParamValue(PLPMethodParameters.OLD_PASSWORD, p);
            proxyBundleInput.addParamValue(PLPMethodParameters.NEW_PASSWORD, p2);
            this.f20641d.executeProxyAction(this, proxyBundleInput);
        }
    }

    /* renamed from: w2 */
    private void m29051w2() {
        m29049t2().f20646g.mo53247e(new C13611b(m29049t2().f20645f.mo53193p()).f21874e);
    }

    /* renamed from: E */
    public void mo49068E(C13574r rVar) {
        mo50818u2();
    }

    /* renamed from: R0 */
    public void mo49571R0(C13551d dVar, String str) {
        m29051w2();
    }

    /* renamed from: b */
    public void mo50787b(C13551d dVar) {
        m29047n2().mo46244b(dVar);
    }

    /* renamed from: b0 */
    public boolean mo49572b0(String str) {
        return true;
    }

    /* renamed from: o2 */
    public void mo50814o2() {
        m29051w2();
        m29049t2().f20647h.mo53205l();
        m29049t2().f20646g.mo53230g(C13573q.VISIBLE);
    }

    public void onProxyActionExecuted(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
        if (proxyBundleOutput.getStatus() != ProxyBundleOutput.ProxyOutputStatus.REQUEST_CANCELLED && proxyBundleInput.getProxyMethod() == ProxyMethodsPLPUser.CHANGE_PASSWORD) {
            m29048q2(proxyBundleOutput);
        }
    }

    /* renamed from: p2 */
    public void mo50815p2() {
        this.f20641d.cancelAndRemoveAllActions();
    }

    /* renamed from: u2 */
    public void mo50818u2() {
        if (mo50819x2()) {
            m29050v2();
        }
    }

    /* renamed from: x2 */
    public boolean mo50819x2() {
        if (TextUtils.isEmpty(m29049t2().f20644e.mo53193p())) {
            m29049t2().f20644e.mo53194q();
            m29046l(m29049t2().f20644e, m29049t2().f20648i.mo47912a(mo45820l2()));
            return false;
        } else if (!TextUtils.isEmpty(m29049t2().f20645f.mo53193p())) {
            return true;
        } else {
            m29049t2().f20645f.mo53194q();
            m29046l(m29049t2().f20645f, m29049t2().f20648i.mo47912a(mo45820l2()));
            return false;
        }
    }

    /* renamed from: r2 */
    public void mo50816r2() {
    }

    /* renamed from: s2 */
    public void mo50817s2() {
    }
}
