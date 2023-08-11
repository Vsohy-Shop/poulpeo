package p085f4;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import p110h5.C7980c;
import p110h5.C7982e;

/* renamed from: f4.u */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public abstract class C7591u extends C7980c implements C7588r {
    public C7591u() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final boolean mo41344E(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 101:
                mo41335a1((GoogleSignInAccount) C7982e.m15685a(parcel, GoogleSignInAccount.CREATOR), (Status) C7982e.m15685a(parcel, Status.CREATOR));
                break;
            case 102:
                mo41334U((Status) C7982e.m15685a(parcel, Status.CREATOR));
                break;
            case 103:
                mo41336w0((Status) C7982e.m15685a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
