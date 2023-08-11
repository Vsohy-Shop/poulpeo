package p436tf;

import kotlin.jvm.internal.C12775o;

/* renamed from: tf.k */
/* compiled from: Ranges.kt */
class C13536k {
    /* renamed from: a */
    public static final void m30874a(boolean z, Number number) {
        C12775o.m28639i(number, "step");
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
        }
    }

    /* renamed from: b */
    public static C13522b<Float> m30875b(float f, float f2) {
        return new C13521a(f, f2);
    }
}
