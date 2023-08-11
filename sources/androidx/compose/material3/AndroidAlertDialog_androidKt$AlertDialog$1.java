package androidx.compose.material3;

import androidx.compose.material3.tokens.DialogTokens;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.p002ui.semantics.SemanticsModifierKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: AndroidAlertDialog.android.kt */
final class AndroidAlertDialog_androidKt$AlertDialog$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $confirmButton;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $dismissButton;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $icon;
    final /* synthetic */ long $iconContentColor;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $text;
    final /* synthetic */ long $textContentColor;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $title;
    final /* synthetic */ long $titleContentColor;
    final /* synthetic */ float $tonalElevation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidAlertDialog_androidKt$AlertDialog$1(Modifier modifier, C13088o<? super Composer, ? super Integer, C11921v> oVar, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar3, Shape shape, long j, float f, long j2, long j3, long j4, int i, int i2, C13088o<? super Composer, ? super Integer, C11921v> oVar4, C13088o<? super Composer, ? super Integer, C11921v> oVar5) {
        super(2);
        this.$modifier = modifier;
        this.$icon = oVar;
        this.$title = oVar2;
        this.$text = oVar3;
        this.$shape = shape;
        this.$containerColor = j;
        this.$tonalElevation = f;
        this.$iconContentColor = j2;
        this.$titleContentColor = j3;
        this.$textContentColor = j4;
        this.$$dirty = i;
        this.$$dirty1 = i2;
        this.$dismissButton = oVar4;
        this.$confirmButton = oVar5;
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
                ComposerKt.traceEventStart(-1218806937, i2, -1, "androidx.compose.material3.AlertDialog.<anonymous> (AndroidAlertDialog.android.kt:92)");
            }
            String r2 = Strings_androidKt.m34594getStringNWtq28(Strings.Companion.m34587getDialogadMyvUU(), composer2, 6);
            final C13088o<Composer, Integer, C11921v> oVar = this.$dismissButton;
            final int i3 = this.$$dirty;
            final C13088o<Composer, Integer, C11921v> oVar2 = this.$confirmButton;
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer2, 2094788745, true, new C13088o<Composer, Integer, C11921v>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C11921v.f18618a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer, int i) {
                    if ((i & 11) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2094788745, i, -1, "androidx.compose.material3.AlertDialog.<anonymous>.<anonymous> (AndroidAlertDialog.android.kt:95)");
                        }
                        float access$getButtonsMainAxisSpacing$p = AndroidAlertDialog_androidKt.ButtonsMainAxisSpacing;
                        float access$getButtonsCrossAxisSpacing$p = AndroidAlertDialog_androidKt.ButtonsCrossAxisSpacing;
                        final C13088o<Composer, Integer, C11921v> oVar = oVar;
                        final int i2 = i3;
                        final C13088o<Composer, Integer, C11921v> oVar2 = oVar2;
                        AlertDialogKt.m34244AlertDialogFlowRowixp7dh8(access$getButtonsMainAxisSpacing$p, access$getButtonsCrossAxisSpacing$p, ComposableLambdaKt.composableLambda(composer, -1243689536, true, new C13088o<Composer, Integer, C11921v>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return C11921v.f18618a;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(Composer composer, int i) {
                                if ((i & 11) != 2 || !composer.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1243689536, i, -1, "androidx.compose.material3.AlertDialog.<anonymous>.<anonymous>.<anonymous> (AndroidAlertDialog.android.kt:99)");
                                    }
                                    C13088o<Composer, Integer, C11921v> oVar = oVar;
                                    composer.startReplaceableGroup(-1969500760);
                                    if (oVar != null) {
                                        oVar.invoke(composer, Integer.valueOf((i2 >> 9) & 14));
                                        C11921v vVar = C11921v.f18618a;
                                    }
                                    composer.endReplaceableGroup();
                                    oVar2.invoke(composer, Integer.valueOf((i2 >> 3) & 14));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer.skipToGroupEnd();
                            }
                        }), composer, 438);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer.skipToGroupEnd();
                }
            });
            Modifier modifier = this.$modifier;
            Modifier.Companion companion = Modifier.Companion;
            composer2.startReplaceableGroup(1157296644);
            boolean changed = composer2.changed((Object) r2);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new AndroidAlertDialog_androidKt$AlertDialog$1$2$1(r2);
                composer2.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            Modifier then = modifier.then(SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, (Object) null));
            C13088o<Composer, Integer, C11921v> oVar3 = this.$icon;
            C13088o<Composer, Integer, C11921v> oVar4 = this.$title;
            C13088o<Composer, Integer, C11921v> oVar5 = this.$text;
            Shape shape = this.$shape;
            long j = this.$containerColor;
            float f = this.$tonalElevation;
            long color = ColorSchemeKt.toColor(DialogTokens.INSTANCE.getActionLabelTextColor(), composer2, 6);
            long j2 = this.$iconContentColor;
            long j3 = this.$titleContentColor;
            Modifier modifier2 = then;
            long j4 = this.$textContentColor;
            int i4 = this.$$dirty;
            C13088o<Composer, Integer, C11921v> oVar6 = oVar3;
            int i5 = ((i4 >> 6) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | 6 | ((i4 >> 6) & 7168) | ((i4 >> 6) & 57344) | ((i4 >> 6) & 458752) | ((i4 >> 6) & 3670016);
            int i6 = this.$$dirty1;
            int i7 = i5 | ((i6 << 15) & 29360128) | (i4 & 1879048192);
            int i8 = (i6 & 14) | (i6 & 112);
            AlertDialogKt.m34243AlertDialogContent4hvqGtA(composableLambda, modifier2, oVar6, oVar4, oVar5, shape, j, f, color, j2, j3, j4, composer, i7, i8, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
