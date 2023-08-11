package androidx.compose.p002ui.text;

import androidx.compose.p002ui.text.style.TextDirection;
import androidx.compose.p002ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.TextStyleKt */
/* compiled from: TextStyle.kt */
public final class TextStyleKt {

    /* renamed from: androidx.compose.ui.text.TextStyleKt$WhenMappings */
    /* compiled from: TextStyle.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.ui.unit.LayoutDirection[] r0 = androidx.compose.p002ui.unit.LayoutDirection.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.unit.LayoutDirection r1 = androidx.compose.p002ui.unit.LayoutDirection.Ltr     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.unit.LayoutDirection r1 = androidx.compose.p002ui.unit.LayoutDirection.Rtl     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.TextStyleKt.WhenMappings.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public static final PlatformTextStyle createPlatformTextStyleInternal(PlatformSpanStyle platformSpanStyle, PlatformParagraphStyle platformParagraphStyle) {
        if (platformSpanStyle == null && platformParagraphStyle == null) {
            return null;
        }
        return AndroidTextStyle_androidKt.createPlatformTextStyle(platformSpanStyle, platformParagraphStyle);
    }

    public static final TextStyle lerp(TextStyle textStyle, TextStyle textStyle2, float f) {
        C12775o.m28639i(textStyle, "start");
        C12775o.m28639i(textStyle2, "stop");
        return new TextStyle(SpanStyleKt.lerp(textStyle.toSpanStyle(), textStyle2.toSpanStyle(), f), ParagraphStyleKt.lerp(textStyle.toParagraphStyle(), textStyle2.toParagraphStyle(), f));
    }

    public static final TextStyle resolveDefaults(TextStyle textStyle, LayoutDirection layoutDirection) {
        C12775o.m28639i(textStyle, "style");
        C12775o.m28639i(layoutDirection, "direction");
        return new TextStyle(SpanStyleKt.resolveSpanStyleDefaults(textStyle.getSpanStyle$ui_text_release()), ParagraphStyleKt.resolveParagraphStyleDefaults(textStyle.getParagraphStyle$ui_text_release(), layoutDirection), textStyle.getPlatformStyle());
    }

    /* renamed from: resolveTextDirection-Yj3eThk  reason: not valid java name */
    public static final int m38005resolveTextDirectionYj3eThk(LayoutDirection layoutDirection, TextDirection textDirection) {
        boolean z;
        C12775o.m28639i(layoutDirection, "layoutDirection");
        TextDirection.Companion companion = TextDirection.Companion;
        int r1 = companion.m38361getContents_7Xco();
        if (textDirection == null) {
            z = false;
        } else {
            z = TextDirection.m38357equalsimpl0(textDirection.m38360unboximpl(), r1);
        }
        if (z) {
            int i = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i == 1) {
                return companion.m38362getContentOrLtrs_7Xco();
            }
            if (i == 2) {
                return companion.m38363getContentOrRtls_7Xco();
            }
            throw new NoWhenBranchMatchedException();
        } else if (textDirection != null) {
            return textDirection.m38360unboximpl();
        } else {
            int i2 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i2 == 1) {
                return companion.m38364getLtrs_7Xco();
            }
            if (i2 == 2) {
                return companion.m38365getRtls_7Xco();
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
