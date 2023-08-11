package androidx.compose.foundation.lazy.grid;

import androidx.compose.p002ui.layout.Remeasurement;
import androidx.compose.p002ui.layout.RemeasurementModifier;
import kotlin.jvm.internal.C12775o;

/* compiled from: LazyGridState.kt */
public final class LazyGridState$remeasurementModifier$1 implements RemeasurementModifier {
    final /* synthetic */ LazyGridState this$0;

    LazyGridState$remeasurementModifier$1(LazyGridState lazyGridState) {
        this.this$0 = lazyGridState;
    }

    public void onRemeasurementAvailable(Remeasurement remeasurement) {
        C12775o.m28639i(remeasurement, "remeasurement");
        this.this$0.setRemeasurement(remeasurement);
    }
}
