package androidx.compose.foundation.text;

import androidx.compose.p002ui.text.Paragraph;
import androidx.compose.p002ui.text.ParagraphKt;
import androidx.compose.p002ui.text.TextStyle;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.unit.ConstraintsKt;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.p002ui.unit.IntSizeKt;
import java.util.List;
import kotlin.jvm.internal.C12775o;

/* compiled from: TextFieldDelegate.kt */
public final class TextFieldDelegateKt {
    public static final int DefaultWidthCharCount = 10;
    private static final String EmptyTextReplacement = C13754v.m31535w("H", 10);

    public static final long computeSizeForDefaultText(TextStyle textStyle, Density density, FontFamily.Resolver resolver, String str, int i) {
        C12775o.m28639i(textStyle, "style");
        C12775o.m28639i(density, "density");
        FontFamily.Resolver resolver2 = resolver;
        C12775o.m28639i(resolver2, "fontFamilyResolver");
        String str2 = str;
        C12775o.m28639i(str2, "text");
        List k = C12726w.m28524k();
        Paragraph r0 = ParagraphKt.m37876ParagraphUdtVg6A$default(str2, textStyle, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, (Object) null), density, resolver2, k, (List) null, i, false, 64, (Object) null);
        return IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(r0.getMinIntrinsicWidth()), TextDelegateKt.ceilToIntPx(r0.getHeight()));
    }

    public static /* synthetic */ long computeSizeForDefaultText$default(TextStyle textStyle, Density density, FontFamily.Resolver resolver, String str, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str = EmptyTextReplacement;
        }
        if ((i2 & 16) != 0) {
            i = 1;
        }
        return computeSizeForDefaultText(textStyle, density, resolver, str, i);
    }

    public static final String getEmptyTextReplacement() {
        return EmptyTextReplacement;
    }
}
