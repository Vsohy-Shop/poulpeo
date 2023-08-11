package androidx.compose.p002ui.node;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p002ui.graphics.Canvas;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.GraphicsLayerScope;
import androidx.compose.p002ui.graphics.Paint;
import androidx.compose.p002ui.graphics.PaintingStyle;
import androidx.compose.p002ui.layout.AlignmentLine;
import androidx.compose.p002ui.layout.LookaheadScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.node.LayoutNode;
import androidx.compose.p002ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nInnerNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator\n+ 2 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n+ 3 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult\n*L\n1#1,223:1\n306#2,2:224\n308#2,2:238\n163#3:226\n460#4,11:227\n460#4,11:240\n222#4,11:253\n178#5,2:251\n180#5,2:264\n*S KotlinDebug\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator\n*L\n96#1:224,2\n96#1:238,2\n98#1:226\n98#1:227,11\n149#1:240,11\n185#1:253,11\n182#1:251,2\n182#1:264,2\n*E\n"})
/* renamed from: androidx.compose.ui.node.InnerNodeCoordinator */
/* compiled from: InnerNodeCoordinator.kt */
public final class InnerNodeCoordinator extends NodeCoordinator {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final Paint innerBoundsPaint;
    private final Modifier.Node tail = new InnerNodeCoordinator$tail$1();

    /* renamed from: androidx.compose.ui.node.InnerNodeCoordinator$Companion */
    /* compiled from: InnerNodeCoordinator.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Paint getInnerBoundsPaint() {
            return InnerNodeCoordinator.innerBoundsPaint;
        }
    }

    @SourceDebugExtension({"SMAP\nInnerNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator$LookaheadDelegateImpl\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n+ 3 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,223:1\n173#2,2:224\n175#2:238\n163#3:226\n460#4,11:227\n*S KotlinDebug\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator$LookaheadDelegateImpl\n*L\n53#1:224,2\n53#1:238\n55#1:226\n55#1:227,11\n*E\n"})
    /* renamed from: androidx.compose.ui.node.InnerNodeCoordinator$LookaheadDelegateImpl */
    /* compiled from: InnerNodeCoordinator.kt */
    private final class LookaheadDelegateImpl extends LookaheadDelegate {
        final /* synthetic */ InnerNodeCoordinator this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public LookaheadDelegateImpl(InnerNodeCoordinator innerNodeCoordinator, LookaheadScope lookaheadScope) {
            super(innerNodeCoordinator, lookaheadScope);
            C12775o.m28639i(lookaheadScope, "scope");
            this.this$0 = innerNodeCoordinator;
        }

        public int calculateAlignmentLine(AlignmentLine alignmentLine) {
            int i;
            C12775o.m28639i(alignmentLine, "alignmentLine");
            Integer num = getAlignmentLinesOwner().calculateAlignmentLines().get(alignmentLine);
            if (num != null) {
                i = num.intValue();
            } else {
                i = Integer.MIN_VALUE;
            }
            getCachedAlignmentLinesMap().put(alignmentLine, Integer.valueOf(i));
            return i;
        }

        public int maxIntrinsicHeight(int i) {
            return getLayoutNode().getIntrinsicsPolicy$ui_release().maxLookaheadIntrinsicHeight(i);
        }

        public int maxIntrinsicWidth(int i) {
            return getLayoutNode().getIntrinsicsPolicy$ui_release().maxLookaheadIntrinsicWidth(i);
        }

        /* renamed from: measure-BRTryo0  reason: not valid java name */
        public Placeable m37488measureBRTryo0(long j) {
            m37404setMeasurementConstraintsBRTryo0(j);
            MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                Object[] content = mutableVector.getContent();
                int i = 0;
                do {
                    ((LayoutNode) content[i]).setMeasuredByParentInLookahead$ui_release(LayoutNode.UsageByParent.NotUsed);
                    i++;
                } while (i < size);
            }
            set_measureResult(getLayoutNode().getMeasurePolicy().m37366measure3p2s80s(this, getLayoutNode().getChildLookaheadMeasurables$ui_release(), j));
            return this;
        }

        public int minIntrinsicHeight(int i) {
            return getLayoutNode().getIntrinsicsPolicy$ui_release().minLookaheadIntrinsicHeight(i);
        }

