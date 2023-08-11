package androidx.compose.p002ui.input.pointer;

import android.view.PointerIcon;
import androidx.core.view.PointerIconCompat;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.input.pointer.PointerIcon_androidKt */
/* compiled from: PointerIcon.android.kt */
public final class PointerIcon_androidKt {
    private static final PointerIcon pointerIconCrosshair = new AndroidPointerIconType(PointerIconCompat.TYPE_CROSSHAIR);
    private static final PointerIcon pointerIconDefault = new AndroidPointerIconType(1000);
    private static final PointerIcon pointerIconHand = new AndroidPointerIconType(PointerIconCompat.TYPE_HAND);
    private static final PointerIcon pointerIconText = new AndroidPointerIconType(PointerIconCompat.TYPE_TEXT);

    public static final PointerIcon PointerIcon(PointerIcon pointerIcon) {
        C12775o.m28639i(pointerIcon, "pointerIcon");
        return new AndroidPointerIcon(pointerIcon);
    }

    public static final PointerIcon getPointerIconCrosshair() {
        return pointerIconCrosshair;
    }

    public static final PointerIcon getPointerIconDefault() {
        return pointerIconDefault;
    }

    public static final PointerIcon getPointerIconHand() {
        return pointerIconHand;
    }

    public static final PointerIcon getPointerIconText() {
        return pointerIconText;
    }

    public static final PointerIcon PointerIcon(int i) {
        return new AndroidPointerIconType(i);
    }
}
