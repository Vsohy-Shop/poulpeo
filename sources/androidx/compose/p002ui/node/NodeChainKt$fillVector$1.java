package androidx.compose.p002ui.node;

import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* renamed from: androidx.compose.ui.node.NodeChainKt$fillVector$1 */
/* compiled from: NodeChain.kt */
final class NodeChainKt$fillVector$1 extends C12777p implements Function1<Modifier.Element, Boolean> {
    final /* synthetic */ MutableVector<Modifier.Element> $result;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NodeChainKt$fillVector$1(MutableVector<Modifier.Element> mutableVector) {
        super(1);
        this.$result = mutableVector;
    }

    public final Boolean invoke(Modifier.Element element) {
        C12775o.m28639i(element, "it");
        this.$result.add(element);
        return Boolean.TRUE;
    }
}
