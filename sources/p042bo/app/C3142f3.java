package p042bo.app;

import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import org.json.JSONArray;
import org.json.JSONObject;
import p018a0.C2106e;
import p018a0.C2108f;
import p042bo.app.C3240j;
import p069e0.C7358a;
import p069e0.C7384h;
import p069e0.C7389i;
import p069e0.C7390j;
import p069e0.C7398l;
import p069e0.C7407n;
import p069e0.C7408o;
import p126j0.C8266c;
import p126j0.C8278g;
import p404of.C13074a;

/* renamed from: bo.app.f3 */
public final class C3142f3 {

    /* renamed from: a */
    private static final String f1703a = C8266c.f11641a.mo42215o("InAppMessageModelUtils");

    /* renamed from: bo.app.f3$a */
    public /* synthetic */ class C3143a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1704a;

        static {
            int[] iArr = new int[C2108f.values().length];
            iArr[C2108f.FULL.ordinal()] = 1;
            iArr[C2108f.MODAL.ordinal()] = 2;
            iArr[C2108f.SLIDEUP.ordinal()] = 3;
            iArr[C2108f.HTML_FULL.ordinal()] = 4;
            iArr[C2108f.HTML.ordinal()] = 5;
            f1704a = iArr;
        }
    }

    /* renamed from: bo.app.f3$b */
    static final class C3144b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3144b f1705b = new C3144b();

        C3144b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Deserializing control in-app message.";
        }
    }

    /* renamed from: bo.app.f3$c */
    static final class C3145c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ JSONObject f1706b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3145c(JSONObject jSONObject) {
            super(0);
            this.f1706b = jSONObject;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("In-app message type was unknown for in-app message: ", C8278g.m16456j(this.f1706b));
        }
    }

    /* renamed from: bo.app.f3$d */
    static final class C3146d extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ JSONObject f1707b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3146d(JSONObject jSONObject) {
            super(0);
            this.f1707b = jSONObject;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Unknown in-app message type. Returning null: ", C8278g.m16456j(this.f1707b));
        }
    }

    /* renamed from: bo.app.f3$e */
    static final class C3147e extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ JSONObject f1708b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3147e(JSONObject jSONObject) {
            super(0);
            this.f1708b = jSONObject;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to deserialize the in-app message: " + C8278g.m16456j(this.f1708b) + ". Returning null.";
        }
    }

    /* renamed from: bo.app.f3$f */
    static final class C3148f extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3148f f1709b = new C3148f();

        C3148f() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "In-app message string was blank.";
        }
    }

    /* renamed from: bo.app.f3$g */
    static final class C3149g extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f1710b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3149g(String str) {
            super(0);
            this.f1710b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Failed to deserialize the in-app message string: ", this.f1710b);
        }
    }

    /* renamed from: a */
    public static final C7358a m2914a(String str, C3023b2 b2Var) {
        C12775o.m28639i(str, "inAppMessageJsonString");
        C12775o.m28639i(b2Var, "brazeManager");
        if (C13754v.m31532t(str)) {
            C8266c.m16397f(C8266c.f11641a, f1703a, C8266c.C8267a.I, (Throwable) null, false, C3148f.f1709b, 12, (Object) null);
            return null;
        }
        try {
            return m2915a(new JSONObject(str), b2Var);
        } catch (Exception e) {
            C8266c.m16397f(C8266c.f11641a, f1703a, C8266c.C8267a.f11649e, e, false, new C3149g(str), 8, (Object) null);
            return null;
        }
    }

    /* renamed from: b */
    public static final JSONArray m2916b(JSONObject jSONObject) {
        JSONArray jSONArray;
        JSONObject optJSONObject;
        C12775o.m28639i(jSONObject, "inAppMessageJson");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("themes");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("dark")) == null) {
            jSONArray = null;
        } else {
            jSONArray = optJSONObject.optJSONArray("btns");
        }
        return jSONArray == null ? new JSONArray() : jSONArray;
    }

    /* renamed from: c */
    public static final boolean m2918c(JSONObject jSONObject) {
        C12775o.m28639i(jSONObject, "inAppMessageJson");
        return jSONObject.optBoolean("is_control", false);
    }

    /* renamed from: b */
    private static final void m2917b(JSONObject jSONObject, C3023b2 b2Var) {
        String optString = jSONObject.optString("trigger_id");
        if (!(optString == null || optString.length() == 0)) {
            C3240j.C3241a aVar = C3240j.f1842h;
            C12775o.m28638h(optString, "triggerId");
            C3785x1 a = aVar.mo29066a(optString, C2106e.UNKNOWN_MESSAGE_TYPE);
            if (a != null) {
                b2Var.mo28641a(a);
            }
        }
    }

    /* renamed from: a */
    public static final C7358a m2915a(JSONObject jSONObject, C3023b2 b2Var) {
        C2108f fVar;
        C7358a aVar;
        C12775o.m28639i(jSONObject, "inAppMessageJson");
        C12775o.m28639i(b2Var, "brazeManager");
        try {
            if (m2918c(jSONObject)) {
                C8266c.m16397f(C8266c.f11641a, f1703a, C8266c.C8267a.D, (Throwable) null, false, C3144b.f1705b, 12, (Object) null);
                return new C7384h(jSONObject, b2Var);
            }
            try {
                C3724u0 u0Var = C3724u0.f2650a;
                String string = jSONObject.getString(JSONAPIResourceIdSerializer.FIELD_TYPE);
                C12775o.m28638h(string, "jsonObject.getString(key)");
                Locale locale = Locale.US;
                C12775o.m28638h(locale, "US");
                String upperCase = string.toUpperCase(locale);
                C12775o.m28638h(upperCase, "this as java.lang.String).toUpperCase(locale)");
                C2108f[] values = C2108f.values();
                int length = values.length;
                int i = 0;
                while (i < length) {
                    fVar = values[i];
                    i++;
                    if (C12775o.m28634d(fVar.name(), upperCase)) {
                        if (fVar == null) {
                            C8266c.m16397f(C8266c.f11641a, f1703a, C8266c.C8267a.I, (Throwable) null, false, new C3145c(jSONObject), 12, (Object) null);
                            m2917b(jSONObject, b2Var);
                            return null;
                        }
                        int i2 = C3143a.f1704a[fVar.ordinal()];
                        if (i2 == 1) {
                            aVar = new C7389i(jSONObject, b2Var);
                        } else if (i2 == 2) {
                            aVar = new C7407n(jSONObject, b2Var);
                        } else if (i2 == 3) {
                            aVar = new C7408o(jSONObject, b2Var);
                        } else if (i2 == 4) {
                            aVar = new C7398l(jSONObject, b2Var);
                        } else if (i2 != 5) {
                            C8266c.m16397f(C8266c.f11641a, f1703a, C8266c.C8267a.f11651g, (Throwable) null, false, new C3146d(jSONObject), 12, (Object) null);
                            m2917b(jSONObject, b2Var);
                            return null;
                        } else {
                            aVar = new C7390j(jSONObject, b2Var);
                        }
                        return aVar;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            } catch (Exception unused) {
                fVar = null;
            }
        } catch (Exception e) {
            C8266c.m16397f(C8266c.f11641a, f1703a, C8266c.C8267a.f11649e, e, false, new C3147e(jSONObject), 8, (Object) null);
            return null;
        }
    }

    /* renamed from: a */
    public static final C3204h3 m2913a(JSONObject jSONObject) {
        C12775o.m28639i(jSONObject, "inAppMessageJson");
        JSONObject optJSONObject = jSONObject.optJSONObject("themes");
        JSONObject optJSONObject2 = optJSONObject == null ? null : optJSONObject.optJSONObject("dark");
        if (optJSONObject2 == null) {
            return null;
        }
        return new C3204h3(optJSONObject2);
    }
}
