package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import p242u4.C9883b;

/* renamed from: com.google.firebase.messaging.t0 */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
public class C7013t0 implements Parcelable.Creator<C7011s0> {
    /* renamed from: c */
    static void m12418c(C7011s0 s0Var, Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20525e(parcel, 2, s0Var.f9353b, false);
        C9883b.m20522b(parcel, a);
    }

    @NonNull
    /* renamed from: a */
    public C7011s0 createFromParcel(@NonNull Parcel parcel) {
        int A = SafeParcelReader.m6707A(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < A) {
            int s = SafeParcelReader.m6728s(parcel);
            if (SafeParcelReader.m6721l(s) != 2) {
                SafeParcelReader.m6735z(parcel, s);
            } else {
                bundle = SafeParcelReader.m6710a(parcel, s);
            }
        }
        SafeParcelReader.m6720k(parcel, A);
        return new C7011s0(bundle);
    }

    @NonNull
    /* renamed from: b */
    public C7011s0[] newArray(int i) {
        return new C7011s0[i];
    }
}
