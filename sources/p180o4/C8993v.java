package p180o4;

import android.os.Parcel;
import android.os.Parcelable;
import p242u4.C9882a;
import p242u4.C9883b;

/* renamed from: o4.v */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C8993v extends C9882a {
    public static final Parcelable.Creator<C8993v> CREATOR = new C8994w();

    /* renamed from: b */
    private final boolean f13089b;

    /* renamed from: c */
    private final String f13090c;

    /* renamed from: d */
    private final int f13091d;

    C8993v(boolean z, String str, int i) {
        this.f13089b = z;
        this.f13090c = str;
        this.f13091d = C8992u.m18245a(i) - 1;
    }

    /* renamed from: A */
    public final String mo43166A() {
        return this.f13090c;
    }

    /* renamed from: F */
    public final boolean mo43167F() {
        return this.f13089b;
    }

    /* renamed from: G */
    public final int mo43168G() {
        return C8992u.m18245a(this.f13091d);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20523c(parcel, 1, this.f13089b);
        C9883b.m20539s(parcel, 2, this.f13090c, false);
        C9883b.m20532l(parcel, 3, this.f13091d);
        C9883b.m20522b(parcel, a);
    }
}
