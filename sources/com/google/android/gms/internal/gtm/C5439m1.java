package com.google.android.gms.internal.gtm;

import android.content.SharedPreferences;
import android.util.Pair;
import androidx.core.location.LocationRequestCompat;
import java.util.UUID;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.m1 */
public final class C5439m1 {

    /* renamed from: a */
    private final String f6123a;

    /* renamed from: b */
    private final long f6124b;

    /* renamed from: c */
    private final /* synthetic */ C5409k1 f6125c;

    private C5439m1(C5409k1 k1Var, String str, long j) {
        this.f6125c = k1Var;
        C9713p.m20271f(str);
        C9713p.m20266a(j > 0);
        this.f6123a = str;
        this.f6124b = j;
    }

    /* renamed from: b */
    private final void m8170b() {
        long a = this.f6125c.mo33279k0().mo33547a();
        SharedPreferences.Editor edit = this.f6125c.f6078d.edit();
        edit.remove(m8173f());
        edit.remove(m8174g());
        edit.putLong(m8172e(), a);
        edit.commit();
    }

    /* renamed from: d */
    private final long m8171d() {
        return this.f6125c.f6078d.getLong(m8172e(), 0);
    }

    /* renamed from: e */
    private final String m8172e() {
        return String.valueOf(this.f6123a).concat(":start");
    }

    /* renamed from: f */
    private final String m8173f() {
        return String.valueOf(this.f6123a).concat(":count");
    }

    /* renamed from: g */
    private final String m8174g() {
        return String.valueOf(this.f6123a).concat(":value");
    }

    /* renamed from: a */
    public final void mo33346a(String str) {
        boolean z;
        if (m8171d() == 0) {
            m8170b();
        }
        if (str == null) {
            str = "";
        }
        synchronized (this) {
            long j = this.f6125c.f6078d.getLong(m8173f(), 0);
            if (j <= 0) {
                SharedPreferences.Editor edit = this.f6125c.f6078d.edit();
                edit.putString(m8174g(), str);
                edit.putLong(m8173f(), 1);
                edit.apply();
                return;
            }
            long j2 = j + 1;
            if ((UUID.randomUUID().getLeastSignificantBits() & LocationRequestCompat.PASSIVE_INTERVAL) < LocationRequestCompat.PASSIVE_INTERVAL / j2) {
                z = true;
            } else {
                z = false;
            }
            SharedPreferences.Editor edit2 = this.f6125c.f6078d.edit();
            if (z) {
                edit2.putString(m8174g(), str);
            }
            edit2.putLong(m8173f(), j2);
            edit2.apply();
        }
    }

    /* renamed from: c */
    public final Pair<String, Long> mo33347c() {
        long j;
        long d = m8171d();
        if (d == 0) {
            j = 0;
        } else {
            j = Math.abs(d - this.f6125c.mo33279k0().mo33547a());
        }
        long j2 = this.f6124b;
        if (j < j2) {
            return null;
        }
        if (j > (j2 << 1)) {
            m8170b();
            return null;
        }
        String string = this.f6125c.f6078d.getString(m8174g(), (String) null);
        long j3 = this.f6125c.f6078d.getLong(m8173f(), 0);
        m8170b();
        if (string == null || j3 <= 0) {
            return null;
        }
        return new Pair<>(string, Long.valueOf(j3));
    }
}
