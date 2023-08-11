package androidx.compose.p002ui.text.font;

import androidx.compose.p002ui.text.ExperimentalTextApi;
import androidx.compose.p002ui.text.font.FontVariation;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.text.font.FontKt */
/* compiled from: Font.kt */
public final class FontKt {
    @ExperimentalTextApi
    /* renamed from: Font-F3nL8kk  reason: not valid java name */
    public static final Font m38041FontF3nL8kk(int i, FontWeight fontWeight, int i2, int i3, FontVariation.Settings settings) {
        C12775o.m28639i(fontWeight, "weight");
        C12775o.m28639i(settings, "variationSettings");
        return new ResourceFont(i, fontWeight, i2, settings, i3, (DefaultConstructorMarker) null);
    }

    /* renamed from: Font-F3nL8kk$default  reason: not valid java name */
    public static /* synthetic */ Font m38042FontF3nL8kk$default(int i, FontWeight fontWeight, int i2, int i3, FontVariation.Settings settings, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i4 & 4) != 0) {
            i2 = FontStyle.Companion.m38068getNormal_LCdwA();
        }
        if ((i4 & 8) != 0) {
            i3 = FontLoadingStrategy.Companion.m38055getBlockingPKNRLFQ();
        }
        if ((i4 & 16) != 0) {
            settings = FontVariation.INSTANCE.m38083Settings6EWAqTQ(fontWeight, i2, new FontVariation.Setting[0]);
        }
        return m38041FontF3nL8kk(i, fontWeight, i2, i3, settings);
    }

    /* renamed from: Font-RetOiIg$default  reason: not valid java name */
    public static /* synthetic */ Font m38044FontRetOiIg$default(int i, FontWeight fontWeight, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i3 & 4) != 0) {
            i2 = FontStyle.Companion.m38068getNormal_LCdwA();
        }
        return C12775o.m28639i(fontWeight, "weight");
    }

    @Stable
    /* renamed from: Font-YpTlLL0  reason: not valid java name */
    public static final Font m38045FontYpTlLL0(int i, FontWeight fontWeight, int i2, int i3) {
        C12775o.m28639i(fontWeight, "weight");
        return new ResourceFont(i, fontWeight, i2, new FontVariation.Settings(new FontVariation.Setting[0]), i3, (DefaultConstructorMarker) null);
    }

    /* renamed from: Font-YpTlLL0$default  reason: not valid java name */
    public static /* synthetic */ Font m38046FontYpTlLL0$default(int i, FontWeight fontWeight, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i4 & 4) != 0) {
            i2 = FontStyle.Companion.m38068getNormal_LCdwA();
        }
        if ((i4 & 8) != 0) {
            i3 = FontLoadingStrategy.Companion.m38055getBlockingPKNRLFQ();
        }
        return m38045FontYpTlLL0(i, fontWeight, i2, i3);
    }

    @Stable
    public static final FontFamily toFontFamily(Font font) {
        C12775o.m28639i(font, "<this>");
        return FontFamilyKt.FontFamily(font);
    }
}
