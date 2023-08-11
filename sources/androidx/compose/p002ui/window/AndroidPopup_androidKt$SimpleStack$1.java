package androidx.compose.p002ui.window;

import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nAndroidPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$SimpleStack$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,824:1\n151#2,3:825\n33#2,4:828\n154#2,2:832\n38#2:834\n156#2:835\n*S KotlinDebug\n*F\n+ 1 AndroidPopup.android.kt\nandroidx/compose/ui/window/AndroidPopup_androidKt$SimpleStack$1\n*L\n351#1:825,3\n351#1:828,4\n351#1:832,2\n351#1:834\n351#1:835\n*E\n"})
/* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1 */
/* compiled from: AndroidPopup.android.kt */
public final class AndroidPopup_androidKt$SimpleStack$1 implements MeasurePolicy {
    public static final AndroidPopup_androidKt$SimpleStack$1 INSTANCE = new AndroidPopup_androidKt$SimpleStack$1();

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public final MeasureResult m38713measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
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
                return MeasureScope.layout$default(measureScope, i2, i, (Map) null, new AndroidPopup_androidKt$SimpleStack$1$measure$3(arrayList), 4, (Object) null);
            }
            Placeable r12 = ((Measurable) list.get(0)).m37365measureBRTryo0(j);
            return MeasureScope.layout$default(measureScope, r12.getWidth(), r12.getHeight(), (Map) null, new AndroidPopup_androidKt$SimpleStack$1$measure$2(r12), 4, (Object) null);
        }
        return MeasureScope.layout$default(measureScope, 0, 0, (Map) null, AndroidPopup_androidKt$SimpleStack$1$measure$1.INSTANCE, 4, (Object) null);
    }
}
