package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p150l4.C8673a;
import p150l4.C8675b;
import p231t4.C9705n;
import p242u4.C9882a;
import p242u4.C9883b;

/* renamed from: com.google.android.gms.cast.b */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public class C4625b extends C9882a {
    @NonNull
    public static final Parcelable.Creator<C4625b> CREATOR = new C4698m();

    /* renamed from: g */
    private static final C8675b f4561g = new C8675b("AdBreakStatus");

    /* renamed from: b */
    private final long f4562b;

    /* renamed from: c */
    private final long f4563c;
    @Nullable

    /* renamed from: d */
    private final String f4564d;
    @Nullable

    /* renamed from: e */
    private final String f4565e;

    /* renamed from: f */
    private final long f4566f;

    C4625b(long j, long j2, @Nullable String str, @Nullable String str2, long j3) {
        this.f4562b = j;
        this.f4563c = j2;
        this.f4564d = str;
        this.f4565e = str2;
        this.f4566f = j3;
    }

    @Nullable
    /* renamed from: J */
    static C4625b m6018J(@Nullable JSONObject jSONObject) {
        long j;
        if (jSONObject != null && jSONObject.has("currentBreakTime") && jSONObject.has("currentBreakClipTime")) {
            try {
                long e = C8673a.m17446e(jSONObject.getLong("currentBreakTime"));
                long e2 = C8673a.m17446e(jSONObject.getLong("currentBreakClipTime"));
                String c = C8673a.m17444c(jSONObject, "breakId");
                String c2 = C8673a.m17444c(jSONObject, "breakClipId");
                long optLong = jSONObject.optLong("whenSkippable", -1);
                if (optLong != -1) {
                    j = C8673a.m17446e(optLong);
                } else {
                    j = optLong;
                }
                return new C4625b(e, e2, c, c2, j);
            } catch (JSONException e3) {
                f4561g.mo42757d(e3, "Error while creating an AdBreakClipInfo from JSON", new Object[0]);
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: A */
    public String mo31963A() {
        return this.f4565e;
    }

    @Nullable
    /* renamed from: F */
    public String mo31964F() {
        return this.f4564d;
    }

    /* renamed from: G */
    public long mo31965G() {
        return this.f4563c;
    }

    /* renamed from: H */
    public long mo31966H() {
        return this.f4562b;
    }

    /* renamed from: I */
    public long mo31967I() {
        return this.f4566f;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4625b)) {
            return false;
        }
        C4625b bVar = (C4625b) obj;
        if (this.f4562b == bVar.f4562b && this.f4563c == bVar.f4563c && C8673a.m17455n(this.f4564d, bVar.f4564d) && C8673a.m17455n(this.f4565e, bVar.f4565e) && this.f4566f == bVar.f4566f) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C9705n.m20260c(Long.valueOf(this.f4562b), Long.valueOf(this.f4563c), this.f4564d, this.f4565e, Long.valueOf(this.f4566f));
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20535o(parcel, 2, mo31966H());
        C9883b.m20535o(parcel, 3, mo31965G());
        C9883b.m20539s(parcel, 4, mo31964F(), false);
        C9883b.m20539s(parcel, 5, mo31963A(), false);
        C9883b.m20535o(parcel, 6, mo31967I());
        C9883b.m20522b(parcel, a);
    }
}
