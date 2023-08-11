package androidx.compose.foundation.gestures;

/* compiled from: Draggable.kt */
public final class DefaultDraggableState$dragScope$1 implements DragScope {
    final /* synthetic */ DefaultDraggableState this$0;

    DefaultDraggableState$dragScope$1(DefaultDraggableState defaultDraggableState) {
        this.this$0 = defaultDraggableState;
    }

    public void dragBy(float f) {
        this.this$0.getOnDelta().invoke(Float.valueOf(f));
    }
}
