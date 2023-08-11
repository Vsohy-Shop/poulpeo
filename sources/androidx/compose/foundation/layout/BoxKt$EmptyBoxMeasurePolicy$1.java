package androidx.compose.foundation.layout;

import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.unit.Constraints;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;

/* compiled from: Box.kt */
final class BoxKt$EmptyBoxMeasurePolicy$1 implements MeasurePolicy {
    public static final BoxKt$EmptyBoxMeasurePolicy$1 INSTANCE = new BoxKt$EmptyBoxMeasurePolicy$1();

    BoxKt$EmptyBoxMeasurePolicy$1() {
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public final MeasureResult m33219measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        C12775o.m28639i(measureScope, "$this$MeasurePolicy");
        C12775o.m28639i(list, "<anonymous parameter 0>");
        return MeasureScope.layout$default(measureScope, Constraints.m38414getMinWidthimpl(j), Constraints.m38413getMinHeightimpl(j), (Map) null, BoxKt$EmptyBoxMeasurePolicy$1$measure$1.INSTANCE, 4, (Object) null);
    }
}
