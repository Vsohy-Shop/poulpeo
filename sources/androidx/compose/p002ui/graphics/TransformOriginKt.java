package androidx.compose.p002ui.graphics;

import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nTransformOrigin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformOrigin.kt\nandroidx/compose/ui/graphics/TransformOriginKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,83:1\n25#2,3:84\n*S KotlinDebug\n*F\n+ 1 TransformOrigin.kt\nandroidx/compose/ui/graphics/TransformOriginKt\n*L\n30#1:84,3\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.TransformOriginKt */
/* compiled from: TransformOrigin.kt */
public final class TransformOriginKt {
    public static final long TransformOrigin(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        return TransformOrigin.m36083constructorimpl((((long) Float.floatToIntBits(f2)) & 4294967295L) | (floatToIntBits << 32));
    }
}
