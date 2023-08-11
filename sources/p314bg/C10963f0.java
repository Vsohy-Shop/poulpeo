package p314bg;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.C12755d0;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

/* renamed from: bg.f0 */
/* compiled from: SharingStarted.kt */
final class C10963f0 implements C10958d0 {

    @C12739f(mo50609c = "kotlinx.coroutines.flow.StartedLazily$command$1", mo50610f = "SharingStarted.kt", mo50611l = {155}, mo50612m = "invokeSuspend")
    /* renamed from: bg.f0$a */
    /* compiled from: SharingStarted.kt */
    static final class C10964a extends C12746l implements C13088o<C10967g<? super C10952b0>, C12074d<? super C11921v>, Object> {

        /* renamed from: h */
        int f16920h;

        /* renamed from: i */
        private /* synthetic */ Object f16921i;

        /* renamed from: j */
        final /* synthetic */ C10972h0<Integer> f16922j;

        /* renamed from: bg.f0$a$a */
        /* compiled from: SharingStarted.kt */
        static final class C10965a<T> implements C10967g {

            /* renamed from: b */
            final /* synthetic */ C12755d0 f16923b;

            /* renamed from: c */
            final /* synthetic */ C10967g<C10952b0> f16924c;

            @C12739f(mo50609c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", mo50610f = "SharingStarted.kt", mo50611l = {158}, mo50612m = "emit")
            /* renamed from: bg.f0$a$a$a */
            /* compiled from: SharingStarted.kt */
            static final class C10966a extends C12737d {

                /* renamed from: h */
                /* synthetic */ Object f16925h;

                /* renamed from: i */
                final /* synthetic */ C10965a<T> f16926i;

                /* renamed from: j */
                int f16927j;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C10966a(C10965a<? super T> aVar, C12074d<? super C10966a> dVar) {
                    super(dVar);
                    this.f16926i = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f16925h = obj;
                    this.f16927j |= Integer.MIN_VALUE;
                    return this.f16926i.mo46031a(0, this);
                }
            }

            C10965a(C12755d0 d0Var, C10967g<? super C10952b0> gVar) {
                this.f16923b = d0Var;
                this.f16924c = gVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object mo46031a(int r5, p355hf.C12074d<? super p336ef.C11921v> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof p314bg.C10963f0.C10964a.C10965a.C10966a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    bg.f0$a$a$a r0 = (p314bg.C10963f0.C10964a.C10965a.C10966a) r0
                    int r1 = r0.f16927j
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f16927j = r1
                    goto L_0x0018
                L_0x0013:
                    bg.f0$a$a$a r0 = new bg.f0$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f16925h
                    java.lang.Object r1 = p362if.C12150d.m26492c()
                    int r2 = r0.f16927j
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    p336ef.C11910n.m25701b(r6)
                    goto L_0x004b
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    p336ef.C11910n.m25701b(r6)
                    if (r5 <= 0) goto L_0x004e
                    kotlin.jvm.internal.d0 r5 = r4.f16923b
                    boolean r6 = r5.f20407b
                    if (r6 != 0) goto L_0x004e
                    r5.f20407b = r3
                    bg.g<bg.b0> r5 = r4.f16924c
                    bg.b0 r6 = p314bg.C10952b0.START
                    r0.f16927j = r3
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L_0x004b
                    return r1
                L_0x004b:
                    ef.v r5 = p336ef.C11921v.f18618a
                    return r5
                L_0x004e:
                    ef.v r5 = p336ef.C11921v.f18618a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: p314bg.C10963f0.C10964a.C10965a.mo46031a(int, hf.d):java.lang.Object");
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, C12074d dVar) {
                return mo46031a(((Number) obj).intValue(), dVar);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10964a(C10972h0<Integer> h0Var, C12074d<? super C10964a> dVar) {
            super(2, dVar);
            this.f16922j = h0Var;
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            C10964a aVar = new C10964a(this.f16922j, dVar);
            aVar.f16921i = obj;
            return aVar;
        }

        public final Object invoke(C10967g<? super C10952b0> gVar, C12074d<? super C11921v> dVar) {
            return ((C10964a) create(gVar, dVar)).invokeSuspend(C11921v.f18618a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.f16920h;
            if (i == 0) {
                C11910n.m25701b(obj);
                C12755d0 d0Var = new C12755d0();
                C10972h0<Integer> h0Var = this.f16922j;
                C10965a aVar = new C10965a(d0Var, (C10967g) this.f16921i);
                this.f16920h = 1;
                if (h0Var.collect(aVar, this) == c) {
                    return c;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C11910n.m25701b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: a */
    public C10962f<C10952b0> mo46024a(C10972h0<Integer> h0Var) {
        return C10971h.m23608o(new C10964a(h0Var, (C12074d<? super C10964a>) null));
    }

    public String toString() {
        return "SharingStarted.Lazily";
    }
}
