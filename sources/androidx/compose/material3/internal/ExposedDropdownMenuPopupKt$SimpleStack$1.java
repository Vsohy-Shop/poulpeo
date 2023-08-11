package androidx.compose.material3.internal;

import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;

/* compiled from: ExposedDropdownMenuPopup.kt */
public final class ExposedDropdownMenuPopupKt$SimpleStack$1 implements MeasurePolicy {
    public static final ExposedDropdownMenuPopupKt$SimpleStack$1 INSTANCE = new ExposedDropdownMenuPopupKt$SimpleStack$1();

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public final MeasureResult m34762measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        int i;
        int i2;
        C12775o.m28639i(measureScope, "$this$Layout");
        C12775o.m28639i(list, "measurables");
        int size = list.size();
        if (size != 0) {
            int i3 = 0;
            if (size != 1) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    arrayList.add(((Measurable) list.get(i4)).m37365measureBRTryo0(j));
                }
                int m = C12726w.m28526m(arrayList);
                if (m >= 0) {
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        Placeable placeable = (Placeable) arrayList.get(i3);
                        i5 = Math.max(i5, placeable.getWidth());
                        i6 = Math.max(i6, placeable.getHeight());
                        if (i3 == m) {
                            break;
                        }
                        i3++;
                    }
                    i2 = i5;
                    i = i6;
                } else {
                    i2 = 0;
                    i = 0;
                }
                return MeasureScope.layout$default(measureScope, i2, i, (Map) null, new ExposedDropdownMenuPopupKt$SimpleStack$1$measure$3(arrayList), 4, (Object) null);
            }
            Placeable r12 = ((Measurable) list.get(0)).m37365measureBRTryo0(j);
            return MeasureScope.layout$default(measureScope, r12.getWidth(), r12.getHeight(), (Map) null, new ExposedDropdownMenuPopupKt$SimpleStack$1$measure$2(r12), 4, (Object) null);
        }
        return MeasureScope.layout$default(measureScope, 0, 0, (Map) null, ExposedDropdownMenuPopupKt$SimpleStack$1$measure$1.INSTANCE, 4, (Object) null);
    }
}
