package p198q2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.database.Cursor;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.autofill.AutofillManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import androidx.core.location.LocationRequestCompat;
import androidx.core.p004os.EnvironmentCompat;
import androidx.webkit.ProxyConfig;
import com.adjust.sdk.Constants;
import com.facebook.C4509a;
import com.facebook.C4555l;
import com.facebook.C4574o;
import com.facebook.C4576p;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C12770k0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import p033b2.C2875p;
import p251v2.C9925a;
import p454wf.C13726d;
import p454wf.C13735j;

/* renamed from: q2.d0 */
/* compiled from: Utility.kt */
public final class C9138d0 {

    /* renamed from: a */
    private static int f13332a;

    /* renamed from: b */
    private static long f13333b = -1;

    /* renamed from: c */
    private static long f13334c = -1;

    /* renamed from: d */
    private static long f13335d = -1;

    /* renamed from: e */
    private static String f13336e = "";

    /* renamed from: f */
    private static String f13337f = "";

    /* renamed from: g */
    private static String f13338g = "NoCarrier";

    /* renamed from: h */
    public static final C9138d0 f13339h = new C9138d0();

    /* renamed from: q2.d0$a */
    /* compiled from: Utility.kt */
    public interface C9139a {
        /* renamed from: a */
        void mo23342a(JSONObject jSONObject);

        /* renamed from: b */
        void mo23343b(FacebookException facebookException);
    }

    /* renamed from: q2.d0$b */
    /* compiled from: Utility.kt */
    public static final class C9140b {

        /* renamed from: a */
        private List<String> f13340a;

        /* renamed from: b */
        private List<String> f13341b;

        /* renamed from: c */
        private List<String> f13342c;

        public C9140b(List<String> list, List<String> list2, List<String> list3) {
            C12775o.m28639i(list, "grantedPermissions");
            C12775o.m28639i(list2, "declinedPermissions");
            C12775o.m28639i(list3, "expiredPermissions");
            this.f13340a = list;
            this.f13341b = list2;
            this.f13342c = list3;
        }

        /* renamed from: a */
        public final List<String> mo43396a() {
            return this.f13341b;
        }

        /* renamed from: b */
        public final List<String> mo43397b() {
            return this.f13342c;
        }

        /* renamed from: c */
        public final List<String> mo43398c() {
            return this.f13340a;
        }
    }

    /* renamed from: q2.d0$c */
    /* compiled from: Utility.kt */
    static final class C9141c implements C4555l.C4557b {

        /* renamed from: a */
        final /* synthetic */ C9139a f13343a;

        /* renamed from: b */
        final /* synthetic */ String f13344b;

        C9141c(C9139a aVar, String str) {
            this.f13343a = aVar;
            this.f13344b = str;
        }

