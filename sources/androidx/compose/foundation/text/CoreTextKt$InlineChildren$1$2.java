package androidx.compose.foundation.text;

import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nCoreText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/CoreTextKt$InlineChildren$1$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,702:1\n151#2,3:703\n33#2,4:706\n154#2,2:710\n38#2:712\n156#2:713\n*S KotlinDebug\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/CoreTextKt$InlineChildren$1$2\n*L\n85#1:703,3\n85#1:706,4\n85#1:710,2\n85#1:712\n85#1:713\n*E\n"})
/* compiled from: CoreText.kt */
final class CoreTextKt$InlineChildren$1$2 implements MeasurePolicy {
    public static final CoreTextKt$InlineChildren$1$2 INSTANCE = new CoreTextKt$InlineChildren$1$2();

    CoreTextKt$InlineChildren$1$2() {
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public final MeasureResult m33653measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        C12775o.m28639i(measureScope, "$this$Layout");
        C12775o.m28639i(list, "children");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((Measurable) list.get(i)).m37365measureBRTryo0(j));
        }
        return MeasureScope.layout$default(measureScope, Constraints.m38412getMaxWidthimpl(j), Constraints.m38411getMaxHeightimpl(j), (Map) null, new CoreTextKt$InlineChildren$1$2$measure$1(arrayList), 4, (Object) null);
    }
}
