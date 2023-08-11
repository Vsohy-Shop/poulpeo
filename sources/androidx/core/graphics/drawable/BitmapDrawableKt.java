package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import kotlin.jvm.internal.C12775o;

/* compiled from: BitmapDrawable.kt */
public final class BitmapDrawableKt {
    public static final BitmapDrawable toDrawable(Bitmap bitmap, Resources resources) {
        C12775o.m28639i(bitmap, "<this>");
        C12775o.m28639i(resources, "resources");
        return new BitmapDrawable(resources, bitmap);
    }
}
