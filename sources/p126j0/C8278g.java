package p126j0;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p042bo.app.C3724u0;
import p057d0.C7213c;
import p126j0.C8266c;
import p404of.C13074a;

/* renamed from: j0.g */
public final class C8278g {

    /* renamed from: a */
    private static final String f11665a = C8266c.f11641a.mo42215o("JsonUtils");

    /* renamed from: j0.g$a */
    static final class C8279a extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ int f11666g;

        /* renamed from: h */
        final /* synthetic */ JSONArray f11667h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8279a(int i, JSONArray jSONArray) {
            super(0);
            this.f11666g = i;
            this.f11667h = jSONArray;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to get string for item at index: " + this.f11666g + " and array: " + this.f11667h;
        }
    }

    /* renamed from: j0.g$b */
    static final class C8280b extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C8280b f11668g = new C8280b();

        C8280b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to retrieve color integer from JSON";
        }
    }

    /* renamed from: j0.g$c */
    static final class C8281c extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C8281c f11669g = new C8281c();

        C8281c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Caught Throwable while generating pretty printed json. Returning blank string.";
        }
    }

    /* renamed from: j0.g$d */
    static final class C8282d extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f11670g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8282d(String str) {
            super(0);
            this.f11670g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Caught exception merging JSON for old key ", this.f11670g);
        }
    }

    /* renamed from: j0.g$e */
    static final class C8283e extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f11671g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8283e(String str) {
            super(0);
            this.f11671g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Caught exception merging JSON for new key ", this.f11671g);
        }
    }

    /* renamed from: j0.g$f */
    static final class C8284f extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C8284f f11672g = new C8284f();

        C8284f() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Unable parse JSON into a bundle.";
        }
    }

    /* renamed from: a */
    public static final boolean m16447a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null || jSONObject.length() != jSONObject2.length()) {
            return false;
        }
        Iterator<String> keys = jSONObject.keys();
        C12775o.m28638h(keys, "target.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            if (!jSONObject2.has(next)) {
                return false;
            }
            Object opt = jSONObject.opt(next);
            Object opt2 = jSONObject2.opt(next);
            if (!(opt instanceof JSONObject) || !(opt2 instanceof JSONObject)) {
                if (!(opt == null || opt2 == null || C12775o.m28634d(opt, opt2))) {
                    return false;
                }
            } else if (!m16457k((JSONObject) opt, (JSONObject) opt2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static final <T> JSONArray m16448b(Collection<? extends C7213c<T>> collection) {
        C12775o.m28639i(collection, "<this>");
        JSONArray jSONArray = new JSONArray();
        for (C7213c forJsonPut : collection) {
            jSONArray.put(forJsonPut.forJsonPut());
        }
        return jSONArray;
    }

    /* renamed from: c */
    public static final <T> JSONArray m16449c(T[] tArr) {
        C12775o.m28639i(tArr, "<this>");
        JSONArray jSONArray = new JSONArray();
        int length = tArr.length;
        int i = 0;
        while (i < length) {
            T t = tArr[i];
            i++;
            jSONArray.put(t);
        }
        return jSONArray;
    }

    /* renamed from: d */
    public static final Map<String, String> m16450d(JSONObject jSONObject) {
        if (jSONObject == null) {
            return C12716r0.m28416g();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        C12775o.m28638h(keys, "this.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            C12775o.m28638h(next, "key");
            String string = jSONObject.getString(next);
            C12775o.m28638h(string, "this.getString(key)");
            linkedHashMap.put(next, string);
        }
        return linkedHashMap;
    }

    /* renamed from: e */
    public static final List<String> m16451e(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        int length = jSONArray.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            try {
                String string = jSONArray.getString(i);
                C12775o.m28638h(string, "this.getString(i)");
                arrayList.add(string);
            } catch (Exception e) {
                C8266c.m16397f(C8266c.f11641a, f11665a, C8266c.C8267a.f11649e, e, false, new C8279a(i, jSONArray), 8, (Object) null);
            }
            i = i2;
        }
        return arrayList;
    }

    /* renamed from: f */
    public static final JSONObject m16452f(JSONObject jSONObject) {
        C12775o.m28639i(jSONObject, "<this>");
        return new JSONObject(jSONObject.toString());
    }

    /* renamed from: g */
    public static final Integer m16453g(JSONObject jSONObject, String str) {
        C12775o.m28639i(jSONObject, "<this>");
        if (str == null || !jSONObject.has(str)) {
            return null;
        }
        try {
            return Integer.valueOf(jSONObject.getInt(str));
        } catch (Throwable th) {
            C8266c.m16397f(C8266c.f11641a, f11665a, C8266c.C8267a.f11649e, th, false, C8280b.f11668g, 8, (Object) null);
            return null;
        }
    }

    /* renamed from: h */
    public static final Double m16454h(JSONObject jSONObject, String str) {
        C12775o.m28639i(jSONObject, "<this>");
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return null;
        }
        return Double.valueOf(jSONObject.optDouble(str));
    }

    /* renamed from: i */
    public static final String m16455i(JSONObject jSONObject, String str) {
        C12775o.m28639i(jSONObject, "<this>");
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str);
    }

    /* renamed from: j */
    public static final String m16456j(JSONObject jSONObject) {
        String str = "";
        if (jSONObject != null) {
            try {
                str = jSONObject.toString(2);
            } catch (Throwable th) {
                C8266c.m16397f(C8266c.f11641a, f11665a, C8266c.C8267a.f11649e, th, false, C8281c.f11669g, 8, (Object) null);
            }
            C12775o.m28638h(str, "try {\n        this.toStr…ring.\" }\n        \"\"\n    }");
        }
        return str;
    }

    /* renamed from: k */
    public static final boolean m16457k(JSONObject jSONObject, JSONObject jSONObject2) {
        return m16447a(jSONObject, jSONObject2);
    }

    /* renamed from: l */
    public static final JSONObject m16458l(JSONObject jSONObject, JSONObject jSONObject2) {
        C12775o.m28639i(jSONObject, "oldJson");
        C12775o.m28639i(jSONObject2, "newJson");
        JSONObject jSONObject3 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        C12775o.m28638h(keys, "oldJson.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                jSONObject3.put(next, jSONObject.get(next));
            } catch (JSONException e) {
                C8266c.m16397f(C8266c.f11641a, f11665a, C8266c.C8267a.f11649e, e, false, new C8282d(next), 8, (Object) null);
            }
        }
        Iterator<String> keys2 = jSONObject2.keys();
        C12775o.m28638h(keys2, "newJson.keys()");
        while (keys2.hasNext()) {
            String next2 = keys2.next();
            try {
                jSONObject3.put(next2, jSONObject2.get(next2));
            } catch (JSONException e2) {
                C8266c.m16397f(C8266c.f11641a, f11665a, C8266c.C8267a.f11649e, e2, false, new C8283e(next2), 8, (Object) null);
            }
        }
        return jSONObject3;
    }

    /* renamed from: m */
    public static final <TargetEnum extends Enum<TargetEnum>> TargetEnum m16459m(JSONObject jSONObject, String str, Class<TargetEnum> cls, TargetEnum targetenum) {
        C12775o.m28639i(jSONObject, "jsonObject");
        C12775o.m28639i(str, "key");
        C12775o.m28639i(cls, "targetEnumClass");
        try {
            String string = jSONObject.getString(str);
            C12775o.m28638h(string, "jsonObject.getString(key)");
            Locale locale = Locale.US;
            C12775o.m28638h(locale, "US");
            String upperCase = string.toUpperCase(locale);
            C12775o.m28638h(upperCase, "this as java.lang.String).toUpperCase(locale)");
            TargetEnum a = C3724u0.m3968a(upperCase, cls);
            if (a == null) {
                return targetenum;
            }
            return a;
        } catch (Exception unused) {
            return targetenum;
        }
    }

    /* renamed from: n */
    public static final Bundle m16460n(String str) {
        boolean z;
        Bundle bundle = new Bundle();
        if (str == null || C13754v.m31532t(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return bundle;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle.putString(next, jSONObject.getString(next));
            }
        } catch (Exception e) {
            C8266c.m16397f(C8266c.f11641a, f11665a, C8266c.C8267a.f11649e, e, false, C8284f.f11672g, 8, (Object) null);
        }
        return bundle;
    }

    /* renamed from: o */
    public static final JSONObject m16461o(JSONObject jSONObject, JSONObject jSONObject2) {
        C12775o.m28639i(jSONObject, "<this>");
        C12775o.m28639i(jSONObject2, "otherJson");
        return m16458l(jSONObject, jSONObject2);
    }
}
