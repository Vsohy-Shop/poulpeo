package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.p002ui.layout.Remeasurement;
import androidx.compose.p002ui.layout.RemeasurementModifier;
import kotlin.jvm.internal.C12775o;

/* compiled from: LazyStaggeredGridState.kt */
public final class LazyStaggeredGridState$remeasurementModifier$1 implements RemeasurementModifier {
    final /* synthetic */ LazyStaggeredGridState this$0;

    LazyStaggeredGridState$remeasurementModifier$1(LazyStaggeredGridState lazyStaggeredGridState) {
        this.this$0 = lazyStaggeredGridState;
    }

    public void onRemeasurementAvailable(Remeasurement remeasurement) {
        C12775o.m28639i(remeasurement, "remeasurement");
        this.this$0.remeasurement = remeasurement;
    }
}
