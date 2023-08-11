package com.google.android.gms.cast.framework.media;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import p242u4.C9882a;
import p242u4.C9883b;

/* renamed from: com.google.android.gms.cast.framework.media.e */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public class C4642e extends C9882a {
    @NonNull
    public static final Parcelable.Creator<C4642e> CREATOR = new C4684w0();

    /* renamed from: b */
    private final String f4682b;

    /* renamed from: c */
    private final int f4683c;

    /* renamed from: d */
    private final String f4684d;

    C4642e(String str, int i, String str2) {
        this.f4682b = str;
        this.f4683c = i;
        this.f4684d = str2;
    }

    @NonNull
    /* renamed from: A */
    public String mo32092A() {
        return this.f4682b;
    }

    @NonNull
    /* renamed from: F */
    public String mo32093F() {
        return this.f4684d;
    }

    /* renamed from: G */
    public int mo32094G() {
        return this.f4683c;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20539s(parcel, 2, mo32092A(), false);
        C9883b.m20532l(parcel, 3, mo32094G());
        C9883b.m20539s(parcel, 4, mo32093F(), false);
        C9883b.m20522b(parcel, a);
    }
}
