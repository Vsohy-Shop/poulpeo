package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.ColorKt;
import androidx.compose.p002ui.graphics.colorspace.ColorSpace;
import androidx.compose.p002ui.graphics.colorspace.ColorSpaces;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: ColorVectorConverter.kt */
final class ColorVectorConverterKt$ColorToVector$1 extends C12777p implements Function1<ColorSpace, TwoWayConverter<Color, AnimationVector4D>> {
    public static final ColorVectorConverterKt$ColorToVector$1 INSTANCE = new ColorVectorConverterKt$ColorToVector$1();

    ColorVectorConverterKt$ColorToVector$1() {
        super(1);
    }

    public final TwoWayConverter<Color, AnimationVector4D> invoke(final ColorSpace colorSpace) {
        C12775o.m28639i(colorSpace, "colorSpace");
        return VectorConvertersKt.TwoWayConverter(C03291.INSTANCE, new Function1<AnimationVector4D, Color>() {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return Color.m35661boximpl(m32829invokevNxB06k((AnimationVector4D) obj));
            }

            /* renamed from: invoke-vNxB06k  reason: not valid java name */
            public final long m32829invokevNxB06k(AnimationVector4D animationVector4D) {
                C12775o.m28639i(animationVector4D, "it");
                double d = (double) 3.0f;
                float pow = (float) Math.pow((double) animationVector4D.getV2(), d);
                float pow2 = (float) Math.pow((double) animationVector4D.getV3(), d);
                float pow3 = (float) Math.pow((double) animationVector4D.getV4(), d);
                float access$multiplyColumn = ColorVectorConverterKt.multiplyColumn(0, pow, pow2, pow3, ColorVectorConverterKt.InverseM1);
                float access$multiplyColumn2 = ColorVectorConverterKt.multiplyColumn(1, pow, pow2, pow3, ColorVectorConverterKt.InverseM1);
                float access$multiplyColumn3 = ColorVectorConverterKt.multiplyColumn(2, pow, pow2, pow3, ColorVectorConverterKt.InverseM1);
                return Color.m35668convertvNxB06k(ColorKt.Color(C13537l.m30885l(access$multiplyColumn, -2.0f, 2.0f), C13537l.m30885l(access$multiplyColumn2, -2.0f, 2.0f), C13537l.m30885l(access$multiplyColumn3, -2.0f, 2.0f), C13537l.m30885l(animationVector4D.getV1(), 0.0f, 1.0f), ColorSpaces.INSTANCE.getCieXyz()), colorSpace);
            }
        });
    }
}
