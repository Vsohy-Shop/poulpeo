package p021a3;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import com.facebook.C4509a;
import com.facebook.C4537e;
import com.facebook.C4538f;
import com.facebook.FacebookException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p021a3.C2166l;
import p033b2.C2867m;
import p198q2.C9138d0;

/* renamed from: a3.q */
/* compiled from: LoginMethodHandler */
abstract class C2188q implements Parcelable {

    /* renamed from: b */
    Map<String, String> f955b;

    /* renamed from: c */
    protected C2166l f956c;

    C2188q(C2166l lVar) {
        this.f956c = lVar;
    }

    /* renamed from: c */
    static C4509a m1710c(Bundle bundle, C4537e eVar, String str) {
        Bundle bundle2 = bundle;
        Date t = C9138d0.m18663t(bundle2, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0));
        ArrayList<String> stringArrayList = bundle2.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
        String string = bundle2.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        Date t2 = C9138d0.m18663t(bundle2, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0));
        if (C9138d0.m18618T(string)) {
            return null;
        }
        return new C4509a(string, str, bundle2.getString("com.facebook.platform.extra.USER_ID"), stringArrayList, (Collection<String>) null, (Collection<String>) null, eVar, t, new Date(), t2, bundle2.getString("graph_domain"));
    }

    /* renamed from: d */
    public static C4509a m1711d(Collection<String> collection, Bundle bundle, C4537e eVar, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Bundle bundle2 = bundle;
        Date t = C9138d0.m18663t(bundle2, "expires_in", new Date());
        String string = bundle2.getString("access_token");
        Date t2 = C9138d0.m18663t(bundle2, "data_access_expiration_time", new Date(0));
        String string2 = bundle2.getString("granted_scopes");
        if (!C9138d0.m18618T(string2)) {
            arrayList = new ArrayList(Arrays.asList(string2.split(",")));
        } else {
            arrayList = collection;
        }
        String string3 = bundle2.getString("denied_scopes");
        if (!C9138d0.m18618T(string3)) {
            arrayList2 = new ArrayList(Arrays.asList(string3.split(",")));
        } else {
            arrayList2 = null;
        }
        String string4 = bundle2.getString("expired_scopes");
        if (!C9138d0.m18618T(string4)) {
            arrayList3 = new ArrayList(Arrays.asList(string4.split(",")));
        } else {
            arrayList3 = null;
        }
        if (C9138d0.m18618T(string)) {
            return null;
        }
        return new C4509a(string, str, m1713h(bundle2.getString("signed_request")), arrayList, arrayList2, arrayList3, eVar, t, new Date(), t2, bundle2.getString("graph_domain"));
    }

    @Nullable
    /* renamed from: e */
    public static C4538f m1712e(Bundle bundle, String str) {
        String string = bundle.getString("id_token");
        if (C9138d0.m18618T(string)) {
            return null;
        }
        try {
            return new C4538f(string, str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: h */
    static String m1713h(String str) {
        if (str == null || str.isEmpty()) {
            throw new FacebookException("Authorization response does not contain the signed_request");
        }
        try {
            String[] split = str.split("\\.");
            if (split.length == 2) {
                return new JSONObject(new String(Base64.decode(split[1], 0), Constants.ENCODING)).getString("user_id");
            }
        } catch (UnsupportedEncodingException | JSONException unused) {
        }
        throw new FacebookException("Failed to retrieve user_id from signed_request");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo23463a(String str, Object obj) {
        String str2;
        if (this.f955b == null) {
            this.f955b = new HashMap();
        }
        Map<String, String> map = this.f955b;
        if (obj == null) {
            str2 = null;
        } else {
            str2 = obj.toString();
        }
        map.put(str, str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo23464f(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", str);
            jSONObject.put("3_method", mo23275g());
            mo23277m(jSONObject);
        } catch (JSONException e) {
            Log.w("LoginMethodHandler", "Error creating client state json: " + e.getMessage());
        }
        return jSONObject.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract String mo23275g();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo23465i(String str) {
        String a = this.f956c.mo23386s().mo23398a();
        C2867m mVar = new C2867m(this.f956c.mo23381i(), a);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", str);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString("app_id", a);
        mVar.mo28393h("fb_dialogs_web_login_dialog_complete", (Double) null, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo23466k() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo23276l(int i, int i2, Intent intent) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo23467n(C2166l lVar) {
        if (this.f956c == null) {
            this.f956c = lVar;
            return;
        }
        throw new FacebookException("Can't set LoginClient if it is already set.");
    }

    /* renamed from: o */
    public boolean mo23278o() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public abstract int mo23279p(C2166l.C2170d dVar);

    public void writeToParcel(Parcel parcel, int i) {
        C9138d0.m18672x0(parcel, this.f955b);
    }

    C2188q(Parcel parcel) {
        this.f955b = C9138d0.m18646k0(parcel);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo23336b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo23277m(JSONObject jSONObject) {
    }
}
