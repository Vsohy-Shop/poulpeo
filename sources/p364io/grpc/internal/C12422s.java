package p364io.grpc.internal;

import java.util.concurrent.Executor;
import p364io.grpc.C12159b;
import p364io.grpc.C12161c;
import p364io.grpc.C12564o;
import p458xd.C13783d0;
import p458xd.C13840y;

/* renamed from: io.grpc.internal.s */
/* compiled from: ClientTransport */
public interface C12422s extends C13840y<Object> {

    /* renamed from: io.grpc.internal.s$a */
    /* compiled from: ClientTransport */
    public interface C12423a {
        /* renamed from: a */
        void mo49774a(Throwable th);

        /* renamed from: b */
        void mo49775b(long j);
    }

    /* renamed from: d */
    C12398q mo49699d(C13783d0<?, ?> d0Var, C12564o oVar, C12159b bVar, C12161c[] cVarArr);

    /* renamed from: g */
    void mo49978g(C12423a aVar, Executor executor);
}
