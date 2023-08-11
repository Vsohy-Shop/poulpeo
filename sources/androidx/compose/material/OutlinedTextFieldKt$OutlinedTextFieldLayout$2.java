package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: OutlinedTextField.kt */
final class OutlinedTextFieldKt$OutlinedTextFieldLayout$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ float $animationProgress;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $border;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $label;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $leading;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function1<Size, C11921v> $onLabelMeasured;
    final /* synthetic */ PaddingValues $paddingValues;
    final /* synthetic */ C13089p<Modifier, Composer, Integer, C11921v> $placeholder;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $textField;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $trailing;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OutlinedTextFieldKt$OutlinedTextFieldLayout$2(Modifier modifier, C13088o<? super Composer, ? super Integer, C11921v> oVar, C13089p<? super Modifier, ? super Composer, ? super Integer, C11921v> pVar, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar3, C13088o<? super Composer, ? super Integer, C11921v> oVar4, boolean z, float f, Function1<? super Size, C11921v> function1, C13088o<? super Composer, ? super Integer, C11921v> oVar5, PaddingValues paddingValues, int i, int i2) {
        super(2);
        this.$modifier = modifier;
        this.$textField = oVar;
        this.$placeholder = pVar;
        this.$label = oVar2;
        this.$leading = oVar3;
        this.$trailing = oVar4;
        this.$singleLine = z;
        this.$animationProgress = f;
        this.$onLabelMeasured = function1;
        this.$border = oVar5;
        this.$paddingValues = paddingValues;
        this.$$changed = i;
        this.$$changed1 = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        OutlinedTextFieldKt.OutlinedTextFieldLayout(this.$modifier, this.$textField, this.$placeholder, this.$label, this.$leading, this.$trailing, this.$singleLine, this.$animationProgress, this.$onLabelMeasured, this.$border, this.$paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1));
    }
}
