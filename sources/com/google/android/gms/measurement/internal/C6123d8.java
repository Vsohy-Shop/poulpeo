package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.C4785c;
import com.google.android.gms.internal.measurement.C5785i1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p201q5.C9257d;
import p231t4.C9713p;
import p242u4.C9882a;
import p275x4.C10393b;

/* renamed from: com.google.android.gms.measurement.internal.d8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C6123d8 extends C6349y3 {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C6112c8 f7723c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C9257d f7724d;

    /* renamed from: e */
    private volatile Boolean f7725e;

    /* renamed from: f */
    private final C6213m f7726f;

    /* renamed from: g */
    private final C6299t8 f7727g;

    /* renamed from: h */
    private final List<Runnable> f7728h = new ArrayList();

    /* renamed from: i */
    private final C6213m f7729i;

    protected C6123d8(C6251p4 p4Var) {
        super(p4Var);
        this.f7727g = new C6299t8(p4Var.mo34922c());
        this.f7723c = new C6112c8(this);
        this.f7726f = new C6221m7(this, p4Var);
        this.f7729i = new C6254p7(this, p4Var);
    }

    @WorkerThread
    /* renamed from: C */
    private final C6289s9 m10530C(boolean z) {
        Pair<String, Long> a;
        this.f7899a.mo34924d();
        C6118d3 B = this.f7899a.mo35180B();
        String str = null;
        if (z) {
            C6206l3 b = this.f7899a.mo34920b();
            if (!(b.f7899a.mo35184F().f8434d == null || (a = b.f7899a.mo35184F().f8434d.mo35393a()) == null || a == C6360z3.f8432x)) {
                String valueOf = String.valueOf(a.second);
                String str2 = (String) a.first;
                StringBuilder sb = new StringBuilder(valueOf.length() + 1 + String.valueOf(str2).length());
                sb.append(valueOf);
                sb.append(":");
                sb.append(str2);
                str = sb.toString();
            }
        }
        return B.mo34808q(str);
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: D */
    public final void m10531D() {
        mo34778h();
        this.f7899a.mo34920b().mo35079v().mo35038b("Processing queued up service tasks", Integer.valueOf(this.f7728h.size()));
        for (Runnable run : this.f7728h) {
            try {
                run.run();
            } catch (RuntimeException e) {
                this.f7899a.mo34920b().mo35075r().mo35038b("Task exception while flushing queue", e);
            }
        }
        this.f7728h.clear();
        this.f7729i.mo35088b();
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: E */
    public final void m10532E() {
        mo34778h();
        this.f7727g.mo35306b();
        C6213m mVar = this.f7726f;
        this.f7899a.mo35211z();
        mVar.mo35090d(C6084a3.f7552K.mo35421a(null).longValue());
    }

    @WorkerThread
    /* renamed from: F */
    private final void m10533F(Runnable runnable) {
        mo34778h();
        if (mo34842z()) {
            runnable.run();
            return;
        }
        int size = this.f7728h.size();
        this.f7899a.mo35211z();
        if (((long) size) >= 1000) {
            this.f7899a.mo34920b().mo35075r().mo35037a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.f7728h.add(runnable);
        this.f7729i.mo35090d(60000);
        mo34822P();
    }

    /* renamed from: G */
    private final boolean m10534G() {
        this.f7899a.mo34924d();
        return true;
    }

    /* renamed from: M */
    static /* bridge */ /* synthetic */ void m10539M(C6123d8 d8Var, ComponentName componentName) {
        d8Var.mo34778h();
        if (d8Var.f7724d != null) {
            d8Var.f7724d = null;
            d8Var.f7899a.mo34920b().mo35079v().mo35038b("Disconnected from device MeasurementService", componentName);
            d8Var.mo34778h();
            d8Var.mo34822P();
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: A */
    public final boolean mo34818A() {
        mo34778h();
        mo35413i();
        if (!mo34819B() || this.f7899a.mo35191N().mo35144o0() >= C6084a3.f7599p0.mo35421a(null).intValue()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x012b  */
    @androidx.annotation.WorkerThread
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo34819B() {
        /*
            r7 = this;
            r7.mo34778h()
            r7.mo35413i()
            java.lang.Boolean r0 = r7.f7725e
            if (r0 != 0) goto L_0x014b
            r7.mo34778h()
            r7.mo35413i()
            com.google.android.gms.measurement.internal.p4 r0 = r7.f7899a
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo35184F()
            r0.mo34778h()
            android.content.SharedPreferences r1 = r0.mo35423o()
            java.lang.String r2 = "use_service"
            boolean r1 = r1.contains(r2)
            r3 = 0
            if (r1 != 0) goto L_0x0028
            r0 = 0
            goto L_0x0034
        L_0x0028:
            android.content.SharedPreferences r0 = r0.mo35423o()
            boolean r0 = r0.getBoolean(r2, r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0034:
            r1 = 1
            if (r0 == 0) goto L_0x003f
            boolean r4 = r0.booleanValue()
            if (r4 == 0) goto L_0x003f
            goto L_0x0145
        L_0x003f:
            com.google.android.gms.measurement.internal.p4 r4 = r7.f7899a
            r4.mo34924d()
            com.google.android.gms.measurement.internal.p4 r4 = r7.f7899a
            com.google.android.gms.measurement.internal.d3 r4 = r4.mo35180B()
            int r4 = r4.mo34806o()
            if (r4 != r1) goto L_0x0053
        L_0x0050:
            r3 = r1
            goto L_0x010d
        L_0x0053:
            com.google.android.gms.measurement.internal.p4 r4 = r7.f7899a
            com.google.android.gms.measurement.internal.l3 r4 = r4.mo34920b()
            com.google.android.gms.measurement.internal.j3 r4 = r4.mo35079v()
            java.lang.String r5 = "Checking service availability"
            r4.mo35037a(r5)
            com.google.android.gms.measurement.internal.p4 r4 = r7.f7899a
            com.google.android.gms.measurement.internal.n9 r4 = r4.mo35191N()
            r5 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r4 = r4.mo35146p0(r5)
            if (r4 == 0) goto L_0x00fc
            if (r4 == r1) goto L_0x00ec
            r5 = 2
            if (r4 == r5) goto L_0x00c6
            r0 = 3
            if (r4 == r0) goto L_0x00b5
            r0 = 9
            if (r4 == r0) goto L_0x00a5
            r0 = 18
            if (r4 == r0) goto L_0x0095
            com.google.android.gms.measurement.internal.p4 r0 = r7.f7899a
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35080w()
            java.lang.String r1 = "Unexpected service status"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.mo35038b(r1, r4)
            goto L_0x00c4
        L_0x0095:
            com.google.android.gms.measurement.internal.p4 r0 = r7.f7899a
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35080w()
            java.lang.String r3 = "Service updating"
            r0.mo35037a(r3)
            goto L_0x0050
        L_0x00a5:
            com.google.android.gms.measurement.internal.p4 r0 = r7.f7899a
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35080w()
            java.lang.String r1 = "Service invalid"
            r0.mo35037a(r1)
            goto L_0x00c4
        L_0x00b5:
            com.google.android.gms.measurement.internal.p4 r0 = r7.f7899a
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35080w()
            java.lang.String r1 = "Service disabled"
            r0.mo35037a(r1)
        L_0x00c4:
            r1 = r3
            goto L_0x010d
        L_0x00c6:
            com.google.android.gms.measurement.internal.p4 r4 = r7.f7899a
            com.google.android.gms.measurement.internal.l3 r4 = r4.mo34920b()
            com.google.android.gms.measurement.internal.j3 r4 = r4.mo35074q()
            java.lang.String r5 = "Service container out of date"
            r4.mo35037a(r5)
            com.google.android.gms.measurement.internal.p4 r4 = r7.f7899a
            com.google.android.gms.measurement.internal.n9 r4 = r4.mo35191N()
            int r4 = r4.mo35144o0()
            r5 = 17443(0x4423, float:2.4443E-41)
            if (r4 >= r5) goto L_0x00e4
            goto L_0x010d
        L_0x00e4:
            if (r0 != 0) goto L_0x00e7
            goto L_0x00e8
        L_0x00e7:
            r1 = r3
        L_0x00e8:
            r6 = r3
            r3 = r1
            r1 = r6
            goto L_0x010d
        L_0x00ec:
            com.google.android.gms.measurement.internal.p4 r0 = r7.f7899a
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35079v()
            java.lang.String r4 = "Service missing"
            r0.mo35037a(r4)
            goto L_0x010d
        L_0x00fc:
            com.google.android.gms.measurement.internal.p4 r0 = r7.f7899a
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35079v()
            java.lang.String r3 = "Service available"
            r0.mo35037a(r3)
            goto L_0x0050
        L_0x010d:
            if (r3 != 0) goto L_0x012b
            com.google.android.gms.measurement.internal.p4 r0 = r7.f7899a
            com.google.android.gms.measurement.internal.g r0 = r0.mo35211z()
            boolean r0 = r0.mo34878G()
            if (r0 == 0) goto L_0x012b
            com.google.android.gms.measurement.internal.p4 r0 = r7.f7899a
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35075r()
            java.lang.String r1 = "No way to upload. Consider using the full version of Analytics"
            r0.mo35037a(r1)
            goto L_0x0144
        L_0x012b:
            if (r1 == 0) goto L_0x0144
            com.google.android.gms.measurement.internal.p4 r0 = r7.f7899a
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo35184F()
            r0.mo34778h()
            android.content.SharedPreferences r0 = r0.mo35423o()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r0.putBoolean(r2, r3)
            r0.apply()
        L_0x0144:
            r1 = r3
        L_0x0145:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r7.f7725e = r0
        L_0x014b:
            java.lang.Boolean r0 = r7.f7725e
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C6123d8.mo34819B():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final Boolean mo34820J() {
        return this.f7725e;
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: O */
    public final void mo34821O() {
        mo34778h();
        mo35413i();
        C6289s9 C = m10530C(true);
        this.f7899a.mo35181C().mo34860r();
        m10533F(new C6188j7(this, C));
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: P */
    public final void mo34822P() {
        mo34778h();
        mo35413i();
        if (!mo34842z()) {
            if (mo34819B()) {
                this.f7723c.mo34798c();
            } else if (!this.f7899a.mo35211z().mo34878G()) {
                this.f7899a.mo34924d();
                List<ResolveInfo> queryIntentServices = this.f7899a.mo34927f().getPackageManager().queryIntentServices(new Intent().setClassName(this.f7899a.mo34927f(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices == null || queryIntentServices.size() <= 0) {
                    this.f7899a.mo34920b().mo35075r().mo35037a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                    return;
                }
                Intent intent = new Intent("com.google.android.gms.measurement.START");
                Context f = this.f7899a.mo34927f();
                this.f7899a.mo34924d();
                intent.setComponent(new ComponentName(f, "com.google.android.gms.measurement.AppMeasurementService"));
                this.f7723c.mo34797b(intent);
            }
        }
    }

    @WorkerThread
    /* renamed from: Q */
    public final void mo34823Q() {
        mo34778h();
        mo35413i();
        this.f7723c.mo34799d();
        try {
            C10393b.m21775b().mo45088c(this.f7899a.mo34927f(), this.f7723c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f7724d = null;
    }

    @WorkerThread
    /* renamed from: R */
    public final void mo34824R(C5785i1 i1Var) {
        mo34778h();
        mo35413i();
        m10533F(new C6177i7(this, m10530C(false), i1Var));
    }

    @WorkerThread
    /* renamed from: S */
    public final void mo34825S(AtomicReference<String> atomicReference) {
        mo34778h();
        mo35413i();
        m10533F(new C6166h7(this, atomicReference, m10530C(false)));
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: T */
    public final void mo34826T(C5785i1 i1Var, String str, String str2) {
        mo34778h();
        mo35413i();
        m10533F(new C6320v7(this, str, str2, m10530C(false), i1Var));
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: U */
    public final void mo34827U(AtomicReference<List<C6103c>> atomicReference, String str, String str2, String str3) {
        mo34778h();
        mo35413i();
        m10533F(new C6309u7(this, atomicReference, (String) null, str2, str3, m10530C(false)));
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: V */
    public final void mo34828V(AtomicReference<List<C6190j9>> atomicReference, boolean z) {
        mo34778h();
        mo35413i();
        m10533F(new C6144f7(this, atomicReference, m10530C(false), z));
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: W */
    public final void mo34829W(C5785i1 i1Var, String str, String str2, boolean z) {
        mo34778h();
        mo35413i();
        m10533F(new C6122d7(this, str, str2, m10530C(false), z, i1Var));
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: X */
    public final void mo34830X(AtomicReference<List<C6190j9>> atomicReference, String str, String str2, String str3, boolean z) {
        mo34778h();
        mo35413i();
        m10533F(new C6331w7(this, atomicReference, (String) null, str2, str3, m10530C(false), z));
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo34789n() {
        return false;
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: o */
    public final void mo34831o(C6290t tVar, String str) {
        C9713p.m20275j(tVar);
        mo34778h();
        mo35413i();
        m10534G();
        m10533F(new C6287s7(this, true, m10530C(true), this.f7899a.mo35181C().mo34864v(tVar), tVar, str));
    }

    @WorkerThread
    /* renamed from: p */
    public final void mo34832p(C5785i1 i1Var, C6290t tVar, String str) {
        mo34778h();
        mo35413i();
        if (this.f7899a.mo35191N().mo35146p0(C4785c.f5063a) != 0) {
            this.f7899a.mo34920b().mo35080w().mo35037a("Not bundling data. Service unavailable or out of date");
            this.f7899a.mo35191N().mo35120F(i1Var, new byte[0]);
            return;
        }
        m10533F(new C6232n7(this, tVar, str, i1Var));
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: q */
    public final void mo34833q() {
        mo34778h();
        mo35413i();
        C6289s9 C = m10530C(false);
        m10534G();
        this.f7899a.mo35181C().mo34859q();
        m10533F(new C6155g7(this, C));
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: r */
    public final void mo34834r(C9257d dVar, C9882a aVar, C6289s9 s9Var) {
        int i;
        mo34778h();
        mo35413i();
        m10534G();
        this.f7899a.mo35211z();
        int i2 = 100;
        int i3 = 0;
        while (i3 < 1001 && i2 == 100) {
            ArrayList arrayList = new ArrayList();
            List<C9882a> p = this.f7899a.mo35181C().mo34858p(100);
            if (p != null) {
                arrayList.addAll(p);
                i = p.size();
            } else {
                i = 0;
            }
            if (aVar != null && i < 100) {
                arrayList.add(aVar);
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                C9882a aVar2 = (C9882a) arrayList.get(i4);
                if (aVar2 instanceof C6290t) {
                    try {
                        dVar.mo34767z1((C6290t) aVar2, s9Var);
                    } catch (RemoteException e) {
                        this.f7899a.mo34920b().mo35075r().mo35038b("Failed to send event to the service", e);
                    }
                } else if (aVar2 instanceof C6190j9) {
                    try {
                        dVar.mo34766y2((C6190j9) aVar2, s9Var);
                    } catch (RemoteException e2) {
                        this.f7899a.mo34920b().mo35075r().mo35038b("Failed to send user property to the service", e2);
                    }
                } else if (aVar2 instanceof C6103c) {
                    try {
                        dVar.mo34758X((C6103c) aVar2, s9Var);
                    } catch (RemoteException e3) {
                        this.f7899a.mo34920b().mo35075r().mo35038b("Failed to send conditional user property to the service", e3);
                    }
                } else {
                    this.f7899a.mo34920b().mo35075r().mo35037a("Discarding data. Unrecognized parcel type.");
                }
            }
            i3++;
            i2 = i;
        }
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: s */
    public final void mo34835s(C6103c cVar) {
        C9713p.m20275j(cVar);
        mo34778h();
        mo35413i();
        this.f7899a.mo34924d();
        m10533F(new C6298t7(this, true, m10530C(true), this.f7899a.mo35181C().mo34863u(cVar), new C6103c(cVar), cVar));
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: t */
    public final void mo34836t(boolean z) {
        mo34778h();
        mo35413i();
        if (z) {
            m10534G();
            this.f7899a.mo35181C().mo34859q();
        }
        if (mo34818A()) {
            m10533F(new C6276r7(this, m10530C(false)));
        }
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: u */
    public final void mo34837u(C6319v6 v6Var) {
        mo34778h();
        mo35413i();
        m10533F(new C6199k7(this, v6Var));
    }

    @WorkerThread
    /* renamed from: v */
    public final void mo34838v(Bundle bundle) {
        mo34778h();
        mo35413i();
        m10533F(new C6210l7(this, m10530C(false), bundle));
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: w */
    public final void mo34839w() {
        mo34778h();
        mo35413i();
        m10533F(new C6265q7(this, m10530C(true)));
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: x */
    public final void mo34840x(C9257d dVar) {
        mo34778h();
        C9713p.m20275j(dVar);
        this.f7724d = dVar;
        m10532E();
        m10531D();
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    /* renamed from: y */
    public final void mo34841y(C6190j9 j9Var) {
        mo34778h();
        mo35413i();
        m10534G();
        m10533F(new C6133e7(this, m10530C(true), this.f7899a.mo35181C().mo34865w(j9Var), j9Var));
    }

    @WorkerThread
    /* renamed from: z */
    public final boolean mo34842z() {
        mo34778h();
        mo35413i();
        if (this.f7724d != null) {
            return true;
        }
        return false;
    }
}
