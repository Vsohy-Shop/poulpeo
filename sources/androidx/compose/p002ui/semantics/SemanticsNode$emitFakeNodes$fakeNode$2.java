package androidx.compose.p002ui.semantics;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;

/* renamed from: androidx.compose.ui.semantics.SemanticsNode$emitFakeNodes$fakeNode$2 */
/* compiled from: SemanticsNode.kt */
final class SemanticsNode$emitFakeNodes$fakeNode$2 extends C12777p implements Function1<SemanticsPropertyReceiver, C11921v> {
    final /* synthetic */ String $contentDescription;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SemanticsNode$emitFakeNodes$fakeNode$2(String str) {
        super(1);
        this.$contentDescription = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return C11921v.f18618a;
    }

    public final void invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        C12775o.m28639i(semanticsPropertyReceiver, "$this$fakeSemanticsNode");
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, this.$contentDescription);
    }
}
