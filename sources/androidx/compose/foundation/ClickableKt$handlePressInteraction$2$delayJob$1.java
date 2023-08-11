package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kotlin.coroutines.jvm.internal.C12739f;
import kotlin.coroutines.jvm.internal.C12746l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11910n;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13074a;
import p404of.C13088o;
import p466yf.C13995l0;
import p466yf.C14041v0;

@C12739f(mo50609c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1", mo50610f = "Clickable.kt", mo50611l = {439, 442}, mo50612m = "invokeSuspend")
/* compiled from: Clickable.kt */
final class ClickableKt$handlePressInteraction$2$delayJob$1 extends C12746l implements C13088o<C13995l0, C12074d<? super C11921v>, Object> {
    final /* synthetic */ State<C13074a<Boolean>> $delayPressInteraction;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ long $pressPoint;
    final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
    Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ClickableKt$handlePressInteraction$2$delayJob$1(State<? extends C13074a<Boolean>> state, long j, MutableInteractionSource mutableInteractionSource, MutableState<PressInteraction.Press> mutableState, C12074d<? super ClickableKt$handlePressInteraction$2$delayJob$1> dVar) {
        super(2, dVar);
        this.$delayPressInteraction = state;
        this.$pressPoint = j;
        this.$interactionSource = mutableInteractionSource;
        this.$pressedInteraction = mutableState;
    }

    public final C12074d<C11921v> create(Object obj, C12074d<?> dVar) {
        return new ClickableKt$handlePressInteraction$2$delayJob$1(this.$delayPressInteraction, this.$pressPoint, this.$interactionSource, this.$pressedInteraction, dVar);
    }

    public final Object invokeSuspend(Object obj) {
        PressInteraction.Press press;
        Object c = C12150d.m26492c();
        int i = this.label;
        if (i == 0) {
            C11910n.m25701b(obj);
            if (((Boolean) this.$delayPressInteraction.getValue().invoke()).booleanValue()) {
                long tapIndicationDelay = Clickable_androidKt.getTapIndicationDelay();
                this.label = 1;
                if (C14041v0.m32563a(tapIndicationDelay, this) == c) {
                    return c;
                }
            }
        } else if (i == 1) {
            C11910n.m25701b(obj);
        } else if (i == 2) {
            press = (PressInteraction.Press) this.L$0;
            C11910n.m25701b(obj);
            this.$pressedInteraction.setValue(press);
            return C11921v.f18618a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        PressInteraction.Press press2 = new PressInteraction.Press(this.$pressPoint, (DefaultConstructorMarker) null);
        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
        this.L$0 = press2;
        this.label = 2;
        if (mutableInteractionSource.emit(press2, this) == c) {
            return c;
        }
        press = press2;
        this.$pressedInteraction.setValue(press);
        return C11921v.f18618a;
    }

    public final Object invoke(C13995l0 l0Var, C12074d<? super C11921v> dVar) {
        return ((ClickableKt$handlePressInteraction$2$delayJob$1) create(l0Var, dVar)).invokeSuspend(C11921v.f18618a);
    }
}
