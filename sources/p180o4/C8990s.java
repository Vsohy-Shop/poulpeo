package p180o4;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p036b5.C2888a;
import p036b5.C2890b;
import p242u4.C9882a;
import p242u4.C9883b;

/* renamed from: o4.s */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C8990s extends C9882a {
    public static final Parcelable.Creator<C8990s> CREATOR = new C8991t();

    /* renamed from: b */
    private final String f13084b;

    /* renamed from: c */
    private final boolean f13085c;

    /* renamed from: d */
    private final boolean f13086d;

    /* renamed from: e */
    private final Context f13087e;

    /* renamed from: f */
    private final boolean f13088f;

    C8990s(String str, boolean z, boolean z2, IBinder iBinder, boolean z3) {
        this.f13084b = str;
        this.f13085c = z;
        this.f13086d = z2;
        this.f13087e = (Context) C2890b.m2296J(C2888a.C2889a.m2295G(iBinder));
        this.f13088f = z3;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [b5.a, android.os.IBinder] */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20539s(parcel, 1, this.f13084b, false);
        C9883b.m20523c(parcel, 2, this.f13085c);
        C9883b.m20523c(parcel, 3, this.f13086d);
        C9883b.m20531k(parcel, 4, C2890b.m2297b3(this.f13087e), false);
        C9883b.m20523c(parcel, 5, this.f13088f);
        C9883b.m20522b(parcel, a);
    }
}
