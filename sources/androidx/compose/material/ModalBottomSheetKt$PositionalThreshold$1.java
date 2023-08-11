package androidx.compose.material;

import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Density;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nModalBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetKt$PositionalThreshold$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,684:1\n154#2:685\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetKt$PositionalThreshold$1\n*L\n681#1:685\n*E\n"})
/* compiled from: ModalBottomSheet.kt */
final class ModalBottomSheetKt$PositionalThreshold$1 extends C12777p implements C13088o<Density, Float, Float> {
    public static final ModalBottomSheetKt$PositionalThreshold$1 INSTANCE = new ModalBottomSheetKt$PositionalThreshold$1();

    ModalBottomSheetKt$PositionalThreshold$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((Density) obj, ((Number) obj2).floatValue());
    }

    public final Float invoke(Density density, float f) {
        C12775o.m28639i(density, "$this$null");
        return Float.valueOf(density.m38449toPx0680j_4(C1232Dp.m38468constructorimpl((float) 56)));
    }
}
