package p086f5;

import android.os.Parcel;

/* renamed from: f5.c */
/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
public final class C7597c {

    /* renamed from: a */
    private static final ClassLoader f10571a = C7597c.class.getClassLoader();

    private C7597c() {
    }

    /* renamed from: a */
    public static void m14955a(Parcel parcel, boolean z) {
        parcel.writeInt(1);
    }

    /* renamed from: b */
    public static boolean m14956b(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }
}
