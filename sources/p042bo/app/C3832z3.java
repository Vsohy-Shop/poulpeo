package p042bo.app;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import p057d0.C7213c;

/* renamed from: bo.app.z3 */
public final class C3832z3 implements C7213c<JSONObject>, C3223i2 {

    /* renamed from: d */
    public static final C3833a f2846d = new C3833a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final long f2847b;

    /* renamed from: c */
    private final boolean f2848c;

    /* renamed from: bo.app.z3$a */
    public static final class C3833a {
        public /* synthetic */ C3833a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3833a() {
        }
    }

    public C3832z3(long j, boolean z) {
        this.f2847b = j;
        this.f2848c = z;
    }

    /* renamed from: e */
    public boolean mo28586e() {
        return !this.f2848c;
    }

    /* renamed from: v */
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("config_time", this.f2847b);
        return jSONObject;
    }
}
