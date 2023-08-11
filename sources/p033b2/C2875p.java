package p033b2;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Patterns;
import androidx.annotation.RestrictTo;
import com.facebook.FacebookSdk;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C12775o;
import p045c2.C3874c;
import p198q2.C9138d0;
import p251v2.C9925a;
import p454wf.C13735j;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: b2.p */
/* compiled from: UserDataStore.kt */
public final class C2875p {

    /* renamed from: a */
    private static final String f1266a;

    /* renamed from: b */
    private static SharedPreferences f1267b;

    /* renamed from: c */
    private static final AtomicBoolean f1268c = new AtomicBoolean(false);

    /* renamed from: d */
    private static final ConcurrentHashMap<String, String> f1269d = new ConcurrentHashMap<>();

    /* renamed from: e */
    private static final ConcurrentHashMap<String, String> f1270e = new ConcurrentHashMap<>();

    /* renamed from: f */
    public static final C2875p f1271f = new C2875p();

    /* renamed from: b2.p$a */
    /* compiled from: UserDataStore.kt */
    static final class C2876a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f1272b;

        /* renamed from: c */
        final /* synthetic */ String f1273c;

        C2876a(String str, String str2) {
            this.f1272b = str;
            this.f1273c = str2;
        }

        public final void run() {
            if (!C9925a.m20734d(this)) {
                try {
                    if (!C9925a.m20734d(this)) {
                        C2875p pVar = C2875p.f1271f;
                        if (!C2875p.m2272a(pVar).get()) {
                            C2875p.m2274c(pVar);
                        }
                        C2875p.m2273b(pVar).edit().putString(this.f1272b, this.f1273c).apply();
                    }
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    static {
        String simpleName = C2875p.class.getSimpleName();
        C12775o.m28638h(simpleName, "UserDataStore::class.java.simpleName");
        f1266a = simpleName;
    }

    private C2875p() {
    }

    /* renamed from: a */
    public static final /* synthetic */ AtomicBoolean m2272a(C2875p pVar) {
        Class<C2875p> cls = C2875p.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return f1268c;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ SharedPreferences m2273b(C2875p pVar) {
        Class<C2875p> cls = C2875p.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = f1267b;
            if (sharedPreferences == null) {
                C12775o.m28656z("sharedPreferences");
            }
            return sharedPreferences;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ void m2274c(C2875p pVar) {
        Class<C2875p> cls = C2875p.class;
        if (!C9925a.m20734d(cls)) {
            try {
                pVar.m2277f();
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: d */
    public static final String m2275d() {
        Class<C2875p> cls = C2875p.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            if (!f1268c.get()) {
                f1271f.m2277f();
            }
            HashMap hashMap = new HashMap();
            hashMap.putAll(f1269d);
            hashMap.putAll(f1271f.m2276e());
            return C9138d0.m18630c0(hashMap);
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: e */
    private final Map<String, String> m2276e() {
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            Set<String> b = C3874c.f2950e.mo29918b();
            for (String next : f1270e.keySet()) {
                if (b.contains(next)) {
                    hashMap.put(next, f1270e.get(next));
                }
            }
            return hashMap;
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }

    /* renamed from: f */
    private final synchronized void m2277f() {
        if (!C9925a.m20734d(this)) {
            try {
                AtomicBoolean atomicBoolean = f1268c;
                if (!atomicBoolean.get()) {
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext());
                    C12775o.m28638h(defaultSharedPreferences, "PreferenceManager.getDef….getApplicationContext())");
                    f1267b = defaultSharedPreferences;
                    if (defaultSharedPreferences == null) {
                        C12775o.m28656z("sharedPreferences");
                    }
                    String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "");
                    if (string == null) {
                        string = "";
                    }
                    C12775o.m28638h(string, "sharedPreferences.getStr…(USER_DATA_KEY, \"\") ?: \"\"");
                    SharedPreferences sharedPreferences = f1267b;
                    if (sharedPreferences == null) {
                        C12775o.m28656z("sharedPreferences");
                    }
                    String string2 = sharedPreferences.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
                    if (string2 == null) {
                        string2 = "";
                    }
                    C12775o.m28638h(string2, "sharedPreferences.getStr…_USER_DATA_KEY, \"\") ?: \"\"");
                    f1269d.putAll(C9138d0.m18623Y(string));
                    f1270e.putAll(C9138d0.m18623Y(string2));
                    atomicBoolean.set(true);
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: g */
    public static final void m2278g() {
        Class<C2875p> cls = C2875p.class;
        if (!C9925a.m20734d(cls)) {
            try {
                if (!f1268c.get()) {
                    f1271f.m2277f();
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: h */
    private final String m2279h(String str, String str2) {
        boolean z;
        String str3;
        int i;
        boolean z2;
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            int length = str2.length() - 1;
            int i2 = 0;
            boolean z3 = false;
            while (true) {
                if (i2 > length) {
                    break;
                }
                if (!z3) {
                    i = i2;
                } else {
                    i = length;
                }
                if (C12775o.m28641k(str2.charAt(i), 32) <= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z3) {
                    if (!z2) {
                        z3 = true;
                    } else {
                        i2++;
                    }
                } else if (!z2) {
                    break;
                } else {
                    length--;
                }
            }
            String obj = str2.subSequence(i2, length + 1).toString();
            if (obj != null) {
                String lowerCase = obj.toLowerCase();
                C12775o.m28638h(lowerCase, "(this as java.lang.String).toLowerCase()");
                if (C12775o.m28634d("em", str)) {
                    if (Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                        return lowerCase;
                    }
                    Log.e(f1266a, "Setting email failure: this is not a valid email address");
                    return "";
                } else if (C12775o.m28634d("ph", str)) {
                    return new C13735j("[^0-9]").mo53413f(lowerCase, "");
                } else {
                    if (!C12775o.m28634d("ge", str)) {
                        return lowerCase;
                    }
                    if (lowerCase.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        str3 = "";
                    } else if (lowerCase != null) {
                        str3 = lowerCase.substring(0, 1);
                        C12775o.m28638h(str3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    if (!C12775o.m28634d("f", str3)) {
                        if (!C12775o.m28634d("m", str3)) {
                            Log.e(f1266a, "Setting gender failure: the supported value for gender is f or m");
                            return "";
                        }
                    }
                    return str3;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c3 A[Catch:{ all -> 0x011f }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c2 A[SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2280i(java.util.Map<java.lang.String, java.lang.String> r12) {
        /*
            java.lang.Class<b2.p> r0 = p033b2.C2875p.class
            boolean r1 = p251v2.C9925a.m20734d(r0)
            if (r1 == 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.String r1 = "ud"
            kotlin.jvm.internal.C12775o.m28639i(r12, r1)     // Catch:{ all -> 0x011f }
            java.util.concurrent.atomic.AtomicBoolean r1 = f1268c     // Catch:{ all -> 0x011f }
            boolean r1 = r1.get()     // Catch:{ all -> 0x011f }
            if (r1 != 0) goto L_0x001b
            b2.p r1 = f1271f     // Catch:{ all -> 0x011f }
            r1.m2277f()     // Catch:{ all -> 0x011f }
        L_0x001b:
            java.util.Set r12 = r12.entrySet()     // Catch:{ all -> 0x011f }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x011f }
        L_0x0023:
            boolean r1 = r12.hasNext()     // Catch:{ all -> 0x011f }
            if (r1 == 0) goto L_0x0111
            java.lang.Object r1 = r12.next()     // Catch:{ all -> 0x011f }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x011f }
            java.lang.Object r2 = r1.getKey()     // Catch:{ all -> 0x011f }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x011f }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x011f }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x011f }
            b2.p r3 = f1271f     // Catch:{ all -> 0x011f }
            int r4 = r1.length()     // Catch:{ all -> 0x011f }
            r5 = 1
            int r4 = r4 - r5
            r6 = 0
            r7 = r6
            r8 = r7
        L_0x0046:
            if (r7 > r4) goto L_0x006b
            if (r8 != 0) goto L_0x004c
            r9 = r7
            goto L_0x004d
        L_0x004c:
            r9 = r4
        L_0x004d:
            char r9 = r1.charAt(r9)     // Catch:{ all -> 0x011f }
            r10 = 32
            int r9 = kotlin.jvm.internal.C12775o.m28641k(r9, r10)     // Catch:{ all -> 0x011f }
            if (r9 > 0) goto L_0x005b
            r9 = r5
            goto L_0x005c
        L_0x005b:
            r9 = r6
        L_0x005c:
            if (r8 != 0) goto L_0x0065
            if (r9 != 0) goto L_0x0062
            r8 = r5
            goto L_0x0046
        L_0x0062:
            int r7 = r7 + 1
            goto L_0x0046
        L_0x0065:
            if (r9 != 0) goto L_0x0068
            goto L_0x006b
        L_0x0068:
            int r4 = r4 + -1
            goto L_0x0046
        L_0x006b:
            int r4 = r4 + 1
            java.lang.CharSequence r1 = r1.subSequence(r7, r4)     // Catch:{ all -> 0x011f }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x011f }
            java.lang.String r1 = r3.m2279h(r2, r1)     // Catch:{ all -> 0x011f }
            java.lang.String r1 = p198q2.C9138d0.m18668v0(r1)     // Catch:{ all -> 0x011f }
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r3 = f1270e     // Catch:{ all -> 0x011f }
            boolean r4 = r3.containsKey(r2)     // Catch:{ all -> 0x011f }
            if (r4 == 0) goto L_0x010c
            java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x011f }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x011f }
            java.lang.String r4 = ","
            if (r3 == 0) goto L_0x00af
            wf.j r7 = new wf.j     // Catch:{ all -> 0x011f }
            r7.<init>((java.lang.String) r4)     // Catch:{ all -> 0x011f }
            java.util.List r7 = r7.mo53415h(r3, r6)     // Catch:{ all -> 0x011f }
            if (r7 == 0) goto L_0x00af
            java.util.Collection r7 = (java.util.Collection) r7     // Catch:{ all -> 0x011f }
            java.lang.String[] r8 = new java.lang.String[r6]     // Catch:{ all -> 0x011f }
            java.lang.Object[] r7 = r7.toArray(r8)     // Catch:{ all -> 0x011f }
            if (r7 == 0) goto L_0x00a7
            java.lang.String[] r7 = (java.lang.String[]) r7     // Catch:{ all -> 0x011f }
            goto L_0x00b1
        L_0x00a7:
            java.lang.NullPointerException r12 = new java.lang.NullPointerException     // Catch:{ all -> 0x011f }
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T>"
            r12.<init>(r1)     // Catch:{ all -> 0x011f }
            throw r12     // Catch:{ all -> 0x011f }
        L_0x00af:
            java.lang.String[] r7 = new java.lang.String[r6]     // Catch:{ all -> 0x011f }
        L_0x00b1:
            int r8 = r7.length     // Catch:{ all -> 0x011f }
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r7, r8)     // Catch:{ all -> 0x011f }
            java.lang.String[] r8 = (java.lang.String[]) r8     // Catch:{ all -> 0x011f }
            java.util.Set r8 = kotlin.collections.C12731y0.m28553g(r8)     // Catch:{ all -> 0x011f }
            boolean r9 = r8.contains(r1)     // Catch:{ all -> 0x011f }
            if (r9 == 0) goto L_0x00c3
            return
        L_0x00c3:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x011f }
            r9.<init>()     // Catch:{ all -> 0x011f }
            int r10 = r7.length     // Catch:{ all -> 0x011f }
            if (r10 != 0) goto L_0x00cd
            r10 = r5
            goto L_0x00ce
        L_0x00cd:
            r10 = r6
        L_0x00ce:
            if (r10 == 0) goto L_0x00d9
            r9.append(r1)     // Catch:{ all -> 0x011f }
            java.lang.String r1 = "sb.append(value)"
            kotlin.jvm.internal.C12775o.m28638h(r9, r1)     // Catch:{ all -> 0x011f }
            goto L_0x0101
        L_0x00d9:
            int r10 = r7.length     // Catch:{ all -> 0x011f }
            r11 = 5
            if (r10 >= r11) goto L_0x00ec
            r9.append(r3)     // Catch:{ all -> 0x011f }
            r9.append(r4)     // Catch:{ all -> 0x011f }
            r9.append(r1)     // Catch:{ all -> 0x011f }
            java.lang.String r1 = "sb.append(originalVal).a…_SEPARATOR).append(value)"
            kotlin.jvm.internal.C12775o.m28638h(r9, r1)     // Catch:{ all -> 0x011f }
            goto L_0x0101
        L_0x00ec:
            if (r5 >= r11) goto L_0x00f9
            r3 = r7[r5]     // Catch:{ all -> 0x011f }
            r9.append(r3)     // Catch:{ all -> 0x011f }
            r9.append(r4)     // Catch:{ all -> 0x011f }
            int r5 = r5 + 1
            goto L_0x00ec
        L_0x00f9:
            r9.append(r1)     // Catch:{ all -> 0x011f }
            r1 = r7[r6]     // Catch:{ all -> 0x011f }
            r8.remove(r1)     // Catch:{ all -> 0x011f }
        L_0x0101:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r1 = f1270e     // Catch:{ all -> 0x011f }
            java.lang.String r3 = r9.toString()     // Catch:{ all -> 0x011f }
            r1.put(r2, r3)     // Catch:{ all -> 0x011f }
            goto L_0x0023
        L_0x010c:
            r3.put(r2, r1)     // Catch:{ all -> 0x011f }
            goto L_0x0023
        L_0x0111:
            b2.p r12 = f1271f     // Catch:{ all -> 0x011f }
            java.lang.String r1 = "com.facebook.appevents.UserDataStore.internalUserData"
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r2 = f1270e     // Catch:{ all -> 0x011f }
            java.lang.String r2 = p198q2.C9138d0.m18630c0(r2)     // Catch:{ all -> 0x011f }
            r12.m2281j(r1, r2)     // Catch:{ all -> 0x011f }
            return
        L_0x011f:
            r12 = move-exception
            p251v2.C9925a.m20732b(r12, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p033b2.C2875p.m2280i(java.util.Map):void");
    }

    /* renamed from: j */
    private final void m2281j(String str, String str2) {
        if (!C9925a.m20734d(this)) {
            try {
                FacebookSdk.getExecutor().execute(new C2876a(str, str2));
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }
}
