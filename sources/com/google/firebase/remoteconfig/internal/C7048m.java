package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Date;

/* renamed from: com.google.firebase.remoteconfig.internal.m */
/* compiled from: ConfigMetadataClient */
public class C7048m {

    /* renamed from: d */
    static final Date f9476d = new Date(-1);
    @VisibleForTesting

    /* renamed from: e */
    static final Date f9477e = new Date(-1);

    /* renamed from: a */
    private final SharedPreferences f9478a;

    /* renamed from: b */
    private final Object f9479b = new Object();

    /* renamed from: c */
    private final Object f9480c = new Object();

    /* renamed from: com.google.firebase.remoteconfig.internal.m$a */
    /* compiled from: ConfigMetadataClient */
    static class C7049a {

        /* renamed from: a */
        private int f9481a;

        /* renamed from: b */
        private Date f9482b;

        C7049a(int i, Date date) {
            this.f9481a = i;
            this.f9482b = date;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Date mo40072a() {
            return this.f9482b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo40073b() {
            return this.f9481a;
        }
    }

    public C7048m(SharedPreferences sharedPreferences) {
        this.f9478a = sharedPreferences;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C7049a mo40062a() {
        C7049a aVar;
        synchronized (this.f9480c) {
            aVar = new C7049a(this.f9478a.getInt("num_failed_fetches", 0), new Date(this.f9478a.getLong("backoff_end_time_in_millis", -1)));
        }
        return aVar;
    }

    /* renamed from: b */
    public long mo40063b() {
        return this.f9478a.getLong("fetch_timeout_in_seconds", 60);
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: c */
    public String mo40064c() {
        return this.f9478a.getString("last_fetch_etag", (String) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Date mo40065d() {
        return new Date(this.f9478a.getLong("last_fetch_time_in_millis", -1));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo40066e() {
        mo40067f(0, f9477e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo40067f(int i, Date date) {
        synchronized (this.f9480c) {
            this.f9478a.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo40068g(String str) {
        synchronized (this.f9479b) {
            this.f9478a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo40069h() {
        synchronized (this.f9479b) {
            this.f9478a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo40070i(Date date) {
        synchronized (this.f9479b) {
            this.f9478a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo40071j() {
        synchronized (this.f9479b) {
            this.f9478a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}
