package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.p002ui.graphics.SolidColor;
import androidx.compose.p002ui.semantics.SemanticsModifierKt;
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

/* compiled from: OutlinedTextField.kt */
final class OutlinedTextFieldKt$OutlinedTextField$5 extends C12777p implements C13088o<Composer, Integer, C11921v> {
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
    OutlinedTextFieldKt$OutlinedTextField$5(C13088o<? super Composer, ? super Integer, C11921v> oVar, Modifier modifier, TextFieldColors textFieldColors, boolean z, int i, TextFieldValue textFieldValue, Function1<? super TextFieldValue, C11921v> function1, boolean z2, boolean z3, TextStyle textStyle, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i2, VisualTransformation visualTransformation, MutableInteractionSource mutableInteractionSource, int i3, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar3, C13088o<? super Composer, ? super Integer, C11921v> oVar4, C13088o<? super Composer, ? super Integer, C11921v> oVar5, Shape shape) {
        super(2);
        this.$label = oVar;
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
        Modifier modifier;
        Composer composer2 = composer;
        int i2 = i;
        if ((i2 & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-719341509, i2, -1, "androidx.compose.material3.OutlinedTextField.<anonymous> (OutlinedTextField.kt:311)");
            }
            if (this.$label != null) {
                modifier = PaddingKt.m33272paddingqDBjuR0$default(SemanticsModifierKt.semantics(this.$modifier, true, C08881.INSTANCE), 0.0f, OutlinedTextFieldKt.getOutlinedTextFieldTopPadding(), 0.0f, 0.0f, 13, (Object) null);
            } else {
                modifier = this.$modifier;
            }
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
            Modifier r3 = SizeKt.m33322defaultMinSizeVpY3zN4(modifier, textFieldDefaults.m34656getMinWidthD9Ej5fM(), textFieldDefaults.m34655getMinHeightD9Ej5fM());
            SolidColor solidColor = r1;
            TextFieldColors textFieldColors = this.$colors;
            boolean z = this.$isError;
            int i3 = this.$$dirty1;
            SolidColor solidColor2 = new SolidColor(textFieldColors.cursorColor$material3_release(z, composer2, ((i3 >> 24) & 112) | ((i3 >> 3) & 14)).getValue().m35681unboximpl(), (DefaultConstructorMarker) null);
            TextFieldValue textFieldValue = this.$value;
            TextFieldValue textFieldValue2 = textFieldValue;
            Function1<TextFieldValue, C11921v> function1 = this.$onValueChange;
            boolean z2 = this.$enabled;
            boolean z3 = z2;
            boolean z4 = this.$readOnly;
            TextStyle textStyle = this.$mergedTextStyle;
            KeyboardOptions keyboardOptions = this.$keyboardOptions;
            KeyboardActions keyboardActions = this.$keyboardActions;
            boolean z5 = this.$singleLine;
            boolean z6 = z5;
            final boolean z7 = z5;
            int i4 = this.$maxLines;
            VisualTransformation visualTransformation = this.$visualTransformation;
            final boolean z8 = z2;
            final TextFieldValue textFieldValue3 = textFieldValue;
            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            TextFieldValue textFieldValue4 = textFieldValue2;
            final VisualTransformation visualTransformation2 = visualTransformation;
            Function1<TextFieldValue, C11921v> function12 = function1;
            boolean z9 = this.$isError;
            Modifier modifier2 = r3;
            C13088o<Composer, Integer, C11921v> oVar = this.$label;
            boolean z10 = z3;
            C13088o<Composer, Integer, C11921v> oVar2 = this.$placeholder;
            boolean z11 = z4;
            C13088o<Composer, Integer, C11921v> oVar3 = this.$leadingIcon;
            TextStyle textStyle2 = textStyle;
            C13088o<Composer, Integer, C11921v> oVar4 = this.$trailingIcon;
            KeyboardOptions keyboardOptions2 = keyboardOptions;
            C13088o<Composer, Integer, C11921v> oVar5 = this.$supportingText;
            KeyboardActions keyboardActions2 = keyboardActions;
            TextFieldColors textFieldColors2 = this.$colors;
            boolean z12 = z6;
            int i5 = this.$$dirty;
            int i6 = i4;
            final MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
            final boolean z13 = z9;
            final C13088o<Composer, Integer, C11921v> oVar6 = oVar;
            final C13088o<Composer, Integer, C11921v> oVar7 = oVar2;
            final C13088o<Composer, Integer, C11921v> oVar8 = oVar3;
            final C13088o<Composer, Integer, C11921v> oVar9 = oVar4;
            final C13088o<Composer, Integer, C11921v> oVar10 = oVar5;
            final TextFieldColors textFieldColors3 = textFieldColors2;
            final int i7 = i5;
            final int i8 = this.$$dirty1;
            final Shape shape = this.$shape;
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer2, 342910148, true, new C13089p<C13088o<? super Composer, ? super Integer, ? extends C11921v>, Composer, Integer, C11921v>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((C13088o<? super Composer, ? super Integer, C11921v>) (C13088o) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return C11921v.f18618a;
                }

                @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                @Composable
                public final void invoke(C13088o<? super Composer, ? super Integer, C11921v> oVar, Composer composer, int i) {
                    int i2;
                    C13088o<? super Composer, ? super Integer, C11921v> oVar2 = oVar;
                    Composer composer2 = composer;
                    C12775o.m28639i(oVar2, "innerTextField");
                    if ((i & 14) == 0) {
                        i2 = i | (composer2.changed((Object) oVar2) ? 4 : 2);
                    } else {
                        i2 = i;
                    }
                    if ((i2 & 91) != 18 || !composer.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(342910148, i2, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:339)");
                        }
                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                        String text = textFieldValue3.getText();
                        boolean z = z8;
                        boolean z2 = z;
                        boolean z3 = z7;
                        VisualTransformation visualTransformation = visualTransformation2;
                        MutableInteractionSource mutableInteractionSource = mutableInteractionSource2;
                        MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                        boolean z4 = z13;
                        boolean z5 = z4;
                        C13088o<Composer, Integer, C11921v> oVar3 = oVar6;
                        C13088o<Composer, Integer, C11921v> oVar4 = oVar7;
                        final boolean z6 = z4;
                        C13088o<Composer, Integer, C11921v> oVar5 = oVar8;
                        final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
                        C13088o<Composer, Integer, C11921v> oVar6 = oVar9;
                        final boolean z7 = z;
                        C13088o<Composer, Integer, C11921v> oVar7 = oVar10;
                        TextFieldColors textFieldColors = textFieldColors3;
                        int i3 = i2;
                        TextFieldColors textFieldColors2 = textFieldColors;
                        String str = text;
                        boolean z8 = z2;
                        final TextFieldColors textFieldColors3 = textFieldColors;
                        final Shape shape = shape;
                        final int i4 = i7;
                        final int i5 = i8;
                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer2, 119108444, true, new C13088o<Composer, Integer, C11921v>() {
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return C11921v.f18618a;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(Composer composer, int i) {
                                int i2 = i;
                                if ((i2 & 11) != 2 || !composer.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(119108444, i2, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous>.<anonymous> (OutlinedTextField.kt:354)");
                                    }
                                    TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                                    boolean z = z7;
                                    boolean z2 = z6;
                                    MutableInteractionSource mutableInteractionSource = mutableInteractionSource3;
                                    TextFieldColors textFieldColors = textFieldColors3;
                                    Shape shape = shape;
                                    int i3 = i5;
                                    textFieldDefaults.m34653OutlinedBorderContainerBoxnbWgWpA(z, z2, mutableInteractionSource, textFieldColors, shape, 0.0f, 0.0f, composer, ((i4 >> 9) & 14) | 12582912 | (i3 & 112) | ((i3 >> 15) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ((i3 >> 18) & 7168) | ((i3 >> 12) & 57344), 96);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer.skipToGroupEnd();
                            }
                        });
                        int i6 = i7;
                        int i7 = ((i3 << 3) & 112) | ((i6 >> 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH);
                        int i8 = i8;
                        textFieldDefaults.OutlinedTextFieldDecorationBox(str, oVar, z8, z3, visualTransformation, mutableInteractionSource2, z5, oVar3, oVar4, oVar5, oVar6, oVar7, textFieldColors2, (PaddingValues) null, composableLambda, composer, i7 | ((i8 >> 6) & 7168) | ((i8 << 6) & 57344) | (458752 & (i8 >> 6)) | ((i8 << 15) & 3670016) | ((i6 << 3) & 29360128) | ((i6 << 3) & 234881024) | ((i6 << 3) & 1879048192), ((i6 >> 27) & 14) | 221184 | ((i8 << 3) & 112) | ((i8 >> 21) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH), 8192);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer.skipToGroupEnd();
                }
            });
            int i9 = this.$$dirty;
            int i10 = this.$$dirty1;
            int i11 = (i9 & 57344) | (i9 & 14) | (i9 & 112) | (i9 & 7168) | ((i10 << 9) & 3670016) | (KeyboardActions.$stable << 21) | ((i10 << 9) & 29360128) | ((i10 << 9) & 234881024) | (1879048192 & (i10 << 9));
            int i12 = ((i10 >> 6) & 14) | 24576 | ((i10 >> 15) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH);
            BasicTextFieldKt.BasicTextField(textFieldValue4, (Function1) function12, modifier2, z10, z11, textStyle2, keyboardOptions2, keyboardActions2, z12, i6, visualTransformation, (Function1) null, mutableInteractionSource, (Brush) solidColor, (C13089p) composableLambda, composer, i11, i12, 2048);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
