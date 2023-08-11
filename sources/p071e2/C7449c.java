package p071e2;

import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* renamed from: e2.c */
/* compiled from: PathComponent.kt */
public final class C7449c {

    /* renamed from: i */
    public static final C7450a f10312i = new C7450a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final String f10313a;

    /* renamed from: b */
    private final int f10314b;

    /* renamed from: c */
    private final int f10315c;

    /* renamed from: d */
    private final String f10316d;

    /* renamed from: e */
    private final String f10317e;

    /* renamed from: f */
    private final String f10318f;

    /* renamed from: g */
    private final String f10319g;

    /* renamed from: h */
    private final int f10320h;

    /* renamed from: e2.c$a */
    /* compiled from: PathComponent.kt */
    public static final class C7450a {
        private C7450a() {
        }

        public /* synthetic */ C7450a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: e2.c$b */
    /* compiled from: PathComponent.kt */
    public enum C7451b {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);
        

        /* renamed from: b */
        private final int f10327b;

        private C7451b(int i) {
            this.f10327b = i;
        }

        /* renamed from: a */
        public final int mo41130a() {
            return this.f10327b;
        }
    }

    public C7449c(JSONObject jSONObject) {
        C12775o.m28639i(jSONObject, "component");
        String string = jSONObject.getString("class_name");
        C12775o.m28638h(string, "component.getString(PATH_CLASS_NAME_KEY)");
        this.f10313a = string;
        this.f10314b = jSONObject.optInt("index", -1);
        this.f10315c = jSONObject.optInt("id");
        String optString = jSONObject.optString("text");
        C12775o.m28638h(optString, "component.optString(PATH_TEXT_KEY)");
        this.f10316d = optString;
        String optString2 = jSONObject.optString(APIResourceDescriptors.RESOURCE_TYPE_TAG);
        C12775o.m28638h(optString2, "component.optString(PATH_TAG_KEY)");
        this.f10317e = optString2;
        String optString3 = jSONObject.optString("description");
        C12775o.m28638h(optString3, "component.optString(PATH_DESCRIPTION_KEY)");
        this.f10318f = optString3;
        String optString4 = jSONObject.optString("hint");
        C12775o.m28638h(optString4, "component.optString(PATH_HINT_KEY)");
        this.f10319g = optString4;
        this.f10320h = jSONObject.optInt("match_bitmask");
    }

    /* renamed from: a */
    public final String mo41122a() {
        return this.f10313a;
    }

    /* renamed from: b */
    public final String mo41123b() {
        return this.f10318f;
    }

    /* renamed from: c */
    public final String mo41124c() {
        return this.f10319g;
    }

    /* renamed from: d */
    public final int mo41125d() {
        return this.f10315c;
    }

    /* renamed from: e */
    public final int mo41126e() {
        return this.f10314b;
    }

    /* renamed from: f */
    public final int mo41127f() {
        return this.f10320h;
    }

    /* renamed from: g */
    public final String mo41128g() {
        return this.f10317e;
    }

    /* renamed from: h */
    public final String mo41129h() {
        return this.f10316d;
    }
}
