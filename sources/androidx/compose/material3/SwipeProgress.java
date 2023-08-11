package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.C12775o;

@Immutable
@ExperimentalMaterial3Api
/* compiled from: Swipeable.kt */
public final class SwipeProgress<T> {
    private final float fraction;
    private final T from;

    /* renamed from: to */
    private final T f255to;

    public SwipeProgress(T t, T t2, float f) {
        this.from = t;
        this.f255to = t2;
        this.fraction = f;
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwipeProgress)) {
            return false;
        }
        SwipeProgress swipeProgress = (SwipeProgress) obj;
        if (!C12775o.m28634d(this.from, swipeProgress.from) || !C12775o.m28634d(this.f255to, swipeProgress.f255to)) {
            return false;
        }
        if (this.fraction == swipeProgress.fraction) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    public final float getFraction() {
        return this.fraction;
    }

    public final T getFrom() {
        return this.from;
    }

    public final T getTo() {
        return this.f255to;
    }

    public int hashCode() {
        int i;
        T t = this.from;
        int i2 = 0;
        if (t != null) {
            i = t.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        T t2 = this.f255to;
        if (t2 != null) {
            i2 = t2.hashCode();
        }
        return ((i3 + i2) * 31) + Float.hashCode(this.fraction);
    }

    public String toString() {
        return "SwipeProgress(from=" + this.from + ", to=" + this.f255to + ", fraction=" + this.fraction + ')';
    }
}
