package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.List;
import p231t4.C9713p;
import p242u4.C9882a;
import p242u4.C9883b;

/* renamed from: com.google.android.gms.measurement.internal.s9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C6289s9 extends C9882a {
    public static final Parcelable.Creator<C6289s9> CREATOR = new C6300t9();
    @Nullable

    /* renamed from: b */
    public final String f8207b;
    @Nullable

    /* renamed from: c */
    public final String f8208c;
    @Nullable

    /* renamed from: d */
    public final String f8209d;
    @Nullable

    /* renamed from: e */
    public final String f8210e;

    /* renamed from: f */
    public final long f8211f;

    /* renamed from: g */
    public final long f8212g;
    @Nullable

    /* renamed from: h */
    public final String f8213h;

    /* renamed from: i */
    public final boolean f8214i;

    /* renamed from: j */
    public final boolean f8215j;

    /* renamed from: k */
    public final long f8216k;
    @Nullable

    /* renamed from: l */
    public final String f8217l;

    /* renamed from: m */
    public final long f8218m;

    /* renamed from: n */
    public final long f8219n;

    /* renamed from: o */
    public final int f8220o;

    /* renamed from: p */
    public final boolean f8221p;

    /* renamed from: q */
    public final boolean f8222q;
    @Nullable

    /* renamed from: r */
    public final String f8223r;
    @Nullable

    /* renamed from: s */
    public final Boolean f8224s;

    /* renamed from: t */
    public final long f8225t;
    @Nullable

    /* renamed from: u */
    public final List<String> f8226u;
    @Nullable

    /* renamed from: v */
    public final String f8227v;

    /* renamed from: w */
    public final String f8228w;

    C6289s9(@Nullable String str, @Nullable String str2, @Nullable String str3, long j, @Nullable String str4, long j2, long j3, @Nullable String str5, boolean z, boolean z2, @Nullable String str6, long j4, long j5, int i, boolean z3, boolean z4, @Nullable String str7, @Nullable Boolean bool, long j6, @Nullable List<String> list, @Nullable String str8, String str9) {
        C9713p.m20271f(str);
        this.f8207b = str;
        this.f8208c = true != TextUtils.isEmpty(str2) ? str2 : null;
        this.f8209d = str3;
        this.f8216k = j;
        this.f8210e = str4;
        this.f8211f = j2;
        this.f8212g = j3;
        this.f8213h = str5;
        this.f8214i = z;
        this.f8215j = z2;
        this.f8217l = str6;
        this.f8218m = j4;
        this.f8219n = j5;
        this.f8220o = i;
        this.f8221p = z3;
        this.f8222q = z4;
        this.f8223r = str7;
        this.f8224s = bool;
        this.f8225t = j6;
        this.f8226u = list;
        this.f8227v = str8;
        this.f8228w = str9;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20539s(parcel, 2, this.f8207b, false);
        C9883b.m20539s(parcel, 3, this.f8208c, false);
        C9883b.m20539s(parcel, 4, this.f8209d, false);
        C9883b.m20539s(parcel, 5, this.f8210e, false);
        C9883b.m20535o(parcel, 6, this.f8211f);
        C9883b.m20535o(parcel, 7, this.f8212g);
        C9883b.m20539s(parcel, 8, this.f8213h, false);
        C9883b.m20523c(parcel, 9, this.f8214i);
        C9883b.m20523c(parcel, 10, this.f8215j);
        C9883b.m20535o(parcel, 11, this.f8216k);
        C9883b.m20539s(parcel, 12, this.f8217l, false);
        C9883b.m20535o(parcel, 13, this.f8218m);
        C9883b.m20535o(parcel, 14, this.f8219n);
        C9883b.m20532l(parcel, 15, this.f8220o);
        C9883b.m20523c(parcel, 16, this.f8221p);
        C9883b.m20523c(parcel, 18, this.f8222q);
        C9883b.m20539s(parcel, 19, this.f8223r, false);
        C9883b.m20524d(parcel, 21, this.f8224s, false);
        C9883b.m20535o(parcel, 22, this.f8225t);
        C9883b.m20541u(parcel, 23, this.f8226u, false);
        C9883b.m20539s(parcel, 24, this.f8227v, false);
        C9883b.m20539s(parcel, 25, this.f8228w, false);
        C9883b.m20522b(parcel, a);
    }

    C6289s9(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, long j, long j2, @Nullable String str5, boolean z, boolean z2, long j3, @Nullable String str6, long j4, long j5, int i, boolean z3, boolean z4, @Nullable String str7, @Nullable Boolean bool, long j6, @Nullable List<String> list, @Nullable String str8, String str9) {
        this.f8207b = str;
        this.f8208c = str2;
        this.f8209d = str3;
        this.f8216k = j3;
        this.f8210e = str4;
        this.f8211f = j;
        this.f8212g = j2;
        this.f8213h = str5;
        this.f8214i = z;
        this.f8215j = z2;
        this.f8217l = str6;
        this.f8218m = j4;
        this.f8219n = j5;
        this.f8220o = i;
        this.f8221p = z3;
        this.f8222q = z4;
        this.f8223r = str7;
        this.f8224s = bool;
        this.f8225t = j6;
        this.f8226u = list;
        this.f8227v = str8;
        this.f8228w = str9;
    }
}
