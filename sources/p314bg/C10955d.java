package p314bg;

import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;
import p320cg.C11081n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

/* renamed from: bg.d */
/* compiled from: Distinct.kt */
final class C10955d<T> implements C10962f<T> {

    /* renamed from: b */
    private final C10962f<T> f16906b;

    /* renamed from: c */
    public final Function1<T, Object> f16907c;

    /* renamed from: d */
    public final C13088o<Object, Object, Boolean> f16908d;

    /* renamed from: bg.d$a */
    /* compiled from: Distinct.kt */
    static final class C10956a<T> implements C10967g {

        /* renamed from: b */
        final /* synthetic */ C10955d<T> f16909b;

        /* renamed from: c */
        final /* synthetic */ Ref$ObjectRef<Object> f16910c;

        /* renamed from: d */
        final /* synthetic */ C10967g<T> f16911d;

        @C12739f(mo50609c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", mo50610f = "Distinct.kt", mo50611l = {77}, mo50612m = "emit")
        /* renamed from: bg.d$a$a */
        /* compiled from: Distinct.kt */
        static final class C10957a extends C12737d {

            /* renamed from: h */
            /* synthetic */ Object f16912h;

            /* renamed from: i */
            final /* synthetic */ C10956a<T> f16913i;

            /* renamed from: j */
            int f16914j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10957a(C10956a<? super T> aVar, C12074d<? super C10957a> dVar) {
                super(dVar);
                this.f16913i = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f16912h = obj;
                this.f16914j |= Integer.MIN_VALUE;
                return this.f16913i.emit(null, this);
            }
        }

        C10956a(C10955d<T> dVar, Ref$ObjectRef<Object> ref$ObjectRef, C10967g<? super T> gVar) {
            this.f16909b = dVar;
            this.f16910c = ref$ObjectRef;
            this.f16911d = gVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object emit(T r6, p355hf.C12074d<? super p336ef.C11921v> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof p314bg.C10955d.C10956a.C10957a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                bg.d$a$a r0 = (p314bg.C10955d.C10956a.C10957a) r0
                int r1 = r0.f16914j
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f16914j = r1
                goto L_0x0018
            L_0x0013:
                bg.d$a$a r0 = new bg.d$a$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.f16912h
                java.lang.Object r1 = p362if.C12150d.m26492c()
                int r2 = r0.f16914j
                r3 = 1
                if (r2 == 0) goto L_0x0031
                if (r2 != r3) goto L_0x0029
                p336ef.C11910n.m25701b(r7)
                goto L_0x0067
            L_0x0029:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0031:
                p336ef.C11910n.m25701b(r7)
                bg.d<T> r7 = r5.f16909b
                kotlin.jvm.functions.Function1<T, java.lang.Object> r7 = r7.f16907c
                java.lang.Object r7 = r7.invoke(r6)
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r2 = r5.f16910c
                T r2 = r2.f20403b
                dg.g0 r4 = p320cg.C11081n.f17203a
                if (r2 == r4) goto L_0x0058
                bg.d<T> r4 = r5.f16909b
                of.o<java.lang.Object, java.lang.Object, java.lang.Boolean> r4 = r4.f16908d
                java.lang.Object r2 = r4.invoke(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L_0x0055
                goto L_0x0058
            L_0x0055:
                ef.v r6 = p336ef.C11921v.f18618a
                return r6
            L_0x0058:
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r2 = r5.f16910c
                r2.f20403b = r7
                bg.g<T> r7 = r5.f16911d
                r0.f16914j = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L_0x0067
                return r1
            L_0x0067:
                ef.v r6 = p336ef.C11921v.f18618a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p314bg.C10955d.C10956a.emit(java.lang.Object, hf.d):java.lang.Object");
        }
    }

    public C10955d(C10962f<? extends T> fVar, Function1<? super T, ? extends Object> function1, C13088o<Object, Object, Boolean> oVar) {
        this.f16906b = fVar;
        this.f16907c = function1;
        this.f16908d = oVar;
    }

    public Object collect(C10967g<? super T> gVar, C12074d<? super C11921v> dVar) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f20403b = C11081n.f17203a;
        Object collect = this.f16906b.collect(new C10956a(this, ref$ObjectRef, gVar), dVar);
        if (collect == C12150d.m26492c()) {
            return collect;
        }
        return C11921v.f18618a;
    }
}
