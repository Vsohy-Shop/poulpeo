package p380la;

import androidx.annotation.NonNull;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.oauth.OAuthAccountManager;
import com.rmn.api.p322v2.main.proxy.IProxyListener;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.api.p322v2.poulpeo.general.PLPApiType;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsPLPUserConsent;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.utils_common.IListener;
import p375kd.C12652a;
import p375kd.C12656b;

/* renamed from: la.e */
/* compiled from: TermsConsentController */
public class C12793e extends C12652a {

    /* renamed from: la.e$a */
    /* compiled from: TermsConsentController */
    class C12794a implements IProxyListener {

        /* renamed from: b */
        final /* synthetic */ IListener f20436b;

        C12794a(IListener iListener) {
            this.f20436b = iListener;
        }

        public void onProxyActionExecuted(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
            Boolean bool;
            Integer num;
            if (proxyBundleOutput.getStatus() == ProxyBundleOutput.ProxyOutputStatus.OK && (bool = (Boolean) proxyBundleOutput.getResponseObject(PLPMethodReturns.LAST_TERMS_ACCEPTED)) != null && !bool.booleanValue() && (num = (Integer) proxyBundleOutput.getResponseObject(PLPMethodReturns.CURRENT_TERMS)) != null) {
                this.f20436b.mo40744J0(num);
            }
        }
    }

    public C12793e(@NonNull C12656b bVar, @NonNull C12652a.C12655c cVar) {
        super(bVar, cVar);
    }

    /* renamed from: u2 */
    public static void m28659u2(@NonNull ContextContainer contextContainer, @NonNull IListener<Integer> iListener) {
        if (OAuthAccountManager.getInstance().isConnectedToAccount(PLPApiType.PLP)) {
            new ProxyBundleInput(contextContainer, ProxyMethodsPLPUserConsent.GET_PAGES_TO_APPROVE, ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_ONLY, ProxyBundleInput.ProxyNetworkOption.NO_CACHE, (LogoutListener) null).executeProxyAction(new C12794a(iListener));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q2 */
    public ProxyBundleInput mo50399q2() {
        ProxyBundleInput proxyBundleInput = new ProxyBundleInput(mo45820l2(), ProxyMethodsPLPUserConsent.APPROVE_PAGES, ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_ONLY, ProxyBundleInput.ProxyNetworkOption.NO_CACHE, (LogoutListener) null);
        proxyBundleInput.addParamValue(PLPMethodParameters.CURRENT_TERMS, Integer.valueOf(mo50400r2()));
        return proxyBundleInput;
    }
}
