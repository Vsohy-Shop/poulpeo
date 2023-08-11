package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Draggable.kt */
abstract class DragEvent {

    @StabilityInferred(parameters = 0)
    /* compiled from: Draggable.kt */
    public static final class DragCancelled extends DragEvent {
        public static final int $stable = 0;
        public static final DragCancelled INSTANCE = new DragCancelled();

        private DragCancelled() {
            super((DefaultConstructorMarker) null);
        }
    }

    @StabilityInferred(parameters = 0)
    /* compiled from: Draggable.kt */
    public static final class DragDelta extends DragEvent {
        public static final int $stable = 0;
        private final long delta;

        public /* synthetic */ DragDelta(long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(j);
        }

        /* renamed from: getDelta-F1C5BW0  reason: not valid java name */
        public final long m33043getDeltaF1C5BW0() {
            return this.delta;
        }

        private DragDelta(long j) {
            super((DefaultConstructorMarker) null);
            this.delta = j;
        }
    }

    @StabilityInferred(parameters = 0)
    /* compiled from: Draggable.kt */
    public static final class DragStarted extends DragEvent {
        public static final int $stable = 0;
        private final long startPoint;

        public /* synthetic */ DragStarted(long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(j);
        }

        /* renamed from: getStartPoint-F1C5BW0  reason: not valid java name */
        public final long m33044getStartPointF1C5BW0() {
            return this.startPoint;
        }

        private DragStarted(long j) {
            super((DefaultConstructorMarker) null);
            this.startPoint = j;
        }
    }

    @StabilityInferred(parameters = 0)
    /* compiled from: Draggable.kt */
    public static final class DragStopped extends DragEvent {
        public static final int $stable = 0;
        private final long velocity;

        public /* synthetic */ DragStopped(long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(j);
        }

        /* renamed from: getVelocity-9UxMQ8M  reason: not valid java name */
        public final long m33045getVelocity9UxMQ8M() {
            return this.velocity;
        }

        private DragStopped(long j) {
            super((DefaultConstructorMarker) null);
            this.velocity = j;
        }
    }

    private DragEvent() {
    }

    public /* synthetic */ DragEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
