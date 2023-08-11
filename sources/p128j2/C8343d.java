package p128j2;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.autofill.HintConstants;
import com.facebook.C4509a;
import com.facebook.C4555l;
import com.facebook.FacebookSdk;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C12703l0;
import kotlin.jvm.internal.C12770k0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p107h2.C7903a;
import p118i2.C8099f;
import p158m2.C8812d;
import p198q2.C9138d0;
import p198q2.C9166l;
import p251v2.C9925a;
import p436tf.C13528f;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: j2.d */
/* compiled from: ModelManager.kt */
public final class C8343d {

    /* renamed from: a */
    private static final Map<String, C8345b> f11762a = new ConcurrentHashMap();

    /* renamed from: b */
    private static final List<String> f11763b = C12726w.m28527n("other", "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout");

    /* renamed from: c */
    private static final List<String> f11764c = C12726w.m28527n("none", "address", "health");

    /* renamed from: d */
    public static final C8343d f11765d = new C8343d();

    /* renamed from: j2.d$a */
    /* compiled from: ModelManager.kt */
    public enum C8344a {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        /* renamed from: a */
        public final String mo42295a() {
            int i = C8342c.f11760a[ordinal()];
            if (i == 1) {
                return "integrity_detect";
            }
            if (i == 2) {
                return "app_event_pred";
            }
            throw new NoWhenBranchMatchedException();
        }

