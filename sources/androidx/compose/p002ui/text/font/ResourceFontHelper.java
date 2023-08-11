package androidx.compose.p002ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.C12775o;

@RequiresApi(26)
/* renamed from: androidx.compose.ui.text.font.ResourceFontHelper */
/* compiled from: AndroidFontLoader.android.kt */
final class ResourceFontHelper {
    public static final ResourceFontHelper INSTANCE = new ResourceFontHelper();

    private ResourceFontHelper() {
    }

    @DoNotInline
    public final Typeface load(Context context, ResourceFont resourceFont) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(resourceFont, "font");
        Typeface a = context.getResources().getFont(resourceFont.getResId());
        C12775o.m28638h(a, "context.resources.getFont(font.resId)");
        return a;
    }
}
