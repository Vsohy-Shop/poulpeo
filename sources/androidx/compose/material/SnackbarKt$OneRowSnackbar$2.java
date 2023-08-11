package androidx.compose.material;

import androidx.compose.p002ui.layout.AlignmentLineKt;
import androidx.compose.p002ui.layout.LayoutIdKt;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.Constraints;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nSnackbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material/SnackbarKt$OneRowSnackbar$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n223#2,2:365\n223#2,2:367\n1#3:369\n*S KotlinDebug\n*F\n+ 1 Snackbar.kt\nandroidx/compose/material/SnackbarKt$OneRowSnackbar$2\n*L\n308#1:365,2\n312#1:367,2\n*E\n"})
/* compiled from: Snackbar.kt */
final class SnackbarKt$OneRowSnackbar$2 implements MeasurePolicy {
    final /* synthetic */ String $actionTag;
    final /* synthetic */ String $textTag;

    SnackbarKt$OneRowSnackbar$2(String str, String str2) {
        this.$actionTag = str;
        this.$textTag = str2;
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public final MeasureResult m34109measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        MeasureScope measureScope2 = measureScope;
        List<? extends Measurable> list2 = list;
        C12775o.m28639i(measureScope2, "$this$Layout");
        C12775o.m28639i(list2, "measurables");
        Iterable<Measurable> iterable = list2;
        String str = this.$actionTag;
        for (Measurable measurable : iterable) {
            if (C12775o.m28634d(LayoutIdKt.getLayoutId(measurable), str)) {
                Placeable r5 = measurable.m37365measureBRTryo0(j);
                int d = C13537l.m30877d((Constraints.m38412getMaxWidthimpl(j) - r5.getWidth()) - measureScope2.m38443roundToPx0680j_4(SnackbarKt.TextEndExtraSpacing), Constraints.m38414getMinWidthimpl(j));
                String str2 = this.$textTag;
                for (Measurable measurable2 : iterable) {
                    if (C12775o.m28634d(LayoutIdKt.getLayoutId(measurable2), str2)) {
                        Placeable r8 = measurable2.m37365measureBRTryo0(Constraints.m38403copyZbe2FdA$default(j, 0, d, 0, 0, 9, (Object) null));
                        int i4 = r8.get(AlignmentLineKt.getFirstBaseline());
                        boolean z3 = true;
                        int i5 = 0;
                        if (i4 != Integer.MIN_VALUE) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            int i6 = r8.get(AlignmentLineKt.getLastBaseline());
                            if (i6 != Integer.MIN_VALUE) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                if (i4 != i6) {
                                    z3 = false;
                                }
                                int r11 = Constraints.m38412getMaxWidthimpl(j) - r5.getWidth();
                                if (z3) {
                                    i3 = Math.max(measureScope2.m38443roundToPx0680j_4(SnackbarKt.SnackbarMinHeightOneLine), r5.getHeight());
                                    int height = (i3 - r8.getHeight()) / 2;
                                    int i7 = r5.get(AlignmentLineKt.getFirstBaseline());
                                    if (i7 != Integer.MIN_VALUE) {
                                        i5 = (i4 + height) - i7;
                                    }
                                    i = i5;
                                    i2 = height;
                                } else {
                                    int r6 = measureScope2.m38443roundToPx0680j_4(SnackbarKt.HeightToFirstLine) - i4;
                                    int max = Math.max(measureScope2.m38443roundToPx0680j_4(SnackbarKt.SnackbarMinHeightTwoLines), r8.getHeight() + r6);
                                    i2 = r6;
                                    i = (max - r5.getHeight()) / 2;
                                    i3 = max;
                                }
                                return MeasureScope.layout$default(measureScope, Constraints.m38412getMaxWidthimpl(j), i3, (Map) null, new SnackbarKt$OneRowSnackbar$2$measure$4(r8, i2, r5, r11, i), 4, (Object) null);
                            }
                            throw new IllegalArgumentException("No baselines for text".toString());
                        }
                        throw new IllegalArgumentException("No baselines for text".toString());
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
