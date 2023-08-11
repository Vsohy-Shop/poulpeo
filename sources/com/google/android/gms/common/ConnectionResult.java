package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p231t4.C9705n;
import p242u4.C9882a;
import p242u4.C9883b;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class ConnectionResult extends C9882a {
    @NonNull
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new C4787e();
    public static final int SUCCESS = 0;
    @NonNull

    /* renamed from: f */
    public static final ConnectionResult f4869f = new ConnectionResult(0);

    /* renamed from: b */
    final int f4870b;

    /* renamed from: c */
    private final int f4871c;
    @Nullable

    /* renamed from: d */
    private final PendingIntent f4872d;
    @Nullable

    /* renamed from: e */
    private final String f4873e;

    ConnectionResult(int i, int i2, @Nullable PendingIntent pendingIntent, @Nullable String str) {
        this.f4870b = i;
        this.f4871c = i2;
        this.f4872d = pendingIntent;
        this.f4873e = str;
    }

    @NonNull
    /* renamed from: J */
    static String m6369J(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    /* renamed from: A */
    public int mo32334A() {
        return this.f4871c;
    }

    @Nullable
    /* renamed from: F */
    public String mo32335F() {
        return this.f4873e;
    }

    @Nullable
    /* renamed from: G */
    public PendingIntent mo32336G() {
        return this.f4872d;
    }

    /* renamed from: H */
    public boolean mo32337H() {
        if (this.f4871c == 0 || this.f4872d == null) {
            return false;
        }
        return true;
    }

    /* renamed from: I */
    public boolean mo32338I() {
        if (this.f4871c == 0) {
            return true;
        }
        return false;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        if (this.f4871c != connectionResult.f4871c || !C9705n.m20259b(this.f4872d, connectionResult.f4872d) || !C9705n.m20259b(this.f4873e, connectionResult.f4873e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C9705n.m20260c(Integer.valueOf(this.f4871c), this.f4872d, this.f4873e);
    }

    @NonNull
    public String toString() {
        C9705n.C9706a d = C9705n.m20261d(this);
        d.mo44228a("statusCode", m6369J(this.f4871c));
        d.mo44228a("resolution", this.f4872d);
        d.mo44228a("message", this.f4873e);
        return d.toString();
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20532l(parcel, 1, this.f4870b);
        C9883b.m20532l(parcel, 2, mo32334A());
        C9883b.m20538r(parcel, 3, mo32336G(), i, false);
        C9883b.m20539s(parcel, 4, mo32335F(), false);
        C9883b.m20522b(parcel, a);
    }

    public ConnectionResult(int i) {
        this(i, (PendingIntent) null, (String) null);
    }

    public ConnectionResult(int i, @Nullable PendingIntent pendingIntent) {
        this(i, pendingIntent, (String) null);
    }

    public ConnectionResult(int i, @Nullable PendingIntent pendingIntent, @Nullable String str) {
        this(1, i, pendingIntent, str);
    }
}
