package androidx.compose.p002ui.node;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.draw.DrawModifier;
import androidx.compose.p002ui.focus.FocusEventModifier;
import androidx.compose.p002ui.focus.FocusEventModifierNode;
import androidx.compose.p002ui.focus.FocusOrderModifier;
import androidx.compose.p002ui.focus.FocusPropertiesModifierNode;
import androidx.compose.p002ui.focus.FocusTargetModifierNode;
import androidx.compose.p002ui.input.key.KeyInputModifierNode;
import androidx.compose.p002ui.input.pointer.PointerInputModifier;
import androidx.compose.p002ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.p002ui.layout.IntermediateLayoutModifier;
import androidx.compose.p002ui.layout.LayoutModifier;
import androidx.compose.p002ui.layout.LookaheadOnPlacedModifier;
import androidx.compose.p002ui.layout.OnGloballyPositionedModifier;
import androidx.compose.p002ui.layout.OnPlacedModifier;
import androidx.compose.p002ui.layout.OnRemeasuredModifier;
import androidx.compose.p002ui.layout.ParentDataModifier;
import androidx.compose.p002ui.modifier.ModifierLocalConsumer;
import androidx.compose.p002ui.modifier.ModifierLocalNode;
import androidx.compose.p002ui.modifier.ModifierLocalProvider;
import androidx.compose.p002ui.semantics.SemanticsModifier;
import androidx.compose.runtime.collection.MutableVector;
import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nNodeKind.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,283:1\n51#1:287\n51#1:289\n51#1:291\n51#1:293\n51#1:295\n51#1:297\n51#1:299\n51#1:301\n51#1:303\n51#1:305\n51#1:307\n51#1:310\n51#1:312\n51#1:314\n51#1:316\n51#1:318\n51#1:320\n51#1:322\n51#1:324\n51#1:326\n51#1:328\n51#1:330\n51#1:332\n51#1:334\n51#1:336\n81#2:284\n67#2:285\n69#2:286\n85#2:288\n71#2:290\n73#2:292\n75#2:294\n77#2:296\n91#2:298\n89#2:300\n83#2:302\n79#2:304\n81#2:306\n67#2:308\n69#2:309\n71#2:311\n73#2:313\n75#2:315\n77#2:317\n79#2:319\n81#2:321\n83#2:323\n85#2:325\n87#2:327\n89#2:329\n91#2:331\n93#2:333\n95#2:335\n69#2:337\n69#2:339\n83#2:340\n71#2:342\n73#2:344\n79#2:346\n87#2:348\n89#2:350\n91#2:352\n87#2:354\n196#3:338\n196#3:341\n196#3:343\n196#3:345\n196#3:347\n196#3:349\n196#3:351\n196#3:353\n340#4:355\n206#4,2:356\n208#4,7:361\n215#4,15:369\n1182#5:358\n1161#5,2:359\n48#6:368\n*S KotlinDebug\n*F\n+ 1 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n*L\n103#1:287\n106#1:289\n109#1:291\n112#1:293\n115#1:295\n121#1:297\n124#1:299\n127#1:301\n130#1:303\n133#1:305\n140#1:307\n149#1:310\n152#1:312\n155#1:314\n158#1:316\n161#1:318\n164#1:320\n167#1:322\n170#1:324\n173#1:326\n176#1:328\n179#1:330\n182#1:332\n185#1:334\n188#1:336\n59#1:284\n101#1:285\n103#1:286\n106#1:288\n109#1:290\n112#1:292\n115#1:294\n121#1:296\n124#1:298\n127#1:300\n130#1:302\n133#1:304\n140#1:306\n147#1:308\n149#1:309\n152#1:311\n155#1:313\n158#1:315\n161#1:317\n164#1:319\n167#1:321\n170#1:323\n173#1:325\n176#1:327\n179#1:329\n182#1:331\n185#1:333\n188#1:335\n209#1:337\n212#1:339\n216#1:340\n219#1:342\n222#1:344\n225#1:346\n228#1:348\n237#1:350\n246#1:352\n253#1:354\n209#1:338\n216#1:341\n219#1:343\n222#1:345\n225#1:347\n228#1:349\n237#1:351\n246#1:353\n253#1:355\n253#1:356,2\n253#1:361,7\n253#1:369,15\n253#1:358\n253#1:359,2\n253#1:368\n*E\n"})
/* renamed from: androidx.compose.ui.node.NodeKindKt */
/* compiled from: NodeKind.kt */
public final class NodeKindKt {
    private static final int Inserted = 1;
    private static final int Removed = 2;
    private static final int Updated = 0;

