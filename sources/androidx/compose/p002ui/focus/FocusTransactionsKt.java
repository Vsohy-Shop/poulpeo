package androidx.compose.p002ui.focus;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.node.DelegatableNodeKt;
import androidx.compose.p002ui.node.LayoutNode;
import androidx.compose.p002ui.node.NodeCoordinator;
import androidx.compose.p002ui.node.NodeKind;
import androidx.compose.p002ui.node.ObserverNodeKt;
import androidx.compose.p002ui.node.Owner;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nFocusTransactions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTransactions.kt\nandroidx/compose/ui/focus/FocusTransactionsKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n1#1,242:1\n87#2:243\n87#2:245\n87#2:247\n324#3:244\n324#3:246\n324#3:248\n*S KotlinDebug\n*F\n+ 1 FocusTransactions.kt\nandroidx/compose/ui/focus/FocusTransactionsKt\n*L\n55#1:243\n185#1:245\n209#1:247\n55#1:244\n185#1:246\n209#1:248\n*E\n"})
/* renamed from: androidx.compose.ui.focus.FocusTransactionsKt */
/* compiled from: FocusTransactions.kt */
public final class FocusTransactionsKt {

    /* renamed from: androidx.compose.ui.focus.FocusTransactionsKt$WhenMappings */
    /* compiled from: FocusTransactions.kt */
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
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.p002ui.focus.FocusStateImpl.Active     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.p002ui.focus.FocusStateImpl.Captured     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.p002ui.focus.FocusStateImpl.ActiveParent     // Catch:{ NoSuchFieldError -> 0x0022 }
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.focus.FocusTransactionsKt.WhenMappings.<clinit>():void");
        }
    }

    @ExperimentalComposeUiApi
    public static final boolean captureFocus(FocusTargetModifierNode focusTargetModifierNode) {
        C12775o.m28639i(focusTargetModifierNode, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[focusTargetModifierNode.getFocusStateImpl$ui_release().ordinal()];
        if (i == 1) {
            focusTargetModifierNode.setFocusStateImpl$ui_release(FocusStateImpl.Captured);
            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode);
            return true;
        } else if (i == 2) {
            return true;
        } else {
            if (i == 3 || i == 4) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @ExperimentalComposeUiApi
    private static final boolean clearChildFocus(FocusTargetModifierNode focusTargetModifierNode, boolean z, boolean z2) {
        FocusTargetModifierNode activeChild = FocusTraversalKt.getActiveChild(focusTargetModifierNode);
        if (activeChild != null) {
            return clearFocus(activeChild, z, z2);
        }
        return true;
    }

    static /* synthetic */ boolean clearChildFocus$default(FocusTargetModifierNode focusTargetModifierNode, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return clearChildFocus(focusTargetModifierNode, z, z2);
    }

    @ExperimentalComposeUiApi
    public static final boolean clearFocus(FocusTargetModifierNode focusTargetModifierNode, boolean z, boolean z2) {
        C12775o.m28639i(focusTargetModifierNode, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[focusTargetModifierNode.getFocusStateImpl$ui_release().ordinal()];
        if (i == 1) {
            focusTargetModifierNode.setFocusStateImpl$ui_release(FocusStateImpl.Inactive);
            if (z2) {
                FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode);
            }
        } else if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (!clearChildFocus(focusTargetModifierNode, z, z2)) {
                return false;
            } else {
                focusTargetModifierNode.setFocusStateImpl$ui_release(FocusStateImpl.Inactive);
                if (z2) {
                    FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode);
                }
            }
        } else if (!z) {
            return z;
        } else {
            focusTargetModifierNode.setFocusStateImpl$ui_release(FocusStateImpl.Inactive);
            if (!z2) {
                return z;
            }
            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode);
            return z;
        }
        return true;
    }

    public static /* synthetic */ boolean clearFocus$default(FocusTargetModifierNode focusTargetModifierNode, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return clearFocus(focusTargetModifierNode, z, z2);
    }

    @ExperimentalComposeUiApi
    public static final boolean freeFocus(FocusTargetModifierNode focusTargetModifierNode) {
        C12775o.m28639i(focusTargetModifierNode, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[focusTargetModifierNode.getFocusStateImpl$ui_release().ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            focusTargetModifierNode.setFocusStateImpl$ui_release(FocusStateImpl.Active);
            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode);
            return true;
        } else if (i == 3 || i == 4) {
            return false;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    private static final boolean grantFocus(FocusTargetModifierNode focusTargetModifierNode) {
        ObserverNodeKt.observeReads(focusTargetModifierNode, new FocusTransactionsKt$grantFocus$1(focusTargetModifierNode));
        int i = WhenMappings.$EnumSwitchMapping$0[focusTargetModifierNode.getFocusStateImpl$ui_release().ordinal()];
        if (i != 3 && i != 4) {
            return true;
        }
        focusTargetModifierNode.setFocusStateImpl$ui_release(FocusStateImpl.Active);
        return true;
    }

    @ExperimentalComposeUiApi
    public static final boolean requestFocus(FocusTargetModifierNode focusTargetModifierNode) {
        C12775o.m28639i(focusTargetModifierNode, "<this>");
        if (!focusTargetModifierNode.getNode().isAttached()) {
            throw new IllegalStateException("Check failed.".toString());
        } else if (!focusTargetModifierNode.fetchFocusProperties$ui_release().getCanFocus()) {
            return TwoDimensionalFocusSearchKt.m35383findChildCorrespondingToFocusEnterOMvw8(focusTargetModifierNode, FocusDirection.Companion.m35353getEnterdhqQ8s(), FocusTransactionsKt$requestFocus$1.INSTANCE);
        } else {
            int i = WhenMappings.$EnumSwitchMapping$0[focusTargetModifierNode.getFocusStateImpl$ui_release().ordinal()];
            boolean z = true;
            if (i == 1 || i == 2) {
                FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode);
                return true;
            }
            FocusTargetModifierNode focusTargetModifierNode2 = null;
            if (i == 3) {
                if (!clearChildFocus$default(focusTargetModifierNode, false, false, 3, (Object) null) || !grantFocus(focusTargetModifierNode)) {
                    z = false;
                }
                if (z) {
                    FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode);
                }
                return z;
            } else if (i == 4) {
                Modifier.Node nearestAncestor = DelegatableNodeKt.nearestAncestor(focusTargetModifierNode, NodeKind.m37625constructorimpl(1024));
                if (nearestAncestor instanceof FocusTargetModifierNode) {
                    focusTargetModifierNode2 = nearestAncestor;
                }
                FocusTargetModifierNode focusTargetModifierNode3 = focusTargetModifierNode2;
                if (focusTargetModifierNode3 != null) {
                    return requestFocusForChild(focusTargetModifierNode3, focusTargetModifierNode);
                }
                if (!requestFocusForOwner(focusTargetModifierNode) || !grantFocus(focusTargetModifierNode)) {
                    z = false;
                }
                if (z) {
                    FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode);
                }
                return z;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private static final boolean requestFocusForChild(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2) {
        Modifier.Node nearestAncestor = DelegatableNodeKt.nearestAncestor(focusTargetModifierNode2, NodeKind.m37625constructorimpl(1024));
        FocusTargetModifierNode focusTargetModifierNode3 = null;
        if (!(nearestAncestor instanceof FocusTargetModifierNode)) {
            nearestAncestor = null;
        }
        if (C12775o.m28634d((FocusTargetModifierNode) nearestAncestor, focusTargetModifierNode)) {
            int i = WhenMappings.$EnumSwitchMapping$0[focusTargetModifierNode.getFocusStateImpl$ui_release().ordinal()];
            boolean z = true;
            if (i == 1) {
                boolean grantFocus = grantFocus(focusTargetModifierNode2);
                if (!grantFocus) {
                    return grantFocus;
                }
                focusTargetModifierNode.setFocusStateImpl$ui_release(FocusStateImpl.ActiveParent);
                FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode2);
                FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode);
                return grantFocus;
            } else if (i == 2) {
                return false;
            } else {
                if (i != 3) {
                    if (i == 4) {
                        Modifier.Node nearestAncestor2 = DelegatableNodeKt.nearestAncestor(focusTargetModifierNode, NodeKind.m37625constructorimpl(1024));
                        if (nearestAncestor2 instanceof FocusTargetModifierNode) {
                            focusTargetModifierNode3 = nearestAncestor2;
                        }
                        FocusTargetModifierNode focusTargetModifierNode4 = focusTargetModifierNode3;
                        if (focusTargetModifierNode4 == null && requestFocusForOwner(focusTargetModifierNode)) {
                            focusTargetModifierNode.setFocusStateImpl$ui_release(FocusStateImpl.Active);
                            FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode);
                            return requestFocusForChild(focusTargetModifierNode, focusTargetModifierNode2);
                        } else if (focusTargetModifierNode4 == null || !requestFocusForChild(focusTargetModifierNode4, focusTargetModifierNode)) {
                            return false;
                        } else {
                            boolean requestFocusForChild = requestFocusForChild(focusTargetModifierNode, focusTargetModifierNode2);
                            if (focusTargetModifierNode.getFocusState() != FocusStateImpl.ActiveParent) {
                                z = false;
                            }
                            if (z) {
                                return requestFocusForChild;
                            }
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (FocusTraversalKt.getActiveChild(focusTargetModifierNode) != null) {
                    if (!clearChildFocus$default(focusTargetModifierNode, false, false, 3, (Object) null) || !grantFocus(focusTargetModifierNode2)) {
                        z = false;
                    }
                    if (z) {
                        FocusEventModifierNodeKt.refreshFocusEventNodes(focusTargetModifierNode2);
                    }
                    return z;
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
        } else {
            throw new IllegalStateException("Non child node cannot request focus.".toString());
        }
    }

    private static final boolean requestFocusForOwner(FocusTargetModifierNode focusTargetModifierNode) {
        LayoutNode layoutNode;
        Owner owner$ui_release;
        NodeCoordinator coordinator$ui_release = focusTargetModifierNode.getCoordinator$ui_release();
        if (coordinator$ui_release != null && (layoutNode = coordinator$ui_release.getLayoutNode()) != null && (owner$ui_release = layoutNode.getOwner$ui_release()) != null) {
            return owner$ui_release.requestFocus();
        }
        throw new IllegalStateException("Owner not initialized.".toString());
    }
}
