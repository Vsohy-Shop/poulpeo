package androidx.compose.p002ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.compose.p002ui.text.android.style.LineHeightStyleSpan;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11906l;

@SourceDebugExtension({"SMAP\nTextLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayout.kt\nandroidx/compose/ui/text/android/TextLayoutKt\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,1035:1\n26#2:1036\n26#2:1037\n*S KotlinDebug\n*F\n+ 1 TextLayout.kt\nandroidx/compose/ui/text/android/TextLayoutKt\n*L\n1027#1:1036\n1031#1:1037\n*E\n"})
/* renamed from: androidx.compose.ui.text.android.TextLayoutKt */
/* compiled from: TextLayout.kt */
public final class TextLayoutKt {
    private static final C11906l<Integer, Integer> EmptyPair = new C11906l<>(0, 0);
    /* access modifiers changed from: private */
    public static final TextAndroidCanvas SharedTextAndroidCanvas = new TextAndroidCanvas();

    /* access modifiers changed from: private */
    public static final C11906l<Paint.FontMetricsInt, Integer> getLastLineMetrics(TextLayout textLayout, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, LineHeightStyleSpan[] lineHeightStyleSpanArr) {
        boolean z;
        boolean z2;
        int lineCount = textLayout.getLineCount() - 1;
        if (textLayout.getLayout().getLineStart(lineCount) == textLayout.getLayout().getLineEnd(lineCount)) {
            if (lineHeightStyleSpanArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (true ^ z) {
                SpannableString spannableString = new SpannableString("​");
                LineHeightStyleSpan lineHeightStyleSpan = (LineHeightStyleSpan) C12710p.m28380H(lineHeightStyleSpanArr);
                int length = spannableString.length();
                if (lineCount == 0 || !lineHeightStyleSpan.getTrimLastLineBottom()) {
                    z2 = lineHeightStyleSpan.getTrimLastLineBottom();
                } else {
                    z2 = false;
                }
                spannableString.setSpan(lineHeightStyleSpan.copy$ui_text_release(0, length, z2), 0, spannableString.length(), 33);
                StaticLayout create$default = StaticLayoutFactory.create$default(StaticLayoutFactory.INSTANCE, spannableString, 0, spannableString.length(), textPaint, Integer.MAX_VALUE, textDirectionHeuristic, (Layout.Alignment) null, 0, (TextUtils.TruncateAt) null, 0, 0.0f, 0.0f, 0, textLayout.getIncludePadding(), textLayout.getFallbackLineSpacing(), 0, 0, 0, 0, (int[]) null, (int[]) null, 2072512, (Object) null);
                Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
                fontMetricsInt.ascent = create$default.getLineAscent(0);
                fontMetricsInt.descent = create$default.getLineDescent(0);
                fontMetricsInt.top = create$default.getLineTop(0);
                int lineBottom = create$default.getLineBottom(0);
                fontMetricsInt.bottom = lineBottom;
                return new C11906l<>(fontMetricsInt, Integer.valueOf(lineBottom - ((int) textLayout.getLineHeight(lineCount))));
            }
        }
        return new C11906l<>(null, 0);
    }

    /* access modifiers changed from: private */
    public static final C11906l<Integer, Integer> getLineHeightPaddings(TextLayout textLayout, LineHeightStyleSpan[] lineHeightStyleSpanArr) {
        int i = 0;
        int i2 = 0;
        for (LineHeightStyleSpan lineHeightStyleSpan : lineHeightStyleSpanArr) {
            if (lineHeightStyleSpan.getFirstAscentDiff() < 0) {
                i = Math.max(i, Math.abs(lineHeightStyleSpan.getFirstAscentDiff()));
            }
            if (lineHeightStyleSpan.getLastDescentDiff() < 0) {
                i2 = Math.max(i, Math.abs(lineHeightStyleSpan.getLastDescentDiff()));
            }
        }
        if (i == 0 && i2 == 0) {
            return EmptyPair;
        }
        return new C11906l<>(Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* access modifiers changed from: private */
    public static final LineHeightStyleSpan[] getLineHeightSpans(TextLayout textLayout) {
        boolean z;
        if (!(textLayout.getText() instanceof Spanned)) {
            return new LineHeightStyleSpan[0];
        }
        CharSequence text = textLayout.getText();
        C12775o.m28637g(text, "null cannot be cast to non-null type android.text.Spanned");
        LineHeightStyleSpan[] lineHeightStyleSpanArr = (LineHeightStyleSpan[]) ((Spanned) text).getSpans(0, textLayout.getText().length(), LineHeightStyleSpan.class);
        C12775o.m28638h(lineHeightStyleSpanArr, "lineHeightStyleSpans");
        if (lineHeightStyleSpanArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new LineHeightStyleSpan[0];
        }
        return lineHeightStyleSpanArr;
    }

    public static final TextDirectionHeuristic getTextDirectionHeuristic(int i) {
        if (i == 0) {
            TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.LTR;
            C12775o.m28638h(textDirectionHeuristic, "LTR");
            return textDirectionHeuristic;
        } else if (i == 1) {
            TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.RTL;
            C12775o.m28638h(textDirectionHeuristic2, "RTL");
            return textDirectionHeuristic2;
        } else if (i == 2) {
            TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            C12775o.m28638h(textDirectionHeuristic3, "FIRSTSTRONG_LTR");
            return textDirectionHeuristic3;
        } else if (i == 3) {
            TextDirectionHeuristic textDirectionHeuristic4 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
            C12775o.m28638h(textDirectionHeuristic4, "FIRSTSTRONG_RTL");
            return textDirectionHeuristic4;
        } else if (i == 4) {
            TextDirectionHeuristic textDirectionHeuristic5 = TextDirectionHeuristics.ANYRTL_LTR;
            C12775o.m28638h(textDirectionHeuristic5, "ANYRTL_LTR");
            return textDirectionHeuristic5;
        } else if (i != 5) {
            TextDirectionHeuristic textDirectionHeuristic6 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            C12775o.m28638h(textDirectionHeuristic6, "FIRSTSTRONG_LTR");
            return textDirectionHeuristic6;
        } else {
            TextDirectionHeuristic textDirectionHeuristic7 = TextDirectionHeuristics.LOCALE;
            C12775o.m28638h(textDirectionHeuristic7, "LOCALE");
            return textDirectionHeuristic7;
        }
    }

    /* access modifiers changed from: private */
    public static final C11906l<Integer, Integer> getVerticalPaddings(TextLayout textLayout) {
        int i;
        int i2;
        if (textLayout.getIncludePadding() || textLayout.isFallbackLinespacingApplied$ui_text_release()) {
            return new C11906l<>(0, 0);
        }
        TextPaint paint = textLayout.getLayout().getPaint();
        CharSequence text = textLayout.getLayout().getText();
        C12775o.m28638h(paint, "paint");
        C12775o.m28638h(text, "text");
        Rect charSequenceBounds = PaintExtensionsKt.getCharSequenceBounds(paint, text, textLayout.getLayout().getLineStart(0), textLayout.getLayout().getLineEnd(0));
        int lineAscent = textLayout.getLayout().getLineAscent(0);
        int i3 = charSequenceBounds.top;
        if (i3 < lineAscent) {
            i = lineAscent - i3;
        } else {
            i = textLayout.getLayout().getTopPadding();
        }
        if (textLayout.getLineCount() != 1) {
            int lineCount = textLayout.getLineCount() - 1;
            charSequenceBounds = PaintExtensionsKt.getCharSequenceBounds(paint, text, textLayout.getLayout().getLineStart(lineCount), textLayout.getLayout().getLineEnd(lineCount));
        }
        int lineDescent = textLayout.getLayout().getLineDescent(textLayout.getLineCount() - 1);
        int i4 = charSequenceBounds.bottom;
        if (i4 > lineDescent) {
            i2 = i4 - lineDescent;
        } else {
            i2 = textLayout.getLayout().getBottomPadding();
        }
        if (i == 0 && i2 == 0) {
            return EmptyPair;
        }
        return new C11906l<>(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static final boolean isLineEllipsized(Layout layout, int i) {
        C12775o.m28639i(layout, "<this>");
        if (layout.getEllipsisCount(i) > 0) {
            return true;
        }
        return false;
    }
}
