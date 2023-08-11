package androidx.compose.p002ui.node;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.modifier.ModifierLocalConsumer;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.node.BackwardsCompatNode$updateModifierLocalConsumer$1 */
/* compiled from: BackwardsCompatNode.kt */
final class BackwardsCompatNode$updateModifierLocalConsumer$1 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ BackwardsCompatNode this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BackwardsCompatNode$updateModifierLocalConsumer$1(BackwardsCompatNode backwardsCompatNode) {
        super(0);
        this.this$0 = backwardsCompatNode;
    }

    public final void invoke() {
        Modifier.Element element = this.this$0.getElement();
        C12775o.m28637g(element, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
        ((ModifierLocalConsumer) element).onModifierLocalsUpdated(this.this$0);
    }
}
