package androidx.compose.material.ripple;

import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.ColorKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;

/* compiled from: RippleTheme.kt */
public interface RippleTheme {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: RippleTheme.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* renamed from: defaultRippleAlpha-DxMtmZc  reason: not valid java name */
        public final RippleAlpha m34237defaultRippleAlphaDxMtmZc(long j, boolean z) {
            if (!z) {
                return RippleThemeKt.DarkThemeRippleAlpha;
            }
            if (((double) ColorKt.m35723luminance8_81llA(j)) > 0.5d) {
                return RippleThemeKt.LightThemeHighContrastRippleAlpha;
            }
            return RippleThemeKt.LightThemeLowContrastRippleAlpha;
        }

        /* renamed from: defaultRippleColor-5vOe2sY  reason: not valid java name */
        public final long m34238defaultRippleColor5vOe2sY(long j, boolean z) {
            float r0 = ColorKt.m35723luminance8_81llA(j);
            if (z || ((double) r0) >= 0.5d) {
                return j;
            }
            return Color.Companion.m35708getWhite0d7_KjU();
        }
    }

    @Composable
    /* renamed from: defaultColor-WaAFU9c  reason: not valid java name */
    long m34236defaultColorWaAFU9c(Composer composer, int i);

    @Composable
    RippleAlpha rippleAlpha(Composer composer, int i);
}
