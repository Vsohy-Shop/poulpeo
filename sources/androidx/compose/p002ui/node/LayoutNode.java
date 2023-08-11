package androidx.compose.p002ui.node;

import android.view.View;
import androidx.compose.p002ui.InternalComposeUiApi;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.focus.FocusTargetModifierNode;
import androidx.compose.p002ui.graphics.Canvas;
import androidx.compose.p002ui.layout.IntrinsicMeasurable;
import androidx.compose.p002ui.layout.IntrinsicMeasureScope;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.p002ui.layout.LayoutInfo;
import androidx.compose.p002ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.p002ui.layout.LookaheadScope;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.layout.ModifierInfo;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.layout.Remeasurement;
import androidx.compose.p002ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.p002ui.node.Owner;
import androidx.compose.p002ui.platform.JvmActuals_jvmKt;
import androidx.compose.p002ui.platform.ViewConfiguration;
import androidx.compose.p002ui.semantics.SemanticsModifierCore;
import androidx.compose.p002ui.semantics.SemanticsNodeKt;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.DensityKt;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.p002ui.viewinterop.AndroidViewHolder;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.collection.MutableVector;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nLayoutNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVectorWithMutationTracking.kt\nandroidx/compose/ui/node/MutableVectorWithMutationTracking\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope$Companion\n+ 7 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 8 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n+ 9 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n+ 10 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 11 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 12 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n*L\n1#1,1507:1\n1289#1,7:1589\n163#1:1609\n1289#1,7:1621\n1289#1,7:1628\n1277#1,7:1650\n163#1:1657\n163#1:1669\n1289#1,7:1681\n163#1:1688\n163#1:1700\n1277#1,7:1770\n163#1:1850\n163#1:1862\n163#1:1874\n1289#1,7:1886\n1182#2:1508\n1161#2,2:1509\n1182#2:1511\n1161#2,2:1512\n1182#2:1514\n1161#2,2:1515\n48#3:1517\n48#3:1553\n48#3:1565\n48#3:1577\n48#3:1596\n460#4,7:1518\n146#4:1525\n467#4,4:1526\n460#4,11:1530\n476#4,11:1541\n460#4,11:1554\n460#4,11:1566\n460#4,11:1578\n460#4,11:1597\n146#4:1608\n460#4,11:1610\n460#4,11:1658\n460#4,11:1670\n460#4,11:1689\n460#4,11:1701\n460#4,11:1809\n460#4,11:1851\n460#4,11:1863\n460#4,11:1875\n1#5:1552\n360#6,15:1635\n87#7,3:1712\n91#7:1716\n87#7:1721\n89#7,3:1723\n87#7:1729\n87#7:1733\n83#7:1738\n83#7:1753\n69#7:1777\n69#7:1792\n81#7:1820\n71#7:1837\n69#7:1838\n69#7:1842\n69#7:1844\n71#7:1845\n47#8:1715\n51#9:1717\n633#10,3:1718\n636#10,3:1726\n664#10,3:1730\n667#10,3:1735\n610#10,8:1739\n633#10,3:1747\n618#10,2:1750\n611#10:1752\n612#10,11:1754\n636#10,3:1765\n623#10:1768\n613#10:1769\n610#10,8:1778\n633#10,3:1786\n618#10,2:1789\n611#10:1791\n612#10,11:1793\n636#10,3:1804\n623#10:1807\n613#10:1808\n633#10,3:1839\n636#10,3:1847\n196#11:1722\n196#11:1734\n196#11:1843\n196#11:1846\n111#12:1821\n100#12,15:1822\n*S KotlinDebug\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n*L\n422#1:1589,7\n519#1:1609\n589#1:1621,7\n778#1:1628,7\n923#1:1650,7\n962#1:1657\n975#1:1669\n1001#1:1681,7\n1006#1:1688\n1041#1:1700\n1158#1:1770,7\n1326#1:1850\n1348#1:1862\n1360#1:1874\n1393#1:1886,7\n95#1:1508\n95#1:1509,2\n465#1:1511\n465#1:1512,2\n107#1:1514\n107#1:1515,2\n111#1:1517\n279#1:1553\n344#1:1565\n415#1:1577\n457#1:1596\n111#1:1518,7\n113#1:1525\n111#1:1526,4\n163#1:1530,11\n165#1:1541,11\n279#1:1554,11\n344#1:1566,11\n415#1:1578,11\n457#1:1597,11\n481#1:1608\n519#1:1610,11\n962#1:1658,11\n975#1:1670,11\n1006#1:1689,11\n1041#1:1701,11\n1247#1:1809,11\n1326#1:1851,11\n1348#1:1863,11\n1360#1:1875,11\n823#1:1635,15\n1088#1:1712,3\n1088#1:1716\n1090#1:1721\n1090#1:1723,3\n1099#1:1729\n1102#1:1733\n1142#1:1738\n1143#1:1753\n1243#1:1777\n1244#1:1792\n1268#1:1820\n1299#1:1837\n1299#1:1838\n1301#1:1842\n1302#1:1844\n1306#1:1845\n1088#1:1715\n1088#1:1717\n1089#1:1718,3\n1089#1:1726,3\n1100#1:1730,3\n1100#1:1735,3\n1142#1:1739,8\n1142#1:1747,3\n1142#1:1750,2\n1142#1:1752\n1142#1:1754,11\n1142#1:1765,3\n1142#1:1768\n1142#1:1769\n1243#1:1778,8\n1243#1:1786,3\n1243#1:1789,2\n1243#1:1791\n1243#1:1793,11\n1243#1:1804,3\n1243#1:1807\n1243#1:1808\n1300#1:1839,3\n1300#1:1847,3\n1090#1:1722\n1102#1:1734\n1301#1:1843\n1306#1:1846\n1268#1:1821\n1268#1:1822,15\n*E\n"})
/* renamed from: androidx.compose.ui.node.LayoutNode */
/* compiled from: LayoutNode.kt */
public final class LayoutNode implements ComposeNodeLifecycleCallback, Remeasurement, OwnerScope, LayoutInfo, ComposeUiNode, InteroperableComposeUiNode, Owner.OnLayoutCompletedListener {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final C13074a<LayoutNode> Constructor = LayoutNode$Companion$Constructor$1.INSTANCE;
    /* access modifiers changed from: private */
    public static final ViewConfiguration DummyViewConfiguration = new LayoutNode$Companion$DummyViewConfiguration$1();
    private static final NoIntrinsicsMeasurePolicy ErrorMeasurePolicy = new LayoutNode$Companion$ErrorMeasurePolicy$1();
    public static final int NotPlacedPlaceOrder = Integer.MAX_VALUE;
    /* access modifiers changed from: private */
    public static final Comparator<LayoutNode> ZComparator = new C1062a();
    private final MutableVectorWithMutationTracking<LayoutNode> _foldedChildren;
    private LayoutNode _foldedParent;
    private NodeCoordinator _innerLayerCoordinator;
    private MutableVector<LayoutNode> _unfoldedChildren;
    private final MutableVector<LayoutNode> _zSortedChildren;
    private boolean canMultiMeasure;
    private boolean deactivated;
    private Density density;
    private int depth;
    /* access modifiers changed from: private */
    public boolean ignoreRemeasureRequests;
    private boolean innerLayerCoordinatorIsDirty;
    private AndroidViewHolder interopViewFactoryHolder;
    private final IntrinsicsPolicy intrinsicsPolicy;
    private UsageByParent intrinsicsUsageByParent;
    private boolean isLookaheadRoot;
    private boolean isPlaced;
    private final boolean isVirtual;
    private final LayoutNodeLayoutDelegate layoutDelegate;
    private LayoutDirection layoutDirection;
    private LookaheadScope mLookaheadScope;
    private MeasurePolicy measurePolicy;
    private UsageByParent measuredByParent;
    private UsageByParent measuredByParentInLookahead;
    private Modifier modifier;
    private boolean needsOnPositionedDispatch;
    private int nextChildPlaceOrder;
    private final NodeChain nodes;
    private Function1<? super Owner, C11921v> onAttach;
    private Function1<? super Owner, C11921v> onDetach;
    private Owner owner;
    private int placeOrder;
    private UsageByParent previousIntrinsicsUsageByParent;
    private int previousPlaceOrder;
    private boolean relayoutWithoutParentInProgress;
    private final int semanticsId;
    private LayoutNodeSubcompositionsState subcompositionsState;
    private boolean unfoldedVirtualChildrenListDirty;
    private ViewConfiguration viewConfiguration;
    private int virtualChildrenCount;
    private float zIndex;
    private boolean zSortedChildrenInvalidated;

