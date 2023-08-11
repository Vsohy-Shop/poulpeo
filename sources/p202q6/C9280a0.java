package p202q6;

import com.google.firebase.components.DependencyException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p113h8.C8028a;
import p113h8.C8030b;
import p193p7.C9073c;

/* renamed from: q6.a0 */
/* compiled from: RestrictedComponentContainer */
final class C9280a0 extends C9279a {

    /* renamed from: a */
    private final Set<Class<?>> f13617a;

    /* renamed from: b */
    private final Set<Class<?>> f13618b;

    /* renamed from: c */
    private final Set<Class<?>> f13619c;

    /* renamed from: d */
    private final Set<Class<?>> f13620d;

    /* renamed from: e */
    private final Set<Class<?>> f13621e;

    /* renamed from: f */
    private final Set<Class<?>> f13622f;

    /* renamed from: g */
    private final C9287e f13623g;

    /* renamed from: q6.a0$a */
    /* compiled from: RestrictedComponentContainer */
    private static class C9281a implements C9073c {

        /* renamed from: a */
        private final Set<Class<?>> f13624a;

        /* renamed from: b */
        private final C9073c f13625b;

        public C9281a(Set<Class<?>> set, C9073c cVar) {
            this.f13624a = set;
            this.f13625b = cVar;
        }
    }

    C9280a0(C9284d<?> dVar, C9287e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (C9307q next : dVar.mo43564e()) {
            if (next.mo43598e()) {
                if (next.mo43601g()) {
                    hashSet4.add(next.mo43596c());
                } else {
                    hashSet.add(next.mo43596c());
                }
            } else if (next.mo43597d()) {
                hashSet3.add(next.mo43596c());
            } else if (next.mo43601g()) {
                hashSet5.add(next.mo43596c());
            } else {
                hashSet2.add(next.mo43596c());
            }
        }
        if (!dVar.mo43567h().isEmpty()) {
            hashSet.add(C9073c.class);
        }
        this.f13617a = Collections.unmodifiableSet(hashSet);
        this.f13618b = Collections.unmodifiableSet(hashSet2);
        this.f13619c = Collections.unmodifiableSet(hashSet3);
        this.f13620d = Collections.unmodifiableSet(hashSet4);
        this.f13621e = Collections.unmodifiableSet(hashSet5);
        this.f13622f = dVar.mo43567h();
        this.f13623g = eVar;
    }

    /* renamed from: a */
    public <T> T mo43559a(Class<T> cls) {
        if (this.f13617a.contains(cls)) {
            T a = this.f13623g.mo43559a(cls);
            if (!cls.equals(C9073c.class)) {
                return a;
            }
            return new C9281a(this.f13622f, (C9073c) a);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    /* renamed from: b */
    public <T> C8030b<T> mo43561b(Class<T> cls) {
        if (this.f13618b.contains(cls)) {
            return this.f13623g.mo43561b(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{cls}));
    }

    /* renamed from: c */
    public <T> C8030b<Set<T>> mo43562c(Class<T> cls) {
        if (this.f13621e.contains(cls)) {
            return this.f13623g.mo43562c(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{cls}));
    }

    /* renamed from: d */
    public <T> Set<T> mo43560d(Class<T> cls) {
        if (this.f13620d.contains(cls)) {
            return this.f13623g.mo43560d(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{cls}));
    }

    /* renamed from: e */
    public <T> C8028a<T> mo43563e(Class<T> cls) {
        if (this.f13619c.contains(cls)) {
            return this.f13623g.mo43563e(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", new Object[]{cls}));
    }
}
