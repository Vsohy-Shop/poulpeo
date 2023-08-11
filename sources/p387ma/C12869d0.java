package p387ma;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.autofill.HintConstants;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.cache.CacheBundleOutput;
import com.rmn.api.p322v2.main.cache.cachebundleinput.CacheBundleInputAdd;
import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.main.proxy.IProxyListener;
import com.rmn.api.p322v2.main.proxy.IProxyMethodType;
import com.rmn.api.p322v2.main.proxy.ProxyActionsPool;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.api.p322v2.poulpeo.cache.methods.CacheMethodsPLPUser;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.api.p322v2.poulpeo.model.Civility;
import com.rmn.api.p322v2.poulpeo.model.Country;
import com.rmn.api.p322v2.poulpeo.model.PLPUser;
import com.rmn.api.p322v2.poulpeo.model.PaymentMethod;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsPLPUser;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.iosadapters.android.p323os.AndroidOsHandler;
import com.rmn.iosadapters.android.p323os.AndroidOsMessage;
import com.rmn.utils_common.IListener;
import java.util.Set;
import org.json.JSONObject;
import p305ad.C10865d;
import p382lc.C12822d;
import p428sd.C13396a;
import p428sd.C13399d;
import p440ud.C13548a;
import p440ud.C13551d;
import p440ud.C13571o;
import p440ud.C13573q;
import p440ud.C13574r;

/* renamed from: ma.d0 */
/* compiled from: UpdatePaymentInfoController */
public class C12869d0 extends C10865d implements IProxyListener, C13574r.C13576b, C13551d.C13555d {
    @NonNull

    /* renamed from: d */
    private final ProxyActionsPool f20574d = new ProxyActionsPool();

    /* renamed from: e */
    private boolean f20575e;
    @Nullable

    /* renamed from: f */
    private PLPUser f20576f;
    @Nullable

    /* renamed from: g */
    private Civility f20577g;
    @Nullable

    /* renamed from: h */
    private Country f20578h;
    @Nullable

    /* renamed from: i */
    private String f20579i;

    /* renamed from: j */
    private boolean f20580j;
    @Nullable

    /* renamed from: k */
    private AndroidOsHandler f20581k;

    /* renamed from: ma.d0$a */
    /* compiled from: UpdatePaymentInfoController */
    public static class C12870a extends C10865d.C10866a {
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: d */
        public final C13399d f20582d;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: e */
        public final C13574r f20583e;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: f */
        public final C13571o f20584f;
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: g */
        public final C13574r f20585g;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: h */
        public final C13571o f20586h;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: i */
        public final C13571o f20587i;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: j */
        public final C13571o f20588j;
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: k */
        public final C13574r f20589k;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: l */
        public final C13571o f20590l;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: m */
        public final C13571o f20591m;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: n */
        public final C13571o f20592n;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: o */
        public final C13571o f20593o;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: p */
        public final C13571o f20594p;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: q */
        public final C13571o f20595q;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: r */
        public final C13571o f20596r;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: s */
        public final C13571o f20597s;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: t */
        public final C13548a f20598t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12870a(@NonNull ContextContainer contextContainer, @NonNull LogoutListener logoutListener, @NonNull C13399d dVar, @NonNull C13574r rVar, @NonNull C13571o oVar, @Nullable C13574r rVar2, @NonNull C13571o oVar2, @NonNull C13571o oVar3, @NonNull C13571o oVar4, @Nullable C13574r rVar3, @NonNull C13571o oVar5, @NonNull C13571o oVar6, @NonNull C13571o oVar7, @NonNull C13571o oVar8, @NonNull C13571o oVar9, @NonNull C13571o oVar10, @NonNull C13571o oVar11, @NonNull C13571o oVar12, @NonNull C13548a aVar) {
            super(contextContainer, logoutListener);
            this.f20582d = dVar;
            this.f20583e = rVar;
            this.f20584f = oVar;
            this.f20585g = rVar2;
            this.f20586h = oVar2;
            this.f20587i = oVar3;
            this.f20588j = oVar4;
            this.f20589k = rVar3;
            this.f20590l = oVar5;
            this.f20591m = oVar6;
            this.f20592n = oVar7;
            this.f20593o = oVar8;
            this.f20594p = oVar9;
            this.f20595q = oVar10;
            this.f20596r = oVar11;
            this.f20597s = oVar12;
            this.f20598t = aVar;
        }
    }

