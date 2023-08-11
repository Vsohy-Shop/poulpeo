package androidx.compose.p002ui.text.style;

import androidx.compose.p002ui.graphics.Brush;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.ColorKt;
import androidx.compose.p002ui.text.SpanStyleKt;
import androidx.compose.p002ui.util.MathHelpersKt;
import kotlin.jvm.internal.C12775o;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.text.style.TextDrawStyleKt */
/* compiled from: TextForegroundStyle.kt */
public final class TextDrawStyleKt {
    public static final TextForegroundStyle lerp(TextForegroundStyle textForegroundStyle, TextForegroundStyle textForegroundStyle2, float f) {
        C12775o.m28639i(textForegroundStyle, "start");
        C12775o.m28639i(textForegroundStyle2, "stop");
        boolean z = textForegroundStyle instanceof BrushStyle;
        if (!z && !(textForegroundStyle2 instanceof BrushStyle)) {
            return TextForegroundStyle.Companion.m38368from8_81llA(ColorKt.m35722lerpjxsXWHM(textForegroundStyle.m38367getColor0d7_KjU(), textForegroundStyle2.m38367getColor0d7_KjU(), f));
        }
        if (!z || !(textForegroundStyle2 instanceof BrushStyle)) {
            return (TextForegroundStyle) SpanStyleKt.lerpDiscrete(textForegroundStyle, textForegroundStyle2, f);
        }
        return TextForegroundStyle.Companion.from((Brush) SpanStyleKt.lerpDiscrete(((BrushStyle) textForegroundStyle).getBrush(), ((BrushStyle) textForegroundStyle2).getBrush(), f), MathHelpersKt.lerp(textForegroundStyle.getAlpha(), textForegroundStyle2.getAlpha(), f));
    }

    /* renamed from: modulate-DxMtmZc  reason: not valid java name */
    public static final long m38366modulateDxMtmZc(long j, float f) {
        if (Float.isNaN(f) || f >= 1.0f) {
            return j;
        }
        return Color.m35670copywmQWz5c$default(j, Color.m35673getAlphaimpl(j) * f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final float takeOrElse(float f, C13074a<Float> aVar) {
        if (Float.isNaN(f)) {
            return aVar.invoke().floatValue();
        }
        return f;
    }
}
