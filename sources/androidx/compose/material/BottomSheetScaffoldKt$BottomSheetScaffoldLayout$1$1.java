package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.layout.SubcomposeMeasureScope;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: BottomSheetScaffold.kt */
final class BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1 extends C12777p implements C13088o<SubcomposeMeasureScope, Constraints, MeasureResult> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C13089p<PaddingValues, Composer, Integer, C11921v> $body;
    final /* synthetic */ C13089p<Integer, Composer, Integer, C11921v> $bottomSheet;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $floatingActionButton;
    final /* synthetic */ int $floatingActionButtonPosition;
    final /* synthetic */ C13074a<Float> $sheetOffset;
    final /* synthetic */ float $sheetPeekHeight;
    final /* synthetic */ BottomSheetState $sheetState;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $snackbarHost;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $topBar;

    /* compiled from: BottomSheetScaffold.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.material.BottomSheetValue[] r0 = androidx.compose.material.BottomSheetValue.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.material.BottomSheetValue r1 = androidx.compose.material.BottomSheetValue.Collapsed     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.material.BottomSheetValue r1 = androidx.compose.material.BottomSheetValue.Expanded     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1.WhenMappings.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BottomSheetScaffoldKt$BottomSheetScaffoldLayout$1$1(C13074a<Float> aVar, C13088o<? super Composer, ? super Integer, C11921v> oVar, C13088o<? super Composer, ? super Integer, C11921v> oVar2, int i, float f, C13088o<? super Composer, ? super Integer, C11921v> oVar3, BottomSheetState bottomSheetState, C13089p<? super Integer, ? super Composer, ? super Integer, C11921v> pVar, int i2, C13089p<? super PaddingValues, ? super Composer, ? super Integer, C11921v> pVar2) {
        super(2);
        this.$sheetOffset = aVar;
        this.$topBar = oVar;
        this.$floatingActionButton = oVar2;
        this.$floatingActionButtonPosition = i;
        this.$sheetPeekHeight = f;
        this.$snackbarHost = oVar3;
        this.$sheetState = bottomSheetState;
        this.$bottomSheet = pVar;
        this.$$dirty = i2;
        this.$body = pVar2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m33912invoke0kLqBqw((SubcomposeMeasureScope) obj, ((Constraints) obj2).m38418unboximpl());
    }

    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final MeasureResult m33912invoke0kLqBqw(SubcomposeMeasureScope subcomposeMeasureScope, long j) {
        Placeable placeable;
        int i;
        final Placeable placeable2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
        C12775o.m28639i(subcomposeMeasureScope2, "$this$SubcomposeLayout");
        int r2 = Constraints.m38412getMaxWidthimpl(j);
        int r3 = Constraints.m38411getMaxHeightimpl(j);
        long r4 = Constraints.m38403copyZbe2FdA$default(j, 0, 0, 0, 0, 10, (Object) null);
        Placeable r6 = subcomposeMeasureScope2.subcompose(BottomSheetScaffoldLayoutSlot.Sheet, ComposableLambdaKt.composableLambdaInstance(-2120029209, true, new C0702xb0851876(this.$bottomSheet, r3, this.$$dirty))).get(0).m37365measureBRTryo0(r4);
        int c = C13265c.m30134c(this.$sheetOffset.invoke().floatValue());
        C13088o<Composer, Integer, C11921v> oVar = this.$topBar;
        if (oVar != null) {
            placeable = subcomposeMeasureScope2.subcompose(BottomSheetScaffoldLayoutSlot.TopBar, ComposableLambdaKt.composableLambdaInstance(1477114206, true, new C0703x64c48d6(oVar, this.$$dirty))).get(0).m37365measureBRTryo0(r4);
        } else {
            placeable = null;
        }
        if (placeable != null) {
            i = placeable.getHeight();
        } else {
            i = 0;
        }
        final Placeable r11 = subcomposeMeasureScope2.subcompose(BottomSheetScaffoldLayoutSlot.Body, ComposableLambdaKt.composableLambdaInstance(2078633916, true, new C0701xcc9d0b25(this.$body, this.$sheetPeekHeight, this.$$dirty))).get(0).m37365measureBRTryo0(Constraints.m38403copyZbe2FdA$default(r4, 0, 0, 0, r3 - i, 7, (Object) null));
        C13088o<Composer, Integer, C11921v> oVar2 = this.$floatingActionButton;
        if (oVar2 != null) {
            placeable2 = subcomposeMeasureScope2.subcompose(BottomSheetScaffoldLayoutSlot.Fab, oVar2).get(0).m37365measureBRTryo0(r4);
        } else {
            placeable2 = null;
        }
        if (placeable2 != null) {
            i2 = placeable2.getWidth();
        } else {
            i2 = 0;
        }
        if (placeable2 != null) {
            i3 = placeable2.getHeight();
        } else {
            i3 = 0;
        }
        if (FabPosition.m34020equalsimpl0(this.$floatingActionButtonPosition, FabPosition.Companion.m34024getCenter5ygKITE())) {
            i4 = (r2 - i2) / 2;
        } else {
            i4 = (r2 - i2) - subcomposeMeasureScope2.m38443roundToPx0680j_4(BottomSheetScaffoldKt.FabSpacing);
        }
        final int i7 = i4;
        int i8 = i3 / 2;
        if (subcomposeMeasureScope2.m38449toPx0680j_4(this.$sheetPeekHeight) < ((float) i8)) {
            i5 = (c - i3) - subcomposeMeasureScope2.m38443roundToPx0680j_4(BottomSheetScaffoldKt.FabSpacing);
        } else {
            i5 = c - i8;
        }
        final int i9 = i5;
        final Placeable r19 = subcomposeMeasureScope2.subcompose(BottomSheetScaffoldLayoutSlot.Snackbar, this.$snackbarHost).get(0).m37365measureBRTryo0(r4);
        int width = (r2 - r19.getWidth()) / 2;
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.$sheetState.getCurrentValue().ordinal()];
        if (i10 == 1) {
            i6 = i9 - r19.getHeight();
        } else if (i10 == 2) {
            i6 = r3 - r19.getHeight();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        final int i11 = i;
        final Placeable placeable3 = placeable;
        final Placeable placeable4 = r6;
        final int i12 = c;
        final int i13 = width;
        final int i14 = i6;
        return MeasureScope.layout$default(subcomposeMeasureScope, r2, r3, (Map) null, new Function1<Placeable.PlacementScope, C11921v>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C11921v.f18618a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                C12775o.m28639i(placementScope, "$this$layout");
                Placeable.PlacementScope.placeRelative$default(placementScope, r11, 0, i11, 0.0f, 4, (Object) null);
                Placeable placeable = placeable3;
                if (placeable != null) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, 0, 0.0f, 4, (Object) null);
                }
                Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, 0, i12, 0.0f, 4, (Object) null);
                Placeable placeable2 = placeable2;
                if (placeable2 != null) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i7, i9, 0.0f, 4, (Object) null);
                }
                Placeable.PlacementScope.placeRelative$default(placementScope, r19, i13, i14, 0.0f, 4, (Object) null);
            }
        }, 4, (Object) null);
    }
}
