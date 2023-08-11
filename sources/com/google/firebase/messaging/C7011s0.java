package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.messaging.C6959b;
import java.util.Map;
import p242u4.C9882a;

/* renamed from: com.google.firebase.messaging.s0 */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
public final class C7011s0 extends C9882a {
    @NonNull
    public static final Parcelable.Creator<C7011s0> CREATOR = new C7013t0();

    /* renamed from: b */
    Bundle f9353b;

    /* renamed from: c */
    private Map<String, String> f9354c;

    public C7011s0(@NonNull Bundle bundle) {
        this.f9353b = bundle;
    }

    @NonNull
    /* renamed from: A */
    public Map<String, String> mo39983A() {
        if (this.f9354c == null) {
            this.f9354c = C6959b.C6960a.m12223a(this.f9353b);
        }
        return this.f9354c;
    }

    @Nullable
    /* renamed from: F */
    public String mo39984F() {
        return this.f9353b.getString("google.to");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo39985G(Intent intent) {
        intent.putExtras(this.f9353b);
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        C7013t0.m12418c(this, parcel, i);
    }
}
