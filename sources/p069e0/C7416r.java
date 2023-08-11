package p069e0;

import android.graphics.Color;
import android.net.Uri;
import com.appboy.Constants;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;
import p018a0.C2102a;
import p042bo.app.C3503o3;
import p057d0.C7213c;
import p126j0.C8266c;
import p404of.C13074a;

/* renamed from: e0.r */
public class C7416r implements C7213c<JSONObject>, C7361d {

    /* renamed from: l */
    public static final C7417a f10247l = new C7417a((DefaultConstructorMarker) null);

    /* renamed from: m */
    private static final String f10248m = C8266c.m16405n(C7416r.class);

    /* renamed from: b */
    private JSONObject f10249b;

    /* renamed from: c */
    private C3503o3 f10250c;

    /* renamed from: d */
    private int f10251d;

    /* renamed from: e */
    private C2102a f10252e;

    /* renamed from: f */
    private Uri f10253f;

    /* renamed from: g */
    private String f10254g;

    /* renamed from: h */
    private boolean f10255h;

    /* renamed from: i */
    private int f10256i;

    /* renamed from: j */
    private int f10257j;

    /* renamed from: k */
    private int f10258k;

    /* renamed from: e0.r$a */
    public static final class C7417a {
        public /* synthetic */ C7417a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C7417a() {
        }
    }

    /* renamed from: e0.r$b */
    static final class C7418b extends C12777p implements C13074a<String> {

        /* renamed from: g */
        public static final C7418b f10259g = new C7418b();

