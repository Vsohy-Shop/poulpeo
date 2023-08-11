package androidx.compose.p002ui.input.pointer;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.p002ui.node.PointerInputModifierNode;
import androidx.compose.p002ui.node.PointerInputModifierNodeKt;
import androidx.compose.runtime.collection.MutableVector;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nHitPathTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/Node\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,538:1\n486#1,5:542\n493#1:558\n486#1,5:559\n493#1:575\n1182#2:539\n1161#2,2:540\n460#3,11:547\n460#3,11:564\n48#3:582\n523#3:583\n460#3,11:593\n33#4,6:576\n116#4,2:584\n33#4,6:586\n118#4:592\n33#4,6:604\n*S KotlinDebug\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/Node\n*L\n292#1:542,5\n292#1:558\n326#1:559,5\n326#1:575\n263#1:539\n263#1:540,2\n300#1:547,11\n334#1:564,11\n407#1:582\n408#1:583\n504#1:593,11\n377#1:576,6\n415#1:584,2\n415#1:586,6\n415#1:592\n519#1:604,6\n*E\n"})
/* renamed from: androidx.compose.ui.input.pointer.Node */
/* compiled from: HitPathTracker.kt */
public final class Node extends NodeParent {
    private LayoutCoordinates coordinates;
    private boolean hasExited = true;
    private boolean isIn = true;
    private PointerEvent pointerEvent;
    private final MutableVector<PointerId> pointerIds = new MutableVector<>(new PointerId[16], 0);
    private final PointerInputModifierNode pointerInputNode;
    private final Map<PointerId, PointerInputChange> relevantChanges = new LinkedHashMap();
    private boolean wasIn;

    public Node(PointerInputModifierNode pointerInputModifierNode) {
        C12775o.m28639i(pointerInputModifierNode, "pointerInputNode");
        this.pointerInputNode = pointerInputModifierNode;
    }

    private final void clearCache() {
        this.relevantChanges.clear();
        this.coordinates = null;
    }

    private final boolean dispatchIfNeeded(C13074a<C11921v> aVar) {
        if (this.relevantChanges.isEmpty() || !PointerInputModifierNodeKt.isAttached(this.pointerInputNode)) {
            return false;
        }
        aVar.invoke();
        return true;
    }

