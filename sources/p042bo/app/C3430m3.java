package p042bo.app;

import java.util.ArrayList;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import org.json.JSONObject;
import p126j0.C8266c;
import p126j0.C8278g;
import p336ef.C11906l;
import p404of.C13074a;

/* renamed from: bo.app.m3 */
public final class C3430m3 implements C3315k2 {

    /* renamed from: a */
    private final C3315k2 f2164a;

    /* renamed from: bo.app.m3$a */
    static final class C3431a extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3753v4 f2165b;

        /* renamed from: c */
        final /* synthetic */ Map<String, String> f2166c;

        /* renamed from: d */
        final /* synthetic */ JSONObject f2167d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3431a(C3753v4 v4Var, Map<String, String> map, JSONObject jSONObject) {
            super(0);
            this.f2165b = v4Var;
            this.f2166c = map;
            this.f2167d = jSONObject;
        }

        /* renamed from: a */
        public final String invoke() {
            return C3745v1.m4013a(this.f2165b, this.f2166c, this.f2167d);
        }
    }

    /* renamed from: bo.app.m3$b */
    static final class C3432b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3430m3 f2168b;

        /* renamed from: c */
        final /* synthetic */ C3753v4 f2169c;

        /* renamed from: d */
        final /* synthetic */ Map<String, String> f2170d;

        /* renamed from: e */
        final /* synthetic */ Lazy<String> f2171e;

        /* renamed from: f */
        final /* synthetic */ JSONObject f2172f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3432b(C3430m3 m3Var, C3753v4 v4Var, Map<String, String> map, Lazy<String> lazy, JSONObject jSONObject) {
            super(0);
            this.f2168b = m3Var;
            this.f2169c = v4Var;
            this.f2170d = map;
            this.f2171e = lazy;
            this.f2172f = jSONObject;
        }

        /* renamed from: a */
        public final String invoke() {
            return this.f2168b.m3408a(this.f2169c, this.f2170d, this.f2171e.getValue(), this.f2172f);
        }
    }

    /* renamed from: bo.app.m3$c */
    static final class C3433c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3433c f2173b = new C3433c();

        C3433c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Exception while logging request: ";
        }
    }

    /* renamed from: bo.app.m3$d */
    static final class C3434d extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ JSONObject f2174b;

        /* renamed from: c */
        final /* synthetic */ Lazy<String> f2175c;

        /* renamed from: d */
        final /* synthetic */ long f2176d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3434d(JSONObject jSONObject, Lazy<String> lazy, long j) {
            super(0);
            this.f2174b = jSONObject;
            this.f2175c = lazy;
            this.f2176d = j;
        }

        /* renamed from: a */
        public final String invoke() {
            String str;
            JSONObject jSONObject = this.f2174b;
            if (jSONObject == null || (str = C8278g.m16456j(jSONObject)) == null) {
                str = "none";
            }
            return "Result(id = " + this.f2175c.getValue() + " time = " + this.f2176d + "ms)\n" + str;
        }
    }

    /* renamed from: bo.app.m3$e */
    static final class C3435e extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3435e f2177b = new C3435e();

        C3435e() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Exception while logging result: ";
        }
    }

    public C3430m3(C3315k2 k2Var) {
        C12775o.m28639i(k2Var, "httpConnector");
        this.f2164a = k2Var;
    }

    /* renamed from: a */
    public C11906l<JSONObject, Map<String, String>> mo29194a(C3753v4 v4Var, Map<String, String> map, JSONObject jSONObject) {
        C12775o.m28639i(v4Var, "requestTarget");
        C12775o.m28639i(map, "requestHeaders");
        C12775o.m28639i(jSONObject, "payload");
        Lazy b = C11901h.m25690b(new C3431a(v4Var, map, jSONObject));
        m3409a(v4Var, map, (Lazy<String>) b, jSONObject);
        long currentTimeMillis = System.currentTimeMillis();
        C11906l<JSONObject, Map<String, String>> a = this.f2164a.mo29194a(v4Var, map, jSONObject);
        m3410a(a.mo49111c(), (Lazy<String>) b, System.currentTimeMillis() - currentTimeMillis);
        return a;
    }

    /* renamed from: a */
    private final void m3409a(C3753v4 v4Var, Map<String, String> map, Lazy<String> lazy, JSONObject jSONObject) {
        try {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3432b(this, v4Var, map, lazy, jSONObject), 7, (Object) null);
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C3433c.f2173b, 4, (Object) null);
        }
    }

    /* renamed from: a */
    private final void m3410a(JSONObject jSONObject, Lazy<String> lazy, long j) {
        try {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3434d(jSONObject, lazy, j), 7, (Object) null);
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C3435e.f2177b, 4, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final String m3408a(C3753v4 v4Var, Map<String, String> map, String str, JSONObject jSONObject) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("\n            |Making request with id => \"");
        sb.append(str);
        sb.append("\"\n            |to url: ");
        sb.append(v4Var);
        sb.append("\n            \n            |with headers:\n            ");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            arrayList.add("|\"" + ((String) next.getKey()) + "\" => \"" + ((String) next.getValue()) + '\"');
        }
        sb.append(C12686e0.m28229h0(arrayList, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
        sb.append("\n            |\n            |");
        if (jSONObject == null) {
            str2 = "";
        } else {
            str2 = C12775o.m28647q("and JSON :\n", C8278g.m16456j(jSONObject));
        }
        sb.append(str2);
        sb.append("\n        ");
        return C13745o.m31513h(sb.toString(), (String) null, 1, (Object) null);
    }
}
