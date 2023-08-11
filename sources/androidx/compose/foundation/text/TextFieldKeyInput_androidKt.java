package androidx.compose.foundation.text;

import android.view.KeyEvent;
import kotlin.jvm.internal.C12775o;

/* compiled from: TextFieldKeyInput.android.kt */
public final class TextFieldKeyInput_androidKt {
    /* renamed from: isTypedEvent-ZmokQxo  reason: not valid java name */
    public static final boolean m33723isTypedEventZmokQxo(KeyEvent keyEvent) {
        C12775o.m28639i(keyEvent, "$this$isTypedEvent");
        if (keyEvent.getAction() != 0 || keyEvent.getUnicodeChar() == 0) {
            return false;
        }
        return true;
    }
}
