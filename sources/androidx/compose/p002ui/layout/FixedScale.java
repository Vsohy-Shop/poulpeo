package androidx.compose.p002ui.layout;

import androidx.compose.runtime.Immutable;

@Immutable
/* renamed from: androidx.compose.ui.layout.FixedScale */
/* compiled from: ContentScale.kt */
public final class FixedScale implements ContentScale {
    public static final int $stable = 0;
    private final float value;

    public FixedScale(float f) {
        this.value = f;
    }

    public static /* synthetic */ FixedScale copy$default(FixedScale fixedScale, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = fixedScale.value;
        }
        return fixedScale.copy(f);
    }

    public final float component1() {
        return this.value;
    }

    /* renamed from: computeScaleFactor-H7hwNQA  reason: not valid java name */
    public long m37324computeScaleFactorH7hwNQA(long j, long j2) {
        float f = this.value;
        return ScaleFactorKt.ScaleFactor(f, f);
    }

    public final FixedScale copy(float f) {
        return new FixedScale(f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof FixedScale) && Float.compare(this.value, ((FixedScale) obj).value) == 0) {
            return true;
        }
        return false;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return Float.hashCode(this.value);
    }

    public String toString() {
        return "FixedScale(value=" + this.value + ')';
    }
}
