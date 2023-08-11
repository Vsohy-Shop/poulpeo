package androidx.compose.material3;

import androidx.compose.foundation.gestures.DragScope;

/* compiled from: Slider.kt */
public final class SliderDraggableState$dragScope$1 implements DragScope {
    final /* synthetic */ SliderDraggableState this$0;

    SliderDraggableState$dragScope$1(SliderDraggableState sliderDraggableState) {
        this.this$0 = sliderDraggableState;
    }

    public void dragBy(float f) {
        this.this$0.getOnDelta().invoke(Float.valueOf(f));
    }
}
