package androidx.compose.p002ui.focus;

import android.view.KeyEvent;
import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.focus.FocusDirection;
import androidx.compose.p002ui.focus.FocusRequester;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.input.key.KeyInputModifierNode;
import androidx.compose.p002ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.p002ui.input.rotary.RotaryScrollEvent;
import androidx.compose.p002ui.node.DelegatableNode;
import androidx.compose.p002ui.node.DelegatableNodeKt;
import androidx.compose.p002ui.node.NodeKind;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.core.app.NotificationCompat;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nFocusOwnerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n+ 6 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n1#1,275:1\n224#1:279\n225#1:281\n226#1,3:288\n229#1:297\n224#1:301\n225#1:303\n226#1,3:310\n229#1:319\n93#2:276\n93#2:278\n95#2:298\n95#2:300\n87#2,7:333\n87#2:348\n324#3:277\n320#3:280\n324#3:299\n320#3:302\n320#3:320\n262#3,7:341\n270#3,3:350\n51#4,6:282\n33#4,6:291\n51#4,6:304\n33#4,6:313\n51#4,6:321\n33#4,6:327\n47#5:340\n196#6:349\n*S KotlinDebug\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl\n*L\n177#1:279\n177#1:281\n177#1:288,3\n177#1:297\n194#1:301\n194#1:303\n194#1:310,3\n194#1:319\n175#1:276\n178#1:278\n192#1:298\n195#1:300\n242#1:333,7\n243#1:348\n175#1:277\n177#1:280\n192#1:299\n194#1:302\n224#1:320\n242#1:341,7\n242#1:350,3\n177#1:282,6\n177#1:291,6\n194#1:304,6\n194#1:313,6\n225#1:321,6\n228#1:327,6\n242#1:340\n243#1:349\n*E\n"})
/* renamed from: androidx.compose.ui.focus.FocusOwnerImpl */
/* compiled from: FocusOwnerImpl.kt */
public final class FocusOwnerImpl implements FocusOwner {
    private final FocusInvalidationManager focusInvalidationManager;
    public LayoutDirection layoutDirection;
    private final Modifier modifier;
    private FocusTargetModifierNode rootFocusNode = new FocusTargetModifierNode();

