package androidx.compose.p002ui.text.font;

import androidx.compose.p002ui.text.font.FontVariation;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.text.font.DeviceFontFamilyNameFontKt */
/* compiled from: DeviceFontFamilyNameFont.kt */
public final class DeviceFontFamilyNameFontKt {
    /* renamed from: Font-vxs03AY  reason: not valid java name */
    public static final Font m38032Fontvxs03AY(String str, FontWeight fontWeight, int i, FontVariation.Settings settings) {
        C12775o.m28639i(str, "familyName");
        C12775o.m28639i(fontWeight, "weight");
        C12775o.m28639i(settings, "variationSettings");
        return new DeviceFontFamilyNameFont(str, fontWeight, i, settings, (DefaultConstructorMarker) null);
    }

    /* renamed from: Font-vxs03AY$default  reason: not valid java name */
    public static /* synthetic */ Font m38033Fontvxs03AY$default(String str, FontWeight fontWeight, int i, FontVariation.Settings settings, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i2 & 4) != 0) {
            i = FontStyle.Companion.m38068getNormal_LCdwA();
        }
        if ((i2 & 8) != 0) {
            settings = new FontVariation.Settings(new FontVariation.Setting[0]);
        }
        return m38032Fontvxs03AY(str, fontWeight, i, settings);
    }
}
