package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.p002ui.input.key.KeyEventType;
import androidx.compose.p002ui.input.key.KeyEvent_androidKt;
import kotlin.jvm.internal.C12775o;

/* compiled from: KeyEventHelpers.android.kt */
public final class KeyEventHelpers_androidKt {
    /* renamed from: cancelsTextSelection-ZmokQxo  reason: not valid java name */
    public static final boolean m33656cancelsTextSelectionZmokQxo(KeyEvent keyEvent) {
        C12775o.m28639i(keyEvent, "$this$cancelsTextSelection");
        if (keyEvent.getKeyCode() != 4 || !KeyEventType.m37019equalsimpl0(KeyEvent_androidKt.m37027getTypeZmokQxo(keyEvent), KeyEventType.Companion.m37024getKeyUpCS__XNY())) {
            return false;
        }
        return true;
    }

    public static final void showCharacterPalette() {
    }
}
