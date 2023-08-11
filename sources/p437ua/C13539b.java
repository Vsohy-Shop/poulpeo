package p437ua;

import androidx.annotation.NonNull;
import com.rmn.api.p322v2.common.model.BaseMerchant;
import com.rmn.api.p322v2.common.model.PinnedObject;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.proxy.ProxyBundleWrapper;
import com.rmn.api.p322v2.poulpeo.user.PLPPinnedObjectsManager;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.p324ui.views.listview.C11654c;
import com.rmn.utils_common.IListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p311bd.C10930a;
import p440ud.C13548a;
import p440ud.C13574r;
import p445vc.C13615d;
import p445vc.C13617f;
import p445vc.C13618g;
import p445vc.C13619h;
import p457xc.C13771a;
import p461ya.C13853b;

/* renamed from: ua.b */
/* compiled from: MerchantFavoritesAddController */
public class C13539b extends C13853b {

    /* renamed from: ua.b$a */
    /* compiled from: MerchantFavoritesAddController */
    public static class C13540a extends C13853b.C13856c {
        /* access modifiers changed from: private */

        /* renamed from: i */
        public final boolean f21787i;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: j */
        public final C13771a<BaseMerchant> f21788j;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: k */
        public final C13548a f21789k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13540a(@NonNull ContextContainer contextContainer, @NonNull LogoutListener logoutListener, boolean z, @NonNull C13574r rVar, @NonNull C10930a aVar, @NonNull C11654c cVar, @NonNull C13574r rVar2, @NonNull C10930a aVar2, @NonNull C13771a<BaseMerchant> aVar3, @NonNull C13548a aVar4) {
            super(contextContainer, logoutListener, rVar, aVar, cVar, rVar2, aVar2);
            this.f21787i = z;
            this.f21788j = aVar3;
            this.f21789k = aVar4;
        }
    }

    public C13539b(@NonNull C13541c cVar, @NonNull C13540a aVar) {
        super(cVar, aVar);
    }

    @NonNull
    /* renamed from: O2 */
    private C13541c m30894O2() {
        return (C13541c) this.f16655b;
    }

    @NonNull
    /* renamed from: T2 */
    private C13540a m30895T2() {
        return (C13540a) this.f16656c;
    }

    /* renamed from: U2 */
    private void m30896U2(@NonNull BaseMerchant baseMerchant, boolean z, boolean z2) {
        String str;
        String str2;
        String str3;
        C13619h hVar = C13619h.f21932a;
        StringBuilder sb = new StringBuilder();
        if (m30895T2().f21787i) {
            str = "onboarding-merchant";
        } else {
            str = "favorite-search";
        }
        sb.append(str);
        sb.append("-");
        if (z) {
            str2 = "top-merchant";
        } else {
            str2 = "result";
        }
        sb.append(str2);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        if (z2) {
            str3 = "remove";
        } else {
            str3 = "add";
        }
        sb3.append(str3);
        sb3.append("-favorite");
        hVar.mo53281b(sb2, sb3.toString(), baseMerchant);
    }

    /* renamed from: V2 */
    private void m30897V2() {
        int g = 3 - m30895T2().f21788j.mo53432g();
        boolean z = false;
        if (g < 0) {
            g = 0;
        }
        m30895T2().f21789k.mo53190j(m30894O2().mo46372a0(g));
        C13548a c = m30895T2().f21789k;
        if (g <= 0) {
            z = true;
        }
        c.mo53247e(z);
        m30894O2().mo46362F();
    }

    /* access modifiers changed from: protected */
    /* renamed from: K2 */
    public void mo53170K2() {
        super.mo53170K2();
        m30895T2().f22381h.mo45962T2();
    }

    /* renamed from: N0 */
    public void mo47902N0(C10930a aVar, Object obj) {
        boolean z;
        if (obj instanceof BaseMerchant) {
            m30897V2();
            if (!m30895T2().f21787i) {
                BaseMerchant baseMerchant = (BaseMerchant) obj;
                PLPPinnedObjectsManager instance = PLPPinnedObjectsManager.getInstance(mo45820l2());
                boolean hasMerchantReminder = instance.hasMerchantReminder(baseMerchant);
                if (hasMerchantReminder) {
                    instance.removeMerchantReminder(baseMerchant, (IListener<ProxyBundleWrapper>) null, (LogoutListener) null);
                } else {
                    instance.addMerchantReminder(baseMerchant, (IListener<ProxyBundleWrapper>) null, (LogoutListener) null);
                }
                if (aVar == m30895T2().f22381h) {
                    z = true;
                } else {
                    z = false;
                }
                m30896U2(baseMerchant, z, hasMerchantReminder);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: N2 */
    public void mo53172N2() {
        if (m30895T2().f21787i) {
            C13618g.f21930b.mo53280e(new C13615d("onboarding-merchant", C13617f.ONBOARDING));
        } else {
            C13618g.f21930b.mo53280e(new C13615d("favorite-search", C13617f.MERCHANT_LIST));
        }
    }

    /* renamed from: P2 */
    public int mo53173P2() {
        return 3;
    }

    /* renamed from: Q2 */
    public HashSet<BaseMerchant> mo53174Q2() {
        return m30895T2().f21788j.mo53431f();
    }

    /* renamed from: R2 */
    public ArrayList<Integer> mo53175R2() {
        ArrayList<Integer> arrayList = new ArrayList<>(m30895T2().f21788j.mo53432g());
        Iterator it = m30895T2().f21788j.mo53431f().iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((BaseMerchant) it.next()).getMerchantId()));
        }
        return arrayList;
    }

    /* renamed from: S2 */
    public boolean mo53176S2() {
        if (m30895T2().f21788j.mo53432g() >= 3) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p2 */
    public void mo45813p2() {
        super.mo45813p2();
        for (PinnedObject pinnedMerchant : PLPPinnedObjectsManager.getInstance(mo45820l2()).getMerchantsReminders()) {
            m30895T2().f21788j.mo53427b(pinnedMerchant.getPinnedMerchant());
        }
        m30897V2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: z2 */
    public void mo53177z2(@NonNull C10930a aVar) {
        if (m30895T2().f21787i) {
            super.mo53177z2(aVar);
        }
    }

    /* renamed from: t0 */
    public void mo47904t0(C10930a aVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: M2 */
    public void mo53171M2(@NonNull BaseMerchant baseMerchant, boolean z) {
    }
}
