package p431ta;

import androidx.annotation.NonNull;
import com.rmn.api.p322v2.common.model.BaseMerchant;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.proxy.IProxyListener;
import com.rmn.api.p322v2.main.proxy.ProxyActionsPool;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleWrapper;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsPLPMerchant;
import com.rmn.api.p322v2.poulpeo.user.PLPPinnedObjectsManager;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.utils_common.IListener;
import p305ad.C10865d;

/* renamed from: ta.e */
/* compiled from: FavoriteMerchantController */
public class C13452e extends C10865d implements IProxyListener {

    /* renamed from: d */
    private final ContextContainer f21566d;

    /* renamed from: e */
    private final PLPPinnedObjectsManager f21567e;
    @NonNull

    /* renamed from: f */
    private final ProxyActionsPool f21568f = new ProxyActionsPool();

    /* renamed from: g */
    private boolean f21569g;

    /* renamed from: h */
    private BaseMerchant f21570h;

    /* renamed from: ta.e$a */
    /* compiled from: FavoriteMerchantController */
    public static class C13453a extends C10865d.C10866a {
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final ContextContainer f21571d;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: e */
        public final String f21572e;

        public C13453a(@NonNull ContextContainer contextContainer, @NonNull String str) {
            super(contextContainer);
            this.f21571d = contextContainer;
            this.f21572e = str;
        }
    }

    public C13452e(@NonNull C13454f fVar, @NonNull C13453a aVar) {
        super(fVar, aVar);
        ContextContainer b = aVar.f21571d;
        this.f21566d = b;
        this.f21567e = PLPPinnedObjectsManager.getInstance(b);
    }

    @NonNull
    /* renamed from: n2 */
    private C13454f m30575n2() {
        return (C13454f) this.f16655b;
    }

    /* renamed from: o2 */
    private void m30576o2(@NonNull String str) {
        ProxyBundleInput proxyBundleInput = new ProxyBundleInput(this.f21566d, ProxyMethodsPLPMerchant.GET_DETAILS, ProxyBundleInput.ProxySourcesOption.GET_FROM_CACHE_THEN_NETWORK, ProxyBundleInput.ProxyNetworkOption.ADD_IN_CACHE, (LogoutListener) null);
        proxyBundleInput.addParamValue(PLPMethodParameters.ID_PLP_MERCHANT_REQUIRED, Integer.valueOf(str));
        this.f21568f.executeProxyAction(this, proxyBundleInput);
    }

    /* renamed from: s2 */
    private void m30577s2(@NonNull ProxyBundleOutput proxyBundleOutput) {
        BaseMerchant baseMerchant = (BaseMerchant) proxyBundleOutput.getResponseObject(PLPMethodReturns.PLP_MERCHANT_DETAIL);
        this.f21570h = baseMerchant;
        this.f21569g = this.f21567e.hasMerchantReminder(baseMerchant);
    }

    @NonNull
    /* renamed from: v2 */
    private C13453a m30578v2() {
        return (C13453a) this.f16656c;
    }

    public void onProxyActionExecuted(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
        if (ProxyBundleOutput.ProxyOutputStatus.OK == proxyBundleOutput.getStatus() && proxyBundleInput.getProxyMethod() == ProxyMethodsPLPMerchant.GET_DETAILS) {
            m30577s2(proxyBundleOutput);
        }
    }

    /* renamed from: p2 */
    public void mo53026p2() {
        if (m30578v2().f21572e.isEmpty()) {
            m30575n2().mo53031O0();
        } else {
            m30576o2(m30578v2().f21572e);
        }
    }

    /* renamed from: r2 */
    public Boolean mo53028r2() {
        if (this.f21569g) {
            this.f21567e.removeMerchantReminder(this.f21570h, (IListener<ProxyBundleWrapper>) null, (LogoutListener) null);
        } else {
            this.f21567e.addMerchantReminder(this.f21570h, (IListener<ProxyBundleWrapper>) null, (LogoutListener) null);
        }
        boolean z = !this.f21569g;
        this.f21569g = z;
        return Boolean.valueOf(z);
    }

    /* renamed from: q2 */
    public void mo53027q2() {
    }

    /* renamed from: t2 */
    public void mo53029t2() {
    }

    /* renamed from: u2 */
    public void mo53030u2() {
    }
}
