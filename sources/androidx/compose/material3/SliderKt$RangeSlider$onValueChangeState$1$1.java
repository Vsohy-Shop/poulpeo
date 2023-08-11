package androidx.compose.material3;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p436tf.C13522b;

/* compiled from: Slider.kt */
final class SliderKt$RangeSlider$onValueChangeState$1$1 extends C12777p implements Function1<C13522b<Float>, C11921v> {
    final /* synthetic */ Function1<C13522b<Float>, C11921v> $onValueChange;
    final /* synthetic */ C13522b<Float> $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SliderKt$RangeSlider$onValueChangeState$1$1(C13522b<Float> bVar, Function1<? super C13522b<Float>, C11921v> function1) {
        super(1);
        this.$value = bVar;
        this.$onValueChange = function1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C13522b<Float>) (C13522b) obj);
        return C11921v.f18618a;
    }

    public final void invoke(C13522b<Float> bVar) {
        C12775o.m28639i(bVar, "it");
        if (!C12775o.m28634d(bVar, this.$value)) {
            this.$onValueChange.invoke(bVar);
        }
    }
}
