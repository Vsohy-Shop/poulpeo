package p219s3;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p119i3.C8109b;
import p139k3.C8538h;
import p139k3.C8539i;
import p139k3.C8549o;
import p149l3.C8661e;
import p149l3.C8662f;
import p149l3.C8664g;
import p149l3.C8672m;
import p179o3.C8957a;
import p179o3.C8961c;
import p189p3.C9050a;
import p230t3.C9607c;
import p230t3.C9609d;
import p230t3.C9627k;
import p241u3.C9880a;
import p252v3.C9927a;

/* renamed from: s3.r */
/* compiled from: Uploader */
public class C9486r {

    /* renamed from: a */
    private final Context f14120a;

    /* renamed from: b */
    private final C8661e f14121b;

    /* renamed from: c */
    private final C9609d f14122c;

    /* renamed from: d */
    private final C9492x f14123d;

    /* renamed from: e */
    private final Executor f14124e;

    /* renamed from: f */
    private final C9880a f14125f;

    /* renamed from: g */
    private final C9927a f14126g;

    /* renamed from: h */
    private final C9927a f14127h;

    /* renamed from: i */
    private final C9607c f14128i;

    public C9486r(Context context, C8661e eVar, C9609d dVar, C9492x xVar, Executor executor, C9880a aVar, C9927a aVar2, C9927a aVar3, C9607c cVar) {
        this.f14120a = context;
        this.f14121b = eVar;
        this.f14122c = dVar;
        this.f14123d = xVar;
        this.f14124e = executor;
        this.f14125f = aVar;
        this.f14126g = aVar2;
        this.f14127h = aVar3;
        this.f14128i = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ Boolean m19633l(C8549o oVar) {
        return Boolean.valueOf(this.f14122c.mo44097w(oVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ Iterable m19634m(C8549o oVar) {
        return this.f14122c.mo44096v(oVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ Object m19635n(Iterable iterable, C8549o oVar, long j) {
        this.f14122c.mo44092l0(iterable);
        this.f14122c.mo44090P(oVar, this.f14126g.mo44504a() + j);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ Object m19636o(Iterable iterable) {
        this.f14122c.mo44093m(iterable);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ Object m19637p() {
        this.f14128i.mo44086b();
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ Object m19638q(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f14128i.mo44088k((long) ((Integer) entry.getValue()).intValue(), C8961c.C8963b.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ Object m19639r(C8549o oVar, long j) {
        this.f14122c.mo44090P(oVar, this.f14126g.mo44504a() + j);
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ Object m19640s(C8549o oVar, int i) {
        this.f14123d.mo43920b(oVar, i + 1);
        return null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        r6.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r3.f14123d.mo43920b(r4, r5 + 1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0026 */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void m19641t(p139k3.C8549o r4, int r5, java.lang.Runnable r6) {
        /*
            r3 = this;
            u3.a r0 = r3.f14125f     // Catch:{ SynchronizationException -> 0x0026 }
            t3.d r1 = r3.f14122c     // Catch:{ SynchronizationException -> 0x0026 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ SynchronizationException -> 0x0026 }
            s3.i r2 = new s3.i     // Catch:{ SynchronizationException -> 0x0026 }
            r2.<init>(r1)     // Catch:{ SynchronizationException -> 0x0026 }
            r0.mo44106a(r2)     // Catch:{ SynchronizationException -> 0x0026 }
            boolean r0 = r3.mo43930k()     // Catch:{ SynchronizationException -> 0x0026 }
            if (r0 != 0) goto L_0x0020
            u3.a r0 = r3.f14125f     // Catch:{ SynchronizationException -> 0x0026 }
            s3.j r1 = new s3.j     // Catch:{ SynchronizationException -> 0x0026 }
            r1.<init>(r3, r4, r5)     // Catch:{ SynchronizationException -> 0x0026 }
            r0.mo44106a(r1)     // Catch:{ SynchronizationException -> 0x0026 }
            goto L_0x002d
        L_0x0020:
            r3.mo43931u(r4, r5)     // Catch:{ SynchronizationException -> 0x0026 }
            goto L_0x002d
        L_0x0024:
            r4 = move-exception
            goto L_0x0031
        L_0x0026:
            s3.x r0 = r3.f14123d     // Catch:{ all -> 0x0024 }
            int r5 = r5 + 1
            r0.mo43920b(r4, r5)     // Catch:{ all -> 0x0024 }
        L_0x002d:
            r6.run()
            return
        L_0x0031:
            r6.run()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p219s3.C9486r.m19641t(k3.o, int, java.lang.Runnable):void");
    }

    @VisibleForTesting
    /* renamed from: j */
    public C8539i mo43929j(C8672m mVar) {
        C9880a aVar = this.f14125f;
        C9607c cVar = this.f14128i;
        Objects.requireNonNull(cVar);
        return mVar.mo31826a(C8539i.m17122a().mo42563i(this.f14126g.mo44504a()).mo42565k(this.f14127h.mo44504a()).mo42564j("GDT_CLIENT_METRICS").mo42562h(new C8538h(C8109b.m15970b("proto"), ((C8957a) aVar.mo44106a(new C9476h(cVar))).mo43108f())).mo42558d());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo43930k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f14120a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo43931u(C8549o oVar, int i) {
        C8664g gVar;
        C8672m mVar = this.f14121b.get(oVar.mo42580b());
        long j = 0;
        while (true) {
            long j2 = j;
            while (((Boolean) this.f14125f.mo44106a(new C9479k(this, oVar))).booleanValue()) {
                Iterable<C9627k> iterable = (Iterable) this.f14125f.mo44106a(new C9480l(this, oVar));
                if (iterable.iterator().hasNext()) {
                    if (mVar == null) {
                        C9050a.m18380a("Uploader", "Unknown backend for %s, deleting event batch for it...", oVar);
                        gVar = C8664g.m17418a();
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (C9627k b : iterable) {
                            arrayList.add(b.mo44080b());
                        }
                        if (oVar.mo42612e()) {
                            arrayList.add(mo43929j(mVar));
                        }
                        gVar = mVar.mo31827b(C8662f.m17412a().mo42735b(arrayList).mo42736c(oVar.mo42581c()).mo42734a());
                    }
                    if (gVar.mo42738c() == C8664g.C8665a.TRANSIENT_ERROR) {
                        this.f14125f.mo44106a(new C9481m(this, iterable, oVar, j2));
                        this.f14123d.mo43919a(oVar, i + 1, true);
                        return;
                    }
                    this.f14125f.mo44106a(new C9482n(this, iterable));
                    if (gVar.mo42738c() == C8664g.C8665a.OK) {
                        j = Math.max(j2, gVar.mo42737b());
                        if (oVar.mo42612e()) {
                            this.f14125f.mo44106a(new C9483o(this));
                        }
                    } else if (gVar.mo42738c() == C8664g.C8665a.INVALID_PAYLOAD) {
                        HashMap hashMap = new HashMap();
                        for (C9627k b2 : iterable) {
                            String j3 = b2.mo44080b().mo42555j();
                            if (!hashMap.containsKey(j3)) {
                                hashMap.put(j3, 1);
                            } else {
                                hashMap.put(j3, Integer.valueOf(((Integer) hashMap.get(j3)).intValue() + 1));
                            }
                        }
                        this.f14125f.mo44106a(new C9484p(this, hashMap));
                    }
                } else {
                    return;
                }
            }
            this.f14125f.mo44106a(new C9485q(this, oVar, j2));
            return;
        }
    }

    /* renamed from: v */
    public void mo43932v(C8549o oVar, int i, Runnable runnable) {
        this.f14124e.execute(new C9475g(this, oVar, i, runnable));
    }
}
