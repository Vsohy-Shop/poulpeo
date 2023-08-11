package p364io.grpc;

import p111h6.C8003j;
import p111h6.C8012n;
import p458xd.C13802i0;

/* renamed from: io.grpc.c */
/* compiled from: ClientStreamTracer */
public abstract class C12161c extends C13802i0 {

    /* renamed from: io.grpc.c$a */
    /* compiled from: ClientStreamTracer */
    public static abstract class C12162a {
        /* renamed from: a */
        public C12161c mo49641a(C12164c cVar, C12564o oVar) {
            throw new UnsupportedOperationException("Not implemented");
        }
    }

    /* renamed from: io.grpc.c$b */
    /* compiled from: ClientStreamTracer */
    public static abstract class C12163b extends C12162a {
    }

    /* renamed from: io.grpc.c$c */
    /* compiled from: ClientStreamTracer */
    public static final class C12164c {

        /* renamed from: a */
        private final C12155a f19065a;

        /* renamed from: b */
        private final C12159b f19066b;

        /* renamed from: c */
        private final int f19067c;

        /* renamed from: d */
        private final boolean f19068d;

        /* renamed from: io.grpc.c$c$a */
        /* compiled from: ClientStreamTracer */
        public static final class C12165a {

            /* renamed from: a */
            private C12155a f19069a = C12155a.f19047b;

            /* renamed from: b */
            private C12159b f19070b = C12159b.f19052k;

            /* renamed from: c */
            private int f19071c;

            /* renamed from: d */
            private boolean f19072d;

            C12165a() {
            }

            /* renamed from: a */
            public C12164c mo49644a() {
                return new C12164c(this.f19069a, this.f19070b, this.f19071c, this.f19072d);
            }

            /* renamed from: b */
            public C12165a mo49645b(C12159b bVar) {
                this.f19070b = (C12159b) C8012n.m15756o(bVar, "callOptions cannot be null");
                return this;
            }

            /* renamed from: c */
            public C12165a mo49646c(boolean z) {
                this.f19072d = z;
                return this;
            }

            /* renamed from: d */
            public C12165a mo49647d(int i) {
                this.f19071c = i;
                return this;
            }

            @Deprecated
            /* renamed from: e */
            public C12165a mo49648e(C12155a aVar) {
                this.f19069a = (C12155a) C8012n.m15756o(aVar, "transportAttrs cannot be null");
                return this;
            }
        }

        C12164c(C12155a aVar, C12159b bVar, int i, boolean z) {
            this.f19065a = (C12155a) C8012n.m15756o(aVar, "transportAttrs");
            this.f19066b = (C12159b) C8012n.m15756o(bVar, "callOptions");
            this.f19067c = i;
            this.f19068d = z;
        }

        /* renamed from: a */
        public static C12165a m26547a() {
            return new C12165a();
        }

        /* renamed from: b */
        public C12165a mo49642b() {
            return new C12165a().mo49645b(this.f19066b).mo49648e(this.f19065a).mo49647d(this.f19067c).mo49646c(this.f19068d);
        }

        public String toString() {
            return C8003j.m15723c(this).mo41840d("transportAttrs", this.f19065a).mo41840d("callOptions", this.f19066b).mo41838b("previousAttempts", this.f19067c).mo41841e("isTransparentRetry", this.f19068d).toString();
        }
    }

    /* renamed from: j */
    public void mo49637j() {
    }

    /* renamed from: l */
    public void mo49639l() {
    }

    /* renamed from: k */
    public void mo49638k(C12564o oVar) {
    }

    /* renamed from: m */
    public void mo49640m(C12155a aVar, C12564o oVar) {
    }
}
