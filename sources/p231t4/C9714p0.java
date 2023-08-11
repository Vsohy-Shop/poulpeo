package p231t4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import p231t4.C9692j;
import p242u4.C9882a;
import p242u4.C9883b;

/* renamed from: t4.p0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C9714p0 extends C9882a {
    public static final Parcelable.Creator<C9714p0> CREATOR = new C9717q0();

    /* renamed from: b */
    final int f14510b;
    @Nullable

    /* renamed from: c */
    final IBinder f14511c;

    /* renamed from: d */
    private final ConnectionResult f14512d;

    /* renamed from: e */
    private final boolean f14513e;

    /* renamed from: f */
    private final boolean f14514f;

    C9714p0(int i, @Nullable IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.f14510b = i;
        this.f14511c = iBinder;
        this.f14512d = connectionResult;
        this.f14513e = z;
        this.f14514f = z2;
    }

    /* renamed from: A */
    public final ConnectionResult mo44234A() {
        return this.f14512d;
    }

    @Nullable
    /* renamed from: F */
    public final C9692j mo44235F() {
        IBinder iBinder = this.f14511c;
        if (iBinder == null) {
            return null;
        }
        return C9692j.C9693a.m20236G(iBinder);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9714p0)) {
            return false;
        }
        C9714p0 p0Var = (C9714p0) obj;
        if (!this.f14512d.equals(p0Var.f14512d) || !C9705n.m20259b(mo44235F(), p0Var.mo44235F())) {
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20532l(parcel, 1, this.f14510b);
        C9883b.m20531k(parcel, 2, this.f14511c, false);
        C9883b.m20538r(parcel, 3, this.f14512d, i, false);
        C9883b.m20523c(parcel, 4, this.f14513e);
        C9883b.m20523c(parcel, 5, this.f14514f);
        C9883b.m20522b(parcel, a);
    }
}
