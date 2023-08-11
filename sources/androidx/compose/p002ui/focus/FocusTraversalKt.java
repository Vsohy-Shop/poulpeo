package androidx.compose.p002ui.focus;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.focus.FocusDirection;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.layout.LayoutCoordinatesKt;
import androidx.compose.p002ui.node.DelegatableNodeKt;
import androidx.compose.p002ui.node.LayoutNode;
import androidx.compose.p002ui.node.NodeChain;
import androidx.compose.p002ui.node.NodeCoordinator;
import androidx.compose.p002ui.node.NodeKind;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nFocusTraversal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTraversal.kt\nandroidx/compose/ui/focus/FocusTraversalKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,173:1\n1#2:174\n87#3:175\n87#3:205\n87#3:235\n340#4:176\n206#4,2:177\n208#4,7:182\n215#4,15:190\n340#4:206\n206#4,2:207\n208#4,7:212\n215#4,15:220\n314#4:236\n78#4,17:237\n1182#5:179\n1161#5,2:180\n1182#5:209\n1161#5,2:210\n48#6:189\n48#6:219\n*S KotlinDebug\n*F\n+ 1 FocusTraversal.kt\nandroidx/compose/ui/focus/FocusTraversalKt\n*L\n142#1:175\n156#1:205\n168#1:235\n142#1:176\n142#1:177,2\n142#1:182,7\n142#1:190,15\n156#1:206\n156#1:207,2\n156#1:212,7\n156#1:220,15\n168#1:236\n168#1:237,17\n142#1:179\n142#1:180,2\n156#1:209\n156#1:210,2\n142#1:189\n156#1:219\n*E\n"})
/* renamed from: androidx.compose.ui.focus.FocusTraversalKt */
/* compiled from: FocusTraversal.kt */
public final class FocusTraversalKt {

