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
final class FlowLayoutKt$FlowRow$2 extends C12777p implements C13088o<Composer, Integer, C11921v> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ C13089p<RowScope, Composer, Integer, C11921v> $content;
    final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;
    final /* synthetic */ int $maxItemsInEachRow;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Alignment.Vertical $verticalAlignment;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FlowLayoutKt$FlowRow$2(Modifier modifier, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, int i, C13089p<? super RowScope, ? super Composer, ? super Integer, C11921v> pVar, int i2, int i3) {
        super(2);
        this.$modifier = modifier;
        this.$horizontalArrangement = horizontal;
        this.$verticalAlignment = vertical;
        this.$maxItemsInEachRow = i;
        this.$content = pVar;
        this.$$changed = i2;
        this.$$default = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return C11921v.f18618a;
    }

    public final void invoke(Composer composer, int i) {
        FlowLayoutKt.FlowRow(this.$modifier, this.$horizontalArrangement, this.$verticalAlignment, this.$maxItemsInEachRow, this.$content, composer, this.$$changed | 1, this.$$default);
    }
}
