package androidx.compose.p002ui.text.android.style;

import android.graphics.Paint;
import android.text.Layout;
import androidx.compose.p002ui.text.android.TextLayoutKt;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.android.style.IndentationFixSpanKt */
/* compiled from: IndentationFixSpan.kt */
public final class IndentationFixSpanKt {
    private static final String EllipsisChar = "…";

    /* renamed from: androidx.compose.ui.text.android.style.IndentationFixSpanKt$WhenMappings */
    /* compiled from: IndentationFixSpan.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final float getEllipsizedLeftPadding(Layout layout, int i, Paint paint) {
        int i2;
        float f;
        float f2;
        C12775o.m28639i(layout, "<this>");
        C12775o.m28639i(paint, "paint");
        float lineLeft = layout.getLineLeft(i);
        if (!TextLayoutKt.isLineEllipsized(layout, i) || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float primaryHorizontal = (layout.getPrimaryHorizontal(layout.getLineStart(i) + layout.getEllipsisStart(i)) - lineLeft) + paint.measureText(EllipsisChar);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if (paragraphAlignment == null) {
            i2 = -1;
        } else {
            i2 = WhenMappings.$EnumSwitchMapping$0[paragraphAlignment.ordinal()];
        }
        if (i2 == 1) {
            f = Math.abs(lineLeft);
            f2 = (((float) layout.getWidth()) - primaryHorizontal) / 2.0f;
        } else {
            f = Math.abs(lineLeft);
            f2 = ((float) layout.getWidth()) - primaryHorizontal;
        }
        return f + f2;
    }

    public static /* synthetic */ float getEllipsizedLeftPadding$default(Layout layout, int i, Paint paint, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            paint = layout.getPaint();
            C12775o.m28638h(paint, "this.paint");
        }
        return getEllipsizedLeftPadding(layout, i, paint);
    }

    public static final float getEllipsizedRightPadding(Layout layout, int i, Paint paint) {
        float f;
        float f2;
        C12775o.m28639i(layout, "<this>");
        C12775o.m28639i(paint, "paint");
        if (!TextLayoutKt.isLineEllipsized(layout, i)) {
            return 0.0f;
        }
        int i2 = -1;
        if (layout.getParagraphDirection(i) != -1 || ((float) layout.getWidth()) >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float lineRight = (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getLineStart(i) + layout.getEllipsisStart(i))) + paint.measureText(EllipsisChar);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if (paragraphAlignment != null) {
            i2 = WhenMappings.$EnumSwitchMapping$0[paragraphAlignment.ordinal()];
        }
        if (i2 == 1) {
            f = ((float) layout.getWidth()) - layout.getLineRight(i);
            f2 = (((float) layout.getWidth()) - lineRight) / 2.0f;
        } else {
            f = ((float) layout.getWidth()) - layout.getLineRight(i);
            f2 = ((float) layout.getWidth()) - lineRight;
        }
        return f - f2;
    }

    public static /* synthetic */ float getEllipsizedRightPadding$default(Layout layout, int i, Paint paint, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            paint = layout.getPaint();
            C12775o.m28638h(paint, "this.paint");
        }
        return getEllipsizedRightPadding(layout, i, paint);
    }
}
