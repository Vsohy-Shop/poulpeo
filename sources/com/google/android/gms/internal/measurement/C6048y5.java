package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Handler;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.y5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C6048y5 implements C5688c6 {
    @GuardedBy("ConfigurationContentLoader.class")

    /* renamed from: g */
    private static final Map<Uri, C6048y5> f7477g = new ArrayMap();

    /* renamed from: h */
    public static final String[] f7478h = {"key", "value"};

    /* renamed from: a */
    private final ContentResolver f7479a;

    /* renamed from: b */
    private final Uri f7480b;

    /* renamed from: c */
    private final ContentObserver f7481c;

    /* renamed from: d */
    private final Object f7482d = new Object();

    /* renamed from: e */
    private volatile Map<String, String> f7483e;
    @GuardedBy("this")

    /* renamed from: f */
    private final List<C6064z5> f7484f = new ArrayList();

    private C6048y5(ContentResolver contentResolver, Uri uri) {
        C6016w5 w5Var = new C6016w5(this, (Handler) null);
        this.f7481c = w5Var;
        contentResolver.getClass();
        uri.getClass();
        this.f7479a = contentResolver;
        this.f7480b = uri;
        contentResolver.registerContentObserver(uri, false, w5Var);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0016 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.measurement.C6048y5 m10297a(android.content.ContentResolver r4, android.net.Uri r5) {
        /*
            java.lang.Class<com.google.android.gms.internal.measurement.y5> r0 = com.google.android.gms.internal.measurement.C6048y5.class
            monitor-enter(r0)
            java.util.Map<android.net.Uri, com.google.android.gms.internal.measurement.y5> r1 = f7477g     // Catch:{ all -> 0x0018 }
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0018 }
            com.google.android.gms.internal.measurement.y5 r2 = (com.google.android.gms.internal.measurement.C6048y5) r2     // Catch:{ all -> 0x0018 }
            if (r2 != 0) goto L_0x0016
            com.google.android.gms.internal.measurement.y5 r3 = new com.google.android.gms.internal.measurement.y5     // Catch:{ SecurityException -> 0x0016 }
            r3.<init>(r4, r5)     // Catch:{ SecurityException -> 0x0016 }
            r1.put(r5, r3)     // Catch:{ SecurityException -> 0x0015 }
        L_0x0015:
            r2 = r3
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            return r2
        L_0x0018:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C6048y5.m10297a(android.content.ContentResolver, android.net.Uri):com.google.android.gms.internal.measurement.y5");
    }

    /* renamed from: d */
    static synchronized void m10298d() {
        synchronized (C6048y5.class) {
            for (C6048y5 next : f7477g.values()) {
                next.f7479a.unregisterContentObserver(next.f7481c);
            }
            f7477g.clear();
        }
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ Object mo33752B(String str) {
        return mo34636b().get(str);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final Map<String, String> mo34636b() {
        Map<String, String> map;
        Map<String, String> map2 = this.f7483e;
        if (map2 == null) {
            synchronized (this.f7482d) {
                map2 = this.f7483e;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map = (Map) C5654a6.m8760a(new C6000v5(this));
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                        try {
                            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            map = null;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                            throw th;
                        }
                    }
                    this.f7483e = map;
                    map2 = map;
                }
            }
        }
        if (map2 != null) {
            return map2;
        }
        return Collections.emptyMap();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ Map mo34637c() {
        Map map;
        Cursor query = this.f7479a.query(this.f7480b, f7478h, (String) null, (String[]) null, (String) null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                map = new ArrayMap(count);
            } else {
                map = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                map.put(query.getString(0), query.getString(1));
            }
            query.close();
            return map;
        } finally {
            query.close();
        }
    }

    /* renamed from: e */
    public final void mo34638e() {
        synchronized (this.f7482d) {
            this.f7483e = null;
            C5953s6.m9871e();
        }
        synchronized (this) {
            for (C6064z5 zza : this.f7484f) {
                zza.zza();
            }
        }
    }
}
