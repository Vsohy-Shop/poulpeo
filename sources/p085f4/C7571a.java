package p085f4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import p242u4.C9882a;
import p242u4.C9883b;

/* renamed from: f4.a */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class C7571a extends C9882a {
    @NonNull
    public static final Parcelable.Creator<C7571a> CREATOR = new C7574d();

    /* renamed from: b */
    final int f10546b;

    /* renamed from: c */
    private int f10547c;

    /* renamed from: d */
    private Bundle f10548d;

    C7571a(int i, int i2, Bundle bundle) {
        this.f10546b = i;
        this.f10547c = i2;
        this.f10548d = bundle;
    }

    /* renamed from: A */
    public int mo41320A() {
        return this.f10547c;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20532l(parcel, 1, this.f10546b);
        C9883b.m20532l(parcel, 2, mo41320A());
        C9883b.m20525e(parcel, 3, this.f10548d, false);
        C9883b.m20522b(parcel, a);
    }
}
