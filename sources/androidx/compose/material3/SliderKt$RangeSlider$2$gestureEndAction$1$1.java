package androidx.compose.material3;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* compiled from: Slider.kt */
final class SliderKt$RangeSlider$2$gestureEndAction$1$1 extends C12777p implements Function1<Boolean, C11921v> {
    final /* synthetic */ C13074a<C11921v> $onValueChangeFinished;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SliderKt$RangeSlider$2$gestureEndAction$1$1(C13074a<C11921v> aVar) {
        super(1);
        this.$onValueChangeFinished = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return C11921v.f18618a;
    }

    public final void invoke(boolean z) {
        C13074a<C11921v> aVar = this.$onValueChangeFinished;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
