package androidx.compose.p002ui.focus;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.layout.BeyondBoundsLayout;
import androidx.compose.p002ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.p002ui.modifier.ModifierLocalNode;
import androidx.compose.p002ui.node.DelegatableNodeKt;
import androidx.compose.p002ui.node.LayoutNode;
import androidx.compose.p002ui.node.ModifierNodeElement;
import androidx.compose.p002ui.node.NodeChain;
import androidx.compose.p002ui.node.NodeKind;
import androidx.compose.p002ui.node.ObserverNode;
import androidx.compose.p002ui.node.ObserverNodeKt;
import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12773m;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
@SourceDebugExtension({"SMAP\nFocusTargetModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTargetModifierNode.kt\nandroidx/compose/ui/focus/FocusTargetModifierNode\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n1#1,195:1\n89#2:196\n87#2:197\n87#2:208\n91#2:217\n87#2:218\n87#2:229\n47#3:198\n47#3:219\n78#4,9:199\n88#4,7:210\n78#4,9:220\n88#4,7:231\n196#5:209\n196#5:230\n*S KotlinDebug\n*F\n+ 1 FocusTargetModifierNode.kt\nandroidx/compose/ui/focus/FocusTargetModifierNode\n*L\n88#1:196\n88#1:197\n91#1:208\n174#1:217\n174#1:218\n175#1:229\n88#1:198\n174#1:219\n88#1:199,9\n88#1:210,7\n174#1:220,9\n174#1:231,7\n91#1:209\n175#1:230\n*E\n"})
/* renamed from: androidx.compose.ui.focus.FocusTargetModifierNode */
/* compiled from: FocusTargetModifierNode.kt */
public final class FocusTargetModifierNode extends Modifier.Node implements ObserverNode, ModifierLocalNode {
    public static final int $stable = 8;
    private FocusStateImpl focusStateImpl = FocusStateImpl.Inactive;
    /* access modifiers changed from: private */
    public boolean isProcessingCustomEnter;
    /* access modifiers changed from: private */
    public boolean isProcessingCustomExit;

    /* renamed from: androidx.compose.ui.focus.FocusTargetModifierNode$FocusTargetModifierElement */
    /* compiled from: FocusTargetModifierNode.kt */
    public static final class FocusTargetModifierElement extends ModifierNodeElement<FocusTargetModifierNode> {
        public static final FocusTargetModifierElement INSTANCE = new FocusTargetModifierElement();

        private FocusTargetModifierElement() {
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 1739042953;
        }

        public void inspectableProperties(InspectorInfo inspectorInfo) {
            C12775o.m28639i(inspectorInfo, "<this>");
            inspectorInfo.setName("focusTarget");
        }

        public FocusTargetModifierNode update(FocusTargetModifierNode focusTargetModifierNode) {
            C12775o.m28639i(focusTargetModifierNode, "node");
            return focusTargetModifierNode;
        }

        public FocusTargetModifierNode create() {
            return new FocusTargetModifierNode();
        }
    }

    /* renamed from: fetchCustomEnter-aToIllA$ui_release  reason: not valid java name */
    public final void m35372fetchCustomEnteraToIllA$ui_release(int i, Function1<? super FocusRequester, C11921v> function1) {
        C12775o.m28639i(function1, "block");
        if (!this.isProcessingCustomEnter) {
            this.isProcessingCustomEnter = true;
            try {
                FocusRequester invoke = fetchFocusProperties$ui_release().getEnter().invoke(FocusDirection.m35341boximpl(i));
                if (invoke != FocusRequester.Companion.getDefault()) {
                    function1.invoke(invoke);
                }
            } finally {
                C12773m.m28629b(1);
                this.isProcessingCustomEnter = false;
                C12773m.m28628a(1);
            }
        }
    }

    /* renamed from: fetchCustomExit-aToIllA$ui_release  reason: not valid java name */
    public final void m35373fetchCustomExitaToIllA$ui_release(int i, Function1<? super FocusRequester, C11921v> function1) {
        C12775o.m28639i(function1, "block");
        if (!this.isProcessingCustomExit) {
            this.isProcessingCustomExit = true;
            try {
                FocusRequester invoke = fetchFocusProperties$ui_release().getExit().invoke(FocusDirection.m35341boximpl(i));
                if (invoke != FocusRequester.Companion.getDefault()) {
                    function1.invoke(invoke);
                }
            } finally {
                C12773m.m28629b(1);
                this.isProcessingCustomExit = false;
                C12773m.m28628a(1);
            }
        }
    }

