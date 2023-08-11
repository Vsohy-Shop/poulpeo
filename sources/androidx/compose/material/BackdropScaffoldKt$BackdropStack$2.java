package androidx.compose.material;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13090q;

/* compiled from: BackdropScaffold.kt */
final class BackdropScaffoldKt$BackdropStack$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $backLayer;
    final /* synthetic */ Function1<Constraints, Constraints> $calculateBackLayerConstraints;
    final /* synthetic */ C13090q<Constraints, Float, Composer, Integer, C11921v> $frontLayer;
    final /* synthetic */ Modifier $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BackdropScaffoldKt$BackdropStack$2(Modifier modifier, C13088o<? super Composer, ? super Integer, C11921v> oVar, Function1<? super Constraints, Constraints> function1, C13090q<? super Constraints, ? super Float, ? super Composer, ? super Integer, C11921v> qVar, int i) {
        super(2);
        this.$modifier = modifier;
        this.$backLayer = oVar;
        this.$calculateBackLayerConstraints = function1;
        this.$frontLayer = qVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        BackdropScaffoldKt.BackdropStack(this.$modifier, this.$backLayer, this.$calculateBackLayerConstraints, this.$frontLayer, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
