package p268w8;

import p312be.C10936b;
import p318ce.C11044a;
import p318ce.C11045b;
import p318ce.C11047c;
import p364io.grpc.C12159b;
import p458xd.C13777b;
import p458xd.C13783d0;

/* renamed from: w8.g */
/* compiled from: InAppMessagingSdkServingGrpc */
public final class C10150g {

    /* renamed from: a */
    private static volatile C13783d0<C10143d, C10146e> f15333a;

    /* renamed from: w8.g$a */
    /* compiled from: InAppMessagingSdkServingGrpc */
    class C10151a implements C11045b.C11046a<C10152b> {
        C10151a() {
        }

        /* renamed from: b */
        public C10152b mo44745a(C13777b bVar, C12159b bVar2) {
            return new C10152b(bVar, bVar2, (C10149f) null);
        }
    }

    /* renamed from: w8.g$b */
    /* compiled from: InAppMessagingSdkServingGrpc */
    public static final class C10152b extends C11044a<C10152b> {
        /* synthetic */ C10152b(C13777b bVar, C12159b bVar2, C10149f fVar) {
            this(bVar, bVar2);
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public C10152b mo44747a(C13777b bVar, C12159b bVar2) {
            return new C10152b(bVar, bVar2);
        }

        /* renamed from: h */
        public C10146e mo44749h(C10143d dVar) {
            return (C10146e) C11047c.m23828b(mo46129c(), C10150g.m21387a(), mo46128b(), dVar);
        }

        private C10152b(C13777b bVar, C12159b bVar2) {
            super(bVar, bVar2);
        }
    }

    private C10150g() {
    }

    /* renamed from: a */
    public static C13783d0<C10143d, C10146e> m21387a() {
        C13783d0<C10143d, C10146e> d0Var = f15333a;
        if (d0Var == null) {
            synchronized (C10150g.class) {
                d0Var = f15333a;
                if (d0Var == null) {
                    d0Var = C13783d0.m31650g().mo53449f(C13783d0.C13787d.UNARY).mo53445b(C13783d0.m31649b("google.internal.firebase.inappmessaging.v1.sdkserving.InAppMessagingSdkServing", "FetchEligibleCampaigns")).mo53448e(true).mo53446c(C10936b.m23559b(C10143d.m21367R())).mo53447d(C10936b.m23559b(C10146e.m21379K())).mo53444a();
                    f15333a = d0Var;
                }
            }
        }
        return d0Var;
    }

    /* renamed from: b */
    public static C10152b m21388b(C13777b bVar) {
        return (C10152b) C11044a.m23820e(new C10151a(), bVar);
    }
}
