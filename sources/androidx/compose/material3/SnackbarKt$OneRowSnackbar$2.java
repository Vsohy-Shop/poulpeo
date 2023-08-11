package androidx.compose.material3;

import androidx.compose.material3.tokens.SnackbarTokens;
import androidx.compose.p002ui.layout.AlignmentLineKt;
import androidx.compose.p002ui.layout.LayoutIdKt;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.Constraints;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C12775o;

/* compiled from: Snackbar.kt */
final class SnackbarKt$OneRowSnackbar$2 implements MeasurePolicy {
    final /* synthetic */ String $actionTag;
    final /* synthetic */ String $dismissActionTag;
    final /* synthetic */ String $textTag;

    SnackbarKt$OneRowSnackbar$2(String str, String str2, String str3) {
        this.$actionTag = str;
        this.$dismissActionTag = str2;
        this.$textTag = str3;
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public final MeasureResult m34576measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        Placeable placeable;
        Object obj;
        Placeable placeable2;
        Object obj2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        MeasureScope measureScope2 = measureScope;
        List<? extends Measurable> list2 = list;
        long j2 = j;
        C12775o.m28639i(measureScope2, "$this$Layout");
        C12775o.m28639i(list2, "measurables");
        int min = Math.min(Constraints.m38412getMaxWidthimpl(j), measureScope2.m38443roundToPx0680j_4(SnackbarKt.ContainerMaxWidth));
        Iterable<Measurable> iterable = list2;
        String str = this.$actionTag;
        Iterator it = iterable.iterator();
        while (true) {
            placeable = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C12775o.m28634d(LayoutIdKt.getLayoutId((Measurable) obj), str)) {
                break;
            }
        }
        Measurable measurable = (Measurable) obj;
        if (measurable != null) {
            placeable2 = measurable.m37365measureBRTryo0(j2);
        } else {
            placeable2 = null;
        }
        String str2 = this.$dismissActionTag;
        Iterator it2 = iterable.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (C12775o.m28634d(LayoutIdKt.getLayoutId((Measurable) obj2), str2)) {
                break;
            }
        }
        Measurable measurable2 = (Measurable) obj2;
        if (measurable2 != null) {
            placeable = measurable2.m37365measureBRTryo0(j2);
        }
        Placeable placeable3 = placeable;
        if (placeable2 != null) {
            i = placeable2.getWidth();
        } else {
            i = 0;
        }
        if (placeable2 != null) {
            i2 = placeable2.getHeight();
        } else {
            i2 = 0;
        }
        if (placeable3 != null) {
            i3 = placeable3.getWidth();
        } else {
            i3 = 0;
        }
        if (placeable3 != null) {
            i4 = placeable3.getHeight();
        } else {
            i4 = 0;
        }
        if (i3 == 0) {
            i5 = measureScope2.m38443roundToPx0680j_4(SnackbarKt.TextEndExtraSpacing);
        } else {
            i5 = 0;
        }
        int d = C13537l.m30877d(((min - i) - i3) - i5, Constraints.m38414getMinWidthimpl(j));
        String str3 = this.$textTag;
        for (Measurable measurable3 : iterable) {
            if (C12775o.m28634d(LayoutIdKt.getLayoutId(measurable3), str3)) {
                int i13 = i4;
                Placeable r2 = measurable3.m37365measureBRTryo0(Constraints.m38403copyZbe2FdA$default(j, 0, d, 0, 0, 9, (Object) null));
                int i14 = r2.get(AlignmentLineKt.getFirstBaseline());
                boolean z3 = true;
                if (i14 != Integer.MIN_VALUE) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    int i15 = r2.get(AlignmentLineKt.getLastBaseline());
                    if (i15 != Integer.MIN_VALUE) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        if (i14 != i15) {
                            z3 = false;
                        }
                        int i16 = min - i3;
                        int i17 = i16 - i;
                        if (z3) {
                            int max = Math.max(measureScope2.m38443roundToPx0680j_4(SnackbarTokens.INSTANCE.m35174getSingleLineContainerHeightD9Ej5fM()), Math.max(i2, i13));
                            int height = (max - r2.getHeight()) / 2;
                            if (placeable2 == null || (i12 = placeable2.get(AlignmentLineKt.getFirstBaseline())) == Integer.MIN_VALUE) {
                                i11 = 0;
                            } else {
                                i11 = (i14 + height) - i12;
                            }
                            i6 = i11;
                            i7 = height;
                            i8 = max;
                        } else {
                            int r0 = measureScope2.m38443roundToPx0680j_4(SnackbarKt.HeightToFirstLine) - i14;
                            i8 = Math.max(measureScope2.m38443roundToPx0680j_4(SnackbarTokens.INSTANCE.m35175getTwoLinesContainerHeightD9Ej5fM()), r2.getHeight() + r0);
                            if (placeable2 != null) {
                                i10 = (i8 - placeable2.getHeight()) / 2;
                            } else {
                                i10 = 0;
                            }
                            i7 = r0;
                            i6 = i10;
                        }
                        if (placeable3 != null) {
                            i9 = (i8 - placeable3.getHeight()) / 2;
                        } else {
                            i9 = 0;
                        }
                        return MeasureScope.layout$default(measureScope, min, i8, (Map) null, new SnackbarKt$OneRowSnackbar$2$measure$4(r2, i7, placeable3, i16, i9, placeable2, i17, i6), 4, (Object) null);
                    }
                    throw new IllegalArgumentException("No baselines for text".toString());
                }
                throw new IllegalArgumentException("No baselines for text".toString());
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
