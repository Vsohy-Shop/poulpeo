package p069e0;

import android.graphics.Color;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p018a0.C2105d;
import p018a0.C2111i;
import p042bo.app.C3023b2;
import p042bo.app.C3117e3;
import p042bo.app.C3204h3;
import p042bo.app.C3240j;
import p042bo.app.C3766w2;
import p042bo.app.C3785x1;
import p126j0.C8266c;
import p404of.C13074a;

/* renamed from: e0.m */
public abstract class C7399m extends C7412p implements C7360c {

    /* renamed from: Z */
    public static final C7400a f10219Z = new C7400a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private int f10220F;

    /* renamed from: G */
    private int f10221G;

    /* renamed from: H */
    private String f10222H;

    /* renamed from: I */
    private List<? extends C7416r> f10223I;

    /* renamed from: J */
    private C2105d f10224J;

    /* renamed from: K */
    private Integer f10225K;

    /* renamed from: M */
    private C2111i f10226M;

    /* renamed from: X */
    private boolean f10227X;

    /* renamed from: Y */
    private String f10228Y;

    /* renamed from: e0.m$a */
    public static final class C7400a {
        public /* synthetic */ C7400a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C7400a() {
        }
    }

    /* renamed from: e0.m$b */
    static final class C7401b extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7401b f10229g = new C7401b();

