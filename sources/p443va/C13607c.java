package p443va;

import androidx.annotation.NonNull;
import com.rmn.api.p322v2.common.model.PinnedObject;
import com.rmn.api.p322v2.main.proxy.IProxyMethodType;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsPLPPinnedObject;
import com.rmn.api.p322v2.poulpeo.user.PLPPinnedObjectsManager;
import com.rmn.p324ui.views.listview.C11659h;
import java.util.ArrayList;
import java.util.List;
import p311bd.C10932b;
import p390md.C12931a;
import p390md.C12934b;
import p432tb.C13478b;
import p445vc.C13616e;
import p445vc.C13617f;
import p445vc.C13618g;

/* renamed from: va.c */
/* compiled from: MerchantFavoritesGridController */
public class C13607c extends C12931a {
    public C13607c(@NonNull C12934b bVar, @NonNull C12931a.C12933b bVar2) {
        super(bVar, bVar2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C2 */
    public void mo50963C2(ProxyBundleOutput proxyBundleOutput, C11659h hVar) {
        C13478b.m30706a(mo45811n2(), proxyBundleOutput, hVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: F2 */
    public C10932b mo50964F2() {
        return C10932b.f16862d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S2 */
    public List<PinnedObject> mo50847S2() {
        return mo50848T2().getMerchantsReminders();
    }

    /* access modifiers changed from: protected */
    /* renamed from: U2 */
    public IProxyMethodType mo50849U2() {
        return ProxyMethodsPLPPinnedObject.PLP_PINNED_OBJECT_GET_LIST;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y2 */
    public void mo50853Y2() {
        mo50848T2().removeMerchantReminders(new ArrayList(this.f20709g), this, mo45821m2());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b3 */
    public PLPPinnedObjectsManager mo50848T2() {
        return PLPPinnedObjectsManager.getInstance(mo45820l2());
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo45819v2() {
        super.mo45819v2();
        C13618g.f21930b.mo53280e(new C13616e("favorite-merchant", C13617f.MERCHANT_LIST));
    }
}
