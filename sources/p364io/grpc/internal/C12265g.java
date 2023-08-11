package p364io.grpc.internal;

import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;
import p111h6.C8012n;
import p364io.grpc.internal.C12343k2;
import p364io.grpc.internal.C12350l1;

/* renamed from: io.grpc.internal.g */
/* compiled from: ApplicationThreadDeframerListener */
final class C12265g implements C12350l1.C12352b {

    /* renamed from: a */
    private final C12269d f19321a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C12350l1.C12352b f19322b;

    /* renamed from: c */
    private final Queue<InputStream> f19323c = new ArrayDeque();

    /* renamed from: io.grpc.internal.g$a */
    /* compiled from: ApplicationThreadDeframerListener */
    class C12266a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ int f19324b;

        C12266a(int i) {
            this.f19324b = i;
        }

        public void run() {
            C12265g.this.f19322b.mo49832c(this.f19324b);
        }
    }

    /* renamed from: io.grpc.internal.g$b */
    /* compiled from: ApplicationThreadDeframerListener */
    class C12267b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ boolean f19326b;

        C12267b(boolean z) {
            this.f19326b = z;
        }

        public void run() {
            C12265g.this.f19322b.mo49694b(this.f19326b);
        }
    }

    /* renamed from: io.grpc.internal.g$c */
    /* compiled from: ApplicationThreadDeframerListener */
    class C12268c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Throwable f19328b;

        C12268c(Throwable th) {
            this.f19328b = th;
        }

        public void run() {
            C12265g.this.f19322b.mo49833d(this.f19328b);
        }
    }

    /* renamed from: io.grpc.internal.g$d */
    /* compiled from: ApplicationThreadDeframerListener */
    public interface C12269d {
        /* renamed from: e */
        void mo49838e(Runnable runnable);
    }

    public C12265g(C12350l1.C12352b bVar, C12269d dVar) {
        this.f19322b = (C12350l1.C12352b) C8012n.m15756o(bVar, "listener");
        this.f19321a = (C12269d) C8012n.m15756o(dVar, "transportExecutor");
    }

    /* renamed from: a */
    public void mo49779a(C12343k2.C12344a aVar) {
        while (true) {
            InputStream next = aVar.next();
            if (next != null) {
                this.f19323c.add(next);
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public void mo49694b(boolean z) {
        this.f19321a.mo49838e(new C12267b(z));
    }

    /* renamed from: c */
    public void mo49832c(int i) {
        this.f19321a.mo49838e(new C12266a(i));
    }

    /* renamed from: d */
    public void mo49833d(Throwable th) {
        this.f19321a.mo49838e(new C12268c(th));
    }

    /* renamed from: f */
    public InputStream mo49834f() {
        return this.f19323c.poll();
    }
}
