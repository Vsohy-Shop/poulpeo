package p466yf;

import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12741h;
import kotlinx.coroutines.TimeoutCancellationException;
import p337eg.C11925b;
import p355hf.C12074d;
import p404of.C13088o;

/* renamed from: yf.z2 */
/* compiled from: Timeout.kt */
public final class C14061z2 {

    @C12739f(mo50609c = "kotlinx.coroutines.TimeoutKt", mo50610f = "Timeout.kt", mo50611l = {104}, mo50612m = "withTimeoutOrNull")
    /* renamed from: yf.z2$a */
    /* compiled from: Timeout.kt */
    static final class C14062a<T> extends C12737d {

        /* renamed from: h */
        long f22973h;

        /* renamed from: i */
        Object f22974i;

        /* renamed from: j */
        Object f22975j;

        /* renamed from: k */
        /* synthetic */ Object f22976k;

        /* renamed from: l */
        int f22977l;

        C14062a(C12074d<? super C14062a> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f22976k = obj;
            this.f22977l |= Integer.MIN_VALUE;
            return C14061z2.m32616d(0, (C13088o) null, this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r4 == null) goto L_0x0018;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlinx.coroutines.TimeoutCancellationException m32613a(long r2, p466yf.C14035u0 r4, p466yf.C14054y1 r5) {
        /*
            boolean r0 = r4 instanceof p466yf.C14045w0
            if (r0 == 0) goto L_0x0007
            yf.w0 r4 = (p466yf.C14045w0) r4
            goto L_0x0008
        L_0x0007:
            r4 = 0
        L_0x0008:
            if (r4 == 0) goto L_0x0018
            xf.a$a r0 = p460xf.C13846a.f22355b
            xf.d r0 = p460xf.C13850d.MILLISECONDS
            long r0 = p460xf.C13849c.m31832d(r2, r0)
            java.lang.String r4 = r4.mo53810a0(r0)
            if (r4 != 0) goto L_0x002e
        L_0x0018:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Timed out waiting for "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = " ms"
            r4.append(r2)
            java.lang.String r4 = r4.toString()
        L_0x002e:
            kotlinx.coroutines.TimeoutCancellationException r2 = new kotlinx.coroutines.TimeoutCancellationException
            r2.<init>(r4, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p466yf.C14061z2.m32613a(long, yf.u0, yf.y1):kotlinx.coroutines.TimeoutCancellationException");
    }

    /* renamed from: b */
    private static final <U, T extends U> Object m32614b(C14057y2<U, ? super T> y2Var, C13088o<? super C13995l0, ? super C12074d<? super T>, ? extends Object> oVar) {
        C13934b2.m32223k(y2Var, C14041v0.m32564b(y2Var.f18464e.getContext()).mo49021c(y2Var.f22972f, y2Var, y2Var.getContext()));
        return C11925b.m25731c(y2Var, y2Var, oVar);
    }

    /* renamed from: c */
    public static final <T> Object m32615c(long j, C13088o<? super C13995l0, ? super C12074d<? super T>, ? extends Object> oVar, C12074d<? super T> dVar) {
        if (j > 0) {
            Object b = m32614b(new C14057y2(j, dVar), oVar);
            if (b == C12150d.m26492c()) {
                C12741h.m28573c(dVar);
            }
            return b;
        }
        throw new TimeoutCancellationException("Timed out immediately");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object m32616d(long r7, p404of.C13088o<? super p466yf.C13995l0, ? super p355hf.C12074d<? super T>, ? extends java.lang.Object> r9, p355hf.C12074d<? super T> r10) {
        /*
            boolean r0 = r10 instanceof p466yf.C14061z2.C14062a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            yf.z2$a r0 = (p466yf.C14061z2.C14062a) r0
            int r1 = r0.f22977l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f22977l = r1
            goto L_0x0018
        L_0x0013:
            yf.z2$a r0 = new yf.z2$a
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.f22976k
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.f22977l
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r4) goto L_0x0034
            java.lang.Object r7 = r0.f22975j
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref$ObjectRef) r7
            java.lang.Object r8 = r0.f22974i
            of.o r8 = (p404of.C13088o) r8
            p336ef.C11910n.m25701b(r10)     // Catch:{ TimeoutCancellationException -> 0x0032 }
            goto L_0x006b
        L_0x0032:
            r8 = move-exception
            goto L_0x006e
        L_0x0034:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003c:
            p336ef.C11910n.m25701b(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L_0x0046
            return r3
        L_0x0046:
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            r0.f22974i = r9     // Catch:{ TimeoutCancellationException -> 0x006c }
            r0.f22975j = r10     // Catch:{ TimeoutCancellationException -> 0x006c }
            r0.f22973h = r7     // Catch:{ TimeoutCancellationException -> 0x006c }
            r0.f22977l = r4     // Catch:{ TimeoutCancellationException -> 0x006c }
            yf.y2 r2 = new yf.y2     // Catch:{ TimeoutCancellationException -> 0x006c }
            r2.<init>(r7, r0)     // Catch:{ TimeoutCancellationException -> 0x006c }
            r10.f20403b = r2     // Catch:{ TimeoutCancellationException -> 0x006c }
            java.lang.Object r7 = m32614b(r2, r9)     // Catch:{ TimeoutCancellationException -> 0x006c }
            java.lang.Object r8 = p362if.C12150d.m26492c()     // Catch:{ TimeoutCancellationException -> 0x006c }
            if (r7 != r8) goto L_0x0067
            kotlin.coroutines.jvm.internal.C12741h.m28573c(r0)     // Catch:{ TimeoutCancellationException -> 0x006c }
        L_0x0067:
            if (r7 != r1) goto L_0x006a
            return r1
        L_0x006a:
            r10 = r7
        L_0x006b:
            return r10
        L_0x006c:
            r8 = move-exception
            r7 = r10
        L_0x006e:
            yf.y1 r9 = r8.f20428b
            T r7 = r7.f20403b
            if (r9 != r7) goto L_0x0075
            return r3
        L_0x0075:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p466yf.C14061z2.m32616d(long, of.o, hf.d):java.lang.Object");
    }
}
