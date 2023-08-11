package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p150l4.C8675b;
import p231t4.C9705n;
import p242u4.C9882a;
import p242u4.C9883b;

/* renamed from: com.google.android.gms.cast.i */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public final class C4694i extends C9882a {
    @NonNull
    public static final Parcelable.Creator<C4694i> CREATOR = new C4704s();

    /* renamed from: e */
    private static final C8675b f4840e = new C8675b("VideoInfo");

    /* renamed from: b */
    private int f4841b;

    /* renamed from: c */
    private int f4842c;

    /* renamed from: d */
    private int f4843d;

    C4694i(int i, int i2, int i3) {
        this.f4841b = i;
        this.f4842c = i2;
        this.f4843d = i3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0051  */
    @androidx.annotation.Nullable
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.android.gms.cast.C4694i m6342H(@androidx.annotation.Nullable org.json.JSONObject r8) {
        /*
            r0 = 0
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 0
            java.lang.String r2 = "hdrType"
            java.lang.String r2 = r8.getString(r2)     // Catch:{ JSONException -> 0x007b }
            int r3 = r2.hashCode()     // Catch:{ JSONException -> 0x007b }
            r4 = 3218(0xc92, float:4.51E-42)
            r5 = 3
            r6 = 2
            r7 = 1
            if (r3 == r4) goto L_0x0044
            r4 = 103158(0x192f6, float:1.44555E-40)
            if (r3 == r4) goto L_0x003a
            r4 = 113729(0x1bc41, float:1.59368E-40)
            if (r3 == r4) goto L_0x0030
            r4 = 99136405(0x5e8b395, float:2.1883143E-35)
            if (r3 == r4) goto L_0x0026
            goto L_0x004e
        L_0x0026:
            java.lang.String r3 = "hdr10"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x004e
            r3 = r7
            goto L_0x004f
        L_0x0030:
            java.lang.String r3 = "sdr"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x004e
            r3 = r5
            goto L_0x004f
        L_0x003a:
            java.lang.String r3 = "hdr"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x004e
            r3 = r6
            goto L_0x004f
        L_0x0044:
            java.lang.String r3 = "dv"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x004e
            r3 = r1
            goto L_0x004f
        L_0x004e:
            r3 = -1
        L_0x004f:
            if (r3 == 0) goto L_0x0069
            if (r3 == r7) goto L_0x0068
            if (r3 == r6) goto L_0x0066
            if (r3 == r5) goto L_0x0064
            l4.b r3 = f4840e     // Catch:{ JSONException -> 0x007b }
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch:{ JSONException -> 0x007b }
            r4[r1] = r2     // Catch:{ JSONException -> 0x007b }
            java.lang.String r2 = "Unknown HDR type: %s"
            r3.mo42754a(r2, r4)     // Catch:{ JSONException -> 0x007b }
            r5 = r1
            goto L_0x0069
        L_0x0064:
            r5 = r7
            goto L_0x0069
        L_0x0066:
            r5 = 4
            goto L_0x0069
        L_0x0068:
            r5 = r6
        L_0x0069:
            com.google.android.gms.cast.i r2 = new com.google.android.gms.cast.i     // Catch:{ JSONException -> 0x007b }
            java.lang.String r3 = "width"
            int r3 = r8.getInt(r3)     // Catch:{ JSONException -> 0x007b }
            java.lang.String r4 = "height"
            int r8 = r8.getInt(r4)     // Catch:{ JSONException -> 0x007b }
            r2.<init>(r3, r8, r5)     // Catch:{ JSONException -> 0x007b }
            return r2
        L_0x007b:
            r8 = move-exception
            l4.b r2 = f4840e
            java.lang.String r3 = "Error while creating a VideoInfo instance from JSON"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2.mo42755b(r8, r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.C4694i.m6342H(org.json.JSONObject):com.google.android.gms.cast.i");
    }

    /* renamed from: A */
    public int mo32283A() {
        return this.f4843d;
    }

    /* renamed from: F */
    public int mo32284F() {
        return this.f4842c;
    }

    /* renamed from: G */
    public int mo32285G() {
        return this.f4841b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4694i)) {
            return false;
        }
        C4694i iVar = (C4694i) obj;
        if (this.f4842c == iVar.mo32284F() && this.f4841b == iVar.mo32285G() && this.f4843d == iVar.mo32283A()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C9705n.m20260c(Integer.valueOf(this.f4842c), Integer.valueOf(this.f4841b), Integer.valueOf(this.f4843d));
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20532l(parcel, 2, mo32285G());
        C9883b.m20532l(parcel, 3, mo32284F());
        C9883b.m20532l(parcel, 4, mo32283A());
        C9883b.m20522b(parcel, a);
    }
}
