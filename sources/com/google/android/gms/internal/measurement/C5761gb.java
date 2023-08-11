package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.gb */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
abstract class C5761gb {

    /* renamed from: a */
    final Unsafe f6962a;

    C5761gb(Unsafe unsafe) {
        this.f6962a = unsafe;
    }

    /* renamed from: a */
    public abstract double mo33938a(Object obj, long j);

    /* renamed from: b */
    public abstract float mo33939b(Object obj, long j);

    /* renamed from: c */
    public abstract void mo33940c(Object obj, long j, boolean z);

    /* renamed from: d */
    public abstract void mo33941d(Object obj, long j, byte b);

    /* renamed from: e */
    public abstract void mo33942e(Object obj, long j, double d);

    /* renamed from: f */
    public abstract void mo33943f(Object obj, long j, float f);

    /* renamed from: g */
    public abstract boolean mo33944g(Object obj, long j);

    /* renamed from: h */
    public final int mo34053h(Class<?> cls) {
        return this.f6962a.arrayBaseOffset(cls);
    }

    /* renamed from: i */
    public final int mo34054i(Class<?> cls) {
        return this.f6962a.arrayIndexScale(cls);
    }

    /* renamed from: j */
    public final int mo34055j(Object obj, long j) {
        return this.f6962a.getInt(obj, j);
    }

    /* renamed from: k */
    public final long mo34056k(Object obj, long j) {
        return this.f6962a.getLong(obj, j);
    }

    /* renamed from: l */
    public final long mo34057l(Field field) {
        return this.f6962a.objectFieldOffset(field);
    }

    /* renamed from: m */
    public final Object mo34058m(Object obj, long j) {
        return this.f6962a.getObject(obj, j);
    }

    /* renamed from: n */
    public final void mo34059n(Object obj, long j, int i) {
        this.f6962a.putInt(obj, j, i);
    }

    /* renamed from: o */
    public final void mo34060o(Object obj, long j, long j2) {
        this.f6962a.putLong(obj, j, j2);
    }

    /* renamed from: p */
    public final void mo34061p(Object obj, long j, Object obj2) {
        this.f6962a.putObject(obj, j, obj2);
    }
}
