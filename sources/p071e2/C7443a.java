package p071e2;

import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: e2.a */
/* compiled from: EventBinding.kt */
public final class C7443a {

    /* renamed from: j */
    public static final C7445b f10290j = new C7445b((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final String f10291a;

    /* renamed from: b */
    private final C7446c f10292b;

    /* renamed from: c */
    private final C7444a f10293c;

    /* renamed from: d */
    private final String f10294d;

    /* renamed from: e */
    private final List<C7449c> f10295e;

    /* renamed from: f */
    private final List<C7447b> f10296f;

    /* renamed from: g */
    private final String f10297g;

    /* renamed from: h */
    private final String f10298h;

    /* renamed from: i */
    private final String f10299i;

    /* renamed from: e2.a$a */
    /* compiled from: EventBinding.kt */
    public enum C7444a {
        CLICK,
        SELECTED,
        TEXT_CHANGED
    }

    /* renamed from: e2.a$b */
    /* compiled from: EventBinding.kt */
    public static final class C7445b {
        private C7445b() {
        }

        public /* synthetic */ C7445b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7443a mo41116a(JSONObject jSONObject) {
            C12775o.m28639i(jSONObject, "mapping");
            String string = jSONObject.getString("event_name");
            String string2 = jSONObject.getString("method");
            C12775o.m28638h(string2, "mapping.getString(\"method\")");
            Locale locale = Locale.ENGLISH;
            C12775o.m28638h(locale, "Locale.ENGLISH");
            if (string2 != null) {
                String upperCase = string2.toUpperCase(locale);
                C12775o.m28638h(upperCase, "(this as java.lang.String).toUpperCase(locale)");
                C7446c valueOf = C7446c.valueOf(upperCase);
                String string3 = jSONObject.getString("event_type");
                C12775o.m28638h(string3, "mapping.getString(\"event_type\")");
                C12775o.m28638h(locale, "Locale.ENGLISH");
                if (string3 != null) {
                    String upperCase2 = string3.toUpperCase(locale);
                    C12775o.m28638h(upperCase2, "(this as java.lang.String).toUpperCase(locale)");
                    C7444a valueOf2 = C7444a.valueOf(upperCase2);
                    String string4 = jSONObject.getString("app_version");
                    JSONArray jSONArray = jSONObject.getJSONArray("path");
                    ArrayList arrayList = new ArrayList();
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        C12775o.m28638h(jSONObject2, "jsonPath");
                        arrayList.add(new C7449c(jSONObject2));
                    }
                    String optString = jSONObject.optString("path_type", "absolute");
                    JSONArray optJSONArray = jSONObject.optJSONArray("parameters");
                    ArrayList arrayList2 = new ArrayList();
                    if (optJSONArray != null) {
                        int length2 = optJSONArray.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            JSONObject jSONObject3 = optJSONArray.getJSONObject(i2);
                            C12775o.m28638h(jSONObject3, "jsonParameter");
                            arrayList2.add(new C7447b(jSONObject3));
                        }
                    }
                    String optString2 = jSONObject.optString("component_id");
                    String optString3 = jSONObject.optString("activity_name");
                    C12775o.m28638h(string, "eventName");
                    C12775o.m28638h(string4, "appVersion");
                    C12775o.m28638h(optString2, "componentId");
                    C12775o.m28638h(optString, "pathType");
                    C12775o.m28638h(optString3, "activityName");
                    return new C7443a(string, valueOf, valueOf2, string4, arrayList, arrayList2, optString2, optString, optString3);
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }

        /* renamed from: b */
        public final List<C7443a> mo41117b(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                try {
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        C12775o.m28638h(jSONObject, "array.getJSONObject(i)");
                        arrayList.add(mo41116a(jSONObject));
                    }
                } catch (IllegalArgumentException | JSONException unused) {
                }
            }
            return arrayList;
        }
    }

    /* renamed from: e2.a$c */
    /* compiled from: EventBinding.kt */
    public enum C7446c {
        MANUAL,
        INFERENCE
    }

    public C7443a(String str, C7446c cVar, C7444a aVar, String str2, List<C7449c> list, List<C7447b> list2, String str3, String str4, String str5) {
        C12775o.m28639i(str, "eventName");
        C12775o.m28639i(cVar, "method");
        C12775o.m28639i(aVar, JSONAPIResourceIdSerializer.FIELD_TYPE);
        C12775o.m28639i(str2, "appVersion");
        C12775o.m28639i(list, "path");
        C12775o.m28639i(list2, "parameters");
        C12775o.m28639i(str3, "componentId");
        C12775o.m28639i(str4, "pathType");
        C12775o.m28639i(str5, "activityName");
        this.f10291a = str;
        this.f10292b = cVar;
        this.f10293c = aVar;
        this.f10294d = str2;
        this.f10295e = list;
        this.f10296f = list2;
        this.f10297g = str3;
        this.f10298h = str4;
        this.f10299i = str5;
    }

    /* renamed from: a */
    public final String mo41112a() {
        return this.f10299i;
    }

    /* renamed from: b */
    public final String mo41113b() {
        return this.f10291a;
    }

    /* renamed from: c */
    public final List<C7447b> mo41114c() {
        List<C7447b> unmodifiableList = Collections.unmodifiableList(this.f10296f);
        C12775o.m28638h(unmodifiableList, "Collections.unmodifiableList(parameters)");
        return unmodifiableList;
    }

    /* renamed from: d */
    public final List<C7449c> mo41115d() {
        List<C7449c> unmodifiableList = Collections.unmodifiableList(this.f10295e);
        C12775o.m28638h(unmodifiableList, "Collections.unmodifiableList(path)");
        return unmodifiableList;
    }
}
