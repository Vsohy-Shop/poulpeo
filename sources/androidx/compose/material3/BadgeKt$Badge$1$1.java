package androidx.compose.material3;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.tokens.BadgeTokens;
import androidx.compose.p002ui.text.TextStyle;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: Badge.kt */
final class BadgeKt$Badge$1$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty$1;
    final /* synthetic */ C13089p<RowScope, Composer, Integer, C11921v> $content;
    final /* synthetic */ RowScope $this_Row;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BadgeKt$Badge$1$1(C13089p<? super RowScope, ? super Composer, ? super Integer, C11921v> pVar, RowScope rowScope, int i, int i2) {
        super(2);
        this.$content = pVar;
        this.$this_Row = rowScope;
        this.$$dirty = i;
        this.$$dirty$1 = i2;
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
                ComposerKt.traceEventStart(5609066, i, -1, "androidx.compose.material3.Badge.<anonymous>.<anonymous> (Badge.kt:172)");
            }
            TextStyle copyAndSetFontPadding = IncludeFontPaddingHelper_androidKt.copyAndSetFontPadding(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer, 6), BadgeTokens.INSTANCE.getLargeLabelTextFont()), false);
            final C13089p<RowScope, Composer, Integer, C11921v> pVar = this.$content;
            final RowScope rowScope = this.$this_Row;
            final int i2 = this.$$dirty;
            final int i3 = this.$$dirty$1;
            TextKt.ProvideTextStyle(copyAndSetFontPadding, ComposableLambdaKt.composableLambda(composer, -1175098791, true, new C13088o<Composer, Integer, C11921v>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C11921v.f18618a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer, int i) {
                    if ((i & 11) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1175098791, i, -1, "androidx.compose.material3.Badge.<anonymous>.<anonymous>.<anonymous> (Badge.kt:179)");
                        }
                        pVar.invoke(rowScope, composer, Integer.valueOf((i2 & 14) | ((i3 >> 6) & 112)));
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
}
