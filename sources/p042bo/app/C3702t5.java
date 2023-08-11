package p042bo.app;

import kotlin.NoWhenBranchMatchedException;
import p057d0.C7213c;

/* renamed from: bo.app.t5 */
public enum C3702t5 implements C7213c<String> {
    SUBSCRIBED,
    UNSUBSCRIBED;

    /* renamed from: bo.app.t5$a */
    public /* synthetic */ class C3703a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2617a = null;

        static {
            int[] iArr = new int[C3702t5.values().length];
            iArr[C3702t5.SUBSCRIBED.ordinal()] = 1;
            iArr[C3702t5.UNSUBSCRIBED.ordinal()] = 2;
            f2617a = iArr;
        }
    }

    /* renamed from: v */
    public String forJsonPut() {
        int i = C3703a.f2617a[ordinal()];
        if (i == 1) {
            return "subscribed";
        }
        if (i == 2) {
            return "unsubscribed";
        }
        throw new NoWhenBranchMatchedException();
    }
}
