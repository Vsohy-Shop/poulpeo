package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.tagmanager.ModuleDescriptor;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.HashMap;
import java.util.Map;
import p036b5.C2890b;
import p254v5.C9940a;
import p254v5.C9941b;
import p254v5.C9951l;
import p254v5.C9954o;
import p254v5.C9955p;
import p254v5.C9958s;

/* renamed from: com.google.android.gms.tagmanager.a */
final class C6367a {

    /* renamed from: a */
    private static volatile DynamiteModule f8469a;

    /* renamed from: b */
    private static volatile C9954o f8470b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final Map<String, C9940a> f8471c = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final Map<String, C9941b> f8472d = new HashMap();

    private C6367a() {
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0062 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m11252a(java.lang.String r8, java.lang.Class<?> r9) {
        /*
            java.lang.String r0 = " doesn't have an accessible no-arg constructor"
            java.lang.String r1 = "GoogleTagManagerAPI"
            java.lang.Class r2 = java.lang.Class.forName(r8)     // Catch:{ ClassNotFoundException -> 0x00a4 }
            java.lang.Class[] r3 = r2.getInterfaces()     // Catch:{ ClassNotFoundException -> 0x00a4 }
            int r4 = r3.length     // Catch:{ ClassNotFoundException -> 0x00a4 }
            r5 = 0
            r6 = r5
        L_0x000f:
            if (r6 >= r4) goto L_0x001e
            r7 = r3[r6]     // Catch:{ ClassNotFoundException -> 0x00a4 }
            boolean r7 = r7.equals(r9)     // Catch:{ ClassNotFoundException -> 0x00a4 }
            if (r7 == 0) goto L_0x001b
            r3 = 1
            goto L_0x001f
        L_0x001b:
            int r6 = r6 + 1
            goto L_0x000f
        L_0x001e:
            r3 = r5
        L_0x001f:
            if (r3 != 0) goto L_0x0055
            java.lang.String r9 = r9.getCanonicalName()     // Catch:{ ClassNotFoundException -> 0x00a4 }
            java.lang.String r0 = java.lang.String.valueOf(r8)     // Catch:{ ClassNotFoundException -> 0x00a4 }
            int r0 = r0.length()     // Catch:{ ClassNotFoundException -> 0x00a4 }
            int r0 = r0 + 30
            java.lang.String r2 = java.lang.String.valueOf(r9)     // Catch:{ ClassNotFoundException -> 0x00a4 }
            int r2 = r2.length()     // Catch:{ ClassNotFoundException -> 0x00a4 }
            int r0 = r0 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x00a4 }
            r2.<init>(r0)     // Catch:{ ClassNotFoundException -> 0x00a4 }
            r2.append(r8)     // Catch:{ ClassNotFoundException -> 0x00a4 }
            java.lang.String r0 = " doesn't implement "
            r2.append(r0)     // Catch:{ ClassNotFoundException -> 0x00a4 }
            r2.append(r9)     // Catch:{ ClassNotFoundException -> 0x00a4 }
            java.lang.String r9 = " interface."
            r2.append(r9)     // Catch:{ ClassNotFoundException -> 0x00a4 }
            java.lang.String r9 = r2.toString()     // Catch:{ ClassNotFoundException -> 0x00a4 }
            android.util.Log.e(r1, r9)     // Catch:{ ClassNotFoundException -> 0x00a4 }
            goto L_0x00b1
        L_0x0055:
            java.lang.Class[] r9 = new java.lang.Class[r5]     // Catch:{ NoSuchMethodException -> 0x0096, SecurityException -> 0x008a, InvocationTargetException -> 0x007c, InstantiationException -> 0x006e, IllegalAccessException -> 0x0062 }
            java.lang.reflect.Constructor r9 = r2.getConstructor(r9)     // Catch:{ NoSuchMethodException -> 0x0096, SecurityException -> 0x008a, InvocationTargetException -> 0x007c, InstantiationException -> 0x006e, IllegalAccessException -> 0x0062 }
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ NoSuchMethodException -> 0x0096, SecurityException -> 0x008a, InvocationTargetException -> 0x007c, InstantiationException -> 0x006e, IllegalAccessException -> 0x0062 }
            java.lang.Object r8 = r9.newInstance(r2)     // Catch:{ NoSuchMethodException -> 0x0096, SecurityException -> 0x008a, InvocationTargetException -> 0x007c, InstantiationException -> 0x006e, IllegalAccessException -> 0x0062 }
            goto L_0x00b2
        L_0x0062:
            java.lang.String r9 = java.lang.String.valueOf(r8)     // Catch:{ ClassNotFoundException -> 0x00a4 }
            java.lang.String r9 = r9.concat(r0)     // Catch:{ ClassNotFoundException -> 0x00a4 }
            android.util.Log.e(r1, r9)     // Catch:{ ClassNotFoundException -> 0x00a4 }
            goto L_0x00b1
        L_0x006e:
            java.lang.String r9 = java.lang.String.valueOf(r8)     // Catch:{ ClassNotFoundException -> 0x00a4 }
            java.lang.String r0 = " is an abstract class."
            java.lang.String r9 = r9.concat(r0)     // Catch:{ ClassNotFoundException -> 0x00a4 }
            android.util.Log.e(r1, r9)     // Catch:{ ClassNotFoundException -> 0x00a4 }
            goto L_0x00b1
        L_0x007c:
            java.lang.String r9 = java.lang.String.valueOf(r8)     // Catch:{ ClassNotFoundException -> 0x00a4 }
            java.lang.String r0 = " construction threw an exception."
            java.lang.String r9 = r9.concat(r0)     // Catch:{ ClassNotFoundException -> 0x00a4 }
            android.util.Log.e(r1, r9)     // Catch:{ ClassNotFoundException -> 0x00a4 }
            goto L_0x00b1
        L_0x008a:
            java.lang.String r9 = java.lang.String.valueOf(r8)     // Catch:{ ClassNotFoundException -> 0x00a4 }
            java.lang.String r9 = r9.concat(r0)     // Catch:{ ClassNotFoundException -> 0x00a4 }
            android.util.Log.e(r1, r9)     // Catch:{ ClassNotFoundException -> 0x00a4 }
            goto L_0x00b1
        L_0x0096:
            java.lang.String r9 = java.lang.String.valueOf(r8)     // Catch:{ ClassNotFoundException -> 0x00a4 }
            java.lang.String r0 = " doesn't have a valid no-arg constructor"
            java.lang.String r9 = r9.concat(r0)     // Catch:{ ClassNotFoundException -> 0x00a4 }
            android.util.Log.e(r1, r9)     // Catch:{ ClassNotFoundException -> 0x00a4 }
            goto L_0x00b1
        L_0x00a4:
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r9 = " can't be found in the application."
            java.lang.String r8 = r8.concat(r9)
            android.util.Log.e(r1, r8)
        L_0x00b1:
            r8 = 0
        L_0x00b2:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tagmanager.C6367a.m11252a(java.lang.String, java.lang.Class):java.lang.Object");
    }

    /* renamed from: b */
    static void m11253b(Intent intent, Context context) {
        C9954o h = m11259h(context);
        synchronized (C6367a.class) {
            try {
                h.previewIntent(intent, C2890b.m2297b3(context), C2890b.m2297b3(f8469a.mo32581b()), m11261j(context), new C6371e());
            } catch (RemoteException e) {
                throw new IllegalStateException(e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    static IBinder m11255d(Context context) {
        try {
            return C9958s.asInterface(m11260i(context).mo32582d("com.google.android.gms.tagmanager.TagManagerServiceProviderImpl")).getService(C2890b.m2297b3(context), m11261j(context), new C6371e()).asBinder();
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        } catch (DynamiteModule.LoadingException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: f */
    static void m11257f(Context context) {
        C9954o h = m11259h(context);
        synchronized (C6367a.class) {
            try {
                h.initialize(C2890b.m2297b3(context), m11261j(context), new C6371e());
            } catch (RemoteException e) {
                throw new IllegalStateException(e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: h */
    private static C9954o m11259h(Context context) {
        C9954o oVar = f8470b;
        if (oVar == null) {
            synchronized (C6367a.class) {
                oVar = f8470b;
                if (oVar == null) {
                    try {
                        C9954o asInterface = C9955p.asInterface(m11260i(context).mo32582d("com.google.android.gms.tagmanager.TagManagerApiImpl"));
                        f8470b = asInterface;
                        oVar = asInterface;
                    } catch (DynamiteModule.LoadingException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return oVar;
    }

    /* renamed from: i */
    private static DynamiteModule m11260i(Context context) {
        DynamiteModule dynamiteModule = f8469a;
        if (dynamiteModule == null) {
            synchronized (C6367a.class) {
                dynamiteModule = f8469a;
                if (f8469a == null) {
                    DynamiteModule e = DynamiteModule.m6738e(context, DynamiteModule.f5076g, ModuleDescriptor.MODULE_ID);
                    f8469a = e;
                    dynamiteModule = e;
                }
            }
        }
        return dynamiteModule;
    }

    /* renamed from: j */
    private static C9951l m11261j(Context context) {
        return new C6368b(AppMeasurement.getInstance(context));
    }
}
