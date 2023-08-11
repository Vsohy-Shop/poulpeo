package p232t5;

import android.os.Parcel;
import android.os.Parcelable;
import p231t4.C9707n0;
import p242u4.C9882a;
import p242u4.C9883b;

/* renamed from: t5.j */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C9753j extends C9882a {
    public static final Parcelable.Creator<C9753j> CREATOR = new C9754k();

    /* renamed from: b */
    final int f14561b;

    /* renamed from: c */
    final C9707n0 f14562c;

    C9753j(int i, C9707n0 n0Var) {
        this.f14561b = i;
        this.f14562c = n0Var;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20532l(parcel, 1, this.f14561b);
        C9883b.m20538r(parcel, 2, this.f14562c, i, false);
        C9883b.m20522b(parcel, a);
    }
}
