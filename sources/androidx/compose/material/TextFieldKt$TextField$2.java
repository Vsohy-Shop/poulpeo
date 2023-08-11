package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p002ui.text.input.VisualTransformation;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: TextField.kt */
final class TextFieldKt$TextField$2 extends C12777p implements C13089p<C13088o<? super Composer, ? super Integer, ? extends C11921v>, Composer, Integer, C11921v> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $label;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $leadingIcon;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $placeholder;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $trailingIcon;
    final /* synthetic */ String $value;
    final /* synthetic */ VisualTransformation $visualTransformation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldKt$TextField$2(String str, boolean z, boolean z2, VisualTransformation visualTransformation, MutableInteractionSource mutableInteractionSource, boolean z3, C13088o<? super Composer, ? super Integer, C11921v> oVar, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar3, C13088o<? super Composer, ? super Integer, C11921v> oVar4, TextFieldColors textFieldColors, int i, int i2) {
        super(3);
        this.$value = str;
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
        C12775o.m28639i(oVar2, "innerTextField");
        Composer composer2 = composer;
        if ((i & 14) == 0) {
            i2 = i | (composer2.changedInstance(oVar2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(989834338, i2, -1, "androidx.compose.material.TextField.<anonymous> (TextField.kt:209)");
            }
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
            String str = this.$value;
            boolean z = this.$enabled;
            boolean z2 = this.$singleLine;
            VisualTransformation visualTransformation = this.$visualTransformation;
            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            boolean z3 = this.$isError;
            C13088o<Composer, Integer, C11921v> oVar3 = this.$label;
            C13088o<Composer, Integer, C11921v> oVar4 = this.$placeholder;
            C13088o<Composer, Integer, C11921v> oVar5 = this.$leadingIcon;
            C13088o<Composer, Integer, C11921v> oVar6 = this.$trailingIcon;
            TextFieldColors textFieldColors = this.$colors;
            int i3 = i2;
            int i4 = this.$$dirty;
            int i5 = this.$$dirty1;
            textFieldDefaults.TextFieldDecorationBox(str, oVar, z, z2, visualTransformation, mutableInteractionSource, z3, oVar3, oVar4, oVar5, oVar6, textFieldColors, (PaddingValues) null, composer, ((i5 >> 3) & 7168) | (i4 & 14) | ((i3 << 3) & 112) | ((i4 >> 3) & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | ((i5 << 9) & 57344) | ((i5 >> 6) & 458752) | ((i5 << 18) & 3670016) | ((i4 << 3) & 29360128) | ((i4 << 3) & 234881024) | ((i4 << 3) & 1879048192), ((i4 >> 27) & 14) | 3072 | ((i5 >> 24) & 112), 4096);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
