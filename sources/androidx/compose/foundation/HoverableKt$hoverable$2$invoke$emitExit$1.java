package androidx.compose.foundation;

import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.MutableState;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.foundation.HoverableKt$hoverable$2", mo50610f = "Hoverable.kt", mo50611l = {70}, mo50612m = "invoke$emitExit")
/* compiled from: Hoverable.kt */
final class HoverableKt$hoverable$2$invoke$emitExit$1 extends C12737d {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    HoverableKt$hoverable$2$invoke$emitExit$1(C12074d<? super HoverableKt$hoverable$2$invoke$emitExit$1> dVar) {
        super(dVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return HoverableKt$hoverable$2.invoke$emitExit((MutableState<HoverInteraction.Enter>) null, (MutableInteractionSource) null, this);
    }
}
