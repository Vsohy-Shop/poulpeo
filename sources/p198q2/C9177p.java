package p198q2;

import android.net.Uri;
import androidx.autofill.HintConstants;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: q2.p */
/* compiled from: FetchedAppSettings.kt */
public final class C9177p {

    /* renamed from: t */
    public static final C9178a f13450t = new C9178a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final boolean f13451a;

    /* renamed from: b */
    private final String f13452b;

    /* renamed from: c */
    private final boolean f13453c;

    /* renamed from: d */
    private final int f13454d;

    /* renamed from: e */
    private final EnumSet<C9119a0> f13455e;

    /* renamed from: f */
    private final Map<String, Map<String, C9179b>> f13456f;

    /* renamed from: g */
    private final boolean f13457g;

    /* renamed from: h */
    private final C9160h f13458h;

    /* renamed from: i */
    private final String f13459i;

    /* renamed from: j */
    private final String f13460j;

    /* renamed from: k */
    private final boolean f13461k;

    /* renamed from: l */
    private final boolean f13462l;

    /* renamed from: m */
    private final JSONArray f13463m;

    /* renamed from: n */
    private final String f13464n;

    /* renamed from: o */
    private final boolean f13465o;

    /* renamed from: p */
    private final boolean f13466p;

    /* renamed from: q */
    private final String f13467q;

    /* renamed from: r */
    private final String f13468r;

    /* renamed from: s */
    private final String f13469s;

    /* renamed from: q2.p$a */
    /* compiled from: FetchedAppSettings.kt */
    public static final class C9178a {
        private C9178a() {
        }

        public /* synthetic */ C9178a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: q2.p$b */
    /* compiled from: FetchedAppSettings.kt */
    public static final class C9179b {

        /* renamed from: e */
        public static final C9180a f13470e = new C9180a((DefaultConstructorMarker) null);

        /* renamed from: a */
        private final String f13471a;

        /* renamed from: b */
        private final String f13472b;

        /* renamed from: c */
        private final Uri f13473c;

        /* renamed from: d */
        private final int[] f13474d;

        /* renamed from: q2.p$b$a */
        /* compiled from: FetchedAppSettings.kt */
        public static final class C9180a {
            private C9180a() {
            }

            public /* synthetic */ C9180a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: b */
            private final int[] m18795b(JSONArray jSONArray) {
                if (jSONArray == null) {
                    return null;
                }
                int length = jSONArray.length();
                int[] iArr = new int[length];
                for (int i = 0; i < length; i++) {
                    int i2 = -1;
                    int optInt = jSONArray.optInt(i, -1);
                    if (optInt == -1) {
                        String optString = jSONArray.optString(i);
                        if (!C9138d0.m18618T(optString)) {
                            try {
                                C12775o.m28638h(optString, "versionString");
                                i2 = Integer.parseInt(optString);
                            } catch (NumberFormatException e) {
                                C9138d0.m18624Z("FacebookSDK", e);
                            }
                            optInt = i2;
                        }
                    }
                    iArr[i] = optInt;
                }
                return iArr;
            }

            /* renamed from: a */
            public final C9179b mo43467a(JSONObject jSONObject) {
                C12775o.m28639i(jSONObject, "dialogConfigJSON");
                String optString = jSONObject.optString(HintConstants.AUTOFILL_HINT_NAME);
                Uri uri = null;
                if (C9138d0.m18618T(optString)) {
                    return null;
                }
                C12775o.m28638h(optString, "dialogNameWithFeature");
                List t0 = C13755w.m31594t0(optString, new String[]{"|"}, false, 0, 6, (Object) null);
                if (t0.size() != 2) {
                    return null;
                }
                String str = (String) C12686e0.m28221Z(t0);
                String str2 = (String) C12686e0.m28231j0(t0);
                if (C9138d0.m18618T(str) || C9138d0.m18618T(str2)) {
                    return null;
                }
                String optString2 = jSONObject.optString("url");
                if (!C9138d0.m18618T(optString2)) {
                    uri = Uri.parse(optString2);
                }
                return new C9179b(str, str2, uri, m18795b(jSONObject.optJSONArray("versions")), (DefaultConstructorMarker) null);
            }
        }

        public /* synthetic */ C9179b(String str, String str2, Uri uri, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, uri, iArr);
        }

        /* renamed from: a */
        public final String mo43465a() {
            return this.f13471a;
        }

        /* renamed from: b */
        public final String mo43466b() {
            return this.f13472b;
        }

        private C9179b(String str, String str2, Uri uri, int[] iArr) {
            this.f13471a = str;
            this.f13472b = str2;
            this.f13473c = uri;
            this.f13474d = iArr;
        }
    }

    public C9177p(boolean z, String str, boolean z2, int i, EnumSet<C9119a0> enumSet, Map<String, ? extends Map<String, C9179b>> map, boolean z3, C9160h hVar, String str2, String str3, boolean z4, boolean z5, JSONArray jSONArray, String str4, boolean z6, boolean z7, String str5, String str6, String str7) {
        C9160h hVar2 = hVar;
        String str8 = str2;
        String str9 = str3;
        String str10 = str4;
        C12775o.m28639i(str, "nuxContent");
        C12775o.m28639i(enumSet, "smartLoginOptions");
        C12775o.m28639i(map, "dialogConfigurations");
        C12775o.m28639i(hVar2, "errorClassification");
        C12775o.m28639i(str8, "smartLoginBookmarkIconURL");
        C12775o.m28639i(str9, "smartLoginMenuIconURL");
        C12775o.m28639i(str10, "sdkUpdateMessage");
        this.f13451a = z;
        this.f13452b = str;
        this.f13453c = z2;
        this.f13454d = i;
        this.f13455e = enumSet;
        this.f13456f = map;
        this.f13457g = z3;
        this.f13458h = hVar2;
        this.f13459i = str8;
        this.f13460j = str9;
        this.f13461k = z4;
        this.f13462l = z5;
        this.f13463m = jSONArray;
        this.f13464n = str10;
        this.f13465o = z6;
        this.f13466p = z7;
        this.f13467q = str5;
        this.f13468r = str6;
        this.f13469s = str7;
    }

    /* renamed from: a */
    public final boolean mo43453a() {
        return this.f13457g;
    }

    /* renamed from: b */
    public final boolean mo43454b() {
        return this.f13462l;
    }

    /* renamed from: c */
    public final C9160h mo43455c() {
        return this.f13458h;
    }

    /* renamed from: d */
    public final JSONArray mo43456d() {
        return this.f13463m;
    }

    /* renamed from: e */
    public final boolean mo43457e() {
        return this.f13461k;
    }

    /* renamed from: f */
    public final String mo43458f() {
        return this.f13467q;
    }

    /* renamed from: g */
    public final String mo43459g() {
        return this.f13469s;
    }

    /* renamed from: h */
    public final String mo43460h() {
        return this.f13464n;
    }

    /* renamed from: i */
    public final int mo43461i() {
        return this.f13454d;
    }

    /* renamed from: j */
    public final EnumSet<C9119a0> mo43462j() {
        return this.f13455e;
    }

    /* renamed from: k */
    public final String mo43463k() {
        return this.f13468r;
    }

    /* renamed from: l */
    public final boolean mo43464l() {
        return this.f13451a;
    }
}
