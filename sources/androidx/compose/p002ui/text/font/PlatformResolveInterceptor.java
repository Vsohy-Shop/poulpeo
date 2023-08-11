package androidx.compose.p002ui.text.font;

import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.font.PlatformResolveInterceptor */
/* compiled from: FontFamilyResolver.kt */
public interface PlatformResolveInterceptor {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* renamed from: androidx.compose.ui.text.font.PlatformResolveInterceptor$Companion */
    /* compiled from: FontFamilyResolver.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final PlatformResolveInterceptor Default = new PlatformResolveInterceptor$Companion$Default$1();

        private Companion() {
        }

        public final PlatformResolveInterceptor getDefault$ui_text_release() {
            return Default;
        }
    }

    FontWeight interceptFontWeight(FontWeight fontWeight) {
        C12775o.m28639i(fontWeight, "fontWeight");
        return fontWeight;
    }

    FontFamily interceptFontFamily(FontFamily fontFamily) {
        return fontFamily;
    }

    /* renamed from: interceptFontStyle-T2F_aPo  reason: not valid java name */
    int m38086interceptFontStyleT2F_aPo(int i) {
        return i;
    }

    /* renamed from: interceptFontSynthesis-Mscr08Y  reason: not valid java name */
    int m38087interceptFontSynthesisMscr08Y(int i) {
        return i;
    }
}
