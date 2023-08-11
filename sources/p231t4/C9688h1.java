package p231t4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import p180o4.C8974c;
import p242u4.C9882a;
import p242u4.C9883b;

/* renamed from: t4.h1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C9688h1 extends C9882a {
    public static final Parcelable.Creator<C9688h1> CREATOR = new C9691i1();

    /* renamed from: b */
    Bundle f14470b;

    /* renamed from: c */
    C8974c[] f14471c;

    /* renamed from: d */
    int f14472d;
    @Nullable

    /* renamed from: e */
    C9677e f14473e;

    C9688h1(Bundle bundle, C8974c[] cVarArr, int i, @Nullable C9677e eVar) {
        this.f14470b = bundle;
        this.f14471c = cVarArr;
        this.f14472d = i;
        this.f14473e = eVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20525e(parcel, 1, this.f14470b, false);
        C9883b.m20542v(parcel, 2, this.f14471c, i, false);
        C9883b.m20532l(parcel, 3, this.f14472d);
        C9883b.m20538r(parcel, 4, this.f14473e, i, false);
        C9883b.m20522b(parcel, a);
    }

    public C9688h1() {
    }
}
