package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;
import p404of.C13088o;

/* compiled from: Drawer.kt */
final class DrawerKt$Scrim$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ long $color;
    final /* synthetic */ C13074a<Float> $fraction;
    final /* synthetic */ C13074a<C11921v> $onClose;
    final /* synthetic */ boolean $open;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DrawerKt$Scrim$2(boolean z, C13074a<C11921v> aVar, C13074a<Float> aVar2, long j, int i) {
        super(2);
        this.$open = z;
        this.$onClose = aVar;
        this.$fraction = aVar2;
        this.$color = j;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        DrawerKt.m33996ScrimBx497Mc(this.$open, this.$onClose, this.$fraction, this.$color, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
