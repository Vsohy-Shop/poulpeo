package p314bg;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13088o;

/* renamed from: bg.m */
/* compiled from: Distinct.kt */
final /* synthetic */ class C10986m {

    /* renamed from: a */
    private static final Function1<Object, Object> f16965a = C10988b.f16968g;

    /* renamed from: b */
    private static final C13088o<Object, Object, Boolean> f16966b = C10987a.f16967g;

    /* renamed from: bg.m$a */
    /* compiled from: Distinct.kt */
    static final class C10987a extends C12777p implements C13088o<Object, Object, Boolean> {

        /* renamed from: g */
        public static final C10987a f16967g = new C10987a();

        C10987a() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(C12775o.m28634d(obj, obj2));
        }
    }

    /* renamed from: a */
    public static final <T> C10962f<T> m23651a(C10962f<? extends T> fVar) {
        if (fVar instanceof C10972h0) {
            return fVar;
        }
        return m23652b(fVar, f16965a, f16966b);
    }

    /* renamed from: b */
    private static final <T> C10962f<T> m23652b(C10962f<? extends T> fVar, Function1<? super T, ? extends Object> function1, C13088o<Object, Object, Boolean> oVar) {
        if (fVar instanceof C10955d) {
            C10955d dVar = (C10955d) fVar;
            if (dVar.f16907c == function1 && dVar.f16908d == oVar) {
                return fVar;
            }
        }
        return new C10955d(fVar, function1, oVar);
    }

    /* renamed from: bg.m$b */
    /* compiled from: Distinct.kt */
    static final class C10988b extends C12777p implements Function1<Object, Object> {

        /* renamed from: g */
        public static final C10988b f16968g = new C10988b();

        C10988b() {
            super(1);
        }

        public final Object invoke(Object obj) {
            return obj;
        }
    }
}
