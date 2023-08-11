package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.unit.Constraints;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.layout.TestModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1 */
/* compiled from: TestModifierUpdater.kt */
final class TestModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1 implements MeasurePolicy {
    public static final TestModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1 INSTANCE = new TestModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1();

    TestModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1() {
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public final MeasureResult m37443measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j) {
        C12775o.m28639i(measureScope, "$this$MeasurePolicy");
        C12775o.m28639i(list, "<anonymous parameter 0>");
        return MeasureScope.layout$default(measureScope, Constraints.m38412getMaxWidthimpl(j), Constraints.m38411getMaxHeightimpl(j), (Map) null, C1052x552e748f.INSTANCE, 4, (Object) null);
    }
}
