package androidx.compose.p002ui.platform;

import android.graphics.Region;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.layout.LayoutInfo;
import androidx.compose.p002ui.node.LayoutNode;
import androidx.compose.p002ui.node.SemanticsModifierNode;
import androidx.compose.p002ui.node.SemanticsModifierNodeKt;
import androidx.compose.p002ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.p002ui.semantics.AccessibilityAction;
import androidx.compose.p002ui.semantics.SemanticsActions;
import androidx.compose.p002ui.semantics.SemanticsConfiguration;
import androidx.compose.p002ui.semantics.SemanticsConfigurationKt;
import androidx.compose.p002ui.semantics.SemanticsNode;
import androidx.compose.p002ui.semantics.SemanticsNodeKt;
import androidx.compose.p002ui.semantics.SemanticsOwner;
import androidx.compose.p002ui.semantics.SemanticsProperties;
import androidx.compose.p002ui.semantics.SemanticsPropertyKey;
import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nAndroidComposeViewAccessibilityDelegateCompat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeViewAccessibilityDelegateCompat.android.kt\nandroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3169:1\n1#2:3170\n*E\n"})
/* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt */
/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
public final class AndroidComposeViewAccessibilityDelegateCompat_androidKt {
    /* access modifiers changed from: private */
    public static final boolean accessibilityEquals(AccessibilityAction<?> accessibilityAction, Object obj) {
        if (accessibilityAction == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityAction)) {
            return false;
        }
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) obj;
        if (!C12775o.m28634d(accessibilityAction.getLabel(), accessibilityAction2.getLabel())) {
            return false;
        }
        if (accessibilityAction.getAction() == null && accessibilityAction2.getAction() != null) {
            return false;
        }
        if (accessibilityAction.getAction() == null || accessibilityAction2.getAction() != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final boolean enabled(SemanticsNode semanticsNode) {
        if (SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), SemanticsProperties.INSTANCE.getDisabled()) == null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final boolean excludeLineAndPageGranularities(SemanticsNode semanticsNode) {
        boolean z;
        SemanticsConfiguration collapsedSemanticsConfiguration;
        if (isTextField(semanticsNode) && !C12775o.m28634d(SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui_release(), SemanticsProperties.INSTANCE.getFocused()), Boolean.TRUE)) {
            return true;
        }
        LayoutNode findClosestParentNode = findClosestParentNode(semanticsNode.getLayoutNode$ui_release(), C1083x93be146e.INSTANCE);
        if (findClosestParentNode != null) {
            SemanticsModifierNode outerSemantics = SemanticsNodeKt.getOuterSemantics(findClosestParentNode);
            if (outerSemantics == null || (collapsedSemanticsConfiguration = SemanticsModifierNodeKt.collapsedSemanticsConfiguration(outerSemantics)) == null) {
                z = false;
            } else {
                z = C12775o.m28634d(SemanticsConfigurationKt.getOrNull(collapsedSemanticsConfiguration, SemanticsProperties.INSTANCE.getFocused()), Boolean.TRUE);
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    public static final ScrollObservationScope findById(List<ScrollObservationScope> list, int i) {
        C12775o.m28639i(list, "<this>");
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2).getSemanticsNodeId() == i) {
                return list.get(i2);
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final LayoutNode findClosestParentNode(LayoutNode layoutNode, Function1<? super LayoutNode, Boolean> function1) {
        for (LayoutNode parent$ui_release = layoutNode.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if (function1.invoke(parent$ui_release).booleanValue()) {
                return parent$ui_release;
            }
        }
        return null;
    }

    public static final Map<Integer, SemanticsNodeWithAdjustedBounds> getAllUncoveredSemanticsNodesToMap(SemanticsOwner semanticsOwner) {
        C12775o.m28639i(semanticsOwner, "<this>");
        SemanticsNode unmergedRootSemanticsNode = semanticsOwner.getUnmergedRootSemanticsNode();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (unmergedRootSemanticsNode.getLayoutNode$ui_release().isPlaced() && unmergedRootSemanticsNode.getLayoutNode$ui_release().isAttached()) {
            Region region = new Region();
            Rect boundsInRoot = unmergedRootSemanticsNode.getBoundsInRoot();
            region.set(new android.graphics.Rect(C13265c.m30134c(boundsInRoot.getLeft()), C13265c.m30134c(boundsInRoot.getTop()), C13265c.m30134c(boundsInRoot.getRight()), C13265c.m30134c(boundsInRoot.getBottom())));
            getAllUncoveredSemanticsNodesToMap$findAllSemanticNodesRecursive(region, unmergedRootSemanticsNode, linkedHashMap, unmergedRootSemanticsNode);
        }
        return linkedHashMap;
    }

    private static final void getAllUncoveredSemanticsNodesToMap$findAllSemanticNodesRecursive(Region region, SemanticsNode semanticsNode, Map<Integer, SemanticsNodeWithAdjustedBounds> map, SemanticsNode semanticsNode2) {
        boolean z;
        int i;
        Rect rect;
        LayoutInfo layoutInfo;
        boolean z2 = false;
        if (!semanticsNode2.getLayoutNode$ui_release().isPlaced() || !semanticsNode2.getLayoutNode$ui_release().isAttached()) {
            z = true;
        } else {
            z = false;
        }
        if (region.isEmpty() && semanticsNode2.getId() != semanticsNode.getId()) {
            return;
        }
        if (!z || semanticsNode2.isFake$ui_release()) {
            android.graphics.Rect rect2 = new android.graphics.Rect(C13265c.m30134c(semanticsNode2.getTouchBoundsInRoot().getLeft()), C13265c.m30134c(semanticsNode2.getTouchBoundsInRoot().getTop()), C13265c.m30134c(semanticsNode2.getTouchBoundsInRoot().getRight()), C13265c.m30134c(semanticsNode2.getTouchBoundsInRoot().getBottom()));
            Region region2 = new Region();
            region2.set(rect2);
            if (semanticsNode2.getId() == semanticsNode.getId()) {
                i = -1;
            } else {
                i = semanticsNode2.getId();
            }
            if (region2.op(region, region2, Region.Op.INTERSECT)) {
                Integer valueOf = Integer.valueOf(i);
                android.graphics.Rect bounds = region2.getBounds();
                C12775o.m28638h(bounds, "region.bounds");
                map.put(valueOf, new SemanticsNodeWithAdjustedBounds(semanticsNode2, bounds));
                List<SemanticsNode> replacedChildren$ui_release = semanticsNode2.getReplacedChildren$ui_release();
                for (int size = replacedChildren$ui_release.size() - 1; -1 < size; size--) {
                    getAllUncoveredSemanticsNodesToMap$findAllSemanticNodesRecursive(region, semanticsNode, map, replacedChildren$ui_release.get(size));
                }
                region.op(rect2, region, Region.Op.REVERSE_DIFFERENCE);
            } else if (semanticsNode2.isFake$ui_release()) {
                SemanticsNode parent = semanticsNode2.getParent();
                if (!(parent == null || (layoutInfo = parent.getLayoutInfo()) == null || !layoutInfo.isPlaced())) {
                    z2 = true;
                }
                if (z2) {
                    rect = parent.getBoundsInRoot();
                } else {
                    rect = new Rect(0.0f, 0.0f, 10.0f, 10.0f);
                }
                map.put(Integer.valueOf(i), new SemanticsNodeWithAdjustedBounds(semanticsNode2, new android.graphics.Rect(C13265c.m30134c(rect.getLeft()), C13265c.m30134c(rect.getTop()), C13265c.m30134c(rect.getRight()), C13265c.m30134c(rect.getBottom()))));
            } else if (i == -1) {
                Integer valueOf2 = Integer.valueOf(i);
                android.graphics.Rect bounds2 = region2.getBounds();
                C12775o.m28638h(bounds2, "region.bounds");
                map.put(valueOf2, new SemanticsNodeWithAdjustedBounds(semanticsNode2, bounds2));
            }
        }
    }

    private static final boolean getHasCollectionInfo(SemanticsNode semanticsNode) {
        return semanticsNode.getConfig().contains(SemanticsProperties.INSTANCE.getCollectionInfo());
    }

    /* access modifiers changed from: private */
    public static final boolean getSemanticsNodeIsStructurallySignificant(SemanticsNode semanticsNode) {
        if (C12775o.m28634d(isContainer(semanticsNode), Boolean.FALSE)) {
            return false;
        }
        if (C12775o.m28634d(isContainer(semanticsNode), Boolean.TRUE) || getHasCollectionInfo(semanticsNode) || isScrollable(semanticsNode)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static final boolean hasPaneTitle(SemanticsNode semanticsNode) {
        return semanticsNode.getConfig().contains(SemanticsProperties.INSTANCE.getPaneTitle());
    }

    private static final Boolean isContainer(SemanticsNode semanticsNode) {
        return (Boolean) SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), SemanticsProperties.INSTANCE.getIsContainer());
    }

    /* access modifiers changed from: private */
    public static final boolean isPassword(SemanticsNode semanticsNode) {
        return semanticsNode.getConfig().contains(SemanticsProperties.INSTANCE.getPassword());
    }

    /* access modifiers changed from: private */
    public static final boolean isRtl(SemanticsNode semanticsNode) {
        if (semanticsNode.getLayoutInfo().getLayoutDirection() == LayoutDirection.Rtl) {
            return true;
        }
        return false;
    }

    private static final boolean isScrollable(SemanticsNode semanticsNode) {
        return semanticsNode.getConfig().contains(SemanticsActions.INSTANCE.getScrollBy());
    }

    /* access modifiers changed from: private */
    public static final boolean isTextField(SemanticsNode semanticsNode) {
        return semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsActions.INSTANCE.getSetText());
    }

    /* access modifiers changed from: private */
    public static final boolean isVisible(SemanticsNode semanticsNode) {
        if (semanticsNode.isTransparent$ui_release() || semanticsNode.getUnmergedConfig$ui_release().contains(SemanticsProperties.INSTANCE.getInvisibleToUser())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static final boolean overlaps(OpenEndRange<Float> openEndRange, OpenEndRange<Float> openEndRange2) {
        if (openEndRange.isEmpty() || openEndRange2.isEmpty() || Math.max(openEndRange.getStart().floatValue(), openEndRange2.getStart().floatValue()) >= Math.min(openEndRange.getEndExclusive().floatValue(), openEndRange2.getEndExclusive().floatValue())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static final boolean propertiesDeleted(SemanticsNode semanticsNode, AndroidComposeViewAccessibilityDelegateCompat.SemanticsNodeCopy semanticsNodeCopy) {
        Iterator<Map.Entry<SemanticsPropertyKey<?>, Object>> it = semanticsNodeCopy.getUnmergedConfig().iterator();
        while (it.hasNext()) {
            if (!semanticsNode.getConfig().contains((SemanticsPropertyKey) it.next().getKey())) {
                return true;
            }
        }
        return false;
    }

    public static final OpenEndRange<Float> rangeUntil(float f, float f2) {
        return new OpenEndFloatRange(f, f2);
    }

    private static /* synthetic */ void isVisible$annotations(SemanticsNode semanticsNode) {
    }
}
