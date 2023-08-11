package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import p242u4.C9882a;
import p242u4.C9883b;

/* renamed from: com.google.android.gms.measurement.internal.r */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C6268r extends C9882a implements Iterable<String> {
    public static final Parcelable.Creator<C6268r> CREATOR = new C6279s();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Bundle f8162b;

    C6268r(Bundle bundle) {
        this.f8162b = bundle;
    }

    /* renamed from: A */
    public final int mo35269A() {
        return this.f8162b.size();
    }

    /* renamed from: G */
    public final Bundle mo35270G() {
        return new Bundle(this.f8162b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final Double mo35271H(String str) {
        return Double.valueOf(this.f8162b.getDouble("value"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final Long mo35272I(String str) {
        return Long.valueOf(this.f8162b.getLong("value"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final Object mo35273J(String str) {
        return this.f8162b.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final String mo35274K(String str) {
        return this.f8162b.getString(str);
    }

    public final Iterator<String> iterator() {
        return new C6257q(this);
    }

    public final String toString() {
        return this.f8162b.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20525e(parcel, 2, mo35270G(), false);
        C9883b.m20522b(parcel, a);
    }
}
