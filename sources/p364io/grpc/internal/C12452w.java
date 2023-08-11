package p364io.grpc.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import p111h6.C8012n;
import p458xd.C13813m;

/* renamed from: io.grpc.internal.w */
/* compiled from: ConnectivityStateManager */
final class C12452w {

    /* renamed from: a */
    private ArrayList<C12453a> f19870a = new ArrayList<>();

    /* renamed from: b */
    private volatile C13813m f19871b = C13813m.IDLE;

    /* renamed from: io.grpc.internal.w$a */
    /* compiled from: ConnectivityStateManager */
    private static final class C12453a {

        /* renamed from: a */
        final Runnable f19872a;

        /* renamed from: b */
        final Executor f19873b;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo50113a() {
            this.f19873b.execute(this.f19872a);
        }
    }

    C12452w() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50112a(C13813m mVar) {
        C8012n.m15756o(mVar, "newState");
        if (this.f19871b != mVar && this.f19871b != C13813m.SHUTDOWN) {
            this.f19871b = mVar;
            if (!this.f19870a.isEmpty()) {
                ArrayList<C12453a> arrayList = this.f19870a;
                this.f19870a = new ArrayList<>();
                Iterator<C12453a> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().mo50113a();
                }
            }
        }
    }
}
