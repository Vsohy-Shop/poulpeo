package androidx.compose.p002ui.text.font;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* renamed from: androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2 */
/* compiled from: FontFamilyResolver.kt */
final class FontFamilyResolverImpl$preload$2 extends C12777p implements Function1<TypefaceRequest, TypefaceResult> {
    final /* synthetic */ FontFamilyResolverImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FontFamilyResolverImpl$preload$2(FontFamilyResolverImpl fontFamilyResolverImpl) {
        super(1);
        this.this$0 = fontFamilyResolverImpl;
    }

    public final TypefaceResult invoke(TypefaceRequest typefaceRequest) {
        C12775o.m28639i(typefaceRequest, "typeRequest");
        TypefaceResult resolve = this.this$0.fontListFontFamilyTypefaceAdapter.resolve(typefaceRequest, this.this$0.getPlatformFontLoader$ui_text_release(), C12181.INSTANCE, this.this$0.createDefaultTypeface);
        if (resolve != null || (resolve = this.this$0.platformFamilyTypefaceAdapter.resolve(typefaceRequest, this.this$0.getPlatformFontLoader$ui_text_release(), C12192.INSTANCE, this.this$0.createDefaultTypeface)) != null) {
            return resolve;
        }
        throw new IllegalStateException("Could not load font");
    }
}
