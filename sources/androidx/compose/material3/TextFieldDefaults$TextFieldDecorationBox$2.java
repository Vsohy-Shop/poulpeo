package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.p002ui.text.input.VisualTransformation;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: TextFieldDefaults.kt */
final class TextFieldDefaults$TextFieldDecorationBox$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $container;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $innerTextField;
    final /* synthetic */ InteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $label;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $leadingIcon;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $placeholder;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $supportingText;
    final /* synthetic */ TextFieldDefaults $tmp0_rcvr;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $trailingIcon;
    final /* synthetic */ String $value;
    final /* synthetic */ VisualTransformation $visualTransformation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldDefaults$TextFieldDecorationBox$2(TextFieldDefaults textFieldDefaults, String str, C13088o<? super Composer, ? super Integer, C11921v> oVar, boolean z, boolean z2, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z3, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar3, C13088o<? super Composer, ? super Integer, C11921v> oVar4, C13088o<? super Composer, ? super Integer, C11921v> oVar5, C13088o<? super Composer, ? super Integer, C11921v> oVar6, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, C13088o<? super Composer, ? super Integer, C11921v> oVar7, int i, int i2, int i3) {
        super(2);
        this.$tmp0_rcvr = textFieldDefaults;
        this.$value = str;
        this.$innerTextField = oVar;
        this.$enabled = z;
        this.$singleLine = z2;
        this.$visualTransformation = visualTransformation;
        this.$interactionSource = interactionSource;
        this.$isError = z3;
        this.$label = oVar2;
        this.$placeholder = oVar3;
        this.$leadingIcon = oVar4;
        this.$trailingIcon = oVar5;
        this.$supportingText = oVar6;
        this.$shape = shape;
        this.$colors = textFieldColors;
        this.$contentPadding = paddingValues;
        this.$container = oVar7;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        Composer composer2 = composer;
        TextFieldDefaults textFieldDefaults = this.$tmp0_rcvr;
        TextFieldDefaults textFieldDefaults2 = textFieldDefaults;
        textFieldDefaults2.TextFieldDecorationBox(this.$value, this.$innerTextField, this.$enabled, this.$singleLine, this.$visualTransformation, this.$interactionSource, this.$isError, this.$label, this.$placeholder, this.$leadingIcon, this.$trailingIcon, this.$supportingText, this.$shape, this.$colors, this.$contentPadding, this.$container, composer2, this.$$changed | 1, this.$$changed1, this.$$default);
    }
}
