package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.BinderThread;
import androidx.compose.animation.core.AnimationKt;
import com.google.android.gms.common.C4785c;
import com.google.android.gms.internal.measurement.C5664b;
import com.google.android.gms.internal.measurement.C5683c1;
import com.google.android.gms.internal.measurement.C5713de;
import com.google.android.gms.internal.measurement.zzd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import p180o4.C8976e;
import p201q5.C9256c;
import p201q5.C9267n;
import p231t4.C9713p;
import p286y4.C10683q;

/* renamed from: com.google.android.gms.measurement.internal.i5 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
public final class C6175i5 extends C9256c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C6157g9 f7865a;

    /* renamed from: b */
    private Boolean f7866b;

    /* renamed from: c */
    private String f7867c = null;

    public C6175i5(C6157g9 g9Var, String str) {
        C9713p.m20275j(g9Var);
        this.f7865a = g9Var;
    }

    @BinderThread
    /* renamed from: G */
    private final void m10691G(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.f7866b == null) {
                        if (!"com.google.android.gms".equals(this.f7867c) && !C10683q.m22710a(this.f7865a.mo34927f(), Binder.getCallingUid())) {
                            if (!C8976e.m18220a(this.f7865a.mo34927f()).mo43153c(Binder.getCallingUid())) {
                                z2 = false;
                                this.f7866b = Boolean.valueOf(z2);
                            }
                        }
                        z2 = true;
                        this.f7866b = Boolean.valueOf(z2);
                    }
                    if (this.f7866b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.f7865a.mo34920b().mo35075r().mo35038b("Measurement Service called with invalid calling package. appId", C6206l3.m10862z(str));
                    throw e;
                }
            }
            if (this.f7867c == null && C4785c.m6705l(this.f7865a.mo34927f(), Binder.getCallingUid(), str)) {
                this.f7867c = str;
            }
            if (!str.equals(this.f7867c)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.f7865a.mo34920b().mo35075r().mo35037a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public final void m10692J(C6290t tVar, C6289s9 s9Var) {
        this.f7865a.mo34926e();
        this.f7865a.mo34933i(tVar, s9Var);
    }

    @BinderThread
    /* renamed from: h3 */
    private final void m10695h3(C6289s9 s9Var, boolean z) {
        C9713p.m20275j(s9Var);
        C9713p.m20271f(s9Var.f8207b);
        m10691G(s9Var.f8207b, false);
        this.f7865a.mo34930g0().mo35125K(s9Var.f8208c, s9Var.f8223r, s9Var.f8227v);
    }

    @BinderThread
    /* renamed from: A2 */
    public final void mo34967A2(C6290t tVar, String str, String str2) {
        C9713p.m20275j(tVar);
        C9713p.m20271f(str);
        m10691G(str, true);
        mo34972g3(new C6109c5(this, tVar, str));
    }

    @BinderThread
    /* renamed from: D0 */
    public final void mo34968D0(C6103c cVar) {
        C9713p.m20275j(cVar);
        C9713p.m20275j(cVar.f7654d);
        C9713p.m20271f(cVar.f7652b);
        m10691G(cVar.f7652b, true);
        mo34972g3(new C6284s4(this, new C6103c(cVar)));
    }

    @BinderThread
    /* renamed from: D1 */
    public final void mo34752D1(C6289s9 s9Var) {
        C9713p.m20271f(s9Var.f8207b);
        C9713p.m20275j(s9Var.f8228w);
        C6086a5 a5Var = new C6086a5(this, s9Var);
        C9713p.m20275j(a5Var);
        if (this.f7865a.mo34919a().mo35105C()) {
            a5Var.run();
        } else {
            this.f7865a.mo34919a().mo35104A(a5Var);
        }
    }

    @BinderThread
    /* renamed from: F0 */
    public final List<C6103c> mo34753F0(String str, String str2, String str3) {
        m10691G(str, true);
        try {
            return (List) this.f7865a.mo34919a().mo35107s(new C6339x4(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f7865a.mo34920b().mo35075r().mo35038b("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }

    @BinderThread
    /* renamed from: G1 */
    public final void mo34754G1(long j, String str, String str2, String str3) {
        mo34972g3(new C6164h5(this, str2, str3, str, j));
    }

    @BinderThread
    /* renamed from: J1 */
    public final List<C6190j9> mo34755J1(String str, String str2, boolean z, C6289s9 s9Var) {
        m10695h3(s9Var, false);
        String str3 = s9Var.f8207b;
        C9713p.m20275j(str3);
        try {
            List<C6212l9> list = (List) this.f7865a.mo34919a().mo35107s(new C6295t4(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C6212l9 l9Var : list) {
                if (z || !C6234n9.m10921V(l9Var.f7962c)) {
                    arrayList.add(new C6190j9(l9Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f7865a.mo34920b().mo35075r().mo35039c("Failed to query user properties. appId", C6206l3.m10862z(s9Var.f8207b), e);
            return Collections.emptyList();
        }
    }

    @BinderThread
    /* renamed from: R */
    public final void mo34756R(Bundle bundle, C6289s9 s9Var) {
        m10695h3(s9Var, false);
        String str = s9Var.f8207b;
        C9713p.m20275j(str);
        mo34972g3(new C6262q4(this, str, bundle));
    }

    @BinderThread
    /* renamed from: S0 */
    public final byte[] mo34757S0(C6290t tVar, String str) {
        C9713p.m20271f(str);
        C9713p.m20275j(tVar);
        m10691G(str, true);
        this.f7865a.mo34920b().mo35074q().mo35038b("Log and bundle. event", this.f7865a.mo34915W().mo34899d(tVar.f8229b));
        long nanoTime = this.f7865a.mo34922c().nanoTime() / AnimationKt.MillisToNanos;
        try {
            byte[] bArr = (byte[]) this.f7865a.mo34919a().mo35108t(new C6120d5(this, tVar, str)).get();
            if (bArr == null) {
                this.f7865a.mo34920b().mo35075r().mo35038b("Log and bundle returned null. appId", C6206l3.m10862z(str));
                bArr = new byte[0];
            }
            this.f7865a.mo34920b().mo35074q().mo35040d("Log and bundle processed. event, size, time_ms", this.f7865a.mo34915W().mo34899d(tVar.f8229b), Integer.valueOf(bArr.length), Long.valueOf((this.f7865a.mo34922c().nanoTime() / AnimationKt.MillisToNanos) - nanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.f7865a.mo34920b().mo35075r().mo35040d("Failed to log and bundle. appId, event, error", C6206l3.m10862z(str), this.f7865a.mo34915W().mo34899d(tVar.f8229b), e);
            return null;
        }
    }

    @BinderThread
    /* renamed from: X */
    public final void mo34758X(C6103c cVar, C6289s9 s9Var) {
        C9713p.m20275j(cVar);
        C9713p.m20275j(cVar.f7654d);
        m10695h3(s9Var, false);
        C6103c cVar2 = new C6103c(cVar);
        cVar2.f7652b = s9Var.f8207b;
        mo34972g3(new C6273r4(this, cVar2, s9Var));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b3 */
    public final C6290t mo34969b3(C6290t tVar, C6289s9 s9Var) {
        C6268r rVar;
        if (!(!"_cmp".equals(tVar.f8229b) || (rVar = tVar.f8230c) == null || rVar.mo35269A() == 0)) {
            String K = tVar.f8230c.mo35274K("_cis");
            if ("referrer broadcast".equals(K) || "referrer API".equals(K)) {
                this.f7865a.mo34920b().mo35078u().mo35038b("Event has been filtered ", tVar.toString());
                return new C6290t("_cmpx", tVar.f8230c, tVar.f8231d, tVar.f8232e);
            }
        }
        return tVar;
    }

    @BinderThread
    /* renamed from: e1 */
    public final void mo34759e1(C6289s9 s9Var) {
        m10695h3(s9Var, false);
        mo34972g3(new C6153g5(this, s9Var));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e3 */
    public final void mo34970e3(C6290t tVar, C6289s9 s9Var) {
        if (!this.f7865a.mo34918Z().mo35047u(s9Var.f8207b)) {
            m10692J(tVar, s9Var);
            return;
        }
        this.f7865a.mo34920b().mo35079v().mo35038b("EES config found for", s9Var.f8207b);
        C6185j4 Z = this.f7865a.mo34918Z();
        String str = s9Var.f8207b;
        C5713de.m9057b();
        C5683c1 c1Var = null;
        if (Z.f7899a.mo35211z().mo34873B((String) null, C6084a3.f7611v0) && !TextUtils.isEmpty(str)) {
            c1Var = Z.f7896i.get(str);
        }
        if (c1Var != null) {
            try {
                Map<String, Object> K = this.f7865a.mo34928f0().mo34992K(tVar.f8230c.mo35270G(), true);
                String a = C9267n.m19029a(tVar.f8229b);
                if (a == null) {
                    a = tVar.f8229b;
                }
                if (c1Var.mo33735e(new C5664b(a, tVar.f8232e, K))) {
                    if (c1Var.mo33737g()) {
                        this.f7865a.mo34920b().mo35079v().mo35038b("EES edited event", tVar.f8229b);
                        m10692J(this.f7865a.mo34928f0().mo34986B(c1Var.mo33731a().mo33724b()), s9Var);
                    } else {
                        m10692J(tVar, s9Var);
                    }
                    if (c1Var.mo33736f()) {
                        for (C5664b next : c1Var.mo33731a().mo33725c()) {
                            this.f7865a.mo34920b().mo35079v().mo35038b("EES logging created event", next.mo33681d());
                            m10692J(this.f7865a.mo34928f0().mo34986B(next), s9Var);
                        }
                        return;
                    }
                    return;
                }
            } catch (zzd unused) {
                this.f7865a.mo34920b().mo35075r().mo35039c("EES error. appId, eventName", s9Var.f8208c, tVar.f8229b);
            }
            this.f7865a.mo34920b().mo35079v().mo35038b("EES was not applied to event", tVar.f8229b);
            m10692J(tVar, s9Var);
            return;
        }
        this.f7865a.mo34920b().mo35079v().mo35038b("EES not loaded for", s9Var.f8207b);
        m10692J(tVar, s9Var);
    }

    @BinderThread
    /* renamed from: f0 */
    public final List<C6190j9> mo34760f0(String str, String str2, String str3, boolean z) {
        m10691G(str, true);
        try {
            List<C6212l9> list = (List) this.f7865a.mo34919a().mo35107s(new C6317v4(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C6212l9 l9Var : list) {
                if (z || !C6234n9.m10921V(l9Var.f7962c)) {
                    arrayList.add(new C6190j9(l9Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f7865a.mo34920b().mo35075r().mo35039c("Failed to get user properties as. appId", C6206l3.m10862z(str), e);
            return Collections.emptyList();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f3 */
    public final /* synthetic */ void mo34971f3(String str, Bundle bundle) {
        C6180j V = this.f7865a.mo34914V();
        V.mo34778h();
        V.mo35406i();
        byte[] j = V.f8374b.mo34928f0().mo34987C(new C6235o(V.f7899a, "", str, "dep", 0, 0, bundle)).mo34044j();
        V.f7899a.mo34920b().mo35079v().mo35039c("Saving default event parameters, appId, data size", V.f7899a.mo35182D().mo34899d(str), Integer.valueOf(j.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", j);
        try {
            if (V.mo35005R().insertWithOnConflict("default_event_params", (String) null, contentValues, 5) == -1) {
                V.f7899a.mo34920b().mo35075r().mo35038b("Failed to insert default event parameters (got -1). appId", C6206l3.m10862z(str));
            }
        } catch (SQLiteException e) {
            V.f7899a.mo34920b().mo35075r().mo35039c("Error storing default event parameters. appId", C6206l3.m10862z(str), e);
        }
    }

    @BinderThread
    /* renamed from: g1 */
    public final List<C6103c> mo34761g1(String str, String str2, C6289s9 s9Var) {
        m10695h3(s9Var, false);
        String str3 = s9Var.f8207b;
        C9713p.m20275j(str3);
        try {
            return (List) this.f7865a.mo34919a().mo35107s(new C6328w4(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f7865a.mo34920b().mo35075r().mo35038b("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g3 */
    public final void mo34972g3(Runnable runnable) {
        C9713p.m20275j(runnable);
        if (this.f7865a.mo34919a().mo35105C()) {
            runnable.run();
        } else {
            this.f7865a.mo34919a().mo35110z(runnable);
        }
    }

    @BinderThread
    /* renamed from: i0 */
    public final void mo34762i0(C6289s9 s9Var) {
        C9713p.m20271f(s9Var.f8207b);
        m10691G(s9Var.f8207b, false);
        mo34972g3(new C6350y4(this, s9Var));
    }

    @BinderThread
    /* renamed from: r1 */
    public final void mo34763r1(C6289s9 s9Var) {
        m10695h3(s9Var, false);
        mo34972g3(new C6361z4(this, s9Var));
    }

    @BinderThread
    /* renamed from: v0 */
    public final String mo34764v0(C6289s9 s9Var) {
        m10695h3(s9Var, false);
        return this.f7865a.mo34934i0(s9Var);
    }

    @BinderThread
    /* renamed from: x2 */
    public final List<C6190j9> mo34765x2(C6289s9 s9Var, boolean z) {
        m10695h3(s9Var, false);
        String str = s9Var.f8207b;
        C9713p.m20275j(str);
        try {
            List<C6212l9> list = (List) this.f7865a.mo34919a().mo35107s(new C6142f5(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C6212l9 l9Var : list) {
                if (z || !C6234n9.m10921V(l9Var.f7962c)) {
                    arrayList.add(new C6190j9(l9Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f7865a.mo34920b().mo35075r().mo35039c("Failed to get user properties. appId", C6206l3.m10862z(s9Var.f8207b), e);
            return null;
        }
    }

    @BinderThread
    /* renamed from: y2 */
    public final void mo34766y2(C6190j9 j9Var, C6289s9 s9Var) {
        C9713p.m20275j(j9Var);
        m10695h3(s9Var, false);
        mo34972g3(new C6131e5(this, j9Var, s9Var));
    }

    @BinderThread
    /* renamed from: z1 */
    public final void mo34767z1(C6290t tVar, C6289s9 s9Var) {
        C9713p.m20275j(tVar);
        m10695h3(s9Var, false);
        mo34972g3(new C6098b5(this, tVar, s9Var));
    }
}
