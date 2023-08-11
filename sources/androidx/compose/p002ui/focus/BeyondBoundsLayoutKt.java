package androidx.compose.p002ui.focus;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.focus.FocusDirection;
import androidx.compose.p002ui.layout.BeyondBoundsLayout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.focus.BeyondBoundsLayoutKt */
/* compiled from: BeyondBoundsLayout.kt */
public final class BeyondBoundsLayoutKt {
    @ExperimentalComposeUiApi
    /* renamed from: searchBeyondBounds--OM-vw8  reason: not valid java name */
    public static final <T> T m35340searchBeyondBoundsOMvw8(FocusTargetModifierNode focusTargetModifierNode, int i, Function1<? super BeyondBoundsLayout.BeyondBoundsScope, ? extends T> function1) {
        int i2;
        C12775o.m28639i(focusTargetModifierNode, "$this$searchBeyondBounds");
        C12775o.m28639i(function1, "block");
        BeyondBoundsLayout beyondBoundsLayoutParent$ui_release = focusTargetModifierNode.getBeyondBoundsLayoutParent$ui_release();
        if (beyondBoundsLayoutParent$ui_release == null) {
            return null;
        }
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m35344equalsimpl0(i, companion.m35361getUpdhqQ8s())) {
            i2 = BeyondBoundsLayout.LayoutDirection.Companion.m37301getAbovehoxUOeE();
        } else if (FocusDirection.m35344equalsimpl0(i, companion.m35352getDowndhqQ8s())) {
            i2 = BeyondBoundsLayout.LayoutDirection.Companion.m37304getBelowhoxUOeE();
        } else if (FocusDirection.m35344equalsimpl0(i, companion.m35356getLeftdhqQ8s())) {
            i2 = BeyondBoundsLayout.LayoutDirection.Companion.m37305getLefthoxUOeE();
        } else if (FocusDirection.m35344equalsimpl0(i, companion.m35360getRightdhqQ8s())) {
            i2 = BeyondBoundsLayout.LayoutDirection.Companion.m37306getRighthoxUOeE();
        } else if (FocusDirection.m35344equalsimpl0(i, companion.m35357getNextdhqQ8s())) {
            i2 = BeyondBoundsLayout.LayoutDirection.Companion.m37302getAfterhoxUOeE();
        } else if (FocusDirection.m35344equalsimpl0(i, companion.m35359getPreviousdhqQ8s())) {
            i2 = BeyondBoundsLayout.LayoutDirection.Companion.m37303getBeforehoxUOeE();
        } else {
            throw new IllegalStateException("Unsupported direction for beyond bounds layout".toString());
        }
        return beyondBoundsLayoutParent$ui_release.m37293layouto7g1Pn8(i2, function1);
    }
}
