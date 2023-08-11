package androidx.compose.p002ui.text.font;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* renamed from: androidx.compose.ui.text.font.GenericFontFamily */
/* compiled from: FontFamily.kt */
public final class GenericFontFamily extends SystemFontFamily {
    public static final int $stable = 0;
    private final String fontFamilyName;
    private final String name;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GenericFontFamily(String str, String str2) {
        super((DefaultConstructorMarker) null);
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
        C12775o.m28639i(str2, "fontFamilyName");
        this.name = str;
        this.fontFamilyName = str2;
    }

    public final String getName() {
        return this.name;
    }

    public String toString() {
        return this.fontFamilyName;
    }
}
