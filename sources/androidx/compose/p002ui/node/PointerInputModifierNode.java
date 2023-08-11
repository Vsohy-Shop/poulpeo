package androidx.compose.p002ui.node;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.input.pointer.PointerEvent;
import androidx.compose.p002ui.input.pointer.PointerEventPass;

@ExperimentalComposeUiApi
/* renamed from: androidx.compose.ui.node.PointerInputModifierNode */
/* compiled from: PointerInputModifierNode.kt */
public interface PointerInputModifierNode extends DelegatableNode {
    boolean interceptOutOfBoundsChildEvents() {
        return false;
    }

    void onCancelPointerInput();

    /* renamed from: onPointerEvent-H0pRuoY  reason: not valid java name */
    void m37679onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j);

    boolean sharePointerInputWithSiblings() {
        return false;
    }
}
