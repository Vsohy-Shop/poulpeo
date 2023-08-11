package androidx.compose.foundation.gestures;

/* compiled from: ScrollableState.kt */
public final class DefaultScrollableState$scrollScope$1 implements ScrollScope {
    final /* synthetic */ DefaultScrollableState this$0;

    DefaultScrollableState$scrollScope$1(DefaultScrollableState defaultScrollableState) {
        this.this$0 = defaultScrollableState;
    }

    public float scrollBy(float f) {
        return this.this$0.getOnDelta().invoke(Float.valueOf(f)).floatValue();
    }
}
