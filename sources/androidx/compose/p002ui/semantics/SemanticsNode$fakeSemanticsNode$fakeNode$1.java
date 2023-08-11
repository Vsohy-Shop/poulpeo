package androidx.compose.p002ui.semantics;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.node.SemanticsModifierNode;
import kotlin.jvm.functions.Function1;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.semantics.SemanticsNode$fakeSemanticsNode$fakeNode$1 */
/* compiled from: SemanticsNode.kt */
public final class SemanticsNode$fakeSemanticsNode$fakeNode$1 extends Modifier.Node implements SemanticsModifierNode {
    private final SemanticsConfiguration semanticsConfiguration;

    SemanticsNode$fakeSemanticsNode$fakeNode$1(Function1<? super SemanticsPropertyReceiver, C11921v> function1) {
        SemanticsConfiguration semanticsConfiguration2 = new SemanticsConfiguration();
        semanticsConfiguration2.setMergingSemanticsOfDescendants(false);
        semanticsConfiguration2.setClearingSemantics(false);
        function1.invoke(semanticsConfiguration2);
        this.semanticsConfiguration = semanticsConfiguration2;
    }

    public SemanticsConfiguration getSemanticsConfiguration() {
        return this.semanticsConfiguration;
    }
}
