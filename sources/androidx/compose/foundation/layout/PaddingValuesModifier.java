package androidx.compose.foundation.layout;

import androidx.compose.p002ui.layout.LayoutModifier;
import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.p002ui.platform.InspectorValueInfo;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.ConstraintsKt;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesModifier\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,436:1\n155#2:437\n155#2:438\n155#2:439\n155#2:440\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValuesModifier\n*L\n405#1:437\n406#1:438\n407#1:439\n408#1:440\n*E\n"})
/* compiled from: Padding.kt */
final class PaddingValuesModifier extends InspectorValueInfo implements LayoutModifier {
    private final PaddingValues paddingValues;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaddingValuesModifier(PaddingValues paddingValues2, Function1<? super InspectorInfo, C11921v> function1) {
        super(function1);
        C12775o.m28639i(paddingValues2, "paddingValues");
        C12775o.m28639i(function1, "inspectorInfo");
        this.paddingValues = paddingValues2;
    }

    public boolean equals(Object obj) {
        PaddingValuesModifier paddingValuesModifier;
        if (obj instanceof PaddingValuesModifier) {
            paddingValuesModifier = (PaddingValuesModifier) obj;
        } else {
            paddingValuesModifier = null;
        }
        if (paddingValuesModifier == null) {
            return false;
        }
        return C12775o.m28634d(this.paddingValues, paddingValuesModifier.paddingValues);
    }

    public final PaddingValues getPaddingValues() {
        return this.paddingValues;
    }

    public int hashCode() {
        return this.paddingValues.hashCode();
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m33302measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        C12775o.m28639i(measureScope, "$this$measure");
        C12775o.m28639i(measurable, "measurable");
        boolean z = false;
        float f = (float) 0;
        if (C1232Dp.m38467compareTo0680j_4(this.paddingValues.m33279calculateLeftPaddingu2uoSUM(measureScope.getLayoutDirection()), C1232Dp.m38468constructorimpl(f)) >= 0 && C1232Dp.m38467compareTo0680j_4(this.paddingValues.m33281calculateTopPaddingD9Ej5fM(), C1232Dp.m38468constructorimpl(f)) >= 0 && C1232Dp.m38467compareTo0680j_4(this.paddingValues.m33280calculateRightPaddingu2uoSUM(measureScope.getLayoutDirection()), C1232Dp.m38468constructorimpl(f)) >= 0 && C1232Dp.m38467compareTo0680j_4(this.paddingValues.m33278calculateBottomPaddingD9Ej5fM(), C1232Dp.m38468constructorimpl(f)) >= 0) {
            z = true;
        }
        if (z) {
            int r0 = measureScope.m38443roundToPx0680j_4(this.paddingValues.m33279calculateLeftPaddingu2uoSUM(measureScope.getLayoutDirection())) + measureScope.m38443roundToPx0680j_4(this.paddingValues.m33280calculateRightPaddingu2uoSUM(measureScope.getLayoutDirection()));
            int r1 = measureScope.m38443roundToPx0680j_4(this.paddingValues.m33281calculateTopPaddingD9Ej5fM()) + measureScope.m38443roundToPx0680j_4(this.paddingValues.m33278calculateBottomPaddingD9Ej5fM());
            Placeable r12 = measurable.m37365measureBRTryo0(ConstraintsKt.m38428offsetNN6EwU(j, -r0, -r1));
            return MeasureScope.layout$default(measureScope, ConstraintsKt.m38426constrainWidthK40F9xA(j, r12.getWidth() + r0), ConstraintsKt.m38425constrainHeightK40F9xA(j, r12.getHeight() + r1), (Map) null, new PaddingValuesModifier$measure$2(r12, measureScope, this), 4, (Object) null);
        }
        throw new IllegalArgumentException("Padding must be non-negative".toString());
    }
}
