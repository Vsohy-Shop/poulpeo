package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p231t4.C9713p;
import p242u4.C9882a;

/* renamed from: com.google.android.gms.measurement.internal.t */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C6290t extends C9882a {
    public static final Parcelable.Creator<C6290t> CREATOR = new C6301u();

    /* renamed from: b */
    public final String f8229b;

    /* renamed from: c */
    public final C6268r f8230c;

    /* renamed from: d */
    public final String f8231d;

    /* renamed from: e */
    public final long f8232e;

    C6290t(C6290t tVar, long j) {
        C9713p.m20275j(tVar);
        this.f8229b = tVar.f8229b;
        this.f8230c = tVar.f8230c;
        this.f8231d = tVar.f8231d;
        this.f8232e = j;
    }

    public final String toString() {
        String str = this.f8231d;
        String str2 = this.f8229b;
        String valueOf = String.valueOf(this.f8230c);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 21 + String.valueOf(str2).length() + valueOf.length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C6301u.m11118a(this, parcel, i);
    }

    public C6290t(String str, C6268r rVar, String str2, long j) {
        this.f8229b = str;
        this.f8230c = rVar;
        this.f8231d = str2;
        this.f8232e = j;
    }
}
