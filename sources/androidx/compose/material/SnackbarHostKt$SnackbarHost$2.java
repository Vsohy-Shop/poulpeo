package androidx.compose.material;

import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: SnackbarHost.kt */
final class SnackbarHostKt$SnackbarHost$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ SnackbarHostState $hostState;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ C13089p<SnackbarData, Composer, Integer, C11921v> $snackbar;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SnackbarHostKt$SnackbarHost$2(SnackbarHostState snackbarHostState, Modifier modifier, C13089p<? super SnackbarData, ? super Composer, ? super Integer, C11921v> pVar, int i, int i2) {
        super(2);
        this.$hostState = snackbarHostState;
        this.$modifier = modifier;
        this.$snackbar = pVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        SnackbarHostKt.SnackbarHost(this.$hostState, this.$modifier, this.$snackbar, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
