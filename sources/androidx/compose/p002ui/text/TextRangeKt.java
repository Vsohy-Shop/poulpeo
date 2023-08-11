package androidx.compose.p002ui.text;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nTextRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRangeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,128:1\n48#2:129\n*S KotlinDebug\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRangeKt\n*L\n127#1:129\n*E\n"})
/* renamed from: androidx.compose.ui.text.TextRangeKt */
/* compiled from: TextRange.kt */
public final class TextRangeKt {
    public static final long TextRange(int i, int i2) {
        return TextRange.m37964constructorimpl(packWithCheck(i, i2));
    }

    /* renamed from: constrain-8ffj60Q  reason: not valid java name */
    public static final long m37981constrain8ffj60Q(long j, int i, int i2) {
        int m = C13537l.m30886m(TextRange.m37975getStartimpl(j), i, i2);
        int m2 = C13537l.m30886m(TextRange.m37970getEndimpl(j), i, i2);
        if (m == TextRange.m37975getStartimpl(j) && m2 == TextRange.m37970getEndimpl(j)) {
            return j;
        }
        return TextRange(m, m2);
    }

    private static final long packWithCheck(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 < 0) {
                z2 = false;
            }
            if (z2) {
                return (((long) i2) & 4294967295L) | (((long) i) << 32);
            }
            throw new IllegalArgumentException(("end cannot be negative. [start: " + i + ", end: " + i2 + ']').toString());
        }
        throw new IllegalArgumentException(("start cannot be negative. [start: " + i + ", end: " + i2 + ']').toString());
    }

    /* renamed from: substring-FDrldGo  reason: not valid java name */
    public static final String m37982substringFDrldGo(CharSequence charSequence, long j) {
        C12775o.m28639i(charSequence, "$this$substring");
        return charSequence.subSequence(TextRange.m37973getMinimpl(j), TextRange.m37972getMaximpl(j)).toString();
    }

    public static final long TextRange(int i) {
        return TextRange(i, i);
    }
}
