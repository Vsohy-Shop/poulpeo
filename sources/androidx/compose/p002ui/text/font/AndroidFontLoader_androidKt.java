package androidx.compose.p002ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import androidx.core.content.res.ResourcesCompat;
import kotlin.jvm.internal.C12775o;
import p355hf.C12074d;
import p466yf.C13933b1;
import p466yf.C13970h;

/* renamed from: androidx.compose.ui.text.font.AndroidFontLoader_androidKt */
/* compiled from: AndroidFontLoader.android.kt */
public final class AndroidFontLoader_androidKt {
    /* access modifiers changed from: private */
    public static final Typeface load(ResourceFont resourceFont, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return ResourceFontHelper.INSTANCE.load(context, resourceFont);
        }
        Typeface font = ResourcesCompat.getFont(context, resourceFont.getResId());
        C12775o.m28636f(font);
        C12775o.m28638h(font, "{\n        ResourcesCompa…t(context, resId)!!\n    }");
        return font;
    }

    /* access modifiers changed from: private */
    public static final Object loadAsync(ResourceFont resourceFont, Context context, C12074d<? super Typeface> dVar) {
        return C13970h.m32378g(C13933b1.m32211b(), new AndroidFontLoader_androidKt$loadAsync$2(resourceFont, context, (C12074d<? super AndroidFontLoader_androidKt$loadAsync$2>) null), dVar);
    }
}
