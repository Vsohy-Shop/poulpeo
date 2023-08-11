package androidx.compose.p002ui.node;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.draw.BuildDrawCacheParams;
import androidx.compose.p002ui.draw.DrawCacheModifier;
import androidx.compose.p002ui.draw.DrawModifier;
import androidx.compose.p002ui.focus.FocusEventModifier;
import androidx.compose.p002ui.focus.FocusEventModifierNode;
import androidx.compose.p002ui.focus.FocusOrderModifier;
import androidx.compose.p002ui.focus.FocusProperties;
import androidx.compose.p002ui.focus.FocusPropertiesModifierNode;
import androidx.compose.p002ui.focus.FocusRequesterModifier;
import androidx.compose.p002ui.focus.FocusRequesterModifierNode;
import androidx.compose.p002ui.focus.FocusState;
import androidx.compose.p002ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p002ui.input.pointer.PointerEvent;
import androidx.compose.p002ui.input.pointer.PointerEventPass;
import androidx.compose.p002ui.input.pointer.PointerInputModifier;
import androidx.compose.p002ui.layout.IntermediateLayoutModifier;
import androidx.compose.p002ui.layout.IntrinsicMeasurable;
import androidx.compose.p002ui.layout.IntrinsicMeasureScope;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.p002ui.layout.LayoutModifier;
import androidx.compose.p002ui.layout.LookaheadLayoutCoordinates;
import androidx.compose.p002ui.layout.LookaheadOnPlacedModifier;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.OnGloballyPositionedModifier;
import androidx.compose.p002ui.layout.OnPlacedModifier;
import androidx.compose.p002ui.layout.OnRemeasuredModifier;
import androidx.compose.p002ui.layout.ParentDataModifier;
import androidx.compose.p002ui.layout.RemeasurementModifier;
import androidx.compose.p002ui.modifier.BackwardsCompatLocalMap;
import androidx.compose.p002ui.modifier.ModifierLocal;
import androidx.compose.p002ui.modifier.ModifierLocalConsumer;
import androidx.compose.p002ui.modifier.ModifierLocalMap;
import androidx.compose.p002ui.modifier.ModifierLocalNode;
import androidx.compose.p002ui.modifier.ModifierLocalNodeKt;
import androidx.compose.p002ui.modifier.ModifierLocalProvider;
import androidx.compose.p002ui.modifier.ModifierLocalReadScope;
import androidx.compose.p002ui.semantics.SemanticsConfiguration;
import androidx.compose.p002ui.semantics.SemanticsModifier;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.IntSizeKt;
import androidx.compose.p002ui.unit.LayoutDirection;
import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import java.util.HashSet;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nBackwardsCompatNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackwardsCompatNode.kt\nandroidx/compose/ui/node/BackwardsCompatNode\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n1#1,471:1\n77#2:472\n73#2:474\n77#2:478\n71#2:480\n69#2:482\n81#2:484\n83#2:486\n75#2:490\n73#2:492\n81#2:494\n77#2:495\n196#3:473\n196#3:475\n196#3:479\n196#3:481\n196#3:483\n196#3:485\n196#3:487\n196#3:491\n196#3:493\n735#4,2:476\n728#4,2:488\n314#5:496\n78#5,17:497\n*S KotlinDebug\n*F\n+ 1 BackwardsCompatNode.kt\nandroidx/compose/ui/node/BackwardsCompatNode\n*L\n120#1:472\n130#1:474\n141#1:478\n152#1:480\n160#1:482\n176#1:484\n201#1:486\n214#1:490\n219#1:492\n229#1:494\n265#1:495\n120#1:473\n130#1:475\n141#1:479\n152#1:481\n160#1:483\n176#1:485\n201#1:487\n214#1:491\n219#1:493\n134#1:476,2\n212#1:488,2\n265#1:496\n265#1:497,17\n*E\n"})
/* renamed from: androidx.compose.ui.node.BackwardsCompatNode */
/* compiled from: BackwardsCompatNode.kt */
public final class BackwardsCompatNode extends Modifier.Node implements LayoutModifierNode, IntermediateLayoutModifierNode, DrawModifierNode, SemanticsModifierNode, PointerInputModifierNode, ModifierLocalNode, ModifierLocalReadScope, ParentDataModifierNode, LayoutAwareModifierNode, GlobalPositionAwareModifierNode, FocusEventModifierNode, FocusPropertiesModifierNode, FocusRequesterModifierNode, OwnerScope, BuildDrawCacheParams {
    private BackwardsCompatLocalMap _providedValues;
    private Modifier.Element element;
    private boolean invalidateCache = true;
    /* access modifiers changed from: private */
    public LayoutCoordinates lastOnPlacedCoordinates;
    private HashSet<ModifierLocal<?>> readValues = new HashSet<>();

