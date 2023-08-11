package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import java.util.Map;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.c2 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C6106c2 extends C6107c3 {

    /* renamed from: b */
    private final Map<String, Long> f7665b = new ArrayMap();

    /* renamed from: c */
    private final Map<String, Integer> f7666c = new ArrayMap();

    /* renamed from: d */
    private long f7667d;

    public C6106c2(C6251p4 p4Var) {
        super(p4Var);
    }

    /* renamed from: i */
    static /* synthetic */ void m10481i(C6106c2 c2Var, String str, long j) {
        c2Var.mo34778h();
        C9713p.m20271f(str);
        if (c2Var.f7666c.isEmpty()) {
            c2Var.f7667d = j;
        }
        Integer num = c2Var.f7666c.get(str);
        if (num != null) {
            c2Var.f7666c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (c2Var.f7666c.size() >= 100) {
            c2Var.f7899a.mo34920b().mo35080w().mo35037a("Too many ads visible");
        } else {
            c2Var.f7666c.put(str, 1);
            c2Var.f7665b.put(str, Long.valueOf(j));
        }
    }

    /* renamed from: j */
    static /* synthetic */ void m10482j(C6106c2 c2Var, String str, long j) {
        c2Var.mo34778h();
        C9713p.m20271f(str);
        Integer num = c2Var.f7666c.get(str);
        if (num != null) {
            C6319v6 t = c2Var.f7899a.mo35188K().mo34791t(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                c2Var.f7666c.remove(str);
                Long l = c2Var.f7665b.get(str);
                if (l == null) {
                    c2Var.f7899a.mo34920b().mo35075r().mo35037a("First ad unit exposure time was never set");
                } else {
                    long longValue = l.longValue();
                    c2Var.f7665b.remove(str);
                    c2Var.m10485p(str, j - longValue, t);
                }
                if (c2Var.f7666c.isEmpty()) {
                    long j2 = c2Var.f7667d;
                    if (j2 == 0) {
                        c2Var.f7899a.mo34920b().mo35075r().mo35037a("First ad exposure time was never set");
                        return;
                    }
                    c2Var.m10484o(j - j2, t);
                    c2Var.f7667d = 0;
                    return;
                }
                return;
            }
            c2Var.f7666c.put(str, Integer.valueOf(intValue));
            return;
        }
        c2Var.f7899a.mo34920b().mo35075r().mo35038b("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    @WorkerThread
    /* renamed from: o */
    private final void m10484o(long j, C6319v6 v6Var) {
        if (v6Var == null) {
            this.f7899a.mo34920b().mo35079v().mo35037a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            this.f7899a.mo34920b().mo35079v().mo35038b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            C6234n9.m10936x(v6Var, bundle, true);
            this.f7899a.mo35186I().mo35257u("am", "_xa", bundle);
        }
    }

    @WorkerThread
    /* renamed from: p */
    private final void m10485p(String str, long j, C6319v6 v6Var) {
        if (v6Var == null) {
            this.f7899a.mo34920b().mo35079v().mo35037a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            this.f7899a.mo34920b().mo35079v().mo35038b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            C6234n9.m10936x(v6Var, bundle, true);
            this.f7899a.mo35186I().mo35257u("am", "_xu", bundle);
        }
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: q */
    public final void m10486q(long j) {
        for (String put : this.f7665b.keySet()) {
            this.f7665b.put(put, Long.valueOf(j));
        }
        if (!this.f7665b.isEmpty()) {
            this.f7667d = j;
        }
    }

    /* renamed from: l */
    public final void mo34775l(String str, long j) {
        if (str == null || str.length() == 0) {
            this.f7899a.mo34920b().mo35075r().mo35037a("Ad unit id must be a non-empty string");
        } else {
            this.f7899a.mo34919a().mo35110z(new C6080a(this, str, j));
        }
    }

    /* renamed from: m */
    public final void mo34776m(String str, long j) {
        if (str == null || str.length() == 0) {
            this.f7899a.mo34920b().mo35075r().mo35037a("Ad unit id must be a non-empty string");
        } else {
            this.f7899a.mo34919a().mo35110z(new C6081a0(this, str, j));
        }
    }

    @WorkerThread
    /* renamed from: n */
    public final void mo34777n(long j) {
        C6319v6 t = this.f7899a.mo35188K().mo34791t(false);
        for (String next : this.f7665b.keySet()) {
            m10485p(next, j - this.f7665b.get(next).longValue(), t);
        }
        if (!this.f7665b.isEmpty()) {
            m10484o(j - this.f7667d, t);
        }
        m10486q(j);
    }
}
