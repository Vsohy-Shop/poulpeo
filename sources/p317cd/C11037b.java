package p317cd;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.general.IApiType;
import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.main.oauth.IOAuthAccountListener;
import com.rmn.api.p322v2.main.oauth.OAuthAccountManager;
import com.rmn.api.p322v2.main.proxy.IProxyListener;
import com.rmn.api.p322v2.main.proxy.IProxyMethodType;
import com.rmn.api.p322v2.main.proxy.ProxyActionsPool;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.api.p322v2.main.result.ResponseResult;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.p324ui.wrappers.ResourceStringWrapper;
import p305ad.C10865d;
import p415qc.C13240e;
import p415qc.C13242g;
import p427sc.C13384a;
import p427sc.C13385b;
import p428sd.C13396a;
import p428sd.C13397b;
import p428sd.C13399d;
import p439uc.C13547c;
import p445vc.C13618g;
import p451wc.C13693c;

/* renamed from: cd.b */
/* compiled from: LoginController */
public abstract class C11037b extends C10865d implements IProxyListener, IOAuthAccountListener {
    @NonNull

    /* renamed from: d */
    protected final ProxyActionsPool f17085d = new ProxyActionsPool();

    /* renamed from: e */
    private boolean f17086e = false;

    /* renamed from: f */
    private boolean f17087f = false;

    /* renamed from: g */
    private boolean f17088g = false;

    /* renamed from: h */
    private boolean f17089h = false;

    /* renamed from: i */
    private boolean f17090i = false;

    /* renamed from: j */
    private boolean f17091j = false;
    @Nullable

    /* renamed from: k */
    private String f17092k;
    @Nullable

    /* renamed from: l */
    private String f17093l;
    @Nullable

    /* renamed from: m */
    private String f17094m = "";

    /* renamed from: n */
    protected boolean f17095n = false;
    @Nullable

    /* renamed from: o */
    protected Boolean f17096o;

    /* renamed from: cd.b$a */
    /* compiled from: LoginController */
    public static class C11038a extends C10865d.C10866a {
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: d */
        public final IApiType f17097d;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: e */
        public final String f17098e;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: f */
        public final String f17099f;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: g */
        public final String f17100g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public final boolean f17101h;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: i */
        public final C11040d f17102i;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: j */
        public final C11036a f17103j;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: k */
        public final C13399d f17104k;
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: l */
        public final C13399d f17105l;
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: m */
        public final C13399d f17106m;
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: n */
        public final C13399d f17107n;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: o */
        public final C13399d f17108o;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: p */
        public final C13399d f17109p;

        public C11038a(@NonNull ContextContainer contextContainer, @NonNull IApiType iApiType, @NonNull String str, @NonNull String str2, @NonNull String str3, boolean z, @NonNull C11040d dVar, @NonNull C11036a aVar, @NonNull C13399d dVar2, @Nullable C13399d dVar3, @Nullable C13399d dVar4, @Nullable C13399d dVar5, @NonNull C13399d dVar6, @NonNull C13399d dVar7) {
            super(contextContainer, (LogoutListener) null);
            this.f17097d = iApiType;
            this.f17098e = str;
            this.f17099f = str2;
            this.f17100g = str3;
            this.f17101h = z;
            this.f17102i = dVar;
            this.f17103j = aVar;
            this.f17104k = dVar2;
            this.f17105l = dVar3;
            this.f17106m = dVar4;
            this.f17107n = dVar5;
            this.f17108o = dVar6;
            this.f17109p = dVar7;
        }
    }

    public C11037b(@NonNull C11039c cVar, @NonNull C11038a aVar) {
        super(cVar, aVar);
    }

    /* renamed from: B2 */
    private void m23730B2() {
        mo46095q2().mo46111e();
        OAuthAccountManager.getInstance().sendConnectionRequest(mo45820l2(), this, m23739S2().f17097d, m23739S2().f17098e, m23739S2().f17099f, m23739S2().f17100g);
    }

