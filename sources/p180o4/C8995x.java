package p180o4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import p036b5.C2888a;
import p036b5.C2890b;
import p231t4.C9733v1;
import p242u4.C9882a;
import p242u4.C9883b;

/* renamed from: o4.x */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C8995x extends C9882a {
    public static final Parcelable.Creator<C8995x> CREATOR = new C8996y();

    /* renamed from: b */
    private final String f13092b;

    /* renamed from: c */
    private final C8985n f13093c;

    /* renamed from: d */
    private final boolean f13094d;

    /* renamed from: e */
    private final boolean f13095e;

    C8995x(String str, C8985n nVar, boolean z, boolean z2) {
        this.f13092b = str;
        this.f13093c = nVar;
        this.f13094d = z;
        this.f13095e = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20539s(parcel, 1, this.f13092b, false);
        C8985n nVar = this.f13093c;
        if (nVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            nVar = null;
        }
        C9883b.m20531k(parcel, 2, nVar, false);
        C9883b.m20523c(parcel, 3, this.f13094d);
        C9883b.m20523c(parcel, 4, this.f13095e);
        C9883b.m20522b(parcel, a);
    }

    C8995x(String str, IBinder iBinder, boolean z, boolean z2) {
        byte[] bArr;
        this.f13092b = str;
        C8986o oVar = null;
        if (iBinder != null) {
            try {
                C2888a c = C9733v1.m20323G(iBinder).mo43159c();
                if (c == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) C2890b.m2296J(c);
                }
                if (bArr != null) {
                    oVar = new C8986o(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.f13093c = oVar;
        this.f13094d = z;
        this.f13095e = z2;
    }
}
