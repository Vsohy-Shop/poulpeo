package p314bg;

import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@SourceDebugExtension({"SMAP\nShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/SubscribedFlowCollector\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,426:1\n329#2:427\n*S KotlinDebug\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/SubscribedFlowCollector\n*L\n417#1:427\n*E\n"})
/* renamed from: bg.l0 */
/* compiled from: Share.kt */
public final class C10984l0<T> implements C10967g<T> {

    /* renamed from: b */
    private final C10967g<T> f16958b;

    /* renamed from: c */
    private final C13088o<C10967g<? super T>, C12074d<? super C11921v>, Object> f16959c;

    @C12739f(mo50609c = "kotlinx.coroutines.flow.SubscribedFlowCollector", mo50610f = "Share.kt", mo50611l = {419, 423}, mo50612m = "onSubscription")
    /* renamed from: bg.l0$a */
    /* compiled from: Share.kt */
    static final class C10985a extends C12737d {

        /* renamed from: h */
        Object f16960h;

        /* renamed from: i */
        Object f16961i;

        /* renamed from: j */
        /* synthetic */ Object f16962j;

        /* renamed from: k */
        final /* synthetic */ C10984l0<T> f16963k;

        /* renamed from: l */
        int f16964l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10985a(C10984l0<T> l0Var, C12074d<? super C10985a> dVar) {
            super(dVar);
            this.f16963k = l0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f16962j = obj;
            this.f16964l |= Integer.MIN_VALUE;
            return this.f16963k.mo46053a(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo46053a(p355hf.C12074d<? super p336ef.C11921v> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p314bg.C10984l0.C10985a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            bg.l0$a r0 = (p314bg.C10984l0.C10985a) r0
            int r1 = r0.f16964l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f16964l = r1
            goto L_0x0018
        L_0x0013:
            bg.l0$a r0 = new bg.l0$a
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f16962j
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.f16964l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            p336ef.C11910n.m25701b(r7)
            goto L_0x0077
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0034:
            java.lang.Object r2 = r0.f16961i
            cg.o r2 = (p320cg.C11082o) r2
            java.lang.Object r4 = r0.f16960h
            bg.l0 r4 = (p314bg.C10984l0) r4
            p336ef.C11910n.m25701b(r7)     // Catch:{ all -> 0x007d }
            goto L_0x005e
        L_0x0040:
            p336ef.C11910n.m25701b(r7)
            cg.o r2 = new cg.o
            bg.g<T> r7 = r6.f16958b
            hf.g r5 = r0.getContext()
            r2.<init>(r7, r5)
            of.o<bg.g<? super T>, hf.d<? super ef.v>, java.lang.Object> r7 = r6.f16959c     // Catch:{ all -> 0x007d }
            r0.f16960h = r6     // Catch:{ all -> 0x007d }
            r0.f16961i = r2     // Catch:{ all -> 0x007d }
            r0.f16964l = r4     // Catch:{ all -> 0x007d }
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch:{ all -> 0x007d }
            if (r7 != r1) goto L_0x005d
            return r1
        L_0x005d:
            r4 = r6
        L_0x005e:
            r2.releaseIntercepted()
            bg.g<T> r7 = r4.f16958b
            boolean r2 = r7 instanceof p314bg.C10984l0
            if (r2 == 0) goto L_0x007a
            bg.l0 r7 = (p314bg.C10984l0) r7
            r2 = 0
            r0.f16960h = r2
            r0.f16961i = r2
            r0.f16964l = r3
            java.lang.Object r7 = r7.mo46053a(r0)
            if (r7 != r1) goto L_0x0077
            return r1
        L_0x0077:
            ef.v r7 = p336ef.C11921v.f18618a
            return r7
        L_0x007a:
            ef.v r7 = p336ef.C11921v.f18618a
            return r7
        L_0x007d:
            r7 = move-exception
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p314bg.C10984l0.mo46053a(hf.d):java.lang.Object");
    }

    public Object emit(T t, C12074d<? super C11921v> dVar) {
        return this.f16958b.emit(t, dVar);
    }
}
