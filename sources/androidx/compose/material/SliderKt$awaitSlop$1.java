package androidx.compose.material;

import androidx.compose.p002ui.input.pointer.AwaitPointerEventScope;
import kotlin.coroutines.jvm.internal.C12737d;
import kotlin.coroutines.jvm.internal.C12739f;
import p355hf.C12074d;

@C12739f(mo50609c = "androidx.compose.material.SliderKt", mo50610f = "Slider.kt", mo50611l = {811}, mo50612m = "awaitSlop-8vUncbI")
/* compiled from: Slider.kt */
final class SliderKt$awaitSlop$1 extends C12737d {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    SliderKt$awaitSlop$1(C12074d<? super SliderKt$awaitSlop$1> dVar) {
        super(dVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SliderKt.m34104awaitSlop8vUncbI((AwaitPointerEventScope) null, 0, 0, this);
    }
}
