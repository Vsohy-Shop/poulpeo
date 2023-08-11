package androidx.compose.p002ui.text.font;

import android.content.Context;
import androidx.compose.p002ui.text.font.Font;
import androidx.compose.p002ui.text.font.FontFamily;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt */
/* compiled from: DelegatingFontLoaderForDeprecatedUsage.android.kt */
public final class DelegatingFontLoaderForDeprecatedUsage_androidKt {
    public static final FontFamily.Resolver createFontFamilyResolver(Font.ResourceLoader resourceLoader, Context context) {
        C12775o.m28639i(resourceLoader, "fontResourceLoader");
        C12775o.m28639i(context, "context");
        Context applicationContext = context.getApplicationContext();
        C12775o.m28638h(applicationContext, "context.applicationContext");
        return new FontFamilyResolverImpl(new DelegatingFontLoaderForBridgeUsage(resourceLoader, applicationContext), (PlatformResolveInterceptor) null, (TypefaceRequestCache) null, (FontListFontFamilyTypefaceAdapter) null, (PlatformFontFamilyTypefaceAdapter) null, 30, (DefaultConstructorMarker) null);
    }

    public static final FontFamily.Resolver createFontFamilyResolver(Font.ResourceLoader resourceLoader) {
        C12775o.m28639i(resourceLoader, "fontResourceLoader");
        return new FontFamilyResolverImpl(new DelegatingFontLoaderForDeprecatedUsage(resourceLoader), (PlatformResolveInterceptor) null, (TypefaceRequestCache) null, (FontListFontFamilyTypefaceAdapter) null, (PlatformFontFamilyTypefaceAdapter) null, 30, (DefaultConstructorMarker) null);
    }
}
