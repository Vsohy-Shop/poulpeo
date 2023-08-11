package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.rmn.apiclient.impl.api.call.APIParams;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C12770k0;
import kotlin.jvm.internal.C12774n;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;
import p198q2.C9138d0;
import p198q2.C9144e0;
import p454wf.C13726d;

/* renamed from: com.facebook.g */
/* compiled from: AuthenticationTokenClaims.kt */
public final class C4541g implements Parcelable {
    public static final Parcelable.Creator<C4541g> CREATOR = new C4542a();

    /* renamed from: v */
    public static final C4543b f4187v = new C4543b((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final String f4188b;

    /* renamed from: c */
    private final String f4189c;

    /* renamed from: d */
    private final String f4190d;

    /* renamed from: e */
    private final String f4191e;

    /* renamed from: f */
    private final long f4192f;

    /* renamed from: g */
    private final long f4193g;

    /* renamed from: h */
    private final String f4194h;

    /* renamed from: i */
    private final String f4195i;

    /* renamed from: j */
    private final String f4196j;

    /* renamed from: k */
    private final String f4197k;

    /* renamed from: l */
    private final String f4198l;

    /* renamed from: m */
    private final String f4199m;

    /* renamed from: n */
    private final String f4200n;

    /* renamed from: o */
    private final Set<String> f4201o;

    /* renamed from: p */
    private final String f4202p;

    /* renamed from: q */
    private final Map<String, Integer> f4203q;

    /* renamed from: r */
    private final Map<String, String> f4204r;

    /* renamed from: s */
    private final Map<String, String> f4205s;

    /* renamed from: t */
    private final String f4206t;

    /* renamed from: u */
    private final String f4207u;

    /* renamed from: com.facebook.g$a */
    /* compiled from: AuthenticationTokenClaims.kt */
    public static final class C4542a implements Parcelable.Creator<C4541g> {
        C4542a() {
        }

        /* renamed from: a */
        public C4541g createFromParcel(Parcel parcel) {
            C12775o.m28639i(parcel, APIParams.SOURCE);
            return new C4541g(parcel);
        }

        /* renamed from: b */
        public C4541g[] newArray(int i) {
            return new C4541g[i];
        }
    }

    /* renamed from: com.facebook.g$b */
    /* compiled from: AuthenticationTokenClaims.kt */
    public static final class C4543b {
        private C4543b() {
        }

        public /* synthetic */ C4543b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C4541g(String str, String str2) {
        Set<String> set;
        Map<String, Integer> map;
        Map<String, String> map2;
        C12775o.m28639i(str, "encodedClaims");
        C12775o.m28639i(str2, "expectedNonce");
        C9144e0.m18688g(str, "encodedClaims");
        byte[] decode = Base64.decode(str, 0);
        C12775o.m28638h(decode, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(decode, C13726d.f22152b));
        if (m5595b(jSONObject, str2)) {
            String string = jSONObject.getString("jti");
            C12775o.m28638h(string, "jsonObj.getString(\"jti\")");
            this.f4188b = string;
            String string2 = jSONObject.getString("iss");
            C12775o.m28638h(string2, "jsonObj.getString(\"iss\")");
            this.f4189c = string2;
            String string3 = jSONObject.getString("aud");
            C12775o.m28638h(string3, "jsonObj.getString(\"aud\")");
            this.f4190d = string3;
            String string4 = jSONObject.getString("nonce");
            C12775o.m28638h(string4, "jsonObj.getString(\"nonce\")");
            this.f4191e = string4;
            this.f4192f = jSONObject.getLong("exp");
            this.f4193g = jSONObject.getLong("iat");
            String string5 = jSONObject.getString("sub");
            C12775o.m28638h(string5, "jsonObj.getString(\"sub\")");
            this.f4194h = string5;
            this.f4195i = m5594a(jSONObject, HintConstants.AUTOFILL_HINT_NAME);
            this.f4196j = m5594a(jSONObject, "givenName");
            this.f4197k = m5594a(jSONObject, "middleName");
            this.f4198l = m5594a(jSONObject, "familyName");
            this.f4199m = m5594a(jSONObject, NotificationCompat.CATEGORY_EMAIL);
            this.f4200n = m5594a(jSONObject, "picture");
            JSONArray optJSONArray = jSONObject.optJSONArray("userFriends");
            Map<String, String> map3 = null;
            if (optJSONArray == null) {
                set = null;
            } else {
                set = Collections.unmodifiableSet(C9138d0.m18621W(optJSONArray));
            }
            this.f4201o = set;
            this.f4202p = m5594a(jSONObject, "userBirthday");
            JSONObject optJSONObject = jSONObject.optJSONObject("userAgeRange");
            if (optJSONObject == null) {
                map = null;
            } else {
                map = Collections.unmodifiableMap(C9138d0.m18645k(optJSONObject));
            }
            this.f4203q = map;
            JSONObject optJSONObject2 = jSONObject.optJSONObject("userHometown");
            if (optJSONObject2 == null) {
                map2 = null;
            } else {
                map2 = Collections.unmodifiableMap(C9138d0.m18647l(optJSONObject2));
            }
            this.f4204r = map2;
            JSONObject optJSONObject3 = jSONObject.optJSONObject("userLocation");
            this.f4205s = optJSONObject3 != null ? Collections.unmodifiableMap(C9138d0.m18647l(optJSONObject3)) : map3;
            this.f4206t = m5594a(jSONObject, "userGender");
            this.f4207u = m5594a(jSONObject, "userLink");
            return;
        }
        throw new IllegalArgumentException("Invalid claims".toString());
    }

    /* renamed from: a */
    private final String m5594a(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    /* renamed from: b */
    private final boolean m5595b(JSONObject jSONObject, String str) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (jSONObject == null) {
            return false;
        }
        String optString = jSONObject.optString("jti");
        C12775o.m28638h(optString, "jti");
        if (optString.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        try {
            String optString2 = jSONObject.optString("iss");
            C12775o.m28638h(optString2, "iss");
            if (optString2.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2 && !(!C12775o.m28634d(new URL(optString2).getHost(), FacebookSdk.FACEBOOK_COM))) {
                String optString3 = jSONObject.optString("aud");
                C12775o.m28638h(optString3, "aud");
                if (optString3.length() == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3 && !(!C12775o.m28634d(optString3, FacebookSdk.getApplicationId()))) {
                    long j = (long) 1000;
                    if (new Date().after(new Date(jSONObject.optLong("exp") * j))) {
                        return false;
                    }
                    if (new Date().after(new Date((jSONObject.optLong("iat") * j) + 600000))) {
                        return false;
                    }
                    String optString4 = jSONObject.optString("sub");
                    C12775o.m28638h(optString4, "sub");
                    if (optString4.length() == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        return false;
                    }
                    String optString5 = jSONObject.optString("nonce");
                    C12775o.m28638h(optString5, "nonce");
                    if (optString5.length() == 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5 || (!C12775o.m28634d(optString5, str))) {
                        return false;
                    }
                    return true;
                }
            }
        } catch (MalformedURLException unused) {
        }
        return false;
    }

    @VisibleForTesting(otherwise = 2)
    /* renamed from: c */
    public final JSONObject mo31567c() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jti", this.f4188b);
        jSONObject.put("iss", this.f4189c);
        jSONObject.put("aud", this.f4190d);
        jSONObject.put("nonce", this.f4191e);
        jSONObject.put("exp", this.f4192f);
        jSONObject.put("iat", this.f4193g);
        String str = this.f4194h;
        if (str != null) {
            jSONObject.put("sub", str);
        }
        String str2 = this.f4195i;
        if (str2 != null) {
            jSONObject.put(HintConstants.AUTOFILL_HINT_NAME, str2);
        }
        String str3 = this.f4196j;
        if (str3 != null) {
            jSONObject.put("givenName", str3);
        }
        String str4 = this.f4197k;
        if (str4 != null) {
            jSONObject.put("middleName", str4);
        }
        String str5 = this.f4198l;
        if (str5 != null) {
            jSONObject.put("familyName", str5);
        }
        String str6 = this.f4199m;
        if (str6 != null) {
            jSONObject.put(NotificationCompat.CATEGORY_EMAIL, str6);
        }
        String str7 = this.f4200n;
        if (str7 != null) {
            jSONObject.put("picture", str7);
        }
        Set<String> set = this.f4201o;
        if (set != null && (!set.isEmpty())) {
            jSONObject.put("userFriends", new JSONArray(this.f4201o));
        }
        String str8 = this.f4202p;
        if (str8 != null) {
            jSONObject.put("userBirthday", str8);
        }
        Map<String, Integer> map = this.f4203q;
        if (map != null && (!map.isEmpty())) {
            jSONObject.put("userAgeRange", new JSONObject(this.f4203q));
        }
        Map<String, String> map2 = this.f4204r;
        if (map2 != null && (!map2.isEmpty())) {
            jSONObject.put("userHometown", new JSONObject(this.f4204r));
        }
        Map<String, String> map3 = this.f4205s;
        if (map3 != null && (!map3.isEmpty())) {
            jSONObject.put("userLocation", new JSONObject(this.f4205s));
        }
        String str9 = this.f4206t;
        if (str9 != null) {
            jSONObject.put("userGender", str9);
        }
        String str10 = this.f4207u;
        if (str10 != null) {
            jSONObject.put("userLink", str10);
        }
        return jSONObject;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4541g)) {
            return false;
        }
        C4541g gVar = (C4541g) obj;
        if (!C12775o.m28634d(this.f4188b, gVar.f4188b) || !C12775o.m28634d(this.f4189c, gVar.f4189c) || !C12775o.m28634d(this.f4190d, gVar.f4190d) || !C12775o.m28634d(this.f4191e, gVar.f4191e) || this.f4192f != gVar.f4192f || this.f4193g != gVar.f4193g || !C12775o.m28634d(this.f4194h, gVar.f4194h) || !C12775o.m28634d(this.f4195i, gVar.f4195i) || !C12775o.m28634d(this.f4196j, gVar.f4196j) || !C12775o.m28634d(this.f4197k, gVar.f4197k) || !C12775o.m28634d(this.f4198l, gVar.f4198l) || !C12775o.m28634d(this.f4199m, gVar.f4199m) || !C12775o.m28634d(this.f4200n, gVar.f4200n) || !C12775o.m28634d(this.f4201o, gVar.f4201o) || !C12775o.m28634d(this.f4202p, gVar.f4202p) || !C12775o.m28634d(this.f4203q, gVar.f4203q) || !C12775o.m28634d(this.f4204r, gVar.f4204r) || !C12775o.m28634d(this.f4205s, gVar.f4205s) || !C12775o.m28634d(this.f4206t, gVar.f4206t) || !C12775o.m28634d(this.f4207u, gVar.f4207u)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int hashCode = (((((((((((((527 + this.f4188b.hashCode()) * 31) + this.f4189c.hashCode()) * 31) + this.f4190d.hashCode()) * 31) + this.f4191e.hashCode()) * 31) + Long.valueOf(this.f4192f).hashCode()) * 31) + Long.valueOf(this.f4193g).hashCode()) * 31) + this.f4194h.hashCode()) * 31;
        String str = this.f4195i;
        int i13 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i14 = (hashCode + i) * 31;
        String str2 = this.f4196j;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i15 = (i14 + i2) * 31;
        String str3 = this.f4197k;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i16 = (i15 + i3) * 31;
        String str4 = this.f4198l;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i17 = (i16 + i4) * 31;
        String str5 = this.f4199m;
        if (str5 != null) {
            i5 = str5.hashCode();
        } else {
            i5 = 0;
        }
        int i18 = (i17 + i5) * 31;
        String str6 = this.f4200n;
        if (str6 != null) {
            i6 = str6.hashCode();
        } else {
            i6 = 0;
        }
        int i19 = (i18 + i6) * 31;
        Set<String> set = this.f4201o;
        if (set != null) {
            i7 = set.hashCode();
        } else {
            i7 = 0;
        }
        int i20 = (i19 + i7) * 31;
        String str7 = this.f4202p;
        if (str7 != null) {
            i8 = str7.hashCode();
        } else {
            i8 = 0;
        }
        int i21 = (i20 + i8) * 31;
        Map<String, Integer> map = this.f4203q;
        if (map != null) {
            i9 = map.hashCode();
        } else {
            i9 = 0;
        }
        int i22 = (i21 + i9) * 31;
        Map<String, String> map2 = this.f4204r;
        if (map2 != null) {
            i10 = map2.hashCode();
        } else {
            i10 = 0;
        }
        int i23 = (i22 + i10) * 31;
        Map<String, String> map3 = this.f4205s;
        if (map3 != null) {
            i11 = map3.hashCode();
        } else {
            i11 = 0;
        }
        int i24 = (i23 + i11) * 31;
        String str8 = this.f4206t;
        if (str8 != null) {
            i12 = str8.hashCode();
        } else {
            i12 = 0;
        }
        int i25 = (i24 + i12) * 31;
        String str9 = this.f4207u;
        if (str9 != null) {
            i13 = str9.hashCode();
        }
        return i25 + i13;
    }

    public String toString() {
        String jSONObject = mo31567c().toString();
        C12775o.m28638h(jSONObject, "claimsJsonObject.toString()");
        return jSONObject;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C12775o.m28639i(parcel, "dest");
        parcel.writeString(this.f4188b);
        parcel.writeString(this.f4189c);
        parcel.writeString(this.f4190d);
        parcel.writeString(this.f4191e);
        parcel.writeLong(this.f4192f);
        parcel.writeLong(this.f4193g);
        parcel.writeString(this.f4194h);
        parcel.writeString(this.f4195i);
        parcel.writeString(this.f4196j);
        parcel.writeString(this.f4197k);
        parcel.writeString(this.f4198l);
        parcel.writeString(this.f4199m);
        parcel.writeString(this.f4200n);
        if (this.f4201o == null) {
            parcel.writeStringList((List) null);
        } else {
            parcel.writeStringList(new ArrayList(this.f4201o));
        }
        parcel.writeString(this.f4202p);
        parcel.writeMap(this.f4203q);
        parcel.writeMap(this.f4204r);
        parcel.writeMap(this.f4205s);
        parcel.writeString(this.f4206t);
        parcel.writeString(this.f4207u);
    }

    public C4541g(Parcel parcel) {
        C12775o.m28639i(parcel, "parcel");
        String readString = parcel.readString();
        C9144e0.m18692k(readString, "jti");
        if (readString != null) {
            this.f4188b = readString;
            String readString2 = parcel.readString();
            C9144e0.m18692k(readString2, "iss");
            if (readString2 != null) {
                this.f4189c = readString2;
                String readString3 = parcel.readString();
                C9144e0.m18692k(readString3, "aud");
                if (readString3 != null) {
                    this.f4190d = readString3;
                    String readString4 = parcel.readString();
                    C9144e0.m18692k(readString4, "nonce");
                    if (readString4 != null) {
                        this.f4191e = readString4;
                        this.f4192f = parcel.readLong();
                        this.f4193g = parcel.readLong();
                        String readString5 = parcel.readString();
                        C9144e0.m18692k(readString5, "sub");
                        if (readString5 != null) {
                            this.f4194h = readString5;
                            this.f4195i = parcel.readString();
                            this.f4196j = parcel.readString();
                            this.f4197k = parcel.readString();
                            this.f4198l = parcel.readString();
                            this.f4199m = parcel.readString();
                            this.f4200n = parcel.readString();
                            ArrayList arrayList = new ArrayList();
                            parcel.readStringList(arrayList);
                            this.f4201o = Collections.unmodifiableSet(new HashSet(arrayList));
                            this.f4202p = parcel.readString();
                            HashMap readHashMap = parcel.readHashMap(C12774n.f20424a.getClass().getClassLoader());
                            HashMap hashMap = null;
                            this.f4203q = Collections.unmodifiableMap(!(readHashMap instanceof HashMap) ? null : readHashMap);
                            C12770k0 k0Var = C12770k0.f20423a;
                            HashMap readHashMap2 = parcel.readHashMap(k0Var.getClass().getClassLoader());
                            this.f4204r = Collections.unmodifiableMap(!(readHashMap2 instanceof HashMap) ? null : readHashMap2);
                            HashMap readHashMap3 = parcel.readHashMap(k0Var.getClass().getClassLoader());
                            this.f4205s = Collections.unmodifiableMap(readHashMap3 instanceof HashMap ? readHashMap3 : hashMap);
                            this.f4206t = parcel.readString();
                            this.f4207u = parcel.readString();
                            return;
                        }
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    throw new IllegalStateException("Required value was null.".toString());
                }
                throw new IllegalStateException("Required value was null.".toString());
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
