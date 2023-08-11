package androidx.compose.p002ui.semantics;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.layout.AlignmentLine;
import androidx.compose.p002ui.layout.LayoutCoordinatesKt;
import androidx.compose.p002ui.layout.LayoutInfo;
import androidx.compose.p002ui.node.DelegatableNodeKt;
import androidx.compose.p002ui.node.LayoutNode;
import androidx.compose.p002ui.node.NodeCoordinator;
import androidx.compose.p002ui.node.NodeKind;
import androidx.compose.p002ui.node.Owner;
import androidx.compose.p002ui.node.RootForTest;
import androidx.compose.p002ui.node.SemanticsModifierNode;
import androidx.compose.p002ui.node.SemanticsModifierNodeKt;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nSemanticsNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,436:1\n1#2:437\n33#3,6:438\n33#3,6:444\n33#3,6:450\n73#4:456\n*S KotlinDebug\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNode\n*L\n188#1:438,6\n211#1:444,6\n309#1:450,6\n331#1:456\n*E\n"})
/* renamed from: androidx.compose.ui.semantics.SemanticsNode */
/* compiled from: SemanticsNode.kt */
public final class SemanticsNode {
    public static final int $stable = 8;
    private SemanticsNode fakeNodeParent;

    /* renamed from: id */
    private final int f378id;
    private boolean isFake;
    private final LayoutNode layoutNode;
    private final boolean mergingEnabled;
    private final SemanticsModifierNode outerSemanticsNode;
    private final SemanticsConfiguration unmergedConfig;

    public SemanticsNode(SemanticsModifierNode semanticsModifierNode, boolean z, LayoutNode layoutNode2) {
        C12775o.m28639i(semanticsModifierNode, "outerSemanticsNode");
        C12775o.m28639i(layoutNode2, "layoutNode");
        this.outerSemanticsNode = semanticsModifierNode;
        this.mergingEnabled = z;
        this.layoutNode = layoutNode2;
        this.unmergedConfig = SemanticsModifierNodeKt.collapsedSemanticsConfiguration(semanticsModifierNode);
        this.f378id = layoutNode2.getSemanticsId();
    }

    private final void emitFakeNodes(List<SemanticsNode> list) {
        String str;
        Role access$getRole = SemanticsNodeKt.getRole(this);
        if (access$getRole != null && this.unmergedConfig.isMergingSemanticsOfDescendants() && (!list.isEmpty())) {
            list.add(m37821fakeSemanticsNodeypyhhiA(access$getRole, new SemanticsNode$emitFakeNodes$fakeNode$1(access$getRole)));
        }
        SemanticsConfiguration semanticsConfiguration = this.unmergedConfig;
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (semanticsConfiguration.contains(semanticsProperties.getContentDescription()) && (!list.isEmpty()) && this.unmergedConfig.isMergingSemanticsOfDescendants()) {
            List list2 = (List) SemanticsConfigurationKt.getOrNull(this.unmergedConfig, semanticsProperties.getContentDescription());
            if (list2 != null) {
                str = (String) C12686e0.m28223b0(list2);
            } else {
                str = null;
            }
            if (str != null) {
                list.add(0, m37821fakeSemanticsNodeypyhhiA((Role) null, new SemanticsNode$emitFakeNodes$fakeNode$2(str)));
            }
        }
    }

    /* renamed from: fakeSemanticsNode-ypyhhiA  reason: not valid java name */
    private final SemanticsNode m37821fakeSemanticsNodeypyhhiA(Role role, Function1<? super SemanticsPropertyReceiver, C11921v> function1) {
        int i;
        SemanticsNode$fakeSemanticsNode$fakeNode$1 semanticsNode$fakeSemanticsNode$fakeNode$1 = new SemanticsNode$fakeSemanticsNode$fakeNode$1(function1);
        if (role != null) {
            i = SemanticsNodeKt.roleFakeNodeId(this);
        } else {
            i = SemanticsNodeKt.contentDescriptionFakeNodeId(this);
        }
        SemanticsNode semanticsNode = new SemanticsNode(semanticsNode$fakeSemanticsNode$fakeNode$1, false, new LayoutNode(true, i));
        semanticsNode.isFake = true;
        semanticsNode.fakeNodeParent = this;
        return semanticsNode;
    }

