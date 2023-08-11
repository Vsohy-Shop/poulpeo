package p296z3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p231t4.C9713p;
import p286y4.C10671e;

/* renamed from: z3.l */
public final class C10808l {

    /* renamed from: a */
    private final C10811o f16544a;

    /* renamed from: b */
    private final C10671e f16545b;

    /* renamed from: c */
    private boolean f16546c;

    /* renamed from: d */
    private long f16547d;

    /* renamed from: e */
    private long f16548e;

    /* renamed from: f */
    private long f16549f;

    /* renamed from: g */
    private long f16550g;

    /* renamed from: h */
    private long f16551h;

    /* renamed from: i */
    private boolean f16552i;

    /* renamed from: j */
    private final Map<Class<? extends C10810n>, C10810n> f16553j;

    /* renamed from: k */
    private final List<C10819t> f16554k;

    C10808l(C10811o oVar, C10671e eVar) {
        C9713p.m20275j(oVar);
        C9713p.m20275j(eVar);
        this.f16544a = oVar;
        this.f16545b = eVar;
        this.f16550g = 1800000;
        this.f16551h = 3024000000L;
        this.f16553j = new HashMap();
        this.f16554k = new ArrayList();
    }

    /* renamed from: o */
    private static <T extends C10810n> T m23039o(Class<T> cls) {
        try {
            return (C10810n) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            if (e instanceof InstantiationException) {
                throw new IllegalArgumentException("dataType doesn't have default constructor", e);
            } else if (e instanceof IllegalAccessException) {
                throw new IllegalArgumentException("dataType default constructor is not accessible", e);
            } else if (e instanceof ReflectiveOperationException) {
                throw new IllegalArgumentException("Linkage exception", e);
            } else {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: a */
    public final <T extends C10810n> T mo45739a(Class<T> cls) {
        return (C10810n) this.f16553j.get(cls);
    }

    /* renamed from: b */
    public final void mo45740b(long j) {
        this.f16548e = j;
    }

    /* renamed from: c */
    public final void mo45741c(C10810n nVar) {
        C9713p.m20275j(nVar);
        Class cls = nVar.getClass();
        if (cls.getSuperclass() == C10810n.class) {
            nVar.mo33104d(mo45752n(cls));
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: d */
    public final C10808l mo45742d() {
        return new C10808l(this);
    }

    /* renamed from: e */
    public final Collection<C10810n> mo45743e() {
        return this.f16553j.values();
    }

    /* renamed from: f */
    public final List<C10819t> mo45744f() {
        return this.f16554k;
    }

    /* renamed from: g */
    public final long mo45745g() {
        return this.f16547d;
    }

    /* renamed from: h */
    public final void mo45746h() {
        this.f16544a.mo45754c().mo45762m(this);
    }

    /* renamed from: i */
    public final boolean mo45747i() {
        return this.f16546c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo45748j() {
        this.f16549f = this.f16545b.mo33548b();
        long j = this.f16548e;
        if (j != 0) {
            this.f16547d = j;
        } else {
            this.f16547d = this.f16545b.mo33547a();
        }
        this.f16546c = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final C10811o mo45749k() {
        return this.f16544a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final boolean mo45750l() {
        return this.f16552i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo45751m() {
        this.f16552i = true;
    }

    /* renamed from: n */
    public final <T extends C10810n> T mo45752n(Class<T> cls) {
        T t = (C10810n) this.f16553j.get(cls);
        if (t != null) {
            return t;
        }
        T o = m23039o(cls);
        this.f16553j.put(cls, o);
        return o;
    }

    private C10808l(C10808l lVar) {
        this.f16544a = lVar.f16544a;
        this.f16545b = lVar.f16545b;
        this.f16547d = lVar.f16547d;
        this.f16548e = lVar.f16548e;
        this.f16549f = lVar.f16549f;
        this.f16550g = lVar.f16550g;
        this.f16551h = lVar.f16551h;
        this.f16554k = new ArrayList(lVar.f16554k);
        this.f16553j = new HashMap(lVar.f16553j.size());
        for (Map.Entry next : lVar.f16553j.entrySet()) {
            C10810n o = m23039o((Class) next.getKey());
            ((C10810n) next.getValue()).mo33104d(o);
            this.f16553j.put((Class) next.getKey(), o);
        }
    }
}