    /* renamed from: G2 */
    private void m23731G2() {
        this.f17085d.cancelAndRemoveAllActionsWithMethod(m23739S2().f17102i.f17113d);
        ProxyBundleInput proxyBundleInput = new ProxyBundleInput(mo45820l2(), m23739S2().f17102i.f17113d, ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_ONLY, ProxyBundleInput.ProxyNetworkOption.NO_CACHE, (LogoutListener) null);
        String t2 = mo46097t2();
        String A2 = mo46070A2();
        if (TextUtils.isEmpty(t2)) {
            C11039c q2 = mo46095q2();
            q2.mo46114m0("mEmail == \"" + t2 + "\" before sending ProxyMethodsUser.LOGIN in " + getClass().getName());
            t2 = "";
        }
        if (TextUtils.isEmpty(A2)) {
            C11039c q22 = mo46095q2();
            q22.mo46114m0("mPassword == \"" + A2 + "\" before sending ProxyMethodsUser.LOGIN in " + getClass().getName());
            A2 = "";
        }
        proxyBundleInput.addParamValue(m23739S2().f17102i.f17119j, t2);
        proxyBundleInput.addParamValue(m23739S2().f17102i.f17120k, A2);
        m23745n2(proxyBundleInput);
        this.f17085d.executeProxyAction(this, proxyBundleInput);
    }

    /* renamed from: H2 */
    private void m23732H2() {
        IProxyMethodType iProxyMethodType;
        String c0 = mo46095q2().mo46110c0();
        if (!TextUtils.isEmpty(c0) && (iProxyMethodType = m23739S2().f17102i.f17112c) != null) {
            m23741U2(iProxyMethodType, c0, false, true);
        }
    }

    /* renamed from: I2 */
    private void m23733I2() {
        IProxyMethodType iProxyMethodType;
        String O1 = mo46095q2().mo46106O1();
        if (!TextUtils.isEmpty(O1) && (iProxyMethodType = m23739S2().f17102i.f17110a) != null) {
            m23741U2(iProxyMethodType, O1, false, false);
        }
    }

    /* renamed from: J2 */
    private void m23734J2() {
        IProxyMethodType iProxyMethodType;
        String E1 = mo46095q2().mo46103E1();
        if (!TextUtils.isEmpty(E1) && (iProxyMethodType = m23739S2().f17102i.f17111b) != null) {
            m23741U2(iProxyMethodType, E1, true, false);
        }
    }

    /* renamed from: K2 */
    private void m23735K2(ProxyBundleOutput proxyBundleOutput) {
        C13547c.m30933a(mo45820l2(), "on_login");
        Integer num = (Integer) proxyBundleOutput.getResponseObject(m23739S2().f17102i.f17121l);
        if (num != null) {
            this.f17094m = num.toString();
        } else {
            this.f17094m = "";
        }
    }

    /* renamed from: N2 */
    private void m23736N2(ProxyBundleOutput proxyBundleOutput, C13399d dVar) {
        ProxyBundleOutput.ProxyOutputStatus status = proxyBundleOutput.getStatus();
        if (ProxyBundleOutput.ProxyOutputStatus.REQUEST_CANCELLED.equals(status)) {
            this.f17088g = false;
        } else if (ProxyBundleOutput.ProxyOutputStatus.OK.equals(status)) {
            m23735K2(proxyBundleOutput);
            m23744f3();
            m23746r2();
        } else {
            String str = null;
            if (status == ProxyBundleOutput.ProxyOutputStatus.ERROR && proxyBundleOutput.getErrorCode() == 1100) {
                mo46095q2().mo46108Y1((String) null);
                mo46095q2().mo46115r1(this.f17089h, this.f17090i, this.f17091j);
                return;
            }
            mo46087g3();
            if (dVar != null) {
                str = C13396a.m30473a(proxyBundleOutput, dVar, dVar.mo53009a(C13397b.f21459c, (String) null));
            }
            mo46095q2().mo46108Y1(str);
        }
    }

    /* renamed from: Q2 */
    private void m23737Q2(ProxyBundleOutput proxyBundleOutput) {
        ProxyBundleOutput.ProxyOutputStatus status = proxyBundleOutput.getStatus();
        if (ProxyBundleOutput.ProxyOutputStatus.REQUEST_CANCELLED.equals(status)) {
            mo46095q2().mo46105H();
            this.f17088g = false;
        } else if (ProxyBundleOutput.ProxyOutputStatus.OK.equals(status)) {
            m23735K2(proxyBundleOutput);
            m23746r2();
        } else {
            mo46087g3();
            mo46095q2().mo46108Y1(C13396a.m30473a(proxyBundleOutput, m23739S2().f17104k, m23739S2().f17104k.mo53009a(C13397b.f21459c, (String) null)));
        }
    }

