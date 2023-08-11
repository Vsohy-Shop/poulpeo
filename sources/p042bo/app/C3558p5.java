package p042bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import p126j0.C8266c;
import p126j0.C8273e;
import p126j0.C8300j;
import p404of.C13074a;

/* renamed from: bo.app.p5 */
public final class C3558p5 implements C3699t2 {

    /* renamed from: b */
    public static final C3559a f2380b = new C3559a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final SharedPreferences f2381a;

    /* renamed from: bo.app.p5$a */
    public static final class C3559a {
        public /* synthetic */ C3559a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3559a() {
        }
    }

    /* renamed from: bo.app.p5$b */
    static final class C3560b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3560b f2382b = new C3560b();

        C3560b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to set end time to now for session json data";
        }
    }

    /* renamed from: bo.app.p5$c */
    static final class C3561c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3561c f2383b = new C3561c();

        C3561c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "No stored open session in storage.";
        }
    }

    /* renamed from: bo.app.p5$d */
    static final class C3562d extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3562d f2384b = new C3562d();

        C3562d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Could not create new mutable session for open session.";
        }
    }

    public C3558p5(Context context, String str, String str2) {
        C12775o.m28639i(context, "context");
        this.f2381a = context.getSharedPreferences(C12775o.m28647q("com.appboy.storage.session_storage", C8300j.m16489c(context, str, str2)), 0);
    }

    /* renamed from: a */
    public C3208h5 mo29501a() {
        String str = "";
        if (!this.f2381a.contains("current_open_session")) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C3561c.f2383b, 7, (Object) null);
            return null;
        }
        try {
            String string = this.f2381a.getString(this.f2381a.getString("current_open_session", str), str);
            if (string != null) {
                str = string;
            }
            return new C3208h5(new JSONObject(str));
        } catch (JSONException e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C3562d.f2384b, 4, (Object) null);
            return null;
        }
    }

    /* renamed from: a */
    public void mo29502a(C3208h5 h5Var) {
        C12775o.m28639i(h5Var, "session");
        String j5Var = h5Var.mo29006n().toString();
        JSONObject e = h5Var.forJsonPut();
        SharedPreferences.Editor edit = this.f2381a.edit();
        m3639a(e);
        edit.putString(j5Var, e.toString());
        if (!h5Var.mo29011y()) {
            edit.putString("current_open_session", j5Var);
        } else if (C12775o.m28634d(this.f2381a.getString("current_open_session", ""), j5Var)) {
            edit.remove("current_open_session");
        }
        edit.apply();
    }

    /* renamed from: a */
    public void mo29503a(String str) {
        C12775o.m28639i(str, "sessionId");
        SharedPreferences.Editor edit = this.f2381a.edit();
        edit.remove(str);
        if (C12775o.m28634d(str, this.f2381a.getString("current_open_session", (String) null))) {
            edit.remove("current_open_session");
        }
        edit.apply();
    }

    /* renamed from: a */
    private final void m3639a(JSONObject jSONObject) {
        if (!jSONObject.has("end_time")) {
            try {
                jSONObject.put("end_time", C8273e.m16437j());
            } catch (JSONException e) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C3560b.f2382b, 4, (Object) null);
            }
        }
    }
}