    private final boolean hasPositionChanged(PointerEvent pointerEvent2, PointerEvent pointerEvent3) {
        if (pointerEvent2 == null || pointerEvent2.getChanges().size() != pointerEvent3.getChanges().size()) {
            return true;
        }
        int size = pointerEvent3.getChanges().size();
        for (int i = 0; i < size; i++) {
            if (!Offset.m35419equalsimpl0(pointerEvent2.getChanges().get(i).m37169getPositionF1C5BW0(), pointerEvent3.getChanges().get(i).m37169getPositionF1C5BW0())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean buildCache(java.util.Map<androidx.compose.p002ui.input.pointer.PointerId, androidx.compose.p002ui.input.pointer.PointerInputChange> r31, androidx.compose.p002ui.layout.LayoutCoordinates r32, androidx.compose.p002ui.input.pointer.InternalPointerEvent r33, boolean r34) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r33
            java.lang.String r4 = "changes"
            kotlin.jvm.internal.C12775o.m28639i(r1, r4)
            java.lang.String r4 = "parentCoordinates"
            kotlin.jvm.internal.C12775o.m28639i(r2, r4)
            java.lang.String r4 = "internalPointerEvent"
            kotlin.jvm.internal.C12775o.m28639i(r3, r4)
            boolean r4 = super.buildCache(r31, r32, r33, r34)
            androidx.compose.ui.node.PointerInputModifierNode r5 = r0.pointerInputNode
            boolean r5 = androidx.compose.p002ui.node.PointerInputModifierNodeKt.isAttached(r5)
            r6 = 1
            if (r5 != 0) goto L_0x0025
            return r6
        L_0x0025:
            androidx.compose.ui.node.PointerInputModifierNode r5 = r0.pointerInputNode
            androidx.compose.ui.layout.LayoutCoordinates r5 = androidx.compose.p002ui.node.PointerInputModifierNodeKt.getLayoutCoordinates(r5)
            r0.coordinates = r5
            java.util.Set r5 = r31.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0035:
            boolean r7 = r5.hasNext()
            r8 = 0
            if (r7 == 0) goto L_0x00da
            java.lang.Object r7 = r5.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r9 = r7.getKey()
            androidx.compose.ui.input.pointer.PointerId r9 = (androidx.compose.p002ui.input.pointer.PointerId) r9
            long r9 = r9.m37157unboximpl()
            java.lang.Object r7 = r7.getValue()
            r11 = r7
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r11
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.input.pointer.PointerId> r7 = r0.pointerIds
            androidx.compose.ui.input.pointer.PointerId r12 = androidx.compose.p002ui.input.pointer.PointerId.m37151boximpl(r9)
            boolean r7 = r7.contains(r12)
            if (r7 == 0) goto L_0x0035
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.List r12 = r11.getHistorical()
            int r13 = r12.size()
        L_0x006c:
            if (r8 >= r13) goto L_0x009c
            java.lang.Object r14 = r12.get(r8)
            androidx.compose.ui.input.pointer.HistoricalChange r14 = (androidx.compose.p002ui.input.pointer.HistoricalChange) r14
            androidx.compose.ui.input.pointer.HistoricalChange r15 = new androidx.compose.ui.input.pointer.HistoricalChange
            long r16 = r14.getUptimeMillis()
            androidx.compose.ui.layout.LayoutCoordinates r6 = r0.coordinates
            kotlin.jvm.internal.C12775o.m28636f(r6)
            r21 = r12
            r22 = r13
            long r12 = r14.m37099getPositionF1C5BW0()
            long r18 = r6.m37342localPositionOfR5De75A(r2, r12)
            r20 = 0
            r6 = r15
            r15.<init>(r16, r18, r20)
            r7.add(r6)
            int r8 = r8 + 1
            r12 = r21
            r13 = r22
            r6 = 1
            goto L_0x006c
        L_0x009c:
            java.util.Map<androidx.compose.ui.input.pointer.PointerId, androidx.compose.ui.input.pointer.PointerInputChange> r6 = r0.relevantChanges
            androidx.compose.ui.input.pointer.PointerId r8 = androidx.compose.p002ui.input.pointer.PointerId.m37151boximpl(r9)
            androidx.compose.ui.layout.LayoutCoordinates r9 = r0.coordinates
            kotlin.jvm.internal.C12775o.m28636f(r9)
            long r12 = r11.m37170getPreviousPositionF1C5BW0()
            long r21 = r9.m37342localPositionOfR5De75A(r2, r12)
            androidx.compose.ui.layout.LayoutCoordinates r9 = r0.coordinates
            kotlin.jvm.internal.C12775o.m28636f(r9)
            long r12 = r11.m37169getPositionF1C5BW0()
            long r16 = r9.m37342localPositionOfR5De75A(r2, r12)
            r12 = 0
            r14 = 0
            r18 = 0
            r19 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r28 = 731(0x2db, float:1.024E-42)
            r29 = 0
            r25 = r7
            androidx.compose.ui.input.pointer.PointerInputChange r7 = androidx.compose.p002ui.input.pointer.PointerInputChange.m37161copyOHpmEuE$default(r11, r12, r14, r16, r18, r19, r21, r23, r24, r25, r26, r28, r29)
            r6.put(r8, r7)
            r6 = 1
            goto L_0x0035
        L_0x00da:
            java.util.Map<androidx.compose.ui.input.pointer.PointerId, androidx.compose.ui.input.pointer.PointerInputChange> r2 = r0.relevantChanges
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x00f0
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.input.pointer.PointerId> r1 = r0.pointerIds
            r1.clear()
            androidx.compose.runtime.collection.MutableVector r1 = r30.getChildren()
            r1.clear()
            r2 = 1
            return r2
        L_0x00f0:
            r2 = 1
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.input.pointer.PointerId> r5 = r0.pointerIds
            int r5 = r5.getSize()
            int r5 = r5 - r2
        L_0x00f8:
            r2 = -1
            if (r2 >= r5) goto L_0x011b
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.input.pointer.PointerId> r2 = r0.pointerIds
            java.lang.Object[] r2 = r2.getContent()
            r2 = r2[r5]
            androidx.compose.ui.input.pointer.PointerId r2 = (androidx.compose.p002ui.input.pointer.PointerId) r2
            long r6 = r2.m37157unboximpl()
            androidx.compose.ui.input.pointer.PointerId r2 = androidx.compose.p002ui.input.pointer.PointerId.m37151boximpl(r6)
            boolean r2 = r1.containsKey(r2)
            if (r2 != 0) goto L_0x0118
            androidx.compose.runtime.collection.MutableVector<androidx.compose.ui.input.pointer.PointerId> r2 = r0.pointerIds
            r2.removeAt(r5)
        L_0x0118:
            int r5 = r5 + -1
            goto L_0x00f8
        L_0x011b:
            androidx.compose.ui.input.pointer.PointerEvent r1 = new androidx.compose.ui.input.pointer.PointerEvent
            java.util.Map<androidx.compose.ui.input.pointer.PointerId, androidx.compose.ui.input.pointer.PointerInputChange> r2 = r0.relevantChanges
            java.util.Collection r2 = r2.values()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r2 = kotlin.collections.C12686e0.m28205B0(r2)
            r1.<init>(r2, r3)
            java.util.List r2 = r1.getChanges()
            int r5 = r2.size()
            r6 = r8
        L_0x0135:
            if (r6 >= r5) goto L_0x014c
            java.lang.Object r7 = r2.get(r6)
            r9 = r7
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r9
            long r9 = r9.m37168getIdJ3iCeTQ()
            boolean r9 = r3.m37101issuesEnterExitEvent0FcD4WY(r9)
            if (r9 == 0) goto L_0x0149
            goto L_0x014d
        L_0x0149:
            int r6 = r6 + 1
            goto L_0x0135
        L_0x014c:
            r7 = 0
        L_0x014d:
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r7
            if (r7 == 0) goto L_0x01fc
            if (r34 != 0) goto L_0x0156
            r0.isIn = r8
            goto L_0x0178
        L_0x0156:
            boolean r2 = r0.isIn
            if (r2 != 0) goto L_0x0178
            boolean r2 = r7.getPressed()
            if (r2 != 0) goto L_0x0166
            boolean r2 = r7.getPreviousPressed()
            if (r2 == 0) goto L_0x0178
        L_0x0166:
            androidx.compose.ui.layout.LayoutCoordinates r2 = r0.coordinates
            kotlin.jvm.internal.C12775o.m28636f(r2)
            long r2 = r2.m37341getSizeYbymL2g()
            boolean r2 = androidx.compose.p002ui.input.pointer.PointerEventKt.m37116isOutOfBoundsO0kMr_c(r7, r2)
            r3 = 1
            r2 = r2 ^ r3
            r0.isIn = r2
            goto L_0x0179
        L_0x0178:
            r3 = 1
        L_0x0179:
            boolean r2 = r0.isIn
            boolean r5 = r0.wasIn
            if (r2 == r5) goto L_0x01bc
            int r2 = r1.m37114getType7fucELk()
            androidx.compose.ui.input.pointer.PointerEventType$Companion r5 = androidx.compose.p002ui.input.pointer.PointerEventType.Companion
            int r6 = r5.m37127getMove7fucELk()
            boolean r2 = androidx.compose.p002ui.input.pointer.PointerEventType.m37121equalsimpl0(r2, r6)
            if (r2 != 0) goto L_0x01ab
            int r2 = r1.m37114getType7fucELk()
            int r6 = r5.m37125getEnter7fucELk()
            boolean r2 = androidx.compose.p002ui.input.pointer.PointerEventType.m37121equalsimpl0(r2, r6)
            if (r2 != 0) goto L_0x01ab
            int r2 = r1.m37114getType7fucELk()
            int r6 = r5.m37126getExit7fucELk()
            boolean r2 = androidx.compose.p002ui.input.pointer.PointerEventType.m37121equalsimpl0(r2, r6)
            if (r2 == 0) goto L_0x01bc
        L_0x01ab:
            boolean r2 = r0.isIn
            if (r2 == 0) goto L_0x01b4
            int r2 = r5.m37125getEnter7fucELk()
            goto L_0x01b8
        L_0x01b4:
            int r2 = r5.m37126getExit7fucELk()
        L_0x01b8:
            r1.m37115setTypeEhbLWgg$ui_release(r2)
            goto L_0x01fd
        L_0x01bc:
            int r2 = r1.m37114getType7fucELk()
            androidx.compose.ui.input.pointer.PointerEventType$Companion r5 = androidx.compose.p002ui.input.pointer.PointerEventType.Companion
            int r6 = r5.m37125getEnter7fucELk()
            boolean r2 = androidx.compose.p002ui.input.pointer.PointerEventType.m37121equalsimpl0(r2, r6)
            if (r2 == 0) goto L_0x01dc
            boolean r2 = r0.wasIn
            if (r2 == 0) goto L_0x01dc
            boolean r2 = r0.hasExited
            if (r2 != 0) goto L_0x01dc
            int r2 = r5.m37127getMove7fucELk()
            r1.m37115setTypeEhbLWgg$ui_release(r2)
            goto L_0x01fd
        L_0x01dc:
            int r2 = r1.m37114getType7fucELk()
            int r6 = r5.m37126getExit7fucELk()
            boolean r2 = androidx.compose.p002ui.input.pointer.PointerEventType.m37121equalsimpl0(r2, r6)
            if (r2 == 0) goto L_0x01fd
            boolean r2 = r0.isIn
            if (r2 == 0) goto L_0x01fd
            boolean r2 = r7.getPressed()
            if (r2 == 0) goto L_0x01fd
            int r2 = r5.m37127getMove7fucELk()
            r1.m37115setTypeEhbLWgg$ui_release(r2)
            goto L_0x01fd
        L_0x01fc:
            r3 = 1
        L_0x01fd:
            if (r4 != 0) goto L_0x021a
            int r2 = r1.m37114getType7fucELk()
            androidx.compose.ui.input.pointer.PointerEventType$Companion r4 = androidx.compose.p002ui.input.pointer.PointerEventType.Companion
            int r4 = r4.m37127getMove7fucELk()
            boolean r2 = androidx.compose.p002ui.input.pointer.PointerEventType.m37121equalsimpl0(r2, r4)
            if (r2 == 0) goto L_0x021a
            androidx.compose.ui.input.pointer.PointerEvent r2 = r0.pointerEvent
            boolean r2 = r0.hasPositionChanged(r2, r1)
            if (r2 == 0) goto L_0x0218
            goto L_0x021a
        L_0x0218:
            r6 = r8
            goto L_0x021b
        L_0x021a:
            r6 = r3
        L_0x021b:
            r0.pointerEvent = r1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.input.pointer.Node.buildCache(java.util.Map, androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.input.pointer.InternalPointerEvent, boolean):boolean");
    }

    public void cleanUpHits(InternalPointerEvent internalPointerEvent) {
        boolean z;
        C12775o.m28639i(internalPointerEvent, "internalPointerEvent");
        super.cleanUpHits(internalPointerEvent);
        PointerEvent pointerEvent2 = this.pointerEvent;
        if (pointerEvent2 != null) {
            this.wasIn = this.isIn;
            List<PointerInputChange> changes = pointerEvent2.getChanges();
            int size = changes.size();
            for (int i = 0; i < size; i++) {
                PointerInputChange pointerInputChange = changes.get(i);
                if (pointerInputChange.getPressed() || (internalPointerEvent.m37101issuesEnterExitEvent0FcD4WY(pointerInputChange.m37168getIdJ3iCeTQ()) && this.isIn)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    this.pointerIds.remove(PointerId.m37151boximpl(pointerInputChange.m37168getIdJ3iCeTQ()));
                }
            }
            this.isIn = false;
            this.hasExited = PointerEventType.m37121equalsimpl0(pointerEvent2.m37114getType7fucELk(), PointerEventType.Companion.m37126getExit7fucELk());
        }
    }

    public void dispatchCancel() {
        MutableVector<Node> children = getChildren();
        int size = children.getSize();
        if (size > 0) {
            Object[] content = children.getContent();
            int i = 0;
            do {
                ((Node) content[i]).dispatchCancel();
                i++;
            } while (i < size);
        }
        this.pointerInputNode.onCancelPointerInput();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchFinalEventPass(androidx.compose.p002ui.input.pointer.InternalPointerEvent r7) {
        /*
            r6 = this;
            java.lang.String r0 = "internalPointerEvent"
            kotlin.jvm.internal.C12775o.m28639i(r7, r0)
            java.util.Map<androidx.compose.ui.input.pointer.PointerId, androidx.compose.ui.input.pointer.PointerInputChange> r0 = r6.relevantChanges
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x000f
            goto L_0x004f
        L_0x000f:
            androidx.compose.ui.node.PointerInputModifierNode r0 = r6.pointerInputNode
            boolean r0 = androidx.compose.p002ui.node.PointerInputModifierNodeKt.isAttached(r0)
            if (r0 != 0) goto L_0x0018
            goto L_0x004f
        L_0x0018:
            androidx.compose.ui.input.pointer.PointerEvent r0 = r6.pointerEvent
            kotlin.jvm.internal.C12775o.m28636f(r0)
            androidx.compose.ui.layout.LayoutCoordinates r2 = r6.coordinates
            kotlin.jvm.internal.C12775o.m28636f(r2)
            long r2 = r2.m37341getSizeYbymL2g()
            androidx.compose.ui.node.PointerInputModifierNode r4 = r6.pointerInputNode
            androidx.compose.ui.input.pointer.PointerEventPass r5 = androidx.compose.p002ui.input.pointer.PointerEventPass.Final
            r4.m37679onPointerEventH0pRuoY(r0, r5, r2)
            androidx.compose.ui.node.PointerInputModifierNode r0 = r6.pointerInputNode
            boolean r0 = androidx.compose.p002ui.node.PointerInputModifierNodeKt.isAttached(r0)
            r2 = 1
            if (r0 == 0) goto L_0x004e
            androidx.compose.runtime.collection.MutableVector r0 = r6.getChildren()
            int r3 = r0.getSize()
            if (r3 <= 0) goto L_0x004e
            java.lang.Object[] r0 = r0.getContent()
        L_0x0044:
            r4 = r0[r1]
            androidx.compose.ui.input.pointer.Node r4 = (androidx.compose.p002ui.input.pointer.Node) r4
            r4.dispatchFinalEventPass(r7)
            int r1 = r1 + r2
            if (r1 < r3) goto L_0x0044
        L_0x004e:
            r1 = r2
        L_0x004f:
            r6.cleanUpHits(r7)
            r6.clearCache()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.input.pointer.Node.dispatchFinalEventPass(androidx.compose.ui.input.pointer.InternalPointerEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0040, code lost:
        r2 = getChildren();
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchMainEventPass(java.util.Map<androidx.compose.p002ui.input.pointer.PointerId, androidx.compose.p002ui.input.pointer.PointerInputChange> r9, androidx.compose.p002ui.layout.LayoutCoordinates r10, androidx.compose.p002ui.input.pointer.InternalPointerEvent r11, boolean r12) {
        /*
            r8 = this;
            java.lang.String r0 = "changes"
            kotlin.jvm.internal.C12775o.m28639i(r9, r0)
            java.lang.String r9 = "parentCoordinates"
            kotlin.jvm.internal.C12775o.m28639i(r10, r9)
            java.lang.String r9 = "internalPointerEvent"
            kotlin.jvm.internal.C12775o.m28639i(r11, r9)
            java.util.Map<androidx.compose.ui.input.pointer.PointerId, androidx.compose.ui.input.pointer.PointerInputChange> r9 = r8.relevantChanges
            boolean r9 = r9.isEmpty()
            r10 = 0
            if (r9 == 0) goto L_0x0019
            goto L_0x006f
        L_0x0019:
            androidx.compose.ui.node.PointerInputModifierNode r9 = r8.pointerInputNode
            boolean r9 = androidx.compose.p002ui.node.PointerInputModifierNodeKt.isAttached(r9)
            if (r9 != 0) goto L_0x0022
            goto L_0x006f
        L_0x0022:
            androidx.compose.ui.input.pointer.PointerEvent r9 = r8.pointerEvent
            kotlin.jvm.internal.C12775o.m28636f(r9)
            androidx.compose.ui.layout.LayoutCoordinates r0 = r8.coordinates
            kotlin.jvm.internal.C12775o.m28636f(r0)
            long r0 = r0.m37341getSizeYbymL2g()
            androidx.compose.ui.node.PointerInputModifierNode r2 = r8.pointerInputNode
            androidx.compose.ui.input.pointer.PointerEventPass r3 = androidx.compose.p002ui.input.pointer.PointerEventPass.Initial
            r2.m37679onPointerEventH0pRuoY(r9, r3, r0)
            androidx.compose.ui.node.PointerInputModifierNode r2 = r8.pointerInputNode
            boolean r2 = androidx.compose.p002ui.node.PointerInputModifierNodeKt.isAttached(r2)
            r3 = 1
            if (r2 == 0) goto L_0x005f
            androidx.compose.runtime.collection.MutableVector r2 = r8.getChildren()
            int r4 = r2.getSize()
            if (r4 <= 0) goto L_0x005f
            java.lang.Object[] r2 = r2.getContent()
        L_0x004e:
            r5 = r2[r10]
            androidx.compose.ui.input.pointer.Node r5 = (androidx.compose.p002ui.input.pointer.Node) r5
            java.util.Map<androidx.compose.ui.input.pointer.PointerId, androidx.compose.ui.input.pointer.PointerInputChange> r6 = r8.relevantChanges
            androidx.compose.ui.layout.LayoutCoordinates r7 = r8.coordinates
            kotlin.jvm.internal.C12775o.m28636f(r7)
            r5.dispatchMainEventPass(r6, r7, r11, r12)
            int r10 = r10 + r3
            if (r10 < r4) goto L_0x004e
        L_0x005f:
            androidx.compose.ui.node.PointerInputModifierNode r10 = r8.pointerInputNode
            boolean r10 = androidx.compose.p002ui.node.PointerInputModifierNodeKt.isAttached(r10)
            if (r10 == 0) goto L_0x006e
            androidx.compose.ui.node.PointerInputModifierNode r10 = r8.pointerInputNode
            androidx.compose.ui.input.pointer.PointerEventPass r11 = androidx.compose.p002ui.input.pointer.PointerEventPass.Main
            r10.m37679onPointerEventH0pRuoY(r9, r11, r0)
        L_0x006e:
            r10 = r3
        L_0x006f:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.input.pointer.Node.dispatchMainEventPass(java.util.Map, androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.input.pointer.InternalPointerEvent, boolean):boolean");
    }

    public final MutableVector<PointerId> getPointerIds() {
        return this.pointerIds;
    }

    public final PointerInputModifierNode getPointerInputNode() {
        return this.pointerInputNode;
    }

    public final void markIsIn() {
        this.isIn = true;
    }

    public String toString() {
        return "Node(pointerInputFilter=" + this.pointerInputNode + ", children=" + getChildren() + ", pointerIds=" + this.pointerIds + ')';
    }
}
