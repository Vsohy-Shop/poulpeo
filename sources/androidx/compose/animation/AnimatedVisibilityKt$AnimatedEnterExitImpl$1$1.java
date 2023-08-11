package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.coroutines.jvm.internal.C12735b;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p314bg.C10962f;
import p314bg.C10967g;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13074a;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1", mo50610f = "AnimatedVisibility.kt", mo50611l = {748}, mo50612m = "invokeSuspend")
/* compiled from: AnimatedVisibility.kt */
final class AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ Transition<EnterExitState> $childTransition;
    final /* synthetic */ MutableState<Boolean> $isAnimationVisible;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1(Transition<EnterExitState> transition, MutableState<Boolean> mutableState, C12074d<? super AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1> dVar) {
        super(2, dVar);
        this.$childTransition = transition;
        this.$isAnimationVisible = mutableState;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1(this.$childTransition, this.$isAnimationVisible, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            final Transition<EnterExitState> transition = this.$childTransition;
            C10962f snapshotFlow = SnapshotStateKt.snapshotFlow(new C13074a<Boolean>() {
                public final Boolean invoke() {
                    EnterExitState currentState = transition.getCurrentState();
                    EnterExitState enterExitState = EnterExitState.Visible;
                    return Boolean.valueOf(currentState == enterExitState || transition.getTargetState() == enterExitState);
                }
            });
            final MutableState<Boolean> mutableState = this.$isAnimationVisible;
            C03252 r1 = new C10967g<Boolean>() {
                public /* bridge */ /* synthetic */ Object emit(Object obj, C12074d dVar) {
                    return emit(((Boolean) obj).booleanValue(), (C12074d<? super C11921v>) dVar);
                }

                public final Object emit(boolean z, C12074d<? super C11921v> dVar) {
                    mutableState.setValue(C12735b.m28558a(z));
                    return C11921v.f18618a;
                }
            };
            this.label = 1;
            if (snapshotFlow.collect(r1, this) == c) {
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
        return ((AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
