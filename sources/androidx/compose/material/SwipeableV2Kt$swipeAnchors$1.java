package androidx.compose.material;

import androidx.compose.p002ui.unit.Density;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: SwipeableV2.kt */
final class SwipeableV2Kt$swipeAnchors$1 extends C12777p implements Function1<Density, C11921v> {
    final /* synthetic */ SwipeableV2State<T> $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwipeableV2Kt$swipeAnchors$1(SwipeableV2State<T> swipeableV2State) {
        super(1);
        this.$state = swipeableV2State;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Density) obj);
        return C11921v.f18618a;
    }

    public final void invoke(Density density) {
        C12775o.m28639i(density, "it");
        this.$state.setDensity$material_release(density);
    }
}