        C7401b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Cannot apply dark theme with a null themes wrapper";
        }
    }

    /* renamed from: e0.m$c */
    static final class C7402c extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7402c f10230g = new C7402c();

        C7402c() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Trigger id not found (this is expected for test sends). Not logging button click.";
        }
    }

    /* renamed from: e0.m$d */
    static final class C7403d extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7403d f10231g = new C7403d();

        C7403d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Button click already logged for this message. Ignoring.";
        }
    }

    /* renamed from: e0.m$e */
    static final class C7404e extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7404e f10232g = new C7404e();

        C7404e() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Cannot log a button click because the AppboyManager is null.";
        }
    }

    /* renamed from: e0.m$f */
    public static final class C7405f extends C12777p implements Function1<Integer, Boolean> {

        /* renamed from: g */
        final /* synthetic */ JSONArray f10233g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7405f(JSONArray jSONArray) {
            super(1);
            this.f10233g = jSONArray;
        }

        /* renamed from: a */
        public final Boolean mo41047a(int i) {
            return Boolean.valueOf(this.f10233g.opt(i) instanceof JSONObject);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo41047a(((Number) obj).intValue());
        }
    }

    /* renamed from: e0.m$g */
    public static final class C7406g extends C12777p implements Function1<Integer, JSONObject> {

        /* renamed from: g */
        final /* synthetic */ JSONArray f10234g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7406g(JSONArray jSONArray) {
            super(1);
            this.f10234g = jSONArray;
        }

        /* renamed from: a */
        public final JSONObject mo41048a(int i) {
            Object obj = this.f10234g.get(i);
            if (obj != null) {
                return (JSONObject) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo41048a(((Number) obj).intValue());
        }
    }

    protected C7399m() {
        this.f10220F = Color.parseColor("#333333");
        this.f10221G = Color.parseColor("#9B9B9B");
        this.f10223I = C12726w.m28524k();
        this.f10224J = C2105d.TOP;
        this.f10226M = C2111i.CENTER;
    }

    /* renamed from: A */
    public JSONObject forJsonPut() {
        JSONObject c0 = mo40988c0();
        if (c0 == null) {
            c0 = super.mo40985A();
            try {
                c0.putOpt("header", mo40976Y());
                c0.put("header_text_color", mo41042z0());
                c0.put("close_btn_color", mo41039w0());
                c0.putOpt("image_style", mo40973D().toString());
                c0.putOpt("text_align_header", mo41041y0().toString());
                Integer x0 = mo41040x0();
                if (x0 != null) {
                    c0.put("frame_color", x0.intValue());
                }
                JSONArray jSONArray = new JSONArray();
                for (C7416r v : mo40975R()) {
                    jSONArray.put(v.forJsonPut());
                }
                c0.put("btns", jSONArray);
            } catch (JSONException unused) {
            }
        }
        return c0;
    }

    /* renamed from: A0 */
    public void mo41032A0(int i) {
        this.f10221G = i;
    }

    /* renamed from: B0 */
    public void mo41033B0(Integer num) {
        this.f10225K = num;
    }

    /* renamed from: C0 */
    public void mo41034C0(String str) {
        this.f10222H = str;
    }

    /* renamed from: D */
    public C2105d mo40973D() {
        return this.f10224J;
    }

    /* renamed from: D0 */
    public void mo41035D0(C2111i iVar) {
        C12775o.m28639i(iVar, "<set-?>");
        this.f10226M = iVar;
    }

    /* renamed from: E0 */
    public void mo41036E0(int i) {
        this.f10220F = i;
    }

    /* renamed from: F */
    public boolean mo40974F(C7416r rVar) {
        boolean z;
        C12775o.m28639i(rVar, "messageButton");
        C3023b2 G = mo40986G();
        String g0 = mo40990g0();
        if (g0 == null || C13754v.m31532t(g0)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C7402c.f10230g, 7, (Object) null);
            return false;
        } else if (this.f10227X) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, C7403d.f10231g, 6, (Object) null);
            return false;
        } else if (G == null) {
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11651g, (Throwable) null, false, C7404e.f10232g, 6, (Object) null);
            return false;
        } else {
            this.f10228Y = rVar.mo41066y();
            C3785x1 a = C3240j.f1842h.mo29068a(g0, rVar);
            if (a != null) {
                G.mo28641a(a);
            }
            this.f10227X = true;
            return true;
        }
    }

    /* renamed from: F0 */
    public void mo41037F0(C2105d dVar) {
        C12775o.m28639i(dVar, "<set-?>");
        this.f10224J = dVar;
    }

    /* renamed from: G0 */
    public void mo41038G0(List<? extends C7416r> list) {
        C12775o.m28639i(list, "<set-?>");
        this.f10223I = list;
    }

    /* renamed from: R */
    public List<C7416r> mo40975R() {
        return this.f10223I;
    }

    /* renamed from: V */
    public void mo40954V() {
        boolean z;
        super.mo40954V();
        C3023b2 G = mo40986G();
        if (this.f10227X) {
            String g0 = mo40990g0();
            boolean z2 = false;
            if (g0 == null || C13754v.m31532t(g0)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                String str = this.f10228Y;
                if (str == null || C13754v.m31532t(str)) {
                    z2 = true;
                }
                if (!z2 && G != null) {
                    G.mo28636a((C3766w2) new C3117e3(mo40990g0(), this.f10228Y));
                }
            }
        }
    }

    /* renamed from: Y */
    public String mo40976Y() {
        return this.f10222H;
    }

    /* renamed from: e */
    public void mo40977e() {
        super.mo40977e();
        C3204h3 Z = mo40987Z();
        if (Z == null) {
            C8266c.m16396e(C8266c.f11641a, this, (C8266c.C8267a) null, (Throwable) null, false, C7401b.f10229g, 7, (Object) null);
            return;
        }
        if (Z.mo28993c() != null) {
            mo41033B0(Z.mo28993c());
        }
        if (Z.mo28992b() != null) {
            mo41032A0(Z.mo28992b().intValue());
        }
        if (Z.mo28994d() != null) {
            mo41036E0(Z.mo28994d().intValue());
        }
        for (C7416r e : mo40975R()) {
            e.mo40977e();
        }
    }

    /* renamed from: w0 */
    public int mo41039w0() {
        return this.f10221G;
    }

    /* renamed from: x0 */
    public Integer mo41040x0() {
        return this.f10225K;
    }

    /* renamed from: y0 */
    public C2111i mo41041y0() {
        return this.f10226M;
    }

    /* renamed from: z0 */
    public int mo41042z0() {
        return this.f10220F;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7399m(org.json.JSONObject r17, p042bo.app.C3023b2 r18) {
        /*
            r16 = this;
            r9 = r17
            java.lang.String r0 = "Array contains no element matching the predicate."
            java.lang.String r1 = "this as java.lang.String).toUpperCase(locale)"
            java.lang.String r2 = "US"
            java.lang.String r3 = "jsonObject.getString(key)"
            java.lang.String r4 = "jsonObject"
            kotlin.jvm.internal.C12775o.m28639i(r9, r4)
            java.lang.String r4 = "brazeManager"
            r5 = r18
            kotlin.jvm.internal.C12775o.m28639i(r5, r4)
            java.lang.String r4 = "header"
            java.lang.String r4 = r9.optString(r4)
            java.lang.String r6 = "jsonObject.optString(HEADER)"
            kotlin.jvm.internal.C12775o.m28638h(r4, r6)
            java.lang.String r6 = "header_text_color"
            int r6 = r9.optInt(r6)
            java.lang.String r7 = "close_btn_color"
            int r7 = r9.optInt(r7)
            java.lang.String r8 = "image_style"
            a0.d r10 = p018a0.C2105d.TOP
            bo.app.u0 r12 = p042bo.app.C3724u0.f2650a     // Catch:{ Exception -> 0x0063 }
            java.lang.String r8 = r9.getString(r8)     // Catch:{ Exception -> 0x0063 }
            kotlin.jvm.internal.C12775o.m28638h(r8, r3)     // Catch:{ Exception -> 0x0063 }
            java.util.Locale r12 = java.util.Locale.US     // Catch:{ Exception -> 0x0063 }
            kotlin.jvm.internal.C12775o.m28638h(r12, r2)     // Catch:{ Exception -> 0x0063 }
            java.lang.String r8 = r8.toUpperCase(r12)     // Catch:{ Exception -> 0x0063 }
            kotlin.jvm.internal.C12775o.m28638h(r8, r1)     // Catch:{ Exception -> 0x0063 }
            a0.d[] r12 = p018a0.C2105d.values()     // Catch:{ Exception -> 0x0063 }
            int r13 = r12.length     // Catch:{ Exception -> 0x0063 }
            r14 = 0
        L_0x004c:
            if (r14 >= r13) goto L_0x005d
            r15 = r12[r14]     // Catch:{ Exception -> 0x0063 }
            int r14 = r14 + 1
            java.lang.String r11 = r15.name()     // Catch:{ Exception -> 0x0063 }
            boolean r11 = kotlin.jvm.internal.C12775o.m28634d(r11, r8)     // Catch:{ Exception -> 0x0063 }
            if (r11 == 0) goto L_0x004c
            goto L_0x0064
        L_0x005d:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException     // Catch:{ Exception -> 0x0063 }
            r8.<init>(r0)     // Catch:{ Exception -> 0x0063 }
            throw r8     // Catch:{ Exception -> 0x0063 }
        L_0x0063:
            r15 = r10
        L_0x0064:
            java.lang.String r8 = "text_align_header"
            a0.i r10 = p018a0.C2111i.CENTER
            bo.app.u0 r11 = p042bo.app.C3724u0.f2650a     // Catch:{ Exception -> 0x009d }
            java.lang.String r8 = r9.getString(r8)     // Catch:{ Exception -> 0x009d }
            kotlin.jvm.internal.C12775o.m28638h(r8, r3)     // Catch:{ Exception -> 0x009d }
            java.util.Locale r11 = java.util.Locale.US     // Catch:{ Exception -> 0x009d }
            kotlin.jvm.internal.C12775o.m28638h(r11, r2)     // Catch:{ Exception -> 0x009d }
            java.lang.String r8 = r8.toUpperCase(r11)     // Catch:{ Exception -> 0x009d }
            kotlin.jvm.internal.C12775o.m28638h(r8, r1)     // Catch:{ Exception -> 0x009d }
            a0.i[] r11 = p018a0.C2111i.values()     // Catch:{ Exception -> 0x009d }
            int r12 = r11.length     // Catch:{ Exception -> 0x009d }
            r13 = 0
        L_0x0083:
            if (r13 >= r12) goto L_0x0097
            r14 = r11[r13]     // Catch:{ Exception -> 0x009d }
            int r13 = r13 + 1
            java.lang.String r5 = r14.name()     // Catch:{ Exception -> 0x009d }
            boolean r5 = kotlin.jvm.internal.C12775o.m28634d(r5, r8)     // Catch:{ Exception -> 0x009d }
            if (r5 == 0) goto L_0x0094
            goto L_0x009e
        L_0x0094:
            r5 = r18
            goto L_0x0083
        L_0x0097:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException     // Catch:{ Exception -> 0x009d }
            r5.<init>(r0)     // Catch:{ Exception -> 0x009d }
            throw r5     // Catch:{ Exception -> 0x009d }
        L_0x009d:
            r14 = r10
        L_0x009e:
            java.lang.String r5 = "text_align_message"
            a0.i r8 = p018a0.C2111i.CENTER
            bo.app.u0 r10 = p042bo.app.C3724u0.f2650a     // Catch:{ Exception -> 0x00d5 }
            java.lang.String r5 = r9.getString(r5)     // Catch:{ Exception -> 0x00d5 }
            kotlin.jvm.internal.C12775o.m28638h(r5, r3)     // Catch:{ Exception -> 0x00d5 }
            java.util.Locale r3 = java.util.Locale.US     // Catch:{ Exception -> 0x00d5 }
            kotlin.jvm.internal.C12775o.m28638h(r3, r2)     // Catch:{ Exception -> 0x00d5 }
            java.lang.String r2 = r5.toUpperCase(r3)     // Catch:{ Exception -> 0x00d5 }
            kotlin.jvm.internal.C12775o.m28638h(r2, r1)     // Catch:{ Exception -> 0x00d5 }
            a0.i[] r1 = p018a0.C2111i.values()     // Catch:{ Exception -> 0x00d5 }
            int r3 = r1.length     // Catch:{ Exception -> 0x00d5 }
            r5 = 0
        L_0x00bd:
            if (r5 >= r3) goto L_0x00cf
            r10 = r1[r5]     // Catch:{ Exception -> 0x00d5 }
            int r5 = r5 + 1
            java.lang.String r11 = r10.name()     // Catch:{ Exception -> 0x00d5 }
            boolean r11 = kotlin.jvm.internal.C12775o.m28634d(r11, r2)     // Catch:{ Exception -> 0x00d5 }
            if (r11 == 0) goto L_0x00bd
            r8 = r10
            goto L_0x00d5
        L_0x00cf:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException     // Catch:{ Exception -> 0x00d5 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00d5 }
            throw r1     // Catch:{ Exception -> 0x00d5 }
        L_0x00d5:
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r4
            r4 = r6
            r5 = r7
            r6 = r15
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r0 = "btns"
            org.json.JSONArray r0 = r9.optJSONArray(r0)
            org.json.JSONArray r1 = p042bo.app.C3142f3.m2916b(r17)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            if (r0 != 0) goto L_0x00fd
            java.util.List r0 = kotlin.collections.C12726w.m28524k()
            java.util.Iterator r0 = r0.iterator()
            goto L_0x0120
        L_0x00fd:
            int r3 = r0.length()
            r4 = 0
            tf.f r3 = p436tf.C13537l.m30893t(r4, r3)
            vf.g r3 = kotlin.collections.C12686e0.m28213R(r3)
            e0.m$f r4 = new e0.m$f
            r4.<init>(r0)
            vf.g r3 = p448vf.C13662o.m31280m(r3, r4)
            e0.m$g r4 = new e0.m$g
            r4.<init>(r0)
            vf.g r0 = p448vf.C13662o.m31287t(r3, r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0120:
            java.util.Iterator r0 = kotlin.collections.C12732z.m28556y(r0)
        L_0x0124:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0147
            java.lang.Object r3 = r0.next()
            kotlin.collections.j0 r3 = (kotlin.collections.C12698j0) r3
            e0.r r4 = new e0.r
            java.lang.Object r5 = r3.mo50562b()
            org.json.JSONObject r5 = (org.json.JSONObject) r5
            int r3 = r3.mo50561a()
            org.json.JSONObject r3 = r1.optJSONObject(r3)
            r4.<init>(r5, r3)
            r2.add(r4)
            goto L_0x0124
        L_0x0147:
            r3 = r16
            r3.mo41038G0(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p069e0.C7399m.<init>(org.json.JSONObject, bo.app.b2):void");
    }

    private C7399m(JSONObject jSONObject, C3023b2 b2Var, String str, int i, int i2, C2105d dVar, C2111i iVar, C2111i iVar2) {
        super(jSONObject, b2Var);
        this.f10220F = Color.parseColor("#333333");
        this.f10221G = Color.parseColor("#9B9B9B");
        this.f10223I = C12726w.m28524k();
        this.f10224J = C2105d.TOP;
        this.f10226M = C2111i.CENTER;
        mo41034C0(str);
        mo41036E0(i);
        mo41032A0(i2);
        if (jSONObject.has("frame_color")) {
            mo41033B0(Integer.valueOf(jSONObject.optInt("frame_color")));
        }
        mo41037F0(dVar);
        mo41035D0(iVar);
        mo41000q0(iVar2);
    }
}
