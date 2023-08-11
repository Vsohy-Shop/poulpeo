package androidx.compose.p002ui.platform;

import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.DpKt;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nViewConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewConfiguration.kt\nandroidx/compose/ui/platform/ViewConfiguration\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,57:1\n154#2:58\n*S KotlinDebug\n*F\n+ 1 ViewConfiguration.kt\nandroidx/compose/ui/platform/ViewConfiguration\n*L\n56#1:58\n*E\n"})
/* renamed from: androidx.compose.ui.platform.ViewConfiguration */
/* compiled from: ViewConfiguration.kt */
public interface ViewConfiguration {

    /* renamed from: androidx.compose.ui.platform.ViewConfiguration$DefaultImpls */
    /* compiled from: ViewConfiguration.kt */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: getMinimumTouchTargetSize-MYxV2XQ  reason: not valid java name */
        public static long m37784getMinimumTouchTargetSizeMYxV2XQ(ViewConfiguration viewConfiguration) {
            return ViewConfiguration.super.m37783getMinimumTouchTargetSizeMYxV2XQ();
        }
    }

    long getDoubleTapMinTimeMillis();

    long getDoubleTapTimeoutMillis();

    long getLongPressTimeoutMillis();

    /* renamed from: getMinimumTouchTargetSize-MYxV2XQ  reason: not valid java name */
    long m37783getMinimumTouchTargetSizeMYxV2XQ() {
        float f = (float) 48;
        return DpKt.m38490DpSizeYgX7TsA(C1232Dp.m38468constructorimpl(f), C1232Dp.m38468constructorimpl(f));
    }

    float getTouchSlop();
}
