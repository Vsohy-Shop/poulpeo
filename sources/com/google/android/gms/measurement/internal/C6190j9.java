package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import p231t4.C9713p;
import p242u4.C9882a;

/* renamed from: com.google.android.gms.measurement.internal.j9 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public final class C6190j9 extends C9882a {
    public static final Parcelable.Creator<C6190j9> CREATOR = new C6201k9();

    /* renamed from: b */
    public final int f7906b;

    /* renamed from: c */
    public final String f7907c;

    /* renamed from: d */
    public final long f7908d;
    @Nullable

    /* renamed from: e */
    public final Long f7909e;
    @Nullable

    /* renamed from: f */
    public final String f7910f;

    /* renamed from: g */
    public final String f7911g;
    @Nullable

    /* renamed from: h */
    public final Double f7912h;

    C6190j9(int i, String str, long j, @Nullable Long l, Float f, @Nullable String str2, String str3, @Nullable Double d) {
        this.f7906b = i;
        this.f7907c = str;
        this.f7908d = j;
        this.f7909e = l;
        if (i == 1) {
            this.f7912h = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.f7912h = d;
        }
        this.f7910f = str2;
        this.f7911g = str3;
    }

    @Nullable
    /* renamed from: A */
    public final Object mo35057A() {
        Long l = this.f7909e;
        if (l != null) {
            return l;
        }
        Double d = this.f7912h;
        if (d != null) {
            return d;
        }
        String str = this.f7910f;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C6201k9.m10854a(this, parcel, i);
    }

    C6190j9(C6212l9 l9Var) {
        this(l9Var.f7962c, l9Var.f7963d, l9Var.f7964e, l9Var.f7961b);
    }

    C6190j9(String str, long j, @Nullable Object obj, String str2) {
        C9713p.m20271f(str);
        this.f7906b = 2;
        this.f7907c = str;
        this.f7908d = j;
        this.f7911g = str2;
        if (obj == null) {
            this.f7909e = null;
            this.f7912h = null;
            this.f7910f = null;
        } else if (obj instanceof Long) {
            this.f7909e = (Long) obj;
            this.f7912h = null;
            this.f7910f = null;
        } else if (obj instanceof String) {
            this.f7909e = null;
            this.f7912h = null;
            this.f7910f = (String) obj;
        } else if (obj instanceof Double) {
            this.f7909e = null;
            this.f7912h = (Double) obj;
            this.f7910f = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
