package p395nc;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: nc.a */
/* compiled from: SignInWebViewDialogFragment.kt */
public final class C12982a implements Parcelable {
    public static final C12983a CREATOR = new C12983a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final String f20777b;

    /* renamed from: c */
    private final String f20778c;

    /* renamed from: d */
    private final String f20779d;

    /* renamed from: nc.a$a */
    /* compiled from: SignInWebViewDialogFragment.kt */
    public static final class C12983a implements Parcelable.Creator<C12982a> {
        private C12983a() {
        }

        public /* synthetic */ C12983a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C12982a mo50896a(String str, String str2) {
            C12775o.m28639i(str, "clientId");
            C12775o.m28639i(str2, "redirectUrl");
            String uuid = UUID.randomUUID().toString();
            C12775o.m28638h(uuid, "randomUUID().toString()");
            Uri.Builder buildUpon = Uri.parse("https://appleid.apple.com/auth/authorize").buildUpon();
            buildUpon.appendQueryParameter("client_id", str);
            buildUpon.appendQueryParameter("redirect_uri", str2);
            buildUpon.appendQueryParameter("response_type", "code id_token");
            buildUpon.appendQueryParameter("scope", "name email");
            buildUpon.appendQueryParameter("response_mode", "form_post");
            buildUpon.appendQueryParameter("state", uuid);
            String uri = buildUpon.build().toString();
            C12775o.m28638h(uri, "parse(BaseSignInWithAppl…              .toString()");
            return new C12982a(uri, str2, uuid);
        }

        /* renamed from: b */
        public C12982a createFromParcel(Parcel parcel) {
            C12775o.m28639i(parcel, "parcel");
            return new C12982a(parcel);
        }

        /* renamed from: c */
        public C12982a[] newArray(int i) {
            return new C12982a[i];
        }
    }

    public C12982a(String str, String str2, String str3) {
        C12775o.m28639i(str, "authenticationUrl");
        C12775o.m28639i(str2, "redirectUrl");
        C12775o.m28639i(str3, "state");
        this.f20777b = str;
        this.f20778c = str2;
        this.f20779d = str3;
    }

    /* renamed from: a */
    public final String mo50888a() {
        return this.f20777b;
    }

    /* renamed from: b */
    public final String mo50889b() {
        return this.f20778c;
    }

    /* renamed from: c */
    public final String mo50890c() {
        return this.f20779d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12982a)) {
            return false;
        }
        C12982a aVar = (C12982a) obj;
        if (C12775o.m28634d(this.f20777b, aVar.f20777b) && C12775o.m28634d(this.f20778c, aVar.f20778c) && C12775o.m28634d(this.f20779d, aVar.f20779d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f20777b.hashCode() * 31) + this.f20778c.hashCode()) * 31) + this.f20779d.hashCode();
    }

    public String toString() {
        String str = this.f20777b;
        String str2 = this.f20778c;
        String str3 = this.f20779d;
        return "AuthenticationAttempt(authenticationUrl=" + str + ", redirectUrl=" + str2 + ", state=" + str3 + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C12775o.m28639i(parcel, "parcel");
        parcel.writeString(this.f20777b);
        parcel.writeString(this.f20778c);
        parcel.writeString(this.f20779d);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C12982a(android.os.Parcel r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.C12775o.m28639i(r4, r0)
            java.lang.String r0 = r4.readString()
            java.lang.String r1 = "invalid"
            if (r0 != 0) goto L_0x000e
            r0 = r1
        L_0x000e:
            java.lang.String r2 = r4.readString()
            if (r2 != 0) goto L_0x0015
            r2 = r1
        L_0x0015:
            java.lang.String r4 = r4.readString()
            if (r4 != 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r1 = r4
        L_0x001d:
            r3.<init>(r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p395nc.C12982a.<init>(android.os.Parcel):void");
    }
}
