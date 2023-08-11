package androidx.compose.p002ui.node;

import androidx.compose.p002ui.layout.AlignmentLine;
import androidx.compose.p002ui.layout.Measurable;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.node.AlignmentLinesOwner */
/* compiled from: LayoutNodeLayoutDelegate.kt */
public interface AlignmentLinesOwner extends Measurable {
    Map<AlignmentLine, Integer> calculateAlignmentLines();

    void forEachChildAlignmentLinesOwner(Function1<? super AlignmentLinesOwner, C11921v> function1);

    AlignmentLines getAlignmentLines();

    NodeCoordinator getInnerCoordinator();

    AlignmentLinesOwner getParentAlignmentLinesOwner();

    boolean isPlaced();

    void layoutChildren();

    void requestLayout();

    void requestMeasure();
}
