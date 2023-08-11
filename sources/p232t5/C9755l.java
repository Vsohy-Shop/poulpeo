package p232t5;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import p231t4.C9714p0;
import p242u4.C9882a;
import p242u4.C9883b;

/* renamed from: t5.l */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C9755l extends C9882a {
    public static final Parcelable.Creator<C9755l> CREATOR = new C9756m();

    /* renamed from: b */
    final int f14563b;

    /* renamed from: c */
    private final ConnectionResult f14564c;
    @Nullable

    /* renamed from: d */
    private final C9714p0 f14565d;

    C9755l(int i, ConnectionResult connectionResult, @Nullable C9714p0 p0Var) {
        this.f14563b = i;
        this.f14564c = connectionResult;
        this.f14565d = p0Var;
    }

    /* renamed from: A */
    public final ConnectionResult mo44280A() {
        return this.f14564c;
    }

    @Nullable
    /* renamed from: F */
    public final C9714p0 mo44281F() {
        return this.f14565d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20532l(parcel, 1, this.f14563b);
        C9883b.m20538r(parcel, 2, this.f14564c, i, false);
        C9883b.m20538r(parcel, 3, this.f14565d, i, false);
        C9883b.m20522b(parcel, a);
    }
}
