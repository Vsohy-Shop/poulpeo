package p381lb;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.api.p322v2.main.proxy.IProxyListener;
import com.rmn.api.p322v2.main.proxy.ProxyActionsPool;
import com.rmn.api.p322v2.main.proxy.ProxyBundleInput;
import com.rmn.api.p322v2.main.proxy.ProxyBundleOutput;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodParameters;
import com.rmn.api.p322v2.poulpeo.general.PLPMethodReturns;
import com.rmn.api.p322v2.poulpeo.general.PLPUtil;
import com.rmn.api.p322v2.poulpeo.model.Invoice;
import com.rmn.api.p322v2.poulpeo.model.SupportTicket;
import com.rmn.api.p322v2.poulpeo.model.SupportTicketHistory;
import com.rmn.api.p322v2.poulpeo.model.SupportTicketStatus;
import com.rmn.api.p322v2.poulpeo.proxy.methods.ProxyMethodsSupportTicket;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.iosadapters.android.p323os.AndroidOsHandler;
import com.rmn.iosadapters.android.p323os.AndroidOsMessage;
import com.rmn.p324ui.wrappers.ResourceStringWrapper;
import java.text.DateFormat;
import java.text.NumberFormat;
import p305ad.C10865d;
import p382lc.C12822d;
import p428sd.C13396a;
import p428sd.C13397b;
import p428sd.C13399d;
import p440ud.C13549b;
import p440ud.C13572p;
import p440ud.C13573q;
import p440ud.C13574r;
import p446vd.C13629j;

/* renamed from: lb.c */
/* compiled from: SupportTicketDetailController */
public class C12797c extends C10865d implements IProxyListener, C13574r.C13576b {
    @NonNull

    /* renamed from: d */
    private final ProxyActionsPool f20441d = new ProxyActionsPool();
    @NonNull

    /* renamed from: e */
    private final DateFormat f20442e = C13629j.m31131a("dd MMM yyyy 'à' HH'h'mm");
    @NonNull

    /* renamed from: f */
    private final NumberFormat f20443f;
    @Nullable

    /* renamed from: g */
    private SupportTicket f20444g;
    @Nullable

    /* renamed from: h */
    private AndroidOsHandler f20445h;

    /* renamed from: i */
    private boolean f20446i;

    /* renamed from: lb.c$a */
    /* compiled from: SupportTicketDetailController */
    class C12798a implements C12822d {
        C12798a() {
        }

        /* renamed from: a */
        public boolean mo49078a(AndroidOsMessage androidOsMessage) {
            if (androidOsMessage.mo47876a() != 0) {
                return false;
            }
            C12797c.this.m28661C2().f20465r.mo53230g(C13573q.VISIBLE);
            return false;
        }
    }

    /* renamed from: lb.c$b */
    /* compiled from: SupportTicketDetailController */
    class C12799b implements C13574r.C13576b {

        /* renamed from: b */
        final /* synthetic */ String f20448b;

        /* renamed from: c */
        final /* synthetic */ SupportTicketHistory f20449c;

        C12799b(String str, SupportTicketHistory supportTicketHistory) {
            this.f20448b = str;
            this.f20449c = supportTicketHistory;
        }

        /* renamed from: E */
        public void mo49068E(C13574r rVar) {
            C12797c.this.m28664p2().mo46499T("Le " + this.f20448b, this.f20449c.getEmail(), "poulpeo");
        }
    }

    /* renamed from: lb.c$c */
    /* compiled from: SupportTicketDetailController */
    public static class C12800c extends C10865d.C10866a {
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: d */
        public final C13399d f20451d;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: e */
        public final C13399d f20452e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final int f20453f;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: g */
        public final C13572p f20454g;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: h */
        public final C13572p f20455h;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: i */
        public final C13572p f20456i;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: j */
        public final C13572p f20457j;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: k */
        public final C13572p f20458k;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: l */
        public final C13572p f20459l;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: m */
        public final C13572p f20460m;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: n */
        public final C13572p f20461n;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: o */
        public final C13572p f20462o;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: p */
        public final C13572p f20463p;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: q */
        public final C13572p f20464q;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: r */
        public final C13574r f20465r;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: s */
        public final ResourceStringWrapper f20466s;
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: t */
        public final ResourceStringWrapper f20467t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12800c(@NonNull ContextContainer contextContainer, @NonNull LogoutListener logoutListener, @NonNull C13399d dVar, @NonNull C13399d dVar2, int i, @NonNull C13572p pVar, @NonNull C13572p pVar2, @NonNull C13572p pVar3, @NonNull C13572p pVar4, @NonNull C13572p pVar5, @NonNull C13572p pVar6, @NonNull C13572p pVar7, @NonNull C13572p pVar8, @NonNull C13572p pVar9, @NonNull C13572p pVar10, @NonNull C13572p pVar11, @NonNull C13574r rVar, @NonNull ResourceStringWrapper resourceStringWrapper, @NonNull ResourceStringWrapper resourceStringWrapper2) {
            super(contextContainer, logoutListener);
            this.f20451d = dVar;
            this.f20452e = dVar2;
            this.f20453f = i;
            this.f20454g = pVar;
            this.f20455h = pVar2;
            this.f20456i = pVar3;
            this.f20457j = pVar4;
            this.f20458k = pVar5;
            this.f20459l = pVar6;
            this.f20460m = pVar7;
            this.f20461n = pVar8;
            this.f20462o = pVar9;
            this.f20463p = pVar10;
            this.f20464q = pVar11;
            this.f20465r = rVar;
            this.f20466s = resourceStringWrapper;
            this.f20467t = resourceStringWrapper2;
        }
    }

