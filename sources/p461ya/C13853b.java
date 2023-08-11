package p461ya;

import androidx.annotation.NonNull;
import com.rmn.api.p322v2.common.model.BaseMerchant;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.proxy.IProxyListener;
import com.rmn.api.p322v2.main.proxy.IProxyMethodType;
import com.rmn.api.p322v2.main.proxy.ProxyActionsPool;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsHome;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsPLPMerchant;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.iosadapters.android.p323os.AndroidOsHandler;
import com.rmn.iosadapters.android.p323os.AndroidOsMessage;
import com.rmn.p324ui.views.listview.C11654c;
import com.rmn.p324ui.views.listview.C11655d;
import com.rmn.p324ui.views.listview.C11659h;
import java.util.ArrayList;
import p305ad.C10861a;
import p305ad.C10864c;
import p311bd.C10930a;
import p311bd.C10932b;
import p382lc.C12822d;
import p432tb.C13478b;
import p440ud.C13573q;
import p440ud.C13574r;
import p445vc.C13615d;
import p445vc.C13617f;
import p445vc.C13618g;
import p445vc.C13619h;

/* renamed from: ya.b */
/* compiled from: MerchantSearchControllerOld */
public class C13853b extends C10861a implements IProxyListener {

    /* renamed from: f */
    private String f22370f = "";

    /* renamed from: g */
    private String f22371g = "";

    /* renamed from: h */
    private String f22372h;

    /* renamed from: i */
    private AndroidOsHandler f22373i;

    /* renamed from: ya.b$a */
    /* compiled from: MerchantSearchControllerOld */
    class C13854a implements C12822d {
        C13854a() {
        }

        /* renamed from: a */
        public boolean mo49078a(AndroidOsMessage androidOsMessage) {
            C13853b.this.m31848J2();
            return false;
        }
    }

    /* renamed from: ya.b$b */
    /* compiled from: MerchantSearchControllerOld */
    class C13855b implements C11659h {

        /* renamed from: a */
        final /* synthetic */ C10930a f22375a;

        /* renamed from: b */
        final /* synthetic */ ProxyBundleOutput f22376b;

        /* renamed from: c */
        final /* synthetic */ ProxyBundleInput f22377c;

        C13855b(C10930a aVar, ProxyBundleOutput proxyBundleOutput, ProxyBundleInput proxyBundleInput) {
            this.f22375a = aVar;
            this.f22376b = proxyBundleOutput;
            this.f22377c = proxyBundleInput;
        }

        /* renamed from: a */
        public boolean mo47905a(int i) {
            return false;
        }

        /* renamed from: b */
        public boolean mo47906b() {
            BaseMerchant[] baseMerchantArr;
            Integer num = 0;
            if (this.f22375a == null || (baseMerchantArr = (BaseMerchant[]) this.f22376b.getResponseObject(PLPMethodReturns.PLP_MERCHANT_ARRAY)) == null) {
                return false;
            }
            if (baseMerchantArr.length <= 0) {
                this.f22375a.mo45950G2(C10932b.f16862d);
                this.f22375a.mo45970r2(0);
                return true;
            }
            ArrayList arrayList = new ArrayList(baseMerchantArr.length);
            for (BaseMerchant baseMerchant : baseMerchantArr) {
                if (baseMerchant != null) {
                    arrayList.add(baseMerchant);
                }
            }
            Integer num2 = (Integer) this.f22377c.getParamValue(PLPMethodParameters.OFFSET);
            if (num2 == null) {
                num2 = num;
            }
            if (this.f22375a == C13853b.this.m31846H2().f22381h) {
                this.f22375a.mo45964l2(arrayList, 0);
                C13853b.this.mo53177z2(this.f22375a);
            } else {
                Integer num3 = (Integer) this.f22376b.getResponseObject(PLPMethodReturns.TOTAL_COUNT);
                if (num3 != null) {
                    num = num3;
                }
                this.f22375a.mo45965m2(arrayList, num2.intValue(), num.intValue());
            }
            return true;
        }
    }

    /* renamed from: ya.b$c */
    /* compiled from: MerchantSearchControllerOld */
    public static class C13856c extends C10861a.C10862a {
        @NonNull

