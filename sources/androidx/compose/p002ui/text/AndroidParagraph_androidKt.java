package androidx.compose.p002ui.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.compose.p002ui.text.android.TextLayout;
import androidx.compose.p002ui.text.android.style.IndentationFixSpan;
import androidx.compose.p002ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.p002ui.text.style.Hyphens;
import androidx.compose.p002ui.text.style.LineBreak;
import androidx.compose.p002ui.text.style.TextAlign;
import androidx.compose.p002ui.unit.TextUnit;
import androidx.compose.p002ui.unit.TextUnitKt;

/* renamed from: androidx.compose.ui.text.AndroidParagraph_androidKt */
/* compiled from: AndroidParagraph.android.kt */
public final class AndroidParagraph_androidKt {
    /* access modifiers changed from: private */
    public static final CharSequence attachIndentationFixSpan(CharSequence charSequence) {
        boolean z;
        Spannable spannable;
        if (charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return charSequence;
        }
        if (charSequence instanceof Spannable) {
            spannable = (Spannable) charSequence;
        } else {
            spannable = new SpannableString(charSequence);
        }
        SpannableExtensions_androidKt.setSpan(spannable, new IndentationFixSpan(), spannable.length() - 1, spannable.length() - 1);
        return spannable;
    }

    /* access modifiers changed from: private */
    public static final int numberOfLinesThatFitMaxHeight(TextLayout textLayout, int i) {
        int lineCount = textLayout.getLineCount();
        for (int i2 = 0; i2 < lineCount; i2++) {
            if (textLayout.getLineBottom(i2) > ((float) i)) {
                return i2;
            }
        }
        return textLayout.getLineCount();
    }

