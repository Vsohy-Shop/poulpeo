package p364io.grpc;

import androidx.core.app.NotificationCompat;
import p111h6.C8012n;
import p364io.grpc.C12155a;
import p364io.grpc.C12546k;
import p458xd.C13791f;

/* renamed from: io.grpc.g */
/* compiled from: InternalConfigSelector */
public abstract class C12169g {

    /* renamed from: a */
    public static final C12155a.C12158c<C12169g> f19080a = C12155a.C12158c.m26520a("io.grpc.config-selector");

    /* renamed from: io.grpc.g$b */
    /* compiled from: InternalConfigSelector */
    public static final class C12171b {

        /* renamed from: a */
        private final C12594t f19081a;

        /* renamed from: b */
        private final Object f19082b;

        /* renamed from: c */
        public C13791f f19083c;

        /* renamed from: io.grpc.g$b$a */
        /* compiled from: InternalConfigSelector */
        public static final class C12172a {

            /* renamed from: a */
            private Object f19084a;

            /* renamed from: b */
            private C13791f f19085b;

            private C12172a() {
            }

            /* renamed from: a */
            public C12171b mo49658a() {
                boolean z;
                if (this.f19084a != null) {
                    z = true;
                } else {
                    z = false;
                }
                C8012n.m15762u(z, "config is not set");
                return new C12171b(C12594t.f20183f, this.f19084a, this.f19085b);
            }

            /* renamed from: b */
            public C12172a mo49659b(Object obj) {
                this.f19084a = C8012n.m15756o(obj, "config");
                return this;
            }
        }

        /* renamed from: d */
        public static C12172a m26558d() {
            return new C12172a();
        }

        /* renamed from: a */
        public Object mo49655a() {
            return this.f19082b;
        }

        /* renamed from: b */
        public C13791f mo49656b() {
            return this.f19083c;
        }

        /* renamed from: c */
        public C12594t mo49657c() {
            return this.f19081a;
        }

        private C12171b(C12594t tVar, Object obj, C13791f fVar) {
            this.f19081a = (C12594t) C8012n.m15756o(tVar, NotificationCompat.CATEGORY_STATUS);
            this.f19082b = obj;
            this.f19083c = fVar;
        }
    }

    /* renamed from: a */
    public abstract C12171b mo49654a(C12546k.C12553f fVar);
}
