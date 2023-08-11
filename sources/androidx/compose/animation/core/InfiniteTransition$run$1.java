package androidx.compose.animation.core;

import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.animation.core.InfiniteTransition$run$1", mo50610f = "InfiniteTransition.kt", mo50611l = {147, 169}, mo50612m = "invokeSuspend")
/* compiled from: InfiniteTransition.kt */
final class InfiniteTransition$run$1 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ InfiniteTransition this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InfiniteTransition$run$1(InfiniteTransition infiniteTransition, C12074d<? super InfiniteTransition$run$1> dVar) {
        super(2, dVar);
        this.this$0 = infiniteTransition;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        InfiniteTransition$run$1 infiniteTransition$run$1 = new InfiniteTransition$run$1(this.this$0, dVar);
        infiniteTransition$run$1.L$0 = obj;
        return infiniteTransition$run$1;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0055 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0062  */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = p362if.C12150d.m26492c()
            int r1 = r8.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0031
            if (r1 == r3) goto L_0x0023
            if (r1 != r2) goto L_0x001b
            java.lang.Object r1 = r8.L$1
            kotlin.jvm.internal.e0 r1 = (kotlin.jvm.internal.C12757e0) r1
            java.lang.Object r4 = r8.L$0
            yf.l0 r4 = (p466yf.C13995l0) r4
            p336ef.C11910n.m25701b(r9)
            r9 = r4
            goto L_0x0041
        L_0x001b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0023:
            java.lang.Object r1 = r8.L$1
            kotlin.jvm.internal.e0 r1 = (kotlin.jvm.internal.C12757e0) r1
            java.lang.Object r4 = r8.L$0
            yf.l0 r4 = (p466yf.C13995l0) r4
            p336ef.C11910n.m25701b(r9)
            r9 = r4
            r4 = r8
            goto L_0x0056
        L_0x0031:
            p336ef.C11910n.m25701b(r9)
            java.lang.Object r9 = r8.L$0
            yf.l0 r9 = (p466yf.C13995l0) r9
            kotlin.jvm.internal.e0 r1 = new kotlin.jvm.internal.e0
            r1.<init>()
            r4 = 1065353216(0x3f800000, float:1.0)
            r1.f20408b = r4
        L_0x0041:
            r4 = r8
        L_0x0042:
            androidx.compose.animation.core.InfiniteTransition$run$1$1 r5 = new androidx.compose.animation.core.InfiniteTransition$run$1$1
            androidx.compose.animation.core.InfiniteTransition r6 = r4.this$0
            r5.<init>(r6, r1, r9)
            r4.L$0 = r9
            r4.L$1 = r1
            r4.label = r3
            java.lang.Object r5 = androidx.compose.animation.core.InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(r5, r4)
            if (r5 != r0) goto L_0x0056
            return r0
        L_0x0056:
            float r5 = r1.f20408b
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x005f
            r5 = r3
            goto L_0x0060
        L_0x005f:
            r5 = 0
        L_0x0060:
            if (r5 == 0) goto L_0x0042
            androidx.compose.animation.core.InfiniteTransition$run$1$2 r5 = new androidx.compose.animation.core.InfiniteTransition$run$1$2
            r5.<init>(r9)
            bg.f r5 = androidx.compose.runtime.SnapshotStateKt.snapshotFlow(r5)
            androidx.compose.animation.core.InfiniteTransition$run$1$3 r6 = new androidx.compose.animation.core.InfiniteTransition$run$1$3
            r7 = 0
            r6.<init>(r7)
            r4.L$0 = r9
            r4.L$1 = r1
            r4.label = r2
            java.lang.Object r5 = p314bg.C10971h.m23607n(r5, r6, r4)
            if (r5 != r0) goto L_0x0042
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.InfiniteTransition$run$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
        return ((InfiniteTransition$run$1) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
