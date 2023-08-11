package androidx.compose.foundation.text;

import androidx.compose.p002ui.input.key.KeyEvent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;

/* compiled from: KeyMapping.kt */
public final class KeyMappingKt {
    private static final KeyMapping defaultKeyMapping = new KeyMappingKt$defaultKeyMapping$2$1(commonKeyMapping(KeyMappingKt$defaultKeyMapping$1.INSTANCE));

    public static final KeyMapping commonKeyMapping(Function1<? super KeyEvent, Boolean> function1) {
        C12775o.m28639i(function1, "shortcutModifier");
        return new KeyMappingKt$commonKeyMapping$1(function1);
    }

    public static final KeyMapping getDefaultKeyMapping() {
        return defaultKeyMapping;
    }
}