    public C12869d0(@Nullable C12874e0 e0Var, @NonNull C12870a aVar) {
        super(e0Var, aVar);
        aVar.f20586h.mo53236n(30);
        aVar.f20587i.mo53236n(30);
        aVar.f20587i.mo53236n(30);
        aVar.f20590l.mo53236n(36);
        aVar.f20591m.mo53236n(15);
        aVar.f20592n.mo53236n(50);
        aVar.f20593o.mo53236n(100);
        aVar.f20594p.mo53236n(10);
        aVar.f20595q.mo53236n(30);
        aVar.f20596r.mo53236n(20);
        aVar.f20597s.mo53236n(20);
        aVar.f20586h.mo53235m(this);
        aVar.f20587i.mo53235m(this);
        aVar.f20590l.mo53235m(this);
        aVar.f20591m.mo53235m(this);
        aVar.f20592n.mo53235m(this);
        aVar.f20593o.mo53235m(this);
        aVar.f20594p.mo53235m(this);
        aVar.f20595q.mo53235m(this);
        aVar.f20596r.mo53235m(this);
        aVar.f20597s.mo53235m(this);
        aVar.f20598t.mo53229f(this);
    }

    /* renamed from: B2 */
    private void m28891B2(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
        this.f20575e = false;
        m28900g();
        ProxyBundleOutput.ProxyOutputStatus status = proxyBundleOutput.getStatus();
        if (status == ProxyBundleOutput.ProxyOutputStatus.OK) {
            Boolean bool = (Boolean) proxyBundleOutput.getResponseObject(PLPMethodReturns.PLP_USER_SHOULD_UPDATE_PAYMENT_INFO);
            if (bool == null) {
                bool = Boolean.FALSE;
            }
            m28897M2(proxyBundleInput, bool.booleanValue(), new C12863a0(this));
            return;
        }
        if (status == ProxyBundleOutput.ProxyOutputStatus.ERROR) {
            int errorCode = proxyBundleOutput.getErrorCode();
            if (!(errorCode == 39 || errorCode == 824)) {
                this.f20580j = true;
            }
            if (errorCode == 0) {
                JSONObject errorData = proxyBundleOutput.getErrorData();
                m28912x2(errorData, "iban", m28893E2().f20590l);
                m28912x2(errorData, "bic", m28893E2().f20591m);
                m28912x2(errorData, "email_paypal", m28893E2().f20592n);
                m28912x2(errorData, HintConstants.AUTOFILL_HINT_PHONE, m28893E2().f20596r);
                m28912x2(errorData, "mobile", m28893E2().f20597s);
                return;
            }
        }
        m28899c(C13396a.m30473a(proxyBundleOutput, m28893E2().f20582d, (String) null));
    }

    /* renamed from: D2 */
    private void m28892D2(ProxyBundleOutput proxyBundleOutput) {
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        m28900g();
        if (proxyBundleOutput.getStatus() != ProxyBundleOutput.ProxyOutputStatus.OK) {
            m28908t2().mo46257k();
            return;
        }
        m28893E2().f20583e.mo53230g(C13573q.VISIBLE);
        PLPUser pLPUser = (PLPUser) proxyBundleOutput.getResponseObject(PLPMethodReturns.PLP_USER_DETAIL);
        this.f20576f = pLPUser;
        if (pLPUser == null) {
            m28908t2().mo46257k();
            return;
        }
        this.f20577g = pLPUser.getCivility();
        this.f20578h = this.f20576f.getCountry();
        C13571o i = m28893E2().f20584f;
        Civility civility = this.f20577g;
        String str2 = "";
        if (civility == null) {
            str = str2;
        } else {
            str = civility.getCapitalizedCivility();
        }
        m28896L2(i, str);
        m28896L2(m28893E2().f20586h, this.f20576f.getLastName());
        m28896L2(m28893E2().f20587i, this.f20576f.getFirstName());
        C13571o j = m28893E2().f20588j;
        Country country = this.f20578h;
        if (country != null) {
            str2 = country.getLabel();
        }
        m28896L2(j, str2);
        m28896L2(m28893E2().f20590l, this.f20576f.getIBAN());
        m28896L2(m28893E2().f20591m, this.f20576f.getBIC());
        m28896L2(m28893E2().f20592n, this.f20576f.getEmailPaypal());
        m28896L2(m28893E2().f20593o, this.f20576f.getAddress());
        m28896L2(m28893E2().f20594p, this.f20576f.getZip());
        m28896L2(m28893E2().f20595q, this.f20576f.getCity());
        m28896L2(m28893E2().f20596r, this.f20576f.getPhone());
        m28896L2(m28893E2().f20597s, this.f20576f.getMobile());
        boolean z4 = true;
        boolean z5 = !this.f20576f.isNameUpdateForbidden();
        boolean z6 = !this.f20576f.isPaymentInfoUpdateForbidden();
        if (m28893E2().f20585g != null) {
            C13574r d = m28893E2().f20585g;
            if (!z5 || !z6) {
                z3 = false;
            } else {
                z3 = true;
            }
            d.mo53247e(z3);
        }
        if (m28893E2().f20589k != null) {
            m28893E2().f20589k.mo53247e(z6);
        }
        C13571o i2 = m28893E2().f20584f;
        if (!z5 || !z6) {
            z = false;
        } else {
            z = true;
        }
        i2.mo53247e(z);
        C13571o n = m28893E2().f20586h;
        if (!z5 || !z6) {
            z2 = false;
        } else {
            z2 = true;
        }
        n.mo53247e(z2);
        C13571o l = m28893E2().f20587i;
        if (!z5 || !z6) {
            z4 = false;
        }
        l.mo53247e(z4);
        m28893E2().f20588j.mo53247e(z6);
        m28893E2().f20590l.mo53247e(z6);
        m28893E2().f20591m.mo53247e(z6);
        m28893E2().f20592n.mo53247e(z6);
        m28893E2().f20593o.mo53247e(z6);
        m28893E2().f20594p.mo53247e(z6);
        m28893E2().f20595q.mo53247e(z6);
        m28893E2().f20596r.mo53247e(z6);
        m28893E2().f20597s.mo53247e(z6);
        m28893E2().f20598t.mo53248h(z6);
        m28898N2();
    }

