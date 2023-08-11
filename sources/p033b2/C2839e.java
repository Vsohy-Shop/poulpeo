package p033b2;

import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import com.adjust.sdk.Constants;
import com.facebook.C4509a;
import com.facebook.C4550k;
import com.facebook.C4555l;
import com.facebook.C4574o;
import com.facebook.C4579r;
import com.facebook.FacebookSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C12770k0;
import kotlin.jvm.internal.C12775o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p033b2.C2849g;
import p198q2.C9177p;
import p198q2.C9181q;
import p198q2.C9194v;
import p251v2.C9925a;

/* renamed from: b2.e */
/* compiled from: AppEventQueue.kt */
public final class C2839e {

    /* renamed from: a */
    private static final String f1192a;

    /* renamed from: b */
    private static final int f1193b = 100;

    /* renamed from: c */
    private static volatile C2838d f1194c = new C2838d();

    /* renamed from: d */
    private static final ScheduledExecutorService f1195d = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: e */
    private static ScheduledFuture<?> f1196e;

    /* renamed from: f */
    private static final Runnable f1197f = C2843d.f1206b;

    /* renamed from: g */
    public static final C2839e f1198g = new C2839e();

    /* renamed from: b2.e$a */
    /* compiled from: AppEventQueue.kt */
    static final class C2840a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C2828a f1199b;

        /* renamed from: c */
        final /* synthetic */ C2834c f1200c;

        C2840a(C2828a aVar, C2834c cVar) {
            this.f1199b = aVar;
            this.f1200c = cVar;
        }

