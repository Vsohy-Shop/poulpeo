package androidx.compose.p002ui.semantics;

import androidx.compose.p002ui.node.LayoutNode;
import androidx.compose.p002ui.node.SemanticsModifierNode;
import androidx.compose.p002ui.node.SemanticsModifierNodeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* renamed from: androidx.compose.ui.semantics.SemanticsNode$parent$1 */
/* compiled from: SemanticsNode.kt */
final class SemanticsNode$parent$1 extends C12777p implements Function1<LayoutNode, Boolean> {
    public static final SemanticsNode$parent$1 INSTANCE = new SemanticsNode$parent$1();

    SemanticsNode$parent$1() {
        super(1);
    }

    public final Boolean invoke(LayoutNode layoutNode) {
        SemanticsConfiguration collapsedSemanticsConfiguration;
        C12775o.m28639i(layoutNode, "it");
        SemanticsModifierNode outerSemantics = SemanticsNodeKt.getOuterSemantics(layoutNode);
        boolean z = false;
        if (!(outerSemantics == null || (collapsedSemanticsConfiguration = SemanticsModifierNodeKt.collapsedSemanticsConfiguration(outerSemantics)) == null || !collapsedSemanticsConfiguration.isMergingSemanticsOfDescendants())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
