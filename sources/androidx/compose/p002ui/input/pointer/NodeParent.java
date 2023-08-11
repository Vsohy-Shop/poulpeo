package androidx.compose.p002ui.input.pointer;

import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.p002ui.node.PointerInputModifierNodeKt;
import androidx.compose.runtime.collection.MutableVector;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nHitPathTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/NodeParent\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,538:1\n1182#2:539\n1161#2,2:540\n460#3,11:542\n460#3,11:553\n460#3,11:564\n460#3,11:575\n523#3:586\n48#3:587\n523#3:588\n*S KotlinDebug\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/NodeParent\n*L\n143#1:539\n143#1:540,2\n152#1:542,11\n182#1:553,11\n201#1:564,11\n212#1:575,11\n228#1:586\n240#1:587\n241#1:588\n*E\n"})
/* renamed from: androidx.compose.ui.input.pointer.NodeParent */
/* compiled from: HitPathTracker.kt */
public class NodeParent {
    private final MutableVector<Node> children = new MutableVector<>(new Node[16], 0);

    public boolean buildCache(Map<PointerId, PointerInputChange> map, LayoutCoordinates layoutCoordinates, InternalPointerEvent internalPointerEvent, boolean z) {
        C12775o.m28639i(map, "changes");
        C12775o.m28639i(layoutCoordinates, "parentCoordinates");
        C12775o.m28639i(internalPointerEvent, "internalPointerEvent");
        MutableVector<Node> mutableVector = this.children;
        int size = mutableVector.getSize();
        if (size <= 0) {
            return false;
        }
        Object[] content = mutableVector.getContent();
        int i = 0;
        boolean z2 = false;
        do {
            if (((Node) content[i]).buildCache(map, layoutCoordinates, internalPointerEvent, z) || z2) {
                z2 = true;
            } else {
                z2 = false;
            }
            i++;
        } while (i < size);
        return z2;
    }

    public void cleanUpHits(InternalPointerEvent internalPointerEvent) {
        C12775o.m28639i(internalPointerEvent, "internalPointerEvent");
        int size = this.children.getSize();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (((Node) this.children.getContent()[size]).getPointerIds().isEmpty()) {
                this.children.removeAt(size);
            }
        }
    }

    public final void clear() {
        this.children.clear();
    }

    public void dispatchCancel() {
        MutableVector<Node> mutableVector = this.children;
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i = 0;
            do {
                ((Node) content[i]).dispatchCancel();
                i++;
            } while (i < size);
        }
    }

    public boolean dispatchFinalEventPass(InternalPointerEvent internalPointerEvent) {
        C12775o.m28639i(internalPointerEvent, "internalPointerEvent");
        MutableVector<Node> mutableVector = this.children;
        int size = mutableVector.getSize();
        boolean z = false;
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i = 0;
            boolean z2 = false;
            do {
                if (((Node) content[i]).dispatchFinalEventPass(internalPointerEvent) || z2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                i++;
            } while (i < size);
            z = z2;
        }
        cleanUpHits(internalPointerEvent);
        return z;
    }

    public boolean dispatchMainEventPass(Map<PointerId, PointerInputChange> map, LayoutCoordinates layoutCoordinates, InternalPointerEvent internalPointerEvent, boolean z) {
        C12775o.m28639i(map, "changes");
        C12775o.m28639i(layoutCoordinates, "parentCoordinates");
        C12775o.m28639i(internalPointerEvent, "internalPointerEvent");
        MutableVector<Node> mutableVector = this.children;
        int size = mutableVector.getSize();
        if (size <= 0) {
            return false;
        }
        Object[] content = mutableVector.getContent();
        int i = 0;
        boolean z2 = false;
        do {
            if (((Node) content[i]).dispatchMainEventPass(map, layoutCoordinates, internalPointerEvent, z) || z2) {
                z2 = true;
            } else {
                z2 = false;
            }
            i++;
        } while (i < size);
        return z2;
    }

    public final MutableVector<Node> getChildren() {
        return this.children;
    }

    public final void removeDetachedPointerInputFilters() {
        int i = 0;
        while (i < this.children.getSize()) {
            Node node = (Node) this.children.getContent()[i];
            if (!PointerInputModifierNodeKt.isAttached(node.getPointerInputNode())) {
                this.children.removeAt(i);
                node.dispatchCancel();
            } else {
                i++;
                node.removeDetachedPointerInputFilters();
            }
        }
    }
}
