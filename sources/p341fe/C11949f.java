package p341fe;

import java.util.Comparator;
import java.util.List;
import p307af.C10885a;
import p361ie.C12141b;
import p369je.C12620a;
import p376ke.C12657a;
import p384le.C12850a;
import p384le.C12853d;
import p384le.C12854e;
import p384le.C12856g;
import p386lg.C12859a;
import p386lg.C12860b;
import p386lg.C12861c;
import p397ne.C12999a;
import p397ne.C13016b;
import p403oe.C13071h;
import p423re.C13288b;
import p423re.C13296c;
import p423re.C13305d;
import p423re.C13310f;
import p423re.C13312g;
import p423re.C13313h;
import p423re.C13316i;
import p423re.C13319j;
import p423re.C13322k;
import p423re.C13324l;
import p423re.C13328m;
import p423re.C13334o;
import p423re.C13335p;
import p423re.C13336q;
import p423re.C13339r;
import p423re.C13343s;
import p423re.C13345t;
import p423re.C13349v;
import p423re.C13351w;
import p423re.C13355x;
import p423re.C13359z;
import p459xe.C13844c;
import p459xe.C13845d;
import p471ze.C14111f;

/* renamed from: fe.f */
/* compiled from: Flowable */
public abstract class C11949f<T> implements C12859a<T> {

    /* renamed from: b */
    static final int f18671b = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    /* renamed from: b */
    public static int m25825b() {
        return f18671b;
    }

    /* renamed from: e */
    public static <T> C11949f<T> m25826e(C11951h<T> hVar, C11944a aVar) {
        C13016b.m29390d(hVar, "source is null");
        C13016b.m29390d(aVar, "mode is null");
        return C10885a.m23264k(new C13296c(hVar, aVar));
    }

    /* renamed from: f */
    private C11949f<T> m25827f(C12853d<? super T> dVar, C12853d<? super Throwable> dVar2, C12850a aVar, C12850a aVar2) {
        C13016b.m29390d(dVar, "onNext is null");
        C13016b.m29390d(dVar2, "onError is null");
        C13016b.m29390d(aVar, "onComplete is null");
        C13016b.m29390d(aVar2, "onAfterTerminate is null");
        return C10885a.m23264k(new C13305d(this, dVar, dVar2, aVar, aVar2));
    }

    /* renamed from: i */
    public static <T> C11949f<T> m25828i() {
        return C10885a.m23264k(C13312g.f21249c);
    }

    /* renamed from: r */
    public static <T> C11949f<T> m25829r(T... tArr) {
        C13016b.m29390d(tArr, "items is null");
        if (tArr.length == 0) {
            return m25828i();
        }
        if (tArr.length == 1) {
            return m25831t(tArr[0]);
        }
        return C10885a.m23264k(new C13324l(tArr));
    }

    /* renamed from: s */
    public static <T> C11949f<T> m25830s(Iterable<? extends T> iterable) {
        C13016b.m29390d(iterable, "source is null");
        return C10885a.m23264k(new C13328m(iterable));
    }

    /* renamed from: t */
    public static <T> C11949f<T> m25831t(T t) {
        C13016b.m29390d(t, "item is null");
        return C10885a.m23264k(new C13335p(t));
    }

    /* renamed from: v */
    public static <T> C11949f<T> m25832v(C12859a<? extends T> aVar, C12859a<? extends T> aVar2, C12859a<? extends T> aVar3) {
        C13016b.m29390d(aVar, "source1 is null");
        C13016b.m29390d(aVar2, "source2 is null");
        C13016b.m29390d(aVar3, "source3 is null");
        return m25829r(aVar, aVar2, aVar3).mo49209l(C12999a.m29378d(), false, 3);
    }

    /* renamed from: A */
    public final C11949f<T> mo49192A() {
        return C10885a.m23264k(new C13345t(this));
    }

    /* renamed from: B */
    public final C11949f<T> mo49193B() {
        return C10885a.m23264k(new C13349v(this));
    }

    /* renamed from: C */
    public final C12657a<T> mo49194C() {
        return mo49195D(m25825b());
    }

    /* renamed from: D */
    public final C12657a<T> mo49195D(int i) {
        C13016b.m29391e(i, "bufferSize");
        return C13351w.m30369M(this, i);
    }

    /* renamed from: E */
    public final C11949f<T> mo49196E(Comparator<? super T> comparator) {
        C13016b.m29390d(comparator, "sortFunction");
        return mo49201J().mo49276l().mo49215u(C12999a.m29380f(comparator)).mo49211n(C12999a.m29378d());
    }

    /* renamed from: F */
    public final C12141b mo49197F(C12853d<? super T> dVar) {
        return mo49198G(dVar, C12999a.f20805f, C12999a.f20802c, C13334o.INSTANCE);
    }

    /* renamed from: G */
    public final C12141b mo49198G(C12853d<? super T> dVar, C12853d<? super Throwable> dVar2, C12850a aVar, C12853d<? super C12861c> dVar3) {
        C13016b.m29390d(dVar, "onNext is null");
        C13016b.m29390d(dVar2, "onError is null");
        C13016b.m29390d(aVar, "onComplete is null");
        C13016b.m29390d(dVar3, "onSubscribe is null");
        C13844c cVar = new C13844c(dVar, dVar2, aVar, dVar3);
        mo49199H(cVar);
        return cVar;
    }