    public static final void autoInvalidateInsertedNode(Modifier.Node node) {
        C12775o.m28639i(node, "node");
        autoInvalidateNode(node, 1);
    }

    private static final void autoInvalidateNode(Modifier.Node node, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        if (node.isAttached()) {
            boolean z8 = true;
            if ((NodeKind.m37625constructorimpl(2) & node.getKindSet$ui_release()) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && (node instanceof LayoutModifierNode)) {
                LayoutModifierNodeKt.invalidateMeasurements((LayoutModifierNode) node);
                if (i == 2) {
                    DelegatableNodeKt.m37467requireCoordinator64DMado(node, NodeKind.m37625constructorimpl(2)).onRelease();
                }
            }
            if ((NodeKind.m37625constructorimpl(256) & node.getKindSet$ui_release()) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && (node instanceof GlobalPositionAwareModifierNode)) {
                DelegatableNodeKt.requireLayoutNode(node).invalidateMeasurements$ui_release();
            }
            if ((NodeKind.m37625constructorimpl(4) & node.getKindSet$ui_release()) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 && (node instanceof DrawModifierNode)) {
                DrawModifierNodeKt.invalidateDraw((DrawModifierNode) node);
            }
            if ((NodeKind.m37625constructorimpl(8) & node.getKindSet$ui_release()) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4 && (node instanceof SemanticsModifierNode)) {
                SemanticsModifierNodeKt.invalidateSemantics((SemanticsModifierNode) node);
            }
            if ((NodeKind.m37625constructorimpl(64) & node.getKindSet$ui_release()) != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5 && (node instanceof ParentDataModifierNode)) {
                ParentDataModifierNodeKt.invalidateParentData((ParentDataModifierNode) node);
            }
            if ((NodeKind.m37625constructorimpl(1024) & node.getKindSet$ui_release()) != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6 && (node instanceof FocusTargetModifierNode)) {
                if (i == 2) {
                    node.onReset();
                } else {
                    DelegatableNodeKt.requireOwner(node).getFocusOwner().scheduleInvalidation((FocusTargetModifierNode) node);
                }
            }
            if ((NodeKind.m37625constructorimpl(2048) & node.getKindSet$ui_release()) != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7 && (node instanceof FocusPropertiesModifierNode)) {
                FocusPropertiesModifierNode focusPropertiesModifierNode = (FocusPropertiesModifierNode) node;
                if (specifiesCanFocusProperty(focusPropertiesModifierNode)) {
                    if (i == 2) {
                        scheduleInvalidationOfAssociatedFocusTargets(focusPropertiesModifierNode);
                    } else {
                        DelegatableNodeKt.requireOwner(node).getFocusOwner().scheduleInvalidation(focusPropertiesModifierNode);
                    }
                }
            }
            if ((NodeKind.m37625constructorimpl(4096) & node.getKindSet$ui_release()) == 0) {
                z8 = false;
            }
            if (z8 && (node instanceof FocusEventModifierNode) && i != 2) {
                DelegatableNodeKt.requireOwner(node).getFocusOwner().scheduleInvalidation((FocusEventModifierNode) node);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final void autoInvalidateRemovedNode(Modifier.Node node) {
        C12775o.m28639i(node, "node");
        autoInvalidateNode(node, 2);
    }

    public static final void autoInvalidateUpdatedNode(Modifier.Node node) {
        C12775o.m28639i(node, "node");
        autoInvalidateNode(node, 0);
    }

    public static final int calculateNodeKindSetFrom(Modifier.Element element) {
        C12775o.m28639i(element, CloudMethodReturns.RETURN_KEYNAME_ELEMENT);
        int r0 = NodeKind.m37625constructorimpl(1);
        if (element instanceof LayoutModifier) {
            r0 |= NodeKind.m37625constructorimpl(2);
        }
        if (element instanceof IntermediateLayoutModifier) {
            r0 |= NodeKind.m37625constructorimpl(512);
        }
        if (element instanceof DrawModifier) {
            r0 |= NodeKind.m37625constructorimpl(4);
        }
        if (element instanceof SemanticsModifier) {
            r0 |= NodeKind.m37625constructorimpl(8);
        }
        if (element instanceof PointerInputModifier) {
            r0 |= NodeKind.m37625constructorimpl(16);
        }
        if ((element instanceof ModifierLocalConsumer) || (element instanceof ModifierLocalProvider)) {
            r0 |= NodeKind.m37625constructorimpl(32);
        }
        if (element instanceof FocusEventModifier) {
            r0 |= NodeKind.m37625constructorimpl(4096);
        }
        if (element instanceof FocusOrderModifier) {
            r0 |= NodeKind.m37625constructorimpl(2048);
        }
        if (element instanceof OnGloballyPositionedModifier) {
            r0 |= NodeKind.m37625constructorimpl(256);
        }
        if (element instanceof ParentDataModifier) {
            r0 |= NodeKind.m37625constructorimpl(64);
        }
        return ((element instanceof OnPlacedModifier) || (element instanceof OnRemeasuredModifier) || (element instanceof LookaheadOnPlacedModifier)) ? r0 | NodeKind.m37625constructorimpl(128) : r0;
    }

    /* renamed from: getIncludeSelfInTraversal-H91voCI  reason: not valid java name */
    public static final boolean m37633getIncludeSelfInTraversalH91voCI(int i) {
        if ((i & NodeKind.m37625constructorimpl(128)) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: or-64DMado  reason: not valid java name */
    public static final int m37635or64DMado(int i, int i2) {
        return i | i2;
    }

    @ExperimentalComposeUiApi
    private static final void scheduleInvalidationOfAssociatedFocusTargets(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        int r0 = NodeKind.m37625constructorimpl(1024);
        if (focusPropertiesModifierNode.getNode().isAttached()) {
            MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = focusPropertiesModifierNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector, focusPropertiesModifierNode.getNode());
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
                            break;
                        } else if ((node.getKindSet$ui_release() & r0) == 0) {
                            node = node.getChild$ui_release();
                        } else if (node instanceof FocusTargetModifierNode) {
                            DelegatableNodeKt.requireOwner(focusPropertiesModifierNode).getFocusOwner().scheduleInvalidation((FocusTargetModifierNode) node);
                        }
                    }
                }
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @ExperimentalComposeUiApi
    private static final boolean specifiesCanFocusProperty(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        CanFocusChecker canFocusChecker = CanFocusChecker.INSTANCE;
        canFocusChecker.reset();
        focusPropertiesModifierNode.modifyFocusProperties(canFocusChecker);
        return canFocusChecker.isCanFocusSet();
    }

    /* renamed from: getIncludeSelfInTraversal-H91voCI$annotations  reason: not valid java name */
    public static /* synthetic */ void m37634getIncludeSelfInTraversalH91voCI$annotations(int i) {
    }

    public static final int calculateNodeKindSetFrom(Modifier.Node node) {
        C12775o.m28639i(node, "node");
        int r0 = NodeKind.m37625constructorimpl(1);
        if (node instanceof LayoutModifierNode) {
            r0 |= NodeKind.m37625constructorimpl(2);
        }
        if (node instanceof DrawModifierNode) {
            r0 |= NodeKind.m37625constructorimpl(4);
        }
        if (node instanceof SemanticsModifierNode) {
            r0 |= NodeKind.m37625constructorimpl(8);
        }
        if (node instanceof PointerInputModifierNode) {
            r0 |= NodeKind.m37625constructorimpl(16);
        }
        if (node instanceof ModifierLocalNode) {
            r0 |= NodeKind.m37625constructorimpl(32);
        }
        if (node instanceof ParentDataModifierNode) {
            r0 |= NodeKind.m37625constructorimpl(64);
        }
        if (node instanceof LayoutAwareModifierNode) {
            r0 |= NodeKind.m37625constructorimpl(128);
        }
        if (node instanceof GlobalPositionAwareModifierNode) {
            r0 |= NodeKind.m37625constructorimpl(256);
        }
        if (node instanceof IntermediateLayoutModifierNode) {
            r0 |= NodeKind.m37625constructorimpl(512);
        }
        if (node instanceof FocusTargetModifierNode) {
            r0 |= NodeKind.m37625constructorimpl(1024);
        }
        if (node instanceof FocusPropertiesModifierNode) {
            r0 |= NodeKind.m37625constructorimpl(2048);
        }
        if (node instanceof FocusEventModifierNode) {
            r0 |= NodeKind.m37625constructorimpl(4096);
        }
        if (node instanceof KeyInputModifierNode) {
            r0 |= NodeKind.m37625constructorimpl(8192);
        }
        return node instanceof RotaryInputModifierNode ? r0 | NodeKind.m37625constructorimpl(16384) : r0;
    }
}
