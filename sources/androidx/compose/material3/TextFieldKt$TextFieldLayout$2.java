package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: TextField.kt */
final class TextFieldKt$TextFieldLayout$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ float $animationProgress;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $container;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $label;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $leading;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ PaddingValues $paddingValues;
    final /* synthetic */ C13089p<Modifier, Composer, Integer, C11921v> $placeholder;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $supporting;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $textField;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $trailing;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TextFieldKt$TextFieldLayout$2(Modifier modifier, C13088o<? super Composer, ? super Integer, C11921v> oVar, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13089p<? super Modifier, ? super Composer, ? super Integer, C11921v> pVar, C13088o<? super Composer, ? super Integer, C11921v> oVar3, C13088o<? super Composer, ? super Integer, C11921v> oVar4, boolean z, float f, C13088o<? super Composer, ? super Integer, C11921v> oVar5, C13088o<? super Composer, ? super Integer, C11921v> oVar6, PaddingValues paddingValues, int i, int i2) {
        super(2);
        this.$modifier = modifier;
        this.$textField = oVar;
        this.$label = oVar2;
        this.$placeholder = pVar;
        this.$leading = oVar3;
        this.$trailing = oVar4;
        this.$singleLine = z;
        this.$animationProgress = f;
        this.$container = oVar5;
        this.$supporting = oVar6;
        this.$paddingValues = paddingValues;
        this.$$changed = i;
        this.$$changed1 = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        TextFieldKt.TextFieldLayout(this.$modifier, this.$textField, this.$label, this.$placeholder, this.$leading, this.$trailing, this.$singleLine, this.$animationProgress, this.$container, this.$supporting, this.$paddingValues, composer, this.$$changed | 1, this.$$changed1);
    }
}
