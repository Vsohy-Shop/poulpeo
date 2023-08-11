package p042bo.app;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import p042bo.app.C3289j5;
import p057d0.C7213c;
import p126j0.C8266c;
import p126j0.C8278g;
import p404of.C13074a;

/* renamed from: bo.app.h5 */
public class C3208h5 implements C7213c<JSONObject> {

    /* renamed from: f */
    public static final C3209a f1804f = new C3209a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final C3289j5 f1805b;

    /* renamed from: c */
    private final double f1806c;

    /* renamed from: d */
    private volatile Double f1807d;

    /* renamed from: e */
    private volatile boolean f1808e;

    /* renamed from: bo.app.h5$a */
    public static final class C3209a {
        public /* synthetic */ C3209a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3209a() {
        }
    }

    /* renamed from: bo.app.h5$b */
    static final class C3210b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ double f1809b;

        /* renamed from: c */
        final /* synthetic */ C3208h5 f1810c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3210b(double d, C3208h5 h5Var) {
            super(0);
            this.f1809b = d;
            this.f1810c = h5Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return "End time '" + this.f1809b + "' for session is less than the start time '" + this.f1810c.mo29010x() + "' for this session.";
        }
    }

    /* renamed from: bo.app.h5$c */
    static final class C3211c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3211c f1811b = new C3211c();

        C3211c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Caught exception creating Session Json.";
        }
    }

    public C3208h5(C3289j5 j5Var, double d, Double d2, boolean z) {
        C12775o.m28639i(j5Var, "sessionId");
        this.f1805b = j5Var;
        this.f1806c = d;
        mo29003a(d2);
        this.f1808e = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29003a(Double d) {
        this.f1807d = d;
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("session_id", this.f1805b);
            jSONObject.put("start_time", this.f1806c);
            jSONObject.put("is_sealed", this.f1808e);
            if (mo29009w() != null) {
                jSONObject.put("end_time", mo29009w());
            }
        } catch (JSONException e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C3211c.f1811b, 4, (Object) null);
        }
        return jSONObject;
    }

    /* renamed from: n */
    public final C3289j5 mo29006n() {
        return this.f1805b;
    }

    public String toString() {
        return "\nSession(sessionId=" + this.f1805b + ", startTime=" + this.f1806c + ", endTime=" + mo29009w() + ", isSealed=" + this.f1808e + ", duration=" + mo29008v() + ')';
    }

    /* renamed from: v */
    public final long mo29008v() {
        Double w = mo29009w();
        if (w == null) {
            return -1;
        }
        double doubleValue = w.doubleValue();
        long j = (long) (doubleValue - this.f1806c);
        if (j < 0) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, new C3210b(doubleValue, this), 6, (Object) null);
        }
        return j;
    }

    /* renamed from: w */
    public Double mo29009w() {
        return this.f1807d;
    }

    /* renamed from: x */
    public final double mo29010x() {
        return this.f1806c;
    }

    /* renamed from: y */
    public final boolean mo29011y() {
        return this.f1808e;
    }

    /* renamed from: z */
    public final C3585q3 mo29012z() {
        return new C3585q3(this.f1805b, this.f1806c, mo29009w(), this.f1808e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29004a(boolean z) {
        this.f1808e = z;
    }

    public C3208h5(JSONObject jSONObject) {
        C12775o.m28639i(jSONObject, "sessionData");
        C3289j5.C3290a aVar = C3289j5.f1947d;
        String string = jSONObject.getString("session_id");
        C12775o.m28638h(string, "sessionData.getString(SESSION_ID_KEY)");
        this.f1805b = aVar.mo29165a(string);
        this.f1806c = jSONObject.getDouble("start_time");
        this.f1808e = jSONObject.getBoolean("is_sealed");
        mo29003a(C8278g.m16454h(jSONObject, "end_time"));
    }
}
