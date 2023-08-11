package androidx.compose.p002ui.text.font;

import android.content.Context;
import android.os.Build;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.font.AndroidFontResolveInterceptor_androidKt */
/* compiled from: AndroidFontResolveInterceptor.android.kt */
public final class AndroidFontResolveInterceptor_androidKt {
    public static final AndroidFontResolveInterceptor AndroidFontResolveInterceptor(Context context) {
        int i;
        C12775o.m28639i(context, "context");
        if (Build.VERSION.SDK_INT >= 31) {
            i = context.getResources().getConfiguration().fontWeightAdjustment;
        } else {
            i = 0;
        }
        return new AndroidFontResolveInterceptor(i);
    }
}
