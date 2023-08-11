package androidx.compose.foundation;

import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.MutableState;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p466yf.C13995l0;

@C12739f(mo50609c = "androidx.compose.foundation.HoverableKt$hoverable$2$2$1", mo50610f = "Hoverable.kt", mo50611l = {88}, mo50612m = "invokeSuspend")
/* compiled from: Hoverable.kt */
final class HoverableKt$hoverable$2$2$1 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableState<HoverInteraction.Enter> $hoverInteraction$delegate;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HoverableKt$hoverable$2$2$1(boolean z, MutableState<HoverInteraction.Enter> mutableState, MutableInteractionSource mutableInteractionSource, C12074d<? super HoverableKt$hoverable$2$2$1> dVar) {
        super(2, dVar);
        this.$enabled = z;
        this.$hoverInteraction$delegate = mutableState;
        this.$interactionSource = mutableInteractionSource;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new HoverableKt$hoverable$2$2$1(this.$enabled, this.$hoverInteraction$delegate, this.$interactionSource, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            if (!this.$enabled) {
                MutableState<HoverInteraction.Enter> mutableState = this.$hoverInteraction$delegate;
                MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                this.label = 1;
                if (HoverableKt$hoverable$2.invoke$emitExit(mutableState, mutableInteractionSource, this) == c) {
                    return c;
                }
            }
        } else if (i == 1) {
            C11910n.m25701b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11921v.f18618a;
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
        return ((HoverableKt$hoverable$2$2$1) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
