package p448vf;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* renamed from: vf.m */
/* compiled from: Sequences.kt */
class C13657m extends C13656l {

    /* renamed from: vf.m$a */
    /* compiled from: Sequences.kt */
    public static final class C13658a implements C13650g<T> {

        /* renamed from: a */
        final /* synthetic */ Iterator f22000a;

        public C13658a(Iterator it) {
            this.f22000a = it;
        }

        public Iterator<T> iterator() {
            return this.f22000a;
        }
    }

    /* renamed from: vf.m$b */
    /* compiled from: Sequences.kt */
    static final class C13659b extends C12777p implements Function1<T, T> {

        /* renamed from: g */
        final /* synthetic */ C13074a<T> f22001g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13659b(C13074a<? extends T> aVar) {
            super(1);
            this.f22001g = aVar;
        }

        public final T invoke(T t) {
            C12775o.m28639i(t, "it");
            return this.f22001g.invoke();
        }
    }

    /* renamed from: vf.m$c */
    /* compiled from: Sequences.kt */
    static final class C13660c extends C12777p implements C13074a<T> {

        /* renamed from: g */
        final /* synthetic */ T f22002g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13660c(T t) {
            super(0);
            this.f22002g = t;
        }

        public final T invoke() {
            return this.f22002g;
        }
    }

    /* renamed from: c */
    public static <T> C13650g<T> m31269c(Iterator<? extends T> it) {
        C12775o.m28639i(it, "<this>");
        return m31270d(new C13658a(it));
    }

    /* renamed from: d */
    public static final <T> C13650g<T> m31270d(C13650g<? extends T> gVar) {
        C12775o.m28639i(gVar, "<this>");
        if (gVar instanceof C13641a) {
            return gVar;
        }
        return new C13641a(gVar);
    }

    /* renamed from: e */
    public static <T> C13650g<T> m31271e() {
        return C13645d.f21982a;
    }

    /* renamed from: f */
    public static <T> C13650g<T> m31272f(T t, Function1<? super T, ? extends T> function1) {
        C12775o.m28639i(function1, "nextFunction");
        if (t == null) {
            return C13645d.f21982a;
        }
        return new C13648f(new C13660c(t), function1);
    }

    /* renamed from: g */
    public static <T> C13650g<T> m31273g(C13074a<? extends T> aVar) {
        C12775o.m28639i(aVar, "nextFunction");
        return m31270d(new C13648f(aVar, new C13659b(aVar)));
    }

    /* renamed from: h */
    public static <T> C13650g<T> m31274h(C13074a<? extends T> aVar, Function1<? super T, ? extends T> function1) {
        C12775o.m28639i(aVar, "seedFunction");
        C12775o.m28639i(function1, "nextFunction");
        return new C13648f(aVar, function1);
    }

    /* renamed from: i */
    public static <T> C13650g<T> m31275i(T... tArr) {
        boolean z;
        C12775o.m28639i(tArr, "elements");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return m31271e();
        }
        return C12710p.m28375C(tArr);
    }
}
