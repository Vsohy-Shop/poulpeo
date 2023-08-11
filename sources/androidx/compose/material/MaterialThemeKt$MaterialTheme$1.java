package androidx.compose.material;

import androidx.compose.p002ui.text.TextStyle;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: MaterialTheme.kt */
final class MaterialThemeKt$MaterialTheme$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $content;
    final /* synthetic */ Typography $typography;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MaterialThemeKt$MaterialTheme$1(Typography typography, C13088o<? super Composer, ? super Integer, C11921v> oVar, int i) {
        super(2);
        this.$typography = typography;
        this.$content = oVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    @Composable
    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1740102967, i, -1, "androidx.compose.material.MaterialTheme.<anonymous> (MaterialTheme.kt:79)");
            }
            TextStyle body1 = this.$typography.getBody1();
            final C13088o<Composer, Integer, C11921v> oVar = this.$content;
            final int i2 = this.$$dirty;
            TextKt.ProvideTextStyle(body1, ComposableLambdaKt.composableLambda(composer, 181426554, true, new C13088o<Composer, Integer, C11921v>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C11921v.f18618a;
                }

                @Composable
                public final void invoke(Composer composer, int i) {
                    if ((i & 11) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(181426554, i, -1, "androidx.compose.material.MaterialTheme.<anonymous>.<anonymous> (MaterialTheme.kt:80)");
                        }
                        MaterialTheme_androidKt.PlatformMaterialTheme(oVar, composer, (i2 >> 9) & 14);
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
