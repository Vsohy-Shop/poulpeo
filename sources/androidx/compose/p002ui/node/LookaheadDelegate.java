package androidx.compose.p002ui.node;

import androidx.compose.p002ui.graphics.GraphicsLayerScope;
import androidx.compose.p002ui.layout.AlignmentLine;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.p002ui.layout.LookaheadLayoutCoordinatesImpl;
import androidx.compose.p002ui.layout.LookaheadScope;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.p002ui.unit.IntOffsetKt;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.p002ui.unit.IntSizeKt;
import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nLookaheadDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope$Companion\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,207:1\n1#2:208\n360#3,15:209\n86#4:224\n*S KotlinDebug\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n*L\n160#1:209,15\n201#1:224\n*E\n"})
/* renamed from: androidx.compose.ui.node.LookaheadDelegate */
/* compiled from: LookaheadDelegate.kt */
public abstract class LookaheadDelegate extends LookaheadCapablePlaceable implements Measurable {
    private MeasureResult _measureResult;
    private final Map<AlignmentLine, Integer> cachedAlignmentLinesMap = new LinkedHashMap();
    private final NodeCoordinator coordinator;
    private final LookaheadLayoutCoordinatesImpl lookaheadLayoutCoordinates = new LookaheadLayoutCoordinatesImpl(this);
    private final LookaheadScope lookaheadScope;
    private Map<AlignmentLine, Integer> oldAlignmentLines;
    private long position = IntOffset.Companion.m38596getZeronOccac();

    public LookaheadDelegate(NodeCoordinator nodeCoordinator, LookaheadScope lookaheadScope2) {
        C12775o.m28639i(nodeCoordinator, "coordinator");
        C12775o.m28639i(lookaheadScope2, "lookaheadScope");
        this.coordinator = nodeCoordinator;
        this.lookaheadScope = lookaheadScope2;
    }

