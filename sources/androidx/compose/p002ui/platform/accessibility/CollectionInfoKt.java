package androidx.compose.p002ui.platform.accessibility;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.semantics.CollectionInfo;
import androidx.compose.p002ui.semantics.CollectionItemInfo;
import androidx.compose.p002ui.semantics.SemanticsConfiguration;
import androidx.compose.p002ui.semantics.SemanticsConfigurationKt;
import androidx.compose.p002ui.semantics.SemanticsNode;
import androidx.compose.p002ui.semantics.SemanticsProperties;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nCollectionInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionInfo.kt\nandroidx/compose/ui/platform/accessibility/CollectionInfoKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 TempListUtils.kt\nandroidx/compose/ui/TempListUtilsKt\n*L\n1#1,153:1\n33#2,6:154\n33#2,6:160\n38#3,11:166\n68#3,7:177\n*S KotlinDebug\n*F\n+ 1 CollectionInfo.kt\nandroidx/compose/ui/platform/accessibility/CollectionInfoKt\n*L\n43#1:154,6\n87#1:160,6\n122#1:166,11\n130#1:177,7\n*E\n"})
/* renamed from: androidx.compose.ui.platform.accessibility.CollectionInfoKt */
/* compiled from: CollectionInfo.kt */
public final class CollectionInfoKt {
    private static final boolean calculateIfHorizontallyStacked(List<SemanticsNode> list) {
        List list2;
        long j;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() == 0 || list.size() == 1) {
            list2 = C12726w.m28524k();
        } else {
            list2 = new ArrayList();
            SemanticsNode semanticsNode = list.get(0);
            int m = C12726w.m28526m(list);
            int i = 0;
            while (i < m) {
                i++;
                SemanticsNode semanticsNode2 = list.get(i);
                SemanticsNode semanticsNode3 = semanticsNode2;
                SemanticsNode semanticsNode4 = semanticsNode;
                list2.add(Offset.m35411boximpl(OffsetKt.Offset(Math.abs(Offset.m35422getXimpl(semanticsNode4.getBoundsInRoot().m35452getCenterF1C5BW0()) - Offset.m35422getXimpl(semanticsNode3.getBoundsInRoot().m35452getCenterF1C5BW0())), Math.abs(Offset.m35423getYimpl(semanticsNode4.getBoundsInRoot().m35452getCenterF1C5BW0()) - Offset.m35423getYimpl(semanticsNode3.getBoundsInRoot().m35452getCenterF1C5BW0())))));
                semanticsNode = semanticsNode2;
            }
        }
        if (list2.size() == 1) {
            j = ((Offset) C12686e0.m28221Z(list2)).m35432unboximpl();
        } else if (!list2.isEmpty()) {
            Object Z = C12686e0.m28221Z(list2);
            int m2 = C12726w.m28526m(list2);
            if (1 <= m2) {
                int i2 = 1;
                while (true) {
                    Z = Offset.m35411boximpl(Offset.m35427plusMKHz9U(((Offset) Z).m35432unboximpl(), ((Offset) list2.get(i2)).m35432unboximpl()));
                    if (i2 == m2) {
                        break;
                    }
                    i2++;
                }
            }
            j = ((Offset) Z).m35432unboximpl();
        } else {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        if (Offset.m35413component2impl(j) < Offset.m35412component1impl(j)) {
            return true;
        }
        return false;
    }

