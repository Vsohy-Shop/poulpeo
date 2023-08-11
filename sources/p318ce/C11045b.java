package p318ce;

import java.util.concurrent.TimeUnit;
import p111h6.C8012n;
import p318ce.C11045b;
import p364io.grpc.C12159b;
import p458xd.C13777b;

/* renamed from: ce.b */
/* compiled from: AbstractStub */
public abstract class C11045b<S extends C11045b<S>> {

    /* renamed from: a */
    private final C13777b f17127a;

    /* renamed from: b */
    private final C12159b f17128b;

    /* renamed from: ce.b$a */
    /* compiled from: AbstractStub */
    public interface C11046a<T extends C11045b<T>> {
        /* renamed from: a */
        T mo44745a(C13777b bVar, C12159b bVar2);
    }

    protected C11045b(C13777b bVar, C12159b bVar2) {
        this.f17127a = (C13777b) C8012n.m15756o(bVar, "channel");
        this.f17128b = (C12159b) C8012n.m15756o(bVar2, "callOptions");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract S mo44747a(C13777b bVar, C12159b bVar2);

    /* renamed from: b */
    public final C12159b mo46128b() {
        return this.f17128b;
    }

    /* renamed from: c */
    public final C13777b mo46129c() {
        return this.f17127a;
    }

    /* renamed from: d */
    public final S mo46130d(long j, TimeUnit timeUnit) {
        return mo44747a(this.f17127a, this.f17128b.mo49627l(j, timeUnit));
    }
}