    @NonNull
    /* renamed from: E2 */
    private C12870a m28893E2() {
        return (C12870a) this.f16656c;
    }

    /* renamed from: G2 */
    private void m28894G2() {
        m28893E2().f20583e.mo53230g(C13573q.INVISIBLE);
        m28895J2();
        ProxyBundleInput proxyBundleInput = new ProxyBundleInput(mo45820l2(), ProxyMethodsPLPUser.PLP_USER_GET_DETAILS, ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_ONLY, ProxyBundleInput.ProxyNetworkOption.ADD_IN_CACHE, mo45821m2());
        proxyBundleInput.addParamValue(PLPMethodParameters.FULL, Boolean.TRUE);
        proxyBundleInput.executeProxyAction(this);
    }

    /* renamed from: J2 */
    private void m28895J2() {
        AndroidOsHandler androidOsHandler = this.f20581k;
        if (androidOsHandler != null) {
            androidOsHandler.mo47874i(0);
        }
        AndroidOsHandler androidOsHandler2 = new AndroidOsHandler((C12822d) new C12865b0(this));
        this.f20581k = androidOsHandler2;
        androidOsHandler2.mo47875j(0, 500);
    }

    /* renamed from: L2 */
    private void m28896L2(C13571o oVar, String str) {
        if (TextUtils.isEmpty(oVar.mo53233k())) {
            oVar.mo53237o(str);
        }
    }

    /* renamed from: M2 */
    private void m28897M2(ProxyBundleInput proxyBundleInput, boolean z, IListener<Void> iListener) {
        ProxyBundleInput proxyBundleInput2 = proxyBundleInput;
        m28895J2();
        PLPUser pLPUser = r1;
        PLPUser pLPUser2 = new PLPUser(this.f20576f, this.f20577g, (String) proxyBundleInput2.getParamValue(PLPMethodParameters.LAST_NAME), (String) proxyBundleInput2.getParamValue(PLPMethodParameters.FIRST_NAME), this.f20578h, (String) proxyBundleInput2.getParamValue(PLPMethodParameters.IBAN), (String) proxyBundleInput2.getParamValue(PLPMethodParameters.BIC), (String) proxyBundleInput2.getParamValue(PLPMethodParameters.EMAIL_PAYPAL), (String) proxyBundleInput2.getParamValue(PLPMethodParameters.ADDRESS), (String) proxyBundleInput2.getParamValue(PLPMethodParameters.ZIP), (String) proxyBundleInput2.getParamValue(PLPMethodParameters.CITY), (String) proxyBundleInput2.getParamValue(PLPMethodParameters.PHONE), (String) proxyBundleInput2.getParamValue(PLPMethodParameters.MOBILE), z);
        CacheBundleInputAdd cacheBundleInputAdd = new CacheBundleInputAdd(mo45820l2(), CacheMethodsPLPUser.GET_DETAILS, CacheBundleInputAdd.AddOption.REPLACE_IF_EXISTING);
        cacheBundleInputAdd.addObjectToStore(PLPMethodReturns.PLP_USER_DETAIL, pLPUser);
        cacheBundleInputAdd.getMethodType().getCache(mo45820l2()).executeCacheActionAdd(new C12867c0(this, iListener), cacheBundleInputAdd);
    }

