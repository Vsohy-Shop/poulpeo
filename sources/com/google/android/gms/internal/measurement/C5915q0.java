package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.q0 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
public final class C5915q0 {

    /* renamed from: a */
    private static final ClassLoader f7297a = C5915q0.class.getClassLoader();

    private C5915q0() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m9775a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static HashMap m9776b(Parcel parcel) {
        return parcel.readHashMap(f7297a);
    }

    /* renamed from: c */
    public static void m9777c(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: d */
    public static void m9778d(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: e */
    public static void m9779e(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder((IBinder) null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    /* renamed from: f */
    public static boolean m9780f(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }
}
