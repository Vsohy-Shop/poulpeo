package androidx.compose.p002ui.text.font;

import androidx.compose.p002ui.text.font.TypefaceResult;
import kotlin.jvm.functions.Function1;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.text.font.FontFamilyTypefaceAdapter */
/* compiled from: FontFamilyTypefaceAdapter.kt */
public interface FontFamilyTypefaceAdapter {
    TypefaceResult resolve(TypefaceRequest typefaceRequest, PlatformFontLoader platformFontLoader, Function1<? super TypefaceResult.Immutable, C11921v> function1, Function1<? super TypefaceRequest, ? extends Object> function12);
}
