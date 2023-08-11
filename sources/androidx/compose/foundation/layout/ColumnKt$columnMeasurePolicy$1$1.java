package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13091r;

@SourceDebugExtension({"SMAP\nColumn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Column.kt\nandroidx/compose/foundation/layout/ColumnKt$columnMeasurePolicy$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,250:1\n1#2:251\n*E\n"})
/* compiled from: Column.kt */
final class ColumnKt$columnMeasurePolicy$1$1 extends C12777p implements C13091r<Integer, int[], LayoutDirection, Density, int[], C11921v> {
    final /* synthetic */ Arrangement.Vertical $verticalArrangement;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ColumnKt$columnMeasurePolicy$1$1(Arrangement.Vertical vertical) {
        super(5);
        this.$verticalArrangement = vertical;
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
        this.$verticalArrangement.arrange(density, i, iArr, iArr2);
    }
}
