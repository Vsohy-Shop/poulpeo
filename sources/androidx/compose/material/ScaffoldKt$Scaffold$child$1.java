package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: Scaffold.kt */
final class ScaffoldKt$Scaffold$child$1 extends C12777p implements C13089p<Modifier, Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $bottomBar;
    final /* synthetic */ C13089p<PaddingValues, Composer, Integer, C11921v> $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $floatingActionButton;
    final /* synthetic */ int $floatingActionButtonPosition;
    final /* synthetic */ boolean $isFloatingActionButtonDocked;
    final /* synthetic */ ScaffoldState $scaffoldState;
    final /* synthetic */ C13089p<SnackbarHostState, Composer, Integer, C11921v> $snackbarHost;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $topBar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScaffoldKt$Scaffold$child$1(long j, long j2, int i, boolean z, int i2, C13088o<? super Composer, ? super Integer, C11921v> oVar, C13089p<? super PaddingValues, ? super Composer, ? super Integer, C11921v> pVar, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar3, int i3, C13089p<? super SnackbarHostState, ? super Composer, ? super Integer, C11921v> pVar2, ScaffoldState scaffoldState) {
        super(3);
        this.$backgroundColor = j;
        this.$contentColor = j2;
        this.$$dirty1 = i;
        this.$isFloatingActionButtonDocked = z;
        this.$floatingActionButtonPosition = i2;
        this.$topBar = oVar;
        this.$content = pVar;
        this.$floatingActionButton = oVar2;
        this.$bottomBar = oVar3;
        this.$$dirty = i3;
        this.$snackbarHost = pVar2;
        this.$scaffoldState = scaffoldState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
        return C11921v.f18618a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2 = modifier;
        Composer composer2 = composer;
        C12775o.m28639i(modifier2, "childModifier");
        if ((i & 14) == 0) {
            i2 = i | (composer2.changed((Object) modifier2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1823402604, i2, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:178)");
            }
            long j = this.$backgroundColor;
            long j2 = this.$contentColor;
            final boolean z = this.$isFloatingActionButtonDocked;
            final int i3 = this.$floatingActionButtonPosition;
            final C13088o<Composer, Integer, C11921v> oVar = this.$topBar;
            C13089p<PaddingValues, Composer, Integer, C11921v> pVar = this.$content;
            C13088o<Composer, Integer, C11921v> oVar2 = this.$floatingActionButton;
            C13088o<Composer, Integer, C11921v> oVar3 = this.$bottomBar;
            int i4 = this.$$dirty;
            long j3 = j;
            C07661 r4 = r11;
            final C13089p<PaddingValues, Composer, Integer, C11921v> pVar2 = pVar;
            final C13088o<Composer, Integer, C11921v> oVar4 = oVar2;
            final C13088o<Composer, Integer, C11921v> oVar5 = oVar3;
            final int i5 = i4;
            final int i6 = this.$$dirty1;
            final C13089p<SnackbarHostState, Composer, Integer, C11921v> pVar3 = this.$snackbarHost;
            final ScaffoldState scaffoldState = this.$scaffoldState;
            C07661 r11 = new C13088o<Composer, Integer, C11921v>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C11921v.f18618a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer, int i) {
                    if ((i & 11) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1128984656, i, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous> (Scaffold.kt:179)");
                        }
                        boolean z = z;
                        int i2 = i3;
                        C13088o<Composer, Integer, C11921v> oVar = oVar;
                        C13089p<PaddingValues, Composer, Integer, C11921v> pVar = pVar2;
                        final C13089p<SnackbarHostState, Composer, Integer, C11921v> pVar2 = pVar3;
                        final ScaffoldState scaffoldState = scaffoldState;
                        final int i3 = i5;
                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer, 533782017, true, new C13088o<Composer, Integer, C11921v>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return C11921v.f18618a;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(Composer composer, int i) {
                                if ((i & 11) != 2 || !composer.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(533782017, i, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:185)");
                                    }
                                    pVar2.invoke(scaffoldState.getSnackbarHostState(), composer, Integer.valueOf((i3 >> 9) & 112));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer.skipToGroupEnd();
                            }
                        });
                        C13088o<Composer, Integer, C11921v> oVar2 = oVar4;
                        C13088o<Composer, Integer, C11921v> oVar3 = oVar5;
                        int i4 = i5;
                        ScaffoldKt.m34097ScaffoldLayoutMDYNRJg(z, i2, oVar, pVar, composableLambda, oVar2, oVar3, composer, ((i4 >> 21) & 14) | 24576 | ((i4 >> 15) & 112) | (i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ((i6 >> 12) & 7168) | (458752 & i4) | ((i4 << 9) & 3670016));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer.skipToGroupEnd();
                }
            };
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer2, -1128984656, true, r4);
            int i7 = 1572864 | (i2 & 14);
            int i8 = this.$$dirty1;
            SurfaceKt.m34127SurfaceFjzlyU(modifier, (Shape) null, j3, j2, (BorderStroke) null, 0.0f, composableLambda, composer, i7 | ((i8 >> 9) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ((i8 >> 9) & 7168), 50);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
