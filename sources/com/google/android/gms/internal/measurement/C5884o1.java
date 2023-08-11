package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import p242u4.C9882a;
import p242u4.C9883b;

/* renamed from: com.google.android.gms.internal.measurement.o1 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
public final class C5884o1 extends C9882a {
    public static final Parcelable.Creator<C5884o1> CREATOR = new C5900p1();

    /* renamed from: b */
    public final long f7180b;

    /* renamed from: c */
    public final long f7181c;

    /* renamed from: d */
    public final boolean f7182d;
    @Nullable

    /* renamed from: e */
    public final String f7183e;
    @Nullable

    /* renamed from: f */
    public final String f7184f;
    @Nullable

    /* renamed from: g */
    public final String f7185g;
    @Nullable

    /* renamed from: h */
    public final Bundle f7186h;
    @Nullable

    /* renamed from: i */
    public final String f7187i;

    public C5884o1(long j, long j2, boolean z, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Bundle bundle, @Nullable String str4) {
        this.f7180b = j;
        this.f7181c = j2;
        this.f7182d = z;
        this.f7183e = str;
        this.f7184f = str2;
        this.f7185g = str3;
        this.f7186h = bundle;
        this.f7187i = str4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20535o(parcel, 1, this.f7180b);
        C9883b.m20535o(parcel, 2, this.f7181c);
        C9883b.m20523c(parcel, 3, this.f7182d);
        C9883b.m20539s(parcel, 4, this.f7183e, false);
        C9883b.m20539s(parcel, 5, this.f7184f, false);
        C9883b.m20539s(parcel, 6, this.f7185g, false);
        C9883b.m20525e(parcel, 7, this.f7186h, false);
        C9883b.m20539s(parcel, 8, this.f7187i, false);
        C9883b.m20522b(parcel, a);
    }
}
