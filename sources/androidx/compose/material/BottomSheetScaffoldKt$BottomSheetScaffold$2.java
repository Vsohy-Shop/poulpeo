package androidx.compose.material;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: BottomSheetScaffold.kt */
final class BottomSheetScaffoldKt$BottomSheetScaffold$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$changed2;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ C13089p<PaddingValues, Composer, Integer, C11921v> $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ long $drawerBackgroundColor;
    final /* synthetic */ C13089p<ColumnScope, Composer, Integer, C11921v> $drawerContent;
    final /* synthetic */ long $drawerContentColor;
    final /* synthetic */ float $drawerElevation;
    final /* synthetic */ boolean $drawerGesturesEnabled;
    final /* synthetic */ long $drawerScrimColor;
    final /* synthetic */ Shape $drawerShape;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $floatingActionButton;
    final /* synthetic */ int $floatingActionButtonPosition;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ BottomSheetScaffoldState $scaffoldState;
    final /* synthetic */ long $sheetBackgroundColor;
    final /* synthetic */ C13089p<ColumnScope, Composer, Integer, C11921v> $sheetContent;
    final /* synthetic */ long $sheetContentColor;
    final /* synthetic */ float $sheetElevation;
    final /* synthetic */ boolean $sheetGesturesEnabled;
    final /* synthetic */ float $sheetPeekHeight;
    final /* synthetic */ Shape $sheetShape;
    final /* synthetic */ C13089p<SnackbarHostState, Composer, Integer, C11921v> $snackbarHost;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $topBar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BottomSheetScaffoldKt$BottomSheetScaffold$2(C13089p<? super ColumnScope, ? super Composer, ? super Integer, C11921v> pVar, Modifier modifier, BottomSheetScaffoldState bottomSheetScaffoldState, C13088o<? super Composer, ? super Integer, C11921v> oVar, C13089p<? super SnackbarHostState, ? super Composer, ? super Integer, C11921v> pVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar2, int i, boolean z, Shape shape, float f, long j, long j2, float f2, C13089p<? super ColumnScope, ? super Composer, ? super Integer, C11921v> pVar3, boolean z2, Shape shape2, float f3, long j3, long j4, long j5, long j6, long j7, C13089p<? super PaddingValues, ? super Composer, ? super Integer, C11921v> pVar4, int i2, int i3, int i4, int i5) {
        super(2);
        this.$sheetContent = pVar;
        this.$modifier = modifier;
        this.$scaffoldState = bottomSheetScaffoldState;
        this.$topBar = oVar;
        this.$snackbarHost = pVar2;
        this.$floatingActionButton = oVar2;
        this.$floatingActionButtonPosition = i;
        this.$sheetGesturesEnabled = z;
        this.$sheetShape = shape;
        this.$sheetElevation = f;
        this.$sheetBackgroundColor = j;
        this.$sheetContentColor = j2;
        this.$sheetPeekHeight = f2;
        this.$drawerContent = pVar3;
        this.$drawerGesturesEnabled = z2;
        this.$drawerShape = shape2;
        this.$drawerElevation = f3;
        this.$drawerBackgroundColor = j3;
        this.$drawerContentColor = j4;
        this.$drawerScrimColor = j5;
        this.$backgroundColor = j6;
        this.$contentColor = j7;
        this.$content = pVar4;
        this.$$changed = i2;
        this.$$changed1 = i3;
        this.$$changed2 = i4;
        this.$$default = i5;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        Composer composer2 = composer;
        C13089p<ColumnScope, Composer, Integer, C11921v> pVar = this.$sheetContent;
        C13089p<ColumnScope, Composer, Integer, C11921v> pVar2 = pVar;
        BottomSheetScaffoldKt.m33907BottomSheetScaffoldbGncdBI(pVar2, this.$modifier, this.$scaffoldState, this.$topBar, this.$snackbarHost, this.$floatingActionButton, this.$floatingActionButtonPosition, this.$sheetGesturesEnabled, this.$sheetShape, this.$sheetElevation, this.$sheetBackgroundColor, this.$sheetContentColor, this.$sheetPeekHeight, this.$drawerContent, this.$drawerGesturesEnabled, this.$drawerShape, this.$drawerElevation, this.$drawerBackgroundColor, this.$drawerContentColor, this.$drawerScrimColor, this.$backgroundColor, this.$contentColor, this.$content, composer2, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed2), this.$$default);
    }
}
