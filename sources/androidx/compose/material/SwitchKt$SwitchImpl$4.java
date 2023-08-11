package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: Switch.kt */
final class SwitchKt$SwitchImpl$4 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $checked;
    final /* synthetic */ SwitchColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InteractionSource $interactionSource;
    final /* synthetic */ BoxScope $this_SwitchImpl;
    final /* synthetic */ State<Float> $thumbValue;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwitchKt$SwitchImpl$4(BoxScope boxScope, boolean z, boolean z2, SwitchColors switchColors, State<Float> state, InteractionSource interactionSource, int i) {
        super(2);
        this.$this_SwitchImpl = boxScope;
        this.$checked = z;
        this.$enabled = z2;
        this.$colors = switchColors;
        this.$thumbValue = state;
        this.$interactionSource = interactionSource;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        SwitchKt.SwitchImpl(this.$this_SwitchImpl, this.$checked, this.$enabled, this.$colors, this.$thumbValue, this.$interactionSource, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
