package p364io.grpc.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.appboy.Constants;
import com.google.common.util.concurrent.C6909g;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p111h6.C8012n;
import p111h6.C8013o;
import p111h6.C8016p;
import p111h6.C8019r;
import p364io.grpc.C12155a;
import p364io.grpc.C12159b;
import p364io.grpc.C12161c;
import p364io.grpc.C12173h;
import p364io.grpc.C12546k;
import p364io.grpc.C12564o;
import p364io.grpc.C12594t;
import p364io.grpc.internal.C12259f2;
import p364io.grpc.internal.C12343k2;
import p364io.grpc.internal.C12402r;
import p458xd.C13783d0;
import p458xd.C13792f0;
import p458xd.C13794g0;
import p458xd.C13841z;

/* renamed from: io.grpc.internal.r0 */
/* compiled from: GrpcUtil */
public final class C12404r0 {

    /* renamed from: a */
    private static final Logger f19742a = Logger.getLogger(C12404r0.class.getName());

    /* renamed from: b */
    public static final Charset f19743b = Charset.forName("US-ASCII");

    /* renamed from: c */
    public static final C12564o.C12571g<Long> f19744c = C12564o.C12571g.m27836e("grpc-timeout", new C12415j());

    /* renamed from: d */
    public static final C12564o.C12571g<String> f19745d;

    /* renamed from: e */
    public static final C12564o.C12571g<byte[]> f19746e = C12173h.m26565b("grpc-accept-encoding", new C12413h((C12405a) null));

    /* renamed from: f */
    public static final C12564o.C12571g<String> f19747f;

    /* renamed from: g */
    public static final C12564o.C12571g<byte[]> f19748g = C12173h.m26565b("accept-encoding", new C12413h((C12405a) null));

    /* renamed from: h */
    public static final C12564o.C12571g<String> f19749h;

    /* renamed from: i */
    public static final C12564o.C12571g<String> f19750i;

    /* renamed from: j */
    public static final C12564o.C12571g<String> f19751j;

    /* renamed from: k */
    public static final C8013o f19752k = C8013o.m15765a(',').mo41845c();

    /* renamed from: l */
    public static final long f19753l;

    /* renamed from: m */
    public static final long f19754m = TimeUnit.HOURS.toNanos(2);

    /* renamed from: n */
    public static final long f19755n;

    /* renamed from: o */
    public static final C13794g0 f19756o = new C12443u1();

    /* renamed from: p */
    public static final C13794g0 f19757p = new C12405a();

