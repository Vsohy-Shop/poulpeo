package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.f9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
public class C5742f9 {

    /* renamed from: c */
    private static final C5792i8 f6943c = C5792i8.m9400a();

    /* renamed from: a */
    protected volatile C6052y9 f6944a;

    /* renamed from: b */
    private volatile C6018w7 f6945b;

    /* renamed from: a */
    public final int mo34014a() {
        if (this.f6945b != null) {
            return ((C5986u7) this.f6945b).f7413f.length;
        }
        if (this.f6944a != null) {
            return this.f6944a.mo34551b();
        }
        return 0;
    }

    /* renamed from: b */
    public final C6018w7 mo34015b() {
        if (this.f6945b != null) {
            return this.f6945b;
        }
        synchronized (this) {
            if (this.f6945b != null) {
                C6018w7 w7Var = this.f6945b;
                return w7Var;
            }
            if (this.f6944a == null) {
                this.f6945b = C6018w7.f7451c;
            } else {
                this.f6945b = this.f6944a.mo34041d();
            }
            C6018w7 w7Var2 = this.f6945b;
            return w7Var2;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:7|8|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0011 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34016c(com.google.android.gms.internal.measurement.C6052y9 r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.measurement.y9 r0 = r1.f6944a
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r1)
            com.google.android.gms.internal.measurement.y9 r0 = r1.f6944a     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.f6944a = r2     // Catch:{ zzkh -> 0x0011 }
            com.google.android.gms.internal.measurement.w7 r0 = com.google.android.gms.internal.measurement.C6018w7.f7451c     // Catch:{ zzkh -> 0x0011 }
            r1.f6945b = r0     // Catch:{ zzkh -> 0x0011 }
            goto L_0x0017
        L_0x0011:
            r1.f6944a = r2     // Catch:{ all -> 0x001b }
            com.google.android.gms.internal.measurement.w7 r2 = com.google.android.gms.internal.measurement.C6018w7.f7451c     // Catch:{ all -> 0x001b }
            r1.f6945b = r2     // Catch:{ all -> 0x001b }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C5742f9.mo34016c(com.google.android.gms.internal.measurement.y9):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5742f9)) {
            return false;
        }
        C5742f9 f9Var = (C5742f9) obj;
        C6052y9 y9Var = this.f6944a;
        C6052y9 y9Var2 = f9Var.f6944a;
        if (y9Var == null && y9Var2 == null) {
            return mo34015b().equals(f9Var.mo34015b());
        }
        if (y9Var != null && y9Var2 != null) {
            return y9Var.equals(y9Var2);
        }
        if (y9Var != null) {
            f9Var.mo34016c(y9Var.mo34353e());
            return y9Var.equals(f9Var.f6944a);
        }
        mo34016c(y9Var2.mo34353e());
        return this.f6944a.equals(y9Var2);
    }

    public int hashCode() {
        return 1;
    }
}
