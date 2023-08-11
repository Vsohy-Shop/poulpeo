package p031b0;

import kotlin.jvm.internal.C12775o;
import p042bo.app.C3042c2;

/* renamed from: b0.a */
public final class C2803a {

    /* renamed from: a */
    private final Exception f1098a;

    /* renamed from: b */
    private final C3042c2 f1099b;

    /* renamed from: c */
    private final String f1100c;

    /* renamed from: d */
    private final Long f1101d;

    /* renamed from: e */
    private final C2804a f1102e;

    /* renamed from: b0.a$a */
    public enum C2804a {
        CONTENT_CARDS_SYNC,
        NEWS_FEED_SYNC,
        OTHER
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0034, code lost:
        if (r2.mo28589x() == true) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2803a(java.lang.Exception r2, p042bo.app.C3042c2 r3) {
        /*
            r1 = this;
            java.lang.String r0 = "originalException"
            kotlin.jvm.internal.C12775o.m28639i(r2, r0)
            java.lang.String r0 = "brazeRequest"
            kotlin.jvm.internal.C12775o.m28639i(r3, r0)
            r1.<init>()
            r1.f1098a = r2
            r1.f1099b = r3
            java.lang.String r2 = r2.getMessage()
            r1.f1100c = r2
            java.lang.Long r2 = r3.mo28701j()
            r1.f1101d = r2
            boolean r2 = r3 instanceof p042bo.app.C3012b0
            if (r2 == 0) goto L_0x0024
            b0.a$a r2 = p031b0.C2803a.C2804a.CONTENT_CARDS_SYNC
            goto L_0x0042
        L_0x0024:
            boolean r2 = r3 instanceof p042bo.app.C3216i0
            if (r2 == 0) goto L_0x0040
            bo.app.a4 r2 = r3.mo28691c()
            if (r2 != 0) goto L_0x002f
            goto L_0x0037
        L_0x002f:
            boolean r2 = r2.mo28589x()
            r3 = 1
            if (r2 != r3) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r3 = 0
        L_0x0038:
            if (r3 == 0) goto L_0x003d
            b0.a$a r2 = p031b0.C2803a.C2804a.NEWS_FEED_SYNC
            goto L_0x0042
        L_0x003d:
            b0.a$a r2 = p031b0.C2803a.C2804a.OTHER
            goto L_0x0042
        L_0x0040:
            b0.a$a r2 = p031b0.C2803a.C2804a.OTHER
        L_0x0042:
            r1.f1102e = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p031b0.C2803a.<init>(java.lang.Exception, bo.app.c2):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2803a)) {
            return false;
        }
        C2803a aVar = (C2803a) obj;
        if (C12775o.m28634d(this.f1098a, aVar.f1098a) && C12775o.m28634d(this.f1099b, aVar.f1099b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f1098a.hashCode() * 31) + this.f1099b.hashCode();
    }

    public String toString() {
        return "BrazeNetworkFailureEvent(originalException=" + this.f1098a + ", brazeRequest=" + this.f1099b + ')';
    }
}