    /* renamed from: H */
    public final void mo49199H(C11952i<? super T> iVar) {
        C13016b.m29390d(iVar, "s is null");
        try {
            C12860b<? super Object> x = C10885a.m23277x(this, iVar);
            C13016b.m29390d(x, "Plugin returned null Subscriber");
            mo49200I(x);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C12620a.m28007b(th);
            C10885a.m23270q(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public abstract void mo49200I(C12860b<? super T> bVar);

    /* renamed from: J */
    public final C11965s<List<T>> mo49201J() {
        return C10885a.m23267n(new C13359z(this));
    }

    /* renamed from: a */
    public final void mo49202a(C12860b<? super T> bVar) {
        if (bVar instanceof C11952i) {
            mo49199H((C11952i) bVar);
            return;
        }
        C13016b.m29390d(bVar, "s is null");
        mo49199H(new C13845d(bVar));
    }

    /* renamed from: c */
    public final <R> C11949f<R> mo49203c(C12854e<? super T, ? extends C12859a<? extends R>> eVar) {
        return mo49204d(eVar, 2);
    }

    /* renamed from: d */
    public final <R> C11949f<R> mo49204d(C12854e<? super T, ? extends C12859a<? extends R>> eVar, int i) {
        C13016b.m29390d(eVar, "mapper is null");
        C13016b.m29391e(i, "prefetch");
        if (!(this instanceof C13071h)) {
            return C10885a.m23264k(new C13288b(this, eVar, i, C14111f.IMMEDIATE));
        }
        Object call = ((C13071h) this).call();
        if (call == null) {
            return m25828i();
        }
        return C13355x.m30381a(call, eVar);
    }

    /* renamed from: g */
    public final C11949f<T> mo49205g(C12853d<? super T> dVar) {
        C12853d b = C12999a.m29376b();
        C12850a aVar = C12999a.f20802c;
        return m25827f(dVar, b, aVar, aVar);
    }

    /* renamed from: h */
    public final C11953j<T> mo49206h(long j) {
        if (j >= 0) {
            return C10885a.m23265l(new C13310f(this, j));
        }
        throw new IndexOutOfBoundsException("index >= 0 required but it was " + j);
    }

    /* renamed from: j */
    public final C11949f<T> mo49207j(C12856g<? super T> gVar) {
        C13016b.m29390d(gVar, "predicate is null");
        return C10885a.m23264k(new C13313h(this, gVar));
    }

    /* renamed from: k */
    public final C11953j<T> mo49208k() {
        return mo49206h(0);
    }

    /* renamed from: l */
    public final <R> C11949f<R> mo49209l(C12854e<? super T, ? extends C12859a<? extends R>> eVar, boolean z, int i) {
        return mo49210m(eVar, z, i, m25825b());
    }

    /* renamed from: m */
    public final <R> C11949f<R> mo49210m(C12854e<? super T, ? extends C12859a<? extends R>> eVar, boolean z, int i, int i2) {
        C13016b.m29390d(eVar, "mapper is null");
        C13016b.m29391e(i, "maxConcurrency");
        C13016b.m29391e(i2, "bufferSize");
        if (!(this instanceof C13071h)) {
            return C10885a.m23264k(new C13316i(this, eVar, z, i, i2));
        }
        Object call = ((C13071h) this).call();
        if (call == null) {
            return m25828i();
        }
        return C13355x.m30381a(call, eVar);
    }

    /* renamed from: n */
    public final <U> C11949f<U> mo49211n(C12854e<? super T, ? extends Iterable<? extends U>> eVar) {
        return mo49212o(eVar, m25825b());
    }

    /* renamed from: o */
    public final <U> C11949f<U> mo49212o(C12854e<? super T, ? extends Iterable<? extends U>> eVar, int i) {
        C13016b.m29390d(eVar, "mapper is null");
        C13016b.m29391e(i, "bufferSize");
        return C10885a.m23264k(new C13322k(this, eVar, i));
    }

    /* renamed from: p */
    public final <R> C11949f<R> mo49213p(C12854e<? super T, ? extends C11957n<? extends R>> eVar) {
        return mo49214q(eVar, false, Integer.MAX_VALUE);
    }

    /* renamed from: q */
    public final <R> C11949f<R> mo49214q(C12854e<? super T, ? extends C11957n<? extends R>> eVar, boolean z, int i) {
        C13016b.m29390d(eVar, "mapper is null");
        C13016b.m29391e(i, "maxConcurrency");
        return C10885a.m23264k(new C13319j(this, eVar, z, i));
    }

    /* renamed from: u */
    public final <R> C11949f<R> mo49215u(C12854e<? super T, ? extends R> eVar) {
        C13016b.m29390d(eVar, "mapper is null");
        return C10885a.m23264k(new C13336q(this, eVar));
    }

    /* renamed from: w */
    public final C11949f<T> mo49216w(C11962r rVar) {
        return mo49217x(rVar, false, m25825b());
    }

    /* renamed from: x */
    public final C11949f<T> mo49217x(C11962r rVar, boolean z, int i) {
        C13016b.m29390d(rVar, "scheduler is null");
        C13016b.m29391e(i, "bufferSize");
        return C10885a.m23264k(new C13339r(this, rVar, z, i));
    }

    /* renamed from: y */
    public final C11949f<T> mo49218y() {
        return mo49219z(m25825b(), false, true);
    }

    /* renamed from: z */
    public final C11949f<T> mo49219z(int i, boolean z, boolean z2) {
        C13016b.m29391e(i, "bufferSize");
        return C10885a.m23264k(new C13343s(this, i, z2, z, C12999a.f20802c));
    }
}
