package p021a3;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.C4537e;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookSdk;
import org.json.JSONException;
import org.json.JSONObject;
import p021a3.C2166l;
import p198q2.C9138d0;
import p198q2.C9143e;
import p198q2.C9145f;
import p198q2.C9187r;

/* renamed from: a3.a */
/* compiled from: CustomTabLoginMethodHandler */
public class C2137a extends C2195w {
    public static final Parcelable.Creator<C2137a> CREATOR = new C2138a();

    /* renamed from: h */
    public static boolean f818h = false;

    /* renamed from: e */
    private String f819e;

    /* renamed from: f */
    private String f820f;

    /* renamed from: g */
    private String f821g;

    /* renamed from: a3.a$a */
    /* compiled from: CustomTabLoginMethodHandler */
    static class C2138a implements Parcelable.Creator {
        C2138a() {
        }

        /* renamed from: a */
        public C2137a createFromParcel(Parcel parcel) {
            return new C2137a(parcel);
        }

        /* renamed from: b */
        public C2137a[] newArray(int i) {
            return new C2137a[i];
        }
    }

    C2137a(C2166l lVar) {
        super(lVar);
        this.f821g = "";
        this.f820f = C9138d0.m18655p(20);
        f818h = false;
        this.f821g = C9145f.m18696c(m1499D());
    }

    /* renamed from: C */
    private String m1498C() {
        String str = this.f819e;
        if (str != null) {
            return str;
        }
        String a = C9145f.m18694a();
        this.f819e = a;
        return a;
    }

    /* renamed from: D */
    private String m1499D() {
        return super.mo23280v();
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a1  */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1500E(java.lang.String r7, p021a3.C2166l.C2170d r8) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x00bb
            java.lang.String r0 = "fbconnect://cct."
            boolean r0 = r7.startsWith(r0)
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = super.mo23280v()
            boolean r0 = r7.startsWith(r0)
            if (r0 == 0) goto L_0x00bb
        L_0x0014:
            android.net.Uri r7 = android.net.Uri.parse(r7)
            java.lang.String r0 = r7.getQuery()
            android.os.Bundle r0 = p198q2.C9138d0.m18636f0(r0)
            java.lang.String r7 = r7.getFragment()
            android.os.Bundle r7 = p198q2.C9138d0.m18636f0(r7)
            r0.putAll(r7)
            boolean r7 = r6.m1501F(r0)
            r1 = 0
            if (r7 != 0) goto L_0x003d
            com.facebook.FacebookException r7 = new com.facebook.FacebookException
            java.lang.String r0 = "Invalid state parameter"
            r7.<init>((java.lang.String) r0)
            super.mo23480z(r8, r1, r7)
            return
        L_0x003d:
            java.lang.String r7 = "error"
            java.lang.String r7 = r0.getString(r7)
            if (r7 != 0) goto L_0x004b
            java.lang.String r7 = "error_type"
            java.lang.String r7 = r0.getString(r7)
        L_0x004b:
            java.lang.String r2 = "error_msg"
            java.lang.String r2 = r0.getString(r2)
            if (r2 != 0) goto L_0x0059
            java.lang.String r2 = "error_message"
            java.lang.String r2 = r0.getString(r2)
        L_0x0059:
            if (r2 != 0) goto L_0x0061
            java.lang.String r2 = "error_description"
            java.lang.String r2 = r0.getString(r2)
        L_0x0061:
            java.lang.String r3 = "error_code"
            java.lang.String r3 = r0.getString(r3)
            boolean r4 = p198q2.C9138d0.m18618T(r3)
            r5 = -1
            if (r4 != 0) goto L_0x0073
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0073 }
            goto L_0x0074
        L_0x0073:
            r3 = r5
        L_0x0074:
            boolean r4 = p198q2.C9138d0.m18618T(r7)
            if (r4 == 0) goto L_0x0086
            boolean r4 = p198q2.C9138d0.m18618T(r2)
            if (r4 == 0) goto L_0x0086
            if (r3 != r5) goto L_0x0086
            super.mo23480z(r8, r0, r1)
            goto L_0x00bb
        L_0x0086:
            if (r7 == 0) goto L_0x00a1
            java.lang.String r0 = "access_denied"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0098
            java.lang.String r0 = "OAuthAccessDeniedException"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x00a1
        L_0x0098:
            com.facebook.FacebookOperationCanceledException r7 = new com.facebook.FacebookOperationCanceledException
            r7.<init>()
            super.mo23480z(r8, r1, r7)
            goto L_0x00bb
        L_0x00a1:
            r0 = 4201(0x1069, float:5.887E-42)
            if (r3 != r0) goto L_0x00ae
            com.facebook.FacebookOperationCanceledException r7 = new com.facebook.FacebookOperationCanceledException
            r7.<init>()
            super.mo23480z(r8, r1, r7)
            goto L_0x00bb
        L_0x00ae:
            com.facebook.k r0 = new com.facebook.k
            r0.<init>(r3, r7, r2)
            com.facebook.FacebookServiceException r7 = new com.facebook.FacebookServiceException
            r7.<init>(r0, r2)
            super.mo23480z(r8, r1, r7)
        L_0x00bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p021a3.C2137a.m1500E(java.lang.String, a3.l$d):void");
    }

    /* renamed from: F */
    private boolean m1501F(Bundle bundle) {
        try {
            String string = bundle.getString("state");
            if (string == null) {
                return false;
            }
            return new JSONObject(string).getString("7_challenge").equals(this.f820f);
        } catch (JSONException unused) {
            return false;
        }
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo23275g() {
        return "custom_tab";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo23276l(int i, int i2, Intent intent) {
        if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.f4088j, false)) {
            return super.mo23276l(i, i2, intent);
        }
        if (i != 1) {
            return super.mo23276l(i, i2, intent);
        }
        C2166l.C2170d s = this.f956c.mo23386s();
        if (i2 == -1) {
            m1500E(intent.getStringExtra(CustomTabMainActivity.f4085g), s);
            return true;
        }
        super.mo23480z(s, (Bundle) null, new FacebookOperationCanceledException());
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo23277m(JSONObject jSONObject) {
        jSONObject.put("7_challenge", this.f820f);
    }

    /* renamed from: o */
    public /* bridge */ /* synthetic */ boolean mo23278o() {
        return super.mo23278o();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public int mo23279p(C2166l.C2170d dVar) {
        if (mo23280v().isEmpty()) {
            return 0;
        }
        Bundle q = mo23478q(mo23479s(dVar), dVar);
        if (f818h) {
            q.putString("cct_over_app_switch", "1");
        }
        if (FacebookSdk.hasCustomTabsPrefetching) {
            if (dVar.mo23413p()) {
                C2139b.m1513b(C9187r.m18814a("oauth", q));
            } else {
                C2139b.m1513b(C9143e.m18680a("oauth", q));
            }
        }
        Intent intent = new Intent(this.f956c.mo23381i(), CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.f4082d, "oauth");
        intent.putExtra(CustomTabMainActivity.f4083e, q);
        intent.putExtra(CustomTabMainActivity.f4084f, m1498C());
        intent.putExtra(CustomTabMainActivity.f4086h, dVar.mo23406h().toString());
        this.f956c.mo23383m().startActivityForResult(intent, 1);
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public String mo23280v() {
        return this.f821g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public String mo23281w() {
        return "chrome_custom_tab";
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f820f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public C4537e mo23283x() {
        return C4537e.CHROME_CUSTOM_TAB;
    }

    C2137a(Parcel parcel) {
        super(parcel);
        this.f821g = "";
        this.f820f = parcel.readString();
    }
}
