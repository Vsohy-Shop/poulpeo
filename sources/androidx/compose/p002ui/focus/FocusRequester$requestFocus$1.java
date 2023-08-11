package androidx.compose.p002ui.focus;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* renamed from: androidx.compose.ui.focus.FocusRequester$requestFocus$1 */
/* compiled from: FocusRequester.kt */
final class FocusRequester$requestFocus$1 extends C12777p implements Function1<FocusTargetModifierNode, Boolean> {
    public static final FocusRequester$requestFocus$1 INSTANCE = new FocusRequester$requestFocus$1();

    FocusRequester$requestFocus$1() {
        super(1);
    }

    public final Boolean invoke(FocusTargetModifierNode focusTargetModifierNode) {
        C12775o.m28639i(focusTargetModifierNode, "it");
        return Boolean.valueOf(FocusTransactionsKt.requestFocus(focusTargetModifierNode));
    }
}
