package p390md;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.api.p322v2.common.model.BaseMerchant;
import com.rmn.api.p322v2.common.model.PinnedObject;
import com.rmn.api.p322v2.common.pinned_object.PinnedObjectsManager;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.general.methodparam.RMNMethodParam;
import com.rmn.api.p322v2.main.general.methodreturn.RMNMethodReturnType;
import com.rmn.api.p322v2.main.proxy.IProxyMethodType;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleWrapper;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.p324ui.views.listview.C11654c;
import com.rmn.p324ui.views.listview.C11659h;
import com.rmn.utils_common.IListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p305ad.C10861a;
import p311bd.C10930a;
import p402od.C13061a;
import p445vc.C13618g;
import p457xc.C13771a;

/* renamed from: md.a */
/* compiled from: BaseMerchantFavoritesGridController */
public abstract class C12931a extends C13061a implements IListener<ProxyBundleWrapper> {

    /* renamed from: f */
    protected List<Object> f20708f = new ArrayList();

    /* renamed from: g */
    protected Set<BaseMerchant> f20709g = new HashSet();

    /* renamed from: h */
    private boolean f20710h;

    /* renamed from: i */
    private boolean f20711i;

    /* renamed from: md.a$a */
    /* compiled from: BaseMerchantFavoritesGridController */
    class C12932a implements C11659h {
        C12932a() {
        }

        /* renamed from: a */
        public boolean mo47905a(int i) {
            return false;
        }

        /* renamed from: b */
        public boolean mo47906b() {
            List<PinnedObject> S2 = C12931a.this.mo50847S2();
            if (S2.isEmpty()) {
                C12931a.this.f20708f.clear();
                C12931a.this.mo45811n2().mo45951I2();
                C12931a.this.mo45811n2().mo45950G2(C12931a.this.mo50964F2());
                C12931a.this.mo45811n2().mo45970r2(0);
                return true;
            }
            ArrayList arrayList = new ArrayList(S2.size());
            for (PinnedObject pinnedModel : S2) {
                BaseMerchant baseMerchant = (BaseMerchant) pinnedModel.getPinnedModel();
                if (baseMerchant != null) {
                    arrayList.add(baseMerchant);
                }
            }
            C12931a.this.mo45811n2().mo45951I2();
            C12931a.this.mo45811n2().mo45964l2(arrayList, 0);
            C12931a aVar = C12931a.this;
            aVar.f20708f = arrayList;
            aVar.mo50961A2();
            return true;
        }
    }

    /* renamed from: md.a$b */
    /* compiled from: BaseMerchantFavoritesGridController */
    public static class C12933b extends C10861a.C10862a {
        @NonNull

        /* renamed from: f */
        public final C13771a<BaseMerchant> f20713f;

        public C12933b(@NonNull ContextContainer contextContainer, @NonNull LogoutListener logoutListener, C10930a aVar, C11654c cVar, @NonNull C13771a<BaseMerchant> aVar2) {
            super(contextContainer, logoutListener, aVar, cVar);
            this.f20713f = aVar2;
        }
    }

    public C12931a(@NonNull C12934b bVar, @NonNull C12933b bVar2) {
        super(bVar, bVar2);
    }

