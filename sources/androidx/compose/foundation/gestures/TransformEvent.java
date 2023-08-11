package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Transformable.kt */
abstract class TransformEvent {

    @StabilityInferred(parameters = 0)
    /* compiled from: Transformable.kt */
    public static final class TransformDelta extends TransformEvent {
        public static final int $stable = 0;
        private final long panChange;
        private final float rotationChange;
        private final float zoomChange;

        public /* synthetic */ TransformDelta(float f, long j, float f2, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, j, f2);
        }

        /* renamed from: getPanChange-F1C5BW0  reason: not valid java name */
        public final long m33149getPanChangeF1C5BW0() {
            return this.panChange;
        }

        public final float getRotationChange() {
            return this.rotationChange;
        }

        public final float getZoomChange() {
            return this.zoomChange;
        }

        private TransformDelta(float f, long j, float f2) {
            super((DefaultConstructorMarker) null);
            this.zoomChange = f;
            this.panChange = j;
            this.rotationChange = f2;
        }
    }

    @StabilityInferred(parameters = 0)
    /* compiled from: Transformable.kt */
    public static final class TransformStarted extends TransformEvent {
        public static final int $stable = 0;
        public static final TransformStarted INSTANCE = new TransformStarted();

        private TransformStarted() {
            super((DefaultConstructorMarker) null);
        }
    }

    @StabilityInferred(parameters = 0)
    /* compiled from: Transformable.kt */
    public static final class TransformStopped extends TransformEvent {
        public static final int $stable = 0;
        public static final TransformStopped INSTANCE = new TransformStopped();

        private TransformStopped() {
            super((DefaultConstructorMarker) null);
        }
    }

    private TransformEvent() {
    }

    public /* synthetic */ TransformEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
