package androidx.compose.foundation.layout;

import androidx.compose.p002ui.layout.Placeable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: FlowLayout.kt */
final class FlowLayoutKt$breakDownItems$nextSize$1 extends C12777p implements Function1<Placeable, C11921v> {
    final /* synthetic */ Placeable[] $placeables;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FlowLayoutKt$breakDownItems$nextSize$1(Placeable[] placeableArr) {
        super(1);
        this.$placeables = placeableArr;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Placeable) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Placeable placeable) {
        this.$placeables[0] = placeable;
    }
}