        /* renamed from: b */
        public final String mo42296b() {
            int i = C8342c.f11761b[ordinal()];
            if (i == 1) {
                return "MTML_INTEGRITY_DETECT";
            }
            if (i == 2) {
                return "MTML_APP_EVENT_PRED";
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: j2.d$b */
    /* compiled from: ModelManager.kt */
    private static final class C8345b {

        /* renamed from: i */
        public static final C8346a f11769i = new C8346a((DefaultConstructorMarker) null);

        /* renamed from: a */
        private File f11770a;

        /* renamed from: b */
        private C8340b f11771b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public Runnable f11772c;

        /* renamed from: d */
        private String f11773d;

        /* renamed from: e */
        private String f11774e;

        /* renamed from: f */
        private String f11775f;

        /* renamed from: g */
        private int f11776g;

        /* renamed from: h */
        private float[] f11777h;

        /* renamed from: j2.d$b$a */
        /* compiled from: ModelManager.kt */
        public static final class C8346a {

            /* renamed from: j2.d$b$a$a */
            /* compiled from: ModelManager.kt */
            static final class C8347a implements C8099f.C8100a {

                /* renamed from: a */
                final /* synthetic */ List f11778a;

                /* renamed from: j2.d$b$a$a$a */
                /* compiled from: ModelManager.kt */
                static final class C8348a implements C8099f.C8100a {

                    /* renamed from: a */
                    final /* synthetic */ C8345b f11779a;

                    /* renamed from: b */
                    final /* synthetic */ C8340b f11780b;

                    C8348a(C8345b bVar, C8340b bVar2) {
                        this.f11779a = bVar;
                        this.f11780b = bVar2;
                    }

                    /* renamed from: a */
                    public final void mo41936a(File file) {
                        C12775o.m28639i(file, "file");
                        this.f11779a.mo42304i(this.f11780b);
                        this.f11779a.mo42306k(file);
                        Runnable a = this.f11779a.f11772c;
                        if (a != null) {
                            a.run();
                        }
                    }
                }

                C8347a(List list) {
                    this.f11778a = list;
                }

                /* renamed from: a */
                public final void mo41936a(File file) {
                    C12775o.m28639i(file, "file");
                    C8340b a = C8340b.f11747n.mo42294a(file);
                    if (a != null) {
                        for (C8345b bVar : this.f11778a) {
                            C8345b.f11769i.m16592d(bVar.mo42300e(), bVar.mo42302g() + "_" + bVar.mo42303h() + "_rule", new C8348a(bVar, a));
                        }
                    }
                }
            }

            private C8346a() {
            }

            public /* synthetic */ C8346a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: c */
            private final void m16591c(String str, int i) {
                File[] listFiles;
                boolean z;
                File a = C8354g.m16609a();
                if (a != null && (listFiles = a.listFiles()) != null) {
                    if (listFiles.length == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        String str2 = str + "_" + i;
                        for (File file : listFiles) {
                            C12775o.m28638h(file, "f");
                            String name = file.getName();
                            C12775o.m28638h(name, HintConstants.AUTOFILL_HINT_NAME);
                            if (C13754v.m31525E(name, str, false, 2, (Object) null) && !C13754v.m31525E(name, str2, false, 2, (Object) null)) {
                                file.delete();
                            }
                        }
                    }
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: d */
            public final void m16592d(String str, String str2, C8099f.C8100a aVar) {
                File file = new File(C8354g.m16609a(), str2);
                if (str == null || file.exists()) {
                    aVar.mo41936a(file);
                } else {
                    new C8099f(str, file, aVar).execute(new String[0]);
                }
            }

            /* renamed from: b */
            public final C8345b mo42307b(JSONObject jSONObject) {
                if (jSONObject == null) {
                    return null;
                }
                try {
                    String string = jSONObject.getString("use_case");
                    String string2 = jSONObject.getString("asset_uri");
                    String optString = jSONObject.optString("rules_uri", (String) null);
                    int i = jSONObject.getInt("version_id");
                    float[] e = C8343d.m16564e(C8343d.f11765d, jSONObject.getJSONArray("thresholds"));
                    C12775o.m28638h(string, "useCase");
                    C12775o.m28638h(string2, "assetUri");
                    return new C8345b(string, string2, optString, i, e);
                } catch (Exception unused) {
                    return null;
                }
            }

            /* renamed from: e */
            public final void mo42308e(C8345b bVar, List<C8345b> list) {
                C12775o.m28639i(bVar, "master");
                C12775o.m28639i(list, "slaves");
                m16591c(bVar.mo42302g(), bVar.mo42303h());
                m16592d(bVar.mo42297b(), bVar.mo42302g() + "_" + bVar.mo42303h(), new C8347a(list));
            }
        }

        public C8345b(String str, String str2, String str3, int i, float[] fArr) {
            C12775o.m28639i(str, "useCase");
            C12775o.m28639i(str2, "assetUri");
            this.f11773d = str;
            this.f11774e = str2;
            this.f11775f = str3;
            this.f11776g = i;
            this.f11777h = fArr;
        }

        /* renamed from: b */
        public final String mo42297b() {
            return this.f11774e;
        }

        /* renamed from: c */
        public final C8340b mo42298c() {
            return this.f11771b;
        }

        /* renamed from: d */
        public final File mo42299d() {
            return this.f11770a;
        }

        /* renamed from: e */
        public final String mo42300e() {
            return this.f11775f;
        }

        /* renamed from: f */
        public final float[] mo42301f() {
            return this.f11777h;
        }

        /* renamed from: g */
        public final String mo42302g() {
            return this.f11773d;
        }

        /* renamed from: h */
        public final int mo42303h() {
            return this.f11776g;
        }

        /* renamed from: i */
        public final void mo42304i(C8340b bVar) {
            this.f11771b = bVar;
        }

        /* renamed from: j */
        public final C8345b mo42305j(Runnable runnable) {
            this.f11772c = runnable;
            return this;
        }

        /* renamed from: k */
        public final void mo42306k(File file) {
            this.f11770a = file;
        }
    }

    /* renamed from: j2.d$c */
    /* compiled from: ModelManager.kt */
    static final class C8349c implements Runnable {

        /* renamed from: b */
        public static final C8349c f11781b = new C8349c();

        C8349c() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x005d A[Catch:{ Exception -> 0x0082, all -> 0x007e, all -> 0x0083 }] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x007d A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r7 = this;
                java.lang.String r0 = "model_request_timestamp"
                java.lang.String r1 = "models"
                boolean r2 = p251v2.C9925a.m20734d(r7)
                if (r2 == 0) goto L_0x000b
                return
            L_0x000b:
                boolean r2 = p251v2.C9925a.m20734d(r7)     // Catch:{ all -> 0x0083 }
                if (r2 == 0) goto L_0x0012
                return
            L_0x0012:
                android.content.Context r2 = com.facebook.FacebookSdk.getApplicationContext()     // Catch:{ Exception -> 0x0082, all -> 0x007e }
                java.lang.String r3 = "com.facebook.internal.MODEL_STORE"
                r4 = 0
                android.content.SharedPreferences r2 = r2.getSharedPreferences(r3, r4)     // Catch:{ Exception -> 0x0082, all -> 0x007e }
                r3 = 0
                java.lang.String r3 = r2.getString(r1, r3)     // Catch:{ Exception -> 0x0082, all -> 0x007e }
                if (r3 == 0) goto L_0x0034
                int r5 = r3.length()     // Catch:{ Exception -> 0x0082, all -> 0x007e }
                if (r5 != 0) goto L_0x002b
                r4 = 1
            L_0x002b:
                if (r4 == 0) goto L_0x002e
                goto L_0x0034
            L_0x002e:
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x0082, all -> 0x007e }
                r4.<init>(r3)     // Catch:{ Exception -> 0x0082, all -> 0x007e }
                goto L_0x0039
            L_0x0034:
                org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x0082, all -> 0x007e }
                r4.<init>()     // Catch:{ Exception -> 0x0082, all -> 0x007e }
            L_0x0039:
                r5 = 0
                long r5 = r2.getLong(r0, r5)     // Catch:{ Exception -> 0x0082, all -> 0x007e }
                q2.l$b r3 = p198q2.C9166l.C9168b.ModelRequest     // Catch:{ Exception -> 0x0082, all -> 0x007e }
                boolean r3 = p198q2.C9166l.m18760g(r3)     // Catch:{ Exception -> 0x0082, all -> 0x007e }
                if (r3 == 0) goto L_0x0055
                int r3 = r4.length()     // Catch:{ Exception -> 0x0082, all -> 0x007e }
                if (r3 == 0) goto L_0x0055
                j2.d r3 = p128j2.C8343d.f11765d     // Catch:{ Exception -> 0x0082, all -> 0x007e }
                boolean r3 = p128j2.C8343d.m16563d(r3, r5)     // Catch:{ Exception -> 0x0082, all -> 0x007e }
                if (r3 != 0) goto L_0x0074
            L_0x0055:
                j2.d r3 = p128j2.C8343d.f11765d     // Catch:{ Exception -> 0x0082, all -> 0x007e }
                org.json.JSONObject r4 = p128j2.C8343d.m16562c(r3)     // Catch:{ Exception -> 0x0082, all -> 0x007e }
                if (r4 == 0) goto L_0x007d
                android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch:{ Exception -> 0x0082, all -> 0x007e }
                java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x0082, all -> 0x007e }
                android.content.SharedPreferences$Editor r1 = r2.putString(r1, r3)     // Catch:{ Exception -> 0x0082, all -> 0x007e }
                long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0082, all -> 0x007e }
                android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r2)     // Catch:{ Exception -> 0x0082, all -> 0x007e }
                r0.apply()     // Catch:{ Exception -> 0x0082, all -> 0x007e }
            L_0x0074:
                j2.d r0 = p128j2.C8343d.f11765d     // Catch:{ Exception -> 0x0082, all -> 0x007e }
                p128j2.C8343d.m16560a(r0, r4)     // Catch:{ Exception -> 0x0082, all -> 0x007e }
                p128j2.C8343d.m16561b(r0)     // Catch:{ Exception -> 0x0082, all -> 0x007e }
                goto L_0x0082
            L_0x007d:
                return
            L_0x007e:
                r0 = move-exception
                p251v2.C9925a.m20732b(r0, r7)     // Catch:{ all -> 0x0083 }
            L_0x0082:
                return
            L_0x0083:
                r0 = move-exception
                p251v2.C9925a.m20732b(r0, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p128j2.C8343d.C8349c.run():void");
        }
    }

