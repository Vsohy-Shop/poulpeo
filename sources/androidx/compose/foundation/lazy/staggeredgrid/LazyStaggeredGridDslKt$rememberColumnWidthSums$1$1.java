package androidx.compose.foundation.lazy.staggeredgrid;

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

@SourceDebugExtension({"SMAP\nLazyStaggeredGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$rememberColumnWidthSums$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,434:1\n51#2:435\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridDsl.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$rememberColumnWidthSums$1$1\n*L\n103#1:435\n*E\n"})
/* compiled from: LazyStaggeredGridDsl.kt */
final class LazyStaggeredGridDslKt$rememberColumnWidthSums$1$1 extends C12777p implements C13088o<Density, Constraints, int[]> {
    final /* synthetic */ StaggeredGridCells $columns;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LazyStaggeredGridDslKt$rememberColumnWidthSums$1$1(PaddingValues paddingValues, StaggeredGridCells staggeredGridCells, Arrangement.Horizontal horizontal) {
        super(2);
        this.$contentPadding = paddingValues;
        this.$columns = staggeredGridCells;
        this.$horizontalArrangement = horizontal;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m33546invoke0kLqBqw((Density) obj, ((Constraints) obj2).m38418unboximpl());
    }

    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final int[] m33546invoke0kLqBqw(Density density, long j) {
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
            List<Integer> calculateCrossAxisCellSizes = this.$columns.calculateCrossAxisCellSizes(density, Constraints.m38412getMaxWidthimpl(j) - density.m38443roundToPx0680j_4(C1232Dp.m38468constructorimpl(PaddingKt.calculateStartPadding(paddingValues, layoutDirection) + PaddingKt.calculateEndPadding(this.$contentPadding, layoutDirection))), density.m38443roundToPx0680j_4(this.$horizontalArrangement.m33193getSpacingD9Ej5fM()));
            int size = calculateCrossAxisCellSizes.size();
            int[] iArr = new int[size];
            for (int i = 0; i < size; i++) {
                iArr[i] = calculateCrossAxisCellSizes.get(i).intValue();
            }
            int size2 = calculateCrossAxisCellSizes.size();
            for (int i2 = 1; i2 < size2; i2++) {
                iArr[i2] = iArr[i2] + iArr[i2 - 1];
            }
            return iArr;
        }
        throw new IllegalArgumentException("LazyVerticalStaggeredGrid's width should be bound by parent.".toString());
    }
}