    @ExperimentalComposeUiApi
    public final FocusProperties fetchFocusProperties$ui_release() {
        NodeChain nodes$ui_release;
        boolean z;
        FocusPropertiesImpl focusPropertiesImpl = new FocusPropertiesImpl();
        int r1 = NodeKind.m37625constructorimpl(2048) | NodeKind.m37625constructorimpl(1024);
        if (getNode().isAttached()) {
            Modifier.Node parent$ui_release = getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(this);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & r1) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & r1) != 0) {
                            if ((NodeKind.m37625constructorimpl(1024) & parent$ui_release.getKindSet$ui_release()) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                return focusPropertiesImpl;
                            }
                            if (parent$ui_release instanceof FocusPropertiesModifierNode) {
                                ((FocusPropertiesModifierNode) parent$ui_release).modifyFocusProperties(focusPropertiesImpl);
                            } else {
                                throw new IllegalStateException("Check failed.".toString());
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
            return focusPropertiesImpl;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final BeyondBoundsLayout getBeyondBoundsLayoutParent$ui_release() {
        return (BeyondBoundsLayout) getCurrent(BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout());
    }

    public final FocusState getFocusState() {
        return this.focusStateImpl;
    }

    public final FocusStateImpl getFocusStateImpl$ui_release() {
        return this.focusStateImpl;
    }

    public final void invalidateFocus$ui_release() {
        boolean z;
        FocusProperties focusProperties;
        FocusState focusState = getFocusState();
        if (focusState == FocusStateImpl.Active || focusState == FocusStateImpl.Captured) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ObserverNodeKt.observeReads(this, new FocusTargetModifierNode$invalidateFocus$1(ref$ObjectRef, this));
            T t = ref$ObjectRef.f20403b;
            if (t == null) {
                C12775o.m28656z("focusProperties");
                focusProperties = null;
            } else {
                focusProperties = (FocusProperties) t;
            }
            if (!focusProperties.getCanFocus()) {
                DelegatableNodeKt.requireOwner(this).getFocusOwner().clearFocus(true);
            }
        } else if (focusState != FocusStateImpl.ActiveParent) {
            FocusStateImpl focusStateImpl2 = FocusStateImpl.Active;
        }
    }

    public void onObservedReadsChanged() {
        FocusState focusState = getFocusState();
        invalidateFocus$ui_release();
        if (!C12775o.m28634d(focusState, getFocusState())) {
            FocusEventModifierNodeKt.refreshFocusEventNodes(this);
        }
    }

    public void onReset() {
        boolean z;
        FocusState focusState = getFocusState();
        if (focusState == FocusStateImpl.Active || focusState == FocusStateImpl.Captured) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            DelegatableNodeKt.requireOwner(this).getFocusOwner().clearFocus(true);
        } else if (focusState == FocusStateImpl.ActiveParent) {
            scheduleInvalidationForFocusEvents$ui_release();
            this.focusStateImpl = FocusStateImpl.Inactive;
        } else if (focusState == FocusStateImpl.Inactive) {
            scheduleInvalidationForFocusEvents$ui_release();
        }
    }

    public final void scheduleInvalidationForFocusEvents$ui_release() {
        NodeChain nodes$ui_release;
        boolean z;
        int r0 = NodeKind.m37625constructorimpl(4096) | NodeKind.m37625constructorimpl(1024);
        if (getNode().isAttached()) {
            Modifier.Node parent$ui_release = getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(this);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & r0) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & r0) != 0) {
                            if ((NodeKind.m37625constructorimpl(1024) & parent$ui_release.getKindSet$ui_release()) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                continue;
                            } else if (parent$ui_release instanceof FocusEventModifierNode) {
                                DelegatableNodeKt.requireOwner(this).getFocusOwner().scheduleInvalidation((FocusEventModifierNode) parent$ui_release);
                            } else {
                                throw new IllegalStateException("Check failed.".toString());
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
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void setFocusStateImpl$ui_release(FocusStateImpl focusStateImpl2) {
        C12775o.m28639i(focusStateImpl2, "<set-?>");
        this.focusStateImpl = focusStateImpl2;
    }
}
