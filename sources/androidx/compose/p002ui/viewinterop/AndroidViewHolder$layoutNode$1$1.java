package androidx.compose.p002ui.viewinterop;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.node.LayoutNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$1 */
/* compiled from: AndroidViewHolder.android.kt */
final class AndroidViewHolder$layoutNode$1$1 extends C12777p implements Function1<Modifier, C11921v> {
    final /* synthetic */ Modifier $coreModifier;
    final /* synthetic */ LayoutNode $layoutNode;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidViewHolder$layoutNode$1$1(LayoutNode layoutNode, Modifier modifier) {
        super(1);
        this.$layoutNode = layoutNode;
        this.$coreModifier = modifier;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Modifier) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Modifier modifier) {
        C12775o.m28639i(modifier, "it");
        this.$layoutNode.setModifier(modifier.then(this.$coreModifier));
    }
}
