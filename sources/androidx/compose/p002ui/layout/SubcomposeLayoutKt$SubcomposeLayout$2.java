package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$2 */
/* compiled from: SubcomposeLayout.kt */
final class SubcomposeLayoutKt$SubcomposeLayout$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C13088o<SubcomposeMeasureScope, Constraints, MeasureResult> $measurePolicy;
    final /* synthetic */ Modifier $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SubcomposeLayoutKt$SubcomposeLayout$2(Modifier modifier, C13088o<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult> oVar, int i, int i2) {
        super(2);
        this.$modifier = modifier;
        this.$measurePolicy = oVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        SubcomposeLayoutKt.SubcomposeLayout(this.$modifier, this.$measurePolicy, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
