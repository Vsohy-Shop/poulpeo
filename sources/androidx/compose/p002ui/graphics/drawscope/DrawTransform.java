package androidx.compose.p002ui.graphics.drawscope;

import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.ClipOp;
import androidx.compose.p002ui.graphics.Path;

@DrawScopeMarker
/* renamed from: androidx.compose.ui.graphics.drawscope.DrawTransform */
/* compiled from: DrawTransform.kt */
public interface DrawTransform {

    /* renamed from: androidx.compose.ui.graphics.drawscope.DrawTransform$DefaultImpls */
    /* compiled from: DrawTransform.kt */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: getCenter-F1C5BW0  reason: not valid java name */
        public static long m36337getCenterF1C5BW0(DrawTransform drawTransform) {
            return DrawTransform.super.m36330getCenterF1C5BW0();
        }
    }

    /* renamed from: clipPath-mtrdD-E$default  reason: not valid java name */
    static /* synthetic */ void m36324clipPathmtrdDE$default(DrawTransform drawTransform, Path path, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = ClipOp.Companion.m35660getIntersectrtfAjoo();
            }
            drawTransform.m36328clipPathmtrdDE(path, i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
    }

    /* renamed from: clipRect-N_I0leg$default  reason: not valid java name */
    static /* synthetic */ void m36325clipRectN_I0leg$default(DrawTransform drawTransform, float f, float f2, float f3, float f4, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                f = 0.0f;
            }
            if ((i2 & 2) != 0) {
                f2 = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f3 = Size.m35491getWidthimpl(drawTransform.m36331getSizeNHjbRc());
            }
            if ((i2 & 8) != 0) {
                f4 = Size.m35488getHeightimpl(drawTransform.m36331getSizeNHjbRc());
            }
            if ((i2 & 16) != 0) {
                i = ClipOp.Companion.m35660getIntersectrtfAjoo();
            }
            drawTransform.m36329clipRectN_I0leg(f, f2, f3, f4, i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
    }

    /* renamed from: rotate-Uv8p0NA$default  reason: not valid java name */
    static /* synthetic */ void m36326rotateUv8p0NA$default(DrawTransform drawTransform, float f, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                j = drawTransform.m36330getCenterF1C5BW0();
            }
            drawTransform.m36332rotateUv8p0NA(f, j);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rotate-Uv8p0NA");
    }

    /* renamed from: scale-0AR0LA0$default  reason: not valid java name */
    static /* synthetic */ void m36327scale0AR0LA0$default(DrawTransform drawTransform, float f, float f2, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                j = drawTransform.m36330getCenterF1C5BW0();
            }
            drawTransform.m36333scale0AR0LA0(f, f2, j);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale-0AR0LA0");
    }

    static /* synthetic */ void translate$default(DrawTransform drawTransform, float f, float f2, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                f = 0.0f;
            }
            if ((i & 2) != 0) {
                f2 = 0.0f;
            }
            drawTransform.translate(f, f2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: translate");
    }

    /* renamed from: clipPath-mtrdD-E  reason: not valid java name */
    void m36328clipPathmtrdDE(Path path, int i);

    /* renamed from: clipRect-N_I0leg  reason: not valid java name */
    void m36329clipRectN_I0leg(float f, float f2, float f3, float f4, int i);

    /* renamed from: getCenter-F1C5BW0  reason: not valid java name */
    long m36330getCenterF1C5BW0() {
        float f = (float) 2;
        return OffsetKt.Offset(Size.m35491getWidthimpl(m36331getSizeNHjbRc()) / f, Size.m35488getHeightimpl(m36331getSizeNHjbRc()) / f);
    }

    /* renamed from: getSize-NH-jbRc  reason: not valid java name */
    long m36331getSizeNHjbRc();

    void inset(float f, float f2, float f3, float f4);

    /* renamed from: rotate-Uv8p0NA  reason: not valid java name */
    void m36332rotateUv8p0NA(float f, long j);

    /* renamed from: scale-0AR0LA0  reason: not valid java name */
    void m36333scale0AR0LA0(float f, float f2, long j);

    /* renamed from: transform-58bKbWc  reason: not valid java name */
    void m36334transform58bKbWc(float[] fArr);

    void translate(float f, float f2);
}
