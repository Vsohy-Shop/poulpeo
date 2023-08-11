package p069e0;

import android.graphics.Color;
import android.net.Uri;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.appboy.Constants;
import com.facebook.applinks.AppLinkData;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import p018a0.C2102a;
import p018a0.C2103b;
import p018a0.C2104c;
import p018a0.C2106e;
import p018a0.C2108f;
import p018a0.C2109g;
import p018a0.C2111i;
import p042bo.app.C3023b2;
import p042bo.app.C3117e3;
import p042bo.app.C3142f3;
import p042bo.app.C3204h3;
import p042bo.app.C3240j;
import p042bo.app.C3724u0;
import p042bo.app.C3766w2;
import p042bo.app.C3785x1;
import p126j0.C8266c;
import p126j0.C8278g;
import p404of.C13074a;

/* renamed from: e0.g */
public abstract class C7364g implements C7358a, C7361d {

    /* renamed from: z */
    public static final C7365a f10158z = new C7365a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private C2102a f10159b;

    /* renamed from: c */
    private Uri f10160c;

    /* renamed from: d */
    private String f10161d;

    /* renamed from: e */
    private String f10162e;

    /* renamed from: f */
    private boolean f10163f;

    /* renamed from: g */
    private Map<String, String> f10164g;

    /* renamed from: h */
    private boolean f10165h;

    /* renamed from: i */
    private boolean f10166i;

    /* renamed from: j */
    private C2104c f10167j;

    /* renamed from: k */
    private int f10168k;

    /* renamed from: l */
    private C2109g f10169l;

    /* renamed from: m */
    private C2103b f10170m;

    /* renamed from: n */
    private C2111i f10171n;

    /* renamed from: o */
    private long f10172o;

    /* renamed from: p */
    private int f10173p;

    /* renamed from: q */
    private int f10174q;

    /* renamed from: r */
    private int f10175r;

    /* renamed from: s */
    private int f10176s;

    /* renamed from: t */
    private final AtomicBoolean f10177t;

    /* renamed from: u */
    private final AtomicBoolean f10178u;

    /* renamed from: v */
    private final AtomicBoolean f10179v;

    /* renamed from: w */
    private JSONObject f10180w;

    /* renamed from: x */
    private C3023b2 f10181x;

    /* renamed from: y */
    private C3204h3 f10182y;

    /* renamed from: e0.g$a */
    public static final class C7365a {
        public /* synthetic */ C7365a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C7365a() {
        }
    }

