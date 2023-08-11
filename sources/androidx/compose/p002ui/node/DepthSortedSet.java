package androidx.compose.p002ui.node;

import java.util.Comparator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11904j;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nDepthSortedSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n*L\n1#1,106:1\n100#1:107\n*S KotlinDebug\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n*L\n91#1:107\n*E\n"})
/* renamed from: androidx.compose.ui.node.DepthSortedSet */
/* compiled from: DepthSortedSet.kt */
public final class DepthSortedSet {
    private final Comparator<LayoutNode> DepthComparator;
    private final boolean extraAssertions;
    private final Lazy mapOfOriginalDepth$delegate;
    private final TreeSet<LayoutNode> set;

    public DepthSortedSet() {
        this(false, 1, (DefaultConstructorMarker) null);
    }

    private final Map<LayoutNode, Integer> getMapOfOriginalDepth() {
        return (Map) this.mapOfOriginalDepth$delegate.getValue();
    }

    public final void add(LayoutNode layoutNode) {
        boolean z;
        C12775o.m28639i(layoutNode, "node");
        if (layoutNode.isAttached()) {
            if (this.extraAssertions) {
                Integer num = getMapOfOriginalDepth().get(layoutNode);
                if (num == null) {
                    getMapOfOriginalDepth().put(layoutNode, Integer.valueOf(layoutNode.getDepth$ui_release()));
                } else {
                    if (num.intValue() == layoutNode.getDepth$ui_release()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
            }
            this.set.add(layoutNode);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final boolean contains(LayoutNode layoutNode) {
        boolean z;
        C12775o.m28639i(layoutNode, "node");
        boolean contains = this.set.contains(layoutNode);
        if (this.extraAssertions) {
            if (contains == getMapOfOriginalDepth().containsKey(layoutNode)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        return contains;
    }

    public final boolean isEmpty() {
        return this.set.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    public final LayoutNode pop() {
        LayoutNode first = this.set.first();
        C12775o.m28638h(first, "node");
        remove(first);
        return first;
    }

    public final void popEach(Function1<? super LayoutNode, C11921v> function1) {
        C12775o.m28639i(function1, "block");
        while (!isEmpty()) {
            function1.invoke(pop());
        }
    }

    public final boolean remove(LayoutNode layoutNode) {
        C12775o.m28639i(layoutNode, "node");
        if (layoutNode.isAttached()) {
            boolean remove = this.set.remove(layoutNode);
            if (this.extraAssertions) {
                Integer remove2 = getMapOfOriginalDepth().remove(layoutNode);
                boolean z = true;
                if (remove) {
                    int depth$ui_release = layoutNode.getDepth$ui_release();
                    if (remove2 == null || remove2.intValue() != depth$ui_release) {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    if (remove2 != null) {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
            }
            return remove;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public String toString() {
        String obj = this.set.toString();
        C12775o.m28638h(obj, "set.toString()");
        return obj;
    }

    public DepthSortedSet(boolean z) {
        this.extraAssertions = z;
        this.mapOfOriginalDepth$delegate = C11901h.m25689a(C11904j.NONE, DepthSortedSet$mapOfOriginalDepth$2.INSTANCE);
        DepthSortedSet$DepthComparator$1 depthSortedSet$DepthComparator$1 = new DepthSortedSet$DepthComparator$1();
        this.DepthComparator = depthSortedSet$DepthComparator$1;
        this.set = new TreeSet<>(depthSortedSet$DepthComparator$1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DepthSortedSet(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }
}
