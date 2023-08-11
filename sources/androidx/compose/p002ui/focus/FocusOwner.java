package androidx.compose.p002ui.focus;

import android.view.KeyEvent;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.input.rotary.RotaryScrollEvent;
import androidx.compose.p002ui.unit.LayoutDirection;

/* renamed from: androidx.compose.ui.focus.FocusOwner */
/* compiled from: FocusOwner.kt */
public interface FocusOwner extends FocusManager {
    void clearFocus(boolean z, boolean z2);

    /* renamed from: dispatchKeyEvent-ZmokQxo  reason: not valid java name */
    boolean m35363dispatchKeyEventZmokQxo(KeyEvent keyEvent);

    boolean dispatchRotaryEvent(RotaryScrollEvent rotaryScrollEvent);

    Rect getFocusRect();

    LayoutDirection getLayoutDirection();

    Modifier getModifier();

    void releaseFocus();

    void scheduleInvalidation(FocusEventModifierNode focusEventModifierNode);

    void scheduleInvalidation(FocusPropertiesModifierNode focusPropertiesModifierNode);

    void scheduleInvalidation(FocusTargetModifierNode focusTargetModifierNode);

    void setLayoutDirection(LayoutDirection layoutDirection);

    void takeFocus();
}
