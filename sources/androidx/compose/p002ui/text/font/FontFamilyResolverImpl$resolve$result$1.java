package androidx.compose.p002ui.text.font;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.text.font.FontFamilyResolverImpl$resolve$result$1 */
/* compiled from: FontFamilyResolver.kt */
final class FontFamilyResolverImpl$resolve$result$1 extends C12777p implements Function1<Function1<? super TypefaceResult, ? extends C11921v>, TypefaceResult> {
    final /* synthetic */ TypefaceRequest $typefaceRequest;
    final /* synthetic */ FontFamilyResolverImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FontFamilyResolverImpl$resolve$result$1(FontFamilyResolverImpl fontFamilyResolverImpl, TypefaceRequest typefaceRequest) {
        super(1);
        this.this$0 = fontFamilyResolverImpl;
        this.$typefaceRequest = typefaceRequest;
    }

    public final TypefaceResult invoke(Function1<? super TypefaceResult, C11921v> function1) {
        C12775o.m28639i(function1, "onAsyncCompletion");
        TypefaceResult resolve = this.this$0.fontListFontFamilyTypefaceAdapter.resolve(this.$typefaceRequest, this.this$0.getPlatformFontLoader$ui_text_release(), function1, this.this$0.createDefaultTypeface);
        if (resolve != null || (resolve = this.this$0.platformFamilyTypefaceAdapter.resolve(this.$typefaceRequest, this.this$0.getPlatformFontLoader$ui_text_release(), function1, this.this$0.createDefaultTypeface)) != null) {
            return resolve;
        }
        throw new IllegalStateException("Could not load font");
    }
}
