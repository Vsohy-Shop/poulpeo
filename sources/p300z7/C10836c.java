package p300z7;

import android.view.LayoutInflater;
import p026a8.C2235q;
import p026a8.C2236r;
import p026a8.C2237s;
import p026a8.C2238t;
import p101g8.C7817i;
import p267w7.C10131b;
import p267w7.C10133d;
import p278x7.C10582l;
import p289y7.C10701a;
import p289y7.C10702b;
import p289y7.C10704d;
import p289y7.C10706e;
import p289y7.C10707f;
import p289y7.C10708g;
import p289y7.C10709h;
import p289y7.C10711i;
import p330df.C11814a;

/* renamed from: z7.c */
/* compiled from: DaggerInAppMessageComponent */
public final class C10836c implements C10842e {

    /* renamed from: a */
    private C11814a<C10582l> f16606a;

    /* renamed from: b */
    private C11814a<LayoutInflater> f16607b;

    /* renamed from: c */
    private C11814a<C7817i> f16608c;

    /* renamed from: d */
    private C11814a<C10707f> f16609d;

    /* renamed from: e */
    private C11814a<C10709h> f16610e;

    /* renamed from: f */
    private C11814a<C10701a> f16611f;

    /* renamed from: g */
    private C11814a<C10704d> f16612g;

    /* renamed from: z7.c$b */
    /* compiled from: DaggerInAppMessageComponent */
    public static final class C10838b {

        /* renamed from: a */
        private C2235q f16613a;

        /* renamed from: a */
        public C10842e mo45790a() {
            C10133d.m21324a(this.f16613a, C2235q.class);
            return new C10836c(this.f16613a);
        }

        /* renamed from: b */
        public C10838b mo45791b(C2235q qVar) {
            this.f16613a = (C2235q) C10133d.m21325b(qVar);
            return this;
        }

        private C10838b() {
        }
    }

    /* renamed from: e */
    public static C10838b m23099e() {
        return new C10838b();
    }

    /* renamed from: f */
    private void m23100f(C2235q qVar) {
        this.f16606a = C10131b.m21319a(C2236r.m1919a(qVar));
        this.f16607b = C10131b.m21319a(C2238t.m1925a(qVar));
        C2237s a = C2237s.m1922a(qVar);
        this.f16608c = a;
        this.f16609d = C10131b.m21319a(C10708g.m22805a(this.f16606a, this.f16607b, a));
        this.f16610e = C10131b.m21319a(C10711i.m22818a(this.f16606a, this.f16607b, this.f16608c));
        this.f16611f = C10131b.m21319a(C10702b.m22772a(this.f16606a, this.f16607b, this.f16608c));
        this.f16612g = C10131b.m21319a(C10706e.m22798a(this.f16606a, this.f16607b, this.f16608c));
    }

    /* renamed from: a */
    public C10707f mo45786a() {
        return this.f16609d.get();
    }

    /* renamed from: b */
    public C10704d mo45787b() {
        return this.f16612g.get();
    }

    /* renamed from: c */
    public C10701a mo45788c() {
        return this.f16611f.get();
    }

    /* renamed from: d */
    public C10709h mo45789d() {
        return this.f16610e.get();
    }

    private C10836c(C2235q qVar) {
        m23100f(qVar);
    }
}
