package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.measurement.ga */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
final class C5760ga {

    /* renamed from: c */
    private static final C5760ga f6959c = new C5760ga();

    /* renamed from: a */
    private final C5828ka f6960a = new C5908p9();

    /* renamed from: b */
    private final ConcurrentMap<Class<?>, C5811ja<?>> f6961b = new ConcurrentHashMap();

    private C5760ga() {
    }

    /* renamed from: a */
    public static C5760ga m9295a() {
        return f6959c;
    }

    /* renamed from: b */
    public final <T> C5811ja<T> mo34052b(Class<T> cls) {
        C5708d9.m9019f(cls, "messageType");
        C5811ja<T> jaVar = this.f6961b.get(cls);
        if (jaVar == null) {
            jaVar = this.f6960a.mo34143a(cls);
            C5708d9.m9019f(cls, "messageType");
            C5708d9.m9019f(jaVar, "schema");
            C5811ja<T> putIfAbsent = this.f6961b.putIfAbsent(cls, jaVar);
            if (putIfAbsent == null) {
                return jaVar;
            }
            return putIfAbsent;
        }
        return jaVar;
    }
}
