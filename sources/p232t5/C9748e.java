package p232t5;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import p121i5.C8181b;
import p121i5.C8182c;

/* renamed from: t5.e */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class C9748e extends C8181b implements C9749f {
    public C9748e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b3 */
    public final boolean mo42075b3(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 3:
                ConnectionResult connectionResult = (ConnectionResult) C8182c.m16194a(parcel, ConnectionResult.CREATOR);
                C9745b bVar = (C9745b) C8182c.m16194a(parcel, C9745b.CREATOR);
                break;
            case 4:
                Status status = (Status) C8182c.m16194a(parcel, Status.CREATOR);
                break;
            case 6:
                Status status2 = (Status) C8182c.m16194a(parcel, Status.CREATOR);
                break;
            case 7:
                Status status3 = (Status) C8182c.m16194a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) C8182c.m16194a(parcel, GoogleSignInAccount.CREATOR);
                break;
            case 8:
                mo43515b0((C9755l) C8182c.m16194a(parcel, C9755l.CREATOR));
                break;
            case 9:
                C9751h hVar = (C9751h) C8182c.m16194a(parcel, C9751h.CREATOR);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
