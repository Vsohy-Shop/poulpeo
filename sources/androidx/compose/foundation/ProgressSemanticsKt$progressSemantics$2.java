package androidx.compose.foundation;

import androidx.compose.p002ui.semantics.ProgressBarRangeInfo;
import androidx.compose.p002ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p002ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: ProgressSemantics.kt */
final class ProgressSemanticsKt$progressSemantics$2 extends C12777p implements Function1<SemanticsPropertyReceiver, C11921v> {
    public static final ProgressSemanticsKt$progressSemantics$2 INSTANCE = new ProgressSemanticsKt$progressSemantics$2();

    ProgressSemanticsKt$progressSemantics$2() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return C11921v.f18618a;
    }

    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        C12775o.m28639i(semanticsPropertyReceiver, "$this$semantics");
        SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, ProgressBarRangeInfo.Companion.getIndeterminate());
    }
}
