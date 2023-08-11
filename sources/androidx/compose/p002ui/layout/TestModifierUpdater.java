package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.node.LayoutNode;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.layout.TestModifierUpdater */
/* compiled from: TestModifierUpdater.kt */
public final class TestModifierUpdater {
    public static final int $stable = 8;
    private final LayoutNode node;

    public TestModifierUpdater(LayoutNode layoutNode) {
        C12775o.m28639i(layoutNode, "node");
        this.node = layoutNode;
    }

    public final void updateModifier(Modifier modifier) {
        C12775o.m28639i(modifier, "modifier");
        this.node.setModifier(modifier);
    }
}
