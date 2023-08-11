package androidx.compose.p002ui.focus;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* renamed from: androidx.compose.ui.focus.FocusTransactionsKt$requestFocus$1 */
/* compiled from: FocusTransactions.kt */
final class FocusTransactionsKt$requestFocus$1 extends C12777p implements Function1<FocusTargetModifierNode, Boolean> {
    public static final FocusTransactionsKt$requestFocus$1 INSTANCE = new FocusTransactionsKt$requestFocus$1();

    FocusTransactionsKt$requestFocus$1() {
        super(1);
    }

    public final Boolean invoke(FocusTargetModifierNode focusTargetModifierNode) {
        C12775o.m28639i(focusTargetModifierNode, "it");
        return Boolean.valueOf(FocusTransactionsKt.requestFocus(focusTargetModifierNode));
    }
}
