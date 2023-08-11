package p033b2;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import com.adjust.sdk.Constants;
import com.facebook.C4579r;
import com.facebook.FacebookException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.C12770k0;
import kotlin.jvm.internal.C12772l0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import p083f2.C7568a;
import p107h2.C7903a;
import p118i2.C8093b;
import p148l2.C8653a;
import p198q2.C9138d0;
import p198q2.C9194v;
import p336ef.C11921v;
import p454wf.C13735j;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: b2.c */
/* compiled from: AppEvent.kt */
public final class C2834c implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final HashSet<String> f1179g = new HashSet<>();

    /* renamed from: h */
    public static final C2835a f1180h = new C2835a((DefaultConstructorMarker) null);
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    private final JSONObject f1181b;

    /* renamed from: c */
    private final boolean f1182c;

    /* renamed from: d */
    private final boolean f1183d;

    /* renamed from: e */
    private final String f1184e;

    /* renamed from: f */
    private final String f1185f;

    /* renamed from: b2.c$a */
    /* compiled from: AppEvent.kt */
    public static final class C2835a {
        private C2835a() {
        }

        public /* synthetic */ C2835a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public final String m2164c(String str) {
            try {
                MessageDigest instance = MessageDigest.getInstance(Constants.MD5);
                Charset forName = Charset.forName(Constants.ENCODING);
                C12775o.m28638h(forName, "Charset.forName(charsetName)");
                if (str != null) {
                    byte[] bytes = str.getBytes(forName);
                    C12775o.m28638h(bytes, "(this as java.lang.String).getBytes(charset)");
                    instance.update(bytes, 0, bytes.length);
                    byte[] digest = instance.digest();
                    C12775o.m28638h(digest, "digest.digest()");
                    return C8093b.m15921c(digest);
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            } catch (NoSuchAlgorithmException e) {
                C9138d0.m18624Z("Failed to generate checksum: ", e);
                return "0";
            } catch (UnsupportedEncodingException e2) {
                C9138d0.m18624Z("Failed to generate checksum: ", e2);
                return "1";
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final void m2165d(String str) {
            boolean z;
            boolean contains;
            if (str != null) {
                if (str.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && str.length() <= 40) {
                    synchronized (C2834c.f1179g) {
                        contains = C2834c.f1179g.contains(str);
                        C11921v vVar = C11921v.f18618a;
                    }
                    if (contains) {
                        return;
                    }
                    if (new C13735j("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").mo53412e(str)) {
                        synchronized (C2834c.f1179g) {
                            C2834c.f1179g.add(str);
                        }
                        return;
                    }
                    C12770k0 k0Var = C12770k0.f20423a;
                    String format = String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", Arrays.copyOf(new Object[]{str}, 1));
                    C12775o.m28638h(format, "java.lang.String.format(format, *args)");
                    throw new FacebookException(format);
                }
            }
            if (str == null) {
                str = "<None Provided>";
            }
            C12770k0 k0Var2 = C12770k0.f20423a;
            String format2 = String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{str, 40}, 2));
            C12775o.m28638h(format2, "java.lang.String.format(locale, format, *args)");
            throw new FacebookException(format2);
        }
    }

    /* renamed from: b2.c$b */
    /* compiled from: AppEvent.kt */
    public static final class C2836b implements Serializable {

        /* renamed from: f */
        public static final C2837a f1186f = new C2837a((DefaultConstructorMarker) null);
        private static final long serialVersionUID = 20160803001L;

        /* renamed from: b */
        private final String f1187b;

        /* renamed from: c */
        private final boolean f1188c;

        /* renamed from: d */
        private final boolean f1189d;

        /* renamed from: e */
        private final String f1190e;

        /* renamed from: b2.c$b$a */
        /* compiled from: AppEvent.kt */
        public static final class C2837a {
            private C2837a() {
            }

            public /* synthetic */ C2837a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C2836b(String str, boolean z, boolean z2, String str2) {
            C12775o.m28639i(str, "jsonString");
            this.f1187b = str;
            this.f1188c = z;
            this.f1189d = z2;
            this.f1190e = str2;
        }

        private final Object readResolve() {
            return new C2834c(this.f1187b, this.f1188c, this.f1189d, this.f1190e, (DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ C2834c(String str, boolean z, boolean z2, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, z2, str2);
    }

    /* renamed from: b */
    private final String m2154b() {
        C2835a aVar = f1180h;
        String jSONObject = this.f1181b.toString();
        C12775o.m28638h(jSONObject, "jsonObject.toString()");
        return aVar.m2164c(jSONObject);
    }

    /* renamed from: d */
    private final JSONObject m2155d(String str, String str2, Double d, Bundle bundle, UUID uuid) {
        C2835a aVar = f1180h;
        aVar.m2165d(str2);
        JSONObject jSONObject = new JSONObject();
        String e = C8653a.m17396e(str2);
        jSONObject.put("_eventName", e);
        jSONObject.put("_eventName_md5", aVar.m2164c(e));
        jSONObject.put("_logTime", System.currentTimeMillis() / ((long) 1000));
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (bundle != null) {
            Map<String, String> i = m2156i(bundle);
            for (String next : i.keySet()) {
                jSONObject.put(next, i.get(next));
            }
        }
        if (d != null) {
            jSONObject.put("_valueToSum", d.doubleValue());
        }
        if (this.f1183d) {
            jSONObject.put("_inBackground", "1");
        }
        if (this.f1182c) {
            jSONObject.put("_implicitlyLogged", "1");
        } else {
            C9194v.C9195a aVar2 = C9194v.f13504f;
            C4579r rVar = C4579r.APP_EVENTS;
            String jSONObject2 = jSONObject.toString();
            C12775o.m28638h(jSONObject2, "eventObject.toString()");
            aVar2.mo43483d(rVar, "AppEvents", "Created app event '%s'", jSONObject2);
        }
        return jSONObject;
    }

    /* renamed from: i */
    private final Map<String, String> m2156i(Bundle bundle) {
        HashMap hashMap = new HashMap();
        for (String next : bundle.keySet()) {
            C2835a aVar = f1180h;
            C12775o.m28638h(next, "key");
            aVar.m2165d(next);
            Object obj = bundle.get(next);
            if ((obj instanceof String) || (obj instanceof Number)) {
                hashMap.put(next, obj.toString());
            } else {
                C12770k0 k0Var = C12770k0.f20423a;
                String format = String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj, next}, 2));
                C12775o.m28638h(format, "java.lang.String.format(format, *args)");
                throw new FacebookException(format);
            }
        }
        C7903a.m15520c(hashMap);
        C8653a.m17397f(C12772l0.m28612d(hashMap), this.f1184e);
        C7568a.m14892c(C12772l0.m28612d(hashMap), this.f1184e);
        return hashMap;
    }

    private final Object writeReplace() {
        String jSONObject = this.f1181b.toString();
        C12775o.m28638h(jSONObject, "jsonObject.toString()");
        return new C2836b(jSONObject, this.f1182c, this.f1183d, this.f1185f);
    }

    /* renamed from: c */
    public final boolean mo28331c() {
        return this.f1182c;
    }

    /* renamed from: e */
    public final JSONObject mo28332e() {
        return this.f1181b;
    }

    /* renamed from: f */
    public final String mo28333f() {
        return this.f1184e;
    }

    /* renamed from: g */
    public final boolean mo28334g() {
        if (this.f1185f == null) {
            return true;
        }
        return C12775o.m28634d(m2154b(), this.f1185f);
    }

    /* renamed from: h */
    public final boolean mo28335h() {
        return this.f1182c;
    }

    public String toString() {
        C12770k0 k0Var = C12770k0.f20423a;
        String format = String.format("\"%s\", implicit: %b, json: %s", Arrays.copyOf(new Object[]{this.f1181b.optString("_eventName"), Boolean.valueOf(this.f1182c), this.f1181b.toString()}, 3));
        C12775o.m28638h(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public C2834c(String str, String str2, Double d, Bundle bundle, boolean z, boolean z2, UUID uuid) {
        C12775o.m28639i(str, "contextName");
        C12775o.m28639i(str2, "eventName");
        this.f1182c = z;
        this.f1183d = z2;
        this.f1184e = str2;
        this.f1181b = m2155d(str, str2, d, bundle, uuid);
        this.f1185f = m2154b();
    }

    private C2834c(String str, boolean z, boolean z2, String str2) {
        JSONObject jSONObject = new JSONObject(str);
        this.f1181b = jSONObject;
        this.f1182c = z;
        String optString = jSONObject.optString("_eventName");
        C12775o.m28638h(optString, "jsonObject.optString(Con…nts.EVENT_NAME_EVENT_KEY)");
        this.f1184e = optString;
        this.f1185f = str2;
        this.f1183d = z2;
    }
}
