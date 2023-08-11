package androidx.compose.foundation;

import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasurePolicy;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.unit.Constraints;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;

/* compiled from: Image.kt */
final class ImageKt$Image$2 implements MeasurePolicy {
    public static final ImageKt$Image$2 INSTANCE = new ImageKt$Image$2();

    ImageKt$Image$2() {
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public final MeasureResult m33002measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        C12775o.m28639i(measureScope, "$this$Layout");
        C12775o.m28639i(list, "<anonymous parameter 0>");
        return MeasureScope.layout$default(measureScope, Constraints.m38414getMinWidthimpl(j), Constraints.m38413getMinHeightimpl(j), (Map) null, ImageKt$Image$2$measure$1.INSTANCE, 4, (Object) null);
    }
}