    public C12797c(@NonNull C12801d dVar, @NonNull C12800c cVar) {
        super(dVar, cVar);
        NumberFormat instance = NumberFormat.getInstance(C13629j.m31133c());
        this.f20443f = instance;
        this.f20446i = false;
        cVar.f20463p.mo53229f(this);
        instance.setMinimumFractionDigits(2);
    }

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: C2 */
    public C12800c m28661C2() {
        return (C12800c) this.f16656c;
    }

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: p2 */
    public C12801d m28664p2() {
        return (C12801d) this.f16655b;
    }

    /* renamed from: q2 */
    private void m28665q2() {
        AndroidOsHandler androidOsHandler = this.f20445h;
        if (androidOsHandler != null) {
            androidOsHandler.mo47874i(0);
        } else {
            this.f20445h = new AndroidOsHandler((C12822d) new C12798a());
        }
        this.f20445h.mo47875j(0, 300);
    }

    /* renamed from: s2 */
    private void m28666s2(SupportTicket supportTicket) {
        String str;
        m28664p2().mo46504x0("Demande [" + supportTicket.getReference() + "]");
        m28661C2().f20454g.mo53241l("[" + supportTicket.getReference() + "]");
        m28661C2().f20455h.mo53241l(supportTicket.getMerchantName());
        m28661C2().f20456i.mo53241l(supportTicket.getType());
        m28661C2().f20457j.mo53241l(this.f20442e.format(supportTicket.getDate()));
        int i = 0;
        for (SupportTicketHistory supportTicketHistory : supportTicket.getHistories()) {
            SupportTicketStatus status = supportTicket.getStatus();
            C13549b a = C12816l.m28750a(SupportTicketStatus.CLOSED, mo45820l2());
            if (i == 0) {
                a = C12816l.m28750a(status, mo45820l2());
            }
            String format = C13629j.m31131a("dd MMM yyyy 'à' HH'h'mm").format(supportTicketHistory.getDate());
            C13574r w = m28664p2().mo46502w(a, format, supportTicketHistory.getTitle());
            w.mo53229f(new C12799b(format, supportTicketHistory));
            m28664p2().mo46501i2(w);
            i++;
        }
        if (supportTicket.getOrderDate() != null) {
            str = this.f20442e.format(supportTicket.getOrderDate());
        } else {
            str = "";
        }
        m28661C2().f20458k.mo53241l(str);
        m28661C2().f20459l.mo53241l(supportTicket.getOrderReference());
        m28661C2().f20460m.mo53241l(m28667t2(supportTicket.getOrderAmount()) + "€");
        m28661C2().f20461n.mo53241l(m28667t2(supportTicket.getOrderCashbackAmount()) + "€");
        m28661C2().f20462o.mo53241l(m28667t2(supportTicket.getOrderCashbackValue()) + "%");
        Invoice[] invoices = supportTicket.getInvoices();
        if (invoices != null && invoices.length > 0) {
            m28661C2().f20463p.mo53230g(C13573q.VISIBLE);
            m28661C2().f20463p.mo53240k(m28661C2().f20467t);
        } else if (supportTicket.getStatus() == SupportTicketStatus.UNVERIFIED || supportTicket.getStatus() == SupportTicketStatus.REMINDER) {
            m28661C2().f20463p.mo53230g(C13573q.VISIBLE);
            m28661C2().f20463p.mo53240k(m28661C2().f20466s);
        } else {
            m28661C2().f20463p.mo53230g(C13573q.GONE);
        }
        m28661C2().f20464q.mo53241l(supportTicket.getComment());
        m28661C2().f20465r.mo53230g(C13573q.GONE);
    }

    /* renamed from: t2 */
    private String m28667t2(double d) {
        if (d != 0.0d) {
            return this.f20443f.format(d);
        }
        return "0";
    }

    /* renamed from: u2 */
    private void m28668u2(ProxyBundleInput.ProxySourcesOption proxySourcesOption) {
        m28665q2();
        m28664p2().mo46503w0();
        ProxyBundleInput proxyBundleInput = new ProxyBundleInput(mo45820l2(), ProxyMethodsSupportTicket.SUPPORT_TICKET_GET_DETAILS, proxySourcesOption, ProxyBundleInput.ProxyNetworkOption.ADD_IN_CACHE, mo45821m2());
        proxyBundleInput.addParamValue(PLPMethodParameters.ID_SUPPORT_TICKET_REQUIRED, Integer.valueOf(m28661C2().f20453f));
        this.f20441d.executeProxyAction(this, proxyBundleInput);
    }

