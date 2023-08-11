package androidx.compose.p002ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.util.TypedValue;
import androidx.collection.LruCache;
import androidx.compose.p002ui.text.font.AndroidFont;
import androidx.compose.p002ui.text.font.AndroidPreloadedFont;
import androidx.compose.p002ui.text.font.Font;
import androidx.compose.p002ui.text.font.ResourceFont;
import androidx.core.content.res.ResourcesCompat;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nAndroidFontListTypeface.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFontListTypeface.android.kt\nandroidx/compose/ui/text/platform/AndroidTypefaceCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,174:1\n1#2:175\n*E\n"})
/* renamed from: androidx.compose.ui.text.platform.AndroidTypefaceCache */
/* compiled from: AndroidFontListTypeface.android.kt */
public final class AndroidTypefaceCache {
    public static final AndroidTypefaceCache INSTANCE = new AndroidTypefaceCache();
    private static final LruCache<String, Typeface> cache = new LruCache<>(16);

    private AndroidTypefaceCache() {
    }

    public final String getKey(Context context, Font font) {
        String str;
        C12775o.m28639i(context, "context");
        C12775o.m28639i(font, "font");
        if (font instanceof ResourceFont) {
            TypedValue typedValue = new TypedValue();
            context.getResources().getValue(((ResourceFont) font).getResId(), typedValue, true);
            StringBuilder sb = new StringBuilder();
            sb.append("res:");
            CharSequence charSequence = typedValue.string;
            if (charSequence != null) {
                str = charSequence.toString();
            } else {
                str = null;
            }
            C12775o.m28636f(str);
            sb.append(str);
            return sb.toString();
        } else if (font instanceof AndroidPreloadedFont) {
            return ((AndroidPreloadedFont) font).getCacheKey();
        } else {
            throw new IllegalArgumentException("Unknown font type: " + font);
        }
    }

    public final Typeface getOrCreate(Context context, Font font) {
        Typeface typeface;
        Typeface typeface2;
        C12775o.m28639i(context, "context");
        C12775o.m28639i(font, "font");
        String key = getKey(context, font);
        if (key == null || (typeface2 = cache.get(key)) == null) {
            if (font instanceof ResourceFont) {
                if (Build.VERSION.SDK_INT >= 26) {
                    typeface = AndroidResourceFontLoaderHelper.INSTANCE.create(context, ((ResourceFont) font).getResId());
                } else {
                    typeface = ResourcesCompat.getFont(context, ((ResourceFont) font).getResId());
                    C12775o.m28636f(typeface);
                    C12775o.m28638h(typeface, "{\n                    Re…esId)!!\n                }");
                }
            } else if (font instanceof AndroidFont) {
                AndroidFont androidFont = (AndroidFont) font;
                typeface = androidFont.getTypefaceLoader().loadBlocking(context, androidFont);
            } else {
                throw new IllegalArgumentException("Unknown font type: " + font);
            }
            if (typeface != null) {
                if (key != null) {
                    Typeface put = cache.put(key, typeface);
                }
                return typeface;
            }
            throw new IllegalArgumentException("Unable to load font " + font);
        }
        C12775o.m28638h(typeface2, "it");
        return typeface2;
    }
}
