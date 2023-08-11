package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.t6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C5969t6 implements C5688c6 {
    @GuardedBy("SharedPreferencesLoader.class")

    /* renamed from: b */
    private static final Map<String, C5969t6> f7391b = new ArrayMap();

    /* renamed from: a */
    private final SharedPreferences f7392a;

    /* renamed from: a */
    static C5969t6 m9966a(Context context, String str) {
        C5969t6 t6Var;
        if (!C5968t5.m9965a()) {
            synchronized (C5969t6.class) {
                t6Var = f7391b.get((Object) null);
                if (t6Var == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        throw null;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
            }
            return t6Var;
        }
        throw null;
    }

    /* renamed from: b */
    static synchronized void m9967b() {
        synchronized (C5969t6.class) {
            Map<String, C5969t6> map = f7391b;
            Iterator<C5969t6> it = map.values().iterator();
            if (!it.hasNext()) {
                map.clear();
            } else {
                SharedPreferences sharedPreferences = it.next().f7392a;
                throw null;
            }
        }
    }

    /* renamed from: B */
    public final Object mo33752B(String str) {
        throw null;
    }
}
