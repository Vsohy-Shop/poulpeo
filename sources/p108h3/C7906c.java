package p108h3;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: h3.c */
/* compiled from: Codecs */
public final class C7906c {
    static {
        C7906c.class.getClassLoader();
    }

    private C7906c() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m15524a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m15525b(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
