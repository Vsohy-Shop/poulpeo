package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.z6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6065z6<T> extends C6033x6<T> {

    /* renamed from: b */
    private final T f7514b;

    C6065z6(T t) {
        this.f7514b = t;
    }

    /* renamed from: a */
    public final T mo34545a() {
        return this.f7514b;
    }

    /* renamed from: b */
    public final boolean mo34546b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6065z6) {
            return this.f7514b.equals(((C6065z6) obj).f7514b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7514b.hashCode() + 1502476572;
    }

    public final String toString() {
        String obj = this.f7514b.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 13);
        sb.append("Optional.of(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
