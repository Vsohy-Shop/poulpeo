package androidx.compose.p002ui.text.font;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$2$1 */
/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
final class FontListFontFamilyTypefaceAdapter$preload$2$1 extends C12777p implements Function1<TypefaceRequest, C11921v> {
    public static final FontListFontFamilyTypefaceAdapter$preload$2$1 INSTANCE = new FontListFontFamilyTypefaceAdapter$preload$2$1();

    FontListFontFamilyTypefaceAdapter$preload$2$1() {
        super(1);
    }

    public final void invoke(TypefaceRequest typefaceRequest) {
        C12775o.m28639i(typefaceRequest, "it");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TypefaceRequest) obj);
        return C11921v.f18618a;
    }
}
