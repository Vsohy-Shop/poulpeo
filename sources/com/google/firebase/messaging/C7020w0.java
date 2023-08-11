package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: com.google.firebase.messaging.w0 */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
public class C7020w0 {

    /* renamed from: e */
    private static C7020w0 f9365e;
    @Nullable

    /* renamed from: a */
    private String f9366a = null;

    /* renamed from: b */
    private Boolean f9367b = null;

    /* renamed from: c */
    private Boolean f9368c = null;

    /* renamed from: d */
    private final Queue<Intent> f9369d = new ArrayDeque();

    private C7020w0() {
    }

    /* renamed from: a */
    private int m12425a(Context context, Intent intent) {
        ComponentName componentName;
        String str;
        String f = m12427f(context, intent);
        if (f != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                if (f.length() != 0) {
                    str = "Restricting intent to a specific service: ".concat(f);
                } else {
                    str = new String("Restricting intent to a specific service: ");
                }
                Log.d("FirebaseMessaging", str);
            }
            intent.setClassName(context.getPackageName(), f);
        }
        try {
            if (mo39996e(context)) {
                componentName = C6979g1.m12302e(context, intent);
            } else {
                componentName = context.startService(intent);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (componentName != null) {
                return -1;
            }
            Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (SecurityException e) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e);
            return TypedValues.CycleType.TYPE_CURVE_FIT;
        } catch (IllegalStateException e2) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: ".concat(e2.toString()));
            return TypedValues.CycleType.TYPE_VISIBILITY;
        }
    }

    /* renamed from: b */
    static synchronized C7020w0 m12426b() {
        C7020w0 w0Var;
        synchronized (C7020w0.class) {
            if (f9365e == null) {
                f9365e = new C7020w0();
            }
            w0Var = f9365e;
        }
        return w0Var;
    }

    @Nullable
    /* renamed from: f */
    private synchronized String m12427f(Context context, Intent intent) {
        String str;
        String str2 = this.f9366a;
        if (str2 != null) {
            return str2;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService != null) {
            ServiceInfo serviceInfo = resolveService.serviceInfo;
            if (serviceInfo != null) {
                if (context.getPackageName().equals(serviceInfo.packageName)) {
                    String str3 = serviceInfo.name;
                    if (str3 != null) {
                        if (str3.startsWith(".")) {
                            String valueOf = String.valueOf(context.getPackageName());
                            String valueOf2 = String.valueOf(serviceInfo.name);
                            if (valueOf2.length() != 0) {
                                str = valueOf.concat(valueOf2);
                            } else {
                                str = new String(valueOf);
                            }
                            this.f9366a = str;
                        } else {
                            this.f9366a = serviceInfo.name;
                        }
                        return this.f9366a;
                    }
                }
                String str4 = serviceInfo.packageName;
                String str5 = serviceInfo.name;
                StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 94 + String.valueOf(str5).length());
                sb.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
                sb.append(str4);
                sb.append("/");
                sb.append(str5);
                Log.e("FirebaseMessaging", sb.toString());
                return null;
            }
        }
        Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
        return null;
    }

    /* access modifiers changed from: package-private */
    @MainThread
    /* renamed from: c */
    public Intent mo39994c() {
        return this.f9369d.poll();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo39995d(Context context) {
        boolean z;
        if (this.f9368c == null) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f9368c = Boolean.valueOf(z);
        }
        if (!this.f9367b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f9368c.booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo39996e(Context context) {
        boolean z;
        if (this.f9367b == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f9367b = Boolean.valueOf(z);
        }
        if (!this.f9367b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f9367b.booleanValue();
    }

    @MainThread
    /* renamed from: g */
    public int mo39997g(@NonNull Context context, @NonNull Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.f9369d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return m12425a(context, intent2);
    }
}
