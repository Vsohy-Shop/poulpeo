package androidx.compose.p002ui.node;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.graphics.Canvas;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.ImageBitmap;
import androidx.compose.p002ui.graphics.Path;
import androidx.compose.p002ui.graphics.PathEffect;
import androidx.compose.p002ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.p002ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawContext;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawStyle;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.DpRect;
import androidx.compose.p002ui.unit.IntSizeKt;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nLayoutNodeDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScope\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n*L\n1#1,114:1\n245#2:115\n71#3:116\n71#3:117\n558#4,17:118\n*S KotlinDebug\n*F\n+ 1 LayoutNodeDrawScope.kt\nandroidx/compose/ui/node/LayoutNodeDrawScope\n*L\n46#1:115\n59#1:116\n71#1:117\n85#1:118,17\n*E\n"})
/* renamed from: androidx.compose.ui.node.LayoutNodeDrawScope */
/* compiled from: LayoutNodeDrawScope.kt */
public final class LayoutNodeDrawScope implements DrawScope, ContentDrawScope {
    private final CanvasDrawScope canvasDrawScope;
    private DrawModifierNode drawNode;

    public LayoutNodeDrawScope() {
        this((CanvasDrawScope) null, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: draw-x_KDEd0$ui_release  reason: not valid java name */
    public final void m37509drawx_KDEd0$ui_release(Canvas canvas, long j, NodeCoordinator nodeCoordinator, DrawModifierNode drawModifierNode) {
        C12775o.m28639i(canvas, "canvas");
        C12775o.m28639i(nodeCoordinator, "coordinator");
        C12775o.m28639i(drawModifierNode, "drawNode");
        DrawModifierNode drawModifierNode2 = this.drawNode;
        this.drawNode = drawModifierNode;
        CanvasDrawScope canvasDrawScope2 = this.canvasDrawScope;
        LayoutDirection layoutDirection = nodeCoordinator.getLayoutDirection();
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope2.getDrawParams();
        Density component1 = drawParams.component1();
        LayoutDirection component2 = drawParams.component2();
        Canvas component3 = drawParams.component3();
        long r7 = drawParams.m36174component4NHjbRc();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope2.getDrawParams();
        drawParams2.setDensity(nodeCoordinator);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m36177setSizeuvyYCjk(j);
        canvas.save();
        drawModifierNode.draw(this);
        canvas.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope2.getDrawParams();
        drawParams3.setDensity(component1);
        drawParams3.setLayoutDirection(component2);
        drawParams3.setCanvas(component3);
        drawParams3.m36177setSizeuvyYCjk(r7);
        this.drawNode = drawModifierNode2;
    }

    /* renamed from: drawArc-illE91I  reason: not valid java name */
    public void m37510drawArcillE91I(Brush brush, float f, float f2, boolean z, long j, long j2, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        C12775o.m28639i(brush, "brush");
        DrawStyle drawStyle2 = drawStyle;
        C12775o.m28639i(drawStyle2, "style");
        this.canvasDrawScope.m36154drawArcillE91I(brush, f, f2, z, j, j2, f3, drawStyle2, colorFilter, i);
    }

    /* renamed from: drawArc-yD3GUKo  reason: not valid java name */
    public void m37511drawArcyD3GUKo(long j, float f, float f2, boolean z, long j2, long j3, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        DrawStyle drawStyle2 = drawStyle;
        C12775o.m28639i(drawStyle2, "style");
        this.canvasDrawScope.m36155drawArcyD3GUKo(j, f, f2, z, j2, j3, f3, drawStyle2, colorFilter, i);
    }

    /* renamed from: drawCircle-V9BoPsw  reason: not valid java name */
    public void m37512drawCircleV9BoPsw(Brush brush, float f, long j, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        C12775o.m28639i(brush, "brush");
        DrawStyle drawStyle2 = drawStyle;
        C12775o.m28639i(drawStyle2, "style");
        this.canvasDrawScope.m36156drawCircleV9BoPsw(brush, f, j, f2, drawStyle2, colorFilter, i);
    }

    /* renamed from: drawCircle-VaOC9Bg  reason: not valid java name */
    public void m37513drawCircleVaOC9Bg(long j, float f, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        DrawStyle drawStyle2 = drawStyle;
        C12775o.m28639i(drawStyle2, "style");
        this.canvasDrawScope.m36157drawCircleVaOC9Bg(j, f, j2, f2, drawStyle2, colorFilter, i);
    }

    public void drawContent() {
        Canvas canvas = getDrawContext().getCanvas();
        DrawModifierNode drawModifierNode = this.drawNode;
        C12775o.m28636f(drawModifierNode);
        DrawModifierNode access$nextDrawNode = LayoutNodeDrawScopeKt.nextDrawNode(drawModifierNode);
        if (access$nextDrawNode != null) {
            performDraw(access$nextDrawNode, canvas);
            return;
        }
        NodeCoordinator r2 = DelegatableNodeKt.m37467requireCoordinator64DMado(drawModifierNode, NodeKind.m37625constructorimpl(4));
        if (r2.getTail() == drawModifierNode) {
            r2 = r2.getWrapped$ui_release();
            C12775o.m28636f(r2);
        }
        r2.performDraw(canvas);
    }

    /* renamed from: drawImage-9jGpkUE  reason: not valid java name */
    public /* synthetic */ void m37514drawImage9jGpkUE(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        ImageBitmap imageBitmap2 = imageBitmap;
        C12775o.m28639i(imageBitmap2, "image");
        DrawStyle drawStyle2 = drawStyle;
        C12775o.m28639i(drawStyle2, "style");
        this.canvasDrawScope.m36158drawImage9jGpkUE(imageBitmap2, j, j2, j3, j4, f, drawStyle2, colorFilter, i);
    }

    /* renamed from: drawImage-AZ2fEMs  reason: not valid java name */
    public void m37515drawImageAZ2fEMs(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2) {
        ImageBitmap imageBitmap2 = imageBitmap;
        C12775o.m28639i(imageBitmap2, "image");
        DrawStyle drawStyle2 = drawStyle;
        C12775o.m28639i(drawStyle2, "style");
        this.canvasDrawScope.m36159drawImageAZ2fEMs(imageBitmap2, j, j2, j3, j4, f, drawStyle2, colorFilter, i, i2);
    }

    /* renamed from: drawImage-gbVJVH8  reason: not valid java name */
    public void m37516drawImagegbVJVH8(ImageBitmap imageBitmap, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        C12775o.m28639i(imageBitmap, "image");
        C12775o.m28639i(drawStyle, "style");
        this.canvasDrawScope.m36160drawImagegbVJVH8(imageBitmap, j, f, drawStyle, colorFilter, i);
    }

    /* renamed from: drawLine-1RTmtNc  reason: not valid java name */
    public void m37517drawLine1RTmtNc(Brush brush, long j, long j2, float f, int i, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i2) {
        C12775o.m28639i(brush, "brush");
        this.canvasDrawScope.m36161drawLine1RTmtNc(brush, j, j2, f, i, pathEffect, f2, colorFilter, i2);
    }

    /* renamed from: drawLine-NGM6Ib0  reason: not valid java name */
    public void m37518drawLineNGM6Ib0(long j, long j2, long j3, float f, int i, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i2) {
        this.canvasDrawScope.m36162drawLineNGM6Ib0(j, j2, j3, f, i, pathEffect, f2, colorFilter, i2);
    }

    /* renamed from: drawOval-AsUm42w  reason: not valid java name */
    public void m37519drawOvalAsUm42w(Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        C12775o.m28639i(brush, "brush");
        DrawStyle drawStyle2 = drawStyle;
        C12775o.m28639i(drawStyle2, "style");
        this.canvasDrawScope.m36163drawOvalAsUm42w(brush, j, j2, f, drawStyle2, colorFilter, i);
    }

    /* renamed from: drawOval-n-J9OG0  reason: not valid java name */
    public void m37520drawOvalnJ9OG0(long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        DrawStyle drawStyle2 = drawStyle;
        C12775o.m28639i(drawStyle2, "style");
        this.canvasDrawScope.m36164drawOvalnJ9OG0(j, j2, j3, f, drawStyle2, colorFilter, i);
    }

    /* renamed from: drawPath-GBMwjPU  reason: not valid java name */
    public void m37521drawPathGBMwjPU(Path path, Brush brush, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        C12775o.m28639i(path, "path");
        C12775o.m28639i(brush, "brush");
        C12775o.m28639i(drawStyle, "style");
        this.canvasDrawScope.m36165drawPathGBMwjPU(path, brush, f, drawStyle, colorFilter, i);
    }

    /* renamed from: drawPath-LG529CI  reason: not valid java name */
    public void m37522drawPathLG529CI(Path path, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        C12775o.m28639i(path, "path");
        C12775o.m28639i(drawStyle, "style");
        this.canvasDrawScope.m36166drawPathLG529CI(path, j, f, drawStyle, colorFilter, i);
    }

    /* renamed from: drawPoints-F8ZwMP8  reason: not valid java name */
    public void m37523drawPointsF8ZwMP8(List<Offset> list, int i, long j, float f, int i2, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i3) {
        C12775o.m28639i(list, "points");
        this.canvasDrawScope.m36167drawPointsF8ZwMP8(list, i, j, f, i2, pathEffect, f2, colorFilter, i3);
    }

    /* renamed from: drawPoints-Gsft0Ws  reason: not valid java name */
    public void m37524drawPointsGsft0Ws(List<Offset> list, int i, Brush brush, float f, int i2, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i3) {
        C12775o.m28639i(list, "points");
        C12775o.m28639i(brush, "brush");
        this.canvasDrawScope.m36168drawPointsGsft0Ws(list, i, brush, f, i2, pathEffect, f2, colorFilter, i3);
    }

    /* renamed from: drawRect-AsUm42w  reason: not valid java name */
    public void m37525drawRectAsUm42w(Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        C12775o.m28639i(brush, "brush");
        DrawStyle drawStyle2 = drawStyle;
        C12775o.m28639i(drawStyle2, "style");
        this.canvasDrawScope.m36169drawRectAsUm42w(brush, j, j2, f, drawStyle2, colorFilter, i);
    }

    /* renamed from: drawRect-n-J9OG0  reason: not valid java name */
    public void m37526drawRectnJ9OG0(long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        DrawStyle drawStyle2 = drawStyle;
        C12775o.m28639i(drawStyle2, "style");
        this.canvasDrawScope.m36170drawRectnJ9OG0(j, j2, j3, f, drawStyle2, colorFilter, i);
    }

    /* renamed from: drawRoundRect-ZuiqVtQ  reason: not valid java name */
    public void m37527drawRoundRectZuiqVtQ(Brush brush, long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        C12775o.m28639i(brush, "brush");
        DrawStyle drawStyle2 = drawStyle;
        C12775o.m28639i(drawStyle2, "style");
        this.canvasDrawScope.m36171drawRoundRectZuiqVtQ(brush, j, j2, j3, f, drawStyle2, colorFilter, i);
    }

    /* renamed from: drawRoundRect-u-Aw5IA  reason: not valid java name */
    public void m37528drawRoundRectuAw5IA(long j, long j2, long j3, long j4, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i) {
        DrawStyle drawStyle2 = drawStyle;
        C12775o.m28639i(drawStyle2, "style");
        this.canvasDrawScope.m36172drawRoundRectuAw5IA(j, j2, j3, j4, drawStyle2, f, colorFilter, i);
    }

    /* renamed from: getCenter-F1C5BW0  reason: not valid java name */
    public long m37529getCenterF1C5BW0() {
        return this.canvasDrawScope.m36273getCenterF1C5BW0();
    }

    public float getDensity() {
        return this.canvasDrawScope.getDensity();
    }

    public DrawContext getDrawContext() {
        return this.canvasDrawScope.getDrawContext();
    }

    public float getFontScale() {
        return this.canvasDrawScope.getFontScale();
    }

    public LayoutDirection getLayoutDirection() {
        return this.canvasDrawScope.getLayoutDirection();
    }

    /* renamed from: getSize-NH-jbRc  reason: not valid java name */
    public long m37530getSizeNHjbRc() {
        return this.canvasDrawScope.m36274getSizeNHjbRc();
    }

    public final void performDraw(DrawModifierNode drawModifierNode, Canvas canvas) {
        C12775o.m28639i(drawModifierNode, "<this>");
        C12775o.m28639i(canvas, "canvas");
        NodeCoordinator r5 = DelegatableNodeKt.m37467requireCoordinator64DMado(drawModifierNode, NodeKind.m37625constructorimpl(4));
        r5.getLayoutNode().getMDrawScope$ui_release().m37509drawx_KDEd0$ui_release(canvas, IntSizeKt.m38638toSizeozmzZPI(r5.m37598getSizeYbymL2g()), r5, drawModifierNode);
    }

    @Stable
    /* renamed from: roundToPx--R2X_6o  reason: not valid java name */
    public int m37531roundToPxR2X_6o(long j) {
        return this.canvasDrawScope.m38442roundToPxR2X_6o(j);
    }

    @Stable
    /* renamed from: roundToPx-0680j_4  reason: not valid java name */
    public int m37532roundToPx0680j_4(float f) {
        return this.canvasDrawScope.m38443roundToPx0680j_4(f);
    }

    @Stable
    /* renamed from: toDp-GaN1DYA  reason: not valid java name */
    public float m37533toDpGaN1DYA(long j) {
        return this.canvasDrawScope.m38444toDpGaN1DYA(j);
    }

    @Stable
    /* renamed from: toDp-u2uoSUM  reason: not valid java name */
    public float m37534toDpu2uoSUM(float f) {
        return this.canvasDrawScope.m38445toDpu2uoSUM(f);
    }

    @Stable
    /* renamed from: toDpSize-k-rfVVM  reason: not valid java name */
    public long m37536toDpSizekrfVVM(long j) {
        return this.canvasDrawScope.m38447toDpSizekrfVVM(j);
    }

    @Stable
    /* renamed from: toPx--R2X_6o  reason: not valid java name */
    public float m37537toPxR2X_6o(long j) {
        return this.canvasDrawScope.m38448toPxR2X_6o(j);
    }

    @Stable
    /* renamed from: toPx-0680j_4  reason: not valid java name */
    public float m37538toPx0680j_4(float f) {
        return this.canvasDrawScope.m38449toPx0680j_4(f);
    }

    @Stable
    public Rect toRect(DpRect dpRect) {
        C12775o.m28639i(dpRect, "<this>");
        return this.canvasDrawScope.toRect(dpRect);
    }

    @Stable
    /* renamed from: toSize-XkaWNTQ  reason: not valid java name */
    public long m37539toSizeXkaWNTQ(long j) {
        return this.canvasDrawScope.m38450toSizeXkaWNTQ(j);
    }

    @Stable
    /* renamed from: toSp-0xMU5do  reason: not valid java name */
    public long m37540toSp0xMU5do(float f) {
        return this.canvasDrawScope.m38451toSp0xMU5do(f);
    }

    @Stable
    /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
    public long m37541toSpkPz2Gy4(float f) {
        return this.canvasDrawScope.m38452toSpkPz2Gy4(f);
    }

    public LayoutNodeDrawScope(CanvasDrawScope canvasDrawScope2) {
        C12775o.m28639i(canvasDrawScope2, "canvasDrawScope");
        this.canvasDrawScope = canvasDrawScope2;
    }

    @Stable
    /* renamed from: toDp-u2uoSUM  reason: not valid java name */
    public float m37535toDpu2uoSUM(int i) {
        return this.canvasDrawScope.m38446toDpu2uoSUM(i);
    }

    @Stable
    /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
    public long m37542toSpkPz2Gy4(int i) {
        return this.canvasDrawScope.m38453toSpkPz2Gy4(i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LayoutNodeDrawScope(CanvasDrawScope canvasDrawScope2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new CanvasDrawScope() : canvasDrawScope2);
    }
}
