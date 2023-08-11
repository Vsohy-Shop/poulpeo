package androidx.compose.p002ui.focus;

import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.focus.FocusTransactionsKt$grantFocus$1 */
/* compiled from: FocusTransactions.kt */
final class FocusTransactionsKt$grantFocus$1 extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ FocusTargetModifierNode $this_grantFocus;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FocusTransactionsKt$grantFocus$1(FocusTargetModifierNode focusTargetModifierNode) {
        super(0);
        this.$this_grantFocus = focusTargetModifierNode;
    }

    public final void invoke() {
        this.$this_grantFocus.fetchFocusProperties$ui_release();
    }
}
