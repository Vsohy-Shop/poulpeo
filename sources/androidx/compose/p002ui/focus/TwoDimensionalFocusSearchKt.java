package androidx.compose.p002ui.focus;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.focus.FocusDirection;
import androidx.compose.p002ui.focus.FocusRequester;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.node.DelegatableNodeKt;
import androidx.compose.p002ui.node.NodeKind;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nTwoDimensionalFocusSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TwoDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/TwoDimensionalFocusSearchKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n1#1,425:1\n1#2:426\n1161#3,2:427\n1161#3,2:431\n1182#3:437\n1161#3,2:438\n1182#3:467\n1161#3,2:468\n359#4:429\n523#4:430\n48#4:447\n460#4,11:482\n460#4,11:501\n87#5:433\n87#5:463\n340#6:434\n206#6,2:435\n208#6,7:440\n215#6,15:448\n346#6:464\n237#6,2:465\n239#6,12:470\n251#6,8:493\n*S KotlinDebug\n*F\n+ 1 TwoDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/TwoDimensionalFocusSearchKt\n*L\n120#1:427,2\n178#1:431,2\n179#1:437\n179#1:438,2\n214#1:467\n214#1:468,2\n125#1:429\n125#1:430\n179#1:447\n227#1:482,11\n259#1:501,11\n179#1:433\n214#1:463\n179#1:434\n179#1:435,2\n179#1:440,7\n179#1:448,15\n214#1:464\n214#1:465,2\n214#1:470,12\n214#1:493,8\n*E\n"})
/* renamed from: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt */
/* compiled from: TwoDimensionalFocusSearch.kt */
public final class TwoDimensionalFocusSearchKt {
    private static final String InvalidFocusDirection = "This function should only be used for 2-D focus search";
    private static final String NoActiveChild = "ActiveParent must have a focusedChild";

