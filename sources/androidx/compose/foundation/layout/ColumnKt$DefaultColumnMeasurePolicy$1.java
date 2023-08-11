package androidx.compose.foundation.layout;

import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13091r;

@SourceDebugExtension({"SMAP\nColumn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Column.kt\nandroidx/compose/foundation/layout/ColumnKt$DefaultColumnMeasurePolicy$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,250:1\n1#2:251\n*E\n"})
/* compiled from: Column.kt */
final class ColumnKt$DefaultColumnMeasurePolicy$1 extends C12777p implements C13091r<Integer, int[], LayoutDirection, Density, int[], C11921v> {
    public static final ColumnKt$DefaultColumnMeasurePolicy$1 INSTANCE = new ColumnKt$DefaultColumnMeasurePolicy$1();

    ColumnKt$DefaultColumnMeasurePolicy$1() {
        super(5);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        invoke(((Number) obj).intValue(), (int[]) obj2, (LayoutDirection) obj3, (Density) obj4, (int[]) obj5);
        return C11921v.f18618a;
    }

    public final void invoke(int i, int[] iArr, LayoutDirection layoutDirection, Density density, int[] iArr2) {
        C12775o.m28639i(iArr, "size");
        C12775o.m28639i(layoutDirection, "<anonymous parameter 2>");
        C12775o.m28639i(density, "density");
        C12775o.m28639i(iArr2, "outPosition");
        Arrangement.INSTANCE.getTop().arrange(density, i, iArr, iArr2);
    }
}
