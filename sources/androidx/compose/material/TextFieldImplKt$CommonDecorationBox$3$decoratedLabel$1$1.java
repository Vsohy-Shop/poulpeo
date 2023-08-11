package androidx.compose.material;

import androidx.compose.p002ui.graphics.Shadow;
import androidx.compose.p002ui.text.PlatformTextStyle;
import androidx.compose.p002ui.text.TextStyle;
import androidx.compose.p002ui.text.TextStyleKt;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.font.FontStyle;
import androidx.compose.p002ui.text.font.FontSynthesis;
import androidx.compose.p002ui.text.font.FontWeight;
import androidx.compose.p002ui.text.intl.LocaleList;
import androidx.compose.p002ui.text.style.BaselineShift;
import androidx.compose.p002ui.text.style.Hyphens;
import androidx.compose.p002ui.text.style.LineBreak;
import androidx.compose.p002ui.text.style.LineHeightStyle;
import androidx.compose.p002ui.text.style.TextAlign;
import androidx.compose.p002ui.text.style.TextDecoration;
import androidx.compose.p002ui.text.style.TextDirection;
import androidx.compose.p002ui.text.style.TextGeometricTransform;
import androidx.compose.p002ui.text.style.TextIndent;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: TextFieldImpl.kt */
final class TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $it;
    final /* synthetic */ long $labelContentColor;
    final /* synthetic */ float $labelProgress;
    final /* synthetic */ long $labelTextStyleColor;
    final /* synthetic */ boolean $shouldOverrideTextStyleColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1(float f, long j, C13088o<? super Composer, ? super Integer, C11921v> oVar, int i, boolean z, long j2) {
        super(2);
        this.$labelProgress = f;
        this.$labelContentColor = j;
        this.$it = oVar;
        this.$$dirty = i;
        this.$shouldOverrideTextStyleColor = z;
        this.$labelTextStyleColor = j2;
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
                ComposerKt.traceEventStart(362863774, i2, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:121)");
            }
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            TextStyle lerp = TextStyleKt.lerp(materialTheme.getTypography(composer2, 6).getSubtitle1(), materialTheme.getTypography(composer2, 6).getCaption(), this.$labelProgress);
            TextFieldImplKt.m34190DecorationeuL9pac(this.$labelContentColor, this.$shouldOverrideTextStyleColor ? TextStyle.m37983copyCXVQc50$default(lerp, this.$labelTextStyleColor, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, 4194302, (Object) null) : lerp, (Float) null, this.$it, composer, ((this.$$dirty >> 6) & 14) | 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