        C7418b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Cannot apply dark theme with a null themes wrapper";
        }
    }

    public C7416r() {
        this.f10251d = -1;
        this.f10252e = C2102a.NONE;
        int parseColor = Color.parseColor("#1B78CF");
        this.f10256i = parseColor;
        this.f10257j = -1;
        this.f10258k = parseColor;
    }

    /* renamed from: A */
    public final int mo41056A() {
        return this.f10257j;
    }

    /* renamed from: G */
    public final void mo41057G(int i) {
        this.f10256i = i;
    }

    /* renamed from: Z */
    public final void mo41058Z(int i) {
        this.f10258k = i;
    }

    /* renamed from: b0 */
    public final C2102a mo41059b0() {
        return this.f10252e;
    }

    /* renamed from: c0 */
    public final void mo41060c0(int i) {
        this.f10257j = i;
    }

    /* renamed from: d0 */
    public final Uri mo41061d0() {
        return this.f10253f;
    }

    /* renamed from: e */
    public void mo40977e() {
        C3503o3 o3Var = this.f10250c;
        if (o3Var == null) {
            C8266c.m16397f(C8266c.f11641a, f10248m, (C8266c.C8267a) null, (Throwable) null, false, C7418b.f10259g, 14, (Object) null);
            return;
        }
        if (o3Var.mo29441a() != null) {
            mo41057G(o3Var.mo29441a().intValue());
        }
        if (o3Var.mo29443c() != null) {
            mo41060c0(o3Var.mo29443c().intValue());
        }
        if (o3Var.mo29442b() != null) {
            mo41058Z(o3Var.mo29442b().intValue());
        }
    }

    /* renamed from: e0 */
    public final int mo41062e0() {
        return this.f10256i;
    }

    /* renamed from: v */
    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", this.f10251d);
            jSONObject.put("click_action", this.f10252e.toString());
            Uri uri = this.f10253f;
            if (uri != null) {
                jSONObject.put(Constants.APPBOY_PUSH_DEEP_LINK_KEY, String.valueOf(uri));
            }
            jSONObject.putOpt("text", this.f10254g);
            jSONObject.put("bg_color", this.f10256i);
            jSONObject.put("text_color", this.f10257j);
            jSONObject.put("use_webview", this.f10255h);
            jSONObject.put("border_color", this.f10258k);
            return jSONObject;
        } catch (JSONException unused) {
            return this.f10249b;
        }
    }

    /* renamed from: w */
    public final int mo41064w() {
        return this.f10258k;
    }

    /* renamed from: x */
    public final boolean mo41065x() {
        return this.f10255h;
    }

    /* renamed from: y */
    public final String mo41066y() {
        return String.valueOf(this.f10251d);
    }

    /* renamed from: z */
    public final String mo41067z() {
        return this.f10254g;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7416r(org.json.JSONObject r14, org.json.JSONObject r15) {
        /*
            r13 = this;
            java.lang.String r0 = "jsonObject"
            kotlin.jvm.internal.C12775o.m28639i(r14, r0)
            java.lang.String r0 = "id"
            r1 = -1
            int r5 = r14.optInt(r0, r1)
            java.lang.String r0 = "click_action"
            a0.a r1 = p018a0.C2102a.NEWS_FEED
            r2 = 0
            bo.app.u0 r3 = p042bo.app.C3724u0.f2650a     // Catch:{ Exception -> 0x004c }
            java.lang.String r0 = r14.getString(r0)     // Catch:{ Exception -> 0x004c }
            java.lang.String r3 = "jsonObject.getString(key)"
            kotlin.jvm.internal.C12775o.m28638h(r0, r3)     // Catch:{ Exception -> 0x004c }
            java.util.Locale r3 = java.util.Locale.US     // Catch:{ Exception -> 0x004c }
            java.lang.String r4 = "US"
            kotlin.jvm.internal.C12775o.m28638h(r3, r4)     // Catch:{ Exception -> 0x004c }
            java.lang.String r0 = r0.toUpperCase(r3)     // Catch:{ Exception -> 0x004c }
            java.lang.String r3 = "this as java.lang.String).toUpperCase(locale)"
            kotlin.jvm.internal.C12775o.m28638h(r0, r3)     // Catch:{ Exception -> 0x004c }
            a0.a[] r3 = p018a0.C2102a.values()     // Catch:{ Exception -> 0x004c }
            int r4 = r3.length     // Catch:{ Exception -> 0x004c }
            r6 = r2
        L_0x0032:
            if (r6 >= r4) goto L_0x0044
            r7 = r3[r6]     // Catch:{ Exception -> 0x004c }
            int r6 = r6 + 1
            java.lang.String r8 = r7.name()     // Catch:{ Exception -> 0x004c }
            boolean r8 = kotlin.jvm.internal.C12775o.m28634d(r8, r0)     // Catch:{ Exception -> 0x004c }
            if (r8 == 0) goto L_0x0032
            r6 = r7
            goto L_0x004d
        L_0x0044:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch:{ Exception -> 0x004c }
            java.lang.String r3 = "Array contains no element matching the predicate."
            r0.<init>(r3)     // Catch:{ Exception -> 0x004c }
            throw r0     // Catch:{ Exception -> 0x004c }
        L_0x004c:
            r6 = r1
        L_0x004d:
            java.lang.String r0 = "uri"
            java.lang.String r7 = r14.optString(r0)
            java.lang.String r0 = "text"
            java.lang.String r8 = r14.optString(r0)
            java.lang.String r0 = "jsonObject.optString(TEXT)"
            kotlin.jvm.internal.C12775o.m28638h(r8, r0)
            java.lang.String r0 = "bg_color"
            int r9 = r14.optInt(r0)
            java.lang.String r0 = "text_color"
            int r10 = r14.optInt(r0)
            java.lang.String r0 = "use_webview"
            boolean r11 = r14.optBoolean(r0, r2)
            java.lang.String r0 = "border_color"
            int r12 = r14.optInt(r0)
            r2 = r13
            r3 = r14
            r4 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p069e0.C7416r.<init>(org.json.JSONObject, org.json.JSONObject):void");
    }

    private C7416r(JSONObject jSONObject, JSONObject jSONObject2, int i, C2102a aVar, String str, String str2, int i2, int i3, boolean z, int i4) {
        C3503o3 o3Var;
        this.f10251d = -1;
        this.f10252e = C2102a.NONE;
        int parseColor = Color.parseColor("#1B78CF");
        this.f10256i = parseColor;
        this.f10257j = -1;
        this.f10258k = parseColor;
        this.f10249b = jSONObject;
        this.f10251d = i;
        this.f10252e = aVar;
        if (aVar == C2102a.URI) {
            if (!(str == null || C13754v.m31532t(str))) {
                this.f10253f = Uri.parse(str);
            }
        }
        this.f10254g = str2;
        this.f10256i = i2;
        this.f10257j = i3;
        this.f10255h = z;
        this.f10258k = i4;
        if (jSONObject2 == null) {
            o3Var = null;
        } else {
            o3Var = new C3503o3(jSONObject2);
        }
        this.f10250c = o3Var;
    }
}