    private final List<SemanticsNode> findOneLayerOfMergingSemanticsNodes(List<SemanticsNode> list) {
        List unmergedChildren$ui_release$default = unmergedChildren$ui_release$default(this, false, 1, (Object) null);
        int size = unmergedChildren$ui_release$default.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode = (SemanticsNode) unmergedChildren$ui_release$default.get(i);
            if (semanticsNode.isMergingSemanticsOfDescendants()) {
                list.add(semanticsNode);
            } else if (!semanticsNode.unmergedConfig.isClearingSemantics()) {
                semanticsNode.findOneLayerOfMergingSemanticsNodes(list);
            }
        }
        return list;
    }

    static /* synthetic */ List findOneLayerOfMergingSemanticsNodes$default(SemanticsNode semanticsNode, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        return semanticsNode.findOneLayerOfMergingSemanticsNodes(list);
    }

    private final boolean isMergingSemanticsOfDescendants() {
        if (!this.mergingEnabled || !this.unmergedConfig.isMergingSemanticsOfDescendants()) {
            return false;
        }
        return true;
    }

    private final void mergeConfig(SemanticsConfiguration semanticsConfiguration) {
        if (!this.unmergedConfig.isClearingSemantics()) {
            List unmergedChildren$ui_release$default = unmergedChildren$ui_release$default(this, false, 1, (Object) null);
            int size = unmergedChildren$ui_release$default.size();
            for (int i = 0; i < size; i++) {
                SemanticsNode semanticsNode = (SemanticsNode) unmergedChildren$ui_release$default.get(i);
                if (!semanticsNode.isMergingSemanticsOfDescendants()) {
                    semanticsConfiguration.mergeChild$ui_release(semanticsNode.unmergedConfig);
                    semanticsNode.mergeConfig(semanticsConfiguration);
                }
            }
        }
    }

    public static /* synthetic */ List unmergedChildren$ui_release$default(SemanticsNode semanticsNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return semanticsNode.unmergedChildren$ui_release(z);
    }

    public final NodeCoordinator findCoordinatorToGetBounds$ui_release() {
        SemanticsModifierNode semanticsModifierNode = null;
        if (this.isFake) {
            SemanticsNode parent = getParent();
            if (parent != null) {
                return parent.findCoordinatorToGetBounds$ui_release();
            }
            return null;
        }
        SemanticsModifierNode outerMergingSemantics = SemanticsNodeKt.getOuterMergingSemantics(this.layoutNode);
        if (this.unmergedConfig.isMergingSemanticsOfDescendants()) {
            semanticsModifierNode = outerMergingSemantics;
        }
        if (semanticsModifierNode == null) {
            semanticsModifierNode = this.outerSemanticsNode;
        }
        return DelegatableNodeKt.m37467requireCoordinator64DMado(semanticsModifierNode, NodeKind.m37625constructorimpl(8));
    }

    public final int getAlignmentLinePosition(AlignmentLine alignmentLine) {
        C12775o.m28639i(alignmentLine, "alignmentLine");
        NodeCoordinator findCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (findCoordinatorToGetBounds$ui_release != null) {
            return findCoordinatorToGetBounds$ui_release.get(alignmentLine);
        }
        return Integer.MIN_VALUE;
    }

    public final Rect getBoundsInRoot() {
        Rect boundsInRoot;
        NodeCoordinator findCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (findCoordinatorToGetBounds$ui_release != null) {
            if (!findCoordinatorToGetBounds$ui_release.isAttached()) {
                findCoordinatorToGetBounds$ui_release = null;
            }
            if (!(findCoordinatorToGetBounds$ui_release == null || (boundsInRoot = LayoutCoordinatesKt.boundsInRoot(findCoordinatorToGetBounds$ui_release)) == null)) {
                return boundsInRoot;
            }
        }
        return Rect.Companion.getZero();
    }

    public final Rect getBoundsInWindow() {
        Rect boundsInWindow;
        NodeCoordinator findCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (findCoordinatorToGetBounds$ui_release != null) {
            if (!findCoordinatorToGetBounds$ui_release.isAttached()) {
                findCoordinatorToGetBounds$ui_release = null;
            }
            if (!(findCoordinatorToGetBounds$ui_release == null || (boundsInWindow = LayoutCoordinatesKt.boundsInWindow(findCoordinatorToGetBounds$ui_release)) == null)) {
                return boundsInWindow;
            }
        }
        return Rect.Companion.getZero();
    }

    public final List<SemanticsNode> getChildren() {
        return getChildren(!this.mergingEnabled, false);
    }

    public final SemanticsConfiguration getConfig() {
        if (!isMergingSemanticsOfDescendants()) {
            return this.unmergedConfig;
        }
        SemanticsConfiguration copy = this.unmergedConfig.copy();
        mergeConfig(copy);
        return copy;
    }

    public final int getId() {
        return this.f378id;
    }

    public final LayoutInfo getLayoutInfo() {
        return this.layoutNode;
    }

    public final LayoutNode getLayoutNode$ui_release() {
        return this.layoutNode;
    }

    public final boolean getMergingEnabled() {
        return this.mergingEnabled;
    }

    public final SemanticsModifierNode getOuterSemanticsNode$ui_release() {
        return this.outerSemanticsNode;
    }

    public final SemanticsNode getParent() {
        LayoutNode layoutNode2;
        SemanticsModifierNode semanticsModifierNode;
        SemanticsNode semanticsNode = this.fakeNodeParent;
        if (semanticsNode != null) {
            return semanticsNode;
        }
        if (this.mergingEnabled) {
            layoutNode2 = SemanticsNodeKt.findClosestParentNode(this.layoutNode, SemanticsNode$parent$1.INSTANCE);
        } else {
            layoutNode2 = null;
        }
        if (layoutNode2 == null) {
            layoutNode2 = SemanticsNodeKt.findClosestParentNode(this.layoutNode, SemanticsNode$parent$2.INSTANCE);
        }
        if (layoutNode2 != null) {
            semanticsModifierNode = SemanticsNodeKt.getOuterSemantics(layoutNode2);
        } else {
            semanticsModifierNode = null;
        }
        if (semanticsModifierNode == null) {
            return null;
        }
        return new SemanticsNode(semanticsModifierNode, this.mergingEnabled, (LayoutNode) null, 4, (DefaultConstructorMarker) null);
    }

    /* renamed from: getPositionInRoot-F1C5BW0  reason: not valid java name */
    public final long m37822getPositionInRootF1C5BW0() {
        NodeCoordinator findCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (findCoordinatorToGetBounds$ui_release != null) {
            if (!findCoordinatorToGetBounds$ui_release.isAttached()) {
                findCoordinatorToGetBounds$ui_release = null;
            }
            if (findCoordinatorToGetBounds$ui_release != null) {
                return LayoutCoordinatesKt.positionInRoot(findCoordinatorToGetBounds$ui_release);
            }
        }
        return Offset.Companion.m35438getZeroF1C5BW0();
    }

    /* renamed from: getPositionInWindow-F1C5BW0  reason: not valid java name */
    public final long m37823getPositionInWindowF1C5BW0() {
        NodeCoordinator findCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (findCoordinatorToGetBounds$ui_release != null) {
            if (!findCoordinatorToGetBounds$ui_release.isAttached()) {
                findCoordinatorToGetBounds$ui_release = null;
            }
            if (findCoordinatorToGetBounds$ui_release != null) {
                return LayoutCoordinatesKt.positionInWindow(findCoordinatorToGetBounds$ui_release);
            }
        }
        return Offset.Companion.m35438getZeroF1C5BW0();
    }

    public final List<SemanticsNode> getReplacedChildren$ui_release() {
        return getChildren(false, true);
    }

    public final RootForTest getRoot() {
        Owner owner$ui_release = this.layoutNode.getOwner$ui_release();
        if (owner$ui_release != null) {
            return owner$ui_release.getRootForTest();
        }
        return null;
    }

    /* renamed from: getSize-YbymL2g  reason: not valid java name */
    public final long m37824getSizeYbymL2g() {
        NodeCoordinator findCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (findCoordinatorToGetBounds$ui_release != null) {
            return findCoordinatorToGetBounds$ui_release.m37598getSizeYbymL2g();
        }
        return IntSize.Companion.m38633getZeroYbymL2g();
    }

    public final Rect getTouchBoundsInRoot() {
        SemanticsModifierNode semanticsModifierNode;
        if (this.unmergedConfig.isMergingSemanticsOfDescendants()) {
            semanticsModifierNode = SemanticsNodeKt.getOuterMergingSemantics(this.layoutNode);
            if (semanticsModifierNode == null) {
                semanticsModifierNode = this.outerSemanticsNode;
            }
        } else {
            semanticsModifierNode = this.outerSemanticsNode;
        }
        return SemanticsModifierNodeKt.touchBoundsInRoot(semanticsModifierNode);
    }

    public final SemanticsConfiguration getUnmergedConfig$ui_release() {
        return this.unmergedConfig;
    }

    public final boolean isFake$ui_release() {
        return this.isFake;
    }

    public final boolean isRoot() {
        if (getParent() == null) {
            return true;
        }
        return false;
    }

    public final boolean isTransparent$ui_release() {
        NodeCoordinator findCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (findCoordinatorToGetBounds$ui_release != null) {
            return findCoordinatorToGetBounds$ui_release.isTransparent();
        }
        return false;
    }

    public final void setFake$ui_release(boolean z) {
        this.isFake = z;
    }

    public final List<SemanticsNode> unmergedChildren$ui_release(boolean z) {
        if (this.isFake) {
            return C12726w.m28524k();
        }
        ArrayList arrayList = new ArrayList();
        List findOneLayerOfSemanticsWrappers$default = SemanticsNodeKt.findOneLayerOfSemanticsWrappers$default(this.layoutNode, (List) null, 1, (Object) null);
        int size = findOneLayerOfSemanticsWrappers$default.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new SemanticsNode((SemanticsModifierNode) findOneLayerOfSemanticsWrappers$default.get(i), this.mergingEnabled, (LayoutNode) null, 4, (DefaultConstructorMarker) null));
        }
        if (z) {
            emitFakeNodes(arrayList);
        }
        return arrayList;
    }

    private final List<SemanticsNode> getChildren(boolean z, boolean z2) {
        if (!z && this.unmergedConfig.isClearingSemantics()) {
            return C12726w.m28524k();
        }
        if (isMergingSemanticsOfDescendants()) {
            return findOneLayerOfMergingSemanticsNodes$default(this, (List) null, 1, (Object) null);
        }
        return unmergedChildren$ui_release(z2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SemanticsNode(SemanticsModifierNode semanticsModifierNode, boolean z, LayoutNode layoutNode2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(semanticsModifierNode, z, (i & 4) != 0 ? DelegatableNodeKt.requireLayoutNode(semanticsModifierNode) : layoutNode2);
    }
}
