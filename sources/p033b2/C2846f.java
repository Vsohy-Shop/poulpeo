package p033b2;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p033b2.C2828a;
import p033b2.C2834c;
import p118i2.C8093b;
import p251v2.C9925a;

/* renamed from: b2.f */
/* compiled from: AppEventStore.kt */
public final class C2846f {

    /* renamed from: a */
    private static final String f1210a;

    /* renamed from: b */
    public static final C2846f f1211b = new C2846f();

    /* renamed from: b2.f$a */
    /* compiled from: AppEventStore.kt */
    private static final class C2847a extends ObjectInputStream {

        /* renamed from: b */
        public static final C2848a f1212b = new C2848a((DefaultConstructorMarker) null);

        /* renamed from: b2.f$a$a */
        /* compiled from: AppEventStore.kt */
        public static final class C2848a {
            private C2848a() {
            }

            public /* synthetic */ C2848a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C2847a(InputStream inputStream) {
            super(inputStream);
        }

        /* access modifiers changed from: protected */
        public ObjectStreamClass readClassDescriptor() {
            ObjectStreamClass readClassDescriptor = super.readClassDescriptor();
            C12775o.m28638h(readClassDescriptor, "resultClassDescriptor");
            if (C12775o.m28634d(readClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                readClassDescriptor = ObjectStreamClass.lookup(C2828a.C2830b.class);
            } else if (C12775o.m28634d(readClassDescriptor.getName(), "com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV2")) {
                readClassDescriptor = ObjectStreamClass.lookup(C2834c.C2836b.class);
            }
            C12775o.m28638h(readClassDescriptor, "resultClassDescriptor");
            return readClassDescriptor;
        }
    }

    static {
        String name = C2846f.class.getName();
        C12775o.m28638h(name, "AppEventStore::class.java.name");
        f1210a = name;
    }

    private C2846f() {
    }

    /* renamed from: a */
    public static final synchronized void m2188a(C2828a aVar, C2873o oVar) {
        synchronized (C2846f.class) {
            if (!C9925a.m20734d(C2846f.class)) {
                try {
                    C12775o.m28639i(aVar, "accessTokenAppIdPair");
                    C12775o.m28639i(oVar, "appEvents");
                    C8093b.m15920b();
                    C2869n c = m2190c();
                    c.mo28400a(aVar, oVar.mo28406d());
                    m2191d(c);
                } catch (Throwable th) {
                    C9925a.m20732b(th, C2846f.class);
                }
            }
        }
    }

