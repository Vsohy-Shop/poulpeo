package p364io.grpc.internal;

import java.text.MessageFormat;
import java.util.logging.Level;
import p111h6.C8012n;
import p458xd.C13781d;
import p458xd.C13836w;
import p458xd.C13841z;

/* renamed from: io.grpc.internal.n */
/* compiled from: ChannelLoggerImpl */
final class C12368n extends C13781d {

    /* renamed from: a */
    private final C12374o f19645a;

    /* renamed from: b */
    private final C12356l2 f19646b;

    /* renamed from: io.grpc.internal.n$a */
    /* compiled from: ChannelLoggerImpl */
    static /* synthetic */ class C12369a {

        /* renamed from: a */
        static final /* synthetic */ int[] f19647a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                xd.d$a[] r0 = p458xd.C13781d.C13782a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f19647a = r0
                xd.d$a r1 = p458xd.C13781d.C13782a.ERROR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f19647a     // Catch:{ NoSuchFieldError -> 0x001d }
                xd.d$a r1 = p458xd.C13781d.C13782a.WARNING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p364io.grpc.internal.C12368n.C12369a.<clinit>():void");
        }
    }

    C12368n(C12374o oVar, C12356l2 l2Var) {
        this.f19645a = (C12374o) C8012n.m15756o(oVar, "tracer");
        this.f19646b = (C12356l2) C8012n.m15756o(l2Var, "time");
    }

    /* renamed from: c */
    private boolean m27195c(C13781d.C13782a aVar) {
        if (aVar == C13781d.C13782a.DEBUG || !this.f19645a.mo50010c()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    static void m27196d(C13841z zVar, C13781d.C13782a aVar, String str) {
        Level f = m27198f(aVar);
        if (C12374o.f19660f.isLoggable(f)) {
            C12374o.m27213d(zVar, f, str);
        }
    }

    /* renamed from: e */
    static void m27197e(C13841z zVar, C13781d.C13782a aVar, String str, Object... objArr) {
        Level f = m27198f(aVar);
        if (C12374o.f19660f.isLoggable(f)) {
            C12374o.m27213d(zVar, f, MessageFormat.format(str, objArr));
        }
    }

    /* renamed from: f */
    private static Level m27198f(C13781d.C13782a aVar) {
        int i = C12369a.f19647a[aVar.ordinal()];
        if (i == 1) {
            return Level.FINE;
        }
        if (i != 2) {
            return Level.FINEST;
        }
        return Level.FINER;
    }

    /* renamed from: g */
    private static C13836w.C13838b m27199g(C13781d.C13782a aVar) {
        int i = C12369a.f19647a[aVar.ordinal()];
        if (i == 1) {
            return C13836w.C13838b.CT_ERROR;
        }
        if (i != 2) {
            return C13836w.C13838b.CT_INFO;
        }
        return C13836w.C13838b.CT_WARNING;
    }

    /* renamed from: h */
    private void m27200h(C13781d.C13782a aVar, String str) {
        if (aVar != C13781d.C13782a.DEBUG) {
            this.f19645a.mo50012f(new C13836w.C13837a().mo53518b(str).mo53519c(m27199g(aVar)).mo53521e(this.f19646b.mo49993a()).mo53517a());
        }
    }

    /* renamed from: a */
    public void mo50002a(C13781d.C13782a aVar, String str) {
        m27196d(this.f19645a.mo50009b(), aVar, str);
        if (m27195c(aVar)) {
            m27200h(aVar, str);
        }
    }

    /* renamed from: b */
    public void mo50003b(C13781d.C13782a aVar, String str, Object... objArr) {
        String str2;
        Level f = m27198f(aVar);
        if (m27195c(aVar) || C12374o.f19660f.isLoggable(f)) {
            str2 = MessageFormat.format(str, objArr);
        } else {
            str2 = null;
        }
        mo50002a(aVar, str2);
    }
}
