package androidx.compose.p002ui.text.platform;

import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.p002ui.text.EmojiSupportMatch;
import androidx.compose.p002ui.text.ParagraphIntrinsics;
import androidx.compose.p002ui.text.Placeholder;
import androidx.compose.p002ui.text.PlatformParagraphStyle;
import androidx.compose.p002ui.text.PlatformTextStyle;
import androidx.compose.p002ui.text.SpanStyle;
import androidx.compose.p002ui.text.TextStyle;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.intl.LocaleList;
import androidx.compose.p002ui.text.style.TextDirection;
import androidx.compose.p002ui.unit.Density;
import java.util.List;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.platform.AndroidParagraphIntrinsics_androidKt */
/* compiled from: AndroidParagraphIntrinsics.android.kt */
public final class AndroidParagraphIntrinsics_androidKt {
    public static final ParagraphIntrinsics ActualParagraphIntrinsics(String str, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, Density density, FontFamily.Resolver resolver) {
        C12775o.m28639i(str, "text");
        C12775o.m28639i(textStyle, "style");
        C12775o.m28639i(list, "spanStyles");
        C12775o.m28639i(list2, "placeholders");
        C12775o.m28639i(density, "density");
        C12775o.m28639i(resolver, "fontFamilyResolver");
        return new AndroidParagraphIntrinsics(str, textStyle, list, list2, resolver, density);
    }

    /* access modifiers changed from: private */
    public static final boolean getHasEmojiCompat(TextStyle textStyle) {
        EmojiSupportMatch emojiSupportMatch;
        boolean z;
        PlatformParagraphStyle paragraphStyle;
        PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
        if (platformStyle == null || (paragraphStyle = platformStyle.getParagraphStyle()) == null) {
            emojiSupportMatch = null;
        } else {
            emojiSupportMatch = EmojiSupportMatch.m37848boximpl(paragraphStyle.m37914getEmojiSupportMatch_3YsG6Y());
        }
        int r0 = EmojiSupportMatch.Companion.m37856getNone_3YsG6Y();
        if (emojiSupportMatch == null) {
            z = false;
        } else {
            z = EmojiSupportMatch.m37851equalsimpl0(emojiSupportMatch.m37854unboximpl(), r0);
        }
        return !z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0061, code lost:
        if (r6 == null) goto L_0x0063;
     */
    /* renamed from: resolveTextDirectionHeuristics-9GRLPo0  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int m38206resolveTextDirectionHeuristics9GRLPo0(androidx.compose.p002ui.text.style.TextDirection r6, androidx.compose.p002ui.text.intl.LocaleList r7) {
        /*
            if (r6 == 0) goto L_0x0007
            int r6 = r6.m38360unboximpl()
            goto L_0x000d
        L_0x0007:
            androidx.compose.ui.text.style.TextDirection$Companion r6 = androidx.compose.p002ui.text.style.TextDirection.Companion
            int r6 = r6.m38361getContents_7Xco()
        L_0x000d:
            androidx.compose.ui.text.style.TextDirection$Companion r0 = androidx.compose.p002ui.text.style.TextDirection.Companion
            int r1 = r0.m38362getContentOrLtrs_7Xco()
            boolean r1 = androidx.compose.p002ui.text.style.TextDirection.m38357equalsimpl0(r6, r1)
            r2 = 2
            if (r1 == 0) goto L_0x001b
            goto L_0x006f
        L_0x001b:
            int r1 = r0.m38363getContentOrRtls_7Xco()
            boolean r1 = androidx.compose.p002ui.text.style.TextDirection.m38357equalsimpl0(r6, r1)
            r3 = 3
            if (r1 == 0) goto L_0x0028
        L_0x0026:
            r2 = r3
            goto L_0x006f
        L_0x0028:
            int r1 = r0.m38364getLtrs_7Xco()
            boolean r1 = androidx.compose.p002ui.text.style.TextDirection.m38357equalsimpl0(r6, r1)
            r4 = 0
            if (r1 == 0) goto L_0x0035
            r2 = r4
            goto L_0x006f
        L_0x0035:
            int r1 = r0.m38365getRtls_7Xco()
            boolean r1 = androidx.compose.p002ui.text.style.TextDirection.m38357equalsimpl0(r6, r1)
            r5 = 1
            if (r1 == 0) goto L_0x0042
            r2 = r5
            goto L_0x006f
        L_0x0042:
            int r0 = r0.m38361getContents_7Xco()
            boolean r6 = androidx.compose.p002ui.text.style.TextDirection.m38357equalsimpl0(r6, r0)
            if (r6 == 0) goto L_0x0070
            if (r7 == 0) goto L_0x0063
            androidx.compose.ui.text.intl.Locale r6 = r7.get(r4)
            androidx.compose.ui.text.intl.PlatformLocale r6 = r6.getPlatformLocale$ui_text_release()
            java.lang.String r7 = "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale"
            kotlin.jvm.internal.C12775o.m28637g(r6, r7)
            androidx.compose.ui.text.intl.AndroidLocale r6 = (androidx.compose.p002ui.text.intl.AndroidLocale) r6
            java.util.Locale r6 = r6.getJavaLocale()
            if (r6 != 0) goto L_0x0067
        L_0x0063:
            java.util.Locale r6 = java.util.Locale.getDefault()
        L_0x0067:
            int r6 = androidx.core.text.TextUtilsCompat.getLayoutDirectionFromLocale(r6)
            if (r6 == 0) goto L_0x006f
            if (r6 == r5) goto L_0x0026
        L_0x006f:
            return r2
        L_0x0070:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Invalid TextDirection."
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.platform.AndroidParagraphIntrinsics_androidKt.m38206resolveTextDirectionHeuristics9GRLPo0(androidx.compose.ui.text.style.TextDirection, androidx.compose.ui.text.intl.LocaleList):int");
    }

    /* renamed from: resolveTextDirectionHeuristics-9GRLPo0$default  reason: not valid java name */
    public static /* synthetic */ int m38207resolveTextDirectionHeuristics9GRLPo0$default(TextDirection textDirection, LocaleList localeList, int i, Object obj) {
        if ((i & 1) != 0) {
            textDirection = null;
        }
        if ((i & 2) != 0) {
            localeList = null;
        }
        return m38206resolveTextDirectionHeuristics9GRLPo0(textDirection, localeList);
    }
}
