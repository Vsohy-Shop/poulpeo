package p458xd;

import java.util.concurrent.Executor;
import p111h6.C8012n;
import p458xd.C13773a;

/* renamed from: xd.j */
/* compiled from: CompositeCallCredentials */
public final class C13803j extends C13773a {

    /* renamed from: a */
    private final C13773a f22245a;

    /* renamed from: b */
    private final C13773a f22246b;

    /* renamed from: xd.j$a */
    /* compiled from: CompositeCallCredentials */
    private final class C13804a extends C13773a.C13774a {

        /* renamed from: a */
        private final C13773a.C13775b f22247a;

        /* renamed from: b */
        private final Executor f22248b;

        /* renamed from: c */
        private final C13773a.C13774a f22249c;

        /* renamed from: d */
        private final C13815o f22250d;

        public C13804a(C13773a.C13775b bVar, Executor executor, C13773a.C13774a aVar, C13815o oVar) {
            this.f22247a = bVar;
            this.f22248b = executor;
            this.f22249c = (C13773a.C13774a) C8012n.m15756o(aVar, "delegate");
            this.f22250d = (C13815o) C8012n.m15756o(oVar, "context");
        }
    }

    public C13803j(C13773a aVar, C13773a aVar2) {
        this.f22245a = (C13773a) C8012n.m15756o(aVar, "creds1");
        this.f22246b = (C13773a) C8012n.m15756o(aVar2, "creds2");
    }

    /* renamed from: a */
    public void mo53436a(C13773a.C13775b bVar, Executor executor, C13773a.C13774a aVar) {
        this.f22245a.mo53436a(bVar, executor, new C13804a(bVar, executor, aVar, C13815o.m31725e()));
    }
}