    /* access modifiers changed from: private */
    public static final boolean shouldAttachIndentationFixSpan(TextStyle textStyle, boolean z) {
        boolean z2;
        boolean z3;
        if (!z || TextUnit.m38646equalsimpl0(textStyle.m38000getLetterSpacingXSAIIZE(), TextUnitKt.getSp(0)) || TextUnit.m38646equalsimpl0(textStyle.m38000getLetterSpacingXSAIIZE(), TextUnit.Companion.m38660getUnspecifiedXSAIIZE()) || textStyle.m38003getTextAlignbuA522U() == null) {
            return false;
        }
        TextAlign r6 = textStyle.m38003getTextAlignbuA522U();
        TextAlign.Companion companion = TextAlign.Companion;
        int r2 = companion.m38353getStarte0LSkKk();
        if (r6 == null) {
            z2 = false;
        } else {
            z2 = TextAlign.m38344equalsimpl0(r6.m38347unboximpl(), r2);
        }
        if (z2) {
            return false;
        }
        TextAlign r5 = textStyle.m38003getTextAlignbuA522U();
        int r62 = companion.m38350getJustifye0LSkKk();
        if (r5 == null) {
            z3 = false;
        } else {
            z3 = TextAlign.m38344equalsimpl0(r5.m38347unboximpl(), r62);
        }
        if (!z3) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: toLayoutAlign-AMY3VfE  reason: not valid java name */
    public static final int m37842toLayoutAlignAMY3VfE(TextAlign textAlign) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        TextAlign.Companion companion = TextAlign.Companion;
        int r1 = companion.m38351getLefte0LSkKk();
        if (textAlign == null) {
            z = false;
        } else {
            z = TextAlign.m38344equalsimpl0(textAlign.m38347unboximpl(), r1);
        }
        if (z) {
            return 3;
        }
        int r12 = companion.m38352getRighte0LSkKk();
        if (textAlign == null) {
            z2 = false;
        } else {
            z2 = TextAlign.m38344equalsimpl0(textAlign.m38347unboximpl(), r12);
        }
        if (z2) {
            return 4;
        }
        int r13 = companion.m38348getCentere0LSkKk();
        if (textAlign == null) {
            z3 = false;
        } else {
            z3 = TextAlign.m38344equalsimpl0(textAlign.m38347unboximpl(), r13);
        }
        if (z3) {
            return 2;
        }
        int r14 = companion.m38353getStarte0LSkKk();
        if (textAlign == null) {
            z4 = false;
        } else {
            z4 = TextAlign.m38344equalsimpl0(textAlign.m38347unboximpl(), r14);
        }
        if (z4) {
            return 0;
        }
        int r0 = companion.m38349getEnde0LSkKk();
        if (textAlign == null) {
            z5 = false;
        } else {
            z5 = TextAlign.m38344equalsimpl0(textAlign.m38347unboximpl(), r0);
        }
        if (z5) {
            return 1;
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: toLayoutBreakStrategy-u6PBz3U  reason: not valid java name */
    public static final int m37843toLayoutBreakStrategyu6PBz3U(LineBreak.Strategy strategy) {
        boolean z;
        boolean z2;
        boolean z3;
        LineBreak.Strategy.Companion companion = LineBreak.Strategy.Companion;
        int r1 = companion.m38290getSimplefcGXIks();
        if (strategy == null) {
            z = false;
        } else {
            z = LineBreak.Strategy.m38284equalsimpl0(strategy.m38287unboximpl(), r1);
        }
        if (z) {
            return 0;
        }
        int r12 = companion.m38289getHighQualityfcGXIks();
        if (strategy == null) {
            z2 = false;
        } else {
            z2 = LineBreak.Strategy.m38284equalsimpl0(strategy.m38287unboximpl(), r12);
        }
        if (z2) {
            return 1;
        }
        int r0 = companion.m38288getBalancedfcGXIks();
        if (strategy == null) {
            z3 = false;
        } else {
            z3 = LineBreak.Strategy.m38284equalsimpl0(strategy.m38287unboximpl(), r0);
        }
        if (z3) {
            return 2;
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: toLayoutHyphenationFrequency-0_XeFpE  reason: not valid java name */
    public static final int m37844toLayoutHyphenationFrequency0_XeFpE(Hyphens hyphens) {
        boolean z;
        Hyphens.Companion companion = Hyphens.Companion;
        int r1 = companion.m38263getAutovmbZdU8();
        if (hyphens == null) {
            z = false;
        } else {
            z = Hyphens.m38259equalsimpl0(hyphens.m38262unboximpl(), r1);
        }
        if (!z) {
            int r0 = companion.m38264getNonevmbZdU8();
            if (hyphens == null) {
                return 0;
            }
            Hyphens.m38259equalsimpl0(hyphens.m38262unboximpl(), r0);
            return 0;
        } else if (Build.VERSION.SDK_INT <= 32) {
            return 1;
        } else {
            return 3;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: toLayoutLineBreakStyle-4a2g8L8  reason: not valid java name */
    public static final int m37845toLayoutLineBreakStyle4a2g8L8(LineBreak.Strictness strictness) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        LineBreak.Strictness.Companion companion = LineBreak.Strictness.Companion;
        int r1 = companion.m38298getDefaultusljTpc();
        if (strictness == null) {
            z = false;
        } else {
            z = LineBreak.Strictness.m38294equalsimpl0(strictness.m38297unboximpl(), r1);
        }
        if (z) {
            return 0;
        }
        int r12 = companion.m38299getLooseusljTpc();
        if (strictness == null) {
            z2 = false;
        } else {
            z2 = LineBreak.Strictness.m38294equalsimpl0(strictness.m38297unboximpl(), r12);
        }
        if (z2) {
            return 1;
        }
        int r13 = companion.m38300getNormalusljTpc();
        if (strictness == null) {
            z3 = false;
        } else {
            z3 = LineBreak.Strictness.m38294equalsimpl0(strictness.m38297unboximpl(), r13);
        }
        if (z3) {
            return 2;
        }
        int r0 = companion.m38301getStrictusljTpc();
        if (strictness == null) {
            z4 = false;
        } else {
            z4 = LineBreak.Strictness.m38294equalsimpl0(strictness.m38297unboximpl(), r0);
        }
        if (z4) {
            return 3;
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: toLayoutLineBreakWordStyle-gvcdTPQ  reason: not valid java name */
    public static final int m37846toLayoutLineBreakWordStylegvcdTPQ(LineBreak.WordBreak wordBreak) {
        boolean z;
        boolean z2;
        LineBreak.WordBreak.Companion companion = LineBreak.WordBreak.Companion;
        int r1 = companion.m38309getDefaultjp8hJ3c();
        if (wordBreak == null) {
            z = false;
        } else {
            z = LineBreak.WordBreak.m38305equalsimpl0(wordBreak.m38308unboximpl(), r1);
        }
        if (z) {
            return 0;
        }
        int r0 = companion.m38310getPhrasejp8hJ3c();
        if (wordBreak == null) {
            z2 = false;
        } else {
            z2 = LineBreak.WordBreak.m38305equalsimpl0(wordBreak.m38308unboximpl(), r0);
        }
        if (z2) {
            return 1;
        }
        return 0;
    }
}
