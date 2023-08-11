package androidx.compose.p002ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.p002ui.text.InternalTextApi;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p355hf.C12079g;

/* renamed from: androidx.compose.ui.text.font.FontFamilyResolver_androidKt */
/* compiled from: FontFamilyResolver.android.kt */
public final class FontFamilyResolver_androidKt {
    public static final FontFamily.Resolver createFontFamilyResolver(Context context) {
        C12775o.m28639i(context, "context");
        return new FontFamilyResolverImpl(new AndroidFontLoader(context), AndroidFontResolveInterceptor_androidKt.AndroidFontResolveInterceptor(context), (TypefaceRequestCache) null, (FontListFontFamilyTypefaceAdapter) null, (PlatformFontFamilyTypefaceAdapter) null, 28, (DefaultConstructorMarker) null);
    }

    @InternalTextApi
    public static final FontFamily.Resolver emptyCacheFontFamilyResolver(Context context) {
        C12775o.m28639i(context, "context");
        return new FontFamilyResolverImpl(new AndroidFontLoader(context), (PlatformResolveInterceptor) null, new TypefaceRequestCache(), new FontListFontFamilyTypefaceAdapter(new AsyncTypefaceCache(), (C12079g) null, 2, (DefaultConstructorMarker) null), (PlatformFontFamilyTypefaceAdapter) null, 18, (DefaultConstructorMarker) null);
    }

    /* renamed from: resolveAsTypeface-Wqqsr6A  reason: not valid java name */
    public static final State<Typeface> m38039resolveAsTypefaceWqqsr6A(FontFamily.Resolver resolver, FontFamily fontFamily, FontWeight fontWeight, int i, int i2) {
        C12775o.m28639i(resolver, "$this$resolveAsTypeface");
        C12775o.m28639i(fontWeight, "fontWeight");
        State<Object> r1 = resolver.m38037resolveDPcqOEQ(fontFamily, fontWeight, i, i2);
        C12775o.m28637g(r1, "null cannot be cast to non-null type androidx.compose.runtime.State<android.graphics.Typeface>");
        return r1;
    }

    /* renamed from: resolveAsTypeface-Wqqsr6A$default  reason: not valid java name */
    public static /* synthetic */ State m38040resolveAsTypefaceWqqsr6A$default(FontFamily.Resolver resolver, FontFamily fontFamily, FontWeight fontWeight, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            fontFamily = null;
        }
        if ((i3 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i3 & 4) != 0) {
            i = FontStyle.Companion.m38068getNormal_LCdwA();
        }
        if ((i3 & 8) != 0) {
            i2 = FontSynthesis.Companion.m38078getAllGVVA2EU();
        }
        return m38039resolveAsTypefaceWqqsr6A(resolver, fontFamily, fontWeight, i, i2);
    }

    public static final FontFamily.Resolver createFontFamilyResolver(Context context, C12079g gVar) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(gVar, "coroutineContext");
        return new FontFamilyResolverImpl(new AndroidFontLoader(context), AndroidFontResolveInterceptor_androidKt.AndroidFontResolveInterceptor(context), FontFamilyResolverKt.getGlobalTypefaceRequestCache(), new FontListFontFamilyTypefaceAdapter(FontFamilyResolverKt.getGlobalAsyncTypefaceCache(), gVar), (PlatformFontFamilyTypefaceAdapter) null, 16, (DefaultConstructorMarker) null);
    }
}
