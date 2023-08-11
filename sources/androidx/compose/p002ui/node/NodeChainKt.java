package androidx.compose.p002ui.node;

import androidx.compose.p002ui.ActualKt;
import androidx.compose.p002ui.CombinedModifier;
import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nNodeChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChainKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,751:1\n1162#2:752\n1#3:753\n*S KotlinDebug\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChainKt\n*L\n735#1:752\n*E\n"})
/* renamed from: androidx.compose.ui.node.NodeChainKt */
/* compiled from: NodeChain.kt */
public final class NodeChainKt {
    private static final int ActionReplace = 0;
    private static final int ActionReuse = 2;
    private static final int ActionUpdate = 1;
    /* access modifiers changed from: private */
    public static final NodeChainKt$SentinelHead$1 SentinelHead;

    static {
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$1 = new NodeChainKt$SentinelHead$1();
        nodeChainKt$SentinelHead$1.setAggregateChildKindSet$ui_release(-1);
        SentinelHead = nodeChainKt$SentinelHead$1;
    }

    public static final int actionForModifiers(Modifier.Element element, Modifier.Element element2) {
        C12775o.m28639i(element, "prev");
        C12775o.m28639i(element2, "next");
        if (C12775o.m28634d(element, element2)) {
            return 2;
        }
        if (ActualKt.areObjectsOfSameType(element, element2)) {
            return 1;
        }
        return 0;
    }

    /* access modifiers changed from: private */
    public static final MutableVector<Modifier.Element> fillVector(Modifier modifier, MutableVector<Modifier.Element> mutableVector) {
        MutableVector mutableVector2 = new MutableVector(new Modifier[mutableVector.getSize()], 0);
        mutableVector2.add(modifier);
        while (mutableVector2.isNotEmpty()) {
            Modifier modifier2 = (Modifier) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if (modifier2 instanceof CombinedModifier) {
                CombinedModifier combinedModifier = (CombinedModifier) modifier2;
                mutableVector2.add(combinedModifier.getInner$ui_release());
                mutableVector2.add(combinedModifier.getOuter$ui_release());
            } else if (modifier2 instanceof Modifier.Element) {
                mutableVector.add(modifier2);
            } else {
                modifier2.all(new NodeChainKt$fillVector$1(mutableVector));
            }
        }
        return mutableVector;
    }

    /* access modifiers changed from: private */
    public static final <T extends Modifier.Node> Modifier.Node updateUnsafe(ModifierNodeElement<T> modifierNodeElement, Modifier.Node node) {
        C12775o.m28637g(node, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
        return modifierNodeElement.update(node);
    }
}
