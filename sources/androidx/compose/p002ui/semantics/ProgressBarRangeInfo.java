package androidx.compose.p002ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p436tf.C13522b;

@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nSemanticsProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/ProgressBarRangeInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1195:1\n1#2:1196\n*E\n"})
/* renamed from: androidx.compose.ui.semantics.ProgressBarRangeInfo */
/* compiled from: SemanticsProperties.kt */
public final class ProgressBarRangeInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final ProgressBarRangeInfo Indeterminate = new ProgressBarRangeInfo(0.0f, C13536k.m30875b(0.0f, 0.0f), 0, 4, (DefaultConstructorMarker) null);
    private final float current;
    private final C13522b<Float> range;
    private final int steps;

    /* renamed from: androidx.compose.ui.semantics.ProgressBarRangeInfo$Companion */
    /* compiled from: SemanticsProperties.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ProgressBarRangeInfo getIndeterminate() {
            return ProgressBarRangeInfo.Indeterminate;
        }
    }

    public ProgressBarRangeInfo(float f, C13522b<Float> bVar, int i) {
        C12775o.m28639i(bVar, "range");
        this.current = f;
        this.range = bVar;
        this.steps = i;
        if (!(!Float.isNaN(f))) {
            throw new IllegalArgumentException("current must not be NaN".toString());
        }
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgressBarRangeInfo)) {
            return false;
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) obj;
        if (this.current == progressBarRangeInfo.current) {
            z = true;
        } else {
            z = false;
        }
        if (z && C12775o.m28634d(this.range, progressBarRangeInfo.range) && this.steps == progressBarRangeInfo.steps) {
            return true;
        }
        return false;
    }

    public final float getCurrent() {
        return this.current;
    }

    public final C13522b<Float> getRange() {
        return this.range;
    }

    public final int getSteps() {
        return this.steps;
    }

    public int hashCode() {
        return (((Float.hashCode(this.current) * 31) + this.range.hashCode()) * 31) + this.steps;
    }

    public String toString() {
        return "ProgressBarRangeInfo(current=" + this.current + ", range=" + this.range + ", steps=" + this.steps + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProgressBarRangeInfo(float f, C13522b bVar, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, bVar, (i2 & 4) != 0 ? 0 : i);
    }
}
