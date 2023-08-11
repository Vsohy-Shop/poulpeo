package androidx.compose.foundation.shape;

import androidx.compose.p002ui.unit.C1232Dp;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nCutCornerShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CutCornerShape.kt\nandroidx/compose/foundation/shape/CutCornerShapeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,198:1\n154#2:199\n154#2:200\n154#2:201\n154#2:202\n*S KotlinDebug\n*F\n+ 1 CutCornerShape.kt\nandroidx/compose/foundation/shape/CutCornerShapeKt\n*L\n145#1:199\n146#1:200\n147#1:201\n148#1:202\n*E\n"})
/* compiled from: CutCornerShape.kt */
public final class CutCornerShapeKt {
    public static final CutCornerShape CutCornerShape(CornerSize cornerSize) {
        C12775o.m28639i(cornerSize, "corner");
        return new CutCornerShape(cornerSize, cornerSize, cornerSize, cornerSize);
    }

    public static /* synthetic */ CutCornerShape CutCornerShape$default(float f, float f2, float f3, float f4, int i, Object obj) {
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
        return CutCornerShape(f, f2, f3, f4);
    }

    /* renamed from: CutCornerShape-0680j_4  reason: not valid java name */
    public static final CutCornerShape m33614CutCornerShape0680j_4(float f) {
        return CutCornerShape(CornerSizeKt.m33611CornerSize0680j_4(f));
    }

    /* renamed from: CutCornerShape-a9UjIt4  reason: not valid java name */
    public static final CutCornerShape m33615CutCornerShapea9UjIt4(float f, float f2, float f3, float f4) {
        return new CutCornerShape(CornerSizeKt.m33611CornerSize0680j_4(f), CornerSizeKt.m33611CornerSize0680j_4(f2), CornerSizeKt.m33611CornerSize0680j_4(f3), CornerSizeKt.m33611CornerSize0680j_4(f4));
    }

    /* renamed from: CutCornerShape-a9UjIt4$default  reason: not valid java name */
    public static /* synthetic */ CutCornerShape m33616CutCornerShapea9UjIt4$default(float f, float f2, float f3, float f4, int i, Object obj) {
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
        return m33615CutCornerShapea9UjIt4(f, f2, f3, f4);
    }

    public static final CutCornerShape CutCornerShape(float f) {
        return CutCornerShape(CornerSizeKt.CornerSize(f));
    }

    public static /* synthetic */ CutCornerShape CutCornerShape$default(int i, int i2, int i3, int i4, int i5, Object obj) {
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
        return CutCornerShape(i, i2, i3, i4);
    }

    public static final CutCornerShape CutCornerShape(int i) {
        return CutCornerShape(CornerSizeKt.CornerSize(i));
    }

    public static final CutCornerShape CutCornerShape(float f, float f2, float f3, float f4) {
        return new CutCornerShape(CornerSizeKt.CornerSize(f), CornerSizeKt.CornerSize(f2), CornerSizeKt.CornerSize(f3), CornerSizeKt.CornerSize(f4));
    }

    public static final CutCornerShape CutCornerShape(int i, int i2, int i3, int i4) {
        return new CutCornerShape(CornerSizeKt.CornerSize(i), CornerSizeKt.CornerSize(i2), CornerSizeKt.CornerSize(i3), CornerSizeKt.CornerSize(i4));
    }
}
