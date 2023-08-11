package p280x9;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.api.p322v2.poulpeo.model.PLPUser;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsPLPUser;
import com.rmn.apiclient.core.data_access.base.call.CallManager;
import com.rmn.apiclient.core.model.IModel;
import com.rmn.apiclient.impl.api.models.submodels.page.BasePageSection;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.utils_common.IListener;
import java.util.List;
import p225s9.C9584b;
import p258v9.C10058c;
import p305ad.C10864c;
import p440ud.C13567m;

/* renamed from: x9.b */
/* compiled from: BannerSectionController */
public class C10599b extends C9584b {
    @Nullable

    /* renamed from: h */
    private PLPUser f16153h;

    /* renamed from: x9.b$a */
    /* compiled from: BannerSectionController */
    static class C10600a extends C9584b.C9585a {
        protected C10600a(@NonNull BasePageSection basePageSection, @Nullable C10058c cVar) {
            super(basePageSection, cVar);
        }
    }

    /* renamed from: x9.b$b */
    /* compiled from: BannerSectionController */
    static class C10601b extends C9584b.C9586b {
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final ContextContainer f16154c;

        protected C10601b(@NonNull ContextContainer contextContainer) {
            super((CallManager) null, (C13567m) null);
            this.f16154c = contextContainer;
        }
    }

    public C10599b(@Nullable C10864c cVar, @NonNull C10601b bVar) {
        super(cVar, bVar);
    }

    @NonNull
    /* renamed from: w2 */
    private C10602c m22541w2() {
        return (C10602c) this.f16655b;
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public /* synthetic */ void m22542x2(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
        this.f16153h = (PLPUser) proxyBundleOutput.getResponseObject(PLPMethodReturns.PLP_USER_DETAIL);
        m22543y2();
    }

    /* renamed from: y2 */
    private void m22543y2() {
        boolean z;
        C10602c w2 = m22541w2();
        PLPUser pLPUser = this.f16153h;
        if (pLPUser == null || !pLPUser.isNewUser()) {
            z = false;
        } else {
            z = true;
        }
        w2.mo45553n0(z);
    }

    @NonNull
    /* renamed from: z2 */
    private C10601b m22544z2() {
        return (C10601b) this.f14271e;
    }

    /* renamed from: n2 */
    public void mo28500n2(@NonNull C9584b.C9585a aVar, @NonNull IListener<List<IModel>> iListener) {
        if (this.f16153h != null) {
            m22543y2();
        } else {
            new ProxyBundleInput(m22544z2().f16154c, ProxyMethodsPLPUser.PLP_USER_GET_DETAILS, ProxyBundleInput.ProxySourcesOption.GET_FROM_CACHE_THEN_NETWORK, ProxyBundleInput.ProxyNetworkOption.ADD_IN_CACHE, (LogoutListener) null).executeProxyAction(new C10598a(this));
        }
    }
}
