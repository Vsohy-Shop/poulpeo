package androidx.compose.p002ui.text.font;

import androidx.compose.runtime.Stable;
import java.util.List;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.font.FontFamilyKt */
/* compiled from: FontFamily.kt */
public final class FontFamilyKt {
    @Stable
    public static final FontFamily FontFamily(List<? extends Font> list) {
        C12775o.m28639i(list, "fonts");
        return new FontListFontFamily(list);
    }

    @Stable
    public static final FontFamily FontFamily(Font... fontArr) {
        C12775o.m28639i(fontArr, "fonts");
        return new FontListFontFamily(C12708o.m28336c(fontArr));
    }

    @Stable
    public static final FontFamily FontFamily(Typeface typeface) {
        C12775o.m28639i(typeface, "typeface");
        return new LoadedFontFamily(typeface);
    }
}
