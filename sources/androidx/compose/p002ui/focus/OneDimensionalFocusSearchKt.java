package androidx.compose.p002ui.focus;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.focus.FocusDirection;
import androidx.compose.p002ui.node.DelegatableNodeKt;
import androidx.compose.p002ui.node.NodeKind;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p436tf.C13528f;

@SourceDebugExtension({"SMAP\nOneDimensionalFocusSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/OneDimensionalFocusSearchKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,273:1\n187#1,3:306\n190#1,2:310\n193#1,5:313\n202#1,3:318\n205#1,2:322\n208#1,5:325\n1161#2,2:274\n1182#2:280\n1161#2,2:281\n1161#2,2:330\n1182#2:336\n1161#2,2:337\n1161#2,2:373\n1182#2:379\n1161#2,2:380\n87#3:276\n87#3:332\n87#3:375\n87#3:416\n340#4:277\n206#4,2:278\n208#4,7:283\n215#4,15:291\n340#4:333\n206#4,2:334\n208#4,7:339\n215#4,15:347\n340#4:376\n206#4,2:377\n208#4,7:382\n215#4,15:390\n324#4:417\n48#5:290\n53#5:309\n523#5:312\n53#5:321\n523#5:324\n48#5:346\n204#5,11:362\n48#5:389\n492#5,11:405\n53#5:418\n523#5:419\n523#5:420\n53#5:421\n523#5:422\n523#5:423\n*S KotlinDebug\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/OneDimensionalFocusSearchKt\n*L\n136#1:306,3\n136#1:310,2\n136#1:313,5\n139#1:318,3\n139#1:322,2\n139#1:325,5\n131#1:274,2\n132#1:280\n132#1:281,2\n158#1:330,2\n159#1:336\n159#1:337,2\n169#1:373,2\n170#1:379\n170#1:380,2\n132#1:276\n159#1:332\n170#1:375\n182#1:416\n132#1:277\n132#1:278,2\n132#1:283,7\n132#1:291,15\n159#1:333\n159#1:334,2\n159#1:339,7\n159#1:347,15\n170#1:376\n170#1:377,2\n170#1:382,7\n170#1:390,15\n182#1:417\n132#1:290\n136#1:309\n136#1:312\n139#1:321\n139#1:324\n159#1:346\n162#1:362,11\n170#1:389\n173#1:405,11\n189#1:418\n191#1:419\n193#1:420\n204#1:421\n206#1:422\n208#1:423\n*E\n"})
/* renamed from: androidx.compose.ui.focus.OneDimensionalFocusSearchKt */
/* compiled from: OneDimensionalFocusSearch.kt */
public final class OneDimensionalFocusSearchKt {
    private static final String InvalidFocusDirection = "This function should only be used for 1-D focus search";
    private static final String NoActiveChild = "ActiveParent must have a focusedChild";

