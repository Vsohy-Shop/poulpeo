package androidx.compose.foundation.text;

import android.view.KeyEvent;
import androidx.compose.p002ui.input.key.Key;
import androidx.compose.p002ui.input.key.KeyEvent_androidKt;
import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.C12775o;

/* compiled from: KeyMapping.kt */
public final class KeyMappingKt$defaultKeyMapping$2$1 implements KeyMapping {
    final /* synthetic */ KeyMapping $common;

    KeyMappingKt$defaultKeyMapping$2$1(KeyMapping keyMapping) {
        this.$common = keyMapping;
    }

    /* renamed from: map-ZmokQxo  reason: not valid java name */
    public KeyCommand m33659mapZmokQxo(KeyEvent keyEvent) {
        C12775o.m28639i(keyEvent, NotificationCompat.CATEGORY_EVENT);
        KeyCommand keyCommand = null;
        if (KeyEvent_androidKt.m37032isShiftPressedZmokQxo(keyEvent) && KeyEvent_androidKt.m37030isCtrlPressedZmokQxo(keyEvent)) {
            long r2 = KeyEvent_androidKt.m37026getKeyZmokQxo(keyEvent);
            MappedKeys mappedKeys = MappedKeys.INSTANCE;
            if (Key.m36431equalsimpl0(r2, mappedKeys.m33680getDirectionLeftEK5gGoQ())) {
                keyCommand = KeyCommand.SELECT_LEFT_WORD;
            } else if (Key.m36431equalsimpl0(r2, mappedKeys.m33681getDirectionRightEK5gGoQ())) {
                keyCommand = KeyCommand.SELECT_RIGHT_WORD;
            } else if (Key.m36431equalsimpl0(r2, mappedKeys.m33682getDirectionUpEK5gGoQ())) {
                keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
            } else if (Key.m36431equalsimpl0(r2, mappedKeys.m33679getDirectionDownEK5gGoQ())) {
                keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
            }
        } else if (KeyEvent_androidKt.m37030isCtrlPressedZmokQxo(keyEvent)) {
            long r22 = KeyEvent_androidKt.m37026getKeyZmokQxo(keyEvent);
            MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
            if (Key.m36431equalsimpl0(r22, mappedKeys2.m33680getDirectionLeftEK5gGoQ())) {
                keyCommand = KeyCommand.LEFT_WORD;
            } else if (Key.m36431equalsimpl0(r22, mappedKeys2.m33681getDirectionRightEK5gGoQ())) {
                keyCommand = KeyCommand.RIGHT_WORD;
            } else if (Key.m36431equalsimpl0(r22, mappedKeys2.m33682getDirectionUpEK5gGoQ())) {
                keyCommand = KeyCommand.PREV_PARAGRAPH;
            } else if (Key.m36431equalsimpl0(r22, mappedKeys2.m33679getDirectionDownEK5gGoQ())) {
                keyCommand = KeyCommand.NEXT_PARAGRAPH;
            } else if (Key.m36431equalsimpl0(r22, mappedKeys2.m33684getHEK5gGoQ())) {
                keyCommand = KeyCommand.DELETE_PREV_CHAR;
            } else if (Key.m36431equalsimpl0(r22, mappedKeys2.m33678getDeleteEK5gGoQ())) {
                keyCommand = KeyCommand.DELETE_NEXT_WORD;
            } else if (Key.m36431equalsimpl0(r22, mappedKeys2.m33674getBackspaceEK5gGoQ())) {
                keyCommand = KeyCommand.DELETE_PREV_WORD;
            } else if (Key.m36431equalsimpl0(r22, mappedKeys2.m33673getBackslashEK5gGoQ())) {
                keyCommand = KeyCommand.DESELECT;
            }
        } else if (KeyEvent_androidKt.m37032isShiftPressedZmokQxo(keyEvent)) {
            long r23 = KeyEvent_androidKt.m37026getKeyZmokQxo(keyEvent);
            MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
            if (Key.m36431equalsimpl0(r23, mappedKeys3.m33687getMoveHomeEK5gGoQ())) {
                keyCommand = KeyCommand.SELECT_HOME;
            } else if (Key.m36431equalsimpl0(r23, mappedKeys3.m33686getMoveEndEK5gGoQ())) {
                keyCommand = KeyCommand.SELECT_END;
            }
        } else if (KeyEvent_androidKt.m37029isAltPressedZmokQxo(keyEvent)) {
            long r24 = KeyEvent_androidKt.m37026getKeyZmokQxo(keyEvent);
            MappedKeys mappedKeys4 = MappedKeys.INSTANCE;
            if (Key.m36431equalsimpl0(r24, mappedKeys4.m33674getBackspaceEK5gGoQ())) {
                keyCommand = KeyCommand.DELETE_FROM_LINE_START;
            } else if (Key.m36431equalsimpl0(r24, mappedKeys4.m33678getDeleteEK5gGoQ())) {
                keyCommand = KeyCommand.DELETE_TO_LINE_END;
            }
        }
        if (keyCommand == null) {
            return this.$common.m33657mapZmokQxo(keyEvent);
        }
        return keyCommand;
    }
}
