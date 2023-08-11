package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p073e4.C7475c;
import p231t4.C9713p;
import p242u4.C9882a;
import p242u4.C9883b;
import p286y4.C10671e;
import p286y4.C10674h;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class GoogleSignInAccount extends C9882a implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C4616b();
    @NonNull

    /* renamed from: o */
    public static C10671e f4431o = C10674h.m22680c();

    /* renamed from: b */
    final int f4432b;
    @Nullable

    /* renamed from: c */
    private String f4433c;
    @Nullable

    /* renamed from: d */
    private String f4434d;
    @Nullable

    /* renamed from: e */
    private String f4435e;
    @Nullable

    /* renamed from: f */
    private String f4436f;
    @Nullable

    /* renamed from: g */
    private Uri f4437g;
    @Nullable

    /* renamed from: h */
    private String f4438h;

    /* renamed from: i */
    private long f4439i;

    /* renamed from: j */
    private String f4440j;

    /* renamed from: k */
    List<Scope> f4441k;
    @Nullable

    /* renamed from: l */
    private String f4442l;
    @Nullable

    /* renamed from: m */
    private String f4443m;

    /* renamed from: n */
    private Set<Scope> f4444n = new HashSet();

    GoogleSignInAccount(int i, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Uri uri, @Nullable String str5, long j, String str6, List<Scope> list, @Nullable String str7, @Nullable String str8) {
        this.f4432b = i;
        this.f4433c = str;
        this.f4434d = str2;
        this.f4435e = str3;
        this.f4436f = str4;
        this.f4437g = uri;
        this.f4438h = str5;
        this.f4439i = j;
        this.f4440j = str6;
        this.f4441k = list;
        this.f4442l = str7;
        this.f4443m = str8;
    }

    @NonNull
    /* renamed from: N */
    public static GoogleSignInAccount m5903N(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Uri uri, @Nullable Long l, @NonNull String str7, @NonNull Set<Scope> set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, (String) null, l.longValue(), C9713p.m20271f(str7), new ArrayList((Collection) C9713p.m20275j(set)), str5, str6);
    }

    @Nullable
    /* renamed from: O */
    public static GoogleSignInAccount m5904O(@Nullable String str) {
        Uri uri;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        if (!TextUtils.isEmpty(optString)) {
            uri = Uri.parse(optString);
        } else {
            uri = null;
        }
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString2 = jSONObject.optString("id");
        if (jSONObject.has("tokenId")) {
            str2 = jSONObject.optString("tokenId");
        } else {
            str2 = null;
        }
        if (jSONObject.has(NotificationCompat.CATEGORY_EMAIL)) {
            str3 = jSONObject.optString(NotificationCompat.CATEGORY_EMAIL);
        } else {
            str3 = null;
        }
        if (jSONObject.has("displayName")) {
            str4 = jSONObject.optString("displayName");
        } else {
            str4 = null;
        }
        if (jSONObject.has("givenName")) {
            str5 = jSONObject.optString("givenName");
        } else {
            str5 = null;
        }
        if (jSONObject.has("familyName")) {
            str6 = jSONObject.optString("familyName");
        } else {
            str6 = null;
        }
        GoogleSignInAccount N = m5903N(optString2, str2, str3, str4, str5, str6, uri, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        if (jSONObject.has("serverAuthCode")) {
            str7 = jSONObject.optString("serverAuthCode");
        }
        N.f4438h = str7;
        return N;
    }

    @Nullable
    /* renamed from: A */
    public String mo31842A() {
        return this.f4436f;
    }

    @Nullable
    /* renamed from: F */
    public String mo31843F() {
        return this.f4435e;
    }

    @Nullable
    /* renamed from: G */
    public String mo31844G() {
        return this.f4443m;
    }

    @Nullable
    /* renamed from: H */
    public String mo31845H() {
        return this.f4442l;
    }

    @Nullable
    /* renamed from: I */
    public String mo31846I() {
        return this.f4433c;
    }

    @Nullable
    /* renamed from: J */
    public String mo31847J() {
        return this.f4434d;
    }

    @Nullable
    /* renamed from: K */
    public Uri mo31848K() {
        return this.f4437g;
    }

    @NonNull
    /* renamed from: L */
    public Set<Scope> mo31849L() {
        HashSet hashSet = new HashSet(this.f4441k);
        hashSet.addAll(this.f4444n);
        return hashSet;
    }

    @Nullable
    /* renamed from: M */
    public String mo31850M() {
        return this.f4438h;
    }

    @NonNull
    /* renamed from: P */
    public final String mo31851P() {
        return this.f4440j;
    }

    @NonNull
    /* renamed from: Q */
    public final String mo31852Q() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (mo31846I() != null) {
                jSONObject.put("id", mo31846I());
            }
            if (mo31847J() != null) {
                jSONObject.put("tokenId", mo31847J());
            }
            if (mo31843F() != null) {
                jSONObject.put(NotificationCompat.CATEGORY_EMAIL, mo31843F());
            }
            if (mo31842A() != null) {
                jSONObject.put("displayName", mo31842A());
            }
            if (mo31845H() != null) {
                jSONObject.put("givenName", mo31845H());
            }
            if (mo31844G() != null) {
                jSONObject.put("familyName", mo31844G());
            }
            Uri K = mo31848K();
            if (K != null) {
                jSONObject.put("photoUrl", K.toString());
            }
            if (mo31850M() != null) {
                jSONObject.put("serverAuthCode", mo31850M());
            }
            jSONObject.put("expirationTime", this.f4439i);
            jSONObject.put("obfuscatedIdentifier", this.f4440j);
            JSONArray jSONArray = new JSONArray();
            List<Scope> list = this.f4441k;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, C7475c.f10359b);
            for (Scope A : scopeArr) {
                jSONArray.put(A.mo32372A());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.f4440j.equals(this.f4440j) || !googleSignInAccount.mo31849L().equals(mo31849L())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f4440j.hashCode() + 527) * 31) + mo31849L().hashCode();
    }

    @Nullable
    /* renamed from: s */
    public Account mo31855s() {
        String str = this.f4435e;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20532l(parcel, 1, this.f4432b);
        C9883b.m20539s(parcel, 2, mo31846I(), false);
        C9883b.m20539s(parcel, 3, mo31847J(), false);
        C9883b.m20539s(parcel, 4, mo31843F(), false);
        C9883b.m20539s(parcel, 5, mo31842A(), false);
        C9883b.m20538r(parcel, 6, mo31848K(), i, false);
        C9883b.m20539s(parcel, 7, mo31850M(), false);
        C9883b.m20535o(parcel, 8, this.f4439i);
        C9883b.m20539s(parcel, 9, this.f4440j, false);
        C9883b.m20543w(parcel, 10, this.f4441k, false);
        C9883b.m20539s(parcel, 11, mo31845H(), false);
        C9883b.m20539s(parcel, 12, mo31844G(), false);
        C9883b.m20522b(parcel, a);
    }
}
