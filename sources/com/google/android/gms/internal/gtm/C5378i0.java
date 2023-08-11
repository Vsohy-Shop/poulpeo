package com.google.android.gms.internal.gtm;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.gtm.i0 */
public final class C5378i0 implements Parcelable {
    @Deprecated
    public static final Parcelable.Creator<C5378i0> CREATOR = new C5393j0();

    /* renamed from: b */
    private String f6043b;

    /* renamed from: c */
    private String f6044c;

    /* renamed from: d */
    private String f6045d;

    @Deprecated
    public C5378i0() {
    }

    @Deprecated
    C5378i0(Parcel parcel) {
        this.f6043b = parcel.readString();
        this.f6044c = parcel.readString();
        this.f6045d = parcel.readString();
    }

    /* renamed from: a */
    public final String mo33246a() {
        return this.f6043b;
    }

    /* renamed from: b */
    public final String mo33247b() {
        return this.f6045d;
    }

    @Deprecated
    public final int describeContents() {
        return 0;
    }

    @Deprecated
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6043b);
        parcel.writeString(this.f6044c);
        parcel.writeString(this.f6045d);
    }
}
