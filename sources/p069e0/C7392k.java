package p069e0;

import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import p018a0.C2108f;
import p042bo.app.C3023b2;
import p042bo.app.C3117e3;
import p042bo.app.C3240j;
import p042bo.app.C3766w2;
import p042bo.app.C3785x1;
import p126j0.C8266c;
import p404of.C13074a;

/* renamed from: e0.k */
public abstract class C7392k extends C7364g implements C7359b {

    /* renamed from: A */
    private String f10210A;

    /* renamed from: B */
    private boolean f10211B;

    /* renamed from: C */
    private String f10212C;

    /* renamed from: e0.k$a */
    static final class C7393a extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f10213g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7393a(String str) {
            super(0);
            this.f10213g = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Trigger id not found (this is expected for test sends). Not logging html in-app message button click for id: ", this.f10213g);
        }
    }

    /* renamed from: e0.k$b */
    static final class C7394b extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7394b f10214g = new C7394b();

        C7394b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Button Id was null or blank for this html in-app message. Ignoring.";
        }
    }

    /* renamed from: e0.k$c */
    static final class C7395c extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7395c f10215g = new C7395c();

        C7395c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Button click already logged for this html in-app message. Ignoring.";
        }
    }

    /* renamed from: e0.k$d */
    static final class C7396d extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7396d f10216g = new C7396d();

        C7396d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Cannot log an html in-app message button click because the BrazeManager is null.";
        }
    }

    /* renamed from: e0.k$e */
    static final class C7397e extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ String f10217g;

        /* renamed from: h */
        final /* synthetic */ String f10218h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7397e(String str, String str2) {
            super(0);
            this.f10217g = str;
            this.f10218h = str2;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Logged button click for button id: " + this.f10217g + " and trigger id: " + this.f10218h;
        }
    }

    protected C7392k() {
        mo41002s0(true);
    }

    /* renamed from: B */
    public String mo40970B() {
        return this.f10210A;
    }

    /* renamed from: C */
    public void mo40971C(String str) {
        this.f10210A = str;
    }

    /* renamed from: L */
    public void mo40947L(Map<String, String> map) {
        C12775o.m28639i(map, "remotePathToLocalAssetMap");
        if (!map.isEmpty()) {
            Object[] array = map.values().toArray(new String[0]);
            if (array != null) {
                mo40971C(((String[]) array)[0]);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
    }

    /* renamed from: Q */
    public boolean mo40972Q(String str) {
        boolean z;
        C12775o.m28639i(str, "buttonId");
        String g0 = mo40990g0();
        C3023b2 G = mo40986G();
        if (g0 == null || g0.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C7393a(str), 7, (Object) null);
            return false;
        } else if (C13754v.m31532t(str)) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, C7394b.f10214g, 6, (Object) null);
            return false;
        } else if (this.f10211B && mo40944I() != C2108f.HTML) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, C7395c.f10215g, 6, (Object) null);
            return false;
        } else if (G == null) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C7396d.f10216g, 6, (Object) null);
            return false;
        } else {
            C3785x1 d = C3240j.f1842h.mo29081d(g0, str);
            if (d != null) {
                G.mo28641a(d);
            }
            this.f10212C = str;
            this.f10211B = true;
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C7397e(str, g0), 7, (Object) null);
            return true;
        }
    }

    /* renamed from: V */
    public void mo40954V() {
        boolean z;
        C3023b2 G;
        super.mo40954V();
        if (this.f10211B) {
            String g0 = mo40990g0();
            boolean z2 = false;
            if (g0 == null || C13754v.m31532t(g0)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                String str = this.f10212C;
                if (str == null || C13754v.m31532t(str)) {
                    z2 = true;
                }
                if (!z2 && (G = mo40986G()) != null) {
                    G.mo28636a((C3766w2) new C3117e3(mo40990g0(), this.f10212C));
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7392k(JSONObject jSONObject, C3023b2 b2Var) {
        super(jSONObject, b2Var, false, false, 12, (DefaultConstructorMarker) null);
        C12775o.m28639i(jSONObject, "jsonObject");
        C12775o.m28639i(b2Var, "brazeManager");
        mo41002s0(jSONObject.optBoolean("use_webview", true));
    }
}
