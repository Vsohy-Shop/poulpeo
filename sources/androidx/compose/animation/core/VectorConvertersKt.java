package androidx.compose.animation.core;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.DpOffset;
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.p002ui.unit.IntSize;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12763h;
import kotlin.jvm.internal.C12774n;
import kotlin.jvm.internal.C12775o;

/* compiled from: VectorConverters.kt */
public final class VectorConvertersKt {
    private static final TwoWayConverter<DpOffset, AnimationVector2D> DpOffsetToVector = TwoWayConverter(VectorConvertersKt$DpOffsetToVector$1.INSTANCE, VectorConvertersKt$DpOffsetToVector$2.INSTANCE);
    private static final TwoWayConverter<C1232Dp, AnimationVector1D> DpToVector = TwoWayConverter(VectorConvertersKt$DpToVector$1.INSTANCE, VectorConvertersKt$DpToVector$2.INSTANCE);
    private static final TwoWayConverter<Float, AnimationVector1D> FloatToVector = TwoWayConverter(VectorConvertersKt$FloatToVector$1.INSTANCE, VectorConvertersKt$FloatToVector$2.INSTANCE);
    private static final TwoWayConverter<IntOffset, AnimationVector2D> IntOffsetToVector = TwoWayConverter(VectorConvertersKt$IntOffsetToVector$1.INSTANCE, VectorConvertersKt$IntOffsetToVector$2.INSTANCE);
    private static final TwoWayConverter<IntSize, AnimationVector2D> IntSizeToVector = TwoWayConverter(VectorConvertersKt$IntSizeToVector$1.INSTANCE, VectorConvertersKt$IntSizeToVector$2.INSTANCE);
    private static final TwoWayConverter<Integer, AnimationVector1D> IntToVector = TwoWayConverter(VectorConvertersKt$IntToVector$1.INSTANCE, VectorConvertersKt$IntToVector$2.INSTANCE);
    private static final TwoWayConverter<Offset, AnimationVector2D> OffsetToVector = TwoWayConverter(VectorConvertersKt$OffsetToVector$1.INSTANCE, VectorConvertersKt$OffsetToVector$2.INSTANCE);
    private static final TwoWayConverter<Rect, AnimationVector4D> RectToVector = TwoWayConverter(VectorConvertersKt$RectToVector$1.INSTANCE, VectorConvertersKt$RectToVector$2.INSTANCE);
    private static final TwoWayConverter<Size, AnimationVector2D> SizeToVector = TwoWayConverter(VectorConvertersKt$SizeToVector$1.INSTANCE, VectorConvertersKt$SizeToVector$2.INSTANCE);

    public static final <T, V extends AnimationVector> TwoWayConverter<T, V> TwoWayConverter(Function1<? super T, ? extends V> function1, Function1<? super V, ? extends T> function12) {
        C12775o.m28639i(function1, "convertToVector");
        C12775o.m28639i(function12, "convertFromVector");
        return new TwoWayConverterImpl(function1, function12);
    }

    public static final TwoWayConverter<Float, AnimationVector1D> getVectorConverter(C12763h hVar) {
        C12775o.m28639i(hVar, "<this>");
        return FloatToVector;
    }

    public static final float lerp(float f, float f2, float f3) {
        return (f * (((float) 1) - f3)) + (f2 * f3);
    }

    public static final TwoWayConverter<Integer, AnimationVector1D> getVectorConverter(C12774n nVar) {
        C12775o.m28639i(nVar, "<this>");
        return IntToVector;
    }

    public static final TwoWayConverter<Rect, AnimationVector4D> getVectorConverter(Rect.Companion companion) {
        C12775o.m28639i(companion, "<this>");
        return RectToVector;
    }

    public static final TwoWayConverter<C1232Dp, AnimationVector1D> getVectorConverter(C1232Dp.Companion companion) {
        C12775o.m28639i(companion, "<this>");
        return DpToVector;
    }

    public static final TwoWayConverter<DpOffset, AnimationVector2D> getVectorConverter(DpOffset.Companion companion) {
        C12775o.m28639i(companion, "<this>");
        return DpOffsetToVector;
    }

    public static final TwoWayConverter<Size, AnimationVector2D> getVectorConverter(Size.Companion companion) {
        C12775o.m28639i(companion, "<this>");
        return SizeToVector;
    }

    public static final TwoWayConverter<Offset, AnimationVector2D> getVectorConverter(Offset.Companion companion) {
        C12775o.m28639i(companion, "<this>");
        return OffsetToVector;
    }

    public static final TwoWayConverter<IntOffset, AnimationVector2D> getVectorConverter(IntOffset.Companion companion) {
        C12775o.m28639i(companion, "<this>");
        return IntOffsetToVector;
    }

    public static final TwoWayConverter<IntSize, AnimationVector2D> getVectorConverter(IntSize.Companion companion) {
        C12775o.m28639i(companion, "<this>");
        return IntSizeToVector;
    }
}
