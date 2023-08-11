package androidx.compose.p002ui.node;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.graphics.drawscope.ContentDrawScope;

@ExperimentalComposeUiApi
/* renamed from: androidx.compose.ui.node.DrawModifierNode */
/* compiled from: DrawModifierNode.kt */
public interface DrawModifierNode extends DelegatableNode {
    void draw(ContentDrawScope contentDrawScope);

    void onMeasureResultChanged() {
    }
}
