package p088f7;

/* renamed from: f7.a */
/* compiled from: MiddleOutFallbackStrategy */
public class C7606a implements C7609d {

    /* renamed from: a */
    private final int f10577a;

    /* renamed from: b */
    private final C7609d[] f10578b;

    /* renamed from: c */
    private final C7607b f10579c;

    public C7606a(int i, C7609d... dVarArr) {
        this.f10577a = i;
        this.f10578b = dVarArr;
        this.f10579c = new C7607b(i);
    }

    /* renamed from: a */
    public StackTraceElement[] mo41354a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f10577a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (C7609d dVar : this.f10578b) {
            if (stackTraceElementArr2.length <= this.f10577a) {
                break;
            }
            stackTraceElementArr2 = dVar.mo41354a(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > this.f10577a) {
            return this.f10579c.mo41354a(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }
}
