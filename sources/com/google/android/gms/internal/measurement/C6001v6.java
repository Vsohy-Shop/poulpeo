package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.v6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
final class C6001v6<T> extends C6033x6<T> {

    /* renamed from: b */
    static final C6001v6<Object> f7430b = new C6001v6<>();

    private C6001v6() {
    }

    /* renamed from: a */
    public final T mo34545a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    /* renamed from: b */
    public final boolean mo34546b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
