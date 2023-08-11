package androidx.compose.foundation.selection;

import androidx.compose.p002ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p002ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* compiled from: Selectable.kt */
final class SelectableKt$selectable$4$1 extends C12777p implements Function1<SemanticsPropertyReceiver, C11921v> {
    final /* synthetic */ boolean $selected;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SelectableKt$selectable$4$1(boolean z) {
        super(1);
        this.$selected = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return C11921v.f18618a;
    }

    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        C12775o.m28639i(semanticsPropertyReceiver, "$this$semantics");
        SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, this.$selected);
    }
}
