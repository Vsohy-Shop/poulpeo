package androidx.compose.material;

import androidx.compose.p002ui.text.TextStyle;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: Snackbar.kt */
final class SnackbarKt$Snackbar$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $action;
    final /* synthetic */ boolean $actionOnNewLine;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $content;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnackbarKt$Snackbar$1(C13088o<? super Composer, ? super Integer, C11921v> oVar, C13088o<? super Composer, ? super Integer, C11921v> oVar2, int i, boolean z) {
        super(2);
        this.$action = oVar;
        this.$content = oVar2;
        this.$$dirty = i;
        this.$actionOnNewLine = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2084221700, i, -1, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:96)");
            }
            ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer, 6)))};
            final C13088o<Composer, Integer, C11921v> oVar = this.$action;
            final C13088o<Composer, Integer, C11921v> oVar2 = this.$content;
            final int i2 = this.$$dirty;
            final boolean z = this.$actionOnNewLine;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, (C13088o<? super Composer, ? super Integer, C11921v>) ComposableLambdaKt.composableLambda(composer, 1939362236, true, new C13088o<Composer, Integer, C11921v>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C11921v.f18618a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer, int i) {
                    if ((i & 11) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1939362236, i, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:97)");
                        }
                        TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer, 6).getBody2();
                        final C13088o<Composer, Integer, C11921v> oVar = oVar;
                        final C13088o<Composer, Integer, C11921v> oVar2 = oVar2;
                        final int i2 = i2;
                        final boolean z = z;
                        TextKt.ProvideTextStyle(body2, ComposableLambdaKt.composableLambda(composer, 225114541, true, new C13088o<Composer, Integer, C11921v>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return C11921v.f18618a;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(Composer composer, int i) {
                                if ((i & 11) != 2 || !composer.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(225114541, i, -1, "androidx.compose.material.Snackbar.<anonymous>.<anonymous>.<anonymous> (Snackbar.kt:99)");
                                    }
                                    if (oVar == null) {
                                        composer.startReplaceableGroup(59708346);
                                        SnackbarKt.TextOnlySnackbar(oVar2, composer, (i2 >> 21) & 14);
                                        composer.endReplaceableGroup();
                                    } else if (z) {
                                        composer.startReplaceableGroup(59708411);
                                        C13088o<Composer, Integer, C11921v> oVar = oVar2;
                                        C13088o<Composer, Integer, C11921v> oVar2 = oVar;
                                        int i2 = i2;
                                        SnackbarKt.NewLineButtonSnackbar(oVar, oVar2, composer, (i2 & 112) | ((i2 >> 21) & 14));
                                        composer.endReplaceableGroup();
                                    } else {
                                        composer.startReplaceableGroup(59708478);
                                        C13088o<Composer, Integer, C11921v> oVar3 = oVar2;
                                        C13088o<Composer, Integer, C11921v> oVar4 = oVar;
                                        int i3 = i2;
                                        SnackbarKt.OneRowSnackbar(oVar3, oVar4, composer, (i3 & 112) | ((i3 >> 21) & 14));
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
                        }), composer, 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer.skipToGroupEnd();
                }
            }), composer, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
