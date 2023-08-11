package p231t4;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.C4719a;

/* renamed from: t4.w */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C9734w implements C4719a.C4723d {
    @NonNull

    /* renamed from: c */
    public static final C9734w f14544c = m20325a().mo44265a();
    @Nullable

    /* renamed from: b */
    private final String f14545b;

    /* renamed from: t4.w$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static class C9735a {
        @Nullable

        /* renamed from: a */
        private String f14546a;

        /* synthetic */ C9735a(C9740y yVar) {
        }

        @NonNull
        /* renamed from: a */
        public C9734w mo44265a() {
            return new C9734w(this.f14546a, (C9742z) null);
        }
    }

    /* synthetic */ C9734w(String str, C9742z zVar) {
        this.f14545b = str;
    }

    @NonNull
    /* renamed from: a */
    public static C9735a m20325a() {
        return new C9735a((C9740y) null);
    }

    @NonNull
    /* renamed from: b */
    public final Bundle mo44262b() {
        Bundle bundle = new Bundle();
        String str = this.f14545b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9734w)) {
            return false;
        }
        return C9705n.m20259b(this.f14545b, ((C9734w) obj).f14545b);
    }

    public final int hashCode() {
        return C9705n.m20260c(this.f14545b);
    }
}
