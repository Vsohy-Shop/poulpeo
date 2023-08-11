package p397ne;

import androidx.core.location.LocationRequestCompat;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import p307af.C10885a;
import p364io.reactivex.exceptions.OnErrorNotImplementedException;
import p384le.C12850a;
import p384le.C12851b;
import p384le.C12853d;
import p384le.C12854e;
import p384le.C12855f;
import p384le.C12856g;
import p386lg.C12861c;

/* renamed from: ne.a */
/* compiled from: Functions */
public final class C12999a {

    /* renamed from: a */
    static final C12854e<Object, Object> f20800a = new C13008i();

    /* renamed from: b */
    public static final Runnable f20801b = new C13004e();

    /* renamed from: c */
    public static final C12850a f20802c = new C13001b();

    /* renamed from: d */
    static final C12853d<Object> f20803d = new C13002c();

    /* renamed from: e */
    public static final C12853d<Throwable> f20804e = new C13006g();

    /* renamed from: f */
    public static final C12853d<Throwable> f20805f = new C13014o();

    /* renamed from: g */
    public static final C12855f f20806g = new C13003d();

    /* renamed from: h */
    static final C12856g<Object> f20807h = new C13015p();

    /* renamed from: i */
    static final C12856g<Object> f20808i = new C13007h();

    /* renamed from: j */
    static final Callable<Object> f20809j = new C13013n();

    /* renamed from: k */
    static final Comparator<Object> f20810k = new C13012m();

    /* renamed from: l */
    public static final C12853d<C12861c> f20811l = new C13011l();

    /* renamed from: ne.a$a */
    /* compiled from: Functions */
    static final class C13000a<T1, T2, R> implements C12854e<Object[], R> {

        /* renamed from: b */
        final C12851b<? super T1, ? super T2, ? extends R> f20812b;

        C13000a(C12851b<? super T1, ? super T2, ? extends R> bVar) {
            this.f20812b = bVar;
        }

        /* renamed from: a */
        public R apply(Object[] objArr) {
            if (objArr.length == 2) {
                return this.f20812b.apply(objArr[0], objArr[1]);
            }
            throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
        }
    }

    /* renamed from: ne.a$d */
    /* compiled from: Functions */
    static final class C13003d implements C12855f {
        C13003d() {
        }
    }

    /* renamed from: ne.a$f */
    /* compiled from: Functions */
    static final class C13005f<T> implements C12856g<T> {

        /* renamed from: b */
        final T f20813b;

        C13005f(T t) {
            this.f20813b = t;
        }

        public boolean test(T t) {
            return C13016b.m29389c(t, this.f20813b);
        }
    }

    /* renamed from: ne.a$g */
    /* compiled from: Functions */
    static final class C13006g implements C12853d<Throwable> {
        C13006g() {
        }

        /* renamed from: a */
        public void accept(Throwable th) {
            C10885a.m23270q(th);
        }
    }

    /* renamed from: ne.a$h */
    /* compiled from: Functions */
    static final class C13007h implements C12856g<Object> {
        C13007h() {
        }

        public boolean test(Object obj) {
            return false;
        }
    }

    /* renamed from: ne.a$j */
    /* compiled from: Functions */
    static final class C13009j<T, U> implements Callable<U>, C12854e<T, U> {

        /* renamed from: b */
        final U f20814b;

        C13009j(U u) {
            this.f20814b = u;
        }

        public U apply(T t) {
            return this.f20814b;
        }

        public U call() {
            return this.f20814b;
        }
    }

    /* renamed from: ne.a$k */
    /* compiled from: Functions */
    static final class C13010k<T> implements C12854e<List<T>, List<T>> {

        /* renamed from: b */
        final Comparator<? super T> f20815b;

        C13010k(Comparator<? super T> comparator) {
            this.f20815b = comparator;
        }

        /* renamed from: a */
        public List<T> apply(List<T> list) {
            Collections.sort(list, this.f20815b);
            return list;
        }
    }

    /* renamed from: ne.a$l */
    /* compiled from: Functions */
    static final class C13011l implements C12853d<C12861c> {
        C13011l() {
        }

        /* renamed from: a */
        public void accept(C12861c cVar) {
            cVar.mo50776h(LocationRequestCompat.PASSIVE_INTERVAL);
        }
    }

    /* renamed from: ne.a$m */
    /* compiled from: Functions */
    static final class C13012m implements Comparator<Object> {
        C13012m() {
        }

        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* renamed from: ne.a$n */
    /* compiled from: Functions */
    static final class C13013n implements Callable<Object> {
        C13013n() {
        }

        public Object call() {
            return null;
        }
    }

    /* renamed from: ne.a$o */
    /* compiled from: Functions */
    static final class C13014o implements C12853d<Throwable> {
        C13014o() {
        }

        /* renamed from: a */
        public void accept(Throwable th) {
            C10885a.m23270q(new OnErrorNotImplementedException(th));
        }
    }

    /* renamed from: ne.a$p */
    /* compiled from: Functions */
    static final class C13015p implements C12856g<Object> {
        C13015p() {
        }

        public boolean test(Object obj) {
            return true;
        }
    }

    /* renamed from: a */
    public static <T> C12856g<T> m29375a() {
        return f20807h;
    }

    /* renamed from: b */
    public static <T> C12853d<T> m29376b() {
        return f20803d;
    }

    /* renamed from: c */
    public static <T> C12856g<T> m29377c(T t) {
        return new C13005f(t);
    }

    /* renamed from: d */
    public static <T> C12854e<T, T> m29378d() {
        return f20800a;
    }

    /* renamed from: e */
    public static <T, U> C12854e<T, U> m29379e(U u) {
        return new C13009j(u);
    }

    /* renamed from: f */
    public static <T> C12854e<List<T>, List<T>> m29380f(Comparator<? super T> comparator) {
        return new C13010k(comparator);
    }

    /* renamed from: g */
    public static <T1, T2, R> C12854e<Object[], R> m29381g(C12851b<? super T1, ? super T2, ? extends R> bVar) {
        C13016b.m29390d(bVar, "f is null");
        return new C13000a(bVar);
    }

    /* renamed from: ne.a$b */
    /* compiled from: Functions */
    static final class C13001b implements C12850a {
        C13001b() {
        }

        public String toString() {
            return "EmptyAction";
        }

        public void run() {
        }
    }

    /* renamed from: ne.a$e */
    /* compiled from: Functions */
    static final class C13004e implements Runnable {
        C13004e() {
        }

        public String toString() {
            return "EmptyRunnable";
        }

        public void run() {
        }
    }

    /* renamed from: ne.a$c */
    /* compiled from: Functions */
    static final class C13002c implements C12853d<Object> {
        C13002c() {
        }

        public String toString() {
            return "EmptyConsumer";
        }

        public void accept(Object obj) {
        }
    }

    /* renamed from: ne.a$i */
    /* compiled from: Functions */
    static final class C13008i implements C12854e<Object, Object> {
        C13008i() {
        }

        public String toString() {
            return "IdentityFunction";
        }

        public Object apply(Object obj) {
            return obj;
        }
    }
}
