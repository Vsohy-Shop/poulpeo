package p071e2;

import androidx.autofill.HintConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: e2.b */
/* compiled from: ParameterComponent.kt */
public final class C7447b {

    /* renamed from: e */
    public static final C7448a f10307e = new C7448a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final String f10308a;

    /* renamed from: b */
    private final String f10309b;

    /* renamed from: c */
    private final List<C7449c> f10310c;

    /* renamed from: d */
    private final String f10311d;

    /* renamed from: e2.b$a */
    /* compiled from: ParameterComponent.kt */
    public static final class C7448a {
        private C7448a() {
        }

        public /* synthetic */ C7448a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C7447b(JSONObject jSONObject) {
        C12775o.m28639i(jSONObject, "component");
        String string = jSONObject.getString(HintConstants.AUTOFILL_HINT_NAME);
        C12775o.m28638h(string, "component.getString(PARAMETER_NAME_KEY)");
        this.f10308a = string;
        String optString = jSONObject.optString("value");
        C12775o.m28638h(optString, "component.optString(PARAMETER_VALUE_KEY)");
        this.f10309b = optString;
        String optString2 = jSONObject.optString("path_type", "absolute");
        C12775o.m28638h(optString2, "component.optString(Cons…tants.PATH_TYPE_ABSOLUTE)");
        this.f10311d = optString2;
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("path");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                C12775o.m28638h(jSONObject2, "jsonPathArray.getJSONObject(i)");
                arrayList.add(new C7449c(jSONObject2));
            }
        }
        this.f10310c = arrayList;
    }

    /* renamed from: a */
    public final String mo41118a() {
        return this.f10308a;
    }

    /* renamed from: b */
    public final List<C7449c> mo41119b() {
        return this.f10310c;
    }

    /* renamed from: c */
    public final String mo41120c() {
        return this.f10311d;
    }

    /* renamed from: d */
    public final String mo41121d() {
        return this.f10309b;
    }
}
