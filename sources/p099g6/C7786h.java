package p099g6;

/* renamed from: g6.h */
final class C7786h implements Runnable {

    /* renamed from: b */
    final /* synthetic */ C7781c f10821b;

    /* renamed from: c */
    final /* synthetic */ C7787i f10822c;

    C7786h(C7787i iVar, C7781c cVar) {
        this.f10822c = iVar;
        this.f10821b = cVar;
    }

    public final void run() {
        synchronized (this.f10822c.f10824b) {
            if (this.f10822c.f10825c != null) {
                this.f10822c.f10825c.mo39354a(this.f10821b.mo41426f());
            }
        }
    }
}
