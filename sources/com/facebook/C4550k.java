package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import java.net.HttpURLConnection;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import p198q2.C9160h;
import p198q2.C9177p;
import p198q2.C9181q;

/* renamed from: com.facebook.k */
/* compiled from: FacebookRequestError.kt */
public final class C4550k implements Parcelable {
    public static final Parcelable.Creator<C4550k> CREATOR = new C4552b();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final C4554d f4214p = new C4554d(200, 299);

    /* renamed from: q */
    public static final C4553c f4215q = new C4553c((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final String f4216b;

    /* renamed from: c */
    private FacebookException f4217c;

    /* renamed from: d */
    private final C4551a f4218d;

    /* renamed from: e */
    private final String f4219e;

    /* renamed from: f */
    private final int f4220f;

    /* renamed from: g */
    private final int f4221g;

    /* renamed from: h */
    private final int f4222h;

    /* renamed from: i */
    private final String f4223i;

    /* renamed from: j */
    private final String f4224j;

    /* renamed from: k */
    private final String f4225k;

    /* renamed from: l */
    private final JSONObject f4226l;

    /* renamed from: m */
    private final JSONObject f4227m;

    /* renamed from: n */
    private final Object f4228n;

    /* renamed from: o */
    private final HttpURLConnection f4229o;

    /* renamed from: com.facebook.k$a */
    /* compiled from: FacebookRequestError.kt */
    public enum C4551a {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT
    }

    /* renamed from: com.facebook.k$b */
    /* compiled from: FacebookRequestError.kt */
    public static final class C4552b implements Parcelable.Creator<C4550k> {
        C4552b() {
        }

        /* renamed from: a */
        public C4550k createFromParcel(Parcel parcel) {
            C12775o.m28639i(parcel, "parcel");
            return new C4550k(parcel, (DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public C4550k[] newArray(int i) {
            return new C4550k[i];
        }
    }

    /* renamed from: com.facebook.k$c */
    /* compiled from: FacebookRequestError.kt */
    public static final class C4553c {
        private C4553c() {
        }

        public /* synthetic */ C4553c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARNING: Removed duplicated region for block: B:48:0x00cd A[Catch:{ JSONException -> 0x012b }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.facebook.C4550k mo31609a(org.json.JSONObject r20, java.lang.Object r21, java.net.HttpURLConnection r22) {
            /*
                r19 = this;
                r9 = r20
                java.lang.String r0 = "error_code"
                java.lang.String r1 = "error"
                java.lang.String r2 = "FACEBOOK_NON_JSON_RESULT"
                java.lang.String r3 = "body"
                java.lang.String r4 = "code"
                java.lang.String r5 = "singleResult"
                kotlin.jvm.internal.C12775o.m28639i(r9, r5)
                r15 = 0
                boolean r5 = r9.has(r4)     // Catch:{ JSONException -> 0x012b }
                if (r5 == 0) goto L_0x012b
                int r5 = r9.getInt(r4)     // Catch:{ JSONException -> 0x012b }
                java.lang.Object r6 = p198q2.C9138d0.m18605G(r9, r3, r2)     // Catch:{ JSONException -> 0x012b }
                if (r6 == 0) goto L_0x00ee
                boolean r7 = r6 instanceof org.json.JSONObject     // Catch:{ JSONException -> 0x012b }
                if (r7 == 0) goto L_0x00ee
                r7 = r6
                org.json.JSONObject r7 = (org.json.JSONObject) r7     // Catch:{ JSONException -> 0x012b }
                boolean r7 = r7.has(r1)     // Catch:{ JSONException -> 0x012b }
                r8 = 1
                java.lang.String r10 = "error_subcode"
                r11 = 0
                r12 = -1
                if (r7 == 0) goto L_0x0081
                r0 = r6
                org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x012b }
                java.lang.Object r0 = p198q2.C9138d0.m18605G(r0, r1, r15)     // Catch:{ JSONException -> 0x012b }
                org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x012b }
                if (r0 == 0) goto L_0x0046
                java.lang.String r1 = "type"
                java.lang.String r1 = r0.optString(r1, r15)     // Catch:{ JSONException -> 0x012b }
                goto L_0x0047
            L_0x0046:
                r1 = r15
            L_0x0047:
                if (r0 == 0) goto L_0x0050
                java.lang.String r7 = "message"
                java.lang.String r7 = r0.optString(r7, r15)     // Catch:{ JSONException -> 0x012b }
                goto L_0x0051
            L_0x0050:
                r7 = r15
            L_0x0051:
                if (r0 == 0) goto L_0x0058
                int r4 = r0.optInt(r4, r12)     // Catch:{ JSONException -> 0x012b }
                goto L_0x0059
            L_0x0058:
                r4 = r12
            L_0x0059:
                if (r0 == 0) goto L_0x005f
                int r12 = r0.optInt(r10, r12)     // Catch:{ JSONException -> 0x012b }
            L_0x005f:
                if (r0 == 0) goto L_0x0068
                java.lang.String r10 = "error_user_msg"
                java.lang.String r10 = r0.optString(r10, r15)     // Catch:{ JSONException -> 0x012b }
                goto L_0x0069
            L_0x0068:
                r10 = r15
            L_0x0069:
                if (r0 == 0) goto L_0x0072
                java.lang.String r13 = "error_user_title"
                java.lang.String r13 = r0.optString(r13, r15)     // Catch:{ JSONException -> 0x012b }
                goto L_0x0073
            L_0x0072:
                r13 = r15
            L_0x0073:
                if (r0 == 0) goto L_0x007b
                java.lang.String r14 = "is_transient"
                boolean r11 = r0.optBoolean(r14, r11)     // Catch:{ JSONException -> 0x012b }
            L_0x007b:
                r14 = r11
                r11 = r8
                r8 = r7
                r7 = r12
                r12 = r4
                goto L_0x00ca
            L_0x0081:
                r1 = r6
                org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{ JSONException -> 0x012b }
                boolean r1 = r1.has(r0)     // Catch:{ JSONException -> 0x012b }
                java.lang.String r4 = "error_msg"
                java.lang.String r7 = "error_reason"
                if (r1 != 0) goto L_0x00a8
                r1 = r6
                org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{ JSONException -> 0x012b }
                boolean r1 = r1.has(r4)     // Catch:{ JSONException -> 0x012b }
                if (r1 != 0) goto L_0x00a8
                r1 = r6
                org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{ JSONException -> 0x012b }
                boolean r1 = r1.has(r7)     // Catch:{ JSONException -> 0x012b }
                if (r1 == 0) goto L_0x00a1
                goto L_0x00a8
            L_0x00a1:
                r14 = r11
                r7 = r12
                r4 = r15
                r8 = r4
                r10 = r8
                r13 = r10
                goto L_0x00cb
            L_0x00a8:
                r1 = r6
                org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{ JSONException -> 0x012b }
                java.lang.String r1 = r1.optString(r7, r15)     // Catch:{ JSONException -> 0x012b }
                r7 = r6
                org.json.JSONObject r7 = (org.json.JSONObject) r7     // Catch:{ JSONException -> 0x012b }
                java.lang.String r4 = r7.optString(r4, r15)     // Catch:{ JSONException -> 0x012b }
                r7 = r6
                org.json.JSONObject r7 = (org.json.JSONObject) r7     // Catch:{ JSONException -> 0x012b }
                int r0 = r7.optInt(r0, r12)     // Catch:{ JSONException -> 0x012b }
                r7 = r6
                org.json.JSONObject r7 = (org.json.JSONObject) r7     // Catch:{ JSONException -> 0x012b }
                int r7 = r7.optInt(r10, r12)     // Catch:{ JSONException -> 0x012b }
                r12 = r0
                r14 = r11
                r10 = r15
                r13 = r10
                r11 = r8
                r8 = r4
            L_0x00ca:
                r4 = r1
            L_0x00cb:
                if (r11 == 0) goto L_0x00ee
                com.facebook.k r16 = new com.facebook.k     // Catch:{ JSONException -> 0x012b }
                r11 = r6
                org.json.JSONObject r11 = (org.json.JSONObject) r11     // Catch:{ JSONException -> 0x012b }
                r17 = 0
                r18 = 0
                r0 = r16
                r1 = r5
                r2 = r12
                r3 = r7
                r5 = r8
                r6 = r13
                r7 = r10
                r8 = r11
                r9 = r20
                r10 = r21
                r11 = r22
                r12 = r17
                r13 = r14
                r14 = r18
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ JSONException -> 0x012b }
                return r16
            L_0x00ee:
                com.facebook.k$d r0 = r19.mo31611c()     // Catch:{ JSONException -> 0x012b }
                boolean r0 = r0.mo31612a(r5)     // Catch:{ JSONException -> 0x012b }
                if (r0 != 0) goto L_0x012b
                com.facebook.k r16 = new com.facebook.k     // Catch:{ JSONException -> 0x012b }
                r4 = -1
                r6 = -1
                r7 = 0
                r8 = 0
                r10 = 0
                r11 = 0
                boolean r0 = r9.has(r3)     // Catch:{ JSONException -> 0x012b }
                if (r0 == 0) goto L_0x010e
                java.lang.Object r0 = p198q2.C9138d0.m18605G(r9, r3, r2)     // Catch:{ JSONException -> 0x012b }
                org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x012b }
                r12 = r0
                goto L_0x010f
            L_0x010e:
                r12 = r15
            L_0x010f:
                r13 = 0
                r14 = 0
                r17 = 0
                r0 = r16
                r1 = r5
                r2 = r4
                r3 = r6
                r4 = r7
                r5 = r8
                r6 = r10
                r7 = r11
                r8 = r12
                r9 = r20
                r10 = r21
                r11 = r22
                r12 = r13
                r13 = r14
                r14 = r17
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ JSONException -> 0x012b }
                return r16
            L_0x012b:
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.C4550k.C4553c.mo31609a(org.json.JSONObject, java.lang.Object, java.net.HttpURLConnection):com.facebook.k");
        }

        /* renamed from: b */
        public final synchronized C9160h mo31610b() {
            C9177p j = C9181q.m18806j(FacebookSdk.getApplicationId());
            if (j != null) {
                return j.mo43455c();
            }
            return C9160h.f13389h.mo43442b();
        }

        /* renamed from: c */
        public final C4554d mo31611c() {
            return C4550k.f4214p;
        }
    }

    /* renamed from: com.facebook.k$d */
    /* compiled from: FacebookRequestError.kt */
    public static final class C4554d {

        /* renamed from: a */
        private final int f4234a;

        /* renamed from: b */
        private final int f4235b;

        public C4554d(int i, int i2) {
            this.f4234a = i;
            this.f4235b = i2;
        }

        /* renamed from: a */
        public final boolean mo31612a(int i) {
            int i2 = this.f4234a;
            int i3 = this.f4235b;
            if (i2 <= i && i3 >= i) {
                return true;
            }
            return false;
        }
    }

    public /* synthetic */ C4550k(int i, int i2, int i3, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, FacebookException facebookException, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, str, str2, str3, str4, jSONObject, jSONObject2, obj, httpURLConnection, facebookException, z);
    }

    /* renamed from: b */
    public final int mo31596b() {
        return this.f4221g;
    }

    /* renamed from: c */
    public final String mo31597c() {
        String str = this.f4216b;
        if (str != null) {
            return str;
        }
        FacebookException facebookException = this.f4217c;
        if (facebookException != null) {
            return facebookException.getLocalizedMessage();
        }
        return null;
    }

    /* renamed from: d */
    public final String mo31598d() {
        return this.f4223i;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final FacebookException mo31600e() {
        return this.f4217c;
    }

    /* renamed from: f */
    public final int mo31601f() {
        return this.f4220f;
    }

    /* renamed from: g */
    public final int mo31602g() {
        return this.f4222h;
    }

    public String toString() {
        String str = "{HttpStatus: " + this.f4220f + ", errorCode: " + this.f4221g + ", subErrorCode: " + this.f4222h + ", errorType: " + this.f4223i + ", errorMessage: " + mo31597c() + "}";
        C12775o.m28638h(str, "StringBuilder(\"{HttpStat…(\"}\")\n        .toString()");
        return str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C12775o.m28639i(parcel, "out");
        parcel.writeInt(this.f4220f);
        parcel.writeInt(this.f4221g);
        parcel.writeInt(this.f4222h);
        parcel.writeString(this.f4223i);
        parcel.writeString(mo31597c());
        parcel.writeString(this.f4224j);
        parcel.writeString(this.f4225k);
    }

    public /* synthetic */ C4550k(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    private C4550k(int i, int i2, int i3, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, FacebookException facebookException, boolean z) {
        boolean z2;
        C4551a aVar;
        this.f4220f = i;
        this.f4221g = i2;
        this.f4222h = i3;
        this.f4223i = str;
        this.f4224j = str3;
        this.f4225k = str4;
        this.f4226l = jSONObject;
        this.f4227m = jSONObject2;
        this.f4228n = obj;
        this.f4229o = httpURLConnection;
        this.f4216b = str2;
        if (facebookException != null) {
            this.f4217c = facebookException;
            z2 = true;
        } else {
            this.f4217c = new FacebookServiceException(this, mo31597c());
            z2 = false;
        }
        if (z2) {
            aVar = C4551a.OTHER;
        } else {
            aVar = f4215q.mo31610b().mo43439c(i2, i3, z);
        }
        this.f4218d = aVar;
        this.f4219e = f4215q.mo31610b().mo43440d(aVar);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @androidx.annotation.VisibleForTesting(otherwise = 4)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4550k(java.net.HttpURLConnection r15, java.lang.Exception r16) {
        /*
            r14 = this;
            r0 = r16
            r1 = -1
            r2 = -1
            r3 = -1
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            boolean r11 = r0 instanceof com.facebook.FacebookException
            if (r11 == 0) goto L_0x0014
            com.facebook.FacebookException r0 = (com.facebook.FacebookException) r0
            r12 = r0
            goto L_0x001a
        L_0x0014:
            com.facebook.FacebookException r11 = new com.facebook.FacebookException
            r11.<init>((java.lang.Throwable) r0)
            r12 = r11
        L_0x001a:
            r13 = 0
            r0 = r14
            r11 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C4550k.<init>(java.net.HttpURLConnection, java.lang.Exception):void");
    }

    public C4550k(int i, String str, String str2) {
        this(-1, i, -1, str, str2, (String) null, (String) null, (JSONObject) null, (JSONObject) null, (Object) null, (HttpURLConnection) null, (FacebookException) null, false);
    }

    private C4550k(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (JSONObject) null, (JSONObject) null, (Object) null, (HttpURLConnection) null, (FacebookException) null, false);
    }
}
