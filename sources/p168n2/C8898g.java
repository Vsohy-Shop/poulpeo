package p168n2;

/* renamed from: n2.g */
/* compiled from: TaskCompletionSource.kt */
public class C8898g<TResult> {

    /* renamed from: a */
    private final C8890f<TResult> f12912a = new C8890f<>();

    /* renamed from: a */
    public final C8890f<TResult> mo43032a() {
        return this.f12912a;
    }

    /* renamed from: b */
    public final void mo43033b() {
        if (!mo43036e()) {
            throw new IllegalStateException("Cannot cancel a completed task.".toString());
        }
    }

    /* renamed from: c */
    public final void mo43034c(Exception exc) {
        if (!mo43037f(exc)) {
            throw new IllegalStateException("Cannot set the error on a completed task.".toString());
        }
    }

    /* renamed from: d */
    public final void mo43035d(TResult tresult) {
        if (!mo43038g(tresult)) {
            throw new IllegalStateException("Cannot set the result of a completed task.".toString());
        }
    }

    /* renamed from: e */
    public final boolean mo43036e() {
        return this.f12912a.mo43020r();
    }

    /* renamed from: f */
    public final boolean mo43037f(Exception exc) {
        return this.f12912a.mo43021s(exc);
    }

    /* renamed from: g */
    public final boolean mo43038g(TResult tresult) {
        return this.f12912a.mo43022t(tresult);
    }
}