    /* renamed from: androidx.compose.ui.node.LayoutNode$Companion */
    /* compiled from: LayoutNode.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C13074a<LayoutNode> getConstructor$ui_release() {
            return LayoutNode.Constructor;
        }

        public final ViewConfiguration getDummyViewConfiguration$ui_release() {
            return LayoutNode.DummyViewConfiguration;
        }

        public final Comparator<LayoutNode> getZComparator$ui_release() {
            return LayoutNode.ZComparator;
        }
    }

    /* renamed from: androidx.compose.ui.node.LayoutNode$LayoutState */
    /* compiled from: LayoutNode.kt */
    public enum LayoutState {
        Measuring,
        LookaheadMeasuring,
        LayingOut,
        LookaheadLayingOut,
        Idle
    }

    /* renamed from: androidx.compose.ui.node.LayoutNode$NoIntrinsicsMeasurePolicy */
    /* compiled from: LayoutNode.kt */
    public static abstract class NoIntrinsicsMeasurePolicy implements MeasurePolicy {
        private final String error;

        public NoIntrinsicsMeasurePolicy(String str) {
            C12775o.m28639i(str, MediaRouteProviderProtocol.SERVICE_DATA_ERROR);
            this.error = str;
        }

        public Void maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
            C12775o.m28639i(intrinsicMeasureScope, "<this>");
            C12775o.m28639i(list, "measurables");
            throw new IllegalStateException(this.error.toString());
        }

