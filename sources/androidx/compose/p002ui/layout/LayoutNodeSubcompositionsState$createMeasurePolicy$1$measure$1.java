package androidx.compose.p002ui.layout;

import java.util.Map;

/* renamed from: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure$1 */
/* compiled from: SubcomposeLayout.kt */
public final class LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure$1 implements MeasureResult {
    final /* synthetic */ int $indexAfterMeasure;
    final /* synthetic */ MeasureResult $result;
    final /* synthetic */ LayoutNodeSubcompositionsState this$0;

    LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure$1(MeasureResult measureResult, LayoutNodeSubcompositionsState layoutNodeSubcompositionsState, int i) {
        this.$result = measureResult;
        this.this$0 = layoutNodeSubcompositionsState;
        this.$indexAfterMeasure = i;
    }

    public Map<AlignmentLine, Integer> getAlignmentLines() {
        return this.$result.getAlignmentLines();
    }

    public int getHeight() {
        return this.$result.getHeight();
    }

    public int getWidth() {
        return this.$result.getWidth();
    }

    public void placeChildren() {
        this.this$0.currentIndex = this.$indexAfterMeasure;
        this.$result.placeChildren();
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.this$0;
        layoutNodeSubcompositionsState.disposeOrReuseStartingFromIndex(layoutNodeSubcompositionsState.currentIndex);
    }
}
