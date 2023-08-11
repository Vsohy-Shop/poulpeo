package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: Snackbar.kt */
final class SnackbarKt$NewLineButtonSnackbar$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $action;
    final /* synthetic */ C13088o<Composer, Integer, C11921v> $text;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnackbarKt$NewLineButtonSnackbar$2(C13088o<? super Composer, ? super Integer, C11921v> oVar, C13088o<? super Composer, ? super Integer, C11921v> oVar2, int i) {
        super(2);
        this.$text = oVar;
        this.$action = oVar2;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        SnackbarKt.NewLineButtonSnackbar(this.$text, this.$action, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
