package p364io.grpc;

/* renamed from: io.grpc.StatusException */
public class StatusException extends Exception {
    private static final long serialVersionUID = -660954903976144640L;

    /* renamed from: b */
    private final C12594t f19041b;

    /* renamed from: c */
    private final C12564o f19042c;

    /* renamed from: d */
    private final boolean f19043d;

    public StatusException(C12594t tVar) {
        this(tVar, (C12564o) null);
    }

    /* renamed from: a */
    public final C12594t mo49601a() {
        return this.f19041b;
    }

    /* renamed from: b */
    public final C12564o mo49602b() {
        return this.f19042c;
    }

    public synchronized Throwable fillInStackTrace() {
        Throwable th;
        if (this.f19043d) {
            th = super.fillInStackTrace();
        } else {
            th = this;
        }
        return th;
    }

    public StatusException(C12594t tVar, C12564o oVar) {
        this(tVar, oVar, true);
    }

    StatusException(C12594t tVar, C12564o oVar, boolean z) {
        super(C12594t.m27922h(tVar), tVar.mo50305m());
        this.f19041b = tVar;
        this.f19042c = oVar;
        this.f19043d = z;
        fillInStackTrace();
    }
}
