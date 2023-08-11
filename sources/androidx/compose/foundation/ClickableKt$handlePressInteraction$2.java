package androidx.compose.foundation;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13074a;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2", mo50610f = "Clickable.kt", mo50611l = {445, 447, 454, 455, 464}, mo50612m = "invokeSuspend")
/* compiled from: Clickable.kt */
final class ClickableKt$handlePressInteraction$2 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ State<C13074a<Boolean>> $delayPressInteraction;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ long $pressPoint;
    final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
    final /* synthetic */ PressGestureScope $this_handlePressInteraction;
    private /* synthetic */ Object L$0;
    boolean Z$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ClickableKt$handlePressInteraction$2(PressGestureScope pressGestureScope, long j, MutableInteractionSource mutableInteractionSource, MutableState<PressInteraction.Press> mutableState, State<? extends C13074a<Boolean>> state, C12074d<? super ClickableKt$handlePressInteraction$2> dVar) {
        super(2, dVar);
        this.$this_handlePressInteraction = pressGestureScope;
        this.$pressPoint = j;
        this.$interactionSource = mutableInteractionSource;
        this.$pressedInteraction = mutableState;
        this.$delayPressInteraction = state;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        ClickableKt$handlePressInteraction$2 clickableKt$handlePressInteraction$2 = new ClickableKt$handlePressInteraction$2(this.$this_handlePressInteraction, this.$pressPoint, this.$interactionSource, this.$pressedInteraction, this.$delayPressInteraction, dVar);
        clickableKt$handlePressInteraction$2.L$0 = obj;
        return clickableKt$handlePressInteraction$2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b4 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            java.lang.Object r1 = p362if.C12150d.m26492c()
            int r2 = r0.label
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L_0x0041
            if (r2 == r7) goto L_0x0037
            if (r2 == r6) goto L_0x0031
            if (r2 == r5) goto L_0x0028
            if (r2 == r4) goto L_0x0023
            if (r2 != r3) goto L_0x001b
            goto L_0x0023
        L_0x001b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0023:
            p336ef.C11910n.m25701b(r20)
            goto L_0x00da
        L_0x0028:
            java.lang.Object r2 = r0.L$0
            androidx.compose.foundation.interaction.PressInteraction$Release r2 = (androidx.compose.foundation.interaction.PressInteraction.Release) r2
            p336ef.C11910n.m25701b(r20)
            goto L_0x00a8
        L_0x0031:
            boolean r2 = r0.Z$0
            p336ef.C11910n.m25701b(r20)
            goto L_0x008c
        L_0x0037:
            java.lang.Object r2 = r0.L$0
            yf.y1 r2 = (p466yf.C14054y1) r2
            p336ef.C11910n.m25701b(r20)
            r3 = r20
            goto L_0x0072
        L_0x0041:
            p336ef.C11910n.m25701b(r20)
            java.lang.Object r2 = r0.L$0
            r9 = r2
            yf.l0 r9 = (p466yf.C13995l0) r9
            r10 = 0
            r11 = 0
            androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1 r2 = new androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1
            androidx.compose.runtime.State<of.a<java.lang.Boolean>> r13 = r0.$delayPressInteraction
            long r14 = r0.$pressPoint
            androidx.compose.foundation.interaction.MutableInteractionSource r12 = r0.$interactionSource
            androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction$Press> r3 = r0.$pressedInteraction
            r18 = 0
            r16 = r12
            r12 = r2
            r17 = r3
            r12.<init>(r13, r14, r16, r17, r18)
            r13 = 3
            r14 = 0
            yf.y1 r2 = p466yf.C13985j.m32422d(r9, r10, r11, r12, r13, r14)
            androidx.compose.foundation.gestures.PressGestureScope r3 = r0.$this_handlePressInteraction
            r0.L$0 = r2
            r0.label = r7
            java.lang.Object r3 = r3.tryAwaitRelease(r0)
            if (r3 != r1) goto L_0x0072
            return r1
        L_0x0072:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            boolean r7 = r2.mo45937a()
            if (r7 == 0) goto L_0x00b5
            r0.L$0 = r8
            r0.Z$0 = r3
            r0.label = r6
            java.lang.Object r2 = p466yf.C13934b2.m32219g(r2, r0)
            if (r2 != r1) goto L_0x008b
            return r1
        L_0x008b:
            r2 = r3
        L_0x008c:
            if (r2 == 0) goto L_0x00da
            androidx.compose.foundation.interaction.PressInteraction$Press r2 = new androidx.compose.foundation.interaction.PressInteraction$Press
            long r6 = r0.$pressPoint
            r2.<init>(r6, r8)
            androidx.compose.foundation.interaction.PressInteraction$Release r3 = new androidx.compose.foundation.interaction.PressInteraction$Release
            r3.<init>(r2)
            androidx.compose.foundation.interaction.MutableInteractionSource r6 = r0.$interactionSource
            r0.L$0 = r3
            r0.label = r5
            java.lang.Object r2 = r6.emit(r2, r0)
            if (r2 != r1) goto L_0x00a7
            return r1
        L_0x00a7:
            r2 = r3
        L_0x00a8:
            androidx.compose.foundation.interaction.MutableInteractionSource r3 = r0.$interactionSource
            r0.L$0 = r8
            r0.label = r4
            java.lang.Object r2 = r3.emit(r2, r0)
            if (r2 != r1) goto L_0x00da
            return r1
        L_0x00b5:
            androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction$Press> r2 = r0.$pressedInteraction
            java.lang.Object r2 = r2.getValue()
            androidx.compose.foundation.interaction.PressInteraction$Press r2 = (androidx.compose.foundation.interaction.PressInteraction.Press) r2
            if (r2 == 0) goto L_0x00da
            androidx.compose.foundation.interaction.MutableInteractionSource r4 = r0.$interactionSource
            if (r3 == 0) goto L_0x00c9
            androidx.compose.foundation.interaction.PressInteraction$Release r3 = new androidx.compose.foundation.interaction.PressInteraction$Release
            r3.<init>(r2)
            goto L_0x00ce
        L_0x00c9:
            androidx.compose.foundation.interaction.PressInteraction$Cancel r3 = new androidx.compose.foundation.interaction.PressInteraction$Cancel
            r3.<init>(r2)
        L_0x00ce:
            r0.L$0 = r8
            r2 = 5
            r0.label = r2
            java.lang.Object r2 = r4.emit(r3, r0)
            if (r2 != r1) goto L_0x00da
            return r1
        L_0x00da:
            androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.PressInteraction$Press> r1 = r0.$pressedInteraction
            r1.setValue(r8)
            ef.v r1 = p336ef.C11921v.f18618a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ClickableKt$handlePressInteraction$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
        return ((ClickableKt$handlePressInteraction$2) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
