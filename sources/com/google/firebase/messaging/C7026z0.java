package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.ContextCompat;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.messaging.z0 */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
class C7026z0 {

    /* renamed from: a */
    final SharedPreferences f9381a;

    /* renamed from: com.google.firebase.messaging.z0$a */
    /* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
    static class C7027a {

        /* renamed from: d */
        private static final long f9382d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a */
        final String f9383a;

        /* renamed from: b */
        final String f9384b;

        /* renamed from: c */
        final long f9385c;

        private C7027a(String str, String str2, long j) {
            this.f9383a = str;
            this.f9384b = str2;
            this.f9385c = j;
        }

        /* renamed from: a */
        static String m12449a(String str, String str2, long j) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j);
                return jSONObject.toString();
            } catch (JSONException e) {
                Log.w("FirebaseMessaging", "Failed to encode token: ".concat(e.toString()));
                return null;
            }
        }

        /* renamed from: c */
        static C7027a m12450c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new C7027a(str, (String) null, 0);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new C7027a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e) {
                Log.w("FirebaseMessaging", "Failed to parse token: ".concat(e.toString()));
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo40011b(String str) {
            if (System.currentTimeMillis() > this.f9385c + f9382d || !str.equals(this.f9384b)) {
                return true;
            }
            return false;
        }
    }

    public C7026z0(Context context) {
        this.f9381a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        m12442a(context, "com.google.android.gms.appid-no-backup");
    }

    /* renamed from: a */
    private void m12442a(Context context, String str) {
        String str2;
        File file = new File(ContextCompat.getNoBackupFilesDir(context), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !mo40009f()) {
                    Log.i("FirebaseMessaging", "App restored, clearing state");
                    mo40006c();
                }
            } catch (IOException e) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    String valueOf = String.valueOf(e.getMessage());
                    if (valueOf.length() != 0) {
                        str2 = "Error creating file in no backup dir: ".concat(valueOf);
                    } else {
                        str2 = new String("Error creating file in no backup dir: ");
                    }
                    Log.d("FirebaseMessaging", str2);
                }
            }
        }
    }

    /* renamed from: b */
    private String m12443b(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|*");
        return sb.toString();
    }

    /* renamed from: c */
    public synchronized void mo40006c() {
        this.f9381a.edit().clear().commit();
    }

    /* renamed from: d */
    public synchronized void mo40007d(String str, String str2) {
        String b = m12443b(str, str2);
        SharedPreferences.Editor edit = this.f9381a.edit();
        edit.remove(b);
        edit.commit();
    }

    /* renamed from: e */
    public synchronized C7027a mo40008e(String str, String str2) {
        return C7027a.m12450c(this.f9381a.getString(m12443b(str, str2), (String) null));
    }

    /* renamed from: f */
    public synchronized boolean mo40009f() {
        return this.f9381a.getAll().isEmpty();
    }

    /* renamed from: g */
    public synchronized void mo40010g(String str, String str2, String str3, String str4) {
        String a = C7027a.m12449a(str3, str4, System.currentTimeMillis());
        if (a != null) {
            SharedPreferences.Editor edit = this.f9381a.edit();
            edit.putString(m12443b(str, str2), a);
            edit.commit();
        }
    }
}
