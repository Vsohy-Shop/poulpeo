package p387ma;

import androidx.annotation.NonNull;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.proxy.IProxyListener;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.api.p322v2.poulpeo.model.PLPUser;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsPLPUser;
import com.rmn.iosadapters.android.content.ContextContainer;
import p305ad.C10864c;
import p305ad.C10865d;
import p440ud.C13573q;
import p440ud.C13574r;

/* renamed from: ma.e */
/* compiled from: ContactInfoController */
public class C12871e extends C10865d {

    /* renamed from: ma.e$a */
    /* compiled from: ContactInfoController */
    class C12872a implements IProxyListener {
        C12872a() {
        }

        public void onProxyActionExecuted(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
            PLPUser pLPUser;
            if (proxyBundleOutput.getStatus() != ProxyBundleOutput.ProxyOutputStatus.OK || (pLPUser = (PLPUser) proxyBundleOutput.getResponseObject(PLPMethodReturns.PLP_USER_DETAIL)) == null) {
                return;
            }
            if (pLPUser.shouldUpdatePaymentInfo()) {
                C12871e.this.m28941s2().f20600d.mo53230g(C13573q.VISIBLE);
            } else {
                C12871e.this.m28941s2().f20600d.mo53230g(C13573q.GONE);
            }
        }
    }

    /* renamed from: ma.e$b */
    /* compiled from: ContactInfoController */
    public static class C12873b extends C10865d.C10866a {
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: d */
        public final C13574r f20600d;

        public C12873b(@NonNull ContextContainer contextContainer, @NonNull C13574r rVar) {
            super(contextContainer);
            this.f20600d = rVar;
        }
    }

    public C12871e(@NonNull C12873b bVar) {
        super((C10864c) null, bVar);
    }

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: s2 */
    public C12873b m28941s2() {
        return (C12873b) this.f16656c;
    }

    /* renamed from: t2 */
    private void m28942t2() {
        new ProxyBundleInput(mo45820l2(), ProxyMethodsPLPUser.PLP_USER_GET_DETAILS, ProxyBundleInput.ProxySourcesOption.GET_FROM_CACHE_ONLY, ProxyBundleInput.ProxyNetworkOption.NO_CACHE, (LogoutListener) null).executeProxyAction(new C12872a());
    }

    /* renamed from: r2 */
    public void mo50793r2() {
        m28941s2().f20600d.mo53230g(C13573q.GONE);
        m28942t2();
    }

    /* renamed from: o2 */
    public void mo50790o2() {
    }

    /* renamed from: p2 */
    public void mo50791p2() {
    }

    /* renamed from: q2 */
    public void mo50792q2() {
    }
}
