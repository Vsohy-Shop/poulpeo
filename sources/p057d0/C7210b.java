package p057d0;

import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import p126j0.C8266c;
import p126j0.C8278g;
import p404of.C13074a;

/* renamed from: d0.b */
public final class C7210b implements C7213c<JSONObject> {

    /* renamed from: e */
    public static final C7211a f9893e = new C7211a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final String f9894b;

    /* renamed from: c */
    private final boolean f9895c;

    /* renamed from: d */
    private final JSONObject f9896d;

    /* renamed from: d0.b$a */
    public static final class C7211a {
        public /* synthetic */ C7211a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C7211a() {
        }
    }

    /* renamed from: d0.b$b */
    static final class C7212b extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7212b f9897g = new C7212b();

        C7212b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Caught exception creating FeatureFlag Json.";
        }
    }

    public C7210b(String str, boolean z, JSONObject jSONObject) {
        C12775o.m28639i(str, "id");
        C12775o.m28639i(jSONObject, "properties");
        this.f9894b = str;
        this.f9895c = z;
        this.f9896d = jSONObject;
    }

    /* renamed from: e */
    public final C7210b mo40767e() {
        return new C7210b(this.f9894b, this.f9895c, C8278g.m16452f(this.f9896d));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7210b)) {
            return false;
        }
        C7210b bVar = (C7210b) obj;
        if (C12775o.m28634d(this.f9894b, bVar.f9894b) && this.f9895c == bVar.f9895c && C12775o.m28634d(this.f9896d, bVar.f9896d)) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.f9894b;
    }

    public int hashCode() {
        int hashCode = this.f9894b.hashCode() * 31;
        boolean z = this.f9895c;
        if (z) {
            z = true;
        }
        return ((hashCode + (z ? 1 : 0)) * 31) + this.f9896d.hashCode();
    }

    public String toString() {
        return "FeatureFlag(id=" + this.f9894b + ", enabled=" + this.f9895c + ", properties=" + this.f9896d + ')';
    }

    /* renamed from: v */
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f9894b);
            jSONObject.put("enabled", this.f9895c);
            jSONObject.put("properties", this.f9896d);
        } catch (JSONException e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C7212b.f9897g, 4, (Object) null);
        }
        return jSONObject;
    }
}
