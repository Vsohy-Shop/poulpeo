package p053ca;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.apiclient.core.data_access.base.call.CallException;
import com.rmn.apiclient.core.data_access.base.call.CallManager;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyOutput;
import com.rmn.apiclient.core.data_access.proxy.strategy.ProxyStrategy;
import com.rmn.apiclient.core.model.IModel;
import com.rmn.apiclient.impl.api.call.APIIncludes;
import com.rmn.apiclient.impl.api.methods.ContainerApi;
import com.rmn.apiclient.impl.api.models.Merchant;
import com.rmn.apiclient.impl.api.models.Offer;
import com.rmn.apiclient.impl.api.models.submodels.page.BasePageSection;
import com.rmn.utils_common.IListener;
import java.util.ArrayList;
import java.util.List;
import p225s9.C9584b;
import p258v9.C10058c;
import p258v9.C10060e;
import p269w9.C10153a;
import p440ud.C13567m;
import p446vd.C13633n;

/* renamed from: ca.f */
/* compiled from: ListSectionController */
public class C4044f extends C9584b {

    /* renamed from: ca.f$a */
    /* compiled from: ListSectionController */
    static class C4045a extends C9584b.C9585a {
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: c */
        public final String f3250c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final boolean f3251d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final int f3252e;

        protected C4045a(@NonNull BasePageSection basePageSection, @NonNull String str, @NonNull C10058c cVar, boolean z, int i) {
            super(basePageSection, cVar);
            this.f3250c = str;
            this.f3251d = z;
            this.f3252e = i;
        }
    }

    /* renamed from: ca.f$b */
    /* compiled from: ListSectionController */
    static class C4046b extends C9584b.C9586b {

        /* renamed from: c */
        public final boolean f3253c;

        /* renamed from: d */
        public final boolean f3254d;

        protected C4046b(@NonNull CallManager callManager, @Nullable C13567m mVar, boolean z, boolean z2) {
            super(callManager, mVar);
            this.f3253c = z;
            this.f3254d = z2;
        }
    }

    public C4044f(@NonNull C10153a aVar, @NonNull C4046b bVar) {
        super(aVar, bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public /* synthetic */ void m4779x2(CallException callException) {
        C13633n.m31150f(this, "ERROR", callException);
        mo44054t2(callException.getHttpCodeIfAny(), false);
    }

    /* access modifiers changed from: private */
    /* renamed from: y2 */
    public /* synthetic */ void m4780y2(C9584b.C9585a aVar, String str, IListener iListener, ProxyOutput proxyOutput) {
        if (!proxyOutput.hasDocument()) {
            C13633n.m31149e(this, "ERROR : NO DOCUMENT");
            mo44054t2(0, true);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (IModel iModel : proxyOutput.getDocument().optModels()) {
            if (((iModel instanceof Merchant) && m4781z2().f3253c) || ((iModel instanceof Offer) && m4781z2().f3254d)) {
                arrayList.add(new C10060e(iModel, ((C4045a) aVar).f3251d));
            }
        }
        if (arrayList.isEmpty()) {
            C13633n.m31163s(this, "INFO: List " + str + " is empty and return no items. The section has been hide.");
            mo44054t2(0, true);
            return;
        }
        iListener.mo40744J0(arrayList);
    }

    @NonNull
    /* renamed from: z2 */
    private C4046b m4781z2() {
        return (C4046b) this.f14271e;
    }

    /* renamed from: n2 */
    public void mo28500n2(@NonNull C9584b.C9585a aVar, @NonNull IListener<List<IModel>> iListener) {
        C4045a aVar2 = (C4045a) aVar;
        String c = aVar2.f3250c;
        int b = aVar2.f3252e;
        mo44053p2().cancel(this.f14272f);
        this.f14272f = ((ContainerApi.GetContainerContent) ((ContainerApi.GetContainerContent) ((ContainerApi.GetContainerContent) new ContainerApi.GetContainerContent(c, ProxyStrategy.getFromCache().orThenCallService().thenAddInCache()).setIncludeWithMerchantParam(APIIncludes.CURRENT_CASHBACK_OBJECT)).setIncludeWithOfferParam("merchant", APIIncludes.CURRENT_CASHBACK_OBJECT)).setLimitParam(b)).call(mo44053p2()).onFailure(new C4042d(this)).onSuccess(new C4043e(this, aVar, c, iListener)).callId;
    }
}