        /* renamed from: f */
        public final C13574r f22379f;
        @NonNull

        /* renamed from: g */
        public final C13574r f22380g;
        @NonNull

        /* renamed from: h */
        public final C10930a f22381h;

        public C13856c(@NonNull ContextContainer contextContainer, @NonNull LogoutListener logoutListener, @NonNull C13574r rVar, @NonNull C10930a aVar, @NonNull C11654c cVar, @NonNull C13574r rVar2, @NonNull C10930a aVar2) {
            super(contextContainer, logoutListener, aVar, cVar);
            this.f22379f = rVar;
            this.f22380g = rVar2;
            this.f22381h = aVar2;
        }
    }

    public C13853b(@NonNull C10864c cVar, @NonNull C13856c cVar2) {
        super(cVar, cVar2);
        cVar2.f22381h.mo45957O2(this);
        cVar2.f22381h.mo45958P2(m31846H2().f16654e);
    }

    @NonNull
    /* renamed from: A2 */
    private C13852a m31842A2() {
        return (C13852a) this.f16655b;
    }

    /* renamed from: C2 */
    private boolean m31843C2(String str) {
        return !str.matches("( )*");
    }

    /* renamed from: D2 */
    private void m31844D2(ProxyBundleInput.ProxySourcesOption proxySourcesOption) {
        ProxyActionsPool proxyActionsPool = this.f16652e;
        IProxyMethodType iProxyMethodType = ProxyMethodsHome.APP_GET_MERCHANTS_BY_TAG;
        proxyActionsPool.cancelAndRemoveAllActionsWithMethod(iProxyMethodType);
        ProxyBundleInput proxyBundleInput = new ProxyBundleInput(mo45820l2(), iProxyMethodType, proxySourcesOption, ProxyBundleInput.ProxyNetworkOption.ADD_IN_CACHE, mo45821m2());
        proxyBundleInput.addParamValue(PLPMethodParameters.SECTION_TAG, "app_boutiques_populaires");
        this.f16652e.executeProxyAction(this, proxyBundleInput);
    }

    /* renamed from: E2 */
    private void m31845E2(ProxyBundleInput.ProxySourcesOption proxySourcesOption, String str, int i, int i2) {
        ProxyActionsPool proxyActionsPool = this.f16652e;
        IProxyMethodType iProxyMethodType = ProxyMethodsPLPMerchant.SEARCH;
        proxyActionsPool.cancelAndRemoveAllActionsWithMethod(iProxyMethodType);
        ProxyBundleInput proxyBundleInput = new ProxyBundleInput(mo45820l2(), iProxyMethodType, proxySourcesOption, ProxyBundleInput.ProxyNetworkOption.ADD_IN_CACHE, (LogoutListener) null);
        proxyBundleInput.addParamValue(PLPMethodParameters.QUERY_REQUIRED, str);
        proxyBundleInput.addParamValue(PLPMethodParameters.OFFSET, Integer.valueOf(i));
        proxyBundleInput.addParamValue(PLPMethodParameters.LIMIT, Integer.valueOf(i2));
        this.f16652e.executeProxyAction(this, proxyBundleInput);
    }

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: H2 */
    public C13856c m31846H2() {
        return (C13856c) this.f16656c;
    }

