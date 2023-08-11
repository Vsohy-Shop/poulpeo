package p300z7;

import android.app.Application;
import android.util.DisplayMetrics;
import java.util.Map;
import p026a8.C2218a;
import p026a8.C2219b;
import p026a8.C2224g;
import p026a8.C2226h;
import p026a8.C2227i;
import p026a8.C2228j;
import p026a8.C2229k;
import p026a8.C2230l;
import p026a8.C2231m;
import p026a8.C2232n;
import p026a8.C2233o;
import p026a8.C2234p;
import p267w7.C10131b;
import p267w7.C10132c;
import p267w7.C10133d;
import p278x7.C10561a;
import p278x7.C10562b;
import p278x7.C10573g;
import p278x7.C10576h;
import p278x7.C10582l;
import p330df.C11814a;

/* renamed from: z7.d */
/* compiled from: DaggerUniversalComponent */
public final class C10839d implements C10843f {

    /* renamed from: a */
    private final C2224g f16614a;

    /* renamed from: b */
    private C11814a<Application> f16615b;

    /* renamed from: c */
    private C11814a<C10573g> f16616c;

    /* renamed from: d */
    private C11814a<C10561a> f16617d;

    /* renamed from: e */
    private C11814a<DisplayMetrics> f16618e;

    /* renamed from: f */
    private C11814a<C10582l> f16619f;

    /* renamed from: g */
    private C11814a<C10582l> f16620g;

    /* renamed from: h */
    private C11814a<C10582l> f16621h;

    /* renamed from: i */
    private C11814a<C10582l> f16622i;

    /* renamed from: j */
    private C11814a<C10582l> f16623j;

    /* renamed from: k */
    private C11814a<C10582l> f16624k;

    /* renamed from: l */
    private C11814a<C10582l> f16625l;

    /* renamed from: m */
    private C11814a<C10582l> f16626m;

    /* renamed from: z7.d$b */
    /* compiled from: DaggerUniversalComponent */
    public static final class C10841b {

        /* renamed from: a */
        private C2218a f16627a;

        /* renamed from: b */
        private C2224g f16628b;

        /* renamed from: a */
        public C10841b mo45796a(C2218a aVar) {
            this.f16627a = (C2218a) C10133d.m21325b(aVar);
            return this;
        }

        /* renamed from: b */
        public C10843f mo45797b() {
            C10133d.m21324a(this.f16627a, C2218a.class);
            if (this.f16628b == null) {
                this.f16628b = new C2224g();
            }
            return new C10839d(this.f16627a, this.f16628b);
        }

        private C10841b() {
        }
    }

    /* renamed from: e */
    public static C10841b m23107e() {
        return new C10841b();
    }

    /* renamed from: f */
    private void m23108f(C2218a aVar, C2224g gVar) {
        this.f16615b = C10131b.m21319a(C2219b.m1868a(aVar));
        this.f16616c = C10131b.m21319a(C10576h.m22464a());
        this.f16617d = C10131b.m21319a(C10562b.m22423a(this.f16615b));
        C2230l a = C2230l.m1901a(gVar, this.f16615b);
        this.f16618e = a;
        this.f16619f = C2234p.m1913a(gVar, a);
        this.f16620g = C2231m.m1904a(gVar, this.f16618e);
        this.f16621h = C2232n.m1907a(gVar, this.f16618e);
        this.f16622i = C2233o.m1910a(gVar, this.f16618e);
        this.f16623j = C2228j.m1895a(gVar, this.f16618e);
        this.f16624k = C2229k.m1898a(gVar, this.f16618e);
        this.f16625l = C2227i.m1892a(gVar, this.f16618e);
        this.f16626m = C2226h.m1889a(gVar, this.f16618e);
    }

    /* renamed from: a */
    public C10573g mo45792a() {
        return this.f16616c.get();
    }

    /* renamed from: b */
    public Application mo45793b() {
        return this.f16615b.get();
    }

    /* renamed from: c */
    public Map<String, C11814a<C10582l>> mo45794c() {
        return C10132c.m21321b(8).mo44729c("IMAGE_ONLY_PORTRAIT", this.f16619f).mo44729c("IMAGE_ONLY_LANDSCAPE", this.f16620g).mo44729c("MODAL_LANDSCAPE", this.f16621h).mo44729c("MODAL_PORTRAIT", this.f16622i).mo44729c("CARD_LANDSCAPE", this.f16623j).mo44729c("CARD_PORTRAIT", this.f16624k).mo44729c("BANNER_PORTRAIT", this.f16625l).mo44729c("BANNER_LANDSCAPE", this.f16626m).mo44728a();
    }

    /* renamed from: d */
    public C10561a mo45795d() {
        return this.f16617d.get();
    }

    private C10839d(C2218a aVar, C2224g gVar) {
        this.f16614a = gVar;
        m23108f(aVar, gVar);
    }
}