    /* renamed from: androidx.compose.ui.focus.TwoDimensionalFocusSearchKt$WhenMappings */
    /* compiled from: TwoDimensionalFocusSearch.kt */
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.focus.TwoDimensionalFocusSearchKt.WhenMappings.<clinit>():void");
        }
    }

    @ExperimentalComposeUiApi
    private static final FocusTargetModifierNode activeNode(FocusTargetModifierNode focusTargetModifierNode) {
        boolean z;
        if (focusTargetModifierNode.getFocusState() == FocusStateImpl.ActiveParent) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            FocusTargetModifierNode findActiveFocusNode = FocusTraversalKt.findActiveFocusNode(focusTargetModifierNode);
            if (findActiveFocusNode != null) {
                return findActiveFocusNode;
            }
            throw new IllegalStateException(NoActiveChild.toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: beamBeats-I7lrPNg  reason: not valid java name */
    private static final boolean m35381beamBeatsI7lrPNg(Rect rect, Rect rect2, Rect rect3, int i) {
        if (beamBeats_I7lrPNg$inSourceBeam(rect3, i, rect) || !beamBeats_I7lrPNg$inSourceBeam(rect2, i, rect)) {
            return false;
        }
        if (beamBeats_I7lrPNg$isInDirectionOfSearch(rect3, i, rect)) {
            FocusDirection.Companion companion = FocusDirection.Companion;
            if (!FocusDirection.m35344equalsimpl0(i, companion.m35356getLeftdhqQ8s()) && !FocusDirection.m35344equalsimpl0(i, companion.m35360getRightdhqQ8s()) && beamBeats_I7lrPNg$majorAxisDistance$15(rect2, i, rect) >= beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(rect3, i, rect)) {
                return false;
            }
        }
        return true;
    }

    private static final boolean beamBeats_I7lrPNg$inSourceBeam(Rect rect, int i, Rect rect2) {
        boolean z;
        boolean z2;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m35344equalsimpl0(i, companion.m35356getLeftdhqQ8s())) {
            z = true;
        } else {
            z = FocusDirection.m35344equalsimpl0(i, companion.m35360getRightdhqQ8s());
        }
        if (!z) {
            if (FocusDirection.m35344equalsimpl0(i, companion.m35361getUpdhqQ8s())) {
                z2 = true;
            } else {
                z2 = FocusDirection.m35344equalsimpl0(i, companion.m35352getDowndhqQ8s());
            }
            if (!z2) {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            } else if (rect.getRight() > rect2.getLeft() && rect.getLeft() < rect2.getRight()) {
                return true;
            }
        } else if (rect.getBottom() > rect2.getTop() && rect.getTop() < rect2.getBottom()) {
            return true;
        }
        return false;
    }

    private static final boolean beamBeats_I7lrPNg$isInDirectionOfSearch(Rect rect, int i, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m35344equalsimpl0(i, companion.m35356getLeftdhqQ8s())) {
            if (rect2.getLeft() >= rect.getRight()) {
                return true;
            }
        } else if (FocusDirection.m35344equalsimpl0(i, companion.m35360getRightdhqQ8s())) {
            if (rect2.getRight() <= rect.getLeft()) {
                return true;
            }
        } else if (FocusDirection.m35344equalsimpl0(i, companion.m35361getUpdhqQ8s())) {
            if (rect2.getTop() >= rect.getBottom()) {
                return true;
            }
        } else if (!FocusDirection.m35344equalsimpl0(i, companion.m35352getDowndhqQ8s())) {
            throw new IllegalStateException(InvalidFocusDirection.toString());
        } else if (rect2.getBottom() <= rect.getTop()) {
            return true;
        }
        return false;
    }

    private static final float beamBeats_I7lrPNg$majorAxisDistance$15(Rect rect, int i, Rect rect2) {
        float f;
        float top;
        float bottom;
        float top2;
        float bottom2;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m35344equalsimpl0(i, companion.m35356getLeftdhqQ8s())) {
            top2 = rect2.getLeft();
            bottom2 = rect.getRight();
        } else {
            if (FocusDirection.m35344equalsimpl0(i, companion.m35360getRightdhqQ8s())) {
                top = rect.getLeft();
                bottom = rect2.getRight();
            } else if (FocusDirection.m35344equalsimpl0(i, companion.m35361getUpdhqQ8s())) {
                top2 = rect2.getTop();
                bottom2 = rect.getBottom();
            } else if (FocusDirection.m35344equalsimpl0(i, companion.m35352getDowndhqQ8s())) {
                top = rect.getTop();
                bottom = rect2.getBottom();
            } else {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
            f = top - bottom;
            return Math.max(0.0f, f);
        }
        f = top2 - bottom2;
        return Math.max(0.0f, f);
    }

    private static final float beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(Rect rect, int i, Rect rect2) {
        float f;
        float bottom;
        float bottom2;
        float top;
        float top2;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m35344equalsimpl0(i, companion.m35356getLeftdhqQ8s())) {
            top = rect2.getLeft();
            top2 = rect.getLeft();
        } else {
            if (FocusDirection.m35344equalsimpl0(i, companion.m35360getRightdhqQ8s())) {
                bottom = rect.getRight();
                bottom2 = rect2.getRight();
            } else if (FocusDirection.m35344equalsimpl0(i, companion.m35361getUpdhqQ8s())) {
                top = rect2.getTop();
                top2 = rect.getTop();
            } else if (FocusDirection.m35344equalsimpl0(i, companion.m35352getDowndhqQ8s())) {
                bottom = rect.getBottom();
                bottom2 = rect2.getBottom();
            } else {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
            f = bottom - bottom2;
            return Math.max(1.0f, f);
        }
        f = top - top2;
        return Math.max(1.0f, f);
    }

    private static final Rect bottomRight(Rect rect) {
        return new Rect(rect.getRight(), rect.getBottom(), rect.getRight(), rect.getBottom());
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x002f A[EDGE_INSN: B:43:0x002f->B:41:0x002f ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c1 A[SYNTHETIC] */
    @androidx.compose.p002ui.ExperimentalComposeUiApi
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void collectAccessibleChildren(androidx.compose.p002ui.node.DelegatableNode r9, androidx.compose.runtime.collection.MutableVector<androidx.compose.p002ui.focus.FocusTargetModifierNode> r10) {
        /*
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = androidx.compose.p002ui.node.NodeKind.m37625constructorimpl(r0)
            androidx.compose.ui.Modifier$Node r1 = r9.getNode()
            boolean r1 = r1.isAttached()
            if (r1 == 0) goto L_0x00cc
            androidx.compose.runtime.collection.MutableVector r1 = new androidx.compose.runtime.collection.MutableVector
            r2 = 16
            androidx.compose.ui.Modifier$Node[] r2 = new androidx.compose.p002ui.Modifier.Node[r2]
            r3 = 0
            r1.<init>(r2, r3)
            androidx.compose.ui.Modifier$Node r2 = r9.getNode()
            androidx.compose.ui.Modifier$Node r2 = r2.getChild$ui_release()
            if (r2 != 0) goto L_0x002c
            androidx.compose.ui.Modifier$Node r9 = r9.getNode()
            androidx.compose.p002ui.node.DelegatableNodeKt.addLayoutNodeChildren(r1, r9)
            goto L_0x002f
        L_0x002c:
            r1.add(r2)
        L_0x002f:
            boolean r9 = r1.isNotEmpty()
            if (r9 == 0) goto L_0x00cb
            int r9 = r1.getSize()
            r2 = 1
            int r9 = r9 - r2
            java.lang.Object r9 = r1.removeAt(r9)
            androidx.compose.ui.Modifier$Node r9 = (androidx.compose.p002ui.Modifier.Node) r9
            int r4 = r9.getAggregateChildKindSet$ui_release()
            r4 = r4 & r0
            if (r4 == 0) goto L_0x00c6
            r4 = r9
        L_0x0049:
            if (r4 == 0) goto L_0x00c6
            int r5 = r4.getKindSet$ui_release()
            r5 = r5 & r0
            if (r5 == 0) goto L_0x00c1
            boolean r5 = r4 instanceof androidx.compose.p002ui.focus.FocusTargetModifierNode
            if (r5 == 0) goto L_0x00be
            r5 = r4
            androidx.compose.ui.focus.FocusTargetModifierNode r5 = (androidx.compose.p002ui.focus.FocusTargetModifierNode) r5
            boolean r6 = r5.isAttached()
            if (r6 != 0) goto L_0x0061
        L_0x005f:
            r5 = r3
            goto L_0x00bf
        L_0x0061:
            androidx.compose.ui.focus.FocusProperties r6 = r5.fetchFocusProperties$ui_release()
            boolean r6 = r6.getCanFocus()
            if (r6 == 0) goto L_0x006f
            r10.add(r5)
            goto L_0x005f
        L_0x006f:
            androidx.compose.ui.focus.FocusProperties r5 = r5.fetchFocusProperties$ui_release()
            kotlin.jvm.functions.Function1 r5 = r5.getEnter()
            androidx.compose.ui.focus.FocusDirection$Companion r6 = androidx.compose.p002ui.focus.FocusDirection.Companion
            int r6 = r6.m35353getEnterdhqQ8s()
            androidx.compose.ui.focus.FocusDirection r6 = androidx.compose.p002ui.focus.FocusDirection.m35341boximpl(r6)
            java.lang.Object r5 = r5.invoke(r6)
            r6 = r5
            androidx.compose.ui.focus.FocusRequester r6 = (androidx.compose.p002ui.focus.FocusRequester) r6
            androidx.compose.ui.focus.FocusRequester$Companion r7 = androidx.compose.p002ui.focus.FocusRequester.Companion
            androidx.compose.ui.focus.FocusRequester r8 = r7.getDefault()
            boolean r6 = kotlin.jvm.internal.C12775o.m28634d(r6, r8)
            if (r6 != 0) goto L_0x0095
            goto L_0x0096
        L_0x0095:
            r5 = 0
        L_0x0096:
            androidx.compose.ui.focus.FocusRequester r5 = (androidx.compose.p002ui.focus.FocusRequester) r5
            if (r5 == 0) goto L_0x00be
            androidx.compose.ui.focus.FocusRequester r6 = r7.getCancel()
            boolean r6 = kotlin.jvm.internal.C12775o.m28634d(r5, r6)
            if (r6 != 0) goto L_0x005f
            androidx.compose.runtime.collection.MutableVector r5 = r5.getFocusRequesterNodes$ui_release()
            int r6 = r5.getSize()
            if (r6 <= 0) goto L_0x005f
            java.lang.Object[] r5 = r5.getContent()
            r7 = r3
        L_0x00b3:
            r8 = r5[r7]
            androidx.compose.ui.focus.FocusRequesterModifierNode r8 = (androidx.compose.p002ui.focus.FocusRequesterModifierNode) r8
            collectAccessibleChildren(r8, r10)
            int r7 = r7 + r2
            if (r7 < r6) goto L_0x00b3
            goto L_0x005f
        L_0x00be:
            r5 = r2
        L_0x00bf:
            if (r5 == 0) goto L_0x002f
        L_0x00c1:
            androidx.compose.ui.Modifier$Node r4 = r4.getChild$ui_release()
            goto L_0x0049
        L_0x00c6:
            androidx.compose.p002ui.node.DelegatableNodeKt.addLayoutNodeChildren(r1, r9)
            goto L_0x002f
        L_0x00cb:
            return
        L_0x00cc:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Check failed."
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.focus.TwoDimensionalFocusSearchKt.collectAccessibleChildren(androidx.compose.ui.node.DelegatableNode, androidx.compose.runtime.collection.MutableVector):void");
    }

    @ExperimentalComposeUiApi
    /* renamed from: findBestCandidate-4WY_MpI  reason: not valid java name */
    private static final FocusTargetModifierNode m35382findBestCandidate4WY_MpI(MutableVector<FocusTargetModifierNode> mutableVector, Rect rect, int i) {
        Rect rect2;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m35344equalsimpl0(i, companion.m35356getLeftdhqQ8s())) {
            rect2 = rect.translate(rect.getWidth() + ((float) 1), 0.0f);
        } else if (FocusDirection.m35344equalsimpl0(i, companion.m35360getRightdhqQ8s())) {
            rect2 = rect.translate(-(rect.getWidth() + ((float) 1)), 0.0f);
        } else if (FocusDirection.m35344equalsimpl0(i, companion.m35361getUpdhqQ8s())) {
            rect2 = rect.translate(0.0f, rect.getHeight() + ((float) 1));
        } else if (FocusDirection.m35344equalsimpl0(i, companion.m35352getDowndhqQ8s())) {
            rect2 = rect.translate(0.0f, -(rect.getHeight() + ((float) 1)));
        } else {
            throw new IllegalStateException(InvalidFocusDirection.toString());
        }
        int size = mutableVector.getSize();
        FocusTargetModifierNode focusTargetModifierNode = null;
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                FocusTargetModifierNode focusTargetModifierNode2 = (FocusTargetModifierNode) content[i2];
                if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetModifierNode2)) {
                    Rect focusRect = FocusTraversalKt.focusRect(focusTargetModifierNode2);
                    if (m35385isBetterCandidateI7lrPNg(focusRect, rect2, rect, i)) {
                        focusTargetModifierNode = focusTargetModifierNode2;
                        rect2 = focusRect;
                    }
                }
                i2++;
            } while (i2 < size);
        }
        return focusTargetModifierNode;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: androidx.compose.ui.focus.FocusTargetModifierNode} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.p002ui.ExperimentalComposeUiApi
    /* renamed from: findChildCorrespondingToFocusEnter--OM-vw8  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m35383findChildCorrespondingToFocusEnterOMvw8(androidx.compose.p002ui.focus.FocusTargetModifierNode r5, int r6, kotlin.jvm.functions.Function1<? super androidx.compose.p002ui.focus.FocusTargetModifierNode, java.lang.Boolean> r7) {
        /*
            java.lang.String r0 = "$this$findChildCorrespondingToFocusEnter"
            kotlin.jvm.internal.C12775o.m28639i(r5, r0)
            java.lang.String r0 = "onFound"
            kotlin.jvm.internal.C12775o.m28639i(r7, r0)
            androidx.compose.ui.focus.FocusProperties r0 = r5.fetchFocusProperties$ui_release()
            kotlin.jvm.functions.Function1 r0 = r0.getEnter()
            androidx.compose.ui.focus.FocusDirection r1 = androidx.compose.p002ui.focus.FocusDirection.m35341boximpl(r6)
            java.lang.Object r0 = r0.invoke(r1)
            r1 = r0
            androidx.compose.ui.focus.FocusRequester r1 = (androidx.compose.p002ui.focus.FocusRequester) r1
            androidx.compose.ui.focus.FocusRequester$Companion r2 = androidx.compose.p002ui.focus.FocusRequester.Companion
            androidx.compose.ui.focus.FocusRequester r3 = r2.getDefault()
            boolean r1 = kotlin.jvm.internal.C12775o.m28634d(r1, r3)
            r3 = 0
            if (r1 != 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r0 = r3
        L_0x002c:
            androidx.compose.ui.focus.FocusRequester r0 = (androidx.compose.p002ui.focus.FocusRequester) r0
            r1 = 0
            if (r0 == 0) goto L_0x0041
            androidx.compose.ui.focus.FocusRequester r5 = r2.getCancel()
            boolean r5 = kotlin.jvm.internal.C12775o.m28634d(r0, r5)
            if (r5 == 0) goto L_0x003c
            goto L_0x0040
        L_0x003c:
            boolean r1 = r0.findFocusTarget$ui_release(r7)
        L_0x0040:
            return r1
        L_0x0041:
            androidx.compose.runtime.collection.MutableVector r0 = new androidx.compose.runtime.collection.MutableVector
            r2 = 16
            androidx.compose.ui.focus.FocusTargetModifierNode[] r2 = new androidx.compose.p002ui.focus.FocusTargetModifierNode[r2]
            r0.<init>(r2, r1)
            collectAccessibleChildren(r5, r0)
            int r2 = r0.getSize()
            r4 = 1
            if (r2 > r4) goto L_0x0070
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L_0x005b
            goto L_0x0061
        L_0x005b:
            java.lang.Object[] r5 = r0.getContent()
            r3 = r5[r1]
        L_0x0061:
            androidx.compose.ui.focus.FocusTargetModifierNode r3 = (androidx.compose.p002ui.focus.FocusTargetModifierNode) r3
            if (r3 == 0) goto L_0x006f
            java.lang.Object r5 = r7.invoke(r3)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r1 = r5.booleanValue()
        L_0x006f:
            return r1
        L_0x0070:
            androidx.compose.ui.focus.FocusDirection$Companion r2 = androidx.compose.p002ui.focus.FocusDirection.Companion
            int r3 = r2.m35353getEnterdhqQ8s()
            boolean r3 = androidx.compose.p002ui.focus.FocusDirection.m35344equalsimpl0(r6, r3)
            if (r3 == 0) goto L_0x0080
            int r6 = r2.m35360getRightdhqQ8s()
        L_0x0080:
            int r3 = r2.m35360getRightdhqQ8s()
            boolean r3 = androidx.compose.p002ui.focus.FocusDirection.m35344equalsimpl0(r6, r3)
            if (r3 == 0) goto L_0x008c
            r3 = r4
            goto L_0x0094
        L_0x008c:
            int r3 = r2.m35352getDowndhqQ8s()
            boolean r3 = androidx.compose.p002ui.focus.FocusDirection.m35344equalsimpl0(r6, r3)
        L_0x0094:
            if (r3 == 0) goto L_0x009f
            androidx.compose.ui.geometry.Rect r5 = androidx.compose.p002ui.focus.FocusTraversalKt.focusRect(r5)
            androidx.compose.ui.geometry.Rect r5 = topLeft(r5)
            goto L_0x00bc
        L_0x009f:
            int r3 = r2.m35356getLeftdhqQ8s()
            boolean r3 = androidx.compose.p002ui.focus.FocusDirection.m35344equalsimpl0(r6, r3)
            if (r3 == 0) goto L_0x00aa
            goto L_0x00b2
        L_0x00aa:
            int r2 = r2.m35361getUpdhqQ8s()
            boolean r4 = androidx.compose.p002ui.focus.FocusDirection.m35344equalsimpl0(r6, r2)
        L_0x00b2:
            if (r4 == 0) goto L_0x00cd
            androidx.compose.ui.geometry.Rect r5 = androidx.compose.p002ui.focus.FocusTraversalKt.focusRect(r5)
            androidx.compose.ui.geometry.Rect r5 = bottomRight(r5)
        L_0x00bc:
            androidx.compose.ui.focus.FocusTargetModifierNode r5 = m35382findBestCandidate4WY_MpI(r0, r5, r6)
            if (r5 == 0) goto L_0x00cc
            java.lang.Object r5 = r7.invoke(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r1 = r5.booleanValue()
        L_0x00cc:
            return r1
        L_0x00cd:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "This function should only be used for 2-D focus search"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.focus.TwoDimensionalFocusSearchKt.m35383findChildCorrespondingToFocusEnterOMvw8(androidx.compose.ui.focus.FocusTargetModifierNode, int, kotlin.jvm.functions.Function1):boolean");
    }

    @ExperimentalComposeUiApi
    /* renamed from: generateAndSearchChildren-4C6V_qg  reason: not valid java name */
    private static final boolean m35384generateAndSearchChildren4C6V_qg(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2, int i, Function1<? super FocusTargetModifierNode, Boolean> function1) {
        if (m35386searchChildren4C6V_qg(focusTargetModifierNode, focusTargetModifierNode2, i, function1)) {
            return true;
        }
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.m35340searchBeyondBoundsOMvw8(focusTargetModifierNode, i, new TwoDimensionalFocusSearchKt$generateAndSearchChildren$1(focusTargetModifierNode, focusTargetModifierNode2, i, function1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: isBetterCandidate-I7lrPNg  reason: not valid java name */
    private static final boolean m35385isBetterCandidateI7lrPNg(Rect rect, Rect rect2, Rect rect3, int i) {
        if (!isBetterCandidate_I7lrPNg$isCandidate(rect, i, rect3)) {
            return false;
        }
        if (isBetterCandidate_I7lrPNg$isCandidate(rect2, i, rect3) && !m35381beamBeatsI7lrPNg(rect3, rect, rect2, i) && (m35381beamBeatsI7lrPNg(rect3, rect2, rect, i) || isBetterCandidate_I7lrPNg$weightedDistance(i, rect3, rect) >= isBetterCandidate_I7lrPNg$weightedDistance(i, rect3, rect2))) {
            return false;
        }
        return true;
    }

    private static final boolean isBetterCandidate_I7lrPNg$isCandidate(Rect rect, int i, Rect rect2) {
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m35344equalsimpl0(i, companion.m35356getLeftdhqQ8s())) {
            if ((rect2.getRight() > rect.getRight() || rect2.getLeft() >= rect.getRight()) && rect2.getLeft() > rect.getLeft()) {
                return true;
            }
        } else if (FocusDirection.m35344equalsimpl0(i, companion.m35360getRightdhqQ8s())) {
            if ((rect2.getLeft() < rect.getLeft() || rect2.getRight() <= rect.getLeft()) && rect2.getRight() < rect.getRight()) {
                return true;
            }
        } else if (FocusDirection.m35344equalsimpl0(i, companion.m35361getUpdhqQ8s())) {
            if ((rect2.getBottom() > rect.getBottom() || rect2.getTop() >= rect.getBottom()) && rect2.getTop() > rect.getTop()) {
                return true;
            }
        } else if (!FocusDirection.m35344equalsimpl0(i, companion.m35352getDowndhqQ8s())) {
            throw new IllegalStateException(InvalidFocusDirection.toString());
        } else if ((rect2.getTop() < rect.getTop() || rect2.getBottom() <= rect.getTop()) && rect2.getBottom() < rect.getBottom()) {
            return true;
        }
        return false;
    }

    private static final float isBetterCandidate_I7lrPNg$majorAxisDistance(Rect rect, int i, Rect rect2) {
        float f;
        float top;
        float bottom;
        float top2;
        float bottom2;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m35344equalsimpl0(i, companion.m35356getLeftdhqQ8s())) {
            top2 = rect2.getLeft();
            bottom2 = rect.getRight();
        } else {
            if (FocusDirection.m35344equalsimpl0(i, companion.m35360getRightdhqQ8s())) {
                top = rect.getLeft();
                bottom = rect2.getRight();
            } else if (FocusDirection.m35344equalsimpl0(i, companion.m35361getUpdhqQ8s())) {
                top2 = rect2.getTop();
                bottom2 = rect.getBottom();
            } else if (FocusDirection.m35344equalsimpl0(i, companion.m35352getDowndhqQ8s())) {
                top = rect.getTop();
                bottom = rect2.getBottom();
            } else {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
            f = top - bottom;
            return Math.max(0.0f, f);
        }
        f = top2 - bottom2;
        return Math.max(0.0f, f);
    }

    private static final float isBetterCandidate_I7lrPNg$minorAxisDistance(Rect rect, int i, Rect rect2) {
        boolean z;
        float f;
        float left;
        float left2;
        float width;
        FocusDirection.Companion companion = FocusDirection.Companion;
        boolean z2 = true;
        if (FocusDirection.m35344equalsimpl0(i, companion.m35356getLeftdhqQ8s())) {
            z = true;
        } else {
            z = FocusDirection.m35344equalsimpl0(i, companion.m35360getRightdhqQ8s());
        }
        if (z) {
            f = (float) 2;
            left = rect2.getTop() + (rect2.getHeight() / f);
            left2 = rect.getTop();
            width = rect.getHeight();
        } else {
            if (!FocusDirection.m35344equalsimpl0(i, companion.m35361getUpdhqQ8s())) {
                z2 = FocusDirection.m35344equalsimpl0(i, companion.m35352getDowndhqQ8s());
            }
            if (z2) {
                f = (float) 2;
                left = rect2.getLeft() + (rect2.getWidth() / f);
                left2 = rect.getLeft();
                width = rect.getWidth();
            } else {
                throw new IllegalStateException(InvalidFocusDirection.toString());
            }
        }
        return left - (left2 + (width / f));
    }

    private static final long isBetterCandidate_I7lrPNg$weightedDistance(int i, Rect rect, Rect rect2) {
        long abs = (long) Math.abs(isBetterCandidate_I7lrPNg$majorAxisDistance(rect2, i, rect));
        long abs2 = (long) Math.abs(isBetterCandidate_I7lrPNg$minorAxisDistance(rect2, i, rect));
        return (((long) 13) * abs * abs) + (abs2 * abs2);
    }

    /* access modifiers changed from: private */
    @ExperimentalComposeUiApi
    /* renamed from: searchChildren-4C6V_qg  reason: not valid java name */
    public static final boolean m35386searchChildren4C6V_qg(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2, int i, Function1<? super FocusTargetModifierNode, Boolean> function1) {
        FocusTargetModifierNode r7;
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
            while (mutableVector.isNotEmpty() && (r7 = m35382findBestCandidate4WY_MpI(mutableVector, FocusTraversalKt.focusRect(focusTargetModifierNode2), i)) != null) {
                if (r7.fetchFocusProperties$ui_release().getCanFocus()) {
                    return function1.invoke(r7).booleanValue();
                }
                FocusRequester invoke = r7.fetchFocusProperties$ui_release().getEnter().invoke(FocusDirection.m35341boximpl(i));
                FocusRequester.Companion companion = FocusRequester.Companion;
                if (C12775o.m28634d(invoke, companion.getDefault())) {
                    invoke = null;
                }
                FocusRequester focusRequester = invoke;
                if (focusRequester != null) {
                    if (C12775o.m28634d(focusRequester, companion.getCancel())) {
                        return false;
                    }
                    return focusRequester.findFocusTarget$ui_release(function1);
                } else if (m35384generateAndSearchChildren4C6V_qg(r7, focusTargetModifierNode2, i, function1)) {
                    return true;
                } else {
                    mutableVector.remove(r7);
                }
            }
            return false;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private static final Rect topLeft(Rect rect) {
        return new Rect(rect.getLeft(), rect.getTop(), rect.getLeft(), rect.getTop());
    }

    @ExperimentalComposeUiApi
    /* renamed from: twoDimensionalFocusSearch--OM-vw8  reason: not valid java name */
    public static final Boolean m35387twoDimensionalFocusSearchOMvw8(FocusTargetModifierNode focusTargetModifierNode, int i, Function1<? super FocusTargetModifierNode, Boolean> function1) {
        C12775o.m28639i(focusTargetModifierNode, "$this$twoDimensionalFocusSearch");
        C12775o.m28639i(function1, "onFound");
        FocusStateImpl focusStateImpl$ui_release = focusTargetModifierNode.getFocusStateImpl$ui_release();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i2 = iArr[focusStateImpl$ui_release.ordinal()];
        if (i2 == 1) {
            FocusTargetModifierNode activeChild = FocusTraversalKt.getActiveChild(focusTargetModifierNode);
            if (activeChild != null) {
                int i3 = iArr[activeChild.getFocusStateImpl$ui_release().ordinal()];
                if (i3 == 1) {
                    Boolean r1 = m35387twoDimensionalFocusSearchOMvw8(activeChild, i, function1);
                    if (!C12775o.m28634d(r1, Boolean.FALSE)) {
                        return r1;
                    }
                    FocusRequester invoke = activeChild.fetchFocusProperties$ui_release().getExit().invoke(FocusDirection.m35341boximpl(i));
                    FocusRequester.Companion companion = FocusRequester.Companion;
                    if (C12775o.m28634d(invoke, companion.getDefault())) {
                        invoke = null;
                    }
                    FocusRequester focusRequester = invoke;
                    if (focusRequester == null) {
                        return Boolean.valueOf(m35384generateAndSearchChildren4C6V_qg(focusTargetModifierNode, activeNode(activeChild), i, function1));
                    }
                    if (C12775o.m28634d(focusRequester, companion.getCancel())) {
                        return null;
                    }
                    return Boolean.valueOf(focusRequester.findFocusTarget$ui_release(function1));
                } else if (i3 == 2 || i3 == 3) {
                    return Boolean.valueOf(m35384generateAndSearchChildren4C6V_qg(focusTargetModifierNode, activeChild, i, function1));
                } else {
                    if (i3 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException(NoActiveChild.toString());
                }
            } else {
                throw new IllegalStateException(NoActiveChild.toString());
            }
        } else if (i2 == 2 || i2 == 3) {
            return Boolean.valueOf(m35383findChildCorrespondingToFocusEnterOMvw8(focusTargetModifierNode, i, function1));
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            } else if (focusTargetModifierNode.fetchFocusProperties$ui_release().getCanFocus()) {
                return function1.invoke(focusTargetModifierNode);
            } else {
                return Boolean.FALSE;
            }
        }
    }
}
