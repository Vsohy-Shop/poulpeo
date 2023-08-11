package androidx.compose.material;

import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.p002ui.unit.IntOffsetKt;
import androidx.compose.runtime.State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: Switch.kt */
final class SwitchKt$SwitchImpl$3$1 extends C12777p implements Function1<Density, IntOffset> {
    final /* synthetic */ State<Float> $thumbValue;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwitchKt$SwitchImpl$3$1(State<Float> state) {
        super(1);
        this.$thumbValue = state;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return IntOffset.m38577boximpl(m34154invokeBjo55l4((Density) obj));
    }

    /* renamed from: invoke-Bjo55l4  reason: not valid java name */
    public final long m34154invokeBjo55l4(Density density) {
        C12775o.m28639i(density, "$this$offset");
        return IntOffsetKt.IntOffset(C13265c.m30134c(this.$thumbValue.getValue().floatValue()), 0);
    }
}
