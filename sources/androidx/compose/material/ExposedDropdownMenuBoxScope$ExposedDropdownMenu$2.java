package androidx.compose.material;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: ExposedDropdownMenu.kt */
final class ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C13089p<ColumnScope, Composer, Integer, C11921v> $content;
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ C13074a<C11921v> $onDismissRequest;
    final /* synthetic */ ExposedDropdownMenuBoxScope $tmp0_rcvr;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ExposedDropdownMenuBoxScope$ExposedDropdownMenu$2(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, boolean z, C13074a<C11921v> aVar, Modifier modifier, C13089p<? super ColumnScope, ? super Composer, ? super Integer, C11921v> pVar, int i, int i2) {
        super(2);
        this.$tmp0_rcvr = exposedDropdownMenuBoxScope;
        this.$expanded = z;
        this.$onDismissRequest = aVar;
        this.$modifier = modifier;
        this.$content = pVar;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        this.$tmp0_rcvr.ExposedDropdownMenu(this.$expanded, this.$onDismissRequest, this.$modifier, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