    /* renamed from: androidx.compose.ui.focus.FocusTraversalKt$WhenMappings */
    /* compiled from: FocusTraversal.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|19) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0032 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003b */
        static {
            /*
                androidx.compose.ui.unit.LayoutDirection[] r0 = androidx.compose.p002ui.unit.LayoutDirection.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                androidx.compose.ui.unit.LayoutDirection r2 = androidx.compose.p002ui.unit.LayoutDirection.Ltr     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                androidx.compose.ui.unit.LayoutDirection r3 = androidx.compose.p002ui.unit.LayoutDirection.Rtl     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                androidx.compose.ui.focus.FocusStateImpl[] r0 = androidx.compose.p002ui.focus.FocusStateImpl.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.focus.FocusStateImpl r3 = androidx.compose.p002ui.focus.FocusStateImpl.Active     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.p002ui.focus.FocusStateImpl.ActiveParent     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.p002ui.focus.FocusStateImpl.Captured     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.p002ui.focus.FocusStateImpl.Inactive     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                $EnumSwitchMapping$1 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.focus.FocusTraversalKt.WhenMappings.<clinit>():void");
        }
    }

    /* renamed from: customFocusSearch--OM-vw8  reason: not valid java name */
    public static final FocusRequester m35374customFocusSearchOMvw8(FocusTargetModifierNode focusTargetModifierNode, int i, LayoutDirection layoutDirection) {
        FocusRequester focusRequester;
        FocusRequester focusRequester2;
        C12775o.m28639i(focusTargetModifierNode, "$this$customFocusSearch");
        C12775o.m28639i(layoutDirection, "layoutDirection");
        FocusProperties fetchFocusProperties$ui_release = focusTargetModifierNode.fetchFocusProperties$ui_release();
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m35344equalsimpl0(i, companion.m35357getNextdhqQ8s())) {
            return fetchFocusProperties$ui_release.getNext();
        }
        if (FocusDirection.m35344equalsimpl0(i, companion.m35359getPreviousdhqQ8s())) {
            return fetchFocusProperties$ui_release.getPrevious();
        }
        if (FocusDirection.m35344equalsimpl0(i, companion.m35361getUpdhqQ8s())) {
            return fetchFocusProperties$ui_release.getUp();
        }
        if (FocusDirection.m35344equalsimpl0(i, companion.m35352getDowndhqQ8s())) {
            return fetchFocusProperties$ui_release.getDown();
        }
        if (FocusDirection.m35344equalsimpl0(i, companion.m35356getLeftdhqQ8s())) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i2 == 1) {
                focusRequester2 = fetchFocusProperties$ui_release.getStart();
            } else if (i2 == 2) {
                focusRequester2 = fetchFocusProperties$ui_release.getEnd();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (C12775o.m28634d(focusRequester2, FocusRequester.Companion.getDefault())) {
                focusRequester2 = null;
            }
            if (focusRequester2 == null) {
                return fetchFocusProperties$ui_release.getLeft();
            }
        } else if (FocusDirection.m35344equalsimpl0(i, companion.m35360getRightdhqQ8s())) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i3 == 1) {
                focusRequester = fetchFocusProperties$ui_release.getEnd();
            } else if (i3 == 2) {
                focusRequester = fetchFocusProperties$ui_release.getStart();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (C12775o.m28634d(focusRequester, FocusRequester.Companion.getDefault())) {
                focusRequester = null;
            }
            if (focusRequester2 == null) {
                return fetchFocusProperties$ui_release.getRight();
            }
        } else if (FocusDirection.m35344equalsimpl0(i, companion.m35353getEnterdhqQ8s())) {
            return fetchFocusProperties$ui_release.getEnter().invoke(FocusDirection.m35341boximpl(i));
        } else {
            if (FocusDirection.m35344equalsimpl0(i, companion.m35354getExitdhqQ8s())) {
                return fetchFocusProperties$ui_release.getExit().invoke(FocusDirection.m35341boximpl(i));
            }
            throw new IllegalStateException("invalid FocusDirection".toString());
        }
        return focusRequester2;
    }

    public static final FocusTargetModifierNode findActiveFocusNode(FocusTargetModifierNode focusTargetModifierNode) {
        FocusTargetModifierNode findActiveFocusNode;
        C12775o.m28639i(focusTargetModifierNode, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[focusTargetModifierNode.getFocusStateImpl$ui_release().ordinal()];
        if (i != 1) {
            if (i == 2) {
                int r0 = NodeKind.m37625constructorimpl(1024);
                if (focusTargetModifierNode.getNode().isAttached()) {
                    MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
                    Modifier.Node child$ui_release = focusTargetModifierNode.getNode().getChild$ui_release();
                    if (child$ui_release == null) {
                        DelegatableNodeKt.addLayoutNodeChildren(mutableVector, focusTargetModifierNode.getNode());
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
                                } else if ((node instanceof FocusTargetModifierNode) && (findActiveFocusNode = findActiveFocusNode((FocusTargetModifierNode) node)) != null) {
                                    return findActiveFocusNode;
                                }
                            }
                        }
                    }
                    return null;
                }
                throw new IllegalStateException("Check failed.".toString());
            } else if (i != 3) {
                if (i == 4) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return focusTargetModifierNode;
    }

    private static final FocusTargetModifierNode findNonDeactivatedParent(FocusTargetModifierNode focusTargetModifierNode) {
        NodeChain nodes$ui_release;
        int r0 = NodeKind.m37625constructorimpl(1024);
        if (focusTargetModifierNode.getNode().isAttached()) {
            Modifier.Node parent$ui_release = focusTargetModifierNode.getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetModifierNode);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & r0) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & r0) != 0 && (parent$ui_release instanceof FocusTargetModifierNode)) {
                            FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) parent$ui_release;
                            if (focusTargetModifierNode2.fetchFocusProperties$ui_release().getCanFocus()) {
                                return focusTargetModifierNode2;
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
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @ExperimentalComposeUiApi
    public static final Rect focusRect(FocusTargetModifierNode focusTargetModifierNode) {
        Rect localBoundingBoxOf;
        C12775o.m28639i(focusTargetModifierNode, "<this>");
        NodeCoordinator coordinator$ui_release = focusTargetModifierNode.getCoordinator$ui_release();
        if (coordinator$ui_release == null || (localBoundingBoxOf = LayoutCoordinatesKt.findRootCoordinates(coordinator$ui_release).localBoundingBoxOf(coordinator$ui_release, false)) == null) {
            return Rect.Companion.getZero();
        }
        return localBoundingBoxOf;
    }

    /* renamed from: focusSearch-sMXa3k8  reason: not valid java name */
    public static final boolean m35375focusSearchsMXa3k8(FocusTargetModifierNode focusTargetModifierNode, int i, LayoutDirection layoutDirection, Function1<? super FocusTargetModifierNode, Boolean> function1) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        FocusTargetModifierNode focusTargetModifierNode2;
        int i2;
        Boolean r4;
        C12775o.m28639i(focusTargetModifierNode, "$this$focusSearch");
        C12775o.m28639i(layoutDirection, "layoutDirection");
        C12775o.m28639i(function1, "onFound");
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m35344equalsimpl0(i, companion.m35357getNextdhqQ8s())) {
            z = true;
        } else {
            z = FocusDirection.m35344equalsimpl0(i, companion.m35359getPreviousdhqQ8s());
        }
        if (z) {
            return OneDimensionalFocusSearchKt.m35378oneDimensionalFocusSearchOMvw8(focusTargetModifierNode, i, function1);
        }
        if (FocusDirection.m35344equalsimpl0(i, companion.m35356getLeftdhqQ8s())) {
            z2 = true;
        } else {
            z2 = FocusDirection.m35344equalsimpl0(i, companion.m35360getRightdhqQ8s());
        }
        if (z2) {
            z3 = true;
        } else {
            z3 = FocusDirection.m35344equalsimpl0(i, companion.m35361getUpdhqQ8s());
        }
        if (z3) {
            z4 = true;
        } else {
            z4 = FocusDirection.m35344equalsimpl0(i, companion.m35352getDowndhqQ8s());
        }
        if (z4) {
            Boolean r42 = TwoDimensionalFocusSearchKt.m35387twoDimensionalFocusSearchOMvw8(focusTargetModifierNode, i, function1);
            if (r42 != null) {
                return r42.booleanValue();
            }
        } else if (FocusDirection.m35344equalsimpl0(i, companion.m35353getEnterdhqQ8s())) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i3 == 1) {
                i2 = companion.m35360getRightdhqQ8s();
            } else if (i3 == 2) {
                i2 = companion.m35356getLeftdhqQ8s();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            FocusTargetModifierNode findActiveFocusNode = findActiveFocusNode(focusTargetModifierNode);
            if (!(findActiveFocusNode == null || (r4 = TwoDimensionalFocusSearchKt.m35387twoDimensionalFocusSearchOMvw8(findActiveFocusNode, i2, function1)) == null)) {
                return r4.booleanValue();
            }
        } else if (FocusDirection.m35344equalsimpl0(i, companion.m35354getExitdhqQ8s())) {
            FocusTargetModifierNode findActiveFocusNode2 = findActiveFocusNode(focusTargetModifierNode);
            if (findActiveFocusNode2 != null) {
                focusTargetModifierNode2 = findNonDeactivatedParent(findActiveFocusNode2);
            } else {
                focusTargetModifierNode2 = null;
            }
            if (focusTargetModifierNode2 != null && !C12775o.m28634d(focusTargetModifierNode2, focusTargetModifierNode)) {
                return function1.invoke(focusTargetModifierNode2).booleanValue();
            }
        } else {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + FocusDirection.m35346toStringimpl(i)).toString());
        }
        return false;
    }

    public static final FocusTargetModifierNode getActiveChild(FocusTargetModifierNode focusTargetModifierNode) {
        C12775o.m28639i(focusTargetModifierNode, "<this>");
        if (!focusTargetModifierNode.getNode().isAttached()) {
            return null;
        }
        int r0 = NodeKind.m37625constructorimpl(1024);
        if (focusTargetModifierNode.getNode().isAttached()) {
            MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = focusTargetModifierNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector, focusTargetModifierNode.getNode());
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
                        } else if (node instanceof FocusTargetModifierNode) {
                            FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) node;
                            int i = WhenMappings.$EnumSwitchMapping$1[focusTargetModifierNode2.getFocusStateImpl$ui_release().ordinal()];
                            if (i == 1 || i == 2 || i == 3) {
                                return focusTargetModifierNode2;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public static final boolean isEligibleForFocusSearch(FocusTargetModifierNode focusTargetModifierNode) {
        boolean z;
        boolean z2;
        LayoutNode layoutNode;
        LayoutNode layoutNode2;
        C12775o.m28639i(focusTargetModifierNode, "<this>");
        NodeCoordinator coordinator$ui_release = focusTargetModifierNode.getCoordinator$ui_release();
        if (coordinator$ui_release == null || (layoutNode2 = coordinator$ui_release.getLayoutNode()) == null || !layoutNode2.isPlaced()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            NodeCoordinator coordinator$ui_release2 = focusTargetModifierNode.getCoordinator$ui_release();
            if (coordinator$ui_release2 == null || (layoutNode = coordinator$ui_release2.getLayoutNode()) == null || !layoutNode.isAttached()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getActiveChild$annotations(FocusTargetModifierNode focusTargetModifierNode) {
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void isEligibleForFocusSearch$annotations(FocusTargetModifierNode focusTargetModifierNode) {
    }
}
