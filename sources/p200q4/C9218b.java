package p200q4;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.C4719a;
import com.google.android.gms.common.api.C4719a.C4723d;
import p231t4.C9705n;

/* renamed from: q4.b */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C9218b<O extends C4719a.C4723d> {

    /* renamed from: a */
    private final int f13539a;

    /* renamed from: b */
    private final C4719a<O> f13540b;
    @Nullable

    /* renamed from: c */
    private final O f13541c;
    @Nullable

    /* renamed from: d */
    private final String f13542d;

    private C9218b(C4719a<O> aVar, @Nullable O o, @Nullable String str) {
        this.f13540b = aVar;
        this.f13541c = o;
        this.f13542d = str;
        this.f13539a = C9705n.m20260c(aVar, o, str);
    }

    @NonNull
    /* renamed from: a */
    public static <O extends C4719a.C4723d> C9218b<O> m18921a(@NonNull C4719a<O> aVar, @Nullable O o, @Nullable String str) {
        return new C9218b<>(aVar, o, str);
    }

    @NonNull
    /* renamed from: b */
    public final String mo43506b() {
        return this.f13540b.mo32390c();
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9218b)) {
            return false;
        }
        C9218b bVar = (C9218b) obj;
        if (!C9705n.m20259b(this.f13540b, bVar.f13540b) || !C9705n.m20259b(this.f13541c, bVar.f13541c) || !C9705n.m20259b(this.f13542d, bVar.f13542d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f13539a;
    }
}
