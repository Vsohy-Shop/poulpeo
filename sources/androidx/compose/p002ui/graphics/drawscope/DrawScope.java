package androidx.compose.p002ui.graphics.drawscope;

import androidx.compose.p002ui.geometry.CornerRadius;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.geometry.SizeKt;
import androidx.compose.p002ui.graphics.BlendMode;
import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.FilterQuality;
import androidx.compose.p002ui.graphics.ImageBitmap;
import androidx.compose.p002ui.graphics.Path;
import androidx.compose.p002ui.graphics.PathEffect;
import androidx.compose.p002ui.graphics.StrokeCap;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.DpRect;
import androidx.compose.p002ui.unit.IntOffset;
import androidx.compose.p002ui.unit.IntSizeKt;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import java.util.List;
import kotlin.jvm.internal.C12775o;

@DrawScopeMarker
/* renamed from: androidx.compose.ui.graphics.drawscope.DrawScope */
/* compiled from: DrawScope.kt */
public interface DrawScope extends Density {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* renamed from: androidx.compose.ui.graphics.drawscope.DrawScope$Companion */
    /* compiled from: DrawScope.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final int DefaultBlendMode = BlendMode.Companion.m35604getSrcOver0nO6VwU();
        private static final int DefaultFilterQuality = FilterQuality.Companion.m35766getLowfv9h1I();

        private Companion() {
        }

        /* renamed from: getDefaultBlendMode-0nO6VwU  reason: not valid java name */
        public final int m36275getDefaultBlendMode0nO6VwU() {
            return DefaultBlendMode;
        }