        public final void run() {
            if (!C9925a.m20734d(this)) {
                try {
                    if (!C9925a.m20734d(this)) {
                        C2839e eVar = C2839e.f1198g;
                        C2839e.m2172a(eVar).mo28337a(this.f1199b, this.f1200c);
                        if (C2849g.f1214c.mo28352c() != C2849g.C2851b.EXPLICIT_ONLY && C2839e.m2172a(eVar).mo28340d() > C2839e.m2174c(eVar)) {
                            C2839e.m2183l(C2864j.EVENT_THRESHOLD);
                        } else if (C2839e.m2175d(eVar) == null) {
                            C2839e.m2178g(eVar, C2839e.m2176e(eVar).schedule(C2839e.m2173b(eVar), (long) 15, TimeUnit.SECONDS));
                        }
                    }
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    /* renamed from: b2.e$b */
    /* compiled from: AppEventQueue.kt */
    static final class C2841b implements C4555l.C4557b {

        /* renamed from: a */
        final /* synthetic */ C2828a f1201a;

        /* renamed from: b */
        final /* synthetic */ C4555l f1202b;

        /* renamed from: c */
        final /* synthetic */ C2873o f1203c;

        /* renamed from: d */
        final /* synthetic */ C2866l f1204d;

        C2841b(C2828a aVar, C4555l lVar, C2873o oVar, C2866l lVar2) {
            this.f1201a = aVar;
            this.f1202b = lVar;
            this.f1203c = oVar;
            this.f1204d = lVar2;
        }

        public final void onCompleted(C4574o oVar) {
            C12775o.m28639i(oVar, "response");
            C2839e.m2185n(this.f1201a, this.f1202b, oVar, this.f1203c, this.f1204d);
        }
    }

    /* renamed from: b2.e$c */
    /* compiled from: AppEventQueue.kt */
    static final class C2842c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C2864j f1205b;

        C2842c(C2864j jVar) {
            this.f1205b = jVar;
        }

        public final void run() {
            if (!C9925a.m20734d(this)) {
                try {
                    if (!C9925a.m20734d(this)) {
                        C2839e.m2183l(this.f1205b);
                    }
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    /* renamed from: b2.e$d */
    /* compiled from: AppEventQueue.kt */
    static final class C2843d implements Runnable {

        /* renamed from: b */
        public static final C2843d f1206b = new C2843d();

        C2843d() {
        }

        public final void run() {
            if (!C9925a.m20734d(this)) {
                try {
                    if (!C9925a.m20734d(this)) {
                        C2839e.m2178g(C2839e.f1198g, (ScheduledFuture) null);
                        if (C2849g.f1214c.mo28352c() != C2849g.C2851b.EXPLICIT_ONLY) {
                            C2839e.m2183l(C2864j.TIMER);
                        }
                    }
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    /* renamed from: b2.e$e */
    /* compiled from: AppEventQueue.kt */
    static final class C2844e implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C2828a f1207b;

        /* renamed from: c */
        final /* synthetic */ C2873o f1208c;

        C2844e(C2828a aVar, C2873o oVar) {
            this.f1207b = aVar;
            this.f1208c = oVar;
        }

        public final void run() {
            if (!C9925a.m20734d(this)) {
                try {
                    if (!C9925a.m20734d(this)) {
                        C2846f.m2188a(this.f1207b, this.f1208c);
                    }
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    /* renamed from: b2.e$f */
    /* compiled from: AppEventQueue.kt */
    static final class C2845f implements Runnable {

        /* renamed from: b */
        public static final C2845f f1209b = new C2845f();

        C2845f() {
        }

        public final void run() {
            if (!C9925a.m20734d(this)) {
                try {
                    if (!C9925a.m20734d(this)) {
                        C2839e eVar = C2839e.f1198g;
                        C2846f.m2189b(C2839e.m2172a(eVar));
                        C2839e.m2177f(eVar, new C2838d());
                    }
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    static {
        String name = C2839e.class.getName();
        C12775o.m28638h(name, "AppEventQueue::class.java.name");
        f1192a = name;
    }

    private C2839e() {
    }

    /* renamed from: a */
    public static final /* synthetic */ C2838d m2172a(C2839e eVar) {
        Class<C2839e> cls = C2839e.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return f1194c;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ Runnable m2173b(C2839e eVar) {
        Class<C2839e> cls = C2839e.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return f1197f;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ int m2174c(C2839e eVar) {
        Class<C2839e> cls = C2839e.class;
        if (C9925a.m20734d(cls)) {
            return 0;
        }
        try {
            return f1193b;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return 0;
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ ScheduledFuture m2175d(C2839e eVar) {
        Class<C2839e> cls = C2839e.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return f1196e;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: e */
    public static final /* synthetic */ ScheduledExecutorService m2176e(C2839e eVar) {
        Class<C2839e> cls = C2839e.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return f1195d;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: f */
    public static final /* synthetic */ void m2177f(C2839e eVar, C2838d dVar) {
        Class<C2839e> cls = C2839e.class;
        if (!C9925a.m20734d(cls)) {
            try {
                f1194c = dVar;
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: g */
    public static final /* synthetic */ void m2178g(C2839e eVar, ScheduledFuture scheduledFuture) {
        Class<C2839e> cls = C2839e.class;
        if (!C9925a.m20734d(cls)) {
            try {
                f1196e = scheduledFuture;
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: h */
    public static final void m2179h(C2828a aVar, C2834c cVar) {
        Class<C2839e> cls = C2839e.class;
        if (!C9925a.m20734d(cls)) {
            try {
                C12775o.m28639i(aVar, "accessTokenAppId");
                C12775o.m28639i(cVar, "appEvent");
                f1195d.execute(new C2840a(aVar, cVar));
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: i */
    public static final C4555l m2180i(C2828a aVar, C2873o oVar, boolean z, C2866l lVar) {
        Class<C2839e> cls = C2839e.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            C12775o.m28639i(aVar, "accessTokenAppId");
            C12775o.m28639i(oVar, "appEvents");
            C12775o.m28639i(lVar, "flushState");
            String b = aVar.mo28327b();
            boolean z2 = false;
            C9177p o = C9181q.m18810o(b, false);
            C4555l.C4558c cVar = C4555l.f4241t;
            C12770k0 k0Var = C12770k0.f20423a;
            String format = String.format("%s/activities", Arrays.copyOf(new Object[]{b}, 1));
            C12775o.m28638h(format, "java.lang.String.format(format, *args)");
            C4555l w = cVar.mo31649w((C4509a) null, format, (JSONObject) null, (C4555l.C4557b) null);
            w.mo31614D(true);
            Bundle s = w.mo31627s();
            if (s == null) {
                s = new Bundle();
            }
            s.putString("access_token", aVar.mo28326a());
            String c = C2867m.f1252b.mo28398c();
            if (c != null) {
                s.putString("device_token", c);
            }
            String i = C2852h.f1226j.mo28371i();
            if (i != null) {
                s.putString(Constants.INSTALL_REFERRER, i);
            }
            w.mo31617G(s);
            if (o != null) {
                z2 = o.mo43464l();
            }
            int e = oVar.mo28407e(w, FacebookSdk.getApplicationContext(), z2, z);
            if (e == 0) {
                return null;
            }
            lVar.mo28384c(lVar.mo28382a() + e);
            w.mo31613C(new C2841b(aVar, w, oVar, lVar));
            return w;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: j */
    public static final List<C4555l> m2181j(C2838d dVar, C2866l lVar) {
        Class<C2839e> cls = C2839e.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            C12775o.m28639i(dVar, "appEventCollection");
            C12775o.m28639i(lVar, "flushResults");
            boolean limitEventAndDataUsage = FacebookSdk.getLimitEventAndDataUsage(FacebookSdk.getApplicationContext());
            ArrayList arrayList = new ArrayList();
            for (C2828a next : dVar.mo28341f()) {
                C2873o c = dVar.mo28339c(next);
                if (c != null) {
                    C4555l i = m2180i(next, c, limitEventAndDataUsage, lVar);
                    if (i != null) {
                        arrayList.add(i);
                    }
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
            return arrayList;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: k */
    public static final void m2182k(C2864j jVar) {
        Class<C2839e> cls = C2839e.class;
        if (!C9925a.m20734d(cls)) {
            try {
                C12775o.m28639i(jVar, "reason");
                f1195d.execute(new C2842c(jVar));
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m2183l(p033b2.C2864j r4) {
        /*
            java.lang.Class<b2.e> r0 = p033b2.C2839e.class
            boolean r1 = p251v2.C9925a.m20734d(r0)
            if (r1 == 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.String r1 = "reason"
            kotlin.jvm.internal.C12775o.m28639i(r4, r1)     // Catch:{ all -> 0x004d }
            b2.n r1 = p033b2.C2846f.m2190c()     // Catch:{ all -> 0x004d }
            b2.d r2 = f1194c     // Catch:{ all -> 0x004d }
            r2.mo28338b(r1)     // Catch:{ all -> 0x004d }
            b2.d r1 = f1194c     // Catch:{ Exception -> 0x0044 }
            b2.l r4 = m2187p(r4, r1)     // Catch:{ Exception -> 0x0044 }
            if (r4 == 0) goto L_0x0043
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x004d }
            java.lang.String r2 = "com.facebook.sdk.APP_EVENTS_FLUSHED"
            r1.<init>(r2)     // Catch:{ all -> 0x004d }
            java.lang.String r2 = "com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED"
            int r3 = r4.mo28382a()     // Catch:{ all -> 0x004d }
            r1.putExtra(r2, r3)     // Catch:{ all -> 0x004d }
            java.lang.String r2 = "com.facebook.sdk.APP_EVENTS_FLUSH_RESULT"
            b2.k r4 = r4.mo28383b()     // Catch:{ all -> 0x004d }
            r1.putExtra(r2, r4)     // Catch:{ all -> 0x004d }
            android.content.Context r4 = com.facebook.FacebookSdk.getApplicationContext()     // Catch:{ all -> 0x004d }
            androidx.localbroadcastmanager.content.LocalBroadcastManager r4 = androidx.localbroadcastmanager.content.LocalBroadcastManager.getInstance(r4)     // Catch:{ all -> 0x004d }
            r4.sendBroadcast(r1)     // Catch:{ all -> 0x004d }
        L_0x0043:
            return
        L_0x0044:
            r4 = move-exception
            java.lang.String r1 = f1192a     // Catch:{ all -> 0x004d }
            java.lang.String r2 = "Caught unexpected exception while flushing app events: "
            android.util.Log.w(r1, r2, r4)     // Catch:{ all -> 0x004d }
            return
        L_0x004d:
            r4 = move-exception
            p251v2.C9925a.m20732b(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p033b2.C2839e.m2183l(b2.j):void");
    }

    /* renamed from: m */
    public static final Set<C2828a> m2184m() {
        Class<C2839e> cls = C2839e.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return f1194c.mo28341f();
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: n */
    public static final void m2185n(C2828a aVar, C4555l lVar, C4574o oVar, C2873o oVar2, C2866l lVar2) {
        String str;
        C2828a aVar2 = aVar;
        C2873o oVar3 = oVar2;
        C2866l lVar3 = lVar2;
        Class<C2839e> cls = C2839e.class;
        if (!C9925a.m20734d(cls)) {
            try {
                C12775o.m28639i(aVar2, "accessTokenAppId");
                C12775o.m28639i(lVar, "request");
                C12775o.m28639i(oVar, "response");
                C12775o.m28639i(oVar3, "appEvents");
                C12775o.m28639i(lVar3, "flushState");
                C4550k b = oVar.mo31709b();
                String str2 = "Success";
                C2865k kVar = C2865k.SUCCESS;
                boolean z = true;
                if (b != null) {
                    if (b.mo31596b() == -1) {
                        str2 = "Failed: No Connectivity";
                        kVar = C2865k.NO_CONNECTIVITY;
                    } else {
                        C12770k0 k0Var = C12770k0.f20423a;
                        str2 = String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{oVar.toString(), b.toString()}, 2));
                        C12775o.m28638h(str2, "java.lang.String.format(format, *args)");
                        kVar = C2865k.SERVER_ERROR;
                    }
                }
                if (FacebookSdk.isLoggingBehaviorEnabled(C4579r.APP_EVENTS)) {
                    try {
                        str = new JSONArray((String) lVar.mo31630u()).toString(2);
                        C12775o.m28638h(str, "jsonArray.toString(2)");
                    } catch (JSONException unused) {
                        str = "<Can't encode events for debug logging>";
                    }
                    C9194v.f13504f.mo43483d(C4579r.APP_EVENTS, f1192a, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", String.valueOf(lVar.mo31624o()), str2, str);
                }
                if (b == null) {
                    z = false;
                }
                oVar3.mo28404b(z);
                C2865k kVar2 = C2865k.NO_CONNECTIVITY;
                if (kVar == kVar2) {
                    FacebookSdk.getExecutor().execute(new C2844e(aVar2, oVar3));
                }
                if (kVar != C2865k.SUCCESS && lVar2.mo28383b() != kVar2) {
                    lVar3.mo28385d(kVar);
                }
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: o */
    public static final void m2186o() {
        Class<C2839e> cls = C2839e.class;
        if (!C9925a.m20734d(cls)) {
            try {
                f1195d.execute(C2845f.f1209b);
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    @VisibleForTesting(otherwise = 2)
    /* renamed from: p */
    public static final C2866l m2187p(C2864j jVar, C2838d dVar) {
        Class<C2839e> cls = C2839e.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            C12775o.m28639i(jVar, "reason");
            C12775o.m28639i(dVar, "appEventCollection");
            C2866l lVar = new C2866l();
            List<C4555l> j = m2181j(dVar, lVar);
            if (!(!j.isEmpty())) {
                return null;
            }
            C9194v.f13504f.mo43483d(C4579r.APP_EVENTS, f1192a, "Flushing %d events due to %s.", Integer.valueOf(lVar.mo28382a()), jVar.toString());
            for (C4555l i : j) {
                i.mo31620i();
            }
            return lVar;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }
}
