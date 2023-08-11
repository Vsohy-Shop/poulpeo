package androidx.compose.p002ui.platform;

import android.view.View;
import androidx.compose.p002ui.node.LayoutNode;
import androidx.compose.p002ui.semantics.SemanticsNodeKt;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1 */
/* compiled from: AndroidComposeView.android.kt */
public final class AndroidComposeView$addAndroidView$1 extends AccessibilityDelegateCompat {
    final /* synthetic */ LayoutNode $layoutNode;
    final /* synthetic */ AndroidComposeView $thisView;
    final /* synthetic */ AndroidComposeView this$0;

    AndroidComposeView$addAndroidView$1(LayoutNode layoutNode, AndroidComposeView androidComposeView, AndroidComposeView androidComposeView2) {
        this.$layoutNode = layoutNode;
        this.this$0 = androidComposeView;
        this.$thisView = androidComposeView2;
    }

    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        Integer num;
        C12775o.m28639i(view, "host");
        C12775o.m28639i(accessibilityNodeInfoCompat, "info");
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        LayoutNode findClosestParentNode = SemanticsNodeKt.findClosestParentNode(this.$layoutNode, C1063x60998eaf.INSTANCE);
        if (findClosestParentNode != null) {
            num = Integer.valueOf(findClosestParentNode.getSemanticsId());
        } else {
            num = null;
        }
        if (num == null || num.intValue() == this.this$0.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) {
            num = -1;
        }
        accessibilityNodeInfoCompat.setParent(this.$thisView, num.intValue());
    }
}
