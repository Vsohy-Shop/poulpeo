package androidx.compose.p002ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p404of.C13074a;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.semantics.ScrollAxisRange */
/* compiled from: SemanticsProperties.kt */
public final class ScrollAxisRange {
    public static final int $stable = 0;
    private final C13074a<Float> maxValue;
    private final boolean reverseScrolling;
    private final C13074a<Float> value;

    public ScrollAxisRange(C13074a<Float> aVar, C13074a<Float> aVar2, boolean z) {
        C12775o.m28639i(aVar, "value");
        C12775o.m28639i(aVar2, "maxValue");
        this.value = aVar;
        this.maxValue = aVar2;
        this.reverseScrolling = z;
    }

    public final C13074a<Float> getMaxValue() {
        return this.maxValue;
    }

    public final boolean getReverseScrolling() {
        return this.reverseScrolling;
    }

    public final C13074a<Float> getValue() {
        return this.value;
    }

    public String toString() {
        return "ScrollAxisRange(value=" + this.value.invoke().floatValue() + ", maxValue=" + this.maxValue.invoke().floatValue() + ", reverseScrolling=" + this.reverseScrolling + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ScrollAxisRange(C13074a aVar, C13074a aVar2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, aVar2, (i & 4) != 0 ? false : z);
    }
}
