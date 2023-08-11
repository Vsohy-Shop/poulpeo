package com.poulpeo.p321ui.screens.contact_info;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.main.proxy.IProxyMethodType;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.api.p322v2.poulpeo.model.PLPUser;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsPLPUser;
import p317cd.C11041e;
import p387ma.C12875f;
import p387ma.C12876g;
import p387ma.C12877h;
import p428sd.C13399d;
import p440ud.C13548a;
import p440ud.C13558g;
import p440ud.C13566l;
import p440ud.C13572p;
import p440ud.C13574r;
import p445vc.C13612a;
import p445vc.C13615d;
import p445vc.C13617f;
import p445vc.C13618g;
import p446vd.C13621b;

/* renamed from: com.poulpeo.ui.screens.contact_info.a */
/* compiled from: PLPResetPasswordController */
public class C11130a extends C11041e {
    @Nullable

    /* renamed from: f */
    private PLPUser f17323f;

    /* renamed from: com.poulpeo.ui.screens.contact_info.a$a */
    /* compiled from: PLPResetPasswordController */
    public static class C11131a extends C11041e.C11042a {
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: g */
        public final String f17324g;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: h */
        public final C13574r f17325h;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: i */
        public final C13574r f17326i;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: j */
        public final C13548a f17327j;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: k */
        public final C13572p f17328k;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: l */
        public final C13548a f17329l;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: m */
        public final C13558g f17330m;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: n */
        public final C13574r f17331n;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: o */
        public final C13548a f17332o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11131a(@NonNull C13566l lVar, @NonNull LogoutListener logoutListener, @NonNull String str, @NonNull IProxyMethodType iProxyMethodType, @NonNull RMNMethodParam rMNMethodParam, @NonNull C13399d dVar, @NonNull C13574r rVar, @NonNull C13574r rVar2, @NonNull C13548a aVar, @NonNull C13572p pVar, @NonNull C13548a aVar2, @NonNull C13558g gVar, @NonNull C13574r rVar3, @NonNull C13548a aVar3) {
            super(lVar.mo53219b(), logoutListener, iProxyMethodType, rMNMethodParam, dVar);
            this.f16657a = lVar;
            this.f17324g = str;
            this.f17325h = rVar;
            this.f17326i = rVar2;
            this.f17327j = aVar;
            this.f17329l = aVar2;
            this.f17328k = pVar;
            this.f17330m = gVar;
            this.f17331n = rVar3;
            this.f17332o = aVar3;
        }
    }

    public C11130a(@NonNull C11132b bVar, @NonNull C11131a aVar) {
        super(bVar, aVar);
        m24066E2().f17327j.mo53229f(new C12875f(aVar));
        m24066E2().f17332o.mo53229f(new C12876g(aVar));
        m24066E2().f17329l.mo53229f(new C12877h(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: A2 */
    public static /* synthetic */ void m24062A2(C11131a aVar, C13574r rVar) {
        C13618g.f21930b.mo53278b("reset-password", "redirect-apple-doc");
        C13621b.m31098l(aVar.mo45822a(), "https://support.apple.com/fr-fr/HT210426");
    }

    /* access modifiers changed from: private */
    /* renamed from: B2 */
    public static /* synthetic */ void m24063B2(C11131a aVar, C13574r rVar) {
        C13618g.f21930b.mo53278b("reset-password", "redirect-support");
        C13621b.m31098l(aVar.mo45822a(), "https://www.poulpeo.com/nous-contacter.htm");
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public /* synthetic */ void m24064C2(C13574r rVar) {
        m24067F2();
    }

    /* renamed from: D2 */
    private void m24065D2(@NonNull ProxyBundleOutput proxyBundleOutput) {
        if (proxyBundleOutput.getStatus() != ProxyBundleOutput.ProxyOutputStatus.OK) {
            mo46119n2().mo46215k();
            return;
        }
        PLPUser pLPUser = (PLPUser) proxyBundleOutput.getResponseObject(PLPMethodReturns.PLP_USER_DETAIL);
        this.f17323f = pLPUser;
        if (pLPUser == null || pLPUser.getEmail() == null) {
            mo46119n2().mo46215k();
            return;
        }
        mo46119n2().mo46216p(this.f17323f);
        m24066E2().f17325h.mo53248h(true);
        String z2 = mo46268z2();
        if (z2.endsWith("@privaterelay.appleid.com")) {
            m24066E2().f17326i.mo53248h(true);
        }
        m24066E2().f17328k.mo53241l(mo46119n2().mo46214P1(z2));
    }

    @NonNull
    /* renamed from: E2 */
    private C11131a m24066E2() {
        return (C11131a) this.f16656c;
    }

    /* renamed from: F2 */
    private void m24067F2() {
        m24066E2().f17330m.mo53203j();
        m24066E2().f17329l.mo53248h(false);
        m24066E2().f17331n.mo53248h(false);
        mo46124u2(mo46268z2());
    }

    /* renamed from: G2 */
    public void mo46266G2() {
        this.f17122d.cancelAndRemoveAllActions();
        this.f17122d.executeProxyAction(this, new ProxyBundleInput(mo45820l2(), ProxyMethodsPLPUser.PLP_USER_GET_DETAILS, ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_ONLY, ProxyBundleInput.ProxyNetworkOption.ADD_IN_CACHE, mo45821m2()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public void mo46118Z(@NonNull String str) {
        m24066E2().f17330m.mo53205l();
        m24066E2().f17329l.mo53248h(true);
        m24066E2().f17329l.mo53190j(mo46119n2().mo46213H0());
    }

    /* renamed from: o2 */
    public void mo46120o2() {
        super.mo46120o2();
        m24066E2().f17325h.mo53248h(false);
        m24066E2().f17326i.mo53248h(false);
        m24066E2().f17331n.mo53248h(false);
        m24066E2().f17330m.mo53205l();
        mo46266G2();
    }

    public void onProxyActionExecuted(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
        super.onProxyActionExecuted(proxyBundleInput, proxyBundleOutput);
        if (proxyBundleOutput.getStatus() != ProxyBundleOutput.ProxyOutputStatus.REQUEST_CANCELLED && proxyBundleInput.getProxyMethod() == ProxyMethodsPLPUser.PLP_USER_GET_DETAILS) {
            m24065D2(proxyBundleOutput);
        }
    }

    /* renamed from: s2 */
    public void mo46123s2() {
        super.mo46123s2();
        C13618g.f21930b.mo53280e(new C13615d("reset-password", C13617f.PROFILE).mo53271b(C13612a.SCREEN_ORIGIN, m24066E2().f17324g));
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: y2 */
    public C11132b mo46119n2() {
        return (C11132b) this.f16655b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z0 */
    public void mo46125z0() {
        m24066E2().f17330m.mo53205l();
        m24066E2().f17329l.mo53248h(true);
        m24066E2().f17329l.mo53190j(mo46119n2().mo46213H0());
        m24066E2().f17331n.mo53248h(true);
    }

    @NonNull
    /* renamed from: z2 */
    public String mo46268z2() {
        return this.f17323f.getEmail();
    }
}
