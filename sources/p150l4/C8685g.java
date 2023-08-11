package p150l4;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.cast.C4917g0;
import com.google.android.gms.internal.cast.C5205x;

/* renamed from: l4.g */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public abstract class C8685g extends C5205x implements C8687h {
    public C8685g() {
        super("com.google.android.gms.cast.internal.IBundleCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final boolean mo32147E(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        C4917g0.m6984b(parcel);
        mo42769X1((Bundle) C4917g0.m6983a(parcel, Bundle.CREATOR));
        return true;
    }
}
