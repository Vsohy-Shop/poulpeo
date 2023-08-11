package androidx.compose.p002ui.platform;

/* renamed from: androidx.compose.ui.platform.OpenEndFloatRange */
/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
final class OpenEndFloatRange implements OpenEndRange<Float> {
    private final float _endExclusive;
    private final float _start;

    public OpenEndFloatRange(float f, float f2) {
        this._start = f;
        this._endExclusive = f2;
    }

    private final boolean lessThanOrEquals(float f, float f2) {
        if (f <= f2) {
            return true;
        }
        return false;
    }

    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return contains(((Number) comparable).floatValue());
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (!(obj instanceof OpenEndFloatRange)) {
            return false;
        }
        if (!isEmpty() || !((OpenEndFloatRange) obj).isEmpty()) {
            OpenEndFloatRange openEndFloatRange = (OpenEndFloatRange) obj;
            if (this._start == openEndFloatRange._start) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
            if (this._endExclusive == openEndFloatRange._endExclusive) {
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
        return (Float.hashCode(this._start) * 31) + Float.hashCode(this._endExclusive);
    }

    public boolean isEmpty() {
        if (this._start >= this._endExclusive) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this._start + "..<" + this._endExclusive;
    }

    public boolean contains(float f) {
        return f >= this._start && f < this._endExclusive;
    }

    public Float getEndExclusive() {
        return Float.valueOf(this._endExclusive);
    }

    public Float getStart() {
        return Float.valueOf(this._start);
    }
}
