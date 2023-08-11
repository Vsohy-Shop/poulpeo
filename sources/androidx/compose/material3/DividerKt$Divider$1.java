package androidx.compose.material3;

import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;

/* compiled from: Divider.kt */
final class DividerKt$Divider$1 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $color;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ float $thickness;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DividerKt$Divider$1(Modifier modifier, float f, long j, int i, int i2) {
        super(2);
        this.$modifier = modifier;
        this.$thickness = f;
        this.$color = j;
        this.$$changed = i;
        this.$$default = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        DividerKt.m34395Divider9IZ8Weo(this.$modifier, this.$thickness, this.$color, composer, this.$$changed | 1, this.$$default);
    }
}
