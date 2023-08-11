package androidx.compose.material3.tokens;

import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.p002ui.graphics.RectangleShapeKt;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.p002ui.unit.C1232Dp;

/* compiled from: ShapeTokens.kt */
public final class ShapeTokens {
    private static final RoundedCornerShape CornerExtraLarge;
    private static final RoundedCornerShape CornerExtraLargeTop;
    private static final RoundedCornerShape CornerExtraSmall;
    private static final RoundedCornerShape CornerExtraSmallTop;
    private static final RoundedCornerShape CornerFull = RoundedCornerShapeKt.getCircleShape();
    private static final RoundedCornerShape CornerLarge;
    private static final RoundedCornerShape CornerLargeEnd;
    private static final RoundedCornerShape CornerLargeTop;
    private static final RoundedCornerShape CornerMedium = RoundedCornerShapeKt.m33626RoundedCornerShape0680j_4(C1232Dp.m38468constructorimpl((float) 12.0d));
    private static final Shape CornerNone = RectangleShapeKt.getRectangleShape();
    private static final RoundedCornerShape CornerSmall = RoundedCornerShapeKt.m33626RoundedCornerShape0680j_4(C1232Dp.m38468constructorimpl((float) 8.0d));
    public static final ShapeTokens INSTANCE = new ShapeTokens();

    static {
        float f = (float) 28.0d;
        CornerExtraLarge = RoundedCornerShapeKt.m33626RoundedCornerShape0680j_4(C1232Dp.m38468constructorimpl(f));
        float f2 = (float) 0.0d;
        CornerExtraLargeTop = RoundedCornerShapeKt.m33627RoundedCornerShapea9UjIt4(C1232Dp.m38468constructorimpl(f), C1232Dp.m38468constructorimpl(f), C1232Dp.m38468constructorimpl(f2), C1232Dp.m38468constructorimpl(f2));
        float f3 = (float) 4.0d;
        CornerExtraSmall = RoundedCornerShapeKt.m33626RoundedCornerShape0680j_4(C1232Dp.m38468constructorimpl(f3));
        CornerExtraSmallTop = RoundedCornerShapeKt.m33627RoundedCornerShapea9UjIt4(C1232Dp.m38468constructorimpl(f3), C1232Dp.m38468constructorimpl(f3), C1232Dp.m38468constructorimpl(f2), C1232Dp.m38468constructorimpl(f2));
        float f4 = (float) 16.0d;
        CornerLarge = RoundedCornerShapeKt.m33626RoundedCornerShape0680j_4(C1232Dp.m38468constructorimpl(f4));
        CornerLargeEnd = RoundedCornerShapeKt.m33627RoundedCornerShapea9UjIt4(C1232Dp.m38468constructorimpl(f2), C1232Dp.m38468constructorimpl(f4), C1232Dp.m38468constructorimpl(f4), C1232Dp.m38468constructorimpl(f2));
        CornerLargeTop = RoundedCornerShapeKt.m33627RoundedCornerShapea9UjIt4(C1232Dp.m38468constructorimpl(f4), C1232Dp.m38468constructorimpl(f4), C1232Dp.m38468constructorimpl(f2), C1232Dp.m38468constructorimpl(f2));
    }

    private ShapeTokens() {
    }

    public final RoundedCornerShape getCornerExtraLarge() {
        return CornerExtraLarge;
    }

    public final RoundedCornerShape getCornerExtraLargeTop() {
        return CornerExtraLargeTop;
    }

    public final RoundedCornerShape getCornerExtraSmall() {
        return CornerExtraSmall;
    }

    public final RoundedCornerShape getCornerExtraSmallTop() {
        return CornerExtraSmallTop;
    }

    public final RoundedCornerShape getCornerFull() {
        return CornerFull;
    }

    public final RoundedCornerShape getCornerLarge() {
        return CornerLarge;
    }

    public final RoundedCornerShape getCornerLargeEnd() {
        return CornerLargeEnd;
    }

    public final RoundedCornerShape getCornerLargeTop() {
        return CornerLargeTop;
    }

    public final RoundedCornerShape getCornerMedium() {
        return CornerMedium;
    }

    public final Shape getCornerNone() {
        return CornerNone;
    }

    public final RoundedCornerShape getCornerSmall() {
        return CornerSmall;
    }
}
