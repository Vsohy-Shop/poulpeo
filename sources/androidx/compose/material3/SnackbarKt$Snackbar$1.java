package androidx.compose.material3;

import androidx.compose.material3.tokens.SnackbarTokens;
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
    final /* synthetic */ long $actionContentColor;
    final /* synthetic */ boolean $actionOnNewLine;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $content;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $dismissAction;
    final /* synthetic */ long $dismissActionContentColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnackbarKt$Snackbar$1(C13088o<? super Composer, ? super Integer, C11921v> oVar, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar3, long j, long j2, int i, boolean z) {
        super(2);
        this.$action = oVar;
        this.$content = oVar2;
        this.$dismissAction = oVar3;
        this.$actionContentColor = j;
        this.$dismissActionContentColor = j2;
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
                ComposerKt.traceEventStart(-1829663446, i, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:109)");
            }
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            Typography typography = materialTheme.getTypography(composer, 6);
            SnackbarTokens snackbarTokens = SnackbarTokens.INSTANCE;
            TextStyle fromToken = TypographyKt.fromToken(typography, snackbarTokens.getSupportingTextFont());
            final TextStyle fromToken2 = TypographyKt.fromToken(materialTheme.getTypography(composer, 6), snackbarTokens.getActionLabelTextFont());
            ProvidedValue[] providedValueArr = {TextKt.getLocalTextStyle().provides(fromToken)};
            final C13088o<Composer, Integer, C11921v> oVar = this.$action;
            final C13088o<Composer, Integer, C11921v> oVar2 = this.$content;
            final C13088o<Composer, Integer, C11921v> oVar3 = this.$dismissAction;
            final long j = this.$actionContentColor;
            final long j2 = this.$dismissActionContentColor;
            final int i2 = this.$$dirty;
            final boolean z = this.$actionOnNewLine;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, (C13088o<? super Composer, ? super Integer, C11921v>) ComposableLambdaKt.composableLambda(composer, 835891690, true, new C13088o<Composer, Integer, C11921v>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C11921v.f18618a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer, int i) {
                    if ((i & 11) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(835891690, i, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:112)");
                        }
                        if (oVar == null) {
                            composer.startReplaceableGroup(-2104362770);
                            C13088o<Composer, Integer, C11921v> oVar = oVar2;
                            C13088o<Composer, Integer, C11921v> oVar2 = oVar3;
                            TextStyle textStyle = fromToken2;
                            long j = j;
                            long j2 = j2;
                            int i2 = i2;
                            Composer composer2 = composer;
                            SnackbarKt.m34571OneRowSnackbarkKq0p4A(oVar, (C13088o<? super Composer, ? super Integer, C11921v>) null, oVar2, textStyle, j, j2, composer2, (57344 & (i2 >> 9)) | ((i2 >> 27) & 14) | 48 | (i2 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ((i2 >> 9) & 458752));
                            composer.endReplaceableGroup();
                        } else if (z) {
                            composer.startReplaceableGroup(-2104362456);
                            C13088o<Composer, Integer, C11921v> oVar3 = oVar2;
                            C13088o<Composer, Integer, C11921v> oVar4 = oVar;
                            C13088o<Composer, Integer, C11921v> oVar5 = oVar3;
                            TextStyle textStyle2 = fromToken2;
                            long j3 = j;
                            long j4 = j2;
                            int i3 = i2;
                            Composer composer3 = composer;
                            SnackbarKt.m34570NewLineButtonSnackbarkKq0p4A(oVar3, oVar4, oVar5, textStyle2, j3, j4, composer3, (57344 & (i3 >> 9)) | ((i3 >> 27) & 14) | (i3 & 112) | (i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ((i3 >> 9) & 458752));
                            composer.endReplaceableGroup();
                        } else {
                            composer.startReplaceableGroup(-2104362176);
                            C13088o<Composer, Integer, C11921v> oVar6 = oVar2;
                            C13088o<Composer, Integer, C11921v> oVar7 = oVar;
                            C13088o<Composer, Integer, C11921v> oVar8 = oVar3;
                            TextStyle textStyle3 = fromToken2;
                            long j5 = j;
                            long j6 = j2;
                            int i4 = i2;
                            Composer composer4 = composer;
                            SnackbarKt.m34571OneRowSnackbarkKq0p4A(oVar6, oVar7, oVar8, textStyle3, j5, j6, composer4, (57344 & (i4 >> 9)) | ((i4 >> 27) & 14) | (i4 & 112) | (i4 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ((i4 >> 9) & 458752));
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
