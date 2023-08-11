package p099g6;

/* renamed from: g6.f */
final class C7784f implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C7781c f10816b;

    /* renamed from: c */
    final /* synthetic */ C7785g f10817c;

    C7784f(C7785g gVar, C7781c cVar) {
        this.f10817c = gVar;
        this.f10816b = cVar;
    }

    public final void run() {
        synchronized (this.f10817c.f10819b) {
            if (this.f10817c.f10820c != null) {
                this.f10817c.f10820c.mo39358b(this.f10816b.mo41425e());
            }
        }
    }
}
