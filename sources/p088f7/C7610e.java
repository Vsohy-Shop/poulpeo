package p088f7;

/* renamed from: f7.e */
/* compiled from: TrimmedThrowableData */
public class C7610e {

    /* renamed from: a */
    public final String f10582a;

    /* renamed from: b */
    public final String f10583b;

    /* renamed from: c */
    public final StackTraceElement[] f10584c;

    /* renamed from: d */
    public final C7610e f10585d;

    public C7610e(Throwable th, C7609d dVar) {
        C7610e eVar;
        this.f10582a = th.getLocalizedMessage();
        this.f10583b = th.getClass().getName();
        this.f10584c = dVar.mo41354a(th.getStackTrace());
        Throwable cause = th.getCause();
        if (cause != null) {
            eVar = new C7610e(cause, dVar);
        } else {
            eVar = null;
        }
        this.f10585d = eVar;
    }
}
