package androidx.compose.material3;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: Slider.kt */
final class SliderKt$SliderImpl$onValueChangeState$1$1 extends C12777p implements Function1<Float, C11921v> {
    final /* synthetic */ Function1<Float, C11921v> $onValueChange;
    final /* synthetic */ float $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SliderKt$SliderImpl$onValueChangeState$1$1(float f, Function1<? super Float, C11921v> function1) {
        super(1);
        this.$value = f;
        this.$onValueChange = function1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).floatValue());
        return C11921v.f18618a;
    }

    public final void invoke(float f) {
        if (!(f == this.$value)) {
            this.$onValueChange.invoke(Float.valueOf(f));
        }
    }
}
