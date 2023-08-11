package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.graphics.GraphicsLayerScope;
import androidx.compose.p002ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.p002ui.node.LookaheadCapablePlaceable;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.p002ui.unit.IntOffsetKt;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.p002ui.unit.IntSizeKt;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.layout.Placeable */
/* compiled from: Placeable.kt */
public abstract class Placeable implements Measured {
    public static final int $stable = 8;
    private int height;
    private long measuredSize = IntSizeKt.IntSize(0, 0);
    private long measurementConstraints = PlaceableKt.DefaultConstraints;
    private int width;

    private final void recalculateWidthAndHeight() {
        this.width = C13537l.m30886m(IntSize.m38628getWidthimpl(this.measuredSize), Constraints.m38414getMinWidthimpl(this.measurementConstraints), Constraints.m38412getMaxWidthimpl(this.measurementConstraints));
        this.height = C13537l.m30886m(IntSize.m38627getHeightimpl(this.measuredSize), Constraints.m38413getMinHeightimpl(this.measurementConstraints), Constraints.m38411getMaxHeightimpl(this.measurementConstraints));
    }

    /* access modifiers changed from: protected */
    /* renamed from: getApparentToRealOffset-nOcc-ac  reason: not valid java name */
    public final long m37399getApparentToRealOffsetnOccac() {
        return IntOffsetKt.IntOffset((this.width - IntSize.m38628getWidthimpl(this.measuredSize)) / 2, (this.height - IntSize.m38627getHeightimpl(this.measuredSize)) / 2);
    }

    public final int getHeight() {
        return this.height;
    }

    public int getMeasuredHeight() {
        return IntSize.m38627getHeightimpl(this.measuredSize);
    }

    /* access modifiers changed from: protected */
    /* renamed from: getMeasuredSize-YbymL2g  reason: not valid java name */
    public final long m37400getMeasuredSizeYbymL2g() {
        return this.measuredSize;
    }

    public int getMeasuredWidth() {
        return IntSize.m38628getWidthimpl(this.measuredSize);
    }

    /* access modifiers changed from: protected */
    /* renamed from: getMeasurementConstraints-msEJaDk  reason: not valid java name */
    public final long m37401getMeasurementConstraintsmsEJaDk() {
        return this.measurementConstraints;
    }

    public final int getWidth() {
        return this.width;
    }

    /* access modifiers changed from: protected */
    /* renamed from: placeAt-f8xVGno  reason: not valid java name */
    public abstract void m37402placeAtf8xVGno(long j, float f, Function1<? super GraphicsLayerScope, C11921v> function1);

