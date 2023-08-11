package p042bo.app;

import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p126j0.C8266c;
import p126j0.C8273e;
import p404of.C13074a;

/* renamed from: bo.app.o6 */
public abstract class C3515o6 implements C3024b3 {

    /* renamed from: g */
    public static final C3516a f2309g = new C3516a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final String f2310b;

    /* renamed from: c */
    private final C3632r2 f2311c;

    /* renamed from: d */
    private final boolean f2312d;

    /* renamed from: e */
    private C3401l6 f2313e;

    /* renamed from: f */
    private final List<C3747v2> f2314f;

    /* renamed from: bo.app.o6$a */
    public static final class C3516a {
        public /* synthetic */ C3516a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3516a() {
        }
    }

    /* renamed from: bo.app.o6$b */
    static final class C3517b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ C3515o6 f2315b;

        /* renamed from: c */
        final /* synthetic */ C3766w2 f2316c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3517b(C3515o6 o6Var, C3766w2 w2Var) {
            super(0);
            this.f2315b = o6Var;
            this.f2316c = w2Var;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Triggered action " + this.f2315b.getId() + " not eligible to be triggered by " + this.f2316c.mo28842d() + " event. Current device time outside triggered action time window.";
        }
    }

    protected C3515o6(JSONObject jSONObject) {
        C12775o.m28639i(jSONObject, "json");
        ArrayList arrayList = new ArrayList();
        this.f2314f = arrayList;
        String string = jSONObject.getString("id");
        C12775o.m28638h(string, "json.getString(ID)");
        this.f2310b = string;
        this.f2311c = new C3768w4(jSONObject);
        JSONArray jSONArray = jSONObject.getJSONArray("trigger_condition");
        if (jSONArray.length() > 0) {
            C3440m6 m6Var = C3440m6.f2184a;
            C12775o.m28638h(jSONArray, "triggers");
            arrayList.addAll(m6Var.mo29356a(jSONArray));
        }
        this.f2312d = jSONObject.optBoolean("prefetch", true);
    }

    /* renamed from: v */
    private final boolean m3562v() {
        if (this.f2311c.mo29597h() == -1 || C8273e.m16436i() < this.f2311c.mo29597h()) {
            return true;
        }
        return false;
    }

    /* renamed from: w */
    private final boolean m3563w() {
        if (this.f2311c.mo29595c() == -1 || C8273e.m16436i() > this.f2311c.mo29595c()) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    private final boolean m3564x() {
        if (!m3563w() || !m3562v()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo28653a(C3401l6 l6Var) {
        this.f2313e = l6Var;
    }

    /* renamed from: b */
    public boolean mo28656b(C3766w2 w2Var) {
        C12775o.m28639i(w2Var, NotificationCompat.CATEGORY_EVENT);
        if (!m3564x()) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C3517b(this, w2Var), 7, (Object) null);
            return false;
        }
        Iterator<C3747v2> it = this.f2314f.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next().mo28678a(w2Var)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public JSONObject mo29027e() {
        try {
            JSONObject jSONObject = (JSONObject) this.f2311c.forJsonPut();
            if (jSONObject == null) {
                return null;
            }
            jSONObject.put("id", this.f2310b);
            JSONArray jSONArray = new JSONArray();
            for (C3747v2 forJsonPut : this.f2314f) {
                jSONArray.put(forJsonPut.forJsonPut());
            }
            jSONObject.put("trigger_condition", jSONArray);
            jSONObject.put("prefetch", this.f2312d);
            return jSONObject;
        } catch (JSONException unused) {
        }
    }

    /* renamed from: f */
    public final C3632r2 mo28657f() {
        return this.f2311c;
    }

    public abstract /* synthetic */ Object forJsonPut();

    public final String getId() {
        return this.f2310b;
    }

    /* renamed from: i */
    public C3401l6 mo28659i() {
        return this.f2313e;
    }

    /* renamed from: m */
    public final boolean mo28660m() {
        return this.f2312d;
    }
}