    /* renamed from: N2 */
    private void m28898N2() {
        boolean z;
        boolean z2;
        Country country = this.f20578h;
        if (country != null) {
            Set<PaymentMethod> paymentMethods = country.getPaymentMethods();
            z = paymentMethods.contains(PaymentMethod.IBAN);
            z2 = paymentMethods.contains(PaymentMethod.PAYPAL);
        } else {
            z = true;
            z2 = true;
        }
        m28893E2().f20590l.mo53248h(z);
        m28893E2().f20591m.mo53248h(z);
        m28893E2().f20592n.mo53248h(z2);
    }

    /* renamed from: c */
    private void m28899c(String str) {
        if (!TextUtils.isEmpty(str)) {
            m28908t2().mo46251c(str);
        }
    }

    /* renamed from: g */
    private void m28900g() {
        AndroidOsHandler androidOsHandler = this.f20581k;
        if (androidOsHandler != null) {
            androidOsHandler.mo47874i(0);
            this.f20581k = null;
        }
        m28908t2().mo46252g();
    }

    /* renamed from: j2 */
    private void m28901j2(C13571o oVar, String str) {
        if (!TextUtils.isEmpty(str)) {
            m28908t2().mo46256j2(oVar, str);
        }
    }

    /* renamed from: q2 */
    private void m28905q2(ProxyBundleInput proxyBundleInput, RMNMethodParam rMNMethodParam, Object obj, Object obj2, Object obj3) {
        if (obj3 != null) {
            if (obj != null) {
                if (obj2.equals(obj)) {
                    return;
                }
            } else if (obj2 != null) {
                if ((obj2 instanceof String) && TextUtils.isEmpty((String) obj2)) {
                    return;
                }
            } else {
                return;
            }
            proxyBundleInput.addParamValue(rMNMethodParam, obj3);
        }
    }

    /* renamed from: r2 */
    private void m28906r2(ProxyBundleInput proxyBundleInput, RMNMethodParam rMNMethodParam, String str, C13571o oVar) {
        m28907s2(proxyBundleInput, rMNMethodParam, str, oVar, oVar.mo53233k());
    }

    /* renamed from: s2 */
    private void m28907s2(ProxyBundleInput proxyBundleInput, RMNMethodParam rMNMethodParam, String str, C13571o oVar, String str2) {
        if (oVar.mo53245c()) {
            m28905q2(proxyBundleInput, rMNMethodParam, str, oVar.mo53233k(), str2);
        }
    }

