package p381lb;

import com.poulpeo.R;
import com.rmn.api.p322v2.poulpeo.model.SupportTicketStatus;
import com.rmn.iosadapters.android.content.ContextContainer;
import p440ud.C13549b;
import p440ud.C13564j;

/* renamed from: lb.l */
/* compiled from: SupportTicketStatusUtils */
public class C12816l {

    /* renamed from: lb.l$a */
    /* compiled from: SupportTicketStatusUtils */
    static /* synthetic */ class C12817a {

        /* renamed from: a */
        static final /* synthetic */ int[] f20482a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.rmn.api.v2.poulpeo.model.SupportTicketStatus[] r0 = com.rmn.api.p322v2.poulpeo.model.SupportTicketStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20482a = r0
                com.rmn.api.v2.poulpeo.model.SupportTicketStatus r1 = com.rmn.api.p322v2.poulpeo.model.SupportTicketStatus.NEW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20482a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.rmn.api.v2.poulpeo.model.SupportTicketStatus r1 = com.rmn.api.p322v2.poulpeo.model.SupportTicketStatus.UNVERIFIED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f20482a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.rmn.api.v2.poulpeo.model.SupportTicketStatus r1 = com.rmn.api.p322v2.poulpeo.model.SupportTicketStatus.PENDING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f20482a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.rmn.api.v2.poulpeo.model.SupportTicketStatus r1 = com.rmn.api.p322v2.poulpeo.model.SupportTicketStatus.ACCEPTED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f20482a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.rmn.api.v2.poulpeo.model.SupportTicketStatus r1 = com.rmn.api.p322v2.poulpeo.model.SupportTicketStatus.CANCELED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f20482a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.rmn.api.v2.poulpeo.model.SupportTicketStatus r1 = com.rmn.api.p322v2.poulpeo.model.SupportTicketStatus.REMINDER     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f20482a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.rmn.api.v2.poulpeo.model.SupportTicketStatus r1 = com.rmn.api.p322v2.poulpeo.model.SupportTicketStatus.CLOSED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p381lb.C12816l.C12817a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static C13549b m28750a(SupportTicketStatus supportTicketStatus, ContextContainer contextContainer) {
        switch (C12817a.f20482a[supportTicketStatus.ordinal()]) {
            case 1:
                return m28754e(contextContainer);
            case 2:
                return m28757h(contextContainer);
            case 3:
                return m28755f(contextContainer);
            case 4:
                return m28751b(contextContainer);
            case 5:
                return m28752c(contextContainer);
            case 6:
                return m28756g(contextContainer);
            case 7:
                return m28753d(contextContainer);
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b */
    private static C13549b m28751b(ContextContainer contextContainer) {
        return C13549b.m30936a(contextContainer, R.color.support_ticket_status_accepted);
    }

    /* renamed from: c */
    private static C13549b m28752c(ContextContainer contextContainer) {
        return C13549b.m30936a(contextContainer, R.color.support_ticket_status_canceled);
    }

    /* renamed from: d */
    private static C13549b m28753d(ContextContainer contextContainer) {
        return C13549b.m30936a(contextContainer, R.color.support_ticket_status_closed);
    }

    /* renamed from: e */
    private static C13549b m28754e(ContextContainer contextContainer) {
        return C13549b.m30936a(contextContainer, R.color.support_ticket_status_new);
    }

    /* renamed from: f */
    private static C13549b m28755f(ContextContainer contextContainer) {
        return C13549b.m30936a(contextContainer, R.color.support_ticket_status_pending);
    }

    /* renamed from: g */
    private static C13549b m28756g(ContextContainer contextContainer) {
        return C13549b.m30936a(contextContainer, R.color.support_ticket_status_reminder);
    }

    /* renamed from: h */
    private static C13549b m28757h(ContextContainer contextContainer) {
        return C13549b.m30936a(contextContainer, R.color.support_ticket_status_unverified);
    }

    /* renamed from: i */
    public static C13564j m28758i(SupportTicketStatus supportTicketStatus) {
        switch (C12817a.f20482a[supportTicketStatus.ordinal()]) {
            case 1:
                return m28762m();
            case 2:
                return m28765p();
            case 3:
                return m28763n();
            case 4:
                return m28759j();
            case 5:
                return m28760k();
            case 6:
                return m28764o();
            case 7:
                return m28761l();
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: j */
    private static C13564j m28759j() {
        return new C13564j(R.drawable.status_validated);
    }

    /* renamed from: k */
    private static C13564j m28760k() {
        return new C13564j(R.drawable.status_cancel);
    }

    /* renamed from: l */
    private static C13564j m28761l() {
        return new C13564j(R.drawable.status_cancel);
    }

    /* renamed from: m */
    private static C13564j m28762m() {
        return new C13564j(R.drawable.status_pending);
    }

    /* renamed from: n */
    private static C13564j m28763n() {
        return new C13564j(R.drawable.status_pending);
    }

    /* renamed from: o */
    private static C13564j m28764o() {
        return new C13564j(R.drawable.status_action_user);
    }

    /* renamed from: p */
    private static C13564j m28765p() {
        return new C13564j(R.drawable.status_action_user);
    }
}
