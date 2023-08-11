package p041ba;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.api.p322v2.common.model.PinnedObject;
import com.rmn.api.p322v2.poulpeo.user.PLPPinnedObjectsManager;
import com.rmn.apiclient.core.data_access.base.call.BaseCall;
import com.rmn.apiclient.core.data_access.base.call.CallException;
import com.rmn.apiclient.core.data_access.base.call.CallManager;
import com.rmn.apiclient.core.data_access.proxy.call.ProxyOutput;
import com.rmn.apiclient.core.data_access.proxy.strategy.ProxyStrategy;
import com.rmn.apiclient.core.model.IModel;
import com.rmn.apiclient.impl.api.call.APIIncludes;
import com.rmn.apiclient.impl.api.methods.MerchantApi;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.utils_common.IListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p225s9.C9584b;
import p305ad.C10864c;
import p440ud.C13567m;

/* renamed from: ba.c */
/* compiled from: FavoriteSectionController */
public class C2951c extends C9584b {

    /* renamed from: ba.c$a */
    /* compiled from: FavoriteSectionController */
    static class C2952a extends C9584b.C9586b {
        @NonNull

        /* renamed from: c */
        public ContextContainer f1369c;

        protected C2952a(@NonNull CallManager callManager, @NonNull ContextContainer contextContainer, @NonNull C13567m mVar) {
            super(callManager, mVar);
            this.f1369c = contextContainer;
        }
    }

    public C2951c(@Nullable C10864c cVar, @NonNull C2952a aVar) {
        super(cVar, aVar);
    }

    @NonNull
    /* renamed from: A2 */
    private C2952a m2444A2() {
        return (C2952a) this.f14271e;
    }

    /* renamed from: x2 */
    private List<String> m2447x2() {
        ArrayList arrayList = new ArrayList();
        for (PinnedObject next : PLPPinnedObjectsManager.getInstance(m2444A2().f1369c).getMerchantsReminders()) {
            if (arrayList.size() >= 7) {
                break;
            }
            arrayList.add(String.valueOf(next.getModelId()));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: y2 */
    public /* synthetic */ void m2448y2(CallException callException) {
        mo44054t2(callException.getHttpCodeIfAny(), false);
    }

    /* access modifiers changed from: private */
    /* renamed from: z2 */
    public /* synthetic */ void m2449z2(List list, IListener iListener, BaseCall baseCall) {
        if (((ProxyOutput) baseCall.getOutput()).getDocument() == null) {
            mo44054t2(0, true);
            return;
        }
        Collection models = ((ProxyOutput) baseCall.getOutput()).getDocument().getModels();
        if (models.isEmpty()) {
            mo44054t2(0, true);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Iterator it2 = models.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                IModel iModel = (IModel) it2.next();
                if (str.equals(iModel.getId())) {
                    arrayList.add(iModel);
                    break;
                }
            }
        }
        iListener.mo40744J0(arrayList);
    }

    /* renamed from: n2 */
    public void mo28500n2(@Nullable C9584b.C9585a aVar, @NonNull IListener<List<IModel>> iListener) {
        List<String> x2 = m2447x2();
        if (x2.isEmpty()) {
            mo44054t2(0, true);
        } else {
            ((MerchantApi.GetMerchants) new MerchantApi.GetMerchants(x2, ProxyStrategy.getFromCache().orThenCallService().thenAddInCache()).setIncludeWithMerchantParam(APIIncludes.CURRENT_CASHBACK_OBJECT)).call(mo44053p2()).onFailure(new C2949a(this)).onComplete(new C2950b(this, x2, iListener));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q2 */
    public boolean mo28501q2() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s2 */
    public boolean mo28502s2() {
        return false;
    }
}
