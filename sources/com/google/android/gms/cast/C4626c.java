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

/* renamed from: com.google.android.gms.cast.c */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public class C4626c extends C9882a {
    @NonNull
    public static final Parcelable.Creator<C4626c> CREATOR = new C4697l();

    /* renamed from: f */
    private static final C8675b f4567f = new C8675b("MediaLiveSeekableRange");

    /* renamed from: b */
    private final long f4568b;

    /* renamed from: c */
    private final long f4569c;

    /* renamed from: d */
    private final boolean f4570d;

    /* renamed from: e */
    private final boolean f4571e;

    C4626c(long j, long j2, boolean z, boolean z2) {
        this.f4568b = Math.max(j, 0);
        this.f4569c = Math.max(j2, 0);
        this.f4570d = z;
        this.f4571e = z2;
    }

    @Nullable
    /* renamed from: I */
    static C4626c m6024I(@Nullable JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("start") && jSONObject.has("end")) {
            try {
                long d = C8673a.m17445d(jSONObject.getDouble("start"));
                double d2 = jSONObject.getDouble("end");
                return new C4626c(d, C8673a.m17445d(d2), jSONObject.optBoolean("isMovingWindow"), jSONObject.optBoolean("isLiveDone"));
            } catch (JSONException unused) {
                f4567f.mo42756c("Ignoring Malformed MediaLiveSeekableRange: ".concat(jSONObject.toString()), new Object[0]);
            }
        }
        return null;
    }

    /* renamed from: A */
    public long mo31971A() {
        return this.f4569c;
    }

    /* renamed from: F */
    public long mo31972F() {
        return this.f4568b;
    }

    /* renamed from: G */
    public boolean mo31973G() {
        return this.f4571e;
    }

    /* renamed from: H */
    public boolean mo31974H() {
        return this.f4570d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4626c)) {
            return false;
        }
        C4626c cVar = (C4626c) obj;
        if (this.f4568b == cVar.f4568b && this.f4569c == cVar.f4569c && this.f4570d == cVar.f4570d && this.f4571e == cVar.f4571e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C9705n.m20260c(Long.valueOf(this.f4568b), Long.valueOf(this.f4569c), Boolean.valueOf(this.f4570d), Boolean.valueOf(this.f4571e));
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20535o(parcel, 2, mo31972F());
        C9883b.m20535o(parcel, 3, mo31971A());
        C9883b.m20523c(parcel, 4, mo31974H());
        C9883b.m20523c(parcel, 5, mo31973G());
        C9883b.m20522b(parcel, a);
    }
}