    /* renamed from: I2 */
    private void m31847I2(String str) {
        if (!this.f22371g.equals(str)) {
            this.f22371g = str;
            C13618g.f21930b.mo53279c("search-result", "query", str);
            mo53537L2();
            mo45811n2().mo45951I2();
            mo45811n2().mo45956N2();
            m31842A2().mo46401C1(str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public void m31848J2() {
        String str = this.f22372h;
        if (str != null && str.equals(this.f22370f)) {
            AndroidOsHandler androidOsHandler = this.f22373i;
            if (androidOsHandler != null) {
                androidOsHandler.mo47874i(0);
                this.f22373i = null;
            }
            String str2 = this.f22372h;
            this.f22372h = null;
            mo53537L2();
            m31847I2(str2);
        }
    }

    /* renamed from: B2 */
    public String mo53534B2() {
        return this.f22371g;
    }

    /* renamed from: F2 */
    public void mo53535F2(String str) {
        this.f22370f = str;
        if (!m31843C2(str)) {
            mo53170K2();
            this.f22371g = "";
            return;
        }
        AndroidOsHandler androidOsHandler = this.f22373i;
        if (androidOsHandler != null) {
            androidOsHandler.mo47874i(0);
        }
        this.f22372h = str;
        AndroidOsHandler androidOsHandler2 = new AndroidOsHandler((C12822d) new C13854a());
        this.f22373i = androidOsHandler2;
        androidOsHandler2.mo47875j(0, 800);
    }

    /* renamed from: G2 */
    public void mo53536G2(String str) {
        m31842A2().mo46408e();
        if (m31843C2(str)) {
            m31847I2(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: K2 */
    public void mo53170K2() {
        m31846H2().f22380g.mo53230g(C13573q.VISIBLE);
        m31846H2().f22379f.mo53230g(C13573q.GONE);
        m31842A2().mo46400A1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: L2 */
    public void mo53537L2() {
        m31846H2().f22380g.mo53230g(C13573q.GONE);
        m31846H2().f22379f.mo53230g(C13573q.VISIBLE);
        m31842A2().mo46407X1();
    }

    /* renamed from: M0 */
    public void mo47901M0(C10930a aVar, int i) {
        if (aVar == m31846H2().f22381h) {
            m31844D2(ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_THEN_CLEAR_CACHE);
        } else if (aVar == mo45811n2() && this.f22371g.length() > 0) {
            m31845E2(ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_THEN_CLEAR_CACHE, this.f22371g, 0, i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M2 */
    public void mo53171M2(@NonNull BaseMerchant baseMerchant, boolean z) {
        String str;
        C13619h hVar = C13619h.f21932a;
        if (z) {
            str = "search-top-merchant";
        } else {
            str = "search-result";
        }
        hVar.mo53281b(str, "click", baseMerchant);
    }

    /* renamed from: N0 */
    public void mo47902N0(C10930a aVar, Object obj) {
        boolean z;
        if (obj instanceof BaseMerchant) {
            BaseMerchant baseMerchant = (BaseMerchant) obj;
            if (aVar == m31846H2().f22381h) {
                z = true;
            } else {
                z = false;
            }
            mo53171M2(baseMerchant, z);
            m31842A2().mo46373s1(baseMerchant.getMerchantId());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: N2 */
    public void mo53172N2() {
        C13618g.f21930b.mo53280e(new C13615d("search-merchant", C13617f.MERCHANT_LIST));
    }

    /* renamed from: a */
    public void mo47903a(C10930a aVar, int i, int i2) {
        if (aVar == m31846H2().f22381h) {
            m31844D2(ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_THEN_CLEAR_CACHE);
        } else if (this.f22371g.length() > 0) {
            m31845E2(ProxyBundleInput.ProxySourcesOption.GET_FROM_CACHE_THEN_NETWORK, this.f22371g, i, i2);
        }
    }

    public void onProxyActionExecuted(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
        C10930a aVar;
        if (proxyBundleInput.getProxyMethod() == ProxyMethodsPLPMerchant.SEARCH) {
            aVar = mo45811n2();
        } else if (proxyBundleInput.getProxyMethod() == ProxyMethodsHome.APP_GET_MERCHANTS_BY_TAG) {
            aVar = m31846H2().f22381h;
        } else {
            aVar = null;
        }
        C13478b.m30706a(aVar, proxyBundleOutput, new C13855b(aVar, proxyBundleOutput, proxyBundleInput));
    }

    /* access modifiers changed from: protected */
    /* renamed from: p2 */
    public void mo45813p2() {
        m31846H2().f22381h.mo45960R2(true);
        mo53170K2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r2 */
    public void mo45815r2() {
        m31846H2().f22381h.mo45960R2(false);
        this.f16652e.cancelAndRemoveAllActions();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo45819v2() {
        mo53172N2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: z2 */
    public void mo53177z2(@NonNull C10930a aVar) {
        aVar.mo45944A2(new C11655d(), 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t2 */
    public void mo45817t2() {
    }

    /* renamed from: t0 */
    public void mo47904t0(C10930a aVar) {
    }
}
