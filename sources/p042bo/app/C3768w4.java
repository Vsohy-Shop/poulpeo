package p042bo.app;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import p126j0.C8266c;
import p404of.C13074a;

/* renamed from: bo.app.w4 */
public final class C3768w4 implements C3632r2 {

    /* renamed from: i */
    public static final C3769a f2725i = new C3769a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final long f2726b;

    /* renamed from: c */
    private final long f2727c;

    /* renamed from: d */
    private final int f2728d;

    /* renamed from: e */
    private final int f2729e;

    /* renamed from: f */
    private final int f2730f;

    /* renamed from: g */
    private final C3463n2 f2731g;

    /* renamed from: h */
    private final int f2732h;

    /* renamed from: bo.app.w4$a */
    public static final class C3769a {
        public /* synthetic */ C3769a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3769a() {
        }
    }

    /* renamed from: bo.app.w4$b */
    static final class C3770b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3770b f2733b = new C3770b();

        C3770b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Could not convert ScheduleConfig to JSON";
        }
    }

    public C3768w4(JSONObject jSONObject) {
        C12775o.m28639i(jSONObject, "json");
        this.f2726b = jSONObject.optLong("start_time", -1);
        this.f2727c = jSONObject.optLong("end_time", -1);
        this.f2728d = jSONObject.optInt("priority", 0);
        this.f2732h = jSONObject.optInt("min_seconds_since_last_trigger", -1);
        this.f2729e = jSONObject.optInt("delay", 0);
        this.f2730f = jSONObject.optInt("timeout", -1);
        this.f2731g = new C3436m4(jSONObject);
    }

    /* renamed from: a */
    public int mo29594a() {
        return this.f2730f;
    }

    /* renamed from: c */
    public long mo29595c() {
        return this.f2726b;
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObject = (JSONObject) mo29599t().forJsonPut();
            if (jSONObject == null) {
                return null;
            }
            jSONObject.put("start_time", mo29595c());
            jSONObject.put("end_time", mo29597h());
            jSONObject.put("priority", mo29600u());
            jSONObject.put("min_seconds_since_last_trigger", mo29598l());
            jSONObject.put("timeout", mo29594a());
            jSONObject.put("delay", mo29596g());
            return jSONObject;
        } catch (JSONException e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C3770b.f2733b, 4, (Object) null);
            return null;
        }
    }

    /* renamed from: g */
    public int mo29596g() {
        return this.f2729e;
    }

    /* renamed from: h */
    public long mo29597h() {
        return this.f2727c;
    }

    /* renamed from: l */
    public int mo29598l() {
        return this.f2732h;
    }

    /* renamed from: t */
    public C3463n2 mo29599t() {
        return this.f2731g;
    }

    /* renamed from: u */
    public int mo29600u() {
        return this.f2728d;
    }
}
