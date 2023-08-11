package androidx.compose.p002ui.semantics;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nSemanticsOwner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsOwner.kt\nandroidx/compose/ui/semantics/SemanticsOwnerKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,72:1\n33#2,6:73\n*S KotlinDebug\n*F\n+ 1 SemanticsOwner.kt\nandroidx/compose/ui/semantics/SemanticsOwnerKt\n*L\n63#1:73,6\n*E\n"})
/* renamed from: androidx.compose.ui.semantics.SemanticsOwnerKt */
/* compiled from: SemanticsOwner.kt */
public final class SemanticsOwnerKt {
    public static final List<SemanticsNode> getAllSemanticsNodes(SemanticsOwner semanticsOwner, boolean z) {
        C12775o.m28639i(semanticsOwner, "<this>");
        return C12686e0.m28205B0(getAllSemanticsNodesToMap(semanticsOwner, !z).values());
    }

    public static final Map<Integer, SemanticsNode> getAllSemanticsNodesToMap(SemanticsOwner semanticsOwner, boolean z) {
        SemanticsNode semanticsNode;
        C12775o.m28639i(semanticsOwner, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z) {
            semanticsNode = semanticsOwner.getUnmergedRootSemanticsNode();
        } else {
            semanticsNode = semanticsOwner.getRootSemanticsNode();
        }
        getAllSemanticsNodesToMap$findAllSemanticNodesRecursive(linkedHashMap, semanticsNode);
        return linkedHashMap;
    }

    public static /* synthetic */ Map getAllSemanticsNodesToMap$default(SemanticsOwner semanticsOwner, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return getAllSemanticsNodesToMap(semanticsOwner, z);
    }

    private static final void getAllSemanticsNodesToMap$findAllSemanticNodesRecursive(Map<Integer, SemanticsNode> map, SemanticsNode semanticsNode) {
        map.put(Integer.valueOf(semanticsNode.getId()), semanticsNode);
        List<SemanticsNode> children = semanticsNode.getChildren();
        int size = children.size();
        for (int i = 0; i < size; i++) {
            getAllSemanticsNodesToMap$findAllSemanticNodesRecursive(map, children.get(i));
        }
    }
}
