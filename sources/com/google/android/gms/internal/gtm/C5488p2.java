package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.VisibleForTesting;
import java.util.Random;
import p231t4.C9713p;

/* renamed from: com.google.android.gms.internal.gtm.p2 */
public final class C5488p2 {

    /* renamed from: a */
    private final Context f6231a;

    /* renamed from: b */
    private final Random f6232b;

    /* renamed from: c */
    private final String f6233c;

    public C5488p2(Context context, String str) {
        this(context, str, new Random());
    }

    /* renamed from: a */
    private final long m8338a(long j, long j2) {
        SharedPreferences f = m8339f();
        long max = Math.max(0, f.getLong("FORBIDDEN_COUNT", 0));
        return (long) (this.f6232b.nextFloat() * ((float) (j + ((long) ((((float) max) / ((float) ((max + Math.max(0, f.getLong("SUCCESSFUL_COUNT", 0))) + 1))) * ((float) (j2 - j)))))));
    }

    /* renamed from: f */
    private final SharedPreferences m8339f() {
        String str;
        Context context = this.f6231a;
        String valueOf = String.valueOf(this.f6233c);
        if (valueOf.length() != 0) {
            str = "v5_gtmContainerRefreshPolicy_".concat(valueOf);
        } else {
            str = new String("v5_gtmContainerRefreshPolicy_");
        }
        return context.getSharedPreferences(str, 0);
    }

    /* renamed from: b */
    public final long mo33445b() {
        return m8338a(7200000, 259200000) + 43200000;
    }

    /* renamed from: c */
    public final long mo33446c() {
        return m8338a(600000, 86400000) + 3600000;
    }

    /* renamed from: d */
    public final void mo33447d() {
        long j;
        SharedPreferences f = m8339f();
        long j2 = f.getLong("FORBIDDEN_COUNT", 0);
        long j3 = f.getLong("SUCCESSFUL_COUNT", 0);
        SharedPreferences.Editor edit = f.edit();
        if (j2 == 0) {
            j = 3;
        } else {
            j = Math.min(10, j2 + 1);
        }
        long max = Math.max(0, Math.min(j3, 10 - j));
        edit.putLong("FORBIDDEN_COUNT", j);
        edit.putLong("SUCCESSFUL_COUNT", max);
        edit.apply();
    }

    /* renamed from: e */
    public final void mo33448e() {
        SharedPreferences f = m8339f();
        long j = f.getLong("SUCCESSFUL_COUNT", 0);
        long j2 = f.getLong("FORBIDDEN_COUNT", 0);
        long min = Math.min(10, j + 1);
        long max = Math.max(0, Math.min(j2, 10 - min));
        SharedPreferences.Editor edit = f.edit();
        edit.putLong("SUCCESSFUL_COUNT", min);
        edit.putLong("FORBIDDEN_COUNT", max);
        edit.apply();
    }

    /* renamed from: g */
    public final long mo33449g() {
        if (Math.max(0, m8339f().getLong("FORBIDDEN_COUNT", 0)) == 0) {
            return 0;
        }
        return m8338a(10000, 600000) + 10000;
    }

    /* renamed from: h */
    public final boolean mo33450h() {
        if (Math.max(0, m8339f().getLong("FORBIDDEN_COUNT", 0)) > 0) {
            return true;
        }
        return false;
    }

    @VisibleForTesting
    private C5488p2(Context context, String str, Random random) {
        this.f6231a = (Context) C9713p.m20275j(context);
        this.f6233c = (String) C9713p.m20275j(str);
        this.f6232b = random;
    }
}
