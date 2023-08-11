package androidx.compose.p002ui.graphics.drawscope;

import androidx.compose.p002ui.graphics.DegreesKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nDrawTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawTransform.kt\nandroidx/compose/ui/graphics/drawscope/DrawTransformKt\n*L\n1#1,178:1\n37#1:179\n*S KotlinDebug\n*F\n+ 1 DrawTransform.kt\nandroidx/compose/ui/graphics/drawscope/DrawTransformKt\n*L\n49#1:179\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.drawscope.DrawTransformKt */
/* compiled from: DrawTransform.kt */
public final class DrawTransformKt {
    public static final void inset(DrawTransform drawTransform, float f, float f2) {
        C12775o.m28639i(drawTransform, "<this>");
        drawTransform.inset(f, f2, f, f2);
    }

    public static /* synthetic */ void inset$default(DrawTransform drawTransform, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        C12775o.m28639i(drawTransform, "<this>");
        drawTransform.inset(f, f2, f, f2);
    }

    /* renamed from: rotateRad-0AR0LA0  reason: not valid java name */
    public static final void m36340rotateRad0AR0LA0(DrawTransform drawTransform, float f, long j) {
        C12775o.m28639i(drawTransform, "$this$rotateRad");
        drawTransform.m36332rotateUv8p0NA(DegreesKt.degrees(f), j);
    }

    /* renamed from: rotateRad-0AR0LA0$default  reason: not valid java name */
    public static /* synthetic */ void m36341rotateRad0AR0LA0$default(DrawTransform drawTransform, float f, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = drawTransform.m36330getCenterF1C5BW0();
        }
        C12775o.m28639i(drawTransform, "$this$rotateRad");
        drawTransform.m36332rotateUv8p0NA(DegreesKt.degrees(f), j);
    }

    /* renamed from: scale-0AR0LA0  reason: not valid java name */
    public static final void m36342scale0AR0LA0(DrawTransform drawTransform, float f, long j) {
        C12775o.m28639i(drawTransform, "$this$scale");
        drawTransform.m36333scale0AR0LA0(f, f, j);
    }

    /* renamed from: scale-0AR0LA0$default  reason: not valid java name */
    public static /* synthetic */ void m36343scale0AR0LA0$default(DrawTransform drawTransform, float f, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = drawTransform.m36330getCenterF1C5BW0();
        }
        C12775o.m28639i(drawTransform, "$this$scale");
        drawTransform.m36333scale0AR0LA0(f, f, j);
    }

    public static final void inset(DrawTransform drawTransform, float f) {
        C12775o.m28639i(drawTransform, "<this>");
        drawTransform.inset(f, f, f, f);
    }
}
