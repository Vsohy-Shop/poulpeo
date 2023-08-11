package androidx.compose.p002ui.platform;

import androidx.compose.p002ui.node.LayoutNode;
import androidx.compose.p002ui.semantics.SemanticsNodeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsWrapper$1 */
/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
final class C1080xdb31af5f extends C12777p implements Function1<LayoutNode, Boolean> {
    public static final C1080xdb31af5f INSTANCE = new C1080xdb31af5f();

    C1080xdb31af5f() {
        super(1);
    }

    public final Boolean invoke(LayoutNode layoutNode) {
        C12775o.m28639i(layoutNode, "it");
        return Boolean.valueOf(SemanticsNodeKt.getOuterSemantics(layoutNode) != null);
    }
}
