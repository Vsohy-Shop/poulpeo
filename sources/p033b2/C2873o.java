package p033b2;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p198q2.C9114a;
import p251v2.C9925a;

/* renamed from: b2.o */
/* compiled from: SessionEventsState.kt */
public final class C2873o {

    /* renamed from: f */
    private static final String f1258f;

    /* renamed from: g */
    private static final int f1259g = 1000;

    /* renamed from: h */
    public static final C2874a f1260h = new C2874a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private List<C2834c> f1261a = new ArrayList();

    /* renamed from: b */
    private final List<C2834c> f1262b = new ArrayList();

    /* renamed from: c */
    private int f1263c;

    /* renamed from: d */
    private final C9114a f1264d;

    /* renamed from: e */
    private final String f1265e;

    /* renamed from: b2.o$a */
    /* compiled from: SessionEventsState.kt */
    public static final class C2874a {
        private C2874a() {
        }

        public /* synthetic */ C2874a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String simpleName = C2873o.class.getSimpleName();
        C12775o.m28638h(simpleName, "SessionEventsState::class.java.simpleName");
        f1258f = simpleName;
    }

    public C2873o(C9114a aVar, String str) {
        C12775o.m28639i(aVar, "attributionIdentifiers");
        C12775o.m28639i(str, "anonymousAppDeviceGUID");
        this.f1264d = aVar;
        this.f1265e = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        p251v2.C9925a.m20732b(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r5 = new org.json.JSONObject();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001d */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m2266f(com.facebook.C4555l r4, android.content.Context r5, int r6, org.json.JSONArray r7, boolean r8) {
        /*
            r3 = this;
            boolean r0 = p251v2.C9925a.m20734d(r3)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            i2.c$a r0 = p118i2.C8094c.C8095a.CUSTOM_APP_EVENTS     // Catch:{ JSONException -> 0x001d }
            q2.a r1 = r3.f1264d     // Catch:{ JSONException -> 0x001d }
            java.lang.String r2 = r3.f1265e     // Catch:{ JSONException -> 0x001d }
            org.json.JSONObject r5 = p118i2.C8094c.m15926a(r0, r1, r2, r8, r5)     // Catch:{ JSONException -> 0x001d }
            int r8 = r3.f1263c     // Catch:{ JSONException -> 0x001d }
            if (r8 <= 0) goto L_0x0022
            java.lang.String r8 = "num_skipped_events"
            r5.put(r8, r6)     // Catch:{ JSONException -> 0x001d }
            goto L_0x0022
        L_0x001b:
            r4 = move-exception
            goto L_0x003e
        L_0x001d:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x001b }
            r5.<init>()     // Catch:{ all -> 0x001b }
        L_0x0022:
            r4.mo31615E(r5)     // Catch:{ all -> 0x001b }
            android.os.Bundle r5 = r4.mo31627s()     // Catch:{ all -> 0x001b }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x001b }
            java.lang.String r7 = "events.toString()"
            kotlin.jvm.internal.C12775o.m28638h(r6, r7)     // Catch:{ all -> 0x001b }
            java.lang.String r7 = "custom_events"
            r5.putString(r7, r6)     // Catch:{ all -> 0x001b }
            r4.mo31619I(r6)     // Catch:{ all -> 0x001b }
            r4.mo31617G(r5)     // Catch:{ all -> 0x001b }
            return
        L_0x003e:
            p251v2.C9925a.m20732b(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p033b2.C2873o.m2266f(com.facebook.l, android.content.Context, int, org.json.JSONArray, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo28403a(p033b2.C2834c r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = p251v2.C9925a.m20734d(r2)     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r2)
            return
        L_0x0009:
            java.lang.String r0 = "event"
            kotlin.jvm.internal.C12775o.m28639i(r3, r0)     // Catch:{ all -> 0x002d }
            java.util.List<b2.c> r0 = r2.f1261a     // Catch:{ all -> 0x002d }
            int r0 = r0.size()     // Catch:{ all -> 0x002d }
            java.util.List<b2.c> r1 = r2.f1262b     // Catch:{ all -> 0x002d }
            int r1 = r1.size()     // Catch:{ all -> 0x002d }
            int r0 = r0 + r1
            int r1 = f1259g     // Catch:{ all -> 0x002d }
            if (r0 < r1) goto L_0x0026
            int r3 = r2.f1263c     // Catch:{ all -> 0x002d }
            int r3 = r3 + 1
            r2.f1263c = r3     // Catch:{ all -> 0x002d }
            goto L_0x002b
        L_0x0026:
            java.util.List<b2.c> r0 = r2.f1261a     // Catch:{ all -> 0x002d }
            r0.add(r3)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r2)
            return
        L_0x002d:
            r3 = move-exception
            p251v2.C9925a.m20732b(r3, r2)     // Catch:{ all -> 0x0033 }
            monitor-exit(r2)
            return
        L_0x0033:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p033b2.C2873o.mo28403a(b2.c):void");
    }

    /* renamed from: b */
    public final synchronized void mo28404b(boolean z) {
        if (!C9925a.m20734d(this)) {
            if (z) {
                try {
                    this.f1261a.addAll(this.f1262b);
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                    return;
                }
            }
            this.f1262b.clear();
            this.f1263c = 0;
        }
    }

    /* renamed from: c */
    public final synchronized int mo28405c() {
        if (C9925a.m20734d(this)) {
            return 0;
        }
        try {
            return this.f1261a.size();
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return 0;
        }
    }

    /* renamed from: d */
    public final synchronized List<C2834c> mo28406d() {
        if (C9925a.m20734d(this)) {
            return null;
        }
        try {
            List<C2834c> list = this.f1261a;
            this.f1261a = new ArrayList();
            return list;
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0087, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0088, code lost:
        p251v2.C9925a.m20732b(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008b, code lost:
        return 0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo28407e(com.facebook.C4555l r9, android.content.Context r10, boolean r11, boolean r12) {
        /*
            r8 = this;
            boolean r0 = p251v2.C9925a.m20734d(r8)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.String r0 = "request"
            kotlin.jvm.internal.C12775o.m28639i(r9, r0)     // Catch:{ all -> 0x0087 }
            java.lang.String r0 = "applicationContext"
            kotlin.jvm.internal.C12775o.m28639i(r10, r0)     // Catch:{ all -> 0x0087 }
            monitor-enter(r8)     // Catch:{ all -> 0x0087 }
            int r5 = r8.f1263c     // Catch:{ all -> 0x0084 }
            java.util.List<b2.c> r0 = r8.f1261a     // Catch:{ all -> 0x0084 }
            p083f2.C7568a.m14893d(r0)     // Catch:{ all -> 0x0084 }
            java.util.List<b2.c> r0 = r8.f1262b     // Catch:{ all -> 0x0084 }
            java.util.List<b2.c> r2 = r8.f1261a     // Catch:{ all -> 0x0084 }
            java.util.Collection r2 = (java.util.Collection) r2     // Catch:{ all -> 0x0084 }
            r0.addAll(r2)     // Catch:{ all -> 0x0084 }
            java.util.List<b2.c> r0 = r8.f1261a     // Catch:{ all -> 0x0084 }
            r0.clear()     // Catch:{ all -> 0x0084 }
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ all -> 0x0084 }
            r0.<init>()     // Catch:{ all -> 0x0084 }
            java.util.List<b2.c> r2 = r8.f1262b     // Catch:{ all -> 0x0084 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0084 }
        L_0x0033:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0084 }
            if (r3 == 0) goto L_0x006c
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0084 }
            b2.c r3 = (p033b2.C2834c) r3     // Catch:{ all -> 0x0084 }
            boolean r4 = r3.mo28334g()     // Catch:{ all -> 0x0084 }
            if (r4 == 0) goto L_0x0055
            if (r11 != 0) goto L_0x004d
            boolean r4 = r3.mo28335h()     // Catch:{ all -> 0x0084 }
            if (r4 != 0) goto L_0x0033
        L_0x004d:
            org.json.JSONObject r3 = r3.mo28332e()     // Catch:{ all -> 0x0084 }
            r0.put(r3)     // Catch:{ all -> 0x0084 }
            goto L_0x0033
        L_0x0055:
            java.lang.String r4 = f1258f     // Catch:{ all -> 0x0084 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0084 }
            r6.<init>()     // Catch:{ all -> 0x0084 }
            java.lang.String r7 = "Event with invalid checksum: "
            r6.append(r7)     // Catch:{ all -> 0x0084 }
            r6.append(r3)     // Catch:{ all -> 0x0084 }
            java.lang.String r3 = r6.toString()     // Catch:{ all -> 0x0084 }
            p198q2.C9138d0.m18626a0(r4, r3)     // Catch:{ all -> 0x0084 }
            goto L_0x0033
        L_0x006c:
            int r11 = r0.length()     // Catch:{ all -> 0x0084 }
            if (r11 != 0) goto L_0x0074
            monitor-exit(r8)     // Catch:{ all -> 0x0087 }
            return r1
        L_0x0074:
            ef.v r11 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x0084 }
            monitor-exit(r8)     // Catch:{ all -> 0x0087 }
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r0
            r7 = r12
            r2.m2266f(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0087 }
            int r9 = r0.length()     // Catch:{ all -> 0x0087 }
            return r9
        L_0x0084:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0087 }
            throw r9     // Catch:{ all -> 0x0087 }
        L_0x0087:
            r9 = move-exception
            p251v2.C9925a.m20732b(r9, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p033b2.C2873o.mo28407e(com.facebook.l, android.content.Context, boolean, boolean):int");
    }
}
