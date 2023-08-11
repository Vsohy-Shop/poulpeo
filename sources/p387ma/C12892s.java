package p387ma;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.cache.CacheBundleOutput;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputAdd;
import com.rmn.api.p322v2.main.proxy.IProxyListener;
import com.rmn.api.p322v2.main.proxy.IProxyMethodType;
import com.rmn.api.p322v2.main.proxy.ProxyActionsPool;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.api.p322v2.poulpeo.cache.methods.CacheMethodsPLPUser;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.api.p322v2.poulpeo.model.PLPUser;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsPLPUser;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.p324ui.wrappers.ResourceStringWrapper;
import com.rmn.utils_common.IListener;
import org.json.JSONObject;
import p305ad.C10865d;
import p428sd.C13396a;
import p428sd.C13399d;
import p440ud.C13548a;
import p440ud.C13551d;
import p440ud.C13558g;
import p440ud.C13573q;
import p440ud.C13574r;

/* renamed from: ma.s */
/* compiled from: UpdateLoginInfoController */
public class C12892s extends C10865d implements IProxyListener, C13574r.C13576b, C13551d.C13555d {
    @NonNull

    /* renamed from: d */
    private final ProxyActionsPool f20630d = new ProxyActionsPool();
    @Nullable

    /* renamed from: e */
    private PLPUser f20631e;

    /* renamed from: f */
    private boolean f20632f;

    /* renamed from: ma.s$a */
    /* compiled from: UpdateLoginInfoController */
    public static class C12893a extends C10865d.C10866a {
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: d */
        public final C13399d f20633d;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: e */
        public final C13551d f20634e;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: f */
        public final C13551d f20635f;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: g */
        public final C13551d f20636g;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: h */
        public final C13548a f20637h;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: i */
        public final C13558g f20638i;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: j */
        public final ResourceStringWrapper f20639j;

        public C12893a(@NonNull ContextContainer contextContainer, @NonNull LogoutListener logoutListener, @NonNull C13399d dVar, @NonNull C13551d dVar2, @NonNull C13551d dVar3, @NonNull C13551d dVar4, @NonNull C13548a aVar, @NonNull C13558g gVar, @NonNull ResourceStringWrapper resourceStringWrapper) {
            super(contextContainer, logoutListener);
            this.f20633d = dVar;
            this.f20634e = dVar2;
            this.f20635f = dVar3;
            this.f20636g = dVar4;
            this.f20637h = aVar;
            this.f20638i = gVar;
            this.f20639j = resourceStringWrapper;
        }
    }

    public C12892s(@NonNull C12894t tVar, @NonNull C12893a aVar) {
        super(tVar, aVar);
        aVar.f20634e.mo53196s(30);
        aVar.f20635f.mo53196s(50);
        aVar.f20636g.mo53196s(30);
        aVar.f20634e.mo53195r(this);
        aVar.f20635f.mo53195r(this);
        aVar.f20636g.mo53195r(this);
        aVar.f20637h.mo53229f(this);
    }

    /* renamed from: A2 */
    private void m29011A2() {
        new ProxyBundleInput(mo45820l2(), ProxyMethodsPLPUser.PLP_USER_GET_DETAILS, ProxyBundleInput.ProxySourcesOption.GET_FROM_CACHE_THEN_NETWORK, ProxyBundleInput.ProxyNetworkOption.ADD_IN_CACHE, mo45821m2()).executeProxyAction(this);
    }

    /* renamed from: B2 */
    private void m29012B2() {
        if (!this.f20632f) {
            m29016h();
            this.f20632f = true;
            this.f20630d.cancelAndRemoveAllActions();
            ProxyBundleInput proxyBundleInput = new ProxyBundleInput(mo45820l2(), ProxyMethodsPLPUser.UPDATE_LOGIN_INFO, ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_ONLY, ProxyBundleInput.ProxyNetworkOption.NO_CACHE, mo45821m2());
            String p = m29025y2().f20634e.mo53193p();
            if ((this.f20631e == null && !TextUtils.isEmpty(p)) || !p.equals(this.f20631e.getLogin())) {
                proxyBundleInput.addParamValue(PLPMethodParameters.LOGIN_OPTIONAL, p);
            }
            String p2 = m29025y2().f20635f.mo53193p();
            if ((this.f20631e == null && !TextUtils.isEmpty(p2)) || !p2.equals(this.f20631e.getEmail())) {
                proxyBundleInput.addParamValue(PLPMethodParameters.EMAIL_OPTIONAL, p2);
            }
            proxyBundleInput.addParamValue(PLPMethodParameters.PASSWORD, m29025y2().f20636g.mo53193p());
            this.f20630d.executeProxyAction(this, proxyBundleInput);
        }
    }

    /* renamed from: C2 */
    private void m29013C2(String str, String str2, IListener<Void> iListener) {
        m29016h();
        PLPUser pLPUser = new PLPUser(this.f20631e, str, str2);
        CacheBundleInputAdd cacheBundleInputAdd = new CacheBundleInputAdd(mo45820l2(), CacheMethodsPLPUser.GET_DETAILS, CacheBundleInputAdd.AddOption.REPLACE_IF_EXISTING);
        cacheBundleInputAdd.addObjectToStore(PLPMethodReturns.PLP_USER_DETAIL, pLPUser);
        cacheBundleInputAdd.getMethodType().getCache(mo45820l2()).executeCacheActionAdd(new C12891r(this, iListener), cacheBundleInputAdd);
    }