    /* renamed from: e0.g$b */
    static final class C7366b extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ int f10183g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7366b(int i) {
            super(0);
            this.f10183g = i;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Requested in-app message duration " + this.f10183g + " is lower than the minimum of 999. Defaulting to 5000 milliseconds.";
        }
    }

    /* renamed from: e0.g$c */
    static final class C7367c extends C12777p implements C13074a<String> {

        /* renamed from: g */
        final /* synthetic */ int f10184g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7367c(int i) {
            super(0);
            this.f10184g = i;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Set in-app message duration to " + this.f10184g + " milliseconds.";
        }
    }

    /* renamed from: e0.g$d */
    static final class C7368d extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7368d f10185g = new C7368d();

        C7368d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Cannot apply dark theme with a null themes wrapper";
        }
    }

    /* renamed from: e0.g$e */
    static final class C7369e extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7369e f10186g = new C7369e();

        C7369e() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Failed to construct json for in-app message";
        }
    }

    /* renamed from: e0.g$f */
    static final class C7370f extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7370f f10187g = new C7370f();

        C7370f() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Trigger id not found (this is expected for test sends). Not logging in-app message click.";
        }
    }

    /* renamed from: e0.g$g */
    static final class C7371g extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7371g f10188g = new C7371g();

        C7371g() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Cannot log an in-app message click because the BrazeManager is null.";
        }
    }

    /* renamed from: e0.g$h */
    static final class C7372h extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7372h f10189g = new C7372h();

        C7372h() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Click already logged for this in-app message. Ignoring.";
        }
    }

    /* renamed from: e0.g$i */
    static final class C7373i extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7373i f10190g = new C7373i();

        C7373i() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Display failure already logged for this in-app message. Ignoring.";
        }
    }

    /* renamed from: e0.g$j */
    static final class C7374j extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7374j f10191g = new C7374j();

        C7374j() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Logging click on in-app message";
        }
    }

    /* renamed from: e0.g$k */
    static final class C7375k extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7375k f10192g = new C7375k();

        C7375k() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Trigger id not found (this is expected for test sends). Not logging in-app message display failure.";
        }
    }

    /* renamed from: e0.g$l */
    static final class C7376l extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7376l f10193g = new C7376l();

        C7376l() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Cannot log an in-app message display failure because the BrazeManager is null.";
        }
    }

    /* renamed from: e0.g$m */
    static final class C7377m extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7377m f10194g = new C7377m();

        C7377m() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Display failure already logged for this in-app message. Ignoring.";
        }
    }

    /* renamed from: e0.g$n */
    static final class C7378n extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7378n f10195g = new C7378n();

        C7378n() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Click already logged for this in-app message. Ignoring.";
        }
    }

    /* renamed from: e0.g$o */
    static final class C7379o extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7379o f10196g = new C7379o();

        C7379o() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Impression already logged for this in-app message. Ignoring.";
        }
    }

    /* renamed from: e0.g$p */
    static final class C7380p extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7380p f10197g = new C7380p();

        C7380p() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Trigger id not found (this is expected for test sends). Not logging in-app message impression.";
        }
    }

    /* renamed from: e0.g$q */
    static final class C7381q extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7381q f10198g = new C7381q();

        C7381q() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Cannot log an in-app message impression because the BrazeManager is null.";
        }
    }

    /* renamed from: e0.g$r */
    static final class C7382r extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7382r f10199g = new C7382r();

        C7382r() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Impression already logged for this in-app message. Ignoring.";
        }
    }

    /* renamed from: e0.g$s */
    static final class C7383s extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7383s f10200g = new C7383s();

        C7383s() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Display failure already logged for this in-app message. Ignoring.";
        }
    }

    public C7364g() {
        this.f10159b = C2102a.NONE;
        this.f10164g = C12716r0.m28416g();
        this.f10165h = true;
        this.f10166i = true;
        this.f10167j = C2104c.AUTO_DISMISS;
        this.f10168k = 5000;
        this.f10169l = C2109g.ANY;
        this.f10170m = C2103b.FIT_CENTER;
        this.f10171n = C2111i.CENTER;
        this.f10172o = -1;
        this.f10173p = Color.parseColor("#ff0073d5");
        this.f10174q = Color.parseColor("#555555");
        this.f10175r = -1;
        this.f10176s = -1;
        this.f10177t = new AtomicBoolean(false);
        this.f10178u = new AtomicBoolean(false);
        this.f10179v = new AtomicBoolean(false);
    }

    /* renamed from: A */
    public JSONObject forJsonPut() {
        JSONObject jSONObject = this.f10180w;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("message", getMessage());
                jSONObject.put(TypedValues.TransitionType.S_DURATION, mo40952T());
                jSONObject.putOpt("trigger_id", mo40990g0());
                jSONObject.putOpt("click_action", mo40959b0().toString());
                jSONObject.putOpt("message_close", mo40942E().toString());
                if (mo40960d0() != null) {
                    jSONObject.put(Constants.APPBOY_PUSH_DEEP_LINK_KEY, String.valueOf(mo40960d0()));
                }
                jSONObject.put("use_webview", getOpenUriInWebView());
                jSONObject.put("animate_in", mo40951S());
                jSONObject.put("animate_out", mo40949N());
                jSONObject.put("bg_color", mo40961e0());
                jSONObject.put("text_color", mo40957a0());
                jSONObject.put("icon_color", mo40943H());
                jSONObject.put("icon_bg_color", mo40953U());
                jSONObject.putOpt("icon", getIcon());
                jSONObject.putOpt("crop_type", mo40956X().toString());
                jSONObject.putOpt("orientation", getOrientation().toString());
                jSONObject.putOpt("text_align_message", mo40989f0().toString());
                jSONObject.putOpt("is_control", Boolean.valueOf(isControl()));
                if (!getExtras().isEmpty()) {
                    jSONObject.put(AppLinkData.ARGUMENTS_EXTRAS_KEY, getExtras());
                }
            } catch (JSONException e) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C7369e.f10186g, 4, (Object) null);
            }
        }
        return jSONObject;
    }

    /* renamed from: E */
    public C2104c mo40942E() {
        return this.f10167j;
    }

    /* renamed from: G */
    public final C3023b2 mo40986G() {
        return this.f10181x;
    }

    /* renamed from: H */
    public int mo40943H() {
        return this.f10176s;
    }

    /* renamed from: J */
    public void mo40945J(boolean z) {
        this.f10166i = z;
    }

    /* renamed from: K */
    public void mo40946K(boolean z) {
        this.f10165h = z;
    }

    /* renamed from: L */
    public void mo40947L(Map<String, String> map) {
        C12775o.m28639i(map, "remotePathToLocalAssetMap");
    }

    /* renamed from: M */
    public void mo40948M(long j) {
        this.f10172o = j;
    }

    /* renamed from: N */
    public boolean mo40949N() {
        return this.f10166i;
    }

    /* renamed from: P */
    public long mo40950P() {
        return this.f10172o;
    }

    /* renamed from: S */
    public boolean mo40951S() {
        return this.f10165h;
    }

    /* renamed from: T */
    public int mo40952T() {
        return this.f10168k;
    }

    /* renamed from: U */
    public int mo40953U() {
        return this.f10173p;
    }

    /* renamed from: V */
    public void mo40954V() {
        boolean z;
        C3023b2 b2Var;
        String g0 = mo40990g0();
        if (this.f10178u.get()) {
            if (g0 == null || g0.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && (b2Var = this.f10181x) != null) {
                b2Var.mo28636a((C3766w2) new C3117e3(g0));
            }
        }
    }

    /* renamed from: W */
    public List<String> mo40955W() {
        return C12726w.m28524k();
    }

    /* renamed from: X */
    public C2103b mo40956X() {
        return this.f10170m;
    }

    /* renamed from: Z */
    public final C3204h3 mo40987Z() {
        return this.f10182y;
    }

    /* renamed from: a0 */
    public int mo40957a0() {
        return this.f10174q;
    }

    /* renamed from: b */
    public boolean mo40958b(C2106e eVar) {
        boolean z;
        C12775o.m28639i(eVar, "failureType");
        String g0 = mo40990g0();
        if (g0 == null || C13754v.m31532t(g0)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C7375k.f10192g, 7, (Object) null);
            return false;
        }
        C3023b2 b2Var = this.f10181x;
        if (b2Var == null) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C7376l.f10193g, 6, (Object) null);
            return false;
        } else if (this.f10179v.get()) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, C7377m.f10194g, 6, (Object) null);
            return false;
        } else if (this.f10178u.get()) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, C7378n.f10195g, 6, (Object) null);
            return false;
        } else if (this.f10177t.get()) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, C7379o.f10196g, 6, (Object) null);
            return false;
        } else {
            C3785x1 a = C3240j.f1842h.mo29066a(g0, eVar);
            if (a != null) {
                b2Var.mo28641a(a);
            }
            this.f10179v.set(true);
            return true;
        }
    }

    /* renamed from: b0 */
    public C2102a mo40959b0() {
        return this.f10159b;
    }

    /* renamed from: c0 */
    public final JSONObject mo40988c0() {
        return this.f10180w;
    }

    /* renamed from: d0 */
    public Uri mo40960d0() {
        return this.f10160c;
    }

    /* renamed from: e */
    public void mo40977e() {
        C3204h3 h3Var = this.f10182y;
        if (h3Var == null) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C7368d.f10185g, 7, (Object) null);
            return;
        }
        if (h3Var.mo28991a() != null) {
            mo40991h0(h3Var.mo28991a().intValue());
        }
        if (h3Var.mo28997f() != null) {
            mo40998o0(h3Var.mo28997f().intValue());
        }
        if (h3Var.mo28995e() != null) {
            mo40997n0(h3Var.mo28995e().intValue());
        }
        if (h3Var.mo28998g() != null) {
            mo41001r0(h3Var.mo28998g().intValue());
        }
    }

    /* renamed from: e0 */
    public int mo40961e0() {
        return this.f10175r;
    }

    /* renamed from: f0 */
    public C2111i mo40989f0() {
        return this.f10171n;
    }

    /* renamed from: g0 */
    public final String mo40990g0() {
        JSONObject jSONObject = this.f10180w;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.optString("trigger_id");
    }

    public Map<String, String> getExtras() {
        return this.f10164g;
    }

    public String getIcon() {
        return this.f10162e;
    }

    public String getMessage() {
        return this.f10161d;
    }

    public boolean getOpenUriInWebView() {
        return this.f10163f;
    }

    public C2109g getOrientation() {
        return this.f10169l;
    }

    /* renamed from: h0 */
    public void mo40991h0(int i) {
        this.f10175r = i;
    }

    /* renamed from: i0 */
    public void mo40992i0(C2103b bVar) {
        C12775o.m28639i(bVar, "<set-?>");
        this.f10170m = bVar;
    }

    public boolean isControl() {
        JSONObject jSONObject = this.f10180w;
        if (jSONObject != null && jSONObject.optBoolean("is_control")) {
            return true;
        }
        return false;
    }

    /* renamed from: j0 */
    public void mo40993j0(C2104c cVar) {
        C12775o.m28639i(cVar, "<set-?>");
        this.f10167j = cVar;
    }

    /* renamed from: k0 */
    public void mo40994k0(int i) {
        if (i < 999) {
            this.f10168k = 5000;
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C7366b(i), 7, (Object) null);
            return;
        }
        this.f10168k = i;
        C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, new C7367c(i), 7, (Object) null);
    }

    /* renamed from: l0 */
    public void mo40995l0(Map<String, String> map) {
        C12775o.m28639i(map, "<set-?>");
        this.f10164g = map;
    }

    public boolean logClick() {
        boolean z;
        String g0 = mo40990g0();
        if (g0 == null || C13754v.m31532t(g0)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C7370f.f10187g, 7, (Object) null);
            return false;
        }
        C3023b2 b2Var = this.f10181x;
        if (b2Var == null) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C7371g.f10188g, 6, (Object) null);
            return false;
        } else if (this.f10178u.get() && mo40944I() != C2108f.HTML) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, C7372h.f10189g, 6, (Object) null);
            return false;
        } else if (this.f10179v.get()) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, C7373i.f10190g, 6, (Object) null);
            return false;
        } else {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11650f, (Throwable) null, false, C7374j.f10191g, 6, (Object) null);
            C3785x1 g = C3240j.f1842h.mo29086g(g0);
            if (g != null) {
                b2Var.mo28641a(g);
            }
            this.f10178u.set(true);
            return true;
        }
    }

    public boolean logImpression() {
        boolean z;
        String g0 = mo40990g0();
        if (g0 == null || C13754v.m31532t(g0)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.D, (Throwable) null, false, C7380p.f10197g, 6, (Object) null);
            return false;
        }
        C3023b2 b2Var = this.f10181x;
        if (b2Var == null) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C7381q.f10198g, 6, (Object) null);
            return false;
        } else if (this.f10177t.get()) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, C7382r.f10199g, 6, (Object) null);
            return false;
        } else if (this.f10179v.get()) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, C7383s.f10200g, 6, (Object) null);
            return false;
        } else {
            C3785x1 i = C3240j.f1842h.mo29089i(g0);
            if (i != null) {
                b2Var.mo28641a(i);
            }
            this.f10177t.set(true);
            return true;
        }
    }

    /* renamed from: m0 */
    public void mo40996m0(String str) {
        this.f10162e = str;
    }

    /* renamed from: n0 */
    public void mo40997n0(int i) {
        this.f10173p = i;
    }

    /* renamed from: o0 */
    public void mo40998o0(int i) {
        this.f10176s = i;
    }

    /* renamed from: p0 */
    public void mo40999p0(String str) {
        this.f10161d = str;
    }

    /* renamed from: q0 */
    public void mo41000q0(C2111i iVar) {
        C12775o.m28639i(iVar, "<set-?>");
        this.f10171n = iVar;
    }

    /* renamed from: r0 */
    public void mo41001r0(int i) {
        this.f10174q = i;
    }

    /* renamed from: s0 */
    public void mo41002s0(boolean z) {
        this.f10163f = z;
    }

    /* renamed from: t0 */
    public void mo41003t0(C2109g gVar) {
        C12775o.m28639i(gVar, "<set-?>");
        this.f10169l = gVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7364g(JSONObject jSONObject, C3023b2 b2Var, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jSONObject, b2Var, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }

    public C7364g(JSONObject jSONObject, C3023b2 b2Var, boolean z, boolean z2) {
        JSONObject jSONObject2 = jSONObject;
        C3023b2 b2Var2 = b2Var;
        C12775o.m28639i(jSONObject2, "json");
        C12775o.m28639i(b2Var2, "brazeManager");
        this.f10159b = C2102a.NONE;
        this.f10164g = C12716r0.m28416g();
        boolean z3 = true;
        this.f10165h = true;
        this.f10166i = true;
        this.f10167j = C2104c.AUTO_DISMISS;
        this.f10168k = 5000;
        C2109g gVar = C2109g.ANY;
        this.f10169l = gVar;
        this.f10170m = C2103b.FIT_CENTER;
        this.f10171n = C2111i.CENTER;
        this.f10172o = -1;
        this.f10173p = Color.parseColor("#ff0073d5");
        this.f10174q = Color.parseColor("#555555");
        this.f10175r = -1;
        this.f10176s = -1;
        int i = 0;
        this.f10177t = new AtomicBoolean(false);
        this.f10178u = new AtomicBoolean(false);
        this.f10179v = new AtomicBoolean(false);
        this.f10180w = jSONObject2;
        this.f10181x = b2Var2;
        mo40999p0(jSONObject2.optString("message"));
        mo40946K(jSONObject2.optBoolean("animate_in", true));
        mo40945J(jSONObject2.optBoolean("animate_out", true));
        mo40994k0(jSONObject2.optInt(TypedValues.TransitionType.S_DURATION));
        mo40996m0(jSONObject2.optString("icon"));
        try {
            C3724u0 u0Var = C3724u0.f2650a;
            String string = jSONObject2.getString("orientation");
            C12775o.m28638h(string, "jsonObject.getString(key)");
            Locale locale = Locale.US;
            C12775o.m28638h(locale, "US");
            String upperCase = string.toUpperCase(locale);
            C12775o.m28638h(upperCase, "this as java.lang.String).toUpperCase(locale)");
            C2109g[] values = C2109g.values();
            int length = values.length;
            int i2 = 0;
            while (i2 < length) {
                C2109g gVar2 = values[i2];
                i2++;
                if (C12775o.m28634d(gVar2.name(), upperCase)) {
                    gVar = gVar2;
                    mo41003t0(gVar);
                    mo41002s0(jSONObject2.optBoolean("use_webview", false));
                    mo40997n0(jSONObject2.optInt("icon_bg_color"));
                    mo41001r0(jSONObject2.optInt("text_color"));
                    mo40991h0(jSONObject2.optInt("bg_color"));
                    mo40998o0(jSONObject2.optInt("icon_color"));
                    this.f10177t.set(z);
                    this.f10178u.set(z2);
                    mo40995l0(C8278g.m16450d(jSONObject2.optJSONObject(AppLinkData.ARGUMENTS_EXTRAS_KEY)));
                    String optString = jSONObject2.optString(Constants.APPBOY_PUSH_DEEP_LINK_KEY);
                    C2102a aVar = C2102a.NONE;
                    try {
                        C3724u0 u0Var2 = C3724u0.f2650a;
                        String string2 = jSONObject2.getString("click_action");
                        C12775o.m28638h(string2, "jsonObject.getString(key)");
                        Locale locale2 = Locale.US;
                        C12775o.m28638h(locale2, "US");
                        String upperCase2 = string2.toUpperCase(locale2);
                        C12775o.m28638h(upperCase2, "this as java.lang.String).toUpperCase(locale)");
                        C2102a[] values2 = C2102a.values();
                        int length2 = values2.length;
                        int i3 = 0;
                        while (i3 < length2) {
                            C2102a aVar2 = values2[i3];
                            i3++;
                            if (C12775o.m28634d(aVar2.name(), upperCase2)) {
                                aVar = aVar2;
                                if (aVar == C2102a.URI) {
                                    if (optString != null && !C13754v.m31532t(optString)) {
                                        z3 = false;
                                    }
                                    if (!z3) {
                                        this.f10160c = Uri.parse(optString);
                                    }
                                }
                                this.f10159b = aVar;
                                C2104c cVar = C2104c.AUTO_DISMISS;
                                try {
                                    C3724u0 u0Var3 = C3724u0.f2650a;
                                    String string3 = jSONObject2.getString("message_close");
                                    C12775o.m28638h(string3, "jsonObject.getString(key)");
                                    Locale locale3 = Locale.US;
                                    C12775o.m28638h(locale3, "US");
                                    String upperCase3 = string3.toUpperCase(locale3);
                                    C12775o.m28638h(upperCase3, "this as java.lang.String).toUpperCase(locale)");
                                    C2104c[] values3 = C2104c.values();
                                    int length3 = values3.length;
                                    while (i < length3) {
                                        C2104c cVar2 = values3[i];
                                        i++;
                                        if (C12775o.m28634d(cVar2.name(), upperCase3)) {
                                            cVar = cVar2;
                                            mo40993j0(cVar == C2104c.SWIPE ? C2104c.MANUAL : cVar);
                                            this.f10182y = C3142f3.m2913a(jSONObject);
                                            return;
                                        }
                                    }
                                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                                } catch (Exception unused) {
                                }
                            }
                        }
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    } catch (Exception unused2) {
                    }
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (Exception unused3) {
        }
    }
}
