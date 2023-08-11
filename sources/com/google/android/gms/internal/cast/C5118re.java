package com.google.android.gms.internal.cast;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.cast.re */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
final class C5118re {

    /* renamed from: c */
    private static final C5118re f5514c = new C5118re();

    /* renamed from: a */
    private final C5186ve f5515a = new C4843be();

    /* renamed from: b */
    private final ConcurrentMap f5516b = new ConcurrentHashMap();

    private C5118re() {
    }

    /* renamed from: a */
    public static C5118re m7436a() {
        return f5514c;
    }

    /* renamed from: b */
    public final C5169ue mo32992b(Class cls) {
        C5032md.m7199f(cls, "messageType");
        C5169ue ueVar = (C5169ue) this.f5516b.get(cls);
        if (ueVar == null) {
            ueVar = this.f5515a.mo32648a(cls);
            C5032md.m7199f(cls, "messageType");
            C5032md.m7199f(ueVar, "schema");
            C5169ue ueVar2 = (C5169ue) this.f5516b.putIfAbsent(cls, ueVar);
            if (ueVar2 == null) {
                return ueVar;
            }
            return ueVar2;
        }
        return ueVar;
    }
}
