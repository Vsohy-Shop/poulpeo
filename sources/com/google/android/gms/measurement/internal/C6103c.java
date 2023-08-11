package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import p231t4.C9713p;
import p242u4.C9882a;
import p242u4.C9883b;

/* renamed from: com.google.android.gms.measurement.internal.c */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C6103c extends C9882a {
    public static final Parcelable.Creator<C6103c> CREATOR = new C6114d();
    @Nullable

    /* renamed from: b */
    public String f7652b;

    /* renamed from: c */
    public String f7653c;

    /* renamed from: d */
    public C6190j9 f7654d;

    /* renamed from: e */
    public long f7655e;

    /* renamed from: f */
    public boolean f7656f;
    @Nullable

    /* renamed from: g */
    public String f7657g;
    @Nullable

    /* renamed from: h */
    public final C6290t f7658h;

    /* renamed from: i */
    public long f7659i;
    @Nullable

    /* renamed from: j */
    public C6290t f7660j;

    /* renamed from: k */
    public final long f7661k;
    @Nullable

    /* renamed from: l */
    public final C6290t f7662l;

    C6103c(C6103c cVar) {
        C9713p.m20275j(cVar);
        this.f7652b = cVar.f7652b;
        this.f7653c = cVar.f7653c;
        this.f7654d = cVar.f7654d;
        this.f7655e = cVar.f7655e;
        this.f7656f = cVar.f7656f;
        this.f7657g = cVar.f7657g;
        this.f7658h = cVar.f7658h;
        this.f7659i = cVar.f7659i;
        this.f7660j = cVar.f7660j;
        this.f7661k = cVar.f7661k;
        this.f7662l = cVar.f7662l;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20539s(parcel, 2, this.f7652b, false);
        C9883b.m20539s(parcel, 3, this.f7653c, false);
        C9883b.m20538r(parcel, 4, this.f7654d, i, false);
        C9883b.m20535o(parcel, 5, this.f7655e);
        C9883b.m20523c(parcel, 6, this.f7656f);
        C9883b.m20539s(parcel, 7, this.f7657g, false);
        C9883b.m20538r(parcel, 8, this.f7658h, i, false);
        C9883b.m20535o(parcel, 9, this.f7659i);
        C9883b.m20538r(parcel, 10, this.f7660j, i, false);
        C9883b.m20535o(parcel, 11, this.f7661k);
        C9883b.m20538r(parcel, 12, this.f7662l, i, false);
        C9883b.m20522b(parcel, a);
    }

    C6103c(@Nullable String str, String str2, C6190j9 j9Var, long j, boolean z, @Nullable String str3, @Nullable C6290t tVar, long j2, @Nullable C6290t tVar2, long j3, @Nullable C6290t tVar3) {
        this.f7652b = str;
        this.f7653c = str2;
        this.f7654d = j9Var;
        this.f7655e = j;
        this.f7656f = z;
        this.f7657g = str3;
        this.f7658h = tVar;
        this.f7659i = j2;
        this.f7660j = tVar2;
        this.f7661k = j3;
        this.f7662l = tVar3;
    }
}
