package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

/* renamed from: androidx.compose.ui.layout.LookaheadLayoutKt$LookaheadLayout$3 */
/* compiled from: LookaheadLayout.kt */
final class LookaheadLayoutKt$LookaheadLayout$3 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C13089p<LookaheadLayoutScope, Composer, Integer, C11921v> $content;
    final /* synthetic */ MeasurePolicy $measurePolicy;
    final /* synthetic */ Modifier $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LookaheadLayoutKt$LookaheadLayout$3(C13089p<? super LookaheadLayoutScope, ? super Composer, ? super Integer, C11921v> pVar, Modifier modifier, MeasurePolicy measurePolicy, int i, int i2) {
        super(2);
        this.$content = pVar;
        this.$modifier = modifier;
        this.$measurePolicy = measurePolicy;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        LookaheadLayoutKt.LookaheadLayout(this.$content, this.$modifier, this.$measurePolicy, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
