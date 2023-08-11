package androidx.compose.p002ui.input.key;

import android.view.KeyEvent;
import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.Modifier;
import androidx.core.app.NotificationCompat;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;

@ExperimentalComposeUiApi
/* renamed from: androidx.compose.ui.input.key.KeyInputInputModifierNodeImpl */
/* compiled from: KeyInputModifierNode.kt */
public final class KeyInputInputModifierNodeImpl extends Modifier.Node implements KeyInputModifierNode {
    private Function1<? super KeyEvent, Boolean> onEvent;
    private Function1<? super KeyEvent, Boolean> onPreEvent;

    public KeyInputInputModifierNodeImpl(Function1<? super KeyEvent, Boolean> function1, Function1<? super KeyEvent, Boolean> function12) {
        this.onEvent = function1;
        this.onPreEvent = function12;
    }

    public final Function1<KeyEvent, Boolean> getOnEvent() {
        return this.onEvent;
    }

    public final Function1<KeyEvent, Boolean> getOnPreEvent() {
        return this.onPreEvent;
    }

    /* renamed from: onKeyEvent-ZmokQxo  reason: not valid java name */
    public boolean m37033onKeyEventZmokQxo(KeyEvent keyEvent) {
        C12775o.m28639i(keyEvent, NotificationCompat.CATEGORY_EVENT);
        Function1<? super KeyEvent, Boolean> function1 = this.onEvent;
        if (function1 != null) {
            return function1.invoke(KeyEvent.m37009boximpl(keyEvent)).booleanValue();
        }
        return false;
    }

    /* renamed from: onPreKeyEvent-ZmokQxo  reason: not valid java name */
    public boolean m37034onPreKeyEventZmokQxo(KeyEvent keyEvent) {
        C12775o.m28639i(keyEvent, NotificationCompat.CATEGORY_EVENT);
        Function1<? super KeyEvent, Boolean> function1 = this.onPreEvent;
        if (function1 != null) {
            return function1.invoke(KeyEvent.m37009boximpl(keyEvent)).booleanValue();
        }
        return false;
    }

    public final void setOnEvent(Function1<? super KeyEvent, Boolean> function1) {
        this.onEvent = function1;
    }

    public final void setOnPreEvent(Function1<? super KeyEvent, Boolean> function1) {
        this.onPreEvent = function1;
    }
}
