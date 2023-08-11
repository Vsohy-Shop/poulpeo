package com.google.firebase.messaging;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.firebase.C6911a;
import com.google.firebase.C6922c;
import com.google.firebase.messaging.C7026z0;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p113h8.C8030b;
import p119i3.C8114g;
import p124i8.C8213d;
import p193p7.C9071a;
import p193p7.C9072b;
import p193p7.C9074d;
import p203q7.C9322f;
import p213r7.C9392a;
import p214r8.C9403i;
import p231t4.C9713p;
import p276x5.C10406g;
import p276x5.C10410i;
import p297z4.C10822b;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
public class FirebaseMessaging {
    @NonNull
    @Deprecated
    public static final String INSTANCE_ID_SCOPE = "FCM";
    private static final long MAX_DELAY_SEC = TimeUnit.HOURS.toSeconds(8);
    private static C7026z0 store;
    @VisibleForTesting
    static ScheduledExecutorService syncExecutor;
    @VisibleForTesting
    @Nullable
    static C8114g transportFactory;
    private final C6953a autoInit;
    private final Context context;
    private final Executor fileIoExecutor;
    /* access modifiers changed from: private */
    public final C6922c firebaseApp;
    private final C8213d fis;
    private final C6973f0 gmsRpc;
    @Nullable
    private final C9392a iid;
    private final Application.ActivityLifecycleCallbacks lifecycleCallbacks;
    private final C6991k0 metadata;
    private final C7017v0 requestDeduplicator;
    private boolean syncScheduledOrRunning;
    private final Executor taskExecutor;
    private final Task<C6971e1> topicsSubscriberTask;

    /* renamed from: com.google.firebase.messaging.FirebaseMessaging$a */
    /* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
    private class C6953a {

        /* renamed from: a */
        private final C9074d f9227a;

        /* renamed from: b */
        private boolean f9228b;
        @Nullable

        /* renamed from: c */
        private C9072b<C6911a> f9229c;
        @Nullable

        /* renamed from: d */
        private Boolean f9230d;

        C6953a(C9074d dVar) {
            this.f9227a = dVar;
        }

