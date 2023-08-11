package androidx.compose.foundation.text;

import androidx.compose.p002ui.input.key.Key;
import androidx.compose.p002ui.input.key.KeyEvent;
import androidx.compose.p002ui.input.key.KeyEvent_androidKt;
import androidx.core.app.NotificationCompat;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;

/* compiled from: KeyMapping.kt */
public final class KeyMappingKt$commonKeyMapping$1 implements KeyMapping {
    final /* synthetic */ Function1<KeyEvent, Boolean> $shortcutModifier;

    KeyMappingKt$commonKeyMapping$1(Function1<? super KeyEvent, Boolean> function1) {
        this.$shortcutModifier = function1;
    }

    /* renamed from: map-ZmokQxo  reason: not valid java name */
    public KeyCommand m33658mapZmokQxo(android.view.KeyEvent keyEvent) {
        boolean z;
        C12775o.m28639i(keyEvent, NotificationCompat.CATEGORY_EVENT);
        if (!this.$shortcutModifier.invoke(KeyEvent.m37009boximpl(keyEvent)).booleanValue() || !KeyEvent_androidKt.m37032isShiftPressedZmokQxo(keyEvent)) {
            if (this.$shortcutModifier.invoke(KeyEvent.m37009boximpl(keyEvent)).booleanValue()) {
                long r2 = KeyEvent_androidKt.m37026getKeyZmokQxo(keyEvent);
                MappedKeys mappedKeys = MappedKeys.INSTANCE;
                if (Key.m36431equalsimpl0(r2, mappedKeys.m33675getCEK5gGoQ())) {
                    z = true;
                } else {
                    z = Key.m36431equalsimpl0(r2, mappedKeys.m33685getInsertEK5gGoQ());
                }
                if (z) {
                    return KeyCommand.COPY;
                }
                if (Key.m36431equalsimpl0(r2, mappedKeys.m33692getVEK5gGoQ())) {
                    return KeyCommand.PASTE;
                }
                if (Key.m36431equalsimpl0(r2, mappedKeys.m33693getXEK5gGoQ())) {
                    return KeyCommand.CUT;
                }
                if (Key.m36431equalsimpl0(r2, mappedKeys.m33672getAEK5gGoQ())) {
                    return KeyCommand.SELECT_ALL;
                }
                if (Key.m36431equalsimpl0(r2, mappedKeys.m33694getYEK5gGoQ())) {
                    return KeyCommand.REDO;
                }
                if (Key.m36431equalsimpl0(r2, mappedKeys.m33695getZEK5gGoQ())) {
                    return KeyCommand.UNDO;
                }
                return null;
            } else if (KeyEvent_androidKt.m37030isCtrlPressedZmokQxo(keyEvent)) {
                return null;
            } else {
                if (KeyEvent_androidKt.m37032isShiftPressedZmokQxo(keyEvent)) {
                    long r22 = KeyEvent_androidKt.m37026getKeyZmokQxo(keyEvent);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m36431equalsimpl0(r22, mappedKeys2.m33680getDirectionLeftEK5gGoQ())) {
                        return KeyCommand.SELECT_LEFT_CHAR;
                    }
                    if (Key.m36431equalsimpl0(r22, mappedKeys2.m33681getDirectionRightEK5gGoQ())) {
                        return KeyCommand.SELECT_RIGHT_CHAR;
                    }
                    if (Key.m36431equalsimpl0(r22, mappedKeys2.m33682getDirectionUpEK5gGoQ())) {
                        return KeyCommand.SELECT_UP;
                    }
                    if (Key.m36431equalsimpl0(r22, mappedKeys2.m33679getDirectionDownEK5gGoQ())) {
                        return KeyCommand.SELECT_DOWN;
                    }
                    if (Key.m36431equalsimpl0(r22, mappedKeys2.m33689getPageUpEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_UP;
                    }
                    if (Key.m36431equalsimpl0(r22, mappedKeys2.m33688getPageDownEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_DOWN;
                    }
                    if (Key.m36431equalsimpl0(r22, mappedKeys2.m33687getMoveHomeEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_START;
                    }
                    if (Key.m36431equalsimpl0(r22, mappedKeys2.m33686getMoveEndEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_END;
                    }
                    if (Key.m36431equalsimpl0(r22, mappedKeys2.m33685getInsertEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    return null;
                }
                long r23 = KeyEvent_androidKt.m37026getKeyZmokQxo(keyEvent);
                MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                if (Key.m36431equalsimpl0(r23, mappedKeys3.m33680getDirectionLeftEK5gGoQ())) {
                    return KeyCommand.LEFT_CHAR;
                }
                if (Key.m36431equalsimpl0(r23, mappedKeys3.m33681getDirectionRightEK5gGoQ())) {
                    return KeyCommand.RIGHT_CHAR;
                }
                if (Key.m36431equalsimpl0(r23, mappedKeys3.m33682getDirectionUpEK5gGoQ())) {
                    return KeyCommand.UP;
                }
                if (Key.m36431equalsimpl0(r23, mappedKeys3.m33679getDirectionDownEK5gGoQ())) {
                    return KeyCommand.DOWN;
                }
                if (Key.m36431equalsimpl0(r23, mappedKeys3.m33689getPageUpEK5gGoQ())) {
                    return KeyCommand.PAGE_UP;
                }
                if (Key.m36431equalsimpl0(r23, mappedKeys3.m33688getPageDownEK5gGoQ())) {
                    return KeyCommand.PAGE_DOWN;
                }
                if (Key.m36431equalsimpl0(r23, mappedKeys3.m33687getMoveHomeEK5gGoQ())) {
                    return KeyCommand.LINE_START;
                }
                if (Key.m36431equalsimpl0(r23, mappedKeys3.m33686getMoveEndEK5gGoQ())) {
                    return KeyCommand.LINE_END;
                }
                if (Key.m36431equalsimpl0(r23, mappedKeys3.m33683getEnterEK5gGoQ())) {
                    return KeyCommand.NEW_LINE;
                }
                if (Key.m36431equalsimpl0(r23, mappedKeys3.m33674getBackspaceEK5gGoQ())) {
                    return KeyCommand.DELETE_PREV_CHAR;
                }
                if (Key.m36431equalsimpl0(r23, mappedKeys3.m33678getDeleteEK5gGoQ())) {
                    return KeyCommand.DELETE_NEXT_CHAR;
                }
                if (Key.m36431equalsimpl0(r23, mappedKeys3.m33690getPasteEK5gGoQ())) {
                    return KeyCommand.PASTE;
                }
                if (Key.m36431equalsimpl0(r23, mappedKeys3.m33677getCutEK5gGoQ())) {
                    return KeyCommand.CUT;
                }
                if (Key.m36431equalsimpl0(r23, mappedKeys3.m33676getCopyEK5gGoQ())) {
                    return KeyCommand.COPY;
                }
                if (Key.m36431equalsimpl0(r23, mappedKeys3.m33691getTabEK5gGoQ())) {
                    return KeyCommand.TAB;
                }
                return null;
            }
        } else if (Key.m36431equalsimpl0(KeyEvent_androidKt.m37026getKeyZmokQxo(keyEvent), MappedKeys.INSTANCE.m33695getZEK5gGoQ())) {
            return KeyCommand.REDO;
        } else {
            return null;
        }
    }
}
