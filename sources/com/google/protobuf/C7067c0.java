package com.google.protobuf;

/* renamed from: com.google.protobuf.c0 */
/* compiled from: LazyFieldLite */
public class C7067c0 {

    /* renamed from: e */
    private static final C7139o f9529e = C7139o.m13502b();

    /* renamed from: a */
    private C7086h f9530a;

    /* renamed from: b */
    private C7139o f9531b;

    /* renamed from: c */
    protected volatile C7149p0 f9532c;

    /* renamed from: d */
    private volatile C7086h f9533d;

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r3.f9532c = r4;
        r3.f9533d = com.google.protobuf.C7086h.f9565c;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo40204a(com.google.protobuf.C7149p0 r4) {
        /*
            r3 = this;
            com.google.protobuf.p0 r0 = r3.f9532c
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r3)
            com.google.protobuf.p0 r0 = r3.f9532c     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            return
        L_0x000c:
            com.google.protobuf.h r0 = r3.f9530a     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            if (r0 == 0) goto L_0x0025
            com.google.protobuf.x0 r0 = r4.mo40629i()     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            com.google.protobuf.h r1 = r3.f9530a     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            com.google.protobuf.o r2 = r3.f9531b     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            java.lang.Object r0 = r0.mo40164a(r1, r2)     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            com.google.protobuf.p0 r0 = (com.google.protobuf.C7149p0) r0     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            r3.f9532c = r0     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            com.google.protobuf.h r0 = r3.f9530a     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            r3.f9533d = r0     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            goto L_0x0032
        L_0x0025:
            r3.f9532c = r4     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            com.google.protobuf.h r0 = com.google.protobuf.C7086h.f9565c     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            r3.f9533d = r0     // Catch:{ InvalidProtocolBufferException -> 0x002c }
            goto L_0x0032
        L_0x002c:
            r3.f9532c = r4     // Catch:{ all -> 0x0034 }
            com.google.protobuf.h r4 = com.google.protobuf.C7086h.f9565c     // Catch:{ all -> 0x0034 }
            r3.f9533d = r4     // Catch:{ all -> 0x0034 }
        L_0x0032:
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            return
        L_0x0034:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0034 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7067c0.mo40204a(com.google.protobuf.p0):void");
    }

    /* renamed from: b */
    public int mo40205b() {
        if (this.f9533d != null) {
            return this.f9533d.size();
        }
        C7086h hVar = this.f9530a;
        if (hVar != null) {
            return hVar.size();
        }
        if (this.f9532c != null) {
            return this.f9532c.mo40627f();
        }
        return 0;
    }

    /* renamed from: c */
    public C7149p0 mo40206c(C7149p0 p0Var) {
        mo40204a(p0Var);
        return this.f9532c;
    }

    /* renamed from: d */
    public C7149p0 mo40207d(C7149p0 p0Var) {
        C7149p0 p0Var2 = this.f9532c;
        this.f9530a = null;
        this.f9533d = null;
        this.f9532c = p0Var;
        return p0Var2;
    }

    /* renamed from: e */
    public C7086h mo40208e() {
        if (this.f9533d != null) {
            return this.f9533d;
        }
        C7086h hVar = this.f9530a;
        if (hVar != null) {
            return hVar;
        }
        synchronized (this) {
            if (this.f9533d != null) {
                C7086h hVar2 = this.f9533d;
                return hVar2;
            }
            if (this.f9532c == null) {
                this.f9533d = C7086h.f9565c;
            } else {
                this.f9533d = this.f9532c.mo40150e();
            }
            C7086h hVar3 = this.f9533d;
            return hVar3;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7067c0)) {
            return false;
        }
        C7067c0 c0Var = (C7067c0) obj;
        C7149p0 p0Var = this.f9532c;
        C7149p0 p0Var2 = c0Var.f9532c;
        if (p0Var == null && p0Var2 == null) {
            return mo40208e().equals(c0Var.mo40208e());
        }
        if (p0Var != null && p0Var2 != null) {
            return p0Var.equals(p0Var2);
        }
        if (p0Var != null) {
            return p0Var.equals(c0Var.mo40206c(p0Var.mo40636a()));
        }
        return mo40206c(p0Var2.mo40636a()).equals(p0Var2);
    }

    public int hashCode() {
        return 1;
    }
}
