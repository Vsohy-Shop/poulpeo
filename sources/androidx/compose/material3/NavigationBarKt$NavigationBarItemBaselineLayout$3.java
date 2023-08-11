package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: NavigationBar.kt */
final class NavigationBarKt$NavigationBarItemBaselineLayout$3 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $alwaysShowLabel;
    final /* synthetic */ float $animationProgress;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $icon;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $indicator;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $indicatorRipple;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NavigationBarKt$NavigationBarItemBaselineLayout$3(C13088o<? super Composer, ? super Integer, C11921v> oVar, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar3, C13088o<? super Composer, ? super Integer, C11921v> oVar4, boolean z, float f, int i) {
        super(2);
        this.$indicatorRipple = oVar;
        this.$indicator = oVar2;
        this.$icon = oVar3;
        this.$label = oVar4;
        this.$alwaysShowLabel = z;
        this.$animationProgress = f;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        NavigationBarKt.NavigationBarItemBaselineLayout(this.$indicatorRipple, this.$indicator, this.$icon, this.$label, this.$alwaysShowLabel, this.$animationProgress, composer, this.$$changed | 1);
    }
}
