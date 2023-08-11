package p037b6;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: b6.c */
public abstract class C2896c extends C2907h0 implements C2898d {
    public C2896c() {
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final boolean mo28419E(int i, Parcel parcel) {
        if (i != 2) {
            return false;
        }
        mo28420b((Bundle) C2909i0.m2326a(parcel, Bundle.CREATOR));
        return true;
    }
}
