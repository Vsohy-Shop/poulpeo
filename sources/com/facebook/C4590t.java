package com.facebook;

import android.content.SharedPreferences;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.t */
/* compiled from: ProfileCache.kt */
public final class C4590t {

    /* renamed from: b */
    public static final C4591a f4350b = new C4591a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final SharedPreferences f4351a;

    /* renamed from: com.facebook.t$a */
    /* compiled from: ProfileCache.kt */
    public static final class C4591a {
        private C4591a() {
        }

        public /* synthetic */ C4591a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C4590t() {
        SharedPreferences sharedPreferences = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        C12775o.m28638h(sharedPreferences, "FacebookSdk.getApplicati…ME, Context.MODE_PRIVATE)");
        this.f4351a = sharedPreferences;
    }

    /* renamed from: a */
    public final void mo31784a() {
        this.f4351a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }

    /* renamed from: b */
    public final C4580s mo31785b() {
        String string = this.f4351a.getString("com.facebook.ProfileManager.CachedProfile", (String) null);
        if (string != null) {
            try {
                return new C4580s(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: c */
    public final void mo31786c(C4580s sVar) {
        C12775o.m28639i(sVar, "profile");
        JSONObject e = sVar.mo31727e();
        if (e != null) {
            this.f4351a.edit().putString("com.facebook.ProfileManager.CachedProfile", e.toString()).apply();
        }
    }
}