    @NonNull
    /* renamed from: R2 */
    private C12934b m29189R2() {
        return (C12934b) mo50962B2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D2 */
    public void mo50841D2(ProxyBundleInput.ProxySourcesOption proxySourcesOption, int i, int i2) {
        this.f20711i = true;
        mo50854Z2();
        mo50848T2().retrievePinnedObjects(this, proxySourcesOption, mo45821m2());
    }

    /* access modifiers changed from: protected */
    /* renamed from: E2 */
    public RMNMethodReturnType mo50842E2() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G2 */
    public RMNMethodParam mo50843G2() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H2 */
    public RMNMethodReturnType mo50844H2() {
        return null;
    }

    /* renamed from: M0 */
    public void mo47901M0(C10930a aVar, int i) {
        mo50841D2(ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_THEN_CLEAR_CACHE, 0, 0);
    }

    /* renamed from: N0 */
    public void mo47902N0(C10930a aVar, Object obj) {
        if (!this.f20710h || !(obj instanceof BaseMerchant)) {
            super.mo47902N0(aVar, obj);
            return;
        }
        this.f20709g.add((BaseMerchant) obj);
        mo45811n2().mo45954L2(obj);
    }

    /* renamed from: P2 */
    public void mo50845P2() {
        if (this.f20710h) {
            this.f20710h = false;
            mo50854Z2();
            mo45811n2().mo45959Q2(true);
            m29189R2().mo50857G0();
            mo50852X2().f20713f.mo53435j(false);
            if (this.f20709g.size() > 0) {
                mo45811n2().mo45951I2();
                mo45811n2().mo45964l2(this.f20708f, 0);
                this.f20709g.clear();
            }
            mo50854Z2();
        }
    }

    /* renamed from: Q2 */
    public void mo50846Q2() {
        this.f20710h = true;
        mo45811n2().mo45959Q2(false);
        m29189R2().mo50858Z1();
        mo50852X2().f20713f.mo53435j(true);
        mo50854Z2();
        C13618g.f21930b.mo53278b("favorite-merchant", "modify");
    }

    /* access modifiers changed from: protected */
    /* renamed from: S2 */
    public abstract List<PinnedObject> mo50847S2();

    /* access modifiers changed from: protected */
    /* renamed from: T2 */
    public abstract PinnedObjectsManager mo50848T2();

    /* access modifiers changed from: protected */
    /* renamed from: U2 */
    public abstract IProxyMethodType mo50849U2();

    /* renamed from: V2 */
    public boolean mo50850V2() {
        return this.f20711i;
    }

    /* renamed from: W2 */
    public void mo40744J0(@Nullable ProxyBundleWrapper proxyBundleWrapper) {
        if (proxyBundleWrapper != null && proxyBundleWrapper.input.getProxyMethod() == mo50849U2()) {
            this.f20711i = false;
            mo50963C2(proxyBundleWrapper.output, new C12932a());
            mo50854Z2();
        }
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: X2 */
    public C12933b mo50852X2() {
        return (C12933b) this.f16656c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y2 */
    public abstract void mo50853Y2();

    /* renamed from: Z2 */
    public void mo50854Z2() {
        boolean z;
        C12934b R2 = m29189R2();
        if (this.f20711i || this.f20710h || mo45811n2().mo45977y2() <= 0) {
            z = false;
        } else {
            z = true;
        }
        R2.mo50860p0(z);
        m29189R2().mo50859k2(this.f20710h);
    }

    /* renamed from: a */
    public void mo47903a(C10930a aVar, int i, int i2) {
        mo50841D2(ProxyBundleInput.ProxySourcesOption.GET_FROM_CACHE_THEN_NETWORK, 0, 0);
    }

    /* renamed from: a3 */
    public void mo50855a3() {
        this.f20710h = false;
        mo45811n2().mo45959Q2(true);
        m29189R2().mo50857G0();
        mo50852X2().f20713f.mo53435j(false);
        if (this.f20709g.size() > 0) {
            this.f20708f.clear();
            this.f20708f.addAll(mo45811n2().mo45975w2());
            mo50853Y2();
            m29189R2().mo50856E0(this.f20709g);
            this.f20709g.clear();
            if (this.f20708f.size() <= 0) {
                mo45811n2().mo45950G2(mo50964F2());
                mo45811n2().mo45970r2(0);
            }
        }
        mo50854Z2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: t2 */
    public void mo45817t2() {
        mo50845P2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo45819v2() {
        super.mo45819v2();
        mo50854Z2();
        if (!this.f20711i) {
            mo45811n2().mo45956N2();
        }
    }
}
