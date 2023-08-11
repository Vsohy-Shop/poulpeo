package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.C12775o;

/* compiled from: Icon.kt */
public final class IconKt {
    @RequiresApi(26)
    public static final Icon toAdaptiveIcon(Bitmap bitmap) {
        C12775o.m28639i(bitmap, "<this>");
        Icon a = Icon.createWithAdaptiveBitmap(bitmap);
        C12775o.m28638h(a, "createWithAdaptiveBitmap(this)");
        return a;
    }

    @RequiresApi(26)
    public static final Icon toIcon(Bitmap bitmap) {
        C12775o.m28639i(bitmap, "<this>");
        Icon createWithBitmap = Icon.createWithBitmap(bitmap);
        C12775o.m28638h(createWithBitmap, "createWithBitmap(this)");
        return createWithBitmap;
    }

    @RequiresApi(26)
    public static final Icon toIcon(Uri uri) {
        C12775o.m28639i(uri, "<this>");
        Icon createWithContentUri = Icon.createWithContentUri(uri);
        C12775o.m28638h(createWithContentUri, "createWithContentUri(this)");
        return createWithContentUri;
    }

    @RequiresApi(26)
    public static final Icon toIcon(byte[] bArr) {
        C12775o.m28639i(bArr, "<this>");
        Icon createWithData = Icon.createWithData(bArr, 0, bArr.length);
        C12775o.m28638h(createWithData, "createWithData(this, 0, size)");
        return createWithData;
    }
}
