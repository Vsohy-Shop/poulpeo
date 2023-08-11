package androidx.compose.material;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: BottomSheetScaffold.kt */
final class BottomSheetScaffoldKt$BottomSheetScaffold$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $child;
    final /* synthetic */ long $drawerBackgroundColor;
    final /* synthetic */ C13089p<ColumnScope, Composer, Integer, C11921v> $drawerContent;
    final /* synthetic */ long $drawerContentColor;
    final /* synthetic */ float $drawerElevation;
    final /* synthetic */ boolean $drawerGesturesEnabled;
    final /* synthetic */ long $drawerScrimColor;
    final /* synthetic */ Shape $drawerShape;
    final /* synthetic */ BottomSheetScaffoldState $scaffoldState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BottomSheetScaffoldKt$BottomSheetScaffold$1(C13089p<? super ColumnScope, ? super Composer, ? super Integer, C11921v> pVar, C13088o<? super Composer, ? super Integer, C11921v> oVar, BottomSheetScaffoldState bottomSheetScaffoldState, boolean z, Shape shape, float f, long j, long j2, long j3, int i) {
        super(2);
        this.$drawerContent = pVar;
        this.$child = oVar;
        this.$scaffoldState = bottomSheetScaffoldState;
        this.$drawerGesturesEnabled = z;
        this.$drawerShape = shape;
        this.$drawerElevation = f;
        this.$drawerBackgroundColor = j;
        this.$drawerContentColor = j2;
        this.$drawerScrimColor = j3;
        this.$$dirty1 = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i) {
        Composer composer2 = composer;
        int i2 = i;
        if ((i2 & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1273816607, i2, -1, "androidx.compose.material.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:379)");
            }
            if (this.$drawerContent == null) {
                composer2.startReplaceableGroup(-249544811);
                this.$child.invoke(composer2, 6);
                composer.endReplaceableGroup();
            } else {
                composer2.startReplaceableGroup(-249544774);
                C13089p<ColumnScope, Composer, Integer, C11921v> pVar = this.$drawerContent;
                DrawerState drawerState = this.$scaffoldState.getDrawerState();
                boolean z = this.$drawerGesturesEnabled;
                Shape shape = this.$drawerShape;
                float f = this.$drawerElevation;
                long j = this.$drawerBackgroundColor;
                long j2 = this.$drawerContentColor;
                long j3 = this.$drawerScrimColor;
                C13088o<Composer, Integer, C11921v> oVar = this.$child;
                int i3 = this.$$dirty1;
                DrawerKt.m33995ModalDrawerGs3lGvM(pVar, (Modifier) null, drawerState, z, shape, f, j, j2, j3, oVar, composer, ((i3 >> 9) & 14) | 805306368 | ((i3 >> 3) & 7168) | ((i3 >> 3) & 57344) | ((i3 >> 3) & 458752) | ((i3 >> 3) & 3670016) | ((i3 >> 3) & 29360128) | ((i3 >> 3) & 234881024), 2);
                composer.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
