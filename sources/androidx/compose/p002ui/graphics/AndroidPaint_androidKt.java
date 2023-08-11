package androidx.compose.p002ui.graphics;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import androidx.compose.p002ui.graphics.StrokeCap;
import androidx.compose.p002ui.graphics.StrokeJoin;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.graphics.AndroidPaint_androidKt */
/* compiled from: AndroidPaint.android.kt */
public final class AndroidPaint_androidKt {

    /* renamed from: androidx.compose.ui.graphics.AndroidPaint_androidKt$WhenMappings */
    /* compiled from: AndroidPaint.android.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|(2:21|22)|23|25) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004c */
        static {
            /*
                android.graphics.Paint$Style[] r0 = android.graphics.Paint.Style.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                $EnumSwitchMapping$0 = r0
                android.graphics.Paint$Cap[] r0 = android.graphics.Paint.Cap.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                android.graphics.Paint$Cap r2 = android.graphics.Paint.Cap.BUTT     // Catch:{ NoSuchFieldError -> 0x0021 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0021 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0021 }
            L_0x0021:
                r2 = 2
                android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.ROUND     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                r3 = 3
                android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.SQUARE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                $EnumSwitchMapping$1 = r0
                android.graphics.Paint$Join[] r0 = android.graphics.Paint.Join.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                android.graphics.Paint$Join r4 = android.graphics.Paint.Join.MITER     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                android.graphics.Paint$Join r1 = android.graphics.Paint.Join.BEVEL     // Catch:{ NoSuchFieldError -> 0x004c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004c }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004c }
            L_0x004c:
                android.graphics.Paint$Join r1 = android.graphics.Paint.Join.ROUND     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                $EnumSwitchMapping$2 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.graphics.AndroidPaint_androidKt.WhenMappings.<clinit>():void");
        }
    }

    public static final Paint Paint() {
        return new AndroidPaint();
    }

    public static final float getNativeAlpha(Paint paint) {
        C12775o.m28639i(paint, "<this>");
        return ((float) paint.getAlpha()) / 255.0f;
    }

    public static final boolean getNativeAntiAlias(Paint paint) {
        C12775o.m28639i(paint, "<this>");
        return paint.isAntiAlias();
    }

    public static final long getNativeColor(Paint paint) {
        C12775o.m28639i(paint, "<this>");
        return ColorKt.Color(paint.getColor());
    }

    public static final int getNativeFilterQuality(Paint paint) {
        C12775o.m28639i(paint, "<this>");
        if (!paint.isFilterBitmap()) {
            return FilterQuality.Companion.m35768getNonefv9h1I();
        }
        return FilterQuality.Companion.m35766getLowfv9h1I();
    }

    public static final int getNativeStrokeCap(Paint paint) {
        int i;
        C12775o.m28639i(paint, "<this>");
        Paint.Cap strokeCap = paint.getStrokeCap();
        if (strokeCap == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$1[strokeCap.ordinal()];
        }
        if (i == 1) {
            return StrokeCap.Companion.m36054getButtKaPHkGw();
        }
        if (i == 2) {
            return StrokeCap.Companion.m36055getRoundKaPHkGw();
        }
        if (i != 3) {
            return StrokeCap.Companion.m36054getButtKaPHkGw();
        }
        return StrokeCap.Companion.m36056getSquareKaPHkGw();
    }

    public static final int getNativeStrokeJoin(Paint paint) {
        int i;
        C12775o.m28639i(paint, "<this>");
        Paint.Join strokeJoin = paint.getStrokeJoin();
        if (strokeJoin == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$2[strokeJoin.ordinal()];
        }
        if (i == 1) {
            return StrokeJoin.Companion.m36065getMiterLxFBmk8();
        }
        if (i == 2) {
            return StrokeJoin.Companion.m36064getBevelLxFBmk8();
        }
        if (i != 3) {
            return StrokeJoin.Companion.m36065getMiterLxFBmk8();
        }
        return StrokeJoin.Companion.m36066getRoundLxFBmk8();
    }

    public static final float getNativeStrokeMiterLimit(Paint paint) {
        C12775o.m28639i(paint, "<this>");
        return paint.getStrokeMiter();
    }

    public static final float getNativeStrokeWidth(Paint paint) {
        C12775o.m28639i(paint, "<this>");
        return paint.getStrokeWidth();
    }

    public static final int getNativeStyle(Paint paint) {
        int i;
        C12775o.m28639i(paint, "<this>");
        Paint.Style style = paint.getStyle();
        if (style == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
        }
        if (i == 1) {
            return PaintingStyle.Companion.m35947getStrokeTiuSbCo();
        }
        return PaintingStyle.Companion.m35946getFillTiuSbCo();
    }

    public static final Paint makeNativePaint() {
        return new Paint(7);
    }

    public static final void setNativeAlpha(Paint paint, float f) {
        C12775o.m28639i(paint, "<this>");
        paint.setAlpha((int) ((float) Math.rint((double) (f * 255.0f))));
    }

    public static final void setNativeAntiAlias(Paint paint, boolean z) {
        C12775o.m28639i(paint, "<this>");
        paint.setAntiAlias(z);
    }

    /* renamed from: setNativeBlendMode-GB0RdKg  reason: not valid java name */
    public static final void m35547setNativeBlendModeGB0RdKg(Paint paint, int i) {
        C12775o.m28639i(paint, "$this$setNativeBlendMode");
        if (Build.VERSION.SDK_INT >= 29) {
            WrapperVerificationHelperMethods.INSTANCE.m36105setBlendModeGB0RdKg(paint, i);
        } else {
            paint.setXfermode(new PorterDuffXfermode(AndroidBlendMode_androidKt.m35515toPorterDuffModes9anfk8(i)));
        }
    }

    /* renamed from: setNativeColor-4WTKRHQ  reason: not valid java name */
    public static final void m35548setNativeColor4WTKRHQ(Paint paint, long j) {
        C12775o.m28639i(paint, "$this$setNativeColor");
        paint.setColor(ColorKt.m35725toArgb8_81llA(j));
    }

    public static final void setNativeColorFilter(Paint paint, ColorFilter colorFilter) {
        ColorFilter colorFilter2;
        C12775o.m28639i(paint, "<this>");
        if (colorFilter != null) {
            colorFilter2 = AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter);
        } else {
            colorFilter2 = null;
        }
        paint.setColorFilter(colorFilter2);
    }

