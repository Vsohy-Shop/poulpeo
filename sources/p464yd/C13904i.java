package p464yd;

import java.util.EnumMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.C13121c;
import okio.C13133f;
import p111h6.C8012n;
import p306ae.C10867a;
import p306ae.C10871d;
import p306ae.C10883i;

/* renamed from: yd.i */
/* compiled from: OkHttpFrameLogger */
class C13904i {

    /* renamed from: a */
    private final Logger f22777a;

    /* renamed from: b */
    private final Level f22778b;

    /* renamed from: yd.i$a */
    /* compiled from: OkHttpFrameLogger */
    enum C13905a {
        INBOUND,
        OUTBOUND
    }

    /* renamed from: yd.i$b */
    /* compiled from: OkHttpFrameLogger */
    private enum C13906b {
        HEADER_TABLE_SIZE(1),
        ENABLE_PUSH(2),
        MAX_CONCURRENT_STREAMS(4),
        MAX_FRAME_SIZE(5),
        MAX_HEADER_LIST_SIZE(6),
        INITIAL_WINDOW_SIZE(7);
        

        /* renamed from: b */
        private final int f22789b;

        private C13906b(int i) {
            this.f22789b = i;
        }

        /* renamed from: a */
        public int mo53633a() {
            return this.f22789b;
        }
    }

    C13904i(Level level, Class<?> cls) {
        this(level, Logger.getLogger(cls.getName()));
    }

    /* renamed from: a */
    private boolean m32100a() {
        return this.f22777a.isLoggable(this.f22778b);
    }

    /* renamed from: l */
    private static String m32101l(C10883i iVar) {
        EnumMap enumMap = new EnumMap(C13906b.class);
        for (C13906b bVar : C13906b.values()) {
            if (iVar.mo45871d(bVar.mo53633a())) {
                enumMap.put(bVar, Integer.valueOf(iVar.mo45868a(bVar.mo53633a())));
            }
        }
        return enumMap.toString();
    }

    /* renamed from: m */
    private static String m32102m(C13121c cVar) {
        if (cVar.size() <= 64) {
            return cVar.mo52484D0().mo52609l();
        }
        return cVar.mo52485E0((int) Math.min(cVar.size(), 64)).mo52609l() + "...";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo53623b(C13905a aVar, int i, C13121c cVar, int i2, boolean z) {
        if (m32100a()) {
            Logger logger = this.f22777a;
            Level level = this.f22778b;
            logger.log(level, aVar + " DATA: streamId=" + i + " endStream=" + z + " length=" + i2 + " bytes=" + m32102m(cVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo53624c(C13905a aVar, int i, C10867a aVar2, C13133f fVar) {
        if (m32100a()) {
            Logger logger = this.f22777a;
            Level level = this.f22778b;
            logger.log(level, aVar + " GO_AWAY: lastStreamId=" + i + " errorCode=" + aVar2 + " length=" + fVar.mo52590H() + " bytes=" + m32102m(new C13121c().mo52517b0(fVar)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo53625d(C13905a aVar, int i, List<C10871d> list, boolean z) {
        if (m32100a()) {
            Logger logger = this.f22777a;
            Level level = this.f22778b;
            logger.log(level, aVar + " HEADERS: streamId=" + i + " headers=" + list + " endStream=" + z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo53626e(C13905a aVar, long j) {
        if (m32100a()) {
            Logger logger = this.f22777a;
            Level level = this.f22778b;
            logger.log(level, aVar + " PING: ack=false bytes=" + j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo53627f(C13905a aVar, long j) {
        if (m32100a()) {
            Logger logger = this.f22777a;
            Level level = this.f22778b;
            logger.log(level, aVar + " PING: ack=true bytes=" + j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo53628g(C13905a aVar, int i, int i2, List<C10871d> list) {
        if (m32100a()) {
            Logger logger = this.f22777a;
            Level level = this.f22778b;
            logger.log(level, aVar + " PUSH_PROMISE: streamId=" + i + " promisedStreamId=" + i2 + " headers=" + list);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo53629h(C13905a aVar, int i, C10867a aVar2) {
        if (m32100a()) {
            Logger logger = this.f22777a;
            Level level = this.f22778b;
            logger.log(level, aVar + " RST_STREAM: streamId=" + i + " errorCode=" + aVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo53630i(C13905a aVar, C10883i iVar) {
        if (m32100a()) {
            Logger logger = this.f22777a;
            Level level = this.f22778b;
            logger.log(level, aVar + " SETTINGS: ack=false settings=" + m32101l(iVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo53631j(C13905a aVar) {
        if (m32100a()) {
            Logger logger = this.f22777a;
            Level level = this.f22778b;
            logger.log(level, aVar + " SETTINGS: ack=true");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo53632k(C13905a aVar, int i, long j) {
        if (m32100a()) {
            Logger logger = this.f22777a;
            Level level = this.f22778b;
            logger.log(level, aVar + " WINDOW_UPDATE: streamId=" + i + " windowSizeIncrement=" + j);
        }
    }

    C13904i(Level level, Logger logger) {
        this.f22778b = (Level) C8012n.m15756o(level, "level");
        this.f22777a = (Logger) C8012n.m15756o(logger, "logger");
    }
}
