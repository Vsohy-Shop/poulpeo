package com.google.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.protobuf.a1 */
/* compiled from: Protobuf */
final class C7059a1 {

    /* renamed from: c */
    private static final C7059a1 f9518c = new C7059a1();

    /* renamed from: a */
    private final C7082f1 f9519a = new C7098h0();

    /* renamed from: b */
    private final ConcurrentMap<Class<?>, C7076e1<?>> f9520b = new ConcurrentHashMap();

    private C7059a1() {
    }

    /* renamed from: a */
    public static C7059a1 m12782a() {
        return f9518c;
    }

    /* renamed from: b */
    public <T> void mo40160b(T t, C7071d1 d1Var, C7139o oVar) {
        mo40163e(t).mo40278e(t, d1Var, oVar);
    }

    /* renamed from: c */
    public C7076e1<?> mo40161c(Class<?> cls, C7076e1<?> e1Var) {
        C7196z.m13945b(cls, "messageType");
        C7196z.m13945b(e1Var, "schema");
        return this.f9520b.putIfAbsent(cls, e1Var);
    }

    /* renamed from: d */
    public <T> C7076e1<T> mo40162d(Class<T> cls) {
        C7196z.m13945b(cls, "messageType");
        C7076e1<T> e1Var = this.f9520b.get(cls);
        if (e1Var != null) {
            return e1Var;
        }
        C7076e1<T> a = this.f9519a.mo40302a(cls);
        C7076e1<?> c = mo40161c(cls, a);
        if (c != null) {
            return c;
        }
        return a;
    }

    /* renamed from: e */
    public <T> C7076e1<T> mo40163e(T t) {
        return mo40162d(t.getClass());
    }
}
