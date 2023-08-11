package androidx.compose.p002ui.graphics;

import androidx.compose.p002ui.geometry.CornerRadius;
import androidx.compose.p002ui.geometry.CornerRadiusKt;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.geometry.RoundRect;
import androidx.compose.p002ui.geometry.SizeKt;
import androidx.compose.p002ui.graphics.Outline;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import androidx.compose.p002ui.graphics.drawscope.DrawStyle;
import androidx.compose.p002ui.graphics.drawscope.Fill;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nOutline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Outline.kt\nandroidx/compose/ui/graphics/OutlineKt\n*L\n1#1,307:1\n245#1,16:308\n245#1,16:324\n*S KotlinDebug\n*F\n+ 1 Outline.kt\nandroidx/compose/ui/graphics/OutlineKt\n*L\n155#1:308,16\n195#1:324,16\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.OutlineKt */
/* compiled from: Outline.kt */
public final class OutlineKt {
    public static final void addOutline(Path path, Outline outline) {
        C12775o.m28639i(path, "<this>");
        C12775o.m28639i(outline, "outline");
        if (outline instanceof Outline.Rectangle) {
            path.addRect(((Outline.Rectangle) outline).getRect());
        } else if (outline instanceof Outline.Rounded) {
            path.addRoundRect(((Outline.Rounded) outline).getRoundRect());
        } else if (outline instanceof Outline.Generic) {
            Path.m35948addPathUv8p0NA$default(path, ((Outline.Generic) outline).getPath(), 0, 2, (Object) null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final void drawOutline(Canvas canvas, Outline outline, Paint paint) {
        C12775o.m28639i(canvas, "<this>");
        C12775o.m28639i(outline, "outline");
        C12775o.m28639i(paint, "paint");
        if (outline instanceof Outline.Rectangle) {
            canvas.drawRect(((Outline.Rectangle) outline).getRect(), paint);
        } else if (outline instanceof Outline.Rounded) {
            Outline.Rounded rounded = (Outline.Rounded) outline;
            Path roundRectPath$ui_graphics_release = rounded.getRoundRectPath$ui_graphics_release();
            if (roundRectPath$ui_graphics_release != null) {
                canvas.drawPath(roundRectPath$ui_graphics_release, paint);
                return;
            }
            canvas.drawRoundRect(rounded.getRoundRect().getLeft(), rounded.getRoundRect().getTop(), rounded.getRoundRect().getRight(), rounded.getRoundRect().getBottom(), CornerRadius.m35397getXimpl(rounded.getRoundRect().m35470getBottomLeftCornerRadiuskKHJgLs()), CornerRadius.m35398getYimpl(rounded.getRoundRect().m35470getBottomLeftCornerRadiuskKHJgLs()), paint);
        } else if (outline instanceof Outline.Generic) {
            canvas.drawPath(((Outline.Generic) outline).getPath(), paint);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: drawOutline-hn5TExg  reason: not valid java name */
    public static final void m35923drawOutlinehn5TExg(DrawScope drawScope, Outline outline, Brush brush, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        Path path;
        Outline outline2 = outline;
        DrawScope drawScope2 = drawScope;
        C12775o.m28639i(drawScope, "$this$drawOutline");
        C12775o.m28639i(outline, "outline");
        C12775o.m28639i(brush, "brush");
        C12775o.m28639i(drawStyle, "style");
        if (outline2 instanceof Outline.Rectangle) {
            Rect rect = ((Outline.Rectangle) outline2).getRect();
            drawScope.m36269drawRectAsUm42w(brush, topLeft(rect), size(rect), f, drawStyle, colorFilter, i);
            return;
        }
        if (outline2 instanceof Outline.Rounded) {
            Outline.Rounded rounded = (Outline.Rounded) outline2;
            path = rounded.getRoundRectPath$ui_graphics_release();
            if (path == null) {
                RoundRect roundRect = rounded.getRoundRect();
                float r1 = CornerRadius.m35397getXimpl(roundRect.m35470getBottomLeftCornerRadiuskKHJgLs());
                drawScope.m36271drawRoundRectZuiqVtQ(brush, topLeft(roundRect), size(roundRect), CornerRadiusKt.CornerRadius$default(r1, 0.0f, 2, (Object) null), f, drawStyle, colorFilter, i);
                return;
            }
        } else if (outline2 instanceof Outline.Generic) {
            path = ((Outline.Generic) outline2).getPath();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        drawScope.m36265drawPathGBMwjPU(path, brush, f, drawStyle, colorFilter, i);
    }

    /* renamed from: drawOutline-hn5TExg$default  reason: not valid java name */
    public static /* synthetic */ void m35924drawOutlinehn5TExg$default(DrawScope drawScope, Outline outline, Brush brush, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i2 & 8) != 0) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        if ((i2 & 16) != 0) {
            colorFilter = null;
        }
        ColorFilter colorFilter2 = colorFilter;
        if ((i2 & 32) != 0) {
            i = DrawScope.Companion.m36275getDefaultBlendMode0nO6VwU();
        }
        m35923drawOutlinehn5TExg(drawScope, outline, brush, f2, drawStyle2, colorFilter2, i);
    }

    /* renamed from: drawOutline-wDX37Ww  reason: not valid java name */
    public static final void m35925drawOutlinewDX37Ww(DrawScope drawScope, Outline outline, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i) {
        Path path;
        Outline outline2 = outline;
        DrawScope drawScope2 = drawScope;
        C12775o.m28639i(drawScope, "$this$drawOutline");
        C12775o.m28639i(outline2, "outline");
        C12775o.m28639i(drawStyle, "style");
        if (outline2 instanceof Outline.Rectangle) {
            Rect rect = ((Outline.Rectangle) outline2).getRect();
            drawScope.m36270drawRectnJ9OG0(j, topLeft(rect), size(rect), f, drawStyle, colorFilter, i);
            return;
        }
        if (outline2 instanceof Outline.Rounded) {
            Outline.Rounded rounded = (Outline.Rounded) outline2;
            path = rounded.getRoundRectPath$ui_graphics_release();
            if (path == null) {
                RoundRect roundRect = rounded.getRoundRect();
                DrawScope drawScope3 = drawScope;
                long j2 = j;
                drawScope3.m36272drawRoundRectuAw5IA(j2, topLeft(roundRect), size(roundRect), CornerRadiusKt.CornerRadius$default(CornerRadius.m35397getXimpl(roundRect.m35470getBottomLeftCornerRadiuskKHJgLs()), 0.0f, 2, (Object) null), drawStyle, f, colorFilter, i);
                return;
            }
        } else if (outline2 instanceof Outline.Generic) {
            path = ((Outline.Generic) outline2).getPath();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        drawScope.m36266drawPathLG529CI(path, j, f, drawStyle, colorFilter, i);
    }

    /* renamed from: drawOutline-wDX37Ww$default  reason: not valid java name */
    public static /* synthetic */ void m35926drawOutlinewDX37Ww$default(DrawScope drawScope, Outline outline, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        float f2;
        Fill fill;
        ColorFilter colorFilter2;
        int i3;
        if ((i2 & 4) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if ((i2 & 8) != 0) {
            fill = Fill.INSTANCE;
        } else {
            fill = drawStyle;
        }
        if ((i2 & 16) != 0) {
            colorFilter2 = null;
        } else {
            colorFilter2 = colorFilter;
        }
        if ((i2 & 32) != 0) {
            i3 = DrawScope.Companion.m36275getDefaultBlendMode0nO6VwU();
        } else {
            i3 = i;
        }
        m35925drawOutlinewDX37Ww(drawScope, outline, j, f2, fill, colorFilter2, i3);
    }

    private static final void drawOutlineHelper(DrawScope drawScope, Outline outline, C13088o<? super DrawScope, ? super Rect, C11921v> oVar, C13088o<? super DrawScope, ? super RoundRect, C11921v> oVar2, C13088o<? super DrawScope, ? super Path, C11921v> oVar3) {
        if (outline instanceof Outline.Rectangle) {
            oVar.invoke(drawScope, ((Outline.Rectangle) outline).getRect());
        } else if (outline instanceof Outline.Rounded) {
            Outline.Rounded rounded = (Outline.Rounded) outline;
            Path roundRectPath$ui_graphics_release = rounded.getRoundRectPath$ui_graphics_release();
            if (roundRectPath$ui_graphics_release != null) {
                oVar3.invoke(drawScope, roundRectPath$ui_graphics_release);
            } else {
                oVar2.invoke(drawScope, rounded.getRoundRect());
            }
        } else if (outline instanceof Outline.Generic) {
            oVar3.invoke(drawScope, ((Outline.Generic) outline).getPath());
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a0 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean hasSameCornerRadius(androidx.compose.p002ui.geometry.RoundRect r6) {
        /*
            long r0 = r6.m35470getBottomLeftCornerRadiuskKHJgLs()
            float r0 = androidx.compose.p002ui.geometry.CornerRadius.m35397getXimpl(r0)
            long r1 = r6.m35471getBottomRightCornerRadiuskKHJgLs()
            float r1 = androidx.compose.p002ui.geometry.CornerRadius.m35397getXimpl(r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0018
            r0 = r1
            goto L_0x0019
        L_0x0018:
            r0 = r2
        L_0x0019:
            if (r0 == 0) goto L_0x004f
            long r3 = r6.m35471getBottomRightCornerRadiuskKHJgLs()
            float r0 = androidx.compose.p002ui.geometry.CornerRadius.m35397getXimpl(r3)
            long r3 = r6.m35473getTopRightCornerRadiuskKHJgLs()
            float r3 = androidx.compose.p002ui.geometry.CornerRadius.m35397getXimpl(r3)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0031
            r0 = r1
            goto L_0x0032
        L_0x0031:
            r0 = r2
        L_0x0032:
            if (r0 == 0) goto L_0x004f
            long r3 = r6.m35473getTopRightCornerRadiuskKHJgLs()
            float r0 = androidx.compose.p002ui.geometry.CornerRadius.m35397getXimpl(r3)
            long r3 = r6.m35472getTopLeftCornerRadiuskKHJgLs()
            float r3 = androidx.compose.p002ui.geometry.CornerRadius.m35397getXimpl(r3)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x004a
            r0 = r1
            goto L_0x004b
        L_0x004a:
            r0 = r2
        L_0x004b:
            if (r0 == 0) goto L_0x004f
            r0 = r1
            goto L_0x0050
        L_0x004f:
            r0 = r2
        L_0x0050:
            long r3 = r6.m35470getBottomLeftCornerRadiuskKHJgLs()
            float r3 = androidx.compose.p002ui.geometry.CornerRadius.m35398getYimpl(r3)
            long r4 = r6.m35471getBottomRightCornerRadiuskKHJgLs()
            float r4 = androidx.compose.p002ui.geometry.CornerRadius.m35398getYimpl(r4)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x0066
            r3 = r1
            goto L_0x0067
        L_0x0066:
            r3 = r2
        L_0x0067:
            if (r3 == 0) goto L_0x009d
            long r3 = r6.m35471getBottomRightCornerRadiuskKHJgLs()
            float r3 = androidx.compose.p002ui.geometry.CornerRadius.m35398getYimpl(r3)
            long r4 = r6.m35473getTopRightCornerRadiuskKHJgLs()
            float r4 = androidx.compose.p002ui.geometry.CornerRadius.m35398getYimpl(r4)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x007f
            r3 = r1
            goto L_0x0080
        L_0x007f:
            r3 = r2
        L_0x0080:
            if (r3 == 0) goto L_0x009d
            long r3 = r6.m35473getTopRightCornerRadiuskKHJgLs()
            float r3 = androidx.compose.p002ui.geometry.CornerRadius.m35398getYimpl(r3)
            long r4 = r6.m35472getTopLeftCornerRadiuskKHJgLs()
            float r6 = androidx.compose.p002ui.geometry.CornerRadius.m35398getYimpl(r4)
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x0098
            r6 = r1
            goto L_0x0099
        L_0x0098:
            r6 = r2
        L_0x0099:
            if (r6 == 0) goto L_0x009d
            r6 = r1
            goto L_0x009e
        L_0x009d:
            r6 = r2
        L_0x009e:
            if (r0 == 0) goto L_0x00a3
            if (r6 == 0) goto L_0x00a3
            goto L_0x00a4
        L_0x00a3:
            r1 = r2
        L_0x00a4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.graphics.OutlineKt.hasSameCornerRadius(androidx.compose.ui.geometry.RoundRect):boolean");
    }

    private static final long size(Rect rect) {
        return SizeKt.Size(rect.getWidth(), rect.getHeight());
    }

    private static final long topLeft(Rect rect) {
        return OffsetKt.Offset(rect.getLeft(), rect.getTop());
    }

    private static final long size(RoundRect roundRect) {
        return SizeKt.Size(roundRect.getWidth(), roundRect.getHeight());
    }

    private static final long topLeft(RoundRect roundRect) {
        return OffsetKt.Offset(roundRect.getLeft(), roundRect.getTop());
    }
}
