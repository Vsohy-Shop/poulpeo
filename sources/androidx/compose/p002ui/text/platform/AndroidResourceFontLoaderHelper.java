package androidx.compose.p002ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.C12775o;

@RequiresApi(26)
/* renamed from: androidx.compose.ui.text.platform.AndroidResourceFontLoaderHelper */
/* compiled from: AndroidFontListTypeface.android.kt */
final class AndroidResourceFontLoaderHelper {
    public static final AndroidResourceFontLoaderHelper INSTANCE = new AndroidResourceFontLoaderHelper();

    private AndroidResourceFontLoaderHelper() {
    }

    @RequiresApi(26)
    @DoNotInline
    public final Typeface create(Context context, int i) {
        C12775o.m28639i(context, "context");
        Typeface a = context.getResources().getFont(i);
        C12775o.m28638h(a, "context.resources.getFont(resourceId)");
        return a;
    }
}
