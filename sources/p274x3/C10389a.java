package p274x3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p108h3.C7904a;
import p108h3.C7905b;
import p108h3.C7906c;

/* renamed from: x3.a */
/* compiled from: IGetInstallReferrerService */
public interface C10389a extends IInterface {

    /* renamed from: x3.a$a */
    /* compiled from: IGetInstallReferrerService */
    public static abstract class C10390a extends C7905b implements C10389a {

        /* renamed from: x3.a$a$a */
        /* compiled from: IGetInstallReferrerService */
        public static class C10391a extends C7904a implements C10389a {
            C10391a(IBinder iBinder) {
                super(iBinder);
            }

            /* renamed from: o */
            public final Bundle mo45086o(Bundle bundle) {
                Parcel E = mo41638E();
                C7906c.m15525b(E, bundle);
                Parcel G = mo41639G(E);
                Bundle bundle2 = (Bundle) C7906c.m15524a(G, Bundle.CREATOR);
                G.recycle();
                return bundle2;
            }
        }

        /* renamed from: E */
        public static C10389a m21772E(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (queryLocalInterface instanceof C10389a) {
                return (C10389a) queryLocalInterface;
            }
            return new C10391a(iBinder);
        }
    }

    /* renamed from: o */
    Bundle mo45086o(Bundle bundle);
}
