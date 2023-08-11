package p095g2;

import androidx.annotation.RestrictTo;
import p095g2.C7753c;
import p251v2.C9925a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: g2.b */
/* compiled from: InAppPurchaseAutoLogger.kt */
public final class C7750b {

    /* renamed from: a */
    public static final C7750b f10731a = new C7750b();

    /* renamed from: g2.b$a */
    /* compiled from: InAppPurchaseAutoLogger.kt */
    static final class C7751a implements Runnable {

        /* renamed from: b */
        public static final C7751a f10732b = new C7751a();

        C7751a() {
        }

        public final void run() {
            if (!C9925a.m20734d(this)) {
                try {
                    if (!C9925a.m20734d(this)) {
                        C7750b.m15076a(C7750b.f10731a);
                    }
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    /* renamed from: g2.b$b */
    /* compiled from: InAppPurchaseAutoLogger.kt */
    static final class C7752b implements Runnable {

        /* renamed from: b */
        public static final C7752b f10733b = new C7752b();

        C7752b() {
        }

        public final void run() {
            if (!C9925a.m20734d(this)) {
                try {
                    if (!C9925a.m20734d(this)) {
                        C7750b.m15076a(C7750b.f10731a);
                    }
                } catch (Throwable th) {
                    C9925a.m20732b(th, this);
                }
            }
        }
    }

    private C7750b() {
    }

    /* renamed from: a */
    public static final /* synthetic */ void m15076a(C7750b bVar) {
        Class<C7750b> cls = C7750b.class;
        if (!C9925a.m20734d(cls)) {
            try {
                bVar.m15077b();
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: b */
    private final void m15077b() {
        if (!C9925a.m20734d(this)) {
            try {
                C7753c.C7755b bVar = C7753c.f10739x;
                C7761e.m15124e(bVar.mo41398d(), bVar.mo41399e());
                bVar.mo41398d().clear();
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r1 = p095g2.C7753c.f10739x;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m15078c(android.content.Context r3) {
        /*
            java.lang.Class<g2.b> r0 = p095g2.C7750b.class
            boolean r1 = p251v2.C9925a.m20734d(r0)
            if (r1 == 0) goto L_0x0009
            return
        L_0x0009:
            java.lang.String r1 = "context"
            kotlin.jvm.internal.C12775o.m28639i(r3, r1)     // Catch:{ all -> 0x003d }
            java.lang.String r1 = "com.android.billingclient.api.Purchase"
            java.lang.Class r1 = p095g2.C7765h.m15140a(r1)     // Catch:{ all -> 0x003d }
            if (r1 != 0) goto L_0x0017
            return
        L_0x0017:
            g2.c$b r1 = p095g2.C7753c.f10739x     // Catch:{ all -> 0x003d }
            g2.c r3 = r1.mo41397c(r3)     // Catch:{ all -> 0x003d }
            if (r3 == 0) goto L_0x003c
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.mo41400f()     // Catch:{ all -> 0x003d }
            boolean r1 = r1.get()     // Catch:{ all -> 0x003d }
            if (r1 == 0) goto L_0x003c
            boolean r1 = p095g2.C7761e.m15123d()     // Catch:{ all -> 0x003d }
            java.lang.String r2 = "inapp"
            if (r1 == 0) goto L_0x0037
            g2.b$a r1 = p095g2.C7750b.C7751a.f10732b     // Catch:{ all -> 0x003d }
            r3.mo41395p(r2, r1)     // Catch:{ all -> 0x003d }
            goto L_0x003c
        L_0x0037:
            g2.b$b r1 = p095g2.C7750b.C7752b.f10733b     // Catch:{ all -> 0x003d }
            r3.mo41394o(r2, r1)     // Catch:{ all -> 0x003d }
        L_0x003c:
            return
        L_0x003d:
            r3 = move-exception
            p251v2.C9925a.m20732b(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p095g2.C7750b.m15078c(android.content.Context):void");
    }
}
