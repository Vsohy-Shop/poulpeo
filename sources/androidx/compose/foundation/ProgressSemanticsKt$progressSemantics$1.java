package androidx.compose.foundation;

import androidx.compose.p002ui.semantics.ProgressBarRangeInfo;
import androidx.compose.p002ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p002ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p436tf.C13522b;

/* compiled from: ProgressSemantics.kt */
final class ProgressSemanticsKt$progressSemantics$1 extends C12777p implements Function1<SemanticsPropertyReceiver, C11921v> {
    final /* synthetic */ int $steps;
    final /* synthetic */ float $value;
    final /* synthetic */ C13522b<Float> $valueRange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ProgressSemanticsKt$progressSemantics$1(float f, C13522b<Float> bVar, int i) {
        super(1);
        this.$value = f;
        this.$valueRange = bVar;
        this.$steps = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return C11921v.f18618a;
    }

    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        C12775o.m28639i(semanticsPropertyReceiver, "$this$semantics");
        SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(((Number) C13537l.m30889p(Float.valueOf(this.$value), this.$valueRange)).floatValue(), this.$valueRange, this.$steps));
    }
}
