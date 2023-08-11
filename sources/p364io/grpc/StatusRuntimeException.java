package p364io.grpc;

/* renamed from: io.grpc.StatusRuntimeException */
public class StatusRuntimeException extends RuntimeException {
    private static final long serialVersionUID = 1950934672280720624L;

    /* renamed from: b */
    private final C12594t f19044b;

    /* renamed from: c */
    private final C12564o f19045c;

    /* renamed from: d */
    private final boolean f19046d;

    public StatusRuntimeException(C12594t tVar) {
        this(tVar, (C12564o) null);
    }

    /* renamed from: a */
    public final C12594t mo49604a() {
        return this.f19044b;
    }

    /* renamed from: b */
    public final C12564o mo49605b() {
        return this.f19045c;
    }

    public synchronized Throwable fillInStackTrace() {
        Throwable th;
        if (this.f19046d) {
            th = super.fillInStackTrace();
        } else {
            th = this;
        }
        return th;
    }

    public StatusRuntimeException(C12594t tVar, C12564o oVar) {
        this(tVar, oVar, true);
    }

    StatusRuntimeException(C12594t tVar, C12564o oVar, boolean z) {
        super(C12594t.m27922h(tVar), tVar.mo50305m());
        this.f19044b = tVar;
        this.f19045c = oVar;
        this.f19046d = z;
        fillInStackTrace();
    }
}