        /* renamed from: getDefaultFilterQuality-f-v9h1I  reason: not valid java name */
        public final int m36276getDefaultFilterQualityfv9h1I() {
            return DefaultFilterQuality;
        }
    }

    /* renamed from: androidx.compose.ui.graphics.drawscope.DrawScope$DefaultImpls */
    /* compiled from: DrawScope.kt */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: drawImage-AZ2fEMs  reason: not valid java name */
        public static void m36282drawImageAZ2fEMs(DrawScope drawScope, ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2) {
            C12775o.m28639i(imageBitmap, "image");
            C12775o.m28639i(drawStyle, "style");
            DrawScope.super.m36259drawImageAZ2fEMs(imageBitmap, j, j2, j3, j4, f, drawStyle, colorFilter, i, i2);
        }

        @Deprecated
        /* renamed from: getCenter-F1C5BW0  reason: not valid java name */
        public static long m36297getCenterF1C5BW0(DrawScope drawScope) {
            return DrawScope.super.m36273getCenterF1C5BW0();
        }

        @Deprecated
        /* renamed from: getSize-NH-jbRc  reason: not valid java name */
        public static long m36298getSizeNHjbRc(DrawScope drawScope) {
            return DrawScope.super.m36274getSizeNHjbRc();
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o  reason: not valid java name */
        public static int m36299roundToPxR2X_6o(DrawScope drawScope, long j) {
            return DrawScope.super.m38442roundToPxR2X_6o(j);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4  reason: not valid java name */
        public static int m36300roundToPx0680j_4(DrawScope drawScope, float f) {
            return DrawScope.super.m38443roundToPx0680j_4(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA  reason: not valid java name */
        public static float m36301toDpGaN1DYA(DrawScope drawScope, long j) {
            return DrawScope.super.m38444toDpGaN1DYA(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m36302toDpu2uoSUM(DrawScope drawScope, float f) {
            return DrawScope.super.m38445toDpu2uoSUM(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM  reason: not valid java name */
        public static long m36304toDpSizekrfVVM(DrawScope drawScope, long j) {
            return DrawScope.super.m38447toDpSizekrfVVM(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o  reason: not valid java name */
        public static float m36305toPxR2X_6o(DrawScope drawScope, long j) {
            return DrawScope.super.m38448toPxR2X_6o(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4  reason: not valid java name */
        public static float m36306toPx0680j_4(DrawScope drawScope, float f) {
            return DrawScope.super.m38449toPx0680j_4(f);
        }

        @Stable
        @Deprecated
        public static Rect toRect(DrawScope drawScope, DpRect dpRect) {
            C12775o.m28639i(dpRect, "$receiver");
            return DrawScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ  reason: not valid java name */
        public static long m36307toSizeXkaWNTQ(DrawScope drawScope, long j) {
            return DrawScope.super.m38450toSizeXkaWNTQ(j);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do  reason: not valid java name */
        public static long m36308toSp0xMU5do(DrawScope drawScope, float f) {
            return DrawScope.super.m38451toSp0xMU5do(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m36309toSpkPz2Gy4(DrawScope drawScope, float f) {
            return DrawScope.super.m38452toSpkPz2Gy4(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM  reason: not valid java name */
        public static float m36303toDpu2uoSUM(DrawScope drawScope, int i) {
            return DrawScope.super.m38446toDpu2uoSUM(i);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4  reason: not valid java name */
        public static long m36310toSpkPz2Gy4(DrawScope drawScope, int i) {
            return DrawScope.super.m38453toSpkPz2Gy4(i);
        }
    }

    /* renamed from: drawArc-illE91I$default  reason: not valid java name */
    static /* synthetic */ void m36234drawArcillE91I$default(DrawScope drawScope, Brush brush, float f, float f2, boolean z, long j, long j2, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        long j3;
        long j4;
        float f4;
        Fill fill;
        ColorFilter colorFilter2;
        int i3;
        int i4 = i2;
        if (obj == null) {
            if ((i4 & 16) != 0) {
                j3 = Offset.Companion.m35438getZeroF1C5BW0();
            } else {
                j3 = j;
            }
            if ((i4 & 32) != 0) {
                j4 = drawScope.m36253offsetSizePENXr5M(drawScope.m36274getSizeNHjbRc(), j3);
            } else {
                DrawScope drawScope2 = drawScope;
                j4 = j2;
            }
            if ((i4 & 64) != 0) {
                f4 = 1.0f;
            } else {
                f4 = f3;
            }
            if ((i4 & 128) != 0) {
                fill = Fill.INSTANCE;
            } else {
                fill = drawStyle;
            }
            if ((i4 & 256) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i4 & 512) != 0) {
                i3 = Companion.m36275getDefaultBlendMode0nO6VwU();
            } else {
                i3 = i;
            }
            drawScope.m36254drawArcillE91I(brush, f, f2, z, j3, j4, f4, fill, colorFilter2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-illE91I");
    }

    /* renamed from: drawArc-yD3GUKo$default  reason: not valid java name */
    static /* synthetic */ void m36235drawArcyD3GUKo$default(DrawScope drawScope, long j, float f, float f2, boolean z, long j2, long j3, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        long j4;
        long j5;
        float f4;
        Fill fill;
        ColorFilter colorFilter2;
        int i3;
        int i4 = i2;
        if (obj == null) {
            if ((i4 & 16) != 0) {
                j4 = Offset.Companion.m35438getZeroF1C5BW0();
            } else {
                j4 = j2;
            }
            if ((i4 & 32) != 0) {
                j5 = drawScope.m36253offsetSizePENXr5M(drawScope.m36274getSizeNHjbRc(), j4);
            } else {
                DrawScope drawScope2 = drawScope;
                j5 = j3;
            }
            if ((i4 & 64) != 0) {
                f4 = 1.0f;
            } else {
                f4 = f3;
            }
            if ((i4 & 128) != 0) {
                fill = Fill.INSTANCE;
            } else {
                fill = drawStyle;
            }
            if ((i4 & 256) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i4 & 512) != 0) {
                i3 = Companion.m36275getDefaultBlendMode0nO6VwU();
            } else {
                i3 = i;
            }
            drawScope.m36255drawArcyD3GUKo(j, f, f2, z, j4, j5, f4, fill, colorFilter2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
    }

    /* renamed from: drawCircle-V9BoPsw$default  reason: not valid java name */
    static /* synthetic */ void m36236drawCircleV9BoPsw$default(DrawScope drawScope, Brush brush, float f, long j, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        float f3;
        long j2;
        float f4;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i3;
        if (obj == null) {
            if ((i2 & 2) != 0) {
                f3 = Size.m35490getMinDimensionimpl(drawScope.m36274getSizeNHjbRc()) / 2.0f;
            } else {
                f3 = f;
            }
            if ((i2 & 4) != 0) {
                j2 = drawScope.m36273getCenterF1C5BW0();
            } else {
                j2 = j;
            }
            if ((i2 & 8) != 0) {
                f4 = 1.0f;
            } else {
                f4 = f2;
            }
            if ((i2 & 16) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i2 & 32) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i2 & 64) != 0) {
                i3 = Companion.m36275getDefaultBlendMode0nO6VwU();
            } else {
                i3 = i;
            }
            drawScope.m36256drawCircleV9BoPsw(brush, f3, j2, f4, drawStyle2, colorFilter2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-V9BoPsw");
    }

    /* renamed from: drawCircle-VaOC9Bg$default  reason: not valid java name */
    static /* synthetic */ void m36237drawCircleVaOC9Bg$default(DrawScope drawScope, long j, float f, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        float f3;
        long j3;
        float f4;
        Fill fill;
        ColorFilter colorFilter2;
        int i3;
        if (obj == null) {
            if ((i2 & 2) != 0) {
                f3 = Size.m35490getMinDimensionimpl(drawScope.m36274getSizeNHjbRc()) / 2.0f;
            } else {
                f3 = f;
            }
            if ((i2 & 4) != 0) {
                j3 = drawScope.m36273getCenterF1C5BW0();
            } else {
                j3 = j2;
            }
            if ((i2 & 8) != 0) {
                f4 = 1.0f;
            } else {
                f4 = f2;
            }
            if ((i2 & 16) != 0) {
                fill = Fill.INSTANCE;
            } else {
                fill = drawStyle;
            }
            if ((i2 & 32) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i2 & 64) != 0) {
                i3 = Companion.m36275getDefaultBlendMode0nO6VwU();
            } else {
                i3 = i;
            }
            drawScope.m36257drawCircleVaOC9Bg(j, f3, j3, f4, fill, colorFilter2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
    }

    /* renamed from: drawImage-9jGpkUE$default  reason: not valid java name */
    static /* synthetic */ void m36238drawImage9jGpkUE$default(DrawScope drawScope, ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        long j5;
        long j6;
        long j7;
        long j8;
        float f2;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i3;
        int i4 = i2;
        if (obj == null) {
            if ((i4 & 2) != 0) {
                j5 = IntOffset.Companion.m38596getZeronOccac();
            } else {
                j5 = j;
            }
            if ((i4 & 4) != 0) {
                j6 = IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight());
            } else {
                j6 = j2;
            }
            if ((i4 & 8) != 0) {
                j7 = IntOffset.Companion.m38596getZeronOccac();
            } else {
                j7 = j3;
            }
            if ((i4 & 16) != 0) {
                j8 = j6;
            } else {
                j8 = j4;
            }
            if ((i4 & 32) != 0) {
                f2 = 1.0f;
            } else {
                f2 = f;
            }
            if ((i4 & 64) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i4 & 128) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i4 & 256) != 0) {
                i3 = Companion.m36275getDefaultBlendMode0nO6VwU();
            } else {
                i3 = i;
            }
            drawScope.m36258drawImage9jGpkUE(imageBitmap, j5, j6, j7, j8, f2, drawStyle2, colorFilter2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-9jGpkUE");
    }

    /* renamed from: drawImage-AZ2fEMs$default  reason: not valid java name */
    static /* synthetic */ void m36239drawImageAZ2fEMs$default(DrawScope drawScope, ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, int i3, Object obj) {
        long j5;
        long j6;
        long j7;
        long j8;
        float f2;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i4;
        int i5;
        int i6 = i3;
        if (obj == null) {
            if ((i6 & 2) != 0) {
                j5 = IntOffset.Companion.m38596getZeronOccac();
            } else {
                j5 = j;
            }
            if ((i6 & 4) != 0) {
                j6 = IntSizeKt.IntSize(imageBitmap.getWidth(), imageBitmap.getHeight());
            } else {
                j6 = j2;
            }
            if ((i6 & 8) != 0) {
                j7 = IntOffset.Companion.m38596getZeronOccac();
            } else {
                j7 = j3;
            }
            if ((i6 & 16) != 0) {
                j8 = j6;
            } else {
                j8 = j4;
            }
            if ((i6 & 32) != 0) {
                f2 = 1.0f;
            } else {
                f2 = f;
            }
            if ((i6 & 64) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i6 & 128) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i6 & 256) != 0) {
                i4 = Companion.m36275getDefaultBlendMode0nO6VwU();
            } else {
                i4 = i;
            }
            if ((i6 & 512) != 0) {
                i5 = Companion.m36276getDefaultFilterQualityfv9h1I();
            } else {
                i5 = i2;
            }
            drawScope.m36259drawImageAZ2fEMs(imageBitmap, j5, j6, j7, j8, f2, drawStyle2, colorFilter2, i4, i5);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
    }

    /* renamed from: drawImage-gbVJVH8$default  reason: not valid java name */
    static /* synthetic */ void m36240drawImagegbVJVH8$default(DrawScope drawScope, ImageBitmap imageBitmap, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        long j2;
        float f2;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i3;
        if (obj == null) {
            if ((i2 & 2) != 0) {
                j2 = Offset.Companion.m35438getZeroF1C5BW0();
            } else {
                j2 = j;
            }
            if ((i2 & 4) != 0) {
                f2 = 1.0f;
            } else {
                f2 = f;
            }
            if ((i2 & 8) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i2 & 16) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i2 & 32) != 0) {
                i3 = Companion.m36275getDefaultBlendMode0nO6VwU();
            } else {
                i3 = i;
            }
            drawScope.m36260drawImagegbVJVH8(imageBitmap, j2, f2, drawStyle2, colorFilter2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
    }

    /* renamed from: drawLine-1RTmtNc$default  reason: not valid java name */
    static /* synthetic */ void m36241drawLine1RTmtNc$default(DrawScope drawScope, Brush brush, long j, long j2, float f, int i, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i2, int i3, Object obj) {
        float f3;
        int i4;
        PathEffect pathEffect2;
        float f4;
        ColorFilter colorFilter2;
        int i5;
        int i6 = i3;
        if (obj == null) {
            if ((i6 & 8) != 0) {
                f3 = 0.0f;
            } else {
                f3 = f;
            }
            if ((i6 & 16) != 0) {
                i4 = Stroke.Companion.m36356getDefaultCapKaPHkGw();
            } else {
                i4 = i;
            }
            if ((i6 & 32) != 0) {
                pathEffect2 = null;
            } else {
                pathEffect2 = pathEffect;
            }
            if ((i6 & 64) != 0) {
                f4 = 1.0f;
            } else {
                f4 = f2;
            }
            if ((i6 & 128) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i6 & 256) != 0) {
                i5 = Companion.m36275getDefaultBlendMode0nO6VwU();
            } else {
                i5 = i2;
            }
            drawScope.m36261drawLine1RTmtNc(brush, j, j2, f3, i4, pathEffect2, f4, colorFilter2, i5);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
    }

    /* renamed from: drawLine-NGM6Ib0$default  reason: not valid java name */
    static /* synthetic */ void m36242drawLineNGM6Ib0$default(DrawScope drawScope, long j, long j2, long j3, float f, int i, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i2, int i3, Object obj) {
        float f3;
        int i4;
        PathEffect pathEffect2;
        float f4;
        ColorFilter colorFilter2;
        int i5;
        int i6 = i3;
        if (obj == null) {
            if ((i6 & 8) != 0) {
                f3 = 0.0f;
            } else {
                f3 = f;
            }
            if ((i6 & 16) != 0) {
                i4 = Stroke.Companion.m36356getDefaultCapKaPHkGw();
            } else {
                i4 = i;
            }
            if ((i6 & 32) != 0) {
                pathEffect2 = null;
            } else {
                pathEffect2 = pathEffect;
            }
            if ((i6 & 64) != 0) {
                f4 = 1.0f;
            } else {
                f4 = f2;
            }
            if ((i6 & 128) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i6 & 256) != 0) {
                i5 = Companion.m36275getDefaultBlendMode0nO6VwU();
            } else {
                i5 = i2;
            }
            drawScope.m36262drawLineNGM6Ib0(j, j2, j3, f3, i4, pathEffect2, f4, colorFilter2, i5);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
    }

    /* renamed from: drawOval-AsUm42w$default  reason: not valid java name */
    static /* synthetic */ void m36243drawOvalAsUm42w$default(DrawScope drawScope, Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        long j3;
        long j4;
        float f2;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i3;
        if (obj == null) {
            if ((i2 & 2) != 0) {
                j3 = Offset.Companion.m35438getZeroF1C5BW0();
            } else {
                j3 = j;
            }
            if ((i2 & 4) != 0) {
                DrawScope drawScope2 = drawScope;
                j4 = drawScope.m36253offsetSizePENXr5M(drawScope.m36274getSizeNHjbRc(), j3);
            } else {
                DrawScope drawScope3 = drawScope;
                j4 = j2;
            }
            if ((i2 & 8) != 0) {
                f2 = 1.0f;
            } else {
                f2 = f;
            }
            if ((i2 & 16) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i2 & 32) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i2 & 64) != 0) {
                i3 = Companion.m36275getDefaultBlendMode0nO6VwU();
            } else {
                i3 = i;
            }
            drawScope.m36263drawOvalAsUm42w(brush, j3, j4, f2, drawStyle2, colorFilter2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-AsUm42w");
    }

    /* renamed from: drawOval-n-J9OG0$default  reason: not valid java name */
    static /* synthetic */ void m36244drawOvalnJ9OG0$default(DrawScope drawScope, long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        long j4;
        long j5;
        float f2;
        Fill fill;
        ColorFilter colorFilter2;
        int i3;
        if (obj == null) {
            if ((i2 & 2) != 0) {
                j4 = Offset.Companion.m35438getZeroF1C5BW0();
            } else {
                j4 = j2;
            }
            if ((i2 & 4) != 0) {
                DrawScope drawScope2 = drawScope;
                j5 = drawScope.m36253offsetSizePENXr5M(drawScope.m36274getSizeNHjbRc(), j4);
            } else {
                DrawScope drawScope3 = drawScope;
                j5 = j3;
            }
            if ((i2 & 8) != 0) {
                f2 = 1.0f;
            } else {
                f2 = f;
            }
            if ((i2 & 16) != 0) {
                fill = Fill.INSTANCE;
            } else {
                fill = drawStyle;
            }
            if ((i2 & 32) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i2 & 64) != 0) {
                i3 = Companion.m36275getDefaultBlendMode0nO6VwU();
            } else {
                i3 = i;
            }
            drawScope.m36264drawOvalnJ9OG0(j, j4, j5, f2, fill, colorFilter2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-n-J9OG0");
    }

    /* renamed from: drawPath-GBMwjPU$default  reason: not valid java name */
    static /* synthetic */ void m36245drawPathGBMwjPU$default(DrawScope drawScope, Path path, Brush brush, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        if (obj == null) {
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
                i = Companion.m36275getDefaultBlendMode0nO6VwU();
            }
            drawScope.m36265drawPathGBMwjPU(path, brush, f2, drawStyle2, colorFilter2, i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
    }

    /* renamed from: drawPath-LG529CI$default  reason: not valid java name */
    static /* synthetic */ void m36246drawPathLG529CI$default(DrawScope drawScope, Path path, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        float f2;
        Fill fill;
        ColorFilter colorFilter2;
        int i3;
        if (obj == null) {
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
                i3 = Companion.m36275getDefaultBlendMode0nO6VwU();
            } else {
                i3 = i;
            }
            drawScope.m36266drawPathLG529CI(path, j, f2, fill, colorFilter2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-LG529CI");
    }

    /* renamed from: drawPoints-F8ZwMP8$default  reason: not valid java name */
    static /* synthetic */ void m36247drawPointsF8ZwMP8$default(DrawScope drawScope, List list, int i, long j, float f, int i2, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i3, int i4, Object obj) {
        float f3;
        int i5;
        PathEffect pathEffect2;
        float f4;
        ColorFilter colorFilter2;
        int i6;
        int i7 = i4;
        if (obj == null) {
            if ((i7 & 8) != 0) {
                f3 = 0.0f;
            } else {
                f3 = f;
            }
            if ((i7 & 16) != 0) {
                i5 = StrokeCap.Companion.m36054getButtKaPHkGw();
            } else {
                i5 = i2;
            }
            if ((i7 & 32) != 0) {
                pathEffect2 = null;
            } else {
                pathEffect2 = pathEffect;
            }
            if ((i7 & 64) != 0) {
                f4 = 1.0f;
            } else {
                f4 = f2;
            }
            if ((i7 & 128) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i7 & 256) != 0) {
                i6 = Companion.m36275getDefaultBlendMode0nO6VwU();
            } else {
                i6 = i3;
            }
            drawScope.m36267drawPointsF8ZwMP8(list, i, j, f3, i5, pathEffect2, f4, colorFilter2, i6);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-F8ZwMP8");
    }

    /* renamed from: drawPoints-Gsft0Ws$default  reason: not valid java name */
    static /* synthetic */ void m36248drawPointsGsft0Ws$default(DrawScope drawScope, List list, int i, Brush brush, float f, int i2, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i3, int i4, Object obj) {
        float f3;
        int i5;
        PathEffect pathEffect2;
        float f4;
        ColorFilter colorFilter2;
        int i6;
        int i7 = i4;
        if (obj == null) {
            if ((i7 & 8) != 0) {
                f3 = 0.0f;
            } else {
                f3 = f;
            }
            if ((i7 & 16) != 0) {
                i5 = StrokeCap.Companion.m36054getButtKaPHkGw();
            } else {
                i5 = i2;
            }
            if ((i7 & 32) != 0) {
                pathEffect2 = null;
            } else {
                pathEffect2 = pathEffect;
            }
            if ((i7 & 64) != 0) {
                f4 = 1.0f;
            } else {
                f4 = f2;
            }
            if ((i7 & 128) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i7 & 256) != 0) {
                i6 = Companion.m36275getDefaultBlendMode0nO6VwU();
            } else {
                i6 = i3;
            }
            drawScope.m36268drawPointsGsft0Ws(list, i, brush, f3, i5, pathEffect2, f4, colorFilter2, i6);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-Gsft0Ws");
    }

    /* renamed from: drawRect-AsUm42w$default  reason: not valid java name */
    static /* synthetic */ void m36249drawRectAsUm42w$default(DrawScope drawScope, Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        long j3;
        long j4;
        float f2;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i3;
        if (obj == null) {
            if ((i2 & 2) != 0) {
                j3 = Offset.Companion.m35438getZeroF1C5BW0();
            } else {
                j3 = j;
            }
            if ((i2 & 4) != 0) {
                DrawScope drawScope2 = drawScope;
                j4 = drawScope.m36253offsetSizePENXr5M(drawScope.m36274getSizeNHjbRc(), j3);
            } else {
                DrawScope drawScope3 = drawScope;
                j4 = j2;
            }
            if ((i2 & 8) != 0) {
                f2 = 1.0f;
            } else {
                f2 = f;
            }
            if ((i2 & 16) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i2 & 32) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i2 & 64) != 0) {
                i3 = Companion.m36275getDefaultBlendMode0nO6VwU();
            } else {
                i3 = i;
            }
            drawScope.m36269drawRectAsUm42w(brush, j3, j4, f2, drawStyle2, colorFilter2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
    }

    /* renamed from: drawRect-n-J9OG0$default  reason: not valid java name */
    static /* synthetic */ void m36250drawRectnJ9OG0$default(DrawScope drawScope, long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        long j4;
        long j5;
        float f2;
        Fill fill;
        ColorFilter colorFilter2;
        int i3;
        if (obj == null) {
            if ((i2 & 2) != 0) {
                j4 = Offset.Companion.m35438getZeroF1C5BW0();
            } else {
                j4 = j2;
            }
            if ((i2 & 4) != 0) {
                DrawScope drawScope2 = drawScope;
                j5 = drawScope.m36253offsetSizePENXr5M(drawScope.m36274getSizeNHjbRc(), j4);
            } else {
                DrawScope drawScope3 = drawScope;
                j5 = j3;
            }
            if ((i2 & 8) != 0) {
                f2 = 1.0f;
            } else {
                f2 = f;
            }
            if ((i2 & 16) != 0) {
                fill = Fill.INSTANCE;
            } else {
                fill = drawStyle;
            }
            if ((i2 & 32) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i2 & 64) != 0) {
                i3 = Companion.m36275getDefaultBlendMode0nO6VwU();
            } else {
                i3 = i;
            }
            drawScope.m36270drawRectnJ9OG0(j, j4, j5, f2, fill, colorFilter2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
    }

    /* renamed from: drawRoundRect-ZuiqVtQ$default  reason: not valid java name */
    static /* synthetic */ void m36251drawRoundRectZuiqVtQ$default(DrawScope drawScope, Brush brush, long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2, Object obj) {
        long j4;
        long j5;
        long j6;
        float f2;
        DrawStyle drawStyle2;
        ColorFilter colorFilter2;
        int i3;
        int i4 = i2;
        if (obj == null) {
            if ((i4 & 2) != 0) {
                j4 = Offset.Companion.m35438getZeroF1C5BW0();
            } else {
                j4 = j;
            }
            if ((i4 & 4) != 0) {
                DrawScope drawScope2 = drawScope;
                j5 = drawScope.m36253offsetSizePENXr5M(drawScope.m36274getSizeNHjbRc(), j4);
            } else {
                DrawScope drawScope3 = drawScope;
                j5 = j2;
            }
            if ((i4 & 8) != 0) {
                j6 = CornerRadius.Companion.m35407getZerokKHJgLs();
            } else {
                j6 = j3;
            }
            if ((i4 & 16) != 0) {
                f2 = 1.0f;
            } else {
                f2 = f;
            }
            if ((i4 & 32) != 0) {
                drawStyle2 = Fill.INSTANCE;
            } else {
                drawStyle2 = drawStyle;
            }
            if ((i4 & 64) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i4 & 128) != 0) {
                i3 = Companion.m36275getDefaultBlendMode0nO6VwU();
            } else {
                i3 = i;
            }
            drawScope.m36271drawRoundRectZuiqVtQ(brush, j4, j5, j6, f2, drawStyle2, colorFilter2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
    }

    /* renamed from: drawRoundRect-u-Aw5IA$default  reason: not valid java name */
    static /* synthetic */ void m36252drawRoundRectuAw5IA$default(DrawScope drawScope, long j, long j2, long j3, long j4, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i, int i2, Object obj) {
        long j5;
        long j6;
        long j7;
        Fill fill;
        float f2;
        ColorFilter colorFilter2;
        int i3;
        int i4 = i2;
        if (obj == null) {
            if ((i4 & 2) != 0) {
                j5 = Offset.Companion.m35438getZeroF1C5BW0();
            } else {
                j5 = j2;
            }
            if ((i4 & 4) != 0) {
                j6 = drawScope.m36253offsetSizePENXr5M(drawScope.m36274getSizeNHjbRc(), j5);
            } else {
                DrawScope drawScope2 = drawScope;
                j6 = j3;
            }
            if ((i4 & 8) != 0) {
                j7 = CornerRadius.Companion.m35407getZerokKHJgLs();
            } else {
                j7 = j4;
            }
            if ((i4 & 16) != 0) {
                fill = Fill.INSTANCE;
            } else {
                fill = drawStyle;
            }
            if ((i4 & 32) != 0) {
                f2 = 1.0f;
            } else {
                f2 = f;
            }
            if ((i4 & 64) != 0) {
                colorFilter2 = null;
            } else {
                colorFilter2 = colorFilter;
            }
            if ((i4 & 128) != 0) {
                i3 = Companion.m36275getDefaultBlendMode0nO6VwU();
            } else {
                i3 = i;
            }
            drawScope.m36272drawRoundRectuAw5IA(j, j5, j6, j7, fill, f2, colorFilter2, i3);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-u-Aw5IA");
    }

    /* renamed from: offsetSize-PENXr5M  reason: not valid java name */
    private long m36253offsetSizePENXr5M(long j, long j2) {
        return SizeKt.Size(Size.m35491getWidthimpl(j) - Offset.m35422getXimpl(j2), Size.m35488getHeightimpl(j) - Offset.m35423getYimpl(j2));
    }

    /* renamed from: drawArc-illE91I  reason: not valid java name */
    void m36254drawArcillE91I(Brush brush, float f, float f2, boolean z, long j, long j2, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawArc-yD3GUKo  reason: not valid java name */
    void m36255drawArcyD3GUKo(long j, float f, float f2, boolean z, long j2, long j3, float f3, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawCircle-V9BoPsw  reason: not valid java name */
    void m36256drawCircleV9BoPsw(Brush brush, float f, long j, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawCircle-VaOC9Bg  reason: not valid java name */
    void m36257drawCircleVaOC9Bg(long j, float f, long j2, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawImage-9jGpkUE  reason: not valid java name */
    /* synthetic */ void m36258drawImage9jGpkUE(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawImage-AZ2fEMs  reason: not valid java name */
    void m36259drawImageAZ2fEMs(ImageBitmap imageBitmap, long j, long j2, long j3, long j4, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i, int i2) {
        C12775o.m28639i(imageBitmap, "image");
        C12775o.m28639i(drawStyle, "style");
        m36239drawImageAZ2fEMs$default(this, imageBitmap, j, j2, j3, j4, f, drawStyle, colorFilter, i, 0, 512, (Object) null);
    }

    /* renamed from: drawImage-gbVJVH8  reason: not valid java name */
    void m36260drawImagegbVJVH8(ImageBitmap imageBitmap, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawLine-1RTmtNc  reason: not valid java name */
    void m36261drawLine1RTmtNc(Brush brush, long j, long j2, float f, int i, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i2);

    /* renamed from: drawLine-NGM6Ib0  reason: not valid java name */
    void m36262drawLineNGM6Ib0(long j, long j2, long j3, float f, int i, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i2);

    /* renamed from: drawOval-AsUm42w  reason: not valid java name */
    void m36263drawOvalAsUm42w(Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawOval-n-J9OG0  reason: not valid java name */
    void m36264drawOvalnJ9OG0(long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawPath-GBMwjPU  reason: not valid java name */
    void m36265drawPathGBMwjPU(Path path, Brush brush, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawPath-LG529CI  reason: not valid java name */
    void m36266drawPathLG529CI(Path path, long j, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawPoints-F8ZwMP8  reason: not valid java name */
    void m36267drawPointsF8ZwMP8(List<Offset> list, int i, long j, float f, int i2, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i3);

    /* renamed from: drawPoints-Gsft0Ws  reason: not valid java name */
    void m36268drawPointsGsft0Ws(List<Offset> list, int i, Brush brush, float f, int i2, PathEffect pathEffect, float f2, ColorFilter colorFilter, int i3);

    /* renamed from: drawRect-AsUm42w  reason: not valid java name */
    void m36269drawRectAsUm42w(Brush brush, long j, long j2, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawRect-n-J9OG0  reason: not valid java name */
    void m36270drawRectnJ9OG0(long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawRoundRect-ZuiqVtQ  reason: not valid java name */
    void m36271drawRoundRectZuiqVtQ(Brush brush, long j, long j2, long j3, float f, DrawStyle drawStyle, ColorFilter colorFilter, int i);

    /* renamed from: drawRoundRect-u-Aw5IA  reason: not valid java name */
    void m36272drawRoundRectuAw5IA(long j, long j2, long j3, long j4, DrawStyle drawStyle, float f, ColorFilter colorFilter, int i);

    /* renamed from: getCenter-F1C5BW0  reason: not valid java name */
    long m36273getCenterF1C5BW0() {
        return SizeKt.m35501getCenteruvyYCjk(getDrawContext().m36217getSizeNHjbRc());
    }

    DrawContext getDrawContext();

    LayoutDirection getLayoutDirection();

    /* renamed from: getSize-NH-jbRc  reason: not valid java name */
    long m36274getSizeNHjbRc() {
        return getDrawContext().m36217getSizeNHjbRc();
    }
}
