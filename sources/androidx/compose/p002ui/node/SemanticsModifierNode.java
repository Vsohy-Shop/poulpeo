package androidx.compose.p002ui.node;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.semantics.SemanticsConfiguration;

@ExperimentalComposeUiApi
/* renamed from: androidx.compose.ui.node.SemanticsModifierNode */
/* compiled from: SemanticsModifierNode.kt */
public interface SemanticsModifierNode extends DelegatableNode {
    SemanticsConfiguration getSemanticsConfiguration();
}
