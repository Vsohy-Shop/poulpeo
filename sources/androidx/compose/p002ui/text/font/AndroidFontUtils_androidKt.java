package androidx.compose.p002ui.text.font;

import androidx.compose.p002ui.text.font.FontWeight;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.font.AndroidFontUtils_androidKt */
/* compiled from: AndroidFontUtils.android.kt */
public final class AndroidFontUtils_androidKt {
    public static final FontWeight getAndroidBold(FontWeight.Companion companion) {
        C12775o.m28639i(companion, "<this>");
        return companion.getW600();
    }

    public static final int getAndroidTypefaceStyle(boolean z, boolean z2) {
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        if (z2) {
            return 2;
        }
        return 0;
    }

    /* renamed from: getAndroidTypefaceStyle-FO1MlWM  reason: not valid java name */
    public static final int m38013getAndroidTypefaceStyleFO1MlWM(FontWeight fontWeight, int i) {
        boolean z;
        C12775o.m28639i(fontWeight, "fontWeight");
        if (fontWeight.compareTo(getAndroidBold(FontWeight.Companion)) >= 0) {
            z = true;
        } else {
            z = false;
        }
        return getAndroidTypefaceStyle(z, FontStyle.m38063equalsimpl0(i, FontStyle.Companion.m38067getItalic_LCdwA()));
    }
}
