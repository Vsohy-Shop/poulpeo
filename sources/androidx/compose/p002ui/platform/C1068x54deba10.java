package androidx.compose.p002ui.platform;

import androidx.compose.p002ui.node.LayoutNode;
import androidx.compose.p002ui.node.SemanticsModifierNode;
import androidx.compose.p002ui.node.SemanticsModifierNodeKt;
import androidx.compose.p002ui.semantics.SemanticsConfiguration;
import androidx.compose.p002ui.semantics.SemanticsNodeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$populateAccessibilityNodeInfoProperties$isUnmergedLeafNode$1 */
/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
final class C1068x54deba10 extends C12777p implements Function1<LayoutNode, Boolean> {
    public static final C1068x54deba10 INSTANCE = new C1068x54deba10();

    C1068x54deba10() {
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
