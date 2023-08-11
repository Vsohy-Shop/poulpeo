package p072e3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: e3.d */
/* compiled from: ShareMedia */
public abstract class C7461d implements Parcelable {

    /* renamed from: b */
    private final Bundle f10348b;

    C7461d(Parcel parcel) {
        this.f10348b = parcel.readBundle();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f10348b);
    }
}
