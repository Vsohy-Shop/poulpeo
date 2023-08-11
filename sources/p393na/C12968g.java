package p393na;

import com.poulpeo.R;
import com.rmn.api.p322v2.poulpeo.model.EarningStatus;
import com.rmn.iosadapters.android.content.ContextContainer;
import p440ud.C13549b;
import p440ud.C13564j;

/* renamed from: na.g */
/* compiled from: EarningStatusUtils */
public class C12968g {

    /* renamed from: na.g$a */
    /* compiled from: EarningStatusUtils */
    static /* synthetic */ class C12969a {

        /* renamed from: a */
        static final /* synthetic */ int[] f20750a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.rmn.api.v2.poulpeo.model.EarningStatus[] r0 = com.rmn.api.p322v2.poulpeo.model.EarningStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20750a = r0
                com.rmn.api.v2.poulpeo.model.EarningStatus r1 = com.rmn.api.p322v2.poulpeo.model.EarningStatus.PENDING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20750a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.rmn.api.v2.poulpeo.model.EarningStatus r1 = com.rmn.api.p322v2.poulpeo.model.EarningStatus.ACCEPTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f20750a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.rmn.api.v2.poulpeo.model.EarningStatus r1 = com.rmn.api.p322v2.poulpeo.model.EarningStatus.REFUSED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p393na.C12968g.C12969a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static C13549b m29292a(EarningStatus earningStatus, ContextContainer contextContainer) {
        int i = C12969a.f20750a[earningStatus.ordinal()];
        if (i == 1) {
            return m29294c(contextContainer);
        }
        if (i == 2) {
            return m29293b(contextContainer);
        }
        if (i == 3) {
            return m29295d(contextContainer);
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    private static C13549b m29293b(ContextContainer contextContainer) {
        return C13549b.m30936a(contextContainer, R.color.earning_status_accepted);
    }

    /* renamed from: c */
    private static C13549b m29294c(ContextContainer contextContainer) {
        return C13549b.m30936a(contextContainer, R.color.earning_status_pending);
    }

    /* renamed from: d */
    private static C13549b m29295d(ContextContainer contextContainer) {
        return C13549b.m30936a(contextContainer, R.color.earning_status_refused);
    }

    /* renamed from: e */
    public static C13564j m29296e(EarningStatus earningStatus) {
        int i = C12969a.f20750a[earningStatus.ordinal()];
        if (i == 1) {
            return m29298g();
        }
        if (i == 2) {
            return m29297f();
        }
        if (i == 3) {
            return m29299h();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    private static C13564j m29297f() {
        return new C13564j(R.drawable.earning_status_accepted);
    }

    /* renamed from: g */
    private static C13564j m29298g() {
        return new C13564j(R.drawable.earning_status_pending);
    }

    /* renamed from: h */
    private static C13564j m29299h() {
        return new C13564j(R.drawable.earning_status_refused);
    }
}