    /* access modifiers changed from: protected */
    /* renamed from: setMeasuredSize-ozmzZPI  reason: not valid java name */
    public final void m37403setMeasuredSizeozmzZPI(long j) {
        if (!IntSize.m38626equalsimpl0(this.measuredSize, j)) {
            this.measuredSize = j;
            recalculateWidthAndHeight();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: setMeasurementConstraints-BRTryo0  reason: not valid java name */
    public final void m37404setMeasurementConstraintsBRTryo0(long j) {
        if (!Constraints.m38405equalsimpl0(this.measurementConstraints, j)) {
            this.measurementConstraints = j;
            recalculateWidthAndHeight();
        }
    }

    @StabilityInferred(parameters = 0)
    @SourceDebugExtension({"SMAP\nPlaceable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,421:1\n318#1,2:422\n335#1:424\n336#1:426\n321#1,2:427\n335#1,2:429\n327#1:431\n318#1,2:432\n335#1:434\n336#1:436\n321#1,2:437\n335#1,2:439\n327#1:441\n335#1:442\n336#1:444\n335#1:445\n336#1:447\n318#1,2:448\n335#1:450\n336#1:452\n321#1,2:453\n335#1,2:455\n327#1:457\n318#1,2:458\n335#1:460\n336#1:462\n321#1,2:463\n335#1,2:465\n327#1:467\n335#1:468\n336#1:470\n335#1:471\n336#1:473\n335#1:474\n336#1:476\n335#1:477\n336#1:479\n86#2:425\n86#2:435\n86#2:443\n86#2:446\n86#2:451\n86#2:461\n86#2:469\n86#2:472\n86#2:475\n86#2:478\n86#2:480\n*S KotlinDebug\n*F\n+ 1 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope\n*L\n184#1:422,2\n184#1:424\n184#1:426\n184#1:427,2\n184#1:429,2\n184#1:431\n200#1:432,2\n200#1:434\n200#1:436\n200#1:437,2\n200#1:439,2\n200#1:441\n212#1:442\n212#1:444\n224#1:445\n224#1:447\n247#1:448,2\n247#1:450\n247#1:452\n247#1:453,2\n247#1:455,2\n247#1:457\n271#1:458,2\n271#1:460\n271#1:462\n271#1:463,2\n271#1:465,2\n271#1:467\n291#1:468\n291#1:470\n310#1:471\n310#1:473\n319#1:474\n319#1:476\n321#1:477\n321#1:479\n184#1:425\n200#1:435\n212#1:443\n224#1:446\n247#1:451\n271#1:461\n291#1:469\n310#1:472\n319#1:475\n321#1:478\n335#1:480\n*E\n"})
    /* renamed from: androidx.compose.ui.layout.Placeable$PlacementScope */
    /* compiled from: Placeable.kt */
    public static abstract class PlacementScope {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static LayoutCoordinates _coordinates;
        /* access modifiers changed from: private */
        public static LayoutNodeLayoutDelegate layoutDelegate;
        /* access modifiers changed from: private */
        public static LayoutDirection parentLayoutDirection = LayoutDirection.Ltr;
        /* access modifiers changed from: private */
        public static int parentWidth;

        /* renamed from: androidx.compose.ui.layout.Placeable$PlacementScope$Companion */
        /* compiled from: Placeable.kt */
        public static final class Companion extends PlacementScope {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* access modifiers changed from: private */
            public final boolean configureForPlacingForAlignment(LookaheadCapablePlaceable lookaheadCapablePlaceable) {
                boolean z = false;
                if (lookaheadCapablePlaceable == null) {
                    PlacementScope._coordinates = null;
                    PlacementScope.layoutDelegate = null;
                    return false;
                }
                boolean isPlacingForAlignment$ui_release = lookaheadCapablePlaceable.isPlacingForAlignment$ui_release();
                LookaheadCapablePlaceable parent = lookaheadCapablePlaceable.getParent();
                if (parent != null && parent.isPlacingForAlignment$ui_release()) {
                    z = true;
                }
                if (z) {
                    lookaheadCapablePlaceable.setPlacingForAlignment$ui_release(true);
                }
                PlacementScope.layoutDelegate = lookaheadCapablePlaceable.getLayoutNode().getLayoutDelegate$ui_release();
                if (lookaheadCapablePlaceable.isPlacingForAlignment$ui_release() || lookaheadCapablePlaceable.isShallowPlacing$ui_release()) {
                    PlacementScope._coordinates = null;
                } else {
                    PlacementScope._coordinates = lookaheadCapablePlaceable.getCoordinates();
                }
                return isPlacingForAlignment$ui_release;
            }

            public final void executeWithRtlMirroringValues(int i, LayoutDirection layoutDirection, LookaheadCapablePlaceable lookaheadCapablePlaceable, Function1<? super PlacementScope, C11921v> function1) {
                C12775o.m28639i(layoutDirection, "parentLayoutDirection");
                C12775o.m28639i(function1, "block");
                LayoutCoordinates access$get_coordinates$cp = PlacementScope._coordinates;
                Companion companion = PlacementScope.Companion;
                int access$getParentWidth = companion.getParentWidth();
                LayoutDirection access$getParentLayoutDirection = companion.getParentLayoutDirection();
                LayoutNodeLayoutDelegate access$getLayoutDelegate$cp = PlacementScope.layoutDelegate;
                PlacementScope.parentWidth = i;
                PlacementScope.parentLayoutDirection = layoutDirection;
                boolean access$configureForPlacingForAlignment = configureForPlacingForAlignment(lookaheadCapablePlaceable);
                function1.invoke(this);
                if (lookaheadCapablePlaceable != null) {
                    lookaheadCapablePlaceable.setPlacingForAlignment$ui_release(access$configureForPlacingForAlignment);
                }
                PlacementScope.parentWidth = access$getParentWidth;
                PlacementScope.parentLayoutDirection = access$getParentLayoutDirection;
                PlacementScope._coordinates = access$get_coordinates$cp;
                PlacementScope.layoutDelegate = access$getLayoutDelegate$cp;
            }

            public LayoutCoordinates getCoordinates() {
                LayoutNodeLayoutDelegate access$getLayoutDelegate$cp = PlacementScope.layoutDelegate;
                if (access$getLayoutDelegate$cp != null) {
                    access$getLayoutDelegate$cp.setCoordinatesAccessedDuringPlacement(true);
                }
                return PlacementScope._coordinates;
            }

            /* access modifiers changed from: protected */
            public LayoutDirection getParentLayoutDirection() {
                return PlacementScope.parentLayoutDirection;
            }

            /* access modifiers changed from: protected */
            public int getParentWidth() {
                return PlacementScope.parentWidth;
            }

            private Companion() {
            }

            @ExperimentalComposeUiApi
            public static /* synthetic */ void getCoordinates$annotations() {
            }
        }

        public static /* synthetic */ void place$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 4) != 0) {
                    f = 0.0f;
                }
                placementScope.place(placeable, i, i2, f);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
        }

