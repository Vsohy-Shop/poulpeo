package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.p002ui.text.input.TextFieldValue;
import androidx.compose.p002ui.text.input.VisualTransformation;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: OutlinedTextField.kt */
final class OutlinedTextFieldKt$OutlinedTextField$9 extends C12777p implements C13089p<C13088o<? super Composer, ? super Integer, ? extends C11921v>, Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $label;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $leadingIcon;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $placeholder;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $trailingIcon;
    final /* synthetic */ TextFieldValue $value;
    final /* synthetic */ VisualTransformation $visualTransformation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OutlinedTextFieldKt$OutlinedTextField$9(TextFieldValue textFieldValue, boolean z, boolean z2, VisualTransformation visualTransformation, MutableInteractionSource mutableInteractionSource, boolean z3, C13088o<? super Composer, ? super Integer, C11921v> oVar, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar3, C13088o<? super Composer, ? super Integer, C11921v> oVar4, TextFieldColors textFieldColors, int i, int i2, Shape shape) {
        super(3);
        this.$value = textFieldValue;
        this.$enabled = z;
        this.$singleLine = z2;
        this.$visualTransformation = visualTransformation;
        this.$interactionSource = mutableInteractionSource;
        this.$isError = z3;
        this.$label = oVar;
        this.$placeholder = oVar2;
        this.$leadingIcon = oVar3;
        this.$trailingIcon = oVar4;
        this.$colors = textFieldColors;
        this.$$dirty = i;
        this.$$dirty1 = i2;
        this.$shape = shape;
    }

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
            i2 = i | (composer2.changedInstance(oVar2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1001528775, i2, -1, "androidx.compose.material.OutlinedTextField.<anonymous> (OutlinedTextField.kt:391)");
            }
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
            String text = this.$value.getText();
            boolean z = this.$enabled;
            boolean z2 = z;
            boolean z3 = this.$singleLine;
            VisualTransformation visualTransformation = this.$visualTransformation;
            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
            boolean z4 = this.$isError;
            boolean z5 = z4;
            C13088o<Composer, Integer, C11921v> oVar3 = this.$label;
            C13088o<Composer, Integer, C11921v> oVar4 = this.$placeholder;
            final boolean z6 = z4;
            C13088o<Composer, Integer, C11921v> oVar5 = this.$leadingIcon;
            final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource;
            C13088o<Composer, Integer, C11921v> oVar6 = this.$trailingIcon;
            TextFieldColors textFieldColors = this.$colors;
            final boolean z7 = z;
            TextFieldColors textFieldColors2 = textFieldColors;
            TextFieldDefaults textFieldDefaults2 = textFieldDefaults;
            String str = text;
            final TextFieldColors textFieldColors3 = textFieldColors;
            final Shape shape = this.$shape;
            final int i3 = this.$$dirty;
            final int i4 = this.$$dirty1;
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer2, -753611134, true, new C13088o<Composer, Integer, C11921v>() {
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
                            ComposerKt.traceEventStart(-753611134, i2, -1, "androidx.compose.material.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:405)");
                        }
                        TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                        boolean z = z7;
                        boolean z2 = z6;
                        MutableInteractionSource mutableInteractionSource = mutableInteractionSource3;
                        TextFieldColors textFieldColors = textFieldColors3;
                        Shape shape = shape;
                        int i3 = i4;
                        textFieldDefaults.m34177BorderBoxnbWgWpA(z, z2, mutableInteractionSource, textFieldColors, shape, 0.0f, 0.0f, composer, ((i3 >> 9) & 14) | 12582912 | ((i3 << 3) & 112) | ((i3 >> 15) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ((i3 >> 18) & 7168) | ((i3 >> 12) & 57344), 96);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer.skipToGroupEnd();
                }
            });
            int i5 = this.$$dirty;
            int i6 = ((i2 << 3) & 112) | ((i5 >> 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH);
            int i7 = this.$$dirty1;
            textFieldDefaults2.OutlinedTextFieldDecorationBox(str, oVar, z2, z3, visualTransformation, mutableInteractionSource2, z5, oVar3, oVar4, oVar5, oVar6, textFieldColors2, (PaddingValues) null, composableLambda, composer, i6 | ((i7 >> 3) & 7168) | ((i7 << 9) & 57344) | ((i7 >> 6) & 458752) | ((i7 << 18) & 3670016) | ((i5 << 3) & 29360128) | ((i5 << 3) & 234881024) | ((i5 << 3) & 1879048192), ((i5 >> 27) & 14) | 27648 | ((i7 >> 24) & 112), 4096);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
