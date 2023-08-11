package androidx.compose.material;

import java.util.Map;
import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* compiled from: Swipeable.kt */
final class SwipeableState$latestNonEmptyAnchorsFlow$1 extends C12777p implements C13074a<Map<Float, ? extends T>> {
    final /* synthetic */ SwipeableState<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SwipeableState$latestNonEmptyAnchorsFlow$1(SwipeableState<T> swipeableState) {
        super(0);
        this.this$0 = swipeableState;
    }

    public final Map<Float, T> invoke() {
        return this.this$0.getAnchors$material_release();
    }
}
