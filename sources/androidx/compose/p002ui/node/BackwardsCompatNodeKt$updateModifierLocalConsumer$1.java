package androidx.compose.p002ui.node;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.node.BackwardsCompatNodeKt$updateModifierLocalConsumer$1 */
/* compiled from: BackwardsCompatNode.kt */
final class BackwardsCompatNodeKt$updateModifierLocalConsumer$1 extends C12777p implements Function1<BackwardsCompatNode, C11921v> {
    public static final BackwardsCompatNodeKt$updateModifierLocalConsumer$1 INSTANCE = new BackwardsCompatNodeKt$updateModifierLocalConsumer$1();

    BackwardsCompatNodeKt$updateModifierLocalConsumer$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((BackwardsCompatNode) obj);
        return C11921v.f18618a;
    }

    public final void invoke(BackwardsCompatNode backwardsCompatNode) {
        C12775o.m28639i(backwardsCompatNode, "it");
        backwardsCompatNode.updateModifierLocalConsumer();
    }
}
