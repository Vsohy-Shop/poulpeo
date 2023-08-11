package p140k4;

import androidx.annotation.Nullable;
import p231t4.C9705n;

/* renamed from: k4.c */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public final class C8561c {

    /* renamed from: a */
    public int f12228a;

    /* renamed from: b */
    public int f12229b;

    /* renamed from: c */
    public int f12230c;

    /* renamed from: d */
    public int f12231d;

    /* renamed from: e */
    public int f12232e;

    /* renamed from: f */
    public boolean f12233f;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8561c)) {
            return false;
        }
        C8561c cVar = (C8561c) obj;
        if (this.f12228a == cVar.f12228a && this.f12229b == cVar.f12229b && this.f12230c == cVar.f12230c && this.f12231d == cVar.f12231d && this.f12232e == cVar.f12232e && this.f12233f == cVar.f12233f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C9705n.m20260c(Integer.valueOf(this.f12228a), Integer.valueOf(this.f12229b), Integer.valueOf(this.f12230c), Integer.valueOf(this.f12231d), Integer.valueOf(this.f12232e), Boolean.valueOf(this.f12233f));
    }
}
