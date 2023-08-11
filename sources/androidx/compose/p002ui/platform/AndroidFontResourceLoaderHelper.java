package androidx.compose.p002ui.platform;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.C12775o;

@RequiresApi(26)
/* renamed from: androidx.compose.ui.platform.AndroidFontResourceLoaderHelper */
/* compiled from: AndroidFontResourceLoader.android.kt */
final class AndroidFontResourceLoaderHelper {
    public static final AndroidFontResourceLoaderHelper INSTANCE = new AndroidFontResourceLoaderHelper();

    private AndroidFontResourceLoaderHelper() {
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