        public int minIntrinsicWidth(int i) {
            return getLayoutNode().getIntrinsicsPolicy$ui_release().minLookaheadIntrinsicWidth(i);
        }

        /* access modifiers changed from: protected */
        public void placeChildren() {
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLayoutNode().getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
            C12775o.m28636f(lookaheadPassDelegate$ui_release);
            lookaheadPassDelegate$ui_release.onPlaced();
            getAlignmentLinesOwner().layoutChildren();
        }
    }

    static {
        Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.m35934setColor8_81llA(Color.Companion.m35705getRed0d7_KjU());
        Paint.setStrokeWidth(1.0f);
        Paint.m35938setStylek9PVt8s(PaintingStyle.Companion.m35947getStrokeTiuSbCo());
        innerBoundsPaint = Paint;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InnerNodeCoordinator(LayoutNode layoutNode) {
        super(layoutNode);
        C12775o.m28639i(layoutNode, "layoutNode");
        getTail().updateCoordinator$ui_release(this);
    }

    public int calculateAlignmentLine(AlignmentLine alignmentLine) {
        C12775o.m28639i(alignmentLine, "alignmentLine");
        LookaheadDelegate lookaheadDelegate$ui_release = getLookaheadDelegate$ui_release();
        if (lookaheadDelegate$ui_release != null) {
            return lookaheadDelegate$ui_release.calculateAlignmentLine(alignmentLine);
        }
        Integer num = getAlignmentLinesOwner().calculateAlignmentLines().get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    public LookaheadDelegate createLookaheadDelegate(LookaheadScope lookaheadScope) {
        C12775o.m28639i(lookaheadScope, "scope");
        return new LookaheadDelegateImpl(this, lookaheadScope);
    }

    public Modifier.Node getTail() {
        return this.tail;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a0 A[EDGE_INSN: B:35:0x00a0->B:34:0x00a0 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* renamed from: hitTestChild-YqVAtuI  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T extends androidx.compose.p002ui.node.DelegatableNode> void m37485hitTestChildYqVAtuI(androidx.compose.p002ui.node.NodeCoordinator.HitTestSource<T> r20, long r21, androidx.compose.p002ui.node.HitTestResult<T> r23, boolean r24, boolean r25) {
        /*
            r19 = this;
            r0 = r19
            r8 = r20
            r9 = r21
            r11 = r23
            java.lang.String r1 = "hitTestSource"
            kotlin.jvm.internal.C12775o.m28639i(r8, r1)
            java.lang.String r1 = "hitTestResult"
            kotlin.jvm.internal.C12775o.m28639i(r11, r1)
            androidx.compose.ui.node.LayoutNode r1 = r19.getLayoutNode()
            boolean r1 = r8.shouldHitTestChildren(r1)
            r12 = 1
            r13 = 0
            if (r1 == 0) goto L_0x0046
            boolean r1 = r0.m37615withinLayerBoundsk4lQ0M(r9)
            if (r1 == 0) goto L_0x0028
            r14 = r25
            r1 = r12
            goto L_0x0049
        L_0x0028:
            if (r24 == 0) goto L_0x0046
            long r1 = r19.m37596getMinimumTouchTargetSizeNHjbRc()
            float r1 = r0.m37593distanceInMinimumTouchTargettz77jQw(r9, r1)
            boolean r2 = java.lang.Float.isInfinite(r1)
            if (r2 != 0) goto L_0x0040
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0040
            r1 = r12
            goto L_0x0041
        L_0x0040:
            r1 = r13
        L_0x0041:
            if (r1 == 0) goto L_0x0046
            r1 = r12
            r14 = r13
            goto L_0x0049
        L_0x0046:
            r14 = r25
            r1 = r13
        L_0x0049:
            if (r1 == 0) goto L_0x00a3
            int r15 = r23.hitDepth
            androidx.compose.ui.node.LayoutNode r1 = r19.getLayoutNode()
            androidx.compose.runtime.collection.MutableVector r1 = r1.getZSortedChildren()
            int r2 = r1.getSize()
            if (r2 <= 0) goto L_0x00a0
            int r2 = r2 - r12
            java.lang.Object[] r16 = r1.getContent()
            r17 = r2
        L_0x0064:
            r1 = r16[r17]
            r18 = r1
            androidx.compose.ui.node.LayoutNode r18 = (androidx.compose.p002ui.node.LayoutNode) r18
            boolean r1 = r18.isPlaced()
            if (r1 == 0) goto L_0x0099
            r1 = r20
            r2 = r18
            r3 = r21
            r5 = r23
            r6 = r24
            r7 = r14
            r1.m37620childHitTestYqVAtuI(r2, r3, r5, r6, r7)
            boolean r1 = r23.hasHit()
            if (r1 != 0) goto L_0x0086
        L_0x0084:
            r1 = r12
            goto L_0x0095
        L_0x0086:
            androidx.compose.ui.node.NodeCoordinator r1 = r18.getOuterCoordinator$ui_release()
            boolean r1 = r1.shouldSharePointerInputWithSiblings()
            if (r1 == 0) goto L_0x0094
            r23.acceptHits()
            goto L_0x0084
        L_0x0094:
            r1 = r13
        L_0x0095:
            if (r1 != 0) goto L_0x0099
            r1 = r12
            goto L_0x009a
        L_0x0099:
            r1 = r13
        L_0x009a:
            if (r1 != 0) goto L_0x00a0
            int r17 = r17 + -1
            if (r17 >= 0) goto L_0x0064
        L_0x00a0:
            r11.hitDepth = r15
        L_0x00a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.node.InnerNodeCoordinator.m37485hitTestChildYqVAtuI(androidx.compose.ui.node.NodeCoordinator$HitTestSource, long, androidx.compose.ui.node.HitTestResult, boolean, boolean):void");
    }

    public int maxIntrinsicHeight(int i) {
        return getLayoutNode().getIntrinsicsPolicy$ui_release().maxIntrinsicHeight(i);
    }

    public int maxIntrinsicWidth(int i) {
        return getLayoutNode().getIntrinsicsPolicy$ui_release().maxIntrinsicWidth(i);
    }

    /* renamed from: measure-BRTryo0  reason: not valid java name */
    public Placeable m37486measureBRTryo0(long j) {
        m37404setMeasurementConstraintsBRTryo0(j);
        MutableVector<LayoutNode> mutableVector = getLayoutNode().get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i = 0;
            do {
                ((LayoutNode) content[i]).setMeasuredByParent$ui_release(LayoutNode.UsageByParent.NotUsed);
                i++;
            } while (i < size);
        }
        setMeasureResult$ui_release(getLayoutNode().getMeasurePolicy().m37366measure3p2s80s(this, getLayoutNode().getChildMeasurables$ui_release(), j));
        onMeasured();
        return this;
    }

    public int minIntrinsicHeight(int i) {
        return getLayoutNode().getIntrinsicsPolicy$ui_release().minIntrinsicHeight(i);
    }

    public int minIntrinsicWidth(int i) {
        return getLayoutNode().getIntrinsicsPolicy$ui_release().minIntrinsicWidth(i);
    }

    public void performDraw(Canvas canvas) {
        C12775o.m28639i(canvas, "canvas");
        Owner requireOwner = LayoutNodeKt.requireOwner(getLayoutNode());
        MutableVector<LayoutNode> zSortedChildren = getLayoutNode().getZSortedChildren();
        int size = zSortedChildren.getSize();
        if (size > 0) {
            Object[] content = zSortedChildren.getContent();
            int i = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) content[i];
                if (layoutNode.isPlaced()) {
                    layoutNode.draw$ui_release(canvas);
                }
                i++;
            } while (i < size);
        }
        if (requireOwner.getShowLayoutBounds()) {
            drawBorder(canvas, innerBoundsPaint);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: placeAt-f8xVGno  reason: not valid java name */
    public void m37487placeAtf8xVGno(long j, float f, Function1<? super GraphicsLayerScope, C11921v> function1) {
        super.m37609placeAtf8xVGno(j, f, function1);
        if (!isShallowPlacing$ui_release()) {
            onPlaced();
            getLayoutNode().onNodePlaced$ui_release();
        }
    }

    public static /* synthetic */ void getTail$annotations() {
    }
}
