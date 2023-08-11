package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: MutableCounter.kt */
public final class DeltaCounter {
    private int count;

    public DeltaCounter() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ DeltaCounter copy$default(DeltaCounter deltaCounter, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = deltaCounter.count;
        }
        return deltaCounter.copy(i);
    }

    public final int component1() {
        return this.count;
    }

    public final DeltaCounter copy(int i) {
        return new DeltaCounter(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof DeltaCounter) && this.count == ((DeltaCounter) obj).count) {
            return true;
        }
        return false;
    }

    public final int getCount() {
        return this.count;
    }

    public int hashCode() {
        return Integer.hashCode(this.count);
    }

    public final void plusAssign(int i) {
        this.count += i;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public String toString() {
        return "DeltaCounter(count=" + this.count + ')';
    }

    public DeltaCounter(int i) {
        this.count = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DeltaCounter(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
