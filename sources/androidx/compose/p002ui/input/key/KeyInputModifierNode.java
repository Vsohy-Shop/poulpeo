package androidx.compose.p002ui.input.key;

import android.view.KeyEvent;
import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.node.DelegatableNode;

@ExperimentalComposeUiApi
/* renamed from: androidx.compose.ui.input.key.KeyInputModifierNode */
/* compiled from: KeyInputModifierNode.kt */
public interface KeyInputModifierNode extends DelegatableNode {
    /* renamed from: onKeyEvent-ZmokQxo  reason: not valid java name */
    boolean m37035onKeyEventZmokQxo(KeyEvent keyEvent);

    /* renamed from: onPreKeyEvent-ZmokQxo  reason: not valid java name */
    boolean m37036onPreKeyEventZmokQxo(KeyEvent keyEvent);
}
