package p364io.grpc.internal;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import p111h6.C8012n;
import p458xd.C13781d;
import p458xd.C13836w;
import p458xd.C13841z;

/* renamed from: io.grpc.internal.o */
/* compiled from: ChannelTracer */
final class C12374o {

    /* renamed from: f */
    static final Logger f19660f = Logger.getLogger(C13781d.class.getName());

    /* renamed from: a */
    private final Object f19661a = new Object();

    /* renamed from: b */
    private final C13841z f19662b;

    /* renamed from: c */
    private final Collection<C13836w> f19663c;

    /* renamed from: d */
    private final long f19664d;

    /* renamed from: e */
    private int f19665e;

    /* renamed from: io.grpc.internal.o$a */
    /* compiled from: ChannelTracer */
    class C12375a extends ArrayDeque<C13836w> {

        /* renamed from: b */
        final /* synthetic */ int f19666b;

        C12375a(int i) {
            this.f19666b = i;
        }

        /* renamed from: b */
        public boolean add(C13836w wVar) {
            if (size() == this.f19666b) {
                removeFirst();
            }
            C12374o.m27212a(C12374o.this);
            return super.add(wVar);
        }
    }

    /* renamed from: io.grpc.internal.o$b */
    /* compiled from: ChannelTracer */
    static /* synthetic */ class C12376b {

        /* renamed from: a */
        static final /* synthetic */ int[] f19668a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                xd.w$b[] r0 = p458xd.C13836w.C13838b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19668a = r0
                xd.w$b r1 = p458xd.C13836w.C13838b.CT_ERROR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f19668a     // Catch:{ NoSuchFieldError -> 0x001d }
                xd.w$b r1 = p458xd.C13836w.C13838b.CT_WARNING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p364io.grpc.internal.C12374o.C12376b.<clinit>():void");
        }
    }

    C12374o(C13841z zVar, int i, long j, String str) {
        C8012n.m15756o(str, "description");
        this.f19662b = (C13841z) C8012n.m15756o(zVar, "logId");
        if (i > 0) {
            this.f19663c = new C12375a(i);
        } else {
            this.f19663c = null;
        }
        this.f19664d = j;
        C13836w.C13837a aVar = new C13836w.C13837a();
        mo50011e(aVar.mo53518b(str + " created").mo53519c(C13836w.C13838b.CT_INFO).mo53521e(j).mo53517a());
    }

    /* renamed from: a */
    static /* synthetic */ int m27212a(C12374o oVar) {
        int i = oVar.f19665e;
        oVar.f19665e = i + 1;
        return i;
    }

    /* renamed from: d */
    static void m27213d(C13841z zVar, Level level, String str) {
        Logger logger = f19660f;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + zVar + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C13841z mo50009b() {
        return this.f19662b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo50010c() {
        boolean z;
        synchronized (this.f19661a) {
            if (this.f19663c != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo50011e(C13836w wVar) {
        Level level;
        int i = C12376b.f19668a[wVar.f22317b.ordinal()];
        if (i == 1) {
            level = Level.FINE;
        } else if (i != 2) {
            level = Level.FINEST;
        } else {
            level = Level.FINER;
        }
        mo50012f(wVar);
        m27213d(this.f19662b, level, wVar.f22316a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo50012f(C13836w wVar) {
        synchronized (this.f19661a) {
            Collection<C13836w> collection = this.f19663c;
            if (collection != null) {
                collection.add(wVar);
            }
        }
    }
}
