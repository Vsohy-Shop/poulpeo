package p341fe;

import p307af.C10885a;
import p369je.C12620a;
import p384le.C12854e;
import p384le.C12856g;
import p397ne.C12999a;
import p397ne.C13016b;
import p403oe.C13071h;
import p423re.C13332n;
import p423re.C13347u;
import p435te.C13497c;
import p435te.C13499d;
import p435te.C13500e;
import p435te.C13502f;
import p435te.C13508h;
import p435te.C13511i;
import p435te.C13513j;
import p435te.C13514k;
import p435te.C13516l;
import p435te.C13519m;

/* renamed from: fe.o */
/* compiled from: Observable */
public abstract class C11958o<T> implements C11960p<T> {

    /* renamed from: fe.o$a */
    /* compiled from: Observable */
    static /* synthetic */ class C11959a {

        /* renamed from: a */
        static final /* synthetic */ int[] f18672a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                fe.a[] r0 = p341fe.C11944a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f18672a = r0
                fe.a r1 = p341fe.C11944a.DROP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f18672a     // Catch:{ NoSuchFieldError -> 0x001d }
                fe.a r1 = p341fe.C11944a.LATEST     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f18672a     // Catch:{ NoSuchFieldError -> 0x0028 }
                fe.a r1 = p341fe.C11944a.MISSING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f18672a     // Catch:{ NoSuchFieldError -> 0x0033 }
                fe.a r1 = p341fe.C11944a.ERROR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341fe.C11958o.C11959a.<clinit>():void");
        }
    }

    /* renamed from: f */
    public static int m25897f() {
        return C11949f.m25825b();
    }

    /* renamed from: h */
    public static <T> C11958o<T> m25898h() {
        return C10885a.m23266m(C13499d.f21694b);
    }

    /* renamed from: p */
    public static <T> C11958o<T> m25899p(Iterable<? extends T> iterable) {
        C13016b.m29390d(iterable, "source is null");
        return C10885a.m23266m(new C13511i(iterable));
    }

    /* renamed from: q */
    public static <T> C11958o<T> m25900q(T t) {
        C13016b.m29390d(t, "The item is null");
        return C10885a.m23266m(new C13513j(t));
    }

    /* renamed from: a */
    public final void mo49249a(C11961q<? super T> qVar) {
        C13016b.m29390d(qVar, "observer is null");
        try {
            C11961q<? super Object> v = C10885a.m23275v(this, qVar);
            C13016b.m29390d(v, "Plugin returned null Observer");
            mo46143s(v);
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

    /* renamed from: e */
    public final C11965s<Boolean> mo49250e(C12856g<? super T> gVar) {
        C13016b.m29390d(gVar, "predicate is null");
        return C10885a.m23267n(new C13497c(this, gVar));
    }

    /* renamed from: g */
    public final C11965s<Boolean> mo49251g(Object obj) {
        C13016b.m29390d(obj, "element is null");
        return mo49250e(C12999a.m29377c(obj));
    }

    /* renamed from: i */
    public final C11958o<T> mo49252i(C12856g<? super T> gVar) {
        C13016b.m29390d(gVar, "predicate is null");
        return C10885a.m23266m(new C13500e(this, gVar));
    }

    /* renamed from: j */
    public final <R> C11958o<R> mo49253j(C12854e<? super T, ? extends C11960p<? extends R>> eVar) {
        return mo49254k(eVar, false);
    }

    /* renamed from: k */
    public final <R> C11958o<R> mo49254k(C12854e<? super T, ? extends C11960p<? extends R>> eVar, boolean z) {
        return mo49255l(eVar, z, Integer.MAX_VALUE);
    }

    /* renamed from: l */
    public final <R> C11958o<R> mo49255l(C12854e<? super T, ? extends C11960p<? extends R>> eVar, boolean z, int i) {
        return mo49256m(eVar, z, i, m25897f());
    }

    /* renamed from: m */
    public final <R> C11958o<R> mo49256m(C12854e<? super T, ? extends C11960p<? extends R>> eVar, boolean z, int i, int i2) {
        C13016b.m29390d(eVar, "mapper is null");
        C13016b.m29391e(i, "maxConcurrency");
        C13016b.m29391e(i2, "bufferSize");
        if (!(this instanceof C13071h)) {
            return C10885a.m23266m(new C13502f(this, eVar, z, i, i2));
        }
        Object call = ((C13071h) this).call();
        if (call == null) {
            return m25898h();
        }
        return C13516l.m30823a(call, eVar);
    }

    /* renamed from: n */
    public final C11945b mo49257n(C12854e<? super T, ? extends C11947d> eVar) {
        return mo49258o(eVar, false);
    }

    /* renamed from: o */
    public final C11945b mo49258o(C12854e<? super T, ? extends C11947d> eVar, boolean z) {
        C13016b.m29390d(eVar, "mapper is null");
        return C10885a.m23263j(new C13508h(this, eVar, z));
    }

    /* renamed from: r */
    public final <R> C11958o<R> mo49259r(C12854e<? super T, ? extends R> eVar) {
        C13016b.m29390d(eVar, "mapper is null");
        return C10885a.m23266m(new C13514k(this, eVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract void mo46143s(C11961q<? super T> qVar);

    /* renamed from: t */
    public final C11958o<T> mo49260t(C11960p<? extends T> pVar) {
        C13016b.m29390d(pVar, "other is null");
        return C10885a.m23266m(new C13519m(this, pVar));
    }

    /* renamed from: u */
    public final C11949f<T> mo49261u(C11944a aVar) {
        C13332n nVar = new C13332n(this);
        int i = C11959a.f18672a[aVar.ordinal()];
        if (i == 1) {
            return nVar.mo49192A();
        }
        if (i == 2) {
            return nVar.mo49193B();
        }
        if (i == 3) {
            return nVar;
        }
        if (i != 4) {
            return nVar.mo49218y();
        }
        return C10885a.m23264k(new C13347u(nVar));
    }
}
