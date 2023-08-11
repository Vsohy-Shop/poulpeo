package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$rememberColumnWidthSums$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,493:1\n51#2:494\n*S KotlinDebug\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$rememberColumnWidthSums$1$1\n*L\n162#1:494\n*E\n"})
/* compiled from: LazyGridDsl.kt */
final class LazyGridDslKt$rememberColumnWidthSums$1$1 extends C12777p implements C13088o<Density, Constraints, List<Integer>> {
    final /* synthetic */ GridCells $columns;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyGridDslKt$rememberColumnWidthSums$1$1(PaddingValues paddingValues, GridCells gridCells, Arrangement.Horizontal horizontal) {
        super(2);
        this.$contentPadding = paddingValues;
        this.$columns = gridCells;
        this.$horizontalArrangement = horizontal;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m33459invoke0kLqBqw((Density) obj, ((Constraints) obj2).m38418unboximpl());
    }

    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final List<Integer> m33459invoke0kLqBqw(Density density, long j) {
        boolean z;
        C12775o.m28639i(density, "$this$null");
        if (Constraints.m38412getMaxWidthimpl(j) != Integer.MAX_VALUE) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            PaddingValues paddingValues = this.$contentPadding;
            LayoutDirection layoutDirection = LayoutDirection.Ltr;
            List<Integer> D0 = C12686e0.m28207D0(this.$columns.calculateCrossAxisCellSizes(density, Constraints.m38412getMaxWidthimpl(j) - density.m38443roundToPx0680j_4(C1232Dp.m38468constructorimpl(PaddingKt.calculateStartPadding(paddingValues, layoutDirection) + PaddingKt.calculateEndPadding(this.$contentPadding, layoutDirection))), density.m38443roundToPx0680j_4(this.$horizontalArrangement.m33193getSpacingD9Ej5fM())));
            int size = D0.size();
            for (int i = 1; i < size; i++) {
                D0.set(i, Integer.valueOf(D0.get(i).intValue() + D0.get(i - 1).intValue()));
            }
            return D0;
        }
        throw new IllegalArgumentException("LazyVerticalGrid's width should be bound by parent.".toString());
    }
}
