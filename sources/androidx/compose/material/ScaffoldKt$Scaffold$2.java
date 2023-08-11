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

/* compiled from: Scaffold.kt */
final class ScaffoldKt$Scaffold$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $bottomBar;
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
    final /* synthetic */ boolean $isFloatingActionButtonDocked;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ ScaffoldState $scaffoldState;
    final /* synthetic */ C13089p<SnackbarHostState, Composer, Integer, C11921v> $snackbarHost;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $topBar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScaffoldKt$Scaffold$2(Modifier modifier, ScaffoldState scaffoldState, C13088o<? super Composer, ? super Integer, C11921v> oVar, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13089p<? super SnackbarHostState, ? super Composer, ? super Integer, C11921v> pVar, C13088o<? super Composer, ? super Integer, C11921v> oVar3, int i, boolean z, C13089p<? super ColumnScope, ? super Composer, ? super Integer, C11921v> pVar2, boolean z2, Shape shape, float f, long j, long j2, long j3, long j4, long j5, C13089p<? super PaddingValues, ? super Composer, ? super Integer, C11921v> pVar3, int i2, int i3, int i4) {
        super(2);
        this.$modifier = modifier;
        this.$scaffoldState = scaffoldState;
        this.$topBar = oVar;
        this.$bottomBar = oVar2;
        this.$snackbarHost = pVar;
        this.$floatingActionButton = oVar3;
        this.$floatingActionButtonPosition = i;
        this.$isFloatingActionButtonDocked = z;
        this.$drawerContent = pVar2;
        this.$drawerGesturesEnabled = z2;
        this.$drawerShape = shape;
        this.$drawerElevation = f;
        this.$drawerBackgroundColor = j;
        this.$drawerContentColor = j2;
        this.$drawerScrimColor = j3;
        this.$backgroundColor = j4;
        this.$contentColor = j5;
        this.$content = pVar3;
        this.$$changed = i2;
        this.$$changed1 = i3;
        this.$$default = i4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        Composer composer2 = composer;
        Modifier modifier = this.$modifier;
        Modifier modifier2 = modifier;
        ScaffoldKt.m34096Scaffold27mzLpw(modifier2, this.$scaffoldState, this.$topBar, this.$bottomBar, this.$snackbarHost, this.$floatingActionButton, this.$floatingActionButtonPosition, this.$isFloatingActionButtonDocked, this.$drawerContent, this.$drawerGesturesEnabled, this.$drawerShape, this.$drawerElevation, this.$drawerBackgroundColor, this.$drawerContentColor, this.$drawerScrimColor, this.$backgroundColor, this.$contentColor, this.$content, composer2, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
