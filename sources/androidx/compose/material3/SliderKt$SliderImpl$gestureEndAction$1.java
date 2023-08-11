package androidx.compose.material3;

import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* compiled from: Slider.kt */
final class SliderKt$SliderImpl$gestureEndAction$1 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ SliderDraggableState $draggableState;
    final /* synthetic */ C13074a<C11921v> $onValueChangeFinished;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SliderKt$SliderImpl$gestureEndAction$1(SliderDraggableState sliderDraggableState, C13074a<C11921v> aVar) {
        super(0);
        this.$draggableState = sliderDraggableState;
        this.$onValueChangeFinished = aVar;
    }

    public final void invoke() {
        C13074a<C11921v> aVar;
        if (!this.$draggableState.isDragging() && (aVar = this.$onValueChangeFinished) != null) {
            aVar.invoke();
        }
    }
}
