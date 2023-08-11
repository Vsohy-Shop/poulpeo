package androidx.compose.material3;

import androidx.compose.material3.tokens.CheckboxTokens;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
/* compiled from: Checkbox.kt */
public final class CheckboxDefaults {
    public static final int $stable = 0;
    public static final CheckboxDefaults INSTANCE = new CheckboxDefaults();

    private CheckboxDefaults() {
    }

    @Composable
    /* renamed from: colors-5tl4gsc  reason: not valid java name */
    public final CheckboxColors m34285colors5tl4gsc(long j, long j2, long j3, long j4, long j5, long j6, Composer composer, int i, int i2) {
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        Composer composer2 = composer;
        composer2.startReplaceableGroup(-89536160);
        if ((i2 & 1) != 0) {
            j7 = ColorSchemeKt.fromToken(MaterialTheme.INSTANCE.getColorScheme(composer2, 6), CheckboxTokens.INSTANCE.getSelectedContainerColor());
        } else {
            j7 = j;
        }
        if ((i2 & 2) != 0) {
            j8 = ColorSchemeKt.fromToken(MaterialTheme.INSTANCE.getColorScheme(composer2, 6), CheckboxTokens.INSTANCE.getUnselectedOutlineColor());
        } else {
            j8 = j2;
        }
        if ((i2 & 4) != 0) {
            j9 = ColorSchemeKt.fromToken(MaterialTheme.INSTANCE.getColorScheme(composer2, 6), CheckboxTokens.INSTANCE.getSelectedIconColor());
        } else {
            j9 = j3;
        }
        if ((i2 & 8) != 0) {
            j10 = Color.m35670copywmQWz5c$default(ColorSchemeKt.fromToken(MaterialTheme.INSTANCE.getColorScheme(composer2, 6), CheckboxTokens.INSTANCE.getSelectedDisabledContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j10 = j4;
        }
        if ((i2 & 16) != 0) {
            j11 = Color.m35670copywmQWz5c$default(ColorSchemeKt.fromToken(MaterialTheme.INSTANCE.getColorScheme(composer2, 6), CheckboxTokens.INSTANCE.getUnselectedDisabledOutlineColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        } else {
            j11 = j5;
        }
        if ((i2 & 32) != 0) {
            j12 = j10;
        } else {
            j12 = j6;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-89536160, i, -1, "androidx.compose.material3.CheckboxDefaults.colors (Checkbox.kt:195)");
        }
        CheckboxColors checkboxColors = new CheckboxColors(j9, Color.m35670copywmQWz5c$default(j9, 0.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null), j7, Color.m35670copywmQWz5c$default(j7, 0.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null), j10, Color.m35670copywmQWz5c$default(j11, 0.0f, 0.0f, 0.0f, 0.0f, 14, (Object) null), j12, j7, j8, j10, j12, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return checkboxColors;
    }
}