    /* renamed from: c */
    private void m29014c(String str) {
        if (!TextUtils.isEmpty(str)) {
            m29020p2().mo46239c(str);
        }
    }

    /* renamed from: g */
    private void m29015g() {
        m29025y2().f20638i.mo53205l();
        m29025y2().f20637h.mo53230g(C13573q.VISIBLE);
    }

    /* renamed from: h */
    private void m29016h() {
        m29025y2().f20638i.mo53203j();
        m29025y2().f20637h.mo53230g(C13573q.INVISIBLE);
    }

    /* renamed from: l */
    private void m29017l(C13551d dVar, String str) {
        if (!TextUtils.isEmpty(str)) {
            m29020p2().mo46240l(dVar, str);
        }
    }

    @NonNull
    /* renamed from: p2 */
    private C12894t m29020p2() {
        return (C12894t) this.f16655b;
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public /* synthetic */ void m29021q2(Void voidR) {
        m29020p2().mo46241u();
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public /* synthetic */ void m29022r2(IListener iListener, CacheBundleInputAdd cacheBundleInputAdd, CacheBundleOutput.CacheOutputStatus cacheOutputStatus) {
        m29015g();
        iListener.mo40744J0(null);
    }

    /* renamed from: u2 */
    private void m29023u2(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
        this.f20632f = false;
        m29015g();
        ProxyBundleOutput.ProxyOutputStatus status = proxyBundleOutput.getStatus();
        if (status == ProxyBundleOutput.ProxyOutputStatus.OK) {
            if (this.f20631e == null) {
                m29020p2().mo46241u();
            } else {
                m29013C2((String) proxyBundleInput.getParamValue(PLPMethodParameters.LOGIN_OPTIONAL), (String) proxyBundleInput.getParamValue(PLPMethodParameters.EMAIL_OPTIONAL), new C12890q(this));
            }
        } else if (status == ProxyBundleOutput.ProxyOutputStatus.ERROR && proxyBundleOutput.getErrorCode() == 0) {
            JSONObject errorData = proxyBundleOutput.getErrorData();
            String optString = errorData.optString("login");
            if (!TextUtils.isEmpty(optString)) {
                m29017l(m29025y2().f20634e, optString);
            }
            String optString2 = errorData.optString(NotificationCompat.CATEGORY_EMAIL);
            if (!TextUtils.isEmpty(optString2)) {
                m29017l(m29025y2().f20635f, optString2);
            }
        } else {
            m29014c(C13396a.m30473a(proxyBundleOutput, m29025y2().f20633d, (String) null));
        }
    }

    /* renamed from: x2 */
    private void m29024x2(ProxyBundleOutput proxyBundleOutput) {
        if (proxyBundleOutput.getStatus() == ProxyBundleOutput.ProxyOutputStatus.OK) {
            PLPUser pLPUser = (PLPUser) proxyBundleOutput.getResponseObject(PLPMethodReturns.PLP_USER_DETAIL);
            this.f20631e = pLPUser;
            if (pLPUser != null) {
                if (TextUtils.isEmpty(m29025y2().f20634e.mo53193p())) {
                    m29025y2().f20634e.mo53197t(this.f20631e.getLogin());
                }
                if (TextUtils.isEmpty(m29025y2().f20635f.mo53193p())) {
                    m29025y2().f20635f.mo53197t(this.f20631e.getEmail());
                }
            }
        }
    }

    @NonNull
    /* renamed from: y2 */
    private C12893a m29025y2() {
        return (C12893a) this.f16656c;
    }

    /* renamed from: D2 */
    public boolean mo50807D2() {
        if (!TextUtils.isEmpty(m29025y2().f20636g.mo53193p())) {
            return true;
        }
        m29025y2().f20636g.mo53194q();
        m29017l(m29025y2().f20636g, m29025y2().f20639j.mo47912a(mo45820l2()));
        return false;
    }

    /* renamed from: E */
    public void mo49068E(C13574r rVar) {
        mo50812z2();
    }

    /* renamed from: b */
    public void mo50787b(C13551d dVar) {
        m29020p2().mo46238b(dVar);
    }

    public void onProxyActionExecuted(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
        if (proxyBundleOutput.getStatus() != ProxyBundleOutput.ProxyOutputStatus.REQUEST_CANCELLED) {
            IProxyMethodType proxyMethod = proxyBundleInput.getProxyMethod();
            if (proxyMethod == ProxyMethodsPLPUser.PLP_USER_GET_DETAILS) {
                m29024x2(proxyBundleOutput);
            } else if (proxyMethod == ProxyMethodsPLPUser.UPDATE_LOGIN_INFO) {
                m29023u2(proxyBundleInput, proxyBundleOutput);
            }
        }
    }

    /* renamed from: s2 */
    public void mo50808s2() {
        m29015g();
        m29011A2();
    }

    /* renamed from: t2 */
    public void mo50809t2() {
        this.f20630d.cancelAndRemoveAllActions();
    }

    /* renamed from: z2 */
    public void mo50812z2() {
        if (mo50807D2()) {
            m29012B2();
        }
    }

    /* renamed from: v2 */
    public void mo50810v2() {
    }

    /* renamed from: w2 */
    public void mo50811w2() {
    }
}
