package p081f0;

import com.appboy.Constants;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.TimeZone;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import p057d0.C7213c;
import p126j0.C8266c;
import p126j0.C8273e;
import p126j0.C8285h;
import p126j0.C8300j;
import p126j0.C8303k;
import p292z.C10730a;
import p404of.C13074a;

/* renamed from: f0.a */
public final class C7554a implements C7213c<JSONObject> {

    /* renamed from: c */
    public static final C7555a f10499c = new C7555a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private JSONObject f10500b = new JSONObject();

    /* renamed from: f0.a$a */
    public static final class C7555a {

        /* renamed from: f0.a$a$a */
        static final class C7556a extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C7556a f10501g = new C7556a();

            C7556a() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "The BrazeProperties key cannot be null or contain only whitespaces. Not adding property.";
            }
        }

        /* renamed from: f0.a$a$b */
        static final class C7557b extends C12777p implements C13074a<String> {

            /* renamed from: g */
            public static final C7557b f10502g = new C7557b();

            C7557b() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "The leading character in the key string may not be '$'. Not adding property.";
            }
        }

        public /* synthetic */ C7555a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean mo41305a(String str) {
            C12775o.m28639i(str, "key");
            if (C13754v.m31532t(str)) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C7556a.f10501g, 6, (Object) null);
                return false;
            } else if (!C13754v.m31525E(str, "$", false, 2, (Object) null)) {
                return true;
            } else {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C7557b.f10502g, 6, (Object) null);
                return false;
            }
        }

        private C7555a() {
        }
    }

    /* renamed from: f0.a$b */
    static final class C7558b extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f10503g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7558b(String str) {
            super(0);
            this.f10503g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Value type is not supported. Cannot add property " + this.f10503g + '.';
        }
    }

    /* renamed from: f0.a$c */
    static final class C7559c extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7559c f10504g = new C7559c();

        C7559c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Caught json exception trying to add property.";
        }
    }

    /* renamed from: f0.a$d */
    static final class C7560d extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7560d f10505g = new C7560d();

        C7560d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to clone BrazeProperties";
        }
    }

    public C7554a() {
    }

    /* renamed from: c */
    private final JSONObject m14853c(JSONObject jSONObject, boolean z) {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            C12775o.m28638h(next, "jsonObjectIterator.next()");
            arrayList.add(next);
        }
        for (String str : arrayList) {
            if (!z || f10499c.mo41305a(str)) {
                Object obj = jSONObject.get(str);
                if (obj instanceof Date) {
                    jSONObject.put(str, C8273e.m16432e((Date) obj, C10730a.LONG, (TimeZone) null, 2, (Object) null));
                }
                if (obj instanceof JSONObject) {
                    jSONObject.put(str, m14853c((JSONObject) obj, false));
                }
            } else {
                jSONObject.remove(str);
            }
        }
        return jSONObject;
    }

    /* renamed from: d */
    static /* synthetic */ JSONObject m14854d(C7554a aVar, JSONObject jSONObject, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return aVar.m14853c(jSONObject, z);
    }

    /* renamed from: a */
    public final C7554a mo41299a(String str, Object obj) {
        C12775o.m28639i(str, "key");
        if (!f10499c.mo41305a(str)) {
            return this;
        }
        try {
            if (obj instanceof Long) {
                this.f10500b.put(C8303k.m16497a(str), ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                this.f10500b.put(C8303k.m16497a(str), ((Number) obj).intValue());
            } else if (obj instanceof Double) {
                this.f10500b.put(C8303k.m16497a(str), ((Number) obj).doubleValue());
            } else if (obj instanceof Boolean) {
                this.f10500b.put(C8303k.m16497a(str), ((Boolean) obj).booleanValue());
            } else if (obj instanceof Date) {
                this.f10500b.put(C8303k.m16497a(str), C8273e.m16432e((Date) obj, C10730a.LONG, (TimeZone) null, 2, (Object) null));
            } else if (obj instanceof String) {
                this.f10500b.put(C8303k.m16497a(str), C8303k.m16497a((String) obj));
            } else if (obj instanceof JSONObject) {
                this.f10500b.put(C8303k.m16497a(str), m14854d(this, (JSONObject) obj, false, 2, (Object) null));
            } else if (obj instanceof Map) {
                this.f10500b.put(C8303k.m16497a(str), m14854d(this, new JSONObject(C8285h.m16468a((Map) obj)), false, 2, (Object) null));
            } else if (obj == null) {
                this.f10500b.put(C8303k.m16497a(str), JSONObject.NULL);
            } else {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, new C7558b(str), 6, (Object) null);
            }
        } catch (JSONException e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C7559c.f10504g, 4, (Object) null);
        }
        return this;
    }

    /* renamed from: e */
    public final C7554a mo41300e() {
        try {
            return new C7554a(new JSONObject(forJsonPut().toString()));
        } catch (Exception e) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, e, false, C7560d.f10505g, 4, (Object) null);
            return null;
        }
    }

    /* renamed from: v */
    public JSONObject forJsonPut() {
        return this.f10500b;
    }

    /* renamed from: w */
    public final long mo41302w() {
        String jSONObject = this.f10500b.toString();
        C12775o.m28638h(jSONObject, "propertiesJSONObject.toString()");
        return C8300j.m16487a(jSONObject);
    }

    /* renamed from: x */
    public final int mo41303x() {
        return this.f10500b.length();
    }

    /* renamed from: y */
    public final boolean mo41304y() {
        if (mo41302w() > Constants.EVENT_PROPERTIES_MAX_SIZE_BYTES) {
            return true;
        }
        return false;
    }

    public C7554a(JSONObject jSONObject) {
        C12775o.m28639i(jSONObject, "jsonObject");
        this.f10500b = m14854d(this, jSONObject, false, 2, (Object) null);
    }
}
