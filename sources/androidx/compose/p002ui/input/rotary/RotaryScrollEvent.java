package androidx.compose.p002ui.input.rotary;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRotaryScrollEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RotaryScrollEvent.kt\nandroidx/compose/ui/input/rotary/RotaryScrollEvent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n1#2:60\n*E\n"})
/* renamed from: androidx.compose.ui.input.rotary.RotaryScrollEvent */
/* compiled from: RotaryScrollEvent.kt */
public final class RotaryScrollEvent {
    public static final int $stable = 0;
    private final float horizontalScrollPixels;
    private final long uptimeMillis;
    private final float verticalScrollPixels;

    public RotaryScrollEvent(float f, float f2, long j) {
        this.verticalScrollPixels = f;
        this.horizontalScrollPixels = f2;
        this.uptimeMillis = j;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (!(obj instanceof RotaryScrollEvent)) {
            return false;
        }
        RotaryScrollEvent rotaryScrollEvent = (RotaryScrollEvent) obj;
        if (rotaryScrollEvent.verticalScrollPixels == this.verticalScrollPixels) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (rotaryScrollEvent.horizontalScrollPixels == this.horizontalScrollPixels) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || rotaryScrollEvent.uptimeMillis != this.uptimeMillis) {
            return false;
        }
        return true;
    }

    public final float getHorizontalScrollPixels() {
        return this.horizontalScrollPixels;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public final float getVerticalScrollPixels() {
        return this.verticalScrollPixels;
    }

    public int hashCode() {
        return (((Float.hashCode(this.verticalScrollPixels) * 31) + Float.hashCode(this.horizontalScrollPixels)) * 31) + Long.hashCode(this.uptimeMillis);
    }

    public String toString() {
        return "RotaryScrollEvent(verticalScrollPixels=" + this.verticalScrollPixels + ",horizontalScrollPixels=" + this.horizontalScrollPixels + ",uptimeMillis=" + this.uptimeMillis + ')';
    }
}
