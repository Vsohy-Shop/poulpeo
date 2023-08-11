package androidx.compose.p002ui.node;

import androidx.compose.p002ui.layout.MeasurePolicy;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.node.ComposeUiNode$Companion$SetMeasurePolicy$1 */
/* compiled from: ComposeUiNode.kt */
final class ComposeUiNode$Companion$SetMeasurePolicy$1 extends C12777p implements C13088o<ComposeUiNode, MeasurePolicy, C11921v> {
    public static final ComposeUiNode$Companion$SetMeasurePolicy$1 INSTANCE = new ComposeUiNode$Companion$SetMeasurePolicy$1();

    ComposeUiNode$Companion$SetMeasurePolicy$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ComposeUiNode) obj, (MeasurePolicy) obj2);
        return C11921v.f18618a;
    }

    public final void invoke(ComposeUiNode composeUiNode, MeasurePolicy measurePolicy) {
        C12775o.m28639i(composeUiNode, "$this$null");
        C12775o.m28639i(measurePolicy, "it");
        composeUiNode.setMeasurePolicy(measurePolicy);
    }
}
