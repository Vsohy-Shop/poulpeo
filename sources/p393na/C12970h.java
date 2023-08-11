package p393na;

import androidx.annotation.NonNull;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.proxy.IProxyListener;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.api.p322v2.poulpeo.model.Earning;
import com.rmn.api.p322v2.poulpeo.model.EarningAmount;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsPLPUser;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.p324ui.views.listview.C11654c;
import com.rmn.p324ui.views.listview.C11659h;
import java.util.ArrayList;
import p305ad.C10861a;
import p311bd.C10930a;
import p311bd.C10932b;
import p432tb.C13477a;
import p432tb.C13478b;
import p445vc.C13618g;
import p446vd.C13630k;

/* renamed from: na.h */
/* compiled from: EarningsController */
public class C12970h extends C10861a implements IProxyListener {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C12959b f20751f = C12959b.ALL;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f20752g;

    /* renamed from: h */
    private boolean f20753h;

    /* renamed from: na.h$a */
    /* compiled from: EarningsController */
    class C12971a implements C11659h {

        /* renamed from: a */
        final /* synthetic */ ProxyBundleInput f20754a;

        /* renamed from: b */
        final /* synthetic */ ProxyBundleOutput f20755b;

        C12971a(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
            this.f20754a = proxyBundleInput;
            this.f20755b = proxyBundleOutput;
        }

        /* renamed from: a */
        public boolean mo47905a(int i) {
            return false;
        }

        /* renamed from: b */
        public boolean mo47906b() {
            int intValue = ((Integer) this.f20754a.getParamValue(PLPMethodParameters.OFFSET)).intValue();
            int intValue2 = ((Integer) this.f20755b.getResponseObject(PLPMethodReturns.TOTAL_COUNT)).intValue();
            if (intValue <= 0) {
                C12970h.this.mo45811n2().mo53071X2();
            }
            ArrayList arrayList = new ArrayList();
            EarningAmount earningAmount = (EarningAmount) this.f20755b.getResponseObject(PLPMethodReturns.EARNING_AMOUNT_DETAIL);
            if (earningAmount == null) {
                C12970h.this.mo45811n2().mo45950G2(C10932b.f16861c);
                C12970h.this.mo45811n2().mo45970r2(0);
                C12970h.this.f20752g = false;
                return false;
            }
            C12970h.this.m29301B2().mo50877d2(earningAmount, C12970h.this.f20752g);
            C12970h.this.f20752g = false;
            Earning[] earningArr = (Earning[]) this.f20755b.getResponseObject(PLPMethodReturns.EARNING_ARRAY);
            ArrayList arrayList2 = new ArrayList();
            if (earningArr != null) {
                for (Earning earning : earningArr) {
                    if (earning != null) {
                        arrayList2.add(earning);
                    }
                }
            }
            if (intValue <= 0) {
                arrayList.add(earningAmount);
                if (!arrayList2.isEmpty() || C12970h.this.f20751f != C12959b.ALL) {
                    arrayList.add(C12970h.this.f20751f.mo50873c());
                }
            }
            arrayList.addAll(arrayList2);
            if (intValue <= 0 && arrayList2.isEmpty()) {
                arrayList.add(C12970h.this.f20751f.mo50871a());
            }
            C12970h.this.mo45811n2().mo45965m2(arrayList, intValue, intValue2);
            return true;
        }
    }

    /* renamed from: na.h$b */
    /* compiled from: EarningsController */
    public static class C12972b extends C10861a.C10862a {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final boolean f20757f;

        public C12972b(@NonNull ContextContainer contextContainer, @NonNull LogoutListener logoutListener, @NonNull C13477a aVar, @NonNull C11654c cVar, boolean z) {
            super(contextContainer, logoutListener, (C10930a) aVar, cVar);
            this.f20757f = z;
        }
    }

    public C12970h(@NonNull C12973i iVar, @NonNull C12972b bVar) {
        super(iVar, bVar);
        this.f20753h = bVar.f20757f;
    }

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: B2 */
    public C12973i m29301B2() {
        return (C12973i) this.f16655b;
    }

    /* renamed from: C2 */
    private void m29302C2(ProxyBundleInput.ProxySourcesOption proxySourcesOption, int i, int i2) {
        this.f16652e.cancelAndRemoveAllActions();
        ProxyBundleInput proxyBundleInput = new ProxyBundleInput(mo45820l2(), ProxyMethodsPLPUser.PLP_USER_GET_EARNINGS, proxySourcesOption, ProxyBundleInput.ProxyNetworkOption.ADD_IN_CACHE, mo45821m2());
        proxyBundleInput.addParamValue(PLPMethodParameters.OFFSET, Integer.valueOf(i));
        proxyBundleInput.addParamValue(PLPMethodParameters.LIMIT, Integer.valueOf(i2));
        String b = this.f20751f.mo50872b();
        if (b != null) {
            proxyBundleInput.addParamValue(PLPMethodParameters.EARNING_TYPE_FILTER, b);
        }
        this.f16652e.executeProxyAction(this, proxyBundleInput);
    }

    /* renamed from: D2 */
    private void m29303D2(C12959b bVar, boolean z) {
        if (bVar == null) {
            throw new IllegalArgumentException();
        } else if (bVar != this.f20751f || z) {
            this.f20751f = bVar;
            mo45811n2().mo45951I2();
            mo45811n2().mo45948E2();
        }
    }

    /* access modifiers changed from: protected */
    @NonNull
    /* renamed from: E2 */
    public C13477a mo45811n2() {
        return (C13477a) super.mo45811n2();
    }

    /* renamed from: F2 */
    public void mo50875F2(boolean z) {
        this.f20752g = z;
        m29303D2(this.f20751f, true);
    }

    /* renamed from: M0 */
    public void mo47901M0(C10930a aVar, int i) {
        m29302C2(ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_THEN_CLEAR_CACHE, 0, i);
    }

    /* renamed from: N0 */
    public void mo47902N0(C10930a aVar, Object obj) {
        String str;
        boolean z = false;
        if (obj instanceof C12959b) {
            m29303D2((C12959b) obj, false);
        } else if (obj instanceof EarningAmount) {
            EarningAmount earningAmount = (EarningAmount) obj;
            double paymentThreshold = earningAmount.getPaymentThreshold();
            if (earningAmount.getAccepted() >= paymentThreshold) {
                z = true;
            }
            if (z) {
                m29301B2().mo50878g1(C13630k.m31138c("https://www.poulpeo.com/paiements.htm?r=app"));
            } else {
                m29301B2().mo50876B0(paymentThreshold);
            }
            C13618g gVar = C13618g.f21930b;
            if (z) {
                str = "success";
            } else {
                str = "failed";
            }
            gVar.mo53278b("request-payment", str);
        }
    }

    /* renamed from: a */
    public void mo47903a(C10930a aVar, int i, int i2) {
        ProxyBundleInput.ProxySourcesOption proxySourcesOption = ProxyBundleInput.ProxySourcesOption.GET_FROM_CACHE_THEN_NETWORK;
        if (this.f20753h) {
            proxySourcesOption = ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_THEN_CLEAR_CACHE;
            this.f20753h = false;
        }
        m29302C2(proxySourcesOption, i, i2);
    }

    public void onProxyActionExecuted(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
        if (proxyBundleOutput.getStatus() != ProxyBundleOutput.ProxyOutputStatus.OK) {
            this.f20752g = false;
        }
        C13478b.m30706a(mo45811n2(), proxyBundleOutput, new C12971a(proxyBundleInput, proxyBundleOutput));
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
