package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.p002ui.text.TextStyle;
import androidx.compose.p002ui.text.input.TextFieldValue;
import androidx.compose.p002ui.text.input.VisualTransformation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: OutlinedTextField.kt */
final class OutlinedTextFieldKt$OutlinedTextField$10 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ KeyboardActions $keyboardActions;
    final /* synthetic */ KeyboardOptions $keyboardOptions;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $label;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $leadingIcon;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ int $minLines;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1<TextFieldValue, C11921v> $onValueChange;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $placeholder;
    final /* synthetic */ boolean $readOnly;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ TextStyle $textStyle;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $trailingIcon;
    final /* synthetic */ TextFieldValue $value;
    final /* synthetic */ VisualTransformation $visualTransformation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OutlinedTextFieldKt$OutlinedTextField$10(TextFieldValue textFieldValue, Function1<? super TextFieldValue, C11921v> function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, C13088o<? super Composer, ? super Integer, C11921v> oVar, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar3, C13088o<? super Composer, ? super Integer, C11921v> oVar4, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, int i3, int i4, int i5) {
        super(2);
        this.$value = textFieldValue;
        this.$onValueChange = function1;
        this.$modifier = modifier;
        this.$enabled = z;
        this.$readOnly = z2;
        this.$textStyle = textStyle;
        this.$label = oVar;
        this.$placeholder = oVar2;
        this.$leadingIcon = oVar3;
        this.$trailingIcon = oVar4;
        this.$isError = z3;
        this.$visualTransformation = visualTransformation;
        this.$keyboardOptions = keyboardOptions;
        this.$keyboardActions = keyboardActions;
        this.$singleLine = z4;
        this.$maxLines = i;
        this.$minLines = i2;
        this.$interactionSource = mutableInteractionSource;
        this.$shape = shape;
        this.$colors = textFieldColors;
        this.$$changed = i3;
        this.$$changed1 = i4;
        this.$$default = i5;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        Composer composer2 = composer;
        TextFieldValue textFieldValue = this.$value;
        TextFieldValue textFieldValue2 = textFieldValue;
        OutlinedTextFieldKt.OutlinedTextField(textFieldValue2, (Function1<? super TextFieldValue, C11921v>) this.$onValueChange, this.$modifier, this.$enabled, this.$readOnly, this.$textStyle, (C13088o<? super Composer, ? super Integer, C11921v>) this.$label, (C13088o<? super Composer, ? super Integer, C11921v>) this.$placeholder, (C13088o<? super Composer, ? super Integer, C11921v>) this.$leadingIcon, (C13088o<? super Composer, ? super Integer, C11921v>) this.$trailingIcon, this.$isError, this.$visualTransformation, this.$keyboardOptions, this.$keyboardActions, this.$singleLine, this.$maxLines, this.$minLines, this.$interactionSource, this.$shape, this.$colors, composer2, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
