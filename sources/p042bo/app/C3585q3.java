package p042bo.app;

import kotlin.jvm.internal.C12775o;
import p126j0.C8273e;

/* renamed from: bo.app.q3 */
public final class C3585q3 extends C3208h5 {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C3585q3(p042bo.app.C3289j5 r4, double r5, java.lang.Double r7, boolean r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x000a
            bo.app.j5$a r4 = p042bo.app.C3289j5.f1947d
            bo.app.j5 r4 = r4.mo29164a()
        L_0x000a:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x0012
            double r5 = p126j0.C8273e.m16437j()
        L_0x0012:
            r0 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0018
            r7 = 0
        L_0x0018:
            r10 = r7
            r5 = r9 & 8
            if (r5 == 0) goto L_0x001e
            r8 = 0
        L_0x001e:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r0
            r9 = r10
            r10 = r2
            r5.<init>(r6, r7, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C3585q3.<init>(bo.app.j5, double, java.lang.Double, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* renamed from: A */
    public final void mo29543A() {
        mo29004a(true);
        mo29003a(Double.valueOf(C8273e.m16437j()));
    }

    /* renamed from: a */
    public void mo29003a(Double d) {
        super.mo29003a(d);
    }

    public String toString() {
        return "\nMutableSession(sessionId=" + mo29006n() + ", startTime=" + mo29010x() + ", endTime=" + mo29009w() + ", isSealed=" + mo29011y() + ", duration=" + mo29008v() + ')';
    }

    /* renamed from: w */
    public Double mo29009w() {
        return super.mo29009w();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3585q3(C3289j5 j5Var, double d, Double d2, boolean z) {
        super(j5Var, d, d2, z);
        C12775o.m28639i(j5Var, "sessionId");
    }
}
