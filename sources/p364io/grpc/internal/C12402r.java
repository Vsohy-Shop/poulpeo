package p364io.grpc.internal;

import p364io.grpc.C12564o;
import p364io.grpc.C12594t;

/* renamed from: io.grpc.internal.r */
/* compiled from: ClientStreamListener */
public interface C12402r extends C12343k2 {

    /* renamed from: io.grpc.internal.r$a */
    /* compiled from: ClientStreamListener */
    public enum C12403a {
        PROCESSED,
        REFUSED,
        DROPPED
    }

    /* renamed from: b */
    void mo49738b(C12564o oVar);

    /* renamed from: d */
    void mo49740d(C12594t tVar, C12403a aVar, C12564o oVar);
}
