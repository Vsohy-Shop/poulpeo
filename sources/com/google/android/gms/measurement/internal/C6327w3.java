package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import androidx.core.location.LocationRequestCompat;
import p201q5.C9260g;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.measurement.internal.w3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C6327w3 {

    /* renamed from: a */
    final String f8349a;

    /* renamed from: b */
    private final String f8350b;

    /* renamed from: c */
    private final String f8351c;

    /* renamed from: d */
    private final long f8352d;

    /* renamed from: e */
    final /* synthetic */ C6360z3 f8353e;

    /* synthetic */ C6327w3(C6360z3 z3Var, String str, long j, C9260g gVar) {
        boolean z;
        this.f8353e = z3Var;
        C9713p.m20271f("health_monitor");
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        C9713p.m20266a(z);
        this.f8349a = "health_monitor:start";
        this.f8350b = "health_monitor:count";
        this.f8351c = "health_monitor:value";
        this.f8352d = j;
    }

    @WorkerThread
    /* renamed from: c */
    private final long m11204c() {
        return this.f8353e.mo35423o().getLong(this.f8349a, 0);
    }

    @WorkerThread
    /* renamed from: d */
    private final void m11205d() {
        this.f8353e.mo34778h();
        long a = this.f8353e.f7899a.mo34922c().mo33547a();
        SharedPreferences.Editor edit = this.f8353e.mo35423o().edit();
        edit.remove(this.f8350b);
        edit.remove(this.f8351c);
        edit.putLong(this.f8349a, a);
        edit.apply();
    }

    @WorkerThread
    /* renamed from: a */
    public final Pair<String, Long> mo35393a() {
        long j;
        this.f8353e.mo34778h();
        this.f8353e.mo34778h();
        long c = m11204c();
        if (c == 0) {
            m11205d();
            j = 0;
        } else {
            j = Math.abs(c - this.f8353e.f7899a.mo34922c().mo33547a());
        }
        long j2 = this.f8352d;
        if (j < j2) {
            return null;
        }
        if (j > j2 + j2) {
            m11205d();
            return null;
        }
        String string = this.f8353e.mo35423o().getString(this.f8351c, (String) null);
        long j3 = this.f8353e.mo35423o().getLong(this.f8350b, 0);
        m11205d();
        if (string == null || j3 <= 0) {
            return C6360z3.f8432x;
        }
        return new Pair<>(string, Long.valueOf(j3));
    }

    @WorkerThread
    /* renamed from: b */
    public final void mo35394b(String str, long j) {
        this.f8353e.mo34778h();
        if (m11204c() == 0) {
            m11205d();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.f8353e.mo35423o().getLong(this.f8350b, 0);
        if (j2 <= 0) {
            SharedPreferences.Editor edit = this.f8353e.mo35423o().edit();
            edit.putString(this.f8351c, str);
            edit.putLong(this.f8350b, 1);
            edit.apply();
            return;
        }
        long nextLong = this.f8353e.f7899a.mo35191N().mo35151t().nextLong();
        long j3 = j2 + 1;
        long j4 = LocationRequestCompat.PASSIVE_INTERVAL / j3;
        SharedPreferences.Editor edit2 = this.f8353e.mo35423o().edit();
        if ((LocationRequestCompat.PASSIVE_INTERVAL & nextLong) < j4) {
            edit2.putString(this.f8351c, str);
        }
        edit2.putLong(this.f8350b, j3);
        edit2.apply();
    }
}
