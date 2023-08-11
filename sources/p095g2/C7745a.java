package p095g2;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.facebook.FacebookSdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C12775o;
import org.json.JSONException;
import org.json.JSONObject;
import p118i2.C8096d;
import p251v2.C9925a;

/* renamed from: g2.a */
/* compiled from: InAppPurchaseActivityLifecycleTracker.kt */
public final class C7745a {

    /* renamed from: a */
    private static final String f10720a = C7745a.class.getCanonicalName();

    /* renamed from: b */
    private static final AtomicBoolean f10721b = new AtomicBoolean(false);

    /* renamed from: c */
    private static Boolean f10722c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static Boolean f10723d;

    /* renamed from: e */
    private static ServiceConnection f10724e;

    /* renamed from: f */
    private static Application.ActivityLifecycleCallbacks f10725f;

    /* renamed from: g */
    private static Intent f10726g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static Object f10727h;

    /* renamed from: i */
    public static final C7745a f10728i = new C7745a();

    /* renamed from: g2.a$a */
    /* compiled from: InAppPurchaseActivityLifecycleTracker.kt */
    public static final class C7746a implements ServiceConnection {
        C7746a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C12775o.m28639i(componentName, HintConstants.AUTOFILL_HINT_NAME);
            C12775o.m28639i(iBinder, NotificationCompat.CATEGORY_SERVICE);
            C7745a.f10727h = C7760d.m15106a(FacebookSdk.getApplicationContext(), iBinder);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C12775o.m28639i(componentName, HintConstants.AUTOFILL_HINT_NAME);
        }
    }

    /* renamed from: g2.a$b */
    /* compiled from: InAppPurchaseActivityLifecycleTracker.kt */
    public static final class C7747b implements Application.ActivityLifecycleCallbacks {

        /* renamed from: g2.a$b$a */
        /* compiled from: InAppPurchaseActivityLifecycleTracker.kt */
        static final class C7748a implements Runnable {

            /* renamed from: b */
            public static final C7748a f10729b = new C7748a();

            C7748a() {
            }

            public final void run() {
                if (!C9925a.m20734d(this)) {
                    try {
                        if (!C9925a.m20734d(this)) {
                            Context applicationContext = FacebookSdk.getApplicationContext();
                            C7745a aVar = C7745a.f10728i;
                            aVar.m15073f(applicationContext, C7760d.m15114i(applicationContext, C7745a.f10727h), false);
                            aVar.m15073f(applicationContext, C7760d.m15115j(applicationContext, C7745a.f10727h), true);
                        }
                    } catch (Throwable th) {
                        C9925a.m20732b(th, this);
                    }
                }
            }
        }

        /* renamed from: g2.a$b$b */
        /* compiled from: InAppPurchaseActivityLifecycleTracker.kt */
        static final class C7749b implements Runnable {

            /* renamed from: b */
            public static final C7749b f10730b = new C7749b();

            C7749b() {
            }

            public final void run() {
                if (!C9925a.m20734d(this)) {
                    try {
                        if (!C9925a.m20734d(this)) {
                            Context applicationContext = FacebookSdk.getApplicationContext();
                            C7745a aVar = C7745a.f10728i;
                            ArrayList<String> i = C7760d.m15114i(applicationContext, C7745a.f10727h);
                            if (i.isEmpty()) {
                                i = C7760d.m15112g(applicationContext, C7745a.f10727h);
                            }
                            aVar.m15073f(applicationContext, i, false);
                        }
                    } catch (Throwable th) {
                        C9925a.m20732b(th, this);
                    }
                }
            }
        }

        C7747b() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            C12775o.m28639i(activity, "activity");
        }

        public void onActivityDestroyed(Activity activity) {
            C12775o.m28639i(activity, "activity");
        }

        public void onActivityPaused(Activity activity) {
            C12775o.m28639i(activity, "activity");
        }

        public void onActivityResumed(Activity activity) {
            C12775o.m28639i(activity, "activity");
            try {
                FacebookSdk.getExecutor().execute(C7748a.f10729b);
            } catch (Exception unused) {
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C12775o.m28639i(activity, "activity");
            C12775o.m28639i(bundle, "outState");
        }

        public void onActivityStarted(Activity activity) {
            C12775o.m28639i(activity, "activity");
        }

        public void onActivityStopped(Activity activity) {
            C12775o.m28639i(activity, "activity");
            try {
                if (C12775o.m28634d(C7745a.f10723d, Boolean.TRUE) && C12775o.m28634d(activity.getLocalClassName(), "com.android.billingclient.api.ProxyBillingActivity")) {
                    FacebookSdk.getExecutor().execute(C7749b.f10730b);
                }
            } catch (Exception unused) {
            }
        }
    }

    private C7745a() {
    }

    /* renamed from: e */
    private final void m15072e() {
        boolean z;
        if (f10722c == null) {
            boolean z2 = true;
            if (C7765h.m15140a("com.android.vending.billing.IInAppBillingService$Stub") != null) {
                z = true;
            } else {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            f10722c = valueOf;
            if (!C12775o.m28634d(valueOf, Boolean.FALSE)) {
                if (C7765h.m15140a("com.android.billingclient.api.ProxyBillingActivity") == null) {
                    z2 = false;
                }
                f10723d = Boolean.valueOf(z2);
                C7760d.m15107b();
                Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
                C12775o.m28638h(intent, "Intent(\"com.android.vend…ge(\"com.android.vending\")");
                f10726g = intent;
                f10724e = new C7746a();
                f10725f = new C7747b();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m15073f(Context context, ArrayList<String> arrayList, boolean z) {
        if (!arrayList.isEmpty()) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList2 = new ArrayList();
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                try {
                    String string = new JSONObject(next).getString("productId");
                    C12775o.m28638h(string, "sku");
                    C12775o.m28638h(next, "purchase");
                    hashMap.put(string, next);
                    arrayList2.add(string);
                } catch (JSONException e) {
                    Log.e(f10720a, "Error parsing in-app purchase data.", e);
                }
            }
            for (Map.Entry next2 : C7760d.m15116k(context, arrayList2, f10727h, z).entrySet()) {
                String str = (String) next2.getValue();
                String str2 = (String) hashMap.get((String) next2.getKey());
                if (str2 != null) {
                    C12775o.m28638h(str2, "it");
                    C8096d.m15932f(str2, str, z);
                }
            }
        }
    }

    /* renamed from: g */
    public static final void m15074g() {
        C7745a aVar = f10728i;
        aVar.m15072e();
        if (!C12775o.m28634d(f10722c, Boolean.FALSE) && C8096d.m15929c()) {
            aVar.m15075h();
        }
    }

    /* renamed from: h */
    private final void m15075h() {
        if (f10721b.compareAndSet(false, true)) {
            Context applicationContext = FacebookSdk.getApplicationContext();
            if (applicationContext instanceof Application) {
                Application application = (Application) applicationContext;
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = f10725f;
                if (activityLifecycleCallbacks == null) {
                    C12775o.m28656z("callbacks");
                }
                application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
                Intent intent = f10726g;
                if (intent == null) {
                    C12775o.m28656z("intent");
                }
                ServiceConnection serviceConnection = f10724e;
                if (serviceConnection == null) {
                    C12775o.m28656z("serviceConnection");
                }
                applicationContext.bindService(intent, serviceConnection, 1);
            }
        }
    }
}