    public static final boolean hasCollectionInfo(SemanticsNode semanticsNode) {
        C12775o.m28639i(semanticsNode, "<this>");
        SemanticsConfiguration config = semanticsNode.getConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getCollectionInfo()) == null && SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), semanticsProperties.getSelectableGroup()) == null) {
            return false;
        }
        return true;
    }

    private static final boolean isLazyCollection(CollectionInfo collectionInfo) {
        if (collectionInfo.getRowCount() < 0 || collectionInfo.getColumnCount() < 0) {
            return true;
        }
        return false;
    }

    public static final void setCollectionInfo(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        int i;
        C12775o.m28639i(semanticsNode, "node");
        C12775o.m28639i(accessibilityNodeInfoCompat, "info");
        SemanticsConfiguration config = semanticsNode.getConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        CollectionInfo collectionInfo = (CollectionInfo) SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getCollectionInfo());
        if (collectionInfo != null) {
            accessibilityNodeInfoCompat.setCollectionInfo(toAccessibilityCollectionInfo(collectionInfo));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), semanticsProperties.getSelectableGroup()) != null) {
            List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            for (int i2 = 0; i2 < size; i2++) {
                SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i2);
                if (semanticsNode2.getConfig().contains(SemanticsProperties.INSTANCE.getSelected())) {
                    arrayList.add(semanticsNode2);
                }
            }
        }
        int i3 = 1;
        if (!arrayList.isEmpty()) {
            boolean calculateIfHorizontallyStacked = calculateIfHorizontallyStacked(arrayList);
            if (calculateIfHorizontallyStacked) {
                i = 1;
            } else {
                i = arrayList.size();
            }
            if (calculateIfHorizontallyStacked) {
                i3 = arrayList.size();
            }
            accessibilityNodeInfoCompat.setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(i, i3, false, 0));
        }
    }

    public static final void setCollectionItemInfo(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        int i;
        int i2;
        C12775o.m28639i(semanticsNode, "node");
        C12775o.m28639i(accessibilityNodeInfoCompat, "info");
        SemanticsConfiguration config = semanticsNode.getConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        CollectionItemInfo collectionItemInfo = (CollectionItemInfo) SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getCollectionItemInfo());
        if (collectionItemInfo != null) {
            accessibilityNodeInfoCompat.setCollectionItemInfo(toAccessibilityCollectionItemInfo(collectionItemInfo, semanticsNode));
        }
        SemanticsNode parent = semanticsNode.getParent();
        if (parent != null && SemanticsConfigurationKt.getOrNull(parent.getConfig(), semanticsProperties.getSelectableGroup()) != null) {
            CollectionInfo collectionInfo = (CollectionInfo) SemanticsConfigurationKt.getOrNull(parent.getConfig(), semanticsProperties.getCollectionInfo());
            if ((collectionInfo == null || !isLazyCollection(collectionInfo)) && semanticsNode.getConfig().contains(semanticsProperties.getSelected())) {
                ArrayList arrayList = new ArrayList();
                List<SemanticsNode> replacedChildren$ui_release = parent.getReplacedChildren$ui_release();
                int size = replacedChildren$ui_release.size();
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i4);
                    if (semanticsNode2.getConfig().contains(SemanticsProperties.INSTANCE.getSelected())) {
                        arrayList.add(semanticsNode2);
                        if (semanticsNode2.getLayoutNode$ui_release().getPlaceOrder$ui_release() < semanticsNode.getLayoutNode$ui_release().getPlaceOrder$ui_release()) {
                            i3++;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    boolean calculateIfHorizontallyStacked = calculateIfHorizontallyStacked(arrayList);
                    if (calculateIfHorizontallyStacked) {
                        i = 0;
                    } else {
                        i = i3;
                    }
                    if (calculateIfHorizontallyStacked) {
                        i2 = i3;
                    } else {
                        i2 = 0;
                    }
                    AccessibilityNodeInfoCompat.CollectionItemInfoCompat obtain = AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(i, 1, i2, 1, false, ((Boolean) semanticsNode.getConfig().getOrElse(SemanticsProperties.INSTANCE.getSelected(), CollectionInfoKt$setCollectionItemInfo$itemInfo$1.INSTANCE)).booleanValue());
                    if (obtain != null) {
                        accessibilityNodeInfoCompat.setCollectionItemInfo(obtain);
                    }
                }
            }
        }
    }

    private static final AccessibilityNodeInfoCompat.CollectionInfoCompat toAccessibilityCollectionInfo(CollectionInfo collectionInfo) {
        return AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(collectionInfo.getRowCount(), collectionInfo.getColumnCount(), false, 0);
    }

    private static final AccessibilityNodeInfoCompat.CollectionItemInfoCompat toAccessibilityCollectionItemInfo(CollectionItemInfo collectionItemInfo, SemanticsNode semanticsNode) {
        return AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(collectionItemInfo.getRowIndex(), collectionItemInfo.getRowSpan(), collectionItemInfo.getColumnIndex(), collectionItemInfo.getColumnSpan(), false, ((Boolean) semanticsNode.getConfig().getOrElse(SemanticsProperties.INSTANCE.getSelected(), CollectionInfoKt$toAccessibilityCollectionItemInfo$1.INSTANCE)).booleanValue());
    }
}
