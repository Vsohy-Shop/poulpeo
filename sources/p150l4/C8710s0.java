package p150l4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import p231t4.C9705n;
import p242u4.C9882a;
import p242u4.C9883b;

/* renamed from: l4.s0 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C8710s0 extends C9882a {
    public static final Parcelable.Creator<C8710s0> CREATOR = new C8679d();

    /* renamed from: b */
    private final int f12520b;

    /* renamed from: c */
    private final boolean f12521c;

    C8710s0(int i, boolean z) {
        this.f12520b = i;
        this.f12521c = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8710s0)) {
            return false;
        }
        C8710s0 s0Var = (C8710s0) obj;
        if (this.f12520b == s0Var.f12520b && this.f12521c == s0Var.f12521c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C9705n.m20260c(Integer.valueOf(this.f12520b), Boolean.valueOf(this.f12521c));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20532l(parcel, 2, this.f12520b);
        C9883b.m20523c(parcel, 3, this.f12521c);
        C9883b.m20522b(parcel, a);
    }
}
