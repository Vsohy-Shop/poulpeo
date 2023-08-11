package androidx.compose.foundation;

import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.p002ui.ComposedModifierKt;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.draw.CacheDrawScope;
import androidx.compose.p002ui.draw.DrawResult;
import androidx.compose.p002ui.geometry.CornerRadius;
import androidx.compose.p002ui.geometry.CornerRadiusKt;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.RoundRect;
import androidx.compose.p002ui.geometry.RoundRectKt;
import androidx.compose.p002ui.graphics.AndroidPath_androidKt;
import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.graphics.Canvas;
import androidx.compose.p002ui.graphics.ImageBitmap;
import androidx.compose.p002ui.graphics.Outline;
import androidx.compose.p002ui.graphics.Path;
import androidx.compose.p002ui.graphics.PathEffect;
import androidx.compose.p002ui.graphics.PathOperation;
import androidx.compose.p002ui.graphics.RectangleShapeKt;
import androidx.compose.p002ui.graphics.Shape;
import androidx.compose.p002ui.graphics.SolidColor;
import androidx.compose.p002ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawStyle;
import androidx.compose.p002ui.graphics.drawscope.Fill;
import androidx.compose.p002ui.graphics.drawscope.Stroke;
import androidx.compose.p002ui.node.Ref;
import androidx.compose.p002ui.platform.InspectableValueKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Border.kt\nandroidx/compose/foundation/BorderCache\n+ 5 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 6 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,459:1\n135#2:460\n1#3:461\n1#3:487\n181#4,25:462\n206#4,4:488\n215#4,6:501\n221#4:528\n222#4,2:537\n558#5,9:492\n567#5,8:529\n120#6,2:507\n173#6,6:509\n261#6,11:515\n122#6,2:526\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderKt\n*L\n149#1:460\n290#1:487\n290#1:462,25\n290#1:488,4\n290#1:501,6\n290#1:528\n290#1:537,2\n290#1:492,9\n290#1:529,8\n296#1:507,2\n304#1:509,6\n304#1:515,11\n296#1:526,2\n*E\n"})
/* compiled from: Border.kt */
public final class BorderKt {
    public static final Modifier border(Modifier modifier, BorderStroke borderStroke, Shape shape) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(borderStroke, OutlinedTextFieldKt.BorderId);
        C12775o.m28639i(shape, "shape");
        return m32969borderziNgDLE(modifier, borderStroke.m32975getWidthD9Ej5fM(), borderStroke.getBrush(), shape);
    }

    public static /* synthetic */ Modifier border$default(Modifier modifier, BorderStroke borderStroke, Shape shape, int i, Object obj) {
        if ((i & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return border(modifier, borderStroke, shape);
    }

    /* renamed from: border-xT4_qwU  reason: not valid java name */
    public static final Modifier m32967borderxT4_qwU(Modifier modifier, float f, long j, Shape shape) {
        C12775o.m28639i(modifier, "$this$border");
        C12775o.m28639i(shape, "shape");
        return m32969borderziNgDLE(modifier, f, new SolidColor(j, (DefaultConstructorMarker) null), shape);
    }

    /* renamed from: border-xT4_qwU$default  reason: not valid java name */
    public static /* synthetic */ Modifier m32968borderxT4_qwU$default(Modifier modifier, float f, long j, Shape shape, int i, Object obj) {
        if ((i & 4) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return m32967borderxT4_qwU(modifier, f, j, shape);
    }

    /* renamed from: border-ziNgDLE  reason: not valid java name */
    public static final Modifier m32969borderziNgDLE(Modifier modifier, float f, Brush brush, Shape shape) {
        Function1 function1;
        C12775o.m28639i(modifier, "$this$border");
        C12775o.m28639i(brush, "brush");
        C12775o.m28639i(shape, "shape");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            function1 = new BorderKt$borderziNgDLE$$inlined$debugInspectorInfo$1(f, brush, shape);
        } else {
            function1 = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, function1, new BorderKt$border$2(f, shape, brush));
    }

    private static final RoundRect createInsetRoundedRect(float f, RoundRect roundRect) {
        float f2 = f;
        return new RoundRect(f, f2, roundRect.getWidth() - f2, roundRect.getHeight() - f2, m32972shrinkKibmq7A(roundRect.m35472getTopLeftCornerRadiuskKHJgLs(), f), m32972shrinkKibmq7A(roundRect.m35473getTopRightCornerRadiuskKHJgLs(), f), m32972shrinkKibmq7A(roundRect.m35471getBottomRightCornerRadiuskKHJgLs(), f), m32972shrinkKibmq7A(roundRect.m35470getBottomLeftCornerRadiuskKHJgLs(), f), (DefaultConstructorMarker) null);
    }

    private static final Path createRoundRectPath(Path path, RoundRect roundRect, float f, boolean z) {
        path.reset();
        path.addRoundRect(roundRect);
        if (!z) {
            Path Path = AndroidPath_androidKt.Path();
            Path.addRoundRect(createInsetRoundedRect(f, roundRect));
            path.m35951opN5in7k0(path, Path, PathOperation.Companion.m35975getDifferenceb3I0S0c());
        }
        return path;
    }

    /* access modifiers changed from: private */
    public static final DrawResult drawContentWithoutBorder(CacheDrawScope cacheDrawScope) {
        return cacheDrawScope.onDrawWithContent(BorderKt$drawContentWithoutBorder$1.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b7, code lost:
        if (androidx.compose.p002ui.graphics.ImageBitmapConfig.m35882equalsimpl(r13, r3) != false) goto L_0x00b9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p002ui.draw.DrawResult drawGenericBorder(androidx.compose.p002ui.draw.CacheDrawScope r42, androidx.compose.p002ui.node.Ref<androidx.compose.foundation.BorderCache> r43, androidx.compose.p002ui.graphics.Brush r44, androidx.compose.p002ui.graphics.Outline.Generic r45, boolean r46, float r47) {
        /*
            r0 = r42
            r10 = r44
            if (r46 == 0) goto L_0x0013
            androidx.compose.foundation.BorderKt$drawGenericBorder$1 r1 = new androidx.compose.foundation.BorderKt$drawGenericBorder$1
            r2 = r45
            r1.<init>(r2, r10)
            androidx.compose.ui.draw.DrawResult r0 = r0.onDrawWithContent(r1)
            goto L_0x026c
        L_0x0013:
            r2 = r45
            boolean r1 = r10 instanceof androidx.compose.p002ui.graphics.SolidColor
            r3 = 0
            if (r1 == 0) goto L_0x0034
            androidx.compose.ui.graphics.ImageBitmapConfig$Companion r1 = androidx.compose.p002ui.graphics.ImageBitmapConfig.Companion
            int r1 = r1.m35887getAlpha8_sVssgQ()
            androidx.compose.ui.graphics.ColorFilter$Companion r4 = androidx.compose.p002ui.graphics.ColorFilter.Companion
            r5 = r10
            androidx.compose.ui.graphics.SolidColor r5 = (androidx.compose.p002ui.graphics.SolidColor) r5
            long r5 = r5.m36036getValue0d7_KjU()
            r7 = 0
            r8 = 2
            r9 = 0
            androidx.compose.ui.graphics.ColorFilter r4 = androidx.compose.p002ui.graphics.ColorFilter.Companion.m35712tintxETnrds$default(r4, r5, r7, r8, r9)
            r13 = r1
            r18 = r4
            goto L_0x003d
        L_0x0034:
            androidx.compose.ui.graphics.ImageBitmapConfig$Companion r1 = androidx.compose.p002ui.graphics.ImageBitmapConfig.Companion
            int r1 = r1.m35888getArgb8888_sVssgQ()
            r13 = r1
            r18 = r3
        L_0x003d:
            androidx.compose.ui.graphics.Path r1 = r45.getPath()
            androidx.compose.ui.geometry.Rect r9 = r1.getBounds()
            androidx.compose.foundation.BorderCache r1 = obtain(r43)
            androidx.compose.ui.graphics.Path r8 = r1.obtainPath()
            r8.reset()
            r8.addRect(r9)
            androidx.compose.ui.graphics.Path r4 = r45.getPath()
            androidx.compose.ui.graphics.PathOperation$Companion r5 = androidx.compose.p002ui.graphics.PathOperation.Companion
            int r5 = r5.m35975getDifferenceb3I0S0c()
            r8.m35951opN5in7k0(r8, r4, r5)
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            float r4 = r9.getWidth()
            double r4 = (double) r4
            double r4 = java.lang.Math.ceil(r4)
            float r4 = (float) r4
            int r4 = (int) r4
            float r5 = r9.getHeight()
            double r5 = (double) r5
            double r5 = java.lang.Math.ceil(r5)
            float r5 = (float) r5
            int r5 = (int) r5
            long r19 = androidx.compose.p002ui.unit.IntSizeKt.IntSize(r4, r5)
            androidx.compose.ui.graphics.ImageBitmap r4 = r1.imageBitmap
            androidx.compose.ui.graphics.Canvas r5 = r1.canvas
            if (r4 == 0) goto L_0x0092
            int r6 = r4.m35879getConfig_sVssgQ()
            androidx.compose.ui.graphics.ImageBitmapConfig r6 = androidx.compose.p002ui.graphics.ImageBitmapConfig.m35880boximpl(r6)
            goto L_0x0093
        L_0x0092:
            r6 = r3
        L_0x0093:
            androidx.compose.ui.graphics.ImageBitmapConfig$Companion r11 = androidx.compose.p002ui.graphics.ImageBitmapConfig.Companion
            int r11 = r11.m35888getArgb8888_sVssgQ()
            r12 = 0
            if (r6 != 0) goto L_0x009e
            r6 = r12
            goto L_0x00a6
        L_0x009e:
            int r6 = r6.m35886unboximpl()
            boolean r6 = androidx.compose.p002ui.graphics.ImageBitmapConfig.m35883equalsimpl0(r6, r11)
        L_0x00a6:
            r15 = 1
            if (r6 != 0) goto L_0x00b9
            if (r4 == 0) goto L_0x00b3
            int r3 = r4.m35879getConfig_sVssgQ()
            androidx.compose.ui.graphics.ImageBitmapConfig r3 = androidx.compose.p002ui.graphics.ImageBitmapConfig.m35880boximpl(r3)
        L_0x00b3:
            boolean r3 = androidx.compose.p002ui.graphics.ImageBitmapConfig.m35882equalsimpl(r13, r3)
            if (r3 == 0) goto L_0x00ba
        L_0x00b9:
            r12 = r15
        L_0x00ba:
            if (r4 == 0) goto L_0x00e7
            if (r5 == 0) goto L_0x00e7
            long r16 = r42.m35329getSizeNHjbRc()
            float r3 = androidx.compose.p002ui.geometry.Size.m35491getWidthimpl(r16)
            int r6 = r4.getWidth()
            float r6 = (float) r6
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 > 0) goto L_0x00e7
            long r16 = r42.m35329getSizeNHjbRc()
            float r3 = androidx.compose.p002ui.geometry.Size.m35488getHeightimpl(r16)
            int r6 = r4.getHeight()
            float r6 = (float) r6
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 > 0) goto L_0x00e7
            if (r12 != 0) goto L_0x00e3
            goto L_0x00e7
        L_0x00e3:
            r11 = r4
            r12 = r5
            r6 = r15
            goto L_0x0107
        L_0x00e7:
            int r11 = androidx.compose.p002ui.unit.IntSize.m38628getWidthimpl(r19)
            int r12 = androidx.compose.p002ui.unit.IntSize.m38627getHeightimpl(r19)
            r14 = 0
            r3 = 0
            r16 = 24
            r17 = 0
            r6 = r15
            r15 = r3
            androidx.compose.ui.graphics.ImageBitmap r4 = androidx.compose.p002ui.graphics.ImageBitmapKt.m35893ImageBitmapx__hDU$default(r11, r12, r13, r14, r15, r16, r17)
            r1.imageBitmap = r4
            androidx.compose.ui.graphics.Canvas r5 = androidx.compose.p002ui.graphics.CanvasKt.Canvas(r4)
            r1.canvas = r5
            r11 = r4
            r12 = r5
        L_0x0107:
            androidx.compose.ui.graphics.drawscope.CanvasDrawScope r3 = r1.canvasDrawScope
            if (r3 != 0) goto L_0x0115
            androidx.compose.ui.graphics.drawscope.CanvasDrawScope r3 = new androidx.compose.ui.graphics.drawscope.CanvasDrawScope
            r3.<init>()
            r1.canvasDrawScope = r3
        L_0x0115:
            r13 = r3
            long r3 = androidx.compose.p002ui.unit.IntSizeKt.m38638toSizeozmzZPI(r19)
            androidx.compose.ui.unit.LayoutDirection r1 = r42.getLayoutDirection()
            androidx.compose.ui.graphics.drawscope.CanvasDrawScope$DrawParams r5 = r13.getDrawParams()
            androidx.compose.ui.unit.Density r14 = r5.component1()
            androidx.compose.ui.unit.LayoutDirection r15 = r5.component2()
            r43 = r8
            androidx.compose.ui.graphics.Canvas r8 = r5.component3()
            r46 = r7
            r16 = r8
            long r7 = r5.m36174component4NHjbRc()
            androidx.compose.ui.graphics.drawscope.CanvasDrawScope$DrawParams r5 = r13.getDrawParams()
            r5.setDensity(r0)
            r5.setLayoutDirection(r1)
            r5.setCanvas(r12)
            r5.m36177setSizeuvyYCjk(r3)
            r12.save()
            androidx.compose.ui.graphics.Color$Companion r1 = androidx.compose.p002ui.graphics.Color.Companion
            long r22 = r1.m35697getBlack0d7_KjU()
            r24 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            androidx.compose.ui.graphics.BlendMode$Companion r17 = androidx.compose.p002ui.graphics.BlendMode.Companion
            int r31 = r17.m35577getClear0nO6VwU()
            r32 = 58
            r33 = 0
            r21 = r13
            r26 = r3
            androidx.compose.p002ui.graphics.drawscope.DrawScope.m36250drawRectnJ9OG0$default(r21, r22, r24, r26, r28, r29, r30, r31, r32, r33)
            float r1 = r9.getLeft()
            float r5 = -r1
            float r1 = r9.getTop()
            float r4 = -r1
            androidx.compose.ui.graphics.drawscope.DrawContext r1 = r13.getDrawContext()
            androidx.compose.ui.graphics.drawscope.DrawTransform r1 = r1.getTransform()
            r1.translate(r5, r4)
            androidx.compose.ui.graphics.Path r2 = r45.getPath()
            r21 = 0
            androidx.compose.ui.graphics.drawscope.Stroke r30 = new androidx.compose.ui.graphics.drawscope.Stroke
            r1 = 2
            float r1 = (float) r1
            float r23 = r47 * r1
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 30
            r22 = r30
            r22.<init>(r23, r24, r25, r26, r27, r28, r29)
            r22 = 0
            r23 = 0
            r24 = 52
            r25 = 0
            r1 = r13
            r3 = r44
            r34 = r4
            r4 = r21
            r35 = r5
            r5 = r30
            r6 = r22
            r36 = r7
            r8 = r46
            r7 = r23
            r38 = r8
            r39 = r16
            r16 = r43
            r8 = r24
            r21 = r9
            r9 = r25
            androidx.compose.p002ui.graphics.drawscope.DrawScope.m36245drawPathGBMwjPU$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            long r1 = r13.m36274getSizeNHjbRc()
            float r1 = androidx.compose.p002ui.geometry.Size.m35491getWidthimpl(r1)
            r2 = 1
            float r2 = (float) r2
            float r1 = r1 + r2
            long r3 = r13.m36274getSizeNHjbRc()
            float r3 = androidx.compose.p002ui.geometry.Size.m35491getWidthimpl(r3)
            float r1 = r1 / r3
            long r3 = r13.m36274getSizeNHjbRc()
            float r3 = androidx.compose.p002ui.geometry.Size.m35488getHeightimpl(r3)
            float r3 = r3 + r2
            long r4 = r13.m36274getSizeNHjbRc()
            float r2 = androidx.compose.p002ui.geometry.Size.m35488getHeightimpl(r4)
            float r3 = r3 / r2
            long r4 = r13.m36273getCenterF1C5BW0()
            androidx.compose.ui.graphics.drawscope.DrawContext r9 = r13.getDrawContext()
            long r7 = r9.m36217getSizeNHjbRc()
            androidx.compose.ui.graphics.Canvas r2 = r9.getCanvas()
            r2.save()
            androidx.compose.ui.graphics.drawscope.DrawTransform r2 = r9.getTransform()
            r2.m36333scale0AR0LA0(r1, r3, r4)
            r4 = 0
            r5 = 0
            r6 = 0
            int r17 = r17.m35577getClear0nO6VwU()
            r22 = 28
            r23 = 0
            r1 = r13
            r2 = r16
            r3 = r44
            r40 = r7
            r7 = r17
            r8 = r22
            r10 = r9
            r9 = r23
            androidx.compose.p002ui.graphics.drawscope.DrawScope.m36245drawPathGBMwjPU$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            androidx.compose.ui.graphics.Canvas r1 = r10.getCanvas()
            r1.restore()
            r1 = r40
            r10.m36218setSizeuvyYCjk(r1)
            androidx.compose.ui.graphics.drawscope.DrawContext r1 = r13.getDrawContext()
            androidx.compose.ui.graphics.drawscope.DrawTransform r1 = r1.getTransform()
            r2 = r35
            float r2 = -r2
            r3 = r34
            float r3 = -r3
            r1.translate(r2, r3)
            r12.restore()
            androidx.compose.ui.graphics.drawscope.CanvasDrawScope$DrawParams r1 = r13.getDrawParams()
            r1.setDensity(r14)
            r1.setLayoutDirection(r15)
            r2 = r39
            r1.setCanvas(r2)
            r2 = r36
            r1.m36177setSizeuvyYCjk(r2)
            r11.prepareToDraw()
            r1 = r38
            r1.f20403b = r11
            androidx.compose.foundation.BorderKt$drawGenericBorder$3 r2 = new androidx.compose.foundation.BorderKt$drawGenericBorder$3
            r4 = r2
            r5 = r21
            r6 = r1
            r7 = r19
            r9 = r18
            r4.<init>(r5, r6, r7, r9)
            androidx.compose.ui.draw.DrawResult r0 = r0.onDrawWithContent(r2)
        L_0x026c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BorderKt.drawGenericBorder(androidx.compose.ui.draw.CacheDrawScope, androidx.compose.ui.node.Ref, androidx.compose.ui.graphics.Brush, androidx.compose.ui.graphics.Outline$Generic, boolean, float):androidx.compose.ui.draw.DrawResult");
    }

    /* access modifiers changed from: private */
    /* renamed from: drawRectBorder-NsqcLGU  reason: not valid java name */
    public static final DrawResult m32970drawRectBorderNsqcLGU(CacheDrawScope cacheDrawScope, Brush brush, long j, long j2, boolean z, float f) {
        long j3;
        long j4;
        DrawStyle drawStyle;
        if (z) {
            j3 = Offset.Companion.m35438getZeroF1C5BW0();
        } else {
            j3 = j;
        }
        if (z) {
            j4 = cacheDrawScope.m35329getSizeNHjbRc();
        } else {
            j4 = j2;
        }
        if (z) {
            drawStyle = Fill.INSTANCE;
        } else {
            drawStyle = new Stroke(f, 0.0f, 0, 0, (PathEffect) null, 30, (DefaultConstructorMarker) null);
        }
        return cacheDrawScope.onDrawWithContent(new BorderKt$drawRectBorder$1(brush, j3, j4, drawStyle));
    }

    /* access modifiers changed from: private */
    /* renamed from: drawRoundRectBorder-SYlcjDY  reason: not valid java name */
    public static final DrawResult m32971drawRoundRectBorderSYlcjDY(CacheDrawScope cacheDrawScope, Ref<BorderCache> ref, Brush brush, Outline.Rounded rounded, long j, long j2, boolean z, float f) {
        CacheDrawScope cacheDrawScope2 = cacheDrawScope;
        float f2 = f;
        if (!RoundRectKt.isSimple(rounded.getRoundRect())) {
            return cacheDrawScope.onDrawWithContent(new BorderKt$drawRoundRectBorder$2(createRoundRectPath(obtain(ref).obtainPath(), rounded.getRoundRect(), f2, z), brush));
        }
        return cacheDrawScope.onDrawWithContent(new BorderKt$drawRoundRectBorder$1(z, brush, rounded.getRoundRect().m35472getTopLeftCornerRadiuskKHJgLs(), f2 / ((float) 2), f, j, j2, new Stroke(f, 0.0f, 0, 0, (PathEffect) null, 30, (DefaultConstructorMarker) null)));
    }

    private static final BorderCache obtain(Ref<BorderCache> ref) {
        BorderCache value = ref.getValue();
        if (value != null) {
            return value;
        }
        BorderCache borderCache = new BorderCache((ImageBitmap) null, (Canvas) null, (CanvasDrawScope) null, (Path) null, 15, (DefaultConstructorMarker) null);
        ref.setValue(borderCache);
        return borderCache;
    }

    /* access modifiers changed from: private */
    /* renamed from: shrink-Kibmq7A  reason: not valid java name */
    public static final long m32972shrinkKibmq7A(long j, float f) {
        return CornerRadiusKt.CornerRadius(Math.max(0.0f, CornerRadius.m35397getXimpl(j) - f), Math.max(0.0f, CornerRadius.m35398getYimpl(j) - f));
    }
}
