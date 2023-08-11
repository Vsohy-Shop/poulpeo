package androidx.compose.p002ui.text;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.text.AndroidTextStyle_androidKt */
/* compiled from: AndroidTextStyle.android.kt */
public final class AndroidTextStyle_androidKt {
    public static final boolean DefaultIncludeFontPadding = true;

    public static final PlatformTextStyle createPlatformTextStyle(PlatformSpanStyle platformSpanStyle, PlatformParagraphStyle platformParagraphStyle) {
        return new PlatformTextStyle(platformSpanStyle, platformParagraphStyle);
    }

    public static final PlatformSpanStyle lerp(PlatformSpanStyle platformSpanStyle, PlatformSpanStyle platformSpanStyle2, float f) {
        C12775o.m28639i(platformSpanStyle, "start");
        C12775o.m28639i(platformSpanStyle2, "stop");
        return platformSpanStyle;
    }

    public static final PlatformParagraphStyle lerp(PlatformParagraphStyle platformParagraphStyle, PlatformParagraphStyle platformParagraphStyle2, float f) {
        C12775o.m28639i(platformParagraphStyle, "start");
        C12775o.m28639i(platformParagraphStyle2, "stop");
        if (platformParagraphStyle.getIncludeFontPadding() == platformParagraphStyle2.getIncludeFontPadding()) {
            return platformParagraphStyle;
        }
        return new PlatformParagraphStyle(((EmojiSupportMatch) SpanStyleKt.lerpDiscrete(EmojiSupportMatch.m37848boximpl(platformParagraphStyle.m37914getEmojiSupportMatch_3YsG6Y()), EmojiSupportMatch.m37848boximpl(platformParagraphStyle2.m37914getEmojiSupportMatch_3YsG6Y()), f)).m37854unboximpl(), ((Boolean) SpanStyleKt.lerpDiscrete(Boolean.valueOf(platformParagraphStyle.getIncludeFontPadding()), Boolean.valueOf(platformParagraphStyle2.getIncludeFontPadding()), f)).booleanValue(), (DefaultConstructorMarker) null);
    }
}
