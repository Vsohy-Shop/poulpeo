package com.google.android.gms.common.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import p200q4.C9218b;
import p231t4.C9713p;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class AvailabilityException extends Exception {

    /* renamed from: b */
    private final ArrayMap<C9218b<?>, ConnectionResult> f4885b;

    public AvailabilityException(@NonNull ArrayMap<C9218b<?>, ConnectionResult> arrayMap) {
        this.f4885b = arrayMap;
    }

    @NonNull
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (C9218b next : this.f4885b.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) C9713p.m20275j(this.f4885b.get(next));
            z &= !connectionResult.mo32338I();
            String b = next.mo43506b();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 2 + valueOf.length());
            sb.append(b);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
