package androidx.compose.foundation.lazy;

import androidx.compose.p002ui.layout.Remeasurement;
import androidx.compose.p002ui.layout.RemeasurementModifier;
import kotlin.jvm.internal.C12775o;

/* compiled from: LazyListState.kt */
public final class LazyListState$remeasurementModifier$1 implements RemeasurementModifier {
    final /* synthetic */ LazyListState this$0;

    LazyListState$remeasurementModifier$1(LazyListState lazyListState) {
        this.this$0 = lazyListState;
    }

    public void onRemeasurementAvailable(Remeasurement remeasurement) {
        C12775o.m28639i(remeasurement, "remeasurement");
        this.this$0.setRemeasurement(remeasurement);
    }
}
