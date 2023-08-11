package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.graphics.GraphicsLayerScope;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.ConstraintsKt;
import androidx.compose.p002ui.unit.IntSizeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.layout.MeasuringIntrinsics */
/* compiled from: LayoutModifier.kt */
final class MeasuringIntrinsics {
    public static final MeasuringIntrinsics INSTANCE = new MeasuringIntrinsics();

    /* renamed from: androidx.compose.ui.layout.MeasuringIntrinsics$DefaultIntrinsicMeasurable */
    /* compiled from: LayoutModifier.kt */
    private static final class DefaultIntrinsicMeasurable implements Measurable {
        private final IntrinsicMeasurable measurable;
        private final IntrinsicMinMax minMax;
        private final IntrinsicWidthHeight widthHeight;

        public DefaultIntrinsicMeasurable(IntrinsicMeasurable intrinsicMeasurable, IntrinsicMinMax intrinsicMinMax, IntrinsicWidthHeight intrinsicWidthHeight) {
            C12775o.m28639i(intrinsicMeasurable, "measurable");
            C12775o.m28639i(intrinsicMinMax, "minMax");
            C12775o.m28639i(intrinsicWidthHeight, "widthHeight");
            this.measurable = intrinsicMeasurable;
            this.minMax = intrinsicMinMax;
            this.widthHeight = intrinsicWidthHeight;
        }

        public final IntrinsicMeasurable getMeasurable() {
            return this.measurable;
        }

        public final IntrinsicMinMax getMinMax() {
            return this.minMax;
        }

        public Object getParentData() {
            return this.measurable.getParentData();
        }

        public final IntrinsicWidthHeight getWidthHeight() {
            return this.widthHeight;
        }

        public int maxIntrinsicHeight(int i) {
            return this.measurable.maxIntrinsicHeight(i);
        }

        public int maxIntrinsicWidth(int i) {
            return this.measurable.maxIntrinsicWidth(i);
        }

        /* renamed from: measure-BRTryo0  reason: not valid java name */
        public Placeable m37391measureBRTryo0(long j) {
            int i;
            int i2;
            if (this.widthHeight == IntrinsicWidthHeight.Width) {
                if (this.minMax == IntrinsicMinMax.Max) {
                    i2 = this.measurable.maxIntrinsicWidth(Constraints.m38411getMaxHeightimpl(j));
                } else {
                    i2 = this.measurable.minIntrinsicWidth(Constraints.m38411getMaxHeightimpl(j));
                }
                return new EmptyPlaceable(i2, Constraints.m38411getMaxHeightimpl(j));
            }
            if (this.minMax == IntrinsicMinMax.Max) {
                i = this.measurable.maxIntrinsicHeight(Constraints.m38412getMaxWidthimpl(j));
            } else {
                i = this.measurable.minIntrinsicHeight(Constraints.m38412getMaxWidthimpl(j));
            }
            return new EmptyPlaceable(Constraints.m38412getMaxWidthimpl(j), i);
        }

        public int minIntrinsicHeight(int i) {
            return this.measurable.minIntrinsicHeight(i);
        }

        public int minIntrinsicWidth(int i) {
            return this.measurable.minIntrinsicWidth(i);
        }
    }

    /* renamed from: androidx.compose.ui.layout.MeasuringIntrinsics$IntrinsicMinMax */
    /* compiled from: LayoutModifier.kt */
    private enum IntrinsicMinMax {
        Min,
        Max
    }

    /* renamed from: androidx.compose.ui.layout.MeasuringIntrinsics$IntrinsicWidthHeight */
    /* compiled from: LayoutModifier.kt */
    private enum IntrinsicWidthHeight {
        Width,
        Height
    }

    private MeasuringIntrinsics() {
    }

    public final int maxHeight$ui_release(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        C12775o.m28639i(layoutModifier, "modifier");
        C12775o.m28639i(intrinsicMeasureScope, "instrinsicMeasureScope");
        C12775o.m28639i(intrinsicMeasurable, "intrinsicMeasurable");
        return layoutModifier.m37349measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Max, IntrinsicWidthHeight.Height), ConstraintsKt.Constraints$default(0, i, 0, 0, 13, (Object) null)).getHeight();
    }

    public final int maxWidth$ui_release(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        C12775o.m28639i(layoutModifier, "modifier");
        C12775o.m28639i(intrinsicMeasureScope, "instrinsicMeasureScope");
        C12775o.m28639i(intrinsicMeasurable, "intrinsicMeasurable");
        return layoutModifier.m37349measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Max, IntrinsicWidthHeight.Width), ConstraintsKt.Constraints$default(0, 0, 0, i, 7, (Object) null)).getWidth();
    }

    public final int minHeight$ui_release(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        C12775o.m28639i(layoutModifier, "modifier");
        C12775o.m28639i(intrinsicMeasureScope, "instrinsicMeasureScope");
        C12775o.m28639i(intrinsicMeasurable, "intrinsicMeasurable");
        return layoutModifier.m37349measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Min, IntrinsicWidthHeight.Height), ConstraintsKt.Constraints$default(0, i, 0, 0, 13, (Object) null)).getHeight();
    }

    public final int minWidth$ui_release(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        C12775o.m28639i(layoutModifier, "modifier");
        C12775o.m28639i(intrinsicMeasureScope, "instrinsicMeasureScope");
        C12775o.m28639i(intrinsicMeasurable, "intrinsicMeasurable");
        return layoutModifier.m37349measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new DefaultIntrinsicMeasurable(intrinsicMeasurable, IntrinsicMinMax.Min, IntrinsicWidthHeight.Width), ConstraintsKt.Constraints$default(0, 0, 0, i, 7, (Object) null)).getWidth();
    }

    /* renamed from: androidx.compose.ui.layout.MeasuringIntrinsics$EmptyPlaceable */
    /* compiled from: LayoutModifier.kt */
    private static final class EmptyPlaceable extends Placeable {
        public EmptyPlaceable(int i, int i2) {
            m37403setMeasuredSizeozmzZPI(IntSizeKt.IntSize(i, i2));
        }

        public int get(AlignmentLine alignmentLine) {
            C12775o.m28639i(alignmentLine, "alignmentLine");
            return Integer.MIN_VALUE;
        }

        /* access modifiers changed from: protected */
        /* renamed from: placeAt-f8xVGno  reason: not valid java name */
        public void m37392placeAtf8xVGno(long j, float f, Function1<? super GraphicsLayerScope, C11921v> function1) {
        }
    }
}
