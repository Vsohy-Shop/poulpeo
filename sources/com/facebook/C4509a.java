package com.facebook;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.location.LocationRequestCompat;
import com.facebook.C4577q;
import com.rmn.apiclient.impl.api.call.APIParams;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p198q2.C9138d0;
import p198q2.C9144e0;

/* renamed from: com.facebook.a */
/* compiled from: AccessToken.kt */
public final class C4509a implements Parcelable {
    public static final Parcelable.Creator<C4509a> CREATOR = new C4511b();

    /* renamed from: m */
    private static final Date f4115m;

    /* renamed from: n */
    private static final Date f4116n;

    /* renamed from: o */
    private static final Date f4117o = new Date();

    /* renamed from: p */
    private static final C4537e f4118p = C4537e.FACEBOOK_APPLICATION_WEB;

    /* renamed from: q */
    public static final C4512c f4119q = new C4512c((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final Date f4120b;

    /* renamed from: c */
    private final Set<String> f4121c;

    /* renamed from: d */
    private final Set<String> f4122d;

    /* renamed from: e */
    private final Set<String> f4123e;

    /* renamed from: f */
    private final String f4124f;

    /* renamed from: g */
    private final C4537e f4125g;

    /* renamed from: h */
    private final Date f4126h;

    /* renamed from: i */
    private final String f4127i;

    /* renamed from: j */
    private final String f4128j;

    /* renamed from: k */
    private final Date f4129k;

    /* renamed from: l */
    private final String f4130l;

    /* renamed from: com.facebook.a$a */
    /* compiled from: AccessToken.kt */
    public interface C4510a {
        /* renamed from: a */
        void mo31506a(FacebookException facebookException);
    }

    /* renamed from: com.facebook.a$b */
    /* compiled from: AccessToken.kt */
    public static final class C4511b implements Parcelable.Creator<C4509a> {
        C4511b() {
        }

        /* renamed from: a */
        public C4509a createFromParcel(Parcel parcel) {
            C12775o.m28639i(parcel, APIParams.SOURCE);
            return new C4509a(parcel);
        }

        /* renamed from: b */
        public C4509a[] newArray(int i) {
            return new C4509a[i];
        }
    }

    /* renamed from: com.facebook.a$c */
    /* compiled from: AccessToken.kt */
    public static final class C4512c {
        private C4512c() {
        }

        public /* synthetic */ C4512c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C4509a mo31511a(C4509a aVar) {
            C12775o.m28639i(aVar, "current");
            return new C4509a(aVar.mo31500n(), aVar.mo31488c(), aVar.mo31501o(), aVar.mo31498l(), aVar.mo31492f(), aVar.mo31493g(), aVar.mo31499m(), new Date(), new Date(), aVar.mo31490e(), (String) null, 1024, (DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public final C4509a mo31512b(JSONObject jSONObject) {
            Collection collection;
            C12775o.m28639i(jSONObject, "jsonObject");
            if (jSONObject.getInt("version") <= 1) {
                String string = jSONObject.getString("token");
                Date date = new Date(jSONObject.getLong("expires_at"));
                JSONArray jSONArray = jSONObject.getJSONArray("permissions");
                JSONArray jSONArray2 = jSONObject.getJSONArray("declined_permissions");
                JSONArray optJSONArray = jSONObject.optJSONArray("expired_permissions");
                Date date2 = new Date(jSONObject.getLong("last_refresh"));
                String string2 = jSONObject.getString(APIParams.SOURCE);
                C12775o.m28638h(string2, "jsonObject.getString(SOURCE_KEY)");
                C4537e valueOf = C4537e.valueOf(string2);
                String string3 = jSONObject.getString("application_id");
                String string4 = jSONObject.getString("user_id");
                Date date3 = new Date(jSONObject.optLong("data_access_expiration_time", 0));
                String optString = jSONObject.optString("graph_domain", (String) null);
                C12775o.m28638h(string, "token");
                C12775o.m28638h(string3, "applicationId");
                C12775o.m28638h(string4, "userId");
                C12775o.m28638h(jSONArray, "permissionsArray");
                Collection X = C9138d0.m18622X(jSONArray);
                C12775o.m28638h(jSONArray2, "declinedPermissionsArray");
                Collection X2 = C9138d0.m18622X(jSONArray2);
                if (optJSONArray == null) {
                    collection = new ArrayList();
                } else {
                    collection = C9138d0.m18622X(optJSONArray);
                }
                return new C4509a(string, string3, string4, X, X2, collection, valueOf, date, date2, date3, optString);
            }
            throw new FacebookException("Unknown AccessToken serialization format.");
        }

        /* renamed from: c */
        public final C4509a mo31513c(Bundle bundle) {
            String str;
            Bundle bundle2 = bundle;
            C12775o.m28639i(bundle2, "bundle");
            List<String> f = mo31516f(bundle2, "com.facebook.TokenCachingStrategy.Permissions");
            List<String> f2 = mo31516f(bundle2, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
            List<String> f3 = mo31516f(bundle2, "com.facebook.TokenCachingStrategy.ExpiredPermissions");
            C4577q.C4578a aVar = C4577q.f4297d;
            String a = aVar.mo31719a(bundle2);
            if (C9138d0.m18618T(a)) {
                a = FacebookSdk.getApplicationId();
            }
            String str2 = a;
            String f4 = aVar.mo31723f(bundle2);
            if (f4 != null) {
                JSONObject c = C9138d0.m18629c(f4);
                if (c != null) {
                    try {
                        str = c.getString("id");
                    } catch (JSONException unused) {
                        return null;
                    }
                } else {
                    str = null;
                }
                if (!(str2 == null || str == null)) {
                    return new C4509a(f4, str2, str, f, f2, f3, aVar.mo31722e(bundle2), aVar.mo31720c(bundle2), aVar.mo31721d(bundle2), (Date) null, (String) null, 1024, (DefaultConstructorMarker) null);
                }
            }
            return null;
        }

        /* renamed from: d */
        public final void mo31514d() {
            C4509a g = C4527d.f4139g.mo31543e().mo31539g();
            if (g != null) {
                mo31518h(mo31511a(g));
            }
        }

        /* renamed from: e */
        public final C4509a mo31515e() {
            return C4527d.f4139g.mo31543e().mo31539g();
        }

        /* renamed from: f */
        public final List<String> mo31516f(Bundle bundle, String str) {
            C12775o.m28639i(bundle, "bundle");
            ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
            if (stringArrayList == null) {
                return C12726w.m28524k();
            }
            List<String> unmodifiableList = Collections.unmodifiableList(new ArrayList(stringArrayList));
            C12775o.m28638h(unmodifiableList, "Collections.unmodifiable…ist(originalPermissions))");
            return unmodifiableList;
        }

        /* renamed from: g */
        public final boolean mo31517g() {
            C4509a g = C4527d.f4139g.mo31543e().mo31539g();
            if (g == null || g.mo31502q()) {
                return false;
            }
            return true;
        }

        /* renamed from: h */
        public final void mo31518h(C4509a aVar) {
            C4527d.f4139g.mo31543e().mo31542l(aVar);
        }
    }

    static {
        Date date = new Date(LocationRequestCompat.PASSIVE_INTERVAL);
        f4115m = date;
        f4116n = date;
    }

    public C4509a(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, C4537e eVar, Date date, Date date2, Date date3) {
        this(str, str2, str3, collection, collection2, collection3, eVar, date, date2, date3, (String) null, 1024, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    private final void m5513a(StringBuilder sb) {
        sb.append(" permissions:");
        sb.append("[");
        sb.append(TextUtils.join(", ", this.f4121c));
        sb.append("]");
    }

    /* renamed from: b */
    private final C4537e m5514b(C4537e eVar, String str) {
        if (str == null || !str.equals(FacebookSdk.INSTAGRAM)) {
            return eVar;
        }
        int i = C4522b.f4131a[eVar.ordinal()];
        if (i == 1) {
            return C4537e.INSTAGRAM_APPLICATION_WEB;
        }
        if (i == 2) {
            return C4537e.INSTAGRAM_CUSTOM_CHROME_TAB;
        }
        if (i != 3) {
            return eVar;
        }
        return C4537e.INSTAGRAM_WEB_VIEW;
    }

    /* renamed from: d */
    public static final C4509a m5515d() {
        return f4119q.mo31515e();
    }

    /* renamed from: p */
    public static final boolean m5516p() {
        return f4119q.mo31517g();
    }

    /* renamed from: s */
    public static final void m5517s(C4509a aVar) {
        f4119q.mo31518h(aVar);
    }

    /* renamed from: w */
    private final String m5518w() {
        if (FacebookSdk.isLoggingBehaviorEnabled(C4579r.INCLUDE_ACCESS_TOKENS)) {
            return this.f4124f;
        }
        return "ACCESS_TOKEN_REMOVED";
    }

    /* renamed from: c */
    public final String mo31488c() {
        return this.f4127i;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final Date mo31490e() {
        return this.f4129k;
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4509a)) {
            return false;
        }
        C4509a aVar = (C4509a) obj;
        if (C12775o.m28634d(this.f4120b, aVar.f4120b) && C12775o.m28634d(this.f4121c, aVar.f4121c) && C12775o.m28634d(this.f4122d, aVar.f4122d) && C12775o.m28634d(this.f4123e, aVar.f4123e) && C12775o.m28634d(this.f4124f, aVar.f4124f) && this.f4125g == aVar.f4125g && C12775o.m28634d(this.f4126h, aVar.f4126h) && C12775o.m28634d(this.f4127i, aVar.f4127i) && C12775o.m28634d(this.f4128j, aVar.f4128j) && C12775o.m28634d(this.f4129k, aVar.f4129k)) {
            String str = this.f4130l;
            String str2 = aVar.f4130l;
            if (str != null) {
                z = C12775o.m28634d(str, str2);
            } else if (str2 == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final Set<String> mo31492f() {
        return this.f4122d;
    }

    /* renamed from: g */
    public final Set<String> mo31493g() {
        return this.f4123e;
    }

    /* renamed from: h */
    public final Date mo31494h() {
        return this.f4120b;
    }

    public int hashCode() {
        int i;
        int hashCode = (((((((((((((((((((527 + this.f4120b.hashCode()) * 31) + this.f4121c.hashCode()) * 31) + this.f4122d.hashCode()) * 31) + this.f4123e.hashCode()) * 31) + this.f4124f.hashCode()) * 31) + this.f4125g.hashCode()) * 31) + this.f4126h.hashCode()) * 31) + this.f4127i.hashCode()) * 31) + this.f4128j.hashCode()) * 31) + this.f4129k.hashCode()) * 31;
        String str = this.f4130l;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    /* renamed from: i */
    public final String mo31496i() {
        return this.f4130l;
    }

    /* renamed from: k */
    public final Date mo31497k() {
        return this.f4126h;
    }

    /* renamed from: l */
    public final Set<String> mo31498l() {
        return this.f4121c;
    }

    /* renamed from: m */
    public final C4537e mo31499m() {
        return this.f4125g;
    }

    /* renamed from: n */
    public final String mo31500n() {
        return this.f4124f;
    }

    /* renamed from: o */
    public final String mo31501o() {
        return this.f4128j;
    }

    /* renamed from: q */
    public final boolean mo31502q() {
        return new Date().after(this.f4120b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{AccessToken");
        sb.append(" token:");
        sb.append(m5518w());
        m5513a(sb);
        sb.append("}");
        String sb2 = sb.toString();
        C12775o.m28638h(sb2, "builder.toString()");
        return sb2;
    }

    /* renamed from: v */
    public final JSONObject mo31504v() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.f4124f);
        jSONObject.put("expires_at", this.f4120b.getTime());
        jSONObject.put("permissions", new JSONArray(this.f4121c));
        jSONObject.put("declined_permissions", new JSONArray(this.f4122d));
        jSONObject.put("expired_permissions", new JSONArray(this.f4123e));
        jSONObject.put("last_refresh", this.f4126h.getTime());
        jSONObject.put(APIParams.SOURCE, this.f4125g.name());
        jSONObject.put("application_id", this.f4127i);
        jSONObject.put("user_id", this.f4128j);
        jSONObject.put("data_access_expiration_time", this.f4129k.getTime());
        String str = this.f4130l;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C12775o.m28639i(parcel, "dest");
        parcel.writeLong(this.f4120b.getTime());
        parcel.writeStringList(new ArrayList(this.f4121c));
        parcel.writeStringList(new ArrayList(this.f4122d));
        parcel.writeStringList(new ArrayList(this.f4123e));
        parcel.writeString(this.f4124f);
        parcel.writeString(this.f4125g.name());
        parcel.writeLong(this.f4126h.getTime());
        parcel.writeString(this.f4127i);
        parcel.writeString(this.f4128j);
        parcel.writeLong(this.f4129k.getTime());
        parcel.writeString(this.f4130l);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4509a(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, C4537e eVar, Date date, Date date2, Date date3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, collection, collection2, collection3, eVar, date, date2, date3, (i & 1024) != 0 ? "facebook" : str4);
    }

    public C4509a(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, C4537e eVar, Date date, Date date2, Date date3, String str4) {
        HashSet hashSet;
        HashSet hashSet2;
        HashSet hashSet3;
        C12775o.m28639i(str, "accessToken");
        C12775o.m28639i(str2, "applicationId");
        C12775o.m28639i(str3, "userId");
        C9144e0.m18688g(str, "accessToken");
        C9144e0.m18688g(str2, "applicationId");
        C9144e0.m18688g(str3, "userId");
        this.f4120b = date == null ? f4116n : date;
        if (collection == null) {
            hashSet = new HashSet();
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        C12775o.m28638h(unmodifiableSet, "Collections.unmodifiable…missions) else HashSet())");
        this.f4121c = unmodifiableSet;
        if (collection2 == null) {
            hashSet2 = new HashSet();
        }
        Set<String> unmodifiableSet2 = Collections.unmodifiableSet(hashSet2);
        C12775o.m28638h(unmodifiableSet2, "Collections.unmodifiable…missions) else HashSet())");
        this.f4122d = unmodifiableSet2;
        if (collection3 == null) {
            hashSet3 = new HashSet();
        }
        Set<String> unmodifiableSet3 = Collections.unmodifiableSet(hashSet3);
        C12775o.m28638h(unmodifiableSet3, "Collections.unmodifiable…missions) else HashSet())");
        this.f4123e = unmodifiableSet3;
        this.f4124f = str;
        this.f4125g = m5514b(eVar == null ? f4118p : eVar, str4);
        this.f4126h = date2 == null ? f4117o : date2;
        this.f4127i = str2;
        this.f4128j = str3;
        this.f4129k = (date3 == null || date3.getTime() == 0) ? f4116n : date3;
        this.f4130l = str4 == null ? "facebook" : str4;
    }

    public C4509a(Parcel parcel) {
        C4537e eVar;
        C12775o.m28639i(parcel, "parcel");
        this.f4120b = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        C12775o.m28638h(unmodifiableSet, "Collections.unmodifiable…HashSet(permissionsList))");
        this.f4121c = unmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        C12775o.m28638h(unmodifiableSet2, "Collections.unmodifiable…HashSet(permissionsList))");
        this.f4122d = unmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set<String> unmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        C12775o.m28638h(unmodifiableSet3, "Collections.unmodifiable…HashSet(permissionsList))");
        this.f4123e = unmodifiableSet3;
        String readString = parcel.readString();
        C9144e0.m18692k(readString, "token");
        if (readString != null) {
            this.f4124f = readString;
            String readString2 = parcel.readString();
            if (readString2 != null) {
                eVar = C4537e.valueOf(readString2);
            } else {
                eVar = f4118p;
            }
            this.f4125g = eVar;
            this.f4126h = new Date(parcel.readLong());
            String readString3 = parcel.readString();
            C9144e0.m18692k(readString3, "applicationId");
            if (readString3 != null) {
                this.f4127i = readString3;
                String readString4 = parcel.readString();
                C9144e0.m18692k(readString4, "userId");
                if (readString4 != null) {
                    this.f4128j = readString4;
                    this.f4129k = new Date(parcel.readLong());
                    this.f4130l = parcel.readString();
                    return;
                }
                throw new IllegalStateException("Required value was null.".toString());
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
