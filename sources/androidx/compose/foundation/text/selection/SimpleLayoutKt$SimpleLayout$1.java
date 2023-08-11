package androidx.compose.foundation.text.selection;

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

@SourceDebugExtension({"SMAP\nSimpleLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleLayout.kt\nandroidx/compose/foundation/text/selection/SimpleLayoutKt$SimpleLayout$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n*L\n1#1,53:1\n151#2,3:54\n33#2,4:57\n154#2,2:61\n38#2:63\n156#2:64\n33#2,4:68\n38#2:74\n33#2,4:79\n38#2:85\n59#3,3:65\n62#3,2:72\n64#3:75\n59#3,3:76\n62#3,2:83\n64#3:86\n*S KotlinDebug\n*F\n+ 1 SimpleLayout.kt\nandroidx/compose/foundation/text/selection/SimpleLayoutKt$SimpleLayout$1\n*L\n34#1:54,3\n34#1:57,4\n34#1:61,2\n34#1:63\n34#1:64\n38#1:68,4\n38#1:74\n42#1:79,4\n42#1:85\n38#1:65,3\n38#1:72,2\n38#1:75\n42#1:76,3\n42#1:83,2\n42#1:86\n*E\n"})
/* compiled from: SimpleLayout.kt */
final class SimpleLayoutKt$SimpleLayout$1 implements MeasurePolicy {
    public static final SimpleLayoutKt$SimpleLayout$1 INSTANCE = new SimpleLayoutKt$SimpleLayout$1();

    SimpleLayoutKt$SimpleLayout$1() {
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public final MeasureResult m33835measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        C12775o.m28639i(measureScope, "$this$Layout");
        C12775o.m28639i(list, "measurables");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        Integer num = 0;
        for (int i = 0; i < size; i++) {
            arrayList.add(((Measurable) list.get(i)).m37365measureBRTryo0(j));
        }
        int size2 = arrayList.size();
        Integer num2 = num;
        for (int i2 = 0; i2 < size2; i2++) {
            num2 = Integer.valueOf(Math.max(num2.intValue(), ((Placeable) arrayList.get(i2)).getWidth()));
        }
        int intValue = num2.intValue();
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            num = Integer.valueOf(Math.max(num.intValue(), ((Placeable) arrayList.get(i3)).getHeight()));
        }
        return MeasureScope.layout$default(measureScope, intValue, num.intValue(), (Map) null, new SimpleLayoutKt$SimpleLayout$1$measure$1(arrayList), 4, (Object) null);
    }
}
