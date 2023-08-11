package androidx.compose.animation.core;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.geometry.SizeKt;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.DpKt;
import androidx.compose.p002ui.unit.DpOffset;
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.p002ui.unit.IntOffsetKt;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.p002ui.unit.IntSizeKt;
import java.util.Map;
import kotlin.jvm.internal.C12763h;
import kotlin.jvm.internal.C12774n;
import kotlin.jvm.internal.C12775o;
import p336ef.C11915r;

/* compiled from: VisibilityThresholds.kt */
public final class VisibilityThresholdsKt {
    private static final float DpVisibilityThreshold = 0.1f;
    private static final float PxVisibilityThreshold = 0.5f;
    private static final Rect rectVisibilityThreshold = new Rect(0.5f, 0.5f, 0.5f, 0.5f);
    private static final Map<TwoWayConverter<?, ?>, Float> visibilityThresholdMap;

    static {
        Float valueOf = Float.valueOf(0.5f);
        TwoWayConverter<Integer, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(C12774n.f20424a);
        Float valueOf2 = Float.valueOf(1.0f);
        TwoWayConverter<C1232Dp, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(C1232Dp.Companion);
        Float valueOf3 = Float.valueOf(0.1f);
        visibilityThresholdMap = C12716r0.m28419j(C11915r.m25707a(vectorConverter, valueOf2), C11915r.m25707a(VectorConvertersKt.getVectorConverter(IntSize.Companion), valueOf2), C11915r.m25707a(VectorConvertersKt.getVectorConverter(IntOffset.Companion), valueOf2), C11915r.m25707a(VectorConvertersKt.getVectorConverter(C12763h.f20419a), Float.valueOf(0.01f)), C11915r.m25707a(VectorConvertersKt.getVectorConverter(Rect.Companion), valueOf), C11915r.m25707a(VectorConvertersKt.getVectorConverter(Size.Companion), valueOf), C11915r.m25707a(VectorConvertersKt.getVectorConverter(Offset.Companion), valueOf), C11915r.m25707a(vectorConverter2, valueOf3), C11915r.m25707a(VectorConvertersKt.getVectorConverter(DpOffset.Companion), valueOf3));
    }

    public static final int getVisibilityThreshold(C12774n nVar) {
        C12775o.m28639i(nVar, "<this>");
        return 1;
    }

    public static final Map<TwoWayConverter<?, ?>, Float> getVisibilityThresholdMap() {
        return visibilityThresholdMap;
    }

    public static final long getVisibilityThreshold(IntOffset.Companion companion) {
        C12775o.m28639i(companion, "<this>");
        return IntOffsetKt.IntOffset(1, 1);
    }

    public static final long getVisibilityThreshold(Offset.Companion companion) {
        C12775o.m28639i(companion, "<this>");
        return OffsetKt.Offset(0.5f, 0.5f);
    }

    public static final long getVisibilityThreshold(DpOffset.Companion companion) {
        C12775o.m28639i(companion, "<this>");
        C1232Dp.Companion companion2 = C1232Dp.Companion;
        return DpKt.m38489DpOffsetYgX7TsA(getVisibilityThreshold(companion2), getVisibilityThreshold(companion2));
    }

    public static final long getVisibilityThreshold(Size.Companion companion) {
        C12775o.m28639i(companion, "<this>");
        return SizeKt.Size(0.5f, 0.5f);
    }

    public static final long getVisibilityThreshold(IntSize.Companion companion) {
        C12775o.m28639i(companion, "<this>");
        return IntSizeKt.IntSize(1, 1);
    }

    public static final Rect getVisibilityThreshold(Rect.Companion companion) {
        C12775o.m28639i(companion, "<this>");
        return rectVisibilityThreshold;
    }

    public static final float getVisibilityThreshold(C1232Dp.Companion companion) {
        C12775o.m28639i(companion, "<this>");
        return C1232Dp.m38468constructorimpl(0.1f);
    }
}