    /* renamed from: androidx.compose.ui.focus.OneDimensionalFocusSearchKt$WhenMappings */
    /* compiled from: OneDimensionalFocusSearch.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                androidx.compose.ui.focus.FocusStateImpl[] r0 = androidx.compose.p002ui.focus.FocusStateImpl.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.p002ui.focus.FocusStateImpl.ActiveParent     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.p002ui.focus.FocusStateImpl.Active     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.p002ui.focus.FocusStateImpl.Captured     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.p002ui.focus.FocusStateImpl.Inactive     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.focus.OneDimensionalFocusSearchKt.WhenMappings.<clinit>():void");
        }
    }

    @ExperimentalComposeUiApi
    private static final boolean backwardFocusSearch(FocusTargetModifierNode focusTargetModifierNode, Function1<? super FocusTargetModifierNode, Boolean> function1) {
        boolean z;
        FocusStateImpl focusStateImpl$ui_release = focusTargetModifierNode.getFocusStateImpl$ui_release();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[focusStateImpl$ui_release.ordinal()];
        if (i == 1) {
            FocusTargetModifierNode activeChild = FocusTraversalKt.getActiveChild(focusTargetModifierNode);
            if (activeChild != null) {
                int i2 = iArr[activeChild.getFocusStateImpl$ui_release().ordinal()];
                if (i2 != 1) {
                    if (i2 == 2 || i2 == 3) {
                        return m35377generateAndSearchChildren4C6V_qg(focusTargetModifierNode, activeChild, FocusDirection.Companion.m35359getPreviousdhqQ8s(), function1);
                    }
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException(NoActiveChild.toString());
                } else if (!backwardFocusSearch(activeChild, function1) && !m35377generateAndSearchChildren4C6V_qg(focusTargetModifierNode, activeChild, FocusDirection.Companion.m35359getPreviousdhqQ8s(), function1) && (!activeChild.fetchFocusProperties$ui_release().getCanFocus() || !function1.invoke(activeChild).booleanValue())) {
                    return false;
                }
            } else {
                throw new IllegalStateException(NoActiveChild.toString());
            }
        } else if (i == 2 || i == 3) {
            return pickChildForBackwardSearch(focusTargetModifierNode, function1);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            } else if (!pickChildForBackwardSearch(focusTargetModifierNode, function1)) {
                if (focusTargetModifierNode.fetchFocusProperties$ui_release().getCanFocus()) {
                    z = function1.invoke(focusTargetModifierNode).booleanValue();
                } else {
                    z = false;
                }
                if (!z) {
                    return false;
                }
            }
        }
        return true;
    }

    private static final <T> void forEachItemAfter(MutableVector<T> mutableVector, T t, Function1<? super T, C11921v> function1) {
        boolean z = false;
        C13528f fVar = new C13528f(0, mutableVector.getSize() - 1);
        int j = fVar.mo53147j();
        int k = fVar.mo53148k();
        if (j <= k) {
            while (true) {
                if (z) {
                    function1.invoke(mutableVector.getContent()[j]);
                }
                if (C12775o.m28634d(mutableVector.getContent()[j], t)) {
                    z = true;
                }
                if (j != k) {
                    j++;
                } else {
                    return;
                }
            }
        }
    }

    private static final <T> void forEachItemBefore(MutableVector<T> mutableVector, T t, Function1<? super T, C11921v> function1) {
        boolean z = false;
        C13528f fVar = new C13528f(0, mutableVector.getSize() - 1);
        int j = fVar.mo53147j();
        int k = fVar.mo53148k();
        if (j <= k) {
            while (true) {
                if (z) {
                    function1.invoke(mutableVector.getContent()[k]);
                }
                if (C12775o.m28634d(mutableVector.getContent()[k], t)) {
                    z = true;
                }
                if (k != j) {
                    k--;
                } else {
                    return;
                }
            }
        }
    }

    @ExperimentalComposeUiApi
    private static final boolean forwardFocusSearch(FocusTargetModifierNode focusTargetModifierNode, Function1<? super FocusTargetModifierNode, Boolean> function1) {
        int i = WhenMappings.$EnumSwitchMapping$0[focusTargetModifierNode.getFocusStateImpl$ui_release().ordinal()];
        if (i == 1) {
            FocusTargetModifierNode activeChild = FocusTraversalKt.getActiveChild(focusTargetModifierNode);
            if (activeChild == null) {
                throw new IllegalStateException(NoActiveChild.toString());
            } else if (forwardFocusSearch(activeChild, function1) || m35377generateAndSearchChildren4C6V_qg(focusTargetModifierNode, activeChild, FocusDirection.Companion.m35357getNextdhqQ8s(), function1)) {
                return true;
            } else {
                return false;
            }
        } else if (i == 2 || i == 3) {
            return pickChildForForwardSearch(focusTargetModifierNode, function1);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            } else if (focusTargetModifierNode.fetchFocusProperties$ui_release().getCanFocus()) {
                return function1.invoke(focusTargetModifierNode).booleanValue();
            } else {
                return pickChildForForwardSearch(focusTargetModifierNode, function1);
            }
        }
    }

    @ExperimentalComposeUiApi
    /* renamed from: generateAndSearchChildren-4C6V_qg  reason: not valid java name */
    private static final boolean m35377generateAndSearchChildren4C6V_qg(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2, int i, Function1<? super FocusTargetModifierNode, Boolean> function1) {
        if (m35379searchChildren4C6V_qg(focusTargetModifierNode, focusTargetModifierNode2, i, function1)) {
            return true;
        }
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.m35340searchBeyondBoundsOMvw8(focusTargetModifierNode, i, new OneDimensionalFocusSearchKt$generateAndSearchChildren$1(focusTargetModifierNode, focusTargetModifierNode2, i, function1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean isRoot(FocusTargetModifierNode focusTargetModifierNode) {
        Modifier.Node nearestAncestor = DelegatableNodeKt.nearestAncestor(focusTargetModifierNode, NodeKind.m37625constructorimpl(1024));
        if (!(nearestAncestor instanceof FocusTargetModifierNode)) {
            nearestAncestor = null;
        }
        if (((FocusTargetModifierNode) nearestAncestor) == null) {
            return true;
        }
        return false;
    }

    @ExperimentalComposeUiApi
    /* renamed from: oneDimensionalFocusSearch--OM-vw8  reason: not valid java name */
    public static final boolean m35378oneDimensionalFocusSearchOMvw8(FocusTargetModifierNode focusTargetModifierNode, int i, Function1<? super FocusTargetModifierNode, Boolean> function1) {
        C12775o.m28639i(focusTargetModifierNode, "$this$oneDimensionalFocusSearch");
        C12775o.m28639i(function1, "onFound");
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m35344equalsimpl0(i, companion.m35357getNextdhqQ8s())) {
            return forwardFocusSearch(focusTargetModifierNode, function1);
        }
        if (FocusDirection.m35344equalsimpl0(i, companion.m35359getPreviousdhqQ8s())) {
            return backwardFocusSearch(focusTargetModifierNode, function1);
        }
        throw new IllegalStateException(InvalidFocusDirection.toString());
    }

    @ExperimentalComposeUiApi
    private static final boolean pickChildForBackwardSearch(FocusTargetModifierNode focusTargetModifierNode, Function1<? super FocusTargetModifierNode, Boolean> function1) {
        MutableVector mutableVector = new MutableVector(new FocusTargetModifierNode[16], 0);
        int r2 = NodeKind.m37625constructorimpl(1024);
        if (focusTargetModifierNode.getNode().isAttached()) {
            MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = focusTargetModifierNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusTargetModifierNode.getNode());
            } else {
                mutableVector2.add(child$ui_release);
            }
            while (mutableVector2.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & r2) == 0) {
                    DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node);
                } else {
                    while (true) {
                        if (node == null) {
                            break;
                        } else if ((node.getKindSet$ui_release() & r2) == 0) {
                            node = node.getChild$ui_release();
                        } else if (node instanceof FocusTargetModifierNode) {
                            mutableVector.add((FocusTargetModifierNode) node);
                        }
                    }
                }
            }
            mutableVector.sortWith(FocusableChildrenComparator.INSTANCE);
            int size = mutableVector.getSize();
            if (size > 0) {
                int i = size - 1;
                Object[] content = mutableVector.getContent();
                do {
                    FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) content[i];
                    if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetModifierNode2) && backwardFocusSearch(focusTargetModifierNode2, function1)) {
                        return true;
                    }
                    i--;
                } while (i >= 0);
            }
            return false;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @ExperimentalComposeUiApi
    private static final boolean pickChildForForwardSearch(FocusTargetModifierNode focusTargetModifierNode, Function1<? super FocusTargetModifierNode, Boolean> function1) {
        boolean z;
        MutableVector mutableVector = new MutableVector(new FocusTargetModifierNode[16], 0);
        int r2 = NodeKind.m37625constructorimpl(1024);
        if (focusTargetModifierNode.getNode().isAttached()) {
            MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
            Modifier.Node child$ui_release = focusTargetModifierNode.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusTargetModifierNode.getNode());
            } else {
                mutableVector2.add(child$ui_release);
            }
            while (mutableVector2.isNotEmpty()) {
                Modifier.Node node = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
                if ((node.getAggregateChildKindSet$ui_release() & r2) == 0) {
                    DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node);
                } else {
                    while (true) {
                        if (node == null) {
                            break;
                        } else if ((node.getKindSet$ui_release() & r2) == 0) {
                            node = node.getChild$ui_release();
                        } else if (node instanceof FocusTargetModifierNode) {
                            mutableVector.add((FocusTargetModifierNode) node);
                        }
                    }
                }
            }
            mutableVector.sortWith(FocusableChildrenComparator.INSTANCE);
            int size = mutableVector.getSize();
            if (size <= 0) {
                return false;
            }
            Object[] content = mutableVector.getContent();
            int i = 0;
            do {
                FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) content[i];
                if (!FocusTraversalKt.isEligibleForFocusSearch(focusTargetModifierNode2) || !forwardFocusSearch(focusTargetModifierNode2, function1)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    return true;
                }
                i++;
            } while (i < size);
            return false;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* access modifiers changed from: private */
    @ExperimentalComposeUiApi
    /* renamed from: searchChildren-4C6V_qg  reason: not valid java name */
    public static final boolean m35379searchChildren4C6V_qg(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2, int i, Function1<? super FocusTargetModifierNode, Boolean> function1) {
        boolean z;
        if (focusTargetModifierNode.getFocusStateImpl$ui_release() == FocusStateImpl.ActiveParent) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            MutableVector mutableVector = new MutableVector(new FocusTargetModifierNode[16], 0);
            int r4 = NodeKind.m37625constructorimpl(1024);
            if (focusTargetModifierNode.getNode().isAttached()) {
                MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                Modifier.Node child$ui_release = focusTargetModifierNode.getNode().getChild$ui_release();
                if (child$ui_release == null) {
                    DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusTargetModifierNode.getNode());
                } else {
                    mutableVector2.add(child$ui_release);
                }
                while (mutableVector2.isNotEmpty()) {
                    Modifier.Node node = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
                    if ((node.getAggregateChildKindSet$ui_release() & r4) == 0) {
                        DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node);
                    } else {
                        while (true) {
                            if (node == null) {
                                break;
                            } else if ((node.getKindSet$ui_release() & r4) == 0) {
                                node = node.getChild$ui_release();
                            } else if (node instanceof FocusTargetModifierNode) {
                                mutableVector.add((FocusTargetModifierNode) node);
                            }
                        }
                    }
                }
                mutableVector.sortWith(FocusableChildrenComparator.INSTANCE);
                FocusDirection.Companion companion = FocusDirection.Companion;
                if (FocusDirection.m35344equalsimpl0(i, companion.m35357getNextdhqQ8s())) {
                    C13528f fVar = new C13528f(0, mutableVector.getSize() - 1);
                    int j = fVar.mo53147j();
                    int k = fVar.mo53148k();
                    if (j <= k) {
                        boolean z2 = false;
                        while (true) {
                            if (z2) {
                                FocusTargetModifierNode focusTargetModifierNode3 = (FocusTargetModifierNode) mutableVector.getContent()[j];
                                if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetModifierNode3) && forwardFocusSearch(focusTargetModifierNode3, function1)) {
                                    return true;
                                }
                            }
                            if (C12775o.m28634d(mutableVector.getContent()[j], focusTargetModifierNode2)) {
                                z2 = true;
                            }
                            if (j == k) {
                                break;
                            }
                            j++;
                        }
                    }
                } else if (FocusDirection.m35344equalsimpl0(i, companion.m35359getPreviousdhqQ8s())) {
                    C13528f fVar2 = new C13528f(0, mutableVector.getSize() - 1);
                    int j2 = fVar2.mo53147j();
                    int k2 = fVar2.mo53148k();
                    if (j2 <= k2) {
                        boolean z3 = false;
                        while (true) {
                            if (z3) {
                                FocusTargetModifierNode focusTargetModifierNode4 = (FocusTargetModifierNode) mutableVector.getContent()[k2];
                                if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetModifierNode4) && backwardFocusSearch(focusTargetModifierNode4, function1)) {
                                    return true;
                                }
                            }
                            if (C12775o.m28634d(mutableVector.getContent()[k2], focusTargetModifierNode2)) {
                                z3 = true;
                            }
                            if (k2 == j2) {
                                break;
                            }
                            k2--;
                        }
                    }
                } else {
                    throw new IllegalStateException(InvalidFocusDirection.toString());
                }
                if (FocusDirection.m35344equalsimpl0(i, FocusDirection.Companion.m35357getNextdhqQ8s()) || !focusTargetModifierNode.fetchFocusProperties$ui_release().getCanFocus() || isRoot(focusTargetModifierNode)) {
                    return false;
                }
                return function1.invoke(focusTargetModifierNode).booleanValue();
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        throw new IllegalStateException("This function should only be used within a parent that has focus.".toString());
    }
}