    /* renamed from: androidx.compose.ui.focus.FocusOwnerImpl$WhenMappings */
    /* compiled from: FocusOwnerImpl.kt */
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
                androidx.compose.ui.focus.FocusStateImpl r1 = androidx.compose.p002ui.focus.FocusStateImpl.ActiveParent     // Catch:{ NoSuchFieldError -> 0x0019 }
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.focus.FocusOwnerImpl.WhenMappings.<clinit>():void");
        }
    }

    public FocusOwnerImpl(Function1<? super C13074a<C11921v>, C11921v> function1) {
        C12775o.m28639i(function1, "onRequestApplyChangesListener");
        this.focusInvalidationManager = new FocusInvalidationManager(function1);
        this.modifier = new FocusOwnerImpl$modifier$1(this);
    }

    private final KeyInputModifierNode lastLocalKeyInputNode(DelegatableNode delegatableNode) {
        boolean z;
        int r1 = NodeKind.m37625constructorimpl(1024) | NodeKind.m37625constructorimpl(8192);
        if (delegatableNode.getNode().isAttached()) {
            Modifier.Node node = delegatableNode.getNode();
            KeyInputModifierNode keyInputModifierNode = null;
            if ((node.getAggregateChildKindSet$ui_release() & r1) != 0) {
                for (Modifier.Node child$ui_release = node.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                    if ((child$ui_release.getKindSet$ui_release() & r1) != 0) {
                        if ((NodeKind.m37625constructorimpl(1024) & child$ui_release.getKindSet$ui_release()) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            return keyInputModifierNode;
                        }
                        if (child$ui_release instanceof KeyInputModifierNode) {
                            keyInputModifierNode = child$ui_release;
                        } else {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    }
                }
            }
            return keyInputModifierNode;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @ExperimentalComposeUiApi
    /* renamed from: traverseAncestors-Y-YKmho  reason: not valid java name */
    private final /* synthetic */ <T extends DelegatableNode> void m35364traverseAncestorsYYKmho(T t, int i, Function1<? super T, C11921v> function1, Function1<? super T, C11921v> function12) {
        int i2;
        List<Modifier.Node> ancestors = DelegatableNodeKt.ancestors(t, i);
        if (!(ancestors instanceof List)) {
            ancestors = null;
        }
        if (ancestors != null && ancestors.size() - 1 >= 0) {
            while (true) {
                int i3 = i2 - 1;
                function1.invoke(ancestors.get(i2));
                if (i3 < 0) {
                    break;
                }
                i2 = i3;
            }
        }
        function1.invoke(t);
        function12.invoke(t);
        if (ancestors != null) {
            int size = ancestors.size();
            for (int i4 = 0; i4 < size; i4++) {
                function12.invoke(ancestors.get(i4));
            }
        }
    }

    /* renamed from: wrapAroundFocus-3ESFkO8  reason: not valid java name */
    private final boolean m35365wrapAroundFocus3ESFkO8(int i) {
        boolean z;
        if (this.rootFocusNode.getFocusState().getHasFocus() && !this.rootFocusNode.getFocusState().isFocused()) {
            FocusDirection.Companion companion = FocusDirection.Companion;
            if (FocusDirection.m35344equalsimpl0(i, companion.m35357getNextdhqQ8s())) {
                z = true;
            } else {
                z = FocusDirection.m35344equalsimpl0(i, companion.m35359getPreviousdhqQ8s());
            }
            if (z) {
                clearFocus(false);
                if (!this.rootFocusNode.getFocusState().isFocused()) {
                    return false;
                }
                return m35367moveFocus3ESFkO8(i);
            }
        }
        return false;
    }

    public void clearFocus(boolean z) {
        clearFocus(z, true);
    }

    /* renamed from: dispatchKeyEvent-ZmokQxo  reason: not valid java name */
    public boolean m35366dispatchKeyEventZmokQxo(KeyEvent keyEvent) {
        int i;
        C12775o.m28639i(keyEvent, "keyEvent");
        FocusTargetModifierNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (findActiveFocusNode != null) {
            KeyInputModifierNode lastLocalKeyInputNode = lastLocalKeyInputNode(findActiveFocusNode);
            List<Modifier.Node> list = null;
            if (lastLocalKeyInputNode == null) {
                Modifier.Node nearestAncestor = DelegatableNodeKt.nearestAncestor(findActiveFocusNode, NodeKind.m37625constructorimpl(8192));
                if (!(nearestAncestor instanceof KeyInputModifierNode)) {
                    nearestAncestor = null;
                }
                lastLocalKeyInputNode = (KeyInputModifierNode) nearestAncestor;
            }
            if (lastLocalKeyInputNode != null) {
                List<Modifier.Node> ancestors = DelegatableNodeKt.ancestors(lastLocalKeyInputNode, NodeKind.m37625constructorimpl(8192));
                if (ancestors instanceof List) {
                    list = ancestors;
                }
                if (list != null && list.size() - 1 >= 0) {
                    while (true) {
                        int i2 = i - 1;
                        if (((KeyInputModifierNode) list.get(i)).m37036onPreKeyEventZmokQxo(keyEvent)) {
                            return true;
                        }
                        if (i2 < 0) {
                            break;
                        }
                        i = i2;
                    }
                }
                if (lastLocalKeyInputNode.m37036onPreKeyEventZmokQxo(keyEvent) || lastLocalKeyInputNode.m37035onKeyEventZmokQxo(keyEvent)) {
                    return true;
                }
                if (list != null) {
                    int size = list.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        if (((KeyInputModifierNode) list.get(i3)).m37035onKeyEventZmokQxo(keyEvent)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        throw new IllegalStateException("Event can't be processed because we do not have an active focus target.".toString());
    }

    public boolean dispatchRotaryEvent(RotaryScrollEvent rotaryScrollEvent) {
        RotaryInputModifierNode rotaryInputModifierNode;
        int i;
        C12775o.m28639i(rotaryScrollEvent, NotificationCompat.CATEGORY_EVENT);
        FocusTargetModifierNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        List<Modifier.Node> list = null;
        if (findActiveFocusNode != null) {
            Modifier.Node nearestAncestor = DelegatableNodeKt.nearestAncestor(findActiveFocusNode, NodeKind.m37625constructorimpl(16384));
            if (!(nearestAncestor instanceof RotaryInputModifierNode)) {
                nearestAncestor = null;
            }
            rotaryInputModifierNode = (RotaryInputModifierNode) nearestAncestor;
        } else {
            rotaryInputModifierNode = null;
        }
        if (rotaryInputModifierNode != null) {
            List<Modifier.Node> ancestors = DelegatableNodeKt.ancestors(rotaryInputModifierNode, NodeKind.m37625constructorimpl(16384));
            if (ancestors instanceof List) {
                list = ancestors;
            }
            if (list != null && list.size() - 1 >= 0) {
                while (true) {
                    int i2 = i - 1;
                    if (((RotaryInputModifierNode) list.get(i)).onPreRotaryScrollEvent(rotaryScrollEvent)) {
                        return true;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    i = i2;
                }
            }
            if (rotaryInputModifierNode.onPreRotaryScrollEvent(rotaryScrollEvent) || rotaryInputModifierNode.onRotaryScrollEvent(rotaryScrollEvent)) {
                return true;
            }
            if (list != null) {
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    if (((RotaryInputModifierNode) list.get(i3)).onRotaryScrollEvent(rotaryScrollEvent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public Rect getFocusRect() {
        FocusTargetModifierNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (findActiveFocusNode != null) {
            return FocusTraversalKt.focusRect(findActiveFocusNode);
        }
        return null;
    }

    public LayoutDirection getLayoutDirection() {
        LayoutDirection layoutDirection2 = this.layoutDirection;
        if (layoutDirection2 != null) {
            return layoutDirection2;
        }
        C12775o.m28656z("layoutDirection");
        return null;
    }

    public Modifier getModifier() {
        return this.modifier;
    }

    public final FocusTargetModifierNode getRootFocusNode$ui_release() {
        return this.rootFocusNode;
    }

    /* renamed from: moveFocus-3ESFkO8  reason: not valid java name */
    public boolean m35367moveFocus3ESFkO8(int i) {
        FocusTargetModifierNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(this.rootFocusNode);
        if (findActiveFocusNode == null) {
            return false;
        }
        FocusRequester r2 = FocusTraversalKt.m35374customFocusSearchOMvw8(findActiveFocusNode, i, getLayoutDirection());
        FocusRequester.Companion companion = FocusRequester.Companion;
        if (C12775o.m28634d(r2, companion.getCancel())) {
            return false;
        }
        if (!C12775o.m28634d(r2, companion.getDefault())) {
            return r2.findFocusTarget$ui_release(FocusOwnerImpl$moveFocus$1.INSTANCE);
        }
        if (FocusTraversalKt.m35375focusSearchsMXa3k8(this.rootFocusNode, i, getLayoutDirection(), new FocusOwnerImpl$moveFocus$foundNextItem$1(findActiveFocusNode)) || m35365wrapAroundFocus3ESFkO8(i)) {
            return true;
        }
        return false;
    }

    public void releaseFocus() {
        FocusTransactionsKt.clearFocus(this.rootFocusNode, true, true);
    }

    public void scheduleInvalidation(FocusTargetModifierNode focusTargetModifierNode) {
        C12775o.m28639i(focusTargetModifierNode, "node");
        this.focusInvalidationManager.scheduleInvalidation(focusTargetModifierNode);
    }

    public void setLayoutDirection(LayoutDirection layoutDirection2) {
        C12775o.m28639i(layoutDirection2, "<set-?>");
        this.layoutDirection = layoutDirection2;
    }

    public final void setRootFocusNode$ui_release(FocusTargetModifierNode focusTargetModifierNode) {
        C12775o.m28639i(focusTargetModifierNode, "<set-?>");
        this.rootFocusNode = focusTargetModifierNode;
    }

    public void takeFocus() {
        if (this.rootFocusNode.getFocusStateImpl$ui_release() == FocusStateImpl.Inactive) {
            this.rootFocusNode.setFocusStateImpl$ui_release(FocusStateImpl.Active);
        }
    }

    public void clearFocus(boolean z, boolean z2) {
        FocusStateImpl focusStateImpl;
        FocusStateImpl focusStateImpl$ui_release = this.rootFocusNode.getFocusStateImpl$ui_release();
        if (FocusTransactionsKt.clearFocus(this.rootFocusNode, z, z2)) {
            FocusTargetModifierNode focusTargetModifierNode = this.rootFocusNode;
            int i = WhenMappings.$EnumSwitchMapping$0[focusStateImpl$ui_release.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                focusStateImpl = FocusStateImpl.Active;
            } else if (i == 4) {
                focusStateImpl = FocusStateImpl.Inactive;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            focusTargetModifierNode.setFocusStateImpl$ui_release(focusStateImpl);
        }
    }

    public void scheduleInvalidation(FocusEventModifierNode focusEventModifierNode) {
        C12775o.m28639i(focusEventModifierNode, "node");
        this.focusInvalidationManager.scheduleInvalidation(focusEventModifierNode);
    }

    public void scheduleInvalidation(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        C12775o.m28639i(focusPropertiesModifierNode, "node");
        this.focusInvalidationManager.scheduleInvalidation(focusPropertiesModifierNode);
    }

    public static /* synthetic */ void getModifier$annotations() {
    }

    public static /* synthetic */ void getRootFocusNode$ui_release$annotations() {
    }
}