    /* renamed from: setNativeFilterQuality-50PEsBU  reason: not valid java name */
    public static final void m35549setNativeFilterQuality50PEsBU(Paint paint, int i) {
        C12775o.m28639i(paint, "$this$setNativeFilterQuality");
        paint.setFilterBitmap(!FilterQuality.m35761equalsimpl0(i, FilterQuality.Companion.m35768getNonefv9h1I()));
    }

    public static final void setNativePathEffect(Paint paint, PathEffect pathEffect) {
        PathEffect pathEffect2;
        C12775o.m28639i(paint, "<this>");
        AndroidPathEffect androidPathEffect = (AndroidPathEffect) pathEffect;
        if (androidPathEffect != null) {
            pathEffect2 = androidPathEffect.getNativePathEffect();
        } else {
            pathEffect2 = null;
        }
        paint.setPathEffect(pathEffect2);
    }

    public static final void setNativeShader(Paint paint, Shader shader) {
        C12775o.m28639i(paint, "<this>");
        paint.setShader(shader);
    }

    /* renamed from: setNativeStrokeCap-CSYIeUk  reason: not valid java name */
    public static final void m35550setNativeStrokeCapCSYIeUk(Paint paint, int i) {
        Paint.Cap cap;
        C12775o.m28639i(paint, "$this$setNativeStrokeCap");
        StrokeCap.Companion companion = StrokeCap.Companion;
        if (StrokeCap.m36050equalsimpl0(i, companion.m36056getSquareKaPHkGw())) {
            cap = Paint.Cap.SQUARE;
        } else if (StrokeCap.m36050equalsimpl0(i, companion.m36055getRoundKaPHkGw())) {
            cap = Paint.Cap.ROUND;
        } else if (StrokeCap.m36050equalsimpl0(i, companion.m36054getButtKaPHkGw())) {
            cap = Paint.Cap.BUTT;
        } else {
            cap = Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    /* renamed from: setNativeStrokeJoin-kLtJ_vA  reason: not valid java name */
    public static final void m35551setNativeStrokeJoinkLtJ_vA(Paint paint, int i) {
        Paint.Join join;
        C12775o.m28639i(paint, "$this$setNativeStrokeJoin");
        StrokeJoin.Companion companion = StrokeJoin.Companion;
        if (StrokeJoin.m36060equalsimpl0(i, companion.m36065getMiterLxFBmk8())) {
            join = Paint.Join.MITER;
        } else if (StrokeJoin.m36060equalsimpl0(i, companion.m36064getBevelLxFBmk8())) {
            join = Paint.Join.BEVEL;
        } else if (StrokeJoin.m36060equalsimpl0(i, companion.m36066getRoundLxFBmk8())) {
            join = Paint.Join.ROUND;
        } else {
            join = Paint.Join.MITER;
        }
        paint.setStrokeJoin(join);
    }

    public static final void setNativeStrokeMiterLimit(Paint paint, float f) {
        C12775o.m28639i(paint, "<this>");
        paint.setStrokeMiter(f);
    }

    public static final void setNativeStrokeWidth(Paint paint, float f) {
        C12775o.m28639i(paint, "<this>");
        paint.setStrokeWidth(f);
    }

    /* renamed from: setNativeStyle--5YerkU  reason: not valid java name */
    public static final void m35552setNativeStyle5YerkU(Paint paint, int i) {
        Paint.Style style;
        C12775o.m28639i(paint, "$this$setNativeStyle");
        if (PaintingStyle.m35942equalsimpl0(i, PaintingStyle.Companion.m35947getStrokeTiuSbCo())) {
            style = Paint.Style.STROKE;
        } else {
            style = Paint.Style.FILL;
        }
        paint.setStyle(style);
    }

    public static final Paint toComposePaint(Paint paint) {
        C12775o.m28639i(paint, "<this>");
        return new AndroidPaint(paint);
    }
}
