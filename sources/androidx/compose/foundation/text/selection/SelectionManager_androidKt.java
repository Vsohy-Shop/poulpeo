package androidx.compose.foundation.text.selection;

import android.view.KeyEvent;
import androidx.compose.foundation.MagnifierStyle;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.KeyMapping_androidKt;
import androidx.compose.p002ui.ComposedModifierKt;
import androidx.compose.p002ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;

/* compiled from: SelectionManager.android.kt */
public final class SelectionManager_androidKt {
    /* renamed from: isCopyKeyEvent-ZmokQxo  reason: not valid java name */
    public static final boolean m33823isCopyKeyEventZmokQxo(KeyEvent keyEvent) {
        C12775o.m28639i(keyEvent, "keyEvent");
        if (KeyMapping_androidKt.getPlatformDefaultKeyMapping().m33657mapZmokQxo(keyEvent) == KeyCommand.COPY) {
            return true;
        }
        return false;
    }

    public static final Modifier selectionMagnifier(Modifier modifier, SelectionManager selectionManager) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(selectionManager, "manager");
        if (!MagnifierStyle.Companion.getTextDefault().isSupported()) {
            return modifier;
        }
        return ComposedModifierKt.composed$default(modifier, (Function1) null, new SelectionManager_androidKt$selectionMagnifier$1(selectionManager), 1, (Object) null);
    }
}
