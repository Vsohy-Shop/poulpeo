package p042bo.app;

import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.appboy.Constants;
import com.rmn.apiclient.impl.jsonapi.serializer.JSONAPIResourceIdSerializer;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import kotlin.jvm.internal.C12764h0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.C12781t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import org.json.JSONArray;
import org.json.JSONObject;
import p018a0.C2106e;
import p042bo.app.C3040c1;
import p069e0.C7416r;
import p081f0.C7554a;
import p126j0.C8266c;
import p126j0.C8278g;
import p404of.C13074a;

/* renamed from: bo.app.j */
public class C3240j implements C3785x1 {

    /* renamed from: h */
    public static final C3241a f1842h = new C3241a((DefaultConstructorMarker) null);

    /* renamed from: i */
    static final /* synthetic */ KProperty<Object>[] f1843i;

    /* renamed from: b */
    private final C3040c1 f1844b;

    /* renamed from: c */
    private final JSONObject f1845c;

    /* renamed from: d */
    private final double f1846d;

    /* renamed from: e */
    private final String f1847e;

    /* renamed from: f */
    private final C3286j3 f1848f;

    /* renamed from: g */
    private final C3286j3 f1849g;

    /* renamed from: bo.app.j$a */
    public static final class C3241a {

        /* renamed from: bo.app.j$a$a */
        static final class C3242a extends C12777p implements C13074a<C3785x1> {

            /* renamed from: b */
            final /* synthetic */ String f1850b;

            /* renamed from: c */
            final /* synthetic */ String f1851c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3242a(String str, String str2) {
                super(0);
                this.f1850b = str;
                this.f1851c = str2;
            }

