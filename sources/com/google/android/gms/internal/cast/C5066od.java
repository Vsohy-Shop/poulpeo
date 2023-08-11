package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p150l4.C8675b;
import p231t4.C9713p;
import p286y4.C10671e;
import p286y4.C10674h;

@MainThread
/* renamed from: com.google.android.gms.internal.cast.od */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final class C5066od {

    /* renamed from: j */
    private static final C8675b f5447j = new C8675b("FeatureUsageAnalytics");

    /* renamed from: k */
    private static final String f5448k = "21.2.0";
    @Nullable

    /* renamed from: l */
    private static C5066od f5449l;

    /* renamed from: a */
    private final C4952i1 f5450a;

    /* renamed from: b */
    private final SharedPreferences f5451b;

    /* renamed from: c */
    private final String f5452c;

    /* renamed from: d */
    private final Runnable f5453d = new C5116rc(this);

    /* renamed from: e */
    private final Handler f5454e = new C4968j0(Looper.getMainLooper());

    /* renamed from: f */
    private final Set f5455f = new HashSet();

    /* renamed from: g */
    private final Set f5456g = new HashSet();

    /* renamed from: h */
    private final C10671e f5457h = C10674h.m22680c();

    /* renamed from: i */
    private long f5458i;

    private C5066od(SharedPreferences sharedPreferences, C4952i1 i1Var, String str) {
        this.f5451b = sharedPreferences;
        this.f5450a = i1Var;
        this.f5452c = str;
    }

    /* renamed from: a */
    public static synchronized C5066od m7336a(SharedPreferences sharedPreferences, C4952i1 i1Var, String str) {
        C5066od odVar;
        synchronized (C5066od.class) {
            if (f5449l == null) {
                f5449l = new C5066od(sharedPreferences, i1Var, str);
            }
            odVar = f5449l;
        }
        return odVar;
    }

    /* renamed from: b */
    static String m7337b(String str, String str2) {
        return String.format("%s%s", new Object[]{str, str2});
    }

    /* renamed from: c */
    public static /* synthetic */ void m7338c(C5066od odVar) {
        long j;
        if (!odVar.f5455f.isEmpty()) {
            if (true != odVar.f5456g.equals(odVar.f5455f)) {
                j = 86400000;
            } else {
                j = 172800000;
            }
            long f = odVar.m7340f();
            long j2 = odVar.f5458i;
            if (j2 == 0 || f - j2 >= j) {
                f5447j.mo42754a("Upload the feature usage report.", new Object[0]);
                C4891e8 y = C4908f8.m6974y();
                y.mo32763o(f5448k);
                y.mo32762i(odVar.f5452c);
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(odVar.f5455f);
                C5230y7 y2 = C5247z7.m7723y();
                y2.mo33059i(arrayList);
                y2.mo33060o((C4908f8) y.mo32643e());
                C5061o8 z = C5095q8.m7384z();
                z.mo32917p((C5247z7) y2.mo32643e());
                odVar.f5450a.mo32841d((C5095q8) z.mo32643e(), 243);
                SharedPreferences.Editor edit = odVar.f5451b.edit();
                if (!odVar.f5456g.equals(odVar.f5455f)) {
                    odVar.f5456g.clear();
                    odVar.f5456g.addAll(odVar.f5455f);
                    for (C5009l7 zza : odVar.f5456g) {
                        String num = Integer.toString(zza.zza());
                        String h = odVar.m7342h(num);
                        String b = m7337b("feature_usage_timestamp_reported_feature_", num);
                        if (!TextUtils.equals(h, b)) {
                            long j3 = odVar.f5451b.getLong(h, 0);
                            edit.remove(h);
                            if (j3 != 0) {
                                edit.putLong(b, j3);
                            }
                        }
                    }
                }
                odVar.f5458i = f;
                edit.putLong("feature_usage_last_report_time", f).apply();
            }
        }
    }

    /* renamed from: d */
    public static void m7339d(C5009l7 l7Var) {
        C5066od odVar = f5449l;
        if (odVar != null) {
            odVar.f5451b.edit().putLong(odVar.m7342h(Integer.toString(l7Var.zza())), odVar.m7340f()).apply();
            odVar.f5455f.add(l7Var);
            odVar.m7344j();
        }
    }

    /* renamed from: f */
    private final long m7340f() {
        return ((C10671e) C9713p.m20275j(this.f5457h)).mo33547a();
    }

    /* renamed from: g */
    private static C5009l7 m7341g(String str) {
        try {
            return C5009l7.m7154a(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return C5009l7.DEVELOPER_FEATURE_FLAG_UNKNOWN;
        }
    }

    @RequiresNonNull({"sharedPreferences"})
    /* renamed from: h */
    private final String m7342h(String str) {
        String b = m7337b("feature_usage_timestamp_reported_feature_", str);
        if (this.f5451b.contains(b)) {
            return b;
        }
        return m7337b("feature_usage_timestamp_detected_feature_", str);
    }

    /* renamed from: i */
    private final void m7343i(Set set) {
        if (!set.isEmpty()) {
            SharedPreferences.Editor edit = this.f5451b.edit();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                edit.remove((String) it.next());
            }
            edit.apply();
        }
    }

    @RequiresNonNull({"handler", "reportFeatureUsageRunnable"})
    /* renamed from: j */
    private final void m7344j() {
        this.f5454e.post(this.f5453d);
    }

    /* renamed from: e */
    public final void mo32945e() {
        String string = this.f5451b.getString("feature_usage_sdk_version", (String) null);
        String string2 = this.f5451b.getString("feature_usage_package_name", (String) null);
        this.f5455f.clear();
        this.f5456g.clear();
        this.f5458i = 0;
        if (!f5448k.equals(string) || !this.f5452c.equals(string2)) {
            HashSet hashSet = new HashSet();
            for (String next : this.f5451b.getAll().keySet()) {
                if (next.startsWith("feature_usage_timestamp_")) {
                    hashSet.add(next);
                }
            }
            hashSet.add("feature_usage_last_report_time");
            m7343i(hashSet);
            this.f5451b.edit().putString("feature_usage_sdk_version", f5448k).putString("feature_usage_package_name", this.f5452c).apply();
            return;
        }
        this.f5458i = this.f5451b.getLong("feature_usage_last_report_time", 0);
        long f = m7340f();
        HashSet hashSet2 = new HashSet();
        for (String next2 : this.f5451b.getAll().keySet()) {
            if (next2.startsWith("feature_usage_timestamp_")) {
                long j = this.f5451b.getLong(next2, 0);
                if (j != 0 && f - j > 1209600000) {
                    hashSet2.add(next2);
                } else if (next2.startsWith("feature_usage_timestamp_reported_feature_")) {
                    C5009l7 g = m7341g(next2.substring(41));
                    this.f5456g.add(g);
                    this.f5455f.add(g);
                } else if (next2.startsWith("feature_usage_timestamp_detected_feature_")) {
                    this.f5455f.add(m7341g(next2.substring(41)));
                }
            }
        }
        m7343i(hashSet2);
        C9713p.m20275j(this.f5454e);
        C9713p.m20275j(this.f5453d);
        m7344j();
    }
}
