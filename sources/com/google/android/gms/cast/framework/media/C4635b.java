package com.google.android.gms.cast.framework.media;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import p242u4.C9882a;
import p242u4.C9883b;

/* renamed from: com.google.android.gms.cast.framework.media.b */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public class C4635b extends C9882a {
    @NonNull
    public static final Parcelable.Creator<C4635b> CREATOR = new C4660k0();

    /* renamed from: b */
    private final int f4658b;

    /* renamed from: c */
    private final int f4659c;

    /* renamed from: d */
    private final int f4660d;

    public C4635b(int i, int i2, int i3) {
        this.f4658b = i;
        this.f4659c = i2;
        this.f4660d = i3;
    }

    /* renamed from: A */
    public int mo32071A() {
        return this.f4660d;
    }

    /* renamed from: F */
    public int mo32072F() {
        return this.f4658b;
    }

    /* renamed from: G */
    public int mo32073G() {
        return this.f4659c;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20532l(parcel, 2, mo32072F());
        C9883b.m20532l(parcel, 3, mo32073G());
        C9883b.m20532l(parcel, 4, mo32071A());
        C9883b.m20522b(parcel, a);
    }
}