        public Void maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
            C12775o.m28639i(intrinsicMeasureScope, "<this>");
            C12775o.m28639i(list, "measurables");
            throw new IllegalStateException(this.error.toString());
        }

        public Void minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
            C12775o.m28639i(intrinsicMeasureScope, "<this>");
            C12775o.m28639i(list, "measurables");
            throw new IllegalStateException(this.error.toString());
        }

        public Void minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i) {
            C12775o.m28639i(intrinsicMeasureScope, "<this>");
            C12775o.m28639i(list, "measurables");
            throw new IllegalStateException(this.error.toString());
        }
    }

    /* renamed from: androidx.compose.ui.node.LayoutNode$UsageByParent */
    /* compiled from: LayoutNode.kt */
    public enum UsageByParent {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed
    }

    /* renamed from: androidx.compose.ui.node.LayoutNode$WhenMappings */
    /* compiled from: LayoutNode.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutState.values().length];
            try {
                iArr[LayoutState.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LayoutNode() {
        this(false, 0, 3, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    public static final int ZComparator$lambda$41(LayoutNode layoutNode, LayoutNode layoutNode2) {
        boolean z;
        float f = layoutNode.zIndex;
        float f2 = layoutNode2.zIndex;
        if (f == f2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C12775o.m28641k(layoutNode.placeOrder, layoutNode2.placeOrder);
        }
        return Float.compare(f, f2);
    }

    private final void clearSubtreePlacementIntrinsicsUsage() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) content[i];
                if (layoutNode.intrinsicsUsageByParent == UsageByParent.InLayoutBlock) {
                    layoutNode.clearSubtreePlacementIntrinsicsUsage();
                }
                i++;
            } while (i < size);
        }
    }

    private final String debugTreeToString(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append(10);
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i3 = 0;
            do {
                sb.append(((LayoutNode) content[i3]).debugTreeToString(i + 1));
                i3++;
            } while (i3 < size);
        }
        String sb2 = sb.toString();
        C12775o.m28638h(sb2, "tree.toString()");
        if (i != 0) {
            return sb2;
        }
        String substring = sb2.substring(0, sb2.length() - 1);
        C12775o.m28638h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    static /* synthetic */ String debugTreeToString$default(LayoutNode layoutNode, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return layoutNode.debugTreeToString(i);
    }

    private final void forEachCoordinator(Function1<? super LayoutModifierNodeCoordinator, C11921v> function1) {
        NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release();
        NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        while (outerCoordinator$ui_release != innerCoordinator$ui_release) {
            C12775o.m28637g(outerCoordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) outerCoordinator$ui_release;
            function1.invoke(layoutModifierNodeCoordinator);
            outerCoordinator$ui_release = layoutModifierNodeCoordinator.getWrapped$ui_release();
        }
    }

    private final void forEachCoordinatorIncludingInner(Function1<? super NodeCoordinator, C11921v> function1) {
        NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release();
        NodeCoordinator wrapped$ui_release = getInnerCoordinator$ui_release().getWrapped$ui_release();
        while (!C12775o.m28634d(outerCoordinator$ui_release, wrapped$ui_release) && outerCoordinator$ui_release != null) {
            function1.invoke(outerCoordinator$ui_release);
            outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release();
        }
    }

    private final NodeCoordinator getInnerLayerCoordinator() {
        OwnedLayer ownedLayer;
        if (this.innerLayerCoordinatorIsDirty) {
            NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
            NodeCoordinator wrappedBy$ui_release = getOuterCoordinator$ui_release().getWrappedBy$ui_release();
            this._innerLayerCoordinator = null;
            while (true) {
                if (C12775o.m28634d(innerCoordinator$ui_release, wrappedBy$ui_release)) {
                    break;
                }
                if (innerCoordinator$ui_release != null) {
                    ownedLayer = innerCoordinator$ui_release.getLayer();
                } else {
                    ownedLayer = null;
                }
                if (ownedLayer != null) {
                    this._innerLayerCoordinator = innerCoordinator$ui_release;
                    break;
                } else if (innerCoordinator$ui_release != null) {
                    innerCoordinator$ui_release = innerCoordinator$ui_release.getWrappedBy$ui_release();
                } else {
                    innerCoordinator$ui_release = null;
                }
            }
        }
        NodeCoordinator nodeCoordinator = this._innerLayerCoordinator;
        if (nodeCoordinator == null || nodeCoordinator.getLayer() != null) {
            return nodeCoordinator;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    private final LayoutNodeLayoutDelegate.LookaheadPassDelegate getLookaheadPassDelegate() {
        return this.layoutDelegate.getLookaheadPassDelegate$ui_release();
    }

    private final LayoutNodeLayoutDelegate.MeasurePassDelegate getMeasurePassDelegate() {
        return this.layoutDelegate.getMeasurePassDelegate$ui_release();
    }

    /* renamed from: hitTest-M_7yMNQ$ui_release$default  reason: not valid java name */
    public static /* synthetic */ void m37497hitTestM_7yMNQ$ui_release$default(LayoutNode layoutNode, long j, HitTestResult hitTestResult, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = true;
        }
        layoutNode.m37501hitTestM_7yMNQ$ui_release(j, hitTestResult, z3, z2);
    }

    /* renamed from: hitTestSemantics-M_7yMNQ$ui_release$default  reason: not valid java name */
    public static /* synthetic */ void m37498hitTestSemanticsM_7yMNQ$ui_release$default(LayoutNode layoutNode, long j, HitTestResult hitTestResult, boolean z, boolean z2, int i, Object obj) {
        boolean z3;
        boolean z4;
        if ((i & 4) != 0) {
            z3 = true;
        } else {
            z3 = z;
        }
        if ((i & 8) != 0) {
            z4 = true;
        } else {
            z4 = z2;
        }
        layoutNode.m37502hitTestSemanticsM_7yMNQ$ui_release(j, hitTestResult, z3, z4);
    }

    private final void invalidateFocusOnAttach() {
        boolean z;
        boolean z2;
        if (this.nodes.has$ui_release(NodeKind.m37625constructorimpl(1024) | NodeKind.m37625constructorimpl(2048) | NodeKind.m37625constructorimpl(4096))) {
            for (Modifier.Node head$ui_release = this.nodes.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                boolean z3 = true;
                if ((NodeKind.m37625constructorimpl(1024) & head$ui_release.getKindSet$ui_release()) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if ((NodeKind.m37625constructorimpl(2048) & head$ui_release.getKindSet$ui_release()) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z4 = z | z2;
                if ((NodeKind.m37625constructorimpl(4096) & head$ui_release.getKindSet$ui_release()) == 0) {
                    z3 = false;
                }
                if (z4 || z3) {
                    NodeKindKt.autoInvalidateInsertedNode(head$ui_release);
                }
            }
        }
    }

    private final void invalidateFocusOnDetach() {
        boolean z;
        if (this.nodes.m37575hasH91voCI$ui_release(NodeKind.m37625constructorimpl(1024))) {
            for (Modifier.Node tail$ui_release = this.nodes.getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
                if ((NodeKind.m37625constructorimpl(1024) & tail$ui_release.getKindSet$ui_release()) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (tail$ui_release instanceof FocusTargetModifierNode)) {
                    FocusTargetModifierNode focusTargetModifierNode = (FocusTargetModifierNode) tail$ui_release;
                    if (focusTargetModifierNode.getFocusState().isFocused()) {
                        LayoutNodeKt.requireOwner(this).getFocusOwner().clearFocus(true, false);
                        focusTargetModifierNode.scheduleInvalidationForFocusEvents$ui_release();
                    }
                }
            }
        }
    }

    public static /* synthetic */ void invalidateSubtree$default(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        layoutNode.invalidateSubtree(z);
    }

    private final void invalidateUnfoldedVirtualChildren() {
        LayoutNode parent$ui_release;
        if (this.virtualChildrenCount > 0) {
            this.unfoldedVirtualChildrenListDirty = true;
        }
        if (this.isVirtual && (parent$ui_release = getParent$ui_release()) != null) {
            parent$ui_release.unfoldedVirtualChildrenListDirty = true;
        }
    }

    /* renamed from: lookaheadRemeasure-_Sx5XlM$ui_release$default  reason: not valid java name */
    public static /* synthetic */ boolean m37499lookaheadRemeasure_Sx5XlM$ui_release$default(LayoutNode layoutNode, Constraints constraints, int i, Object obj) {
        if ((i & 1) != 0) {
            constraints = layoutNode.layoutDelegate.m37548getLastLookaheadConstraintsDWUhwKw();
        }
        return layoutNode.m37503lookaheadRemeasure_Sx5XlM$ui_release(constraints);
    }

    private final void markNodeAndSubtreeAsPlaced() {
        boolean isPlaced2 = isPlaced();
        this.isPlaced = true;
        if (!isPlaced2) {
            if (getMeasurePending$ui_release()) {
                requestRemeasure$ui_release(true);
            } else if (getLookaheadMeasurePending$ui_release()) {
                requestLookaheadRemeasure$ui_release(true);
            }
        }
        NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release();
        NodeCoordinator wrapped$ui_release = getInnerCoordinator$ui_release().getWrapped$ui_release();
        while (!C12775o.m28634d(outerCoordinator$ui_release, wrapped$ui_release) && outerCoordinator$ui_release != null) {
            if (outerCoordinator$ui_release.getLastLayerDrawingWasSkipped$ui_release()) {
                outerCoordinator$ui_release.invalidateLayer();
            }
            outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release();
        }
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) content[i];
                if (layoutNode.placeOrder != Integer.MAX_VALUE) {
                    layoutNode.markNodeAndSubtreeAsPlaced();
                    rescheduleRemeasureOrRelayout$ui_release(layoutNode);
                }
                i++;
            } while (i < size);
        }
    }

    private final void markSubtreeAsNotPlaced() {
        if (isPlaced()) {
            int i = 0;
            this.isPlaced = false;
            MutableVector<LayoutNode> mutableVector = get_children$ui_release();
            int size = mutableVector.getSize();
            if (size > 0) {
                Object[] content = mutableVector.getContent();
                do {
                    ((LayoutNode) content[i]).markSubtreeAsNotPlaced();
                    i++;
                } while (i < size);
            }
        }
    }

    private final void onChildRemoved(LayoutNode layoutNode) {
        if (layoutNode.layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
            layoutNodeLayoutDelegate.setChildrenAccessingCoordinatesDuringPlacement(layoutNodeLayoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() - 1);
        }
        if (this.owner != null) {
            layoutNode.detach$ui_release();
        }
        layoutNode._foldedParent = null;
        layoutNode.getOuterCoordinator$ui_release().setWrappedBy$ui_release((NodeCoordinator) null);
        if (layoutNode.isVirtual) {
            this.virtualChildrenCount--;
            MutableVector<LayoutNode> vector = layoutNode._foldedChildren.getVector();
            int size = vector.getSize();
            if (size > 0) {
                Object[] content = vector.getContent();
                int i = 0;
                do {
                    ((LayoutNode) content[i]).getOuterCoordinator$ui_release().setWrappedBy$ui_release((NodeCoordinator) null);
                    i++;
                } while (i < size);
            }
        }
        invalidateUnfoldedVirtualChildren();
        onZSortedChildrenInvalidated$ui_release();
    }

    private final void onDensityOrLayoutDirectionChanged() {
        invalidateMeasurements$ui_release();
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
        invalidateLayers$ui_release();
    }

    private final void recreateUnfoldedChildrenIfDirty() {
        if (this.unfoldedVirtualChildrenListDirty) {
            int i = 0;
            this.unfoldedVirtualChildrenListDirty = false;
            MutableVector<LayoutNode> mutableVector = this._unfoldedChildren;
            if (mutableVector == null) {
                mutableVector = new MutableVector<>(new LayoutNode[16], 0);
                this._unfoldedChildren = mutableVector;
            }
            mutableVector.clear();
            MutableVector<LayoutNode> vector = this._foldedChildren.getVector();
            int size = vector.getSize();
            if (size > 0) {
                Object[] content = vector.getContent();
                do {
                    LayoutNode layoutNode = (LayoutNode) content[i];
                    if (layoutNode.isVirtual) {
                        mutableVector.addAll(mutableVector.getSize(), layoutNode.get_children$ui_release());
                    } else {
                        mutableVector.add(layoutNode);
                    }
                    i++;
                } while (i < size);
            }
            this.layoutDelegate.markChildrenDirty();
        }
    }

    /* renamed from: remeasure-_Sx5XlM$ui_release$default  reason: not valid java name */
    public static /* synthetic */ boolean m37500remeasure_Sx5XlM$ui_release$default(LayoutNode layoutNode, Constraints constraints, int i, Object obj) {
        if ((i & 1) != 0) {
            constraints = layoutNode.layoutDelegate.m37547getLastConstraintsDWUhwKw();
        }
        return layoutNode.m37504remeasure_Sx5XlM$ui_release(constraints);
    }

    public static /* synthetic */ void requestLookaheadRelayout$ui_release$default(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        layoutNode.requestLookaheadRelayout$ui_release(z);
    }

    public static /* synthetic */ void requestLookaheadRemeasure$ui_release$default(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        layoutNode.requestLookaheadRemeasure$ui_release(z);
    }

    public static /* synthetic */ void requestRelayout$ui_release$default(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        layoutNode.requestRelayout$ui_release(z);
    }

    public static /* synthetic */ void requestRemeasure$ui_release$default(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        layoutNode.requestRemeasure$ui_release(z);
    }

    private final void resetModifierState() {
        this.nodes.resetState$ui_release();
    }

    private final void setMLookaheadScope(LookaheadScope lookaheadScope) {
        if (!C12775o.m28634d(lookaheadScope, this.mLookaheadScope)) {
            this.mLookaheadScope = lookaheadScope;
            this.layoutDelegate.onLookaheadScopeChanged$ui_release(lookaheadScope);
            NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release();
            NodeCoordinator wrapped$ui_release = getInnerCoordinator$ui_release().getWrapped$ui_release();
            while (!C12775o.m28634d(outerCoordinator$ui_release, wrapped$ui_release) && outerCoordinator$ui_release != null) {
                outerCoordinator$ui_release.updateLookaheadScope$ui_release(lookaheadScope);
                outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release();
            }
        }
    }

    private final boolean shouldInvalidateParentLayer() {
        boolean z;
        if (this.nodes.m37575hasH91voCI$ui_release(NodeKind.m37625constructorimpl(4)) && !this.nodes.m37575hasH91voCI$ui_release(NodeKind.m37625constructorimpl(2))) {
            return true;
        }
        for (Modifier.Node head$ui_release = this.nodes.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
            boolean z2 = false;
            if ((NodeKind.m37625constructorimpl(2) & head$ui_release.getKindSet$ui_release()) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && (head$ui_release instanceof LayoutModifierNode) && DelegatableNodeKt.m37467requireCoordinator64DMado(head$ui_release, NodeKind.m37625constructorimpl(2)).getLayer() != null) {
                return false;
            }
            if ((NodeKind.m37625constructorimpl(4) & head$ui_release.getKindSet$ui_release()) != 0) {
                z2 = true;
            }
            if (z2) {
                return true;
            }
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: androidx.compose.ui.layout.LookaheadScope} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void attach$ui_release(androidx.compose.p002ui.node.Owner r7) {
        /*
            r6 = this;
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.C12775o.m28639i(r7, r0)
            androidx.compose.ui.node.Owner r0 = r6.owner
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x000d
            r0 = r2
            goto L_0x000e
        L_0x000d:
            r0 = r1
        L_0x000e:
            r3 = 0
            if (r0 == 0) goto L_0x00f7
            androidx.compose.ui.node.LayoutNode r0 = r6._foldedParent
            if (r0 == 0) goto L_0x0024
            if (r0 == 0) goto L_0x001a
            androidx.compose.ui.node.Owner r0 = r0.owner
            goto L_0x001b
        L_0x001a:
            r0 = r3
        L_0x001b:
            boolean r0 = kotlin.jvm.internal.C12775o.m28634d(r0, r7)
            if (r0 == 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r0 = r1
            goto L_0x0025
        L_0x0024:
            r0 = r2
        L_0x0025:
            if (r0 != 0) goto L_0x0070
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "Attaching to a different owner("
            r0.append(r4)
            r0.append(r7)
            java.lang.String r7 = ") than the parent's owner("
            r0.append(r7)
            androidx.compose.ui.node.LayoutNode r7 = r6.getParent$ui_release()
            if (r7 == 0) goto L_0x0042
            androidx.compose.ui.node.Owner r7 = r7.owner
            goto L_0x0043
        L_0x0042:
            r7 = r3
        L_0x0043:
            r0.append(r7)
            java.lang.String r7 = "). This tree: "
            r0.append(r7)
            java.lang.String r7 = debugTreeToString$default(r6, r1, r2, r3)
            r0.append(r7)
            java.lang.String r7 = " Parent tree: "
            r0.append(r7)
            androidx.compose.ui.node.LayoutNode r7 = r6._foldedParent
            if (r7 == 0) goto L_0x005f
            java.lang.String r3 = debugTreeToString$default(r7, r1, r2, r3)
        L_0x005f:
            r0.append(r3)
            java.lang.String r7 = r0.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r0.<init>(r7)
            throw r0
        L_0x0070:
            androidx.compose.ui.node.LayoutNode r0 = r6.getParent$ui_release()
            if (r0 != 0) goto L_0x0078
            r6.isPlaced = r2
        L_0x0078:
            r6.owner = r7
            if (r0 == 0) goto L_0x007f
            int r4 = r0.depth
            goto L_0x0080
        L_0x007f:
            r4 = -1
        L_0x0080:
            int r4 = r4 + r2
            r6.depth = r4
            androidx.compose.ui.node.SemanticsModifierNode r4 = androidx.compose.p002ui.semantics.SemanticsNodeKt.getOuterSemantics(r6)
            if (r4 == 0) goto L_0x008c
            r7.onSemanticsChange()
        L_0x008c:
            r7.onAttach(r6)
            if (r0 == 0) goto L_0x0098
            androidx.compose.ui.layout.LookaheadScope r4 = r0.mLookaheadScope
            if (r4 != 0) goto L_0x0096
            goto L_0x0098
        L_0x0096:
            r3 = r4
            goto L_0x00a1
        L_0x0098:
            boolean r4 = r6.isLookaheadRoot
            if (r4 == 0) goto L_0x00a1
            androidx.compose.ui.layout.LookaheadScope r3 = new androidx.compose.ui.layout.LookaheadScope
            r3.<init>(r6)
        L_0x00a1:
            r6.setMLookaheadScope(r3)
            androidx.compose.ui.node.NodeChain r3 = r6.nodes
            r3.attach()
            androidx.compose.ui.node.MutableVectorWithMutationTracking<androidx.compose.ui.node.LayoutNode> r3 = r6._foldedChildren
            androidx.compose.runtime.collection.MutableVector r3 = r3.getVector()
            int r4 = r3.getSize()
            if (r4 <= 0) goto L_0x00c3
            java.lang.Object[] r3 = r3.getContent()
        L_0x00b9:
            r5 = r3[r1]
            androidx.compose.ui.node.LayoutNode r5 = (androidx.compose.p002ui.node.LayoutNode) r5
            r5.attach$ui_release(r7)
            int r1 = r1 + r2
            if (r1 < r4) goto L_0x00b9
        L_0x00c3:
            r6.invalidateMeasurements$ui_release()
            if (r0 == 0) goto L_0x00cb
            r0.invalidateMeasurements$ui_release()
        L_0x00cb:
            androidx.compose.ui.node.NodeCoordinator r0 = r6.getOuterCoordinator$ui_release()
            androidx.compose.ui.node.NodeCoordinator r1 = r6.getInnerCoordinator$ui_release()
            androidx.compose.ui.node.NodeCoordinator r1 = r1.getWrapped$ui_release()
        L_0x00d7:
            boolean r2 = kotlin.jvm.internal.C12775o.m28634d(r0, r1)
            if (r2 != 0) goto L_0x00e7
            if (r0 == 0) goto L_0x00e7
            r0.onLayoutNodeAttach()
            androidx.compose.ui.node.NodeCoordinator r0 = r0.getWrapped$ui_release()
            goto L_0x00d7
        L_0x00e7:
            kotlin.jvm.functions.Function1<? super androidx.compose.ui.node.Owner, ef.v> r0 = r6.onAttach
            if (r0 == 0) goto L_0x00ee
            r0.invoke(r7)
        L_0x00ee:
            androidx.compose.ui.node.LayoutNodeLayoutDelegate r7 = r6.layoutDelegate
            r7.updateParentData()
            r6.invalidateFocusOnAttach()
            return
        L_0x00f7:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Cannot attach "
            r7.append(r0)
            r7.append(r6)
            java.lang.String r0 = " as it already is attached.  Tree: "
            r7.append(r0)
            java.lang.String r0 = debugTreeToString$default(r6, r1, r2, r3)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.node.LayoutNode.attach$ui_release(androidx.compose.ui.node.Owner):void");
    }

    public final void checkChildrenPlaceOrderForUpdates$ui_release() {
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) content[i];
                if (layoutNode.previousPlaceOrder != layoutNode.placeOrder) {
                    onZSortedChildrenInvalidated$ui_release();
                    invalidateLayer$ui_release();
                    if (layoutNode.placeOrder == Integer.MAX_VALUE) {
                        layoutNode.markSubtreeAsNotPlaced();
                    }
                }
                i++;
            } while (i < size);
        }
    }

    public final void clearPlaceOrder$ui_release() {
        int i = 0;
        this.nextChildPlaceOrder = 0;
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            do {
                LayoutNode layoutNode = (LayoutNode) content[i];
                layoutNode.previousPlaceOrder = layoutNode.placeOrder;
                layoutNode.placeOrder = Integer.MAX_VALUE;
                if (layoutNode.measuredByParent == UsageByParent.InLayoutBlock) {
                    layoutNode.measuredByParent = UsageByParent.NotUsed;
                }
                i++;
            } while (i < size);
        }
    }

    public final void clearSubtreeIntrinsicsUsage$ui_release() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) content[i];
                if (layoutNode.intrinsicsUsageByParent != UsageByParent.NotUsed) {
                    layoutNode.clearSubtreeIntrinsicsUsage$ui_release();
                }
                i++;
            } while (i < size);
        }
    }

    public final void detach$ui_release() {
        Owner owner2 = this.owner;
        String str = null;
        if (owner2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot detach node that is already detached!  Tree: ");
            LayoutNode parent$ui_release = getParent$ui_release();
            if (parent$ui_release != null) {
                str = debugTreeToString$default(parent$ui_release, 0, 1, (Object) null);
            }
            sb.append(str);
            throw new IllegalStateException(sb.toString().toString());
        }
        invalidateFocusOnDetach();
        LayoutNode parent$ui_release2 = getParent$ui_release();
        if (parent$ui_release2 != null) {
            parent$ui_release2.invalidateLayer$ui_release();
            parent$ui_release2.invalidateMeasurements$ui_release();
            this.measuredByParent = UsageByParent.NotUsed;
        }
        this.layoutDelegate.resetAlignmentLines();
        Function1<? super Owner, C11921v> function1 = this.onDetach;
        if (function1 != null) {
            function1.invoke(owner2);
        }
        if (SemanticsNodeKt.getOuterSemantics(this) != null) {
            owner2.onSemanticsChange();
        }
        this.nodes.detach$ui_release();
        owner2.onDetach(this);
        this.owner = null;
        this.depth = 0;
        MutableVector<LayoutNode> vector = this._foldedChildren.getVector();
        int size = vector.getSize();
        if (size > 0) {
            Object[] content = vector.getContent();
            int i = 0;
            do {
                ((LayoutNode) content[i]).detach$ui_release();
                i++;
            } while (i < size);
        }
        this.placeOrder = Integer.MAX_VALUE;
        this.previousPlaceOrder = Integer.MAX_VALUE;
        this.isPlaced = false;
    }

    public final void dispatchOnPositionedCallbacks$ui_release() {
        if (getLayoutState$ui_release() == LayoutState.Idle && !getLayoutPending$ui_release() && !getMeasurePending$ui_release() && isPlaced()) {
            NodeChain nodeChain = this.nodes;
            int r2 = NodeKind.m37625constructorimpl(256);
            if ((nodeChain.getAggregateChildKindSet() & r2) != 0) {
                Modifier.Node head$ui_release = nodeChain.getHead$ui_release();
                while (head$ui_release != null) {
                    if ((head$ui_release.getKindSet$ui_release() & r2) != 0 && (head$ui_release instanceof GlobalPositionAwareModifierNode)) {
                        GlobalPositionAwareModifierNode globalPositionAwareModifierNode = (GlobalPositionAwareModifierNode) head$ui_release;
                        globalPositionAwareModifierNode.onGloballyPositioned(DelegatableNodeKt.m37467requireCoordinator64DMado(globalPositionAwareModifierNode, NodeKind.m37625constructorimpl(256)));
                    }
                    if ((head$ui_release.getAggregateChildKindSet$ui_release() & r2) != 0) {
                        head$ui_release = head$ui_release.getChild$ui_release();
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void draw$ui_release(Canvas canvas) {
        C12775o.m28639i(canvas, "canvas");
        getOuterCoordinator$ui_release().draw(canvas);
    }

    public final void forEachChild(Function1<? super LayoutNode, C11921v> function1) {
        C12775o.m28639i(function1, "block");
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i = 0;
            do {
                function1.invoke(content[i]);
                i++;
            } while (i < size);
        }
    }

    public final void forEachChildIndexed(C13088o<? super Integer, ? super LayoutNode, C11921v> oVar) {
        C12775o.m28639i(oVar, "block");
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i = 0;
            do {
                oVar.invoke(Integer.valueOf(i), content[i]);
                i++;
            } while (i < size);
        }
    }

    public void forceRemeasure() {
        requestRemeasure$ui_release$default(this, false, 1, (Object) null);
        Constraints r3 = this.layoutDelegate.m37547getLastConstraintsDWUhwKw();
        if (r3 != null) {
            Owner owner2 = this.owner;
            if (owner2 != null) {
                owner2.m37678measureAndLayout0kLqBqw(this, r3.m38418unboximpl());
                return;
            }
            return;
        }
        Owner owner3 = this.owner;
        if (owner3 != null) {
            Owner.measureAndLayout$default(owner3, false, 1, (Object) null);
        }
    }

    public final boolean getAlignmentLinesRequired$ui_release() {
        boolean z;
        AlignmentLines alignmentLines;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
        if (layoutNodeLayoutDelegate.getAlignmentLinesOwner$ui_release().getAlignmentLines().getRequired$ui_release()) {
            return true;
        }
        AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release = layoutNodeLayoutDelegate.getLookaheadAlignmentLinesOwner$ui_release();
        if (lookaheadAlignmentLinesOwner$ui_release == null || (alignmentLines = lookaheadAlignmentLinesOwner$ui_release.getAlignmentLines()) == null || !alignmentLines.getRequired$ui_release()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        return false;
    }

    public final boolean getCanMultiMeasure$ui_release() {
        return this.canMultiMeasure;
    }

    public final List<Measurable> getChildLookaheadMeasurables$ui_release() {
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = getLookaheadPassDelegate();
        C12775o.m28636f(lookaheadPassDelegate);
        return lookaheadPassDelegate.getChildMeasurables$ui_release();
    }

    public final List<Measurable> getChildMeasurables$ui_release() {
        return getMeasurePassDelegate().getChildMeasurables$ui_release();
    }

    public final List<LayoutNode> getChildren$ui_release() {
        return get_children$ui_release().asMutableList();
    }

    public LayoutCoordinates getCoordinates() {
        return getInnerCoordinator$ui_release();
    }

    public Density getDensity() {
        return this.density;
    }

    public final int getDepth$ui_release() {
        return this.depth;
    }

    public final List<LayoutNode> getFoldedChildren$ui_release() {
        return this._foldedChildren.asList();
    }

    public final boolean getHasFixedInnerContentConstraints$ui_release() {
        long r0 = getInnerCoordinator$ui_release().m37595getLastMeasurementConstraintsmsEJaDk$ui_release();
        if (!Constraints.m38410getHasFixedWidthimpl(r0) || !Constraints.m38409getHasFixedHeightimpl(r0)) {
            return false;
        }
        return true;
    }

    public int getHeight() {
        return this.layoutDelegate.getHeight$ui_release();
    }

    public final NodeCoordinator getInnerCoordinator$ui_release() {
        return this.nodes.getInnerCoordinator$ui_release();
    }

    public final boolean getInnerLayerCoordinatorIsDirty$ui_release() {
        return this.innerLayerCoordinatorIsDirty;
    }

    @InternalComposeUiApi
    public View getInteropView() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            return androidViewHolder.getInteropView();
        }
        return null;
    }

    public final AndroidViewHolder getInteropViewFactoryHolder$ui_release() {
        return this.interopViewFactoryHolder;
    }

    public final IntrinsicsPolicy getIntrinsicsPolicy$ui_release() {
        return this.intrinsicsPolicy;
    }

    public final UsageByParent getIntrinsicsUsageByParent$ui_release() {
        return this.intrinsicsUsageByParent;
    }

    public final LayoutNodeLayoutDelegate getLayoutDelegate$ui_release() {
        return this.layoutDelegate;
    }

    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    public final boolean getLayoutPending$ui_release() {
        return this.layoutDelegate.getLayoutPending$ui_release();
    }

    public final LayoutState getLayoutState$ui_release() {
        return this.layoutDelegate.getLayoutState$ui_release();
    }

    public final boolean getLookaheadLayoutPending$ui_release() {
        return this.layoutDelegate.getLookaheadLayoutPending$ui_release();
    }

    public final boolean getLookaheadMeasurePending$ui_release() {
        return this.layoutDelegate.getLookaheadMeasurePending$ui_release();
    }

    public final LayoutNodeDrawScope getMDrawScope$ui_release() {
        return LayoutNodeKt.requireOwner(this).getSharedDrawScope();
    }

    public final LookaheadScope getMLookaheadScope$ui_release() {
        return this.mLookaheadScope;
    }

    public final boolean getMeasurePending$ui_release() {
        return this.layoutDelegate.getMeasurePending$ui_release();
    }

    public MeasurePolicy getMeasurePolicy() {
        return this.measurePolicy;
    }

    public final UsageByParent getMeasuredByParent$ui_release() {
        return this.measuredByParent;
    }

    public final UsageByParent getMeasuredByParentInLookahead$ui_release() {
        return this.measuredByParentInLookahead;
    }

    public Modifier getModifier() {
        return this.modifier;
    }

    public List<ModifierInfo> getModifierInfo() {
        return this.nodes.getModifierInfo();
    }

    public final boolean getNeedsOnPositionedDispatch$ui_release() {
        return this.needsOnPositionedDispatch;
    }

    public final NodeChain getNodes$ui_release() {
        return this.nodes;
    }

    public final Function1<Owner, C11921v> getOnAttach$ui_release() {
        return this.onAttach;
    }

    public final Function1<Owner, C11921v> getOnDetach$ui_release() {
        return this.onDetach;
    }

    public final NodeCoordinator getOuterCoordinator$ui_release() {
        return this.nodes.getOuterCoordinator$ui_release();
    }

    public final Owner getOwner$ui_release() {
        return this.owner;
    }

    public final LayoutNode getParent$ui_release() {
        LayoutNode layoutNode = this._foldedParent;
        boolean z = false;
        if (layoutNode != null && layoutNode.isVirtual) {
            z = true;
        }
        if (!z) {
            return layoutNode;
        }
        if (layoutNode != null) {
            return layoutNode.getParent$ui_release();
        }
        return null;
    }

    public LayoutInfo getParentInfo() {
        return getParent$ui_release();
    }

    public final int getPlaceOrder$ui_release() {
        return this.placeOrder;
    }

    public final int getPreviousPlaceOrder$ui_release() {
        return this.previousPlaceOrder;
    }

    public int getSemanticsId() {
        return this.semanticsId;
    }

    public final LayoutNodeSubcompositionsState getSubcompositionsState$ui_release() {
        return this.subcompositionsState;
    }

    public ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    public int getWidth() {
        return this.layoutDelegate.getWidth$ui_release();
    }

    public final MutableVector<LayoutNode> getZSortedChildren() {
        if (this.zSortedChildrenInvalidated) {
            this._zSortedChildren.clear();
            MutableVector<LayoutNode> mutableVector = this._zSortedChildren;
            mutableVector.addAll(mutableVector.getSize(), get_children$ui_release());
            this._zSortedChildren.sortWith(ZComparator);
            this.zSortedChildrenInvalidated = false;
        }
        return this._zSortedChildren;
    }

    public final MutableVector<LayoutNode> get_children$ui_release() {
        updateChildrenIfDirty$ui_release();
        if (this.virtualChildrenCount == 0) {
            return this._foldedChildren.getVector();
        }
        MutableVector<LayoutNode> mutableVector = this._unfoldedChildren;
        C12775o.m28636f(mutableVector);
        return mutableVector;
    }

    /* renamed from: hitTest-M_7yMNQ$ui_release  reason: not valid java name */
    public final void m37501hitTestM_7yMNQ$ui_release(long j, HitTestResult<PointerInputModifierNode> hitTestResult, boolean z, boolean z2) {
        C12775o.m28639i(hitTestResult, "hitTestResult");
        getOuterCoordinator$ui_release().m37602hitTestYqVAtuI(NodeCoordinator.Companion.getPointerInputSource(), getOuterCoordinator$ui_release().m37594fromParentPositionMKHz9U(j), hitTestResult, z, z2);
    }

    /* renamed from: hitTestSemantics-M_7yMNQ$ui_release  reason: not valid java name */
    public final void m37502hitTestSemanticsM_7yMNQ$ui_release(long j, HitTestResult<SemanticsModifierNode> hitTestResult, boolean z, boolean z2) {
        C12775o.m28639i(hitTestResult, "hitSemanticsEntities");
        getOuterCoordinator$ui_release().m37602hitTestYqVAtuI(NodeCoordinator.Companion.getSemanticsSource(), getOuterCoordinator$ui_release().m37594fromParentPositionMKHz9U(j), hitTestResult, true, z2);
    }

    public final void ignoreRemeasureRequests$ui_release(C13074a<C11921v> aVar) {
        C12775o.m28639i(aVar, "block");
        this.ignoreRemeasureRequests = true;
        aVar.invoke();
        this.ignoreRemeasureRequests = false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [androidx.compose.ui.node.NodeCoordinator] */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void insertAt$ui_release(int r7, androidx.compose.p002ui.node.LayoutNode r8) {
        /*
            r6 = this;
            java.lang.String r0 = "instance"
            kotlin.jvm.internal.C12775o.m28639i(r8, r0)
            androidx.compose.ui.node.LayoutNode r0 = r8._foldedParent
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x000d
            r0 = r2
            goto L_0x000e
        L_0x000d:
            r0 = r1
        L_0x000e:
            java.lang.String r3 = " Other tree: "
            java.lang.String r4 = "Cannot insert "
            r5 = 0
            if (r0 != 0) goto L_0x0048
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r8)
            java.lang.String r0 = " because it already has a parent. This tree: "
            r7.append(r0)
            java.lang.String r0 = debugTreeToString$default(r6, r1, r2, r5)
            r7.append(r0)
            r7.append(r3)
            androidx.compose.ui.node.LayoutNode r8 = r8._foldedParent
            if (r8 == 0) goto L_0x0037
            java.lang.String r5 = debugTreeToString$default(r8, r1, r2, r5)
        L_0x0037:
            r7.append(r5)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        L_0x0048:
            androidx.compose.ui.node.Owner r0 = r8.owner
            if (r0 != 0) goto L_0x004e
            r0 = r2
            goto L_0x004f
        L_0x004e:
            r0 = r1
        L_0x004f:
            if (r0 == 0) goto L_0x00d1
            r8._foldedParent = r6
            androidx.compose.ui.node.MutableVectorWithMutationTracking<androidx.compose.ui.node.LayoutNode> r0 = r6._foldedChildren
            r0.add(r7, r8)
            r6.onZSortedChildrenInvalidated$ui_release()
            boolean r7 = r8.isVirtual
            if (r7 == 0) goto L_0x0076
            boolean r7 = r6.isVirtual
            r7 = r7 ^ r2
            if (r7 == 0) goto L_0x006a
            int r7 = r6.virtualChildrenCount
            int r7 = r7 + r2
            r6.virtualChildrenCount = r7
            goto L_0x0076
        L_0x006a:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Virtual LayoutNode can't be added into a virtual parent"
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L_0x0076:
            r6.invalidateUnfoldedVirtualChildren()
            androidx.compose.ui.node.NodeCoordinator r7 = r8.getOuterCoordinator$ui_release()
            boolean r0 = r6.isVirtual
            if (r0 == 0) goto L_0x008a
            androidx.compose.ui.node.LayoutNode r0 = r6._foldedParent
            if (r0 == 0) goto L_0x008e
            androidx.compose.ui.node.NodeCoordinator r5 = r0.getInnerCoordinator$ui_release()
            goto L_0x008e
        L_0x008a:
            androidx.compose.ui.node.NodeCoordinator r5 = r6.getInnerCoordinator$ui_release()
        L_0x008e:
            r7.setWrappedBy$ui_release(r5)
            boolean r7 = r8.isVirtual
            if (r7 == 0) goto L_0x00b7
            androidx.compose.ui.node.MutableVectorWithMutationTracking<androidx.compose.ui.node.LayoutNode> r7 = r8._foldedChildren
            androidx.compose.runtime.collection.MutableVector r7 = r7.getVector()
            int r0 = r7.getSize()
            if (r0 <= 0) goto L_0x00b7
            java.lang.Object[] r7 = r7.getContent()
        L_0x00a5:
            r3 = r7[r1]
            androidx.compose.ui.node.LayoutNode r3 = (androidx.compose.p002ui.node.LayoutNode) r3
            androidx.compose.ui.node.NodeCoordinator r3 = r3.getOuterCoordinator$ui_release()
            androidx.compose.ui.node.NodeCoordinator r4 = r6.getInnerCoordinator$ui_release()
            r3.setWrappedBy$ui_release(r4)
            int r1 = r1 + r2
            if (r1 < r0) goto L_0x00a5
        L_0x00b7:
            androidx.compose.ui.node.Owner r7 = r6.owner
            if (r7 == 0) goto L_0x00be
            r8.attach$ui_release(r7)
        L_0x00be:
            androidx.compose.ui.node.LayoutNodeLayoutDelegate r7 = r8.layoutDelegate
            int r7 = r7.getChildrenAccessingCoordinatesDuringPlacement()
            if (r7 <= 0) goto L_0x00d0
            androidx.compose.ui.node.LayoutNodeLayoutDelegate r7 = r6.layoutDelegate
            int r8 = r7.getChildrenAccessingCoordinatesDuringPlacement()
            int r8 = r8 + r2
            r7.setChildrenAccessingCoordinatesDuringPlacement(r8)
        L_0x00d0:
            return
        L_0x00d1:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r8)
            java.lang.String r0 = " because it already has an owner. This tree: "
            r7.append(r0)
            java.lang.String r0 = debugTreeToString$default(r6, r1, r2, r5)
            r7.append(r0)
            r7.append(r3)
            java.lang.String r8 = debugTreeToString$default(r8, r1, r2, r5)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.node.LayoutNode.insertAt$ui_release(int, androidx.compose.ui.node.LayoutNode):void");
    }

    public final void invalidateLayer$ui_release() {
        NodeCoordinator innerLayerCoordinator = getInnerLayerCoordinator();
        if (innerLayerCoordinator != null) {
            innerLayerCoordinator.invalidateLayer();
            return;
        }
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
    }

    public final void invalidateLayers$ui_release() {
        NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release();
        NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        while (outerCoordinator$ui_release != innerCoordinator$ui_release) {
            C12775o.m28637g(outerCoordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) outerCoordinator$ui_release;
            OwnedLayer layer = layoutModifierNodeCoordinator.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
            outerCoordinator$ui_release = layoutModifierNodeCoordinator.getWrapped$ui_release();
        }
        OwnedLayer layer2 = getInnerCoordinator$ui_release().getLayer();
        if (layer2 != null) {
            layer2.invalidate();
        }
    }

    public final void invalidateMeasurements$ui_release() {
        if (this.mLookaheadScope != null) {
            requestLookaheadRemeasure$ui_release$default(this, false, 1, (Object) null);
        } else {
            requestRemeasure$ui_release$default(this, false, 1, (Object) null);
        }
    }

    public final void invalidateParentData$ui_release() {
        this.layoutDelegate.invalidateParentData();
    }

    public final void invalidateSubtree(boolean z) {
        OwnedLayer layer;
        if (z) {
            LayoutNode parent$ui_release = getParent$ui_release();
            if (parent$ui_release != null) {
                parent$ui_release.invalidateLayer$ui_release();
            }
            LayoutNodeKt.requireOwner(this).onSemanticsChange();
        }
        requestRemeasure$ui_release$default(this, false, 1, (Object) null);
        NodeChain nodeChain = this.nodes;
        int r3 = NodeKind.m37625constructorimpl(2);
        if ((nodeChain.getAggregateChildKindSet() & r3) != 0) {
            for (Modifier.Node head$ui_release = nodeChain.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                if (!((head$ui_release.getKindSet$ui_release() & r3) == 0 || !(head$ui_release instanceof LayoutModifierNode) || (layer = DelegatableNodeKt.m37467requireCoordinator64DMado((LayoutModifierNode) head$ui_release, NodeKind.m37625constructorimpl(2)).getLayer()) == null)) {
                    layer.invalidate();
                }
                if ((head$ui_release.getAggregateChildKindSet$ui_release() & r3) == 0) {
                    break;
                }
            }
        }
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i = 0;
            do {
                ((LayoutNode) content[i]).invalidateSubtree(false);
                i++;
            } while (i < size);
        }
    }

    public boolean isAttached() {
        if (this.owner != null) {
            return true;
        }
        return false;
    }

    public final boolean isLookaheadRoot() {
        return this.isLookaheadRoot;
    }

    public boolean isPlaced() {
        return this.isPlaced;
    }

    public final Boolean isPlacedInLookahead() {
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = getLookaheadPassDelegate();
        if (lookaheadPassDelegate != null) {
            return Boolean.valueOf(lookaheadPassDelegate.isPlaced());
        }
        return null;
    }

    public boolean isValidOwnerScope() {
        return isAttached();
    }

    /* renamed from: lookaheadRemeasure-_Sx5XlM$ui_release  reason: not valid java name */
    public final boolean m37503lookaheadRemeasure_Sx5XlM$ui_release(Constraints constraints) {
        if (constraints == null || this.mLookaheadScope == null) {
            return false;
        }
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = getLookaheadPassDelegate();
        C12775o.m28636f(lookaheadPassDelegate);
        return lookaheadPassDelegate.m37552remeasureBRTryo0(constraints.m38418unboximpl());
    }

    public final void lookaheadReplace$ui_release() {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = getLookaheadPassDelegate();
        C12775o.m28636f(lookaheadPassDelegate);
        lookaheadPassDelegate.replace();
    }

    public final void markLayoutPending$ui_release() {
        this.layoutDelegate.markLayoutPending$ui_release();
    }

    public final void markLookaheadLayoutPending$ui_release() {
        this.layoutDelegate.markLookaheadLayoutPending$ui_release();
    }

    public final void markLookaheadMeasurePending$ui_release() {
        this.layoutDelegate.markLookaheadMeasurePending$ui_release();
    }

    public final void markMeasurePending$ui_release() {
        this.layoutDelegate.markMeasurePending$ui_release();
    }

    public final void move$ui_release(int i, int i2, int i3) {
        int i4;
        int i5;
        if (i != i2) {
            for (int i6 = 0; i6 < i3; i6++) {
                if (i > i2) {
                    i4 = i + i6;
                } else {
                    i4 = i;
                }
                if (i > i2) {
                    i5 = i2 + i6;
                } else {
                    i5 = (i2 + i3) - 2;
                }
                this._foldedChildren.add(i5, this._foldedChildren.removeAt(i4));
            }
            onZSortedChildrenInvalidated$ui_release();
            invalidateUnfoldedVirtualChildren();
            invalidateMeasurements$ui_release();
        }
    }

    public void onDeactivate() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            androidViewHolder.onDeactivate();
        }
        this.deactivated = true;
        resetModifierState();
    }

    public void onLayoutComplete() {
        NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        int r1 = NodeKind.m37625constructorimpl(128);
        boolean r2 = NodeKindKt.m37633getIncludeSelfInTraversalH91voCI(r1);
        Modifier.Node tail = innerCoordinator$ui_release.getTail();
        if (r2 || (tail = tail.getParent$ui_release()) != null) {
            Modifier.Node access$headNode = innerCoordinator$ui_release.headNode(r2);
            while (access$headNode != null && (access$headNode.getAggregateChildKindSet$ui_release() & r1) != 0) {
                if ((access$headNode.getKindSet$ui_release() & r1) != 0 && (access$headNode instanceof LayoutAwareModifierNode)) {
                    ((LayoutAwareModifierNode) access$headNode).onPlaced(getInnerCoordinator$ui_release());
                }
                if (access$headNode != tail) {
                    access$headNode = access$headNode.getChild$ui_release();
                } else {
                    return;
                }
            }
        }
    }

    public final void onNodePlaced$ui_release() {
        boolean z;
        LayoutNode parent$ui_release = getParent$ui_release();
        float zIndex2 = getInnerCoordinator$ui_release().getZIndex();
        NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release();
        NodeCoordinator innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        while (outerCoordinator$ui_release != innerCoordinator$ui_release) {
            C12775o.m28637g(outerCoordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) outerCoordinator$ui_release;
            zIndex2 += layoutModifierNodeCoordinator.getZIndex();
            outerCoordinator$ui_release = layoutModifierNodeCoordinator.getWrapped$ui_release();
        }
        boolean z2 = false;
        if (zIndex2 == this.zIndex) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.zIndex = zIndex2;
            if (parent$ui_release != null) {
                parent$ui_release.onZSortedChildrenInvalidated$ui_release();
            }
            if (parent$ui_release != null) {
                parent$ui_release.invalidateLayer$ui_release();
            }
        }
        if (!isPlaced()) {
            if (parent$ui_release != null) {
                parent$ui_release.invalidateLayer$ui_release();
            }
            markNodeAndSubtreeAsPlaced();
        }
        if (parent$ui_release == null) {
            this.placeOrder = 0;
        } else if (!this.relayoutWithoutParentInProgress && parent$ui_release.getLayoutState$ui_release() == LayoutState.LayingOut) {
            if (this.placeOrder == Integer.MAX_VALUE) {
                z2 = true;
            }
            if (z2) {
                int i = parent$ui_release.nextChildPlaceOrder;
                this.placeOrder = i;
                parent$ui_release.nextChildPlaceOrder = i + 1;
            } else {
                throw new IllegalStateException("Place was called on a node which was placed already".toString());
            }
        }
        this.layoutDelegate.getAlignmentLinesOwner$ui_release().layoutChildren();
    }

    public void onRelease() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            androidViewHolder.onRelease();
        }
        NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release();
        NodeCoordinator wrapped$ui_release = getInnerCoordinator$ui_release().getWrapped$ui_release();
        while (!C12775o.m28634d(outerCoordinator$ui_release, wrapped$ui_release) && outerCoordinator$ui_release != null) {
            outerCoordinator$ui_release.onRelease();
            outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release();
        }
    }

    public void onReuse() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            androidViewHolder.onReuse();
        }
        if (this.deactivated) {
            this.deactivated = false;
        } else {
            resetModifierState();
        }
        this.nodes.attach();
    }

    public final void onZSortedChildrenInvalidated$ui_release() {
        if (this.isVirtual) {
            LayoutNode parent$ui_release = getParent$ui_release();
            if (parent$ui_release != null) {
                parent$ui_release.onZSortedChildrenInvalidated$ui_release();
                return;
            }
            return;
        }
        this.zSortedChildrenInvalidated = true;
    }

    public final void place$ui_release(int i, int i2) {
        NodeCoordinator nodeCoordinator;
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate = getMeasurePassDelegate();
        Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.Companion;
        int measuredWidth = measurePassDelegate.getMeasuredWidth();
        LayoutDirection layoutDirection2 = getLayoutDirection();
        LayoutNode parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            nodeCoordinator = parent$ui_release.getInnerCoordinator$ui_release();
        } else {
            nodeCoordinator = null;
        }
        NodeCoordinator nodeCoordinator2 = nodeCoordinator;
        LayoutCoordinates access$get_coordinates$cp = Placeable.PlacementScope._coordinates;
        int access$getParentWidth = companion.getParentWidth();
        LayoutDirection access$getParentLayoutDirection = companion.getParentLayoutDirection();
        LayoutNodeLayoutDelegate access$getLayoutDelegate$cp = Placeable.PlacementScope.layoutDelegate;
        Placeable.PlacementScope.parentWidth = measuredWidth;
        Placeable.PlacementScope.parentLayoutDirection = layoutDirection2;
        boolean access$configureForPlacingForAlignment = companion.configureForPlacingForAlignment(nodeCoordinator2);
        Placeable.PlacementScope.placeRelative$default(companion, measurePassDelegate, i, i2, 0.0f, 4, (Object) null);
        if (nodeCoordinator2 != null) {
            nodeCoordinator2.setPlacingForAlignment$ui_release(access$configureForPlacingForAlignment);
        }
        Placeable.PlacementScope.parentWidth = access$getParentWidth;
        Placeable.PlacementScope.parentLayoutDirection = access$getParentLayoutDirection;
        Placeable.PlacementScope._coordinates = access$get_coordinates$cp;
        Placeable.PlacementScope.layoutDelegate = access$getLayoutDelegate$cp;
    }

    /* renamed from: remeasure-_Sx5XlM$ui_release  reason: not valid java name */
    public final boolean m37504remeasure_Sx5XlM$ui_release(Constraints constraints) {
        if (constraints == null) {
            return false;
        }
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreeIntrinsicsUsage$ui_release();
        }
        return getMeasurePassDelegate().m37557remeasureBRTryo0(constraints.m38418unboximpl());
    }

    public final void removeAll$ui_release() {
        int size = this._foldedChildren.getSize();
        while (true) {
            size--;
            if (-1 < size) {
                onChildRemoved(this._foldedChildren.get(size));
            } else {
                this._foldedChildren.clear();
                return;
            }
        }
    }

    public final void removeAt$ui_release(int i, int i2) {
        boolean z;
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i3 = (i2 + i) - 1;
            if (i <= i3) {
                while (true) {
                    onChildRemoved(this._foldedChildren.removeAt(i3));
                    if (i3 != i) {
                        i3--;
                    } else {
                        return;
                    }
                }
            }
        } else {
            throw new IllegalArgumentException(("count (" + i2 + ") must be greater than 0").toString());
        }
    }

    /* JADX INFO: finally extract failed */
    public final void replace$ui_release() {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        try {
            this.relayoutWithoutParentInProgress = true;
            getMeasurePassDelegate().replace();
            this.relayoutWithoutParentInProgress = false;
        } catch (Throwable th) {
            this.relayoutWithoutParentInProgress = false;
            throw th;
        }
    }

    public final void requestLookaheadRelayout$ui_release(boolean z) {
        Owner owner2;
        if (!this.isVirtual && (owner2 = this.owner) != null) {
            owner2.onRequestRelayout(this, true, z);
        }
    }

    public final void requestLookaheadRemeasure$ui_release(boolean z) {
        boolean z2;
        if (this.mLookaheadScope != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            Owner owner2 = this.owner;
            if (owner2 != null && !this.ignoreRemeasureRequests && !this.isVirtual) {
                owner2.onRequestMeasure(this, true, z);
                LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = getLookaheadPassDelegate();
                C12775o.m28636f(lookaheadPassDelegate);
                lookaheadPassDelegate.invalidateIntrinsicsParent(z);
                return;
            }
            return;
        }
        throw new IllegalStateException("Lookahead measure cannot be requested on a node that is not a part of theLookaheadLayout".toString());
    }

    public final void requestRelayout$ui_release(boolean z) {
        Owner owner2;
        if (!this.isVirtual && (owner2 = this.owner) != null) {
            Owner.onRequestRelayout$default(owner2, this, false, z, 2, (Object) null);
        }
    }

    public final void requestRemeasure$ui_release(boolean z) {
        Owner owner2;
        if (!this.ignoreRemeasureRequests && !this.isVirtual && (owner2 = this.owner) != null) {
            Owner.onRequestMeasure$default(owner2, this, false, z, 2, (Object) null);
            getMeasurePassDelegate().invalidateIntrinsicsParent(z);
        }
    }

    public final void rescheduleRemeasureOrRelayout$ui_release(LayoutNode layoutNode) {
        C12775o.m28639i(layoutNode, "it");
        if (WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + layoutNode.getLayoutState$ui_release());
        } else if (layoutNode.getMeasurePending$ui_release()) {
            layoutNode.requestRemeasure$ui_release(true);
        } else if (layoutNode.getLayoutPending$ui_release()) {
            layoutNode.requestRelayout$ui_release(true);
        } else if (layoutNode.getLookaheadMeasurePending$ui_release()) {
            layoutNode.requestLookaheadRemeasure$ui_release(true);
        } else if (layoutNode.getLookaheadLayoutPending$ui_release()) {
            layoutNode.requestLookaheadRelayout$ui_release(true);
        }
    }

    public final void resetSubtreeIntrinsicsUsage$ui_release() {
        MutableVector<LayoutNode> mutableVector = get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i = 0;
            do {
                LayoutNode layoutNode = (LayoutNode) content[i];
                UsageByParent usageByParent = layoutNode.previousIntrinsicsUsageByParent;
                layoutNode.intrinsicsUsageByParent = usageByParent;
                if (usageByParent != UsageByParent.NotUsed) {
                    layoutNode.resetSubtreeIntrinsicsUsage$ui_release();
                }
                i++;
            } while (i < size);
        }
    }

    public final void setCanMultiMeasure$ui_release(boolean z) {
        this.canMultiMeasure = z;
    }

    public void setDensity(Density density2) {
        C12775o.m28639i(density2, "value");
        if (!C12775o.m28634d(this.density, density2)) {
            this.density = density2;
            onDensityOrLayoutDirectionChanged();
        }
    }

    public final void setDepth$ui_release(int i) {
        this.depth = i;
    }

    public final void setInnerLayerCoordinatorIsDirty$ui_release(boolean z) {
        this.innerLayerCoordinatorIsDirty = z;
    }

    public final void setInteropViewFactoryHolder$ui_release(AndroidViewHolder androidViewHolder) {
        this.interopViewFactoryHolder = androidViewHolder;
    }

    public final void setIntrinsicsUsageByParent$ui_release(UsageByParent usageByParent) {
        C12775o.m28639i(usageByParent, "<set-?>");
        this.intrinsicsUsageByParent = usageByParent;
    }

    public void setLayoutDirection(LayoutDirection layoutDirection2) {
        C12775o.m28639i(layoutDirection2, "value");
        if (this.layoutDirection != layoutDirection2) {
            this.layoutDirection = layoutDirection2;
            onDensityOrLayoutDirectionChanged();
        }
    }

    public final void setLookaheadRoot(boolean z) {
        if (z != this.isLookaheadRoot) {
            if (!z) {
                setMLookaheadScope((LookaheadScope) null);
            } else {
                setMLookaheadScope(new LookaheadScope(this));
            }
            this.isLookaheadRoot = z;
        }
    }

    public void setMeasurePolicy(MeasurePolicy measurePolicy2) {
        C12775o.m28639i(measurePolicy2, "value");
        if (!C12775o.m28634d(this.measurePolicy, measurePolicy2)) {
            this.measurePolicy = measurePolicy2;
            this.intrinsicsPolicy.updateFrom(getMeasurePolicy());
            invalidateMeasurements$ui_release();
        }
    }

    public final void setMeasuredByParent$ui_release(UsageByParent usageByParent) {
        C12775o.m28639i(usageByParent, "<set-?>");
        this.measuredByParent = usageByParent;
    }

    public final void setMeasuredByParentInLookahead$ui_release(UsageByParent usageByParent) {
        C12775o.m28639i(usageByParent, "<set-?>");
        this.measuredByParentInLookahead = usageByParent;
    }

    public void setModifier(Modifier modifier2) {
        boolean z;
        C12775o.m28639i(modifier2, "value");
        if (!this.isVirtual || getModifier() == Modifier.Companion) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.modifier = modifier2;
            this.nodes.updateFrom$ui_release(modifier2);
            NodeCoordinator outerCoordinator$ui_release = getOuterCoordinator$ui_release();
            NodeCoordinator wrapped$ui_release = getInnerCoordinator$ui_release().getWrapped$ui_release();
            while (!C12775o.m28634d(outerCoordinator$ui_release, wrapped$ui_release) && outerCoordinator$ui_release != null) {
                outerCoordinator$ui_release.updateLookaheadScope$ui_release(this.mLookaheadScope);
                outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release();
            }
            this.layoutDelegate.updateParentData();
            return;
        }
        throw new IllegalArgumentException("Modifiers are not supported on virtual LayoutNodes".toString());
    }

    public final void setNeedsOnPositionedDispatch$ui_release(boolean z) {
        this.needsOnPositionedDispatch = z;
    }

    public final void setOnAttach$ui_release(Function1<? super Owner, C11921v> function1) {
        this.onAttach = function1;
    }

    public final void setOnDetach$ui_release(Function1<? super Owner, C11921v> function1) {
        this.onDetach = function1;
    }

    public final void setSubcompositionsState$ui_release(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState) {
        this.subcompositionsState = layoutNodeSubcompositionsState;
    }

    public void setViewConfiguration(ViewConfiguration viewConfiguration2) {
        C12775o.m28639i(viewConfiguration2, "<set-?>");
        this.viewConfiguration = viewConfiguration2;
    }

    public String toString() {
        return JvmActuals_jvmKt.simpleIdentityToString(this, (String) null) + " children: " + getChildren$ui_release().size() + " measurePolicy: " + getMeasurePolicy();
    }

    public final void updateChildrenIfDirty$ui_release() {
        if (this.virtualChildrenCount > 0) {
            recreateUnfoldedChildrenIfDirty();
        }
    }

    public LayoutNode(boolean z, int i) {
        this.isVirtual = z;
        this.semanticsId = i;
        this._foldedChildren = new MutableVectorWithMutationTracking<>(new MutableVector(new LayoutNode[16], 0), new LayoutNode$_foldedChildren$1(this));
        this._zSortedChildren = new MutableVector<>(new LayoutNode[16], 0);
        this.zSortedChildrenInvalidated = true;
        this.measurePolicy = ErrorMeasurePolicy;
        this.intrinsicsPolicy = new IntrinsicsPolicy(this);
        this.density = DensityKt.Density$default(1.0f, 0.0f, 2, (Object) null);
        this.layoutDirection = LayoutDirection.Ltr;
        this.viewConfiguration = DummyViewConfiguration;
        this.placeOrder = Integer.MAX_VALUE;
        this.previousPlaceOrder = Integer.MAX_VALUE;
        UsageByParent usageByParent = UsageByParent.NotUsed;
        this.measuredByParent = usageByParent;
        this.measuredByParentInLookahead = usageByParent;
        this.intrinsicsUsageByParent = usageByParent;
        this.previousIntrinsicsUsageByParent = usageByParent;
        this.nodes = new NodeChain(this);
        this.layoutDelegate = new LayoutNodeLayoutDelegate(this);
        this.innerLayerCoordinatorIsDirty = true;
        this.modifier = Modifier.Companion;
    }

    public static /* synthetic */ void getCanMultiMeasure$ui_release$annotations() {
    }

    public static /* synthetic */ void getZSortedChildren$annotations() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LayoutNode(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? SemanticsModifierCore.Companion.generateSemanticsId() : i);
    }
}
