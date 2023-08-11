package androidx.compose.foundation;

import androidx.compose.p002ui.layout.Measurable;
import androidx.compose.p002ui.layout.MeasureResult;
import androidx.compose.p002ui.layout.MeasureScope;
import androidx.compose.p002ui.layout.Placeable;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Constraints;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nAndroidOverscroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,589:1\n92#2:590\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1\n*L\n563#1:590\n*E\n"})
/* compiled from: AndroidOverscroll.kt */
final class AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1 extends C12777p implements C13089p<MeasureScope, Measurable, Constraints, MeasureResult> {
    public static final AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1 INSTANCE = new AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1();

    AndroidOverscrollKt$StretchOverscrollNonClippingLayer$1() {
        super(3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m32954invoke3p2s80s((MeasureScope) obj, (Measurable) obj2, ((Constraints) obj3).m38418unboximpl());
    }

    /* renamed from: invoke-3p2s80s  reason: not valid java name */
    public final MeasureResult m32954invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        C12775o.m28639i(measureScope, "$this$layout");
        C12775o.m28639i(measurable, "measurable");
        final Placeable r9 = measurable.m37365measureBRTryo0(j);
        final int r10 = measureScope.m38443roundToPx0680j_4(C1232Dp.m38468constructorimpl(ClipScrollableContainerKt.getMaxSupportedElevation() * ((float) 2)));
        return MeasureScope.layout$default(measureScope, r9.getMeasuredWidth() - r10, r9.getMeasuredHeight() - r10, (Map) null, new Function1<Placeable.PlacementScope, C11921v>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C11921v.f18618a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                C12775o.m28639i(placementScope, "$this$layout");
                Placeable placeable = r9;
                Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, ((-r10) / 2) - ((placeable.getWidth() - r9.getMeasuredWidth()) / 2), ((-r10) / 2) - ((r9.getHeight() - r9.getMeasuredHeight()) / 2), 0.0f, (Function1) null, 12, (Object) null);
            }
        }, 4, (Object) null);
    }
}
