package p387ma;

import androidx.annotation.NonNull;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.proxy.IProxyListener;
import com.rmn.api.p322v2.main.proxy.IProxyMethodType;
import com.rmn.api.p322v2.main.proxy.ProxyActionsPool;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.api.p322v2.poulpeo.model.Country;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsCountry;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.iosadapters.android.p323os.AndroidOsHandler;
import com.rmn.iosadapters.android.p323os.AndroidOsMessage;
import com.rmn.p324ui.views.listview.C11654c;
import com.rmn.p324ui.views.listview.C11659h;
import java.util.ArrayList;
import p305ad.C10861a;
import p311bd.C10930a;
import p311bd.C10932b;
import p382lc.C12822d;
import p432tb.C13478b;
import p440ud.C13574r;

/* renamed from: ma.i */
/* compiled from: SearchCountryController */
public class C12878i extends C10861a implements IProxyListener {

    /* renamed from: f */
    private String f20604f = "";

    /* renamed from: g */
    private String f20605g = "";

    /* renamed from: h */
    private String f20606h;

    /* renamed from: i */
    private AndroidOsHandler f20607i;

    /* renamed from: ma.i$a */
    /* compiled from: SearchCountryController */
    class C12879a implements C12822d {
        C12879a() {
        }

        /* renamed from: a */
        public boolean mo49078a(AndroidOsMessage androidOsMessage) {
            C12878i.this.m28965I2();
            return false;
        }
    }

    /* renamed from: ma.i$b */
    /* compiled from: SearchCountryController */
    class C12880b implements C11659h {

        /* renamed from: a */
        final /* synthetic */ ProxyBundleOutput f20609a;

        C12880b(ProxyBundleOutput proxyBundleOutput) {
            this.f20609a = proxyBundleOutput;
        }

        /* renamed from: a */
        public boolean mo47905a(int i) {
            return false;
        }

        /* renamed from: b */
        public boolean mo47906b() {
            Country[] countryArr = (Country[]) this.f20609a.getResponseObject(PLPMethodReturns.COUNTRY_ARRAY);
            if (countryArr == null) {
                return false;
            }
            if (countryArr.length <= 0) {
                C12878i.this.mo45811n2().mo45950G2(C10932b.f16862d);
                C12878i.this.mo45811n2().mo45970r2(0);
                return true;
            }
            ArrayList arrayList = new ArrayList(countryArr.length);
            for (Country country : countryArr) {
                if (country != null) {
                    arrayList.add(country);
                }
            }
            C12878i.this.mo45811n2().mo45965m2(arrayList, 0, arrayList.size());
            return true;
        }
    }

    /* renamed from: ma.i$c */
    /* compiled from: SearchCountryController */
    public static class C12881c extends C10861a.C10862a {
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: f */
        public final C13574r f20611f;

        public C12881c(@NonNull ContextContainer contextContainer, @NonNull C10930a aVar, @NonNull C11654c cVar, @NonNull C13574r rVar) {
            super(contextContainer, (LogoutListener) null, aVar, cVar);
            this.f20611f = rVar;
        }
    }

    public C12878i(@NonNull C12882j jVar, @NonNull C12881c cVar) {
        super(jVar, cVar);
    }

    @NonNull
    /* renamed from: B2 */
    private C12882j m28960B2() {
        return (C12882j) this.f16655b;
    }

    /* renamed from: C2 */
    private boolean m28961C2(String str) {
        return !str.matches("( )*");
    }

    /* renamed from: D2 */
    private void m28962D2(ProxyBundleInput.ProxySourcesOption proxySourcesOption, String str) {
        ProxyActionsPool proxyActionsPool = this.f16652e;
        IProxyMethodType iProxyMethodType = ProxyMethodsCountry.SEARCH;
        proxyActionsPool.cancelAndRemoveAllActionsWithMethod(iProxyMethodType);
        ProxyBundleInput proxyBundleInput = new ProxyBundleInput(mo45820l2(), iProxyMethodType, proxySourcesOption, ProxyBundleInput.ProxyNetworkOption.ADD_IN_CACHE, (LogoutListener) null);
        proxyBundleInput.addParamValue(PLPMethodParameters.QUERY_REQUIRED, str);
        this.f16652e.executeProxyAction(this, proxyBundleInput);
    }

    @NonNull
    /* renamed from: G2 */
    private C12881c m28963G2() {
        return (C12881c) this.f16656c;
    }

    /* renamed from: H2 */
    private void m28964H2(String str) {
        if (m28961C2(str) && !this.f20605g.equals(str)) {
            this.f20605g = str;
            m28963G2().f16653d.mo45951I2();
            m28963G2().f16653d.mo45956N2();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public void m28965I2() {
        String str = this.f20606h;
        if (str != null && str.equals(this.f20604f)) {
            AndroidOsHandler androidOsHandler = this.f20607i;
            if (androidOsHandler != null) {
                androidOsHandler.mo47874i(0);
                this.f20607i = null;
            }
            String str2 = this.f20606h;
            this.f20606h = null;
            m28964H2(str2);
        }
    }

    /* renamed from: E2 */
    public void mo50794E2(String str) {
        this.f20604f = str;
        if (!m28961C2(str)) {
            this.f20605g = "";
            return;
        }
        AndroidOsHandler androidOsHandler = this.f20607i;
        if (androidOsHandler != null) {
            androidOsHandler.mo47874i(0);
        }
        this.f20606h = str;
        AndroidOsHandler androidOsHandler2 = new AndroidOsHandler((C12822d) new C12879a());
        this.f20607i = androidOsHandler2;
        androidOsHandler2.mo47875j(0, 800);
    }

    /* renamed from: F2 */
    public void mo50795F2(String str) {
        m28960B2().mo46221e();
        m28964H2(str);
    }

    /* renamed from: M0 */
    public void mo47901M0(C10930a aVar, int i) {
        if (this.f20605g.length() <= 0) {
            m28963G2().f20611f.mo53248h(false);
            return;
        }
        m28963G2().f20611f.mo53248h(true);
        m28962D2(ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_THEN_CLEAR_CACHE, this.f20605g);
    }

    /* renamed from: N0 */
    public void mo47902N0(C10930a aVar, Object obj) {
        m28960B2().mo46219D0((Country) obj);
    }

    /* renamed from: a */
    public void mo47903a(C10930a aVar, int i, int i2) {
        if (this.f20605g.length() <= 0) {
            m28963G2().f20611f.mo53248h(false);
            return;
        }
        m28963G2().f20611f.mo53248h(true);
        m28962D2(ProxyBundleInput.ProxySourcesOption.GET_FROM_CACHE_THEN_NETWORK, this.f20605g);
    }

    public void onProxyActionExecuted(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
        C13478b.m30706a(mo45811n2(), proxyBundleOutput, new C12880b(proxyBundleOutput));
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

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo45819v2() {
    }

    /* renamed from: t0 */
    public void mo47904t0(C10930a aVar) {
    }
}
