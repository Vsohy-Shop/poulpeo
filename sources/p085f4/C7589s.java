package p085f4;

import android.os.Parcel;
import p110h5.C7980c;

/* renamed from: f4.s */
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public abstract class C7589s extends C7980c implements C7586p {
    public C7589s() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final boolean mo41344E(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo41339h();
        } else if (i != 2) {
            return false;
        } else {
            mo41340j();
        }
        return true;
    }
}
