package com.google.android.gms.internal.cast;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.cast.uf */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
abstract class C5170uf {

    /* renamed from: a */
    final Unsafe f5556a;

    C5170uf(Unsafe unsafe) {
        this.f5556a = unsafe;
    }

    /* renamed from: a */
    public abstract double mo33000a(Object obj, long j);

    /* renamed from: b */
    public abstract float mo33001b(Object obj, long j);

    /* renamed from: c */
    public abstract void mo33002c(Object obj, long j, boolean z);

    /* renamed from: d */
    public abstract void mo33003d(Object obj, long j, byte b);

    /* renamed from: e */
    public abstract void mo33004e(Object obj, long j, double d);

    /* renamed from: f */
    public abstract void mo33005f(Object obj, long j, float f);

    /* renamed from: g */
    public abstract boolean mo33006g(Object obj, long j);

    /* renamed from: h */
    public final int mo33022h(Class cls) {
        return this.f5556a.arrayBaseOffset(cls);
    }

    /* renamed from: i */
    public final int mo33023i(Class cls) {
        return this.f5556a.arrayIndexScale(cls);
    }

    /* renamed from: j */
    public final int mo33024j(Object obj, long j) {
        return this.f5556a.getInt(obj, j);
    }

    /* renamed from: k */
    public final long mo33025k(Object obj, long j) {
        return this.f5556a.getLong(obj, j);
    }

    /* renamed from: l */
    public final long mo33026l(Field field) {
        return this.f5556a.objectFieldOffset(field);
    }

    /* renamed from: m */
    public final Object mo33027m(Object obj, long j) {
        return this.f5556a.getObject(obj, j);
    }

    /* renamed from: n */
    public final void mo33028n(Object obj, long j, int i) {
        this.f5556a.putInt(obj, j, i);
    }

    /* renamed from: o */
    public final void mo33029o(Object obj, long j, long j2) {
        this.f5556a.putLong(obj, j, j2);
    }

    /* renamed from: p */
    public final void mo33030p(Object obj, long j, Object obj2) {
        this.f5556a.putObject(obj, j, obj2);
    }
}
