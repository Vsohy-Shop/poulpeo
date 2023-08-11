package p436tf;

/* renamed from: tf.a */
/* compiled from: Ranges.kt */
final class C13521a implements C13522b<Float> {

    /* renamed from: b */
    private final float f21764b;

    /* renamed from: c */
    private final float f21765c;

    public C13521a(float f, float f2) {
        this.f21764b = f;
        this.f21765c = f2;
    }

    /* renamed from: a */
    public boolean mo53134a(float f) {
        if (f < this.f21764b || f > this.f21765c) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo53135b(Comparable comparable, Comparable comparable2) {
        return mo53139e(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }

    /* renamed from: c */
    public Float getEndInclusive() {
        return Float.valueOf(this.f21765c);
    }

    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return mo53134a(((Number) comparable).floatValue());
    }

    /* renamed from: d */
    public Float getStart() {
        return Float.valueOf(this.f21764b);
    }

    /* renamed from: e */
    public boolean mo53139e(float f, float f2) {
        if (f <= f2) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (!(obj instanceof C13521a)) {
            return false;
        }
        if (!isEmpty() || !((C13521a) obj).isEmpty()) {
            C13521a aVar = (C13521a) obj;
            if (this.f21764b == aVar.f21764b) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
            if (this.f21765c == aVar.f21765c) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.valueOf(this.f21764b).hashCode() * 31) + Float.valueOf(this.f21765c).hashCode();
    }

    public boolean isEmpty() {
        if (this.f21764b > this.f21765c) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.f21764b + ".." + this.f21765c;
    }
}
