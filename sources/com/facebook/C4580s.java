package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.autofill.HintConstants;
import com.facebook.C4509a;
import com.rmn.apiclient.impl.api.call.APIParams;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import p198q2.C9138d0;
import p198q2.C9144e0;

/* renamed from: com.facebook.s */
/* compiled from: Profile.kt */
public final class C4580s implements Parcelable {
    public static final Parcelable.Creator<C4580s> CREATOR = new C4581a();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final String f4309i;

    /* renamed from: j */
    public static final C4582b f4310j = new C4582b((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final String f4311b;

    /* renamed from: c */
    private final String f4312c;

    /* renamed from: d */
    private final String f4313d;

    /* renamed from: e */
    private final String f4314e;

    /* renamed from: f */
    private final String f4315f;

    /* renamed from: g */
    private final Uri f4316g;

    /* renamed from: h */
    private final Uri f4317h;

    /* renamed from: com.facebook.s$a */
    /* compiled from: Profile.kt */
    public static final class C4581a implements Parcelable.Creator<C4580s> {
        C4581a() {
        }

        /* renamed from: a */
        public C4580s createFromParcel(Parcel parcel) {
            C12775o.m28639i(parcel, APIParams.SOURCE);
            return new C4580s(parcel, (DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public C4580s[] newArray(int i) {
            return new C4580s[i];
        }
    }

    /* renamed from: com.facebook.s$b */
    /* compiled from: Profile.kt */
    public static final class C4582b {

        /* renamed from: com.facebook.s$b$a */
        /* compiled from: Profile.kt */
        public static final class C4583a implements C9138d0.C9139a {
            C4583a() {
            }

            /* renamed from: a */
            public void mo23342a(JSONObject jSONObject) {
                String str;
                Uri uri;
                Uri uri2 = null;
                if (jSONObject != null) {
                    str = jSONObject.optString("id");
                } else {
                    str = null;
                }
                if (str == null) {
                    Log.w(C4580s.f4309i, "No user ID returned on Me request");
                    return;
                }
                String optString = jSONObject.optString("link");
                String optString2 = jSONObject.optString("profile_picture", (String) null);
                String optString3 = jSONObject.optString("first_name");
                String optString4 = jSONObject.optString("middle_name");
                String optString5 = jSONObject.optString("last_name");
                String optString6 = jSONObject.optString(HintConstants.AUTOFILL_HINT_NAME);
                if (optString != null) {
                    uri = Uri.parse(optString);
                } else {
                    uri = null;
                }
                if (optString2 != null) {
                    uri2 = Uri.parse(optString2);
                }
                C4580s.f4310j.mo31737c(new C4580s(str, optString3, optString4, optString5, optString6, uri, uri2));
            }

            /* renamed from: b */
            public void mo23343b(FacebookException facebookException) {
                String a = C4580s.f4309i;
                Log.e(a, "Got unexpected exception: " + facebookException);
            }
        }

        private C4582b() {
        }

        public /* synthetic */ C4582b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo31735a() {
            C4509a.C4512c cVar = C4509a.f4119q;
            C4509a e = cVar.mo31515e();
            if (e == null) {
                return;
            }
            if (!cVar.mo31517g()) {
                mo31737c((C4580s) null);
            } else {
                C9138d0.m18599A(e.mo31500n(), new C4583a());
            }
        }

        /* renamed from: b */
        public final C4580s mo31736b() {
            return C4592u.f4353e.mo31790a().mo31787c();
        }

        /* renamed from: c */
        public final void mo31737c(C4580s sVar) {
            C4592u.f4353e.mo31790a().mo31789f(sVar);
        }
    }

    static {
        String simpleName = C4580s.class.getSimpleName();
        C12775o.m28638h(simpleName, "Profile::class.java.simpleName");
        f4309i = simpleName;
    }

    public /* synthetic */ C4580s(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    /* renamed from: b */
    public static final void m5761b() {
        f4310j.mo31735a();
    }

    /* renamed from: d */
    public static final void m5762d(C4580s sVar) {
        f4310j.mo31737c(sVar);
    }

    /* renamed from: c */
    public final String mo31725c() {
        return this.f4311b;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final JSONObject mo31727e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f4311b);
            jSONObject.put("first_name", this.f4312c);
            jSONObject.put("middle_name", this.f4313d);
            jSONObject.put("last_name", this.f4314e);
            jSONObject.put(HintConstants.AUTOFILL_HINT_NAME, this.f4315f);
            Uri uri = this.f4316g;
            if (uri != null) {
                jSONObject.put("link_uri", uri.toString());
            }
            Uri uri2 = this.f4317h;
            if (uri2 != null) {
                jSONObject.put("picture_uri", uri2.toString());
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        Uri uri;
        Uri uri2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4580s)) {
            return false;
        }
        String str5 = this.f4311b;
        if (((str5 != null || ((C4580s) obj).f4311b != null) && !C12775o.m28634d(str5, ((C4580s) obj).f4311b)) || ((((str = this.f4312c) != null || ((C4580s) obj).f4312c != null) && !C12775o.m28634d(str, ((C4580s) obj).f4312c)) || ((((str2 = this.f4313d) != null || ((C4580s) obj).f4313d != null) && !C12775o.m28634d(str2, ((C4580s) obj).f4313d)) || ((((str3 = this.f4314e) != null || ((C4580s) obj).f4314e != null) && !C12775o.m28634d(str3, ((C4580s) obj).f4314e)) || ((((str4 = this.f4315f) != null || ((C4580s) obj).f4315f != null) && !C12775o.m28634d(str4, ((C4580s) obj).f4315f)) || ((((uri = this.f4316g) != null || ((C4580s) obj).f4316g != null) && !C12775o.m28634d(uri, ((C4580s) obj).f4316g)) || (((uri2 = this.f4317h) != null || ((C4580s) obj).f4317h != null) && !C12775o.m28634d(uri2, ((C4580s) obj).f4317h)))))))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        String str = this.f4311b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i2 = 527 + i;
        String str2 = this.f4312c;
        if (str2 != null) {
            i2 = (i2 * 31) + str2.hashCode();
        }
        String str3 = this.f4313d;
        if (str3 != null) {
            i2 = (i2 * 31) + str3.hashCode();
        }
        String str4 = this.f4314e;
        if (str4 != null) {
            i2 = (i2 * 31) + str4.hashCode();
        }
        String str5 = this.f4315f;
        if (str5 != null) {
            i2 = (i2 * 31) + str5.hashCode();
        }
        Uri uri = this.f4316g;
        if (uri != null) {
            i2 = (i2 * 31) + uri.hashCode();
        }
        Uri uri2 = this.f4317h;
        if (uri2 != null) {
            return (i2 * 31) + uri2.hashCode();
        }
        return i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        String str;
        C12775o.m28639i(parcel, "dest");
        parcel.writeString(this.f4311b);
        parcel.writeString(this.f4312c);
        parcel.writeString(this.f4313d);
        parcel.writeString(this.f4314e);
        parcel.writeString(this.f4315f);
        Uri uri = this.f4316g;
        String str2 = null;
        if (uri != null) {
            str = uri.toString();
        } else {
            str = null;
        }
        parcel.writeString(str);
        Uri uri2 = this.f4317h;
        if (uri2 != null) {
            str2 = uri2.toString();
        }
        parcel.writeString(str2);
    }

    public C4580s(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2) {
        C9144e0.m18692k(str, "id");
        this.f4311b = str;
        this.f4312c = str2;
        this.f4313d = str3;
        this.f4314e = str4;
        this.f4315f = str5;
        this.f4316g = uri;
        this.f4317h = uri2;
    }

    public C4580s(JSONObject jSONObject) {
        Uri uri;
        C12775o.m28639i(jSONObject, "jsonObject");
        Uri uri2 = null;
        this.f4311b = jSONObject.optString("id", (String) null);
        this.f4312c = jSONObject.optString("first_name", (String) null);
        this.f4313d = jSONObject.optString("middle_name", (String) null);
        this.f4314e = jSONObject.optString("last_name", (String) null);
        this.f4315f = jSONObject.optString(HintConstants.AUTOFILL_HINT_NAME, (String) null);
        String optString = jSONObject.optString("link_uri", (String) null);
        if (optString == null) {
            uri = null;
        } else {
            uri = Uri.parse(optString);
        }
        this.f4316g = uri;
        String optString2 = jSONObject.optString("picture_uri", (String) null);
        this.f4317h = optString2 != null ? Uri.parse(optString2) : uri2;
    }

    private C4580s(Parcel parcel) {
        Uri uri;
        this.f4311b = parcel.readString();
        this.f4312c = parcel.readString();
        this.f4313d = parcel.readString();
        this.f4314e = parcel.readString();
        this.f4315f = parcel.readString();
        String readString = parcel.readString();
        Uri uri2 = null;
        if (readString == null) {
            uri = null;
        } else {
            uri = Uri.parse(readString);
        }
        this.f4316g = uri;
        String readString2 = parcel.readString();
        this.f4317h = readString2 != null ? Uri.parse(readString2) : uri2;
    }
}
