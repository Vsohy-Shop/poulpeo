package androidx.compose.material;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: SwipeToDismiss.kt */
final class SwipeToDismissKt$SwipeToDismiss$3 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C13089p<RowScope, Composer, Integer, C11921v> $background;
    final /* synthetic */ Set<DismissDirection> $directions;
    final /* synthetic */ C13089p<RowScope, Composer, Integer, C11921v> $dismissContent;
    final /* synthetic */ Function1<DismissDirection, ThresholdConfig> $dismissThresholds;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ DismissState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwipeToDismissKt$SwipeToDismiss$3(DismissState dismissState, Modifier modifier, Set<? extends DismissDirection> set, Function1<? super DismissDirection, ? extends ThresholdConfig> function1, C13089p<? super RowScope, ? super Composer, ? super Integer, C11921v> pVar, C13089p<? super RowScope, ? super Composer, ? super Integer, C11921v> pVar2, int i, int i2) {
        super(2);
        this.$state = dismissState;
        this.$modifier = modifier;
        this.$directions = set;
        this.$dismissThresholds = function1;
        this.$background = pVar;
        this.$dismissContent = pVar2;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        SwipeToDismissKt.SwipeToDismiss(this.$state, this.$modifier, this.$directions, this.$dismissThresholds, this.$background, this.$dismissContent, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
