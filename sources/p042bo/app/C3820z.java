package p042bo.app;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: bo.app.z */
public final class C3820z {

    /* renamed from: e */
    public static final C3821a f2822e = new C3821a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final long f2823a;

    /* renamed from: b */
    private final long f2824b;

    /* renamed from: c */
    private final boolean f2825c;

    /* renamed from: d */
    private final JSONArray f2826d;

    /* renamed from: bo.app.z$a */
    public static final class C3821a {
        public /* synthetic */ C3821a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3821a() {
        }
    }

    public C3820z(JSONObject jSONObject) {
        C12775o.m28639i(jSONObject, "jsonObject");
        this.f2823a = jSONObject.optLong("last_card_updated_at", -1);
        this.f2824b = jSONObject.optLong("last_full_sync_at", -1);
        this.f2825c = jSONObject.optBoolean("full_sync", false);
        this.f2826d = jSONObject.optJSONArray("cards");
    }

    /* renamed from: a */
    public final JSONArray mo29835a() {
        return this.f2826d;
    }

    /* renamed from: b */
    public final long mo29836b() {
        return this.f2823a;
    }

    /* renamed from: c */
    public final long mo29837c() {
        return this.f2824b;
    }

    /* renamed from: d */
    public final boolean mo29838d() {
        return this.f2825c;
    }

    public C3820z(String str) {
        C12775o.m28639i(str, "serializedCardJson");
        this.f2825c = false;
        this.f2823a = -1;
        this.f2824b = -1;
        this.f2826d = new JSONArray().put(new JSONObject(str));
    }
}
