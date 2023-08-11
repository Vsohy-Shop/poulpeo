package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.text.TextLayoutResult;
import androidx.compose.p002ui.text.TextStyle;
import androidx.compose.p002ui.text.input.ImeOptions;
import androidx.compose.p002ui.text.input.TextFieldValue;
import androidx.compose.p002ui.text.input.VisualTransformation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: CoreTextField.kt */
final class CoreTextFieldKt$CoreTextField$6 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ Brush $cursorBrush;
    final /* synthetic */ C13089p<C13088o<? super Composer, ? super Integer, C11921v>, Composer, Integer, C11921v> $decorationBox;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ ImeOptions $imeOptions;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ KeyboardActions $keyboardActions;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ int $minLines;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1<TextLayoutResult, C11921v> $onTextLayout;
    final /* synthetic */ Function1<TextFieldValue, C11921v> $onValueChange;
    final /* synthetic */ boolean $readOnly;
    final /* synthetic */ boolean $softWrap;
    final /* synthetic */ TextStyle $textStyle;
    final /* synthetic */ TextFieldValue $value;
    final /* synthetic */ VisualTransformation $visualTransformation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CoreTextFieldKt$CoreTextField$6(TextFieldValue textFieldValue, Function1<? super TextFieldValue, C11921v> function1, Modifier modifier, TextStyle textStyle, VisualTransformation visualTransformation, Function1<? super TextLayoutResult, C11921v> function12, MutableInteractionSource mutableInteractionSource, Brush brush, boolean z, int i, int i2, ImeOptions imeOptions, KeyboardActions keyboardActions, boolean z2, boolean z3, C13089p<? super C13088o<? super Composer, ? super Integer, C11921v>, ? super Composer, ? super Integer, C11921v> pVar, int i3, int i4, int i5) {
        super(2);
        this.$value = textFieldValue;
        this.$onValueChange = function1;
        this.$modifier = modifier;
        this.$textStyle = textStyle;
        this.$visualTransformation = visualTransformation;
        this.$onTextLayout = function12;
        this.$interactionSource = mutableInteractionSource;
        this.$cursorBrush = brush;
        this.$softWrap = z;
        this.$maxLines = i;
        this.$minLines = i2;
        this.$imeOptions = imeOptions;
        this.$keyboardActions = keyboardActions;
        this.$enabled = z2;
        this.$readOnly = z3;
        this.$decorationBox = pVar;
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
        CoreTextFieldKt.CoreTextField(textFieldValue2, this.$onValueChange, this.$modifier, this.$textStyle, this.$visualTransformation, this.$onTextLayout, this.$interactionSource, this.$cursorBrush, this.$softWrap, this.$maxLines, this.$minLines, this.$imeOptions, this.$keyboardActions, this.$enabled, this.$readOnly, this.$decorationBox, composer2, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
