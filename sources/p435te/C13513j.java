package p435te;

import p341fe.C11958o;
import p341fe.C11961q;
import p403oe.C13071h;
import p435te.C13516l;

/* renamed from: te.j */
/* compiled from: ObservableJust */
public final class C13513j<T> extends C11958o<T> implements C13071h<T> {

    /* renamed from: b */
    private final T f21752b;

    public C13513j(T t) {
        this.f21752b = t;
    }

    public T call() {
        return this.f21752b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo46143s(C11961q<? super T> qVar) {
        C13516l.C13517a aVar = new C13516l.C13517a(qVar, this.f21752b);
        qVar.mo46140c(aVar);
        aVar.run();
    }
}
