package p085f4;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: f4.b */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C7572b {

    /* renamed from: b */
    static int f10549b = 31;

    /* renamed from: a */
    private int f10550a = 1;

    @NonNull
    /* renamed from: a */
    public C7572b mo41322a(@Nullable Object obj) {
        int i;
        int i2 = f10549b * this.f10550a;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        this.f10550a = i2 + i;
        return this;
    }

    /* renamed from: b */
    public int mo41323b() {
        return this.f10550a;
    }

    @NonNull
    /* renamed from: c */
    public final C7572b mo41324c(boolean z) {
        this.f10550a = (f10549b * this.f10550a) + (z ? 1 : 0);
        return this;
    }
}