        /* renamed from: place-70tqf50$default  reason: not valid java name */
        public static /* synthetic */ void m37405place70tqf50$default(PlacementScope placementScope, Placeable placeable, long j, float f, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    f = 0.0f;
                }
                placementScope.m37409place70tqf50(placeable, j, f);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
        }

        public static /* synthetic */ void placeRelative$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 4) != 0) {
                    f = 0.0f;
                }
                placementScope.placeRelative(placeable, i, i2, f);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
        }

        /* renamed from: placeRelative-70tqf50$default  reason: not valid java name */
        public static /* synthetic */ void m37406placeRelative70tqf50$default(PlacementScope placementScope, Placeable placeable, long j, float f, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    f = 0.0f;
                }
                placementScope.m37412placeRelative70tqf50(placeable, j, f);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
        }

        public static /* synthetic */ void placeRelativeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, Function1 function1, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 4) != 0) {
                    f = 0.0f;
                }
                float f2 = f;
                if ((i3 & 8) != 0) {
                    function1 = PlaceableKt.DefaultLayerBlock;
                }
                placementScope.placeRelativeWithLayer(placeable, i, i2, f2, function1);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM$default  reason: not valid java name */
        public static /* synthetic */ void m37407placeRelativeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j, float f, Function1 function1, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    f = 0.0f;
                }
                float f2 = f;
                if ((i & 4) != 0) {
                    function1 = PlaceableKt.DefaultLayerBlock;
                }
                placementScope.m37413placeRelativeWithLayeraW9wM(placeable, j, f2, function1);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
        }

        public static /* synthetic */ void placeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, Function1 function1, int i3, Object obj) {
            if (obj == null) {
                if ((i3 & 4) != 0) {
                    f = 0.0f;
                }
                float f2 = f;
                if ((i3 & 8) != 0) {
                    function1 = PlaceableKt.DefaultLayerBlock;
                }
                placementScope.placeWithLayer(placeable, i, i2, f2, function1);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
        }

        /* renamed from: placeWithLayer-aW-9-wM$default  reason: not valid java name */
        public static /* synthetic */ void m37408placeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j, float f, Function1 function1, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    f = 0.0f;
                }
                float f2 = f;
                if ((i & 4) != 0) {
                    function1 = PlaceableKt.DefaultLayerBlock;
                }
                placementScope.m37414placeWithLayeraW9wM(placeable, j, f2, function1);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
        }

        @ExperimentalComposeUiApi
        public LayoutCoordinates getCoordinates() {
            return null;
        }

        /* access modifiers changed from: protected */
        public abstract LayoutDirection getParentLayoutDirection();

        /* access modifiers changed from: protected */
        public abstract int getParentWidth();

        public final void place(Placeable placeable, int i, int i2, float f) {
            C12775o.m28639i(placeable, "<this>");
            long IntOffset = IntOffsetKt.IntOffset(i, i2);
            long r0 = placeable.m37399getApparentToRealOffsetnOccac();
            placeable.m37402placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(IntOffset) + IntOffset.m38586getXimpl(r0), IntOffset.m38587getYimpl(IntOffset) + IntOffset.m38587getYimpl(r0)), f, (Function1<? super GraphicsLayerScope, C11921v>) null);
        }

        /* renamed from: place-70tqf50  reason: not valid java name */
        public final void m37409place70tqf50(Placeable placeable, long j, float f) {
            C12775o.m28639i(placeable, "$this$place");
            long r0 = placeable.m37399getApparentToRealOffsetnOccac();
            placeable.m37402placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(j) + IntOffset.m38586getXimpl(r0), IntOffset.m38587getYimpl(j) + IntOffset.m38587getYimpl(r0)), f, (Function1<? super GraphicsLayerScope, C11921v>) null);
        }

        /* renamed from: placeApparentToRealOffset-aW-9-wM$ui_release  reason: not valid java name */
        public final void m37410placeApparentToRealOffsetaW9wM$ui_release(Placeable placeable, long j, float f, Function1<? super GraphicsLayerScope, C11921v> function1) {
            C12775o.m28639i(placeable, "$this$placeApparentToRealOffset");
            long r0 = placeable.m37399getApparentToRealOffsetnOccac();
            placeable.m37402placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(j) + IntOffset.m38586getXimpl(r0), IntOffset.m38587getYimpl(j) + IntOffset.m38587getYimpl(r0)), f, function1);
        }

        /* renamed from: placeAutoMirrored-aW-9-wM$ui_release  reason: not valid java name */
        public final void m37411placeAutoMirroredaW9wM$ui_release(Placeable placeable, long j, float f, Function1<? super GraphicsLayerScope, C11921v> function1) {
            C12775o.m28639i(placeable, "$this$placeAutoMirrored");
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long r0 = placeable.m37399getApparentToRealOffsetnOccac();
                placeable.m37402placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(j) + IntOffset.m38586getXimpl(r0), IntOffset.m38587getYimpl(j) + IntOffset.m38587getYimpl(r0)), f, function1);
                return;
            }
            long IntOffset = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m38586getXimpl(j), IntOffset.m38587getYimpl(j));
            long r02 = placeable.m37399getApparentToRealOffsetnOccac();
            placeable.m37402placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(IntOffset) + IntOffset.m38586getXimpl(r02), IntOffset.m38587getYimpl(IntOffset) + IntOffset.m38587getYimpl(r02)), f, function1);
        }

        public final void placeRelative(Placeable placeable, int i, int i2, float f) {
            C12775o.m28639i(placeable, "<this>");
            long IntOffset = IntOffsetKt.IntOffset(i, i2);
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long r0 = placeable.m37399getApparentToRealOffsetnOccac();
                placeable.m37402placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(IntOffset) + IntOffset.m38586getXimpl(r0), IntOffset.m38587getYimpl(IntOffset) + IntOffset.m38587getYimpl(r0)), f, (Function1<? super GraphicsLayerScope, C11921v>) null);
                return;
            }
            long IntOffset2 = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m38586getXimpl(IntOffset), IntOffset.m38587getYimpl(IntOffset));
            long r02 = placeable.m37399getApparentToRealOffsetnOccac();
            placeable.m37402placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(IntOffset2) + IntOffset.m38586getXimpl(r02), IntOffset.m38587getYimpl(IntOffset2) + IntOffset.m38587getYimpl(r02)), f, (Function1<? super GraphicsLayerScope, C11921v>) null);
        }

        /* renamed from: placeRelative-70tqf50  reason: not valid java name */
        public final void m37412placeRelative70tqf50(Placeable placeable, long j, float f) {
            C12775o.m28639i(placeable, "$this$placeRelative");
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long r0 = placeable.m37399getApparentToRealOffsetnOccac();
                placeable.m37402placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(j) + IntOffset.m38586getXimpl(r0), IntOffset.m38587getYimpl(j) + IntOffset.m38587getYimpl(r0)), f, (Function1<? super GraphicsLayerScope, C11921v>) null);
                return;
            }
            long IntOffset = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m38586getXimpl(j), IntOffset.m38587getYimpl(j));
            long r02 = placeable.m37399getApparentToRealOffsetnOccac();
            placeable.m37402placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(IntOffset) + IntOffset.m38586getXimpl(r02), IntOffset.m38587getYimpl(IntOffset) + IntOffset.m38587getYimpl(r02)), f, (Function1<? super GraphicsLayerScope, C11921v>) null);
        }

        public final void placeRelativeWithLayer(Placeable placeable, int i, int i2, float f, Function1<? super GraphicsLayerScope, C11921v> function1) {
            C12775o.m28639i(placeable, "<this>");
            C12775o.m28639i(function1, "layerBlock");
            long IntOffset = IntOffsetKt.IntOffset(i, i2);
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long r0 = placeable.m37399getApparentToRealOffsetnOccac();
                placeable.m37402placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(IntOffset) + IntOffset.m38586getXimpl(r0), IntOffset.m38587getYimpl(IntOffset) + IntOffset.m38587getYimpl(r0)), f, function1);
                return;
            }
            long IntOffset2 = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m38586getXimpl(IntOffset), IntOffset.m38587getYimpl(IntOffset));
            long r02 = placeable.m37399getApparentToRealOffsetnOccac();
            placeable.m37402placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(IntOffset2) + IntOffset.m38586getXimpl(r02), IntOffset.m38587getYimpl(IntOffset2) + IntOffset.m38587getYimpl(r02)), f, function1);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM  reason: not valid java name */
        public final void m37413placeRelativeWithLayeraW9wM(Placeable placeable, long j, float f, Function1<? super GraphicsLayerScope, C11921v> function1) {
            C12775o.m28639i(placeable, "$this$placeRelativeWithLayer");
            C12775o.m28639i(function1, "layerBlock");
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long r0 = placeable.m37399getApparentToRealOffsetnOccac();
                placeable.m37402placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(j) + IntOffset.m38586getXimpl(r0), IntOffset.m38587getYimpl(j) + IntOffset.m38587getYimpl(r0)), f, function1);
                return;
            }
            long IntOffset = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m38586getXimpl(j), IntOffset.m38587getYimpl(j));
            long r02 = placeable.m37399getApparentToRealOffsetnOccac();
            placeable.m37402placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(IntOffset) + IntOffset.m38586getXimpl(r02), IntOffset.m38587getYimpl(IntOffset) + IntOffset.m38587getYimpl(r02)), f, function1);
        }

        public final void placeWithLayer(Placeable placeable, int i, int i2, float f, Function1<? super GraphicsLayerScope, C11921v> function1) {
            C12775o.m28639i(placeable, "<this>");
            C12775o.m28639i(function1, "layerBlock");
            long IntOffset = IntOffsetKt.IntOffset(i, i2);
            long r0 = placeable.m37399getApparentToRealOffsetnOccac();
            placeable.m37402placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(IntOffset) + IntOffset.m38586getXimpl(r0), IntOffset.m38587getYimpl(IntOffset) + IntOffset.m38587getYimpl(r0)), f, function1);
        }

        /* renamed from: placeWithLayer-aW-9-wM  reason: not valid java name */
        public final void m37414placeWithLayeraW9wM(Placeable placeable, long j, float f, Function1<? super GraphicsLayerScope, C11921v> function1) {
            C12775o.m28639i(placeable, "$this$placeWithLayer");
            C12775o.m28639i(function1, "layerBlock");
            long r0 = placeable.m37399getApparentToRealOffsetnOccac();
            placeable.m37402placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m38586getXimpl(j) + IntOffset.m38586getXimpl(r0), IntOffset.m38587getYimpl(j) + IntOffset.m38587getYimpl(r0)), f, function1);
        }

        @ExperimentalComposeUiApi
        public static /* synthetic */ void getCoordinates$annotations() {
        }
    }
}