    /* renamed from: R2 */
    private void m23738R2(ProxyBundleOutput proxyBundleOutput) {
        ProxyBundleOutput.ProxyOutputStatus status = proxyBundleOutput.getStatus();
        if (ProxyBundleOutput.ProxyOutputStatus.REQUEST_CANCELLED == status) {
            this.f17088g = false;
        } else if (ProxyBundleOutput.ProxyOutputStatus.OK.equals(status)) {
            m23735K2(proxyBundleOutput);
            m23742d3();
            m23746r2();
        } else {
            mo46087g3();
            mo46095q2().mo46108Y1(C13396a.m30473a(proxyBundleOutput, m23739S2().f17109p, m23739S2().f17109p.mo53009a(C13397b.f21459c, (String) null)));
        }
    }

    @NonNull
    /* renamed from: S2 */
    private C11038a m23739S2() {
        return (C11038a) this.f16656c;
    }

    /* renamed from: T2 */
    private void m23740T2() {
        this.f17085d.cancelAndRemoveAllActionsWithMethod(m23739S2().f17102i.f17114e);
        ProxyBundleInput proxyBundleInput = new ProxyBundleInput(mo45820l2(), m23739S2().f17102i.f17114e, ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_ONLY, ProxyBundleInput.ProxyNetworkOption.NO_CACHE, (LogoutListener) null);
        String t2 = mo46097t2();
        String A2 = mo46070A2();
        if (TextUtils.isEmpty(t2)) {
            C11039c q2 = mo46095q2();
            q2.mo46114m0("mEmail == \"" + t2 + "\" before sending ProxyMethodsUser.REGISTER_THEN_LOGIN in " + getClass().getName());
            t2 = "";
        }
        if (TextUtils.isEmpty(A2)) {
            C11039c q22 = mo46095q2();
            q22.mo46114m0("mPassword == \"" + A2 + "\" before sending ProxyMethodsUser.REGISTER_THEN_LOGIN in " + getClass().getName());
            A2 = "";
        }
        proxyBundleInput.addParamValue(m23739S2().f17102i.f17119j, t2);
        proxyBundleInput.addParamValue(m23739S2().f17102i.f17120k, A2);
        mo46089o2(proxyBundleInput);
        m23745n2(proxyBundleInput);
        this.f17085d.executeProxyAction(this, proxyBundleInput);
    }

    /* renamed from: U2 */
    private void m23741U2(@NonNull IProxyMethodType iProxyMethodType, @NonNull String str, boolean z, boolean z2) {
        this.f17085d.cancelAndRemoveAllActionsWithMethod(iProxyMethodType);
        ProxyBundleInput proxyBundleInput = new ProxyBundleInput(mo45820l2(), iProxyMethodType, ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_ONLY, ProxyBundleInput.ProxyNetworkOption.NO_CACHE, (LogoutListener) null);
        if (z) {
            if (m23739S2().f17102i.f17117h != null) {
                proxyBundleInput.addParamValue(m23739S2().f17102i.f17117h, str);
            } else {
                throw new IllegalStateException("The authCode request param must not be null when using auth code for Google login");
            }
        } else if (z2) {
            proxyBundleInput.addParamValue(m23739S2().f17102i.f17118i, str);
        } else {
            proxyBundleInput.addParamValue(m23739S2().f17102i.f17116g, str);
        }
        mo46094p2(proxyBundleInput);
        m23745n2(proxyBundleInput);
        this.f17085d.executeProxyAction(this, proxyBundleInput);
    }

    /* renamed from: d3 */
    private void m23742d3() {
        if (!mo46073E2()) {
            new C13240e(mo45820l2()).mo52888c(C13242g.f21107s, this.f17094m).mo52889g(new C13384a(this.f17092k));
        }
    }

    /* renamed from: e3 */
    private void m23743e3() {
        String str;
        if (!mo46073E2()) {
            if (this.f17089h) {
                str = "facebook";
            } else if (this.f17090i) {
                str = Constants.REFERRER_API_GOOGLE;
            } else if (this.f17091j) {
                str = "apple";
            } else {
                str = null;
            }
            new C13240e(mo45820l2()).mo52888c(C13242g.f21107s, this.f17094m).mo52889g(new C13385b(this.f17094m, str));
        }
    }

