package p231t4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import p242u4.C9882a;
import p242u4.C9883b;

/* renamed from: t4.r */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C9719r extends C9882a {
    @NonNull
    public static final Parcelable.Creator<C9719r> CREATOR = new C9743z0();

    /* renamed from: b */
    private final int f14525b;

    /* renamed from: c */
    private final boolean f14526c;

    /* renamed from: d */
    private final boolean f14527d;

    /* renamed from: e */
    private final int f14528e;

    /* renamed from: f */
    private final int f14529f;

    public C9719r(int i, boolean z, boolean z2, int i2, int i3) {
        this.f14525b = i;
        this.f14526c = z;
        this.f14527d = z2;
        this.f14528e = i2;
        this.f14529f = i3;
    }

    /* renamed from: A */
    public int mo44242A() {
        return this.f14528e;
    }

    /* renamed from: F */
    public int mo44243F() {
        return this.f14529f;
    }

    /* renamed from: G */
    public boolean mo44244G() {
        return this.f14526c;
    }

    /* renamed from: H */
    public boolean mo44245H() {
        return this.f14527d;
    }

    /* renamed from: I */
    public int mo44246I() {
        return this.f14525b;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20532l(parcel, 1, mo44246I());
        C9883b.m20523c(parcel, 2, mo44244G());
        C9883b.m20523c(parcel, 3, mo44245H());
        C9883b.m20532l(parcel, 4, mo44242A());
        C9883b.m20532l(parcel, 5, mo44243F());
        C9883b.m20522b(parcel, a);
    }
}
