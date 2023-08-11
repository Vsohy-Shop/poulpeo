package p364io.grpc.internal;

import p458xd.C13815o;

/* renamed from: io.grpc.internal.x */
/* compiled from: ContextRunnable */
abstract class C12459x implements Runnable {

    /* renamed from: b */
    private final C13815o f19881b;

    protected C12459x(C13815o oVar) {
        this.f19881b = oVar;
    }

    /* renamed from: a */
    public abstract void mo49858a();

    public final void run() {
        C13815o b = this.f19881b.mo53475b();
        try {
            mo49858a();
        } finally {
            this.f19881b.mo53477f(b);
        }
    }
}
