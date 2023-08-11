package androidx.compose.p002ui.graphics;

import android.graphics.Canvas;
import androidx.compose.p002ui.graphics.VertexMode;

/* renamed from: androidx.compose.ui.graphics.AndroidVertexMode_androidKt */
/* compiled from: AndroidVertexMode.android.kt */
public final class AndroidVertexMode_androidKt {
    /* renamed from: toAndroidVertexMode-JOOmi9M  reason: not valid java name */
    public static final Canvas.VertexMode m35568toAndroidVertexModeJOOmi9M(int i) {
        VertexMode.Companion companion = VertexMode.Companion;
        if (VertexMode.m36097equalsimpl0(i, companion.m36103getTrianglesc2xauaI())) {
            return Canvas.VertexMode.TRIANGLES;
        }
        if (VertexMode.m36097equalsimpl0(i, companion.m36102getTriangleStripc2xauaI())) {
            return Canvas.VertexMode.TRIANGLE_STRIP;
        }
        if (VertexMode.m36097equalsimpl0(i, companion.m36101getTriangleFanc2xauaI())) {
            return Canvas.VertexMode.TRIANGLE_FAN;
        }
        return Canvas.VertexMode.TRIANGLES;
    }
}
