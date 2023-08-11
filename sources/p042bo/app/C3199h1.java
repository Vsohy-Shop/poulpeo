package p042bo.app;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import org.json.JSONArray;
import org.json.JSONObject;
import p057d0.C7210b;
import p126j0.C8266c;
import p404of.C13074a;

/* renamed from: bo.app.h1 */
public final class C3199h1 {

    /* renamed from: a */
    public static final C3199h1 f1790a = new C3199h1();

    /* renamed from: bo.app.h1$a */
    public static final class C3200a extends C12777p implements Function1<Integer, Boolean> {

        /* renamed from: b */
        final /* synthetic */ JSONArray f1791b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3200a(JSONArray jSONArray) {
            super(1);
            this.f1791b = jSONArray;
        }

        /* renamed from: a */
        public final Boolean mo28988a(int i) {
            return Boolean.valueOf(this.f1791b.opt(i) instanceof JSONObject);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo28988a(((Number) obj).intValue());
        }
    }

    /* renamed from: bo.app.h1$b */
    public static final class C3201b extends C12777p implements Function1<Integer, JSONObject> {

        /* renamed from: b */
        final /* synthetic */ JSONArray f1792b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3201b(JSONArray jSONArray) {
            super(1);
            this.f1792b = jSONArray;
        }

        /* renamed from: a */
        public final JSONObject mo28989a(int i) {
            Object obj = this.f1792b.get(i);
            if (obj != null) {
                return (JSONObject) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo28989a(((Number) obj).intValue());
        }
    }

    /* renamed from: bo.app.h1$c */
    static final class C3202c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ JSONObject f1793b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3202c(JSONObject jSONObject) {
            super(0);
            this.f1793b = jSONObject;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Failed to deserialize feature flag Json: ", this.f1793b);
        }
    }

    private C3199h1() {
    }

    /* renamed from: a */
    public final List<C7210b> mo28987a(JSONArray jSONArray) {
        C12775o.m28639i(jSONArray, "featureFlagsJson");
        ArrayList arrayList = new ArrayList();
        for (JSONObject a : C13662o.m31287t(C13662o.m31280m(C12686e0.m28213R(C13537l.m30893t(0, jSONArray.length())), new C3200a(jSONArray)), new C3201b(jSONArray))) {
            C7210b a2 = f1790a.mo28986a(a);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final C7210b mo28986a(JSONObject jSONObject) {
        C12775o.m28639i(jSONObject, "featureFlagObject");
        try {
            String string = jSONObject.getString("id");
            C12775o.m28638h(string, "featureFlagObject.getString(FeatureFlag.ID)");
            boolean z = jSONObject.getBoolean("enabled");
            JSONObject optJSONObject = jSONObject.optJSONObject("properties");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            return new C7210b(string, z, optJSONObject);
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, new C3202c(jSONObject), 4, (Object) null);
            return null;
        }
    }
}
