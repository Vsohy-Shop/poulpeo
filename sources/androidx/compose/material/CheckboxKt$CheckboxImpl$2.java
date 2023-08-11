package androidx.compose.material;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.state.ToggleableState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: Checkbox.kt */
final class CheckboxKt$CheckboxImpl$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ CheckboxColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ ToggleableState $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CheckboxKt$CheckboxImpl$2(boolean z, ToggleableState toggleableState, Modifier modifier, CheckboxColors checkboxColors, int i) {
        super(2);
        this.$enabled = z;
        this.$value = toggleableState;
        this.$modifier = modifier;
        this.$colors = checkboxColors;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        CheckboxKt.CheckboxImpl(this.$enabled, this.$value, this.$modifier, this.$colors, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