    /* renamed from: f3 */
    private void m23744f3() {
        if (!mo46073E2()) {
            if (this.f17089h) {
                new C13240e(mo45820l2()).mo52888c(C13242g.f21107s, this.f17094m).mo52889g(new C13384a("facebook", mo46095q2().mo46109a2()));
            } else if (this.f17090i) {
                new C13240e(mo45820l2()).mo52888c(C13242g.f21107s, this.f17094m).mo52889g(new C13384a(Constants.REFERRER_API_GOOGLE, mo46095q2().mo46117u1()));
            } else if (this.f17091j) {
                new C13240e(mo45820l2()).mo52888c(C13242g.f21107s, this.f17094m).mo52889g(new C13384a("apple", mo46095q2().mo46110c0()));
            }
        }
    }

    /* renamed from: n2 */
    private void m23745n2(@NonNull ProxyBundleInput proxyBundleInput) {
        C13693c y2 = mo46101y2();
        if (y2 != null && mo46102z2() != null) {
            String d = y2.mo53359d();
            if (!TextUtils.isEmpty(d)) {
                proxyBundleInput.addParamValue(mo46102z2(), d);
            }
        }
    }

    /* renamed from: r2 */
    private void m23746r2() {
        OAuthAccountManager.getInstance().sendConnectionConfirmRequest(mo45820l2(), this, m23739S2().f17097d, (String) null);
    }

