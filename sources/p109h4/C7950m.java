package p109h4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import p231t4.C9705n;
import p242u4.C9882a;
import p242u4.C9883b;

/* renamed from: h4.m */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C7950m extends C9882a {
    public static final Parcelable.Creator<C7950m> CREATOR = new C7952n();

    /* renamed from: b */
    private final float f11178b;

    /* renamed from: c */
    private final float f11179c;

    /* renamed from: d */
    private final float f11180d;

    public C7950m(float f, float f2, float f3) {
        this.f11178b = f;
        this.f11179c = f2;
        this.f11180d = f3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7950m)) {
            return false;
        }
        C7950m mVar = (C7950m) obj;
        if (this.f11178b == mVar.f11178b && this.f11179c == mVar.f11179c && this.f11180d == mVar.f11180d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C9705n.m20260c(Float.valueOf(this.f11178b), Float.valueOf(this.f11179c), Float.valueOf(this.f11180d));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20529i(parcel, 2, this.f11178b);
        C9883b.m20529i(parcel, 3, this.f11179c);
        C9883b.m20529i(parcel, 4, this.f11180d);
        C9883b.m20522b(parcel, a);
    }
}