        @Nullable
        /* renamed from: d */
        private Boolean m12182d() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context h = FirebaseMessaging.this.firebaseApp.mo39766h();
            SharedPreferences sharedPreferences = h.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = h.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(h.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized void mo39871a() {
            if (!this.f9228b) {
                Boolean d = m12182d();
                this.f9230d = d;
                if (d == null) {
                    C6961b0 b0Var = new C6961b0(this);
                    this.f9229c = b0Var;
                    this.f9227a.mo43285c(C6911a.class, b0Var);
                }
                this.f9228b = true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public synchronized boolean mo39872b() {
            boolean z;
            mo39871a();
            Boolean bool = this.f9230d;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = FirebaseMessaging.this.firebaseApp.mo39771q();
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public /* synthetic */ void mo39873c(C9071a aVar) {
            if (mo39872b()) {
                FirebaseMessaging.this.startSyncIfNecessary();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public synchronized void mo39874e(boolean z) {
            mo39871a();
            C9072b<C6911a> bVar = this.f9229c;
            if (bVar != null) {
                this.f9227a.mo43284b(C6911a.class, bVar);
                this.f9229c = null;
            }
            SharedPreferences.Editor edit = FirebaseMessaging.this.firebaseApp.mo39766h().getSharedPreferences("com.google.firebase.messaging", 0).edit();
            edit.putBoolean("auto_init", z);
            edit.apply();
            if (z) {
                FirebaseMessaging.this.startSyncIfNecessary();
            }
            this.f9230d = Boolean.valueOf(z);
        }
    }

    FirebaseMessaging(C6922c cVar, @Nullable C9392a aVar, C8030b<C9403i> bVar, C8030b<C9322f> bVar2, C8213d dVar, @Nullable C8114g gVar, C9074d dVar2) {
        this(cVar, aVar, bVar, bVar2, dVar, gVar, dVar2, new C6991k0(cVar.mo39766h()));
    }

    @NonNull
    public static synchronized FirebaseMessaging getInstance() {
        FirebaseMessaging instance;
        synchronized (FirebaseMessaging.class) {
            instance = getInstance(C6922c.m12057i());
        }
        return instance;
    }

    @NonNull
    private static synchronized C7026z0 getStore(Context context2) {
        C7026z0 z0Var;
        synchronized (FirebaseMessaging.class) {
            if (store == null) {
                store = new C7026z0(context2);
            }
            z0Var = store;
        }
        return z0Var;
    }

    private String getSubtype() {
        if ("[DEFAULT]".equals(this.firebaseApp.mo39768j())) {
            return "";
        }
        return this.firebaseApp.mo39770l();
    }

    @Nullable
    public static C8114g getTransportFactory() {
        return transportFactory;
    }

    /* access modifiers changed from: private */
    public void invokeOnTokenRefresh(String str) {
        String str2;
        if ("[DEFAULT]".equals(this.firebaseApp.mo39768j())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String valueOf = String.valueOf(this.firebaseApp.mo39768j());
                if (valueOf.length() != 0) {
                    str2 = "Invoking onNewToken for app: ".concat(valueOf);
                } else {
                    str2 = new String("Invoking onNewToken for app: ");
                }
                Log.d("FirebaseMessaging", str2);
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new C6996m(this.context).mo39963g(intent);
        }
    }

    private synchronized void startSync() {
        if (!this.syncScheduledOrRunning) {
            syncWithDelaySecondsInternal(0);
        }
    }

    /* access modifiers changed from: private */
    public void startSyncIfNecessary() {
        C9392a aVar = this.iid;
        if (aVar != null) {
            aVar.mo43814d();
        } else if (tokenNeedsRefresh(getTokenWithoutTriggeringSync())) {
            startSync();
        }
    }

    /* access modifiers changed from: package-private */
    public String blockingGetToken() {
        C9392a aVar = this.iid;
        if (aVar != null) {
            try {
                return (String) C10410i.m21827a(aVar.mo43813c());
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException(e);
            }
        } else {
            C7026z0.C7027a tokenWithoutTriggeringSync = getTokenWithoutTriggeringSync();
            if (!tokenNeedsRefresh(tokenWithoutTriggeringSync)) {
                return tokenWithoutTriggeringSync.f9383a;
            }
            String c = C6991k0.m12344c(this.firebaseApp);
            try {
                return (String) C10410i.m21827a(this.requestDeduplicator.mo39991a(c, new C7019w(this, c, tokenWithoutTriggeringSync)));
            } catch (InterruptedException | ExecutionException e2) {
                throw new IOException(e2);
            }
        }
    }

    @NonNull
    public Task<Void> deleteToken() {
        if (this.iid != null) {
            C10406g gVar = new C10406g();
            this.fileIoExecutor.execute(new C7025z(this, gVar));
            return gVar.mo45096a();
        } else if (getTokenWithoutTriggeringSync() == null) {
            return C10410i.m21831e(null);
        } else {
            C10406g gVar2 = new C10406g();
            C7000n.m12399c().execute(new C6956a0(this, gVar2));
            return gVar2.mo45096a();
        }
    }

    @NonNull
    public boolean deliveryMetricsExportToBigQueryEnabled() {
        return C6987j0.m12315a();
    }

    /* access modifiers changed from: package-private */
    public void enqueueTaskWithDelaySeconds(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            if (syncExecutor == null) {
                syncExecutor = new ScheduledThreadPoolExecutor(1, new C10822b("TAG"));
            }
            syncExecutor.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    /* access modifiers changed from: package-private */
    public Context getApplicationContext() {
        return this.context;
    }

    @NonNull
    public Task<String> getToken() {
        C9392a aVar = this.iid;
        if (aVar != null) {
            return aVar.mo43813c();
        }
        C10406g gVar = new C10406g();
        this.fileIoExecutor.execute(new C7006q(this, gVar));
        return gVar.mo45096a();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    @Nullable
    public C7026z0.C7027a getTokenWithoutTriggeringSync() {
        return getStore(this.context).mo40008e(getSubtype(), C6991k0.m12344c(this.firebaseApp));
    }

    public boolean isAutoInitEnabled() {
        return this.autoInit.mo39872b();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public boolean isGmsCorePresent() {
        return this.metadata.mo39941g();
    }

    public boolean isNotificationDelegationEnabled() {
        return C7007q0.m12406c(this.context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$blockingGetToken$8$com-google-firebase-messaging-FirebaseMessaging */
    public /* synthetic */ Task mo39854xa7f5779b(String str, C7026z0.C7027a aVar, String str2) {
        getStore(this.context).mo40010g(getSubtype(), str, str2, this.metadata.mo39937a());
        if (aVar == null || !str2.equals(aVar.f9383a)) {
            invokeOnTokenRefresh(str2);
        }
        return C10410i.m21831e(str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$blockingGetToken$9$com-google-firebase-messaging-FirebaseMessaging */
    public /* synthetic */ Task mo39855xa77f119c(String str, C7026z0.C7027a aVar) {
        return this.gmsRpc.mo39914e().mo35466q(C7008r.f9349b, new C7010s(this, str, aVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$deleteToken$4$com-google-firebase-messaging-FirebaseMessaging */
    public /* synthetic */ void mo39856xd74d2373(C10406g gVar) {
        try {
            this.iid.mo43811a(C6991k0.m12344c(this.firebaseApp), INSTANCE_ID_SCOPE);
            gVar.mo45098c(null);
        } catch (Exception e) {
            gVar.mo45097b(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$deleteToken$5$com-google-firebase-messaging-FirebaseMessaging */
    public /* synthetic */ void mo39857xd6d6bd74(C10406g gVar) {
        try {
            C10410i.m21827a(this.gmsRpc.mo39913b());
            getStore(this.context).mo40007d(getSubtype(), C6991k0.m12344c(this.firebaseApp));
            gVar.mo45098c(null);
        } catch (Exception e) {
            gVar.mo45097b(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$getToken$3$com-google-firebase-messaging-FirebaseMessaging */
    public /* synthetic */ void mo39858x6c2cd681(C10406g gVar) {
        try {
            gVar.mo45098c(blockingGetToken());
        } catch (Exception e) {
            gVar.mo45097b(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$new$0$com-google-firebase-messaging-FirebaseMessaging  reason: not valid java name */
    public /* synthetic */ void m38732lambda$new$0$comgooglefirebasemessagingFirebaseMessaging() {
        if (isAutoInitEnabled()) {
            startSyncIfNecessary();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$new$1$com-google-firebase-messaging-FirebaseMessaging  reason: not valid java name */
    public /* synthetic */ void m38733lambda$new$1$comgooglefirebasemessagingFirebaseMessaging(C6971e1 e1Var) {
        if (isAutoInitEnabled()) {
            e1Var.mo39907p();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$new$2$com-google-firebase-messaging-FirebaseMessaging  reason: not valid java name */
    public /* synthetic */ void m38734lambda$new$2$comgooglefirebasemessagingFirebaseMessaging() {
        C7007q0.m12405b(this.context);
    }

    public void send(@NonNull C7011s0 s0Var) {
        if (!TextUtils.isEmpty(s0Var.mo39984F())) {
            Intent intent = new Intent("com.google.android.gcm.intent.SEND");
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            intent.putExtra("app", PendingIntent.getBroadcast(this.context, 0, intent2, 67108864));
            intent.setPackage("com.google.android.gms");
            s0Var.mo39985G(intent);
            this.context.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
            return;
        }
        throw new IllegalArgumentException("Missing 'to'");
    }

    public void setAutoInitEnabled(boolean z) {
        this.autoInit.mo39874e(z);
    }

    public void setDeliveryMetricsExportToBigQuery(boolean z) {
        C6987j0.m12339y(z);
    }

    @NonNull
    public Task<Void> setNotificationDelegationEnabled(boolean z) {
        return C7007q0.m12408e(this.fileIoExecutor, this.context, z);
    }

    /* access modifiers changed from: package-private */
    public synchronized void setSyncScheduledOrRunning(boolean z) {
        this.syncScheduledOrRunning = z;
    }

    @NonNull
    public Task<Void> subscribeToTopic(@NonNull String str) {
        return this.topicsSubscriberTask.mo35467r(new C7012t(str));
    }

    /* access modifiers changed from: package-private */
    public synchronized void syncWithDelaySecondsInternal(long j) {
        enqueueTaskWithDelaySeconds(new C6957a1(this, Math.min(Math.max(30, j + j), MAX_DELAY_SEC)), j);
        this.syncScheduledOrRunning = true;
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public boolean tokenNeedsRefresh(@Nullable C7026z0.C7027a aVar) {
        if (aVar == null || aVar.mo40011b(this.metadata.mo39937a())) {
            return true;
        }
        return false;
    }

    @NonNull
    public Task<Void> unsubscribeFromTopic(@NonNull String str) {
        return this.topicsSubscriberTask.mo35467r(new C7014u(str));
    }

    @NonNull
    @Keep
    static synchronized FirebaseMessaging getInstance(@NonNull C6922c cVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) cVar.mo39765g(FirebaseMessaging.class);
            C9713p.m20276k(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    FirebaseMessaging(com.google.firebase.C6922c r11, @androidx.annotation.Nullable p213r7.C9392a r12, p113h8.C8030b<p214r8.C9403i> r13, p113h8.C8030b<p203q7.C9322f> r14, p124i8.C8213d r15, @androidx.annotation.Nullable p119i3.C8114g r16, p193p7.C9074d r17, com.google.firebase.messaging.C6991k0 r18) {
        /*
            r10 = this;
            com.google.firebase.messaging.f0 r7 = new com.google.firebase.messaging.f0
            r0 = r7
            r1 = r11
            r2 = r18
            r3 = r13
            r4 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.concurrent.ExecutorService r8 = com.google.firebase.messaging.C7000n.m12400d()
            java.util.concurrent.ScheduledExecutorService r9 = com.google.firebase.messaging.C7000n.m12397a()
            r0 = r10
            r2 = r12
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessaging.<init>(com.google.firebase.c, r7.a, h8.b, h8.b, i8.d, i3.g, p7.d, com.google.firebase.messaging.k0):void");
    }

    FirebaseMessaging(C6922c cVar, @Nullable C9392a aVar, C8213d dVar, @Nullable C8114g gVar, C9074d dVar2, C6991k0 k0Var, C6973f0 f0Var, Executor executor, Executor executor2) {
        this.syncScheduledOrRunning = false;
        transportFactory = gVar;
        this.firebaseApp = cVar;
        this.iid = aVar;
        this.fis = dVar;
        this.autoInit = new C6953a(dVar2);
        Context h = cVar.mo39766h();
        this.context = h;
        C7002o oVar = new C7002o();
        this.lifecycleCallbacks = oVar;
        this.metadata = k0Var;
        this.taskExecutor = executor;
        this.gmsRpc = f0Var;
        this.requestDeduplicator = new C7017v0(executor);
        this.fileIoExecutor = executor2;
        Context h2 = cVar.mo39766h();
        if (h2 instanceof Application) {
            ((Application) h2).registerActivityLifecycleCallbacks(oVar);
        } else {
            String valueOf = String.valueOf(h2);
            StringBuilder sb = new StringBuilder(valueOf.length() + 125);
            sb.append("Context ");
            sb.append(valueOf);
            sb.append(" was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
            Log.w("FirebaseMessaging", sb.toString());
        }
        if (aVar != null) {
            aVar.mo43812b(new C7016v(this));
        }
        executor2.execute(new C7021x(this));
        Task<C6971e1> e = C6971e1.m12249e(this, k0Var, f0Var, h, C7000n.m12401e());
        this.topicsSubscriberTask = e;
        e.mo35455f(executor2, new C7004p(this));
        executor2.execute(new C7023y(this));
    }
}
