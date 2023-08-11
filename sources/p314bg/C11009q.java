package p314bg;

import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nReduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,172:1\n126#2,15:173\n126#2,15:188\n126#2,15:203\n126#2,15:218\n126#2,15:233\n*S KotlinDebug\n*F\n+ 1 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n72#1:173,15\n92#1:188,15\n106#1:203,15\n124#1:218,15\n137#1:233,15\n*E\n"})
/* renamed from: bg.q */
/* compiled from: Reduce.kt */
final /* synthetic */ class C11009q {

    @SourceDebugExtension({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n1#1,141:1\n93#2,2:142\n*E\n"})
    /* renamed from: bg.q$a */
    /* compiled from: Limit.kt */
    public static final class C11010a implements C10967g<T> {

        /* renamed from: b */
        final /* synthetic */ Ref$ObjectRef f17021b;

        public C11010a(Ref$ObjectRef ref$ObjectRef) {
            this.f17021b = ref$ObjectRef;
        }

        public Object emit(T t, C12074d<? super C11921v> dVar) {
            this.f17021b.f20403b = t;
            throw new AbortFlowException(this);
        }
    }

    @SourceDebugExtension({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n1#1,141:1\n107#2,5:142\n*E\n"})
    /* renamed from: bg.q$b */
    /* compiled from: Limit.kt */
    public static final class C11011b implements C10967g<T> {

        /* renamed from: b */
        final /* synthetic */ C13088o f17022b;

        /* renamed from: c */
        final /* synthetic */ Ref$ObjectRef f17023c;

        @SourceDebugExtension({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1$emit$1\n*L\n1#1,141:1\n*E\n"})
        @C12739f(mo50609c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", mo50610f = "Reduce.kt", mo50611l = {142}, mo50612m = "emit")
        /* renamed from: bg.q$b$a */
        /* compiled from: Limit.kt */
        public static final class C11012a extends C12737d {

            /* renamed from: h */
            Object f17024h;

            /* renamed from: i */
            /* synthetic */ Object f17025i;

            /* renamed from: j */
            int f17026j;

            /* renamed from: k */
            final /* synthetic */ C11011b f17027k;

            /* renamed from: l */
            Object f17028l;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C11012a(C11011b bVar, C12074d dVar) {
                super(dVar);
                this.f17027k = bVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f17025i = obj;
                this.f17026j |= Integer.MIN_VALUE;
                return this.f17027k.emit(null, this);
            }
        }

        public C11011b(C13088o oVar, Ref$ObjectRef ref$ObjectRef) {
            this.f17022b = oVar;
            this.f17023c = ref$ObjectRef;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object emit(T r5, p355hf.C12074d<? super p336ef.C11921v> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof p314bg.C11009q.C11011b.C11012a
                if (r0 == 0) goto L_0x0013
                r0 = r6
                bg.q$b$a r0 = (p314bg.C11009q.C11011b.C11012a) r0
                int r1 = r0.f17026j
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f17026j = r1
                goto L_0x0018
            L_0x0013:
                bg.q$b$a r0 = new bg.q$b$a
                r0.<init>(r4, r6)
            L_0x0018:
                java.lang.Object r6 = r0.f17025i
                java.lang.Object r1 = p362if.C12150d.m26492c()
                int r2 = r0.f17026j
                r3 = 1
                if (r2 == 0) goto L_0x0037
                if (r2 != r3) goto L_0x002f
                java.lang.Object r5 = r0.f17028l
                java.lang.Object r0 = r0.f17024h
                bg.q$b r0 = (p314bg.C11009q.C11011b) r0
                p336ef.C11910n.m25701b(r6)
                goto L_0x0052
            L_0x002f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x0037:
                p336ef.C11910n.m25701b(r6)
                of.o r6 = r4.f17022b
                r0.f17024h = r4
                r0.f17028l = r5
                r0.f17026j = r3
                r2 = 6
                kotlin.jvm.internal.C12773m.m28630c(r2)
                java.lang.Object r6 = r6.invoke(r5, r0)
                r0 = 7
                kotlin.jvm.internal.C12773m.m28630c(r0)
                if (r6 != r1) goto L_0x0051
                return r1
            L_0x0051:
                r0 = r4
            L_0x0052:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L_0x005f
                kotlin.jvm.internal.Ref$ObjectRef r6 = r0.f17023c
                r6.f20403b = r5
                r3 = 0
            L_0x005f:
                if (r3 == 0) goto L_0x0064
                ef.v r5 = p336ef.C11921v.f18618a
                return r5
            L_0x0064:
                kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p314bg.C11009q.C11011b.emit(java.lang.Object, hf.d):java.lang.Object");
        }
    }

    @C12739f(mo50609c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", mo50610f = "Reduce.kt", mo50611l = {183}, mo50612m = "first")
    /* renamed from: bg.q$c */
    /* compiled from: Reduce.kt */
    static final class C11013c<T> extends C12737d {

        /* renamed from: h */
        Object f17029h;

        /* renamed from: i */
        Object f17030i;

        /* renamed from: j */
        /* synthetic */ Object f17031j;

        /* renamed from: k */
        int f17032k;

        C11013c(C12074d<? super C11013c> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f17031j = obj;
            this.f17032k |= Integer.MIN_VALUE;
            return C10971h.m23606m((C10962f) null, this);
        }
    }

    @C12739f(mo50609c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", mo50610f = "Reduce.kt", mo50611l = {183}, mo50612m = "first")
    /* renamed from: bg.q$d */
    /* compiled from: Reduce.kt */
    static final class C11014d<T> extends C12737d {

        /* renamed from: h */
        Object f17033h;

        /* renamed from: i */
        Object f17034i;

        /* renamed from: j */
        Object f17035j;

        /* renamed from: k */
        /* synthetic */ Object f17036k;

        /* renamed from: l */
        int f17037l;

        C11014d(C12074d<? super C11014d> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f17036k = obj;
            this.f17037l |= Integer.MIN_VALUE;
            return C10971h.m23607n((C10962f) null, (C13088o) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0068 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m23664a(p314bg.C10962f<? extends T> r4, p355hf.C12074d<? super T> r5) {
        /*
            boolean r0 = r5 instanceof p314bg.C11009q.C11013c
            if (r0 == 0) goto L_0x0013
            r0 = r5
            bg.q$c r0 = (p314bg.C11009q.C11013c) r0
            int r1 = r0.f17032k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f17032k = r1
            goto L_0x0018
        L_0x0013:
            bg.q$c r0 = new bg.q$c
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.f17031j
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.f17032k
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r4 = r0.f17030i
            bg.q$a r4 = (p314bg.C11009q.C11010a) r4
            java.lang.Object r0 = r0.f17029h
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref$ObjectRef) r0
            p336ef.C11910n.m25701b(r5)     // Catch:{ AbortFlowException -> 0x0031 }
            goto L_0x0062
        L_0x0031:
            r5 = move-exception
            goto L_0x005f
        L_0x0033:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003b:
            p336ef.C11910n.m25701b(r5)
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            dg.g0 r2 = p320cg.C11081n.f17203a
            r5.f20403b = r2
            bg.q$a r2 = new bg.q$a
            r2.<init>(r5)
            r0.f17029h = r5     // Catch:{ AbortFlowException -> 0x005b }
            r0.f17030i = r2     // Catch:{ AbortFlowException -> 0x005b }
            r0.f17032k = r3     // Catch:{ AbortFlowException -> 0x005b }
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch:{ AbortFlowException -> 0x005b }
            if (r4 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r0 = r5
            goto L_0x0062
        L_0x005b:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L_0x005f:
            p320cg.C11076j.m23897a(r5, r4)
        L_0x0062:
            T r4 = r0.f20403b
            dg.g0 r5 = p320cg.C11081n.f17203a
            if (r4 == r5) goto L_0x0069
            return r4
        L_0x0069:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p314bg.C11009q.m23664a(bg.f, hf.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m23665b(p314bg.C10962f<? extends T> r4, p404of.C13088o<? super T, ? super p355hf.C12074d<? super java.lang.Boolean>, ? extends java.lang.Object> r5, p355hf.C12074d<? super T> r6) {
        /*
            boolean r0 = r6 instanceof p314bg.C11009q.C11014d
            if (r0 == 0) goto L_0x0013
            r0 = r6
            bg.q$d r0 = (p314bg.C11009q.C11014d) r0
            int r1 = r0.f17037l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f17037l = r1
            goto L_0x0018
        L_0x0013:
            bg.q$d r0 = new bg.q$d
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f17036k
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.f17037l
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r4 = r0.f17035j
            bg.q$b r4 = (p314bg.C11009q.C11011b) r4
            java.lang.Object r5 = r0.f17034i
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref$ObjectRef) r5
            java.lang.Object r0 = r0.f17033h
            of.o r0 = (p404of.C13088o) r0
            p336ef.C11910n.m25701b(r6)     // Catch:{ AbortFlowException -> 0x0035 }
            goto L_0x006a
        L_0x0035:
            r6 = move-exception
            goto L_0x0067
        L_0x0037:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003f:
            p336ef.C11910n.m25701b(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            dg.g0 r2 = p320cg.C11081n.f17203a
            r6.f20403b = r2
            bg.q$b r2 = new bg.q$b
            r2.<init>(r5, r6)
            r0.f17033h = r5     // Catch:{ AbortFlowException -> 0x0062 }
            r0.f17034i = r6     // Catch:{ AbortFlowException -> 0x0062 }
            r0.f17035j = r2     // Catch:{ AbortFlowException -> 0x0062 }
            r0.f17037l = r3     // Catch:{ AbortFlowException -> 0x0062 }
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch:{ AbortFlowException -> 0x0062 }
            if (r4 != r1) goto L_0x005f
            return r1
        L_0x005f:
            r0 = r5
            r5 = r6
            goto L_0x006a
        L_0x0062:
            r4 = move-exception
            r0 = r5
            r5 = r6
            r6 = r4
            r4 = r2
        L_0x0067:
            p320cg.C11076j.m23897a(r6, r4)
        L_0x006a:
            T r4 = r5.f20403b
            dg.g0 r5 = p320cg.C11081n.f17203a
            if (r4 == r5) goto L_0x0071
            return r4
        L_0x0071:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Expected at least one element matching the predicate "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p314bg.C11009q.m23665b(bg.f, of.o, hf.d):java.lang.Object");
    }
}
