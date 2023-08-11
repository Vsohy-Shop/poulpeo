package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p231t4.C9713p;
import p242u4.C9882a;
import p242u4.C9883b;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class Scope extends C9882a implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<Scope> CREATOR = new C4736d();

    /* renamed from: b */
    final int f4887b;

    /* renamed from: c */
    private final String f4888c;

    Scope(int i, String str) {
        C9713p.m20272g(str, "scopeUri must not be null or empty");
        this.f4887b = i;
        this.f4888c = str;
    }

    @NonNull
    /* renamed from: A */
    public String mo32372A() {
        return this.f4888c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f4888c.equals(((Scope) obj).f4888c);
    }

    public int hashCode() {
        return this.f4888c.hashCode();
    }

    @NonNull
    public String toString() {
        return this.f4888c;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20532l(parcel, 1, this.f4887b);
        C9883b.m20539s(parcel, 2, mo32372A(), false);
        C9883b.m20522b(parcel, a);
    }

    public Scope(@NonNull String str) {
        this(1, str);
    }
}
