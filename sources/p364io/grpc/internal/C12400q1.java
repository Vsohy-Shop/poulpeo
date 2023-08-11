package p364io.grpc.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;
import p111h6.C8003j;
import p364io.grpc.C12159b;
import p364io.grpc.C12169g;
import p364io.grpc.internal.C12383p;
import p458xd.C13780c0;
import p458xd.C13783d0;
import p458xd.C13788e;
import p458xd.C13840y;
import p458xd.C13841z;

/* renamed from: io.grpc.internal.q1 */
/* compiled from: OobChannel */
final class C12400q1 extends C13780c0 implements C13840y<Object> {

    /* renamed from: h */
    private static final Logger f19730h = Logger.getLogger(C12400q1.class.getName());

    /* renamed from: a */
    private C12463y0 f19731a;

    /* renamed from: b */
    private final C13841z f19732b;

    /* renamed from: c */
    private final String f19733c;

    /* renamed from: d */
    private final Executor f19734d;

    /* renamed from: e */
    private final ScheduledExecutorService f19735e;

    /* renamed from: f */
    private final C12358m f19736f;

    /* renamed from: g */
    private final C12383p.C12392e f19737g;

    /* renamed from: a */
    public String mo49840a() {
        return this.f19733c;
    }

    /* renamed from: f */
    public C13841z mo49701f() {
        return this.f19732b;
    }

    /* renamed from: h */
    public <RequestT, ResponseT> C13788e<RequestT, ResponseT> mo49841h(C13783d0<RequestT, ResponseT> d0Var, C12159b bVar) {
        Executor executor;
        if (bVar.mo49620e() == null) {
            executor = this.f19734d;
        } else {
            executor = bVar.mo49620e();
        }
        return new C12383p(d0Var, executor, bVar, this.f19737g, this.f19735e, this.f19736f, (C12169g) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C12463y0 mo50041i() {
        return this.f19731a;
    }

    public String toString() {
        return C8003j.m15723c(this).mo41839c("logId", this.f19732b.mo53522d()).mo41840d("authority", this.f19733c).toString();
    }
}
