package p063d6;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: d6.a */
public abstract class C7267a implements Parcelable {
    /* renamed from: b */
    public static C7267a m14096b(PendingIntent pendingIntent) {
        return new C7270d(pendingIntent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract PendingIntent mo40832a();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(mo40832a(), 0);
    }
}
