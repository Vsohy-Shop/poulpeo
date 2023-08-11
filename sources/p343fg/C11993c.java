package p343fg;

import p331dg.C11847o;
import p466yf.C13971h0;

/* renamed from: fg.c */
/* compiled from: Dispatcher.kt */
public final class C11993c extends C11996f {

    /* renamed from: h */
    public static final C11993c f18743h = new C11993c();

    private C11993c() {
        super(C12002l.f18756c, C12002l.f18757d, C12002l.f18758e, C12002l.f18754a);
    }

    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    public C13971h0 limitedParallelism(int i) {
        C11847o.m25529a(i);
        if (i >= C12002l.f18756c) {
            return this;
        }
        return super.limitedParallelism(i);
    }

    public String toString() {
        return "Dispatchers.Default";
    }
}
