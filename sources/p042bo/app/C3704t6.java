package p042bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.appboy.enums.Gender;
import com.appboy.enums.NotificationSubscriptionType;
import com.appboy.models.outgoing.AttributionData;
import com.appboy.models.outgoing.FacebookUser;
import com.appboy.models.outgoing.TwitterUser;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import p126j0.C8266c;
import p126j0.C8278g;
import p126j0.C8300j;
import p126j0.C8303k;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: bo.app.t6 */
public final class C3704t6 extends C2956a<C3025b4> {

    /* renamed from: g */
    public static final C3705a f2618g = new C3705a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final C3429m2 f2619b;

    /* renamed from: c */
    private final C3834z4 f2620c;

    /* renamed from: d */
    private final SharedPreferences f2621d;

    /* renamed from: e */
    private final SharedPreferences f2622e;

    /* renamed from: f */
    private String f2623f;

    /* renamed from: bo.app.t6$a */
    public static final class C3705a {
        public /* synthetic */ C3705a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3705a() {
        }
    }

    /* renamed from: bo.app.t6$b */
    static final class C3706b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3706b f2624b = new C3706b();

        C3706b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "No push token available to add to attributes object.";
        }
    }

    /* renamed from: bo.app.t6$c */
    static final class C3707c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3707c f2625b = new C3707c();

        C3707c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Couldn't add push token to outbound json";
        }
    }

    /* renamed from: bo.app.t6$d */
    static final class C3708d extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3708d f2626b = new C3708d();

        C3708d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Could not create custom attributes json object from preferences";
        }
    }

    /* renamed from: bo.app.t6$e */
    static final class C3709e extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3709e f2627b = new C3709e();

        C3709e() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to add merged custom attributes back to user object.";
        }
    }

    /* renamed from: bo.app.t6$f */
    static final class C3710f extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3710f f2628b = new C3710f();

        C3710f() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Push token cache cleared.";
        }
    }

    /* renamed from: bo.app.t6$g */
    static final class C3711g extends C12777p implements Function1<String, C11921v> {

        /* renamed from: b */
        final /* synthetic */ C3704t6 f2629b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3711g(C3704t6 t6Var) {
            super(1);
            this.f2629b = t6Var;
        }

        /* renamed from: a */
        public final void mo29715a(String str) {
            C12775o.m28639i(str, "it");
            boolean unused = this.f2629b.m3919c("user_id", str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo29715a((String) obj);
            return C11921v.f18618a;
        }
    }

    /* renamed from: bo.app.t6$h */
    static final class C3712h extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f2630b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3712h(String str) {
            super(0);
            this.f2630b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Failed to load user object json from prefs with json string: ", this.f2630b);
        }
    }

    /* renamed from: bo.app.t6$i */
    static final class C3713i extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f2631b;

        /* renamed from: c */
        final /* synthetic */ JSONObject f2632c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3713i(String str, JSONObject jSONObject) {
            super(0);
            this.f2631b = str;
            this.f2632c = jSONObject;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to write to user object json from prefs with key: [" + this.f2631b + "] value: [" + this.f2632c + "] ";
        }
    }

    /* renamed from: bo.app.t6$j */
    static final class C3714j extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3714j f2633b = new C3714j();

        C3714j() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "SDK is disabled. Not writing to user cache.";
        }
    }

    /* renamed from: bo.app.t6$k */
    static final class C3715k extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f2634b;

        /* renamed from: c */
        final /* synthetic */ Object f2635c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3715k(String str, Object obj) {
            super(0);
            this.f2634b = str;
            this.f2635c = obj;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Could not write to custom attributes json object with key: [" + this.f2634b + "] value: [" + this.f2635c + ']';
        }
    }

    /* renamed from: bo.app.t6$l */
    static final class C3716l extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f2636b;

        /* renamed from: c */
        final /* synthetic */ Object f2637c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3716l(String str, Object obj) {
            super(0);
            this.f2636b = str;
            this.f2637c = obj;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to write to user object json from prefs with key: [" + this.f2636b + "] value: [" + this.f2637c + ']';
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3704t6(Context context, C3429m2 m2Var, C3834z4 z4Var, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, m2Var, z4Var, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2);
    }

    /* renamed from: e */
    private final JSONObject m3920e() {
        JSONObject g = mo29703g();
        if (g.has("custom")) {
            try {
                JSONObject jSONObject = g.getJSONObject("custom");
                C12775o.m28638h(jSONObject, "userObjectFromCache.getJ…OM_ATTRIBUTES_OBJECT_KEY)");
                return jSONObject;
            } catch (JSONException e) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C3708d.f2626b, 4, (Object) null);
            }
        }
        return new JSONObject();
    }

    /* renamed from: c */
    public final synchronized boolean mo29698c(String str) {
        return m3919c(NotificationCompat.CATEGORY_EMAIL, str);
    }

    /* renamed from: f */
    public final String mo29701f() {
        return this.f2623f;
    }

    /* renamed from: g */
    public final JSONObject mo29703g() {
        String string = this.f2621d.getString("user_cache_attributes_object", (String) null);
        if (string == null) {
            return new JSONObject();
        }
        try {
            return new JSONObject(string);
        } catch (JSONException e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, new C3712h(string), 4, (Object) null);
            return new JSONObject();
        }
    }

    /* renamed from: h */
    public final synchronized boolean mo29706h(String str) {
        return m3919c(HintConstants.AUTOFILL_HINT_PHONE, str);
    }

    /* renamed from: i */
    public final synchronized void mo29708i(String str) {
        this.f2623f = str;
        m3919c("user_id", str);
    }

    /* renamed from: j */
    public final synchronized boolean mo29709j(String str) {
        C12775o.m28639i(str, "key");
        return mo29697b(C8303k.m16497a(str), JSONObject.NULL);
    }

    public C3704t6(Context context, C3429m2 m2Var, C3834z4 z4Var, String str, String str2) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(m2Var, "pushRegistrationDataProvider");
        C12775o.m28639i(z4Var, "sdkEnablementProvider");
        this.f2619b = m2Var;
        this.f2620c = z4Var;
        this.f2623f = str;
        String c = C8300j.m16489c(context, str, str2);
        SharedPreferences sharedPreferences = context.getSharedPreferences(C12775o.m28647q("com.appboy.storage.user_cache.v3", c), 0);
        C12775o.m28638h(sharedPreferences, "context.getSharedPrefere…xt.MODE_PRIVATE\n        )");
        this.f2621d = sharedPreferences;
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(C12775o.m28647q("com.braze.storage.user_cache.push_token_store", c), 0);
        C12775o.m28638h(sharedPreferences2, "context.getSharedPrefere…xt.MODE_PRIVATE\n        )");
        this.f2622e = sharedPreferences2;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final boolean m3919c(String str, Object obj) {
        Object obj2;
        JSONObject g = mo29703g();
        if (obj == null) {
            try {
                obj2 = JSONObject.NULL;
            } catch (JSONException e) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, new C3716l(str, obj), 4, (Object) null);
                return false;
            }
        } else {
            obj2 = obj;
        }
        g.put(str, obj2);
        return m3918b(g);
    }

    /* renamed from: a */
    public final synchronized void mo29686a(Gender gender) {
        m3919c(HintConstants.AUTOFILL_HINT_GENDER, gender == null ? null : gender.forJsonPut());
    }

    /* renamed from: b */
    public final synchronized boolean mo29696b(String str) {
        C12775o.m28639i(str, "dateString");
        return m3919c("dob", str);
    }

    /* renamed from: d */
    public final synchronized void mo29699d(String str) {
        m3919c("first_name", str);
    }

    /* renamed from: f */
    public final synchronized void mo29702f(String str) {
        m3919c("language", str);
    }

    /* renamed from: h */
    public final synchronized void mo29705h() {
        C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, C3710f.f2628b, 6, (Object) null);
        this.f2622e.edit().clear().apply();
    }

    /* renamed from: a */
    public final synchronized void mo29691a(String str) {
        m3919c("country", str);
    }

    /* renamed from: b */
    public final synchronized void mo29695b(NotificationSubscriptionType notificationSubscriptionType) {
        m3919c("push_subscribe", notificationSubscriptionType == null ? null : notificationSubscriptionType.forJsonPut());
    }

    /* renamed from: i */
    public C3025b4 mo28514d() {
        C8300j.m16492f(this.f2623f, new C3711g(this));
        JSONObject g = mo29703g();
        mo29692a(g);
        this.f2621d.edit().clear().apply();
        return new C3025b4(g);
    }

    /* renamed from: a */
    public final synchronized void mo29687a(NotificationSubscriptionType notificationSubscriptionType) {
        m3919c("email_subscribe", notificationSubscriptionType == null ? null : notificationSubscriptionType.forJsonPut());
    }

    /* renamed from: b */
    private final boolean m3918b(JSONObject jSONObject) {
        if (this.f2620c.mo29850a()) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C3714j.f2633b, 6, (Object) null);
            return false;
        }
        this.f2621d.edit().putString("user_cache_attributes_object", jSONObject.toString()).apply();
        return true;
    }

    /* renamed from: a */
    public final synchronized void mo29690a(TwitterUser twitterUser) {
        mo29694a("twitter", twitterUser == null ? null : twitterUser.forJsonPut());
    }

    /* renamed from: g */
    public final synchronized void mo29704g(String str) {
        m3919c("last_name", str);
    }

    /* renamed from: a */
    public final synchronized void mo29689a(FacebookUser facebookUser) {
        mo29694a("facebook", facebookUser == null ? null : facebookUser.forJsonPut());
    }

    /* renamed from: e */
    public final synchronized void mo29700e(String str) {
        m3919c("home_city", str);
    }

    /* renamed from: a */
    public final synchronized void mo29688a(AttributionData attributionData) {
        mo29694a("ab_install_attribution", attributionData == null ? null : attributionData.forJsonPut());
    }

    /* renamed from: a */
    public final synchronized boolean mo29693a(String str, Object obj) {
        C12775o.m28639i(str, "key");
        C12775o.m28639i(obj, "value");
        return mo29697b(str, obj);
    }

    /* renamed from: a */
    public final void mo29692a(JSONObject jSONObject) {
        C12775o.m28639i(jSONObject, "outboundJson");
        try {
            String a = this.f2619b.mo29312a();
            if (a == null) {
                C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3706b.f2624b, 7, (Object) null);
            } else if (!C12775o.m28634d(a, this.f2622e.getString("push_token", (String) null))) {
                jSONObject.put("push_token", a);
            }
        } catch (JSONException e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C3707c.f2625b, 4, (Object) null);
        }
    }

    /* renamed from: b */
    public final boolean mo29697b(String str, Object obj) {
        Object obj2;
        C12775o.m28639i(str, "key");
        JSONObject e = m3920e();
        if (obj == null) {
            try {
                obj2 = JSONObject.NULL;
            } catch (JSONException e2) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e2, false, new C3715k(str, obj), 4, (Object) null);
                return false;
            }
        } else {
            obj2 = obj;
        }
        e.put(str, obj2);
        return m3919c("custom", e);
    }

    /* renamed from: a */
    public void mo28511b(C3025b4 b4Var, boolean z) {
        C12775o.m28639i(b4Var, "outboundObject");
        JSONObject w = b4Var.mo28662w();
        if (!z) {
            JSONObject g = mo29703g();
            JSONObject o = C8278g.m16461o(w, g);
            o.remove("push_token");
            JSONObject optJSONObject = g.optJSONObject("custom");
            JSONObject optJSONObject2 = w.optJSONObject("custom");
            if (optJSONObject != null && optJSONObject2 != null) {
                try {
                    o.put("custom", C8278g.m16461o(optJSONObject2, optJSONObject));
                } catch (JSONException e) {
                    C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C3709e.f2627b, 4, (Object) null);
                }
            } else if (optJSONObject != null) {
                o.put("custom", optJSONObject);
            } else if (optJSONObject2 != null) {
                o.put("custom", optJSONObject2);
            }
            this.f2621d.edit().putString("user_cache_attributes_object", o.toString()).apply();
        } else if (w.has("push_token")) {
            this.f2622e.edit().putString("push_token", w.optString("push_token")).apply();
        }
    }

    /* renamed from: a */
    public final boolean mo29694a(String str, JSONObject jSONObject) {
        C12775o.m28639i(str, "key");
        JSONObject g = mo29703g();
        if (jSONObject == null) {
            try {
                g.put(str, JSONObject.NULL);
            } catch (JSONException e) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, new C3713i(str, jSONObject), 4, (Object) null);
                return false;
            }
        } else {
            JSONObject optJSONObject = g.optJSONObject(str);
            if (optJSONObject != null) {
                g.put(str, C8278g.m16461o(optJSONObject, jSONObject));
            } else {
                g.put(str, jSONObject);
            }
        }
        return m3918b(g);
    }
}
