package androidx.compose.p002ui.node;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.p002ui.layout.LookaheadLayoutCoordinates;
import kotlin.jvm.internal.C12775o;

@ExperimentalComposeUiApi
/* renamed from: androidx.compose.ui.node.LayoutAwareModifierNode */
/* compiled from: LayoutAwareModifierNode.kt */
public interface LayoutAwareModifierNode extends DelegatableNode {
    void onLookaheadPlaced(LookaheadLayoutCoordinates lookaheadLayoutCoordinates) {
        C12775o.m28639i(lookaheadLayoutCoordinates, "coordinates");
    }

    void onPlaced(LayoutCoordinates layoutCoordinates) {
        C12775o.m28639i(layoutCoordinates, "coordinates");
    }

    /* renamed from: onRemeasured-ozmzZPI  reason: not valid java name */
    void m37491onRemeasuredozmzZPI(long j) {
    }
}
