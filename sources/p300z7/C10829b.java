package p300z7;

import android.app.Application;
import com.bumptech.glide.C4371h;
import java.util.Map;
import p026a8.C2220c;
import p026a8.C2221d;
import p026a8.C2222e;
import p026a8.C2223f;
import p223s7.C9564q;
import p256v7.C10031b;
import p256v7.C10042d;
import p267w7.C10131b;
import p267w7.C10133d;
import p278x7.C10561a;
import p278x7.C10563c;
import p278x7.C10567d;
import p278x7.C10569e;
import p278x7.C10572f;
import p278x7.C10573g;
import p278x7.C10579j;
import p278x7.C10580k;
import p278x7.C10582l;
import p278x7.C10588o;
import p330df.C11814a;

/* renamed from: z7.b */
/* compiled from: DaggerAppComponent */
public final class C10829b implements C10828a {

    /* renamed from: a */
    private C11814a<C9564q> f16589a;

    /* renamed from: b */
    private C11814a<Map<String, C11814a<C10582l>>> f16590b;

    /* renamed from: c */
    private C11814a<Application> f16591c;

    /* renamed from: d */
    private C11814a<C10579j> f16592d;

    /* renamed from: e */
    private C11814a<C4371h> f16593e;

    /* renamed from: f */
    private C11814a<C10569e> f16594f;

    /* renamed from: g */
    private C11814a<C10573g> f16595g;

    /* renamed from: h */
    private C11814a<C10561a> f16596h;

    /* renamed from: i */
    private C11814a<C10563c> f16597i;

    /* renamed from: j */
    private C11814a<C10031b> f16598j;

    /* renamed from: z7.b$b */
    /* compiled from: DaggerAppComponent */
    public static final class C10831b {

        /* renamed from: a */
        private C2222e f16599a;

        /* renamed from: b */
        private C2220c f16600b;

        /* renamed from: c */
        private C10843f f16601c;

        /* renamed from: a */
        public C10828a mo45779a() {
            C10133d.m21324a(this.f16599a, C2222e.class);
            if (this.f16600b == null) {
                this.f16600b = new C2220c();
            }
            C10133d.m21324a(this.f16601c, C10843f.class);
            return new C10829b(this.f16599a, this.f16600b, this.f16601c);
        }

        /* renamed from: b */
        public C10831b mo45780b(C2222e eVar) {
            this.f16599a = (C2222e) C10133d.m21325b(eVar);
            return this;
        }

        /* renamed from: c */
        public C10831b mo45781c(C10843f fVar) {
            this.f16601c = (C10843f) C10133d.m21325b(fVar);
            return this;
        }

        private C10831b() {
        }
    }

    /* renamed from: z7.b$c */
    /* compiled from: DaggerAppComponent */
    private static class C10832c implements C11814a<C10573g> {

        /* renamed from: a */
        private final C10843f f16602a;

        C10832c(C10843f fVar) {
            this.f16602a = fVar;
        }

        /* renamed from: a */
        public C10573g get() {
            return (C10573g) C10133d.m21326c(this.f16602a.mo45792a(), "Cannot return null from a non-@Nullable component method");
        }
    }

    /* renamed from: z7.b$d */
    /* compiled from: DaggerAppComponent */
    private static class C10833d implements C11814a<C10561a> {

        /* renamed from: a */
        private final C10843f f16603a;

        C10833d(C10843f fVar) {
            this.f16603a = fVar;
        }

        /* renamed from: a */
        public C10561a get() {
            return (C10561a) C10133d.m21326c(this.f16603a.mo45795d(), "Cannot return null from a non-@Nullable component method");
        }
    }

    /* renamed from: z7.b$e */
    /* compiled from: DaggerAppComponent */
    private static class C10834e implements C11814a<Map<String, C11814a<C10582l>>> {

        /* renamed from: a */
        private final C10843f f16604a;

        C10834e(C10843f fVar) {
            this.f16604a = fVar;
        }

        /* renamed from: a */
        public Map<String, C11814a<C10582l>> get() {
            return (Map) C10133d.m21326c(this.f16604a.mo45794c(), "Cannot return null from a non-@Nullable component method");
        }
    }

    /* renamed from: z7.b$f */
    /* compiled from: DaggerAppComponent */
    private static class C10835f implements C11814a<Application> {

        /* renamed from: a */
        private final C10843f f16605a;

        C10835f(C10843f fVar) {
            this.f16605a = fVar;
        }

        /* renamed from: a */
        public Application get() {
            return (Application) C10133d.m21326c(this.f16605a.mo45793b(), "Cannot return null from a non-@Nullable component method");
        }
    }

    /* renamed from: b */
    public static C10831b m23089b() {
        return new C10831b();
    }

    /* renamed from: c */
    private void m23090c(C2222e eVar, C2220c cVar, C10843f fVar) {
        this.f16589a = C10131b.m21319a(C2223f.m1876a(eVar));
        this.f16590b = new C10834e(fVar);
        this.f16591c = new C10835f(fVar);
        C11814a<C10579j> a = C10131b.m21319a(C10580k.m22470a());
        this.f16592d = a;
        C11814a<C4371h> a2 = C10131b.m21319a(C2221d.m1872a(cVar, this.f16591c, a));
        this.f16593e = a2;
        this.f16594f = C10131b.m21319a(C10572f.m22448a(a2));
        this.f16595g = new C10832c(fVar);
        this.f16596h = new C10833d(fVar);
        this.f16597i = C10131b.m21319a(C10567d.m22429a());
        this.f16598j = C10131b.m21319a(C10042d.m21086a(this.f16589a, this.f16590b, this.f16594f, C10588o.m22523a(), C10588o.m22523a(), this.f16595g, this.f16591c, this.f16596h, this.f16597i));
    }

    /* renamed from: a */
    public C10031b mo45778a() {
        return this.f16598j.get();
    }

    private C10829b(C2222e eVar, C2220c cVar, C10843f fVar) {
        m23090c(eVar, cVar, fVar);
    }
}
