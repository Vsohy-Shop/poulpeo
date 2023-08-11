package androidx.compose.p002ui.input.pointer;

import android.view.PointerIcon;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.input.pointer.AndroidPointerIcon */
/* compiled from: PointerIcon.android.kt */
public final class AndroidPointerIcon implements PointerIcon {
    private final PointerIcon pointerIcon;

    public AndroidPointerIcon(PointerIcon pointerIcon2) {
        C12775o.m28639i(pointerIcon2, "pointerIcon");
        this.pointerIcon = pointerIcon2;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<AndroidPointerIcon> cls2 = AndroidPointerIcon.class;
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C12775o.m28634d(cls2, cls)) {
            return false;
        }
        C12775o.m28637g(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIcon");
        return C12775o.m28634d(this.pointerIcon, ((AndroidPointerIcon) obj).pointerIcon);
    }

    public final PointerIcon getPointerIcon() {
        return this.pointerIcon;
    }

    public int hashCode() {
        return this.pointerIcon.hashCode();
    }

    public String toString() {
        return "AndroidPointerIcon(pointerIcon=" + this.pointerIcon + ')';
    }
}
