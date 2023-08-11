package p202q6;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import p113h8.C8028a;
import p113h8.C8030b;

/* renamed from: q6.y */
/* compiled from: OptionalProvider */
class C9315y<T> implements C8030b<T>, C8028a<T> {

    /* renamed from: c */
    private static final C8028a.C8029a<Object> f13681c = new C9312v();

    /* renamed from: d */
    private static final C8030b<Object> f13682d = new C9313w();
    @GuardedBy("this")

    /* renamed from: a */
    private C8028a.C8029a<T> f13683a;

    /* renamed from: b */
    private volatile C8030b<T> f13684b;

    private C9315y(C8028a.C8029a<T> aVar, C8030b<T> bVar) {
        this.f13683a = aVar;
        this.f13684b = bVar;
    }

    /* renamed from: e */
    static <T> C9315y<T> m19168e() {
        return new C9315y<>(f13681c, f13682d);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ Object m19170g() {
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ void m19171h(C8028a.C8029a aVar, C8028a.C8029a aVar2, C8030b bVar) {
        aVar.mo30044a(bVar);
        aVar2.mo30044a(bVar);
    }

    /* renamed from: i */
    static <T> C9315y<T> m19172i(C8030b<T> bVar) {
        return new C9315y<>((C8028a.C8029a) null, bVar);
    }

    /* renamed from: a */
    public void mo41859a(@NonNull C8028a.C8029a<T> aVar) {
        C8030b<T> bVar;
        C8030b<T> bVar2;
        C8030b<T> bVar3 = this.f13684b;
        C8030b<Object> bVar4 = f13682d;
        if (bVar3 != bVar4) {
            aVar.mo30044a(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f13684b;
            if (bVar != bVar4) {
                bVar2 = bVar;
            } else {
                this.f13683a = new C9314x(this.f13683a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.mo30044a(bVar);
        }
    }

    public T get() {
        return this.f13684b.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo43609j(C8030b<T> bVar) {
        C8028a.C8029a<T> aVar;
        if (this.f13684b == f13682d) {
            synchronized (this) {
                aVar = this.f13683a;
                this.f13683a = null;
                this.f13684b = bVar;
            }
            aVar.mo30044a(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m19169f(C8030b bVar) {
    }
}
