package p161m5;

import android.os.Parcel;

/* renamed from: m5.c */
/* compiled from: com.google.android.gms:play-services-flags@@17.0.1 */
public final class C8826c {

    /* renamed from: a */
    private static final ClassLoader f12802a = C8826c.class.getClassLoader();

    private C8826c() {
    }

    /* renamed from: a */
    public static void m17888a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: b */
    public static boolean m17889b(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }
}
