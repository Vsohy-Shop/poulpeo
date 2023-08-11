package androidx.compose.p002ui.modifier;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.node.DelegatableNode;
import androidx.compose.p002ui.node.DelegatableNodeKt;
import androidx.compose.p002ui.node.LayoutNode;
import androidx.compose.p002ui.node.NodeChain;
import androidx.compose.p002ui.node.NodeKind;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@ExperimentalComposeUiApi
@SourceDebugExtension({"SMAP\nModifierLocalNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalNode.kt\nandroidx/compose/ui/modifier/ModifierLocalNode\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n1#1,220:1\n77#2:221\n314#3:222\n78#3,17:223\n*S KotlinDebug\n*F\n+ 1 ModifierLocalNode.kt\nandroidx/compose/ui/modifier/ModifierLocalNode\n*L\n170#1:221\n170#1:222\n170#1:223,17\n*E\n"})
/* renamed from: androidx.compose.ui.modifier.ModifierLocalNode */
/* compiled from: ModifierLocalNode.kt */
public interface ModifierLocalNode extends ModifierLocalReadScope, DelegatableNode {
    <T> T getCurrent(ModifierLocal<T> modifierLocal) {
        NodeChain nodes$ui_release;
        C12775o.m28639i(modifierLocal, "<this>");
        if (getNode().isAttached()) {
            int r0 = NodeKind.m37625constructorimpl(32);
            if (getNode().isAttached()) {
                Modifier.Node parent$ui_release = getNode().getParent$ui_release();
                LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(this);
                while (requireLayoutNode != null) {
                    if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & r0) != 0) {
                        while (parent$ui_release != null) {
                            if ((parent$ui_release.getKindSet$ui_release() & r0) != 0 && (parent$ui_release instanceof ModifierLocalNode)) {
                                ModifierLocalNode modifierLocalNode = (ModifierLocalNode) parent$ui_release;
                                if (modifierLocalNode.getProvidedValues().contains$ui_release(modifierLocal)) {
                                    return modifierLocalNode.getProvidedValues().get$ui_release(modifierLocal);
                                }
                            }
                            parent$ui_release = parent$ui_release.getParent$ui_release();
                        }
                    }
                    requireLayoutNode = requireLayoutNode.getParent$ui_release();
                    if (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null) {
                        parent$ui_release = null;
                    } else {
                        parent$ui_release = nodes$ui_release.getTail$ui_release();
                    }
                }
                return modifierLocal.getDefaultFactory$ui_release().invoke();
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    ModifierLocalMap getProvidedValues() {
        return EmptyMap.INSTANCE;
    }

    <T> void provide(ModifierLocal<T> modifierLocal, T t) {
        boolean z;
        C12775o.m28639i(modifierLocal, "key");
        if (getProvidedValues() != EmptyMap.INSTANCE) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException("In order to provide locals you must override providedValues: ModifierLocalMap".toString());
        } else if (getProvidedValues().contains$ui_release(modifierLocal)) {
            getProvidedValues().set$ui_release(modifierLocal, t);
        } else {
            throw new IllegalArgumentException(("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + modifierLocal + " was not found.").toString());
        }
    }
}
