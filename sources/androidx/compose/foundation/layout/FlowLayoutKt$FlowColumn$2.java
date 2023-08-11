package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: FlowLayout.kt */
final class FlowLayoutKt$FlowColumn$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C13089p<ColumnScope, Composer, Integer, C11921v> $content;
    final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
    final /* synthetic */ int $maxItemsInEachColumn;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Arrangement.Vertical $verticalArrangement;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FlowLayoutKt$FlowColumn$2(Modifier modifier, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, int i, C13089p<? super ColumnScope, ? super Composer, ? super Integer, C11921v> pVar, int i2, int i3) {
        super(2);
        this.$modifier = modifier;
        this.$verticalArrangement = vertical;
        this.$horizontalAlignment = horizontal;
        this.$maxItemsInEachColumn = i;
        this.$content = pVar;
        this.$$changed = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        FlowLayoutKt.FlowColumn(this.$modifier, this.$verticalArrangement, this.$horizontalAlignment, this.$maxItemsInEachColumn, this.$content, composer, this.$$changed | 1, this.$$default);
    }
}