    /* renamed from: b */
    public static final synchronized void m2189b(C2838d dVar) {
        synchronized (C2846f.class) {
            if (!C9925a.m20734d(C2846f.class)) {
                try {
                    C12775o.m28639i(dVar, "eventsToPersist");
                    C8093b.m15920b();
                    C2869n c = m2190c();
                    for (C2828a next : dVar.mo28341f()) {
                        C2873o c2 = dVar.mo28339c(next);
                        if (c2 != null) {
                            c.mo28400a(next, c2.mo28406d());
                        } else {
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                    }
                    m2191d(c);
                } catch (Throwable th) {
                    C9925a.m20732b(th, C2846f.class);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x00a2 A[Catch:{ Exception -> 0x003f, all -> 0x00a9 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized p033b2.C2869n m2190c() {
        /*
            java.lang.Class<b2.f> r0 = p033b2.C2846f.class
            monitor-enter(r0)
            java.lang.Class<b2.f> r1 = p033b2.C2846f.class
            boolean r1 = p251v2.C9925a.m20734d(r1)     // Catch:{ all -> 0x00b1 }
            r2 = 0
            if (r1 == 0) goto L_0x000e
            monitor-exit(r0)
            return r2
        L_0x000e:
            p118i2.C8093b.m15920b()     // Catch:{ all -> 0x00a9 }
            android.content.Context r1 = com.facebook.FacebookSdk.getApplicationContext()     // Catch:{ all -> 0x00a9 }
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.FileInputStream r3 = r1.openFileInput(r3)     // Catch:{ FileNotFoundException -> 0x008b, Exception -> 0x0055, all -> 0x0052 }
            java.lang.String r4 = "context.openFileInput(PERSISTED_EVENTS_FILENAME)"
            kotlin.jvm.internal.C12775o.m28638h(r3, r4)     // Catch:{ FileNotFoundException -> 0x008b, Exception -> 0x0055, all -> 0x0052 }
            b2.f$a r4 = new b2.f$a     // Catch:{ FileNotFoundException -> 0x008b, Exception -> 0x0055, all -> 0x0052 }
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x008b, Exception -> 0x0055, all -> 0x0052 }
            r5.<init>(r3)     // Catch:{ FileNotFoundException -> 0x008b, Exception -> 0x0055, all -> 0x0052 }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x008b, Exception -> 0x0055, all -> 0x0052 }
            java.lang.Object r3 = r4.readObject()     // Catch:{ FileNotFoundException -> 0x008c, Exception -> 0x0050 }
            if (r3 == 0) goto L_0x0048
            b2.n r3 = (p033b2.C2869n) r3     // Catch:{ FileNotFoundException -> 0x008c, Exception -> 0x0050 }
            p198q2.C9138d0.m18637g(r4)     // Catch:{ all -> 0x00a9 }
            java.lang.String r4 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r4)     // Catch:{ Exception -> 0x003f }
            r1.delete()     // Catch:{ Exception -> 0x003f }
            goto L_0x00a0
        L_0x003f:
            r1 = move-exception
            java.lang.String r4 = f1210a     // Catch:{ all -> 0x00a9 }
            java.lang.String r5 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r4, r5, r1)     // Catch:{ all -> 0x00a9 }
            goto L_0x00a0
        L_0x0048:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch:{ FileNotFoundException -> 0x008c, Exception -> 0x0050 }
            java.lang.String r5 = "null cannot be cast to non-null type com.facebook.appevents.PersistedEvents"
            r3.<init>(r5)     // Catch:{ FileNotFoundException -> 0x008c, Exception -> 0x0050 }
            throw r3     // Catch:{ FileNotFoundException -> 0x008c, Exception -> 0x0050 }
        L_0x0050:
            r3 = move-exception
            goto L_0x0057
        L_0x0052:
            r3 = move-exception
            r4 = r2
            goto L_0x0075
        L_0x0055:
            r3 = move-exception
            r4 = r2
        L_0x0057:
            java.lang.String r5 = f1210a     // Catch:{ all -> 0x0074 }
            java.lang.String r6 = "Got unexpected exception while reading events: "
            android.util.Log.w(r5, r6, r3)     // Catch:{ all -> 0x0074 }
            p198q2.C9138d0.m18637g(r4)     // Catch:{ all -> 0x00a9 }
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch:{ Exception -> 0x006b }
            r1.delete()     // Catch:{ Exception -> 0x006b }
            goto L_0x009f
        L_0x006b:
            r1 = move-exception
            java.lang.String r3 = f1210a     // Catch:{ all -> 0x00a9 }
            java.lang.String r4 = "Got unexpected exception when removing events file: "
        L_0x0070:
            android.util.Log.w(r3, r4, r1)     // Catch:{ all -> 0x00a9 }
            goto L_0x009f
        L_0x0074:
            r3 = move-exception
        L_0x0075:
            p198q2.C9138d0.m18637g(r4)     // Catch:{ all -> 0x00a9 }
            java.lang.String r4 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r4)     // Catch:{ Exception -> 0x0082 }
            r1.delete()     // Catch:{ Exception -> 0x0082 }
            goto L_0x008a
        L_0x0082:
            r1 = move-exception
            java.lang.String r4 = f1210a     // Catch:{ all -> 0x00a9 }
            java.lang.String r5 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r4, r5, r1)     // Catch:{ all -> 0x00a9 }
        L_0x008a:
            throw r3     // Catch:{ all -> 0x00a9 }
        L_0x008b:
            r4 = r2
        L_0x008c:
            p198q2.C9138d0.m18637g(r4)     // Catch:{ all -> 0x00a9 }
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch:{ Exception -> 0x0099 }
            r1.delete()     // Catch:{ Exception -> 0x0099 }
            goto L_0x009f
        L_0x0099:
            r1 = move-exception
            java.lang.String r3 = f1210a     // Catch:{ all -> 0x00a9 }
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            goto L_0x0070
        L_0x009f:
            r3 = r2
        L_0x00a0:
            if (r3 != 0) goto L_0x00a7
            b2.n r3 = new b2.n     // Catch:{ all -> 0x00a9 }
            r3.<init>()     // Catch:{ all -> 0x00a9 }
        L_0x00a7:
            monitor-exit(r0)
            return r3
        L_0x00a9:
            r1 = move-exception
            java.lang.Class<b2.f> r3 = p033b2.C2846f.class
            p251v2.C9925a.m20732b(r1, r3)     // Catch:{ all -> 0x00b1 }
            monitor-exit(r0)
            return r2
        L_0x00b1:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p033b2.C2846f.m2190c():b2.n");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0038 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2191d(p033b2.C2869n r7) {
        /*
            java.lang.String r0 = "AppEventsLogger.persistedevents"
            java.lang.Class<b2.f> r1 = p033b2.C2846f.class
            boolean r2 = p251v2.C9925a.m20734d(r1)
            if (r2 == 0) goto L_0x000b
            return
        L_0x000b:
            android.content.Context r2 = com.facebook.FacebookSdk.getApplicationContext()     // Catch:{ all -> 0x0041 }
            r3 = 0
            java.io.ObjectOutputStream r4 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0029 }
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0029 }
            r6 = 0
            java.io.FileOutputStream r6 = r2.openFileOutput(r0, r6)     // Catch:{ all -> 0x0029 }
            r5.<init>(r6)     // Catch:{ all -> 0x0029 }
            r4.<init>(r5)     // Catch:{ all -> 0x0029 }
            r4.writeObject(r7)     // Catch:{ all -> 0x0026 }
            p198q2.C9138d0.m18637g(r4)     // Catch:{ all -> 0x0041 }
            goto L_0x003b
        L_0x0026:
            r7 = move-exception
            r3 = r4
            goto L_0x002a
        L_0x0029:
            r7 = move-exception
        L_0x002a:
            java.lang.String r4 = f1210a     // Catch:{ all -> 0x003c }
            java.lang.String r5 = "Got unexpected exception while persisting events: "
            android.util.Log.w(r4, r5, r7)     // Catch:{ all -> 0x003c }
            java.io.File r7 = r2.getFileStreamPath(r0)     // Catch:{ Exception -> 0x0038 }
            r7.delete()     // Catch:{ Exception -> 0x0038 }
        L_0x0038:
            p198q2.C9138d0.m18637g(r3)     // Catch:{ all -> 0x0041 }
        L_0x003b:
            return
        L_0x003c:
            r7 = move-exception
            p198q2.C9138d0.m18637g(r3)     // Catch:{ all -> 0x0041 }
            throw r7     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r7 = move-exception
            p251v2.C9925a.m20732b(r7, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p033b2.C2846f.m2191d(b2.n):void");
    }
}
