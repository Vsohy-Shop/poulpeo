package androidx.compose.p002ui.modifier;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.node.BackwardsCompatNode;
import androidx.compose.p002ui.node.DelegatableNodeKt;
import androidx.compose.p002ui.node.LayoutNode;
import androidx.compose.p002ui.node.NodeKind;
import androidx.compose.p002ui.node.Owner;
import androidx.compose.runtime.collection.MutableVector;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nModifierLocalManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalManager.kt\nandroidx/compose/ui/modifier/ModifierLocalManager\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n1#1,121:1\n1182#2:122\n1161#2,2:123\n1182#2:125\n1161#2,2:126\n1182#2:128\n1161#2,2:129\n1182#2:131\n1161#2,2:132\n1182#2:164\n1161#2,2:165\n476#3,7:134\n523#3:141\n483#3,4:142\n476#3,7:146\n523#3:153\n483#3,4:154\n728#3,2:187\n728#3,2:189\n728#3,2:191\n728#3,2:193\n728#3,2:195\n728#3,2:197\n1855#4,2:158\n77#5:160\n346#6:161\n237#6,2:162\n239#6,20:167\n*S KotlinDebug\n*F\n+ 1 ModifierLocalManager.kt\nandroidx/compose/ui/modifier/ModifierLocalManager\n*L\n44#1:122\n44#1:123,2\n45#1:125\n45#1:126,2\n46#1:128\n46#1:129,2\n47#1:131\n47#1:132,2\n93#1:164\n93#1:165,2\n64#1:134,7\n65#1:141\n64#1:142,4\n77#1:146,7\n78#1:153\n77#1:154,4\n105#1:187,2\n106#1:189,2\n111#1:191,2\n112#1:193,2\n117#1:195,2\n118#1:197,2\n85#1:158,2\n93#1:160\n93#1:161\n93#1:162,2\n93#1:167,20\n*E\n"})
/* renamed from: androidx.compose.ui.modifier.ModifierLocalManager */
/* compiled from: ModifierLocalManager.kt */
public final class ModifierLocalManager {
    private final MutableVector<BackwardsCompatNode> inserted = new MutableVector<>(new BackwardsCompatNode[16], 0);
    private final MutableVector<ModifierLocal<?>> insertedLocal = new MutableVector<>(new ModifierLocal[16], 0);
    private boolean invalidated;
    private final Owner owner;
    private final MutableVector<LayoutNode> removed = new MutableVector<>(new LayoutNode[16], 0);
    private final MutableVector<ModifierLocal<?>> removedLocal = new MutableVector<>(new ModifierLocal[16], 0);

    public ModifierLocalManager(Owner owner2) {
        C12775o.m28639i(owner2, "owner");
        this.owner = owner2;
    }

    private final void invalidateConsumersOfNodeForKey(Modifier.Node node, ModifierLocal<?> modifierLocal, Set<BackwardsCompatNode> set) {
        boolean z;
        int r0 = NodeKind.m37625constructorimpl(32);
        if (node.getNode().isAttached()) {
            MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = node.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node.getNode());
            } else {
                mutableVector.add(child$ui_release);
            }
            while (mutableVector.isNotEmpty()) {
                Modifier.Node node2 = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
                if ((node2.getAggregateChildKindSet$ui_release() & r0) != 0) {
                    Modifier.Node node3 = node2;
                    while (true) {
                        if (node3 == null) {
                            break;
                        }
                        if ((node3.getKindSet$ui_release() & r0) != 0) {
                            if (node3 instanceof ModifierLocalNode) {
                                ModifierLocalNode modifierLocalNode = (ModifierLocalNode) node3;
                                if (modifierLocalNode instanceof BackwardsCompatNode) {
                                    BackwardsCompatNode backwardsCompatNode = (BackwardsCompatNode) modifierLocalNode;
                                    if ((backwardsCompatNode.getElement() instanceof ModifierLocalConsumer) && backwardsCompatNode.getReadValues().contains(modifierLocal)) {
                                        set.add(modifierLocalNode);
                                    }
                                }
                                z = !modifierLocalNode.getProvidedValues().contains$ui_release(modifierLocal);
                            } else {
                                z = true;
                            }
                            if (!z) {
                                break;
                            }
                        }
                        node3 = node3.getChild$ui_release();
                    }
                }
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node2);
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final Owner getOwner() {
        return this.owner;
    }

    public final void insertedProvider(BackwardsCompatNode backwardsCompatNode, ModifierLocal<?> modifierLocal) {
        C12775o.m28639i(backwardsCompatNode, "node");
        C12775o.m28639i(modifierLocal, "key");
        this.inserted.add(backwardsCompatNode);
        this.insertedLocal.add(modifierLocal);
        invalidate();
    }

    public final void invalidate() {
        if (!this.invalidated) {
            this.invalidated = true;
            this.owner.registerOnEndApplyChangesListener(new ModifierLocalManager$invalidate$1(this));
        }
    }

    public final void removedProvider(BackwardsCompatNode backwardsCompatNode, ModifierLocal<?> modifierLocal) {
        C12775o.m28639i(backwardsCompatNode, "node");
        C12775o.m28639i(modifierLocal, "key");
        this.removed.add(DelegatableNodeKt.requireLayoutNode(backwardsCompatNode));
        this.removedLocal.add(modifierLocal);
        invalidate();
    }

    public final void triggerUpdates() {
        int i = 0;
        this.invalidated = false;
        HashSet<BackwardsCompatNode> hashSet = new HashSet<>();
        MutableVector<LayoutNode> mutableVector = this.removed;
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) content[i2];
                ModifierLocal modifierLocal = (ModifierLocal) this.removedLocal.getContent()[i2];
                if (layoutNode.getNodes$ui_release().getHead$ui_release().isAttached()) {
                    invalidateConsumersOfNodeForKey(layoutNode.getNodes$ui_release().getHead$ui_release(), modifierLocal, hashSet);
                }
                i2++;
            } while (i2 < size);
        }
        this.removed.clear();
        this.removedLocal.clear();
        MutableVector<BackwardsCompatNode> mutableVector2 = this.inserted;
        int size2 = mutableVector2.getSize();
        if (size2 > 0) {
            Object[] content2 = mutableVector2.getContent();
            do {
                BackwardsCompatNode backwardsCompatNode = (BackwardsCompatNode) content2[i];
                ModifierLocal modifierLocal2 = (ModifierLocal) this.insertedLocal.getContent()[i];
                if (backwardsCompatNode.isAttached()) {
                    invalidateConsumersOfNodeForKey(backwardsCompatNode, modifierLocal2, hashSet);
                }
                i++;
            } while (i < size2);
        }
        this.inserted.clear();
        this.insertedLocal.clear();
        for (BackwardsCompatNode updateModifierLocalConsumer : hashSet) {
            updateModifierLocalConsumer.updateModifierLocalConsumer();
        }
    }

    public final void updatedProvider(BackwardsCompatNode backwardsCompatNode, ModifierLocal<?> modifierLocal) {
        C12775o.m28639i(backwardsCompatNode, "node");
        C12775o.m28639i(modifierLocal, "key");
        this.inserted.add(backwardsCompatNode);
        this.insertedLocal.add(modifierLocal);
        invalidate();
    }
}
