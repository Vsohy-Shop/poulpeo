package androidx.compose.p002ui.semantics;

import androidx.compose.p002ui.node.LayoutNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* renamed from: androidx.compose.ui.semantics.SemanticsNode$parent$2 */
/* compiled from: SemanticsNode.kt */
final class SemanticsNode$parent$2 extends C12777p implements Function1<LayoutNode, Boolean> {
    public static final SemanticsNode$parent$2 INSTANCE = new SemanticsNode$parent$2();

    SemanticsNode$parent$2() {
        super(1);
    }

    public final Boolean invoke(LayoutNode layoutNode) {
        C12775o.m28639i(layoutNode, "it");
        return Boolean.valueOf(SemanticsNodeKt.getOuterSemantics(layoutNode) != null);
    }
}
