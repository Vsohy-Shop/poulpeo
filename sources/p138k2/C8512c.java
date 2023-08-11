package p138k2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import androidx.autofill.HintConstants;
import com.facebook.FacebookSdk;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C12775o;
import p033b2.C2834c;
import p034b3.C2877a;
import p118i2.C8093b;
import p198q2.C9138d0;
import p198q2.C9163j;
import p251v2.C9925a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: k2.c */
/* compiled from: RemoteServiceWrapper.kt */
public final class C8512c {

    /* renamed from: a */
    private static final String f12123a;

    /* renamed from: b */
    private static Boolean f12124b;

    /* renamed from: c */
    public static final C8512c f12125c = new C8512c();

    /* renamed from: k2.c$a */
    /* compiled from: RemoteServiceWrapper.kt */
    public enum C8513a {
        MOBILE_APP_INSTALL("MOBILE_APP_INSTALL"),
        CUSTOM_APP_EVENTS("CUSTOM_APP_EVENTS");
        

        /* renamed from: b */
        private final String f12129b;

        private C8513a(String str) {
            this.f12129b = str;
        }

        public String toString() {
            return this.f12129b;
        }
    }

    /* renamed from: k2.c$b */
    /* compiled from: RemoteServiceWrapper.kt */
    public static final class C8514b implements ServiceConnection {

        /* renamed from: b */
        private final CountDownLatch f12130b = new CountDownLatch(1);

        /* renamed from: c */
        private IBinder f12131c;

        /* renamed from: a */
        public final IBinder mo42538a() {
            this.f12130b.await(5, TimeUnit.SECONDS);
            return this.f12131c;
        }

        public void onNullBinding(ComponentName componentName) {
            C12775o.m28639i(componentName, HintConstants.AUTOFILL_HINT_NAME);
            this.f12130b.countDown();
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C12775o.m28639i(componentName, HintConstants.AUTOFILL_HINT_NAME);
            C12775o.m28639i(iBinder, "serviceBinder");
            this.f12131c = iBinder;
            this.f12130b.countDown();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C12775o.m28639i(componentName, HintConstants.AUTOFILL_HINT_NAME);
        }
    }

    /* renamed from: k2.c$c */
    /* compiled from: RemoteServiceWrapper.kt */
    public enum C8515c {
        OPERATION_SUCCESS,
        SERVICE_NOT_AVAILABLE,
        SERVICE_ERROR
    }

    static {
        String simpleName = C8512c.class.getSimpleName();
        C12775o.m28638h(simpleName, "RemoteServiceWrapper::class.java.simpleName");
        f12123a = simpleName;
    }

    private C8512c() {
    }

    /* renamed from: a */
    private final Intent m17060a(Context context) {
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Intent intent = new Intent("ReceiverService");
                intent.setPackage("com.facebook.katana");
                if (packageManager.resolveService(intent, 0) != null && C9163j.m18750a(context, "com.facebook.katana")) {
                    return intent;
                }
                Intent intent2 = new Intent("ReceiverService");
                intent2.setPackage("com.facebook.wakizashi");
                if (packageManager.resolveService(intent2, 0) == null || !C9163j.m18750a(context, "com.facebook.wakizashi")) {
                    return null;
                }
                return intent2;
            }
            return null;
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }

    /* renamed from: b */
    public static final boolean m17061b() {
        boolean z;
        Class<C8512c> cls = C8512c.class;
        if (C9925a.m20734d(cls)) {
            return false;
        }
        try {
            if (f12124b == null) {
                if (f12125c.m17060a(FacebookSdk.getApplicationContext()) != null) {
                    z = true;
                } else {
                    z = false;
                }
                f12124b = Boolean.valueOf(z);
            }
            Boolean bool = f12124b;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return false;
        }
    }

    /* renamed from: c */
    public static final C8515c m17062c(String str, List<C2834c> list) {
        Class<C8512c> cls = C8512c.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            C12775o.m28639i(str, "applicationId");
            C12775o.m28639i(list, "appEvents");
            return f12125c.m17063d(C8513a.CUSTOM_APP_EVENTS, str, list);
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: d */
    private final C8515c m17063d(C8513a aVar, String str, List<C2834c> list) {
        Context applicationContext;
        C8514b bVar;
        C8515c cVar;
        String str2;
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            C8515c cVar2 = C8515c.SERVICE_NOT_AVAILABLE;
            C8093b.m15920b();
            applicationContext = FacebookSdk.getApplicationContext();
            Intent a = m17060a(applicationContext);
            if (a == null) {
                return cVar2;
            }
            bVar = new C8514b();
            if (!applicationContext.bindService(a, bVar, 1)) {
                return C8515c.SERVICE_ERROR;
            }
            try {
                IBinder a2 = bVar.mo42538a();
                if (a2 != null) {
                    C2877a E = C2877a.C2878a.m2283E(a2);
                    Bundle a3 = C8511b.m17057a(aVar, str, list);
                    if (a3 != null) {
                        E.mo28409g0(a3);
                        String str3 = f12123a;
                        C9138d0.m18626a0(str3, "Successfully sent events to the remote service: " + a3);
                    }
                    cVar2 = C8515c.OPERATION_SUCCESS;
                }
                applicationContext.unbindService(bVar);
                C9138d0.m18626a0(f12123a, "Unbound from the remote service");
                return cVar2;
            } catch (InterruptedException e) {
                cVar = C8515c.SERVICE_ERROR;
                str2 = f12123a;
                C9138d0.m18624Z(str2, e);
                applicationContext.unbindService(bVar);
                C9138d0.m18626a0(str2, "Unbound from the remote service");
                return cVar;
            } catch (RemoteException e2) {
                cVar = C8515c.SERVICE_ERROR;
                str2 = f12123a;
                C9138d0.m18624Z(str2, e2);
                applicationContext.unbindService(bVar);
                C9138d0.m18626a0(str2, "Unbound from the remote service");
                return cVar;
            }
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }

    /* renamed from: e */
    public static final C8515c m17064e(String str) {
        Class<C8512c> cls = C8512c.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            C12775o.m28639i(str, "applicationId");
            return f12125c.m17063d(C8513a.MOBILE_APP_INSTALL, str, C12726w.m28524k());
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }
}
