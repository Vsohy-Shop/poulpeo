package androidx.compose.foundation.shape;

import androidx.compose.p002ui.unit.C1232Dp;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nRoundedCornerShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoundedCornerShape.kt\nandroidx/compose/foundation/shape/RoundedCornerShapeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,200:1\n154#2:201\n154#2:202\n154#2:203\n154#2:204\n*S KotlinDebug\n*F\n+ 1 RoundedCornerShape.kt\nandroidx/compose/foundation/shape/RoundedCornerShapeKt\n*L\n147#1:201\n148#1:202\n149#1:203\n150#1:204\n*E\n"})
/* compiled from: RoundedCornerShape.kt */
public final class RoundedCornerShapeKt {
    private static final RoundedCornerShape CircleShape = RoundedCornerShape(50);

    public static final RoundedCornerShape RoundedCornerShape(CornerSize cornerSize) {
        C12775o.m28639i(cornerSize, "corner");
        return new RoundedCornerShape(cornerSize, cornerSize, cornerSize, cornerSize);
    }

    public static /* synthetic */ RoundedCornerShape RoundedCornerShape$default(float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        return RoundedCornerShape(f, f2, f3, f4);
    }

    /* renamed from: RoundedCornerShape-0680j_4  reason: not valid java name */
    public static final RoundedCornerShape m33626RoundedCornerShape0680j_4(float f) {
        return RoundedCornerShape(CornerSizeKt.m33611CornerSize0680j_4(f));
    }

    /* renamed from: RoundedCornerShape-a9UjIt4  reason: not valid java name */
    public static final RoundedCornerShape m33627RoundedCornerShapea9UjIt4(float f, float f2, float f3, float f4) {
        return new RoundedCornerShape(CornerSizeKt.m33611CornerSize0680j_4(f), CornerSizeKt.m33611CornerSize0680j_4(f2), CornerSizeKt.m33611CornerSize0680j_4(f3), CornerSizeKt.m33611CornerSize0680j_4(f4));
    }

    /* renamed from: RoundedCornerShape-a9UjIt4$default  reason: not valid java name */
    public static /* synthetic */ RoundedCornerShape m33628RoundedCornerShapea9UjIt4$default(float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C1232Dp.m38468constructorimpl((float) 0);
        }
        if ((i & 2) != 0) {
            f2 = C1232Dp.m38468constructorimpl((float) 0);
        }
        if ((i & 4) != 0) {
            f3 = C1232Dp.m38468constructorimpl((float) 0);
        }
        if ((i & 8) != 0) {
            f4 = C1232Dp.m38468constructorimpl((float) 0);
        }
        return m33627RoundedCornerShapea9UjIt4(f, f2, f3, f4);
    }

    public static final RoundedCornerShape getCircleShape() {
        return CircleShape;
    }

    public static final RoundedCornerShape RoundedCornerShape(float f) {
        return RoundedCornerShape(CornerSizeKt.CornerSize(f));
    }

    public static /* synthetic */ RoundedCornerShape RoundedCornerShape$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        return RoundedCornerShape(i, i2, i3, i4);
    }

    public static final RoundedCornerShape RoundedCornerShape(int i) {
        return RoundedCornerShape(CornerSizeKt.CornerSize(i));
    }

    public static final RoundedCornerShape RoundedCornerShape(float f, float f2, float f3, float f4) {
        return new RoundedCornerShape(CornerSizeKt.CornerSize(f), CornerSizeKt.CornerSize(f2), CornerSizeKt.CornerSize(f3), CornerSizeKt.CornerSize(f4));
    }

    public static final RoundedCornerShape RoundedCornerShape(int i, int i2, int i3, int i4) {
        return new RoundedCornerShape(CornerSizeKt.CornerSize(i), CornerSizeKt.CornerSize(i2), CornerSizeKt.CornerSize(i3), CornerSizeKt.CornerSize(i4));
    }
}
