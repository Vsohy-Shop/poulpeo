package p042bo.app;

import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import org.json.JSONArray;
import org.json.JSONObject;
import p069e0.C7358a;
import p126j0.C8266c;
import p404of.C13074a;

/* renamed from: bo.app.m6 */
public final class C3440m6 {

    /* renamed from: a */
    public static final C3440m6 f2184a = new C3440m6();

    /* renamed from: b */
    private static final String f2185b = C8266c.m16405n(C3440m6.class);

    /* renamed from: bo.app.m6$a */
    static final class C3441a extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3441a f2186b = new C3441a();

        C3441a() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Templated message Json was null. Not de-serializing templated message.";
        }
    }

    /* renamed from: bo.app.m6$b */
    static final class C3442b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f2187b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3442b(String str) {
            super(0);
            this.f2187b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Received templated message Json with unknown type: " + this.f2187b + ". Not parsing.";
        }
    }

    /* renamed from: bo.app.m6$c */
    static final class C3443c extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ JSONObject f2188b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3443c(JSONObject jSONObject) {
            super(0);
            this.f2188b = jSONObject;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Encountered exception processing templated message: ", this.f2188b);
        }
    }

    /* renamed from: bo.app.m6$d */
    static final class C3444d extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3444d f2189b = new C3444d();

        C3444d() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Received null or blank trigger condition Json. Not parsing.";
        }
    }

    /* renamed from: bo.app.m6$e */
    static final class C3445e extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f2190b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3445e(String str) {
            super(0);
            this.f2190b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return "Received triggered condition Json with unknown type: " + this.f2190b + ". Not parsing.";
        }
    }

    /* renamed from: bo.app.m6$f */
    static final class C3446f extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ String f2191b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3446f(String str) {
            super(0);
            this.f2191b = str;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Received unknown trigger type: ", this.f2191b);
        }
    }

    /* renamed from: bo.app.m6$g */
    static final class C3447g extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ JSONObject f2192b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3447g(JSONObject jSONObject) {
            super(0);
            this.f2192b = jSONObject;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Failed to deserialize triggered action Json: ", this.f2192b);
        }
    }

    /* renamed from: bo.app.m6$h */
    static final class C3448h extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3448h f2193b = new C3448h();

        C3448h() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Triggered actions Json array was null. Not de-serializing triggered actions.";
        }
    }

    /* renamed from: bo.app.m6$i */
    static final class C3449i extends C12777p implements C13074a<String> {

        /* renamed from: b */
        final /* synthetic */ JSONArray f2194b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3449i(JSONArray jSONArray) {
            super(0);
            this.f2194b = jSONArray;
        }

        /* renamed from: a */
        public final String invoke() {
            return C12775o.m28647q("Failed to deserialize triggered actions Json array: ", this.f2194b);
        }
    }

    private C3440m6() {
    }

    /* renamed from: a */
    public final C7358a mo29355a(JSONObject jSONObject, C3023b2 b2Var) {
        C12775o.m28639i(b2Var, "brazeManager");
        if (jSONObject == null) {
            try {
                C8266c.m16397f(C8266c.f11641a, f2185b, (C8266c.C8267a) null, (Throwable) null, false, C3441a.f2186b, 14, (Object) null);
                return null;
            } catch (Exception e) {
                C8266c.m16397f(C8266c.f11641a, f2185b, C8266c.C8267a.f11651g, e, false, new C3443c(jSONObject), 8, (Object) null);
                return null;
            }
        } else {
            String string = jSONObject.getString(JSONAPIResourceIdSerializer.FIELD_TYPE);
            if (C12775o.m28634d(string, "inapp")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                if (jSONObject2 == null) {
                    return null;
                }
                return C3142f3.m2915a(jSONObject2, b2Var);
            }
            C8266c.m16397f(C8266c.f11641a, f2185b, C8266c.C8267a.f11651g, (Throwable) null, false, new C3442b(string), 12, (Object) null);
            return null;
        }
    }

    /* renamed from: b */
    public final C3024b3 mo29358b(JSONObject jSONObject, C3023b2 b2Var) {
        C12775o.m28639i(jSONObject, "actionJson");
        C12775o.m28639i(b2Var, "brazeManager");
        try {
            String string = jSONObject.getString(JSONAPIResourceIdSerializer.FIELD_TYPE);
            if (C12775o.m28634d(string, "inapp")) {
                return new C3224i3(jSONObject, b2Var);
            }
            if (C12775o.m28634d(string, "templated_iam")) {
                return new C3790x5(jSONObject, b2Var);
            }
            C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.I, (Throwable) null, false, new C3446f(string), 6, (Object) null);
            return null;
        } catch (Exception e) {
            C8266c.m16397f(C8266c.f11641a, f2185b, C8266c.C8267a.f11651g, e, false, new C3447g(jSONObject), 8, (Object) null);
        }
    }

    /* renamed from: a */
    public final List<C3024b3> mo29357a(JSONArray jSONArray, C3023b2 b2Var) {
        C12775o.m28639i(b2Var, "brazeManager");
        if (jSONArray == null) {
            try {
                C8266c.m16397f(C8266c.f11641a, f2185b, (C8266c.C8267a) null, (Throwable) null, false, C3448h.f2193b, 14, (Object) null);
                return null;
            } catch (Exception e) {
                C8266c.m16397f(C8266c.f11641a, f2185b, C8266c.C8267a.f11651g, e, false, new C3449i(jSONArray), 8, (Object) null);
                return null;
            }
        } else {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                C12775o.m28638h(jSONObject, "actionJson");
                C3024b3 b = mo29358b(jSONObject, b2Var);
                if (b != null) {
                    arrayList.add(b);
                }
                i = i2;
            }
            return arrayList;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<p042bo.app.C3747v2> mo29356a(org.json.JSONArray r14) {
        /*
            r13 = this;
            java.lang.String r0 = "triggerConditionsJson"
            kotlin.jvm.internal.C12775o.m28639i(r14, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r14.length()
            r2 = 0
        L_0x000f:
            if (r2 >= r1) goto L_0x00e8
            int r3 = r2 + 1
            org.json.JSONObject r2 = r14.optJSONObject(r2)
            if (r2 != 0) goto L_0x002b
            j0.c r4 = p126j0.C8266c.f11641a
            java.lang.String r5 = f2185b
            j0.c$a r6 = p126j0.C8266c.C8267a.f11651g
            bo.app.m6$d r9 = p042bo.app.C3440m6.C3444d.f2189b
            r7 = 0
            r8 = 0
            r10 = 12
            r11 = 0
            p126j0.C8266c.m16397f(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x00e5
        L_0x002b:
            java.lang.String r4 = "type"
            java.lang.String r4 = r2.getString(r4)
            if (r4 == 0) goto L_0x00d2
            int r5 = r4.hashCode()
            switch(r5) {
                case -1679221933: goto L_0x00c0;
                case 3417674: goto L_0x00ae;
                case 3556498: goto L_0x009c;
                case 447503464: goto L_0x008a;
                case 717572172: goto L_0x0078;
                case 1512893214: goto L_0x0064;
                case 1743324417: goto L_0x0050;
                case 1926863907: goto L_0x003c;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x00d2
        L_0x003c:
            java.lang.String r5 = "push_click"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0046
            goto L_0x00d2
        L_0x0046:
            bo.app.i4 r4 = new bo.app.i4
            r4.<init>(r2)
            r0.add(r4)
            goto L_0x00e5
        L_0x0050:
            java.lang.String r5 = "purchase"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x005a
            goto L_0x00d2
        L_0x005a:
            bo.app.e4 r4 = new bo.app.e4
            r4.<init>(r2)
            r0.add(r4)
            goto L_0x00e5
        L_0x0064:
            java.lang.String r5 = "iam_click"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x006e
            goto L_0x00d2
        L_0x006e:
            bo.app.d3 r4 = new bo.app.d3
            r4.<init>(r2)
            r0.add(r4)
            goto L_0x00e5
        L_0x0078:
            java.lang.String r5 = "custom_event"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0081
            goto L_0x00d2
        L_0x0081:
            bo.app.d0 r4 = new bo.app.d0
            r4.<init>(r2)
            r0.add(r4)
            goto L_0x00e5
        L_0x008a:
            java.lang.String r5 = "custom_event_property"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x0093
            goto L_0x00d2
        L_0x0093:
            bo.app.f0 r4 = new bo.app.f0
            r4.<init>(r2)
            r0.add(r4)
            goto L_0x00e5
        L_0x009c:
            java.lang.String r2 = "test"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x00a5
            goto L_0x00d2
        L_0x00a5:
            bo.app.y5 r2 = new bo.app.y5
            r2.<init>()
            r0.add(r2)
            goto L_0x00e5
        L_0x00ae:
            java.lang.String r2 = "open"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x00b7
            goto L_0x00d2
        L_0x00b7:
            bo.app.w3 r2 = new bo.app.w3
            r2.<init>()
            r0.add(r2)
            goto L_0x00e5
        L_0x00c0:
            java.lang.String r5 = "purchase_property"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L_0x00c9
            goto L_0x00d2
        L_0x00c9:
            bo.app.g4 r4 = new bo.app.g4
            r4.<init>(r2)
            r0.add(r4)
            goto L_0x00e5
        L_0x00d2:
            j0.c r5 = p126j0.C8266c.f11641a
            java.lang.String r6 = f2185b
            j0.c$a r7 = p126j0.C8266c.C8267a.f11651g
            bo.app.m6$e r10 = new bo.app.m6$e
            r10.<init>(r4)
            r8 = 0
            r9 = 0
            r11 = 12
            r12 = 0
            p126j0.C8266c.m16397f(r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x00e5:
            r2 = r3
            goto L_0x000f
        L_0x00e8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C3440m6.mo29356a(org.json.JSONArray):java.util.List");
    }
}
