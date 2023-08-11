package androidx.compose.animation.core;

import androidx.compose.runtime.State;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.functions.Function1;
import p308ag.C10894d;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3", mo50610f = "AnimateAsState.kt", mo50611l = {368}, mo50612m = "invokeSuspend")
/* compiled from: AnimateAsState.kt */
final class AnimateAsStateKt$animateValueAsState$3 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ State<AnimationSpec<T>> $animSpec$delegate;
    final /* synthetic */ Animatable<T, V> $animatable;
    final /* synthetic */ C10894d<T> $channel;
    final /* synthetic */ State<Function1<T, C11921v>> $listener$delegate;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AnimateAsStateKt$animateValueAsState$3(C10894d<T> dVar, Animatable<T, V> animatable, State<? extends AnimationSpec<T>> state, State<? extends Function1<? super T, C11921v>> state2, C12074d<? super AnimateAsStateKt$animateValueAsState$3> dVar2) {
        super(2, dVar2);
        this.$channel = dVar;
        this.$animatable = animatable;
        this.$animSpec$delegate = state;
        this.$listener$delegate = state2;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        AnimateAsStateKt$animateValueAsState$3 animateAsStateKt$animateValueAsState$3 = new AnimateAsStateKt$animateValueAsState$3(this.$channel, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, dVar);
        animateAsStateKt$animateValueAsState$3.L$0 = obj;
        return animateAsStateKt$animateValueAsState$3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0024
            if (r2 != r3) goto L_0x001c
            java.lang.Object r2 = r0.L$1
            ag.f r2 = (p308ag.C10897f) r2
            java.lang.Object r4 = r0.L$0
            yf.l0 r4 = (p466yf.C13995l0) r4
            p336ef.C11910n.m25701b(r18)
            r6 = r18
            r5 = r0
            goto L_0x0044
        L_0x001c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0024:
            p336ef.C11910n.m25701b(r18)
            java.lang.Object r2 = r0.L$0
            yf.l0 r2 = (p466yf.C13995l0) r2
            ag.d<T> r4 = r0.$channel
            ag.f r4 = r4.iterator()
            r5 = r0
            r16 = r4
            r4 = r2
            r2 = r16
        L_0x0037:
            r5.L$0 = r4
            r5.L$1 = r2
            r5.label = r3
            java.lang.Object r6 = r2.mo45899a(r5)
            if (r6 != r1) goto L_0x0044
            return r1
        L_0x0044:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0078
            java.lang.Object r6 = r2.next()
            ag.d<T> r7 = r5.$channel
            java.lang.Object r7 = r7.mo45885d()
            java.lang.Object r7 = p308ag.C10899h.m23425f(r7)
            if (r7 != 0) goto L_0x005e
            r9 = r6
            goto L_0x005f
        L_0x005e:
            r9 = r7
        L_0x005f:
            r6 = 0
            r14 = 0
            androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1 r15 = new androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1
            androidx.compose.animation.core.Animatable<T, V> r10 = r5.$animatable
            androidx.compose.runtime.State<androidx.compose.animation.core.AnimationSpec<T>> r11 = r5.$animSpec$delegate
            androidx.compose.runtime.State<kotlin.jvm.functions.Function1<T, ef.v>> r12 = r5.$listener$delegate
            r13 = 0
            r8 = r15
            r8.<init>(r9, r10, r11, r12, r13)
            r11 = 3
            r12 = 0
            r7 = r4
            r8 = r6
            r9 = r14
            r10 = r15
            p466yf.C14054y1 unused = p466yf.C13985j.m32422d(r7, r8, r9, r10, r11, r12)
            goto L_0x0037
        L_0x0078:
            ef.v r1 = p336ef.C11921v.f18618a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
        return ((AnimateAsStateKt$animateValueAsState$3) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
