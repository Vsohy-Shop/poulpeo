package androidx.compose.p002ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.p002ui.text.font.AndroidFont;
import androidx.compose.p002ui.text.font.FontLoadingStrategy;
import androidx.compose.p002ui.text.font.FontVariation;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11907m;
import p336ef.C11910n;

@SourceDebugExtension({"SMAP\nAndroidFontLoader.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFontLoader.android.kt\nandroidx/compose/ui/text/font/AndroidFontLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
/* renamed from: androidx.compose.ui.text.font.AndroidFontLoader */
/* compiled from: AndroidFontLoader.android.kt */
public final class AndroidFontLoader implements PlatformFontLoader {
    private final Object cacheKey;
    private final Context context;

    public AndroidFontLoader(Context context2) {
        C12775o.m28639i(context2, "context");
        this.context = context2.getApplicationContext();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object awaitLoad(androidx.compose.p002ui.text.font.Font r7, p355hf.C12074d<? super android.graphics.Typeface> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.p002ui.text.font.AndroidFontLoader$awaitLoad$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 r0 = (androidx.compose.p002ui.text.font.AndroidFontLoader$awaitLoad$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 r0 = new androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            java.lang.String r5 = "context"
            if (r2 == 0) goto L_0x0042
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.lang.Object r7 = r0.L$1
            androidx.compose.ui.text.font.Font r7 = (androidx.compose.p002ui.text.font.Font) r7
            java.lang.Object r0 = r0.L$0
            androidx.compose.ui.text.font.AndroidFontLoader r0 = (androidx.compose.p002ui.text.font.AndroidFontLoader) r0
            p336ef.C11910n.m25701b(r8)
            goto L_0x0078
        L_0x0036:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003e:
            p336ef.C11910n.m25701b(r8)
            goto L_0x005d
        L_0x0042:
            p336ef.C11910n.m25701b(r8)
            boolean r8 = r7 instanceof androidx.compose.p002ui.text.font.AndroidFont
            if (r8 == 0) goto L_0x005e
            androidx.compose.ui.text.font.AndroidFont r7 = (androidx.compose.p002ui.text.font.AndroidFont) r7
            androidx.compose.ui.text.font.AndroidFont$TypefaceLoader r8 = r7.getTypefaceLoader()
            android.content.Context r2 = r6.context
            kotlin.jvm.internal.C12775o.m28638h(r2, r5)
            r0.label = r4
            java.lang.Object r8 = r8.awaitLoad(r2, r7, r0)
            if (r8 != r1) goto L_0x005d
            return r1
        L_0x005d:
            return r8
        L_0x005e:
            boolean r8 = r7 instanceof androidx.compose.p002ui.text.font.ResourceFont
            if (r8 == 0) goto L_0x008a
            r8 = r7
            androidx.compose.ui.text.font.ResourceFont r8 = (androidx.compose.p002ui.text.font.ResourceFont) r8
            android.content.Context r2 = r6.context
            kotlin.jvm.internal.C12775o.m28638h(r2, r5)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r8 = androidx.compose.p002ui.text.font.AndroidFontLoader_androidKt.loadAsync(r8, r2, r0)
            if (r8 != r1) goto L_0x0077
            return r1
        L_0x0077:
            r0 = r6
        L_0x0078:
            android.graphics.Typeface r8 = (android.graphics.Typeface) r8
            androidx.compose.ui.text.font.ResourceFont r7 = (androidx.compose.p002ui.text.font.ResourceFont) r7
            androidx.compose.ui.text.font.FontVariation$Settings r7 = r7.getVariationSettings()
            android.content.Context r0 = r0.context
            kotlin.jvm.internal.C12775o.m28638h(r0, r5)
            android.graphics.Typeface r7 = androidx.compose.p002ui.text.font.PlatformTypefacesKt.setFontVariationSettings(r8, r7, r0)
            return r7
        L_0x008a:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown font type: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.font.AndroidFontLoader.awaitLoad(androidx.compose.ui.text.font.Font, hf.d):java.lang.Object");
    }

    public Object getCacheKey() {
        return this.cacheKey;
    }

    public Typeface loadBlocking(Font font) {
        Typeface typeface;
        Object obj;
        C12775o.m28639i(font, "font");
        if (font instanceof AndroidFont) {
            AndroidFont androidFont = (AndroidFont) font;
            AndroidFont.TypefaceLoader typefaceLoader = androidFont.getTypefaceLoader();
            Context context2 = this.context;
            C12775o.m28638h(context2, "context");
            return typefaceLoader.loadBlocking(context2, androidFont);
        }
        Object obj2 = null;
        if (!(font instanceof ResourceFont)) {
            return null;
        }
        int r0 = font.m38034getLoadingStrategyPKNRLFQ();
        FontLoadingStrategy.Companion companion = FontLoadingStrategy.Companion;
        if (FontLoadingStrategy.m38050equalsimpl0(r0, companion.m38055getBlockingPKNRLFQ())) {
            Context context3 = this.context;
            C12775o.m28638h(context3, "context");
            typeface = AndroidFontLoader_androidKt.load((ResourceFont) font, context3);
        } else if (FontLoadingStrategy.m38050equalsimpl0(r0, companion.m38056getOptionalLocalPKNRLFQ())) {
            try {
                C11907m.C11908a aVar = C11907m.f18600b;
                Context context4 = this.context;
                C12775o.m28638h(context4, "context");
                obj = C11907m.m25696a(AndroidFontLoader_androidKt.load((ResourceFont) font, context4));
            } catch (Throwable th) {
                C11907m.C11908a aVar2 = C11907m.f18600b;
                obj = C11907m.m25696a(C11910n.m25700a(th));
            }
            if (!C11907m.m25698c(obj)) {
                obj2 = obj;
            }
            typeface = (Typeface) obj2;
        } else if (FontLoadingStrategy.m38050equalsimpl0(r0, companion.m38054getAsyncPKNRLFQ())) {
            throw new UnsupportedOperationException("Unsupported Async font load path");
        } else {
            throw new IllegalArgumentException("Unknown loading type " + FontLoadingStrategy.m38052toStringimpl(font.m38034getLoadingStrategyPKNRLFQ()));
        }
        FontVariation.Settings variationSettings = ((ResourceFont) font).getVariationSettings();
        Context context5 = this.context;
        C12775o.m28638h(context5, "context");
        return PlatformTypefacesKt.setFontVariationSettings(typeface, variationSettings, context5);
    }
}