    /* renamed from: x2 */
    private String m23747x2() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (m23739S2().f17101h) {
            str = "signup";
        } else {
            str = "login";
        }
        sb.append(str);
        sb.append("-");
        if (this.f17089h) {
            str2 = "facebook";
        } else if (this.f17090i) {
            str2 = Constants.REFERRER_API_GOOGLE;
        } else if (this.f17091j) {
            str2 = "apple";
        } else {
            str2 = "form";
        }
        sb.append(str2);
        return sb.toString();
    }

    @Nullable
    /* renamed from: A2 */
    public String mo46070A2() {
        return this.f17093l;
    }

    @NonNull
    /* renamed from: C2 */
    public C13399d mo46071C2() {
        return m23739S2().f17108o;
    }

    @Nullable
    /* renamed from: D2 */
    public String mo46072D2() {
        return this.f17094m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E2 */
    public boolean mo46073E2() {
        if (mo46101y2() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: F2 */
    public boolean mo46074F2() {
        return m23739S2().f17101h;
    }

    /* renamed from: M2 */
    public void mo46076M2() {
        this.f17085d.cancelAndRemoveAllActions();
        this.f17087f = true;
    }

    /* renamed from: V2 */
    public void mo46079V2(@NonNull String str, @Nullable String str2) {
        this.f17092k = str;
        this.f17093l = str2;
    }

    /* renamed from: W2 */
    public void mo46080W2(boolean z) {
        this.f17088g = z;
    }

    /* renamed from: X2 */
    public void mo46081X2(boolean z) {
        this.f17091j = z;
    }

    /* renamed from: Y2 */
    public void mo46082Y2(boolean z) {
        this.f17089h = z;
    }

    /* renamed from: Z2 */
    public void mo46083Z2(boolean z) {
        this.f17090i = z;
    }

    /* renamed from: a3 */
    public void mo46084a3(boolean z) {
        this.f17096o = Boolean.valueOf(z);
    }

    /* renamed from: b3 */
    public void mo46085b3(boolean z) {
        this.f17095n = z;
    }

    /* renamed from: c3 */
    public void mo46086c3() {
        if (!this.f17086e) {
            m23730B2();
        } else if (this.f17089h) {
            m23733I2();
        } else if (this.f17090i) {
            m23734J2();
        } else if (this.f17091j) {
            m23732H2();
        } else if (m23739S2().f17101h) {
            m23740T2();
        } else {
            m23731G2();
        }
    }

    /* renamed from: g3 */
    public void mo46087g3() {
        C13618g.f21930b.mo53278b(m23747x2(), "failed");
    }

    /* renamed from: h3 */
    public void mo46088h3() {
        C13618g.f21930b.mo53278b(m23747x2(), "success");
    }

    public void onAccessTokenFail(ResponseResult responseResult) {
        if (!this.f17087f) {
            mo46087g3();
            this.f17088g = false;
            this.f17086e = false;
            ResourceStringWrapper F1 = mo46095q2().mo46104F1();
            if (responseResult != null && responseResult.hasWellFormedRawData() && responseResult.hasNoError() && responseResult.getErrorCode() == 222) {
                F1 = mo46095q2().mo46113f1();
            }
            mo46095q2().mo46116t(F1);
            OAuthAccountManager.getInstance().invalidateRequestTokensLocally(mo45820l2(), m23739S2().f17097d);
        }
    }

    public void onAccessTokenSuccess() {
        if (!this.f17087f) {
            mo46088h3();
            m23743e3();
            mo46095q2().mo46112e0(this.f17089h, this.f17090i, this.f17091j);
            if (this.f17089h) {
                OAuthAccountManager.getInstance().facebookTokenHandler.saveAccessToken(mo45820l2(), mo46095q2().mo46106O1());
            } else if (this.f17090i) {
                OAuthAccountManager.getInstance().googleTokenHandler.saveAccessToken(mo45820l2(), mo46095q2().mo46103E1());
            } else if (this.f17091j) {
                OAuthAccountManager.getInstance().appleTokenHandler.saveAccessToken(mo45820l2(), mo46095q2().mo46110c0());
            }
        }
    }

    public void onProxyActionExecuted(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
        if (!mo46098u2()) {
            IProxyMethodType proxyMethod = proxyBundleInput.getProxyMethod();
            if (proxyMethod == m23739S2().f17102i.f17113d) {
                m23737Q2(proxyBundleOutput);
            } else if (proxyMethod == m23739S2().f17102i.f17110a) {
                m23736N2(proxyBundleOutput, m23739S2().f17105l);
            } else if (proxyMethod == m23739S2().f17102i.f17111b) {
                m23736N2(proxyBundleOutput, m23739S2().f17106m);
            } else if (proxyMethod == m23739S2().f17102i.f17112c) {
                m23736N2(proxyBundleOutput, m23739S2().f17107n);
            } else if (proxyMethod == m23739S2().f17102i.f17114e) {
                m23738R2(proxyBundleOutput);
            }
        }
    }

    public void onRequestTokenFail(ResponseResult responseResult) {
        if (!this.f17087f) {
            mo46087g3();
            this.f17088g = false;
            this.f17086e = false;
            mo46095q2().mo46105H();
            ResourceStringWrapper F1 = mo46095q2().mo46104F1();
            if (responseResult != null && responseResult.hasWellFormedRawData() && !responseResult.hasNoError() && responseResult.getErrorCode() == 222) {
                F1 = mo46095q2().mo46113f1();
            }
            mo46095q2().mo46107X(F1);
        }
    }

    public void onRequestTokenSuccess(String str) {
        if (!this.f17087f) {
            this.f17086e = true;
            mo46086c3();
        }
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: q2 */
    public C11039c mo46095q2() {
        return (C11039c) this.f16655b;
    }

    @NonNull
    /* renamed from: s2 */
    public C11036a mo46096s2() {
        return m23739S2().f17103j;
    }

    @Nullable
    /* renamed from: t2 */
    public String mo46097t2() {
        return this.f17092k;
    }

    /* renamed from: u2 */
    public boolean mo46098u2() {
        return this.f17087f;
    }

    /* renamed from: v2 */
    public boolean mo46099v2() {
        return this.f17088g;
    }

    @NonNull
    /* renamed from: w2 */
    public C11040d mo46100w2() {
        return m23739S2().f17102i;
    }

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: y2 */
    public abstract C13693c mo46101y2();

    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: z2 */
    public abstract RMNMethodParam mo46102z2();

    /* renamed from: L2 */
    public void mo46075L2() {
    }

    /* renamed from: O2 */
    public void mo46077O2() {
    }

    /* renamed from: P2 */
    public void mo46078P2() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: o2 */
    public void mo46089o2(ProxyBundleInput proxyBundleInput) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: p2 */
    public void mo46094p2(ProxyBundleInput proxyBundleInput) {
    }
}