    /* renamed from: j2.d$d */
    /* compiled from: ModelManager.kt */
    static final class C8350d implements Runnable {

        /* renamed from: b */
        public static final C8350d f11782b = new C8350d();

        C8350d() {
        }

        public final void run() {
            if (!C9925a.m20734d(this)) {
                try {
                    if (!C9925a.m20734d(this)) {
                        C8812d.m17855c();
                    }
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    /* renamed from: j2.d$e */
    /* compiled from: ModelManager.kt */
    static final class C8351e implements Runnable {

        /* renamed from: b */
        public static final C8351e f11783b = new C8351e();

        C8351e() {
        }

        public final void run() {
            if (!C9925a.m20734d(this)) {
                try {
                    if (!C9925a.m20734d(this)) {
                        C7903a.m15518a();
                    }
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    private C8343d() {
    }

    /* renamed from: a */
    public static final /* synthetic */ void m16560a(C8343d dVar, JSONObject jSONObject) {
        Class<C8343d> cls = C8343d.class;
        if (!C9925a.m20734d(cls)) {
            try {
                dVar.m16565f(jSONObject);
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ void m16561b(C8343d dVar) {
        Class<C8343d> cls = C8343d.class;
        if (!C9925a.m20734d(cls)) {
            try {
                dVar.m16567h();
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ JSONObject m16562c(C8343d dVar) {
        Class<C8343d> cls = C8343d.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return dVar.m16568i();
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ boolean m16563d(C8343d dVar, long j) {
        Class<C8343d> cls = C8343d.class;
        if (C9925a.m20734d(cls)) {
            return false;
        }
        try {
            return dVar.m16571l(j);
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return false;
        }
    }

    /* renamed from: e */
    public static final /* synthetic */ float[] m16564e(C8343d dVar, JSONArray jSONArray) {
        Class<C8343d> cls = C8343d.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return dVar.m16572m(jSONArray);
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: f */
    private final void m16565f(JSONObject jSONObject) {
        if (!C9925a.m20734d(this)) {
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    try {
                        C8345b b = C8345b.f11769i.mo42307b(jSONObject.getJSONObject(keys.next()));
                        if (b != null) {
                            f11762a.put(b.mo42302g(), b);
                        }
                    } catch (JSONException unused) {
                        return;
                    }
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: g */
    public static final void m16566g() {
        Class<C8343d> cls = C8343d.class;
        if (!C9925a.m20734d(cls)) {
            try {
                C9138d0.m18660r0(C8349c.f11781b);
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: h */
    private final void m16567h() {
        if (!C9925a.m20734d(this)) {
            try {
                ArrayList arrayList = new ArrayList();
                String str = null;
                int i = 0;
                for (Map.Entry next : f11762a.entrySet()) {
                    String str2 = (String) next.getKey();
                    C8345b bVar = (C8345b) next.getValue();
                    if (C12775o.m28634d(str2, C8344a.MTML_APP_EVENT_PREDICTION.mo42296b())) {
                        str = bVar.mo42297b();
                        i = Math.max(i, bVar.mo42303h());
                        if (C9166l.m18760g(C9166l.C9168b.SuggestedEvents) && m16570k()) {
                            arrayList.add(bVar.mo42305j(C8350d.f11782b));
                        }
                    }
                    if (C12775o.m28634d(str2, C8344a.MTML_INTEGRITY_DETECT.mo42296b())) {
                        String b = bVar.mo42297b();
                        int max = Math.max(i, bVar.mo42303h());
                        if (C9166l.m18760g(C9166l.C9168b.IntelligentIntegrity)) {
                            arrayList.add(bVar.mo42305j(C8351e.f11783b));
                        }
                        str = b;
                        i = max;
                    }
                }
                if (str != null && i > 0 && !arrayList.isEmpty()) {
                    C8345b.f11769i.mo42308e(new C8345b("MTML", str, (String) null, i, (float[]) null), arrayList);
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: i */
    private final JSONObject m16568i() {
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("fields", TextUtils.join(",", new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
            C4555l.C4558c cVar = C4555l.f4241t;
            C12770k0 k0Var = C12770k0.f20423a;
            String format = String.format("%s/model_asset", Arrays.copyOf(new Object[]{FacebookSdk.getApplicationId()}, 1));
            C12775o.m28638h(format, "java.lang.String.format(format, *args)");
            C4555l v = cVar.mo31648v((C4509a) null, format, (C4555l.C4557b) null);
            v.mo31618H(true);
            v.mo31617G(bundle);
            JSONObject c = v.mo31620i().mo31710c();
            if (c != null) {
                return m16573n(c);
            }
            return null;
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }

    /* renamed from: j */
    public static final File m16569j(C8344a aVar) {
        Class<C8343d> cls = C8343d.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            C12775o.m28639i(aVar, "task");
            C8345b bVar = f11762a.get(aVar.mo42296b());
            if (bVar != null) {
                return bVar.mo42299d();
            }
            return null;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: k */
    private final boolean m16570k() {
        if (C9925a.m20734d(this)) {
            return false;
        }
        try {
            Locale F = C9138d0.m18604F();
            if (F != null) {
                String language = F.getLanguage();
                C12775o.m28638h(language, "locale.language");
                if (C13755w.m31552J(language, "en", false, 2, (Object) null)) {
                    return true;
                }
                return false;
            }
            return true;
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return false;
        }
    }

    /* renamed from: l */
    private final boolean m16571l(long j) {
        if (C9925a.m20734d(this) || j == 0) {
            return false;
        }
        try {
            if (System.currentTimeMillis() - j < ((long) 259200000)) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return false;
        }
    }

    /* renamed from: m */
    private final float[] m16572m(JSONArray jSONArray) {
        if (C9925a.m20734d(this) || jSONArray == null) {
            return null;
        }
        try {
            float[] fArr = new float[jSONArray.length()];
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    String string = jSONArray.getString(i);
                    C12775o.m28638h(string, "jsonArray.getString(i)");
                    fArr[i] = Float.parseFloat(string);
                } catch (JSONException unused) {
                }
            }
            return fArr;
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:14|15|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return new org.json.JSONObject();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0060 */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final org.json.JSONObject m16573n(org.json.JSONObject r13) {
        /*
            r12 = this;
            java.lang.String r0 = "asset_uri"
            java.lang.String r1 = "thresholds"
            java.lang.String r2 = "version_id"
            java.lang.String r3 = "rules_uri"
            java.lang.String r4 = "use_case"
            boolean r5 = p251v2.C9925a.m20734d(r12)
            r6 = 0
            if (r5 == 0) goto L_0x0012
            return r6
        L_0x0012:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x0066 }
            r5.<init>()     // Catch:{ all -> 0x0066 }
            java.lang.String r7 = "data"
            org.json.JSONArray r13 = r13.getJSONArray(r7)     // Catch:{ JSONException -> 0x0060 }
            int r7 = r13.length()     // Catch:{ JSONException -> 0x0060 }
            r8 = 0
        L_0x0022:
            if (r8 >= r7) goto L_0x0065
            org.json.JSONObject r9 = r13.getJSONObject(r8)     // Catch:{ JSONException -> 0x0060 }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0060 }
            r10.<init>()     // Catch:{ JSONException -> 0x0060 }
            java.lang.String r11 = r9.getString(r2)     // Catch:{ JSONException -> 0x0060 }
            r10.put(r2, r11)     // Catch:{ JSONException -> 0x0060 }
            java.lang.String r11 = r9.getString(r4)     // Catch:{ JSONException -> 0x0060 }
            r10.put(r4, r11)     // Catch:{ JSONException -> 0x0060 }
            org.json.JSONArray r11 = r9.getJSONArray(r1)     // Catch:{ JSONException -> 0x0060 }
            r10.put(r1, r11)     // Catch:{ JSONException -> 0x0060 }
            java.lang.String r11 = r9.getString(r0)     // Catch:{ JSONException -> 0x0060 }
            r10.put(r0, r11)     // Catch:{ JSONException -> 0x0060 }
            boolean r11 = r9.has(r3)     // Catch:{ JSONException -> 0x0060 }
            if (r11 == 0) goto L_0x0056
            java.lang.String r11 = r9.getString(r3)     // Catch:{ JSONException -> 0x0060 }
            r10.put(r3, r11)     // Catch:{ JSONException -> 0x0060 }
        L_0x0056:
            java.lang.String r9 = r9.getString(r4)     // Catch:{ JSONException -> 0x0060 }
            r5.put(r9, r10)     // Catch:{ JSONException -> 0x0060 }
            int r8 = r8 + 1
            goto L_0x0022
        L_0x0060:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x0066 }
            r5.<init>()     // Catch:{ all -> 0x0066 }
        L_0x0065:
            return r5
        L_0x0066:
            r13 = move-exception
            p251v2.C9925a.m20732b(r13, r12)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p128j2.C8343d.m16573n(org.json.JSONObject):org.json.JSONObject");
    }

    /* renamed from: o */
    public static final String[] m16574o(C8344a aVar, float[][] fArr, String[] strArr) {
        C8340b c;
        boolean z;
        float[][] fArr2 = fArr;
        String[] strArr2 = strArr;
        Class<C8343d> cls = C8343d.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            C12775o.m28639i(aVar, "task");
            C12775o.m28639i(fArr2, "denses");
            C12775o.m28639i(strArr2, "texts");
            C8345b bVar = f11762a.get(aVar.mo42296b());
            if (bVar == null || (c = bVar.mo42298c()) == null) {
                return null;
            }
            float[] f = bVar.mo42301f();
            int length = strArr2.length;
            boolean z2 = false;
            int length2 = fArr2[0].length;
            C8338a aVar2 = new C8338a(new int[]{length, length2});
            for (int i = 0; i < length; i++) {
                System.arraycopy(fArr2[i], 0, aVar2.mo42289a(), i * length2, length2);
            }
            C8338a b = c.mo42293b(aVar2, strArr2, aVar.mo42295a());
            if (!(b == null || f == null)) {
                if (b.mo42289a().length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    if (f.length == 0) {
                        z2 = true;
                    }
                    if (!z2) {
                        int i2 = C8352e.f11784a[aVar.ordinal()];
                        if (i2 == 1) {
                            return f11765d.m16576q(b, f);
                        }
                        if (i2 == 2) {
                            return f11765d.m16575p(b, f);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: p */
    private final String[] m16575p(C8338a aVar, float[] fArr) {
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            int b = aVar.mo42290b(0);
            int b2 = aVar.mo42290b(1);
            float[] a = aVar.mo42289a();
            if (b2 != fArr.length) {
                return null;
            }
            C13528f t = C13537l.m30893t(0, b);
            ArrayList arrayList = new ArrayList(C12728x.m28544v(t, 10));
            Iterator it = t.iterator();
            while (it.hasNext()) {
                int nextInt = ((C12703l0) it).nextInt();
                String str = "none";
                int length = fArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    if (a[(nextInt * b2) + i2] >= fArr[i]) {
                        str = f11764c.get(i2);
                    }
                    i++;
                    i2 = i3;
                }
                arrayList.add(str);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }

    /* renamed from: q */
    private final String[] m16576q(C8338a aVar, float[] fArr) {
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            int b = aVar.mo42290b(0);
            int b2 = aVar.mo42290b(1);
            float[] a = aVar.mo42289a();
            if (b2 != fArr.length) {
                return null;
            }
            C13528f t = C13537l.m30893t(0, b);
            ArrayList arrayList = new ArrayList(C12728x.m28544v(t, 10));
            Iterator it = t.iterator();
            while (it.hasNext()) {
                int nextInt = ((C12703l0) it).nextInt();
                String str = "other";
                int length = fArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    if (a[(nextInt * b2) + i2] >= fArr[i]) {
                        str = f11763b.get(i2);
                    }
                    i++;
                    i2 = i3;
                }
                arrayList.add(str);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }
}
