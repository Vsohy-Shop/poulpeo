package androidx.compose.p002ui.node;

import androidx.compose.p002ui.modifier.ModifierLocal;
import androidx.compose.p002ui.modifier.ModifierLocalReadScope;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.node.BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1 */
/* compiled from: BackwardsCompatNode.kt */
public final class BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1 implements ModifierLocalReadScope {
    BackwardsCompatNodeKt$DetachedModifierLocalReadScope$1() {
    }

    public <T> T getCurrent(ModifierLocal<T> modifierLocal) {
        C12775o.m28639i(modifierLocal, "<this>");
        return modifierLocal.getDefaultFactory$ui_release().invoke();
    }
}
