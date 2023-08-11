package androidx.compose.foundation.gestures.snapping;

import androidx.compose.p002ui.unit.Density;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13089p;

/* compiled from: LazyListSnapLayoutInfoProvider.kt */
final class LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1 extends C12777p implements C13089p<Density, Float, Float, Float> {
    public static final LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1 INSTANCE = new LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1();

    LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1() {
        super(3);
    }

    public final Float invoke(Density density, float f, float f2) {
        C12775o.m28639i(density, "$this$null");
        return Float.valueOf((f / 2.0f) - (f2 / 2.0f));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Density) obj, ((Number) obj2).floatValue(), ((Number) obj3).floatValue());
    }
}
