package androidx.compose.p002ui.node;

import androidx.compose.p002ui.node.MeasureAndLayoutDelegate;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nLayoutTreeConsistencyChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutTreeConsistencyChecker.kt\nandroidx/compose/ui/node/LayoutTreeConsistencyChecker\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,141:1\n33#2,6:142\n116#2,2:148\n33#2,6:150\n118#2:156\n116#2,2:157\n33#2,6:159\n118#2:165\n33#2,6:166\n*S KotlinDebug\n*F\n+ 1 LayoutTreeConsistencyChecker.kt\nandroidx/compose/ui/node/LayoutTreeConsistencyChecker\n*L\n44#1:142,6\n59#1:148,2\n59#1:150,6\n59#1:156\n82#1:157,2\n82#1:159,6\n82#1:165\n134#1:166,6\n*E\n"})
/* renamed from: androidx.compose.ui.node.LayoutTreeConsistencyChecker */
/* compiled from: LayoutTreeConsistencyChecker.kt */
public final class LayoutTreeConsistencyChecker {
    private final List<MeasureAndLayoutDelegate.PostponedRequest> postponedMeasureRequests;
    private final DepthSortedSet relayoutNodes;
    private final LayoutNode root;

    public LayoutTreeConsistencyChecker(LayoutNode layoutNode, DepthSortedSet depthSortedSet, List<MeasureAndLayoutDelegate.PostponedRequest> list) {
        C12775o.m28639i(layoutNode, "root");
        C12775o.m28639i(depthSortedSet, "relayoutNodes");
        C12775o.m28639i(list, "postponedMeasureRequests");
        this.root = layoutNode;
        this.relayoutNodes = depthSortedSet;
        this.postponedMeasureRequests = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r3 != false) goto L_0x002b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean consistentLayoutState(androidx.compose.p002ui.node.LayoutNode r12) {
        /*
            r11 = this;
            androidx.compose.ui.node.LayoutNode r0 = r12.getParent$ui_release()
            r1 = 0
            if (r0 == 0) goto L_0x000c
            androidx.compose.ui.node.LayoutNode$LayoutState r2 = r0.getLayoutState$ui_release()
            goto L_0x000d
        L_0x000c:
            r2 = r1
        L_0x000d:
            boolean r3 = r12.isPlaced()
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x002b
            int r3 = r12.getPlaceOrder$ui_release()
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r6) goto L_0x00a5
            if (r0 == 0) goto L_0x0028
            boolean r3 = r0.isPlaced()
            if (r3 != r5) goto L_0x0028
            r3 = r5
            goto L_0x0029
        L_0x0028:
            r3 = r4
        L_0x0029:
            if (r3 == 0) goto L_0x00a5
        L_0x002b:
            boolean r3 = r12.getMeasurePending$ui_release()
            if (r3 == 0) goto L_0x005e
            java.util.List<androidx.compose.ui.node.MeasureAndLayoutDelegate$PostponedRequest> r3 = r11.postponedMeasureRequests
            int r6 = r3.size()
            r7 = r4
        L_0x0038:
            if (r7 >= r6) goto L_0x005a
            java.lang.Object r8 = r3.get(r7)
            r9 = r8
            androidx.compose.ui.node.MeasureAndLayoutDelegate$PostponedRequest r9 = (androidx.compose.p002ui.node.MeasureAndLayoutDelegate.PostponedRequest) r9
            androidx.compose.ui.node.LayoutNode r10 = r9.getNode()
            boolean r10 = kotlin.jvm.internal.C12775o.m28634d(r10, r12)
            if (r10 == 0) goto L_0x0053
            boolean r9 = r9.isLookahead()
            if (r9 != 0) goto L_0x0053
            r9 = r5
            goto L_0x0054
        L_0x0053:
            r9 = r4
        L_0x0054:
            if (r9 == 0) goto L_0x0057
            goto L_0x005b
        L_0x0057:
            int r7 = r7 + 1
            goto L_0x0038
        L_0x005a:
            r8 = r1
        L_0x005b:
            if (r8 == 0) goto L_0x005e
            return r5
        L_0x005e:
            boolean r3 = r12.getMeasurePending$ui_release()
            if (r3 == 0) goto L_0x007f
            androidx.compose.ui.node.DepthSortedSet r1 = r11.relayoutNodes
            boolean r12 = r1.contains(r12)
            if (r12 != 0) goto L_0x007d
            if (r0 == 0) goto L_0x0076
            boolean r12 = r0.getMeasurePending$ui_release()
            if (r12 != r5) goto L_0x0076
            r12 = r5
            goto L_0x0077
        L_0x0076:
            r12 = r4
        L_0x0077:
            if (r12 != 0) goto L_0x007d
            androidx.compose.ui.node.LayoutNode$LayoutState r12 = androidx.compose.p002ui.node.LayoutNode.LayoutState.Measuring
            if (r2 != r12) goto L_0x007e
        L_0x007d:
            r4 = r5
        L_0x007e:
            return r4
        L_0x007f:
            boolean r3 = r12.getLayoutPending$ui_release()
            if (r3 == 0) goto L_0x00a5
            androidx.compose.ui.node.DepthSortedSet r1 = r11.relayoutNodes
            boolean r12 = r1.contains(r12)
            if (r12 != 0) goto L_0x00a3
            if (r0 == 0) goto L_0x00a3
            boolean r12 = r0.getMeasurePending$ui_release()
            if (r12 != 0) goto L_0x00a3
            boolean r12 = r0.getLayoutPending$ui_release()
            if (r12 != 0) goto L_0x00a3
            androidx.compose.ui.node.LayoutNode$LayoutState r12 = androidx.compose.p002ui.node.LayoutNode.LayoutState.Measuring
            if (r2 == r12) goto L_0x00a3
            androidx.compose.ui.node.LayoutNode$LayoutState r12 = androidx.compose.p002ui.node.LayoutNode.LayoutState.LayingOut
            if (r2 != r12) goto L_0x00a4
        L_0x00a3:
            r4 = r5
        L_0x00a4:
            return r4
        L_0x00a5:
            java.lang.Boolean r3 = r12.isPlacedInLookahead()
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r3 = kotlin.jvm.internal.C12775o.m28634d(r3, r6)
            if (r3 == 0) goto L_0x0160
            boolean r3 = r12.getLookaheadMeasurePending$ui_release()
            if (r3 == 0) goto L_0x00e4
            java.util.List<androidx.compose.ui.node.MeasureAndLayoutDelegate$PostponedRequest> r3 = r11.postponedMeasureRequests
            int r6 = r3.size()
            r7 = r4
        L_0x00be:
            if (r7 >= r6) goto L_0x00e1
            java.lang.Object r8 = r3.get(r7)
            r9 = r8
            androidx.compose.ui.node.MeasureAndLayoutDelegate$PostponedRequest r9 = (androidx.compose.p002ui.node.MeasureAndLayoutDelegate.PostponedRequest) r9
            androidx.compose.ui.node.LayoutNode r10 = r9.getNode()
            boolean r10 = kotlin.jvm.internal.C12775o.m28634d(r10, r12)
            if (r10 == 0) goto L_0x00d9
            boolean r9 = r9.isLookahead()
            if (r9 == 0) goto L_0x00d9
            r9 = r5
            goto L_0x00da
        L_0x00d9:
            r9 = r4
        L_0x00da:
            if (r9 == 0) goto L_0x00de
            r1 = r8
            goto L_0x00e1
        L_0x00de:
            int r7 = r7 + 1
            goto L_0x00be
        L_0x00e1:
            if (r1 == 0) goto L_0x00e4
            return r5
        L_0x00e4:
            boolean r1 = r12.getLookaheadMeasurePending$ui_release()
            if (r1 == 0) goto L_0x0123
            androidx.compose.ui.node.DepthSortedSet r1 = r11.relayoutNodes
            boolean r1 = r1.contains(r12)
            if (r1 != 0) goto L_0x0121
            if (r0 == 0) goto L_0x00fc
            boolean r1 = r0.getLookaheadMeasurePending$ui_release()
            if (r1 != r5) goto L_0x00fc
            r1 = r5
            goto L_0x00fd
        L_0x00fc:
            r1 = r4
        L_0x00fd:
            if (r1 != 0) goto L_0x0121
            androidx.compose.ui.node.LayoutNode$LayoutState r1 = androidx.compose.p002ui.node.LayoutNode.LayoutState.LookaheadMeasuring
            if (r2 == r1) goto L_0x0121
            if (r0 == 0) goto L_0x010d
            boolean r0 = r0.getMeasurePending$ui_release()
            if (r0 != r5) goto L_0x010d
            r0 = r5
            goto L_0x010e
        L_0x010d:
            r0 = r4
        L_0x010e:
            if (r0 == 0) goto L_0x0122
            androidx.compose.ui.layout.LookaheadScope r0 = r12.getMLookaheadScope$ui_release()
            kotlin.jvm.internal.C12775o.m28636f(r0)
            androidx.compose.ui.node.LayoutNode r0 = r0.getRoot()
            boolean r12 = kotlin.jvm.internal.C12775o.m28634d(r0, r12)
            if (r12 == 0) goto L_0x0122
        L_0x0121:
            r4 = r5
        L_0x0122:
            return r4
        L_0x0123:
            boolean r1 = r12.getLookaheadLayoutPending$ui_release()
            if (r1 == 0) goto L_0x0160
            androidx.compose.ui.node.DepthSortedSet r1 = r11.relayoutNodes
            boolean r1 = r1.contains(r12)
            if (r1 != 0) goto L_0x015e
            if (r0 == 0) goto L_0x015e
            boolean r1 = r0.getLookaheadMeasurePending$ui_release()
            if (r1 != 0) goto L_0x015e
            boolean r1 = r0.getLookaheadLayoutPending$ui_release()
            if (r1 != 0) goto L_0x015e
            androidx.compose.ui.node.LayoutNode$LayoutState r1 = androidx.compose.p002ui.node.LayoutNode.LayoutState.LookaheadMeasuring
            if (r2 == r1) goto L_0x015e
            androidx.compose.ui.node.LayoutNode$LayoutState r1 = androidx.compose.p002ui.node.LayoutNode.LayoutState.LookaheadLayingOut
            if (r2 == r1) goto L_0x015e
            boolean r0 = r0.getLayoutPending$ui_release()
            if (r0 == 0) goto L_0x015f
            androidx.compose.ui.layout.LookaheadScope r0 = r12.getMLookaheadScope$ui_release()
            kotlin.jvm.internal.C12775o.m28636f(r0)
            androidx.compose.ui.node.LayoutNode r0 = r0.getRoot()
            boolean r12 = kotlin.jvm.internal.C12775o.m28634d(r0, r12)
            if (r12 == 0) goto L_0x015f
        L_0x015e:
            r4 = r5
        L_0x015f:
            return r4
        L_0x0160:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.node.LayoutTreeConsistencyChecker.consistentLayoutState(androidx.compose.ui.node.LayoutNode):boolean");
    }

    private final boolean isTreeConsistent(LayoutNode layoutNode) {
        if (!consistentLayoutState(layoutNode)) {
            return false;
        }
        List<LayoutNode> children$ui_release = layoutNode.getChildren$ui_release();
        int size = children$ui_release.size();
        for (int i = 0; i < size; i++) {
            if (!isTreeConsistent(children$ui_release.get(i))) {
                return false;
            }
        }
        return true;
    }

    private final String logTree() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tree state:");
        C12775o.m28638h(sb, "append(value)");
        sb.append(10);
        C12775o.m28638h(sb, "append('\\n')");
        logTree$printSubTree(this, sb, this.root, 0);
        String sb2 = sb.toString();
        C12775o.m28638h(sb2, "stringBuilder.toString()");
        return sb2;
    }

    private static final void logTree$printSubTree(LayoutTreeConsistencyChecker layoutTreeConsistencyChecker, StringBuilder sb, LayoutNode layoutNode, int i) {
        boolean z;
        String nodeToString = layoutTreeConsistencyChecker.nodeToString(layoutNode);
        if (nodeToString.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("..");
            }
            sb.append(nodeToString);
            C12775o.m28638h(sb, "append(value)");
            sb.append(10);
            C12775o.m28638h(sb, "append('\\n')");
            i++;
        }
        List<LayoutNode> children$ui_release = layoutNode.getChildren$ui_release();
        int size = children$ui_release.size();
        for (int i3 = 0; i3 < size; i3++) {
            logTree$printSubTree(layoutTreeConsistencyChecker, sb, children$ui_release.get(i3), i);
        }
    }

    private final String nodeToString(LayoutNode layoutNode) {
        StringBuilder sb = new StringBuilder();
        sb.append(layoutNode);
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        sb2.append(layoutNode.getLayoutState$ui_release());
        sb2.append(']');
        sb.append(sb2.toString());
        if (!layoutNode.isPlaced()) {
            sb.append("[!isPlaced]");
        }
        sb.append("[measuredByParent=" + layoutNode.getMeasuredByParent$ui_release() + ']');
        if (!consistentLayoutState(layoutNode)) {
            sb.append("[INCONSISTENT]");
        }
        String sb3 = sb.toString();
        C12775o.m28638h(sb3, "with(StringBuilder()) {\n…     toString()\n        }");
        return sb3;
    }

    public final void assertConsistent() {
        if (!isTreeConsistent(this.root)) {
            System.out.println(logTree());
            throw new IllegalStateException("Inconsistency found!");
        }
    }
}
