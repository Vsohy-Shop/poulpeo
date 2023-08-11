package p069e0;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import p018a0.C2108f;
import p042bo.app.C3023b2;
import p042bo.app.C3240j;
import p042bo.app.C3785x1;
import p126j0.C8266c;
import p404of.C13074a;

/* renamed from: e0.h */
public class C7384h extends C7364g {

    /* renamed from: A */
    private final AtomicBoolean f10201A = new AtomicBoolean(false);

    /* renamed from: e0.h$a */
    static final class C7385a extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7385a f10202g = new C7385a();

        C7385a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Control impression already logged for this in-app message. Ignoring.";
        }
    }

    /* renamed from: e0.h$b */
    static final class C7386b extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7386b f10203g = new C7386b();

        C7386b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Trigger Id not found (this is expected for test sends). Not logging in-app message control impression.";
        }
    }

    /* renamed from: e0.h$c */
    static final class C7387c extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7387c f10204g = new C7387c();

        C7387c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Cannot log an in-app message control impression because the BrazeManager is null.";
        }
    }

    /* renamed from: e0.h$d */
    static final class C7388d extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7388d f10205g = new C7388d();

        C7388d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Logging control in-app message impression event";
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7384h(JSONObject jSONObject, C3023b2 b2Var) {
        super(jSONObject, b2Var, false, false, 12, (DefaultConstructorMarker) null);
        C12775o.m28639i(jSONObject, "jsonObject");
        C12775o.m28639i(b2Var, "brazeManager");
    }

    /* renamed from: I */
    public C2108f mo40944I() {
        return C2108f.CONTROL;
    }

    public boolean logImpression() {
        boolean z;
        C3785x1 x1Var;
        if (this.f10201A.get()) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, C7385a.f10202g, 6, (Object) null);
            return false;
        }
        String g0 = mo40990g0();
        if (g0 == null || g0.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C7386b.f10203g, 6, (Object) null);
            return false;
        } else if (mo40986G() == null) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C7387c.f10204g, 6, (Object) null);
            return false;
        } else {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, C7388d.f10205g, 6, (Object) null);
            String g02 = mo40990g0();
            if (g02 == null) {
                x1Var = null;
            } else {
                x1Var = C3240j.f1842h.mo29088h(g02);
            }
            if (x1Var != null) {
                C3023b2 G = mo40986G();
                if (G != null) {
                    G.mo28641a(x1Var);
                }
                this.f10201A.set(true);
            }
            return true;
        }
    }
}
