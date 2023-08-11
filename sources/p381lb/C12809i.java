package p381lb;

import androidx.annotation.NonNull;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.proxy.IProxyListener;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.api.p322v2.poulpeo.model.SupportTicket;
import com.rmn.api.p322v2.poulpeo.model.SupportTicketHelp;
import com.rmn.api.p322v2.poulpeo.model.SupportTicketStatusFilter;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsSupportTicket;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.p324ui.views.listview.C11654c;
import com.rmn.p324ui.views.listview.C11659h;
import com.rmn.p324ui.wrappers.ResourceStringWrapper;
import java.util.ArrayList;
import p009j9.C2036a;
import p009j9.C2038c;
import p305ad.C10861a;
import p311bd.C10930a;
import p432tb.C13478b;
import p440ud.C13556e;
import p440ud.C13573q;
import p440ud.C13574r;
import p445vc.C13616e;
import p445vc.C13617f;
import p445vc.C13618g;

/* renamed from: lb.i */
/* compiled from: SupportTicketListController */
public class C12809i extends C10861a implements IProxyListener {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public SupportTicketStatusFilter f20474f = SupportTicketStatusFilter.ALL;

    /* renamed from: lb.i$a */
    /* compiled from: SupportTicketListController */
    class C12810a implements C13574r.C13576b {
        C12810a() {
        }

        /* renamed from: E */
        public void mo49068E(C13574r rVar) {
            C12809i.this.m28718C2().mo46513C();
        }
    }

    /* renamed from: lb.i$b */
    /* compiled from: SupportTicketListController */
    class C12811b implements C11659h {

        /* renamed from: a */
        final /* synthetic */ ProxyBundleOutput f20476a;

        /* renamed from: b */
        final /* synthetic */ ProxyBundleInput f20477b;

        C12811b(ProxyBundleOutput proxyBundleOutput, ProxyBundleInput proxyBundleInput) {
            this.f20476a = proxyBundleOutput;
            this.f20477b = proxyBundleInput;
        }

        /* renamed from: a */
        public boolean mo47905a(int i) {
            return false;
        }

        /* renamed from: b */
        public boolean mo47906b() {
            boolean z;
            boolean z2;
            SupportTicket[] supportTicketArr = (SupportTicket[]) this.f20476a.getResponseObject(PLPMethodReturns.SUPPORT_TICKET_ARRAY);
            SupportTicketHelp supportTicketHelp = (SupportTicketHelp) this.f20476a.getResponseObject(PLPMethodReturns.SUPPORT_TICKET_HELP);
            if (supportTicketHelp == null || supportTicketHelp.getHelp() == null || supportTicketHelp.getHelp().size() <= 0) {
                C12809i.this.m28720E2().f20479f.mo53230g(C13573q.GONE);
            } else {
                C12809i.this.m28720E2().f20479f.mo53230g(C13573q.VISIBLE);
            }
            if (supportTicketArr == null) {
                return false;
            }
            if (supportTicketArr.length > 0) {
                z = true;
            } else {
                z = false;
            }
            ArrayList arrayList = new ArrayList();
            if (z) {
                for (SupportTicket supportTicket : supportTicketArr) {
                    if (supportTicket != null) {
                        arrayList.add(supportTicket);
                    }
                }
            } else {
                arrayList.add(new C2036a(C12814k.m28745f(C12809i.this.f20474f), C12809i.this.m28720E2().f20480g));
            }
            int intValue = ((Integer) this.f20477b.getParamValue(PLPMethodParameters.OFFSET)).intValue();
            int intValue2 = ((Integer) this.f20476a.getResponseObject(PLPMethodReturns.TOTAL_COUNT)).intValue();
            if (intValue <= 0) {
                if (z || C12809i.this.f20474f != SupportTicketStatusFilter.ALL) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                arrayList.add(0, new C2038c(C12814k.m28740a(C12809i.this.f20474f).mo47912a(C12809i.this.mo45820l2()), z2));
            }
            C12809i.this.mo45811n2().mo45965m2(arrayList, intValue, intValue2);
            return true;
        }
    }