    /* renamed from: v2 */
    private void m28669v2() {
        AndroidOsHandler androidOsHandler = this.f20445h;
        if (androidOsHandler != null) {
            androidOsHandler.mo47874i(0);
            this.f20445h = null;
        }
        m28661C2().f20465r.mo53230g(C13573q.GONE);
    }

    /* renamed from: w2 */
    private void m28670w2(ProxyBundleOutput proxyBundleOutput) {
        String a = m28661C2().f20451d.mo53009a(C13397b.f21459c, (String) null);
        if (proxyBundleOutput.getStatus() != ProxyBundleOutput.ProxyOutputStatus.OK) {
            String a2 = C13396a.m30473a(proxyBundleOutput, m28661C2().f20451d, a);
            if (this.f20444g == null) {
                m28664p2().mo46496I(a2, true);
                return;
            }
            return;
        }
        SupportTicket supportTicket = (SupportTicket) proxyBundleOutput.getResponseObject(PLPMethodReturns.SUPPORT_TICKET_DETAIL);
        if (supportTicket == null) {
            m28664p2().mo46496I(a, true);
        } else if (proxyBundleOutput.isCacheHit() && !supportTicket.isFull()) {
            m28668u2(ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_ONLY);
        } else if (supportTicket.getHistories() == null) {
            m28664p2().mo46496I(a, true);
        } else {
            this.f20444g = supportTicket;
            m28666s2(supportTicket);
        }
    }

    /* renamed from: x2 */
    private void m28671x2(ProxyBundleOutput proxyBundleOutput) {
        String a = m28661C2().f20452e.mo53009a(C13397b.f21459c, (String) null);
        if (proxyBundleOutput.getStatus() != ProxyBundleOutput.ProxyOutputStatus.OK) {
            m28664p2().mo46496I(C13396a.m30473a(proxyBundleOutput, m28661C2().f20452e, a), false);
            return;
        }
        Invoice invoice = (Invoice) proxyBundleOutput.getResponseObject(PLPMethodReturns.GENERIC_ELEMENT_DETAIL);
        if (invoice == null) {
            m28664p2().mo46496I(a, false);
        } else {
            m28664p2().mo46497N(invoice);
        }
    }

    /* renamed from: B2 */
    public void mo50701B2() {
        if (this.f20446i) {
            m28668u2(ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_ONLY);
            this.f20446i = false;
        }
    }

    /* renamed from: E */
    public void mo49068E(C13574r rVar) {
        SupportTicket supportTicket;
        if (rVar == m28661C2().f20463p && (supportTicket = this.f20444g) != null) {
            Invoice[] invoices = supportTicket.getInvoices();
            if (invoices == null || invoices.length <= 0) {
                C12801d p2 = m28664p2();
                p2.mo46500b2(PLPUtil.URL_PLP + "support.htm?a=edit&t=" + m28661C2().f20453f);
                this.f20446i = true;
                return;
            }
            m28664p2().mo46498R1(invoices);
        }
    }

    public void onProxyActionExecuted(ProxyBundleInput proxyBundleInput, ProxyBundleOutput proxyBundleOutput) {
        if (proxyBundleOutput.getStatus() != ProxyBundleOutput.ProxyOutputStatus.REQUEST_CANCELLED) {
            m28669v2();
            if (proxyBundleOutput.getMethodType() == ProxyMethodsSupportTicket.SUPPORT_TICKET_GET_DETAILS) {
                m28670w2(proxyBundleOutput);
            } else if (proxyBundleOutput.getMethodType() == ProxyMethodsSupportTicket.SUPPORT_TICKET_GET_INVOICE) {
                m28671x2(proxyBundleOutput);
            }
        }
    }

    /* renamed from: r2 */
    public void mo50702r2(int i) {
        m28665q2();
        ProxyBundleInput proxyBundleInput = new ProxyBundleInput(mo45820l2(), ProxyMethodsSupportTicket.SUPPORT_TICKET_GET_INVOICE, ProxyBundleInput.ProxySourcesOption.GET_FROM_NETWORK_ONLY, ProxyBundleInput.ProxyNetworkOption.NO_CACHE, mo45821m2());
        proxyBundleInput.addParamValue(PLPMethodParameters.ID_INVOICE_REQUIRED, Integer.valueOf(i));
        this.f20441d.executeProxyAction(this, proxyBundleInput);
    }

    /* renamed from: y2 */
    public void mo50703y2() {
        m28661C2().f20465r.mo53230g(C13573q.VISIBLE);
        m28668u2(ProxyBundleInput.ProxySourcesOption.GET_FROM_CACHE_THEN_NETWORK);
    }

    /* renamed from: z2 */
    public void mo50704z2() {
        this.f20441d.cancelAndRemoveAllActions();
    }

    /* renamed from: A2 */
    public void mo50700A2() {
    }
}
