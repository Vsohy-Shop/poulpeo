package androidx.compose.p002ui.text.font;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* renamed from: androidx.compose.ui.text.font.FontFamilyResolverImpl$createDefaultTypeface$1 */
/* compiled from: FontFamilyResolver.kt */
final class FontFamilyResolverImpl$createDefaultTypeface$1 extends C12777p implements Function1<TypefaceRequest, Object> {
    final /* synthetic */ FontFamilyResolverImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FontFamilyResolverImpl$createDefaultTypeface$1(FontFamilyResolverImpl fontFamilyResolverImpl) {
        super(1);
        this.this$0 = fontFamilyResolverImpl;
    }

    public final Object invoke(TypefaceRequest typefaceRequest) {
        C12775o.m28639i(typefaceRequest, "it");
        return this.this$0.resolve(TypefaceRequest.m38110copye1PVR60$default(typefaceRequest, (FontFamily) null, (FontWeight) null, 0, 0, (Object) null, 30, (Object) null)).getValue();
    }
}
