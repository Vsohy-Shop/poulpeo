package p314bg;

import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p336ef.C11921v;
import p355hf.C12074d;

/* renamed from: bg.a */
/* compiled from: Flow.kt */
public abstract class C10947a<T> implements C10962f<T> {

    @C12739f(mo50609c = "kotlinx.coroutines.flow.AbstractFlow", mo50610f = "Flow.kt", mo50611l = {230}, mo50612m = "collect")
    /* renamed from: bg.a$a */
    /* compiled from: Flow.kt */
    static final class C10948a extends C12737d {

        /* renamed from: h */
        Object f16886h;

        /* renamed from: i */
        /* synthetic */ Object f16887i;

        /* renamed from: j */
        final /* synthetic */ C10947a<T> f16888j;

        /* renamed from: k */
        int f16889k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10948a(C10947a<T> aVar, C12074d<? super C10948a> dVar) {
            super(dVar);
            this.f16888j = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f16887i = obj;
            this.f16889k |= Integer.MIN_VALUE;
            return this.f16888j.collect((C10967g) null, this);
        }
    }

    /* renamed from: c */
    public abstract Object mo46016c(C10967g<? super T> gVar, C12074d<? super C11921v> dVar);

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object collect(p314bg.C10967g<? super T> r6, p355hf.C12074d<? super p336ef.C11921v> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p314bg.C10947a.C10948a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            bg.a$a r0 = (p314bg.C10947a.C10948a) r0
            int r1 = r0.f16889k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f16889k = r1
            goto L_0x0018
        L_0x0013:
            bg.a$a r0 = new bg.a$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f16887i
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.f16889k
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r6 = r0.f16886h
            cg.o r6 = (p320cg.C11082o) r6
            p336ef.C11910n.m25701b(r7)     // Catch:{ all -> 0x002d }
            goto L_0x004f
        L_0x002d:
            r7 = move-exception
            goto L_0x0059
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            p336ef.C11910n.m25701b(r7)
            cg.o r7 = new cg.o
            hf.g r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f16886h = r7     // Catch:{ all -> 0x0055 }
            r0.f16889k = r3     // Catch:{ all -> 0x0055 }
            java.lang.Object r6 = r5.mo46016c(r7, r0)     // Catch:{ all -> 0x0055 }
            if (r6 != r1) goto L_0x004e
            return r1
        L_0x004e:
            r6 = r7
        L_0x004f:
            r6.releaseIntercepted()
            ef.v r6 = p336ef.C11921v.f18618a
            return r6
        L_0x0055:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L_0x0059:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p314bg.C10947a.collect(bg.g, hf.d):java.lang.Object");
    }
}
