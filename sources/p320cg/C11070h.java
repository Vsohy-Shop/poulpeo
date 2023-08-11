package p320cg;

import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import p308ag.C10886a;
import p314bg.C10962f;
import p314bg.C10967g;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p355hf.C12085h;
import p404of.C13088o;
import p404of.C13089p;
import p466yf.C13995l0;
import p466yf.C13999m0;
import p466yf.C14054y1;

@SourceDebugExtension({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/internal/ChannelFlowTransformLatest\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1#2:101\n*E\n"})
/* renamed from: cg.h */
/* compiled from: Merge.kt */
public final class C11070h<T, R> extends C11067f<T, R> {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C13089p<C10967g<? super R>, T, C12074d<? super C11921v>, Object> f17179f;

    @C12739f(mo50609c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", mo50610f = "Merge.kt", mo50611l = {27}, mo50612m = "invokeSuspend")
    /* renamed from: cg.h$a */
    /* compiled from: Merge.kt */
    static final class C11071a extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {

        /* renamed from: h */
        int f17180h;

        /* renamed from: i */
        private /* synthetic */ Object f17181i;

        /* renamed from: j */
        final /* synthetic */ C11070h<T, R> f17182j;

        /* renamed from: k */
        final /* synthetic */ C10967g<R> f17183k;

        /* renamed from: cg.h$a$a */
        /* compiled from: Merge.kt */
        static final class C11072a<T> implements C10967g {

            /* renamed from: b */
            final /* synthetic */ Ref$ObjectRef<C14054y1> f17184b;

            /* renamed from: c */
            final /* synthetic */ C13995l0 f17185c;

            /* renamed from: d */
            final /* synthetic */ C11070h<T, R> f17186d;

            /* renamed from: e */
            final /* synthetic */ C10967g<R> f17187e;

            @C12739f(mo50609c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", mo50610f = "Merge.kt", mo50611l = {34}, mo50612m = "invokeSuspend")
            /* renamed from: cg.h$a$a$a */
            /* compiled from: Merge.kt */
            static final class C11073a extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {

                /* renamed from: h */
                int f17188h;

                /* renamed from: i */
                final /* synthetic */ C11070h<T, R> f17189i;

                /* renamed from: j */
                final /* synthetic */ C10967g<R> f17190j;

                /* renamed from: k */
                final /* synthetic */ T f17191k;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C11073a(C11070h<T, R> hVar, C10967g<? super R> gVar, T t, C12074d<? super C11073a> dVar) {
                    super(2, dVar);
                    this.f17189i = hVar;
                    this.f17190j = gVar;
                    this.f17191k = t;
                }

                public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
                    return new C11073a(this.f17189i, this.f17190j, this.f17191k, dVar);
                }

                public final Object invokeSuspend(Object obj) {
                    Object c = C12150d.m26492c();
                    int i = this.f17188h;
                    if (i == 0) {
                        C11910n.m25701b(obj);
                        C13089p r = this.f17189i.f17179f;
                        C10967g<R> gVar = this.f17190j;
                        T t = this.f17191k;
                        this.f17188h = 1;
                        if (r.invoke(gVar, t, this) == c) {
                            return c;
                        }
                    } else if (i == 1) {
                        C11910n.m25701b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    return C11921v.f18618a;
                }

                public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
                    return ((C11073a) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
                }
            }

            @C12739f(mo50609c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", mo50610f = "Merge.kt", mo50611l = {30}, mo50612m = "emit")
            /* renamed from: cg.h$a$a$b */
            /* compiled from: Merge.kt */
            static final class C11074b extends C12737d {

                /* renamed from: h */
                Object f17192h;

                /* renamed from: i */
                Object f17193i;

                /* renamed from: j */
                Object f17194j;

                /* renamed from: k */
                /* synthetic */ Object f17195k;

                /* renamed from: l */
                final /* synthetic */ C11072a<T> f17196l;

                /* renamed from: m */
                int f17197m;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C11074b(C11072a<? super T> aVar, C12074d<? super C11074b> dVar) {
                    super(dVar);
                    this.f17196l = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f17195k = obj;
                    this.f17197m |= Integer.MIN_VALUE;
                    return this.f17196l.emit(null, this);
                }
            }

            C11072a(Ref$ObjectRef<C14054y1> ref$ObjectRef, C13995l0 l0Var, C11070h<T, R> hVar, C10967g<? super R> gVar) {
                this.f17184b = ref$ObjectRef;
                this.f17185c = l0Var;
                this.f17186d = hVar;
                this.f17187e = gVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(T r8, p355hf.C12074d<? super p336ef.C11921v> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof p320cg.C11070h.C11071a.C11072a.C11074b
                    if (r0 == 0) goto L_0x0013
                    r0 = r9
                    cg.h$a$a$b r0 = (p320cg.C11070h.C11071a.C11072a.C11074b) r0
                    int r1 = r0.f17197m
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f17197m = r1
                    goto L_0x0018
                L_0x0013:
                    cg.h$a$a$b r0 = new cg.h$a$a$b
                    r0.<init>(r7, r9)
                L_0x0018:
                    java.lang.Object r9 = r0.f17195k
                    java.lang.Object r1 = p362if.C12150d.m26492c()
                    int r2 = r0.f17197m
                    r3 = 1
                    if (r2 == 0) goto L_0x003b
                    if (r2 != r3) goto L_0x0033
                    java.lang.Object r8 = r0.f17194j
                    yf.y1 r8 = (p466yf.C14054y1) r8
                    java.lang.Object r8 = r0.f17193i
                    java.lang.Object r0 = r0.f17192h
                    cg.h$a$a r0 = (p320cg.C11070h.C11071a.C11072a) r0
                    p336ef.C11910n.m25701b(r9)
                    goto L_0x005e
                L_0x0033:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L_0x003b:
                    p336ef.C11910n.m25701b(r9)
                    kotlin.jvm.internal.Ref$ObjectRef<yf.y1> r9 = r7.f17184b
                    T r9 = r9.f20403b
                    yf.y1 r9 = (p466yf.C14054y1) r9
                    if (r9 == 0) goto L_0x005d
                    kotlinx.coroutines.flow.internal.ChildCancelledException r2 = new kotlinx.coroutines.flow.internal.ChildCancelledException
                    r2.<init>()
                    r9.cancel(r2)
                    r0.f17192h = r7
                    r0.f17193i = r8
                    r0.f17194j = r9
                    r0.f17197m = r3
                    java.lang.Object r9 = r9.mo53703G(r0)
                    if (r9 != r1) goto L_0x005d
                    return r1
                L_0x005d:
                    r0 = r7
                L_0x005e:
                    kotlin.jvm.internal.Ref$ObjectRef<yf.y1> r9 = r0.f17184b
                    yf.l0 r1 = r0.f17185c
                    r2 = 0
                    yf.n0 r3 = p466yf.C14004n0.UNDISPATCHED
                    cg.h$a$a$a r4 = new cg.h$a$a$a
                    cg.h<T, R> r5 = r0.f17186d
                    bg.g<R> r0 = r0.f17187e
                    r6 = 0
                    r4.<init>(r5, r0, r8, r6)
                    r5 = 1
                    yf.y1 r8 = p466yf.C13985j.m32422d(r1, r2, r3, r4, r5, r6)
                    r9.f20403b = r8
                    ef.v r8 = p336ef.C11921v.f18618a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: p320cg.C11070h.C11071a.C11072a.emit(java.lang.Object, hf.d):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11071a(C11070h<T, R> hVar, C10967g<? super R> gVar, C12074d<? super C11071a> dVar) {
            super(2, dVar);
            this.f17182j = hVar;
            this.f17183k = gVar;
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            C11071a aVar = new C11071a(this.f17182j, this.f17183k, dVar);
            aVar.f17181i = obj;
            return aVar;
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.f17180h;
            if (i == 0) {
                C11910n.m25701b(obj);
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                C11070h<T, R> hVar = this.f17182j;
                C10962f<S> fVar = hVar.f17175e;
                C11072a aVar = new C11072a(ref$ObjectRef, (C13995l0) this.f17181i, hVar, this.f17183k);
                this.f17180h = 1;
                if (fVar.collect(aVar, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C11910n.m25701b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C11921v.f18618a;
        }

        public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
            return ((C11071a) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11070h(C13089p pVar, C10962f fVar, C12079g gVar, int i, C10886a aVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(pVar, fVar, (i2 & 4) != 0 ? C12085h.f18916b : gVar, (i2 & 8) != 0 ? -2 : i, (i2 & 16) != 0 ? C10886a.SUSPEND : aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C11063d<R> mo46022i(C12079g gVar, int i, C10886a aVar) {
        return new C11070h(this.f17179f, this.f17175e, gVar, i, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public Object mo46165q(C10967g<? super R> gVar, C12074d<? super C11921v> dVar) {
        Object e = C13999m0.m32451e(new C11071a(this, gVar, (C12074d<? super C11071a>) null), dVar);
        if (e == C12150d.m26492c()) {
            return e;
        }
        return C11921v.f18618a;
    }

    public C11070h(C13089p<? super C10967g<? super R>, ? super T, ? super C12074d<? super C11921v>, ? extends Object> pVar, C10962f<? extends T> fVar, C12079g gVar, int i, C10886a aVar) {
        super(fVar, gVar, i, aVar);
        this.f17179f = pVar;
    }
}