    /* renamed from: q */
    public static final C12159b.C12160a<Boolean> f19758q = C12159b.C12160a.m26541b("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static final C12161c f19759r = new C12406b();

    /* renamed from: s */
    public static final C12259f2.C12263d<Executor> f19760s = new C12407c();

    /* renamed from: t */
    public static final C12259f2.C12263d<ScheduledExecutorService> f19761t = new C12408d();

    /* renamed from: u */
    public static final C8019r<C8016p> f19762u = new C12409e();

    /* renamed from: io.grpc.internal.r0$a */
    /* compiled from: GrpcUtil */
    class C12405a implements C13794g0 {
        C12405a() {
        }

        /* renamed from: a */
        public C13792f0 mo50044a(SocketAddress socketAddress) {
            return null;
        }
    }

    /* renamed from: io.grpc.internal.r0$b */
    /* compiled from: GrpcUtil */
    class C12406b extends C12161c {
        C12406b() {
        }
    }

    /* renamed from: io.grpc.internal.r0$c */
    /* compiled from: GrpcUtil */
    class C12407c implements C12259f2.C12263d<Executor> {
        C12407c() {
        }

        /* renamed from: c */
        public void mo49831b(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }

        /* renamed from: d */
        public Executor mo49830a() {
            return Executors.newCachedThreadPool(C12404r0.m27330i("grpc-default-executor-%d", true));
        }

        public String toString() {
            return "grpc-default-executor";
        }
    }

    /* renamed from: io.grpc.internal.r0$d */
    /* compiled from: GrpcUtil */
    class C12408d implements C12259f2.C12263d<ScheduledExecutorService> {
        C12408d() {
        }

        /* renamed from: c */
        public void mo49831b(ScheduledExecutorService scheduledExecutorService) {
            scheduledExecutorService.shutdown();
        }

        /* renamed from: d */
        public ScheduledExecutorService mo49830a() {
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, C12404r0.m27330i("grpc-timer-%d", true));
            try {
                newScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", new Class[]{Boolean.TYPE}).invoke(newScheduledThreadPool, new Object[]{Boolean.TRUE});
            } catch (NoSuchMethodException unused) {
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
            return Executors.unconfigurableScheduledExecutorService(newScheduledThreadPool);
        }
    }

    /* renamed from: io.grpc.internal.r0$e */
    /* compiled from: GrpcUtil */
    class C12409e implements C8019r<C8016p> {
        C12409e() {
        }

        /* renamed from: a */
        public C8016p get() {
            return C8016p.m15771c();
        }
    }

    /* renamed from: io.grpc.internal.r0$f */
    /* compiled from: GrpcUtil */
    class C12410f implements C12422s {

        /* renamed from: a */
        final /* synthetic */ C12161c.C12162a f19763a;

        /* renamed from: b */
        final /* synthetic */ C12422s f19764b;

        C12410f(C12161c.C12162a aVar, C12422s sVar) {
            this.f19763a = aVar;
            this.f19764b = sVar;
        }

        /* renamed from: d */
        public C12398q mo49699d(C13783d0<?, ?> d0Var, C12564o oVar, C12159b bVar, C12161c[] cVarArr) {
            boolean z;
            C12161c n = C12404r0.m27335n(this.f19763a, C12161c.C12164c.m26547a().mo49645b(bVar).mo49644a(), oVar);
            if (cVarArr[cVarArr.length - 1] == C12404r0.f19759r) {
                z = true;
            } else {
                z = false;
            }
            C8012n.m15762u(z, "lb tracer already assigned");
            cVarArr[cVarArr.length - 1] = n;
            return this.f19764b.mo49699d(d0Var, oVar, bVar, cVarArr);
        }

        /* renamed from: f */
        public C13841z mo49701f() {
            return this.f19764b.mo49701f();
        }
    }

    /* renamed from: io.grpc.internal.r0$g */
    /* compiled from: GrpcUtil */
    class C12411g extends C12332j0 {

        /* renamed from: a */
        final C12161c f19765a;

        /* renamed from: b */
        volatile C12161c f19766b;

        /* renamed from: c */
        final /* synthetic */ C12161c.C12162a f19767c;

        /* renamed from: d */
        final /* synthetic */ C12161c.C12164c f19768d;

        /* renamed from: e */
        final /* synthetic */ C12564o f19769e;

        /* renamed from: io.grpc.internal.r0$g$a */
        /* compiled from: GrpcUtil */
        class C12412a extends C12161c {
            C12412a() {
            }
        }

        C12411g(C12161c.C12162a aVar, C12161c.C12164c cVar, C12564o oVar) {
            this.f19767c = aVar;
            this.f19768d = cVar;
            this.f19769e = oVar;
            C12412a aVar2 = new C12412a();
            this.f19765a = aVar2;
            this.f19766b = aVar2;
        }

        /* renamed from: i */
        public void mo50051i(C12594t tVar) {
            mo50052o(this.f19768d, this.f19769e);
            mo49964n().mo50051i(tVar);
        }

        /* renamed from: m */
        public void mo49640m(C12155a aVar, C12564o oVar) {
            mo50052o(this.f19768d.mo49642b().mo49648e(aVar).mo49644a(), oVar);
            mo49964n().mo49640m(aVar, oVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public C12161c mo49964n() {
            return this.f19766b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo50052o(C12161c.C12164c cVar, C12564o oVar) {
            if (this.f19766b == this.f19765a) {
                synchronized (this) {
                    if (this.f19766b == this.f19765a) {
                        this.f19766b = this.f19767c.mo49641a(cVar, oVar);
                    }
                }
            }
        }
    }

    /* renamed from: io.grpc.internal.r0$i */
    /* compiled from: GrpcUtil */
    public enum C12414i {
        NO_ERROR(0, r1),
        PROTOCOL_ERROR(1, r4),
        INTERNAL_ERROR(2, r4),
        FLOW_CONTROL_ERROR(3, r4),
        SETTINGS_TIMEOUT(4, r4),
        STREAM_CLOSED(5, r4),
        FRAME_SIZE_ERROR(6, r4),
        REFUSED_STREAM(7, r1),
        CANCEL(8, C12594t.f20184g),
        COMPRESSION_ERROR(9, r4),
        CONNECT_ERROR(10, r4),
        ENHANCE_YOUR_CALM(11, C12594t.f20192o.mo50310r("Bandwidth exhausted")),
        INADEQUATE_SECURITY(12, C12594t.f20190m.mo50310r("Permission denied as protocol is not secure enough to call")),
        HTTP_1_1_REQUIRED(13, C12594t.f20185h);
        

        /* renamed from: r */
        private static final C12414i[] f19785r = null;

        /* renamed from: b */
        private final int f19787b;

        /* renamed from: c */
        private final C12594t f19788c;

        static {
            f19785r = m27357a();
        }

        private C12414i(int i, C12594t tVar) {
            this.f19787b = i;
            String str = "HTTP/2 error code: " + name();
            if (tVar.mo50307o() != null) {
                str = str + " (" + tVar.mo50307o() + ")";
            }
            this.f19788c = tVar.mo50310r(str);
        }

        /* renamed from: a */
        private static C12414i[] m27357a() {
            C12414i[] values = values();
            C12414i[] iVarArr = new C12414i[(((int) values[values.length - 1].mo50057b()) + 1)];
            for (C12414i iVar : values) {
                iVarArr[(int) iVar.mo50057b()] = iVar;
            }
            return iVarArr;
        }

        /* renamed from: c */
        public static C12414i m27358c(long j) {
            C12414i[] iVarArr = f19785r;
            if (j >= ((long) iVarArr.length) || j < 0) {
                return null;
            }
            return iVarArr[(int) j];
        }

        /* renamed from: e */
        public static C12594t m27359e(long j) {
            C12414i c = m27358c(j);
            if (c != null) {
                return c.mo50058d();
            }
            C12594t i = C12594t.m27923i(INTERNAL_ERROR.mo50058d().mo50306n().mo50313c());
            return i.mo50310r("Unrecognized HTTP/2 error code: " + j);
        }

        /* renamed from: b */
        public long mo50057b() {
            return (long) this.f19787b;
        }

        /* renamed from: d */
        public C12594t mo50058d() {
            return this.f19788c;
        }
    }

    /* renamed from: io.grpc.internal.r0$j */
    /* compiled from: GrpcUtil */
    static class C12415j implements C12564o.C12568d<Long> {
        C12415j() {
        }

        /* renamed from: c */
        public Long mo50060b(String str) {
            boolean z;
            boolean z2;
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            C8012n.m15746e(z, "empty timeout");
            if (str.length() <= 9) {
                z2 = true;
            } else {
                z2 = false;
            }
            C8012n.m15746e(z2, "bad timeout format");
            long parseLong = Long.parseLong(str.substring(0, str.length() - 1));
            char charAt = str.charAt(str.length() - 1);
            if (charAt == 'H') {
                return Long.valueOf(TimeUnit.HOURS.toNanos(parseLong));
            }
            if (charAt == 'M') {
                return Long.valueOf(TimeUnit.MINUTES.toNanos(parseLong));
            }
            if (charAt == 'S') {
                return Long.valueOf(TimeUnit.SECONDS.toNanos(parseLong));
            }
            if (charAt == 'u') {
                return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(parseLong));
            }
            if (charAt == 'm') {
                return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(parseLong));
            }
            if (charAt == 'n') {
                return Long.valueOf(parseLong);
            }
            throw new IllegalArgumentException(String.format("Invalid timeout unit: %s", new Object[]{Character.valueOf(charAt)}));
        }

        /* renamed from: d */
        public String mo50059a(Long l) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (l.longValue() < 0) {
                throw new IllegalArgumentException("Timeout too small");
            } else if (l.longValue() < 100000000) {
                return l + Constants.APPBOY_PUSH_CUSTOM_NOTIFICATION_ID;
            } else if (l.longValue() < 100000000000L) {
                return timeUnit.toMicros(l.longValue()) + "u";
            } else if (l.longValue() < 100000000000000L) {
                return timeUnit.toMillis(l.longValue()) + "m";
            } else if (l.longValue() < 100000000000000000L) {
                return timeUnit.toSeconds(l.longValue()) + ExifInterface.LATITUDE_SOUTH;
            } else if (l.longValue() < 6000000000000000000L) {
                return timeUnit.toMinutes(l.longValue()) + "M";
            } else {
                return timeUnit.toHours(l.longValue()) + "H";
            }
        }
    }

    static {
        C12564o.C12568d<String> dVar = C12564o.f20135d;
        f19745d = C12564o.C12571g.m27836e("grpc-encoding", dVar);
        f19747f = C12564o.C12571g.m27836e("content-encoding", dVar);
        f19749h = C12564o.C12571g.m27836e("content-type", dVar);
        f19750i = C12564o.C12571g.m27836e("te", dVar);
        f19751j = C12564o.C12571g.m27836e("user-agent", dVar);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f19753l = timeUnit.toNanos(20);
        f19755n = timeUnit.toNanos(20);
    }

    private C12404r0() {
    }

    /* renamed from: b */
    public static URI m27323b(String str) {
        C8012n.m15756o(str, "authority");
        try {
            return new URI((String) null, str, (String) null, (String) null, (String) null);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException("Invalid authority: " + str, e);
        }
    }

    /* renamed from: c */
    public static String m27324c(String str) {
        boolean z;
        URI b = m27323b(str);
        boolean z2 = true;
        if (b.getHost() != null) {
            z = true;
        } else {
            z = false;
        }
        C8012n.m15751j(z, "No host in authority '%s'", str);
        if (b.getUserInfo() != null) {
            z2 = false;
        }
        C8012n.m15751j(z2, "Userinfo must not be present on authority: '%s'", str);
        return str;
    }

    /* renamed from: d */
    static void m27325d(C12343k2.C12344a aVar) {
        while (true) {
            InputStream next = aVar.next();
            if (next != null) {
                m27326e(next);
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    public static void m27326e(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                f19742a.log(Level.WARNING, "exception caught in closeQuietly", e);
            }
        }
    }

    /* renamed from: f */
    public static C12161c[] m27327f(C12159b bVar, C12564o oVar, int i, boolean z) {
        List<C12161c.C12162a> i2 = bVar.mo49624i();
        int size = i2.size() + 1;
        C12161c[] cVarArr = new C12161c[size];
        C12161c.C12164c a = C12161c.C12164c.m26547a().mo49645b(bVar).mo49647d(i).mo49646c(z).mo49644a();
        for (int i3 = 0; i3 < i2.size(); i3++) {
            cVarArr[i3] = m27335n(i2.get(i3), a, oVar);
        }
        cVarArr[size - 1] = f19759r;
        return cVarArr;
    }

    /* renamed from: g */
    public static String m27328g(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            sb.append(str2);
            sb.append(' ');
        }
        sb.append("grpc-java-");
        sb.append(str);
        sb.append('/');
        sb.append("1.41.0");
        return sb.toString();
    }

    /* renamed from: h */
    public static String m27329h(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", new Class[0]).invoke(inetSocketAddress, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    /* renamed from: i */
    public static ThreadFactory m27330i(String str, boolean z) {
        return new C6909g().mo39749e(z).mo39750f(str).mo39748b();
    }

    /* renamed from: j */
    static C12422s m27331j(C12546k.C12552e eVar, boolean z) {
        C12422s sVar;
        C12546k.C12556h c = eVar.mo50217c();
        if (c != null) {
            sVar = ((C12373n2) c.mo49908d()).mo50008a();
        } else {
            sVar = null;
        }
        if (sVar != null) {
            C12161c.C12162a b = eVar.mo50216b();
            if (b == null) {
                return sVar;
            }
            return new C12410f(b, sVar);
        }
        if (!eVar.mo50215a().mo50308p()) {
            if (eVar.mo50218d()) {
                return new C12270g0(eVar.mo50215a(), C12402r.C12403a.DROPPED);
            }
            if (!z) {
                return new C12270g0(eVar.mo50215a(), C12402r.C12403a.PROCESSED);
            }
        }
        return null;
    }

    /* renamed from: k */
    private static C12594t.C12596b m27332k(int i) {
        if (i >= 100 && i < 200) {
            return C12594t.C12596b.INTERNAL;
        }
        if (i != 400) {
            if (i == 401) {
                return C12594t.C12596b.UNAUTHENTICATED;
            }
            if (i == 403) {
                return C12594t.C12596b.PERMISSION_DENIED;
            }
            if (i == 404) {
                return C12594t.C12596b.UNIMPLEMENTED;
            }
            if (i != 429) {
                if (i != 431) {
                    switch (i) {
                        case TypedValues.PositionType.TYPE_DRAWPATH:
                        case TypedValues.PositionType.TYPE_PERCENT_WIDTH:
                        case TypedValues.PositionType.TYPE_PERCENT_HEIGHT:
                            break;
                        default:
                            return C12594t.C12596b.UNKNOWN;
                    }
                }
            }
            return C12594t.C12596b.UNAVAILABLE;
        }
        return C12594t.C12596b.INTERNAL;
    }

    /* renamed from: l */
    public static C12594t m27333l(int i) {
        C12594t b = m27332k(i).mo50312b();
        return b.mo50310r("HTTP status code " + i);
    }

    /* renamed from: m */
    public static boolean m27334m(String str) {
        if (str == null || 16 > str.length()) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        if (!lowerCase.startsWith("application/grpc")) {
            return false;
        }
        if (lowerCase.length() == 16) {
            return true;
        }
        char charAt = lowerCase.charAt(16);
        if (charAt == '+' || charAt == ';') {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    static C12161c m27335n(C12161c.C12162a aVar, C12161c.C12164c cVar, C12564o oVar) {
        if (aVar instanceof C12161c.C12163b) {
            return aVar.mo49641a(cVar, oVar);
        }
        return new C12411g(aVar, cVar, oVar);
    }

    /* renamed from: o */
    public static boolean m27336o(C12159b bVar) {
        return !Boolean.TRUE.equals(bVar.mo49623h(f19758q));
    }

    /* renamed from: io.grpc.internal.r0$h */
    /* compiled from: GrpcUtil */
    private static final class C12413h implements C12173h.C12174a<byte[]> {
        private C12413h() {
        }

        /* synthetic */ C12413h(C12405a aVar) {
            this();
        }

        /* renamed from: c */
        public byte[] mo50054b(byte[] bArr) {
            return bArr;
        }

        /* renamed from: d */
        public byte[] mo50053a(byte[] bArr) {
            return bArr;
        }
    }
}
