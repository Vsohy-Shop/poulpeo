package p286y4;

import android.util.Base64;
import androidx.annotation.NonNull;

/* renamed from: y4.c */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C10669c {
    @NonNull
    /* renamed from: a */
    public static String m22669a(@NonNull byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
