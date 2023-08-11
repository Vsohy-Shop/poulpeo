package p467za;

import androidx.annotation.NonNull;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.proxy.IProxyListener;
import com.rmn.api.p322v2.main.proxy.ProxyActionsPool;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.api.p322v2.poulpeo.model.PLPUser;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsPLPUser;
import com.rmn.iosadapters.android.content.ContextContainer;
import p305ad.C10864c;
import p305ad.C10865d;
import p440ud.C13574r;

/* renamed from: za.i */
/* compiled from: NotificationAdminController */
public class C14073i extends C10865d implements IProxyListener {
    @NonNull

    /* renamed from: d */
    private final ProxyActionsPool f22993d = new ProxyActionsPool();

    /* renamed from: za.i$a */
    /* compiled from: NotificationAdminController */
    public static class C14074a extends C10865d.C10866a {
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: d */
        public final C13574r f22994d;

        public C14074a(@NonNull ContextContainer contextContainer, @NonNull LogoutListener logoutListener, @NonNull C13574r rVar) {
            super(contextContainer, logoutListener);
            this.f22994d = rVar;
        }
    }

    public C14073i(@NonNull C14074a aVar) {
        super((C10864c) null, aVar);
    }

    @NonNull
    /* renamed from: r2 */
    private C14074a m32644r2() {
        return (C14074a) this.f16656c;
    }

    /* renamed from: s2 */
    private void m32645s2() {
        this.f22993d.cancelAndRemoveAllActions();
        this.f22993d.executeProxyAction(this, new ProxyBundleInput(mo45820l2(), ProxyMethodsPLPUser.PLP_USER_GET_DETAILS, ProxyBundleInput.ProxySourcesOption.GET_FROM_CACHE_ONLY, ProxyBundleInput.ProxyNetworkOption.NO_CACHE, mo45821m2()));
    }

    /* renamed from: n2 */
    public void mo53835n2() {
        m32644r2().f22994d.mo53248h(false);
    }

    /* renamed from: o2 */
    public void mo53836o2() {
        this.f22993d.cancelAndRemoveAllActions();
    }

    public void onProxyActionExecuted(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
        PLPUser pLPUser;
        if (proxyBundleOutput.getStatus() == ProxyBundleOutput.ProxyOutputStatus.OK && (pLPUser = (PLPUser) proxyBundleOutput.getResponseObject(PLPMethodReturns.PLP_USER_DETAIL)) != null && pLPUser.isAdmin()) {
            m32644r2().f22994d.mo53248h(true);
        }
    }

    /* renamed from: q2 */
    public void mo53838q2() {
        m32645s2();
    }

    /* renamed from: p2 */
    public void mo53837p2() {
    }
}
