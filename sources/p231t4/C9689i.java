package p231t4;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: t4.i */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C9689i {

    /* renamed from: a */
    private final String f14474a;
    @Nullable

    /* renamed from: b */
    private final String f14475b;

    public C9689i(@NonNull String str) {
        this(str, (String) null);
    }

    public C9689i(@NonNull String str, @Nullable String str2) {
        C9713p.m20276k(str, "log tag cannot be null");
        C9713p.m20268c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f14474a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f14475b = null;
        } else {
            this.f14475b = str2;
        }
    }
}
