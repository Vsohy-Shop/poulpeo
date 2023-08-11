package p095g2;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.RestrictTo;
import com.facebook.FacebookSdk;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import org.json.JSONException;
import org.json.JSONObject;
import p251v2.C9925a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: g2.d */
/* compiled from: InAppPurchaseEventManager.kt */
public final class C7760d {

    /* renamed from: a */
    private static final HashMap<String, Method> f10764a = new HashMap<>();

    /* renamed from: b */
    private static final HashMap<String, Class<?>> f10765b = new HashMap<>();

    /* renamed from: c */
    private static final String f10766c = FacebookSdk.getApplicationContext().getPackageName();

    /* renamed from: d */
    private static final SharedPreferences f10767d = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);

    /* renamed from: e */
    private static final SharedPreferences f10768e = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.internal.PURCHASE", 0);

    /* renamed from: f */
    public static final C7760d f10769f = new C7760d();

    private C7760d() {
    }

    /* renamed from: a */
    public static final Object m15106a(Context context, IBinder iBinder) {
        Class<C7760d> cls = C7760d.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            C12775o.m28639i(context, "context");
            return f10769f.m15118n(context, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", (Object) null, new Object[]{iBinder});
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    public static final void m15107b() {
        Class<C7760d> cls = C7760d.class;
        if (!C9925a.m20734d(cls)) {
            try {
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                SharedPreferences sharedPreferences = f10767d;
                long j = sharedPreferences.getLong("LAST_CLEARED_TIME", 0);
                if (j == 0) {
                    sharedPreferences.edit().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                } else if (currentTimeMillis - j > ((long) 604800)) {
                    sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", currentTimeMillis).apply();
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: c */
    private final ArrayList<String> m15108c(ArrayList<String> arrayList) {
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList2 = new ArrayList<>();
            SharedPreferences.Editor edit = f10768e.edit();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                try {
                    JSONObject jSONObject = new JSONObject(next);
                    String string = jSONObject.getString("productId");
                    long j = jSONObject.getLong("purchaseTime");
                    String string2 = jSONObject.getString("purchaseToken");
                    if (currentTimeMillis - (j / 1000) <= ((long) 86400)) {
                        if (!C12775o.m28634d(f10768e.getString(string, ""), string2)) {
                            edit.putString(string, string2);
                            arrayList2.add(next);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
            edit.apply();
            return arrayList2;
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }

    /* renamed from: d */
    private final Class<?> m15109d(Context context, String str) {
        Class<?> loadClass;
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            HashMap<String, Class<?>> hashMap = f10765b;
            Class<?> cls = hashMap.get(str);
            if (cls != null) {
                return cls;
            }
            try {
                loadClass = context.getClassLoader().loadClass(str);
                C12775o.m28638h(loadClass, "classObj");
                hashMap.put(str, loadClass);
                return loadClass;
            } catch (ClassNotFoundException unused) {
                return loadClass;
            }
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.reflect.Method m15110e(java.lang.Class<?> r14, java.lang.String r15) {
        /*
            r13 = this;
            boolean r0 = p251v2.C9925a.m20734d(r13)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.util.HashMap<java.lang.String, java.lang.reflect.Method> r0 = f10764a     // Catch:{ all -> 0x00b3 }
            java.lang.Object r2 = r0.get(r15)     // Catch:{ all -> 0x00b3 }
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch:{ all -> 0x00b3 }
            if (r2 == 0) goto L_0x0013
            return r2
        L_0x0013:
            int r3 = r15.hashCode()     // Catch:{ NoSuchMethodException -> 0x00b2 }
            java.lang.Class<android.os.Bundle> r4 = android.os.Bundle.class
            r5 = 4
            r6 = 2
            java.lang.String r7 = "Integer.TYPE"
            r8 = 3
            r9 = 0
            r10 = 1
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            switch(r3) {
                case -1801122596: goto L_0x007f;
                case -1450694211: goto L_0x0069;
                case -1123215065: goto L_0x005a;
                case -594356707: goto L_0x003f;
                case -573310373: goto L_0x0027;
                default: goto L_0x0025;
            }
        L_0x0025:
            goto L_0x0097
        L_0x0027:
            java.lang.String r3 = "getSkuDetails"
            boolean r3 = r15.equals(r3)     // Catch:{ NoSuchMethodException -> 0x00b2 }
            if (r3 == 0) goto L_0x0097
            java.lang.Class[] r3 = new java.lang.Class[r5]     // Catch:{ NoSuchMethodException -> 0x00b2 }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x00b2 }
            kotlin.jvm.internal.C12775o.m28638h(r5, r7)     // Catch:{ NoSuchMethodException -> 0x00b2 }
            r3[r9] = r5     // Catch:{ NoSuchMethodException -> 0x00b2 }
            r3[r10] = r11     // Catch:{ NoSuchMethodException -> 0x00b2 }
            r3[r6] = r11     // Catch:{ NoSuchMethodException -> 0x00b2 }
            r3[r8] = r4     // Catch:{ NoSuchMethodException -> 0x00b2 }
            goto L_0x0098
        L_0x003f:
            java.lang.String r3 = "getPurchaseHistory"
            boolean r3 = r15.equals(r3)     // Catch:{ NoSuchMethodException -> 0x00b2 }
            if (r3 == 0) goto L_0x0097
            r3 = 5
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x00b2 }
            java.lang.Class r12 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x00b2 }
            kotlin.jvm.internal.C12775o.m28638h(r12, r7)     // Catch:{ NoSuchMethodException -> 0x00b2 }
            r3[r9] = r12     // Catch:{ NoSuchMethodException -> 0x00b2 }
            r3[r10] = r11     // Catch:{ NoSuchMethodException -> 0x00b2 }
            r3[r6] = r11     // Catch:{ NoSuchMethodException -> 0x00b2 }
            r3[r8] = r11     // Catch:{ NoSuchMethodException -> 0x00b2 }
            r3[r5] = r4     // Catch:{ NoSuchMethodException -> 0x00b2 }
            goto L_0x0098
        L_0x005a:
            java.lang.String r3 = "asInterface"
            boolean r3 = r15.equals(r3)     // Catch:{ NoSuchMethodException -> 0x00b2 }
            if (r3 == 0) goto L_0x0097
            java.lang.Class[] r3 = new java.lang.Class[r10]     // Catch:{ NoSuchMethodException -> 0x00b2 }
            java.lang.Class<android.os.IBinder> r4 = android.os.IBinder.class
            r3[r9] = r4     // Catch:{ NoSuchMethodException -> 0x00b2 }
            goto L_0x0098
        L_0x0069:
            java.lang.String r3 = "isBillingSupported"
            boolean r3 = r15.equals(r3)     // Catch:{ NoSuchMethodException -> 0x00b2 }
            if (r3 == 0) goto L_0x0097
            java.lang.Class[] r3 = new java.lang.Class[r8]     // Catch:{ NoSuchMethodException -> 0x00b2 }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x00b2 }
            kotlin.jvm.internal.C12775o.m28638h(r4, r7)     // Catch:{ NoSuchMethodException -> 0x00b2 }
            r3[r9] = r4     // Catch:{ NoSuchMethodException -> 0x00b2 }
            r3[r10] = r11     // Catch:{ NoSuchMethodException -> 0x00b2 }
            r3[r6] = r11     // Catch:{ NoSuchMethodException -> 0x00b2 }
            goto L_0x0098
        L_0x007f:
            java.lang.String r3 = "getPurchases"
            boolean r3 = r15.equals(r3)     // Catch:{ NoSuchMethodException -> 0x00b2 }
            if (r3 == 0) goto L_0x0097
            java.lang.Class[] r3 = new java.lang.Class[r5]     // Catch:{ NoSuchMethodException -> 0x00b2 }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x00b2 }
            kotlin.jvm.internal.C12775o.m28638h(r4, r7)     // Catch:{ NoSuchMethodException -> 0x00b2 }
            r3[r9] = r4     // Catch:{ NoSuchMethodException -> 0x00b2 }
            r3[r10] = r11     // Catch:{ NoSuchMethodException -> 0x00b2 }
            r3[r6] = r11     // Catch:{ NoSuchMethodException -> 0x00b2 }
            r3[r8] = r11     // Catch:{ NoSuchMethodException -> 0x00b2 }
            goto L_0x0098
        L_0x0097:
            r3 = r1
        L_0x0098:
            if (r3 != 0) goto L_0x00a3
            java.lang.Class[] r3 = new java.lang.Class[r10]     // Catch:{ NoSuchMethodException -> 0x00b2 }
            r3[r9] = r1     // Catch:{ NoSuchMethodException -> 0x00b2 }
            java.lang.reflect.Method r14 = r14.getDeclaredMethod(r15, r3)     // Catch:{ NoSuchMethodException -> 0x00b2 }
            goto L_0x00ae
        L_0x00a3:
            int r4 = r3.length     // Catch:{ NoSuchMethodException -> 0x00b2 }
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)     // Catch:{ NoSuchMethodException -> 0x00b2 }
            java.lang.Class[] r3 = (java.lang.Class[]) r3     // Catch:{ NoSuchMethodException -> 0x00b2 }
            java.lang.reflect.Method r14 = r14.getDeclaredMethod(r15, r3)     // Catch:{ NoSuchMethodException -> 0x00b2 }
        L_0x00ae:
            r2 = r14
            r0.put(r15, r2)     // Catch:{ NoSuchMethodException -> 0x00b2 }
        L_0x00b2:
            return r2
        L_0x00b3:
            r14 = move-exception
            p251v2.C9925a.m20732b(r14, r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p095g2.C7760d.m15110e(java.lang.Class, java.lang.String):java.lang.reflect.Method");
    }

    /* renamed from: f */
    private final ArrayList<String> m15111f(Context context, Object obj, String str) {
        ArrayList<String> stringArrayList;
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            if (m15119o(context, obj, str)) {
                String str2 = null;
                int i = 0;
                boolean z = false;
                do {
                    Object n = m15118n(context, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj, new Object[]{6, f10766c, str, str2, new Bundle()});
                    if (n != null) {
                        long j = 1000;
                        long currentTimeMillis = System.currentTimeMillis() / 1000;
                        Bundle bundle = (Bundle) n;
                        if (bundle.getInt("RESPONSE_CODE") == 0 && (stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) != null) {
                            C12775o.m28638h(stringArrayList, "purchaseDetails.getStrin…SE_DATA_LIST) ?: continue");
                            Iterator<String> it = stringArrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                String next = it.next();
                                try {
                                    if (currentTimeMillis - (new JSONObject(next).getLong("purchaseTime") / j) > ((long) 1200)) {
                                        z = true;
                                        break;
                                    }
                                    arrayList.add(next);
                                    i++;
                                    j = 1000;
                                } catch (JSONException unused) {
                                }
                            }
                            str2 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                            if (i >= 30 || str2 == null) {
                                break;
                            }
                        }
                    }
                    str2 = null;
                } while (!z);
            }
            return arrayList;
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r3 = f10769f;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList<java.lang.String> m15112g(android.content.Context r6, java.lang.Object r7) {
        /*
            java.lang.Class<g2.d> r0 = p095g2.C7760d.class
            boolean r1 = p251v2.C9925a.m20734d(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            java.lang.String r1 = "context"
            kotlin.jvm.internal.C12775o.m28639i(r6, r1)     // Catch:{ all -> 0x0035 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0035 }
            r1.<init>()     // Catch:{ all -> 0x0035 }
            if (r7 != 0) goto L_0x0017
            return r1
        L_0x0017:
            g2.d r3 = f10769f     // Catch:{ all -> 0x0035 }
            java.lang.String r4 = "com.android.vending.billing.IInAppBillingService"
            java.lang.Class r4 = r3.m15109d(r6, r4)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x0034
            java.lang.String r5 = "getPurchaseHistory"
            java.lang.reflect.Method r4 = r3.m15110e(r4, r5)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x0034
            java.lang.String r1 = "inapp"
            java.util.ArrayList r6 = r3.m15111f(r6, r7, r1)     // Catch:{ all -> 0x0035 }
            java.util.ArrayList r6 = r3.m15108c(r6)     // Catch:{ all -> 0x0035 }
            return r6
        L_0x0034:
            return r1
        L_0x0035:
            r6 = move-exception
            p251v2.C9925a.m20732b(r6, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p095g2.C7760d.m15112g(android.content.Context, java.lang.Object):java.util.ArrayList");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0062 A[EDGE_INSN: B:27:0x0062->B:21:0x0062 ?: BREAK  , SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.ArrayList<java.lang.String> m15113h(android.content.Context r13, java.lang.Object r14, java.lang.String r15) {
        /*
            r12 = this;
            boolean r0 = p251v2.C9925a.m20734d(r12)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0063 }
            r0.<init>()     // Catch:{ all -> 0x0063 }
            if (r14 != 0) goto L_0x0010
            return r0
        L_0x0010:
            boolean r2 = r12.m15119o(r13, r14, r15)     // Catch:{ all -> 0x0063 }
            if (r2 == 0) goto L_0x0062
            r2 = 0
            r3 = r1
            r4 = r2
        L_0x0019:
            r5 = 4
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ all -> 0x0063 }
            r5 = 3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0063 }
            r11[r2] = r6     // Catch:{ all -> 0x0063 }
            java.lang.String r6 = f10766c     // Catch:{ all -> 0x0063 }
            r7 = 1
            r11[r7] = r6     // Catch:{ all -> 0x0063 }
            r6 = 2
            r11[r6] = r15     // Catch:{ all -> 0x0063 }
            r11[r5] = r3     // Catch:{ all -> 0x0063 }
            java.lang.String r8 = "com.android.vending.billing.IInAppBillingService"
            java.lang.String r9 = "getPurchases"
            r6 = r12
            r7 = r13
            r10 = r14
            java.lang.Object r3 = r6.m15118n(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0063 }
            if (r3 == 0) goto L_0x005b
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch:{ all -> 0x0063 }
            java.lang.String r5 = "RESPONSE_CODE"
            int r5 = r3.getInt(r5)     // Catch:{ all -> 0x0063 }
            if (r5 != 0) goto L_0x005b
            java.lang.String r5 = "INAPP_PURCHASE_DATA_LIST"
            java.util.ArrayList r5 = r3.getStringArrayList(r5)     // Catch:{ all -> 0x0063 }
            if (r5 == 0) goto L_0x0062
            int r6 = r5.size()     // Catch:{ all -> 0x0063 }
            int r4 = r4 + r6
            r0.addAll(r5)     // Catch:{ all -> 0x0063 }
            java.lang.String r5 = "INAPP_CONTINUATION_TOKEN"
            java.lang.String r3 = r3.getString(r5)     // Catch:{ all -> 0x0063 }
            goto L_0x005c
        L_0x005b:
            r3 = r1
        L_0x005c:
            r5 = 30
            if (r4 >= r5) goto L_0x0062
            if (r3 != 0) goto L_0x0019
        L_0x0062:
            return r0
        L_0x0063:
            r13 = move-exception
            p251v2.C9925a.m20732b(r13, r12)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p095g2.C7760d.m15113h(android.content.Context, java.lang.Object, java.lang.String):java.util.ArrayList");
    }

    /* renamed from: i */
    public static final ArrayList<String> m15114i(Context context, Object obj) {
        Class<C7760d> cls = C7760d.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            C12775o.m28639i(context, "context");
            C7760d dVar = f10769f;
            return dVar.m15108c(dVar.m15113h(context, obj, "inapp"));
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: j */
    public static final ArrayList<String> m15115j(Context context, Object obj) {
        Class<C7760d> cls = C7760d.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            C12775o.m28639i(context, "context");
            C7760d dVar = f10769f;
            return dVar.m15108c(dVar.m15113h(context, obj, "subs"));
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: k */
    public static final Map<String, String> m15116k(Context context, ArrayList<String> arrayList, Object obj, boolean z) {
        Class<C7760d> cls = C7760d.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            C12775o.m28639i(context, "context");
            C12775o.m28639i(arrayList, "skuList");
            Map<String, String> p = f10769f.m15120p(arrayList);
            ArrayList arrayList2 = new ArrayList();
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (!p.containsKey(next)) {
                    arrayList2.add(next);
                }
            }
            p.putAll(f10769f.m15117l(context, arrayList2, obj, z));
            return p;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: l */
    private final Map<String, String> m15117l(Context context, ArrayList<String> arrayList, Object obj, boolean z) {
        String str;
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (obj != null) {
                if (!arrayList.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
                    Object[] objArr = new Object[4];
                    objArr[0] = 3;
                    objArr[1] = f10766c;
                    if (z) {
                        str = "subs";
                    } else {
                        str = "inapp";
                    }
                    objArr[2] = str;
                    objArr[3] = bundle;
                    Object n = m15118n(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, objArr);
                    if (n != null) {
                        Bundle bundle2 = (Bundle) n;
                        if (bundle2.getInt("RESPONSE_CODE") == 0) {
                            ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                            if (stringArrayList != null && arrayList.size() == stringArrayList.size()) {
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    String str2 = arrayList.get(i);
                                    C12775o.m28638h(str2, "skuList[i]");
                                    String str3 = stringArrayList.get(i);
                                    C12775o.m28638h(str3, "skuDetailsList[i]");
                                    linkedHashMap.put(str2, str3);
                                }
                            }
                            m15121q(linkedHashMap);
                        }
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }

    /* renamed from: n */
    private final Object m15118n(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method e;
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            Class<?> d = m15109d(context, str);
            if (!(d == null || (e = m15110e(d, str2)) == null)) {
                if (obj != null) {
                    obj = d.cast(obj);
                }
                try {
                    return e.invoke(obj, Arrays.copyOf(objArr, objArr.length));
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }

    /* renamed from: o */
    private final boolean m15119o(Context context, Object obj, String str) {
        if (C9925a.m20734d(this) || obj == null) {
            return false;
        }
        try {
            Object n = m15118n(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, f10766c, str});
            if (n == null || ((Integer) n).intValue() != 0) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return false;
        }
    }

    /* renamed from: p */
    private final Map<String, String> m15120p(ArrayList<String> arrayList) {
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                String string = f10767d.getString(next, (String) null);
                if (string != null) {
                    List t0 = C13755w.m31594t0(string, new String[]{";"}, false, 2, 2, (Object) null);
                    if (currentTimeMillis - Long.parseLong((String) t0.get(0)) < ((long) 43200)) {
                        C12775o.m28638h(next, "sku");
                        linkedHashMap.put(next, t0.get(1));
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }

    /* renamed from: q */
    private final void m15121q(Map<String, String> map) {
        if (!C9925a.m20734d(this)) {
            try {
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                SharedPreferences.Editor edit = f10767d.edit();
                for (Map.Entry next : map.entrySet()) {
                    edit.putString((String) next.getKey(), currentTimeMillis + ';' + ((String) next.getValue()));
                }
                edit.apply();
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: m */
    public final boolean mo41406m(String str) {
        boolean z;
        if (C9925a.m20734d(this)) {
            return false;
        }
        try {
            C12775o.m28639i(str, "skuDetail");
            try {
                String optString = new JSONObject(str).optString("freeTrialPeriod");
                if (optString == null) {
                    return false;
                }
                if (optString.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return true;
                }
                return false;
            } catch (JSONException unused) {
                return false;
            }
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return false;
        }
    }
}
