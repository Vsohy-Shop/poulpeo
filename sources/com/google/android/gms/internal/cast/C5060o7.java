package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import p150l4.C8675b;

@MainThread
/* renamed from: com.google.android.gms.internal.cast.o7 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final class C5060o7 {

    /* renamed from: j */
    private static final C8675b f5433j = new C8675b("ApplicationAnalyticsSession");

    /* renamed from: k */
    public static long f5434k = System.currentTimeMillis();

    /* renamed from: a */
    public String f5435a;
    @Nullable

    /* renamed from: b */
    public String f5436b;

    /* renamed from: c */
    public long f5437c = f5434k;

    /* renamed from: d */
    public int f5438d = 1;

    /* renamed from: e */
    public String f5439e;

    /* renamed from: f */
    public int f5440f;

    /* renamed from: g */
    public String f5441g;

    /* renamed from: h */
    public boolean f5442h;

    /* renamed from: i */
    public int f5443i;

    private C5060o7(boolean z) {
        this.f5442h = z;
    }

    /* renamed from: a */
    public static C5060o7 m7301a(boolean z) {
        C5060o7 o7Var = new C5060o7(z);
        f5434k++;
        return o7Var;
    }

    @Nullable
    /* renamed from: b */
    public static C5060o7 m7302b(@Nullable SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return null;
        }
        C5060o7 o7Var = new C5060o7(sharedPreferences.getBoolean("is_app_backgrounded", false));
        if (!sharedPreferences.contains("application_id")) {
            return null;
        }
        o7Var.f5435a = sharedPreferences.getString("application_id", "");
        if (!sharedPreferences.contains("receiver_metrics_id")) {
            return null;
        }
        o7Var.f5436b = sharedPreferences.getString("receiver_metrics_id", "");
        if (!sharedPreferences.contains("analytics_session_id")) {
            return null;
        }
        o7Var.f5437c = sharedPreferences.getLong("analytics_session_id", 0);
        if (!sharedPreferences.contains("event_sequence_number")) {
            return null;
        }
        o7Var.f5438d = sharedPreferences.getInt("event_sequence_number", 0);
        if (!sharedPreferences.contains("receiver_session_id")) {
            return null;
        }
        o7Var.f5439e = sharedPreferences.getString("receiver_session_id", "");
        o7Var.f5440f = sharedPreferences.getInt("device_capabilities", 0);
        o7Var.f5441g = sharedPreferences.getString("device_model_name", "");
        o7Var.f5443i = sharedPreferences.getInt("analytics_session_start_type", 0);
        return o7Var;
    }

    /* renamed from: c */
    public final void mo32914c(@Nullable SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            f5433j.mo42754a("Save the ApplicationAnalyticsSession to SharedPreferences %s", sharedPreferences);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("application_id", this.f5435a);
            edit.putString("receiver_metrics_id", this.f5436b);
            edit.putLong("analytics_session_id", this.f5437c);
            edit.putInt("event_sequence_number", this.f5438d);
            edit.putString("receiver_session_id", this.f5439e);
            edit.putInt("device_capabilities", this.f5440f);
            edit.putString("device_model_name", this.f5441g);
            edit.putInt("analytics_session_start_type", this.f5443i);
            edit.putBoolean("is_app_backgrounded", this.f5442h);
            edit.apply();
        }
    }
}
