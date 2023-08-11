package p364io.grpc.internal;

import java.io.Closeable;
import p364io.grpc.internal.C12343k2;
import p364io.grpc.internal.C12350l1;

/* renamed from: io.grpc.internal.h2 */
/* compiled from: SquelchLateMessagesAvailableDeframerListener */
final class C12319h2 extends C12349l0 {

    /* renamed from: a */
    private final C12350l1.C12352b f19536a;

    /* renamed from: b */
    private boolean f19537b;

    public C12319h2(C12350l1.C12352b bVar) {
        this.f19536a = bVar;
    }

    /* renamed from: a */
    public void mo49779a(C12343k2.C12344a aVar) {
        if (!this.f19537b) {
            super.mo49779a(aVar);
        } else if (aVar instanceof Closeable) {
            C12404r0.m27326e((Closeable) aVar);
        }
    }

    /* renamed from: b */
    public void mo49694b(boolean z) {
        this.f19537b = true;
        super.mo49694b(z);
    }

    /* renamed from: d */
    public void mo49833d(Throwable th) {
        this.f19537b = true;
        super.mo49833d(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C12350l1.C12352b mo49933e() {
        return this.f19536a;
    }
}
