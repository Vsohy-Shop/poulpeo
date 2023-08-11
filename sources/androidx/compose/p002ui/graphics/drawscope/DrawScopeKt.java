package androidx.compose.p002ui.graphics.drawscope;

import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.Canvas;
import androidx.compose.p002ui.graphics.ClipOp;
import androidx.compose.p002ui.graphics.DegreesKt;
import androidx.compose.p002ui.graphics.Path;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;

@SourceDebugExtension({"SMAP\nDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,971:1\n66#1,4:972\n261#1,11:976\n261#1,11:987\n261#1,11:998\n261#1,11:1009\n261#1,11:1020\n261#1,11:1031\n*S KotlinDebug\n*F\n+ 1 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n104#1:972,4\n140#1:976,11\n157#1:987,11\n178#1:998,11\n195#1:1009,11\n221#1:1020,11\n237#1:1031,11\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.drawscope.DrawScopeKt */
/* compiled from: DrawScope.kt */
public final class DrawScopeKt {
    /* renamed from: clipPath-KD09W0M  reason: not valid java name */
    public static final void m36311clipPathKD09W0M(DrawScope drawScope, Path path, int i, Function1<? super DrawScope, C11921v> function1) {
        C12775o.m28639i(drawScope, "$this$clipPath");
        C12775o.m28639i(path, "path");
        C12775o.m28639i(function1, "block");
        DrawContext drawContext = drawScope.getDrawContext();
        long r1 = drawContext.m36217getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().m36328clipPathmtrdDE(path, i);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.m36218setSizeuvyYCjk(r1);
    }

    /* renamed from: clipPath-KD09W0M$default  reason: not valid java name */
    public static /* synthetic */ void m36312clipPathKD09W0M$default(DrawScope drawScope, Path path, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = ClipOp.Companion.m35660getIntersectrtfAjoo();
        }
        C12775o.m28639i(drawScope, "$this$clipPath");
        C12775o.m28639i(path, "path");
        C12775o.m28639i(function1, "block");
        DrawContext drawContext = drawScope.getDrawContext();
        long r0 = drawContext.m36217getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().m36328clipPathmtrdDE(path, i);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.m36218setSizeuvyYCjk(r0);
    }

    /* renamed from: clipRect-rOu3jXo  reason: not valid java name */
    public static final void m36313clipRectrOu3jXo(DrawScope drawScope, float f, float f2, float f3, float f4, int i, Function1<? super DrawScope, C11921v> function1) {
        DrawScope drawScope2 = drawScope;
        Function1<? super DrawScope, C11921v> function12 = function1;
        C12775o.m28639i(drawScope, "$this$clipRect");
        C12775o.m28639i(function12, "block");
        DrawContext drawContext = drawScope.getDrawContext();
        long r3 = drawContext.m36217getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().m36329clipRectN_I0leg(f, f2, f3, f4, i);
        function12.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.m36218setSizeuvyYCjk(r3);
    }

    /* renamed from: clipRect-rOu3jXo$default  reason: not valid java name */
    public static /* synthetic */ void m36314clipRectrOu3jXo$default(DrawScope drawScope, float f, float f2, float f3, float f4, int i, Function1 function1, int i2, Object obj) {
        float f5;
        float f6;
        if ((i2 & 1) != 0) {
            f5 = 0.0f;
        } else {
            f5 = f;
        }
        if ((i2 & 2) != 0) {
            f6 = 0.0f;
        } else {
            f6 = f2;
        }
        if ((i2 & 4) != 0) {
            f3 = Size.m35491getWidthimpl(drawScope.m36274getSizeNHjbRc());
        }
        float f7 = f3;
        if ((i2 & 8) != 0) {
            f4 = Size.m35488getHeightimpl(drawScope.m36274getSizeNHjbRc());
        }
        float f8 = f4;
        if ((i2 & 16) != 0) {
            i = ClipOp.Companion.m35660getIntersectrtfAjoo();
        }
        C12775o.m28639i(drawScope, "$this$clipRect");
        C12775o.m28639i(function1, "block");
        DrawContext drawContext = drawScope.getDrawContext();
        long r9 = drawContext.m36217getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().m36329clipRectN_I0leg(f5, f6, f7, f8, i);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.m36218setSizeuvyYCjk(r9);
    }

    public static final void drawIntoCanvas(DrawScope drawScope, Function1<? super Canvas, C11921v> function1) {
        C12775o.m28639i(drawScope, "<this>");
        C12775o.m28639i(function1, "block");
        function1.invoke(drawScope.getDrawContext().getCanvas());
    }

    public static final void inset(DrawScope drawScope, float f, float f2, float f3, float f4, Function1<? super DrawScope, C11921v> function1) {
        C12775o.m28639i(drawScope, "<this>");
        C12775o.m28639i(function1, "block");
        drawScope.getDrawContext().getTransform().inset(f, f2, f3, f4);
        function1.invoke(drawScope);
        drawScope.getDrawContext().getTransform().inset(-f, -f2, -f3, -f4);
    }

    public static /* synthetic */ void inset$default(DrawScope drawScope, float f, float f2, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        C12775o.m28639i(drawScope, "<this>");
        C12775o.m28639i(function1, "block");
        drawScope.getDrawContext().getTransform().inset(f, f2, f, f2);
        function1.invoke(drawScope);
        float f3 = -f;
        float f4 = -f2;
        drawScope.getDrawContext().getTransform().inset(f3, f4, f3, f4);
    }

    /* renamed from: rotate-Rg1IO4c  reason: not valid java name */
    public static final void m36315rotateRg1IO4c(DrawScope drawScope, float f, long j, Function1<? super DrawScope, C11921v> function1) {
        C12775o.m28639i(drawScope, "$this$rotate");
        C12775o.m28639i(function1, "block");
        DrawContext drawContext = drawScope.getDrawContext();
        long r1 = drawContext.m36217getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().m36332rotateUv8p0NA(f, j);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.m36218setSizeuvyYCjk(r1);
    }

    /* renamed from: rotate-Rg1IO4c$default  reason: not valid java name */
    public static /* synthetic */ void m36316rotateRg1IO4c$default(DrawScope drawScope, float f, long j, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            j = drawScope.m36273getCenterF1C5BW0();
        }
        C12775o.m28639i(drawScope, "$this$rotate");
        C12775o.m28639i(function1, "block");
        DrawContext drawContext = drawScope.getDrawContext();
        long r0 = drawContext.m36217getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().m36332rotateUv8p0NA(f, j);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.m36218setSizeuvyYCjk(r0);
    }

    /* renamed from: rotateRad-Rg1IO4c  reason: not valid java name */
    public static final void m36317rotateRadRg1IO4c(DrawScope drawScope, float f, long j, Function1<? super DrawScope, C11921v> function1) {
        C12775o.m28639i(drawScope, "$this$rotateRad");
        C12775o.m28639i(function1, "block");
        DrawContext drawContext = drawScope.getDrawContext();
        long r1 = drawContext.m36217getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().m36332rotateUv8p0NA(DegreesKt.degrees(f), j);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.m36218setSizeuvyYCjk(r1);
    }

    /* renamed from: rotateRad-Rg1IO4c$default  reason: not valid java name */
    public static /* synthetic */ void m36318rotateRadRg1IO4c$default(DrawScope drawScope, float f, long j, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            j = drawScope.m36273getCenterF1C5BW0();
        }
        C12775o.m28639i(drawScope, "$this$rotateRad");
        C12775o.m28639i(function1, "block");
        DrawContext drawContext = drawScope.getDrawContext();
        long r0 = drawContext.m36217getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().m36332rotateUv8p0NA(DegreesKt.degrees(f), j);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.m36218setSizeuvyYCjk(r0);
    }

    /* renamed from: scale-Fgt4K4Q  reason: not valid java name */
    public static final void m36319scaleFgt4K4Q(DrawScope drawScope, float f, float f2, long j, Function1<? super DrawScope, C11921v> function1) {
        C12775o.m28639i(drawScope, "$this$scale");
        C12775o.m28639i(function1, "block");
        DrawContext drawContext = drawScope.getDrawContext();
        long r1 = drawContext.m36217getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().m36333scale0AR0LA0(f, f2, j);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.m36218setSizeuvyYCjk(r1);
    }

    /* renamed from: scale-Fgt4K4Q$default  reason: not valid java name */
    public static /* synthetic */ void m36320scaleFgt4K4Q$default(DrawScope drawScope, float f, float f2, long j, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            j = drawScope.m36273getCenterF1C5BW0();
        }
        C12775o.m28639i(drawScope, "$this$scale");
        C12775o.m28639i(function1, "block");
        DrawContext drawContext = drawScope.getDrawContext();
        long r0 = drawContext.m36217getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().m36333scale0AR0LA0(f, f2, j);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.m36218setSizeuvyYCjk(r0);
    }

    /* renamed from: scale-Rg1IO4c  reason: not valid java name */
    public static final void m36321scaleRg1IO4c(DrawScope drawScope, float f, long j, Function1<? super DrawScope, C11921v> function1) {
        C12775o.m28639i(drawScope, "$this$scale");
        C12775o.m28639i(function1, "block");
        DrawContext drawContext = drawScope.getDrawContext();
        long r1 = drawContext.m36217getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().m36333scale0AR0LA0(f, f, j);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.m36218setSizeuvyYCjk(r1);
    }

    /* renamed from: scale-Rg1IO4c$default  reason: not valid java name */
    public static /* synthetic */ void m36322scaleRg1IO4c$default(DrawScope drawScope, float f, long j, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            j = drawScope.m36273getCenterF1C5BW0();
        }
        C12775o.m28639i(drawScope, "$this$scale");
        C12775o.m28639i(function1, "block");
        DrawContext drawContext = drawScope.getDrawContext();
        long r0 = drawContext.m36217getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().m36333scale0AR0LA0(f, f, j);
        function1.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.m36218setSizeuvyYCjk(r0);
    }

    public static final void translate(DrawScope drawScope, float f, float f2, Function1<? super DrawScope, C11921v> function1) {
        C12775o.m28639i(drawScope, "<this>");
        C12775o.m28639i(function1, "block");
        drawScope.getDrawContext().getTransform().translate(f, f2);
        function1.invoke(drawScope);
        drawScope.getDrawContext().getTransform().translate(-f, -f2);
    }

    public static /* synthetic */ void translate$default(DrawScope drawScope, float f, float f2, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        C12775o.m28639i(drawScope, "<this>");
        C12775o.m28639i(function1, "block");
        drawScope.getDrawContext().getTransform().translate(f, f2);
        function1.invoke(drawScope);
        drawScope.getDrawContext().getTransform().translate(-f, -f2);
    }

    public static final void withTransform(DrawScope drawScope, Function1<? super DrawTransform, C11921v> function1, Function1<? super DrawScope, C11921v> function12) {
        C12775o.m28639i(drawScope, "<this>");
        C12775o.m28639i(function1, "transformBlock");
        C12775o.m28639i(function12, "drawBlock");
        DrawContext drawContext = drawScope.getDrawContext();
        long r1 = drawContext.m36217getSizeNHjbRc();
        drawContext.getCanvas().save();
        function1.invoke(drawContext.getTransform());
        function12.invoke(drawScope);
        drawContext.getCanvas().restore();
        drawContext.m36218setSizeuvyYCjk(r1);
    }

    public static final void inset(DrawScope drawScope, float f, Function1<? super DrawScope, C11921v> function1) {
        C12775o.m28639i(drawScope, "<this>");
        C12775o.m28639i(function1, "block");
        drawScope.getDrawContext().getTransform().inset(f, f, f, f);
        function1.invoke(drawScope);
        float f2 = -f;
        drawScope.getDrawContext().getTransform().inset(f2, f2, f2, f2);
    }

    public static final void inset(DrawScope drawScope, float f, float f2, Function1<? super DrawScope, C11921v> function1) {
        C12775o.m28639i(drawScope, "<this>");
        C12775o.m28639i(function1, "block");
        drawScope.getDrawContext().getTransform().inset(f, f2, f, f2);
        function1.invoke(drawScope);
        float f3 = -f;
        float f4 = -f2;
        drawScope.getDrawContext().getTransform().inset(f3, f4, f3, f4);
    }
}
