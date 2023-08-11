package androidx.compose.p002ui.text.font;

import android.graphics.Typeface;
import androidx.compose.p002ui.text.font.TypefaceResult;
import androidx.compose.p002ui.text.platform.AndroidTypeface;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.text.font.PlatformFontFamilyTypefaceAdapter */
/* compiled from: PlatformFontFamilyTypefaceAdapter.android.kt */
public final class PlatformFontFamilyTypefaceAdapter implements FontFamilyTypefaceAdapter {
    private final PlatformTypefaces platformTypefaceResolver = PlatformTypefacesKt.PlatformTypefaces();

    public TypefaceResult resolve(TypefaceRequest typefaceRequest, PlatformFontLoader platformFontLoader, Function1<? super TypefaceResult.Immutable, C11921v> function1, Function1<? super TypefaceRequest, ? extends Object> function12) {
        boolean z;
        Typeface typeface;
        C12775o.m28639i(typefaceRequest, "typefaceRequest");
        C12775o.m28639i(platformFontLoader, "platformFontLoader");
        C12775o.m28639i(function1, "onAsyncCompletion");
        C12775o.m28639i(function12, "createDefaultTypeface");
        FontFamily fontFamily = typefaceRequest.getFontFamily();
        if (fontFamily == null) {
            z = true;
        } else {
            z = fontFamily instanceof DefaultFontFamily;
        }
        if (z) {
            typeface = this.platformTypefaceResolver.m38088createDefaultFO1MlWM(typefaceRequest.getFontWeight(), typefaceRequest.m38114getFontStyle_LCdwA());
        } else if (fontFamily instanceof GenericFontFamily) {
            typeface = this.platformTypefaceResolver.m38089createNamedRetOiIg((GenericFontFamily) typefaceRequest.getFontFamily(), typefaceRequest.getFontWeight(), typefaceRequest.m38114getFontStyle_LCdwA());
        } else if (!(fontFamily instanceof LoadedFontFamily)) {
            return null;
        } else {
            Typeface typeface2 = ((LoadedFontFamily) typefaceRequest.getFontFamily()).getTypeface();
            C12775o.m28637g(typeface2, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidTypeface");
            typeface = ((AndroidTypeface) typeface2).m38216getNativeTypefacePYhJU0U(typefaceRequest.getFontWeight(), typefaceRequest.m38114getFontStyle_LCdwA(), typefaceRequest.m38115getFontSynthesisGVVA2EU());
        }
        return new TypefaceResult.Immutable(typeface, false, 2, (DefaultConstructorMarker) null);
    }
}
