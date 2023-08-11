package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p231t4.C9705n;
import p231t4.C9713p;
import p231t4.C9722s;
import p286y4.C10682p;

/* renamed from: com.google.firebase.h */
/* compiled from: FirebaseOptions */
public final class C6935h {

    /* renamed from: a */
    private final String f9153a;

    /* renamed from: b */
    private final String f9154b;

    /* renamed from: c */
    private final String f9155c;

    /* renamed from: d */
    private final String f9156d;

    /* renamed from: e */
    private final String f9157e;

    /* renamed from: f */
    private final String f9158f;

    /* renamed from: g */
    private final String f9159g;

    private C6935h(@NonNull String str, @NonNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        C9713p.m20279n(!C10682p.m22709a(str), "ApplicationId must be set.");
        this.f9154b = str;
        this.f9153a = str2;
        this.f9155c = str3;
        this.f9156d = str4;
        this.f9157e = str5;
        this.f9158f = str6;
        this.f9159g = str7;
    }

    @Nullable
    /* renamed from: a */
    public static C6935h m12092a(@NonNull Context context) {
        C9722s sVar = new C9722s(context);
        String a = sVar.mo44248a("google_app_id");
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        return new C6935h(a, sVar.mo44248a("google_api_key"), sVar.mo44248a("firebase_database_url"), sVar.mo44248a("ga_trackingId"), sVar.mo44248a("gcm_defaultSenderId"), sVar.mo44248a("google_storage_bucket"), sVar.mo44248a("project_id"));
    }

    @NonNull
    /* renamed from: b */
    public String mo39784b() {
        return this.f9153a;
    }

    @NonNull
    /* renamed from: c */
    public String mo39785c() {
        return this.f9154b;
    }

    @Nullable
    /* renamed from: d */
    public String mo39786d() {
        return this.f9157e;
    }

    @Nullable
    /* renamed from: e */
    public String mo39787e() {
        return this.f9159g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6935h)) {
            return false;
        }
        C6935h hVar = (C6935h) obj;
        if (!C9705n.m20259b(this.f9154b, hVar.f9154b) || !C9705n.m20259b(this.f9153a, hVar.f9153a) || !C9705n.m20259b(this.f9155c, hVar.f9155c) || !C9705n.m20259b(this.f9156d, hVar.f9156d) || !C9705n.m20259b(this.f9157e, hVar.f9157e) || !C9705n.m20259b(this.f9158f, hVar.f9158f) || !C9705n.m20259b(this.f9159g, hVar.f9159g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C9705n.m20260c(this.f9154b, this.f9153a, this.f9155c, this.f9156d, this.f9157e, this.f9158f, this.f9159g);
    }

    public String toString() {
        return C9705n.m20261d(this).mo44228a("applicationId", this.f9154b).mo44228a("apiKey", this.f9153a).mo44228a("databaseUrl", this.f9155c).mo44228a("gcmSenderId", this.f9157e).mo44228a("storageBucket", this.f9158f).mo44228a("projectId", this.f9159g).toString();
    }
}
