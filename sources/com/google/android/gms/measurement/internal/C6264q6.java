package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.WorkerThread;
import androidx.autofill.HintConstants;
import androidx.collection.ArrayMap;
import com.google.android.gms.internal.measurement.C5678bd;
import com.google.android.gms.internal.measurement.C5991uc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p201q5.C9254a;
import p201q5.C9266m;
import p201q5.C9270q;
import p201q5.C9271r;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.q6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C6264q6 extends C6349y3 {

    /* renamed from: c */
    protected C6242o6 f8140c;

    /* renamed from: d */
    private C9270q f8141d;

    /* renamed from: e */
    private final Set<C9271r> f8142e = new CopyOnWriteArraySet();

    /* renamed from: f */
    private boolean f8143f;

    /* renamed from: g */
    private final AtomicReference<String> f8144g = new AtomicReference<>();

    /* renamed from: h */
    private final Object f8145h = new Object();
    @GuardedBy("consentLock")

    /* renamed from: i */
    private C9254a f8146i = new C9254a((Boolean) null, (Boolean) null);
    @GuardedBy("consentLock")

    /* renamed from: j */
    private int f8147j = 100;

    /* renamed from: k */
    private final AtomicLong f8148k = new AtomicLong(0);

    /* renamed from: l */
    private long f8149l = -1;

    /* renamed from: m */
    private int f8150m = 100;

    /* renamed from: n */
    final C6311u9 f8151n;

    /* renamed from: o */
    protected boolean f8152o = true;

    /* renamed from: p */
    private final C6223m9 f8153p = new C6132e6(this);

    protected C6264q6(C6251p4 p4Var) {
        super(p4Var);
        this.f8151n = new C6311u9(p4Var);
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: P */
    public final void mo35252p(Bundle bundle, long j) {
        C5991uc.m10137b();
        if (!this.f7899a.mo35211z().mo34873B((String) null, C6084a3.f7607t0) || TextUtils.isEmpty(this.f7899a.mo35180B().mo34812u())) {
            mo35227F(bundle, 0, j);
        } else {
            this.f7899a.mo34920b().mo35081x().mo35037a("Using developer consent only; google app id found");
        }
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: Q */
    public final void m11038Q(Boolean bool, boolean z) {
        mo34778h();
        mo35413i();
        this.f7899a.mo34920b().mo35074q().mo35038b("Setting app measurement enabled (FE)", bool);
        this.f7899a.mo35184F().mo35427s(bool);
        if (z) {
            C6360z3 F = this.f7899a.mo35184F();
            C6251p4 p4Var = F.f7899a;
            F.mo34778h();
            SharedPreferences.Editor edit = F.mo35423o().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (this.f7899a.mo35205p() || (bool != null && !bool.booleanValue())) {
            m11039R();
        }
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: R */
    public final void m11039R() {
        long j;
        mo34778h();
        String a = this.f7899a.mo35184F().f8443m.mo35400a();
        if (a != null) {
            if ("unset".equals(a)) {
                mo35235N("app", "_npa", (Object) null, this.f7899a.mo34922c().mo33547a());
            } else {
                if (true != "true".equals(a)) {
                    j = 0;
                } else {
                    j = 1;
                }
                mo35235N("app", "_npa", Long.valueOf(j), this.f7899a.mo34922c().mo33547a());
            }
        }
        if (!this.f7899a.mo35204o() || !this.f8152o) {
            this.f7899a.mo34920b().mo35074q().mo35037a("Updating Scion state (FE)");
            this.f7899a.mo35189L().mo34839w();
            return;
        }
        this.f7899a.mo34920b().mo35074q().mo35037a("Recording app launch after enabling measurement for the first time (FE)");
        mo35249h0();
        C5678bd.m8845b();
        if (this.f7899a.mo35211z().mo34873B((String) null, C6084a3.f7589k0)) {
            this.f7899a.mo35190M().f8204d.mo35283a();
        }
        this.f7899a.mo34919a().mo35110z(new C6296t5(this));
    }

    /* renamed from: e0 */
    static /* synthetic */ void m11040e0(C6264q6 q6Var, C9254a aVar, int i, long j, boolean z, boolean z2) {
        q6Var.mo34778h();
        q6Var.mo35413i();
        if (j > q6Var.f8149l || !C9254a.m18991l(q6Var.f8150m, i)) {
            C6360z3 F = q6Var.f7899a.mo35184F();
            C6251p4 p4Var = F.f7899a;
            F.mo34778h();
            if (F.mo35431w(i)) {
                SharedPreferences.Editor edit = F.mo35423o().edit();
                edit.putString("consent_settings", aVar.mo43552i());
                edit.putInt("consent_source", i);
                edit.apply();
                q6Var.f8149l = j;
                q6Var.f8150m = i;
                q6Var.f7899a.mo35189L().mo34836t(z);
                if (z2) {
                    q6Var.f7899a.mo35189L().mo34825S(new AtomicReference());
                    return;
                }
                return;
            }
            q6Var.f7899a.mo34920b().mo35078u().mo35038b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i));
            return;
        }
        q6Var.f7899a.mo34920b().mo35078u().mo35038b("Dropped out-of-date consent setting, proposed settings", aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final void mo35222A(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String next : bundle2.keySet()) {
            Object obj = bundle2.get(next);
            if (obj instanceof Bundle) {
                bundle2.putBundle(next, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        this.f7899a.mo34919a().mo35110z(new C6318v5(this, str, str2, j, bundle2, z, z2, z3, str3));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final void mo35223B(String str, String str2, long j, Object obj) {
        this.f7899a.mo34919a().mo35110z(new C6329w5(this, str, str2, obj, j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final void mo35224C(String str) {
        this.f8144g.set(str);
    }

    /* renamed from: D */
    public final void mo35225D(Bundle bundle) {
        mo35226E(bundle, this.f7899a.mo34922c().mo33547a());
    }

    /* renamed from: E */
    public final void mo35226E(Bundle bundle, long j) {
        C9713p.m20275j(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.f7899a.mo34920b().mo35080w().mo35037a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        C9713p.m20275j(bundle2);
        Class<String> cls = String.class;
        C9266m.m19027a(bundle2, "app_id", cls, null);
        C9266m.m19027a(bundle2, "origin", cls, null);
        C9266m.m19027a(bundle2, HintConstants.AUTOFILL_HINT_NAME, cls, null);
        C9266m.m19027a(bundle2, "value", Object.class, null);
        C9266m.m19027a(bundle2, "trigger_event_name", cls, null);
        Class<Long> cls2 = Long.class;
        C9266m.m19027a(bundle2, "trigger_timeout", cls2, 0L);
        C9266m.m19027a(bundle2, "timed_out_event_name", cls, null);
        Class<Bundle> cls3 = Bundle.class;
        C9266m.m19027a(bundle2, "timed_out_event_params", cls3, null);
        C9266m.m19027a(bundle2, "triggered_event_name", cls, null);
        C9266m.m19027a(bundle2, "triggered_event_params", cls3, null);
        C9266m.m19027a(bundle2, "time_to_live", cls2, 0L);
        C9266m.m19027a(bundle2, "expired_event_name", cls, null);
        C9266m.m19027a(bundle2, "expired_event_params", cls3, null);
        C9713p.m20271f(bundle2.getString(HintConstants.AUTOFILL_HINT_NAME));
        C9713p.m20271f(bundle2.getString("origin"));
        C9713p.m20275j(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString(HintConstants.AUTOFILL_HINT_NAME);
        Object obj = bundle2.get("value");
        if (this.f7899a.mo35191N().mo35142n0(string) != 0) {
            this.f7899a.mo34920b().mo35075r().mo35038b("Invalid conditional user property name", this.f7899a.mo35182D().mo34901f(string));
        } else if (this.f7899a.mo35191N().mo35138j0(string, obj) == 0) {
            Object p = this.f7899a.mo35191N().mo35145p(string, obj);
            if (p == null) {
                this.f7899a.mo34920b().mo35075r().mo35039c("Unable to normalize conditional user property value", this.f7899a.mo35182D().mo34901f(string), obj);
                return;
            }
            C9266m.m19028b(bundle2, p);
            long j2 = bundle2.getLong("trigger_timeout");
            if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
                this.f7899a.mo35211z();
                if (j2 > 15552000000L || j2 < 1) {
                    this.f7899a.mo34920b().mo35075r().mo35039c("Invalid conditional user property timeout", this.f7899a.mo35182D().mo34901f(string), Long.valueOf(j2));
                    return;
                }
            }
            long j3 = bundle2.getLong("time_to_live");
            this.f7899a.mo35211z();
            if (j3 > 15552000000L || j3 < 1) {
                this.f7899a.mo34920b().mo35075r().mo35039c("Invalid conditional user property time to live", this.f7899a.mo35182D().mo34901f(string), Long.valueOf(j3));
            } else {
                this.f7899a.mo34919a().mo35110z(new C6362z5(this, bundle2));
            }
        } else {
            this.f7899a.mo34920b().mo35075r().mo35039c("Invalid conditional user property value", this.f7899a.mo35182D().mo34901f(string), obj);
        }
    }

    /* renamed from: F */
    public final void mo35227F(Bundle bundle, int i, long j) {
        mo35413i();
        String h = C9254a.m18990h(bundle);
        if (h != null) {
            this.f7899a.mo34920b().mo35081x().mo35038b("Ignoring invalid consent setting", h);
            this.f7899a.mo34920b().mo35081x().mo35037a("Valid consent values are 'granted', 'denied'");
        }
        mo35228G(C9254a.m18987a(bundle), i, j);
    }

    /* renamed from: G */
    public final void mo35228G(C9254a aVar, int i, long j) {
        boolean z;
        boolean z2;
        C9254a aVar2;
        boolean z3;
        mo35413i();
        if (i != -10 && aVar.mo43548e() == null && aVar.mo43550f() == null) {
            this.f7899a.mo34920b().mo35081x().mo35037a("Discarding empty consent settings");
            return;
        }
        synchronized (this.f8145h) {
            z = false;
            if (C9254a.m18991l(i, this.f8147j)) {
                z3 = aVar.mo43555m(this.f8146i);
                if (aVar.mo43554k() && !this.f8146i.mo43554k()) {
                    z = true;
                }
                C9254a d = aVar.mo43547d(this.f8146i);
                this.f8146i = d;
                this.f8147j = i;
                aVar2 = d;
                z2 = z;
                z = true;
            } else {
                aVar2 = aVar;
                z2 = false;
                z3 = false;
            }
        }
        if (!z) {
            this.f7899a.mo34920b().mo35078u().mo35038b("Ignoring lower-priority consent settings, proposed settings", aVar2);
            return;
        }
        long andIncrement = this.f8148k.getAndIncrement();
        if (z3) {
            this.f8144g.set((Object) null);
            this.f7899a.mo34919a().mo35104A(new C6198k6(this, aVar2, j, i, andIncrement, z2));
        } else if (i == 30 || i == -10) {
            this.f7899a.mo34919a().mo35104A(new C6209l6(this, aVar2, i, andIncrement, z2));
        } else {
            this.f7899a.mo34919a().mo35110z(new C6220m6(this, aVar2, i, andIncrement, z2));
        }
    }

    /* renamed from: H */
    public final void mo35229H(Bundle bundle, long j) {
        C5991uc.m10137b();
        if (this.f7899a.mo35211z().mo34873B((String) null, C6084a3.f7609u0)) {
            this.f7899a.mo34919a().mo35104A(new C6274r5(this, bundle, j));
        } else {
            mo35252p(bundle, j);
        }
    }

    @WorkerThread
    /* renamed from: I */
    public final void mo35230I(C9270q qVar) {
        C9270q qVar2;
        boolean z;
        mo34778h();
        mo35413i();
        if (!(qVar == null || qVar == (qVar2 = this.f8141d))) {
            if (qVar2 == null) {
                z = true;
            } else {
                z = false;
            }
            C9713p.m20279n(z, "EventInterceptor already set.");
        }
        this.f8141d = qVar;
    }

    /* renamed from: J */
    public final void mo35231J(Boolean bool) {
        mo35413i();
        this.f7899a.mo34919a().mo35110z(new C6187j6(this, bool));
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: K */
    public final void mo35232K(C9254a aVar) {
        boolean z;
        Boolean bool;
        mo34778h();
        if ((!aVar.mo43554k() || !aVar.mo43553j()) && !this.f7899a.mo35189L().mo34818A()) {
            z = false;
        } else {
            z = true;
        }
        if (z != this.f7899a.mo35205p()) {
            this.f7899a.mo35201l(z);
            C6360z3 F = this.f7899a.mo35184F();
            C6251p4 p4Var = F.f7899a;
            F.mo34778h();
            if (F.mo35423o().contains("measurement_enabled_from_api")) {
                bool = Boolean.valueOf(F.mo35423o().getBoolean("measurement_enabled_from_api", true));
            } else {
                bool = null;
            }
            if (!z || bool == null || bool.booleanValue()) {
                m11038Q(Boolean.valueOf(z), false);
            }
        }
    }

    /* renamed from: L */
    public final void mo35233L(String str, String str2, Object obj, boolean z) {
        mo35234M("auto", "_ldl", obj, true, this.f7899a.mo34922c().mo33547a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0071  */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo35234M(java.lang.String r18, java.lang.String r19, java.lang.Object r20, boolean r21, long r22) {
        /*
            r17 = this;
            r6 = r17
            r2 = r19
            r0 = r20
            if (r18 != 0) goto L_0x000b
            java.lang.String r1 = "app"
            goto L_0x000d
        L_0x000b:
            r1 = r18
        L_0x000d:
            r3 = 0
            r4 = 24
            if (r21 == 0) goto L_0x001e
            com.google.android.gms.measurement.internal.p4 r5 = r6.f7899a
            com.google.android.gms.measurement.internal.n9 r5 = r5.mo35191N()
            int r5 = r5.mo35142n0(r2)
        L_0x001c:
            r13 = r5
            goto L_0x0048
        L_0x001e:
            com.google.android.gms.measurement.internal.p4 r5 = r6.f7899a
            com.google.android.gms.measurement.internal.n9 r5 = r5.mo35191N()
            java.lang.String r7 = "user property"
            boolean r8 = r5.mo35131Q(r7, r2)
            r9 = 6
            if (r8 != 0) goto L_0x002f
        L_0x002d:
            r13 = r9
            goto L_0x0048
        L_0x002f:
            java.lang.String[] r8 = p201q5.C9269p.f13615a
            r10 = 0
            boolean r8 = r5.mo35127M(r7, r8, r10, r2)
            if (r8 != 0) goto L_0x003b
            r5 = 15
            goto L_0x001c
        L_0x003b:
            com.google.android.gms.measurement.internal.p4 r8 = r5.f7899a
            r8.mo35211z()
            boolean r5 = r5.mo35126L(r7, r4, r2)
            if (r5 != 0) goto L_0x0047
            goto L_0x002d
        L_0x0047:
            r13 = r3
        L_0x0048:
            r5 = 1
            if (r13 == 0) goto L_0x0071
            com.google.android.gms.measurement.internal.p4 r0 = r6.f7899a
            com.google.android.gms.measurement.internal.n9 r0 = r0.mo35191N()
            com.google.android.gms.measurement.internal.p4 r1 = r6.f7899a
            r1.mo35211z()
            java.lang.String r15 = r0.mo35147q(r2, r4, r5)
            if (r2 == 0) goto L_0x0060
            int r3 = r19.length()
        L_0x0060:
            r16 = r3
            com.google.android.gms.measurement.internal.p4 r0 = r6.f7899a
            com.google.android.gms.measurement.internal.n9 r10 = r0.mo35191N()
            com.google.android.gms.measurement.internal.m9 r11 = r6.f8153p
            r12 = 0
            java.lang.String r14 = "_ev"
            r10.mo35115A(r11, r12, r13, r14, r15, r16)
            return
        L_0x0071:
            if (r0 == 0) goto L_0x00c4
            com.google.android.gms.measurement.internal.p4 r7 = r6.f7899a
            com.google.android.gms.measurement.internal.n9 r7 = r7.mo35191N()
            int r11 = r7.mo35138j0(r2, r0)
            if (r11 == 0) goto L_0x00ae
            com.google.android.gms.measurement.internal.p4 r1 = r6.f7899a
            com.google.android.gms.measurement.internal.n9 r1 = r1.mo35191N()
            com.google.android.gms.measurement.internal.p4 r7 = r6.f7899a
            r7.mo35211z()
            java.lang.String r13 = r1.mo35147q(r2, r4, r5)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 != 0) goto L_0x0096
            boolean r1 = r0 instanceof java.lang.CharSequence
            if (r1 == 0) goto L_0x009e
        L_0x0096:
            java.lang.String r0 = r20.toString()
            int r3 = r0.length()
        L_0x009e:
            r14 = r3
            com.google.android.gms.measurement.internal.p4 r0 = r6.f7899a
            com.google.android.gms.measurement.internal.n9 r8 = r0.mo35191N()
            com.google.android.gms.measurement.internal.m9 r9 = r6.f8153p
            r10 = 0
            java.lang.String r12 = "_ev"
            r8.mo35115A(r9, r10, r11, r12, r13, r14)
            return
        L_0x00ae:
            com.google.android.gms.measurement.internal.p4 r3 = r6.f7899a
            com.google.android.gms.measurement.internal.n9 r3 = r3.mo35191N()
            java.lang.Object r5 = r3.mo35145p(r2, r0)
            if (r5 == 0) goto L_0x00c3
            r0 = r17
            r2 = r19
            r3 = r22
            r0.mo35223B(r1, r2, r3, r5)
        L_0x00c3:
            return
        L_0x00c4:
            r5 = 0
            r0 = r17
            r2 = r19
            r3 = r22
            r0.mo35223B(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C6264q6.mo35234M(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007f  */
    @androidx.annotation.WorkerThread
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo35235N(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            p231t4.C9713p.m20271f(r9)
            p231t4.C9713p.m20271f(r10)
            r8.mo34778h()
            r8.mo35413i()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0065
            boolean r0 = r11 instanceof java.lang.String
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L_0x0053
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0053
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            java.lang.String r11 = "false"
            boolean r10 = r11.equals(r10)
            r2 = 1
            r0 = 1
            if (r0 == r10) goto L_0x0037
            r4 = 0
            goto L_0x0038
        L_0x0037:
            r4 = r2
        L_0x0038:
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            com.google.android.gms.measurement.internal.p4 r0 = r8.f7899a
            com.google.android.gms.measurement.internal.z3 r0 = r0.mo35184F()
            com.google.android.gms.measurement.internal.x3 r0 = r0.f8443m
            long r4 = r10.longValue()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x004e
            java.lang.String r11 = "true"
        L_0x004e:
            r0.mo35401b(r11)
            r6 = r10
            goto L_0x0063
        L_0x0053:
            if (r11 != 0) goto L_0x0065
            com.google.android.gms.measurement.internal.p4 r10 = r8.f7899a
            com.google.android.gms.measurement.internal.z3 r10 = r10.mo35184F()
            com.google.android.gms.measurement.internal.x3 r10 = r10.f8443m
            java.lang.String r0 = "unset"
            r10.mo35401b(r0)
            r6 = r11
        L_0x0063:
            r3 = r1
            goto L_0x0067
        L_0x0065:
            r3 = r10
            r6 = r11
        L_0x0067:
            com.google.android.gms.measurement.internal.p4 r10 = r8.f7899a
            boolean r10 = r10.mo35204o()
            if (r10 != 0) goto L_0x007f
            com.google.android.gms.measurement.internal.p4 r9 = r8.f7899a
            com.google.android.gms.measurement.internal.l3 r9 = r9.mo34920b()
            com.google.android.gms.measurement.internal.j3 r9 = r9.mo35079v()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.mo35037a(r10)
            return
        L_0x007f:
            com.google.android.gms.measurement.internal.p4 r10 = r8.f7899a
            boolean r10 = r10.mo35207r()
            if (r10 != 0) goto L_0x0088
            return
        L_0x0088:
            com.google.android.gms.measurement.internal.j9 r10 = new com.google.android.gms.measurement.internal.j9
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.p4 r9 = r8.f7899a
            com.google.android.gms.measurement.internal.d8 r9 = r9.mo35189L()
            r9.mo34841y(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C6264q6.mo35235N(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    /* renamed from: O */
    public final void mo35236O(C9271r rVar) {
        mo35413i();
        C9713p.m20275j(rVar);
        if (!this.f8142e.remove(rVar)) {
            this.f7899a.mo34920b().mo35080w().mo35037a("OnEventListener had not been registered");
        }
    }

    /* renamed from: S */
    public final int mo35237S(String str) {
        C9713p.m20271f(str);
        this.f7899a.mo35211z();
        return 25;
    }

    /* renamed from: T */
    public final Boolean mo35238T() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.f7899a.mo34919a().mo35106r(atomicReference, 15000, "boolean test flag value", new C6099b6(this, atomicReference));
    }

    /* renamed from: U */
    public final Double mo35239U() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.f7899a.mo34919a().mo35106r(atomicReference, 15000, "double test flag value", new C6176i6(this, atomicReference));
    }

    /* renamed from: V */
    public final Integer mo35240V() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.f7899a.mo34919a().mo35106r(atomicReference, 15000, "int test flag value", new C6165h6(this, atomicReference));
    }

    /* renamed from: W */
    public final Long mo35241W() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.f7899a.mo34919a().mo35106r(atomicReference, 15000, "long test flag value", new C6154g6(this, atomicReference));
    }

    /* renamed from: X */
    public final String mo35242X() {
        return this.f8144g.get();
    }

    /* renamed from: Y */
    public final String mo35243Y() {
        C6319v6 s = this.f7899a.mo35188K().mo34790s();
        if (s != null) {
            return s.f8324b;
        }
        return null;
    }

    /* renamed from: Z */
    public final String mo35244Z() {
        C6319v6 s = this.f7899a.mo35188K().mo34790s();
        if (s != null) {
            return s.f8323a;
        }
        return null;
    }

    /* renamed from: a0 */
    public final String mo35245a0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.f7899a.mo34919a().mo35106r(atomicReference, 15000, "String test flag value", new C6143f6(this, atomicReference));
    }

    /* renamed from: b0 */
    public final ArrayList<Bundle> mo35246b0(String str, String str2) {
        if (this.f7899a.mo34919a().mo35105C()) {
            this.f7899a.mo34920b().mo35075r().mo35037a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        }
        this.f7899a.mo34924d();
        if (C6092b.m10462a()) {
            this.f7899a.mo34920b().mo35075r().mo35037a("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f7899a.mo34919a().mo35106r(atomicReference, 5000, "get conditional user properties", new C6110c6(this, atomicReference, (String) null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return C6234n9.m10935u(list);
        }
        this.f7899a.mo34920b().mo35075r().mo35038b("Timed out waiting for get conditional user properties", (Object) null);
        return new ArrayList<>();
    }

    /* renamed from: c0 */
    public final List<C6190j9> mo35247c0(boolean z) {
        mo35413i();
        this.f7899a.mo34920b().mo35079v().mo35037a("Getting user properties (FE)");
        if (!this.f7899a.mo34919a().mo35105C()) {
            this.f7899a.mo34924d();
            if (C6092b.m10462a()) {
                this.f7899a.mo34920b().mo35075r().mo35037a("Cannot get all user properties from main thread");
                return Collections.emptyList();
            }
            AtomicReference atomicReference = new AtomicReference();
            this.f7899a.mo34919a().mo35106r(atomicReference, 5000, "get user properties", new C6340x5(this, atomicReference, z));
            List<C6190j9> list = (List) atomicReference.get();
            if (list != null) {
                return list;
            }
            this.f7899a.mo34920b().mo35075r().mo35038b("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyList();
        }
        this.f7899a.mo34920b().mo35075r().mo35037a("Cannot get all user properties from analytics worker thread");
        return Collections.emptyList();
    }

    /* renamed from: d0 */
    public final Map<String, Object> mo35248d0(String str, String str2, boolean z) {
        if (this.f7899a.mo34919a().mo35105C()) {
            this.f7899a.mo34920b().mo35075r().mo35037a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        this.f7899a.mo34924d();
        if (C6092b.m10462a()) {
            this.f7899a.mo34920b().mo35075r().mo35037a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f7899a.mo34919a().mo35106r(atomicReference, 5000, "get user properties", new C6121d6(this, atomicReference, (String) null, str, str2, z));
        List<C6190j9> list = (List) atomicReference.get();
        if (list == null) {
            this.f7899a.mo34920b().mo35075r().mo35038b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyMap();
        }
        ArrayMap arrayMap = new ArrayMap(list.size());
        for (C6190j9 j9Var : list) {
            Object A = j9Var.mo35057A();
            if (A != null) {
                arrayMap.put(j9Var.f7907c, A);
            }
        }
        return arrayMap;
    }

    @WorkerThread
    /* renamed from: h0 */
    public final void mo35249h0() {
        mo34778h();
        mo35413i();
        if (this.f7899a.mo35207r()) {
            if (this.f7899a.mo35211z().mo34873B((String) null, C6084a3.f7571b0)) {
                C6147g z = this.f7899a.mo35211z();
                z.f7899a.mo34924d();
                Boolean t = z.mo34889t("google_analytics_deferred_deep_link_enabled");
                if (t != null && t.booleanValue()) {
                    this.f7899a.mo34920b().mo35074q().mo35037a("Deferred Deep Link feature enabled.");
                    this.f7899a.mo34919a().mo35110z(new C6241o5(this));
                }
            }
            this.f7899a.mo35189L().mo34821O();
            this.f8152o = false;
            C6360z3 F = this.f7899a.mo35184F();
            F.mo34778h();
            String string = F.mo35423o().getString("previous_os_version", (String) null);
            F.f7899a.mo35179A().mo35062k();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = F.mo35423o().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                this.f7899a.mo35179A().mo35062k();
                if (!string.equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    mo35257u("auto", "_ou", bundle);
                }
            }
        }
    }

    /* renamed from: i0 */
    public final void mo35250i0(String str, String str2, Bundle bundle) {
        long a = this.f7899a.mo34922c().mo33547a();
        C9713p.m20271f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString(HintConstants.AUTOFILL_HINT_NAME, str);
        bundle2.putLong("creation_timestamp", a);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        this.f7899a.mo34919a().mo35110z(new C6087a6(this, bundle2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo34789n() {
        return false;
    }

    /* renamed from: o */
    public final void mo35251o() {
        if ((this.f7899a.mo34927f().getApplicationContext() instanceof Application) && this.f8140c != null) {
            ((Application) this.f7899a.mo34927f().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f8140c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final /* synthetic */ void mo35253q(Bundle bundle) {
        if (bundle == null) {
            this.f7899a.mo35184F().f8453w.mo35313b(new Bundle());
            return;
        }
        Bundle a = this.f7899a.mo35184F().f8453w.mo35312a();
        for (String next : bundle.keySet()) {
            Object obj = bundle.get(next);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.f7899a.mo35191N().mo35134T(obj)) {
                    this.f7899a.mo35191N().mo35115A(this.f8153p, (String) null, 27, (String) null, (String) null, 0);
                }
                this.f7899a.mo34920b().mo35081x().mo35039c("Invalid default event parameter type. Name, value", next, obj);
            } else if (C6234n9.m10921V(next)) {
                this.f7899a.mo34920b().mo35081x().mo35038b("Invalid default event parameter name. Name", next);
            } else if (obj == null) {
                a.remove(next);
            } else {
                C6234n9 N = this.f7899a.mo35191N();
                this.f7899a.mo35211z();
                if (N.mo35128N("param", next, 100, obj)) {
                    this.f7899a.mo35191N().mo35116B(a, next, obj);
                }
            }
        }
        this.f7899a.mo35191N();
        int m = this.f7899a.mo35211z().mo34882m();
        if (a.size() > m) {
            int i = 0;
            for (String str : new TreeSet(a.keySet())) {
                i++;
                if (i > m) {
                    a.remove(str);
                }
            }
            this.f7899a.mo35191N().mo35115A(this.f8153p, (String) null, 26, (String) null, (String) null, 0);
            this.f7899a.mo34920b().mo35081x().mo35037a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.f7899a.mo35184F().f8453w.mo35313b(a);
        this.f7899a.mo35189L().mo34838v(a);
    }

    /* renamed from: r */
    public final void mo35254r(String str, String str2, Bundle bundle) {
        mo35255s(str, str2, bundle, true, true, this.f7899a.mo34922c().mo33547a());
    }

    /* renamed from: s */
    public final void mo35255s(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        String str3;
        Bundle bundle2;
        if (str == null) {
            str3 = "app";
        } else {
            str3 = str;
        }
        if (bundle == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = bundle;
        }
        String str4 = str2;
        if (C6234n9.m10925Z(str2, "screen_view")) {
            this.f7899a.mo35188K().mo34787F(bundle2, j);
            return;
        }
        long j2 = j;
        boolean z3 = true;
        if (z2 && this.f8141d != null && !C6234n9.m10921V(str2)) {
            z3 = false;
        }
        mo35222A(str3, str2, j, bundle2, z2, z3, z, (String) null);
    }

    /* renamed from: t */
    public final void mo35256t(String str, String str2, Bundle bundle, String str3) {
        C6251p4.m10990t();
        mo35222A("auto", str2, this.f7899a.mo34922c().mo33547a(), bundle, false, true, true, str3);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: u */
    public final void mo35257u(String str, String str2, Bundle bundle) {
        mo34778h();
        mo35258v(str, str2, this.f7899a.mo34922c().mo33547a(), bundle);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: v */
    public final void mo35258v(String str, String str2, long j, Bundle bundle) {
        boolean z;
        mo34778h();
        if (this.f8141d == null || C6234n9.m10921V(str2)) {
            z = true;
        } else {
            z = false;
        }
        mo35259w(str, str2, j, bundle, true, z, true, (String) null);
    }

    /* JADX WARNING: type inference failed for: r5v9, types: [java.lang.Object[]] */
    /* JADX WARNING: type inference failed for: r5v11, types: [java.lang.Object[]] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.WorkerThread
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo35259w(java.lang.String r20, java.lang.String r21, long r22, android.os.Bundle r24, boolean r25, boolean r26, boolean r27, java.lang.String r28) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r12 = r24
            p231t4.C9713p.m20271f(r20)
            p231t4.C9713p.m20275j(r24)
            r19.mo34778h()
            r19.mo35413i()
            com.google.android.gms.measurement.internal.p4 r0 = r7.f7899a
            boolean r0 = r0.mo35204o()
            if (r0 == 0) goto L_0x0513
            com.google.android.gms.measurement.internal.p4 r0 = r7.f7899a
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo35180B()
            java.util.List r0 = r0.mo34813v()
            if (r0 == 0) goto L_0x0041
            boolean r0 = r0.contains(r9)
            if (r0 == 0) goto L_0x0031
            goto L_0x0041
        L_0x0031:
            com.google.android.gms.measurement.internal.p4 r0 = r7.f7899a
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35074q()
            java.lang.String r1 = "Dropping non-safelisted event. event name, origin"
            r0.mo35039c(r1, r9, r8)
            return
        L_0x0041:
            boolean r0 = r7.f8143f
            r13 = 0
            r14 = 0
            r15 = 1
            if (r0 != 0) goto L_0x00a1
            r7.f8143f = r15
            com.google.android.gms.measurement.internal.p4 r0 = r7.f7899a     // Catch:{ ClassNotFoundException -> 0x0092 }
            boolean r0 = r0.mo35208s()     // Catch:{ ClassNotFoundException -> 0x0092 }
            if (r0 != 0) goto L_0x0063
            java.lang.String r0 = "com.google.android.gms.tagmanager.TagManagerService"
            com.google.android.gms.measurement.internal.p4 r1 = r7.f7899a     // Catch:{ ClassNotFoundException -> 0x0092 }
            android.content.Context r1 = r1.mo34927f()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.Class r0 = java.lang.Class.forName(r0, r15, r1)     // Catch:{ ClassNotFoundException -> 0x0092 }
            goto L_0x0067
        L_0x0063:
            java.lang.Class<com.google.android.gms.tagmanager.TagManagerService> r0 = com.google.android.gms.tagmanager.TagManagerService.class
            int r1 = com.google.android.gms.tagmanager.TagManagerService.f8467b     // Catch:{ ClassNotFoundException -> 0x0092 }
        L_0x0067:
            java.lang.Class[] r1 = new java.lang.Class[r15]     // Catch:{ Exception -> 0x0081 }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r14] = r2     // Catch:{ Exception -> 0x0081 }
            java.lang.String r2 = "initialize"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r1)     // Catch:{ Exception -> 0x0081 }
            java.lang.Object[] r1 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x0081 }
            com.google.android.gms.measurement.internal.p4 r2 = r7.f7899a     // Catch:{ Exception -> 0x0081 }
            android.content.Context r2 = r2.mo34927f()     // Catch:{ Exception -> 0x0081 }
            r1[r14] = r2     // Catch:{ Exception -> 0x0081 }
            r0.invoke(r13, r1)     // Catch:{ Exception -> 0x0081 }
            goto L_0x00a1
        L_0x0081:
            r0 = move-exception
            com.google.android.gms.measurement.internal.p4 r1 = r7.f7899a     // Catch:{ ClassNotFoundException -> 0x0092 }
            com.google.android.gms.measurement.internal.l3 r1 = r1.mo34920b()     // Catch:{ ClassNotFoundException -> 0x0092 }
            com.google.android.gms.measurement.internal.j3 r1 = r1.mo35080w()     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.String r2 = "Failed to invoke Tag Manager's initialize() method"
            r1.mo35038b(r2, r0)     // Catch:{ ClassNotFoundException -> 0x0092 }
            goto L_0x00a1
        L_0x0092:
            com.google.android.gms.measurement.internal.p4 r0 = r7.f7899a
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35078u()
            java.lang.String r1 = "Tag Manager is not found and thus will not be used"
            r0.mo35037a(r1)
        L_0x00a1:
            java.lang.String r0 = "_cmp"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x00cd
            java.lang.String r0 = "gclid"
            boolean r1 = r12.containsKey(r0)
            if (r1 == 0) goto L_0x00cd
            com.google.android.gms.measurement.internal.p4 r1 = r7.f7899a
            r1.mo34924d()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_lgclid"
            java.lang.String r4 = r12.getString(r0)
            com.google.android.gms.measurement.internal.p4 r0 = r7.f7899a
            y4.e r0 = r0.mo34922c()
            long r5 = r0.mo33547a()
            r1 = r19
            r1.mo35235N(r2, r3, r4, r5)
        L_0x00cd:
            com.google.android.gms.measurement.internal.p4 r0 = r7.f7899a
            r0.mo34924d()
            if (r25 == 0) goto L_0x00ef
            boolean r0 = com.google.android.gms.measurement.internal.C6234n9.m10926a0(r21)
            if (r0 == 0) goto L_0x00ef
            com.google.android.gms.measurement.internal.p4 r0 = r7.f7899a
            com.google.android.gms.measurement.internal.n9 r0 = r0.mo35191N()
            com.google.android.gms.measurement.internal.p4 r1 = r7.f7899a
            com.google.android.gms.measurement.internal.z3 r1 = r1.mo35184F()
            com.google.android.gms.measurement.internal.u3 r1 = r1.f8453w
            android.os.Bundle r1 = r1.mo35312a()
            r0.mo35158y(r12, r1)
        L_0x00ef:
            r0 = 40
            if (r27 != 0) goto L_0x0177
            com.google.android.gms.measurement.internal.p4 r1 = r7.f7899a
            r1.mo34924d()
            java.lang.String r1 = "_iap"
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x0177
            com.google.android.gms.measurement.internal.p4 r1 = r7.f7899a
            com.google.android.gms.measurement.internal.n9 r1 = r1.mo35191N()
            java.lang.String r2 = "event"
            boolean r3 = r1.mo35131Q(r2, r9)
            r4 = 2
            if (r3 != 0) goto L_0x0110
            goto L_0x012a
        L_0x0110:
            java.lang.String[] r3 = p201q5.C9267n.f13607a
            java.lang.String[] r5 = p201q5.C9267n.f13608b
            boolean r3 = r1.mo35127M(r2, r3, r5, r9)
            if (r3 != 0) goto L_0x011d
            r4 = 13
            goto L_0x012a
        L_0x011d:
            com.google.android.gms.measurement.internal.p4 r3 = r1.f7899a
            r3.mo35211z()
            boolean r1 = r1.mo35126L(r2, r0, r9)
            if (r1 != 0) goto L_0x0129
            goto L_0x012a
        L_0x0129:
            r4 = r14
        L_0x012a:
            if (r4 == 0) goto L_0x0177
            com.google.android.gms.measurement.internal.p4 r1 = r7.f7899a
            com.google.android.gms.measurement.internal.l3 r1 = r1.mo34920b()
            com.google.android.gms.measurement.internal.j3 r1 = r1.mo35076s()
            com.google.android.gms.measurement.internal.p4 r2 = r7.f7899a
            com.google.android.gms.measurement.internal.g3 r2 = r2.mo35182D()
            java.lang.String r2 = r2.mo34899d(r9)
            java.lang.String r3 = "Invalid public event name. Event will not be logged (FE)"
            r1.mo35038b(r3, r2)
            com.google.android.gms.measurement.internal.p4 r1 = r7.f7899a
            com.google.android.gms.measurement.internal.n9 r1 = r1.mo35191N()
            com.google.android.gms.measurement.internal.p4 r2 = r7.f7899a
            r2.mo35211z()
            java.lang.String r0 = r1.mo35147q(r9, r0, r15)
            if (r9 == 0) goto L_0x015a
            int r14 = r21.length()
        L_0x015a:
            com.google.android.gms.measurement.internal.p4 r1 = r7.f7899a
            com.google.android.gms.measurement.internal.n9 r1 = r1.mo35191N()
            com.google.android.gms.measurement.internal.m9 r2 = r7.f8153p
            r3 = 0
            java.lang.String r5 = "_ev"
            r20 = r1
            r21 = r2
            r22 = r3
            r23 = r4
            r24 = r5
            r25 = r0
            r26 = r14
            r20.mo35115A(r21, r22, r23, r24, r25, r26)
            return
        L_0x0177:
            com.google.android.gms.internal.measurement.C5865me.m9646b()
            com.google.android.gms.measurement.internal.p4 r1 = r7.f7899a
            com.google.android.gms.measurement.internal.g r1 = r1.mo35211z()
            com.google.android.gms.measurement.internal.z2<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C6084a3.f7542C0
            boolean r1 = r1.mo34873B(r13, r2)
            java.lang.String r2 = "_sc"
            if (r1 == 0) goto L_0x01ae
            com.google.android.gms.measurement.internal.p4 r1 = r7.f7899a
            r1.mo34924d()
            com.google.android.gms.measurement.internal.p4 r1 = r7.f7899a
            com.google.android.gms.measurement.internal.c7 r1 = r1.mo35188K()
            com.google.android.gms.measurement.internal.v6 r1 = r1.mo34791t(r14)
            if (r1 == 0) goto L_0x01a3
            boolean r3 = r12.containsKey(r2)
            if (r3 != 0) goto L_0x01a3
            r1.f8326d = r15
        L_0x01a3:
            if (r25 == 0) goto L_0x01a9
            if (r27 != 0) goto L_0x01a9
            r3 = r15
            goto L_0x01aa
        L_0x01a9:
            r3 = r14
        L_0x01aa:
            com.google.android.gms.measurement.internal.C6234n9.m10936x(r1, r12, r3)
            goto L_0x01d1
        L_0x01ae:
            com.google.android.gms.measurement.internal.p4 r1 = r7.f7899a
            r1.mo34924d()
            com.google.android.gms.measurement.internal.p4 r1 = r7.f7899a
            com.google.android.gms.measurement.internal.c7 r1 = r1.mo35188K()
            com.google.android.gms.measurement.internal.v6 r1 = r1.mo34791t(r14)
            if (r1 == 0) goto L_0x01c7
            boolean r3 = r12.containsKey(r2)
            if (r3 != 0) goto L_0x01c7
            r1.f8326d = r15
        L_0x01c7:
            if (r25 == 0) goto L_0x01cd
            if (r27 != 0) goto L_0x01cd
            r3 = r15
            goto L_0x01ce
        L_0x01cd:
            r3 = r14
        L_0x01ce:
            com.google.android.gms.measurement.internal.C6234n9.m10936x(r1, r12, r3)
        L_0x01d1:
            java.lang.String r1 = "am"
            boolean r1 = r1.equals(r8)
            boolean r3 = com.google.android.gms.measurement.internal.C6234n9.m10921V(r21)
            if (r25 == 0) goto L_0x021e
            q5.q r4 = r7.f8141d
            if (r4 == 0) goto L_0x021e
            if (r3 != 0) goto L_0x021e
            if (r1 == 0) goto L_0x01e8
            r16 = r15
            goto L_0x0220
        L_0x01e8:
            com.google.android.gms.measurement.internal.p4 r0 = r7.f7899a
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35074q()
            com.google.android.gms.measurement.internal.p4 r1 = r7.f7899a
            com.google.android.gms.measurement.internal.g3 r1 = r1.mo35182D()
            java.lang.String r1 = r1.mo34899d(r9)
            com.google.android.gms.measurement.internal.p4 r2 = r7.f7899a
            com.google.android.gms.measurement.internal.g3 r2 = r2.mo35182D()
            java.lang.String r2 = r2.mo34897b(r12)
            java.lang.String r3 = "Passing event to registered event handler (FE)"
            r0.mo35039c(r3, r1, r2)
            q5.q r0 = r7.f8141d
            p231t4.C9713p.m20275j(r0)
            q5.q r1 = r7.f8141d
            r2 = r20
            r3 = r21
            r4 = r24
            r5 = r22
            r1.mo35268w(r2, r3, r4, r5)
            return
        L_0x021e:
            r16 = r1
        L_0x0220:
            com.google.android.gms.measurement.internal.p4 r1 = r7.f7899a
            boolean r1 = r1.mo35207r()
            if (r1 == 0) goto L_0x0512
            com.google.android.gms.measurement.internal.p4 r1 = r7.f7899a
            com.google.android.gms.measurement.internal.n9 r1 = r1.mo35191N()
            int r1 = r1.mo35139k0(r9)
            if (r1 == 0) goto L_0x027e
            com.google.android.gms.measurement.internal.p4 r2 = r7.f7899a
            com.google.android.gms.measurement.internal.l3 r2 = r2.mo34920b()
            com.google.android.gms.measurement.internal.j3 r2 = r2.mo35076s()
            com.google.android.gms.measurement.internal.p4 r3 = r7.f7899a
            com.google.android.gms.measurement.internal.g3 r3 = r3.mo35182D()
            java.lang.String r3 = r3.mo34899d(r9)
            java.lang.String r4 = "Invalid event name. Event will not be logged (FE)"
            r2.mo35038b(r4, r3)
            com.google.android.gms.measurement.internal.p4 r2 = r7.f7899a
            com.google.android.gms.measurement.internal.n9 r2 = r2.mo35191N()
            com.google.android.gms.measurement.internal.p4 r3 = r7.f7899a
            r3.mo35211z()
            java.lang.String r0 = r2.mo35147q(r9, r0, r15)
            if (r9 == 0) goto L_0x0262
            int r14 = r21.length()
        L_0x0262:
            com.google.android.gms.measurement.internal.p4 r2 = r7.f7899a
            com.google.android.gms.measurement.internal.n9 r2 = r2.mo35191N()
            com.google.android.gms.measurement.internal.m9 r3 = r7.f8153p
            java.lang.String r4 = "_ev"
            r20 = r2
            r21 = r3
            r22 = r28
            r23 = r1
            r24 = r4
            r25 = r0
            r26 = r14
            r20.mo35115A(r21, r22, r23, r24, r25, r26)
            return
        L_0x027e:
            java.lang.String r0 = "_sn"
            java.lang.String r1 = "_si"
            java.lang.String r6 = "_o"
            java.lang.String[] r0 = new java.lang.String[]{r6, r0, r2, r1}
            java.util.List r5 = p286y4.C10672f.m22674c(r0)
            com.google.android.gms.measurement.internal.p4 r0 = r7.f7899a
            com.google.android.gms.measurement.internal.n9 r1 = r0.mo35191N()
            r2 = r28
            r3 = r21
            r4 = r24
            r0 = r6
            r6 = r27
            android.os.Bundle r12 = r1.mo35155v0(r2, r3, r4, r5, r6)
            p231t4.C9713p.m20275j(r12)
            com.google.android.gms.measurement.internal.p4 r1 = r7.f7899a
            r1.mo34924d()
            com.google.android.gms.measurement.internal.p4 r1 = r7.f7899a
            com.google.android.gms.measurement.internal.c7 r1 = r1.mo35188K()
            com.google.android.gms.measurement.internal.v6 r1 = r1.mo34791t(r14)
            r5 = 0
            java.lang.String r4 = "_ae"
            if (r1 == 0) goto L_0x02e4
            boolean r1 = r4.equals(r9)
            if (r1 == 0) goto L_0x02e4
            com.google.android.gms.measurement.internal.p4 r1 = r7.f7899a
            com.google.android.gms.measurement.internal.s8 r1 = r1.mo35190M()
            com.google.android.gms.measurement.internal.q8 r1 = r1.f8205e
            com.google.android.gms.measurement.internal.s8 r2 = r1.f8159d
            com.google.android.gms.measurement.internal.p4 r2 = r2.f7899a
            y4.e r2 = r2.mo34922c()
            long r2 = r2.mo33548b()
            long r14 = r1.f8157b
            long r14 = r2 - r14
            r1.f8157b = r2
            int r1 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x02e4
            com.google.android.gms.measurement.internal.p4 r1 = r7.f7899a
            com.google.android.gms.measurement.internal.n9 r1 = r1.mo35191N()
            r1.mo35154v(r12, r14)
        L_0x02e4:
            com.google.android.gms.internal.measurement.C5943rc.m9843b()
            com.google.android.gms.measurement.internal.p4 r1 = r7.f7899a
            com.google.android.gms.measurement.internal.g r1 = r1.mo35211z()
            com.google.android.gms.measurement.internal.z2<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C6084a3.f7587j0
            boolean r1 = r1.mo34873B(r13, r2)
            if (r1 == 0) goto L_0x036e
            java.lang.String r1 = "auto"
            boolean r1 = r1.equals(r8)
            java.lang.String r2 = "_ffr"
            if (r1 != 0) goto L_0x034d
            java.lang.String r1 = "_ssr"
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x034d
            com.google.android.gms.measurement.internal.p4 r1 = r7.f7899a
            com.google.android.gms.measurement.internal.n9 r1 = r1.mo35191N()
            java.lang.String r2 = r12.getString(r2)
            boolean r3 = p286y4.C10682p.m22709a(r2)
            if (r3 == 0) goto L_0x0319
            r2 = r13
            goto L_0x031f
        L_0x0319:
            if (r2 == 0) goto L_0x031f
            java.lang.String r2 = r2.trim()
        L_0x031f:
            com.google.android.gms.measurement.internal.p4 r3 = r1.f7899a
            com.google.android.gms.measurement.internal.z3 r3 = r3.mo35184F()
            com.google.android.gms.measurement.internal.x3 r3 = r3.f8450t
            java.lang.String r3 = r3.mo35400a()
            boolean r3 = com.google.android.gms.measurement.internal.C6234n9.m10925Z(r2, r3)
            if (r3 != 0) goto L_0x033d
            com.google.android.gms.measurement.internal.p4 r1 = r1.f7899a
            com.google.android.gms.measurement.internal.z3 r1 = r1.mo35184F()
            com.google.android.gms.measurement.internal.x3 r1 = r1.f8450t
            r1.mo35401b(r2)
            goto L_0x036e
        L_0x033d:
            com.google.android.gms.measurement.internal.p4 r0 = r1.f7899a
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35074q()
            java.lang.String r1 = "Not logging duplicate session_start_with_rollout event"
            r0.mo35037a(r1)
            return
        L_0x034d:
            boolean r1 = r4.equals(r9)
            if (r1 == 0) goto L_0x036e
            com.google.android.gms.measurement.internal.p4 r1 = r7.f7899a
            com.google.android.gms.measurement.internal.n9 r1 = r1.mo35191N()
            com.google.android.gms.measurement.internal.p4 r1 = r1.f7899a
            com.google.android.gms.measurement.internal.z3 r1 = r1.mo35184F()
            com.google.android.gms.measurement.internal.x3 r1 = r1.f8450t
            java.lang.String r1 = r1.mo35400a()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L_0x036e
            r12.putString(r2, r1)
        L_0x036e:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r14.add(r12)
            com.google.android.gms.measurement.internal.p4 r1 = r7.f7899a
            com.google.android.gms.measurement.internal.z3 r1 = r1.mo35184F()
            com.google.android.gms.measurement.internal.v3 r1 = r1.f8445o
            long r1 = r1.mo35384a()
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x03f0
            com.google.android.gms.measurement.internal.p4 r1 = r7.f7899a
            com.google.android.gms.measurement.internal.z3 r1 = r1.mo35184F()
            boolean r1 = r1.mo35430v(r10)
            if (r1 == 0) goto L_0x03f0
            com.google.android.gms.measurement.internal.p4 r1 = r7.f7899a
            com.google.android.gms.measurement.internal.z3 r1 = r1.mo35184F()
            com.google.android.gms.measurement.internal.t3 r1 = r1.f8447q
            boolean r1 = r1.mo35301b()
            if (r1 == 0) goto L_0x03f0
            com.google.android.gms.measurement.internal.p4 r1 = r7.f7899a
            com.google.android.gms.measurement.internal.l3 r1 = r1.mo34920b()
            com.google.android.gms.measurement.internal.j3 r1 = r1.mo35079v()
            java.lang.String r2 = "Current session is expired, remove the session number, ID, and engagement time"
            r1.mo35037a(r2)
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_sid"
            r15 = 0
            com.google.android.gms.measurement.internal.p4 r1 = r7.f7899a
            y4.e r1 = r1.mo34922c()
            long r17 = r1.mo33547a()
            r1 = r19
            r13 = r4
            r4 = r15
            r8 = r5
            r5 = r17
            r1.mo35235N(r2, r3, r4, r5)
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_sno"
            r4 = 0
            com.google.android.gms.measurement.internal.p4 r1 = r7.f7899a
            y4.e r1 = r1.mo34922c()
            long r5 = r1.mo33547a()
            r1 = r19
            r1.mo35235N(r2, r3, r4, r5)
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_se"
            com.google.android.gms.measurement.internal.p4 r1 = r7.f7899a
            y4.e r1 = r1.mo34922c()
            long r5 = r1.mo33547a()
            r1 = r19
            r1.mo35235N(r2, r3, r4, r5)
            goto L_0x03f2
        L_0x03f0:
            r13 = r4
            r8 = r5
        L_0x03f2:
            java.lang.String r1 = "extend_session"
            long r1 = r12.getLong(r1, r8)
            r3 = 1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0419
            com.google.android.gms.measurement.internal.p4 r1 = r7.f7899a
            com.google.android.gms.measurement.internal.l3 r1 = r1.mo34920b()
            com.google.android.gms.measurement.internal.j3 r1 = r1.mo35079v()
            java.lang.String r2 = "EXTEND_SESSION param attached: initiate a new session or extend the current active session"
            r1.mo35037a(r2)
            com.google.android.gms.measurement.internal.p4 r1 = r7.f7899a
            com.google.android.gms.measurement.internal.s8 r1 = r1.mo35190M()
            com.google.android.gms.measurement.internal.r8 r1 = r1.f8204d
            r2 = 1
            r1.mo35284b(r10, r2)
        L_0x0419:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set r2 = r12.keySet()
            r1.<init>(r2)
            java.util.Collections.sort(r1)
            int r2 = r1.size()
            r3 = 0
        L_0x042a:
            if (r3 >= r2) goto L_0x0478
            java.lang.Object r4 = r1.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0475
            com.google.android.gms.measurement.internal.p4 r5 = r7.f7899a
            r5.mo35191N()
            java.lang.Object r5 = r12.get(r4)
            boolean r6 = r5 instanceof android.os.Bundle
            if (r6 == 0) goto L_0x044a
            r6 = 1
            android.os.Bundle[] r8 = new android.os.Bundle[r6]
            android.os.Bundle r5 = (android.os.Bundle) r5
            r6 = 0
            r8[r6] = r5
            goto L_0x0470
        L_0x044a:
            boolean r6 = r5 instanceof android.os.Parcelable[]
            if (r6 == 0) goto L_0x045b
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            int r6 = r5.length
            java.lang.Class<android.os.Bundle[]> r8 = android.os.Bundle[].class
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r6, r8)
            r8 = r5
            android.os.Bundle[] r8 = (android.os.Bundle[]) r8
            goto L_0x0470
        L_0x045b:
            boolean r6 = r5 instanceof java.util.ArrayList
            if (r6 == 0) goto L_0x046f
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r6 = r5.size()
            android.os.Bundle[] r6 = new android.os.Bundle[r6]
            java.lang.Object[] r5 = r5.toArray(r6)
            r8 = r5
            android.os.Bundle[] r8 = (android.os.Bundle[]) r8
            goto L_0x0470
        L_0x046f:
            r8 = 0
        L_0x0470:
            if (r8 == 0) goto L_0x0475
            r12.putParcelableArray(r4, r8)
        L_0x0475:
            int r3 = r3 + 1
            goto L_0x042a
        L_0x0478:
            r8 = 0
        L_0x0479:
            int r1 = r14.size()
            if (r8 >= r1) goto L_0x04e2
            java.lang.Object r1 = r14.get(r8)
            android.os.Bundle r1 = (android.os.Bundle) r1
            if (r8 == 0) goto L_0x048c
            java.lang.String r2 = "_ep"
            r9 = r20
            goto L_0x0490
        L_0x048c:
            r9 = r20
            r2 = r21
        L_0x0490:
            r1.putString(r0, r9)
            if (r26 == 0) goto L_0x049f
            com.google.android.gms.measurement.internal.p4 r3 = r7.f7899a
            com.google.android.gms.measurement.internal.n9 r3 = r3.mo35191N()
            android.os.Bundle r1 = r3.mo35153u0(r1)
        L_0x049f:
            r12 = r1
            com.google.android.gms.measurement.internal.t r15 = new com.google.android.gms.measurement.internal.t
            com.google.android.gms.measurement.internal.r r3 = new com.google.android.gms.measurement.internal.r
            r3.<init>(r12)
            r1 = r15
            r4 = r20
            r5 = r22
            r1.<init>(r2, r3, r4, r5)
            com.google.android.gms.measurement.internal.p4 r1 = r7.f7899a
            com.google.android.gms.measurement.internal.d8 r1 = r1.mo35189L()
            r5 = r28
            r1.mo34831o(r15, r5)
            if (r16 != 0) goto L_0x04df
            java.util.Set<q5.r> r1 = r7.f8142e
            java.util.Iterator r15 = r1.iterator()
        L_0x04c2:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x04df
            java.lang.Object r1 = r15.next()
            q5.r r1 = (p201q5.C9271r) r1
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r12)
            r2 = r20
            r3 = r21
            r5 = r22
            r1.mo35286s(r2, r3, r4, r5)
            r5 = r28
            goto L_0x04c2
        L_0x04df:
            int r8 = r8 + 1
            goto L_0x0479
        L_0x04e2:
            com.google.android.gms.measurement.internal.p4 r0 = r7.f7899a
            r0.mo34924d()
            com.google.android.gms.measurement.internal.p4 r0 = r7.f7899a
            com.google.android.gms.measurement.internal.c7 r0 = r0.mo35188K()
            r1 = 0
            com.google.android.gms.measurement.internal.v6 r0 = r0.mo34791t(r1)
            if (r0 == 0) goto L_0x0512
            r1 = r21
            boolean r0 = r13.equals(r1)
            if (r0 == 0) goto L_0x0512
            com.google.android.gms.measurement.internal.p4 r0 = r7.f7899a
            com.google.android.gms.measurement.internal.s8 r0 = r0.mo35190M()
            com.google.android.gms.measurement.internal.p4 r1 = r7.f7899a
            y4.e r1 = r1.mo34922c()
            long r1 = r1.mo33548b()
            com.google.android.gms.measurement.internal.q8 r0 = r0.f8205e
            r3 = 1
            r0.mo35267d(r3, r3, r1)
        L_0x0512:
            return
        L_0x0513:
            com.google.android.gms.measurement.internal.p4 r0 = r7.f7899a
            com.google.android.gms.measurement.internal.l3 r0 = r0.mo34920b()
            com.google.android.gms.measurement.internal.j3 r0 = r0.mo35074q()
            java.lang.String r1 = "Event not sent since app measurement is disabled"
            r0.mo35037a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C6264q6.mo35259w(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    /* renamed from: x */
    public final void mo35260x(C9271r rVar) {
        mo35413i();
        C9713p.m20275j(rVar);
        if (!this.f8142e.add(rVar)) {
            this.f7899a.mo34920b().mo35080w().mo35037a("OnEventListener already registered");
        }
    }

    /* renamed from: y */
    public final void mo35261y(long j) {
        this.f8144g.set((Object) null);
        this.f7899a.mo34919a().mo35110z(new C6351y5(this, j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final void mo35262z(long j, boolean z) {
        mo34778h();
        mo35413i();
        this.f7899a.mo34920b().mo35074q().mo35037a("Resetting analytics data (FE)");
        C6288s8 M = this.f7899a.mo35190M();
        M.mo34778h();
        M.f8205e.mo35264a();
        boolean o = this.f7899a.mo35204o();
        C6360z3 F = this.f7899a.mo35184F();
        F.f8435e.mo35385b(j);
        if (!TextUtils.isEmpty(F.f7899a.mo35184F().f8450t.mo35400a())) {
            F.f8450t.mo35401b((String) null);
        }
        C5678bd.m8845b();
        C6147g z2 = F.f7899a.mo35211z();
        C6359z2<Boolean> z2Var = C6084a3.f7589k0;
        if (z2.mo34873B((String) null, z2Var)) {
            F.f8445o.mo35385b(0);
        }
        if (!F.f7899a.mo35211z().mo34876E()) {
            F.mo35428t(!o);
        }
        F.f8451u.mo35401b((String) null);
        F.f8452v.mo35385b(0);
        F.f8453w.mo35313b((Bundle) null);
        if (z) {
            this.f7899a.mo35189L().mo34833q();
        }
        C5678bd.m8845b();
        if (this.f7899a.mo35211z().mo34873B((String) null, z2Var)) {
            this.f7899a.mo35190M().f8204d.mo35283a();
        }
        this.f8152o = !o;
    }
}