    public BackwardsCompatNode(Modifier.Element element2) {
        C12775o.m28639i(element2, CloudMethodReturns.RETURN_KEYNAME_ELEMENT);
        setKindSet$ui_release(NodeKindKt.calculateNodeKindSetFrom(element2));
        this.element = element2;
    }

    private final void initializeModifier(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        if (isAttached()) {
            Modifier.Element element2 = this.element;
            boolean z8 = false;
            if ((NodeKind.m37625constructorimpl(32) & getKindSet$ui_release()) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (element2 instanceof ModifierLocalProvider) {
                    updateModifierLocalProvider((ModifierLocalProvider) element2);
                }
                if (element2 instanceof ModifierLocalConsumer) {
                    if (z) {
                        updateModifierLocalConsumer();
                    } else {
                        sideEffect(new BackwardsCompatNode$initializeModifier$1(this));
                    }
                }
            }
            if ((NodeKind.m37625constructorimpl(4) & getKindSet$ui_release()) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                if (element2 instanceof DrawCacheModifier) {
                    this.invalidateCache = true;
                }
                if (!z) {
                    LayoutModifierNodeKt.invalidateLayer(this);
                }
            }
            if ((NodeKind.m37625constructorimpl(2) & getKindSet$ui_release()) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                if (DelegatableNodeKt.requireLayoutNode(this).getNodes$ui_release().getTail$ui_release().isAttached()) {
                    NodeCoordinator coordinator$ui_release = getCoordinator$ui_release();
                    C12775o.m28636f(coordinator$ui_release);
                    ((LayoutModifierNodeCoordinator) coordinator$ui_release).setLayoutModifierNode$ui_release(this);
                    coordinator$ui_release.onLayoutModifierNodeChanged();
                }
                if (!z) {
                    LayoutModifierNodeKt.invalidateLayer(this);
                    DelegatableNodeKt.requireLayoutNode(this).invalidateMeasurements$ui_release();
                }
            }
            if (element2 instanceof RemeasurementModifier) {
                ((RemeasurementModifier) element2).onRemeasurementAvailable(this);
            }
            if ((NodeKind.m37625constructorimpl(128) & getKindSet$ui_release()) != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                if ((element2 instanceof OnRemeasuredModifier) && DelegatableNodeKt.requireLayoutNode(this).getNodes$ui_release().getTail$ui_release().isAttached()) {
                    DelegatableNodeKt.requireLayoutNode(this).invalidateMeasurements$ui_release();
                }
                if (element2 instanceof OnPlacedModifier) {
                    this.lastOnPlacedCoordinates = null;
                    if (DelegatableNodeKt.requireLayoutNode(this).getNodes$ui_release().getTail$ui_release().isAttached()) {
                        DelegatableNodeKt.requireOwner(this).registerOnLayoutCompletedListener(new BackwardsCompatNode$initializeModifier$2(this));
                    }
                }
            }
            if ((NodeKind.m37625constructorimpl(256) & getKindSet$ui_release()) != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6 && (element2 instanceof OnGloballyPositionedModifier) && DelegatableNodeKt.requireLayoutNode(this).getNodes$ui_release().getTail$ui_release().isAttached()) {
                DelegatableNodeKt.requireLayoutNode(this).invalidateMeasurements$ui_release();
            }
            if (element2 instanceof FocusRequesterModifier) {
                ((FocusRequesterModifier) element2).getFocusRequester().getFocusRequesterNodes$ui_release().add(this);
            }
            if ((NodeKind.m37625constructorimpl(16) & getKindSet$ui_release()) != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7 && (element2 instanceof PointerInputModifier)) {
                ((PointerInputModifier) element2).getPointerInputFilter().setLayoutCoordinates$ui_release(getCoordinator$ui_release());
            }
            if ((NodeKind.m37625constructorimpl(8) & getKindSet$ui_release()) != 0) {
                z8 = true;
            }
            if (z8) {
                DelegatableNodeKt.requireOwner(this).onSemanticsChange();
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final void unInitializeModifier() {
        boolean z;
        if (isAttached()) {
            Modifier.Element element2 = this.element;
            boolean z2 = true;
            if ((NodeKind.m37625constructorimpl(32) & getKindSet$ui_release()) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (element2 instanceof ModifierLocalProvider) {
                    DelegatableNodeKt.requireOwner(this).getModifierLocalManager().removedProvider(this, ((ModifierLocalProvider) element2).getKey());
                }
                if (element2 instanceof ModifierLocalConsumer) {
                    ((ModifierLocalConsumer) element2).onModifierLocalsUpdated(BackwardsCompatNodeKt.DetachedModifierLocalReadScope);
                }
            }
            if ((NodeKind.m37625constructorimpl(8) & getKindSet$ui_release()) == 0) {
                z2 = false;
            }
            if (z2) {
                DelegatableNodeKt.requireOwner(this).onSemanticsChange();
            }
            if (element2 instanceof FocusRequesterModifier) {
                ((FocusRequesterModifier) element2).getFocusRequester().getFocusRequesterNodes$ui_release().remove(this);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final void updateDrawCache() {
        Modifier.Element element2 = this.element;
        if (element2 instanceof DrawCacheModifier) {
            DelegatableNodeKt.requireOwner(this).getSnapshotObserver().observeReads$ui_release(this, BackwardsCompatNodeKt.onDrawCacheReadsChanged, new BackwardsCompatNode$updateDrawCache$1(element2, this));
        }
        this.invalidateCache = false;
    }

    private final void updateModifierLocalProvider(ModifierLocalProvider<?> modifierLocalProvider) {
        BackwardsCompatLocalMap backwardsCompatLocalMap = this._providedValues;
        if (backwardsCompatLocalMap == null || !backwardsCompatLocalMap.contains$ui_release(modifierLocalProvider.getKey())) {
            this._providedValues = new BackwardsCompatLocalMap(modifierLocalProvider);
            if (DelegatableNodeKt.requireLayoutNode(this).getNodes$ui_release().getTail$ui_release().isAttached()) {
                DelegatableNodeKt.requireOwner(this).getModifierLocalManager().insertedProvider(this, modifierLocalProvider.getKey());
                return;
            }
            return;
        }
        backwardsCompatLocalMap.setElement(modifierLocalProvider);
        DelegatableNodeKt.requireOwner(this).getModifierLocalManager().updatedProvider(this, modifierLocalProvider.getKey());
    }

    public void draw(ContentDrawScope contentDrawScope) {
        C12775o.m28639i(contentDrawScope, "<this>");
        Modifier.Element element2 = this.element;
        C12775o.m28637g(element2, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        DrawModifier drawModifier = (DrawModifier) element2;
        if (this.invalidateCache && (element2 instanceof DrawCacheModifier)) {
            updateDrawCache();
        }
        drawModifier.draw(contentDrawScope);
    }

    public <T> T getCurrent(ModifierLocal<T> modifierLocal) {
        NodeChain nodes$ui_release;
        C12775o.m28639i(modifierLocal, "<this>");
        this.readValues.add(modifierLocal);
        int r0 = NodeKind.m37625constructorimpl(32);
        if (getNode().isAttached()) {
            Modifier.Node parent$ui_release = getNode().getParent$ui_release();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(this);
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & r0) != 0) {
                    while (parent$ui_release != null) {
                        if ((parent$ui_release.getKindSet$ui_release() & r0) != 0 && (parent$ui_release instanceof ModifierLocalNode)) {
                            ModifierLocalNode modifierLocalNode = (ModifierLocalNode) parent$ui_release;
                            if (modifierLocalNode.getProvidedValues().contains$ui_release(modifierLocal)) {
                                return modifierLocalNode.getProvidedValues().get$ui_release(modifierLocal);
                            }
                        }
                        parent$ui_release = parent$ui_release.getParent$ui_release();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                if (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null) {
                    parent$ui_release = null;
                } else {
                    parent$ui_release = nodes$ui_release.getTail$ui_release();
                }
            }
            return modifierLocal.getDefaultFactory$ui_release().invoke();
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public Density getDensity() {
        return DelegatableNodeKt.requireLayoutNode(this).getDensity();
    }

    public final Modifier.Element getElement() {
        return this.element;
    }

    public LayoutDirection getLayoutDirection() {
        return DelegatableNodeKt.requireLayoutNode(this).getLayoutDirection();
    }

    public ModifierLocalMap getProvidedValues() {
        BackwardsCompatLocalMap backwardsCompatLocalMap = this._providedValues;
        if (backwardsCompatLocalMap != null) {
            return backwardsCompatLocalMap;
        }
        return ModifierLocalNodeKt.modifierLocalMapOf();
    }

    public final HashSet<ModifierLocal<?>> getReadValues() {
        return this.readValues;
    }

    public SemanticsConfiguration getSemanticsConfiguration() {
        Modifier.Element element2 = this.element;
        C12775o.m28637g(element2, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        return ((SemanticsModifier) element2).getSemanticsConfiguration();
    }

    /* renamed from: getSize-NH-jbRc  reason: not valid java name */
    public long m37445getSizeNHjbRc() {
        return IntSizeKt.m38638toSizeozmzZPI(DelegatableNodeKt.m37467requireCoordinator64DMado(this, NodeKind.m37625constructorimpl(128)).m37598getSizeYbymL2g());
    }

    /* renamed from: getTargetSize-YbymL2g  reason: not valid java name */
    public long m37446getTargetSizeYbymL2g() {
        Modifier.Element element2 = this.element;
        C12775o.m28637g(element2, "null cannot be cast to non-null type androidx.compose.ui.layout.IntermediateLayoutModifier");
        return ((IntermediateLayoutModifier) element2).m37326getTargetSizeYbymL2g();
    }

    public boolean interceptOutOfBoundsChildEvents() {
        Modifier.Element element2 = this.element;
        C12775o.m28637g(element2, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((PointerInputModifier) element2).getPointerInputFilter().getInterceptOutOfBoundsChildEvents();
    }

    public boolean isValidOwnerScope() {
        return isAttached();
    }

    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(intrinsicMeasurable, "measurable");
        Modifier.Element element2 = this.element;
        C12775o.m28637g(element2, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier) element2).maxIntrinsicHeight(intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(intrinsicMeasurable, "measurable");
        Modifier.Element element2 = this.element;
        C12775o.m28637g(element2, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier) element2).maxIntrinsicWidth(intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m37447measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        C12775o.m28639i(measureScope, "$this$measure");
        C12775o.m28639i(measurable, "measurable");
        Modifier.Element element2 = this.element;
        C12775o.m28637g(element2, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier) element2).m37349measure3p2s80s(measureScope, measurable, j);
    }

    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(intrinsicMeasurable, "measurable");
        Modifier.Element element2 = this.element;
        C12775o.m28637g(element2, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier) element2).minIntrinsicHeight(intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        C12775o.m28639i(intrinsicMeasureScope, "<this>");
        C12775o.m28639i(intrinsicMeasurable, "measurable");
        Modifier.Element element2 = this.element;
        C12775o.m28637g(element2, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((LayoutModifier) element2).minIntrinsicWidth(intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    public void modifyFocusProperties(FocusProperties focusProperties) {
        C12775o.m28639i(focusProperties, "focusProperties");
        Modifier.Element element2 = this.element;
        if (element2 instanceof FocusOrderModifier) {
            new FocusOrderModifierToProperties((FocusOrderModifier) element2).invoke(focusProperties);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public Object modifyParentData(Density density, Object obj) {
        C12775o.m28639i(density, "<this>");
        Modifier.Element element2 = this.element;
        C12775o.m28637g(element2, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((ParentDataModifier) element2).modifyParentData(density, obj);
    }

    public void onAttach() {
        initializeModifier(true);
    }

    public void onCancelPointerInput() {
        Modifier.Element element2 = this.element;
        C12775o.m28637g(element2, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((PointerInputModifier) element2).getPointerInputFilter().onCancel();
    }

    public void onDetach() {
        unInitializeModifier();
    }

    public final void onDrawCacheReadsChanged$ui_release() {
        this.invalidateCache = true;
        DrawModifierNodeKt.invalidateDraw(this);
    }

    public void onFocusEvent(FocusState focusState) {
        C12775o.m28639i(focusState, "focusState");
        Modifier.Element element2 = this.element;
        if (element2 instanceof FocusEventModifier) {
            ((FocusEventModifier) element2).onFocusEvent(focusState);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        C12775o.m28639i(layoutCoordinates, "coordinates");
        Modifier.Element element2 = this.element;
        C12775o.m28637g(element2, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((OnGloballyPositionedModifier) element2).onGloballyPositioned(layoutCoordinates);
    }

    public void onLookaheadPlaced(LookaheadLayoutCoordinates lookaheadLayoutCoordinates) {
        C12775o.m28639i(lookaheadLayoutCoordinates, "coordinates");
        Modifier.Element element2 = this.element;
        if (element2 instanceof LookaheadOnPlacedModifier) {
            ((LookaheadOnPlacedModifier) element2).onPlaced(lookaheadLayoutCoordinates);
        }
    }

    public void onMeasureResultChanged() {
        this.invalidateCache = true;
        DrawModifierNodeKt.invalidateDraw(this);
    }

    public void onPlaced(LayoutCoordinates layoutCoordinates) {
        C12775o.m28639i(layoutCoordinates, "coordinates");
        this.lastOnPlacedCoordinates = layoutCoordinates;
        Modifier.Element element2 = this.element;
        if (element2 instanceof OnPlacedModifier) {
            ((OnPlacedModifier) element2).onPlaced(layoutCoordinates);
        }
    }

    /* renamed from: onPointerEvent-H0pRuoY  reason: not valid java name */
    public void m37448onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        C12775o.m28639i(pointerEvent, "pointerEvent");
        C12775o.m28639i(pointerEventPass, "pass");
        Modifier.Element element2 = this.element;
        C12775o.m28637g(element2, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((PointerInputModifier) element2).getPointerInputFilter().m37190onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j);
    }

    /* renamed from: onRemeasured-ozmzZPI  reason: not valid java name */
    public void m37449onRemeasuredozmzZPI(long j) {
        Modifier.Element element2 = this.element;
        if (element2 instanceof OnRemeasuredModifier) {
            ((OnRemeasuredModifier) element2).m37395onRemeasuredozmzZPI(j);
        }
    }

    public final void setElement(Modifier.Element element2) {
        C12775o.m28639i(element2, "value");
        if (isAttached()) {
            unInitializeModifier();
        }
        this.element = element2;
        setKindSet$ui_release(NodeKindKt.calculateNodeKindSetFrom(element2));
        if (isAttached()) {
            initializeModifier(false);
        }
    }

    public final void setReadValues(HashSet<ModifierLocal<?>> hashSet) {
        C12775o.m28639i(hashSet, "<set-?>");
        this.readValues = hashSet;
    }

    /* renamed from: setTargetSize-ozmzZPI  reason: not valid java name */
    public void m37450setTargetSizeozmzZPI(long j) {
        Modifier.Element element2 = this.element;
        C12775o.m28637g(element2, "null cannot be cast to non-null type androidx.compose.ui.layout.IntermediateLayoutModifier");
        ((IntermediateLayoutModifier) element2).m37327setTargetSizeozmzZPI(j);
    }

    public boolean sharePointerInputWithSiblings() {
        Modifier.Element element2 = this.element;
        C12775o.m28637g(element2, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((PointerInputModifier) element2).getPointerInputFilter().getShareWithSiblings();
    }

    public String toString() {
        return this.element.toString();
    }

    public final void updateModifierLocalConsumer() {
        if (isAttached()) {
            this.readValues.clear();
            DelegatableNodeKt.requireOwner(this).getSnapshotObserver().observeReads$ui_release(this, BackwardsCompatNodeKt.updateModifierLocalConsumer, new BackwardsCompatNode$updateModifierLocalConsumer$1(this));
        }
    }
}