        public final void onCompleted(C4574o oVar) {
            C12775o.m28639i(oVar, "response");
            if (oVar.mo31709b() != null) {
                this.f13343a.mo23343b(oVar.mo31709b().mo31600e());
                return;
            }
            String str = this.f13344b;
            JSONObject d = oVar.mo31711d();
            if (d != null) {
                C9211y.m18907b(str, d);
                this.f13343a.mo23342a(oVar.mo31711d());
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    /* renamed from: q2.d0$d */
    /* compiled from: Utility.kt */
    static final class C9142d implements FilenameFilter {

        /* renamed from: a */
        public static final C9142d f13345a = new C9142d();

        C9142d() {
        }

        public final boolean accept(File file, String str) {
            return Pattern.matches("cpu[0-9]+", str);
        }
    }

    private C9138d0() {
    }

    /* renamed from: A */
    public static final void m18599A(String str, C9139a aVar) {
        C12775o.m28639i(str, "accessToken");
        C12775o.m28639i(aVar, "callback");
        JSONObject a = C9211y.m18906a(str);
        if (a != null) {
            aVar.mo23342a(a);
            return;
        }
        C9141c cVar = new C9141c(aVar, str);
        C4555l z = f13339h.m18674z(str);
        z.mo31613C(cVar);
        z.mo31621j();
    }

    /* renamed from: B */
    public static final String m18600B(Context context) {
        C9144e0.m18691j(context, "context");
        return FacebookSdk.getApplicationId();
    }

    /* renamed from: C */
    public static final Method m18601C(Class<?> cls, String str, Class<?>... clsArr) {
        C12775o.m28639i(cls, "clazz");
        C12775o.m28639i(str, "methodName");
        C12775o.m28639i(clsArr, "parameterTypes");
        try {
            return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: D */
    public static final Method m18602D(String str, String str2, Class<?>... clsArr) {
        C12775o.m28639i(str, "className");
        C12775o.m28639i(str2, "methodName");
        C12775o.m28639i(clsArr, "parameterTypes");
        try {
            Class<?> cls = Class.forName(str);
            C12775o.m28638h(cls, "Class.forName(className)");
            return m18601C(cls, str2, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: E */
    private final String m18603E(String str) {
        if (C12775o.m28634d(str, FacebookSdk.INSTAGRAM)) {
            return "id,name,profile_picture";
        }
        return "id,name,first_name,middle_name,last_name";
    }

    /* renamed from: F */
    public static final Locale m18604F() {
        try {
            Resources resources = FacebookSdk.getApplicationContext().getResources();
            C12775o.m28638h(resources, "FacebookSdk.getApplicationContext().resources");
            return resources.getConfiguration().locale;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: G */
    public static final Object m18605G(JSONObject jSONObject, String str, String str2) {
        C12775o.m28639i(jSONObject, "jsonObject");
        Object opt = jSONObject.opt(str);
        if (opt != null && (opt instanceof String)) {
            opt = new JSONTokener((String) opt).nextValue();
        }
        if (opt == null || (opt instanceof JSONObject) || (opt instanceof JSONArray)) {
            return opt;
        }
        if (str2 != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt(str2, opt);
            return jSONObject2;
        }
        throw new FacebookException("Got an unexpected non-JSON object.");
    }

    /* renamed from: H */
    public static final C9140b m18606H(JSONObject jSONObject) {
        String optString;
        C12775o.m28639i(jSONObject, "result");
        JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        ArrayList arrayList2 = new ArrayList(jSONArray.length());
        ArrayList arrayList3 = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            String optString2 = optJSONObject.optString("permission");
            if (!(optString2 == null || C12775o.m28634d(optString2, "installed") || (optString = optJSONObject.optString(NotificationCompat.CATEGORY_STATUS)) == null)) {
                if (C12775o.m28634d(optString, "granted")) {
                    arrayList.add(optString2);
                } else if (C12775o.m28634d(optString, "declined")) {
                    arrayList2.add(optString2);
                } else if (C12775o.m28634d(optString, "expired")) {
                    arrayList3.add(optString2);
                }
            }
        }
        return new C9140b(arrayList, arrayList2, arrayList3);
    }

    /* renamed from: I */
    private final String m18607I(MessageDigest messageDigest, byte[] bArr) {
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            sb.append(Integer.toHexString((b >> 4) & 15));
            sb.append(Integer.toHexString((b >> 0) & 15));
        }
        String sb2 = sb.toString();
        C12775o.m28638h(sb2, "builder.toString()");
        return sb2;
    }

    /* renamed from: J */
    private final String m18608J(String str, String str2) {
        Charset charset = C13726d.f22152b;
        if (str2 != null) {
            byte[] bytes = str2.getBytes(charset);
            C12775o.m28638h(bytes, "(this as java.lang.String).getBytes(charset)");
            return m18609K(str, bytes);
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: K */
    private final String m18609K(String str, byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            C12775o.m28638h(instance, "hash");
            return m18607I(instance, bArr);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: L */
    public static final Object m18610L(Object obj, Method method, Object... objArr) {
        C12775o.m28639i(method, "method");
        C12775o.m28639i(objArr, "args");
        try {
            return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: M */
    public static final boolean m18611M() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            C12770k0 k0Var = C12770k0.f20423a;
            String format = String.format("fb%s://applinks", Arrays.copyOf(new Object[]{FacebookSdk.getApplicationId()}, 1));
            C12775o.m28638h(format, "java.lang.String.format(format, *args)");
            intent.setData(Uri.parse(format));
            Context applicationContext = FacebookSdk.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            String packageName = applicationContext.getPackageName();
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 65536)) {
                if (C12775o.m28634d(packageName, resolveInfo.activityInfo.packageName)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: N */
    public static final boolean m18612N(Context context) {
        AutofillManager autofillManager;
        C12775o.m28639i(context, "context");
        if (Build.VERSION.SDK_INT >= 26 && (autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class)) != null && autofillManager.isAutofillSupported() && autofillManager.isEnabled()) {
            return true;
        }
        return false;
    }

    /* renamed from: O */
    public static final boolean m18613O(Context context) {
        C12775o.m28639i(context, "context");
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String str = Build.DEVICE;
        if (str != null) {
            C12775o.m28638h(str, "Build.DEVICE");
            if (new C13735j(".+_cheets|cheets_.+").mo53412e(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: P */
    public static final boolean m18614P(Uri uri) {
        if (uri == null || !C13754v.m31530r("content", uri.getScheme(), true)) {
            return false;
        }
        return true;
    }

    /* renamed from: Q */
    public static final boolean m18615Q(C4509a aVar) {
        if (aVar == null || !C12775o.m28634d(aVar, C4509a.f4119q.mo31515e())) {
            return false;
        }
        return true;
    }

    /* renamed from: R */
    public static final boolean m18616R() {
        Class<C9138d0> cls = C9138d0.class;
        if (C9925a.m20734d(cls)) {
            return false;
        }
        try {
            JSONObject x = m18671x();
            if (x != null) {
                try {
                    JSONArray jSONArray = x.getJSONArray(FacebookSdk.DATA_PROCESSION_OPTIONS);
                    int length = jSONArray.length();
                    int i = 0;
                    while (i < length) {
                        String string = jSONArray.getString(i);
                        C12775o.m28638h(string, "options.getString(i)");
                        if (string != null) {
                            String lowerCase = string.toLowerCase();
                            C12775o.m28638h(lowerCase, "(this as java.lang.String).toLowerCase()");
                            if (C12775o.m28634d(lowerCase, "ldu")) {
                                return true;
                            }
                            i++;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                    }
                } catch (Exception unused) {
                }
            }
            return false;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return false;
        }
    }

    /* renamed from: S */
    public static final boolean m18617S(Uri uri) {
        if (uri == null || !C13754v.m31530r("file", uri.getScheme(), true)) {
            return false;
        }
        return true;
    }

    /* renamed from: T */
    public static final boolean m18618T(String str) {
        boolean z;
        if (str == null) {
            return true;
        }
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: U */
    public static final <T> boolean m18619U(Collection<? extends T> collection) {
        if (collection == null || collection.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: V */
    public static final boolean m18620V(Uri uri) {
        if (uri == null || (!C13754v.m31530r(ProxyConfig.MATCH_HTTP, uri.getScheme(), true) && !C13754v.m31530r("https", uri.getScheme(), true) && !C13754v.m31530r("fbstaging", uri.getScheme(), true))) {
            return false;
        }
        return true;
    }

    /* renamed from: W */
    public static final Set<String> m18621W(JSONArray jSONArray) {
        C12775o.m28639i(jSONArray, "jsonArray");
        HashSet hashSet = new HashSet();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            String string = jSONArray.getString(i);
            C12775o.m28638h(string, "jsonArray.getString(i)");
            hashSet.add(string);
        }
        return hashSet;
    }

    /* renamed from: X */
    public static final List<String> m18622X(JSONArray jSONArray) {
        C12775o.m28639i(jSONArray, "jsonArray");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    /* renamed from: Y */
    public static final Map<String, String> m18623Y(String str) {
        boolean z;
        C12775o.m28639i(str, "str");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new HashMap();
        }
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                C12775o.m28638h(next, "key");
                String string = jSONObject.getString(next);
                C12775o.m28638h(string, "jsonObject.getString(key)");
                hashMap.put(next, string);
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    /* renamed from: Z */
    public static final void m18624Z(String str, Exception exc) {
        if (FacebookSdk.isDebugEnabled() && str != null && exc != null) {
            Log.d(str, exc.getClass().getSimpleName() + ": " + exc.getMessage());
        }
    }

    /* renamed from: a */
    public static final <T> boolean m18625a(T t, T t2) {
        if (t != null) {
            return C12775o.m28634d(t, t2);
        }
        if (t2 == null) {
            return true;
        }
        return false;
    }

    /* renamed from: a0 */
    public static final void m18626a0(String str, String str2) {
        if (FacebookSdk.isDebugEnabled() && str != null && str2 != null) {
            Log.d(str, str2);
        }
    }

    /* renamed from: b */
    public static final <T> List<T> m18627b(T... tArr) {
        C12775o.m28639i(tArr, CloudMethodReturns.RETURN_KEYNAME_ARRAY);
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* renamed from: b0 */
    public static final void m18628b0(String str, String str2, Throwable th) {
        if (FacebookSdk.isDebugEnabled() && !m18618T(str)) {
            Log.d(str, str2, th);
        }
    }

    /* renamed from: c */
    public static final JSONObject m18629c(String str) {
        C12775o.m28639i(str, "accessToken");
        JSONObject a = C9211y.m18906a(str);
        if (a != null) {
            return a;
        }
        C4574o i = f13339h.m18674z(str).mo31620i();
        if (i.mo31709b() != null) {
            return null;
        }
        return i.mo31711d();
    }

    /* renamed from: c0 */
    public static final String m18630c0(Map<String, String> map) {
        C12775o.m28639i(map, "map");
        String str = "";
        if (!map.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry next : map.entrySet()) {
                    jSONObject.put((String) next.getKey(), (String) next.getValue());
                }
                str = jSONObject.toString();
            } catch (JSONException unused) {
            }
            C12775o.m28638h(str, "try {\n        val jsonOb…ion) {\n        \"\"\n      }");
        }
        return str;
    }

    /* renamed from: d */
    public static final Uri m18631d(String str, String str2, Bundle bundle) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String next : bundle.keySet()) {
                Object obj = bundle.get(next);
                if (obj instanceof String) {
                    builder.appendQueryParameter(next, (String) obj);
                }
            }
        }
        Uri build = builder.build();
        C12775o.m28638h(build, "builder.build()");
        return build;
    }

    /* renamed from: d0 */
    public static final String m18632d0(String str) {
        C12775o.m28639i(str, "key");
        return f13339h.m18608J(Constants.MD5, str);
    }

    /* renamed from: e */
    private final void m18633e(Context context, String str) {
        int i;
        boolean z;
        CookieSyncManager.createInstance(context).sync();
        CookieManager instance = CookieManager.getInstance();
        String cookie = instance.getCookie(str);
        if (cookie != null) {
            Object[] array = C13755w.m31594t0(cookie, new String[]{";"}, false, 0, 6, (Object) null).toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                int length = strArr.length;
                int i2 = 0;
                while (i2 < length) {
                    Object[] array2 = C13755w.m31594t0(strArr[i2], new String[]{"="}, false, 0, 6, (Object) null).toArray(new String[0]);
                    if (array2 != null) {
                        String[] strArr2 = (String[]) array2;
                        if (strArr2.length > 0) {
                            StringBuilder sb = new StringBuilder();
                            String str2 = strArr2[0];
                            int length2 = str2.length() - 1;
                            int i3 = 0;
                            boolean z2 = false;
                            while (i3 <= length2) {
                                if (!z2) {
                                    i = i3;
                                } else {
                                    i = length2;
                                }
                                if (C12775o.m28641k(str2.charAt(i), 32) <= 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (!z2) {
                                    if (!z) {
                                        z2 = true;
                                    } else {
                                        i3++;
                                    }
                                } else if (!z) {
                                    break;
                                } else {
                                    length2--;
                                }
                            }
                            sb.append(str2.subSequence(i3, length2 + 1).toString());
                            sb.append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                            instance.setCookie(str, sb.toString());
                        }
                        i2++;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
                instance.removeExpiredCookie();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    /* renamed from: e0 */
    public static final boolean m18634e0(Context context) {
        C12775o.m28639i(context, "context");
        return m18612N(context);
    }

    /* renamed from: f */
    public static final void m18635f(Context context) {
        C12775o.m28639i(context, "context");
        C9138d0 d0Var = f13339h;
        d0Var.m18633e(context, FacebookSdk.FACEBOOK_COM);
        d0Var.m18633e(context, ".facebook.com");
        d0Var.m18633e(context, "https://facebook.com");
        d0Var.m18633e(context, "https://.facebook.com");
    }

    /* renamed from: f0 */
    public static final Bundle m18636f0(String str) {
        Bundle bundle = new Bundle();
        if (!m18618T(str)) {
            if (str != null) {
                Object[] array = C13755w.m31594t0(str, new String[]{"&"}, false, 0, 6, (Object) null).toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    int length = strArr.length;
                    int i = 0;
                    while (i < length) {
                        Object[] array2 = C13755w.m31594t0(strArr[i], new String[]{"="}, false, 0, 6, (Object) null).toArray(new String[0]);
                        if (array2 != null) {
                            String[] strArr2 = (String[]) array2;
                            try {
                                if (strArr2.length == 2) {
                                    bundle.putString(URLDecoder.decode(strArr2[0], Constants.ENCODING), URLDecoder.decode(strArr2[1], Constants.ENCODING));
                                } else if (strArr2.length == 1) {
                                    bundle.putString(URLDecoder.decode(strArr2[0], Constants.ENCODING), "");
                                }
                            } catch (UnsupportedEncodingException e) {
                                m18624Z("FacebookSDK", e);
                            }
                            i++;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        return bundle;
    }

    /* renamed from: g */
    public static final void m18637g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: g0 */
    public static final boolean m18638g0(Bundle bundle, String str, Object obj) {
        C12775o.m28639i(bundle, "bundle");
        if (obj == null) {
            bundle.remove(str);
            return true;
        } else if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            return true;
        } else if (obj instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) obj);
            return true;
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Number) obj).doubleValue());
            return true;
        } else if (obj instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) obj);
            return true;
        } else if (obj instanceof Integer) {
            bundle.putInt(str, ((Number) obj).intValue());
            return true;
        } else if (obj instanceof int[]) {
            bundle.putIntArray(str, (int[]) obj);
            return true;
        } else if (obj instanceof Long) {
            bundle.putLong(str, ((Number) obj).longValue());
            return true;
        } else if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
            return true;
        } else if (obj instanceof String) {
            bundle.putString(str, (String) obj);
            return true;
        } else if (obj instanceof JSONArray) {
            bundle.putString(str, obj.toString());
            return true;
        } else if (!(obj instanceof JSONObject)) {
            return false;
        } else {
            bundle.putString(str, obj.toString());
            return true;
        }
    }

    /* renamed from: h */
    public static final String m18639h(String str, String str2) {
        if (m18618T(str)) {
            return str2;
        }
        return str;
    }

    /* renamed from: h0 */
    public static final void m18640h0(Bundle bundle, String str, String str2) {
        C12775o.m28639i(bundle, "b");
        if (!m18618T(str2)) {
            bundle.putString(str, str2);
        }
    }

    /* renamed from: i */
    private final long m18641i(double d) {
        return Math.round(d / 1.073741824E9d);
    }

    /* renamed from: i0 */
    public static final void m18642i0(Bundle bundle, String str, Uri uri) {
        C12775o.m28639i(bundle, "b");
        if (uri != null) {
            m18640h0(bundle, str, uri.toString());
        }
    }

    /* renamed from: j */
    public static final List<String> m18643j(JSONArray jSONArray) {
        C12775o.m28639i(jSONArray, "jsonArray");
        try {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String string = jSONArray.getString(i);
                C12775o.m28638h(string, "jsonArray.getString(i)");
                arrayList.add(string);
            }
            return arrayList;
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    /* renamed from: j0 */
    public static final String m18644j0(InputStream inputStream) {
        InputStreamReader inputStreamReader;
        BufferedInputStream bufferedInputStream;
        Throwable th;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
                try {
                    StringBuilder sb = new StringBuilder();
                    char[] cArr = new char[2048];
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        if (read != -1) {
                            sb.append(cArr, 0, read);
                        } else {
                            String sb2 = sb.toString();
                            C12775o.m28638h(sb2, "stringBuilder.toString()");
                            m18637g(bufferedInputStream);
                            m18637g(inputStreamReader);
                            return sb2;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    m18637g(bufferedInputStream);
                    m18637g(inputStreamReader);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader = null;
                m18637g(bufferedInputStream);
                m18637g(inputStreamReader);
                throw th;
            }
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th = th4;
            inputStreamReader = null;
            m18637g(bufferedInputStream);
            m18637g(inputStreamReader);
            throw th;
        }
    }

    /* renamed from: k */
    public static final Map<String, Object> m18645k(JSONObject jSONObject) {
        C12775o.m28639i(jSONObject, "jsonObject");
        HashMap hashMap = new HashMap();
        JSONArray names = jSONObject.names();
        int length = names.length();
        for (int i = 0; i < length; i++) {
            try {
                String string = names.getString(i);
                C12775o.m28638h(string, "keys.getString(i)");
                Object obj = jSONObject.get(string);
                if (obj instanceof JSONObject) {
                    obj = m18645k((JSONObject) obj);
                }
                C12775o.m28638h(obj, "value");
                hashMap.put(string, obj);
            } catch (JSONException unused) {
            }
        }
        return hashMap;
    }

    /* renamed from: k0 */
    public static final Map<String, String> m18646k0(Parcel parcel) {
        C12775o.m28639i(parcel, "parcel");
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            hashMap.put(parcel.readString(), parcel.readString());
        }
        return hashMap;
    }

    /* renamed from: l */
    public static final Map<String, String> m18647l(JSONObject jSONObject) {
        C12775o.m28639i(jSONObject, "jsonObject");
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.optString(next);
            if (optString != null) {
                C12775o.m28638h(next, "key");
                hashMap.put(next, optString);
            }
        }
        return hashMap;
    }

    /* renamed from: l0 */
    private final void m18648l0() {
        try {
            if (m18653o()) {
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                C12775o.m28638h(externalStorageDirectory, "path");
                StatFs statFs = new StatFs(externalStorageDirectory.getPath());
                f13335d = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
            }
            f13335d = m18641i((double) f13335d);
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0031  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int m18649m(java.io.InputStream r6, java.io.OutputStream r7) {
        /*
            java.lang.String r0 = "outputStream"
            kotlin.jvm.internal.C12775o.m28639i(r7, r0)
            r0 = 0
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0029 }
            r1.<init>(r6)     // Catch:{ all -> 0x0029 }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0026 }
            r2 = 0
            r3 = r2
        L_0x0011:
            int r4 = r1.read(r0)     // Catch:{ all -> 0x0026 }
            r5 = -1
            if (r4 == r5) goto L_0x001d
            r7.write(r0, r2, r4)     // Catch:{ all -> 0x0026 }
            int r3 = r3 + r4
            goto L_0x0011
        L_0x001d:
            r1.close()
            if (r6 == 0) goto L_0x0025
            r6.close()
        L_0x0025:
            return r3
        L_0x0026:
            r7 = move-exception
            r0 = r1
            goto L_0x002a
        L_0x0029:
            r7 = move-exception
        L_0x002a:
            if (r0 == 0) goto L_0x002f
            r0.close()
        L_0x002f:
            if (r6 == 0) goto L_0x0034
            r6.close()
        L_0x0034:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p198q2.C9138d0.m18649m(java.io.InputStream, java.io.OutputStream):int");
    }

    /* renamed from: m0 */
    private final int m18650m0() {
        int i = f13332a;
        if (i > 0) {
            return i;
        }
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(C9142d.f13345a);
            if (listFiles != null) {
                f13332a = listFiles.length;
            }
        } catch (Exception unused) {
        }
        if (f13332a <= 0) {
            f13332a = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return f13332a;
    }

    /* renamed from: n */
    public static final void m18651n(URLConnection uRLConnection) {
        if (uRLConnection != null && (uRLConnection instanceof HttpURLConnection)) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    /* renamed from: n0 */
    private final void m18652n0(Context context) {
        if (C12775o.m28634d(f13338g, "NoCarrier")) {
            try {
                Object systemService = context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
                if (systemService != null) {
                    String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
                    C12775o.m28638h(networkOperatorName, "telephonyManager.networkOperatorName");
                    f13338g = networkOperatorName;
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: o */
    private final boolean m18653o() {
        return C12775o.m28634d("mounted", Environment.getExternalStorageState());
    }

    /* renamed from: o0 */
    private final void m18654o0(Context context) {
        if (f13333b == -1 || System.currentTimeMillis() - f13333b >= ((long) Constants.THIRTY_MINUTES)) {
            f13333b = System.currentTimeMillis();
            m18656p0();
            m18652n0(context);
            m18658q0();
            m18648l0();
        }
    }

    /* renamed from: p */
    public static final String m18655p(int i) {
        String bigInteger = new BigInteger(i * 5, new Random()).toString(32);
        C12775o.m28638h(bigInteger, "BigInteger(length * 5, r).toString(32)");
        return bigInteger;
    }

    /* renamed from: p0 */
    private final void m18656p0() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            String displayName = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
            C12775o.m28638h(displayName, "tz.getDisplayName(tz.inD…(Date()), TimeZone.SHORT)");
            f13336e = displayName;
            C12775o.m28638h(timeZone, "tz");
            String id = timeZone.getID();
            C12775o.m28638h(id, "tz.id");
            f13337f = id;
        } catch (AssertionError | Exception unused) {
        }
    }

    /* renamed from: q */
    public static final String m18657q(Context context) {
        if (context == null) {
            return "null";
        }
        if (context == context.getApplicationContext()) {
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        String simpleName = context.getClass().getSimpleName();
        C12775o.m28638h(simpleName, "context.javaClass.simpleName");
        return simpleName;
    }

    /* renamed from: q0 */
    private final void m18658q0() {
        try {
            if (m18653o()) {
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                C12775o.m28638h(externalStorageDirectory, "path");
                StatFs statFs = new StatFs(externalStorageDirectory.getPath());
                f13334c = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
            }
            f13334c = m18641i((double) f13334c);
        } catch (Exception unused) {
        }
    }

    /* renamed from: r */
    public static final String m18659r(Context context) {
        C12775o.m28639i(context, "context");
        try {
            String applicationName = FacebookSdk.getApplicationName();
            if (applicationName != null) {
                return applicationName;
            }
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i = applicationInfo.labelRes;
            if (i == 0) {
                return applicationInfo.nonLocalizedLabel.toString();
            }
            String string = context.getString(i);
            C12775o.m28638h(string, "context.getString(stringId)");
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: r0 */
    public static final void m18660r0(Runnable runnable) {
        try {
            FacebookSdk.getExecutor().execute(runnable);
        } catch (Exception unused) {
        }
    }

    /* renamed from: s */
    public static final String m18661s() {
        Context applicationContext = FacebookSdk.getApplicationContext();
        if (applicationContext != null) {
            try {
                PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0);
                if (packageInfo != null) {
                    return packageInfo.versionName;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return null;
    }

    /* renamed from: s0 */
    public static final void m18662s0(JSONObject jSONObject, C9114a aVar, String str, boolean z) {
        C12775o.m28639i(jSONObject, "params");
        jSONObject.put("anon_id", str);
        boolean z2 = true;
        jSONObject.put("application_tracking_enabled", !z);
        jSONObject.put("advertiser_id_collection_enabled", FacebookSdk.getAdvertiserIDCollectionEnabled());
        if (aVar != null) {
            if (aVar.mo43377j() != null) {
                jSONObject.put("attribution", aVar.mo43377j());
            }
            if (aVar.mo43375h() != null) {
                jSONObject.put("advertiser_id", aVar.mo43375h());
                jSONObject.put("advertiser_tracking_enabled", !aVar.mo43378l());
            }
            if (!aVar.mo43378l()) {
                String d = C2875p.m2275d();
                if (d.length() != 0) {
                    z2 = false;
                }
                if (!z2) {
                    jSONObject.put("ud", d);
                }
            }
            if (aVar.mo43376i() != null) {
                jSONObject.put("installer_package", aVar.mo43376i());
            }
        }
    }

    /* renamed from: t */
    public static final Date m18663t(Bundle bundle, String str, Date date) {
        long j;
        C12775o.m28639i(date, "dateBase");
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (obj instanceof Long) {
            j = ((Number) obj).longValue();
        } else {
            if (obj instanceof String) {
                try {
                    j = Long.parseLong((String) obj);
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        if (j == 0) {
            return new Date(LocationRequestCompat.PASSIVE_INTERVAL);
        }
        return new Date(date.getTime() + (j * 1000));
    }

    /* renamed from: t0 */
    public static final void m18664t0(JSONObject jSONObject, Context context) {
        String str;
        Locale locale;
        int i;
        C12775o.m28639i(jSONObject, "params");
        C12775o.m28639i(context, "appContext");
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        f13339h.m18654o0(context);
        String packageName = context.getPackageName();
        int i2 = 0;
        int i3 = -1;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            if (packageInfo != null) {
                i3 = packageInfo.versionCode;
                str = packageInfo.versionName;
                jSONArray.put(packageName);
                jSONArray.put(i3);
                jSONArray.put(str);
                jSONArray.put(Build.VERSION.RELEASE);
                jSONArray.put(Build.MODEL);
                try {
                    Resources resources = context.getResources();
                    C12775o.m28638h(resources, "appContext.resources");
                    locale = resources.getConfiguration().locale;
                } catch (Exception unused) {
                    locale = Locale.getDefault();
                }
                StringBuilder sb = new StringBuilder();
                C12775o.m28638h(locale, "locale");
                sb.append(locale.getLanguage());
                sb.append("_");
                sb.append(locale.getCountry());
                jSONArray.put(sb.toString());
                jSONArray.put(f13336e);
                jSONArray.put(f13338g);
                double d = 0.0d;
                try {
                    Object systemService = context.getSystemService("display");
                    Display display = null;
                    if (!(systemService instanceof DisplayManager)) {
                        systemService = null;
                    }
                    DisplayManager displayManager = (DisplayManager) systemService;
                    if (displayManager != null) {
                        display = displayManager.getDisplay(0);
                    }
                    if (display != null) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        display.getMetrics(displayMetrics);
                        int i4 = displayMetrics.widthPixels;
                        try {
                            i2 = displayMetrics.heightPixels;
                            d = (double) displayMetrics.density;
                        } catch (Exception unused2) {
                        }
                        i = i2;
                        i2 = i4;
                        jSONArray.put(i2);
                        jSONArray.put(i);
                        jSONArray.put(new DecimalFormat("#.##").format(d));
                        jSONArray.put(f13339h.m18650m0());
                        jSONArray.put(f13334c);
                        jSONArray.put(f13335d);
                        jSONArray.put(f13337f);
                        jSONObject.put("extinfo", jSONArray.toString());
                    }
                } catch (Exception unused3) {
                }
                i = 0;
                jSONArray.put(i2);
                jSONArray.put(i);
                jSONArray.put(new DecimalFormat("#.##").format(d));
                jSONArray.put(f13339h.m18650m0());
                jSONArray.put(f13334c);
                jSONArray.put(f13335d);
                jSONArray.put(f13337f);
                jSONObject.put("extinfo", jSONArray.toString());
            }
        } catch (PackageManager.NameNotFoundException unused4) {
            str = "";
        }
    }

    /* renamed from: u */
    public static final long m18665u(Uri uri) {
        C12775o.m28639i(uri, "contentUri");
        Cursor cursor = null;
        try {
            Cursor query = FacebookSdk.getApplicationContext().getContentResolver().query(uri, (String[]) null, (String) null, (String[]) null, (String) null);
            if (query == null) {
                return 0;
            }
            int columnIndex = query.getColumnIndex("_size");
            query.moveToFirst();
            long j = query.getLong(columnIndex);
            query.close();
            return j;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: u0 */
    public static final String m18666u0(byte[] bArr) {
        C12775o.m28639i(bArr, "bytes");
        return f13339h.m18609K(Constants.SHA1, bArr);
    }

    /* renamed from: v */
    public static final Locale m18667v() {
        Locale F = m18604F();
        if (F != null) {
            return F;
        }
        Locale locale = Locale.getDefault();
        C12775o.m28638h(locale, "Locale.getDefault()");
        return locale;
    }

    /* renamed from: v0 */
    public static final String m18668v0(String str) {
        if (str == null) {
            return null;
        }
        return f13339h.m18608J(Constants.SHA256, str);
    }

    /* renamed from: w */
    private final String m18669w() {
        C4509a e = C4509a.f4119q.mo31515e();
        if (e == null || e.mo31496i() == null) {
            return "facebook";
        }
        return e.mo31496i();
    }

    /* renamed from: w0 */
    public static final <T> Collection<T> m18670w0(T... tArr) {
        C12775o.m28639i(tArr, "ts");
        Collection<T> unmodifiableCollection = Collections.unmodifiableCollection(Arrays.asList(Arrays.copyOf(tArr, tArr.length)));
        C12775o.m28638h(unmodifiableCollection, "Collections.unmodifiable…ction(Arrays.asList(*ts))");
        return unmodifiableCollection;
    }

    /* renamed from: x */
    public static final JSONObject m18671x() {
        Class<C9138d0> cls = C9138d0.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            String string = FacebookSdk.getApplicationContext().getSharedPreferences(FacebookSdk.DATA_PROCESSING_OPTIONS_PREFERENCES, 0).getString(FacebookSdk.DATA_PROCESSION_OPTIONS, (String) null);
            if (string != null) {
                try {
                    return new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: x0 */
    public static final void m18672x0(Parcel parcel, Map<String, String> map) {
        C12775o.m28639i(parcel, "parcel");
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry next : map.entrySet()) {
            parcel.writeString((String) next.getKey());
            parcel.writeString((String) next.getValue());
        }
    }

    /* renamed from: y */
    public static final String m18673y(String str) {
        String facebookDomain = FacebookSdk.getFacebookDomain();
        if (str == null) {
            return facebookDomain;
        }
        int hashCode = str.hashCode();
        if (hashCode != -1253231569) {
            if (hashCode == 28903346 && str.equals(FacebookSdk.INSTAGRAM)) {
                return C13754v.m31521A(facebookDomain, FacebookSdk.FACEBOOK_COM, FacebookSdk.INSTAGRAM_COM, false, 4, (Object) null);
            }
            return facebookDomain;
        } else if (str.equals(FacebookSdk.GAMING)) {
            return C13754v.m31521A(facebookDomain, FacebookSdk.FACEBOOK_COM, FacebookSdk.FB_GG, false, 4, (Object) null);
        } else {
            return facebookDomain;
        }
    }

    /* renamed from: z */
    private final C4555l m18674z(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", m18603E(m18669w()));
        bundle.putString("access_token", str);
        return new C4555l((C4509a) null, "me", bundle, C4576p.f4292b, (C4555l.C4557b) null, (String) null, 32, (DefaultConstructorMarker) null);
    }
}
