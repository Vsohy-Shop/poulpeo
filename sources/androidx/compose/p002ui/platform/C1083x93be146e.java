package androidx.compose.p002ui.platform;

import androidx.compose.p002ui.node.LayoutNode;
import androidx.compose.p002ui.node.SemanticsModifierNode;
import androidx.compose.p002ui.node.SemanticsModifierNodeKt;
import androidx.compose.p002ui.semantics.SemanticsActions;
import androidx.compose.p002ui.semantics.SemanticsConfiguration;
import androidx.compose.p002ui.semantics.SemanticsNodeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1 */
/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
final class C1083x93be146e extends C12777p implements Function1<LayoutNode, Boolean> {
    public static final C1083x93be146e INSTANCE = new C1083x93be146e();

    C1083x93be146e() {
        super(1);
    }

    public final Boolean invoke(LayoutNode layoutNode) {
        C12775o.m28639i(layoutNode, "it");
        SemanticsModifierNode outerSemantics = SemanticsNodeKt.getOuterSemantics(layoutNode);
        SemanticsConfiguration collapsedSemanticsConfiguration = outerSemantics != null ? SemanticsModifierNodeKt.collapsedSemanticsConfiguration(outerSemantics) : null;
        boolean z = true;
        if (!(collapsedSemanticsConfiguration != null && collapsedSemanticsConfiguration.isMergingSemanticsOfDescendants()) || !collapsedSemanticsConfiguration.contains(SemanticsActions.INSTANCE.getSetText())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
