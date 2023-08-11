package androidx.compose.p002ui.focus;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.node.DelegatableNodeKt;
import androidx.compose.p002ui.node.NodeKind;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nFocusRequesterModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusRequesterModifierNode.kt\nandroidx/compose/ui/focus/FocusRequesterModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,92:1\n87#2:93\n87#2:123\n87#2:153\n340#3:94\n206#3,2:95\n208#3,7:100\n215#3,15:108\n340#3:124\n206#3,2:125\n208#3,7:130\n215#3,15:138\n340#3:154\n206#3,2:155\n208#3,7:160\n215#3,15:168\n1182#4:97\n1161#4,2:98\n1182#4:127\n1161#4,2:128\n1182#4:157\n1161#4,2:158\n48#5:107\n48#5:137\n48#5:167\n*S KotlinDebug\n*F\n+ 1 FocusRequesterModifierNode.kt\nandroidx/compose/ui/focus/FocusRequesterModifierNodeKt\n*L\n40#1:93\n63#1:123\n87#1:153\n40#1:94\n40#1:95,2\n40#1:100,7\n40#1:108,15\n63#1:124\n63#1:125,2\n63#1:130,7\n63#1:138,15\n87#1:154\n87#1:155,2\n87#1:160,7\n87#1:168,15\n40#1:97\n40#1:98,2\n63#1:127\n63#1:128,2\n87#1:157\n87#1:158,2\n40#1:107\n63#1:137\n87#1:167\n*E\n"})
/* renamed from: androidx.compose.ui.focus.FocusRequesterModifierNodeKt */
/* compiled from: FocusRequesterModifierNode.kt */
public final class FocusRequesterModifierNodeKt {
    @ExperimentalComposeUiApi
    public static final boolean captureFocus(FocusRequesterModifierNode focusRequesterModifierNode) {
        C12775o.m28639i(focusRequesterModifierNode, "<this>");
        int r0 = NodeKind.m37625constructorimpl(1024);
        if (focusRequesterModifierNode.getNode().isAttached()) {
            MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = focusRequesterModifierNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector, focusRequesterModifierNode.getNode());
            } else {
                mutableVector.add(child$ui_release);
            }
            while (mutableVector.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & r0) == 0) {
                    DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node);
                } else {
                    while (true) {
                        if (node == null) {
                            continue;
                            break;
                        } else if ((node.getKindSet$ui_release() & r0) == 0) {
                            node = node.getChild$ui_release();
                        } else if ((node instanceof FocusTargetModifierNode) && FocusTransactionsKt.captureFocus((FocusTargetModifierNode) node)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @ExperimentalComposeUiApi
    public static final boolean freeFocus(FocusRequesterModifierNode focusRequesterModifierNode) {
        C12775o.m28639i(focusRequesterModifierNode, "<this>");
        int r0 = NodeKind.m37625constructorimpl(1024);
        if (focusRequesterModifierNode.getNode().isAttached()) {
            MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = focusRequesterModifierNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector, focusRequesterModifierNode.getNode());
            } else {
                mutableVector.add(child$ui_release);
            }
            while (mutableVector.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & r0) == 0) {
                    DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node);
                } else {
                    while (true) {
                        if (node == null) {
                            continue;
                            break;
                        } else if ((node.getKindSet$ui_release() & r0) == 0) {
                            node = node.getChild$ui_release();
                        } else if ((node instanceof FocusTargetModifierNode) && FocusTransactionsKt.freeFocus((FocusTargetModifierNode) node)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @ExperimentalComposeUiApi
    public static final boolean requestFocus(FocusRequesterModifierNode focusRequesterModifierNode) {
        C12775o.m28639i(focusRequesterModifierNode, "<this>");
        int r0 = NodeKind.m37625constructorimpl(1024);
        if (focusRequesterModifierNode.getNode().isAttached()) {
            MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = focusRequesterModifierNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector, focusRequesterModifierNode.getNode());
            } else {
                mutableVector.add(child$ui_release);
            }
            while (mutableVector.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & r0) == 0) {
                    DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node);
                } else {
                    while (true) {
                        if (node == null) {
                            continue;
                            break;
                        } else if ((node.getKindSet$ui_release() & r0) == 0) {
                            node = node.getChild$ui_release();
                        } else if ((node instanceof FocusTargetModifierNode) && FocusTransactionsKt.requestFocus((FocusTargetModifierNode) node)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
