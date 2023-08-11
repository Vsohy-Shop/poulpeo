package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ArrowDropDownKt;
import androidx.compose.material3.tokens.FilledAutocompleteTokens;
import androidx.compose.material3.tokens.OutlinedAutocompleteTokens;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.draw.RotateKt;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.vector.ImageVector;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
@ExperimentalMaterial3Api
/* compiled from: ExposedDropdownMenu.kt */
public final class ExposedDropdownMenuDefaults {
    public static final int $stable = 0;
    public static final ExposedDropdownMenuDefaults INSTANCE = new ExposedDropdownMenuDefaults();
    private static final PaddingValues ItemContentPadding = PaddingKt.m33262PaddingValuesYgX7TsA(ExposedDropdownMenuKt.ExposedDropdownMenuItemHorizontalPadding, C1232Dp.m38468constructorimpl((float) 0));

    private ExposedDropdownMenuDefaults() {
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @ExperimentalMaterial3Api
    @Composable
    public final void TrailingIcon(boolean z, Composer composer, int i) {
        int i2;
        float f;
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-1803742020);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(z)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1803742020, i, -1, "androidx.compose.material3.ExposedDropdownMenuDefaults.TrailingIcon (ExposedDropdownMenu.kt:298)");
            }
            ImageVector arrowDropDown = ArrowDropDownKt.getArrowDropDown(Icons.Filled.INSTANCE);
            Modifier.Companion companion = Modifier.Companion;
            if (z) {
                f = 180.0f;
            } else {
                f = 0.0f;
            }
            IconKt.m34466Iconww6aTOc(arrowDropDown, (String) null, RotateKt.rotate(companion, f), 0, startRestartGroup, 48, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ExposedDropdownMenuDefaults$TrailingIcon$1(this, z, i));
        }
    }

    public final PaddingValues getItemContentPadding() {
        return ItemContentPadding;
    }

    @Composable
    /* renamed from: outlinedTextFieldColors-St-qZLY  reason: not valid java name */
    public final TextFieldColors m34417outlinedTextFieldColorsStqZLY(long j, long j2, long j3, long j4, long j5, TextSelectionColors textSelectionColors, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, Composer composer, int i, int i2, int i3, int i4) {
        Composer composer2 = composer;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        composer2.startReplaceableGroup(-83147315);
        long color = (i8 & 1) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer2, 6) : j;
        long r9 = (i8 & 2) != 0 ? Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j2;
        long r11 = (i8 & 4) != 0 ? Color.Companion.m35706getTransparent0d7_KjU() : j3;
        long color2 = (i8 & 8) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer2, 6) : j4;
        long color3 = (i8 & 16) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer2, 6) : j5;
        TextSelectionColors textSelectionColors2 = (i8 & 32) != 0 ? (TextSelectionColors) composer2.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long color4 = (i8 & 64) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusOutlineColor(), composer2, 6) : j6;
        long color5 = (i8 & 128) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldOutlineColor(), composer2, 6) : j7;
        long r23 = (i8 & 256) != 0 ? Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledOutlineColor(), composer2, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j8;
        long color6 = (i8 & 512) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorOutlineColor(), composer2, 6) : j9;
        long color7 = (i8 & 1024) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer2, 6) : j10;
        long color8 = (i8 & 2048) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer2, 6) : j11;
        long r31 = (i8 & 4096) != 0 ? Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j12;
        long color9 = (i8 & 8192) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer2, 6) : j13;
        long color10 = (i8 & 16384) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer2, 6) : j14;
        long color11 = (32768 & i8) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer2, 6) : j15;
        long r39 = (65536 & i8) != 0 ? Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j16;
        long color12 = (131072 & i8) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer2, 6) : j17;
        long color13 = (262144 & i8) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer2, 6) : j18;
        long color14 = (524288 & i8) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer2, 6) : j19;
        long r61 = (1048576 & i8) != 0 ? Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j20;
        long color15 = (2097152 & i8) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer2, 6) : j21;
        long color16 = (4194304 & i8) != 0 ? ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer2, 6) : j22;
        long r67 = (i8 & 8388608) != 0 ? Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j23;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-83147315, i5, i6, "androidx.compose.material3.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.kt:440)");
        }
        TextFieldColors r0 = TextFieldDefaults.INSTANCE.m34659outlinedTextFieldColorsl59Burw(color, r9, r11, color2, color3, textSelectionColors2, color4, color5, r23, color6, color7, color8, r31, color9, color10, color11, r39, color12, color13, color14, r61, color15, color16, r67, 0, 0, 0, 0, composer, (i5 & 14) | (i5 & 112) | (i5 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (i5 & 3670016) | (i5 & 29360128) | (i5 & 234881024) | (i5 & 1879048192), (i6 & 14) | (i6 & 112) | (i6 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i6 & 7168) | (i6 & 57344) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128) | (i6 & 234881024) | (i6 & 1879048192), 100663296 | (i7 & 14) | (i7 & 112) | (i7 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i7 & 7168), 251658240);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return r0;
    }

    @Composable
    /* renamed from: textFieldColors-St-qZLY  reason: not valid java name */
    public final TextFieldColors m34418textFieldColorsStqZLY(long j, long j2, long j3, long j4, long j5, TextSelectionColors textSelectionColors, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, Composer composer, int i, int i2, int i3, int i4) {
        Composer composer2 = composer;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        composer2.startReplaceableGroup(-2013303349);
        long color = (i8 & 1) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer2, 6) : j;
        long r9 = (i8 & 2) != 0 ? Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j2;
        long color2 = (i8 & 4) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer2, 6) : j3;
        long color3 = (i8 & 8) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer2, 6) : j4;
        long color4 = (i8 & 16) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer2, 6) : j5;
        TextSelectionColors textSelectionColors2 = (i8 & 32) != 0 ? (TextSelectionColors) composer2.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long color5 = (i8 & 64) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusActiveIndicatorColor(), composer2, 6) : j6;
        long color6 = (i8 & 128) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldActiveIndicatorColor(), composer2, 6) : j7;
        long r23 = (i8 & 256) != 0 ? Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledActiveIndicatorColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j8;
        long color7 = (i8 & 512) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorActiveIndicatorColor(), composer2, 6) : j9;
        long color8 = (i8 & 1024) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer2, 6) : j10;
        long color9 = (i8 & 2048) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer2, 6) : j11;
        long r31 = (i8 & 4096) != 0 ? Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledLeadingIconColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j12;
        long color10 = (i8 & 8192) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer2, 6) : j13;
        long color11 = (i8 & 16384) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer2, 6) : j14;
        long color12 = (32768 & i8) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer2, 6) : j15;
        long r39 = (65536 & i8) != 0 ? Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldDisabledTrailingIconColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j16;
        long color13 = (131072 & i8) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer2, 6) : j17;
        long color14 = (262144 & i8) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer2, 6) : j18;
        long color15 = (524288 & i8) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer2, 6) : j19;
        long color16 = (1048576 & i8) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), composer2, 6) : j20;
        long color17 = (2097152 & i8) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer2, 6) : j21;
        long color18 = (4194304 & i8) != 0 ? ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer2, 6) : j22;
        long r67 = (i8 & 8388608) != 0 ? Color.m35670copywmQWz5c$default(ColorSchemeKt.toColor(FilledAutocompleteTokens.INSTANCE.getFieldDisabledInputTextColor(), composer2, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, (Object) null) : j23;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2013303349, i5, i6, "androidx.compose.material3.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.kt:338)");
        }
        TextFieldColors r0 = TextFieldDefaults.INSTANCE.m34662textFieldColorsl59Burw(color, r9, color2, color3, color4, textSelectionColors2, color5, color6, r23, color7, color8, color9, r31, color10, color11, color12, r39, color13, color14, color15, color16, color17, color18, r67, 0, 0, 0, 0, composer, (i5 & 14) | (i5 & 112) | (i5 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (i5 & 3670016) | (i5 & 29360128) | (i5 & 234881024) | (i5 & 1879048192), (i6 & 14) | (i6 & 112) | (i6 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i6 & 7168) | (i6 & 57344) | (i6 & 458752) | (i6 & 3670016) | (i6 & 29360128) | (i6 & 234881024) | (i6 & 1879048192), 100663296 | (i7 & 14) | (i7 & 112) | (i7 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (i7 & 7168), 251658240);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return r0;
    }
}
