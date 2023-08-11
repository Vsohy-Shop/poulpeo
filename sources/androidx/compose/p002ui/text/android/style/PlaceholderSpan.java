package androidx.compose.p002ui.text.android.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.compose.p002ui.text.android.InternalPlatformTextApi;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nPlaceholderSpan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceholderSpan.kt\nandroidx/compose/ui/text/android/style/PlaceholderSpan\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,189:1\n1#2:190\n*E\n"})
@InternalPlatformTextApi
/* renamed from: androidx.compose.ui.text.android.style.PlaceholderSpan */
/* compiled from: PlaceholderSpan.kt */
public final class PlaceholderSpan extends ReplacementSpan {
    public static final int $stable = 8;
    public static final int ALIGN_ABOVE_BASELINE = 0;
    public static final int ALIGN_BOTTOM = 2;
    public static final int ALIGN_CENTER = 3;
    public static final int ALIGN_TEXT_BOTTOM = 5;
    public static final int ALIGN_TEXT_CENTER = 6;
    public static final int ALIGN_TEXT_TOP = 4;
    public static final int ALIGN_TOP = 1;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final int UNIT_EM = 1;
    public static final int UNIT_SP = 0;
    public static final int UNIT_UNSPECIFIED = 2;
    private Paint.FontMetricsInt fontMetrics;
    private final float height;
    private int heightPx;
    private final int heightUnit;
    private boolean isLaidOut;
    private final float pxPerSp;
    private final int verticalAlign;
    private final float width;
    private int widthPx;
    private final int widthUnit;

    /* renamed from: androidx.compose.ui.text.android.style.PlaceholderSpan$Companion */
    /* compiled from: PlaceholderSpan.kt */
    public static final class Companion {

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: androidx.compose.ui.text.android.style.PlaceholderSpan$Companion$Unit */
        /* compiled from: PlaceholderSpan.kt */
        public @interface Unit {
        }

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: androidx.compose.ui.text.android.style.PlaceholderSpan$Companion$VerticalAlign */
        /* compiled from: PlaceholderSpan.kt */
        public @interface VerticalAlign {
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public PlaceholderSpan(float f, int i, float f2, int i2, float f3, int i3) {
        this.width = f;
        this.widthUnit = i;
        this.height = f2;
        this.heightUnit = i2;
        this.pxPerSp = f3;
        this.verticalAlign = i3;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C12775o.m28639i(canvas, "canvas");
        C12775o.m28639i(paint, "paint");
    }

    public final Paint.FontMetricsInt getFontMetrics() {
        Paint.FontMetricsInt fontMetricsInt = this.fontMetrics;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        C12775o.m28656z("fontMetrics");
        return null;
    }

    public final int getHeightPx() {
        if (this.isLaidOut) {
            return this.heightPx;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        boolean z;
        float f;
        int i3;
        C12775o.m28639i(paint, "paint");
        this.isLaidOut = true;
        float textSize = paint.getTextSize();
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        C12775o.m28638h(fontMetricsInt2, "paint.fontMetricsInt");
        this.fontMetrics = fontMetricsInt2;
        if (getFontMetrics().descent > getFontMetrics().ascent) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i4 = this.widthUnit;
            if (i4 == 0) {
                f = this.width * this.pxPerSp;
            } else if (i4 == 1) {
                f = this.width * textSize;
            } else {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            this.widthPx = PlaceholderSpanKt.ceilToInt(f);
            int i5 = this.heightUnit;
            if (i5 == 0) {
                i3 = PlaceholderSpanKt.ceilToInt(this.height * this.pxPerSp);
            } else if (i5 == 1) {
                i3 = PlaceholderSpanKt.ceilToInt(this.height * textSize);
            } else {
                throw new IllegalArgumentException("Unsupported unit.");
            }
            this.heightPx = i3;
            if (fontMetricsInt != null) {
                fontMetricsInt.ascent = getFontMetrics().ascent;
                fontMetricsInt.descent = getFontMetrics().descent;
                fontMetricsInt.leading = getFontMetrics().leading;
                switch (this.verticalAlign) {
                    case 0:
                        if (fontMetricsInt.ascent > (-getHeightPx())) {
                            fontMetricsInt.ascent = -getHeightPx();
                            break;
                        }
                        break;
                    case 1:
                    case 4:
                        if (fontMetricsInt.ascent + getHeightPx() > fontMetricsInt.descent) {
                            fontMetricsInt.descent = fontMetricsInt.ascent + getHeightPx();
                            break;
                        }
                        break;
                    case 2:
                    case 5:
                        if (fontMetricsInt.ascent > fontMetricsInt.descent - getHeightPx()) {
                            fontMetricsInt.ascent = fontMetricsInt.descent - getHeightPx();
                            break;
                        }
                        break;
                    case 3:
                    case 6:
                        if (fontMetricsInt.descent - fontMetricsInt.ascent < getHeightPx()) {
                            int heightPx2 = fontMetricsInt.ascent - ((getHeightPx() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                            fontMetricsInt.ascent = heightPx2;
                            fontMetricsInt.descent = heightPx2 + getHeightPx();
                            break;
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown verticalAlign.");
                }
                fontMetricsInt.top = Math.min(getFontMetrics().top, fontMetricsInt.ascent);
                fontMetricsInt.bottom = Math.max(getFontMetrics().bottom, fontMetricsInt.descent);
            }
            return getWidthPx();
        }
        throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.".toString());
    }

    public final int getVerticalAlign() {
        return this.verticalAlign;
    }

    public final int getWidthPx() {
        if (this.isLaidOut) {
            return this.widthPx;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.".toString());
    }
}
