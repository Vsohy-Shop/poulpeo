package p037b6;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: b6.i0 */
public final class C2909i0 {
    static {
        C2909i0.class.getClassLoader();
    }

    private C2909i0() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m2326a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.os.IInterface, android.os.IBinder] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m2327b(android.os.Parcel r0, android.os.IInterface r1) {
        /*
            r0.writeStrongBinder(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p037b6.C2909i0.m2327b(android.os.Parcel, android.os.IInterface):void");
    }

    /* renamed from: c */
    public static void m2328c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
