package androidx.compose.p002ui.node;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.layout.IntrinsicMeasurable;
import androidx.compose.p002ui.layout.IntrinsicMeasureScope;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Remeasurement;
import kotlin.jvm.internal.C12775o;

@ExperimentalComposeUiApi
/* renamed from: androidx.compose.ui.node.LayoutModifierNode */
/* compiled from: LayoutModifierNode.kt */
public interface LayoutModifierNode extends Remeasurement, DelegatableNode {
    void forceRemeasure() {
        DelegatableNodeKt.requireLayoutNode(this).forceRemeasure();
    }

    int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(intrinsicMeasurable, "measurable");
        return NodeMeasuringIntrinsics.INSTANCE.maxHeight$ui_release(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(intrinsicMeasurable, "measurable");
        return NodeMeasuringIntrinsics.INSTANCE.maxWidth$ui_release(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    MeasureResult m37492measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j);

    int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(intrinsicMeasurable, "measurable");
        return NodeMeasuringIntrinsics.INSTANCE.minHeight$ui_release(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(intrinsicMeasurable, "measurable");
        return NodeMeasuringIntrinsics.INSTANCE.minWidth$ui_release(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }
}
