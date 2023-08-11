package androidx.compose.material3;

import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.p002ui.text.TextStyle;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12775o;

/* compiled from: Typography.kt */
public final class TypographyKt {
    private static final ProvidableCompositionLocal<Typography> LocalTypography = CompositionLocalKt.staticCompositionLocalOf(TypographyKt$LocalTypography$1.INSTANCE);

    /* compiled from: Typography.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TypographyKeyTokens.values().length];
            iArr[TypographyKeyTokens.DisplayLarge.ordinal()] = 1;
            iArr[TypographyKeyTokens.DisplayMedium.ordinal()] = 2;
            iArr[TypographyKeyTokens.DisplaySmall.ordinal()] = 3;
            iArr[TypographyKeyTokens.HeadlineLarge.ordinal()] = 4;
            iArr[TypographyKeyTokens.HeadlineMedium.ordinal()] = 5;
            iArr[TypographyKeyTokens.HeadlineSmall.ordinal()] = 6;
            iArr[TypographyKeyTokens.TitleLarge.ordinal()] = 7;
            iArr[TypographyKeyTokens.TitleMedium.ordinal()] = 8;
            iArr[TypographyKeyTokens.TitleSmall.ordinal()] = 9;
            iArr[TypographyKeyTokens.BodyLarge.ordinal()] = 10;
            iArr[TypographyKeyTokens.BodyMedium.ordinal()] = 11;
            iArr[TypographyKeyTokens.BodySmall.ordinal()] = 12;
            iArr[TypographyKeyTokens.LabelLarge.ordinal()] = 13;
            iArr[TypographyKeyTokens.LabelMedium.ordinal()] = 14;
            iArr[TypographyKeyTokens.LabelSmall.ordinal()] = 15;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final TextStyle fromToken(Typography typography, TypographyKeyTokens typographyKeyTokens) {
        C12775o.m28639i(typography, "<this>");
        C12775o.m28639i(typographyKeyTokens, "value");
        switch (WhenMappings.$EnumSwitchMapping$0[typographyKeyTokens.ordinal()]) {
            case 1:
                return typography.getDisplayLarge();
            case 2:
                return typography.getDisplayMedium();
            case 3:
                return typography.getDisplaySmall();
            case 4:
                return typography.getHeadlineLarge();
            case 5:
                return typography.getHeadlineMedium();
            case 6:
                return typography.getHeadlineSmall();
            case 7:
                return typography.getTitleLarge();
            case 8:
                return typography.getTitleMedium();
            case 9:
                return typography.getTitleSmall();
            case 10:
                return typography.getBodyLarge();
            case 11:
                return typography.getBodyMedium();
            case 12:
                return typography.getBodySmall();
            case 13:
                return typography.getLabelLarge();
            case 14:
                return typography.getLabelMedium();
            case 15:
                return typography.getLabelSmall();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final ProvidableCompositionLocal<Typography> getLocalTypography() {
        return LocalTypography;
    }
}
