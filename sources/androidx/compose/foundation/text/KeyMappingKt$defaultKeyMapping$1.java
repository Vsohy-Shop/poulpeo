package androidx.compose.foundation.text;

import androidx.compose.p002ui.input.key.KeyEvent;
import androidx.compose.p002ui.input.key.KeyEvent_androidKt;
import kotlin.jvm.internal.C12750b0;

/* compiled from: KeyMapping.kt */
/* synthetic */ class KeyMappingKt$defaultKeyMapping$1 extends C12750b0 {
    public static final KeyMappingKt$defaultKeyMapping$1 INSTANCE = new KeyMappingKt$defaultKeyMapping$1();

    KeyMappingKt$defaultKeyMapping$1() {
        super(KeyEvent_androidKt.class, "isCtrlPressed", "isCtrlPressed-ZmokQxo(Landroid/view/KeyEvent;)Z", 1);
    }

    public Object get(Object obj) {
        return Boolean.valueOf(KeyEvent_androidKt.m37030isCtrlPressedZmokQxo(((KeyEvent) obj).m37015unboximpl()));
    }
}
