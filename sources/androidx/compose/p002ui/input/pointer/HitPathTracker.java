package androidx.compose.p002ui.input.pointer;

import androidx.compose.p002ui.layout.LayoutCoordinates;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nHitPathTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/HitPathTracker\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,538:1\n366#2,12:539\n*S KotlinDebug\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/HitPathTracker\n*L\n61#1:539,12\n*E\n"})
/* renamed from: androidx.compose.ui.input.pointer.HitPathTracker */
/* compiled from: HitPathTracker.kt */
public final class HitPathTracker {
    private final NodeParent root = new NodeParent();
    private final LayoutCoordinates rootCoordinates;

    public HitPathTracker(LayoutCoordinates layoutCoordinates) {
        C12775o.m28639i(layoutCoordinates, "rootCoordinates");
        this.rootCoordinates = layoutCoordinates;
    }

    public static /* synthetic */ boolean dispatchChanges$default(HitPathTracker hitPathTracker, InternalPointerEvent internalPointerEvent, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return hitPathTracker.dispatchChanges(internalPointerEvent, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: addHitPath-KNwqfcY  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m37100addHitPathKNwqfcY(long r12, java.util.List<? extends androidx.compose.p002ui.node.PointerInputModifierNode> r14) {
        /*
            r11 = this;
            java.lang.String r0 = "pointerInputNodes"
            kotlin.jvm.internal.C12775o.m28639i(r14, r0)
            androidx.compose.ui.input.pointer.NodeParent r0 = r11.root
            int r1 = r14.size()
            r2 = 1
            r3 = 0
            r4 = r3
        L_0x000e:
            if (r4 >= r1) goto L_0x007a
            java.lang.Object r5 = r14.get(r4)
            androidx.compose.ui.node.PointerInputModifierNode r5 = (androidx.compose.p002ui.node.PointerInputModifierNode) r5
            if (r2 == 0) goto L_0x005f
            androidx.compose.runtime.collection.MutableVector r6 = r0.getChildren()
            int r7 = r6.getSize()
            if (r7 <= 0) goto L_0x003b
            java.lang.Object[] r6 = r6.getContent()
            r8 = r3
        L_0x0027:
            r9 = r6[r8]
            r10 = r9
            androidx.compose.ui.input.pointer.Node r10 = (androidx.compose.p002ui.input.pointer.Node) r10
            androidx.compose.ui.node.PointerInputModifierNode r10 = r10.getPointerInputNode()
            boolean r10 = kotlin.jvm.internal.C12775o.m28634d(r10, r5)
            if (r10 == 0) goto L_0x0037
            goto L_0x003c
        L_0x0037:
            int r8 = r8 + 1
            if (r8 < r7) goto L_0x0027
        L_0x003b:
            r9 = 0
        L_0x003c:
            androidx.compose.ui.input.pointer.Node r9 = (androidx.compose.p002ui.input.pointer.Node) r9
            if (r9 == 0) goto L_0x005e
            r9.markIsIn()
            androidx.compose.runtime.collection.MutableVector r0 = r9.getPointerIds()
            androidx.compose.ui.input.pointer.PointerId r5 = androidx.compose.p002ui.input.pointer.PointerId.m37151boximpl(r12)
            boolean r0 = r0.contains(r5)
            if (r0 != 0) goto L_0x005c
            androidx.compose.runtime.collection.MutableVector r0 = r9.getPointerIds()
            androidx.compose.ui.input.pointer.PointerId r5 = androidx.compose.p002ui.input.pointer.PointerId.m37151boximpl(r12)
            r0.add(r5)
        L_0x005c:
            r0 = r9
            goto L_0x0077
        L_0x005e:
            r2 = r3
        L_0x005f:
            androidx.compose.ui.input.pointer.Node r6 = new androidx.compose.ui.input.pointer.Node
            r6.<init>(r5)
            androidx.compose.runtime.collection.MutableVector r5 = r6.getPointerIds()
            androidx.compose.ui.input.pointer.PointerId r7 = androidx.compose.p002ui.input.pointer.PointerId.m37151boximpl(r12)
            r5.add(r7)
            androidx.compose.runtime.collection.MutableVector r0 = r0.getChildren()
            r0.add(r6)
            r0 = r6
        L_0x0077:
            int r4 = r4 + 1
            goto L_0x000e
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.input.pointer.HitPathTracker.m37100addHitPathKNwqfcY(long, java.util.List):void");
    }

    public final boolean dispatchChanges(InternalPointerEvent internalPointerEvent, boolean z) {
        C12775o.m28639i(internalPointerEvent, "internalPointerEvent");
        if (!this.root.buildCache(internalPointerEvent.getChanges(), this.rootCoordinates, internalPointerEvent, z)) {
            return false;
        }
        boolean dispatchMainEventPass = this.root.dispatchMainEventPass(internalPointerEvent.getChanges(), this.rootCoordinates, internalPointerEvent, z);
        if (this.root.dispatchFinalEventPass(internalPointerEvent) || dispatchMainEventPass) {
            return true;
        }
        return false;
    }

    public final NodeParent getRoot$ui_release() {
        return this.root;
    }

    public final void processCancel() {
        this.root.dispatchCancel();
        this.root.clear();
    }

    public final void removeDetachedPointerInputFilters() {
        this.root.removeDetachedPointerInputFilters();
    }
}
