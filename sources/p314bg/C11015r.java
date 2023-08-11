package p314bg;

import kotlin.coroutines.jvm.internal.C12735b;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p314bg.C10958d0;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p355hf.C12079g;
import p404of.C13088o;
import p466yf.C13970h;
import p466yf.C13995l0;
import p466yf.C14004n0;
import p466yf.C14054y1;

@SourceDebugExtension({"SMAP\nShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/FlowKt__ShareKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,426:1\n1#2:427\n*E\n"})
/* renamed from: bg.r */
/* compiled from: Share.kt */
final /* synthetic */ class C11015r {

    @C12739f(mo50609c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", mo50610f = "Share.kt", mo50611l = {214, 218, 219, 225}, mo50612m = "invokeSuspend")
    /* renamed from: bg.r$a */
    /* compiled from: Share.kt */
    static final class C11016a extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {

        /* renamed from: h */
        int f17038h;

        /* renamed from: i */
        final /* synthetic */ C10958d0 f17039i;

        /* renamed from: j */
        final /* synthetic */ C10962f<T> f17040j;

        /* renamed from: k */
        final /* synthetic */ C11024t<T> f17041k;

        /* renamed from: l */
        final /* synthetic */ T f17042l;

        @C12739f(mo50609c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", mo50610f = "Share.kt", mo50611l = {}, mo50612m = "invokeSuspend")
        /* renamed from: bg.r$a$a */
        /* compiled from: Share.kt */
        static final class C11017a extends C12746l implements C13088o<Integer, C12074d<? super Boolean>, Object> {

            /* renamed from: h */
            int f17043h;

            /* renamed from: i */
            /* synthetic */ int f17044i;

            C11017a(C12074d<? super C11017a> dVar) {
                super(2, dVar);
            }

            public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
                C11017a aVar = new C11017a(dVar);
                aVar.f17044i = ((Number) obj).intValue();
                return aVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return mo46057l(((Number) obj).intValue(), (C12074d) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                boolean z;
                Object unused = C12150d.m26492c();
                if (this.f17043h == 0) {
                    C11910n.m25701b(obj);
                    if (this.f17044i > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return C12735b.m28558a(z);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: l */
            public final Object mo46057l(int i, C12074d<? super Boolean> dVar) {
                return ((C11017a) create(Integer.valueOf(i), dVar)).invokeSuspend(C11921v.f18618a);
            }
        }

        @C12739f(mo50609c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", mo50610f = "Share.kt", mo50611l = {227}, mo50612m = "invokeSuspend")
        /* renamed from: bg.r$a$b */
        /* compiled from: Share.kt */
        static final class C11018b extends C12746l implements C13088o<C10952b0, C12074d<? super C11921v>, Object> {

            /* renamed from: h */
            int f17045h;

            /* renamed from: i */
            /* synthetic */ Object f17046i;

            /* renamed from: j */
            final /* synthetic */ C10962f<T> f17047j;

            /* renamed from: k */
            final /* synthetic */ C11024t<T> f17048k;

            /* renamed from: l */
            final /* synthetic */ T f17049l;

            /* renamed from: bg.r$a$b$a */
            /* compiled from: Share.kt */
            public /* synthetic */ class C11019a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f17050a;

                /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
                static {
                    /*
                        bg.b0[] r0 = p314bg.C10952b0.values()
                        int r0 = r0.length
                        int[] r0 = new int[r0]
                        bg.b0 r1 = p314bg.C10952b0.START     // Catch:{ NoSuchFieldError -> 0x0010 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                        r2 = 1
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                    L_0x0010:
                        bg.b0 r1 = p314bg.C10952b0.STOP     // Catch:{ NoSuchFieldError -> 0x0019 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                        r2 = 2
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                    L_0x0019:
                        bg.b0 r1 = p314bg.C10952b0.STOP_AND_RESET_REPLAY_CACHE     // Catch:{ NoSuchFieldError -> 0x0022 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                        r2 = 3
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                    L_0x0022:
                        f17050a = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p314bg.C11015r.C11016a.C11018b.C11019a.<clinit>():void");
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C11018b(C10962f<? extends T> fVar, C11024t<T> tVar, T t, C12074d<? super C11018b> dVar) {
                super(2, dVar);
                this.f17047j = fVar;
                this.f17048k = tVar;
                this.f17049l = t;
            }

            public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
                C11018b bVar = new C11018b(this.f17047j, this.f17048k, this.f17049l, dVar);
                bVar.f17046i = obj;
                return bVar;
            }

            public final Object invokeSuspend(Object obj) {
                Object c = C12150d.m26492c();
                int i = this.f17045h;
                if (i == 0) {
                    C11910n.m25701b(obj);
                    int i2 = C11019a.f17050a[((C10952b0) this.f17046i).ordinal()];
                    if (i2 == 1) {
                        C10962f<T> fVar = this.f17047j;
                        C11024t<T> tVar = this.f17048k;
                        this.f17045h = 1;
                        if (fVar.collect(tVar, this) == c) {
                            return c;
                        }
                    } else if (i2 == 3) {
                        T t = this.f17049l;
                        if (t == C11033z.f17083a) {
                            this.f17048k.mo46040d();
                        } else {
                            this.f17048k.mo46041e(t);
                        }
                    }
                } else if (i == 1) {
                    C11910n.m25701b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C11921v.f18618a;
            }

            /* renamed from: l */
            public final Object invoke(C10952b0 b0Var, C12074d<? super C11921v> dVar) {
                return ((C11018b) create(b0Var, dVar)).invokeSuspend(C11921v.f18618a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11016a(C10958d0 d0Var, C10962f<? extends T> fVar, C11024t<T> tVar, T t, C12074d<? super C11016a> dVar) {
            super(2, dVar);
            this.f17039i = d0Var;
            this.f17040j = fVar;
            this.f17041k = tVar;
            this.f17042l = t;
        }

        public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
            return new C11016a(this.f17039i, this.f17040j, this.f17041k, this.f17042l, dVar);
        }

        public final Object invokeSuspend(Object obj) {
            Object c = C12150d.m26492c();
            int i = this.f17038h;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        C11910n.m25701b(obj);
                    } else if (!(i == 3 || i == 4)) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                C11910n.m25701b(obj);
                return C11921v.f18618a;
            }
            C11910n.m25701b(obj);
            C10958d0 d0Var = this.f17039i;
            C10958d0.C10959a aVar = C10958d0.f16915a;
            if (d0Var == aVar.mo46026c()) {
                C10962f<T> fVar = this.f17040j;
                C11024t<T> tVar = this.f17041k;
                this.f17038h = 1;
                if (fVar.collect(tVar, this) == c) {
                    return c;
                }
            } else if (this.f17039i == aVar.mo46027d()) {
                C10972h0<Integer> g = this.f17041k.mo46059g();
                C11017a aVar2 = new C11017a((C12074d<? super C11017a>) null);
                this.f17038h = 2;
                if (C10971h.m23607n(g, aVar2, this) == c) {
                    return c;
                }
            } else {
                C10962f<C10952b0> g2 = C10971h.m23600g(this.f17039i.mo46024a(this.f17041k.mo46059g()));
                C11018b bVar = new C11018b(this.f17040j, this.f17041k, this.f17042l, (C12074d<? super C11018b>) null);
                this.f17038h = 4;
                if (C10971h.m23599f(g2, bVar, this) == c) {
                    return c;
                }
            }
            return C11921v.f18618a;
            C10962f<T> fVar2 = this.f17040j;
            C11024t<T> tVar2 = this.f17041k;
            this.f17038h = 3;
            if (fVar2.collect(tVar2, this) == c) {
                return c;
            }
            return C11921v.f18618a;
        }

        public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
            return ((C11016a) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
        }
    }

    /* renamed from: a */
    public static final <T> C10972h0<T> m23666a(C11025u<T> uVar) {
        return new C11026v(uVar, (C14054y1) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r3 == 0) goto L_0x0034;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final <T> p314bg.C10954c0<T> m23667b(p314bg.C10962f<? extends T> r7, int r8) {
        /*
            ag.d$a r0 = p308ag.C10894d.f16814L
            int r0 = r0.mo45908a()
            int r0 = p436tf.C13537l.m30877d(r8, r0)
            int r0 = r0 - r8
            boolean r1 = r7 instanceof p320cg.C11063d
            if (r1 == 0) goto L_0x003d
            r1 = r7
            cg.d r1 = (p320cg.C11063d) r1
            bg.f r2 = r1.mo46159j()
            if (r2 == 0) goto L_0x003d
            bg.c0 r7 = new bg.c0
            int r3 = r1.f17166c
            r4 = -3
            if (r3 == r4) goto L_0x0026
            r4 = -2
            if (r3 == r4) goto L_0x0026
            if (r3 == 0) goto L_0x0026
            r0 = r3
            goto L_0x0035
        L_0x0026:
            ag.a r4 = r1.f17167d
            ag.a r5 = p308ag.C10886a.SUSPEND
            r6 = 0
            if (r4 != r5) goto L_0x0030
            if (r3 != 0) goto L_0x0035
            goto L_0x0034
        L_0x0030:
            if (r8 != 0) goto L_0x0034
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = r6
        L_0x0035:
            ag.a r8 = r1.f17167d
            hf.g r1 = r1.f17165b
            r7.<init>(r2, r0, r8, r1)
            return r7
        L_0x003d:
            bg.c0 r8 = new bg.c0
            ag.a r1 = p308ag.C10886a.SUSPEND
            hf.h r2 = p355hf.C12085h.f18916b
            r8.<init>(r7, r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p314bg.C11015r.m23667b(bg.f, int):bg.c0");
    }

    /* renamed from: c */
    private static final <T> C14054y1 m23668c(C13995l0 l0Var, C12079g gVar, C10962f<? extends T> fVar, C11024t<T> tVar, C10958d0 d0Var, T t) {
        C14004n0 n0Var;
        if (C12775o.m28634d(d0Var, C10958d0.f16915a.mo46026c())) {
            n0Var = C14004n0.DEFAULT;
        } else {
            n0Var = C14004n0.UNDISPATCHED;
        }
        return C13970h.m32374c(l0Var, gVar, n0Var, new C11016a(d0Var, fVar, tVar, t, (C12074d<? super C11016a>) null));
    }

    /* renamed from: d */
    public static final <T> C10972h0<T> m23669d(C10962f<? extends T> fVar, C13995l0 l0Var, C10958d0 d0Var, T t) {
        C10954c0<? extends T> b = m23667b(fVar, 1);
        C11025u a = C10979j0.m23633a(t);
        return new C11026v(a, m23668c(l0Var, b.f16905d, b.f16902a, a, d0Var, t));
    }
}
