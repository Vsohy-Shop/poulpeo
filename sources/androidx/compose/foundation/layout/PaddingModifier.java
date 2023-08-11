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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingModifier\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,436:1\n155#2:437\n155#2:438\n155#2:439\n155#2:440\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingModifier\n*L\n338#1:437\n339#1:438\n340#1:439\n341#1:440\n*E\n"})
/* compiled from: Padding.kt */
final class PaddingModifier extends InspectorValueInfo implements LayoutModifier {
    private final float bottom;
    private final float end;
    private final boolean rtlAware;
    private final float start;
    private final float top;

    public /* synthetic */ PaddingModifier(float f, float f2, float f3, float f4, boolean z, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, z, function1);
    }

    public boolean equals(Object obj) {
        PaddingModifier paddingModifier;
        if (obj instanceof PaddingModifier) {
            paddingModifier = (PaddingModifier) obj;
        } else {
            paddingModifier = null;
        }
        if (paddingModifier != null && C1232Dp.m38473equalsimpl0(this.start, paddingModifier.start) && C1232Dp.m38473equalsimpl0(this.top, paddingModifier.top) && C1232Dp.m38473equalsimpl0(this.end, paddingModifier.end) && C1232Dp.m38473equalsimpl0(this.bottom, paddingModifier.bottom) && this.rtlAware == paddingModifier.rtlAware) {
            return true;
        }
        return false;
    }

    /* renamed from: getBottom-D9Ej5fM  reason: not valid java name */
    public final float m33273getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getEnd-D9Ej5fM  reason: not valid java name */
    public final float m33274getEndD9Ej5fM() {
        return this.end;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    /* renamed from: getStart-D9Ej5fM  reason: not valid java name */
    public final float m33275getStartD9Ej5fM() {
        return this.start;
    }

    /* renamed from: getTop-D9Ej5fM  reason: not valid java name */
    public final float m33276getTopD9Ej5fM() {
        return this.top;
    }

    public int hashCode() {
        return (((((((C1232Dp.m38474hashCodeimpl(this.start) * 31) + C1232Dp.m38474hashCodeimpl(this.top)) * 31) + C1232Dp.m38474hashCodeimpl(this.end)) * 31) + C1232Dp.m38474hashCodeimpl(this.bottom)) * 31) + Boolean.hashCode(this.rtlAware);
    }

    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult m33277measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        C12775o.m28639i(measureScope, "$this$measure");
        C12775o.m28639i(measurable, "measurable");
        int r0 = measureScope.m38443roundToPx0680j_4(this.start) + measureScope.m38443roundToPx0680j_4(this.end);
        int r1 = measureScope.m38443roundToPx0680j_4(this.top) + measureScope.m38443roundToPx0680j_4(this.bottom);
        Placeable r12 = measurable.m37365measureBRTryo0(ConstraintsKt.m38428offsetNN6EwU(j, -r0, -r1));
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m38426constrainWidthK40F9xA(j, r12.getWidth() + r0), ConstraintsKt.m38425constrainHeightK40F9xA(j, r12.getHeight() + r1), (Map) null, new PaddingModifier$measure$1(this, r12, measureScope), 4, (Object) null);
    }

    private PaddingModifier(float f, float f2, float f3, float f4, boolean z, Function1<? super InspectorInfo, C11921v> function1) {
        super(function1);
        this.start = f;
        this.top = f2;
        this.end = f3;
        this.bottom = f4;
        this.rtlAware = z;
        if (!((f >= 0.0f || C1232Dp.m38473equalsimpl0(f, C1232Dp.Companion.m38488getUnspecifiedD9Ej5fM())) && (f2 >= 0.0f || C1232Dp.m38473equalsimpl0(f2, C1232Dp.Companion.m38488getUnspecifiedD9Ej5fM())) && ((f3 >= 0.0f || C1232Dp.m38473equalsimpl0(f3, C1232Dp.Companion.m38488getUnspecifiedD9Ej5fM())) && (f4 >= 0.0f || C1232Dp.m38473equalsimpl0(f4, C1232Dp.Companion.m38488getUnspecifiedD9Ej5fM()))))) {
            throw new IllegalArgumentException("Padding must be non-negative".toString());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaddingModifier(float f, float f2, float f3, float f4, boolean z, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C1232Dp.m38468constructorimpl((float) 0) : f, (i & 2) != 0 ? C1232Dp.m38468constructorimpl((float) 0) : f2, (i & 4) != 0 ? C1232Dp.m38468constructorimpl((float) 0) : f3, (i & 8) != 0 ? C1232Dp.m38468constructorimpl((float) 0) : f4, z, function1, (DefaultConstructorMarker) null);
    }
}
