package androidx.compose.p002ui.platform;

import androidx.compose.p002ui.node.LayoutNode;
import androidx.compose.p002ui.semantics.SemanticsNodeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* renamed from: androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1$onInitializeAccessibilityNodeInfo$parentId$1 */
/* compiled from: AndroidComposeView.android.kt */
final class C1063x60998eaf extends C12777p implements Function1<LayoutNode, Boolean> {
    public static final C1063x60998eaf INSTANCE = new C1063x60998eaf();

    C1063x60998eaf() {
        super(1);
    }

    public final Boolean invoke(LayoutNode layoutNode) {
        C12775o.m28639i(layoutNode, "it");
        return Boolean.valueOf(SemanticsNodeKt.getOuterSemantics(layoutNode) != null);
    }
}
