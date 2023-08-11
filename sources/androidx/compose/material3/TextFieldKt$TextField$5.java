package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.p002ui.graphics.SolidColor;
import androidx.compose.p002ui.text.TextStyle;
import androidx.compose.p002ui.text.input.TextFieldValue;
import androidx.compose.p002ui.text.input.VisualTransformation;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: TextField.kt */
final class TextFieldKt$TextField$5 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ KeyboardActions $keyboardActions;
    final /* synthetic */ KeyboardOptions $keyboardOptions;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $label;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $leadingIcon;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ TextStyle $mergedTextStyle;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1<TextFieldValue, C11921v> $onValueChange;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $placeholder;
    final /* synthetic */ boolean $readOnly;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $supportingText;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $trailingIcon;
    final /* synthetic */ TextFieldValue $value;
    final /* synthetic */ VisualTransformation $visualTransformation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldKt$TextField$5(Modifier modifier, TextFieldColors textFieldColors, boolean z, int i, TextFieldValue textFieldValue, Function1<? super TextFieldValue, C11921v> function1, boolean z2, boolean z3, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i2, VisualTransformation visualTransformation, MutableInteractionSource mutableInteractionSource, int i3, C13088o<? super Composer, ? super Integer, C11921v> oVar, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar3, C13088o<? super Composer, ? super Integer, C11921v> oVar4, C13088o<? super Composer, ? super Integer, C11921v> oVar5, Shape shape) {
        super(2);
        this.$modifier = modifier;
        this.$colors = textFieldColors;
        this.$isError = z;
        this.$$dirty1 = i;
        this.$value = textFieldValue;
        this.$onValueChange = function1;
        this.$enabled = z2;
        this.$readOnly = z3;
        this.$mergedTextStyle = textStyle;
        this.$keyboardOptions = keyboardOptions;
        this.$keyboardActions = keyboardActions;
        this.$singleLine = z4;
        this.$maxLines = i2;
        this.$visualTransformation = visualTransformation;
        this.$interactionSource = mutableInteractionSource;
        this.$$dirty = i3;
        this.$label = oVar;
        this.$placeholder = oVar2;
        this.$leadingIcon = oVar3;
        this.$trailingIcon = oVar4;
        this.$supportingText = oVar5;
        this.$shape = shape;
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
                ComposerKt.traceEventStart(765006587, i2, -1, "androidx.compose.material3.TextField.<anonymous> (TextField.kt:322)");
            }
            Modifier modifier = this.$modifier;
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
            Modifier r3 = SizeKt.m33322defaultMinSizeVpY3zN4(modifier, textFieldDefaults.m34656getMinWidthD9Ej5fM(), textFieldDefaults.m34655getMinHeightD9Ej5fM());
            SolidColor solidColor = r1;
            TextFieldColors textFieldColors = this.$colors;
            boolean z = this.$isError;
            int i3 = this.$$dirty1;
            SolidColor solidColor2 = new SolidColor(textFieldColors.cursorColor$material3_release(z, composer2, ((i3 >> 24) & 112) | ((i3 >> 3) & 14)).getValue().m35681unboximpl(), (DefaultConstructorMarker) null);
            TextFieldValue textFieldValue = this.$value;
            Function1<TextFieldValue, C11921v> function1 = this.$onValueChange;
            boolean z2 = this.$enabled;
            boolean z3 = z2;
            boolean z4 = this.$readOnly;
            TextStyle textStyle = this.$mergedTextStyle;
            KeyboardOptions keyboardOptions = this.$keyboardOptions;
            KeyboardActions keyboardActions = this.$keyboardActions;
            boolean z5 = this.$singleLine;
            boolean z6 = z5;
            int i4 = this.$maxLines;
            boolean z7 = z2;
            VisualTransformation visualTransformation = this.$visualTransformation;
            final boolean z8 = z5;
            VisualTransformation visualTransformation2 = visualTransformation;
            final VisualTransformation visualTransformation3 = visualTransformation;
            final boolean z9 = z7;
            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            final TextFieldValue textFieldValue2 = textFieldValue;
            TextFieldValue textFieldValue3 = textFieldValue;
            Function1<TextFieldValue, C11921v> function12 = function1;
            boolean z10 = this.$isError;
            Modifier modifier2 = r3;
            C13088o<Composer, Integer, C11921v> oVar = this.$label;
            boolean z11 = z3;
            C13088o<Composer, Integer, C11921v> oVar2 = this.$placeholder;
            boolean z12 = z4;
            C13088o<Composer, Integer, C11921v> oVar3 = this.$leadingIcon;
            TextStyle textStyle2 = textStyle;
            C13088o<Composer, Integer, C11921v> oVar4 = this.$trailingIcon;
            KeyboardOptions keyboardOptions2 = keyboardOptions;
            C13088o<Composer, Integer, C11921v> oVar5 = this.$supportingText;
            KeyboardActions keyboardActions2 = keyboardActions;
            Shape shape = this.$shape;
            boolean z13 = z6;
            TextFieldColors textFieldColors2 = this.$colors;
            int i5 = i4;
            final MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
            final boolean z14 = z10;
            final C13088o<Composer, Integer, C11921v> oVar6 = oVar;
            final C13088o<Composer, Integer, C11921v> oVar7 = oVar2;
            final C13088o<Composer, Integer, C11921v> oVar8 = oVar3;
            final C13088o<Composer, Integer, C11921v> oVar9 = oVar4;
            final C13088o<Composer, Integer, C11921v> oVar10 = oVar5;
            final Shape shape2 = shape;
            final TextFieldColors textFieldColors3 = textFieldColors2;
            final int i6 = this.$$dirty;
            final int i7 = this.$$dirty1;
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer2, 998109572, true, new C13089p<C13088o<? super Composer, ? super Integer, ? extends C11921v>, Composer, Integer, C11921v>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((C13088o<? super Composer, ? super Integer, C11921v>) (C13088o) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return C11921v.f18618a;
                }

                @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                @Composable
                public final void invoke(C13088o<? super Composer, ? super Integer, C11921v> oVar, Composer composer, int i) {
                    int i2;
                    C13088o<? super Composer, ? super Integer, C11921v> oVar2 = oVar;
                    C12775o.m28639i(oVar2, "innerTextField");
                    Composer composer2 = composer;
                    if ((i & 14) == 0) {
                        i2 = i | (composer2.changed((Object) oVar2) ? 4 : 2);
                    } else {
                        i2 = i;
                    }
                    if ((i2 & 91) != 18 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(998109572, i2, -1, "androidx.compose.material3.TextField.<anonymous>.<anonymous> (TextField.kt:342)");
                        }
                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                        String text = textFieldValue2.getText();
                        boolean z = z9;
                        boolean z2 = z8;
                        VisualTransformation visualTransformation = visualTransformation3;
                        MutableInteractionSource mutableInteractionSource = mutableInteractionSource2;
                        boolean z3 = z14;
                        C13088o<Composer, Integer, C11921v> oVar3 = oVar6;
                        C13088o<Composer, Integer, C11921v> oVar4 = oVar7;
                        C13088o<Composer, Integer, C11921v> oVar5 = oVar8;
                        C13088o<Composer, Integer, C11921v> oVar6 = oVar9;
                        C13088o<Composer, Integer, C11921v> oVar7 = oVar10;
                        int i3 = i2;
                        Shape shape = shape2;
                        TextFieldColors textFieldColors = textFieldColors3;
                        TextFieldDefaults textFieldDefaults2 = textFieldDefaults;
                        int i4 = i6;
                        int i5 = i7;
                        textFieldDefaults2.TextFieldDecorationBox(text, oVar, z, z2, visualTransformation, mutableInteractionSource, z3, oVar3, oVar4, oVar5, oVar6, oVar7, shape, textFieldColors, (PaddingValues) null, (C13088o<? super Composer, ? super Integer, C11921v>) null, composer, ((i5 >> 6) & 7168) | ((i4 >> 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ((i3 << 3) & 112) | ((i5 << 6) & 57344) | ((i5 >> 6) & 458752) | ((i5 << 15) & 3670016) | ((i4 << 3) & 29360128) | ((i4 << 3) & 234881024) | ((i4 << 3) & 1879048192), ((i4 >> 27) & 14) | 1572864 | ((i5 << 3) & 112) | ((i5 >> 18) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ((i5 >> 18) & 7168), 49152);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer.skipToGroupEnd();
                }
            });
            int i8 = this.$$dirty;
            int i9 = this.$$dirty1;
            int i10 = (i8 & 57344) | (i8 & 14) | (i8 & 112) | (i8 & 7168) | ((i9 << 9) & 3670016) | (KeyboardActions.$stable << 21) | ((i9 << 9) & 29360128) | ((i9 << 9) & 234881024) | (1879048192 & (i9 << 9));
            int i11 = ((i9 >> 6) & 14) | 24576 | ((i9 >> 15) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH);
            BasicTextFieldKt.BasicTextField(textFieldValue3, (Function1) function12, modifier2, z11, z12, textStyle2, keyboardOptions2, keyboardActions2, z13, i5, visualTransformation2, (Function1) null, mutableInteractionSource, (Brush) solidColor, (C13089p) composableLambda, composer, i10, i11, 2048);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
