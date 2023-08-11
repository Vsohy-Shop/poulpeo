package androidx.compose.p002ui.focus;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* renamed from: androidx.compose.ui.focus.FocusOwnerImpl$moveFocus$1 */
/* compiled from: FocusOwnerImpl.kt */
final class FocusOwnerImpl$moveFocus$1 extends C12777p implements Function1<FocusTargetModifierNode, Boolean> {
    public static final FocusOwnerImpl$moveFocus$1 INSTANCE = new FocusOwnerImpl$moveFocus$1();

    FocusOwnerImpl$moveFocus$1() {
        super(1);
    }

    public final Boolean invoke(FocusTargetModifierNode focusTargetModifierNode) {
        C12775o.m28639i(focusTargetModifierNode, "it");
        return Boolean.valueOf(FocusTransactionsKt.requestFocus(focusTargetModifierNode));
    }
}
