package p137k1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import com.bumptech.glide.C4368f;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p058d1.C7214a;
import p058d1.C7218e;
import p058d1.C7222g;
import p070e1.C7422d;
import p137k1.C8476n;
import p294z1.C10791j;

/* renamed from: k1.q */
/* compiled from: MultiModelLoader */
class C8482q<Model, Data> implements C8476n<Model, Data> {

    /* renamed from: a */
    private final List<C8476n<Model, Data>> f12078a;

    /* renamed from: b */
    private final Pools.Pool<List<Throwable>> f12079b;

    /* renamed from: k1.q$a */
    /* compiled from: MultiModelLoader */
    static class C8483a<Data> implements C7422d<Data>, C7422d.C7423a<Data> {

        /* renamed from: b */
        private final List<C7422d<Data>> f12080b;

        /* renamed from: c */
        private final Pools.Pool<List<Throwable>> f12081c;

        /* renamed from: d */
        private int f12082d = 0;

        /* renamed from: e */
        private C4368f f12083e;

        /* renamed from: f */
        private C7422d.C7423a<? super Data> f12084f;
        @Nullable

        /* renamed from: g */
        private List<Throwable> f12085g;

        /* renamed from: h */
        private boolean f12086h;

        C8483a(@NonNull List<C7422d<Data>> list, @NonNull Pools.Pool<List<Throwable>> pool) {
            this.f12081c = pool;
            C10791j.m22947c(list);
            this.f12080b = list;
        }

        /* renamed from: g */
        private void m16989g() {
            if (!this.f12086h) {
                if (this.f12082d < this.f12080b.size() - 1) {
                    this.f12082d++;
                    mo41078e(this.f12083e, this.f12084f);
                    return;
                }
                C10791j.m22948d(this.f12085g);
                this.f12084f.mo31269c(new GlideException("Fetch failed", (List<Throwable>) new ArrayList(this.f12085g)));
            }
        }

        @NonNull
        /* renamed from: a */
        public Class<Data> mo41069a() {
            return this.f12080b.get(0).mo41069a();
        }

        /* renamed from: b */
        public void mo41074b() {
            List<Throwable> list = this.f12085g;
            if (list != null) {
                this.f12081c.release(list);
            }
            this.f12085g = null;
            for (C7422d<Data> b : this.f12080b) {
                b.mo41074b();
            }
        }

        /* renamed from: c */
        public void mo31269c(@NonNull Exception exc) {
            ((List) C10791j.m22948d(this.f12085g)).add(exc);
            m16989g();
        }

        public void cancel() {
            this.f12086h = true;
            for (C7422d<Data> cancel : this.f12080b) {
                cancel.cancel();
            }
        }

        @NonNull
        /* renamed from: d */
        public C7214a mo41077d() {
            return this.f12080b.get(0).mo41077d();
        }

        /* renamed from: e */
        public void mo41078e(@NonNull C4368f fVar, @NonNull C7422d.C7423a<? super Data> aVar) {
            this.f12083e = fVar;
            this.f12084f = aVar;
            this.f12085g = this.f12081c.acquire();
            this.f12080b.get(this.f12082d).mo41078e(fVar, this);
            if (this.f12086h) {
                cancel();
            }
        }

        /* renamed from: f */
        public void mo31271f(@Nullable Data data) {
            if (data != null) {
                this.f12084f.mo31271f(data);
            } else {
                m16989g();
            }
        }
    }

    C8482q(@NonNull List<C8476n<Model, Data>> list, @NonNull Pools.Pool<List<Throwable>> pool) {
        this.f12078a = list;
        this.f12079b = pool;
    }

    /* renamed from: a */
    public boolean mo42457a(@NonNull Model model) {
        for (C8476n<Model, Data> a : this.f12078a) {
            if (a.mo42457a(model)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public C8476n.C8477a<Data> mo42458b(@NonNull Model model, int i, int i2, @NonNull C7222g gVar) {
        C8476n.C8477a b;
        int size = this.f12078a.size();
        ArrayList arrayList = new ArrayList(size);
        C7218e eVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            C8476n nVar = this.f12078a.get(i3);
            if (nVar.mo42457a(model) && (b = nVar.mo42458b(model, i, i2, gVar)) != null) {
                eVar = b.f12071a;
                arrayList.add(b.f12073c);
            }
        }
        if (arrayList.isEmpty() || eVar == null) {
            return null;
        }
        return new C8476n.C8477a<>(eVar, new C8483a(arrayList, this.f12079b));
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f12078a.toArray()) + '}';
    }
}
