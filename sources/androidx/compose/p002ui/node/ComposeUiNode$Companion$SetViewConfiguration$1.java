package androidx.compose.p002ui.node;

import androidx.compose.p002ui.platform.ViewConfiguration;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.node.ComposeUiNode$Companion$SetViewConfiguration$1 */
/* compiled from: ComposeUiNode.kt */
final class ComposeUiNode$Companion$SetViewConfiguration$1 extends C12777p implements C13088o<ComposeUiNode, ViewConfiguration, C11921v> {
    public static final ComposeUiNode$Companion$SetViewConfiguration$1 INSTANCE = new ComposeUiNode$Companion$SetViewConfiguration$1();

    ComposeUiNode$Companion$SetViewConfiguration$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ComposeUiNode) obj, (ViewConfiguration) obj2);
        return C11921v.f18618a;
    }

    public final void invoke(ComposeUiNode composeUiNode, ViewConfiguration viewConfiguration) {
        C12775o.m28639i(composeUiNode, "$this$null");
        C12775o.m28639i(viewConfiguration, "it");
        composeUiNode.setViewConfiguration(viewConfiguration);
    }
}
