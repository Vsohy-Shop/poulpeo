package androidx.compose.p002ui.input.key;

import android.view.KeyEvent;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.input.key.KeyEvent_androidKt */
/* compiled from: KeyEvent.android.kt */
public final class KeyEvent_androidKt {
    /* renamed from: getKey-ZmokQxo  reason: not valid java name */
    public static final long m37026getKeyZmokQxo(KeyEvent keyEvent) {
        C12775o.m28639i(keyEvent, "$this$key");
        return Key_androidKt.Key(keyEvent.getKeyCode());
    }

    /* renamed from: getType-ZmokQxo  reason: not valid java name */
    public static final int m37027getTypeZmokQxo(KeyEvent keyEvent) {
        C12775o.m28639i(keyEvent, "$this$type");
        int action = keyEvent.getAction();
        if (action == 0) {
            return KeyEventType.Companion.m37023getKeyDownCS__XNY();
        }
        if (action != 1) {
            return KeyEventType.Companion.m37025getUnknownCS__XNY();
        }
        return KeyEventType.Companion.m37024getKeyUpCS__XNY();
    }

    /* renamed from: getUtf16CodePoint-ZmokQxo  reason: not valid java name */
    public static final int m37028getUtf16CodePointZmokQxo(KeyEvent keyEvent) {
        C12775o.m28639i(keyEvent, "$this$utf16CodePoint");
        return keyEvent.getUnicodeChar();
    }

    /* renamed from: isAltPressed-ZmokQxo  reason: not valid java name */
    public static final boolean m37029isAltPressedZmokQxo(KeyEvent keyEvent) {
        C12775o.m28639i(keyEvent, "$this$isAltPressed");
        return keyEvent.isAltPressed();
    }

    /* renamed from: isCtrlPressed-ZmokQxo  reason: not valid java name */
    public static final boolean m37030isCtrlPressedZmokQxo(KeyEvent keyEvent) {
        C12775o.m28639i(keyEvent, "$this$isCtrlPressed");
        return keyEvent.isCtrlPressed();
    }

    /* renamed from: isMetaPressed-ZmokQxo  reason: not valid java name */
    public static final boolean m37031isMetaPressedZmokQxo(KeyEvent keyEvent) {
        C12775o.m28639i(keyEvent, "$this$isMetaPressed");
        return keyEvent.isMetaPressed();
    }

    /* renamed from: isShiftPressed-ZmokQxo  reason: not valid java name */
    public static final boolean m37032isShiftPressedZmokQxo(KeyEvent keyEvent) {
        C12775o.m28639i(keyEvent, "$this$isShiftPressed");
        return keyEvent.isShiftPressed();
    }
}
