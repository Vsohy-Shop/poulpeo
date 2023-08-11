package p402od;

import androidx.annotation.NonNull;
import com.rmn.api.p322v2.common.model.BaseMerchant;
import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnType;
import com.rmn.api.p322v2.main.proxy.IProxyListener;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.p324ui.views.listview.C11659h;
import java.util.ArrayList;
import p305ad.C10861a;
import p311bd.C10930a;
import p311bd.C10932b;

/* renamed from: od.a */
/* compiled from: BaseMerchantGridControllerOld */
public abstract class C13061a extends C10861a implements IProxyListener {

    /* renamed from: od.a$a */
    /* compiled from: BaseMerchantGridControllerOld */
    class C13062a implements C11659h {

        /* renamed from: a */
        final /* synthetic */ ProxyBundleOutput f20873a;

        /* renamed from: b */
        final /* synthetic */ ProxyBundleInput f20874b;

        C13062a(ProxyBundleOutput proxyBundleOutput, ProxyBundleInput proxyBundleInput) {
            this.f20873a = proxyBundleOutput;
            this.f20874b = proxyBundleInput;
        }

        /* renamed from: a */
        public boolean mo47905a(int i) {
            return false;
        }

        /* renamed from: b */
        public boolean mo47906b() {
            BaseMerchant[] baseMerchantArr = (BaseMerchant[]) this.f20873a.getResponseObject(C13061a.this.mo50842E2());
            if (baseMerchantArr == null) {
                return false;
            }
            if (baseMerchantArr.length <= 0) {
                C13061a.this.mo45811n2().mo45950G2(C13061a.this.mo50964F2());
                C13061a.this.mo45811n2().mo45970r2(0);
                return true;
            }
            ArrayList arrayList = new ArrayList(baseMerchantArr.length);
            for (BaseMerchant baseMerchant : baseMerchantArr) {
                if (baseMerchant != null) {
                    arrayList.add(baseMerchant);
                }
            }
            C13061a.this.mo45811n2().mo45965m2(arrayList, ((Integer) this.f20874b.getParamValue(C13061a.this.mo50843G2())).intValue(), ((Integer) this.f20873a.getResponseObject(C13061a.this.mo50844H2())).intValue());
            C13061a.this.mo50961A2();
            return true;
        }
    }

    public C13061a(@NonNull C13063b bVar, @NonNull C10861a.C10862a aVar) {
        super(bVar, aVar);
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: B2 */
    public C13063b mo50962B2() {
        return (C13063b) this.f16655b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C2 */
    public abstract void mo50963C2(ProxyBundleOutput proxyBundleOutput, C11659h hVar);

    /* access modifiers changed from: protected */
    /* renamed from: D2 */
    public abstract void mo50841D2(ProxyBundleInput.ProxySourcesOption proxySourcesOption, int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: E2 */
    public abstract RMNMethodReturnType mo50842E2();

    /* access modifiers changed from: protected */
    /* renamed from: F2 */
    public abstract C10932b mo50964F2();

    /* access modifiers changed from: protected */
    /* renamed from: G2 */
    public abstract RMNMethodParam mo50843G2();

    /* access modifiers changed from: protected */
    /* renamed from: H2 */
    public abstract RMNMethodReturnType mo50844H2();

    /* renamed from: M0 */
    public void mo47901M0(C10930a aVar, int i) {
        mo50841D2(ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_THEN_CLEAR_CACHE, 0, i);
    }

    /* renamed from: N0 */
    public void mo47902N0(C10930a aVar, Object obj) {
        if (obj instanceof BaseMerchant) {
            mo50962B2().mo46396D((BaseMerchant) obj);
        }
    }

    /* renamed from: a */
    public void mo47903a(C10930a aVar, int i, int i2) {
        mo50841D2(ProxyBundleInput.ProxySourcesOption.GET_FROM_CACHE_THEN_NETWORK, i, i2);
    }

    public void onProxyActionExecuted(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
        mo50963C2(proxyBundleOutput, new C13062a(proxyBundleOutput, proxyBundleInput));
    }

    /* access modifiers changed from: protected */
    /* renamed from: A2 */
    public void mo50961A2() {
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
