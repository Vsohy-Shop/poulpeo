package androidx.compose.material3;

import androidx.compose.material3.tokens.NavigationBarTokens;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.text.TextStyle;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: NavigationBar.kt */
final class NavigationBarKt$NavigationBarItem$styledLabel$1$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ NavigationBarItemColors $colors;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $label;
    final /* synthetic */ boolean $selected;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NavigationBarKt$NavigationBarItem$styledLabel$1$1(NavigationBarItemColors navigationBarItemColors, boolean z, int i, C13088o<? super Composer, ? super Integer, C11921v> oVar) {
        super(2);
        this.$colors = navigationBarItemColors;
        this.$selected = z;
        this.$$dirty = i;
        this.$label = oVar;
    }

    /* renamed from: invoke$lambda-0  reason: not valid java name */
    private static final long m34508invoke$lambda0(State<Color> state) {
        return state.getValue().m35681unboximpl();
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
                ComposerKt.traceEventStart(1644987592, i, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:180)");
            }
            final TextStyle fromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer, 6), NavigationBarTokens.INSTANCE.getLabelTextFont());
            NavigationBarItemColors navigationBarItemColors = this.$colors;
            boolean z = this.$selected;
            int i2 = this.$$dirty;
            ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m35661boximpl(m34508invoke$lambda0(navigationBarItemColors.textColor$material3_release(z, composer, ((i2 >> 21) & 112) | ((i2 >> 3) & 14)))))};
            final C13088o<Composer, Integer, C11921v> oVar = this.$label;
            final int i3 = this.$$dirty;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, (C13088o<? super Composer, ? super Integer, C11921v>) ComposableLambdaKt.composableLambda(composer, 2061683080, true, new C13088o<Composer, Integer, C11921v>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C11921v.f18618a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer, int i) {
                    if ((i & 11) != 2 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2061683080, i, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous>.<anonymous> (NavigationBar.kt:183)");
                        }
                        TextKt.ProvideTextStyle(fromToken, oVar, composer, (i3 >> 15) & 112);
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
