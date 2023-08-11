package androidx.compose.p002ui.graphics.vector;

import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.graphics.vector.VectorProperty */
/* compiled from: VectorPainter.kt */
public abstract class VectorProperty<T> {
    public static final int $stable = 0;

    @StabilityInferred(parameters = 0)
    /* renamed from: androidx.compose.ui.graphics.vector.VectorProperty$Fill */
    /* compiled from: VectorPainter.kt */
    public static final class Fill extends VectorProperty<Brush> {
        public static final int $stable = 0;
        public static final Fill INSTANCE = new Fill();

        private Fill() {
            super((DefaultConstructorMarker) null);
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: androidx.compose.ui.graphics.vector.VectorProperty$FillAlpha */
    /* compiled from: VectorPainter.kt */
    public static final class FillAlpha extends VectorProperty<Float> {
        public static final int $stable = 0;
        public static final FillAlpha INSTANCE = new FillAlpha();

        private FillAlpha() {
            super((DefaultConstructorMarker) null);
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: androidx.compose.ui.graphics.vector.VectorProperty$PathData */
    /* compiled from: VectorPainter.kt */
    public static final class PathData extends VectorProperty<List<? extends PathNode>> {
        public static final int $stable = 0;
        public static final PathData INSTANCE = new PathData();

        private PathData() {
            super((DefaultConstructorMarker) null);
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: androidx.compose.ui.graphics.vector.VectorProperty$PivotX */
    /* compiled from: VectorPainter.kt */
    public static final class PivotX extends VectorProperty<Float> {
        public static final int $stable = 0;
        public static final PivotX INSTANCE = new PivotX();

        private PivotX() {
            super((DefaultConstructorMarker) null);
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: androidx.compose.ui.graphics.vector.VectorProperty$PivotY */
    /* compiled from: VectorPainter.kt */
    public static final class PivotY extends VectorProperty<Float> {
        public static final int $stable = 0;
        public static final PivotY INSTANCE = new PivotY();

        private PivotY() {
            super((DefaultConstructorMarker) null);
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: androidx.compose.ui.graphics.vector.VectorProperty$Rotation */
    /* compiled from: VectorPainter.kt */
    public static final class Rotation extends VectorProperty<Float> {
        public static final int $stable = 0;
        public static final Rotation INSTANCE = new Rotation();

        private Rotation() {
            super((DefaultConstructorMarker) null);
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: androidx.compose.ui.graphics.vector.VectorProperty$ScaleX */
    /* compiled from: VectorPainter.kt */
    public static final class ScaleX extends VectorProperty<Float> {
        public static final int $stable = 0;
        public static final ScaleX INSTANCE = new ScaleX();

        private ScaleX() {
            super((DefaultConstructorMarker) null);
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: androidx.compose.ui.graphics.vector.VectorProperty$ScaleY */
    /* compiled from: VectorPainter.kt */
    public static final class ScaleY extends VectorProperty<Float> {
        public static final int $stable = 0;
        public static final ScaleY INSTANCE = new ScaleY();

        private ScaleY() {
            super((DefaultConstructorMarker) null);
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: androidx.compose.ui.graphics.vector.VectorProperty$Stroke */
    /* compiled from: VectorPainter.kt */
    public static final class Stroke extends VectorProperty<Brush> {
        public static final int $stable = 0;
        public static final Stroke INSTANCE = new Stroke();

        private Stroke() {
            super((DefaultConstructorMarker) null);
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: androidx.compose.ui.graphics.vector.VectorProperty$StrokeAlpha */
    /* compiled from: VectorPainter.kt */
    public static final class StrokeAlpha extends VectorProperty<Float> {
        public static final int $stable = 0;
        public static final StrokeAlpha INSTANCE = new StrokeAlpha();

        private StrokeAlpha() {
            super((DefaultConstructorMarker) null);
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: androidx.compose.ui.graphics.vector.VectorProperty$StrokeLineWidth */
    /* compiled from: VectorPainter.kt */
    public static final class StrokeLineWidth extends VectorProperty<Float> {
        public static final int $stable = 0;
        public static final StrokeLineWidth INSTANCE = new StrokeLineWidth();

        private StrokeLineWidth() {
            super((DefaultConstructorMarker) null);
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: androidx.compose.ui.graphics.vector.VectorProperty$TranslateX */
    /* compiled from: VectorPainter.kt */
    public static final class TranslateX extends VectorProperty<Float> {
        public static final int $stable = 0;
        public static final TranslateX INSTANCE = new TranslateX();

        private TranslateX() {
            super((DefaultConstructorMarker) null);
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: androidx.compose.ui.graphics.vector.VectorProperty$TranslateY */
    /* compiled from: VectorPainter.kt */
    public static final class TranslateY extends VectorProperty<Float> {
        public static final int $stable = 0;
        public static final TranslateY INSTANCE = new TranslateY();

        private TranslateY() {
            super((DefaultConstructorMarker) null);
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: androidx.compose.ui.graphics.vector.VectorProperty$TrimPathEnd */
    /* compiled from: VectorPainter.kt */
    public static final class TrimPathEnd extends VectorProperty<Float> {
        public static final int $stable = 0;
        public static final TrimPathEnd INSTANCE = new TrimPathEnd();

        private TrimPathEnd() {
            super((DefaultConstructorMarker) null);
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: androidx.compose.ui.graphics.vector.VectorProperty$TrimPathOffset */
    /* compiled from: VectorPainter.kt */
    public static final class TrimPathOffset extends VectorProperty<Float> {
        public static final int $stable = 0;
        public static final TrimPathOffset INSTANCE = new TrimPathOffset();

        private TrimPathOffset() {
            super((DefaultConstructorMarker) null);
        }
    }

    @StabilityInferred(parameters = 0)
    /* renamed from: androidx.compose.ui.graphics.vector.VectorProperty$TrimPathStart */
    /* compiled from: VectorPainter.kt */
    public static final class TrimPathStart extends VectorProperty<Float> {
        public static final int $stable = 0;
        public static final TrimPathStart INSTANCE = new TrimPathStart();

        private TrimPathStart() {
            super((DefaultConstructorMarker) null);
        }
    }

    private VectorProperty() {
    }

    public /* synthetic */ VectorProperty(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
