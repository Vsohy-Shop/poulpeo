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
import com.rmn.api.p322v2.poulpeo.model.UnregisterMotive;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsPLPUser;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.util.Objects;
import p305ad.C10865d;
import p428sd.C13396a;
import p428sd.C13399d;
import p440ud.C13548a;
import p440ud.C13551d;
import p440ud.C13572p;
import p440ud.C13574r;
import p445vc.C13618g;

/* renamed from: ma.n */
/* compiled from: UnregisterController */
public class C12886n extends C10865d implements IProxyListener, C13574r.C13576b, C13551d.C13554c {

    /* renamed from: i */
    private static int f20615i = 500;
    @NonNull

    /* renamed from: d */
    private final ProxyActionsPool f20616d = new ProxyActionsPool();

    /* renamed from: e */
    private boolean f20617e;
    @NonNull

    /* renamed from: f */
    private UnregisterMotive f20618f = UnregisterMotive.UNDEFINED;
    @Nullable

    /* renamed from: g */
    private String f20619g;

    /* renamed from: h */
    private boolean f20620h;

    /* renamed from: ma.n$a */
    /* compiled from: UnregisterController */
    public static class C12887a extends C10865d.C10866a {
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: d */
        public final C13399d f20621d;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: e */
        public final C13551d f20622e;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: f */
        public final C13551d f20623f;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: g */
        public final C13572p f20624g;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: h */
        public final C13548a f20625h;

        public C12887a(@NonNull ContextContainer contextContainer, @NonNull LogoutListener logoutListener, @NonNull C13399d dVar, @NonNull C13551d dVar2, @NonNull C13551d dVar3, @NonNull C13572p pVar, @NonNull C13548a aVar) {
            super(contextContainer, logoutListener);
            this.f20621d = dVar;
            this.f20622e = dVar2;
            this.f20623f = dVar3;
            this.f20624g = pVar;
            this.f20625h = aVar;
        }
    }

    public C12886n(@NonNull C12888o oVar, @NonNull C12887a aVar) {
        super(oVar, aVar);
        aVar.f20623f.mo53196s(f20615i);
        m28989x2();
        aVar.f20623f.mo53191n(this);
        aVar.f20625h.mo53229f(this);
    }

    /* renamed from: c */
    private void m28985c(String str) {
        if (!TextUtils.isEmpty(str)) {
            m28986n2().mo46224c(str);
        }
    }

    @NonNull
    /* renamed from: n2 */
    private C12888o m28986n2() {
        return (C12888o) this.f16655b;
    }

    /* renamed from: s2 */
    private void m28987s2(ProxyBundleOutput proxyBundleOutput) {
        int errorCode;
        this.f20617e = false;
        m28986n2().mo46225g();
        ProxyBundleOutput.ProxyOutputStatus status = proxyBundleOutput.getStatus();
        if (status == ProxyBundleOutput.ProxyOutputStatus.OK) {
            LogoutListener m2 = mo45821m2();
            Objects.requireNonNull(m2);
            m2.onLogout(false);
            C13618g.f21930b.mo53278b("close-account", "validation");
            return;
        }
        if (!(status != ProxyBundleOutput.ProxyOutputStatus.ERROR || (errorCode = proxyBundleOutput.getErrorCode()) == 39 || errorCode == 824)) {
            this.f20620h = true;
        }
        m28985c(C13396a.m30473a(proxyBundleOutput, m28988t2().f20621d, (String) null));
    }

    @NonNull
    /* renamed from: t2 */
    private C12887a m28988t2() {
        return (C12887a) this.f16656c;
    }

    /* renamed from: x2 */
    private void m28989x2() {
        C13572p e = m28988t2().f20624g;
        e.mo53241l(m28988t2().f20623f.mo53193p().length() + " / " + f20615i);
    }

    /* renamed from: E */
    public void mo49068E(C13574r rVar) {
        C13618g.f21930b.mo53278b("close-account", "link");
        mo50803u2();
    }

    /* renamed from: R0 */
    public void mo49571R0(C13551d dVar, String str) {
        if (dVar == m28988t2().f20623f) {
            m28989x2();
        }
    }

    /* renamed from: b0 */
    public boolean mo49572b0(String str) {
        return true;
    }

    public void onProxyActionExecuted(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
        if (proxyBundleOutput.getStatus() != ProxyBundleOutput.ProxyOutputStatus.REQUEST_CANCELLED && proxyBundleInput.getProxyMethod() == ProxyMethodsPLPUser.PLP_USER_UNREGISTER) {
            m28987s2(proxyBundleOutput);
        }
    }

    /* renamed from: p2 */
    public void mo50800p2() {
        this.f20616d.cancelAndRemoveAllActions();
    }

    /* renamed from: u2 */
    public void mo50803u2() {
        String str;
        if (this.f20618f == UnregisterMotive.UNDEFINED) {
            m28986n2().mo46228m1();
        } else if (!this.f20620h || (str = this.f20619g) == null) {
            m28986n2().mo46227j();
        } else {
            mo50805w2(str);
        }
    }

    /* renamed from: v2 */
    public void mo50804v2(@NonNull UnregisterMotive unregisterMotive) {
        this.f20618f = unregisterMotive;
        m28988t2().f20622e.mo53197t(unregisterMotive.textToDisplay);
    }

    /* renamed from: w2 */
    public void mo50805w2(@NonNull String str) {
        if (!this.f20617e && !TextUtils.isEmpty(str)) {
            this.f20619g = str;
            m28986n2().mo46226h();
            this.f20617e = true;
            this.f20616d.cancelAndRemoveAllActions();
            ProxyBundleInput proxyBundleInput = new ProxyBundleInput(mo45820l2(), ProxyMethodsPLPUser.PLP_USER_UNREGISTER, ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_ONLY, ProxyBundleInput.ProxyNetworkOption.NO_CACHE, mo45821m2());
            String str2 = (String) this.f20618f.getJSONValue();
            if (!TextUtils.isEmpty(str2)) {
                proxyBundleInput.addParamValue(PLPMethodParameters.MOTIVE, str2);
            }
            String p = m28988t2().f20623f.mo53193p();
            if (!TextUtils.isEmpty(p)) {
                proxyBundleInput.addParamValue(PLPMethodParameters.SUGGESTION_OPTIONAL, p);
            }
            proxyBundleInput.addParamValue(PLPMethodParameters.PASSWORD, str);
            this.f20616d.executeProxyAction(this, proxyBundleInput);
        }
    }

    /* renamed from: o2 */
    public void mo50799o2() {
    }

    /* renamed from: q2 */
    public void mo50801q2() {
    }

    /* renamed from: r2 */
    public void mo50802r2() {
    }
}