    /* access modifiers changed from: private */
    public final void set_measureResult(MeasureResult measureResult) {
        C11921v vVar;
        boolean z;
        if (measureResult != null) {
            m37403setMeasuredSizeozmzZPI(IntSizeKt.IntSize(measureResult.getWidth(), measureResult.getHeight()));
            vVar = C11921v.f18618a;
        } else {
            vVar = null;
        }
        if (vVar == null) {
            m37403setMeasuredSizeozmzZPI(IntSize.Companion.m38633getZeroYbymL2g());
        }
        if (!C12775o.m28634d(this._measureResult, measureResult) && measureResult != null) {
            Map<AlignmentLine, Integer> map = this.oldAlignmentLines;
            if (map == null || map.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if ((!z || (!measureResult.getAlignmentLines().isEmpty())) && !C12775o.m28634d(measureResult.getAlignmentLines(), this.oldAlignmentLines)) {
                getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
                Map map2 = this.oldAlignmentLines;
                if (map2 == null) {
                    map2 = new LinkedHashMap();
                    this.oldAlignmentLines = map2;
                }
                map2.clear();
                map2.putAll(measureResult.getAlignmentLines());
            }
        }
        this._measureResult = measureResult;
    }

    public AlignmentLinesOwner getAlignmentLinesOwner() {
        AlignmentLinesOwner lookaheadAlignmentLinesOwner$ui_release = this.coordinator.getLayoutNode().getLayoutDelegate$ui_release().getLookaheadAlignmentLinesOwner$ui_release();
        C12775o.m28636f(lookaheadAlignmentLinesOwner$ui_release);
        return lookaheadAlignmentLinesOwner$ui_release;
    }

    public final int getCachedAlignmentLine$ui_release(AlignmentLine alignmentLine) {
        C12775o.m28639i(alignmentLine, "alignmentLine");
        Integer num = this.cachedAlignmentLinesMap.get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    /* access modifiers changed from: protected */
    public final Map<AlignmentLine, Integer> getCachedAlignmentLinesMap() {
        return this.cachedAlignmentLinesMap;
    }

    public LookaheadCapablePlaceable getChild() {
        NodeCoordinator wrapped$ui_release = this.coordinator.getWrapped$ui_release();
        if (wrapped$ui_release != null) {
            return wrapped$ui_release.getLookaheadDelegate$ui_release();
        }
        return null;
    }

    public LayoutCoordinates getCoordinates() {
        return this.lookaheadLayoutCoordinates;
    }

    public final NodeCoordinator getCoordinator() {
        return this.coordinator;
    }

    public float getDensity() {
        return this.coordinator.getDensity();
    }

    public float getFontScale() {
        return this.coordinator.getFontScale();
    }

    public boolean getHasMeasureResult() {
        if (this._measureResult != null) {
            return true;
        }
        return false;
    }

    public LayoutDirection getLayoutDirection() {
        return this.coordinator.getLayoutDirection();
    }

    public LayoutNode getLayoutNode() {
        return this.coordinator.getLayoutNode();
    }

    public final LookaheadLayoutCoordinatesImpl getLookaheadLayoutCoordinates() {
        return this.lookaheadLayoutCoordinates;
    }

    public final LookaheadScope getLookaheadScope() {
        return this.lookaheadScope;
    }

    public MeasureResult getMeasureResult$ui_release() {
        MeasureResult measureResult = this._measureResult;
        if (measureResult != null) {
            return measureResult;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.".toString());
    }

    public LookaheadCapablePlaceable getParent() {
        NodeCoordinator wrappedBy$ui_release = this.coordinator.getWrappedBy$ui_release();
        if (wrappedBy$ui_release != null) {
            return wrappedBy$ui_release.getLookaheadDelegate$ui_release();
        }
        return null;
    }

    public Object getParentData() {
        return this.coordinator.getParentData();
    }

    /* renamed from: getPosition-nOcc-ac  reason: not valid java name */
    public long m37561getPositionnOccac() {
        return this.position;
    }

    public int maxIntrinsicHeight(int i) {
        NodeCoordinator wrapped$ui_release = this.coordinator.getWrapped$ui_release();
        C12775o.m28636f(wrapped$ui_release);
        LookaheadDelegate lookaheadDelegate$ui_release = wrapped$ui_release.getLookaheadDelegate$ui_release();
        C12775o.m28636f(lookaheadDelegate$ui_release);
        return lookaheadDelegate$ui_release.maxIntrinsicHeight(i);
    }

    public int maxIntrinsicWidth(int i) {
        NodeCoordinator wrapped$ui_release = this.coordinator.getWrapped$ui_release();
        C12775o.m28636f(wrapped$ui_release);
        LookaheadDelegate lookaheadDelegate$ui_release = wrapped$ui_release.getLookaheadDelegate$ui_release();
        C12775o.m28636f(lookaheadDelegate$ui_release);
        return lookaheadDelegate$ui_release.maxIntrinsicWidth(i);
    }

    public int minIntrinsicHeight(int i) {
        NodeCoordinator wrapped$ui_release = this.coordinator.getWrapped$ui_release();
        C12775o.m28636f(wrapped$ui_release);
        LookaheadDelegate lookaheadDelegate$ui_release = wrapped$ui_release.getLookaheadDelegate$ui_release();
        C12775o.m28636f(lookaheadDelegate$ui_release);
        return lookaheadDelegate$ui_release.minIntrinsicHeight(i);
    }

    public int minIntrinsicWidth(int i) {
        NodeCoordinator wrapped$ui_release = this.coordinator.getWrapped$ui_release();
        C12775o.m28636f(wrapped$ui_release);
        LookaheadDelegate lookaheadDelegate$ui_release = wrapped$ui_release.getLookaheadDelegate$ui_release();
        C12775o.m28636f(lookaheadDelegate$ui_release);
        return lookaheadDelegate$ui_release.minIntrinsicWidth(i);
    }

    /* renamed from: performingMeasure-K40F9xA  reason: not valid java name */
    public final Placeable m37562performingMeasureK40F9xA(long j, C13074a<? extends MeasureResult> aVar) {
        C12775o.m28639i(aVar, "block");
        m37404setMeasurementConstraintsBRTryo0(j);
        set_measureResult((MeasureResult) aVar.invoke());
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: placeAt-f8xVGno  reason: not valid java name */
    public final void m37563placeAtf8xVGno(long j, float f, Function1<? super GraphicsLayerScope, C11921v> function1) {
        if (!IntOffset.m38585equalsimpl0(m37561getPositionnOccac(), j)) {
            m37565setPositiongyyYBs(j);
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate$ui_release = getLayoutNode().getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
            if (lookaheadPassDelegate$ui_release != null) {
                lookaheadPassDelegate$ui_release.notifyChildrenUsingCoordinatesWhilePlacing();
            }
            invalidateAlignmentLinesFromPositionChange(this.coordinator);
        }
        if (!isShallowPlacing$ui_release()) {
            placeChildren();
        }
    }

    /* access modifiers changed from: protected */
    public void placeChildren() {
        Placeable.PlacementScope.Companion companion = Placeable.PlacementScope.Companion;
        int width = getMeasureResult$ui_release().getWidth();
        LayoutDirection layoutDirection = this.coordinator.getLayoutDirection();
        LayoutCoordinates access$get_coordinates$cp = Placeable.PlacementScope._coordinates;
        int access$getParentWidth = companion.getParentWidth();
        LayoutDirection access$getParentLayoutDirection = companion.getParentLayoutDirection();
        LayoutNodeLayoutDelegate access$getLayoutDelegate$cp = Placeable.PlacementScope.layoutDelegate;
        Placeable.PlacementScope.parentWidth = width;
        Placeable.PlacementScope.parentLayoutDirection = layoutDirection;
        boolean access$configureForPlacingForAlignment = companion.configureForPlacingForAlignment(this);
        getMeasureResult$ui_release().placeChildren();
        setPlacingForAlignment$ui_release(access$configureForPlacingForAlignment);
        Placeable.PlacementScope.parentWidth = access$getParentWidth;
        Placeable.PlacementScope.parentLayoutDirection = access$getParentLayoutDirection;
        Placeable.PlacementScope._coordinates = access$get_coordinates$cp;
        Placeable.PlacementScope.layoutDelegate = access$getLayoutDelegate$cp;
    }

    /* renamed from: positionIn-Bjo55l4$ui_release  reason: not valid java name */
    public final long m37564positionInBjo55l4$ui_release(LookaheadDelegate lookaheadDelegate) {
        C12775o.m28639i(lookaheadDelegate, "ancestor");
        long r0 = IntOffset.Companion.m38596getZeronOccac();
        LookaheadDelegate lookaheadDelegate2 = this;
        while (!C12775o.m28634d(lookaheadDelegate2, lookaheadDelegate)) {
            long r3 = lookaheadDelegate2.m37561getPositionnOccac();
            r0 = IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(r0) + IntOffset.m38586getXimpl(r3), IntOffset.m38587getYimpl(r0) + IntOffset.m38587getYimpl(r3));
            NodeCoordinator wrappedBy$ui_release = lookaheadDelegate2.coordinator.getWrappedBy$ui_release();
            C12775o.m28636f(wrappedBy$ui_release);
            lookaheadDelegate2 = wrappedBy$ui_release.getLookaheadDelegate$ui_release();
            C12775o.m28636f(lookaheadDelegate2);
        }
        return r0;
    }

    public void replace$ui_release() {
        m37563placeAtf8xVGno(m37561getPositionnOccac(), 0.0f, (Function1<? super GraphicsLayerScope, C11921v>) null);
    }

    /* renamed from: setPosition--gyyYBs  reason: not valid java name */
    public void m37565setPositiongyyYBs(long j) {
        this.position = j;
    }
}
