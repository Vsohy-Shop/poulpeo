package androidx.compose.p002ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.p002ui.text.platform.AndroidDefaultTypeface;
import androidx.compose.p002ui.text.platform.AndroidFontListTypeface;
import androidx.compose.p002ui.text.platform.AndroidGenericFontFamilyTypeface;
import androidx.compose.p002ui.text.platform.AndroidTypefaceWrapper;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11906l;

/* renamed from: androidx.compose.ui.text.font.AndroidTypeface_androidKt */
/* compiled from: AndroidTypeface.android.kt */
public final class AndroidTypeface_androidKt {
    public static final FontFamily FontFamily(Typeface typeface) {
        C12775o.m28639i(typeface, "typeface");
        return FontFamilyKt.FontFamily(Typeface(typeface));
    }

    public static final Typeface Typeface(Context context, FontFamily fontFamily, List<C11906l<FontWeight, FontStyle>> list) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(fontFamily, "fontFamily");
        if (fontFamily instanceof FontListFontFamily) {
            return new AndroidFontListTypeface((FontListFontFamily) fontFamily, context, list, (FontMatcher) null, 8, (DefaultConstructorMarker) null);
        }
        if (fontFamily instanceof GenericFontFamily) {
            return new AndroidGenericFontFamilyTypeface((GenericFontFamily) fontFamily);
        }
        if (fontFamily instanceof DefaultFontFamily) {
            return new AndroidDefaultTypeface();
        }
        if (fontFamily instanceof LoadedFontFamily) {
            return ((LoadedFontFamily) fontFamily).getTypeface();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ Typeface Typeface$default(Context context, FontFamily fontFamily, List list, int i, Object obj) {
        if ((i & 4) != 0) {
            list = null;
        }
        return Typeface(context, fontFamily, list);
    }

    public static final Typeface Typeface(Typeface typeface) {
        C12775o.m28639i(typeface, "typeface");
        return new AndroidTypefaceWrapper(typeface);
    }
}
