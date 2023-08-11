package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.google.android.gms.measurement.internal.m3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C6217m3 {
    @NonNull

    /* renamed from: a */
    public final String f7972a;
    @NonNull

    /* renamed from: b */
    public final String f7973b;

    /* renamed from: c */
    public final long f7974c;
    @NonNull

    /* renamed from: d */
    public final Bundle f7975d;

    public C6217m3(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle, long j) {
        this.f7972a = str;
        this.f7973b = str2;
        this.f7975d = bundle;
        this.f7974c = j;
    }

    /* renamed from: b */
    public static C6217m3 m10886b(C6290t tVar) {
        return new C6217m3(tVar.f8229b, tVar.f8231d, tVar.f8230c.mo35270G(), tVar.f8232e);
    }

    /* renamed from: a */
    public final C6290t mo35092a() {
        return new C6290t(this.f7972a, new C6268r(new Bundle(this.f7975d)), this.f7973b, this.f7974c);
    }

    public final String toString() {
        String str = this.f7973b;
        String str2 = this.f7972a;
        String obj = this.f7975d.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + obj.length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(obj);
        return sb.toString();
    }
}
