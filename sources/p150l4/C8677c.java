package p150l4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import p231t4.C9705n;
import p242u4.C9882a;
import p242u4.C9883b;

/* renamed from: l4.c */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C8677c extends C9882a {
    public static final Parcelable.Creator<C8677c> CREATOR = new C8715x();
    @Nullable

    /* renamed from: b */
    private final String f12414b;

    public C8677c() {
        this.f12414b = null;
    }

    @Nullable
    /* renamed from: A */
    public final String mo42763A() {
        return this.f12414b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8677c)) {
            return false;
        }
        return C8673a.m17455n(this.f12414b, ((C8677c) obj).f12414b);
    }

    public final int hashCode() {
        return C9705n.m20260c(this.f12414b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20539s(parcel, 2, this.f12414b, false);
        C9883b.m20522b(parcel, a);
    }

    C8677c(@Nullable String str) {
        this.f12414b = str;
    }
}
