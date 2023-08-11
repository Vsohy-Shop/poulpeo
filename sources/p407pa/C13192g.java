package p407pa;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.proxy.IProxyListener;
import com.rmn.api.p322v2.main.proxy.IProxyMethodType;
import com.rmn.api.p322v2.main.proxy.ProxyActionsPool;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.api.p322v2.poulpeo.model.PLPUser;
import com.rmn.api.p322v2.poulpeo.model.PLPUserPaylead;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsPLPUser;
import com.rmn.iosadapters.android.content.ContextContainer;
import p305ad.C10865d;

/* renamed from: pa.g */
/* compiled from: InstoreUserController */
public class C13192g extends C10865d implements IProxyListener {
    @NonNull

    /* renamed from: d */
    public final ProxyActionsPool f21004d = new ProxyActionsPool();
    @Nullable

    /* renamed from: e */
    private PLPUserPaylead f21005e;

    /* renamed from: pa.g$a */
    /* compiled from: InstoreUserController */
    public static class C13193a extends C10865d.C10866a {
        public C13193a(@NonNull ContextContainer contextContainer, @NonNull LogoutListener logoutListener) {
            super(contextContainer, logoutListener);
        }
    }

    public C13192g(@NonNull C13194h hVar, @NonNull C13193a aVar) {
        super(hVar, aVar);
    }

    @NonNull
    /* renamed from: n2 */
    private C13194h m29936n2() {
        return (C13194h) this.f16655b;
    }

    /* renamed from: s2 */
    private void m29937s2(@NonNull ProxyBundleInput proxyBundleInput, @NonNull ProxyBundleOutput proxyBundleOutput) {
        if (proxyBundleOutput.getStatus() != ProxyBundleOutput.ProxyOutputStatus.OK) {
            m29938t2((PLPUserPaylead) null);
            return;
        }
        PLPUser pLPUser = (PLPUser) proxyBundleOutput.getResponseObject(PLPMethodReturns.PLP_USER_DETAIL);
        if (pLPUser == null) {
            m29938t2((PLPUserPaylead) null);
        } else {
            m29938t2(pLPUser.getUserPaylead());
        }
    }

    /* renamed from: t2 */
    private void m29938t2(PLPUserPaylead pLPUserPaylead) {
        boolean z;
        this.f21005e = pLPUserPaylead;
        boolean z2 = true;
        if (pLPUserPaylead == null || pLPUserPaylead.getNbSyncAccounts() <= 0) {
            z = false;
        } else {
            z = true;
        }
        if (pLPUserPaylead == null || !pLPUserPaylead.hasScrappingError()) {
            z2 = false;
        }
        m29936n2().mo46318f(z, z2);
    }

    /* renamed from: o2 */
    public void mo52820o2() {
        mo52824u2(false);
    }

    public void onProxyActionExecuted(@NonNull ProxyBundleInput proxyBundleInput, @NonNull ProxyBundleOutput proxyBundleOutput) {
        if (proxyBundleInput.getProxyMethod() == ProxyMethodsPLPUser.PLP_USER_GET_DETAILS) {
            m29937s2(proxyBundleInput, proxyBundleOutput);
        } else {
            m29936n2().onProxyActionExecuted(proxyBundleInput, proxyBundleOutput);
        }
    }

    /* renamed from: p2 */
    public void mo52821p2() {
        this.f21004d.cancelAndRemoveAllActions();
    }

    /* renamed from: u2 */
    public void mo52824u2(boolean z) {
        ProxyBundleInput.ProxySourcesOption proxySourcesOption;
        m29936n2().mo46317e2();
        ProxyActionsPool proxyActionsPool = this.f21004d;
        IProxyMethodType iProxyMethodType = ProxyMethodsPLPUser.PLP_USER_GET_DETAILS;
        proxyActionsPool.cancelAndRemoveAllActionsWithMethod(iProxyMethodType);
        ContextContainer l2 = mo45820l2();
        if (z) {
            proxySourcesOption = ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_THEN_CLEAR_CACHE;
        } else {
            proxySourcesOption = ProxyBundleInput.ProxySourcesOption.GET_FROM_CACHE_THEN_NETWORK;
        }
        this.f21004d.executeProxyAction(this, new ProxyBundleInput(l2, iProxyMethodType, proxySourcesOption, ProxyBundleInput.ProxyNetworkOption.ADD_IN_CACHE, mo45821m2()));
    }

    /* renamed from: q2 */
    public void mo52822q2() {
    }

    /* renamed from: r2 */
    public void mo52823r2() {
    }
}
