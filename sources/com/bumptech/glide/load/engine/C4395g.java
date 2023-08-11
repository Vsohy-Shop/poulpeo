package com.bumptech.glide.load.engine;

import com.bumptech.glide.C4366d;
import com.bumptech.glide.C4368f;
import com.bumptech.glide.load.engine.C4396h;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p058d1.C7217d;
import p058d1.C7218e;
import p058d1.C7222g;
import p058d1.C7225j;
import p058d1.C7226k;
import p094g1.C7737a;
import p094g1.C7744c;
import p106h1.C7883b;
import p117i1.C8064a;
import p137k1.C8476n;
import p157m1.C8808k;

/* renamed from: com.bumptech.glide.load.engine.g */
/* compiled from: DecodeHelper */
final class C4395g<Transcode> {

    /* renamed from: a */
    private final List<C8476n.C8477a<?>> f3796a = new ArrayList();

    /* renamed from: b */
    private final List<C7218e> f3797b = new ArrayList();

    /* renamed from: c */
    private C4366d f3798c;

    /* renamed from: d */
    private Object f3799d;

    /* renamed from: e */
    private int f3800e;

    /* renamed from: f */
    private int f3801f;

    /* renamed from: g */
    private Class<?> f3802g;

    /* renamed from: h */
    private C4396h.C4401e f3803h;

    /* renamed from: i */
    private C7222g f3804i;

    /* renamed from: j */
    private Map<Class<?>, C7226k<?>> f3805j;

    /* renamed from: k */
    private Class<Transcode> f3806k;

    /* renamed from: l */
    private boolean f3807l;

    /* renamed from: m */
    private boolean f3808m;

    /* renamed from: n */
    private C7218e f3809n;

    /* renamed from: o */
    private C4368f f3810o;

    /* renamed from: p */
    private C7737a f3811p;

    /* renamed from: q */
    private boolean f3812q;

    /* renamed from: r */
    private boolean f3813r;

    C4395g() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31280a() {
        this.f3798c = null;
        this.f3799d = null;
        this.f3809n = null;
        this.f3802g = null;
        this.f3806k = null;
        this.f3804i = null;
        this.f3810o = null;
        this.f3805j = null;
        this.f3811p = null;
        this.f3796a.clear();
        this.f3807l = false;
        this.f3797b.clear();
        this.f3808m = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C7883b mo31281b() {
        return this.f3798c.mo31193a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public List<C7218e> mo31282c() {
        if (!this.f3808m) {
            this.f3808m = true;
            this.f3797b.clear();
            List<C8476n.C8477a<?>> g = mo31286g();
            int size = g.size();
            for (int i = 0; i < size; i++) {
                C8476n.C8477a aVar = g.get(i);
                if (!this.f3797b.contains(aVar.f12071a)) {
                    this.f3797b.add(aVar.f12071a);
                }
                for (int i2 = 0; i2 < aVar.f12072b.size(); i2++) {
                    if (!this.f3797b.contains(aVar.f12072b.get(i2))) {
                        this.f3797b.add(aVar.f12072b.get(i2));
                    }
                }
            }
        }
        return this.f3797b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C8064a mo31283d() {
        return this.f3803h.mo31320a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C7737a mo31284e() {
        return this.f3811p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo31285f() {
        return this.f3801f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public List<C8476n.C8477a<?>> mo31286g() {
        if (!this.f3807l) {
            this.f3807l = true;
            this.f3796a.clear();
            List i = this.f3798c.mo31199g().mo31165i(this.f3799d);
            int size = i.size();
            for (int i2 = 0; i2 < size; i2++) {
                C8476n.C8477a b = ((C8476n) i.get(i2)).mo42458b(this.f3799d, this.f3800e, this.f3801f, this.f3804i);
                if (b != null) {
                    this.f3796a.add(b);
                }
            }
        }
        return this.f3796a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public <Data> C4426q<Data, ?, Transcode> mo31287h(Class<Data> cls) {
        return this.f3798c.mo31199g().mo31164h(cls, this.f3802g, this.f3806k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Class<?> mo31288i() {
        return this.f3799d.getClass();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public List<C8476n<File, ?>> mo31289j(File file) {
        return this.f3798c.mo31199g().mo31165i(file);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C7222g mo31290k() {
        return this.f3804i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C4368f mo31291l() {
        return this.f3810o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public List<Class<?>> mo31292m() {
        return this.f3798c.mo31199g().mo31166j(this.f3799d.getClass(), this.f3802g, this.f3806k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public <Z> C7225j<Z> mo31293n(C7744c<Z> cVar) {
        return this.f3798c.mo31199g().mo31167k(cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public C7218e mo31294o() {
        return this.f3809n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public <X> C7217d<X> mo31295p(X x) {
        return this.f3798c.mo31199g().mo31169m(x);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public Class<?> mo31296q() {
        return this.f3806k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public <Z> C7226k<Z> mo31297r(Class<Z> cls) {
        C7226k<Z> kVar = this.f3805j.get(cls);
        if (kVar == null) {
            Iterator<Map.Entry<Class<?>, C7226k<?>>> it = this.f3805j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    kVar = (C7226k) next.getValue();
                    break;
                }
            }
        }
        if (kVar != null) {
            return kVar;
        }
        if (!this.f3805j.isEmpty() || !this.f3812q) {
            return C8808k.m17827c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public int mo31298s() {
        return this.f3800e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo31299t(Class<?> cls) {
        if (mo31287h(cls) != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public <R> void mo31300u(C4366d dVar, Object obj, C7218e eVar, int i, int i2, C7737a aVar, Class<?> cls, Class<R> cls2, C4368f fVar, C7222g gVar, Map<Class<?>, C7226k<?>> map, boolean z, boolean z2, C4396h.C4401e eVar2) {
        this.f3798c = dVar;
        this.f3799d = obj;
        this.f3809n = eVar;
        this.f3800e = i;
        this.f3801f = i2;
        this.f3811p = aVar;
        this.f3802g = cls;
        this.f3803h = eVar2;
        this.f3806k = cls2;
        this.f3810o = fVar;
        this.f3804i = gVar;
        this.f3805j = map;
        this.f3812q = z;
        this.f3813r = z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public boolean mo31301v(C7744c<?> cVar) {
        return this.f3798c.mo31199g().mo31170n(cVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean mo31302w() {
        return this.f3813r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo31303x(C7218e eVar) {
        List<C8476n.C8477a<?>> g = mo31286g();
        int size = g.size();
        for (int i = 0; i < size; i++) {
            if (g.get(i).f12071a.equals(eVar)) {
                return true;
            }
        }
        return false;
    }
}
