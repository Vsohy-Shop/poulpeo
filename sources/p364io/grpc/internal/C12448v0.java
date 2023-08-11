package p364io.grpc.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;
import p111h6.C8016p;
import p364io.grpc.internal.C12422s;

/* renamed from: io.grpc.internal.v0 */
/* compiled from: Http2Ping */
public class C12448v0 {

    /* renamed from: g */
    private static final Logger f19859g = Logger.getLogger(C12448v0.class.getName());

    /* renamed from: a */
    private final long f19860a;

    /* renamed from: b */
    private final C8016p f19861b;

    /* renamed from: c */
    private Map<C12422s.C12423a, Executor> f19862c = new LinkedHashMap();

    /* renamed from: d */
    private boolean f19863d;

    /* renamed from: e */
    private Throwable f19864e;

    /* renamed from: f */
    private long f19865f;

    /* renamed from: io.grpc.internal.v0$a */
    /* compiled from: Http2Ping */
    class C12449a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C12422s.C12423a f19866b;

        /* renamed from: c */
        final /* synthetic */ long f19867c;

        C12449a(C12422s.C12423a aVar, long j) {
            this.f19866b = aVar;
            this.f19867c = j;
        }

        public void run() {
            this.f19866b.mo49775b(this.f19867c);
        }
    }

    /* renamed from: io.grpc.internal.v0$b */
    /* compiled from: Http2Ping */
    class C12450b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ C12422s.C12423a f19868b;

        /* renamed from: c */
        final /* synthetic */ Throwable f19869c;

        C12450b(C12422s.C12423a aVar, Throwable th) {
            this.f19868b = aVar;
            this.f19869c = th;
        }

        public void run() {
            this.f19868b.mo49774a(this.f19869c);
        }
    }

    public C12448v0(long j, C8016p pVar) {
        this.f19860a = j;
        this.f19861b = pVar;
    }

    /* renamed from: b */
    private static Runnable m27476b(C12422s.C12423a aVar, long j) {
        return new C12449a(aVar, j);
    }

    /* renamed from: c */
    private static Runnable m27477c(C12422s.C12423a aVar, Throwable th) {
        return new C12450b(aVar, th);
    }

    /* renamed from: e */
    private static void m27478e(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (Throwable th) {
            f19859g.log(Level.SEVERE, "Failed to execute PingCallback", th);
        }
    }

    /* renamed from: g */
    public static void m27479g(C12422s.C12423a aVar, Executor executor, Throwable th) {
        m27478e(executor, m27477c(aVar, th));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        m27478e(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo50106a(p364io.grpc.internal.C12422s.C12423a r3, java.util.concurrent.Executor r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f19863d     // Catch:{ all -> 0x0020 }
            if (r0 != 0) goto L_0x000c
            java.util.Map<io.grpc.internal.s$a, java.util.concurrent.Executor> r0 = r2.f19862c     // Catch:{ all -> 0x0020 }
            r0.put(r3, r4)     // Catch:{ all -> 0x0020 }
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            return
        L_0x000c:
            java.lang.Throwable r0 = r2.f19864e     // Catch:{ all -> 0x0020 }
            if (r0 == 0) goto L_0x0015
            java.lang.Runnable r3 = m27477c(r3, r0)     // Catch:{ all -> 0x0020 }
            goto L_0x001b
        L_0x0015:
            long r0 = r2.f19865f     // Catch:{ all -> 0x0020 }
            java.lang.Runnable r3 = m27476b(r3, r0)     // Catch:{ all -> 0x0020 }
        L_0x001b:
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            m27478e(r4, r3)
            return
        L_0x0020:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p364io.grpc.internal.C12448v0.mo50106a(io.grpc.internal.s$a, java.util.concurrent.Executor):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        if (r3.hasNext() == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        r4 = r3.next();
        m27478e((java.util.concurrent.Executor) r4.getValue(), m27476b((p364io.grpc.internal.C12422s.C12423a) r4.getKey(), r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0043, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r3 = r3.entrySet().iterator();
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo50107d() {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f19863d     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0008
            monitor-exit(r6)     // Catch:{ all -> 0x0044 }
            r0 = 0
            return r0
        L_0x0008:
            r0 = 1
            r6.f19863d = r0     // Catch:{ all -> 0x0044 }
            h6.p r1 = r6.f19861b     // Catch:{ all -> 0x0044 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x0044 }
            long r1 = r1.mo41847d(r2)     // Catch:{ all -> 0x0044 }
            r6.f19865f = r1     // Catch:{ all -> 0x0044 }
            java.util.Map<io.grpc.internal.s$a, java.util.concurrent.Executor> r3 = r6.f19862c     // Catch:{ all -> 0x0044 }
            r4 = 0
            r6.f19862c = r4     // Catch:{ all -> 0x0044 }
            monitor-exit(r6)     // Catch:{ all -> 0x0044 }
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0023:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0043
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getValue()
            java.util.concurrent.Executor r5 = (java.util.concurrent.Executor) r5
            java.lang.Object r4 = r4.getKey()
            io.grpc.internal.s$a r4 = (p364io.grpc.internal.C12422s.C12423a) r4
            java.lang.Runnable r4 = m27476b(r4, r1)
            m27478e(r5, r4)
            goto L_0x0023
        L_0x0043:
            return r0
        L_0x0044:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0044 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p364io.grpc.internal.C12448v0.mo50107d():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        if (r0.hasNext() == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        r1 = r0.next();
        m27479g((p364io.grpc.internal.C12422s.C12423a) r1.getKey(), (java.util.concurrent.Executor) r1.getValue(), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r0.entrySet().iterator();
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo50108f(java.lang.Throwable r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f19863d     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)     // Catch:{ all -> 0x0037 }
            return
        L_0x0007:
            r0 = 1
            r3.f19863d = r0     // Catch:{ all -> 0x0037 }
            r3.f19864e = r4     // Catch:{ all -> 0x0037 }
            java.util.Map<io.grpc.internal.s$a, java.util.concurrent.Executor> r0 = r3.f19862c     // Catch:{ all -> 0x0037 }
            r1 = 0
            r3.f19862c = r1     // Catch:{ all -> 0x0037 }
            monitor-exit(r3)     // Catch:{ all -> 0x0037 }
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x001a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0036
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            io.grpc.internal.s$a r2 = (p364io.grpc.internal.C12422s.C12423a) r2
            java.lang.Object r1 = r1.getValue()
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            m27479g(r2, r1, r4)
            goto L_0x001a
        L_0x0036:
            return
        L_0x0037:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0037 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p364io.grpc.internal.C12448v0.mo50108f(java.lang.Throwable):void");
    }

    /* renamed from: h */
    public long mo50109h() {
        return this.f19860a;
    }
}
