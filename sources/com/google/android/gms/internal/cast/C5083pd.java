package com.google.android.gms.internal.cast;

/* renamed from: com.google.android.gms.internal.cast.pd */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public class C5083pd {

    /* renamed from: c */
    private static final C5150tc f5470c = C5150tc.f5541b;

    /* renamed from: a */
    protected volatile C4982je f5471a;

    /* renamed from: b */
    private volatile C4980jc f5472b;

    /* renamed from: a */
    public final int mo32956a() {
        if (this.f5472b != null) {
            return ((C4929gc) this.f5472b).f5234f.length;
        }
        if (this.f5471a != null) {
            return this.f5471a.mo32737l();
        }
        return 0;
    }

    /* renamed from: b */
    public final C4980jc mo32957b() {
        if (this.f5472b != null) {
            return this.f5472b;
        }
        synchronized (this) {
            if (this.f5472b != null) {
                C4980jc jcVar = this.f5472b;
                return jcVar;
            }
            if (this.f5471a == null) {
                this.f5472b = C4980jc.f5269c;
            } else {
                this.f5472b = this.f5471a.mo32850j();
            }
            C4980jc jcVar2 = this.f5472b;
            return jcVar2;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32958c(com.google.android.gms.internal.cast.C4982je r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.cast.je r0 = r1.f5471a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            com.google.android.gms.internal.cast.je r0 = r1.f5471a     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.f5471a = r2     // Catch:{ zzqx -> 0x0011 }
            com.google.android.gms.internal.cast.jc r0 = com.google.android.gms.internal.cast.C4980jc.f5269c     // Catch:{ zzqx -> 0x0011 }
            r1.f5472b = r0     // Catch:{ zzqx -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.f5471a = r2     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.cast.jc r2 = com.google.android.gms.internal.cast.C4980jc.f5269c     // Catch:{ all -> 0x001b }
            r1.f5472b = r2     // Catch:{ all -> 0x001b }
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x0019:
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001b }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.C5083pd.mo32958c(com.google.android.gms.internal.cast.je):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5083pd)) {
            return false;
        }
        C5083pd pdVar = (C5083pd) obj;
        C4982je jeVar = this.f5471a;
        C4982je jeVar2 = pdVar.f5471a;
        if (jeVar == null && jeVar2 == null) {
            return mo32957b().equals(pdVar.mo32957b());
        }
        if (jeVar != null && jeVar2 != null) {
            return jeVar.equals(jeVar2);
        }
        if (jeVar != null) {
            pdVar.mo32958c(jeVar.mo32731a());
            return jeVar.equals(pdVar.f5471a);
        }
        mo32958c(jeVar2.mo32731a());
        return this.f5471a.equals(jeVar2);
    }

    public int hashCode() {
        return 1;
    }
}
