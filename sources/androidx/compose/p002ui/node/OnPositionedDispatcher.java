package androidx.compose.p002ui.node;

import androidx.compose.runtime.collection.MutableVector;
import com.appboy.Constants;
import java.util.Comparator;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nOnPositionedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnPositionedDispatcher.kt\nandroidx/compose/ui/node/OnPositionedDispatcher\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n*L\n1#1,73:1\n1182#2:74\n1161#2,2:75\n728#3,2:77\n728#3,2:79\n492#3,11:81\n460#3,11:93\n163#4:92\n*S KotlinDebug\n*F\n+ 1 OnPositionedDispatcher.kt\nandroidx/compose/ui/node/OnPositionedDispatcher\n*L\n26#1:74\n26#1:75,2\n29#1:77,2\n35#1:79,2\n42#1:81,11\n56#1:93,11\n56#1:92\n*E\n"})
/* renamed from: androidx.compose.ui.node.OnPositionedDispatcher */
/* compiled from: OnPositionedDispatcher.kt */
public final class OnPositionedDispatcher {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final MutableVector<LayoutNode> layoutNodes = new MutableVector<>(new LayoutNode[16], 0);

    /* renamed from: androidx.compose.ui.node.OnPositionedDispatcher$Companion */
    /* compiled from: OnPositionedDispatcher.kt */
    public static final class Companion {

        /* renamed from: androidx.compose.ui.node.OnPositionedDispatcher$Companion$DepthComparator */
        /* compiled from: OnPositionedDispatcher.kt */
        private static final class DepthComparator implements Comparator<LayoutNode> {
            public static final DepthComparator INSTANCE = new DepthComparator();

            private DepthComparator() {
            }

            public int compare(LayoutNode layoutNode, LayoutNode layoutNode2) {
                C12775o.m28639i(layoutNode, Constants.APPBOY_PUSH_CONTENT_KEY);
                C12775o.m28639i(layoutNode2, "b");
                int k = C12775o.m28641k(layoutNode2.getDepth$ui_release(), layoutNode.getDepth$ui_release());
                if (k != 0) {
                    return k;
                }
                return C12775o.m28641k(layoutNode.hashCode(), layoutNode2.hashCode());
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void dispatchHierarchy(LayoutNode layoutNode) {
        layoutNode.dispatchOnPositionedCallbacks$ui_release();
        int i = 0;
        layoutNode.setNeedsOnPositionedDispatch$ui_release(false);
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            do {
                dispatchHierarchy((LayoutNode) content[i]);
                i++;
            } while (i < size);
        }
    }

    public final void dispatch() {
        this.layoutNodes.sortWith(Companion.DepthComparator.INSTANCE);
        MutableVector<LayoutNode> mutableVector = this.layoutNodes;
        int size = mutableVector.getSize();
        if (size > 0) {
            int i = size - 1;
            Object[] content = mutableVector.getContent();
            do {
                LayoutNode layoutNode = (LayoutNode) content[i];
                if (layoutNode.getNeedsOnPositionedDispatch$ui_release()) {
                    dispatchHierarchy(layoutNode);
                }
                i--;
            } while (i >= 0);
        }
        this.layoutNodes.clear();
    }

    public final void onNodePositioned(LayoutNode layoutNode) {
        C12775o.m28639i(layoutNode, "node");
        this.layoutNodes.add(layoutNode);
        layoutNode.setNeedsOnPositionedDispatch$ui_release(true);
    }

    public final void onRootNodePositioned(LayoutNode layoutNode) {
        C12775o.m28639i(layoutNode, "rootNode");
        this.layoutNodes.clear();
        this.layoutNodes.add(layoutNode);
        layoutNode.setNeedsOnPositionedDispatch$ui_release(true);
    }
}
