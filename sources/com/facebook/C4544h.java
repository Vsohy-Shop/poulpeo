package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import p198q2.C9144e0;
import p454wf.C13726d;

/* renamed from: com.facebook.h */
/* compiled from: AuthenticationTokenHeader.kt */
public final class C4544h implements Parcelable {
    public static final C4545a CREATOR = new C4545a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final String f4208b;

    /* renamed from: c */
    private final String f4209c;

    /* renamed from: d */
    private final String f4210d;

    /* renamed from: com.facebook.h$a */
    /* compiled from: AuthenticationTokenHeader.kt */
    public static final class C4545a implements Parcelable.Creator<C4544h> {
        private C4545a() {
        }

        public /* synthetic */ C4545a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public C4544h createFromParcel(Parcel parcel) {
            C12775o.m28639i(parcel, "parcel");
            return new C4544h(parcel);
        }

        /* renamed from: b */
        public C4544h[] newArray(int i) {
            return new C4544h[i];
        }
    }

    public C4544h(String str) {
        C12775o.m28639i(str, "encodedHeaderString");
        if (m5599b(str)) {
            byte[] decode = Base64.decode(str, 0);
            C12775o.m28638h(decode, "decodedBytes");
            JSONObject jSONObject = new JSONObject(new String(decode, C13726d.f22152b));
            String string = jSONObject.getString("alg");
            C12775o.m28638h(string, "jsonObj.getString(\"alg\")");
            this.f4208b = string;
            String string2 = jSONObject.getString("typ");
            C12775o.m28638h(string2, "jsonObj.getString(\"typ\")");
            this.f4209c = string2;
            String string3 = jSONObject.getString("kid");
            C12775o.m28638h(string3, "jsonObj.getString(\"kid\")");
            this.f4210d = string3;
            return;
        }
        throw new IllegalArgumentException("Invalid Header".toString());
    }

    /* renamed from: b */
    private final boolean m5599b(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C9144e0.m18688g(str, "encodedHeaderString");
        byte[] decode = Base64.decode(str, 0);
        C12775o.m28638h(decode, "decodedBytes");
        try {
            JSONObject jSONObject = new JSONObject(new String(decode, C13726d.f22152b));
            String optString = jSONObject.optString("alg");
            C12775o.m28638h(optString, "alg");
            if (optString.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z || !C12775o.m28634d(optString, "RS256")) {
                z2 = false;
            } else {
                z2 = true;
            }
            String optString2 = jSONObject.optString("kid");
            C12775o.m28638h(optString2, "jsonObj.optString(\"kid\")");
            if (optString2.length() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            String optString3 = jSONObject.optString("typ");
            C12775o.m28638h(optString3, "jsonObj.optString(\"typ\")");
            if (optString3.length() > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z2 || !z3 || !z4) {
                return false;
            }
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final String mo31577a() {
        return this.f4210d;
    }

    @VisibleForTesting(otherwise = 2)
    /* renamed from: c */
    public final JSONObject mo31578c() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", this.f4208b);
        jSONObject.put("typ", this.f4209c);
        jSONObject.put("kid", this.f4210d);
        return jSONObject;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        String jSONObject = mo31578c().toString();
        C12775o.m28638h(jSONObject, "headerJsonObject.toString()");
        return jSONObject;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C12775o.m28639i(parcel, "dest");
        parcel.writeString(this.f4208b);
        parcel.writeString(this.f4209c);
        parcel.writeString(this.f4210d);
    }

    public C4544h(Parcel parcel) {
        C12775o.m28639i(parcel, "parcel");
        String readString = parcel.readString();
        C9144e0.m18692k(readString, "alg");
        if (readString != null) {
            this.f4208b = readString;
            String readString2 = parcel.readString();
            C9144e0.m18692k(readString2, "typ");
            if (readString2 != null) {
                this.f4209c = readString2;
                String readString3 = parcel.readString();
                C9144e0.m18692k(readString3, "kid");
                if (readString3 != null) {
                    this.f4210d = readString3;
                    return;
                }
                throw new IllegalStateException("Required value was null.".toString());
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
