package p381lb;

import com.poulpeo.R;
import com.rmn.api.p322v2.poulpeo.model.SupportTicketStatusFilter;
import com.rmn.p324ui.wrappers.ResourceStringWrapper;

/* renamed from: lb.k */
/* compiled from: SupportTicketStatusFilterUtils */
public class C12814k {

    /* renamed from: lb.k$a */
    /* compiled from: SupportTicketStatusFilterUtils */
    static /* synthetic */ class C12815a {

        /* renamed from: a */
        static final /* synthetic */ int[] f20481a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.rmn.api.v2.poulpeo.model.SupportTicketStatusFilter[] r0 = com.rmn.api.p322v2.poulpeo.model.SupportTicketStatusFilter.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20481a = r0
                com.rmn.api.v2.poulpeo.model.SupportTicketStatusFilter r1 = com.rmn.api.p322v2.poulpeo.model.SupportTicketStatusFilter.ALL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20481a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.rmn.api.v2.poulpeo.model.SupportTicketStatusFilter r1 = com.rmn.api.p322v2.poulpeo.model.SupportTicketStatusFilter.PENDING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f20481a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.rmn.api.v2.poulpeo.model.SupportTicketStatusFilter r1 = com.rmn.api.p322v2.poulpeo.model.SupportTicketStatusFilter.REFUSED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f20481a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.rmn.api.v2.poulpeo.model.SupportTicketStatusFilter r1 = com.rmn.api.p322v2.poulpeo.model.SupportTicketStatusFilter.ACCEPTED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p381lb.C12814k.C12815a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static ResourceStringWrapper m28740a(SupportTicketStatusFilter supportTicketStatusFilter) {
        int i = C12815a.f20481a[supportTicketStatusFilter.ordinal()];
        if (i == 1) {
            return m28742c();
        }
        if (i == 2) {
            return m28743d();
        }
        if (i == 3) {
            return m28744e();
        }
        if (i == 4) {
            return m28741b();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    private static ResourceStringWrapper m28741b() {
        return new ResourceStringWrapper(R.string.support_ticket_list_filter_accepted_header_title);
    }

    /* renamed from: c */
    private static ResourceStringWrapper m28742c() {
        return new ResourceStringWrapper(R.string.support_ticket_list_filter_all_header_title);
    }

    /* renamed from: d */
    private static ResourceStringWrapper m28743d() {
        return new ResourceStringWrapper(R.string.support_ticket_list_filter_pending_header_title);
    }

    /* renamed from: e */
    private static ResourceStringWrapper m28744e() {
        return new ResourceStringWrapper(R.string.support_ticket_list_filter_refused_header_title);
    }

    /* renamed from: f */
    public static ResourceStringWrapper m28745f(SupportTicketStatusFilter supportTicketStatusFilter) {
        int i = C12815a.f20481a[supportTicketStatusFilter.ordinal()];
        if (i == 1) {
            return m28747h();
        }
        if (i == 2) {
            return m28748i();
        }
        if (i == 3) {
            return m28749j();
        }
        if (i == 4) {
            return m28746g();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: g */
    private static ResourceStringWrapper m28746g() {
        return new ResourceStringWrapper(R.string.support_ticket_list_filter_accepted_no_result_title);
    }

    /* renamed from: h */
    private static ResourceStringWrapper m28747h() {
        return new ResourceStringWrapper(R.string.support_ticket_list_filter_all_no_result_title);
    }

    /* renamed from: i */
    private static ResourceStringWrapper m28748i() {
        return new ResourceStringWrapper(R.string.support_ticket_list_filter_pending_no_result_title);
    }

    /* renamed from: j */
    private static ResourceStringWrapper m28749j() {
        return new ResourceStringWrapper(R.string.support_ticket_list_filter_refused_no_result_title);
    }
}
