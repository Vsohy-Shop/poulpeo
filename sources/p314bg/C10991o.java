package p314bg;

import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.jvm.internal.C12755d0;
import kotlin.jvm.internal.C12760f0;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,141:1\n1#2:142\n106#3:143\n106#3:144\n106#3:145\n106#3:146\n*S KotlinDebug\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n22#1:143\n33#1:144\n52#1:145\n83#1:146\n*E\n"})
/* renamed from: bg.o */
/* compiled from: Limit.kt */
final /* synthetic */ class C10991o {

    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,112:1\n23#2,5:113\n*E\n"})
    /* renamed from: bg.o$a */
    /* compiled from: SafeCollector.common.kt */
    public static final class C10992a implements C10962f<T> {

        /* renamed from: b */
        final /* synthetic */ C10962f f16970b;

        /* renamed from: c */
        final /* synthetic */ int f16971c;

        public C10992a(C10962f fVar, int i) {
            this.f16970b = fVar;
            this.f16971c = i;
        }

        public Object collect(C10967g<? super T> gVar, C12074d<? super C11921v> dVar) {
            Object collect = this.f16970b.collect(new C10993b(new C12760f0(), this.f16971c, gVar), dVar);
            if (collect == C12150d.m26492c()) {
                return collect;
            }
            return C11921v.f18618a;
        }
    }

    /* renamed from: bg.o$b */
    /* compiled from: Limit.kt */
    static final class C10993b<T> implements C10967g {

        /* renamed from: b */
        final /* synthetic */ C12760f0 f16972b;

        /* renamed from: c */
        final /* synthetic */ int f16973c;

        /* renamed from: d */
        final /* synthetic */ C10967g<T> f16974d;

        @C12739f(mo50609c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", mo50610f = "Limit.kt", mo50611l = {25}, mo50612m = "emit")
        /* renamed from: bg.o$b$a */
        /* compiled from: Limit.kt */
        static final class C10994a extends C12737d {

            /* renamed from: h */
            /* synthetic */ Object f16975h;

            /* renamed from: i */
            final /* synthetic */ C10993b<T> f16976i;

            /* renamed from: j */
            int f16977j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10994a(C10993b<? super T> bVar, C12074d<? super C10994a> dVar) {
                super(dVar);
                this.f16976i = bVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f16975h = obj;
                this.f16977j |= Integer.MIN_VALUE;
                return this.f16976i.emit(null, this);
            }
        }

        C10993b(C12760f0 f0Var, int i, C10967g<? super T> gVar) {
            this.f16972b = f0Var;
            this.f16973c = i;
            this.f16974d = gVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object emit(T r6, p355hf.C12074d<? super p336ef.C11921v> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof p314bg.C10991o.C10993b.C10994a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                bg.o$b$a r0 = (p314bg.C10991o.C10993b.C10994a) r0
                int r1 = r0.f16977j
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f16977j = r1
                goto L_0x0018
            L_0x0013:
                bg.o$b$a r0 = new bg.o$b$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.f16975h
                java.lang.Object r1 = p362if.C12150d.m26492c()
                int r2 = r0.f16977j
                r3 = 1
                if (r2 == 0) goto L_0x0031
                if (r2 != r3) goto L_0x0029
                p336ef.C11910n.m25701b(r7)
                goto L_0x0047
            L_0x0029:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0031:
                p336ef.C11910n.m25701b(r7)
                kotlin.jvm.internal.f0 r7 = r5.f16972b
                int r2 = r7.f20416b
                int r4 = r5.f16973c
                if (r2 < r4) goto L_0x004a
                bg.g<T> r7 = r5.f16974d
                r0.f16977j = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L_0x0047
                return r1
            L_0x0047:
                ef.v r6 = p336ef.C11921v.f18618a
                return r6
            L_0x004a:
                int r2 = r2 + r3
                r7.f20416b = r2
                ef.v r6 = p336ef.C11921v.f18618a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p314bg.C10991o.C10993b.emit(java.lang.Object, hf.d):java.lang.Object");
        }
    }

    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,112:1\n34#2,10:113\n*E\n"})
    /* renamed from: bg.o$c */
    /* compiled from: SafeCollector.common.kt */
    public static final class C10995c implements C10962f<T> {

        /* renamed from: b */
        final /* synthetic */ C10962f f16978b;

        /* renamed from: c */
        final /* synthetic */ C13088o f16979c;

        public C10995c(C10962f fVar, C13088o oVar) {
            this.f16978b = fVar;
            this.f16979c = oVar;
        }

        public Object collect(C10967g<? super T> gVar, C12074d<? super C11921v> dVar) {
            Object collect = this.f16978b.collect(new C10996d(new C12755d0(), gVar, this.f16979c), dVar);
            if (collect == C12150d.m26492c()) {
                return collect;
            }
            return C11921v.f18618a;
        }
    }

    /* renamed from: bg.o$d */
    /* compiled from: Limit.kt */
    static final class C10996d<T> implements C10967g {

        /* renamed from: b */
        final /* synthetic */ C12755d0 f16980b;

        /* renamed from: c */
        final /* synthetic */ C10967g<T> f16981c;

        /* renamed from: d */
        final /* synthetic */ C13088o<T, C12074d<? super Boolean>, Object> f16982d;

        @C12739f(mo50609c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", mo50610f = "Limit.kt", mo50611l = {37, 38, 40}, mo50612m = "emit")
        /* renamed from: bg.o$d$a */
        /* compiled from: Limit.kt */
        static final class C10997a extends C12737d {

            /* renamed from: h */
            Object f16983h;

            /* renamed from: i */
            Object f16984i;

            /* renamed from: j */
            /* synthetic */ Object f16985j;

            /* renamed from: k */
            final /* synthetic */ C10996d<T> f16986k;

            /* renamed from: l */
            int f16987l;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10997a(C10996d<? super T> dVar, C12074d<? super C10997a> dVar2) {
                super(dVar2);
                this.f16986k = dVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f16985j = obj;
                this.f16987l |= Integer.MIN_VALUE;
                return this.f16986k.emit(null, this);
            }
        }

        C10996d(C12755d0 d0Var, C10967g<? super T> gVar, C13088o<? super T, ? super C12074d<? super Boolean>, ? extends Object> oVar) {
            this.f16980b = d0Var;
            this.f16981c = gVar;
            this.f16982d = oVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0074  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x008b  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object emit(T r7, p355hf.C12074d<? super p336ef.C11921v> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof p314bg.C10991o.C10996d.C10997a
                if (r0 == 0) goto L_0x0013
                r0 = r8
                bg.o$d$a r0 = (p314bg.C10991o.C10996d.C10997a) r0
                int r1 = r0.f16987l
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f16987l = r1
                goto L_0x0018
            L_0x0013:
                bg.o$d$a r0 = new bg.o$d$a
                r0.<init>(r6, r8)
            L_0x0018:
                java.lang.Object r8 = r0.f16985j
                java.lang.Object r1 = p362if.C12150d.m26492c()
                int r2 = r0.f16987l
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L_0x0045
                if (r2 == r5) goto L_0x0041
                if (r2 == r4) goto L_0x0037
                if (r2 != r3) goto L_0x002f
                p336ef.C11910n.m25701b(r8)
                goto L_0x0088
            L_0x002f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x0037:
                java.lang.Object r7 = r0.f16984i
                java.lang.Object r2 = r0.f16983h
                bg.o$d r2 = (p314bg.C10991o.C10996d) r2
                p336ef.C11910n.m25701b(r8)
                goto L_0x006c
            L_0x0041:
                p336ef.C11910n.m25701b(r8)
                goto L_0x0059
            L_0x0045:
                p336ef.C11910n.m25701b(r8)
                kotlin.jvm.internal.d0 r8 = r6.f16980b
                boolean r8 = r8.f20407b
                if (r8 == 0) goto L_0x005c
                bg.g<T> r8 = r6.f16981c
                r0.f16987l = r5
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L_0x0059
                return r1
            L_0x0059:
                ef.v r7 = p336ef.C11921v.f18618a
                return r7
            L_0x005c:
                of.o<T, hf.d<? super java.lang.Boolean>, java.lang.Object> r8 = r6.f16982d
                r0.f16983h = r6
                r0.f16984i = r7
                r0.f16987l = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L_0x006b
                return r1
            L_0x006b:
                r2 = r6
            L_0x006c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L_0x008b
                kotlin.jvm.internal.d0 r8 = r2.f16980b
                r8.f20407b = r5
                bg.g<T> r8 = r2.f16981c
                r2 = 0
                r0.f16983h = r2
                r0.f16984i = r2
                r0.f16987l = r3
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L_0x0088
                return r1
            L_0x0088:
                ef.v r7 = p336ef.C11921v.f18618a
                return r7
            L_0x008b:
                ef.v r7 = p336ef.C11921v.f18618a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p314bg.C10991o.C10996d.emit(java.lang.Object, hf.d):java.lang.Object");
        }
    }

    @C12739f(mo50609c = "kotlinx.coroutines.flow.FlowKt__LimitKt", mo50610f = "Limit.kt", mo50611l = {73}, mo50612m = "emitAbort$FlowKt__LimitKt")
    /* renamed from: bg.o$e */
    /* compiled from: Limit.kt */
    static final class C10998e<T> extends C12737d {

        /* renamed from: h */
        Object f16988h;

        /* renamed from: i */
        /* synthetic */ Object f16989i;

        /* renamed from: j */
        int f16990j;

        C10998e(C12074d<? super C10998e> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f16989i = obj;
            this.f16990j |= Integer.MIN_VALUE;
            return C10991o.m23658d((C10967g) null, null, this);
        }
    }

    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,112:1\n53#2,3:113\n66#2,4:116\n*E\n"})
    /* renamed from: bg.o$f */
    /* compiled from: SafeCollector.common.kt */
    public static final class C10999f implements C10962f<T> {

        /* renamed from: b */
        final /* synthetic */ C10962f f16991b;

        /* renamed from: c */
        final /* synthetic */ int f16992c;

        @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,112:1\n*E\n"})
        @C12739f(mo50609c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", mo50610f = "Limit.kt", mo50611l = {115}, mo50612m = "collect")
        /* renamed from: bg.o$f$a */
        /* compiled from: SafeCollector.common.kt */
        public static final class C11000a extends C12737d {

            /* renamed from: h */
            /* synthetic */ Object f16993h;

            /* renamed from: i */
            int f16994i;

            /* renamed from: j */
            final /* synthetic */ C10999f f16995j;

            /* renamed from: k */
            Object f16996k;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C11000a(C10999f fVar, C12074d dVar) {
                super(dVar);
                this.f16995j = fVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f16993h = obj;
                this.f16994i |= Integer.MIN_VALUE;
                return this.f16995j.collect((C10967g) null, this);
            }
        }

        public C10999f(C10962f fVar, int i) {
            this.f16991b = fVar;
            this.f16992c = i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object collect(p314bg.C10967g<? super T> r7, p355hf.C12074d<? super p336ef.C11921v> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof p314bg.C10991o.C10999f.C11000a
                if (r0 == 0) goto L_0x0013
                r0 = r8
                bg.o$f$a r0 = (p314bg.C10991o.C10999f.C11000a) r0
                int r1 = r0.f16994i
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f16994i = r1
                goto L_0x0018
            L_0x0013:
                bg.o$f$a r0 = new bg.o$f$a
                r0.<init>(r6, r8)
            L_0x0018:
                java.lang.Object r8 = r0.f16993h
                java.lang.Object r1 = p362if.C12150d.m26492c()
                int r2 = r0.f16994i
                r3 = 1
                if (r2 == 0) goto L_0x0035
                if (r2 != r3) goto L_0x002d
                java.lang.Object r7 = r0.f16996k
                bg.g r7 = (p314bg.C10967g) r7
                p336ef.C11910n.m25701b(r8)     // Catch:{ AbortFlowException -> 0x0051 }
                goto L_0x0055
            L_0x002d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x0035:
                p336ef.C11910n.m25701b(r8)
                kotlin.jvm.internal.f0 r8 = new kotlin.jvm.internal.f0
                r8.<init>()
                bg.f r2 = r6.f16991b     // Catch:{ AbortFlowException -> 0x0051 }
                bg.o$g r4 = new bg.o$g     // Catch:{ AbortFlowException -> 0x0051 }
                int r5 = r6.f16992c     // Catch:{ AbortFlowException -> 0x0051 }
                r4.<init>(r8, r5, r7)     // Catch:{ AbortFlowException -> 0x0051 }
                r0.f16996k = r7     // Catch:{ AbortFlowException -> 0x0051 }
                r0.f16994i = r3     // Catch:{ AbortFlowException -> 0x0051 }
                java.lang.Object r7 = r2.collect(r4, r0)     // Catch:{ AbortFlowException -> 0x0051 }
                if (r7 != r1) goto L_0x0055
                return r1
            L_0x0051:
                r8 = move-exception
                p320cg.C11076j.m23897a(r8, r7)
            L_0x0055:
                ef.v r7 = p336ef.C11921v.f18618a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p314bg.C10991o.C10999f.collect(bg.g, hf.d):java.lang.Object");
        }
    }

    /* renamed from: bg.o$g */
    /* compiled from: Limit.kt */
    static final class C11001g<T> implements C10967g {

        /* renamed from: b */
        final /* synthetic */ C12760f0 f16997b;

        /* renamed from: c */
        final /* synthetic */ int f16998c;

        /* renamed from: d */
        final /* synthetic */ C10967g<T> f16999d;

        @C12739f(mo50609c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", mo50610f = "Limit.kt", mo50611l = {61, 63}, mo50612m = "emit")
        /* renamed from: bg.o$g$a */
        /* compiled from: Limit.kt */
        static final class C11002a extends C12737d {

            /* renamed from: h */
            /* synthetic */ Object f17000h;

            /* renamed from: i */
            final /* synthetic */ C11001g<T> f17001i;

            /* renamed from: j */
            int f17002j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C11002a(C11001g<? super T> gVar, C12074d<? super C11002a> dVar) {
                super(dVar);
                this.f17001i = gVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f17000h = obj;
                this.f17002j |= Integer.MIN_VALUE;
                return this.f17001i.emit(null, this);
            }
        }

        C11001g(C12760f0 f0Var, int i, C10967g<? super T> gVar) {
            this.f16997b = f0Var;
            this.f16998c = i;
            this.f16999d = gVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object emit(T r6, p355hf.C12074d<? super p336ef.C11921v> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof p314bg.C10991o.C11001g.C11002a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                bg.o$g$a r0 = (p314bg.C10991o.C11001g.C11002a) r0
                int r1 = r0.f17002j
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f17002j = r1
                goto L_0x0018
            L_0x0013:
                bg.o$g$a r0 = new bg.o$g$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.f17000h
                java.lang.Object r1 = p362if.C12150d.m26492c()
                int r2 = r0.f17002j
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0038
                if (r2 == r4) goto L_0x0034
                if (r2 != r3) goto L_0x002c
                p336ef.C11910n.m25701b(r7)
                goto L_0x005f
            L_0x002c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0034:
                p336ef.C11910n.m25701b(r7)
                goto L_0x0051
            L_0x0038:
                p336ef.C11910n.m25701b(r7)
                kotlin.jvm.internal.f0 r7 = r5.f16997b
                int r2 = r7.f20416b
                int r2 = r2 + r4
                r7.f20416b = r2
                int r7 = r5.f16998c
                if (r2 >= r7) goto L_0x0054
                bg.g<T> r7 = r5.f16999d
                r0.f17002j = r4
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L_0x0051
                return r1
            L_0x0051:
                ef.v r6 = p336ef.C11921v.f18618a
                return r6
            L_0x0054:
                bg.g<T> r7 = r5.f16999d
                r0.f17002j = r3
                java.lang.Object r6 = p314bg.C10991o.m23658d(r7, r6, r0)
                if (r6 != r1) goto L_0x005f
                return r1
            L_0x005f:
                ef.v r6 = p336ef.C11921v.f18618a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p314bg.C10991o.C11001g.emit(java.lang.Object, hf.d):java.lang.Object");
        }
    }

    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,112:1\n85#2:113\n126#2,15:114\n*S KotlinDebug\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n85#1:114,15\n*E\n"})
    /* renamed from: bg.o$h */
    /* compiled from: SafeCollector.common.kt */
    public static final class C11003h implements C10962f<T> {

        /* renamed from: b */
        final /* synthetic */ C10962f f17003b;

        /* renamed from: c */
        final /* synthetic */ C13088o f17004c;

        @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1$collect$1\n*L\n1#1,112:1\n*E\n"})
        @C12739f(mo50609c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", mo50610f = "Limit.kt", mo50611l = {124}, mo50612m = "collect")
        /* renamed from: bg.o$h$a */
        /* compiled from: SafeCollector.common.kt */
        public static final class C11004a extends C12737d {

            /* renamed from: h */
            /* synthetic */ Object f17005h;

            /* renamed from: i */
            int f17006i;

            /* renamed from: j */
            final /* synthetic */ C11003h f17007j;

            /* renamed from: k */
            Object f17008k;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C11004a(C11003h hVar, C12074d dVar) {
                super(dVar);
                this.f17007j = hVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f17005h = obj;
                this.f17006i |= Integer.MIN_VALUE;
                return this.f17007j.collect((C10967g) null, this);
            }
        }

        public C11003h(C10962f fVar, C13088o oVar) {
            this.f17003b = fVar;
            this.f17004c = oVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object collect(p314bg.C10967g<? super T> r6, p355hf.C12074d<? super p336ef.C11921v> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof p314bg.C10991o.C11003h.C11004a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                bg.o$h$a r0 = (p314bg.C10991o.C11003h.C11004a) r0
                int r1 = r0.f17006i
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f17006i = r1
                goto L_0x0018
            L_0x0013:
                bg.o$h$a r0 = new bg.o$h$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.f17005h
                java.lang.Object r1 = p362if.C12150d.m26492c()
                int r2 = r0.f17006i
                r3 = 1
                if (r2 == 0) goto L_0x0037
                if (r2 != r3) goto L_0x002f
                java.lang.Object r6 = r0.f17008k
                bg.o$i r6 = (p314bg.C10991o.C11005i) r6
                p336ef.C11910n.m25701b(r7)     // Catch:{ AbortFlowException -> 0x002d }
                goto L_0x0053
            L_0x002d:
                r7 = move-exception
                goto L_0x0050
            L_0x002f:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0037:
                p336ef.C11910n.m25701b(r7)
                bg.f r7 = r5.f17003b
                bg.o$i r2 = new bg.o$i
                of.o r4 = r5.f17004c
                r2.<init>(r4, r6)
                r0.f17008k = r2     // Catch:{ AbortFlowException -> 0x004e }
                r0.f17006i = r3     // Catch:{ AbortFlowException -> 0x004e }
                java.lang.Object r6 = r7.collect(r2, r0)     // Catch:{ AbortFlowException -> 0x004e }
                if (r6 != r1) goto L_0x0053
                return r1
            L_0x004e:
                r7 = move-exception
                r6 = r2
            L_0x0050:
                p320cg.C11076j.m23897a(r7, r6)
            L_0x0053:
                ef.v r6 = p336ef.C11921v.f18618a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p314bg.C10991o.C11003h.collect(bg.g, hf.d):java.lang.Object");
        }
    }

    @SourceDebugExtension({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,141:1\n86#2,5:142\n*E\n"})
    /* renamed from: bg.o$i */
    /* compiled from: Limit.kt */
    public static final class C11005i implements C10967g<T> {

        /* renamed from: b */
        final /* synthetic */ C13088o f17009b;

        /* renamed from: c */
        final /* synthetic */ C10967g f17010c;

        @SourceDebugExtension({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1$emit$1\n*L\n1#1,141:1\n*E\n"})
        @C12739f(mo50609c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1", mo50610f = "Limit.kt", mo50611l = {142, 143}, mo50612m = "emit")
        /* renamed from: bg.o$i$a */
        /* compiled from: Limit.kt */
        public static final class C11006a extends C12737d {

            /* renamed from: h */
            Object f17011h;

            /* renamed from: i */
            /* synthetic */ Object f17012i;

            /* renamed from: j */
            int f17013j;

            /* renamed from: k */
            final /* synthetic */ C11005i f17014k;

            /* renamed from: l */
            Object f17015l;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C11006a(C11005i iVar, C12074d dVar) {
                super(dVar);
                this.f17014k = iVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f17012i = obj;
                this.f17013j |= Integer.MIN_VALUE;
                return this.f17014k.emit(null, this);
            }
        }

        public C11005i(C13088o oVar, C10967g gVar) {
            this.f17009b = oVar;
            this.f17010c = gVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x007b  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x007e  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0081  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object emit(T r8, p355hf.C12074d<? super p336ef.C11921v> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof p314bg.C10991o.C11005i.C11006a
                if (r0 == 0) goto L_0x0013
                r0 = r9
                bg.o$i$a r0 = (p314bg.C10991o.C11005i.C11006a) r0
                int r1 = r0.f17013j
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f17013j = r1
                goto L_0x0018
            L_0x0013:
                bg.o$i$a r0 = new bg.o$i$a
                r0.<init>(r7, r9)
            L_0x0018:
                java.lang.Object r9 = r0.f17012i
                java.lang.Object r1 = p362if.C12150d.m26492c()
                int r2 = r0.f17013j
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0046
                if (r2 == r4) goto L_0x0038
                if (r2 != r3) goto L_0x0030
                java.lang.Object r8 = r0.f17011h
                bg.o$i r8 = (p314bg.C10991o.C11005i) r8
                p336ef.C11910n.m25701b(r9)
                goto L_0x007c
            L_0x0030:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L_0x0038:
                java.lang.Object r8 = r0.f17015l
                java.lang.Object r2 = r0.f17011h
                bg.o$i r2 = (p314bg.C10991o.C11005i) r2
                p336ef.C11910n.m25701b(r9)
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r6
                goto L_0x0063
            L_0x0046:
                p336ef.C11910n.m25701b(r9)
                of.o r9 = r7.f17009b
                r0.f17011h = r7
                r0.f17015l = r8
                r0.f17013j = r4
                r2 = 6
                kotlin.jvm.internal.C12773m.m28630c(r2)
                java.lang.Object r9 = r9.invoke(r8, r0)
                r2 = 7
                kotlin.jvm.internal.C12773m.m28630c(r2)
                if (r9 != r1) goto L_0x0060
                return r1
            L_0x0060:
                r2 = r9
                r9 = r8
                r8 = r7
            L_0x0063:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L_0x007b
                bg.g r2 = r8.f17010c
                r0.f17011h = r8
                r5 = 0
                r0.f17015l = r5
                r0.f17013j = r3
                java.lang.Object r9 = r2.emit(r9, r0)
                if (r9 != r1) goto L_0x007c
                return r1
            L_0x007b:
                r4 = 0
            L_0x007c:
                if (r4 == 0) goto L_0x0081
                ef.v r8 = p336ef.C11921v.f18618a
                return r8
            L_0x0081:
                kotlinx.coroutines.flow.internal.AbortFlowException r9 = new kotlinx.coroutines.flow.internal.AbortFlowException
                r9.<init>(r8)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p314bg.C10991o.C11005i.emit(java.lang.Object, hf.d):java.lang.Object");
        }
    }

    /* renamed from: b */
    public static final <T> C10962f<T> m23656b(C10962f<? extends T> fVar, int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new C10992a(fVar, i);
        }
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i).toString());
    }

    /* renamed from: c */
    public static final <T> C10962f<T> m23657c(C10962f<? extends T> fVar, C13088o<? super T, ? super C12074d<? super Boolean>, ? extends Object> oVar) {
        return new C10995c(fVar, oVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m23658d(p314bg.C10967g<? super T> r4, T r5, p355hf.C12074d<? super p336ef.C11921v> r6) {
        /*
            boolean r0 = r6 instanceof p314bg.C10991o.C10998e
            if (r0 == 0) goto L_0x0013
            r0 = r6
            bg.o$e r0 = (p314bg.C10991o.C10998e) r0
            int r1 = r0.f16990j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f16990j = r1
            goto L_0x0018
        L_0x0013:
            bg.o$e r0 = new bg.o$e
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f16989i
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.f16990j
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x002d:
            java.lang.Object r4 = r0.f16988h
            bg.g r4 = (p314bg.C10967g) r4
            p336ef.C11910n.m25701b(r6)
            goto L_0x0043
        L_0x0035:
            p336ef.C11910n.m25701b(r6)
            r0.f16988h = r4
            r0.f16990j = r3
            java.lang.Object r5 = r4.emit(r5, r0)
            if (r5 != r1) goto L_0x0043
            return r1
        L_0x0043:
            kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p314bg.C10991o.m23658d(bg.g, java.lang.Object, hf.d):java.lang.Object");
    }

    /* renamed from: e */
    public static final <T> C10962f<T> m23659e(C10962f<? extends T> fVar, int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new C10999f(fVar, i);
        }
        throw new IllegalArgumentException(("Requested element count " + i + " should be positive").toString());
    }

    /* renamed from: f */
    public static final <T> C10962f<T> m23660f(C10962f<? extends T> fVar, C13088o<? super T, ? super C12074d<? super Boolean>, ? extends Object> oVar) {
        return new C11003h(fVar, oVar);
    }
}
