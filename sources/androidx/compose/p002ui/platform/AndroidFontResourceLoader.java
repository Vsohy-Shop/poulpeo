package androidx.compose.p002ui.platform;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.p002ui.text.font.Font;
import androidx.compose.p002ui.text.font.ResourceFont;
import androidx.core.content.res.ResourcesCompat;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.platform.AndroidFontResourceLoader */
/* compiled from: AndroidFontResourceLoader.android.kt */
public final class AndroidFontResourceLoader implements Font.ResourceLoader {
    private final Context context;

    public AndroidFontResourceLoader(Context context2) {
        C12775o.m28639i(context2, "context");
        this.context = context2;
    }

    public Typeface load(Font font) {
        C12775o.m28639i(font, "font");
        if (!(font instanceof ResourceFont)) {
            throw new IllegalArgumentException("Unknown font type: " + font);
        } else if (Build.VERSION.SDK_INT >= 26) {
            return AndroidFontResourceLoaderHelper.INSTANCE.create(this.context, ((ResourceFont) font).getResId());
        } else {
            Typeface font2 = ResourcesCompat.getFont(this.context, ((ResourceFont) font).getResId());
            C12775o.m28636f(font2);
            C12775o.m28638h(font2, "{\n                    Re…esId)!!\n                }");
            return font2;
        }
    }
}