            /* renamed from: a */
            public final C3785x1 invoke() {
                JSONObject put = new JSONObject().put("key", this.f1850b).put("value", this.f1851c);
                C3040c1 c1Var = C3040c1.ADD_TO_CUSTOM_ATTRIBUTE_ARRAY;
                C12775o.m28638h(put, "eventData");
                return new C3240j(c1Var, put, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$a0 */
        static final class C3243a0 extends C12777p implements C13074a<C3785x1> {

            /* renamed from: b */
            final /* synthetic */ C3289j5 f1852b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3243a0(C3289j5 j5Var) {
                super(0);
                this.f1852b = j5Var;
            }

            /* renamed from: a */
            public final C3785x1 invoke() {
                C3240j jVar = new C3240j(C3040c1.SESSION_START, (JSONObject) null, 0.0d, (String) null, 14, (DefaultConstructorMarker) null);
                jVar.mo29046a(this.f1852b);
                return jVar;
            }
        }

        /* renamed from: bo.app.j$a$b */
        static final class C3244b extends C12777p implements C13074a<C3785x1> {

            /* renamed from: b */
            final /* synthetic */ String f1853b;

            /* renamed from: c */
            final /* synthetic */ String f1854c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3244b(String str, String str2) {
                super(0);
                this.f1853b = str;
                this.f1854c = str2;
            }

            /* renamed from: a */
            public final C3785x1 invoke() {
                JSONObject jSONObject = new JSONObject(this.f1853b);
                String string = jSONObject.getString(HintConstants.AUTOFILL_HINT_NAME);
                C3040c1.C3041a aVar = C3040c1.f1508c;
                C12775o.m28638h(string, "eventTypeString");
                C3040c1 a = aVar.mo28683a(string);
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                double d = jSONObject.getDouble("time");
                String i = C8278g.m16455i(jSONObject, "user_id");
                String i2 = C8278g.m16455i(jSONObject, "session_id");
                C12775o.m28638h(jSONObject2, "data");
                return new C3240j(a, jSONObject2, d, this.f1854c, i, i2);
            }
        }

        /* renamed from: bo.app.j$a$b0 */
        static final class C3245b0 extends C12777p implements C13074a<C3785x1> {

            /* renamed from: b */
            final /* synthetic */ String f1855b;

            /* renamed from: c */
            final /* synthetic */ String[] f1856c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3245b0(String str, String[] strArr) {
                super(0);
                this.f1855b = str;
                this.f1856c = strArr;
            }

            /* renamed from: a */
            public final C3785x1 invoke() {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", this.f1855b);
                String[] strArr = this.f1856c;
                if (strArr == null) {
                    jSONObject.put("value", JSONObject.NULL);
                } else {
                    jSONObject.put("value", C8278g.m16449c(strArr));
                }
                return new C3240j(C3040c1.SET_CUSTOM_ATTRIBUTE_ARRAY, jSONObject, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$c */
        static final class C3246c extends C12777p implements C13074a<C3785x1> {

            /* renamed from: b */
            final /* synthetic */ String f1857b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3246c(String str) {
                super(0);
                this.f1857b = str;
            }

            /* renamed from: a */
            public final C3785x1 invoke() {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(this.f1857b);
                jSONObject.put("ids", jSONArray);
                return new C3240j(C3040c1.CONTENT_CARDS_CLICK, jSONObject, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$c0 */
        static final class C3247c0 extends C12777p implements C13074a<C3785x1> {

            /* renamed from: b */
            final /* synthetic */ String f1858b;

            /* renamed from: c */
            final /* synthetic */ C3702t5 f1859c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3247c0(String str, C3702t5 t5Var) {
                super(0);
                this.f1858b = str;
                this.f1859c = t5Var;
            }

            /* renamed from: a */
            public final C3785x1 invoke() {
                JSONObject put = new JSONObject().put("group_id", this.f1858b).put(NotificationCompat.CATEGORY_STATUS, this.f1859c.forJsonPut());
                C3040c1 c1Var = C3040c1.SUBSCRIPTION_GROUP_UPDATE;
                C12775o.m28638h(put, "eventData");
                return new C3240j(c1Var, put, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$d */
        static final class C3248d extends C12777p implements C13074a<C3785x1> {

            /* renamed from: b */
            final /* synthetic */ String f1860b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3248d(String str) {
                super(0);
                this.f1860b = str;
            }

            /* renamed from: a */
            public final C3785x1 invoke() {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(this.f1860b);
                jSONObject.put("ids", jSONArray);
                return new C3240j(C3040c1.CONTENT_CARDS_CONTROL_IMPRESSION, jSONObject, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$d0 */
        static final class C3249d0 extends C12777p implements C13074a<C3785x1> {

            /* renamed from: b */
            final /* synthetic */ String f1861b;

            /* renamed from: c */
            final /* synthetic */ String f1862c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3249d0(String str, String str2) {
                super(0);
                this.f1861b = str;
                this.f1862c = str2;
            }

            /* renamed from: a */
            public final C3785x1 invoke() {
                JSONObject put = new JSONObject().put(Constants.APPBOY_PUSH_CONTENT_KEY, this.f1861b).put("l", this.f1862c);
                C3040c1 c1Var = C3040c1.USER_ALIAS;
                C12775o.m28638h(put, "eventData");
                return new C3240j(c1Var, put, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$e */
        static final class C3250e extends C12777p implements C13074a<C3785x1> {

            /* renamed from: b */
            final /* synthetic */ String f1863b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3250e(String str) {
                super(0);
                this.f1863b = str;
            }

            /* renamed from: a */
            public final C3785x1 invoke() {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(this.f1863b);
                jSONObject.put("ids", jSONArray);
                return new C3240j(C3040c1.CONTENT_CARDS_DISMISS, jSONObject, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$e0 */
        static final class C3251e0 extends C12777p implements C13074a<String> {

            /* renamed from: b */
            public static final C3251e0 f1864b = new C3251e0();

            C3251e0() {
                super(0);
            }

            /* renamed from: a */
            public final String invoke() {
                return "Failed to create event";
            }
        }

        /* renamed from: bo.app.j$a$f */
        static final class C3252f extends C12777p implements C13074a<C3785x1> {

            /* renamed from: b */
            final /* synthetic */ String f1865b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3252f(String str) {
                super(0);
                this.f1865b = str;
            }

            /* renamed from: a */
            public final C3785x1 invoke() {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(this.f1865b);
                jSONObject.put("ids", jSONArray);
                return new C3240j(C3040c1.CONTENT_CARDS_IMPRESSION, jSONObject, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$g */
        static final class C3253g extends C12777p implements C13074a<C3785x1> {

            /* renamed from: b */
            final /* synthetic */ String f1866b;

            /* renamed from: c */
            final /* synthetic */ C7554a f1867c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3253g(String str, C7554a aVar) {
                super(0);
                this.f1866b = str;
                this.f1867c = aVar;
            }

            /* renamed from: a */
            public final C3785x1 invoke() {
                JSONObject put = new JSONObject().put(Constants.APPBOY_PUSH_CUSTOM_NOTIFICATION_ID, this.f1866b);
                C7554a aVar = this.f1867c;
                if (aVar != null && aVar.mo41303x() > 0) {
                    put.put(Constants.APPBOY_PUSH_PRIORITY_KEY, this.f1867c.forJsonPut());
                }
                C3040c1 c1Var = C3040c1.CUSTOM_EVENT;
                C12775o.m28638h(put, "eventData");
                return new C3240j(c1Var, put, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$h */
        static final class C3254h extends C12777p implements C13074a<C3785x1> {

            /* renamed from: b */
            final /* synthetic */ Throwable f1868b;

            /* renamed from: c */
            final /* synthetic */ C3289j5 f1869c;

            /* renamed from: d */
            final /* synthetic */ boolean f1870d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3254h(Throwable th, C3289j5 j5Var, boolean z) {
                super(0);
                this.f1868b = th;
                this.f1869c = j5Var;
                this.f1870d = z;
            }

            /* renamed from: a */
            public final C3785x1 invoke() {
                String str;
                StringBuilder sb = new StringBuilder();
                sb.append("\n                original_sdk_version: 23.3.0\n                exception_class: ");
                sb.append(this.f1868b.getClass().getName());
                sb.append("\n                available_cpus: ");
                sb.append(Runtime.getRuntime().availableProcessors());
                sb.append("\n                ");
                C3289j5 j5Var = this.f1869c;
                if (j5Var == null) {
                    str = null;
                } else {
                    str = C12775o.m28647q("session_id: ", j5Var);
                }
                sb.append(str);
                sb.append("\n                ");
                sb.append(C3240j.f1842h.mo29074a(this.f1868b));
                sb.append("\n            ");
                JSONObject put = new JSONObject().put("e", C13745o.m31511f(sb.toString()));
                if (!this.f1870d) {
                    put.put("nop", true);
                }
                C3040c1 c1Var = C3040c1.INTERNAL_ERROR;
                C12775o.m28638h(put, "eventData");
                return new C3240j(c1Var, put, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$i */
        static final class C3255i extends C12777p implements C13074a<C3785x1> {

            /* renamed from: b */
            final /* synthetic */ String f1871b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3255i(String str) {
                super(0);
                this.f1871b = str;
            }

            /* renamed from: a */
            public final C3785x1 invoke() {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(this.f1871b);
                jSONObject.put("ids", jSONArray);
                return new C3240j(C3040c1.NEWS_FEED_CARD_CLICK, jSONObject, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$j */
        static final class C3256j extends C12777p implements C13074a<C3785x1> {

            /* renamed from: b */
            final /* synthetic */ String f1872b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3256j(String str) {
                super(0);
                this.f1872b = str;
            }

            /* renamed from: a */
            public final C3785x1 invoke() {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(this.f1872b);
                jSONObject.put("ids", jSONArray);
                return new C3240j(C3040c1.NEWS_FEED_CARD_IMPRESSION, jSONObject, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$k */
        static final class C3257k extends C12777p implements C13074a<C3785x1> {

            /* renamed from: b */
            final /* synthetic */ String f1873b;

            /* renamed from: c */
            final /* synthetic */ String f1874c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3257k(String str, String str2) {
                super(0);
                this.f1873b = str;
                this.f1874c = str2;
            }

            /* renamed from: a */
            public final C3785x1 invoke() {
                JSONObject put = new JSONObject().put("geo_id", this.f1873b).put("event_type", this.f1874c);
                C3040c1 c1Var = C3040c1.GEOFENCE;
                C12775o.m28638h(put, "eventData");
                return new C3240j(c1Var, put, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$l */
        static final class C3258l extends C12777p implements C13074a<C3785x1> {

            /* renamed from: b */
            final /* synthetic */ String f1875b;

            /* renamed from: c */
            final /* synthetic */ String f1876c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3258l(String str, String str2) {
                super(0);
                this.f1875b = str;
                this.f1876c = str2;
            }

            /* renamed from: a */
            public final C3785x1 invoke() {
                return new C3240j(C3040c1.INAPP_MESSAGE_BUTTON_CLICK, C3241a.m3084a(C3240j.f1842h, this.f1875b, this.f1876c, (C2106e) null, 4, (Object) null), 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$m */
        static final class C3259m extends C12777p implements C13074a<C3785x1> {

            /* renamed from: b */
            final /* synthetic */ String f1877b;

            /* renamed from: c */
            final /* synthetic */ C7416r f1878c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3259m(String str, C7416r rVar) {
                super(0);
                this.f1877b = str;
                this.f1878c = rVar;
            }

            /* renamed from: a */
            public final C3785x1 invoke() {
                return new C3240j(C3040c1.INAPP_MESSAGE_BUTTON_CLICK, C3241a.m3084a(C3240j.f1842h, this.f1877b, this.f1878c.mo41066y(), (C2106e) null, 4, (Object) null), 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$n */
        static final class C3260n extends C12777p implements C13074a<C3785x1> {

            /* renamed from: b */
            final /* synthetic */ String f1879b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3260n(String str) {
                super(0);
                this.f1879b = str;
            }

            /* renamed from: a */
            public final C3785x1 invoke() {
                return new C3240j(C3040c1.INAPP_MESSAGE_CLICK, C3241a.m3084a(C3240j.f1842h, this.f1879b, (String) null, (C2106e) null, 6, (Object) null), 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$o */
        static final class C3261o extends C12777p implements C13074a<C3785x1> {

            /* renamed from: b */
            final /* synthetic */ String f1880b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3261o(String str) {
                super(0);
                this.f1880b = str;
            }

            /* renamed from: a */
            public final C3785x1 invoke() {
                return new C3240j(C3040c1.INAPP_MESSAGE_CONTROL_IMPRESSION, C3241a.m3084a(C3240j.f1842h, this.f1880b, (String) null, (C2106e) null, 6, (Object) null), 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$p */
        static final class C3262p extends C12777p implements C13074a<C3785x1> {

            /* renamed from: b */
            final /* synthetic */ String f1881b;

            /* renamed from: c */
            final /* synthetic */ C2106e f1882c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3262p(String str, C2106e eVar) {
                super(0);
                this.f1881b = str;
                this.f1882c = eVar;
            }

            /* renamed from: a */
            public final C3785x1 invoke() {
                return new C3240j(C3040c1.INAPP_MESSAGE_DISPLAY_FAILURE, C3241a.m3084a(C3240j.f1842h, this.f1881b, (String) null, this.f1882c, 2, (Object) null), 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$q */
        static final class C3263q extends C12777p implements C13074a<C3785x1> {

            /* renamed from: b */
            final /* synthetic */ String f1883b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3263q(String str) {
                super(0);
                this.f1883b = str;
            }

            /* renamed from: a */
            public final C3785x1 invoke() {
                return new C3240j(C3040c1.INAPP_MESSAGE_IMPRESSION, C3241a.m3084a(C3240j.f1842h, this.f1883b, (String) null, (C2106e) null, 6, (Object) null), 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$r */
        static final class C3264r extends C12777p implements C13074a<C3785x1> {

            /* renamed from: b */
            final /* synthetic */ String f1884b;

            /* renamed from: c */
            final /* synthetic */ int f1885c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3264r(String str, int i) {
                super(0);
                this.f1884b = str;
                this.f1885c = i;
            }

            /* renamed from: a */
            public final C3785x1 invoke() {
                JSONObject put = new JSONObject().put("key", this.f1884b).put("value", this.f1885c);
                C3040c1 c1Var = C3040c1.INCREMENT;
                C12775o.m28638h(put, "eventData");
                return new C3240j(c1Var, put, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$s */
        static final class C3265s extends C12777p implements C13074a<C3785x1> {

            /* renamed from: b */
            final /* synthetic */ String f1886b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3265s(String str) {
                super(0);
                this.f1886b = str;
            }

            /* renamed from: a */
            public final C3785x1 invoke() {
                JSONObject put = new JSONObject().put(Constants.APPBOY_PUSH_CUSTOM_NOTIFICATION_ID, this.f1886b);
                C3040c1 c1Var = C3040c1.INTERNAL;
                C12775o.m28638h(put, "eventData");
                return new C3240j(c1Var, put, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$t */
        static final class C3266t extends C12777p implements C13074a<C3785x1> {

            /* renamed from: b */
            final /* synthetic */ String f1887b;

            /* renamed from: c */
            final /* synthetic */ double f1888c;

            /* renamed from: d */
            final /* synthetic */ double f1889d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3266t(String str, double d, double d2) {
                super(0);
                this.f1887b = str;
                this.f1888c = d;
                this.f1889d = d2;
            }

            /* renamed from: a */
            public final C3785x1 invoke() {
                JSONObject put = new JSONObject().put("key", this.f1887b).put("latitude", this.f1888c).put("longitude", this.f1889d);
                C3040c1 c1Var = C3040c1.LOCATION_CUSTOM_ATTRIBUTE_ADD;
                C12775o.m28638h(put, "eventData");
                return new C3240j(c1Var, put, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$u */
        static final class C3267u extends C12777p implements C13074a<C3785x1> {

            /* renamed from: b */
            final /* synthetic */ String f1890b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3267u(String str) {
                super(0);
                this.f1890b = str;
            }

            /* renamed from: a */
            public final C3785x1 invoke() {
                JSONObject put = new JSONObject().put("key", this.f1890b);
                C3040c1 c1Var = C3040c1.LOCATION_CUSTOM_ATTRIBUTE_REMOVE;
                C12775o.m28638h(put, "eventData");
                return new C3240j(c1Var, put, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$v */
        static final class C3268v extends C12777p implements C13074a<C3785x1> {

            /* renamed from: b */
            final /* synthetic */ C2993a2 f1891b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3268v(C2993a2 a2Var) {
                super(0);
                this.f1891b = a2Var;
            }

            /* renamed from: a */
            public final C3785x1 invoke() {
                return new C3240j(C3040c1.LOCATION_RECORDED, (JSONObject) this.f1891b.forJsonPut(), 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$w */
        static final class C3269w extends C12777p implements C13074a<C3785x1> {

            /* renamed from: b */
            final /* synthetic */ C7554a f1892b;

            /* renamed from: c */
            final /* synthetic */ String f1893c;

            /* renamed from: d */
            final /* synthetic */ String f1894d;

            /* renamed from: e */
            final /* synthetic */ BigDecimal f1895e;

            /* renamed from: f */
            final /* synthetic */ int f1896f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3269w(C7554a aVar, String str, String str2, BigDecimal bigDecimal, int i) {
                super(0);
                this.f1892b = aVar;
                this.f1893c = str;
                this.f1894d = str2;
                this.f1895e = bigDecimal;
                this.f1896f = i;
            }

            /* renamed from: a */
            public final C3785x1 invoke() {
                JSONObject jSONObject = new JSONObject();
                String str = this.f1893c;
                String str2 = this.f1894d;
                BigDecimal bigDecimal = this.f1895e;
                int i = this.f1896f;
                jSONObject.put("pid", str);
                jSONObject.put("c", str2);
                jSONObject.put(Constants.APPBOY_PUSH_PRIORITY_KEY, C3728u3.m3974a(bigDecimal).doubleValue());
                jSONObject.put("q", i);
                C7554a aVar = this.f1892b;
                if (aVar != null && aVar.mo41303x() > 0) {
                    jSONObject.put("pr", this.f1892b.forJsonPut());
                }
                return new C3240j(C3040c1.PURCHASE, jSONObject, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$x */
        static final class C3270x extends C12777p implements C13074a<C3785x1> {

            /* renamed from: b */
            final /* synthetic */ String f1897b;

            /* renamed from: c */
            final /* synthetic */ String f1898c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3270x(String str, String str2) {
                super(0);
                this.f1897b = str;
                this.f1898c = str2;
            }

            /* renamed from: a */
            public final C3785x1 invoke() {
                JSONObject put = new JSONObject().put(Constants.APPBOY_PUSH_CAMPAIGN_ID_KEY, this.f1897b).put(Constants.APPBOY_PUSH_CONTENT_KEY, this.f1898c);
                C3040c1 c1Var = C3040c1.PUSH_STORY_PAGE_CLICK;
                C12775o.m28638h(put, "eventData");
                return new C3240j(c1Var, put, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$y */
        static final class C3271y extends C12777p implements C13074a<C3785x1> {

            /* renamed from: b */
            final /* synthetic */ String f1899b;

            /* renamed from: c */
            final /* synthetic */ String f1900c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3271y(String str, String str2) {
                super(0);
                this.f1899b = str;
                this.f1900c = str2;
            }

            /* renamed from: a */
            public final C3785x1 invoke() {
                JSONObject put = new JSONObject().put("key", this.f1899b).put("value", this.f1900c);
                C3040c1 c1Var = C3040c1.REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY;
                C12775o.m28638h(put, "eventData");
                return new C3240j(c1Var, put, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: bo.app.j$a$z */
        static final class C3272z extends C12777p implements C13074a<C3785x1> {

            /* renamed from: b */
            final /* synthetic */ long f1901b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3272z(long j) {
                super(0);
                this.f1901b = j;
            }

            /* renamed from: a */
            public final C3785x1 invoke() {
                JSONObject put = new JSONObject().put(Constants.APPBOY_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, this.f1901b);
                C3040c1 c1Var = C3040c1.SESSION_END;
                C12775o.m28638h(put, "eventData");
                return new C3240j(c1Var, put, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        public /* synthetic */ C3241a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C3785x1 mo29069a(String str, C7554a aVar) {
            C12775o.m28639i(str, "eventName");
            return m3083a((C13074a<? extends C3785x1>) new C3253g(str, aVar));
        }

        /* renamed from: b */
        public final C3785x1 mo29076b(String str) {
            C12775o.m28639i(str, "cardId");
            return m3083a((C13074a<? extends C3785x1>) new C3248d(str));
        }

        /* renamed from: c */
        public final C3785x1 mo29078c(String str) {
            C12775o.m28639i(str, "cardId");
            return m3083a((C13074a<? extends C3785x1>) new C3250e(str));
        }

        /* renamed from: d */
        public final C3785x1 mo29080d(String str) {
            C12775o.m28639i(str, "cardId");
            return m3083a((C13074a<? extends C3785x1>) new C3252f(str));
        }

        /* renamed from: e */
        public final C3785x1 mo29082e(String str) {
            C12775o.m28639i(str, "cardId");
            return m3083a((C13074a<? extends C3785x1>) new C3255i(str));
        }

        /* renamed from: f */
        public final C3785x1 mo29084f(String str) {
            C12775o.m28639i(str, "cardId");
            return m3083a((C13074a<? extends C3785x1>) new C3256j(str));
        }

        /* renamed from: g */
        public final C3785x1 mo29087g(String str, String str2) {
            C12775o.m28639i(str, "alias");
            C12775o.m28639i(str2, "label");
            return m3083a((C13074a<? extends C3785x1>) new C3249d0(str, str2));
        }

        /* renamed from: h */
        public final C3785x1 mo29088h(String str) {
            C12775o.m28639i(str, "triggerId");
            return m3083a((C13074a<? extends C3785x1>) new C3261o(str));
        }

        /* renamed from: i */
        public final C3785x1 mo29089i(String str) {
            C12775o.m28639i(str, "triggerId");
            return m3083a((C13074a<? extends C3785x1>) new C3263q(str));
        }

        /* renamed from: j */
        public final C3785x1 mo29090j(String str) {
            C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
            return m3083a((C13074a<? extends C3785x1>) new C3265s(str));
        }

        /* renamed from: k */
        public final C3785x1 mo29091k(String str) {
            return m3083a((C13074a<? extends C3785x1>) new C3267u(str));
        }

        private C3241a() {
        }

        /* renamed from: a */
        public final C3785x1 mo29071a(String str, String str2, BigDecimal bigDecimal, int i, C7554a aVar) {
            C12775o.m28639i(str, "productId");
            C12775o.m28639i(str2, "currencyCode");
            C12775o.m28639i(bigDecimal, "price");
            return m3083a((C13074a<? extends C3785x1>) new C3269w(aVar, str, str2, bigDecimal, i));
        }

        /* renamed from: b */
        public final C3785x1 mo29077b(String str, String str2) {
            C12775o.m28639i(str, "serializedEvent");
            C12775o.m28639i(str2, "uniqueIdentifier");
            return m3083a((C13074a<? extends C3785x1>) new C3244b(str, str2));
        }

        /* renamed from: c */
        public final C3785x1 mo29079c(String str, String str2) {
            C12775o.m28639i(str, "id");
            C12775o.m28639i(str2, "eventType");
            return m3083a((C13074a<? extends C3785x1>) new C3257k(str, str2));
        }

        /* renamed from: d */
        public final C3785x1 mo29081d(String str, String str2) {
            C12775o.m28639i(str, "triggerId");
            C12775o.m28639i(str2, "buttonId");
            return m3083a((C13074a<? extends C3785x1>) new C3258l(str, str2));
        }

        /* renamed from: e */
        public final C3785x1 mo29083e(String str, String str2) {
            C12775o.m28639i(str, "campaignId");
            C12775o.m28639i(str2, "pageId");
            return m3083a((C13074a<? extends C3785x1>) new C3270x(str, str2));
        }

        /* renamed from: f */
        public final C3785x1 mo29085f(String str, String str2) {
            C12775o.m28639i(str, "key");
            C12775o.m28639i(str2, "value");
            return m3083a((C13074a<? extends C3785x1>) new C3271y(str, str2));
        }

        /* renamed from: g */
        public final C3785x1 mo29086g(String str) {
            C12775o.m28639i(str, "triggerId");
            return m3083a((C13074a<? extends C3785x1>) new C3260n(str));
        }

        /* renamed from: a */
        public final C3785x1 mo29061a(C2993a2 a2Var) {
            C12775o.m28639i(a2Var, "location");
            return m3083a((C13074a<? extends C3785x1>) new C3268v(a2Var));
        }

        /* renamed from: a */
        public final C3785x1 mo29073a(Throwable th, C3289j5 j5Var, boolean z) {
            C12775o.m28639i(th, "throwable");
            return m3083a((C13074a<? extends C3785x1>) new C3254h(th, j5Var, z));
        }

        /* renamed from: a */
        public final C3785x1 mo29063a(String str) {
            C12775o.m28639i(str, "cardId");
            return m3083a((C13074a<? extends C3785x1>) new C3246c(str));
        }

        /* renamed from: a */
        public final C3785x1 mo29068a(String str, C7416r rVar) {
            C12775o.m28639i(str, "triggerId");
            C12775o.m28639i(rVar, "messageButton");
            return m3083a((C13074a<? extends C3785x1>) new C3259m(str, rVar));
        }

        /* renamed from: a */
        public final C3785x1 mo29066a(String str, C2106e eVar) {
            C12775o.m28639i(str, "triggerId");
            C12775o.m28639i(eVar, "inAppMessageFailureType");
            return m3083a((C13074a<? extends C3785x1>) new C3262p(str, eVar));
        }

        /* renamed from: a */
        public final C3785x1 mo29059a() {
            return mo29090j("feed_displayed");
        }

        /* renamed from: a */
        public final C3785x1 mo29065a(String str, int i) {
            C12775o.m28639i(str, "customUserAttributeKey");
            return m3083a((C13074a<? extends C3785x1>) new C3264r(str, i));
        }

        /* renamed from: a */
        public final C3785x1 mo29070a(String str, String str2) {
            C12775o.m28639i(str, "key");
            C12775o.m28639i(str2, "value");
            return m3083a((C13074a<? extends C3785x1>) new C3242a(str, str2));
        }

        /* renamed from: a */
        public final C3785x1 mo29072a(String str, String[] strArr) {
            C12775o.m28639i(str, "key");
            return m3083a((C13074a<? extends C3785x1>) new C3245b0(str, strArr));
        }

        /* renamed from: a */
        public final C3785x1 mo29062a(C3289j5 j5Var) {
            C12775o.m28639i(j5Var, "sessionId");
            return m3083a((C13074a<? extends C3785x1>) new C3243a0(j5Var));
        }

        /* renamed from: a */
        public final C3785x1 mo29060a(long j) {
            return m3083a((C13074a<? extends C3785x1>) new C3272z(j));
        }

        /* renamed from: a */
        public final C3785x1 mo29064a(String str, double d, double d2) {
            C12775o.m28639i(str, "key");
            return m3083a((C13074a<? extends C3785x1>) new C3266t(str, d, d2));
        }

        /* renamed from: a */
        public final C3785x1 mo29067a(String str, C3702t5 t5Var) {
            C12775o.m28639i(str, "subscriptionGroupId");
            C12775o.m28639i(t5Var, "subscriptionGroupStatus");
            return m3083a((C13074a<? extends C3785x1>) new C3247c0(str, t5Var));
        }

        /* renamed from: a */
        public final String mo29074a(Throwable th) {
            C12775o.m28639i(th, "throwable");
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            C12775o.m28638h(stringWriter2, "result.toString()");
            return C13760y.m31607S0(stringWriter2, 5000);
        }

        /* renamed from: a */
        public static /* synthetic */ JSONObject m3084a(C3241a aVar, String str, String str2, C2106e eVar, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                eVar = null;
            }
            return aVar.mo29075a(str, str2, eVar);
        }

        /* renamed from: a */
        public final JSONObject mo29075a(String str, String str2, C2106e eVar) {
            JSONObject jSONObject = new JSONObject();
            boolean z = false;
            if (!(str == null || str.length() == 0)) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(str);
                jSONObject.put("trigger_ids", jSONArray);
            }
            if (str2 == null || str2.length() == 0) {
                z = true;
            }
            if (!z) {
                jSONObject.put("bid", str2);
            }
            if (eVar != null) {
                jSONObject.put("error_code", eVar.forJsonPut());
            }
            return jSONObject;
        }

        /* renamed from: a */
        private final C3785x1 m3083a(C13074a<? extends C3785x1> aVar) {
            try {
                return (C3785x1) aVar.invoke();
            } catch (Exception e) {
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.f11649e, e, false, C3251e0.f1864b, 4, (Object) null);
                return null;
            }
        }
    }

    /* renamed from: bo.app.j$b */
    static final class C3273b extends C12777p implements C13074a<String> {

        /* renamed from: b */
        public static final C3273b f1902b = new C3273b();

        C3273b() {
            super(0);
        }

        /* renamed from: a */
        public final String invoke() {
            return "Caught exception creating Braze event json";
        }
    }

    static {
        Class<C3240j> cls = C3240j.class;
        f1843i = new KProperty[]{C12764h0.m28589e(new C12781t(cls, "userId", "getUserId()Ljava/lang/String;", 0)), C12764h0.m28589e(new C12781t(cls, "sessionId", "getSessionId()Lcom/braze/models/SessionId;", 0))};
    }

    public C3240j(C3040c1 c1Var, JSONObject jSONObject, double d, String str) {
        C12775o.m28639i(c1Var, JSONAPIResourceIdSerializer.FIELD_TYPE);
        C12775o.m28639i(jSONObject, "data");
        C12775o.m28639i(str, "uniqueIdentifier");
        this.f1844b = c1Var;
        this.f1845c = jSONObject;
        this.f1846d = d;
        this.f1847e = str;
        this.f1848f = new C3286j3();
        this.f1849g = new C3286j3();
        if (c1Var == C3040c1.UNKNOWN) {
            throw new IllegalArgumentException("Event type cannot be unknown.");
        }
    }

    /* renamed from: a */
    public final void mo29047a(String str) {
        this.f1848f.setValue(this, f1843i[0], str);
    }

    /* renamed from: d */
    public boolean mo29048d() {
        if (this.f1844b != C3040c1.INTERNAL_ERROR || !mo29053k().optBoolean("nop", false)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0034 A[Catch:{ JSONException -> 0x004e }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0043 A[Catch:{ JSONException -> 0x004e }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044 A[Catch:{ JSONException -> 0x004e }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject forJsonPut() {
        /*
            r10 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "name"
            bo.app.c1 r2 = r10.f1844b     // Catch:{ JSONException -> 0x004e }
            java.lang.String r2 = r2.forJsonPut()     // Catch:{ JSONException -> 0x004e }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x004e }
            java.lang.String r1 = "data"
            org.json.JSONObject r2 = r10.mo29053k()     // Catch:{ JSONException -> 0x004e }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x004e }
            java.lang.String r1 = "time"
            double r2 = r10.mo29057v()     // Catch:{ JSONException -> 0x004e }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x004e }
            java.lang.String r1 = r10.mo29058w()     // Catch:{ JSONException -> 0x004e }
            if (r1 == 0) goto L_0x0031
            int r1 = r1.length()     // Catch:{ JSONException -> 0x004e }
            if (r1 != 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r1 = 0
            goto L_0x0032
        L_0x0031:
            r1 = 1
        L_0x0032:
            if (r1 != 0) goto L_0x003d
            java.lang.String r1 = "user_id"
            java.lang.String r2 = r10.mo29058w()     // Catch:{ JSONException -> 0x004e }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x004e }
        L_0x003d:
            bo.app.j5 r1 = r10.mo29054n()     // Catch:{ JSONException -> 0x004e }
            if (r1 != 0) goto L_0x0044
            goto L_0x005d
        L_0x0044:
            java.lang.String r2 = "session_id"
            java.lang.String r1 = r1.forJsonPut()     // Catch:{ JSONException -> 0x004e }
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x004e }
            goto L_0x005d
        L_0x004e:
            r1 = move-exception
            r5 = r1
            j0.c r2 = p126j0.C8266c.f11641a
            j0.c$a r4 = p126j0.C8266c.C8267a.f11649e
            bo.app.j$b r7 = p042bo.app.C3240j.C3273b.f1902b
            r6 = 0
            r8 = 4
            r9 = 0
            r3 = r10
            p126j0.C8266c.m16396e(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x005d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C3240j.forJsonPut():org.json.JSONObject");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C12775o.m28634d(getClass(), obj.getClass())) {
            return false;
        }
        return C12775o.m28634d(mo29055r(), ((C3240j) obj).mo29055r());
    }

    public int hashCode() {
        return mo29055r().hashCode();
    }

    /* renamed from: j */
    public final C3040c1 mo29052j() {
        return this.f1844b;
    }

    /* renamed from: k */
    public JSONObject mo29053k() {
        return this.f1845c;
    }

    /* renamed from: n */
    public final C3289j5 mo29054n() {
        return (C3289j5) this.f1849g.getValue(this, f1843i[1]);
    }

    /* renamed from: r */
    public String mo29055r() {
        return this.f1847e;
    }

    public String toString() {
        return mo29791p();
    }

    /* renamed from: v */
    public double mo29057v() {
        return this.f1846d;
    }

    /* renamed from: w */
    public final String mo29058w() {
        return (String) this.f1848f.getValue(this, f1843i[0]);
    }

    /* renamed from: a */
    public final void mo29046a(C3289j5 j5Var) {
        this.f1849g.setValue(this, f1843i[1], j5Var);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C3240j(p042bo.app.C3040c1 r7, org.json.JSONObject r8, double r9, java.lang.String r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r6 = this;
            r13 = r12 & 2
            if (r13 == 0) goto L_0x0009
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
        L_0x0009:
            r2 = r8
            r8 = r12 & 4
            if (r8 == 0) goto L_0x0012
            double r9 = p126j0.C8273e.m16437j()
        L_0x0012:
            r3 = r9
            r8 = r12 & 8
            if (r8 == 0) goto L_0x0024
            java.util.UUID r8 = java.util.UUID.randomUUID()
            java.lang.String r11 = r8.toString()
            java.lang.String r8 = "randomUUID().toString()"
            kotlin.jvm.internal.C12775o.m28638h(r11, r8)
        L_0x0024:
            r5 = r11
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p042bo.app.C3240j.<init>(bo.app.c1, org.json.JSONObject, double, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C3240j(C3040c1 c1Var, JSONObject jSONObject, double d, String str, String str2, String str3) {
        this(c1Var, jSONObject, d, str);
        C3289j5 j5Var;
        C12775o.m28639i(c1Var, "eventType");
        C12775o.m28639i(jSONObject, "eventData");
        C12775o.m28639i(str, "uniqueIdentifier");
        mo29047a(str2);
        if (str3 == null) {
            j5Var = null;
        } else {
            j5Var = C3289j5.f1947d.mo29165a(str3);
        }
        mo29046a(j5Var);
    }
}
