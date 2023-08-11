package androidx.compose.material;

import androidx.compose.p002ui.layout.AlignmentLineKt;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.Constraints;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material/SnackbarKt$TextOnlySnackbar$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n1#2:365\n*E\n"})
/* compiled from: Snackbar.kt */
final class SnackbarKt$TextOnlySnackbar$2 implements MeasurePolicy {
    public static final SnackbarKt$TextOnlySnackbar$2 INSTANCE = new SnackbarKt$TextOnlySnackbar$2();

    SnackbarKt$TextOnlySnackbar$2() {
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public final MeasureResult m34110measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        boolean z;
        boolean z2;
        float f;
        C12775o.m28639i(measureScope, "$this$Layout");
        C12775o.m28639i(list, "measurables");
        boolean z3 = false;
        if (list.size() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Placeable r11 = ((Measurable) C12686e0.m28221Z(list)).m37365measureBRTryo0(j);
            int i = r11.get(AlignmentLineKt.getFirstBaseline());
            int i2 = r11.get(AlignmentLineKt.getLastBaseline());
            if (i != Integer.MIN_VALUE) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 != Integer.MIN_VALUE) {
                    z3 = true;
                }
                if (z3) {
                    if (i == i2) {
                        f = SnackbarKt.SnackbarMinHeightOneLine;
                    } else {
                        f = SnackbarKt.SnackbarMinHeightTwoLines;
                    }
                    int max = Math.max(measureScope.m38443roundToPx0680j_4(f), r11.getHeight());
                    return MeasureScope.layout$default(measureScope, Constraints.m38412getMaxWidthimpl(j), max, (Map) null, new SnackbarKt$TextOnlySnackbar$2$measure$4(max, r11), 4, (Object) null);
                }
                throw new IllegalArgumentException("No baselines for text".toString());
            }
            throw new IllegalArgumentException("No baselines for text".toString());
        }
        throw new IllegalArgumentException("text for Snackbar expected to have exactly only one child".toString());
    }
}
