package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p190p4.C9051a;
import p190p4.C9056e;
import p231t4.C9705n;
import p242u4.C9882a;
import p242u4.C9883b;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class Status extends C9882a implements C9056e, ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<Status> CREATOR = new C4737e();
    @NonNull

    /* renamed from: g */
    public static final Status f4889g = new Status(0);
    @NonNull

    /* renamed from: h */
    public static final Status f4890h = new Status(14);
    @NonNull

    /* renamed from: i */
    public static final Status f4891i = new Status(8);
    @NonNull

    /* renamed from: j */
    public static final Status f4892j = new Status(15);
    @NonNull

    /* renamed from: k */
    public static final Status f4893k = new Status(16);
    @NonNull

    /* renamed from: l */
    public static final Status f4894l = new Status(18);
    @NonNull

    /* renamed from: m */
    public static final Status f4895m = new Status(17);

    /* renamed from: b */
    final int f4896b;

    /* renamed from: c */
    private final int f4897c;
    @Nullable

    /* renamed from: d */
    private final String f4898d;
    @Nullable

    /* renamed from: e */
    private final PendingIntent f4899e;
    @Nullable

    /* renamed from: f */
    private final ConnectionResult f4900f;

    Status(int i, int i2, @Nullable String str, @Nullable PendingIntent pendingIntent, @Nullable ConnectionResult connectionResult) {
        this.f4896b = i;
        this.f4897c = i2;
        this.f4898d = str;
        this.f4899e = pendingIntent;
        this.f4900f = connectionResult;
    }

    @Nullable
    /* renamed from: A */
    public ConnectionResult mo32377A() {
        return this.f4900f;
    }

    /* renamed from: F */
    public int mo32378F() {
        return this.f4897c;
    }

    @Nullable
    /* renamed from: G */
    public String mo32379G() {
        return this.f4898d;
    }

    /* renamed from: H */
    public boolean mo32380H() {
        if (this.f4899e != null) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    public boolean mo32381I() {
        if (this.f4897c <= 0) {
            return true;
        }
        return false;
    }

    @NonNull
    /* renamed from: J */
    public final String mo32382J() {
        String str = this.f4898d;
        if (str != null) {
            return str;
        }
        return C9051a.m18386a(this.f4897c);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f4896b != status.f4896b || this.f4897c != status.f4897c || !C9705n.m20259b(this.f4898d, status.f4898d) || !C9705n.m20259b(this.f4899e, status.f4899e) || !C9705n.m20259b(this.f4900f, status.f4900f)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C9705n.m20260c(Integer.valueOf(this.f4896b), Integer.valueOf(this.f4897c), this.f4898d, this.f4899e, this.f4900f);
    }

    @NonNull
    public String toString() {
        C9705n.C9706a d = C9705n.m20261d(this);
        d.mo44228a("statusCode", mo32382J());
        d.mo44228a("resolution", this.f4899e);
        return d.toString();
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20532l(parcel, 1, mo32378F());
        C9883b.m20539s(parcel, 2, mo32379G(), false);
        C9883b.m20538r(parcel, 3, this.f4899e, i, false);
        C9883b.m20538r(parcel, 4, mo32377A(), i, false);
        C9883b.m20532l(parcel, 1000, this.f4896b);
        C9883b.m20522b(parcel, a);
    }

    public Status(int i) {
        this(i, (String) null);
    }

    Status(int i, int i2, @Nullable String str, @Nullable PendingIntent pendingIntent) {
        this(i, i2, str, pendingIntent, (ConnectionResult) null);
    }

    public Status(int i, @Nullable String str) {
        this(1, i, str, (PendingIntent) null);
    }

    public Status(int i, @Nullable String str, @Nullable PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }

    public Status(@NonNull ConnectionResult connectionResult, @NonNull String str) {
        this(connectionResult, str, 17);
    }

    @Deprecated
    public Status(@NonNull ConnectionResult connectionResult, @NonNull String str, int i) {
        this(1, i, str, connectionResult.mo32336G(), connectionResult);
    }

    @NonNull
    public Status getStatus() {
        return this;
    }
}
