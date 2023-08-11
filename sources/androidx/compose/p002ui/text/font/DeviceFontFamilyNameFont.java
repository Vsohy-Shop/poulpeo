package androidx.compose.p002ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.p002ui.text.font.FontVariation;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.text.font.DeviceFontFamilyNameFont */
/* compiled from: DeviceFontFamilyNameFont.kt */
final class DeviceFontFamilyNameFont extends AndroidFont {
    private final String familyName;
    private final int style;
    private final FontWeight weight;

    public /* synthetic */ DeviceFontFamilyNameFont(String str, FontWeight fontWeight, int i, FontVariation.Settings settings, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, fontWeight, i, settings);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceFontFamilyNameFont)) {
            return false;
        }
        DeviceFontFamilyNameFont deviceFontFamilyNameFont = (DeviceFontFamilyNameFont) obj;
        if (DeviceFontFamilyName.m38027equalsimpl0(this.familyName, deviceFontFamilyNameFont.familyName) && C12775o.m28634d(getWeight(), deviceFontFamilyNameFont.getWeight()) && FontStyle.m38063equalsimpl0(m38031getStyle_LCdwA(), deviceFontFamilyNameFont.m38031getStyle_LCdwA()) && C12775o.m28634d(getVariationSettings(), deviceFontFamilyNameFont.getVariationSettings())) {
            return true;
        }
        return false;
    }

    /* renamed from: getStyle-_-LCdwA  reason: not valid java name */
    public int m38031getStyle_LCdwA() {
        return this.style;
    }

    public FontWeight getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return (((((DeviceFontFamilyName.m38028hashCodeimpl(this.familyName) * 31) + getWeight().hashCode()) * 31) + FontStyle.m38064hashCodeimpl(m38031getStyle_LCdwA())) * 31) + getVariationSettings().hashCode();
    }

    public final Typeface loadCached(Context context) {
        C12775o.m28639i(context, "context");
        return PlatformTypefacesKt.PlatformTypefaces().m38090optionalOnDeviceFontFamilyByName78DK7lM(this.familyName, getWeight(), m38031getStyle_LCdwA(), getVariationSettings(), context);
    }

    public String toString() {
        return "Font(familyName=\"" + DeviceFontFamilyName.m38029toStringimpl(this.familyName) + "\", weight=" + getWeight() + ", style=" + FontStyle.m38065toStringimpl(m38031getStyle_LCdwA()) + ')';
    }

    private DeviceFontFamilyNameFont(String str, FontWeight fontWeight, int i, FontVariation.Settings settings) {
        super(FontLoadingStrategy.Companion.m38056getOptionalLocalPKNRLFQ(), NamedFontLoader.INSTANCE, settings, (DefaultConstructorMarker) null);
        this.familyName = str;
        this.weight = fontWeight;
        this.style = i;
    }
}
