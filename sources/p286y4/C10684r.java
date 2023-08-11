package p286y4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import androidx.annotation.NonNull;
import java.lang.reflect.Method;
import p023a5.C2207e;

/* renamed from: y4.r */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C10684r {

    /* renamed from: a */
    private static final int f16264a = Process.myUid();

    /* renamed from: b */
    private static final Method f16265b;

    /* renamed from: c */
    private static final Method f16266c;

    /* renamed from: d */
    private static final Method f16267d;

    /* renamed from: e */
    private static final Method f16268e;

    /* renamed from: f */
    private static final Method f16269f;

    /* renamed from: g */
    private static final Method f16270g;

    /* renamed from: h */
    private static final Method f16271h;

    /* renamed from: i */
    private static final Method f16272i;

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0056 A[SYNTHETIC, Splitter:B:23:0x0056] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00aa  */
    static {
        /*
            java.lang.String r0 = "add"
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            int r2 = android.os.Process.myUid()
            f16264a = r2
            r2 = 1
            r3 = 0
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0018 }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0018 }
            r5[r3] = r6     // Catch:{ Exception -> 0x0018 }
            java.lang.reflect.Method r5 = r1.getMethod(r0, r5)     // Catch:{ Exception -> 0x0018 }
            goto L_0x0019
        L_0x0018:
            r5 = r4
        L_0x0019:
            f16265b = r5
            boolean r5 = p286y4.C10680n.m22699c()
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r7 = 2
            if (r5 == 0) goto L_0x0031
            java.lang.Class[] r5 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x0031 }
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0031 }
            r5[r3] = r8     // Catch:{ Exception -> 0x0031 }
            r5[r2] = r6     // Catch:{ Exception -> 0x0031 }
            java.lang.reflect.Method r0 = r1.getMethod(r0, r5)     // Catch:{ Exception -> 0x0031 }
            goto L_0x0032
        L_0x0031:
            r0 = r4
        L_0x0032:
            f16266c = r0
            java.lang.String r0 = "size"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x003d }
            java.lang.reflect.Method r0 = r1.getMethod(r0, r5)     // Catch:{ Exception -> 0x003d }
            goto L_0x003e
        L_0x003d:
            r0 = r4
        L_0x003e:
            f16267d = r0
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x004d }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x004d }
            r0[r3] = r5     // Catch:{ Exception -> 0x004d }
            java.lang.String r5 = "get"
            java.lang.reflect.Method r0 = r1.getMethod(r5, r0)     // Catch:{ Exception -> 0x004d }
            goto L_0x004e
        L_0x004d:
            r0 = r4
        L_0x004e:
            f16268e = r0
            boolean r0 = p286y4.C10680n.m22699c()
            if (r0 == 0) goto L_0x0063
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0063 }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0063 }
            r0[r3] = r5     // Catch:{ Exception -> 0x0063 }
            java.lang.String r5 = "getName"
            java.lang.reflect.Method r0 = r1.getMethod(r5, r0)     // Catch:{ Exception -> 0x0063 }
            goto L_0x0064
        L_0x0063:
            r0 = r4
        L_0x0064:
            f16269f = r0
            boolean r0 = p286y4.C10680n.m22705i()
            java.lang.String r5 = "WorkSourceUtil"
            if (r0 == 0) goto L_0x007d
            java.lang.String r0 = "createWorkChain"
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0077 }
            java.lang.reflect.Method r0 = r1.getMethod(r0, r8)     // Catch:{ Exception -> 0x0077 }
            goto L_0x007e
        L_0x0077:
            r0 = move-exception
            java.lang.String r8 = "Missing WorkChain API createWorkChain"
            android.util.Log.w(r5, r8, r0)
        L_0x007d:
            r0 = r4
        L_0x007e:
            f16270g = r0
            boolean r0 = p286y4.C10680n.m22705i()
            if (r0 == 0) goto L_0x00a1
            java.lang.String r0 = "android.os.WorkSource$WorkChain"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x009b }
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x009b }
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x009b }
            r7[r3] = r8     // Catch:{ Exception -> 0x009b }
            r7[r2] = r6     // Catch:{ Exception -> 0x009b }
            java.lang.String r6 = "addNode"
            java.lang.reflect.Method r0 = r0.getMethod(r6, r7)     // Catch:{ Exception -> 0x009b }
            goto L_0x00a2
        L_0x009b:
            r0 = move-exception
            java.lang.String r6 = "Missing WorkChain class"
            android.util.Log.w(r5, r6, r0)
        L_0x00a1:
            r0 = r4
        L_0x00a2:
            f16271h = r0
            boolean r0 = p286y4.C10680n.m22705i()
            if (r0 == 0) goto L_0x00b5
            java.lang.String r0 = "isEmpty"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x00b5 }
            java.lang.reflect.Method r4 = r1.getMethod(r0, r3)     // Catch:{ Exception -> 0x00b5 }
            r4.setAccessible(r2)     // Catch:{ Exception -> 0x00b5 }
        L_0x00b5:
            f16272i = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p286y4.C10684r.<clinit>():void");
    }

    /* renamed from: a */
    public static void m22712a(@NonNull WorkSource workSource, int i, @NonNull String str) {
        Method method = f16266c;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, new Object[]{Integer.valueOf(i), str});
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        } else {
            Method method2 = f16265b;
            if (method2 != null) {
                try {
                    method2.invoke(workSource, new Object[]{Integer.valueOf(i)});
                } catch (Exception e2) {
                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                }
            }
        }
    }

    @NonNull
    /* renamed from: b */
    public static WorkSource m22713b(@NonNull Context context, @NonNull String str) {
        String str2;
        String str3;
        if (!(context == null || context.getPackageManager() == null || str == null)) {
            try {
                ApplicationInfo c = C2207e.m1805a(context).mo23528c(str, 0);
                if (c == null) {
                    if (str.length() != 0) {
                        str3 = "Could not get applicationInfo from package: ".concat(str);
                    } else {
                        str3 = new String("Could not get applicationInfo from package: ");
                    }
                    Log.e("WorkSourceUtil", str3);
                    return null;
                }
                int i = c.uid;
                WorkSource workSource = new WorkSource();
                m22712a(workSource, i, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                if (str.length() != 0) {
                    str2 = "Could not find package: ".concat(str);
                } else {
                    str2 = new String("Could not find package: ");
                }
                Log.e("WorkSourceUtil", str2);
            }
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m22714c(@NonNull Context context) {
        if (context == null || context.getPackageManager() == null || C2207e.m1805a(context).mo23527b("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) {
            return false;
        }
        return true;
    }
}
