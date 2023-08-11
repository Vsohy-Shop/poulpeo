package androidx.compose.p002ui.node;

import androidx.compose.p002ui.unit.LayoutDirection;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.node.ComposeUiNode$Companion$SetLayoutDirection$1 */
/* compiled from: ComposeUiNode.kt */
final class ComposeUiNode$Companion$SetLayoutDirection$1 extends C12777p implements C13088o<ComposeUiNode, LayoutDirection, C11921v> {
    public static final ComposeUiNode$Companion$SetLayoutDirection$1 INSTANCE = new ComposeUiNode$Companion$SetLayoutDirection$1();

    ComposeUiNode$Companion$SetLayoutDirection$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ComposeUiNode) obj, (LayoutDirection) obj2);
        return C11921v.f18618a;
    }

    public final void invoke(ComposeUiNode composeUiNode, LayoutDirection layoutDirection) {
        C12775o.m28639i(composeUiNode, "$this$null");
        C12775o.m28639i(layoutDirection, "it");
        composeUiNode.setLayoutDirection(layoutDirection);
    }
}