    @NonNull
    /* renamed from: t2 */
    private C12874e0 m28908t2() {
        return (C12874e0) this.f16655b;
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public /* synthetic */ void m28909u2(Void voidR) {
        m28908t2().mo46255j0();
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public /* synthetic */ boolean m28910v2(AndroidOsMessage androidOsMessage) {
        m28908t2().mo46253h();
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: w2 */
    public /* synthetic */ void m28911w2(IListener iListener, CacheBundleInputAdd cacheBundleInputAdd, CacheBundleOutput.CacheOutputStatus cacheOutputStatus) {
        m28900g();
        iListener.mo40744J0(null);
    }

    /* renamed from: x2 */
    private void m28912x2(JSONObject jSONObject, String str, C13571o oVar) {
        String optString = jSONObject.optString(str);
        if (!TextUtils.isEmpty(optString)) {
            m28901j2(oVar, optString);
        }
    }

    /* renamed from: C2 */
    public void mo50782C2() {
        m28898N2();
    }

    /* renamed from: E */
    public void mo49068E(C13574r rVar) {
        mo50783F2();
    }

    /* renamed from: F2 */
    public void mo50783F2() {
        String str;
        if (!this.f20580j || (str = this.f20579i) == null) {
            m28908t2().mo46254j();
        } else {
            mo50786K2(str);
        }
    }

    /* renamed from: H2 */
    public void mo50784H2(@NonNull Civility civility) {
        this.f20577g = civility;
        m28893E2().f20584f.mo53237o(civility.getCapitalizedCivility());
    }

    /* renamed from: I2 */
    public void mo50785I2(@Nullable Country country) {
        this.f20578h = country;
        if (country == null) {
            m28893E2().f20588j.mo53237o("");
        } else {
            m28893E2().f20588j.mo53237o(country.getLabel());
        }
        m28898N2();
    }

    /* renamed from: K2 */
    public void mo50786K2(@NonNull String str) {
        Object obj;
        String str2;
        if (this.f20576f != null && !this.f20575e && !TextUtils.isEmpty(str)) {
            this.f20579i = str;
            m28908t2().mo46253h();
            this.f20575e = true;
            this.f20574d.cancelAndRemoveAllActions();
            ProxyBundleInput proxyBundleInput = new ProxyBundleInput(mo45820l2(), ProxyMethodsPLPUser.UPDATE_PAYMENT_INFO, ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_ONLY, ProxyBundleInput.ProxyNetworkOption.NO_CACHE, mo45821m2());
            RMNMethodParam rMNMethodParam = PLPMethodParameters.CIVILITY;
            Civility civility = this.f20576f.getCivility();
            Civility civility2 = this.f20577g;
            if (civility2 == null) {
                obj = null;
            } else {
                obj = civility2.getJSONValue();
            }
            m28905q2(proxyBundleInput, rMNMethodParam, civility, civility2, obj);
            m28906r2(proxyBundleInput, PLPMethodParameters.LAST_NAME, this.f20576f.getLastName(), m28893E2().f20586h);
            m28906r2(proxyBundleInput, PLPMethodParameters.FIRST_NAME, this.f20576f.getFirstName(), m28893E2().f20587i);
            RMNMethodParam rMNMethodParam2 = PLPMethodParameters.COUNTRY_CODE;
            Country country = this.f20576f.getCountry();
            Country country2 = this.f20578h;
            if (country2 == null) {
                str2 = null;
            } else {
                str2 = country2.getCode();
            }
            ProxyBundleInput proxyBundleInput2 = proxyBundleInput;
            m28905q2(proxyBundleInput2, rMNMethodParam2, country, country2, str2);
            m28907s2(proxyBundleInput2, PLPMethodParameters.IBAN, this.f20576f.getIBAN(), m28893E2().f20590l, m28893E2().f20590l.mo53233k().replaceAll("\\s", "").toUpperCase());
            m28907s2(proxyBundleInput2, PLPMethodParameters.BIC, this.f20576f.getBIC(), m28893E2().f20591m, m28893E2().f20591m.mo53233k().replaceAll("\\s", "").toUpperCase());
            m28907s2(proxyBundleInput2, PLPMethodParameters.EMAIL_PAYPAL, this.f20576f.getEmailPaypal(), m28893E2().f20592n, m28893E2().f20592n.mo53233k().toLowerCase());
            m28906r2(proxyBundleInput, PLPMethodParameters.ADDRESS, this.f20576f.getAddress(), m28893E2().f20593o);
            m28906r2(proxyBundleInput, PLPMethodParameters.ZIP, this.f20576f.getZip(), m28893E2().f20594p);
            m28906r2(proxyBundleInput, PLPMethodParameters.CITY, this.f20576f.getCity(), m28893E2().f20595q);
            m28906r2(proxyBundleInput, PLPMethodParameters.PHONE, this.f20576f.getPhone(), m28893E2().f20596r);
            m28906r2(proxyBundleInput, PLPMethodParameters.MOBILE, this.f20576f.getMobile(), m28893E2().f20597s);
            proxyBundleInput.addParamValue(PLPMethodParameters.PASSWORD, str);
            this.f20574d.executeProxyAction(this, proxyBundleInput);
        }
    }

    /* renamed from: b */
    public void mo50787b(C13551d dVar) {
        m28908t2().mo46250b(dVar);
    }

    public void onProxyActionExecuted(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
        if (proxyBundleOutput.getStatus() != ProxyBundleOutput.ProxyOutputStatus.REQUEST_CANCELLED) {
            IProxyMethodType proxyMethod = proxyBundleInput.getProxyMethod();
            if (proxyMethod == ProxyMethodsPLPUser.PLP_USER_GET_DETAILS) {
                m28892D2(proxyBundleOutput);
            } else if (proxyMethod == ProxyMethodsPLPUser.UPDATE_PAYMENT_INFO) {
                m28891B2(proxyBundleInput, proxyBundleOutput);
            }
        }
    }

    /* renamed from: y2 */
    public void mo50788y2() {
        m28900g();
        m28894G2();
    }

    /* renamed from: z2 */
    public void mo50789z2() {
        this.f20574d.cancelAndRemoveAllActions();
    }

    /* renamed from: A2 */
    public void mo50781A2() {
    }
}
