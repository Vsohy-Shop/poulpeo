package androidx.compose.p002ui.platform;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.Shadow;
import androidx.compose.p002ui.text.SpanStyle;
import androidx.compose.p002ui.text.font.FontStyle;
import androidx.compose.p002ui.text.font.FontSynthesis;
import androidx.compose.p002ui.text.font.FontWeight;
import androidx.compose.p002ui.text.style.BaselineShift;
import androidx.compose.p002ui.text.style.TextDecoration;
import androidx.compose.p002ui.text.style.TextGeometricTransform;
import androidx.compose.p002ui.unit.TextUnit;
import androidx.compose.p002ui.unit.TextUnitType;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.platform.EncodeHelper */
/* compiled from: AndroidClipboardManager.android.kt */
public final class EncodeHelper {
    private Parcel parcel;

    public EncodeHelper() {
        Parcel obtain = Parcel.obtain();
        C12775o.m28638h(obtain, "obtain()");
        this.parcel = obtain;
    }

    public final void encode(SpanStyle spanStyle) {
        C12775o.m28639i(spanStyle, "spanStyle");
        long r0 = spanStyle.m37935getColor0d7_KjU();
        Color.Companion companion = Color.Companion;
        if (!Color.m35672equalsimpl0(r0, companion.m35707getUnspecified0d7_KjU())) {
            encode((byte) 1);
            m37736encode8_81llA(spanStyle.m37935getColor0d7_KjU());
        }
        long r02 = spanStyle.m37936getFontSizeXSAIIZE();
        TextUnit.Companion companion2 = TextUnit.Companion;
        if (!TextUnit.m38646equalsimpl0(r02, companion2.m38660getUnspecifiedXSAIIZE())) {
            encode((byte) 2);
            m37733encodeR2X_6o(spanStyle.m37936getFontSizeXSAIIZE());
        }
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight != null) {
            encode((byte) 3);
            encode(fontWeight);
        }
        FontStyle r03 = spanStyle.m37937getFontStyle4Lr2A7w();
        if (r03 != null) {
            int r04 = r03.m38066unboximpl();
            encode((byte) 4);
            m37738encodenzbMABs(r04);
        }
        FontSynthesis r05 = spanStyle.m37938getFontSynthesisZQGJjVo();
        if (r05 != null) {
            int r06 = r05.m38077unboximpl();
            encode((byte) 5);
            m37735encode6p3vJLY(r06);
        }
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings != null) {
            encode((byte) 6);
            encode(fontFeatureSettings);
        }
        if (!TextUnit.m38646equalsimpl0(spanStyle.m37939getLetterSpacingXSAIIZE(), companion2.m38660getUnspecifiedXSAIIZE())) {
            encode((byte) 7);
            m37733encodeR2X_6o(spanStyle.m37939getLetterSpacingXSAIIZE());
        }
        BaselineShift r07 = spanStyle.m37934getBaselineShift5SSeXJ0();
        if (r07 != null) {
            float r08 = r07.m38242unboximpl();
            encode((byte) 8);
            m37734encode4Dl_Bck(r08);
        }
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform != null) {
            encode((byte) 9);
            encode(textGeometricTransform);
        }
        if (!Color.m35672equalsimpl0(spanStyle.m37933getBackground0d7_KjU(), companion.m35707getUnspecified0d7_KjU())) {
            encode((byte) 10);
            m37736encode8_81llA(spanStyle.m37933getBackground0d7_KjU());
        }
        TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration != null) {
            encode((byte) 11);
            encode(textDecoration);
        }
        Shadow shadow = spanStyle.getShadow();
        if (shadow != null) {
            encode((byte) 12);
            encode(shadow);
        }
    }

    /* renamed from: encode--R2X_6o  reason: not valid java name */
    public final void m37733encodeR2X_6o(long j) {
        long r0 = TextUnit.m38648getTypeUIouoOA(j);
        TextUnitType.Companion companion = TextUnitType.Companion;
        byte b = 0;
        if (!TextUnitType.m38677equalsimpl0(r0, companion.m38683getUnspecifiedUIouoOA())) {
            if (TextUnitType.m38677equalsimpl0(r0, companion.m38682getSpUIouoOA())) {
                b = 1;
            } else if (TextUnitType.m38677equalsimpl0(r0, companion.m38681getEmUIouoOA())) {
                b = 2;
            }
        }
        encode(b);
        if (!TextUnitType.m38677equalsimpl0(TextUnit.m38648getTypeUIouoOA(j), companion.m38683getUnspecifiedUIouoOA())) {
            encode(TextUnit.m38649getValueimpl(j));
        }
    }

    /* renamed from: encode-4Dl_Bck  reason: not valid java name */
    public final void m37734encode4Dl_Bck(float f) {
        encode(f);
    }

    /* renamed from: encode-6p3vJLY  reason: not valid java name */
    public final void m37735encode6p3vJLY(int i) {
        FontSynthesis.Companion companion = FontSynthesis.Companion;
        byte b = 0;
        if (!FontSynthesis.m38072equalsimpl0(i, companion.m38079getNoneGVVA2EU())) {
            if (FontSynthesis.m38072equalsimpl0(i, companion.m38078getAllGVVA2EU())) {
                b = 1;
            } else if (FontSynthesis.m38072equalsimpl0(i, companion.m38081getWeightGVVA2EU())) {
                b = 2;
            } else if (FontSynthesis.m38072equalsimpl0(i, companion.m38080getStyleGVVA2EU())) {
                b = 3;
            }
        }
        encode(b);
    }

    /* renamed from: encode-8_81llA  reason: not valid java name */
    public final void m37736encode8_81llA(long j) {
        m37737encodeVKZWuLQ(j);
    }

    /* renamed from: encode-VKZWuLQ  reason: not valid java name */
    public final void m37737encodeVKZWuLQ(long j) {
        this.parcel.writeLong(j);
    }

    /* renamed from: encode-nzbMABs  reason: not valid java name */
    public final void m37738encodenzbMABs(int i) {
        FontStyle.Companion companion = FontStyle.Companion;
        byte b = 0;
        if (!FontStyle.m38063equalsimpl0(i, companion.m38068getNormal_LCdwA()) && FontStyle.m38063equalsimpl0(i, companion.m38067getItalic_LCdwA())) {
            b = 1;
        }
        encode(b);
    }

    public final String encodedString() {
        String encodeToString = Base64.encodeToString(this.parcel.marshall(), 0);
        C12775o.m28638h(encodeToString, "encodeToString(bytes, Base64.DEFAULT)");
        return encodeToString;
    }

    public final void reset() {
        this.parcel.recycle();
        Parcel obtain = Parcel.obtain();
        C12775o.m28638h(obtain, "obtain()");
        this.parcel = obtain;
    }

    public final void encode(FontWeight fontWeight) {
        C12775o.m28639i(fontWeight, "fontWeight");
        encode(fontWeight.getWeight());
    }

    public final void encode(TextGeometricTransform textGeometricTransform) {
        C12775o.m28639i(textGeometricTransform, "textGeometricTransform");
        encode(textGeometricTransform.getScaleX());
        encode(textGeometricTransform.getSkewX());
    }

    public final void encode(TextDecoration textDecoration) {
        C12775o.m28639i(textDecoration, "textDecoration");
        encode(textDecoration.getMask());
    }

    public final void encode(Shadow shadow) {
        C12775o.m28639i(shadow, "shadow");
        m37736encode8_81llA(shadow.m36023getColor0d7_KjU());
        encode(Offset.m35422getXimpl(shadow.m36024getOffsetF1C5BW0()));
        encode(Offset.m35423getYimpl(shadow.m36024getOffsetF1C5BW0()));
        encode(shadow.getBlurRadius());
    }

    public final void encode(byte b) {
        this.parcel.writeByte(b);
    }

    public final void encode(int i) {
        this.parcel.writeInt(i);
    }

    public final void encode(float f) {
        this.parcel.writeFloat(f);
    }

    public final void encode(String str) {
        C12775o.m28639i(str, TypedValues.Custom.S_STRING);
        this.parcel.writeString(str);
    }
}
