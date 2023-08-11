package p109h4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import p231t4.C9705n;
import p242u4.C9882a;
import p242u4.C9883b;

/* renamed from: h4.l0 */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C7949l0 extends C9882a {
    public static final Parcelable.Creator<C7949l0> CREATOR = new C7951m0();

    /* renamed from: b */
    private final int f11177b;

    public C7949l0() {
        this.f11177b = 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C7949l0) && this.f11177b == ((C7949l0) obj).f11177b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C9705n.m20260c(Integer.valueOf(this.f11177b));
    }

    public final String toString() {
        String str;
        int i = this.f11177b;
        if (i == 0) {
            str = "STRONG";
        } else if (i != 2) {
            str = "UNKNOWN";
        } else {
            str = "INVISIBLE";
        }
        return String.format("joinOptions(connectionType=%s)", new Object[]{str});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20532l(parcel, 2, this.f11177b);
        C9883b.m20522b(parcel, a);
    }

    C7949l0(int i) {
        this.f11177b = i;
    }
}