    /* renamed from: lb.i$c */
    /* compiled from: SupportTicketListController */
    public static class C12812c extends C10861a.C10862a {
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: f */
        public final C13556e f20479f;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: g */
        public final ResourceStringWrapper f20480g;

        public C12812c(@NonNull ContextContainer contextContainer, @NonNull LogoutListener logoutListener, @NonNull C10930a aVar, @NonNull C11654c cVar, @NonNull C13556e eVar, @NonNull ResourceStringWrapper resourceStringWrapper) {
            super(contextContainer, logoutListener, aVar, cVar);
            this.f20479f = eVar;
            this.f20480g = resourceStringWrapper;
        }
    }

    public C12809i(@NonNull C12813j jVar, @NonNull C12812c cVar) {
        super(jVar, cVar);
        cVar.f20479f.mo53229f(new C12810a());
        cVar.f20479f.mo53230g(C13573q.GONE);
    }

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: C2 */
    public C12813j m28718C2() {
        return (C12813j) this.f16655b;
    }

    /* renamed from: D2 */
    private void m28719D2(SupportTicketStatusFilter supportTicketStatusFilter) {
        if (supportTicketStatusFilter == null) {
            throw new IllegalArgumentException();
        } else if (supportTicketStatusFilter != this.f20474f) {
            this.f20474f = supportTicketStatusFilter;
            mo45811n2().mo45951I2();
            mo45811n2().mo45948E2();
        }
    }

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: E2 */
    public C12812c m28720E2() {
        return (C12812c) this.f16656c;
    }

    /* renamed from: F2 */
    private void m28721F2(ProxyBundleInput.ProxySourcesOption proxySourcesOption, int i, int i2) {
        this.f16652e.cancelAndRemoveAllActions();
        ProxyBundleInput proxyBundleInput = new ProxyBundleInput(mo45820l2(), ProxyMethodsSupportTicket.SUPPORT_TICKET_GET_LIST, proxySourcesOption, ProxyBundleInput.ProxyNetworkOption.ADD_IN_CACHE, mo45821m2());
        proxyBundleInput.addParamValue(PLPMethodParameters.SUPPORT_TICKET_STATUS_FILTER, this.f20474f.toString());
        proxyBundleInput.addParamValue(PLPMethodParameters.OFFSET, Integer.valueOf(i));
        proxyBundleInput.addParamValue(PLPMethodParameters.LIMIT, Integer.valueOf(i2));
        this.f16652e.executeProxyAction(this, proxyBundleInput);
    }

    /* renamed from: M0 */
    public void mo47901M0(C10930a aVar, int i) {
        m28721F2(ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_THEN_CLEAR_CACHE, 0, i);
    }

    /* renamed from: N0 */
    public void mo47902N0(C10930a aVar, Object obj) {
        if (obj instanceof SupportTicket) {
            m28718C2().mo46514G1((SupportTicket) obj);
        } else if (obj instanceof SupportTicketStatusFilter) {
            m28719D2((SupportTicketStatusFilter) obj);
        }
    }

    /* renamed from: a */
    public void mo47903a(C10930a aVar, int i, int i2) {
        m28721F2(ProxyBundleInput.ProxySourcesOption.GET_FROM_CACHE_THEN_NETWORK, i, i2);
    }

    public void onProxyActionExecuted(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
        C13478b.m30706a(mo45811n2(), proxyBundleOutput, new C12811b(proxyBundleOutput, proxyBundleInput));
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public void mo45819v2() {
        C13618g.f21930b.mo53280e(new C13616e("support", C13617f.PROFILE));
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

    /* renamed from: t0 */
    public void mo47904t0(C10930a aVar) {
    }
}
